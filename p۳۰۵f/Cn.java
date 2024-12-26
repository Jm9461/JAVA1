package p۳۰۵f;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: f.n, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cn implements InterfaceCe {

    /* renamed from: c, reason: contains not printable characters */
    public final Cc f۱۶۲۹۸c = new Cc();

    /* renamed from: d, reason: contains not printable characters */
    public final InterfaceCs f۱۶۲۹۹d;

    /* renamed from: e, reason: contains not printable characters */
    boolean f۱۶۳۰۰e;

    Cn(InterfaceCs source) {
        if (source == null) {
            throw new NullPointerException("source == null");
        }
        this.f۱۶۲۹۹d = source;
    }

    @Override // p۳۰۵f.InterfaceCe, p۳۰۵f.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public Cc mo۱۷۴۳۳a() {
        return this.f۱۶۲۹۸c;
    }

    @Override // p۳۰۵f.InterfaceCs
    /* renamed from: b, reason: contains not printable characters */
    public long mo۱۷۴۷۷b(Cc sink, long byteCount) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        }
        if (this.f۱۶۳۰۰e) {
            throw new IllegalStateException("closed");
        }
        Cc cc = this.f۱۶۲۹۸c;
        if (cc.f۱۶۲۷۰d == 0) {
            long read = this.f۱۶۲۹۹d.mo۱۷۴۷۷b(cc, 8192L);
            if (read == -1) {
                return -1L;
            }
        }
        long toRead = Math.min(byteCount, this.f۱۶۲۹۸c.f۱۶۲۷۰d);
        return this.f۱۶۲۹۸c.mo۱۷۴۷۷b(sink, toRead);
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: i, reason: contains not printable characters */
    public boolean mo۱۷۴۴۸i() {
        if (this.f۱۶۳۰۰e) {
            throw new IllegalStateException("closed");
        }
        return this.f۱۶۲۹۸c.mo۱۷۴۴۸i() && this.f۱۶۲۹۹d.mo۱۷۴۷۷b(this.f۱۶۲۹۸c, 8192L) == -1;
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: d, reason: contains not printable characters */
    public void mo۱۷۴۴۲d(long byteCount) {
        if (!m۱۷۴۳۴a(byteCount)) {
            throw new EOFException();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۷۴۳۴a(long byteCount) {
        Cc cc;
        if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        }
        if (this.f۱۶۳۰۰e) {
            throw new IllegalStateException("closed");
        }
        do {
            cc = this.f۱۶۲۹۸c;
            if (cc.f۱۶۲۷۰d >= byteCount) {
                return true;
            }
        } while (this.f۱۶۲۹۹d.mo۱۷۴۷۷b(cc, 8192L) != -1);
        return false;
    }

    @Override // p۳۰۵f.InterfaceCe
    public byte readByte() {
        mo۱۷۴۴۲d(1L);
        return this.f۱۶۲۹۸c.readByte();
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: b, reason: contains not printable characters */
    public Cf mo۱۷۴۳۸b(long byteCount) {
        mo۱۷۴۴۲d(byteCount);
        return this.f۱۶۲۹۸c.mo۱۷۴۳۸b(byteCount);
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: g, reason: contains not printable characters */
    public byte[] mo۱۷۴۴۶g() {
        this.f۱۶۲۹۸c.m۱۷۲۹۰a(this.f۱۶۲۹۹d);
        return this.f۱۶۲۹۸c.mo۱۷۴۴۶g();
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: f, reason: contains not printable characters */
    public byte[] mo۱۷۴۴۵f(long byteCount) {
        mo۱۷۴۴۲d(byteCount);
        return this.f۱۶۲۹۸c.mo۱۷۴۴۵f(byteCount);
    }

    @Override // p۳۰۵f.InterfaceCe
    public void readFully(byte[] sink) {
        try {
            mo۱۷۴۴۲d(sink.length);
            this.f۱۶۲۹۸c.readFully(sink);
        } catch (EOFException e2) {
            int offset = 0;
            while (true) {
                Cc cc = this.f۱۶۲۹۸c;
                long j = cc.f۱۶۲۷۰d;
                if (j <= 0) {
                    throw e2;
                }
                int read = cc.m۱۷۲۸۷a(sink, offset, (int) j);
                if (read == -1) {
                    throw new AssertionError();
                }
                offset += read;
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Cc cc = this.f۱۶۲۹۸c;
        if (cc.f۱۶۲۷۰d == 0) {
            long read = this.f۱۶۲۹۹d.mo۱۷۴۷۷b(cc, 8192L);
            if (read == -1) {
                return -1;
            }
        }
        return this.f۱۶۲۹۸c.read(sink);
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: f, reason: contains not printable characters */
    public String mo۱۷۴۴۴f() {
        return mo۱۷۴۴۰c(Long.MAX_VALUE);
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: c, reason: contains not printable characters */
    public String mo۱۷۴۴۰c(long limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("limit < 0: " + limit);
        }
        long scanLength = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long newline = m۱۷۴۳۲a((byte) 10, 0L, scanLength);
        if (newline != -1) {
            return this.f۱۶۲۹۸c.m۱۷۳۲۴i(newline);
        }
        if (scanLength < Long.MAX_VALUE && m۱۷۴۳۴a(scanLength) && this.f۱۶۲۹۸c.m۱۷۳۲۰g(scanLength - 1) == 13 && m۱۷۴۳۴a(1 + scanLength) && this.f۱۶۲۹۸c.m۱۷۳۲۰g(scanLength) == 10) {
            return this.f۱۶۲۹۸c.m۱۷۳۲۴i(scanLength);
        }
        Cc data = new Cc();
        Cc cc = this.f۱۶۲۹۸c;
        cc.m۱۷۲۹۳a(data, 0L, Math.min(32L, cc.m۱۷۳۳۲q()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f۱۶۲۹۸c.m۱۷۳۳۲q(), limit) + " content=" + data.m۱۷۳۳۰o().mo۱۷۴۶۷b() + (char) 8230);
    }

    @Override // p۳۰۵f.InterfaceCe
    public short readShort() {
        mo۱۷۴۴۲d(2L);
        return this.f۱۶۲۹۸c.readShort();
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: c, reason: contains not printable characters */
    public short mo۱۷۴۴۱c() {
        mo۱۷۴۴۲d(2L);
        return this.f۱۶۲۹۸c.mo۱۷۴۴۱c();
    }

    @Override // p۳۰۵f.InterfaceCe
    public int readInt() {
        mo۱۷۴۴۲d(4L);
        return this.f۱۶۲۹۸c.readInt();
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: h, reason: contains not printable characters */
    public int mo۱۷۴۴۷h() {
        mo۱۷۴۴۲d(4L);
        return this.f۱۶۲۹۸c.mo۱۷۴۴۷h();
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: e, reason: contains not printable characters */
    public long mo۱۷۴۴۳e() {
        mo۱۷۴۴۲d(1L);
        for (int pos = 0; m۱۷۴۳۴a(pos + 1); pos++) {
            byte b2 = this.f۱۶۲۹۸c.m۱۷۳۲۰g(pos);
            if ((b2 < 48 || b2 > 57) && (pos != 0 || b2 != 45)) {
                if (pos == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(b2)));
                }
                return this.f۱۶۲۹۸c.mo۱۷۴۴۳e();
            }
        }
        return this.f۱۶۲۹۸c.mo۱۷۴۴۳e();
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: j, reason: contains not printable characters */
    public long mo۱۷۴۴۹j() {
        mo۱۷۴۴۲d(1L);
        for (int pos = 0; m۱۷۴۳۴a(pos + 1); pos++) {
            byte b2 = this.f۱۶۲۹۸c.m۱۷۳۲۰g(pos);
            if ((b2 < 48 || b2 > 57) && ((b2 < 97 || b2 > 102) && (b2 < 65 || b2 > 70))) {
                if (pos == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(b2)));
                }
                return this.f۱۶۲۹۸c.mo۱۷۴۴۹j();
            }
        }
        return this.f۱۶۲۹۸c.mo۱۷۴۴۹j();
    }

    @Override // p۳۰۵f.InterfaceCe
    public void skip(long byteCount) {
        if (this.f۱۶۳۰۰e) {
            throw new IllegalStateException("closed");
        }
        while (byteCount > 0) {
            Cc cc = this.f۱۶۲۹۸c;
            if (cc.f۱۶۲۷۰d == 0 && this.f۱۶۲۹۹d.mo۱۷۴۷۷b(cc, 8192L) == -1) {
                throw new EOFException();
            }
            long toSkip = Math.min(byteCount, this.f۱۶۲۹۸c.m۱۷۳۳۲q());
            this.f۱۶۲۹۸c.skip(toSkip);
            byteCount -= toSkip;
        }
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: a, reason: contains not printable characters */
    public long mo۱۷۴۳۱a(byte b2) {
        return m۱۷۴۳۲a(b2, 0L, Long.MAX_VALUE);
    }

    /* renamed from: a, reason: contains not printable characters */
    public long m۱۷۴۳۲a(byte b2, long fromIndex, long toIndex) {
        if (this.f۱۶۳۰۰e) {
            throw new IllegalStateException("closed");
        }
        if (fromIndex < 0 || toIndex < fromIndex) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(fromIndex), Long.valueOf(toIndex)));
        }
        long fromIndex2 = fromIndex;
        while (fromIndex2 < toIndex) {
            long result = this.f۱۶۲۹۸c.m۱۷۲۸۹a(b2, fromIndex2, toIndex);
            if (result != -1) {
                return result;
            }
            Cc cc = this.f۱۶۲۹۸c;
            long lastBufferSize = cc.f۱۶۲۷۰d;
            if (lastBufferSize >= toIndex || this.f۱۶۲۹۹d.mo۱۷۴۷۷b(cc, 8192L) == -1) {
                return -1L;
            }
            fromIndex2 = Math.max(fromIndex2, lastBufferSize);
        }
        return -1L;
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۷۴۳۵a(long offset, Cf bytes) {
        return m۱۷۴۳۶a(offset, bytes, 0, bytes.mo۱۷۴۷۱f());
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۷۴۳۶a(long offset, Cf bytes, int bytesOffset, int byteCount) {
        if (this.f۱۶۳۰۰e) {
            throw new IllegalStateException("closed");
        }
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || bytes.mo۱۷۴۷۱f() - bytesOffset < byteCount) {
            return false;
        }
        for (int i = 0; i < byteCount; i++) {
            long bufferOffset = i + offset;
            if (!m۱۷۴۳۴a(1 + bufferOffset) || this.f۱۶۲۹۸c.m۱۷۳۲۰g(bufferOffset) != bytes.mo۱۷۴۶۱a(bytesOffset + i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f.n$a */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int read() {
            Cn cn = Cn.this;
            if (cn.f۱۶۳۰۰e) {
                throw new IOException("closed");
            }
            Cc cc = cn.f۱۶۲۹۸c;
            if (cc.f۱۶۲۷۰d == 0) {
                long count = cn.f۱۶۲۹۹d.mo۱۷۴۷۷b(cc, 8192L);
                if (count == -1) {
                    return -1;
                }
            }
            return Cn.this.f۱۶۲۹۸c.readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int offset, int byteCount) {
            if (Cn.this.f۱۶۳۰۰e) {
                throw new IOException("closed");
            }
            Cu.m۱۷۴۹۲a(data.length, offset, byteCount);
            Cn cn = Cn.this;
            Cc cc = cn.f۱۶۲۹۸c;
            if (cc.f۱۶۲۷۰d == 0) {
                long count = cn.f۱۶۲۹۹d.mo۱۷۴۷۷b(cc, 8192L);
                if (count == -1) {
                    return -1;
                }
            }
            return Cn.this.f۱۶۲۹۸c.m۱۷۲۸۷a(data, offset, byteCount);
        }

        @Override // java.io.InputStream
        public int available() {
            Cn cn = Cn.this;
            if (cn.f۱۶۳۰۰e) {
                throw new IOException("closed");
            }
            return (int) Math.min(cn.f۱۶۲۹۸c.f۱۶۲۷۰d, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Cn.this.close();
        }

        public String toString() {
            return Cn.this + ".inputStream()";
        }
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: k, reason: contains not printable characters */
    public InputStream mo۱۷۴۵۰k() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f۱۶۳۰۰e;
    }

    @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f۱۶۳۰۰e) {
            return;
        }
        this.f۱۶۳۰۰e = true;
        this.f۱۶۲۹۹d.close();
        this.f۱۶۲۹۸c.m۱۷۳۲۸m();
    }

    @Override // p۳۰۵f.InterfaceCs
    /* renamed from: b, reason: contains not printable characters */
    public Ct mo۱۷۴۷۸b() {
        return this.f۱۶۲۹۹d.mo۱۷۴۷۸b();
    }

    public String toString() {
        return "buffer(" + this.f۱۶۲۹۹d + ")";
    }
}
