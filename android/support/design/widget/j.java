package android.support.design.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Matrix> f۹۵۲a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<RectF> f۹۵۳b = new ThreadLocal<>();

    public static void b(ViewGroup parent, View descendant, Rect rect) {
        Matrix m = f۹۵۲a.get();
        if (m == null) {
            m = new Matrix();
            f۹۵۲a.set(m);
        } else {
            m.reset();
        }
        a(parent, descendant, m);
        RectF rectF = f۹۵۳b.get();
        if (rectF == null) {
            rectF = new RectF();
            f۹۵۳b.set(rectF);
        }
        rectF.set(rect);
        m.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public static void a(ViewGroup parent, View descendant, Rect out) {
        out.set(0, 0, descendant.getWidth(), descendant.getHeight());
        b(parent, descendant, out);
    }

    private static void a(ViewParent target, View view, Matrix m) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != target) {
            View vp = (View) parent;
            a(target, vp, m);
            m.preTranslate((float) (-vp.getScrollX()), (float) (-vp.getScrollY()));
        }
        m.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            m.preConcat(view.getMatrix());
        }
    }
}
