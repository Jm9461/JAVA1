package android.support.v4.view.p۲۰۴e0;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.e0.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
abstract class AbstractInterpolatorCd implements Interpolator {

    /* renamed from: a, reason: contains not printable characters */
    private final float[] f۱۰۶۰۸a;

    /* renamed from: b, reason: contains not printable characters */
    private final float f۱۰۶۰۹b;

    protected AbstractInterpolatorCd(float[] values) {
        this.f۱۰۶۰۸a = values;
        this.f۱۰۶۰۹b = 1.0f / (this.f۱۰۶۰۸a.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        if (input >= 1.0f) {
            return 1.0f;
        }
        if (input <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f۱۰۶۰۸a;
        int position = Math.min((int) ((fArr.length - 1) * input), fArr.length - 2);
        float f2 = this.f۱۰۶۰۹b;
        float quantized = position * f2;
        float diff = input - quantized;
        float weight = diff / f2;
        float[] fArr2 = this.f۱۰۶۰۸a;
        return fArr2[position] + ((fArr2[position + 1] - fArr2[position]) * weight);
    }
}
