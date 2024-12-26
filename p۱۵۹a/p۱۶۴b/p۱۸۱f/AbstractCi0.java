package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm;
import p۱۵۹a.p۱۶۴b.p۱۸۱f.Ca;

/* renamed from: a.b.f.i0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCi0 extends AbstractCm {

    /* renamed from: M, reason: contains not printable characters */
    private static final String[] f۸۵۴۹M = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: L, reason: contains not printable characters */
    private int f۸۵۵۰L = 3;

    /* renamed from: a, reason: contains not printable characters */
    public abstract Animator mo۸۲۱۲a(ViewGroup viewGroup, View view, Cs cs, Cs cs2);

    /* renamed from: b, reason: contains not printable characters */
    public abstract Animator mo۸۲۱۷b(ViewGroup viewGroup, View view, Cs cs, Cs cs2);

    /* renamed from: a.b.f.i0$c */
    private static class c {

        /* renamed from: a, reason: contains not printable characters */
        boolean f۸۵۵۹a;

        /* renamed from: b, reason: contains not printable characters */
        boolean f۸۵۶۰b;

        /* renamed from: c, reason: contains not printable characters */
        int f۸۵۶۱c;

        /* renamed from: d, reason: contains not printable characters */
        int f۸۵۶۲d;

        /* renamed from: e, reason: contains not printable characters */
        ViewGroup f۸۵۶۳e;

        /* renamed from: f, reason: contains not printable characters */
        ViewGroup f۸۵۶۴f;

        c() {
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۲۱۳a(int mode) {
        if ((mode & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f۸۵۵۰L = mode;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: n, reason: contains not printable characters */
    public String[] mo۸۲۷۹n() {
        return f۸۵۴۹M;
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۸۲۰۹d(Cs transitionValues) {
        int visibility = transitionValues.f۸۶۳۱b.getVisibility();
        transitionValues.f۸۶۳۰a.put("android:visibility:visibility", Integer.valueOf(visibility));
        transitionValues.f۸۶۳۰a.put("android:visibility:parent", transitionValues.f۸۶۳۱b.getParent());
        int[] loc = new int[2];
        transitionValues.f۸۶۳۱b.getLocationOnScreen(loc);
        transitionValues.f۸۶۳۰a.put("android:visibility:screenLocation", loc);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: c, reason: contains not printable characters */
    public void mo۸۳۲۳c(Cs transitionValues) {
        m۸۲۰۹d(transitionValues);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۱۵a(Cs transitionValues) {
        m۸۲۰۹d(transitionValues);
    }

    /* renamed from: b, reason: contains not printable characters */
    private c m۸۲۰۸b(Cs startValues, Cs endValues) {
        c visInfo = new c();
        visInfo.f۸۵۵۹a = false;
        visInfo.f۸۵۶۰b = false;
        if (startValues != null && startValues.f۸۶۳۰a.containsKey("android:visibility:visibility")) {
            visInfo.f۸۵۶۱c = ((Integer) startValues.f۸۶۳۰a.get("android:visibility:visibility")).intValue();
            visInfo.f۸۵۶۳e = (ViewGroup) startValues.f۸۶۳۰a.get("android:visibility:parent");
        } else {
            visInfo.f۸۵۶۱c = -1;
            visInfo.f۸۵۶۳e = null;
        }
        if (endValues != null && endValues.f۸۶۳۰a.containsKey("android:visibility:visibility")) {
            visInfo.f۸۵۶۲d = ((Integer) endValues.f۸۶۳۰a.get("android:visibility:visibility")).intValue();
            visInfo.f۸۵۶۴f = (ViewGroup) endValues.f۸۶۳۰a.get("android:visibility:parent");
        } else {
            visInfo.f۸۵۶۲d = -1;
            visInfo.f۸۵۶۴f = null;
        }
        if (startValues != null && endValues != null) {
            if (visInfo.f۸۵۶۱c == visInfo.f۸۵۶۲d && visInfo.f۸۵۶۳e == visInfo.f۸۵۶۴f) {
                return visInfo;
            }
            int i = visInfo.f۸۵۶۱c;
            int i2 = visInfo.f۸۵۶۲d;
            if (i != i2) {
                if (i == 0) {
                    visInfo.f۸۵۶۰b = false;
                    visInfo.f۸۵۵۹a = true;
                } else if (i2 == 0) {
                    visInfo.f۸۵۶۰b = true;
                    visInfo.f۸۵۵۹a = true;
                }
            } else if (visInfo.f۸۵۶۴f == null) {
                visInfo.f۸۵۶۰b = false;
                visInfo.f۸۵۵۹a = true;
            } else if (visInfo.f۸۵۶۳e == null) {
                visInfo.f۸۵۶۰b = true;
                visInfo.f۸۵۵۹a = true;
            }
        } else if (startValues == null && visInfo.f۸۵۶۲d == 0) {
            visInfo.f۸۵۶۰b = true;
            visInfo.f۸۵۵۹a = true;
        } else if (endValues == null && visInfo.f۸۵۶۱c == 0) {
            visInfo.f۸۵۶۰b = false;
            visInfo.f۸۵۵۹a = true;
        }
        return visInfo;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public Animator mo۸۲۴۶a(ViewGroup sceneRoot, Cs startValues, Cs endValues) {
        c visInfo = m۸۲۰۸b(startValues, endValues);
        if (!visInfo.f۸۵۵۹a) {
            return null;
        }
        if (visInfo.f۸۵۶۳e != null || visInfo.f۸۵۶۴f != null) {
            if (visInfo.f۸۵۶۰b) {
                return m۸۲۱۰a(sceneRoot, startValues, visInfo.f۸۵۶۱c, endValues, visInfo.f۸۵۶۲d);
            }
            return m۸۲۱۶b(sceneRoot, startValues, visInfo.f۸۵۶۱c, endValues, visInfo.f۸۵۶۲d);
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Animator m۸۲۱۰a(ViewGroup sceneRoot, Cs startValues, int startVisibility, Cs endValues, int endVisibility) {
        if ((this.f۸۵۵۰L & 1) != 1 || endValues == null) {
            return null;
        }
        if (startValues == null) {
            View endParent = (View) endValues.f۸۶۳۱b.getParent();
            Cs startParentValues = m۸۲۴۵a(endParent, false);
            Cs endParentValues = m۸۲۶۲b(endParent, false);
            c parentVisibilityInfo = m۸۲۰۸b(startParentValues, endParentValues);
            if (parentVisibilityInfo.f۸۵۵۹a) {
                return null;
            }
        }
        return mo۸۲۱۲a(sceneRoot, endValues.f۸۶۳۱b, startValues, endValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117 A[RETURN] */
    /* renamed from: b, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator m۸۲۱۶b(android.view.ViewGroup r20, p۱۵۹a.p۱۶۴b.p۱۸۱f.Cs r21, int r22, p۱۵۹a.p۱۶۴b.p۱۸۱f.Cs r23, int r24) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCi0.m۸۲۱۶b(android.view.ViewGroup, a.b.f.s, int, a.b.f.s, int):android.animation.Animator");
    }

    /* renamed from: a.b.f.i0$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ InterfaceCw f۸۵۵۱a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ View f۸۵۵۲b;

        a(AbstractCi0 this$0, InterfaceCw interfaceCw, View view) {
            this.f۸۵۵۱a = interfaceCw;
            this.f۸۵۵۲b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.f۸۵۵۱a.mo۸۳۴۵b(this.f۸۵۵۲b);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۸۲۵۸a(Cs startValues, Cs newValues) {
        if (startValues == null && newValues == null) {
            return false;
        }
        if (startValues != null && newValues != null && newValues.f۸۶۳۰a.containsKey("android:visibility:visibility") != startValues.f۸۶۳۰a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c changeInfo = m۸۲۰۸b(startValues, newValues);
        if (changeInfo.f۸۵۵۹a) {
            return changeInfo.f۸۵۶۱c == 0 || changeInfo.f۸۵۶۲d == 0;
        }
        return false;
    }

    /* renamed from: a.b.f.i0$b */
    private static class b extends AnimatorListenerAdapter implements AbstractCm.f, Ca.a {

        /* renamed from: a, reason: contains not printable characters */
        private final View f۸۵۵۳a;

        /* renamed from: b, reason: contains not printable characters */
        private final int f۸۵۵۴b;

        /* renamed from: c, reason: contains not printable characters */
        private final ViewGroup f۸۵۵۵c;

        /* renamed from: d, reason: contains not printable characters */
        private final boolean f۸۵۵۶d;

        /* renamed from: e, reason: contains not printable characters */
        private boolean f۸۵۵۷e;

        /* renamed from: f, reason: contains not printable characters */
        boolean f۸۵۵۸f = false;

        b(View view, int finalVisibility, boolean suppressLayout) {
            this.f۸۵۵۳a = view;
            this.f۸۵۵۴b = finalVisibility;
            this.f۸۵۵۵c = (ViewGroup) view.getParent();
            this.f۸۵۵۶d = suppressLayout;
            m۸۲۲۱a(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p۱۵۹a.p۱۶۴b.p۱۸۱f.Ca.a
        public void onAnimationPause(Animator animation) {
            if (!this.f۸۵۵۸f) {
                Cd0.m۸۱۴۸a(this.f۸۵۵۳a, this.f۸۵۵۴b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p۱۵۹a.p۱۶۴b.p۱۸۱f.Ca.a
        public void onAnimationResume(Animator animation) {
            if (!this.f۸۵۵۸f) {
                Cd0.m۸۱۴۸a(this.f۸۵۵۳a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.f۸۵۵۸f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            m۸۲۲۰a();
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: c, reason: contains not printable characters */
        public void mo۸۳۳۳c(AbstractCm transition) {
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: b, reason: contains not printable characters */
        public void mo۸۳۳۲b(AbstractCm transition) {
            m۸۲۲۰a();
            transition.mo۸۳۲۱b(this);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: a, reason: contains not printable characters */
        public void mo۸۲۸۸a(AbstractCm transition) {
            m۸۲۲۱a(false);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: d, reason: contains not printable characters */
        public void mo۸۲۹۰d(AbstractCm transition) {
            m۸۲۲۱a(true);
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۸۲۲۰a() {
            if (!this.f۸۵۵۸f) {
                Cd0.m۸۱۴۸a(this.f۸۵۵۳a, this.f۸۵۵۴b);
                ViewGroup viewGroup = this.f۸۵۵۵c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m۸۲۲۱a(false);
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۸۲۲۱a(boolean suppress) {
            ViewGroup viewGroup;
            if (this.f۸۵۵۶d && this.f۸۵۵۷e != suppress && (viewGroup = this.f۸۵۵۵c) != null) {
                this.f۸۵۵۷e = suppress;
                Cx.m۸۳۴۷a(viewGroup, suppress);
            }
        }
    }
}
