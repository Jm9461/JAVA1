package f;

public abstract class h implements s {

    /* renamed from: c  reason: collision with root package name */
    private final s f۴۱۸۵c;

    public h(s delegate) {
        if (delegate != null) {
            this.f۴۱۸۵c = delegate;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final s d() {
        return this.f۴۱۸۵c;
    }

    @Override // f.s
    public long b(c sink, long byteCount) {
        return this.f۴۱۸۵c.b(sink, byteCount);
    }

    @Override // f.s
    public t b() {
        return this.f۴۱۸۵c.b();
    }

    @Override // java.io.Closeable, f.s, java.lang.AutoCloseable
    public void close() {
        this.f۴۱۸۵c.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f۴۱۸۵c.toString() + ")";
    }
}
