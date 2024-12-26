package f;

import java.util.concurrent.TimeUnit;

public class i extends t {

    /* renamed from: e  reason: collision with root package name */
    private t f۴۱۸۶e;

    public i(t delegate) {
        if (delegate != null) {
            this.f۴۱۸۶e = delegate;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final t g() {
        return this.f۴۱۸۶e;
    }

    public final i a(t delegate) {
        if (delegate != null) {
            this.f۴۱۸۶e = delegate;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // f.t
    public t a(long timeout, TimeUnit unit) {
        return this.f۴۱۸۶e.a(timeout, unit);
    }

    @Override // f.t
    public boolean d() {
        return this.f۴۱۸۶e.d();
    }

    @Override // f.t
    public long c() {
        return this.f۴۱۸۶e.c();
    }

    @Override // f.t
    public t a(long deadlineNanoTime) {
        return this.f۴۱۸۶e.a(deadlineNanoTime);
    }

    @Override // f.t
    public t b() {
        return this.f۴۱۸۶e.b();
    }

    @Override // f.t
    public t a() {
        return this.f۴۱۸۶e.a();
    }

    @Override // f.t
    public void e() {
        this.f۴۱۸۶e.e();
    }
}
