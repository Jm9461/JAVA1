package p۱۴۹f;

import java.util.concurrent.TimeUnit;

/* renamed from: f.i  reason: invalid class name */
public class Ci extends Ct {

    /* renamed from: e  reason: contains not printable characters */
    private Ct f۱۶۲۷۹e;

    public Ci(Ct delegate) {
        if (delegate != null) {
            this.f۱۶۲۷۹e = delegate;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: g  reason: contains not printable characters */
    public final Ct m۱۹۴۶۸g() {
        return this.f۱۶۲۷۹e;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final Ci m۱۹۴۶۰a(Ct delegate) {
        if (delegate != null) {
            this.f۱۶۲۷۹e = delegate;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // p۱۴۹f.Ct
    /* renamed from: a  reason: contains not printable characters */
    public Ct m۱۹۴۶۳a(long timeout, TimeUnit unit) {
        return this.f۱۶۲۷۹e.m۱۹۵۵۸a(timeout, unit);
    }

    @Override // p۱۴۹f.Ct
    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۹۴۶۶d() {
        return this.f۱۶۲۷۹e.m۱۹۵۶۱d();
    }

    @Override // p۱۴۹f.Ct
    /* renamed from: c  reason: contains not printable characters */
    public long m۱۹۴۶۵c() {
        return this.f۱۶۲۷۹e.m۱۹۵۶۰c();
    }

    @Override // p۱۴۹f.Ct
    /* renamed from: a  reason: contains not printable characters */
    public Ct m۱۹۴۶۲a(long deadlineNanoTime) {
        return this.f۱۶۲۷۹e.m۱۹۵۵۷a(deadlineNanoTime);
    }

    @Override // p۱۴۹f.Ct
    /* renamed from: b  reason: contains not printable characters */
    public Ct m۱۹۴۶۴b() {
        return this.f۱۶۲۷۹e.m۱۹۵۵۹b();
    }

    @Override // p۱۴۹f.Ct
    /* renamed from: a  reason: contains not printable characters */
    public Ct m۱۹۴۶۱a() {
        return this.f۱۶۲۷۹e.m۱۹۵۵۶a();
    }

    @Override // p۱۴۹f.Ct
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۹۴۶۷e() {
        this.f۱۶۲۷۹e.m۱۹۵۶۲e();
    }
}
