package f;

import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class m implements d {

    /* renamed from: c  reason: collision with root package name */
    public final c f۴۲۰۱c = new c();

    /* renamed from: d  reason: collision with root package name */
    public final r f۴۲۰۲d;

    /* renamed from: e  reason: collision with root package name */
    boolean f۴۲۰۳e;

    m(r sink) {
        if (sink != null) {
            this.f۴۲۰۲d = sink;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // f.d
    public c a() {
        return this.f۴۲۰۱c;
    }

    @Override // f.r
    public void a(c source, long byteCount) {
        if (!this.f۴۲۰۳e) {
            this.f۴۲۰۱c.a(source, byteCount);
            d();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d a(String string) {
        if (!this.f۴۲۰۳e) {
            this.f۴۲۰۱c.a(string);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d write(byte[] source) {
        if (!this.f۴۲۰۳e) {
            this.f۴۲۰۱c.write(source);
            d();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d write(byte[] source, int offset, int byteCount) {
        if (!this.f۴۲۰۳e) {
            this.f۴۲۰۱c.write(source, offset, byteCount);
            d();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        if (!this.f۴۲۰۳e) {
            int result = this.f۴۲۰۱c.write(source);
            d();
            return result;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d writeByte(int b2) {
        if (!this.f۴۲۰۳e) {
            this.f۴۲۰۱c.writeByte(b2);
            d();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d writeShort(int s) {
        if (!this.f۴۲۰۳e) {
            this.f۴۲۰۱c.writeShort(s);
            d();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d writeInt(int i) {
        if (!this.f۴۲۰۳e) {
            this.f۴۲۰۱c.writeInt(i);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d e(long v) {
        if (!this.f۴۲۰۳e) {
            this.f۴۲۰۱c.e(v);
            d();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d a(long v) {
        if (!this.f۴۲۰۳e) {
            this.f۴۲۰۱c.a(v);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d d() {
        if (!this.f۴۲۰۳e) {
            long byteCount = this.f۴۲۰۱c.n();
            if (byteCount > 0) {
                this.f۴۲۰۲d.a(this.f۴۲۰۱c, byteCount);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.r, f.d, java.io.Flushable
    public void flush() {
        if (!this.f۴۲۰۳e) {
            c cVar = this.f۴۲۰۱c;
            long j = cVar.f۴۱۷۷d;
            if (j > 0) {
                this.f۴۲۰۲d.a(cVar, j);
            }
            this.f۴۲۰۲d.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f۴۲۰۳e;
    }

    @Override // java.io.Closeable, f.r, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (!this.f۴۲۰۳e) {
            Throwable thrown = null;
            try {
                if (this.f۴۲۰۱c.f۴۱۷۷d > 0) {
                    this.f۴۲۰۲d.a(this.f۴۲۰۱c, this.f۴۲۰۱c.f۴۱۷۷d);
                }
            } catch (Throwable e2) {
                thrown = e2;
            }
            try {
                this.f۴۲۰۲d.close();
            } catch (Throwable e3) {
                if (thrown == null) {
                    thrown = e3;
                }
            }
            this.f۴۲۰۳e = true;
            if (thrown != null) {
                u.a(thrown);
                throw null;
            }
        }
    }

    @Override // f.r
    public t b() {
        return this.f۴۲۰۲d.b();
    }

    public String toString() {
        return "buffer(" + this.f۴۲۰۲d + ")";
    }
}
