package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: a.b.f.k, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ck implements TypeEvaluator<Rect> {

    /* renamed from: a, reason: contains not printable characters */
    private Rect f۸۵۶۶a;

    Ck() {
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Rect evaluate(float fraction, Rect startValue, Rect endValue) {
        int left = startValue.left + ((int) ((endValue.left - r0) * fraction));
        int top = startValue.top + ((int) ((endValue.top - r1) * fraction));
        int right = startValue.right + ((int) ((endValue.right - r2) * fraction));
        int bottom = startValue.bottom + ((int) ((endValue.bottom - r3) * fraction));
        Rect rect = this.f۸۵۶۶a;
        if (rect == null) {
            return new Rect(left, top, right, bottom);
        }
        rect.set(left, top, right, bottom);
        return this.f۸۵۶۶a;
    }
}
