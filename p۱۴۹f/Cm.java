package p۱۴۹f;

import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: f.m  reason: invalid class name */
public final class Cm implements AbstractCd {

    /* renamed from: c  reason: contains not printable characters */
    public final Cc f۱۶۲۹۵c = new Cc();

    /* renamed from: d  reason: contains not printable characters */
    public final AbstractCr f۱۶۲۹۶d;

    /* renamed from: e  reason: contains not printable characters */
    boolean f۱۶۲۹۷e;

    Cm(AbstractCr sink) {
        if (sink != null) {
            this.f۱۶۲۹۶d = sink;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // p۱۴۹f.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۹۵۰۱a() {
        return this.f۱۶۲۹۵c;
    }

    @Override // p۱۴۹f.AbstractCr
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۵۰۴a(Cc source, long byteCount) {
        if (!this.f۱۶۲۹۷e) {
            this.f۱۶۲۹۵c.m۱۹۳۸۰a(source, byteCount);
            m۱۹۵۰۶d();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p۱۴۹f.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCd m۱۹۵۰۳a(String string) {
        if (!this.f۱۶۲۹۷e) {
            this.f۱۶۲۹۵c.m۱۹۳۷۳a(string);
            return m۱۹۵۰۶d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // p۱۴۹f.AbstractCd
    public AbstractCd write(byte[] source) {
        if (!this.f۱۶۲۹۷e) {
            this.f۱۶۲۹۵c.write(source);
            m۱۹۵۰۶d();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p۱۴۹f.AbstractCd
    public AbstractCd write(byte[] source, int offset, int byteCount) {
        if (!this.f۱۶۲۹۷e) {
            this.f۱۶۲۹۵c.write(source, offset, byteCount);
            m۱۹۵۰۶d();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        if (!this.f۱۶۲۹۷e) {
            int result = this.f۱۶۲۹۵c.write(source);
            m۱۹۵۰۶d();
            return result;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p۱۴۹f.AbstractCd
    public AbstractCd writeByte(int b) {
        if (!this.f۱۶۲۹۷e) {
            this.f۱۶۲۹۵c.writeByte(b);
            m۱۹۵۰۶d();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p۱۴۹f.AbstractCd
    public AbstractCd writeShort(int s) {
        if (!this.f۱۶۲۹۷e) {
            this.f۱۶۲۹۵c.writeShort(s);
            m۱۹۵۰۶d();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p۱۴۹f.AbstractCd
    public AbstractCd writeInt(int i) {
        if (!this.f۱۶۲۹۷e) {
            this.f۱۶۲۹۵c.writeInt(i);
            return m۱۹۵۰۶d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // p۱۴۹f.AbstractCd
    /* renamed from: e  reason: contains not printable characters */
    public AbstractCd m۱۹۵۰۷e(long v) {
        if (!this.f۱۶۲۹۷e) {
            this.f۱۶۲۹۵c.m۱۹۳۹۴e(v);
            m۱۹۵۰۶d();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p۱۴۹f.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCd m۱۹۵۰۲a(long v) {
        if (!this.f۱۶۲۹۷e) {
            this.f۱۶۲۹۵c.m۱۹۳۷۰a(v);
            return m۱۹۵۰۶d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // p۱۴۹f.AbstractCd
    /* renamed from: d  reason: contains not printable characters */
    public AbstractCd m۱۹۵۰۶d() {
        if (!this.f۱۶۲۹۷e) {
            long byteCount = this.f۱۶۲۹۵c.m۱۹۴۰۷n();
            if (byteCount > 0) {
                this.f۱۶۲۹۶d.m۱۹۵۵۲a(this.f۱۶۲۹۵c, byteCount);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p۱۴۹f.AbstractCr, p۱۴۹f.AbstractCd, java.io.Flushable
    public void flush() {
        if (!this.f۱۶۲۹۷e) {
            Cc cVar = this.f۱۶۲۹۵c;
            long j = cVar.f۱۶۲۷۰d;
            if (j > 0) {
                this.f۱۶۲۹۶d.m۱۹۵۵۲a(cVar, j);
            }
            this.f۱۶۲۹۶d.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f۱۶۲۹۷e;
    }

    @Override // java.io.Closeable, p۱۴۹f.AbstractCr, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (!this.f۱۶۲۹۷e) {
            Throwable thrown = null;
            try {
                if (this.f۱۶۲۹۵c.f۱۶۲۷۰d > 0) {
                    this.f۱۶۲۹۶d.m۱۹۵۵۲a(this.f۱۶۲۹۵c, this.f۱۶۲۹۵c.f۱۶۲۷۰d);
                }
            } catch (Throwable e) {
                thrown = e;
            }
            try {
                this.f۱۶۲۹۶d.close();
            } catch (Throwable e2) {
                if (thrown == null) {
                    thrown = e2;
                }
            }
            this.f۱۶۲۹۷e = true;
            if (thrown != null) {
                Cu.m۱۹۵۷۰a(thrown);
                throw null;
            }
        }
    }

    @Override // p۱۴۹f.AbstractCr
    /* renamed from: b  reason: contains not printable characters */
    public Ct m۱۹۵۰۵b() {
        return this.f۱۶۲۹۶d.m۱۹۵۵۳b();
    }

    public String toString() {
        return "buffer(" + this.f۱۶۲۹۶d + ")";
    }
}
