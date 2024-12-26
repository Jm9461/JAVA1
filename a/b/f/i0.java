package a.b.f;

import a.b.f.a;
import a.b.f.m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public abstract class i0 extends m {
    private static final String[] M = {"android:visibility:visibility", "android:visibility:parent"};
    private int L = 3;

    public abstract Animator a(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public abstract Animator b(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* access modifiers changed from: private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f۲۲۹a;

        /* renamed from: b  reason: collision with root package name */
        boolean f۲۳۰b;

        /* renamed from: c  reason: collision with root package name */
        int f۲۳۱c;

        /* renamed from: d  reason: collision with root package name */
        int f۲۳۲d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f۲۳۳e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f۲۳۴f;

        c() {
        }
    }

    public void a(int mode) {
        if ((mode & -4) == 0) {
            this.L = mode;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // a.b.f.m
    public String[] n() {
        return M;
    }

    private void d(s transitionValues) {
        transitionValues.f۲۶۷a.put("android:visibility:visibility", Integer.valueOf(transitionValues.f۲۶۸b.getVisibility()));
        transitionValues.f۲۶۷a.put("android:visibility:parent", transitionValues.f۲۶۸b.getParent());
        int[] loc = new int[2];
        transitionValues.f۲۶۸b.getLocationOnScreen(loc);
        transitionValues.f۲۶۷a.put("android:visibility:screenLocation", loc);
    }

    @Override // a.b.f.m
    public void c(s transitionValues) {
        d(transitionValues);
    }

    @Override // a.b.f.m
    public void a(s transitionValues) {
        d(transitionValues);
    }

    private c b(s startValues, s endValues) {
        c visInfo = new c();
        visInfo.f۲۲۹a = false;
        visInfo.f۲۳۰b = false;
        if (startValues == null || !startValues.f۲۶۷a.containsKey("android:visibility:visibility")) {
            visInfo.f۲۳۱c = -1;
            visInfo.f۲۳۳e = null;
        } else {
            visInfo.f۲۳۱c = ((Integer) startValues.f۲۶۷a.get("android:visibility:visibility")).intValue();
            visInfo.f۲۳۳e = (ViewGroup) startValues.f۲۶۷a.get("android:visibility:parent");
        }
        if (endValues == null || !endValues.f۲۶۷a.containsKey("android:visibility:visibility")) {
            visInfo.f۲۳۲d = -1;
            visInfo.f۲۳۴f = null;
        } else {
            visInfo.f۲۳۲d = ((Integer) endValues.f۲۶۷a.get("android:visibility:visibility")).intValue();
            visInfo.f۲۳۴f = (ViewGroup) endValues.f۲۶۷a.get("android:visibility:parent");
        }
        if (startValues == null || endValues == null) {
            if (startValues == null && visInfo.f۲۳۲d == 0) {
                visInfo.f۲۳۰b = true;
                visInfo.f۲۲۹a = true;
            } else if (endValues == null && visInfo.f۲۳۱c == 0) {
                visInfo.f۲۳۰b = false;
                visInfo.f۲۲۹a = true;
            }
        } else if (visInfo.f۲۳۱c == visInfo.f۲۳۲d && visInfo.f۲۳۳e == visInfo.f۲۳۴f) {
            return visInfo;
        } else {
            int i = visInfo.f۲۳۱c;
            int i2 = visInfo.f۲۳۲d;
            if (i != i2) {
                if (i == 0) {
                    visInfo.f۲۳۰b = false;
                    visInfo.f۲۲۹a = true;
                } else if (i2 == 0) {
                    visInfo.f۲۳۰b = true;
                    visInfo.f۲۲۹a = true;
                }
            } else if (visInfo.f۲۳۴f == null) {
                visInfo.f۲۳۰b = false;
                visInfo.f۲۲۹a = true;
            } else if (visInfo.f۲۳۳e == null) {
                visInfo.f۲۳۰b = true;
                visInfo.f۲۲۹a = true;
            }
        }
        return visInfo;
    }

    @Override // a.b.f.m
    public Animator a(ViewGroup sceneRoot, s startValues, s endValues) {
        c visInfo = b(startValues, endValues);
        if (!visInfo.f۲۲۹a) {
            return null;
        }
        if (visInfo.f۲۳۳e == null && visInfo.f۲۳۴f == null) {
            return null;
        }
        if (visInfo.f۲۳۰b) {
            return a(sceneRoot, startValues, visInfo.f۲۳۱c, endValues, visInfo.f۲۳۲d);
        }
        return b(sceneRoot, startValues, visInfo.f۲۳۱c, endValues, visInfo.f۲۳۲d);
    }

    public Animator a(ViewGroup sceneRoot, s startValues, int startVisibility, s endValues, int endVisibility) {
        if ((this.L & 1) != 1 || endValues == null) {
            return null;
        }
        if (startValues == null) {
            View endParent = (View) endValues.f۲۶۸b.getParent();
            if (b(a(endParent, false), b(endParent, false)).f۲۲۹a) {
                return null;
            }
        }
        return a(sceneRoot, endValues.f۲۶۸b, startValues, endValues);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0117 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator b(android.view.ViewGroup r20, a.b.f.s r21, int r22, a.b.f.s r23, int r24) {
        /*
        // Method dump skipped, instructions count: 281
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.f.i0.b(android.view.ViewGroup, a.b.f.s, int, a.b.f.s, int):android.animation.Animator");
    }

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f۲۲۱a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f۲۲۲b;

        a(i0 this$0, w wVar, View view) {
            this.f۲۲۱a = wVar;
            this.f۲۲۲b = view;
        }

        public void onAnimationEnd(Animator animation) {
            this.f۲۲۱a.b(this.f۲۲۲b);
        }
    }

    @Override // a.b.f.m
    public boolean a(s startValues, s newValues) {
        if (startValues == null && newValues == null) {
            return false;
        }
        if (startValues != null && newValues != null && newValues.f۲۶۷a.containsKey("android:visibility:visibility") != startValues.f۲۶۷a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c changeInfo = b(startValues, newValues);
        if (!changeInfo.f۲۲۹a) {
            return false;
        }
        if (changeInfo.f۲۳۱c == 0 || changeInfo.f۲۳۲d == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static class b extends AnimatorListenerAdapter implements m.f, a.AbstractC۰۰۰۸a {

        /* renamed from: a  reason: collision with root package name */
        private final View f۲۲۳a;

        /* renamed from: b  reason: collision with root package name */
        private final int f۲۲۴b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f۲۲۵c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f۲۲۶d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f۲۲۷e;

        /* renamed from: f  reason: collision with root package name */
        boolean f۲۲۸f = false;

        b(View view, int finalVisibility, boolean suppressLayout) {
            this.f۲۲۳a = view;
            this.f۲۲۴b = finalVisibility;
            this.f۲۲۵c = (ViewGroup) view.getParent();
            this.f۲۲۶d = suppressLayout;
            a(true);
        }

        @Override // a.b.f.a.AbstractC۰۰۰۸a
        public void onAnimationPause(Animator animation) {
            if (!this.f۲۲۸f) {
                d0.a(this.f۲۲۳a, this.f۲۲۴b);
            }
        }

        @Override // a.b.f.a.AbstractC۰۰۰۸a
        public void onAnimationResume(Animator animation) {
            if (!this.f۲۲۸f) {
                d0.a(this.f۲۲۳a, 0);
            }
        }

        public void onAnimationCancel(Animator animation) {
            this.f۲۲۸f = true;
        }

        public void onAnimationRepeat(Animator animation) {
        }

        public void onAnimationStart(Animator animation) {
        }

        public void onAnimationEnd(Animator animation) {
            a();
        }

        @Override // a.b.f.m.f
        public void c(m transition) {
        }

        @Override // a.b.f.m.f
        public void b(m transition) {
            a();
            transition.b(this);
        }

        @Override // a.b.f.m.f
        public void a(m transition) {
            a(false);
        }

        @Override // a.b.f.m.f
        public void d(m transition) {
            a(true);
        }

        private void a() {
            if (!this.f۲۲۸f) {
                d0.a(this.f۲۲۳a, this.f۲۲۴b);
                ViewGroup viewGroup = this.f۲۲۵c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        private void a(boolean suppress) {
            ViewGroup viewGroup;
            if (this.f۲۲۶d && this.f۲۲۷e != suppress && (viewGroup = this.f۲۲۵c) != null) {
                this.f۲۲۷e = suppress;
                x.a(viewGroup, suppress);
            }
        }
    }
}
