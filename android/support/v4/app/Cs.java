package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.app.s, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cs extends AbstractCt {
    Cs() {
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۰۴۷۸a(Object transition) {
        return transition instanceof Transition;
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: b, reason: contains not printable characters */
    public Object mo۱۰۴۷۹b(Object transition) {
        if (transition == null) {
            return null;
        }
        Transition copy = ((Transition) transition).clone();
        return copy;
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: c, reason: contains not printable characters */
    public Object mo۱۰۴۸۴c(Object transition) {
        if (transition == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) transition);
        return transitionSet;
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۰۴۸۲b(Object transitionObj, View nonExistentView, ArrayList<View> sharedViews) {
        TransitionSet transition = (TransitionSet) transitionObj;
        List<View> views = transition.getTargets();
        views.clear();
        int count = sharedViews.size();
        for (int i = 0; i < count; i++) {
            View view = sharedViews.get(i);
            AbstractCt.m۱۰۴۶۰a(views, view);
        }
        views.add(nonExistentView);
        sharedViews.add(nonExistentView);
        mo۱۰۴۷۴a(transition, sharedViews);
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۰۴۸۵c(Object transitionObj, View view) {
        if (view != null) {
            Transition transition = (Transition) transitionObj;
            Rect epicenter = new Rect();
            m۱۰۴۶۵a(view, epicenter);
            transition.setEpicenterCallback(new a(this, epicenter));
        }
    }

    /* renamed from: android.support.v4.app.s$a */
    class a extends Transition.EpicenterCallback {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ Rect f۱۰۳۵۴a;

        a(Cs this$0, Rect rect) {
            this.f۱۰۳۵۴a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f۱۰۳۵۴a;
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۷۴a(Object transitionObj, ArrayList<View> views) {
        Transition transition = (Transition) transitionObj;
        if (transition == null) {
            return;
        }
        if (transition instanceof TransitionSet) {
            TransitionSet set = (TransitionSet) transition;
            int numTransitions = set.getTransitionCount();
            for (int i = 0; i < numTransitions; i++) {
                Transition child = set.getTransitionAt(i);
                mo۱۰۴۷۴a(child, views);
            }
            return;
        }
        if (!m۱۰۴۴۲a(transition)) {
            List<View> targets = transition.getTargets();
            if (AbstractCt.m۱۰۴۶۱a((List) targets)) {
                int numViews = views.size();
                for (int i2 = 0; i2 < numViews; i2++) {
                    transition.addTarget(views.get(i2));
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۰۴۴۲a(Transition transition) {
        return (AbstractCt.m۱۰۴۶۱a((List) transition.getTargetIds()) && AbstractCt.m۱۰۴۶۱a((List) transition.getTargetNames()) && AbstractCt.m۱۰۴۶۱a((List) transition.getTargetTypes())) ? false : true;
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: b, reason: contains not printable characters */
    public Object mo۱۰۴۸۰b(Object transition1, Object transition2, Object transition3) {
        TransitionSet transitionSet = new TransitionSet();
        if (transition1 != null) {
            transitionSet.addTransition((Transition) transition1);
        }
        if (transition2 != null) {
            transitionSet.addTransition((Transition) transition2);
        }
        if (transition3 != null) {
            transitionSet.addTransition((Transition) transition3);
        }
        return transitionSet;
    }

    /* renamed from: android.support.v4.app.s$b */
    class b implements Transition.TransitionListener {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ View f۱۰۳۵۵a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۵۶b;

        b(Cs this$0, View view, ArrayList arrayList) {
            this.f۱۰۳۵۵a = view;
            this.f۱۰۳۵۶b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f۱۰۳۵۵a.setVisibility(8);
            int numViews = this.f۱۰۳۵۶b.size();
            for (int i = 0; i < numViews; i++) {
                ((View) this.f۱۰۳۵۶b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۷۲a(Object exitTransitionObj, View fragmentView, ArrayList<View> exitingViews) {
        Transition exitTransition = (Transition) exitTransitionObj;
        exitTransition.addListener(new b(this, fragmentView, exitingViews));
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public Object mo۱۰۴۶۳a(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
        Transition staggered = null;
        Transition exitTransition = (Transition) exitTransitionObj;
        Transition enterTransition = (Transition) enterTransitionObj;
        Transition sharedElementTransition = (Transition) sharedElementTransitionObj;
        if (exitTransition != null && enterTransition != null) {
            staggered = new TransitionSet().addTransition(exitTransition).addTransition(enterTransition).setOrdering(1);
        } else if (exitTransition != null) {
            staggered = exitTransition;
        } else if (enterTransition != null) {
            staggered = enterTransition;
        }
        if (sharedElementTransition != null) {
            TransitionSet together = new TransitionSet();
            if (staggered != null) {
                together.addTransition(staggered);
            }
            together.addTransition(sharedElementTransition);
            return together;
        }
        return staggered;
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۶۸a(ViewGroup sceneRoot, Object transition) {
        TransitionManager.beginDelayedTransition(sceneRoot, (Transition) transition);
    }

    /* renamed from: android.support.v4.app.s$c */
    class c implements Transition.TransitionListener {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۵۷a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۵۸b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۵۹c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۶۰d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۶۱e;

        /* renamed from: f, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۶۲f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f۱۰۳۵۷a = obj;
            this.f۱۰۳۵۸b = arrayList;
            this.f۱۰۳۵۹c = obj2;
            this.f۱۰۳۶۰d = arrayList2;
            this.f۱۰۳۶۱e = obj3;
            this.f۱۰۳۶۲f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f۱۰۳۵۷a;
            if (obj != null) {
                Cs.this.mo۱۰۴۷۵a(obj, this.f۱۰۳۵۸b, (ArrayList<View>) null);
            }
            Object obj2 = this.f۱۰۳۵۹c;
            if (obj2 != null) {
                Cs.this.mo۱۰۴۷۵a(obj2, this.f۱۰۳۶۰d, (ArrayList<View>) null);
            }
            Object obj3 = this.f۱۰۳۶۱e;
            if (obj3 != null) {
                Cs.this.mo۱۰۴۷۵a(obj3, this.f۱۰۳۶۲f, (ArrayList<View>) null);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۷۳a(Object overallTransitionObj, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews, Object sharedElementTransition, ArrayList<View> sharedElementsIn) {
        Transition overallTransition = (Transition) overallTransitionObj;
        overallTransition.addListener(new c(enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn));
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۰۴۸۳b(Object sharedElementTransitionObj, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn) {
        TransitionSet sharedElementTransition = (TransitionSet) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.getTargets().clear();
            sharedElementTransition.getTargets().addAll(sharedElementsIn);
            mo۱۰۴۷۵a((Object) sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۷۵a(Object transitionObj, ArrayList<View> oldTargets, ArrayList<View> newTargets) {
        List<View> targets;
        Transition transition = (Transition) transitionObj;
        if (transition instanceof TransitionSet) {
            TransitionSet set = (TransitionSet) transition;
            int numTransitions = set.getTransitionCount();
            for (int i = 0; i < numTransitions; i++) {
                Transition child = set.getTransitionAt(i);
                mo۱۰۴۷۵a((Object) child, oldTargets, newTargets);
            }
            return;
        }
        if (!m۱۰۴۴۲a(transition) && (targets = transition.getTargets()) != null && targets.size() == oldTargets.size() && targets.containsAll(oldTargets)) {
            int targetCount = newTargets == null ? 0 : newTargets.size();
            for (int i2 = 0; i2 < targetCount; i2++) {
                transition.addTarget(newTargets.get(i2));
            }
            int i3 = oldTargets.size();
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                transition.removeTarget(oldTargets.get(i4));
            }
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۷۱a(Object transitionObj, View view) {
        if (transitionObj != null) {
            Transition transition = (Transition) transitionObj;
            transition.addTarget(view);
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۰۴۸۱b(Object transitionObj, View view) {
        if (transitionObj != null) {
            Transition transition = (Transition) transitionObj;
            transition.removeTarget(view);
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۷۰a(Object transitionObj, Rect epicenter) {
        if (transitionObj != null) {
            Transition transition = (Transition) transitionObj;
            transition.setEpicenterCallback(new d(this, epicenter));
        }
    }

    /* renamed from: android.support.v4.app.s$d */
    class d extends Transition.EpicenterCallback {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ Rect f۱۰۳۶۴a;

        d(Cs this$0, Rect rect) {
            this.f۱۰۳۶۴a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f۱۰۳۶۴a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f۱۰۳۶۴a;
        }
    }
}
