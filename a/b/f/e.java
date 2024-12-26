package a.b.f;

import a.b.f.m;
import android.graphics.Rect;
import android.support.v4.app.t;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class e extends t {
    @Override // android.support.v4.app.t
    public boolean a(Object transition) {
        return transition instanceof m;
    }

    @Override // android.support.v4.app.t
    public Object b(Object transition) {
        if (transition != null) {
            return ((m) transition).clone();
        }
        return null;
    }

    @Override // android.support.v4.app.t
    public Object c(Object transition) {
        if (transition == null) {
            return null;
        }
        q transitionSet = new q();
        transitionSet.a((m) transition);
        return transitionSet;
    }

    @Override // android.support.v4.app.t
    public void b(Object transitionObj, View nonExistentView, ArrayList<View> sharedViews) {
        q transition = (q) transitionObj;
        List<View> views = transition.m();
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
            ((m) transitionObj).a(new a(this, epicenter));
        }
    }

    class a extends m.e {
        a(e this$0, Rect rect) {
        }
    }

    @Override // android.support.v4.app.t
    public void a(Object transitionObj, ArrayList<View> views) {
        m transition = (m) transitionObj;
        if (transition != null) {
            if (transition instanceof q) {
                q set = (q) transition;
                int numTransitions = set.q();
                for (int i = 0; i < numTransitions; i++) {
                    a(set.a(i), views);
                }
            } else if (!a(transition) && t.a((List) transition.m())) {
                int numViews = views.size();
                for (int i2 = 0; i2 < numViews; i2++) {
                    transition.a(views.get(i2));
                }
            }
        }
    }

    private static boolean a(m transition) {
        return !t.a(transition.i()) || !t.a(transition.j()) || !t.a(transition.k());
    }

    @Override // android.support.v4.app.t
    public Object b(Object transition1, Object transition2, Object transition3) {
        q transitionSet = new q();
        if (transition1 != null) {
            transitionSet.a((m) transition1);
        }
        if (transition2 != null) {
            transitionSet.a((m) transition2);
        }
        if (transition3 != null) {
            transitionSet.a((m) transition3);
        }
        return transitionSet;
    }

    class b implements m.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f۱۹۸a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۹۹b;

        b(e this$0, View view, ArrayList arrayList) {
            this.f۱۹۸a = view;
            this.f۱۹۹b = arrayList;
        }

        @Override // a.b.f.m.f
        public void c(m transition) {
        }

        @Override // a.b.f.m.f
        public void b(m transition) {
            transition.b(this);
            this.f۱۹۸a.setVisibility(8);
            int numViews = this.f۱۹۹b.size();
            for (int i = 0; i < numViews; i++) {
                ((View) this.f۱۹۹b.get(i)).setVisibility(0);
            }
        }

        @Override // a.b.f.m.f
        public void a(m transition) {
        }

        @Override // a.b.f.m.f
        public void d(m transition) {
        }
    }

    @Override // android.support.v4.app.t
    public void a(Object exitTransitionObj, View fragmentView, ArrayList<View> exitingViews) {
        ((m) exitTransitionObj).a(new b(this, fragmentView, exitingViews));
    }

    @Override // android.support.v4.app.t
    public Object a(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
        m staggered = null;
        m exitTransition = (m) exitTransitionObj;
        m enterTransition = (m) enterTransitionObj;
        m sharedElementTransition = (m) sharedElementTransitionObj;
        if (exitTransition != null && enterTransition != null) {
            q qVar = new q();
            qVar.a(exitTransition);
            qVar.a(enterTransition);
            staggered = qVar.b(1);
        } else if (exitTransition != null) {
            staggered = exitTransition;
        } else if (enterTransition != null) {
            staggered = enterTransition;
        }
        if (sharedElementTransition == null) {
            return staggered;
        }
        q together = new q();
        if (staggered != null) {
            together.a(staggered);
        }
        together.a(sharedElementTransition);
        return together;
    }

    @Override // android.support.v4.app.t
    public void a(ViewGroup sceneRoot, Object transition) {
        o.a(sceneRoot, (m) transition);
    }

    class c implements m.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f۲۰۰a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f۲۰۱b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f۲۰۲c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f۲۰۳d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f۲۰۴e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f۲۰۵f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f۲۰۰a = obj;
            this.f۲۰۱b = arrayList;
            this.f۲۰۲c = obj2;
            this.f۲۰۳d = arrayList2;
            this.f۲۰۴e = obj3;
            this.f۲۰۵f = arrayList3;
        }

        @Override // a.b.f.m.f
        public void c(m transition) {
            Object obj = this.f۲۰۰a;
            if (obj != null) {
                e.this.a(obj, this.f۲۰۱b, (ArrayList<View>) null);
            }
            Object obj2 = this.f۲۰۲c;
            if (obj2 != null) {
                e.this.a(obj2, this.f۲۰۳d, (ArrayList<View>) null);
            }
            Object obj3 = this.f۲۰۴e;
            if (obj3 != null) {
                e.this.a(obj3, this.f۲۰۵f, (ArrayList<View>) null);
            }
        }

        @Override // a.b.f.m.f
        public void b(m transition) {
        }

        @Override // a.b.f.m.f
        public void a(m transition) {
        }

        @Override // a.b.f.m.f
        public void d(m transition) {
        }
    }

    @Override // android.support.v4.app.t
    public void a(Object overallTransitionObj, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews, Object sharedElementTransition, ArrayList<View> sharedElementsIn) {
        ((m) overallTransitionObj).a(new c(enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn));
    }

    @Override // android.support.v4.app.t
    public void b(Object sharedElementTransitionObj, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn) {
        q sharedElementTransition = (q) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.m().clear();
            sharedElementTransition.m().addAll(sharedElementsIn);
            a((Object) sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    @Override // android.support.v4.app.t
    public void a(Object transitionObj, ArrayList<View> oldTargets, ArrayList<View> newTargets) {
        m transition = (m) transitionObj;
        if (transition instanceof q) {
            q set = (q) transition;
            int numTransitions = set.q();
            for (int i = 0; i < numTransitions; i++) {
                a((Object) set.a(i), oldTargets, newTargets);
            }
        } else if (!a(transition)) {
            List<View> targets = transition.m();
            if (targets.size() == oldTargets.size() && targets.containsAll(oldTargets)) {
                int targetCount = newTargets == null ? 0 : newTargets.size();
                for (int i2 = 0; i2 < targetCount; i2++) {
                    transition.a(newTargets.get(i2));
                }
                for (int i3 = oldTargets.size() - 1; i3 >= 0; i3--) {
                    transition.d(oldTargets.get(i3));
                }
            }
        }
    }

    @Override // android.support.v4.app.t
    public void a(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((m) transitionObj).a(view);
        }
    }

    @Override // android.support.v4.app.t
    public void b(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((m) transitionObj).d(view);
        }
    }

    @Override // android.support.v4.app.t
    public void a(Object transitionObj, Rect epicenter) {
        if (transitionObj != null) {
            ((m) transitionObj).a(new d(this, epicenter));
        }
    }

    class d extends m.e {
        d(e this$0, Rect rect) {
        }
    }
}
