package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.support.design.widget.Cq;
import android.util.Property;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.Cc;

/* renamed from: a.b.c.n.d  reason: invalid class name */
public interface AbstractCd extends Cc.AbstractCa {
    /* renamed from: a  reason: contains not printable characters */
    void m۱۰۰۱۳a();

    /* renamed from: b  reason: contains not printable characters */
    void m۱۰۰۱۴b();

    int getCircularRevealScrimColor();

    Ce getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(Ce eVar);

    /* renamed from: a.b.c.n.d$e  reason: invalid class name */
    public static class Ce {

        /* renamed from: a  reason: contains not printable characters */
        public float f۸۳۱۱a;

        /* renamed from: b  reason: contains not printable characters */
        public float f۸۳۱۲b;

        /* renamed from: c  reason: contains not printable characters */
        public float f۸۳۱۳c;

        private Ce() {
        }

        public Ce(float centerX, float centerY, float radius) {
            this.f۸۳۱۱a = centerX;
            this.f۸۳۱۲b = centerY;
            this.f۸۳۱۳c = radius;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۰۲۰a(float centerX, float centerY, float radius) {
            this.f۸۳۱۱a = centerX;
            this.f۸۳۱۲b = centerY;
            this.f۸۳۱۳c = radius;
        }
    }

    /* renamed from: a.b.c.n.d$c  reason: invalid class name */
    public static class Cc extends Property<AbstractCd, Ce> {

        /* renamed from: a  reason: contains not printable characters */
        public static final Property<AbstractCd, Ce> f۸۳۰۹a = new Cc("circularReveal");

        private Cc(String name) {
            super(Ce.class, name);
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ce get(AbstractCd object) {
            return object.getRevealInfo();
        }

        /* renamed from: a  reason: contains not printable characters */
        public void set(AbstractCd object, Ce value) {
            object.setRevealInfo(value);
        }
    }

    /* renamed from: a.b.c.n.d$b  reason: invalid class name */
    public static class Cb implements TypeEvaluator<Ce> {

        /* renamed from: b  reason: contains not printable characters */
        public static final TypeEvaluator<Ce> f۸۳۰۷b = new Cb();

        /* renamed from: a  reason: contains not printable characters */
        private final Ce f۸۳۰۸a = new Ce();

        /* renamed from: a  reason: contains not printable characters */
        public Ce evaluate(float fraction, Ce startValue, Ce endValue) {
            this.f۸۳۰۸a.m۱۰۰۲۰a(Cq.m۱۱۹۹۸a(startValue.f۸۳۱۱a, endValue.f۸۳۱۱a, fraction), Cq.m۱۱۹۹۸a(startValue.f۸۳۱۲b, endValue.f۸۳۱۲b, fraction), Cq.m۱۱۹۹۸a(startValue.f۸۳۱۳c, endValue.f۸۳۱۳c, fraction));
            return this.f۸۳۰۸a;
        }
    }

    /* renamed from: a.b.c.n.d$d  reason: invalid class name */
    public static class Cd extends Property<AbstractCd, Integer> {

        /* renamed from: a  reason: contains not printable characters */
        public static final Property<AbstractCd, Integer> f۸۳۱۰a = new Cd("circularRevealScrimColor");

        private Cd(String name) {
            super(Integer.class, name);
        }

        /* renamed from: a  reason: contains not printable characters */
        public Integer get(AbstractCd object) {
            return Integer.valueOf(object.getCircularRevealScrimColor());
        }

        /* renamed from: a  reason: contains not printable characters */
        public void set(AbstractCd object, Integer value) {
            object.setCircularRevealScrimColor(value.intValue());
        }
    }
}
