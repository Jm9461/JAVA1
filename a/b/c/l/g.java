package a.b.c.l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f۳۲a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f۳۳b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f۳۴c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float fraction, Matrix startValue, Matrix endValue) {
        startValue.getValues(this.f۳۲a);
        endValue.getValues(this.f۳۳b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f۳۳b;
            float f2 = fArr[i];
            float[] fArr2 = this.f۳۲a;
            fArr[i] = fArr2[i] + (fraction * (f2 - fArr2[i]));
        }
        this.f۳۴c.setValues(this.f۳۳b);
        return this.f۳۴c;
    }
}
