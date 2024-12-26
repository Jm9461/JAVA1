package a.b.f;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* access modifiers changed from: package-private */
public class h<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final Property<T, PointF> f۲۱۵a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f۲۱۶b;

    /* renamed from: c  reason: collision with root package name */
    private final float f۲۱۷c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f۲۱۸d = new float[2];

    /* renamed from: e  reason: collision with root package name */
    private final PointF f۲۱۹e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private float f۲۲۰f;

    h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f۲۱۵a = property;
        this.f۲۱۶b = new PathMeasure(path, false);
        this.f۲۱۷c = this.f۲۱۶b.getLength();
    }

    @Override // android.util.Property
    public Float get(T t) {
        return Float.valueOf(this.f۲۲۰f);
    }

    /* renamed from: a */
    public void set(T target, Float fraction) {
        this.f۲۲۰f = fraction.floatValue();
        this.f۲۱۶b.getPosTan(this.f۲۱۷c * fraction.floatValue(), this.f۲۱۸d, null);
        PointF pointF = this.f۲۱۹e;
        float[] fArr = this.f۲۱۸d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f۲۱۵a.set(target, pointF);
    }
}
