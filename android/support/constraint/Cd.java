package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: android.support.constraint.d  reason: invalid class name */
public class Cd extends ViewGroup {

    /* renamed from: c  reason: contains not printable characters */
    Cc f۹۱۸۵c;

    @Override // android.view.ViewGroup
    public Ca generateLayoutParams(AttributeSet attrs) {
        return new Ca(getContext(), attrs);
    }

    /* renamed from: android.support.constraint.d$a  reason: invalid class name */
    public static class Ca extends ConstraintLayout.Ca {

        /* renamed from: m0  reason: contains not printable characters */
        public float f۹۱۸۶m0 = 1.0f;

        /* renamed from: n0  reason: contains not printable characters */
        public boolean f۹۱۸۷n0 = false;

        /* renamed from: o0  reason: contains not printable characters */
        public float f۹۱۸۸o0 = 0.0f;

        /* renamed from: p0  reason: contains not printable characters */
        public float f۹۱۸۹p0 = 0.0f;

        /* renamed from: q0  reason: contains not printable characters */
        public float f۹۱۹۰q0 = 0.0f;

        /* renamed from: r0  reason: contains not printable characters */
        public float f۹۱۹۱r0 = 0.0f;

        /* renamed from: s0  reason: contains not printable characters */
        public float f۹۱۹۲s0 = 1.0f;

        /* renamed from: t0  reason: contains not printable characters */
        public float f۹۱۹۳t0 = 1.0f;

        /* renamed from: u0  reason: contains not printable characters */
        public float f۹۱۹۴u0 = 0.0f;

        /* renamed from: v0  reason: contains not printable characters */
        public float f۹۱۹۵v0 = 0.0f;

        /* renamed from: w0  reason: contains not printable characters */
        public float f۹۱۹۶w0 = 0.0f;

        /* renamed from: x0  reason: contains not printable characters */
        public float f۹۱۹۷x0 = 0.0f;

        /* renamed from: y0  reason: contains not printable characters */
        public float f۹۱۹۸y0 = 0.0f;

        public Ca(int width, int height) {
            super(width, height);
        }

        public Ca(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray a = c.obtainStyledAttributes(attrs, Ch.ConstraintSet);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == Ch.ConstraintSet_android_alpha) {
                    this.f۹۱۸۶m0 = a.getFloat(attr, this.f۹۱۸۶m0);
                } else if (attr == Ch.ConstraintSet_android_elevation) {
                    this.f۹۱۸۸o0 = a.getFloat(attr, this.f۹۱۸۸o0);
                    this.f۹۱۸۷n0 = true;
                } else if (attr == Ch.ConstraintSet_android_rotationX) {
                    this.f۹۱۹۰q0 = a.getFloat(attr, this.f۹۱۹۰q0);
                } else if (attr == Ch.ConstraintSet_android_rotationY) {
                    this.f۹۱۹۱r0 = a.getFloat(attr, this.f۹۱۹۱r0);
                } else if (attr == Ch.ConstraintSet_android_rotation) {
                    this.f۹۱۸۹p0 = a.getFloat(attr, this.f۹۱۸۹p0);
                } else if (attr == Ch.ConstraintSet_android_scaleX) {
                    this.f۹۱۹۲s0 = a.getFloat(attr, this.f۹۱۹۲s0);
                } else if (attr == Ch.ConstraintSet_android_scaleY) {
                    this.f۹۱۹۳t0 = a.getFloat(attr, this.f۹۱۹۳t0);
                } else if (attr == Ch.ConstraintSet_android_transformPivotX) {
                    this.f۹۱۹۴u0 = a.getFloat(attr, this.f۹۱۹۴u0);
                } else if (attr == Ch.ConstraintSet_android_transformPivotY) {
                    this.f۹۱۹۵v0 = a.getFloat(attr, this.f۹۱۹۵v0);
                } else if (attr == Ch.ConstraintSet_android_translationX) {
                    this.f۹۱۹۶w0 = a.getFloat(attr, this.f۹۱۹۶w0);
                } else if (attr == Ch.ConstraintSet_android_translationY) {
                    this.f۹۱۹۷x0 = a.getFloat(attr, this.f۹۱۹۷x0);
                } else if (attr == Ch.ConstraintSet_android_translationZ) {
                    this.f۹۱۹۶w0 = a.getFloat(attr, this.f۹۱۹۸y0);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public Ca generateDefaultLayoutParams() {
        return new Ca(-2, -2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new ConstraintLayout.Ca(p);
    }

    public Cc getConstraintSet() {
        if (this.f۹۱۸۵c == null) {
            this.f۹۱۸۵c = new Cc();
        }
        this.f۹۱۸۵c.m۱۰۹۷۱a(this);
        return this.f۹۱۸۵c;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
    }
}
