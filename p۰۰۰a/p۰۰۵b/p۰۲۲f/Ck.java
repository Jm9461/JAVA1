package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: a.b.f.k  reason: invalid class name */
class Ck implements TypeEvaluator<Rect> {

    /* renamed from: a  reason: contains not printable characters */
    private Rect f۸۵۶۶a;

    Ck() {
    }

    /* renamed from: a  reason: contains not printable characters */
    public Rect evaluate(float fraction, Rect startValue, Rect endValue) {
        int i = startValue.left;
        int left = i + ((int) (((float) (endValue.left - i)) * fraction));
        int i2 = startValue.top;
        int top = i2 + ((int) (((float) (endValue.top - i2)) * fraction));
        int i3 = startValue.right;
        int right = i3 + ((int) (((float) (endValue.right - i3)) * fraction));
        int i4 = startValue.bottom;
        int bottom = i4 + ((int) (((float) (endValue.bottom - i4)) * fraction));
        Rect rect = this.f۸۵۶۶a;
        if (rect == null) {
            return new Rect(left, top, right, bottom);
        }
        rect.set(left, top, right, bottom);
        return this.f۸۵۶۶a;
    }
}
