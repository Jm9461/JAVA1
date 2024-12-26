package b.h.a;

import android.view.animation.Interpolator;

public abstract class g implements Cloneable {

    /* renamed from: c  reason: collision with root package name */
    float f۲۵۴۶c;

    /* renamed from: d  reason: collision with root package name */
    private Interpolator f۲۵۴۷d = null;

    /* renamed from: e  reason: collision with root package name */
    boolean f۲۵۴۸e = false;

    public abstract void a(Object obj);

    public abstract Object c();

    @Override // java.lang.Object
    public abstract g clone();

    public static g a(float fraction, float value) {
        return new a(fraction, value);
    }

    public static g a(float fraction) {
        return new a(fraction);
    }

    public boolean d() {
        return this.f۲۵۴۸e;
    }

    public float a() {
        return this.f۲۵۴۶c;
    }

    public Interpolator b() {
        return this.f۲۵۴۷d;
    }

    public void a(Interpolator interpolator) {
        this.f۲۵۴۷d = interpolator;
    }

    static class a extends g {

        /* renamed from: f  reason: collision with root package name */
        float f۲۵۴۹f;

        a(float fraction, float value) {
            this.f۲۵۴۶c = fraction;
            this.f۲۵۴۹f = value;
            Class cls = Float.TYPE;
            this.f۲۵۴۸e = true;
        }

        a(float fraction) {
            this.f۲۵۴۶c = fraction;
            Class cls = Float.TYPE;
        }

        public float e() {
            return this.f۲۵۴۹f;
        }

        @Override // b.h.a.g
        public Object c() {
            return Float.valueOf(this.f۲۵۴۹f);
        }

        @Override // b.h.a.g
        public void a(Object value) {
            if (value != null && value.getClass() == Float.class) {
                this.f۲۵۴۹f = ((Float) value).floatValue();
                this.f۲۵۴۸e = true;
            }
        }

        @Override // b.h.a.g, b.h.a.g, java.lang.Object
        public a clone() {
            a kfClone = new a(a(), this.f۲۵۴۹f);
            kfClone.a(b());
            return kfClone;
        }
    }
}
