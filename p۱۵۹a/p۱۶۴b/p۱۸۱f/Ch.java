package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: a.b.f.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ch<T> extends Property<T, Float> {

    /* renamed from: a, reason: contains not printable characters */
    private final Property<T, PointF> f۸۵۴۳a;

    /* renamed from: b, reason: contains not printable characters */
    private final PathMeasure f۸۵۴۴b;

    /* renamed from: c, reason: contains not printable characters */
    private final float f۸۵۴۵c;

    /* renamed from: d, reason: contains not printable characters */
    private final float[] f۸۵۴۶d;

    /* renamed from: e, reason: contains not printable characters */
    private final PointF f۸۵۴۷e;

    /* renamed from: f, reason: contains not printable characters */
    private float f۸۵۴۸f;

    /* JADX WARN: Generic types in debug info not equals: a.b.f.h != android.support.transition.PathProperty<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ Float get(Object obj) {
        return get((Ch<T>) obj);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.f.h != android.support.transition.PathProperty<T> */
    Ch(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f۸۵۴۶d = new float[2];
        this.f۸۵۴۷e = new PointF();
        this.f۸۵۴۳a = property;
        this.f۸۵۴۴b = new PathMeasure(path, false);
        this.f۸۵۴۵c = this.f۸۵۴۴b.getLength();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Generic types in debug info not equals: a.b.f.h != android.support.transition.PathProperty<T> */
    @Override // android.util.Property
    public Float get(T object) {
        return Float.valueOf(this.f۸۵۴۸f);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.f.h != android.support.transition.PathProperty<T> */
    @Override // android.util.Property
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
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
