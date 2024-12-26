package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: a.b.f.h0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ch0 {
    Ch0() {
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۲۰۱a(View view, float alpha) {
        Float savedAlpha = (Float) view.getTag(Cj.save_non_transition_alpha);
        if (savedAlpha != null) {
            view.setAlpha(savedAlpha.floatValue() * alpha);
        } else {
            view.setAlpha(alpha);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public float mo۸۲۰۴b(View view) {
        Float savedAlpha = (Float) view.getTag(Cj.save_non_transition_alpha);
        if (savedAlpha != null) {
            return view.getAlpha() / savedAlpha.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: c, reason: contains not printable characters */
    public void mo۸۲۰۶c(View view) {
        if (view.getTag(Cj.save_non_transition_alpha) == null) {
            view.setTag(Cj.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۲۰۰a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(Cj.save_non_transition_alpha, null);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۲۰۳a(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            View vp = (View) parent;
            mo۸۲۰۳a(vp, matrix);
            matrix.preTranslate(-vp.getScrollX(), -vp.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix vm = view.getMatrix();
        if (!vm.isIdentity()) {
            matrix.preConcat(vm);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void mo۸۲۰۵b(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            View vp = (View) parent;
            mo۸۲۰۵b(vp, matrix);
            matrix.postTranslate(vp.getScrollX(), vp.getScrollY());
        }
        matrix.postTranslate(view.getLeft(), view.getTop());
        Matrix vm = view.getMatrix();
        if (!vm.isIdentity()) {
            Matrix inverted = new Matrix();
            if (vm.invert(inverted)) {
                matrix.postConcat(inverted);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۲۰۲a(View v, int left, int top, int right, int bottom) {
        v.setLeft(left);
        v.setTop(top);
        v.setRight(right);
        v.setBottom(bottom);
    }
}
