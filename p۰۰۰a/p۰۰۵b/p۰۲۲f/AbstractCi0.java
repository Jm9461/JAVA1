package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm;
import p۰۰۰a.p۰۰۵b.p۰۲۲f.Ca;

/* renamed from: a.b.f.i0  reason: invalid class name */
public abstract class AbstractCi0 extends AbstractCm {

    /* renamed from: M  reason: contains not printable characters */
    private static final String[] f۸۵۴۹M = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: L  reason: contains not printable characters */
    private int f۸۵۵۰L = 3;

    /* renamed from: a  reason: contains not printable characters */
    public abstract Animator m۱۰۲۷۹a(ViewGroup viewGroup, View view, Cs sVar, Cs sVar2);

    /* renamed from: b  reason: contains not printable characters */
    public abstract Animator m۱۰۲۸۴b(ViewGroup viewGroup, View view, Cs sVar, Cs sVar2);

    /* access modifiers changed from: private */
    /* renamed from: a.b.f.i0$c  reason: invalid class name */
    public static class Cc {

        /* renamed from: a  reason: contains not printable characters */
        boolean f۸۵۵۹a;

        /* renamed from: b  reason: contains not printable characters */
        boolean f۸۵۶۰b;

        /* renamed from: c  reason: contains not printable characters */
        int f۸۵۶۱c;

        /* renamed from: d  reason: contains not printable characters */
        int f۸۵۶۲d;

        /* renamed from: e  reason: contains not printable characters */
        ViewGroup f۸۵۶۳e;

        /* renamed from: f  reason: contains not printable characters */
        ViewGroup f۸۵۶۴f;

