package p۳۰۵f;

import java.util.concurrent.TimeUnit;

/* renamed from: f.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ci extends Ct {

    /* renamed from: e, reason: contains not printable characters */
    private Ct f۱۶۲۷۹e;

    public Ci(Ct delegate) {
        if (delegate == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f۱۶۲۷۹e = delegate;
    }

    /* renamed from: g, reason: contains not printable characters */
    public final Ct m۱۷۳۹۱g() {
        return this.f۱۶۲۷۹e;
    }

    /* renamed from: a, reason: contains not printable characters */
    public final Ci m۱۷۳۸۳a(Ct delegate) {
        if (delegate == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f۱۶۲۷۹e = delegate;
        return this;
    }

    @Override // p۳۰۵f.Ct
    /* renamed from: a, reason: contains not printable characters */
    public Ct mo۱۷۴۸۸a(long timeout, TimeUnit unit) {
        return this.f۱۶۲۷۹e.mo۱۷۴۸۸a(timeout, unit);
    }

    @Override // p۳۰۵f.Ct
    /* renamed from: d, reason: contains not printable characters */
    public boolean mo۱۷۴۸۴d() {
        return this.f۱۶۲۷۹e.mo۱۷۴۸۴d();
    }

    @Override // p۳۰۵f.Ct
    /* renamed from: c, reason: contains not printable characters */
    public long mo۱۷۴۸۳c() {
        return this.f۱۶۲۷۹e.mo۱۷۴۸۳c();
    }

    @Override // p۳۰۵f.Ct
    /* renamed from: a, reason: contains not printable characters */
    public Ct mo۱۷۴۸۷a(long deadlineNanoTime) {
        return this.f۱۶۲۷۹e.mo۱۷۴۸۷a(deadlineNanoTime);
    }

    @Override // p۳۰۵f.Ct
    /* renamed from: b, reason: contains not printable characters */
    public Ct mo۱۷۴۸۲b() {
        return this.f۱۶۲۷۹e.mo۱۷۴۸۲b();
    }

    @Override // p۳۰۵f.Ct
    /* renamed from: a, reason: contains not printable characters */
    public Ct mo۱۷۴۷۹a() {
        return this.f۱۶۲۷۹e.mo۱۷۴۷۹a();
    }

    @Override // p۳۰۵f.Ct
    /* renamed from: e, reason: contains not printable characters */
    public void mo۱۷۴۸۹e() {
        this.f۱۶۲۷۹e.mo۱۷۴۸۹e();
    }
}
