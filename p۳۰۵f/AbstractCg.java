package p۳۰۵f;

/* renamed from: f.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCg implements InterfaceCr {

    /* renamed from: c, reason: contains not printable characters */
    private final InterfaceCr f۱۶۲۷۷c;

    public AbstractCg(InterfaceCr delegate) {
        if (delegate == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f۱۶۲۷۷c = delegate;
    }

    @Override // p۳۰۵f.InterfaceCr
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۴۷۵a(Cc source, long byteCount) {
        this.f۱۶۲۷۷c.mo۱۷۴۷۵a(source, byteCount);
    }

    @Override // p۳۰۵f.InterfaceCr, java.io.Flushable
    public void flush() {
        this.f۱۶۲۷۷c.flush();
    }

    @Override // p۳۰۵f.InterfaceCr
    /* renamed from: b, reason: contains not printable characters */
    public Ct mo۱۷۴۷۶b() {
        return this.f۱۶۲۷۷c.mo۱۷۴۷۶b();
    }

    @Override // p۳۰۵f.InterfaceCr, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f۱۶۲۷۷c.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f۱۶۲۷۷c.toString() + ")";
    }
}
