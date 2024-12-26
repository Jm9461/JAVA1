package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.graphics.Rect;
import android.support.p۰۴۳v4.app.AbstractCt;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm;

/* renamed from: a.b.f.e  reason: invalid class name */
public class Ce extends AbstractCt {
    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۰۲۳۶a(Object transition) {
        return transition instanceof AbstractCm;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: b  reason: contains not printable characters */
    public Object m۱۰۲۳۷b(Object transition) {
        if (transition != null) {
            return ((AbstractCm) transition).clone();
        }
        return null;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: c  reason: contains not printable characters */
    public Object m۱۰۲۴۲c(Object transition) {
        if (transition == null) {
            return null;
        }
        Cq transitionSet = new Cq();
        transitionSet.m۱۰۳۷۴a((AbstractCm) transition);
        return transitionSet;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۲۴۰b(Object transitionObj, View nonExistentView, ArrayList<View> sharedViews) {
        Cq transition = (Cq) transitionObj;
        List<View> views = transition.m۱۰۳۴۵m();
        views.clear();
        int count = sharedViews.size();
        for (int i = 0; i < count; i++) {
            AbstractCt.m۱۲۵۳۰a(views, sharedViews.get(i));
        }
        views.add(nonExistentView);
        sharedViews.add(nonExistentView);
        m۱۰۲۳۴a(transition, sharedViews);
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۲۴۳c(Object transitionObj, View view) {
        if (view != null) {
            Rect epicenter = new Rect();
            m۱۲۵۳۵a(view, epicenter);
            ((AbstractCm) transitionObj).m۱۰۳۱۷a(new Ca(this, epicenter));
        }
    }

    /* renamed from: a.b.f.e$a  reason: invalid class name */
    class Ca extends AbstractCm.AbstractCe {
        Ca(Ce this$0, Rect rect) {
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۳۴a(Object transitionObj, ArrayList<View> views) {
        AbstractCm transition = (AbstractCm) transitionObj;
        if (transition != null) {
            if (transition instanceof Cq) {
                Cq set = (Cq) transition;
                int numTransitions = set.m۱۰۳۹۵q();
                for (int i = 0; i < numTransitions; i++) {
                    m۱۰۲۳۴a(set.m۱۰۳۶۷a(i), views);
                }
            } else if (!m۱۰۲۲۷a(transition) && AbstractCt.m۱۲۵۳۱a((List) transition.m۱۰۳۴۵m())) {
                int numViews = views.size();
                for (int i2 = 0; i2 < numViews; i2++) {
                    transition.m۱۰۳۱۱a(views.get(i2));
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۰۲۲۷a(AbstractCm transition) {
        return !AbstractCt.m۱۲۵۳۱a(transition.m۱۰۳۴۲i()) || !AbstractCt.m۱۲۵۳۱a(transition.m۱۰۳۴۳j()) || !AbstractCt.m۱۲۵۳۱a(transition.m۱۰۳۴۴k());
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: b  reason: contains not printable characters */
    public Object m۱۰۲۳۸b(Object transition1, Object transition2, Object transition3) {
        Cq transitionSet = new Cq();
        if (transition1 != null) {
            transitionSet.m۱۰۳۷۴a((AbstractCm) transition1);
        }
        if (transition2 != null) {
            transitionSet.m۱۰۳۷۴a((AbstractCm) transition2);
        }
        if (transition3 != null) {
            transitionSet.m۱۰۳۷۴a((AbstractCm) transition3);
        }
        return transitionSet;
    }

    /* renamed from: a.b.f.e$b  reason: invalid class name */
    class Cb implements AbstractCm.AbstractCf {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ View f۸۵۲۴a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۸۵۲۵b;

        Cb(Ce this$0, View view, ArrayList arrayList) {
            this.f۸۵۲۴a = view;
            this.f۸۵۲۵b = arrayList;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۰۲۴۶c(AbstractCm transition) {
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۲۴۵b(AbstractCm transition) {
            transition.m۱۰۳۲۸b(this);
            this.f۸۵۲۴a.setVisibility(8);
            int numViews = this.f۸۵۲۵b.size();
            for (int i = 0; i < numViews; i++) {
                ((View) this.f۸۵۲۵b.get(i)).setVisibility(0);
            }
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۲۴۴a(AbstractCm transition) {
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۰۲۴۷d(AbstractCm transition) {
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۳۲a(Object exitTransitionObj, View fragmentView, ArrayList<View> exitingViews) {
        ((AbstractCm) exitTransitionObj).m۱۰۳۰۹a(new Cb(this, fragmentView, exitingViews));
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۰۲۲۸a(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
        AbstractCm staggered = null;
        AbstractCm exitTransition = (AbstractCm) exitTransitionObj;
        AbstractCm enterTransition = (AbstractCm) enterTransitionObj;
        AbstractCm sharedElementTransition = (AbstractCm) sharedElementTransitionObj;
        if (exitTransition != null && enterTransition != null) {
            Cq qVar = new Cq();
            qVar.m۱۰۳۷۴a(exitTransition);
            qVar.m۱۰۳۷۴a(enterTransition);
            staggered = qVar.m۱۰۳۸۵b(1);
        } else if (exitTransition != null) {
            staggered = exitTransition;
        } else if (enterTransition != null) {
            staggered = enterTransition;
        }
        if (sharedElementTransition == null) {
            return staggered;
        }
        Cq together = new Cq();
        if (staggered != null) {
            together.m۱۰۳۷۴a(staggered);
        }
        together.m۱۰۳۷۴a(sharedElementTransition);
        return together;
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۲۹a(ViewGroup sceneRoot, Object transition) {
        Co.m۱۰۳۵۸a(sceneRoot, (AbstractCm) transition);
    }

    /* renamed from: a.b.f.e$c  reason: invalid class name */
    class Cc implements AbstractCm.AbstractCf {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ Object f۸۵۲۶a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۸۵۲۷b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ Object f۸۵۲۸c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۸۵۲۹d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ Object f۸۵۳۰e;

        /* renamed from: f  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۸۵۳۱f;

        Cc(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f۸۵۲۶a = obj;
            this.f۸۵۲۷b = arrayList;
            this.f۸۵۲۸c = obj2;
            this.f۸۵۲۹d = arrayList2;
            this.f۸۵۳۰e = obj3;
            this.f۸۵۳۱f = arrayList3;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۰۲۵۰c(AbstractCm transition) {
            Object obj = this.f۸۵۲۶a;
            if (obj != null) {
                Ce.this.m۱۰۲۳۵a(obj, this.f۸۵۲۷b, (ArrayList<View>) null);
            }
            Object obj2 = this.f۸۵۲۸c;
            if (obj2 != null) {
                Ce.this.m۱۰۲۳۵a(obj2, this.f۸۵۲۹d, (ArrayList<View>) null);
            }
            Object obj3 = this.f۸۵۳۰e;
            if (obj3 != null) {
                Ce.this.m۱۰۲۳۵a(obj3, this.f۸۵۳۱f, (ArrayList<View>) null);
            }
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۲۴۹b(AbstractCm transition) {
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۲۴۸a(AbstractCm transition) {
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۰۲۵۱d(AbstractCm transition) {
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۳۳a(Object overallTransitionObj, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews, Object sharedElementTransition, ArrayList<View> sharedElementsIn) {
        ((AbstractCm) overallTransitionObj).m۱۰۳۰۹a(new Cc(enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn));
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۲۴۱b(Object sharedElementTransitionObj, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn) {
        Cq sharedElementTransition = (Cq) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.m۱۰۳۴۵m().clear();
            sharedElementTransition.m۱۰۳۴۵m().addAll(sharedElementsIn);
            m۱۰۲۳۵a((Object) sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۳۵a(Object transitionObj, ArrayList<View> oldTargets, ArrayList<View> newTargets) {
        AbstractCm transition = (AbstractCm) transitionObj;
        if (transition instanceof Cq) {
            Cq set = (Cq) transition;
            int numTransitions = set.m۱۰۳۹۵q();
            for (int i = 0; i < numTransitions; i++) {
                m۱۰۲۳۵a((Object) set.m۱۰۳۶۷a(i), oldTargets, newTargets);
            }
        } else if (!m۱۰۲۲۷a(transition)) {
            List<View> targets = transition.m۱۰۳۴۵m();
            if (targets.size() == oldTargets.size() && targets.containsAll(oldTargets)) {
                int targetCount = newTargets == null ? 0 : newTargets.size();
                for (int i2 = 0; i2 < targetCount; i2++) {
                    transition.m۱۰۳۱۱a(newTargets.get(i2));
                }
                for (int i3 = oldTargets.size() - 1; i3 >= 0; i3--) {
                    transition.m۱۰۳۳۵d(oldTargets.get(i3));
                }
            }
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۳۱a(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((AbstractCm) transitionObj).m۱۰۳۱۱a(view);
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۲۳۹b(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((AbstractCm) transitionObj).m۱۰۳۳۵d(view);
        }
    }

    @Override // android.support.p۰۴۳v4.app.AbstractCt
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۳۰a(Object transitionObj, Rect epicenter) {
        if (transitionObj != null) {
            ((AbstractCm) transitionObj).m۱۰۳۱۷a(new Cd(this, epicenter));
        }
    }

    /* renamed from: a.b.f.e$d  reason: invalid class name */
    class Cd extends AbstractCm.AbstractCe {
        Cd(Ce this$0, Rect rect) {
        }
    }
}
