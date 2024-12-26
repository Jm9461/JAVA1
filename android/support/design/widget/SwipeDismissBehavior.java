package android.support.design.widget;

import android.support.design.widget.CoordinatorLayout;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.widget.Cs;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractCc<V> {

    /* renamed from: a  reason: contains not printable characters */
    Cs f۹۶۹۰a;

    /* renamed from: b  reason: contains not printable characters */
    AbstractCb f۹۶۹۱b;

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۹۶۹۲c;

    /* renamed from: d  reason: contains not printable characters */
    private float f۹۶۹۳d = 0.0f;

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۹۶۹۴e;

    /* renamed from: f  reason: contains not printable characters */
    int f۹۶۹۵f = 2;

    /* renamed from: g  reason: contains not printable characters */
    float f۹۶۹۶g = 0.5f;

    /* renamed from: h  reason: contains not printable characters */
    float f۹۶۹۷h = 0.0f;

    /* renamed from: i  reason: contains not printable characters */
    float f۹۶۹۸i = 0.5f;

    /* renamed from: j  reason: contains not printable characters */
    private final Cs.AbstractCc f۹۶۹۹j = new Ca();

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۱۶۷۵a(int i);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۱۶۷۶a(View view);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۶۶۱a(int direction) {
        this.f۹۶۹۵f = direction;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۶۶۴b(float fraction) {
        this.f۹۶۹۷h = m۱۱۶۵۶a(0.0f, fraction, 1.0f);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۶۶۰a(float fraction) {
        this.f۹۶۹۸i = m۱۱۶۵۶a(0.0f, fraction, 1.0f);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۶۶۲a(CoordinatorLayout parent, V child, MotionEvent event) {
        boolean dispatchEventToHelper = this.f۹۶۹۲c;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f۹۶۹۲c = parent.m۱۱۵۴۷a(child, (int) event.getX(), (int) event.getY());
            dispatchEventToHelper = this.f۹۶۹۲c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f۹۶۹۲c = false;
        }
        if (!dispatchEventToHelper) {
            return false;
        }
        m۱۱۶۵۸a((ViewGroup) parent);
        return this.f۹۶۹۰a.m۱۳۳۵۳b(event);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۶۶۵b(CoordinatorLayout parent, V v, MotionEvent event) {
        Cs sVar = this.f۹۶۹۰a;
        if (sVar == null) {
            return false;
        }
        sVar.m۱۳۳۴۴a(event);
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۶۶۳a(View view) {
        return true;
    }

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$a  reason: invalid class name */
    class Ca extends Cs.AbstractCc {

        /* renamed from: a  reason: contains not printable characters */
        private int f۹۷۰۰a;

        /* renamed from: b  reason: contains not printable characters */
        private int f۹۷۰۱b = -1;

        Ca() {
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۱۶۷۳b(View child, int pointerId) {
            return this.f۹۷۰۱b == -1 && SwipeDismissBehavior.this.m۱۱۶۶۳a(child);
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۶۷۰a(View capturedChild, int activePointerId) {
            this.f۹۷۰۱b = activePointerId;
            this.f۹۷۰۰a = capturedChild.getLeft();
            ViewParent parent = capturedChild.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۱۶۷۴c(int state) {
            AbstractCb bVar = SwipeDismissBehavior.this.f۹۶۹۱b;
            if (bVar != null) {
                bVar.m۱۱۶۷۵a(state);
            }
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۶۶۹a(View child, float xvel, float yvel) {
            int targetLeft;
            AbstractCb bVar;
            this.f۹۷۰۱b = -1;
            int childWidth = child.getWidth();
            boolean dismiss = false;
            if (m۱۱۶۶۶a(child, xvel)) {
                int left = child.getLeft();
                int i = this.f۹۷۰۰a;
                targetLeft = left < i ? i - childWidth : i + childWidth;
                dismiss = true;
            } else {
                targetLeft = this.f۹۷۰۰a;
            }
            if (SwipeDismissBehavior.this.f۹۶۹۰a.m۱۳۳۶۱d(targetLeft, child.getTop())) {
                Cu.m۱۲۹۸۹a(child, new RunnableCc(child, dismiss));
            } else if (dismiss && (bVar = SwipeDismissBehavior.this.f۹۶۹۱b) != null) {
                bVar.m۱۱۶۷۶a(child);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0026 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0035 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m۱۱۶۶۶a(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0039
                int r3 = android.support.p۰۴۳v4.view.Cu.m۱۳۰۱۴k(r7)
                if (r3 != r2) goto L_0x0010
                r3 = 1
                goto L_0x0011
            L_0x0010:
                r3 = 0
            L_0x0011:
                android.support.design.widget.SwipeDismissBehavior r4 = android.support.design.widget.SwipeDismissBehavior.this
                int r4 = r4.f۹۶۹۵f
                r5 = 2
                if (r4 != r5) goto L_0x0019
                return r2
            L_0x0019:
                if (r4 != 0) goto L_0x0028
                if (r3 == 0) goto L_0x0022
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x0027
                goto L_0x0026
            L_0x0022:
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x0027
            L_0x0026:
                r1 = 1
            L_0x0027:
                return r1
            L_0x0028:
                if (r4 != r2) goto L_0x0037
                if (r3 == 0) goto L_0x0031
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x0036
                goto L_0x0035
            L_0x0031:
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x0036
            L_0x0035:
                r1 = 1
            L_0x0036:
                return r1
            L_0x0037:
                return r1
            L_0x0039:
                int r0 = r7.getLeft()
                int r3 = r6.f۹۷۰۰a
                int r0 = r0 - r3
                int r3 = r7.getWidth()
                float r3 = (float) r3
                android.support.design.widget.SwipeDismissBehavior r4 = android.support.design.widget.SwipeDismissBehavior.this
                float r4 = r4.f۹۶۹۶g
                float r3 = r3 * r4
                int r3 = java.lang.Math.round(r3)
                int r4 = java.lang.Math.abs(r0)
                if (r4 < r3) goto L_0x0056
                r1 = 1
            L_0x0056:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.Ca.m۱۱۶۶۶a(android.view.View, float):boolean");
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۱۶۶۷a(View child) {
            return child.getWidth();
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۱۶۶۸a(View child, int left, int dx) {
            int max;
            int min;
            boolean isRtl = Cu.m۱۳۰۱۴k(child) == 1;
            int max2 = SwipeDismissBehavior.this.f۹۶۹۵f;
            if (max2 == 0) {
                if (isRtl) {
                    min = this.f۹۷۰۰a - child.getWidth();
                    max = this.f۹۷۰۰a;
                } else {
                    min = this.f۹۷۰۰a;
                    max = this.f۹۷۰۰a + child.getWidth();
                }
            } else if (max2 != 1) {
                min = this.f۹۷۰۰a - child.getWidth();
                max = this.f۹۷۰۰a + child.getWidth();
            } else if (isRtl) {
                min = this.f۹۷۰۰a;
                max = this.f۹۷۰۰a + child.getWidth();
            } else {
                min = this.f۹۷۰۰a - child.getWidth();
                max = this.f۹۷۰۰a;
            }
            return SwipeDismissBehavior.m۱۱۶۵۷a(min, left, max);
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۱۶۷۲b(View child, int top, int dy) {
            return child.getTop();
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۶۷۱a(View child, int left, int top, int dx, int dy) {
            float startAlphaDistance = ((float) this.f۹۷۰۰a) + (((float) child.getWidth()) * SwipeDismissBehavior.this.f۹۶۹۷h);
            float endAlphaDistance = ((float) this.f۹۷۰۰a) + (((float) child.getWidth()) * SwipeDismissBehavior.this.f۹۶۹۸i);
            if (((float) left) <= startAlphaDistance) {
                child.setAlpha(1.0f);
            } else if (((float) left) >= endAlphaDistance) {
                child.setAlpha(0.0f);
            } else {
                child.setAlpha(SwipeDismissBehavior.m۱۱۶۵۶a(0.0f, 1.0f - SwipeDismissBehavior.m۱۱۶۵۹b(startAlphaDistance, endAlphaDistance, (float) left), 1.0f));
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۶۵۸a(ViewGroup parent) {
        Cs sVar;
        if (this.f۹۶۹۰a == null) {
            if (this.f۹۶۹۴e) {
                sVar = Cs.m۱۳۳۲۴a(parent, this.f۹۶۹۳d, this.f۹۶۹۹j);
            } else {
                sVar = Cs.m۱۳۳۲۵a(parent, this.f۹۶۹۹j);
            }
            this.f۹۶۹۰a = sVar;
        }
    }

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$c  reason: invalid class name */
    private class RunnableCc implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        private final View f۹۷۰۳c;

        /* renamed from: d  reason: contains not printable characters */
        private final boolean f۹۷۰۴d;

        RunnableCc(View view, boolean dismiss) {
            this.f۹۷۰۳c = view;
            this.f۹۷۰۴d = dismiss;
        }

        public void run() {
            AbstractCb bVar;
            Cs sVar = SwipeDismissBehavior.this.f۹۶۹۰a;
            if (sVar != null && sVar.m۱۳۳۴۹a(true)) {
                Cu.m۱۲۹۸۹a(this.f۹۷۰۳c, this);
            } else if (this.f۹۷۰۴d && (bVar = SwipeDismissBehavior.this.f۹۶۹۱b) != null) {
                bVar.m۱۱۶۷۶a(this.f۹۷۰۳c);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static float m۱۱۶۵۶a(float min, float value, float max) {
        return Math.min(Math.max(min, value), max);
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۱۶۵۷a(int min, int value, int max) {
        return Math.min(Math.max(min, value), max);
    }

    /* renamed from: b  reason: contains not printable characters */
    static float m۱۱۶۵۹b(float startValue, float endValue, float value) {
        return (value - startValue) / (endValue - startValue);
    }
}
