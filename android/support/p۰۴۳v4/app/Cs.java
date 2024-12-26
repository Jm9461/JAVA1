package android.support.p۰۴۳v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.app.s  reason: invalid class name */
class Cs extends AbstractCt {
    Cs() {
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۵۲۱a(Object transition) {
        return transition instanceof Transition;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: b  reason: contains not printable characters */
    public Object m۱۲۵۲۲b(Object transition) {
        if (transition != null) {
            return ((Transition) transition).clone();
        }
        return null;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: c  reason: contains not printable characters */
    public Object m۱۲۵۲۷c(Object transition) {
        if (transition == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) transition);
        return transitionSet;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۵۲۵b(Object transitionObj, View nonExistentView, ArrayList<View> sharedViews) {
        TransitionSet transition = (TransitionSet) transitionObj;
        List<View> views = transition.getTargets();
        views.clear();
        int count = sharedViews.size();
        for (int i = 0; i < count; i++) {
            AbstractCt.m۱۲۵۳۰a(views, sharedViews.get(i));
        }
        views.add(nonExistentView);
        sharedViews.add(nonExistentView);
        m۱۲۵۱۹a(transition, sharedViews);
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۵۲۸c(Object transitionObj, View view) {
        if (view != null) {
            Rect epicenter = new Rect();
            m۱۲۵۳۵a(view, epicenter);
            ((Transition) transitionObj).setEpicenterCallback(new Ca(this, epicenter));
        }
    }

    /* renamed from: android.support.v4.app.s$a  reason: invalid class name */
    class Ca extends Transition.EpicenterCallback {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ Rect f۱۰۳۵۴a;

        Ca(Cs this$0, Rect rect) {
            this.f۱۰۳۵۴a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f۱۰۳۵۴a;
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۱۹a(Object transitionObj, ArrayList<View> views) {
        Transition transition = (Transition) transitionObj;
        if (transition != null) {
            if (transition instanceof TransitionSet) {
                TransitionSet set = (TransitionSet) transition;
                int numTransitions = set.getTransitionCount();
                for (int i = 0; i < numTransitions; i++) {
                    m۱۲۵۱۹a(set.getTransitionAt(i), views);
                }
            } else if (!m۱۲۵۱۲a(transition) && AbstractCt.m۱۲۵۳۱a((List) transition.getTargets())) {
                int numViews = views.size();
                for (int i2 = 0; i2 < numViews; i2++) {
                    transition.addTarget(views.get(i2));
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۲۵۱۲a(Transition transition) {
        return !AbstractCt.m۱۲۵۳۱a(transition.getTargetIds()) || !AbstractCt.m۱۲۵۳۱a(transition.getTargetNames()) || !AbstractCt.m۱۲۵۳۱a(transition.getTargetTypes());
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: b  reason: contains not printable characters */
    public Object m۱۲۵۲۳b(Object transition1, Object transition2, Object transition3) {
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

    /* renamed from: android.support.v4.app.s$b  reason: invalid class name */
    class Cb implements Transition.TransitionListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۳۵۵a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۵۶b;

        Cb(Cs this$0, View view, ArrayList arrayList) {
            this.f۱۰۳۵۵a = view;
            this.f۱۰۳۵۶b = arrayList;
        }

        public void onTransitionStart(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f۱۰۳۵۵a.setVisibility(8);
            int numViews = this.f۱۰۳۵۶b.size();
            for (int i = 0; i < numViews; i++) {
                ((View) this.f۱۰۳۵۶b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۱۷a(Object exitTransitionObj, View fragmentView, ArrayList<View> exitingViews) {
        ((Transition) exitTransitionObj).addListener(new Cb(this, fragmentView, exitingViews));
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۲۵۱۳a(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
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
        if (sharedElementTransition == null) {
            return staggered;
        }
        TransitionSet together = new TransitionSet();
        if (staggered != null) {
            together.addTransition(staggered);
        }
        together.addTransition(sharedElementTransition);
        return together;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۱۴a(ViewGroup sceneRoot, Object transition) {
        TransitionManager.beginDelayedTransition(sceneRoot, (Transition) transition);
    }

    /* renamed from: android.support.v4.app.s$c  reason: invalid class name */
    class Cc implements Transition.TransitionListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۵۷a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۵۸b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۵۹c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۶۰d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۶۱e;

        /* renamed from: f  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۶۲f;

        Cc(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f۱۰۳۵۷a = obj;
            this.f۱۰۳۵۸b = arrayList;
            this.f۱۰۳۵۹c = obj2;
            this.f۱۰۳۶۰d = arrayList2;
            this.f۱۰۳۶۱e = obj3;
            this.f۱۰۳۶۲f = arrayList3;
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f۱۰۳۵۷a;
            if (obj != null) {
                Cs.this.m۱۲۵۲۰a(obj, this.f۱۰۳۵۸b, (ArrayList<View>) null);
            }
            Object obj2 = this.f۱۰۳۵۹c;
            if (obj2 != null) {
                Cs.this.m۱۲۵۲۰a(obj2, this.f۱۰۳۶۰d, (ArrayList<View>) null);
            }
            Object obj3 = this.f۱۰۳۶۱e;
            if (obj3 != null) {
                Cs.this.m۱۲۵۲۰a(obj3, this.f۱۰۳۶۲f, (ArrayList<View>) null);
            }
        }

        public void onTransitionEnd(Transition transition) {
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۱۸a(Object overallTransitionObj, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews, Object sharedElementTransition, ArrayList<View> sharedElementsIn) {
        ((Transition) overallTransitionObj).addListener(new Cc(enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn));
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۵۲۶b(Object sharedElementTransitionObj, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn) {
        TransitionSet sharedElementTransition = (TransitionSet) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.getTargets().clear();
            sharedElementTransition.getTargets().addAll(sharedElementsIn);
            m۱۲۵۲۰a((Object) sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۲۰a(Object transitionObj, ArrayList<View> oldTargets, ArrayList<View> newTargets) {
        List<View> targets;
        Transition transition = (Transition) transitionObj;
        if (transition instanceof TransitionSet) {
            TransitionSet set = (TransitionSet) transition;
            int numTransitions = set.getTransitionCount();
            for (int i = 0; i < numTransitions; i++) {
                m۱۲۵۲۰a((Object) set.getTransitionAt(i), oldTargets, newTargets);
            }
        } else if (!m۱۲۵۱۲a(transition) && (targets = transition.getTargets()) != null && targets.size() == oldTargets.size() && targets.containsAll(oldTargets)) {
            int targetCount = newTargets == null ? 0 : newTargets.size();
            for (int i2 = 0; i2 < targetCount; i2++) {
                transition.addTarget(newTargets.get(i2));
            }
            for (int i3 = oldTargets.size() - 1; i3 >= 0; i3--) {
                transition.removeTarget(oldTargets.get(i3));
            }
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۱۶a(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((Transition) transitionObj).addTarget(view);
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۵۲۴b(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((Transition) transitionObj).removeTarget(view);
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۱۵a(Object transitionObj, Rect epicenter) {
        if (transitionObj != null) {
            ((Transition) transitionObj).setEpicenterCallback(new Cd(this, epicenter));
        }
    }

    /* renamed from: android.support.v4.app.s$d  reason: invalid class name */
    class Cd extends Transition.EpicenterCallback {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ Rect f۱۰۳۶۴a;

        Cd(Cs this$0, Rect rect) {
            this.f۱۰۳۶۴a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f۱۰۳۶۴a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f۱۰۳۶۴a;
        }
    }
}
