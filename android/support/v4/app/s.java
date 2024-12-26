package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

class s extends t {
    s() {
    }

    @Override // android.support.v4.app.t
    public boolean a(Object transition) {
        return transition instanceof Transition;
    }

    @Override // android.support.v4.app.t
    public Object b(Object transition) {
        if (transition != null) {
            return ((Transition) transition).clone();
        }
        return null;
    }

    @Override // android.support.v4.app.t
    public Object c(Object transition) {
        if (transition == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) transition);
        return transitionSet;
    }

    @Override // android.support.v4.app.t
    public void b(Object transitionObj, View nonExistentView, ArrayList<View> sharedViews) {
        TransitionSet transition = (TransitionSet) transitionObj;
        List<View> views = transition.getTargets();
        views.clear();
        int count = sharedViews.size();
        for (int i = 0; i < count; i++) {
            t.a(views, sharedViews.get(i));
        }
        views.add(nonExistentView);
        sharedViews.add(nonExistentView);
        a(transition, sharedViews);
    }

    @Override // android.support.v4.app.t
    public void c(Object transitionObj, View view) {
        if (view != null) {
            Rect epicenter = new Rect();
            a(view, epicenter);
            ((Transition) transitionObj).setEpicenterCallback(new a(this, epicenter));
        }
    }

    class a extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f۱۱۹۰a;

        a(s this$0, Rect rect) {
            this.f۱۱۹۰a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f۱۱۹۰a;
        }
    }

    @Override // android.support.v4.app.t
    public void a(Object transitionObj, ArrayList<View> views) {
        Transition transition = (Transition) transitionObj;
        if (transition != null) {
            if (transition instanceof TransitionSet) {
                TransitionSet set = (TransitionSet) transition;
                int numTransitions = set.getTransitionCount();
                for (int i = 0; i < numTransitions; i++) {
                    a(set.getTransitionAt(i), views);
                }
            } else if (!a(transition) && t.a((List) transition.getTargets())) {
                int numViews = views.size();
                for (int i2 = 0; i2 < numViews; i2++) {
                    transition.addTarget(views.get(i2));
                }
            }
        }
    }

    private static boolean a(Transition transition) {
        return !t.a(transition.getTargetIds()) || !t.a(transition.getTargetNames()) || !t.a(transition.getTargetTypes());
    }

    @Override // android.support.v4.app.t
    public Object b(Object transition1, Object transition2, Object transition3) {
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

    class b implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f۱۱۹۱a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۱۹۲b;

        b(s this$0, View view, ArrayList arrayList) {
            this.f۱۱۹۱a = view;
            this.f۱۱۹۲b = arrayList;
        }

        public void onTransitionStart(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f۱۱۹۱a.setVisibility(8);
            int numViews = this.f۱۱۹۲b.size();
            for (int i = 0; i < numViews; i++) {
                ((View) this.f۱۱۹۲b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }
    }

    @Override // android.support.v4.app.t
    public void a(Object exitTransitionObj, View fragmentView, ArrayList<View> exitingViews) {
        ((Transition) exitTransitionObj).addListener(new b(this, fragmentView, exitingViews));
    }

    @Override // android.support.v4.app.t
    public Object a(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
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

    @Override // android.support.v4.app.t
    public void a(ViewGroup sceneRoot, Object transition) {
        TransitionManager.beginDelayedTransition(sceneRoot, (Transition) transition);
    }

    class c implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f۱۱۹۳a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۱۹۴b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f۱۱۹۵c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۱۹۶d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f۱۱۹۷e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۱۹۸f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f۱۱۹۳a = obj;
            this.f۱۱۹۴b = arrayList;
            this.f۱۱۹۵c = obj2;
            this.f۱۱۹۶d = arrayList2;
            this.f۱۱۹۷e = obj3;
            this.f۱۱۹۸f = arrayList3;
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f۱۱۹۳a;
            if (obj != null) {
                s.this.a(obj, this.f۱۱۹۴b, (ArrayList<View>) null);
            }
            Object obj2 = this.f۱۱۹۵c;
            if (obj2 != null) {
                s.this.a(obj2, this.f۱۱۹۶d, (ArrayList<View>) null);
            }
            Object obj3 = this.f۱۱۹۷e;
            if (obj3 != null) {
                s.this.a(obj3, this.f۱۱۹۸f, (ArrayList<View>) null);
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

    @Override // android.support.v4.app.t
    public void a(Object overallTransitionObj, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews, Object sharedElementTransition, ArrayList<View> sharedElementsIn) {
        ((Transition) overallTransitionObj).addListener(new c(enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn));
    }

    @Override // android.support.v4.app.t
    public void b(Object sharedElementTransitionObj, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn) {
        TransitionSet sharedElementTransition = (TransitionSet) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.getTargets().clear();
            sharedElementTransition.getTargets().addAll(sharedElementsIn);
            a((Object) sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    @Override // android.support.v4.app.t
    public void a(Object transitionObj, ArrayList<View> oldTargets, ArrayList<View> newTargets) {
        List<View> targets;
        Transition transition = (Transition) transitionObj;
        if (transition instanceof TransitionSet) {
            TransitionSet set = (TransitionSet) transition;
            int numTransitions = set.getTransitionCount();
            for (int i = 0; i < numTransitions; i++) {
                a((Object) set.getTransitionAt(i), oldTargets, newTargets);
            }
        } else if (!a(transition) && (targets = transition.getTargets()) != null && targets.size() == oldTargets.size() && targets.containsAll(oldTargets)) {
            int targetCount = newTargets == null ? 0 : newTargets.size();
            for (int i2 = 0; i2 < targetCount; i2++) {
                transition.addTarget(newTargets.get(i2));
            }
            for (int i3 = oldTargets.size() - 1; i3 >= 0; i3--) {
                transition.removeTarget(oldTargets.get(i3));
            }
        }
    }

    @Override // android.support.v4.app.t
    public void a(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((Transition) transitionObj).addTarget(view);
        }
    }

    @Override // android.support.v4.app.t
    public void b(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((Transition) transitionObj).removeTarget(view);
        }
    }

    @Override // android.support.v4.app.t
    public void a(Object transitionObj, Rect epicenter) {
        if (transitionObj != null) {
            ((Transition) transitionObj).setEpicenterCallback(new d(this, epicenter));
        }
    }

    class d extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f۱۲۰۰a;

        d(s this$0, Rect rect) {
            this.f۱۲۰۰a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f۱۲۰۰a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f۱۲۰۰a;
        }
    }
}
