package android.support.v4.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: android.support.v4.widget.t, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ct {

    /* renamed from: a, reason: contains not printable characters */
    private static final ThreadLocal<Matrix> f۱۰۸۳۵a = new ThreadLocal<>();

    /* renamed from: b, reason: contains not printable characters */
    private static final ThreadLocal<RectF> f۱۰۸۳۶b = new ThreadLocal<>();

    /* renamed from: b, reason: contains not printable characters */
    static void m۱۱۳۰۸b(ViewGroup parent, View descendant, Rect rect) {
        Matrix m = f۱۰۸۳۵a.get();
        if (m == null) {
            m = new Matrix();
            f۱۰۸۳۵a.set(m);
        } else {
            m.reset();
        }
        m۱۱۳۰۷a(parent, descendant, m);
        RectF rectF = f۱۰۸۳۶b.get();
        if (rectF == null) {
            rectF = new RectF();
            f۱۰۸۳۶b.set(rectF);
        }
        rectF.set(rect);
        m.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۳۰۶a(ViewGroup parent, View descendant, Rect out) {
        out.set(0, 0, descendant.getWidth(), descendant.getHeight());
        m۱۱۳۰۸b(parent, descendant, out);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۱۳۰۷a(ViewParent target, View view, Matrix m) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != target) {
            View vp = (View) parent;
            m۱۱۳۰۷a(target, vp, m);
            m.preTranslate(-vp.getScrollX(), -vp.getScrollY());
        }
        m.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            m.preConcat(view.getMatrix());
        }
    }
}
