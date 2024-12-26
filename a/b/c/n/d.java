package a.b.c.n;

import a.b.c.n.c;
import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.support.design.widget.q;
import android.util.Property;

public interface d extends c.a {
    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f۶۳a;

        /* renamed from: b  reason: collision with root package name */
        public float f۶۴b;

        /* renamed from: c  reason: collision with root package name */
        public float f۶۵c;

        private e() {
        }

        public e(float centerX, float centerY, float radius) {
            this.f۶۳a = centerX;
            this.f۶۴b = centerY;
            this.f۶۵c = radius;
        }

        public void a(float centerX, float centerY, float radius) {
            this.f۶۳a = centerX;
            this.f۶۴b = centerY;
            this.f۶۵c = radius;
        }
    }

    public static class c extends Property<d, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, e> f۶۱a = new c("circularReveal");

        private c(String name) {
            super(e.class, name);
        }

        /* renamed from: a */
        public e get(d object) {
            return object.getRevealInfo();
        }

        /* renamed from: a */
        public void set(d object, e value) {
            object.setRevealInfo(value);
        }
    }

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f۵۹b = new b();

        /* renamed from: a  reason: collision with root package name */
        private final e f۶۰a = new e();

        /* renamed from: a */
        public e evaluate(float fraction, e startValue, e endValue) {
            this.f۶۰a.a(q.a(startValue.f۶۳a, endValue.f۶۳a, fraction), q.a(startValue.f۶۴b, endValue.f۶۴b, fraction), q.a(startValue.f۶۵c, endValue.f۶۵c, fraction));
            return this.f۶۰a;
        }
    }

    /* renamed from: a.b.c.n.d$d  reason: collision with other inner class name */
    public static class C۰۰۰۳d extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f۶۲a = new C۰۰۰۳d("circularRevealScrimColor");

        private C۰۰۰۳d(String name) {
            super(Integer.class, name);
        }

        /* renamed from: a */
        public Integer get(d object) {
            return Integer.valueOf(object.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(d object, Integer value) {
            object.setCircularRevealScrimColor(value.intValue());
        }
    }
}
