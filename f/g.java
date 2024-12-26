package f;

public abstract class g implements r {

    /* renamed from: c  reason: collision with root package name */
    private final r f۴۱۸۴c;

    public g(r delegate) {
        if (delegate != null) {
            this.f۴۱۸۴c = delegate;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // f.r
    public void a(c source, long byteCount) {
        this.f۴۱۸۴c.a(source, byteCount);
    }

    @Override // f.r, java.io.Flushable
    public void flush() {
        this.f۴۱۸۴c.flush();
    }

    @Override // f.r
    public t b() {
        return this.f۴۱۸۴c.b();
    }

    @Override // java.io.Closeable, f.r, java.lang.AutoCloseable
    public void close() {
        this.f۴۱۸۴c.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f۴۱۸۴c.toString() + ")";
    }
}
