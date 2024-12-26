package b.e.a.a;

import android.view.View;
import android.view.animation.Interpolator;
import b.h.a.a;
import b.h.a.c;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private c f۲۴۵۶a = new c();

    /* renamed from: b  reason: collision with root package name */
    private long f۲۴۵۷b = 1000;

    /* access modifiers changed from: protected */
    public abstract void b(View view);

    public void a(View target) {
        c(target);
        b(target);
        c();
    }

    public void c(View target) {
        b.h.c.a.a(target, 1.0f);
        b.h.c.a.g(target, 1.0f);
        b.h.c.a.h(target, 1.0f);
        b.h.c.a.i(target, 0.0f);
        b.h.c.a.j(target, 0.0f);
        b.h.c.a.d(target, 0.0f);
        b.h.c.a.f(target, 0.0f);
        b.h.c.a.e(target, 0.0f);
        b.h.c.a.b(target, ((float) target.getMeasuredWidth()) / 2.0f);
        b.h.c.a.c(target, ((float) target.getMeasuredHeight()) / 2.0f);
    }

    public void c() {
        this.f۲۴۵۶a.a(this.f۲۴۵۷b);
        this.f۲۴۵۶a.b();
    }

    public a a(long duration) {
        this.f۲۴۵۷b = duration;
        return this;
    }

    public a b(long delay) {
        a().b(delay);
        return this;
    }

    public a a(a.AbstractC۰۰۵۲a l) {
        this.f۲۴۵۶a.a(l);
        return this;
    }

    public a a(Interpolator interpolator) {
        this.f۲۴۵۶a.a(interpolator);
        return this;
    }

    public long b() {
        return this.f۲۴۵۷b;
    }

    public c a() {
        return this.f۲۴۵۶a;
    }
}
