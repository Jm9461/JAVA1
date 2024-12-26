package f;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class t {

    /* renamed from: d  reason: collision with root package name */
    public static final t f۴۲۱۸d = new a();

    /* renamed from: a  reason: collision with root package name */
    private boolean f۴۲۱۹a;

    /* renamed from: b  reason: collision with root package name */
    private long f۴۲۲۰b;

    /* renamed from: c  reason: collision with root package name */
    private long f۴۲۲۱c;

    class a extends t {
        a() {
        }

        @Override // f.t
        public t a(long timeout, TimeUnit unit) {
            return this;
        }

        @Override // f.t
        public t a(long deadlineNanoTime) {
            return this;
        }

        @Override // f.t
        public void e() {
        }
    }

    public t a(long timeout, TimeUnit unit) {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout < 0: " + timeout);
        } else if (unit != null) {
            this.f۴۲۲۱c = unit.toNanos(timeout);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long f() {
        return this.f۴۲۲۱c;
    }

    public boolean d() {
        return this.f۴۲۱۹a;
    }

    public long c() {
        if (this.f۴۲۱۹a) {
            return this.f۴۲۲۰b;
        }
        throw new IllegalStateException("No deadline");
    }

    public t a(long deadlineNanoTime) {
        this.f۴۲۱۹a = true;
        this.f۴۲۲۰b = deadlineNanoTime;
        return this;
    }

    public t b() {
        this.f۴۲۲۱c = 0;
        return this;
    }

    public t a() {
        this.f۴۲۱۹a = false;
        return this;
    }

    public void e() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f۴۲۱۹a && this.f۴۲۲۰b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
