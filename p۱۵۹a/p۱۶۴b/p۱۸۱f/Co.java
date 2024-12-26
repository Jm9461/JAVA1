package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.support.transition.Transition;
import android.support.v4.view.Cu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca;

/* renamed from: a.b.f.o, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Co {

    /* renamed from: a, reason: contains not printable characters */
    private static AbstractCm f۸۶۱۳a = new Cb();

    /* renamed from: b, reason: contains not printable characters */
    private static ThreadLocal<WeakReference<Ca<ViewGroup, ArrayList<AbstractCm>>>> f۸۶۱۴b = new ThreadLocal<>();

    /* renamed from: c, reason: contains not printable characters */
    static ArrayList<ViewGroup> f۸۶۱۵c = new ArrayList<>();

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.view.ViewGroup, java.util.ArrayList<android.support.transition.Transition>> */
    /* renamed from: a, reason: contains not printable characters */
    static Ca<ViewGroup, ArrayList<AbstractCm>> m۸۲۹۱a() {
        Ca<ViewGroup, ArrayList<AbstractCm>> ca;
        WeakReference<Ca<ViewGroup, ArrayList<AbstractCm>>> weakReference = f۸۶۱۴b.get();
        if (weakReference != null && (ca = weakReference.get()) != null) {
            return ca;
        }
        Ca<ViewGroup, ArrayList<AbstractCm>> ca2 = new Ca<>();
        f۸۶۱۴b.set(new WeakReference<>(ca2));
        return ca2;
    }

    /* renamed from: b, reason: contains not printable characters */
    private static void m۸۲۹۳b(ViewGroup sceneRoot, AbstractCm transition) {
        if (transition != null && sceneRoot != null) {
            a listener = new a(transition, sceneRoot);
            sceneRoot.addOnAttachStateChangeListener(listener);
            sceneRoot.getViewTreeObserver().addOnPreDrawListener(listener);
        }
    }

    /* renamed from: a.b.f.o$a */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: c, reason: contains not printable characters */
        AbstractCm f۸۶۱۶c;

        /* renamed from: d, reason: contains not printable characters */
        ViewGroup f۸۶۱۷d;

        a(AbstractCm transition, ViewGroup sceneRoot) {
            this.f۸۶۱۶c = transition;
            this.f۸۶۱۷d = sceneRoot;
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۸۲۹۵a() {
            this.f۸۶۱۷d.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f۸۶۱۷d.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            m۸۲۹۵a();
            Co.f۸۶۱۵c.remove(this.f۸۶۱۷d);
            ArrayList<AbstractCm> arrayList = Co.m۸۲۹۱a().get(this.f۸۶۱۷d);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractCm> it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractCm runningTransition = it.next();
                    runningTransition.mo۸۳۲۸e(this.f۸۶۱۷d);
                }
            }
            this.f۸۶۱۶c.m۸۲۵۷a(true);
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.view.ViewGroup, java.util.ArrayList<android.support.transition.Transition>> */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m۸۲۹۵a();
            if (!Co.f۸۶۱۵c.remove(this.f۸۶۱۷d)) {
                return true;
            }
            Ca<ViewGroup, ArrayList<AbstractCm>> ca = Co.m۸۲۹۱a();
            ArrayList<AbstractCm> arrayList = ca.get(this.f۸۶۱۷d);
            ArrayList<Transition> previousRunningTransitions = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                ca.put(this.f۸۶۱۷d, arrayList);
            } else if (arrayList.size() > 0) {
                previousRunningTransitions = new ArrayList<>(arrayList);
            }
            arrayList.add(this.f۸۶۱۶c);
            this.f۸۶۱۶c.mo۸۳۰۷a(new C۱۴۲۵a(ca));
            this.f۸۶۱۶c.m۸۲۵۶a(this.f۸۶۱۷d, false);
            if (previousRunningTransitions != null) {
                Iterator<Transition> it = previousRunningTransitions.iterator();
                while (it.hasNext()) {
                    AbstractCm runningTransition = (AbstractCm) it.next();
                    runningTransition.mo۸۳۲۸e(this.f۸۶۱۷d);
                }
            }
            this.f۸۶۱۶c.m۸۲۵۴a(this.f۸۶۱۷d);
            return true;
        }

        /* renamed from: a.b.f.o$a$a, reason: collision with other inner class name */
        class C۱۴۲۵a extends Cn {

            /* renamed from: a, reason: contains not printable characters */
            final /* synthetic */ Ca f۸۶۱۸a;

            C۱۴۲۵a(Ca ca) {
                this.f۸۶۱۸a = ca;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
            /* renamed from: b, reason: contains not printable characters */
            public void mo۸۳۳۲b(AbstractCm transition) {
                ArrayList<Transition> currentTransitions = (ArrayList) this.f۸۶۱۸a.get(a.this.f۸۶۱۷d);
                currentTransitions.remove(transition);
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private static void m۸۲۹۴c(ViewGroup sceneRoot, AbstractCm transition) {
        ArrayList<AbstractCm> arrayList = m۸۲۹۱a().get(sceneRoot);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractCm> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractCm runningTransition = it.next();
                runningTransition.mo۸۳۲۴c(sceneRoot);
            }
        }
        if (transition != null) {
            transition.m۸۲۵۶a(sceneRoot, true);
        }
        Cl previousScene = Cl.m۸۲۲۷a(sceneRoot);
        if (previousScene != null) {
            previousScene.m۸۲۲۹a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۸۲۹۲a(ViewGroup sceneRoot, AbstractCm transition) {
        if (!f۸۶۱۵c.contains(sceneRoot) && Cu.m۱۰۹۵۸y(sceneRoot)) {
            f۸۶۱۵c.add(sceneRoot);
            if (transition == null) {
                transition = f۸۶۱۳a;
            }
            AbstractCm transitionClone = transition.mo۸۳۲۵clone();
            m۸۲۹۴c(sceneRoot, transitionClone);
            Cl.m۸۲۲۸a(sceneRoot, null);
            m۸۲۹۳b(sceneRoot, transitionClone);
        }
    }
}
