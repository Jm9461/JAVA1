package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.support.design.widget.Cq;
import android.util.Property;
import p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.Cc;

/* renamed from: a.b.c.n.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public interface InterfaceCd extends Cc.a {
    /* renamed from: a, reason: contains not printable characters */
    void mo۷۹۵۴a();

    /* renamed from: b, reason: contains not printable characters */
    void mo۷۹۵۵b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);

    /* renamed from: a.b.c.n.d$e */
    public static class e {

        /* renamed from: a, reason: contains not printable characters */
        public float f۸۳۱۱a;

        /* renamed from: b, reason: contains not printable characters */
        public float f۸۳۱۲b;

        /* renamed from: c, reason: contains not printable characters */
        public float f۸۳۱۳c;

        private e() {
        }

        public e(float centerX, float centerY, float radius) {
            this.f۸۳۱۱a = centerX;
            this.f۸۳۱۲b = centerY;
            this.f۸۳۱۳c = radius;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۷۹۵۳a(float centerX, float centerY, float radius) {
            this.f۸۳۱۱a = centerX;
            this.f۸۳۱۲b = centerY;
            this.f۸۳۱۳c = radius;
        }
    }

    /* renamed from: a.b.c.n.d$c */
    public static class c extends Property<InterfaceCd, e> {

        /* renamed from: a, reason: contains not printable characters */
        public static final Property<InterfaceCd, e> f۸۳۰۹a = new c("circularReveal");

        private c(String name) {
            super(e.class, name);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public e get(InterfaceCd object) {
            return object.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(InterfaceCd object, e value) {
            object.setRevealInfo(value);
        }
    }

    /* renamed from: a.b.c.n.d$b */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b, reason: contains not printable characters */
        public static final TypeEvaluator<e> f۸۳۰۷b = new b();

        /* renamed from: a, reason: contains not printable characters */
        private final e f۸۳۰۸a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public e evaluate(float fraction, e startValue, e endValue) {
            this.f۸۳۰۸a.m۷۹۵۳a(Cq.m۹۹۲۸a(startValue.f۸۳۱۱a, endValue.f۸۳۱۱a, fraction), Cq.m۹۹۲۸a(startValue.f۸۳۱۲b, endValue.f۸۳۱۲b, fraction), Cq.m۹۹۲۸a(startValue.f۸۳۱۳c, endValue.f۸۳۱۳c, fraction));
            return this.f۸۳۰۸a;
        }
    }

    /* renamed from: a.b.c.n.d$d */
    public static class d extends Property<InterfaceCd, Integer> {

        /* renamed from: a, reason: contains not printable characters */
        public static final Property<InterfaceCd, Integer> f۸۳۱۰a = new d("circularRevealScrimColor");

        private d(String name) {
            super(Integer.class, name);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Integer get(InterfaceCd object) {
            return Integer.valueOf(object.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(InterfaceCd object, Integer value) {
            object.setCircularRevealScrimColor(value.intValue());
        }
    }
}
