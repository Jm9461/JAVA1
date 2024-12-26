package d.a.a;

import android.annotation.TargetApi;
import android.view.View;
import d.a.a.e;
import java.lang.ref.WeakReference;

public interface a {

    /* renamed from: b  reason: collision with root package name */
    public static final e f۳۶۵۲b = new e();

    void a();

    void a(d dVar);

    void b();

    float getRevealRadius();

    void setRevealRadius(float f2);

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f۳۶۵۶a;

        /* renamed from: b  reason: collision with root package name */
        public final int f۳۶۵۷b;

        /* renamed from: c  reason: collision with root package name */
        public final WeakReference<View> f۳۶۵۸c;

        public d(int centerX, int centerY, float startRadius, float endRadius, WeakReference<View> target) {
            this.f۳۶۵۶a = centerX;
            this.f۳۶۵۷b = centerY;
            this.f۳۶۵۸c = target;
        }

        public View a() {
            return this.f۳۶۵۸c.get();
        }
    }

    /* renamed from: d.a.a.a$a  reason: collision with other inner class name */
    public static class C۰۱۱۵a extends e.a {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<a> f۳۶۵۳a;

        C۰۱۱۵a(a target) {
            this.f۳۶۵۳a = new WeakReference<>(target);
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void c(b.h.a.a animation) {
            this.f۳۶۵۳a.get().b();
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void a(b.h.a.a animation) {
            this.f۳۶۵۳a.get().a();
        }
    }

    @TargetApi(11)
    public static class b extends C۰۱۱۵a {

        /* renamed from: b  reason: collision with root package name */
        int f۳۶۵۴b = 1;

        /* renamed from: c  reason: collision with root package name */
        int f۳۶۵۵c;

        b(a target) {
            super(target);
            this.f۳۶۵۵c = ((View) target).getLayerType();
        }

        @Override // d.a.a.a.C۰۱۱۵a, b.h.a.a.AbstractC۰۰۵۲a
        public void c(b.h.a.a animation) {
            ((View) this.f۳۶۵۳a.get()).setLayerType(this.f۳۶۵۴b, null);
            super.c(animation);
        }

        @Override // d.a.a.a.C۰۱۱۵a, b.h.a.a.AbstractC۰۰۵۲a
        public void a(b.h.a.a animation) {
            ((View) this.f۳۶۵۳a.get()).setLayerType(this.f۳۶۵۵c, null);
            super.a(animation);
        }
    }

    public static class c extends b {
        @TargetApi(11)
        c(a target) {
            super(target);
            this.f۳۶۵۴b = 2;
        }
    }

    public static class e extends b.h.b.a<a> {
        public e() {
            super("revealRadius");
        }

        public void a(a object, float value) {
            object.setRevealRadius(value);
        }

        public Float a(a object) {
            return Float.valueOf(object.getRevealRadius());
        }
    }
}
