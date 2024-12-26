package p۱۴۹f;

/* renamed from: f.g  reason: invalid class name */
public abstract class AbstractCg implements AbstractCr {

    /* renamed from: c  reason: contains not printable characters */
    private final AbstractCr f۱۶۲۷۷c;

    public AbstractCg(AbstractCr delegate) {
        if (delegate != null) {
            this.f۱۶۲۷۷c = delegate;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // p۱۴۹f.AbstractCr
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۴۵۵a(Cc source, long byteCount) {
        this.f۱۶۲۷۷c.m۱۹۵۵۲a(source, byteCount);
    }

    @Override // p۱۴۹f.AbstractCr, java.io.Flushable
    public void flush() {
        this.f۱۶۲۷۷c.flush();
    }

    @Override // p۱۴۹f.AbstractCr
    /* renamed from: b  reason: contains not printable characters */
    public Ct m۱۹۴۵۶b() {
        return this.f۱۶۲۷۷c.m۱۹۵۵۳b();
    }

    @Override // java.io.Closeable, p۱۴۹f.AbstractCr, java.lang.AutoCloseable
    public void close() {
        this.f۱۶۲۷۷c.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f۱۶۲۷۷c.toString() + ")";
    }
}
