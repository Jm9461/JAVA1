package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۶۸l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: a.b.c.l.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cg implements TypeEvaluator<Matrix> {

    /* renamed from: a, reason: contains not printable characters */
    private final float[] f۸۲۶۱a = new float[9];

    /* renamed from: b, reason: contains not printable characters */
    private final float[] f۸۲۶۲b = new float[9];

    /* renamed from: c, reason: contains not printable characters */
    private final Matrix f۸۲۶۳c = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Matrix evaluate(float fraction, Matrix startValue, Matrix endValue) {
        startValue.getValues(this.f۸۲۶۱a);
        endValue.getValues(this.f۸۲۶۲b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f۸۲۶۲b;
            float f2 = fArr[i];
            float[] fArr2 = this.f۸۲۶۱a;
            float diff = f2 - fArr2[i];
            fArr[i] = fArr2[i] + (fraction * diff);
        }
        this.f۸۲۶۳c.setValues(this.f۸۲۶۲b);
        return this.f۸۲۶۳c;
    }
}
