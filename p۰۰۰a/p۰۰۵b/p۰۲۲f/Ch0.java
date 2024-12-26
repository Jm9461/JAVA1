package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* access modifiers changed from: package-private */
/* renamed from: a.b.f.h0  reason: invalid class name */
public class Ch0 {
    Ch0() {
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۶۸a(View view, float alpha) {
        Float savedAlpha = (Float) view.getTag(Cj.save_non_transition_alpha);
        if (savedAlpha != null) {
            view.setAlpha(savedAlpha.floatValue() * alpha);
        } else {
            view.setAlpha(alpha);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public float m۱۰۲۷۱b(View view) {
        Float savedAlpha = (Float) view.getTag(Cj.save_non_transition_alpha);
        if (savedAlpha != null) {
            return view.getAlpha() / savedAlpha.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۲۷۳c(View view) {
        if (view.getTag(Cj.save_non_transition_alpha) == null) {
            view.setTag(Cj.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۶۷a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(Cj.save_non_transition_alpha, null);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۷۰a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View vp = (View) parent;
            m۱۰۲۷۰a(vp, matrix);
            matrix.preTranslate((float) (-vp.getScrollX()), (float) (-vp.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix vm = view.getMatrix();
        if (!vm.isIdentity()) {
            matrix.preConcat(vm);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۲۷۲b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View vp = (View) parent;
            m۱۰۲۷۲b(vp, matrix);
            matrix.postTranslate((float) vp.getScrollX(), (float) vp.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix vm = view.getMatrix();
        if (!vm.isIdentity()) {
            Matrix inverted = new Matrix();
            if (vm.invert(inverted)) {
                matrix.postConcat(inverted);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۲۶۹a(View v, int left, int top, int right, int bottom) {
        v.setLeft(left);
        v.setTop(top);
        v.setRight(right);
        v.setBottom(bottom);
    }
}
