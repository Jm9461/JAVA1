package p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a;

import android.view.View;
import android.view.animation.Interpolator;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.Cc;
import p۰۵۲b.p۱۰۳h.p۱۰۶c.Ca;

/* renamed from: b.e.a.a.a  reason: invalid class name */
public abstract class AbstractCa {

    /* renamed from: a  reason: contains not printable characters */
    private Cc f۱۲۷۰۰a = new Cc();

    /* renamed from: b  reason: contains not printable characters */
    private long f۱۲۷۰۱b = 1000;

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۶۰۳۰b(View view);

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۰۲۷a(View target) {
        m۱۶۰۳۲c(target);
        m۱۶۰۳۰b(target);
        m۱۶۰۳۱c();
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۶۰۳۲c(View target) {
        Ca.m۱۶۳۶۰a(target, 1.0f);
        Ca.m۱۶۳۶۶g(target, 1.0f);
        Ca.m۱۶۳۶۷h(target, 1.0f);
        Ca.m۱۶۳۶۸i(target, 0.0f);
        Ca.m۱۶۳۶۹j(target, 0.0f);
        Ca.m۱۶۳۶۳d(target, 0.0f);
        Ca.m۱۶۳۶۵f(target, 0.0f);
        Ca.m۱۶۳۶۴e(target, 0.0f);
        Ca.m۱۶۳۶۱b(target, ((float) target.getMeasuredWidth()) / 2.0f);
        Ca.m۱۶۳۶۲c(target, ((float) target.getMeasuredHeight()) / 2.0f);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۶۰۳۱c() {
        this.f۱۲۷۰۰a.m۱۶۲۰۳a(this.f۱۲۷۰۱b);
        this.f۱۲۷۰۰a.m۱۶۲۰۸b();
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCa m۱۶۰۲۳a(long duration) {
        this.f۱۲۷۰۱b = duration;
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public AbstractCa m۱۶۰۲۹b(long delay) {
        m۱۶۰۲۶a().m۱۶۲۰۹b(delay);
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCa m۱۶۰۲۵a(AbstractCa.AbstractCa l) {
        this.f۱۲۷۰۰a.m۱۶۱۸۹a(l);
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCa m۱۶۰۲۴a(Interpolator interpolator) {
        this.f۱۲۷۰۰a.m۱۶۲۰۶a(interpolator);
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public long m۱۶۰۲۸b() {
        return this.f۱۲۷۰۱b;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۶۰۲۶a() {
        return this.f۱۲۷۰۰a;
    }
}
