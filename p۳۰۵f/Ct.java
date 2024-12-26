package p۳۰۵f;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: f.t, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ct {

    /* renamed from: d, reason: contains not printable characters */
    public static final Ct f۱۶۳۱۳d = new a();

    /* renamed from: a, reason: contains not printable characters */
    private boolean f۱۶۳۱۴a;

    /* renamed from: b, reason: contains not printable characters */
    private long f۱۶۳۱۵b;

    /* renamed from: c, reason: contains not printable characters */
    private long f۱۶۳۱۶c;

    /* renamed from: f.t$a */
    final class a extends Ct {
        a() {
        }

        @Override // p۳۰۵f.Ct
        /* renamed from: a, reason: contains not printable characters */
        public Ct mo۱۷۴۸۸a(long timeout, TimeUnit unit) {
            return this;
        }

        @Override // p۳۰۵f.Ct
        /* renamed from: a, reason: contains not printable characters */
        public Ct mo۱۷۴۸۷a(long deadlineNanoTime) {
            return this;
        }

        @Override // p۳۰۵f.Ct
        /* renamed from: e, reason: contains not printable characters */
        public void mo۱۷۴۸۹e() {
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ct mo۱۷۴۸۸a(long timeout, TimeUnit unit) {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout < 0: " + timeout);
        }
        if (unit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f۱۶۳۱۶c = unit.toNanos(timeout);
        return this;
    }

    /* renamed from: f, reason: contains not printable characters */
    public long m۱۷۴۸۶f() {
        return this.f۱۶۳۱۶c;
    }

    /* renamed from: d, reason: contains not printable characters */
    public boolean mo۱۷۴۸۴d() {
        return this.f۱۶۳۱۴a;
    }

    /* renamed from: c, reason: contains not printable characters */
    public long mo۱۷۴۸۳c() {
        if (!this.f۱۶۳۱۴a) {
            throw new IllegalStateException("No deadline");
        }
        return this.f۱۶۳۱۵b;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ct mo۱۷۴۸۷a(long deadlineNanoTime) {
        this.f۱۶۳۱۴a = true;
        this.f۱۶۳۱۵b = deadlineNanoTime;
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Ct mo۱۷۴۸۲b() {
        this.f۱۶۳۱۶c = 0L;
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ct mo۱۷۴۷۹a() {
        this.f۱۶۳۱۴a = false;
        return this;
    }

    /* renamed from: e, reason: contains not printable characters */
    public void mo۱۷۴۸۹e() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f۱۶۳۱۴a && this.f۱۶۳۱۵b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
