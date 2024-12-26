package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* access modifiers changed from: package-private */
/* renamed from: a.b.f.h  reason: invalid class name */
public class Ch<T> extends Property<T, Float> {

    /* renamed from: a  reason: contains not printable characters */
    private final Property<T, PointF> f۸۵۴۳a;

    /* renamed from: b  reason: contains not printable characters */
    private final PathMeasure f۸۵۴۴b;

    /* renamed from: c  reason: contains not printable characters */
    private final float f۸۵۴۵c;

    /* renamed from: d  reason: contains not printable characters */
    private final float[] f۸۵۴۶d = new float[2];

    /* renamed from: e  reason: contains not printable characters */
    private final PointF f۸۵۴۷e = new PointF();

    /* renamed from: f  reason: contains not printable characters */
    private float f۸۵۴۸f;

    Ch(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f۸۵۴۳a = property;
        this.f۸۵۴۴b = new PathMeasure(path, false);
        this.f۸۵۴۵c = this.f۸۵۴۴b.getLength();
    }

    @Override // android.util.Property
    public Float get(T t) {
        return Float.valueOf(this.f۸۵۴۸f);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void set(T target, Float fraction) {
        this.f۸۵۴۸f = fraction.floatValue();
        this.f۸۵۴۴b.getPosTan(this.f۸۵۴۵c * fraction.floatValue(), this.f۸۵۴۶d, null);
        PointF pointF = this.f۸۵۴۷e;
        float[] fArr = this.f۸۵۴۶d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f۸۵۴۳a.set(target, pointF);
    }
}
