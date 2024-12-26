package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.graphics.Rect;
import android.support.v4.app.AbstractCt;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm;

/* renamed from: a.b.f.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ce extends AbstractCt {
    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۰۴۷۸a(Object transition) {
        return transition instanceof AbstractCm;
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: b, reason: contains not printable characters */
    public Object mo۱۰۴۷۹b(Object transition) {
        if (transition == null) {
            return null;
        }
        AbstractCm copy = ((AbstractCm) transition).mo۸۳۲۵clone();
        return copy;
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: c, reason: contains not printable characters */
    public Object mo۱۰۴۸۴c(Object transition) {
        if (transition == null) {
            return null;
        }
        Cq transitionSet = new Cq();
        transitionSet.m۸۳۰۸a((AbstractCm) transition);
        return transitionSet;
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۰۴۸۲b(Object transitionObj, View nonExistentView, ArrayList<View> sharedViews) {
        Cq transition = (Cq) transitionObj;
        List<View> views = transition.m۸۲۷۸m();
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
            AbstractCm transition = (AbstractCm) transitionObj;
            Rect epicenter = new Rect();
            m۱۰۴۶۵a(view, epicenter);
            transition.mo۸۳۱۳a(new a(this, epicenter));
        }
    }

    /* renamed from: a.b.f.e$a */
    class a extends AbstractCm.e {
        a(Ce this$0, Rect rect) {
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۷۴a(Object transitionObj, ArrayList<View> views) {
        AbstractCm transition = (AbstractCm) transitionObj;
        if (transition == null) {
            return;
        }
        if (transition instanceof Cq) {
            Cq set = (Cq) transition;
            int numTransitions = set.m۸۳۳۰q();
            for (int i = 0; i < numTransitions; i++) {
                AbstractCm child = set.m۸۳۰۱a(i);
                mo۱۰۴۷۴a(child, views);
            }
            return;
        }
        if (!m۸۱۶۰a(transition)) {
            List<View> targets = transition.m۸۲۷۸m();
            if (AbstractCt.m۱۰۴۶۱a((List) targets)) {
                int numViews = views.size();
                for (int i2 = 0; i2 < numViews; i2++) {
                    transition.mo۸۳۱۰a(views.get(i2));
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۸۱۶۰a(AbstractCm transition) {
        return (AbstractCt.m۱۰۴۶۱a((List) transition.m۸۲۷۵i()) && AbstractCt.m۱۰۴۶۱a((List) transition.m۸۲۷۶j()) && AbstractCt.m۱۰۴۶۱a((List) transition.m۸۲۷۷k())) ? false : true;
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: b, reason: contains not printable characters */
    public Object mo۱۰۴۸۰b(Object transition1, Object transition2, Object transition3) {
        Cq transitionSet = new Cq();
        if (transition1 != null) {
            transitionSet.m۸۳۰۸a((AbstractCm) transition1);
        }
        if (transition2 != null) {
            transitionSet.m۸۳۰۸a((AbstractCm) transition2);
        }
        if (transition3 != null) {
            transitionSet.m۸۳۰۸a((AbstractCm) transition3);
        }
        return transitionSet;
    }

    /* renamed from: a.b.f.e$b */
    class b implements AbstractCm.f {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ View f۸۵۲۴a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۸۵۲۵b;

        b(Ce this$0, View view, ArrayList arrayList) {
            this.f۸۵۲۴a = view;
            this.f۸۵۲۵b = arrayList;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: c, reason: contains not printable characters */
        public void mo۸۳۳۳c(AbstractCm transition) {
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: b, reason: contains not printable characters */
        public void mo۸۳۳۲b(AbstractCm transition) {
            transition.mo۸۳۲۱b(this);
            this.f۸۵۲۴a.setVisibility(8);
            int numViews = this.f۸۵۲۵b.size();
            for (int i = 0; i < numViews; i++) {
                ((View) this.f۸۵۲۵b.get(i)).setVisibility(0);
            }
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: a, reason: contains not printable characters */
        public void mo۸۲۸۸a(AbstractCm transition) {
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: d, reason: contains not printable characters */
        public void mo۸۲۹۰d(AbstractCm transition) {
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۷۲a(Object exitTransitionObj, View fragmentView, ArrayList<View> exitingViews) {
        AbstractCm exitTransition = (AbstractCm) exitTransitionObj;
        exitTransition.mo۸۳۰۷a(new b(this, fragmentView, exitingViews));
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public Object mo۱۰۴۶۳a(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
        AbstractCm staggered = null;
        AbstractCm exitTransition = (AbstractCm) exitTransitionObj;
        AbstractCm enterTransition = (AbstractCm) enterTransitionObj;
        AbstractCm sharedElementTransition = (AbstractCm) sharedElementTransitionObj;
        if (exitTransition != null && enterTransition != null) {
            Cq cq = new Cq();
            cq.m۸۳۰۸a(exitTransition);
            cq.m۸۳۰۸a(enterTransition);
            staggered = cq.m۸۳۱۹b(1);
        } else if (exitTransition != null) {
            staggered = exitTransition;
        } else if (enterTransition != null) {
            staggered = enterTransition;
        }
        if (sharedElementTransition != null) {
            Cq together = new Cq();
            if (staggered != null) {
                together.m۸۳۰۸a(staggered);
            }
            together.m۸۳۰۸a(sharedElementTransition);
            return together;
        }
        return staggered;
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۶۸a(ViewGroup sceneRoot, Object transition) {
        Co.m۸۲۹۲a(sceneRoot, (AbstractCm) transition);
    }

    /* renamed from: a.b.f.e$c */
    class c implements AbstractCm.f {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ Object f۸۵۲۶a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۸۵۲۷b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ Object f۸۵۲۸c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۸۵۲۹d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ Object f۸۵۳۰e;

        /* renamed from: f, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۸۵۳۱f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f۸۵۲۶a = obj;
            this.f۸۵۲۷b = arrayList;
            this.f۸۵۲۸c = obj2;
            this.f۸۵۲۹d = arrayList2;
            this.f۸۵۳۰e = obj3;
            this.f۸۵۳۱f = arrayList3;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: c, reason: contains not printable characters */
        public void mo۸۳۳۳c(AbstractCm transition) {
            Object obj = this.f۸۵۲۶a;
            if (obj != null) {
                Ce.this.mo۱۰۴۷۵a(obj, this.f۸۵۲۷b, (ArrayList<View>) null);
            }
            Object obj2 = this.f۸۵۲۸c;
            if (obj2 != null) {
                Ce.this.mo۱۰۴۷۵a(obj2, this.f۸۵۲۹d, (ArrayList<View>) null);
            }
            Object obj3 = this.f۸۵۳۰e;
            if (obj3 != null) {
                Ce.this.mo۱۰۴۷۵a(obj3, this.f۸۵۳۱f, (ArrayList<View>) null);
            }
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: b, reason: contains not printable characters */
        public void mo۸۳۳۲b(AbstractCm transition) {
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: a, reason: contains not printable characters */
        public void mo۸۲۸۸a(AbstractCm transition) {
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: d, reason: contains not printable characters */
        public void mo۸۲۹۰d(AbstractCm transition) {
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۷۳a(Object overallTransitionObj, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews, Object sharedElementTransition, ArrayList<View> sharedElementsIn) {
        AbstractCm overallTransition = (AbstractCm) overallTransitionObj;
        overallTransition.mo۸۳۰۷a(new c(enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn));
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۰۴۸۳b(Object sharedElementTransitionObj, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn) {
        Cq sharedElementTransition = (Cq) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.m۸۲۷۸m().clear();
            sharedElementTransition.m۸۲۷۸m().addAll(sharedElementsIn);
            mo۱۰۴۷۵a((Object) sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۷۵a(Object transitionObj, ArrayList<View> oldTargets, ArrayList<View> newTargets) {
        AbstractCm transition = (AbstractCm) transitionObj;
        if (transition instanceof Cq) {
            Cq set = (Cq) transition;
            int numTransitions = set.m۸۳۳۰q();
            for (int i = 0; i < numTransitions; i++) {
                AbstractCm child = set.m۸۳۰۱a(i);
                mo۱۰۴۷۵a((Object) child, oldTargets, newTargets);
            }
            return;
        }
        if (!m۸۱۶۰a(transition)) {
            List<View> targets = transition.m۸۲۷۸m();
            if (targets.size() == oldTargets.size() && targets.containsAll(oldTargets)) {
                int targetCount = newTargets == null ? 0 : newTargets.size();
                for (int i2 = 0; i2 < targetCount; i2++) {
                    transition.mo۸۳۱۰a(newTargets.get(i2));
                }
                int i3 = oldTargets.size();
                for (int i4 = i3 - 1; i4 >= 0; i4--) {
                    transition.mo۸۳۲۷d(oldTargets.get(i4));
                }
            }
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۷۱a(Object transitionObj, View view) {
        if (transitionObj != null) {
            AbstractCm transition = (AbstractCm) transitionObj;
            transition.mo۸۳۱۰a(view);
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۰۴۸۱b(Object transitionObj, View view) {
        if (transitionObj != null) {
            AbstractCm transition = (AbstractCm) transitionObj;
            transition.mo۸۳۲۷d(view);
        }
    }

    @Override // android.support.v4.app.AbstractCt
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۰۴۷۰a(Object transitionObj, Rect epicenter) {
        if (transitionObj != null) {
            AbstractCm transition = (AbstractCm) transitionObj;
            transition.mo۸۳۱۳a(new d(this, epicenter));
        }
    }

    /* renamed from: a.b.f.e$d */
    class d extends AbstractCm.e {
        d(Ce this$0, Rect rect) {
        }
    }
}
