package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: a.b.c.l.g  reason: invalid class name */
public class Cg implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: contains not printable characters */
    private final float[] f۸۲۶۱a = new float[9];

    /* renamed from: b  reason: contains not printable characters */
    private final float[] f۸۲۶۲b = new float[9];

    /* renamed from: c  reason: contains not printable characters */
    private final Matrix f۸۲۶۳c = new Matrix();

    /* renamed from: a  reason: contains not printable characters */
    public Matrix evaluate(float fraction, Matrix startValue, Matrix endValue) {
        startValue.getValues(this.f۸۲۶۱a);
        endValue.getValues(this.f۸۲۶۲b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f۸۲۶۲b;
            float f = fArr[i];
            float[] fArr2 = this.f۸۲۶۱a;
            fArr[i] = fArr2[i] + (fraction * (f - fArr2[i]));
        }
        this.f۸۲۶۳c.setValues(this.f۸۲۶۲b);
        return this.f۸۲۶۳c;
    }
}
