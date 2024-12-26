package p۱۳۶d.p۱۳۷a.p۱۳۸a;

import android.annotation.TargetApi;
import android.view.View;
import java.lang.ref.WeakReference;
import p۱۳۶d.p۱۳۷a.p۱۳۸a.Ce;

/* renamed from: d.a.a.a  reason: invalid class name */
public interface AbstractCa {

    /* renamed from: b  reason: contains not printable characters */
    public static final Ce f۱۵۵۸۷b = new Ce();

    /* renamed from: a  reason: contains not printable characters */
    void m۱۸۴۵۶a();

    /* renamed from: a  reason: contains not printable characters */
    void m۱۸۴۵۷a(Cd dVar);

    /* renamed from: b  reason: contains not printable characters */
    void m۱۸۴۵۸b();

    float getRevealRadius();

    void setRevealRadius(float f);

    /* renamed from: d.a.a.a$d  reason: invalid class name */
    public static class Cd {

        /* renamed from: a  reason: contains not printable characters */
        public final int f۱۵۵۹۱a;

        /* renamed from: b  reason: contains not printable characters */
        public final int f۱۵۵۹۲b;

        /* renamed from: c  reason: contains not printable characters */
        public final WeakReference<View> f۱۵۵۹۳c;

        public Cd(int centerX, int centerY, float startRadius, float endRadius, WeakReference<View> target) {
            this.f۱۵۵۹۱a = centerX;
            this.f۱۵۵۹۲b = centerY;
            this.f۱۵۵۹۳c = target;
        }

        /* renamed from: a  reason: contains not printable characters */
        public View m۱۸۴۶۳a() {
            return this.f۱۵۵۹۳c.get();
        }
    }

    /* renamed from: d.a.a.a$a  reason: invalid class name */
    public static class Ca extends Ce.Ca {

        /* renamed from: a  reason: contains not printable characters */
        WeakReference<AbstractCa> f۱۵۵۸۸a;

        Ca(AbstractCa target) {
            this.f۱۵۵۸۸a = new WeakReference<>(target);
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۸۴۶۰c(p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa animation) {
            this.f۱۵۵۸۸a.get().m۱۸۴۵۸b();
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۴۵۹a(p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa animation) {
            this.f۱۵۵۸۸a.get().m۱۸۴۵۶a();
        }
    }

    @TargetApi(11)
    /* renamed from: d.a.a.a$b  reason: invalid class name */
    public static class Cb extends Ca {

        /* renamed from: b  reason: contains not printable characters */
        int f۱۵۵۸۹b = 1;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۵۵۹۰c;

        Cb(AbstractCa target) {
            super(target);
            this.f۱۵۵۹۰c = ((View) target).getLayerType();
        }

        @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCa.Ca, p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۸۴۶۲c(p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa animation) {
            ((View) this.f۱۵۵۸۸a.get()).setLayerType(this.f۱۵۵۸۹b, null);
            super.m۱۸۴۶۰c(animation);
        }

        @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCa.Ca, p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۴۶۱a(p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa animation) {
            ((View) this.f۱۵۵۸۸a.get()).setLayerType(this.f۱۵۵۹۰c, null);
            super.m۱۸۴۵۹a(animation);
        }
    }

    /* renamed from: d.a.a.a$c  reason: invalid class name */
    public static class Cc extends Cb {
        @TargetApi(11)
        Cc(AbstractCa target) {
            super(target);
            this.f۱۵۵۸۹b = 2;
        }
    }

    /* renamed from: d.a.a.a$e  reason: invalid class name */
    public static class Ce extends p۰۵۲b.p۱۰۳h.p۱۰۵b.AbstractCa<AbstractCa> {
        public Ce() {
            super("revealRadius");
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۴۶۷a(AbstractCa object, float value) {
            object.setRevealRadius(value);
        }

        /* renamed from: a  reason: contains not printable characters */
        public Float m۱۸۴۶۵a(AbstractCa object) {
            return Float.valueOf(object.getRevealRadius());
        }
    }
}
