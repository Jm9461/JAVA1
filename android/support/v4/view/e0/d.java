package android.support.v4.view.e0;

import android.view.animation.Interpolator;

/* access modifiers changed from: package-private */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f۱۳۵۴a;

    /* renamed from: b  reason: collision with root package name */
    private final float f۱۳۵۵b = (1.0f / ((float) (this.f۱۳۵۴a.length - 1)));

    protected d(float[] values) {
        this.f۱۳۵۴a = values;
    }

    public float getInterpolation(float input) {
        if (input >= 1.0f) {
            return 1.0f;
        }
        if (input <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f۱۳۵۴a;
        int position = Math.min((int) (((float) (fArr.length - 1)) * input), fArr.length - 2);
        float f2 = this.f۱۳۵۵b;
        float[] fArr2 = this.f۱۳۵۴a;
        return fArr2[position] + ((fArr2[position + 1] - fArr2[position]) * ((input - (((float) position) * f2)) / f2));
    }
}
