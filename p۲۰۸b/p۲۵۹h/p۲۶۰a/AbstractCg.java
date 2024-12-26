package p۲۰۸b.p۲۵۹h.p۲۶۰a;

import android.view.animation.Interpolator;

/* renamed from: b.h.a.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCg implements Cloneable {

    /* renamed from: c, reason: contains not printable characters */
    float f۱۲۸۹۳c;

    /* renamed from: d, reason: contains not printable characters */
    private Interpolator f۱۲۸۹۴d = null;

    /* renamed from: e, reason: contains not printable characters */
    boolean f۱۲۸۹۵e = false;

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۴۱۶۶a(Object obj);

    /* renamed from: c, reason: contains not printable characters */
    public abstract Object mo۱۴۱۶۷c();

    @Override // 
    /* renamed from: clone */
    public abstract AbstractCg mo۱۴۱۶۸clone();

    /* renamed from: a, reason: contains not printable characters */
    public static AbstractCg m۱۴۱۵۸a(float fraction, float value) {
        return new a(fraction, value);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static AbstractCg m۱۴۱۵۷a(float fraction) {
        return new a(fraction);
    }

    /* renamed from: d, reason: contains not printable characters */
    public boolean m۱۴۱۶۴d() {
        return this.f۱۲۸۹۵e;
    }

    /* renamed from: a, reason: contains not printable characters */
    public float m۱۴۱۵۹a() {
        return this.f۱۲۸۹۳c;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Interpolator m۱۴۱۶۲b() {
        return this.f۱۲۸۹۴d;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۱۶۰a(Interpolator interpolator) {
        this.f۱۲۸۹۴d = interpolator;
    }

    /* renamed from: b.h.a.g$a */
    static class a extends AbstractCg {

        /* renamed from: f, reason: contains not printable characters */
        float f۱۲۸۹۶f;

        a(float fraction, float value) {
            this.f۱۲۸۹۳c = fraction;
            this.f۱۲۸۹۶f = value;
            Class cls = Float.TYPE;
            this.f۱۲۸۹۵e = true;
        }

        a(float fraction) {
            this.f۱۲۸۹۳c = fraction;
            Class cls = Float.TYPE;
        }

        /* renamed from: e, reason: contains not printable characters */
        public float m۱۴۱۶۹e() {
            return this.f۱۲۸۹۶f;
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCg
        /* renamed from: c, reason: contains not printable characters */
        public Object mo۱۴۱۶۷c() {
            return Float.valueOf(this.f۱۲۸۹۶f);
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCg
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۴۱۶۶a(Object value) {
            if (value != null && value.getClass() == Float.class) {
                this.f۱۲۸۹۶f = ((Float) value).floatValue();
                this.f۱۲۸۹۵e = true;
            }
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCg
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public a mo۱۴۱۶۸clone() {
            a kfClone = new a(m۱۴۱۵۹a(), this.f۱۲۸۹۶f);
            kfClone.m۱۴۱۶۰a(m۱۴۱۶۲b());
            return kfClone;
        }
    }
}
