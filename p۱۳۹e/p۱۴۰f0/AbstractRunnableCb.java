package p۱۳۹e.p۱۴۰f0;

/* renamed from: e.f0.b  reason: invalid class name */
public abstract class AbstractRunnableCb implements Runnable {

    /* renamed from: c  reason: contains not printable characters */
    protected final String f۱۵۷۰۲c;

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۸۶۰۶b();

    public AbstractRunnableCb(String format, Object... args) {
        this.f۱۵۷۰۲c = Cc.m۱۸۶۱۴a(format, args);
    }

    public final void run() {
        String oldName = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f۱۵۷۰۲c);
        try {
            m۱۸۶۰۶b();
        } finally {
            Thread.currentThread().setName(oldName);
        }
    }
}
