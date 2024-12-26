package android.support.design.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: android.support.design.widget.j  reason: invalid class name */
public class Cj {

    /* renamed from: a  reason: contains not printable characters */
    private static final ThreadLocal<Matrix> f۹۹۲۸a = new ThreadLocal<>();

    /* renamed from: b  reason: contains not printable characters */
    private static final ThreadLocal<RectF> f۹۹۲۹b = new ThreadLocal<>();

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۱۸۶۶b(ViewGroup parent, View descendant, Rect rect) {
        Matrix m = f۹۹۲۸a.get();
        if (m == null) {
            m = new Matrix();
            f۹۹۲۸a.set(m);
        } else {
            m.reset();
        }
        m۱۱۸۶۵a(parent, descendant, m);
        RectF rectF = f۹۹۲۹b.get();
        if (rectF == null) {
            rectF = new RectF();
            f۹۹۲۹b.set(rectF);
        }
        rectF.set(rect);
        m.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۱۸۶۴a(ViewGroup parent, View descendant, Rect out) {
        out.set(0, 0, descendant.getWidth(), descendant.getHeight());
        m۱۱۸۶۶b(parent, descendant, out);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۱۸۶۵a(ViewParent target, View view, Matrix m) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != target) {
            View vp = (View) parent;
            m۱۱۸۶۵a(target, vp, m);
            m.preTranslate((float) (-vp.getScrollX()), (float) (-vp.getScrollY()));
        }
        m.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            m.preConcat(view.getMatrix());
        }
    }
}
