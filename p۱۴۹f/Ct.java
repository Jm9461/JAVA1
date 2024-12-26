package p۱۴۹f;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: f.t  reason: invalid class name */
public class Ct {

    /* renamed from: d  reason: contains not printable characters */
    public static final Ct f۱۶۳۱۳d = new Ca();

    /* renamed from: a  reason: contains not printable characters */
    private boolean f۱۶۳۱۴a;

    /* renamed from: b  reason: contains not printable characters */
    private long f۱۶۳۱۵b;

    /* renamed from: c  reason: contains not printable characters */
    private long f۱۶۳۱۶c;

    /* renamed from: f.t$a  reason: invalid class name */
    class Ca extends Ct {
        Ca() {
        }

        @Override // p۱۴۹f.Ct
        /* renamed from: a  reason: contains not printable characters */
        public Ct m۱۹۵۶۵a(long timeout, TimeUnit unit) {
            return this;
        }

        @Override // p۱۴۹f.Ct
        /* renamed from: a  reason: contains not printable characters */
        public Ct m۱۹۵۶۴a(long deadlineNanoTime) {
            return this;
        }

        @Override // p۱۴۹f.Ct
        /* renamed from: e  reason: contains not printable characters */
        public void m۱۹۵۶۶e() {
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ct m۱۹۵۵۸a(long timeout, TimeUnit unit) {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout < 0: " + timeout);
        } else if (unit != null) {
            this.f۱۶۳۱۶c = unit.toNanos(timeout);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public long m۱۹۵۶۳f() {
        return this.f۱۶۳۱۶c;
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۹۵۶۱d() {
        return this.f۱۶۳۱۴a;
    }

    /* renamed from: c  reason: contains not printable characters */
    public long m۱۹۵۶۰c() {
        if (this.f۱۶۳۱۴a) {
            return this.f۱۶۳۱۵b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ct m۱۹۵۵۷a(long deadlineNanoTime) {
        this.f۱۶۳۱۴a = true;
        this.f۱۶۳۱۵b = deadlineNanoTime;
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Ct m۱۹۵۵۹b() {
        this.f۱۶۳۱۶c = 0;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ct m۱۹۵۵۶a() {
        this.f۱۶۳۱۴a = false;
        return this;
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۹۵۶۲e() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f۱۶۳۱۴a && this.f۱۶۳۱۵b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
