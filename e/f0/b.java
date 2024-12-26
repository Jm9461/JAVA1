package e.f0;

public abstract class b implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    protected final String f۳۷۴۱c;

    /* access modifiers changed from: protected */
    public abstract void b();

    public b(String format, Object... args) {
        this.f۳۷۴۱c = c.a(format, args);
    }

    public final void run() {
        String oldName = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f۳۷۴۱c);
        try {
            b();
        } finally {
            Thread.currentThread().setName(oldName);
        }
    }
}
