package p۳۰۵f;

/* renamed from: f.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCh implements InterfaceCs {

    /* renamed from: c, reason: contains not printable characters */
    private final InterfaceCs f۱۶۲۷۸c;

    public AbstractCh(InterfaceCs delegate) {
        if (delegate == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f۱۶۲۷۸c = delegate;
    }

    /* renamed from: d, reason: contains not printable characters */
    public final InterfaceCs m۱۷۳۸۲d() {
        return this.f۱۶۲۷۸c;
    }

    @Override // p۳۰۵f.InterfaceCs
    /* renamed from: b, reason: contains not printable characters */
    public long mo۱۷۴۷۷b(Cc sink, long byteCount) {
        return this.f۱۶۲۷۸c.mo۱۷۴۷۷b(sink, byteCount);
    }

    @Override // p۳۰۵f.InterfaceCs
    /* renamed from: b, reason: contains not printable characters */
    public Ct mo۱۷۴۷۸b() {
        return this.f۱۶۲۷۸c.mo۱۷۴۷۸b();
    }

    @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f۱۶۲۷۸c.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f۱۶۲۷۸c.toString() + ")";
    }
}
