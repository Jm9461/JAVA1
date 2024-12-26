package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.support.p۰۴۳v4.view.Cu;
import android.support.transition.Transition;
import android.support.v4.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca;

/* renamed from: a.b.f.o  reason: invalid class name */
public class Co {

    /* renamed from: a  reason: contains not printable characters */
    private static AbstractCm f۸۶۱۳a = new Cb();

    /* renamed from: b  reason: contains not printable characters */
    private static ThreadLocal<WeakReference<Ca<ViewGroup, ArrayList<AbstractCm>>>> f۸۶۱۴b = new ThreadLocal<>();

    /* renamed from: c  reason: contains not printable characters */
    static ArrayList<ViewGroup> f۸۶۱۵c = new ArrayList<>();

    /* renamed from: a  reason: contains not printable characters */
    static Ca<ViewGroup, ArrayList<AbstractCm>> m۱۰۳۵۷a() {
        ArrayMap<ViewGroup, ArrayList<Transition>> transitions;
        WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> runningTransitions = f۸۶۱۴b.get();
        if (runningTransitions != null && (transitions = (Ca) runningTransitions.get()) != null) {
            return transitions;
        }
        ArrayMap<ViewGroup, ArrayList<Transition>> transitions2 = new Ca<>();
        f۸۶۱۴b.set(new WeakReference<>(transitions2));
        return transitions2;
    }

    /* renamed from: b  reason: contains not printable characters */
    private static void m۱۰۳۵۹b(ViewGroup sceneRoot, AbstractCm transition) {
        if (transition != null && sceneRoot != null) {
            ViewTreeObserver$OnPreDrawListenerCa listener = new ViewTreeObserver$OnPreDrawListenerCa(transition, sceneRoot);
            sceneRoot.addOnAttachStateChangeListener(listener);
            sceneRoot.getViewTreeObserver().addOnPreDrawListener(listener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.f.o$a  reason: invalid class name */
    public static class ViewTreeObserver$OnPreDrawListenerCa implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: c  reason: contains not printable characters */
        AbstractCm f۸۶۱۶c;

        /* renamed from: d  reason: contains not printable characters */
        ViewGroup f۸۶۱۷d;

        ViewTreeObserver$OnPreDrawListenerCa(AbstractCm transition, ViewGroup sceneRoot) {
            this.f۸۶۱۶c = transition;
            this.f۸۶۱۷d = sceneRoot;
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۳۶۱a() {
            this.f۸۶۱۷d.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f۸۶۱۷d.removeOnAttachStateChangeListener(this);
        }

        public void onViewAttachedToWindow(View v) {
        }

        public void onViewDetachedFromWindow(View v) {
            m۱۰۳۶۱a();
            Co.f۸۶۱۵c.remove(this.f۸۶۱۷d);
            ArrayList<Transition> runningTransitions = Co.m۱۰۳۵۷a().get(this.f۸۶۱۷d);
            if (runningTransitions != null && runningTransitions.size() > 0) {
                Iterator<Transition> it = runningTransitions.iterator();
                while (it.hasNext()) {
                    ((AbstractCm) it.next()).m۱۰۳۳۸e(this.f۸۶۱۷d);
                }
            }
            this.f۸۶۱۶c.m۱۰۳۲۴a(true);
        }

        public boolean onPreDraw() {
            m۱۰۳۶۱a();
            if (!Co.f۸۶۱۵c.remove(this.f۸۶۱۷d)) {
                return true;
            }
            ArrayMap<ViewGroup, ArrayList<Transition>> runningTransitions = Co.m۱۰۳۵۷a();
            ArrayList<AbstractCm> currentTransitions = runningTransitions.get(this.f۸۶۱۷d);
            ArrayList<Transition> previousRunningTransitions = null;
            if (currentTransitions == null) {
                currentTransitions = new ArrayList<>();
                runningTransitions.put(this.f۸۶۱۷d, currentTransitions);
            } else if (currentTransitions.size() > 0) {
                previousRunningTransitions = new ArrayList<>(currentTransitions);
            }
            currentTransitions.add(this.f۸۶۱۶c);
            this.f۸۶۱۶c.m۱۰۳۰۹a(new Ca(runningTransitions));
            this.f۸۶۱۶c.m۱۰۳۲۳a(this.f۸۶۱۷d, false);
            if (previousRunningTransitions != null) {
                Iterator<Transition> it = previousRunningTransitions.iterator();
                while (it.hasNext()) {
                    ((AbstractCm) it.next()).m۱۰۳۳۸e(this.f۸۶۱۷d);
                }
            }
            this.f۸۶۱۶c.m۱۰۳۲۱a(this.f۸۶۱۷d);
            return true;
        }

        /* renamed from: a.b.f.o$a$a  reason: invalid class name */
        class Ca extends Cn {

            /* renamed from: a  reason: contains not printable characters */
            final /* synthetic */ p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca f۸۶۱۸a;

            Ca(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca aVar) {
                this.f۸۶۱۸a = aVar;
            }

            @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
            /* renamed from: b  reason: contains not printable characters */
            public void m۱۰۳۶۲b(AbstractCm transition) {
                ((ArrayList) this.f۸۶۱۸a.get(ViewTreeObserver$OnPreDrawListenerCa.this.f۸۶۱۷d)).remove(transition);
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private static void m۱۰۳۶۰c(ViewGroup sceneRoot, AbstractCm transition) {
        ArrayList<Transition> runningTransitions = m۱۰۳۵۷a().get(sceneRoot);
        if (runningTransitions != null && runningTransitions.size() > 0) {
            Iterator<Transition> it = runningTransitions.iterator();
            while (it.hasNext()) {
                ((AbstractCm) it.next()).m۱۰۳۳۴c(sceneRoot);
            }
        }
        if (transition != null) {
            transition.m۱۰۳۲۳a(sceneRoot, true);
        }
        Cl previousScene = Cl.m۱۰۲۹۴a(sceneRoot);
        if (previousScene != null) {
            previousScene.m۱۰۲۹۶a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۰۳۵۸a(ViewGroup sceneRoot, AbstractCm transition) {
        if (!f۸۶۱۵c.contains(sceneRoot) && Cu.m۱۳۰۲۸y(sceneRoot)) {
            f۸۶۱۵c.add(sceneRoot);
            if (transition == null) {
                transition = f۸۶۱۳a;
            }
            AbstractCm transitionClone = transition.clone();
            m۱۰۳۶۰c(sceneRoot, transitionClone);
            Cl.m۱۰۲۹۵a(sceneRoot, null);
            m۱۰۳۵۹b(sceneRoot, transitionClone);
        }
    }
}
