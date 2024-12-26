package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class d extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    c f۶۰۰c;

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attrs) {
        return new a(getContext(), attrs);
    }

    public static class a extends ConstraintLayout.a {
        public float m0 = 1.0f;
        public boolean n0 = false;
        public float o0 = 0.0f;
        public float p0 = 0.0f;
        public float q0 = 0.0f;
        public float r0 = 0.0f;
        public float s0 = 1.0f;
        public float t0 = 1.0f;
        public float u0 = 0.0f;
        public float v0 = 0.0f;
        public float w0 = 0.0f;
        public float x0 = 0.0f;
        public float y0 = 0.0f;

        public a(int width, int height) {
            super(width, height);
        }

        public a(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            TypedArray a2 = c2.obtainStyledAttributes(attrs, h.ConstraintSet);
            int N = a2.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a2.getIndex(i);
                if (attr == h.ConstraintSet_android_alpha) {
                    this.m0 = a2.getFloat(attr, this.m0);
                } else if (attr == h.ConstraintSet_android_elevation) {
                    this.o0 = a2.getFloat(attr, this.o0);
                    this.n0 = true;
                } else if (attr == h.ConstraintSet_android_rotationX) {
                    this.q0 = a2.getFloat(attr, this.q0);
                } else if (attr == h.ConstraintSet_android_rotationY) {
                    this.r0 = a2.getFloat(attr, this.r0);
                } else if (attr == h.ConstraintSet_android_rotation) {
                    this.p0 = a2.getFloat(attr, this.p0);
                } else if (attr == h.ConstraintSet_android_scaleX) {
                    this.s0 = a2.getFloat(attr, this.s0);
                } else if (attr == h.ConstraintSet_android_scaleY) {
                    this.t0 = a2.getFloat(attr, this.t0);
                } else if (attr == h.ConstraintSet_android_transformPivotX) {
                    this.u0 = a2.getFloat(attr, this.u0);
                } else if (attr == h.ConstraintSet_android_transformPivotY) {
                    this.v0 = a2.getFloat(attr, this.v0);
                } else if (attr == h.ConstraintSet_android_translationX) {
                    this.w0 = a2.getFloat(attr, this.w0);
                } else if (attr == h.ConstraintSet_android_translationY) {
                    this.x0 = a2.getFloat(attr, this.x0);
                } else if (attr == h.ConstraintSet_android_translationZ) {
                    this.w0 = a2.getFloat(attr, this.y0);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new ConstraintLayout.a(p);
    }

    public c getConstraintSet() {
        if (this.f۶۰۰c == null) {
            this.f۶۰۰c = new c();
        }
        this.f۶۰۰c.a(this);
        return this.f۶۰۰c;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b2) {
    }
}