        Cc() {
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۸۰a(int mode) {
        if ((mode & -4) == 0) {
            this.f۸۵۵۰L = mode;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: n  reason: contains not printable characters */
    public String[] m۱۰۲۸۶n() {
        return f۸۵۴۹M;
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۰۲۷۶d(Cs transitionValues) {
        transitionValues.f۸۶۳۰a.put("android:visibility:visibility", Integer.valueOf(transitionValues.f۸۶۳۱b.getVisibility()));
        transitionValues.f۸۶۳۰a.put("android:visibility:parent", transitionValues.f۸۶۳۱b.getParent());
        int[] loc = new int[2];
        transitionValues.f۸۶۳۱b.getLocationOnScreen(loc);
        transitionValues.f۸۶۳۰a.put("android:visibility:screenLocation", loc);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۲۸۵c(Cs transitionValues) {
        m۱۰۲۷۶d(transitionValues);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۸۱a(Cs transitionValues) {
        m۱۰۲۷۶d(transitionValues);
    }

    /* renamed from: b  reason: contains not printable characters */
    private Cc m۱۰۲۷۵b(Cs startValues, Cs endValues) {
        Cc visInfo = new Cc();
        visInfo.f۸۵۵۹a = false;
        visInfo.f۸۵۶۰b = false;
        if (startValues == null || !startValues.f۸۶۳۰a.containsKey("android:visibility:visibility")) {
            visInfo.f۸۵۶۱c = -1;
            visInfo.f۸۵۶۳e = null;
        } else {
            visInfo.f۸۵۶۱c = ((Integer) startValues.f۸۶۳۰a.get("android:visibility:visibility")).intValue();
            visInfo.f۸۵۶۳e = (ViewGroup) startValues.f۸۶۳۰a.get("android:visibility:parent");
        }
        if (endValues == null || !endValues.f۸۶۳۰a.containsKey("android:visibility:visibility")) {
            visInfo.f۸۵۶۲d = -1;
            visInfo.f۸۵۶۴f = null;
        } else {
            visInfo.f۸۵۶۲d = ((Integer) endValues.f۸۶۳۰a.get("android:visibility:visibility")).intValue();
            visInfo.f۸۵۶۴f = (ViewGroup) endValues.f۸۶۳۰a.get("android:visibility:parent");
        }
        if (startValues == null || endValues == null) {
            if (startValues == null && visInfo.f۸۵۶۲d == 0) {
                visInfo.f۸۵۶۰b = true;
                visInfo.f۸۵۵۹a = true;
            } else if (endValues == null && visInfo.f۸۵۶۱c == 0) {
                visInfo.f۸۵۶۰b = false;
                visInfo.f۸۵۵۹a = true;
            }
        } else if (visInfo.f۸۵۶۱c == visInfo.f۸۵۶۲d && visInfo.f۸۵۶۳e == visInfo.f۸۵۶۴f) {
            return visInfo;
        } else {
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
        }
        return visInfo;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public Animator m۱۰۲۷۸a(ViewGroup sceneRoot, Cs startValues, Cs endValues) {
        Cc visInfo = m۱۰۲۷۵b(startValues, endValues);
        if (!visInfo.f۸۵۵۹a) {
            return null;
        }
        if (visInfo.f۸۵۶۳e == null && visInfo.f۸۵۶۴f == null) {
            return null;
        }
        if (visInfo.f۸۵۶۰b) {
            return m۱۰۲۷۷a(sceneRoot, startValues, visInfo.f۸۵۶۱c, endValues, visInfo.f۸۵۶۲d);
        }
        return m۱۰۲۸۳b(sceneRoot, startValues, visInfo.f۸۵۶۱c, endValues, visInfo.f۸۵۶۲d);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Animator m۱۰۲۷۷a(ViewGroup sceneRoot, Cs startValues, int startVisibility, Cs endValues, int endVisibility) {
        if ((this.f۸۵۵۰L & 1) != 1 || endValues == null) {
            return null;
        }
        if (startValues == null) {
            View endParent = (View) endValues.f۸۶۳۱b.getParent();
            if (m۱۰۲۷۵b(m۱۰۳۱۲a(endParent, false), m۱۰۳۲۹b(endParent, false)).f۸۵۵۹a) {
                return null;
            }
        }
        return m۱۰۲۷۹a(sceneRoot, endValues.f۸۶۳۱b, startValues, endValues);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0117 A[RETURN] */
    /* renamed from: b  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator m۱۰۲۸۳b(android.view.ViewGroup r20, p۰۰۰a.p۰۰۵b.p۰۲۲f.Cs r21, int r22, p۰۰۰a.p۰۰۵b.p۰۲۲f.Cs r23, int r24) {
        /*
        // Method dump skipped, instructions count: 281
        */
        throw new UnsupportedOperationException("Method not decompiled: p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCi0.m۱۰۲۸۳b(android.view.ViewGroup, a.b.f.s, int, a.b.f.s, int):android.animation.Animator");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.f.i0$a  reason: invalid class name */
    public class Ca extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCw f۸۵۵۱a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ View f۸۵۵۲b;

        Ca(AbstractCi0 this$0, AbstractCw wVar, View view) {
            this.f۸۵۵۱a = wVar;
            this.f۸۵۵۲b = view;
        }

        public void onAnimationEnd(Animator animation) {
            this.f۸۵۵۱a.m۱۰۴۱۰b(this.f۸۵۵۲b);
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۰۲۸۲a(Cs startValues, Cs newValues) {
        if (startValues == null && newValues == null) {
            return false;
        }
        if (startValues != null && newValues != null && newValues.f۸۶۳۰a.containsKey("android:visibility:visibility") != startValues.f۸۶۳۰a.containsKey("android:visibility:visibility")) {
            return false;
        }
        Cc changeInfo = m۱۰۲۷۵b(startValues, newValues);
        if (!changeInfo.f۸۵۵۹a) {
            return false;
        }
        if (changeInfo.f۸۵۶۱c == 0 || changeInfo.f۸۵۶۲d == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.f.i0$b  reason: invalid class name */
    public static class Cb extends AnimatorListenerAdapter implements AbstractCm.AbstractCf, Ca.AbstractCa {

        /* renamed from: a  reason: contains not printable characters */
        private final View f۸۵۵۳a;

        /* renamed from: b  reason: contains not printable characters */
        private final int f۸۵۵۴b;

        /* renamed from: c  reason: contains not printable characters */
        private final ViewGroup f۸۵۵۵c;

        /* renamed from: d  reason: contains not printable characters */
        private final boolean f۸۵۵۶d;

        /* renamed from: e  reason: contains not printable characters */
        private boolean f۸۵۵۷e;

        /* renamed from: f  reason: contains not printable characters */
        boolean f۸۵۵۸f = false;

        Cb(View view, int finalVisibility, boolean suppressLayout) {
            this.f۸۵۵۳a = view;
            this.f۸۵۵۴b = finalVisibility;
            this.f۸۵۵۵c = (ViewGroup) view.getParent();
            this.f۸۵۵۶d = suppressLayout;
            m۱۰۲۸۸a(true);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.Ca.AbstractCa
        public void onAnimationPause(Animator animation) {
            if (!this.f۸۵۵۸f) {
                Cd0.m۱۰۲۱۵a(this.f۸۵۵۳a, this.f۸۵۵۴b);
            }
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.Ca.AbstractCa
        public void onAnimationResume(Animator animation) {
            if (!this.f۸۵۵۸f) {
                Cd0.m۱۰۲۱۵a(this.f۸۵۵۳a, 0);
            }
        }

        public void onAnimationCancel(Animator animation) {
            this.f۸۵۵۸f = true;
        }

        public void onAnimationRepeat(Animator animation) {
        }

        public void onAnimationStart(Animator animation) {
        }

        public void onAnimationEnd(Animator animation) {
            m۱۰۲۸۷a();
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۰۲۹۱c(AbstractCm transition) {
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۲۹۰b(AbstractCm transition) {
            m۱۰۲۸۷a();
            transition.m۱۰۳۲۸b(this);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۲۸۹a(AbstractCm transition) {
            m۱۰۲۸۸a(false);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۰۲۹۲d(AbstractCm transition) {
            m۱۰۲۸۸a(true);
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۲۸۷a() {
            if (!this.f۸۵۵۸f) {
                Cd0.m۱۰۲۱۵a(this.f۸۵۵۳a, this.f۸۵۵۴b);
                ViewGroup viewGroup = this.f۸۵۵۵c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m۱۰۲۸۸a(false);
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۲۸۸a(boolean suppress) {
            ViewGroup viewGroup;
            if (this.f۸۵۵۶d && this.f۸۵۵۷e != suppress && (viewGroup = this.f۸۵۵۵c) != null) {
                this.f۸۵۵۷e = suppress;
                Cx.m۱۰۴۱۲a(viewGroup, suppress);
            }
        }
    }
}
