package p۳۰۵f;

import java.nio.ByteBuffer;

/* renamed from: f.m, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cm implements InterfaceCd {

    /* renamed from: c, reason: contains not printable characters */
    public final Cc f۱۶۲۹۵c = new Cc();

    /* renamed from: d, reason: contains not printable characters */
    public final InterfaceCr f۱۶۲۹۶d;

    /* renamed from: e, reason: contains not printable characters */
    boolean f۱۶۲۹۷e;

    Cm(InterfaceCr sink) {
        if (sink == null) {
            throw new NullPointerException("sink == null");
        }
        this.f۱۶۲۹۶d = sink;
    }

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public Cc mo۱۷۴۳۳a() {
        return this.f۱۶۲۹۵c;
    }

    @Override // p۳۰۵f.InterfaceCr
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۴۷۵a(Cc source, long byteCount) {
        if (this.f۱۶۲۹۷e) {
            throw new IllegalStateException("closed");
        }
        this.f۱۶۲۹۵c.mo۱۷۴۷۵a(source, byteCount);
        mo۱۷۴۲۹d();
    }

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCd mo۱۷۴۲۶a(String string) {
        if (this.f۱۶۲۹۷e) {
            throw new IllegalStateException("closed");
        }
        this.f۱۶۲۹۵c.mo۱۷۴۲۶a(string);
        return mo۱۷۴۲۹d();
    }

    @Override // p۳۰۵f.InterfaceCd
    public InterfaceCd write(byte[] source) {
        if (this.f۱۶۲۹۷e) {
            throw new IllegalStateException("closed");
        }
        this.f۱۶۲۹۵c.write(source);
        mo۱۷۴۲۹d();
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    public InterfaceCd write(byte[] source, int offset, int byteCount) {
        if (this.f۱۶۲۹۷e) {
            throw new IllegalStateException("closed");
        }
        this.f۱۶۲۹۵c.write(source, offset, byteCount);
        mo۱۷۴۲۹d();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        if (this.f۱۶۲۹۷e) {
            throw new IllegalStateException("closed");
        }
        int result = this.f۱۶۲۹۵c.write(source);
        mo۱۷۴۲۹d();
        return result;
    }

    @Override // p۳۰۵f.InterfaceCd
    public InterfaceCd writeByte(int b2) {
        if (this.f۱۶۲۹۷e) {
            throw new IllegalStateException("closed");
        }
        this.f۱۶۲۹۵c.writeByte(b2);
        mo۱۷۴۲۹d();
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    public InterfaceCd writeShort(int s) {
        if (this.f۱۶۲۹۷e) {
            throw new IllegalStateException("closed");
        }
        this.f۱۶۲۹۵c.writeShort(s);
        mo۱۷۴۲۹d();
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    public InterfaceCd writeInt(int i) {
        if (this.f۱۶۲۹۷e) {
            throw new IllegalStateException("closed");
        }
        this.f۱۶۲۹۵c.writeInt(i);
        return mo۱۷۴۲۹d();
    }

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: e, reason: contains not printable characters */
    public InterfaceCd mo۱۷۴۳۰e(long v) {
        if (this.f۱۶۲۹۷e) {
            throw new IllegalStateException("closed");
        }
        this.f۱۶۲۹۵c.mo۱۷۴۳۰e(v);
        mo۱۷۴۲۹d();
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public InterfaceCd mo۱۷۴۲۵a(long v) {
        if (this.f۱۶۲۹۷e) {
            throw new IllegalStateException("closed");
        }
        this.f۱۶۲۹۵c.mo۱۷۴۲۵a(v);
        return mo۱۷۴۲۹d();
    }

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: d, reason: contains not printable characters */
    public InterfaceCd mo۱۷۴۲۹d() {
        if (this.f۱۶۲۹۷e) {
            throw new IllegalStateException("closed");
        }
        long byteCount = this.f۱۶۲۹۵c.m۱۷۳۲۹n();
        if (byteCount > 0) {
            this.f۱۶۲۹۶d.mo۱۷۴۷۵a(this.f۱۶۲۹۵c, byteCount);
        }
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd, p۳۰۵f.InterfaceCr, java.io.Flushable
    public void flush() {
        if (this.f۱۶۲۹۷e) {
            throw new IllegalStateException("closed");
        }
        Cc cc = this.f۱۶۲۹۵c;
        long j = cc.f۱۶۲۷۰d;
        if (j > 0) {
            this.f۱۶۲۹۶d.mo۱۷۴۷۵a(cc, j);
        }
        this.f۱۶۲۹۶d.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f۱۶۲۹۷e;
    }

    @Override // p۳۰۵f.InterfaceCr, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f۱۶۲۹۷e) {
            return;
        }
        Throwable thrown = null;
        try {
            if (this.f۱۶۲۹۵c.f۱۶۲۷۰d > 0) {
                this.f۱۶۲۹۶d.mo۱۷۴۷۵a(this.f۱۶۲۹۵c, this.f۱۶۲۹۵c.f۱۶۲۷۰d);
            }
        } catch (Throwable e2) {
            thrown = e2;
        }
        try {
            this.f۱۶۲۹۶d.close();
        } catch (Throwable e3) {
            if (thrown == null) {
                thrown = e3;
            }
        }
        this.f۱۶۲۹۷e = true;
        if (thrown != null) {
            Cu.m۱۷۴۹۳a(thrown);
            throw null;
        }
    }

    @Override // p۳۰۵f.InterfaceCr
    /* renamed from: b, reason: contains not printable characters */
    public Ct mo۱۷۴۷۶b() {
        return this.f۱۶۲۹۶d.mo۱۷۴۷۶b();
    }

    public String toString() {
        return "buffer(" + this.f۱۶۲۹۶d + ")";
    }
}
