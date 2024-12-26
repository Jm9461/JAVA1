package android.support.p۰۴۳v4.view.p۰۴۶e0;

import android.view.animation.Interpolator;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.view.e0.d  reason: invalid class name */
public abstract class AbstractanimationInterpolatorCd implements Interpolator {

    /* renamed from: a  reason: contains not printable characters */
    private final float[] f۱۰۶۰۸a;

    /* renamed from: b  reason: contains not printable characters */
    private final float f۱۰۶۰۹b = (1.0f / ((float) (this.f۱۰۶۰۸a.length - 1)));

    protected AbstractanimationInterpolatorCd(float[] values) {
        this.f۱۰۶۰۸a = values;
    }

    public float getInterpolation(float input) {
        if (input >= 1.0f) {
            return 1.0f;
        }
        if (input <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f۱۰۶۰۸a;
        int position = Math.min((int) (((float) (fArr.length - 1)) * input), fArr.length - 2);
        float f = this.f۱۰۶۰۹b;
        float[] fArr2 = this.f۱۰۶۰۸a;
        return fArr2[position] + ((fArr2[position + 1] - fArr2[position]) * ((input - (((float) position) * f)) / f));
    }
}
