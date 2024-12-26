package p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a;

import android.view.View;
import android.view.animation.Interpolator;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.Cc;
import p۲۰۸b.p۲۵۹h.p۲۶۲c.Ca;

/* renamed from: b.e.a.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCa {

    /* renamed from: b, reason: contains not printable characters */
    private long f۱۲۷۰۱b = 1000;

    /* renamed from: a, reason: contains not printable characters */
    private Cc f۱۲۷۰۰a = new Cc();

    /* renamed from: b, reason: contains not printable characters */
    protected abstract void mo۱۴۰۳۶b(View view);

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۹۵۶a(View target) {
        m۱۳۹۶۱c(target);
        mo۱۴۰۳۶b(target);
        m۱۳۹۶۰c();
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۳۹۶۱c(View target) {
        Ca.m۱۴۲۸۵a(target, 1.0f);
        Ca.m۱۴۲۹۱g(target, 1.0f);
        Ca.m۱۴۲۹۲h(target, 1.0f);
        Ca.m۱۴۲۹۳i(target, 0.0f);
        Ca.m۱۴۲۹۴j(target, 0.0f);
        Ca.m۱۴۲۸۸d(target, 0.0f);
        Ca.m۱۴۲۹۰f(target, 0.0f);
        Ca.m۱۴۲۸۹e(target, 0.0f);
        Ca.m۱۴۲۸۶b(target, target.getMeasuredWidth() / 2.0f);
        Ca.m۱۴۲۸۷c(target, target.getMeasuredHeight() / 2.0f);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۳۹۶۰c() {
        this.f۱۲۷۰۰a.mo۱۴۲۶۶a(this.f۱۲۷۰۱b);
        this.f۱۲۷۰۰a.mo۱۴۲۷۲b();
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCa m۱۳۹۵۲a(long duration) {
        this.f۱۲۷۰۱b = duration;
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public AbstractCa m۱۳۹۵۸b(long delay) {
        m۱۳۹۵۵a().m۱۴۱۳۹b(delay);
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCa m۱۳۹۵۴a(AbstractCa.a l) {
        this.f۱۲۷۰۰a.m۱۴۱۱۸a(l);
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCa m۱۳۹۵۳a(Interpolator interpolator) {
        this.f۱۲۷۰۰a.mo۱۴۲۶۸a(interpolator);
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public long m۱۳۹۵۷b() {
        return this.f۱۲۷۰۱b;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cc m۱۳۹۵۵a() {
        return this.f۱۲۷۰۰a;
    }
}
