package p۰۵۲b.p۱۰۳h.p۱۰۴a;

import android.view.animation.Interpolator;

/* renamed from: b.h.a.g  reason: invalid class name */
public abstract class AbstractCg implements Cloneable {

    /* renamed from: c  reason: contains not printable characters */
    float f۱۲۸۹۳c;

    /* renamed from: d  reason: contains not printable characters */
    private Interpolator f۱۲۸۹۴d = null;

    /* renamed from: e  reason: contains not printable characters */
    boolean f۱۲۸۹۵e = false;

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۶۲۲۸a(Object obj);

    /* renamed from: c  reason: contains not printable characters */
    public abstract Object m۱۶۲۳۰c();

    @Override // java.lang.Object
    public abstract AbstractCg clone();

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCg m۱۶۲۲۵a(float fraction, float value) {
        return new Ca(fraction, value);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCg m۱۶۲۲۴a(float fraction) {
        return new Ca(fraction);
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۶۲۳۱d() {
        return this.f۱۲۸۹۵e;
    }

    /* renamed from: a  reason: contains not printable characters */
    public float m۱۶۲۲۶a() {
        return this.f۱۲۸۹۳c;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Interpolator m۱۶۲۲۹b() {
        return this.f۱۲۸۹۴d;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۲۲۷a(Interpolator interpolator) {
        this.f۱۲۸۹۴d = interpolator;
    }

    /* renamed from: b.h.a.g$a  reason: invalid class name */
    static class Ca extends AbstractCg {

        /* renamed from: f  reason: contains not printable characters */
        float f۱۲۸۹۶f;

        Ca(float fraction, float value) {
            this.f۱۲۸۹۳c = fraction;
            this.f۱۲۸۹۶f = value;
            Class cls = Float.TYPE;
            this.f۱۲۸۹۵e = true;
        }

        Ca(float fraction) {
            this.f۱۲۸۹۳c = fraction;
            Class cls = Float.TYPE;
        }

        /* renamed from: e  reason: contains not printable characters */
        public float m۱۶۲۳۴e() {
            return this.f۱۲۸۹۶f;
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCg
        /* renamed from: c  reason: contains not printable characters */
        public Object m۱۶۲۳۳c() {
            return Float.valueOf(this.f۱۲۸۹۶f);
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCg
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۲۳۲a(Object value) {
            if (value != null && value.getClass() == Float.class) {
                this.f۱۲۸۹۶f = ((Float) value).floatValue();
                this.f۱۲۸۹۵e = true;
            }
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCg, p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCg, java.lang.Object
        public Ca clone() {
            Ca kfClone = new Ca(m۱۶۲۲۶a(), this.f۱۲۸۹۶f);
            kfClone.m۱۶۲۲۷a(m۱۶۲۲۹b());
            return kfClone;
        }
    }
}
