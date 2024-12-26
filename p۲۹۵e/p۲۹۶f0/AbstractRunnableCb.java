package p۲۹۵e.p۲۹۶f0;

/* renamed from: e.f0.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractRunnableCb implements Runnable {

    /* renamed from: c, reason: contains not printable characters */
    protected final String f۱۵۷۰۲c;

    /* renamed from: b, reason: contains not printable characters */
    protected abstract void mo۱۷۲۴۰b();

    public AbstractRunnableCb(String format, Object... args) {
        this.f۱۵۷۰۲c = Cc.m۱۶۵۳۵a(format, args);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String oldName = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f۱۵۷۰۲c);
        try {
            mo۱۷۲۴۰b();
        } finally {
            Thread.currentThread().setName(oldName);
        }
    }
}
