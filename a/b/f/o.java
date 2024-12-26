package a.b.f;

import android.support.transition.Transition;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static m f۲۵۵a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<a.b.g.g.a<ViewGroup, ArrayList<m>>>> f۲۵۶b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f۲۵۷c = new ArrayList<>();

    static a.b.g.g.a<ViewGroup, ArrayList<m>> a() {
        ArrayMap<ViewGroup, ArrayList<Transition>> transitions;
        WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> runningTransitions = f۲۵۶b.get();
        if (runningTransitions != null && (transitions = (a.b.g.g.a) runningTransitions.get()) != null) {
            return transitions;
        }
        ArrayMap<ViewGroup, ArrayList<Transition>> transitions2 = new a.b.g.g.a<>();
        f۲۵۶b.set(new WeakReference<>(transitions2));
        return transitions2;
    }

    private static void b(ViewGroup sceneRoot, m transition) {
        if (transition != null && sceneRoot != null) {
            a listener = new a(transition, sceneRoot);
            sceneRoot.addOnAttachStateChangeListener(listener);
            sceneRoot.getViewTreeObserver().addOnPreDrawListener(listener);
        }
    }

    /* access modifiers changed from: private */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: c  reason: collision with root package name */
        m f۲۵۸c;

        /* renamed from: d  reason: collision with root package name */
        ViewGroup f۲۵۹d;

        a(m transition, ViewGroup sceneRoot) {
            this.f۲۵۸c = transition;
            this.f۲۵۹d = sceneRoot;
        }

        private void a() {
            this.f۲۵۹d.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f۲۵۹d.removeOnAttachStateChangeListener(this);
        }

        public void onViewAttachedToWindow(View v) {
        }

        public void onViewDetachedFromWindow(View v) {
            a();
            o.f۲۵۷c.remove(this.f۲۵۹d);
            ArrayList<Transition> runningTransitions = o.a().get(this.f۲۵۹d);
            if (runningTransitions != null && runningTransitions.size() > 0) {
                Iterator<Transition> it = runningTransitions.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).e(this.f۲۵۹d);
                }
            }
            this.f۲۵۸c.a(true);
        }

        public boolean onPreDraw() {
            a();
            if (!o.f۲۵۷c.remove(this.f۲۵۹d)) {
                return true;
            }
            ArrayMap<ViewGroup, ArrayList<Transition>> runningTransitions = o.a();
            ArrayList<m> currentTransitions = runningTransitions.get(this.f۲۵۹d);
            ArrayList<Transition> previousRunningTransitions = null;
            if (currentTransitions == null) {
                currentTransitions = new ArrayList<>();
                runningTransitions.put(this.f۲۵۹d, currentTransitions);
            } else if (currentTransitions.size() > 0) {
                previousRunningTransitions = new ArrayList<>(currentTransitions);
            }
            currentTransitions.add(this.f۲۵۸c);
            this.f۲۵۸c.a(new C۰۰۱۰a(runningTransitions));
            this.f۲۵۸c.a(this.f۲۵۹d, false);
            if (previousRunningTransitions != null) {
                Iterator<Transition> it = previousRunningTransitions.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).e(this.f۲۵۹d);
                }
            }
            this.f۲۵۸c.a(this.f۲۵۹d);
            return true;
        }

        /* renamed from: a.b.f.o$a$a  reason: collision with other inner class name */
        class C۰۰۱۰a extends n {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a.b.g.g.a f۲۶۰a;

            C۰۰۱۰a(a.b.g.g.a aVar) {
                this.f۲۶۰a = aVar;
            }

            @Override // a.b.f.m.f
            public void b(m transition) {
                ((ArrayList) this.f۲۶۰a.get(a.this.f۲۵۹d)).remove(transition);
            }
        }
    }

    private static void c(ViewGroup sceneRoot, m transition) {
        ArrayList<Transition> runningTransitions = a().get(sceneRoot);
        if (runningTransitions != null && runningTransitions.size() > 0) {
            Iterator<Transition> it = runningTransitions.iterator();
            while (it.hasNext()) {
                ((m) it.next()).c(sceneRoot);
            }
        }
        if (transition != null) {
            transition.a(sceneRoot, true);
        }
        l previousScene = l.a(sceneRoot);
        if (previousScene != null) {
            previousScene.a();
        }
    }

    public static void a(ViewGroup sceneRoot, m transition) {
        if (!f۲۵۷c.contains(sceneRoot) && u.y(sceneRoot)) {
            f۲۵۷c.add(sceneRoot);
            if (transition == null) {
                transition = f۲۵۵a;
            }
            m transitionClone = transition.clone();
            c(sceneRoot, transitionClone);
            l.a(sceneRoot, null);
            b(sceneRoot, transitionClone);
        }
    }
}
