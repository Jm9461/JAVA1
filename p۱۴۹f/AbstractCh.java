package p۱۴۹f;

/* renamed from: f.h  reason: invalid class name */
public abstract class AbstractCh implements AbstractCs {

    /* renamed from: c  reason: contains not printable characters */
    private final AbstractCs f۱۶۲۷۸c;

    public AbstractCh(AbstractCs delegate) {
        if (delegate != null) {
            this.f۱۶۲۷۸c = delegate;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: d  reason: contains not printable characters */
    public final AbstractCs m۱۹۴۵۹d() {
        return this.f۱۶۲۷۸c;
    }

    @Override // p۱۴۹f.AbstractCs
    /* renamed from: b  reason: contains not printable characters */
    public long m۱۹۴۵۷b(Cc sink, long byteCount) {
        return this.f۱۶۲۷۸c.m۱۹۵۵۴b(sink, byteCount);
    }

    @Override // p۱۴۹f.AbstractCs
    /* renamed from: b  reason: contains not printable characters */
    public Ct m۱۹۴۵۸b() {
        return this.f۱۶۲۷۸c.m۱۹۵۵۵b();
    }

    @Override // java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
    public void close() {
        this.f۱۶۲۷۸c.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f۱۶۲۷۸c.toString() + ")";
    }
}
