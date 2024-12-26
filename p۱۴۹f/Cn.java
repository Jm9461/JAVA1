package p۱۴۹f;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: f.n  reason: invalid class name */
public final class Cn implements AbstractCe {

    /* renamed from: c  reason: contains not printable characters */
    public final Cc f۱۶۲۹۸c = new Cc();

    /* renamed from: d  reason: contains not printable characters */
    public final AbstractCs f۱۶۲۹۹d;

    /* renamed from: e  reason: contains not printable characters */
    boolean f۱۶۳۰۰e;

    Cn(AbstractCs source) {
        if (source != null) {
            this.f۱۶۲۹۹d = source;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۹۵۱۰a() {
        return this.f۱۶۲۹۸c;
    }

    @Override // p۱۴۹f.AbstractCs
    /* renamed from: b  reason: contains not printable characters */
    public long m۱۹۵۱۴b(Cc sink, long byteCount) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        } else if (!this.f۱۶۳۰۰e) {
            Cc cVar = this.f۱۶۲۹۸c;
            if (cVar.f۱۶۲۷۰d == 0 && this.f۱۶۲۹۹d.m۱۹۵۵۴b(cVar, 8192) == -1) {
                return -1;
            }
            return this.f۱۶۲۹۸c.m۱۹۳۸۳b(sink, Math.min(byteCount, this.f۱۶۲۹۸c.f۱۶۲۷۰d));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۹۵۲۵i() {
        if (!this.f۱۶۳۰۰e) {
            return this.f۱۶۲۹۸c.m۱۹۴۰۳i() && this.f۱۶۲۹۹d.m۱۹۵۵۴b(this.f۱۶۲۹۸c, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۹۵۱۹d(long byteCount) {
        if (!m۱۹۵۱۱a(byteCount)) {
            throw new EOFException();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۵۱۱a(long byteCount) {
        Cc cVar;
        if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        } else if (!this.f۱۶۳۰۰e) {
            do {
                cVar = this.f۱۶۲۹۸c;
                if (cVar.f۱۶۲۷۰d >= byteCount) {
                    return true;
                }
            } while (this.f۱۶۲۹۹d.m۱۹۵۵۴b(cVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // p۱۴۹f.AbstractCe
    public byte readByte() {
        m۱۹۵۱۹d(1);
        return this.f۱۶۲۹۸c.readByte();
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: b  reason: contains not printable characters */
    public Cf m۱۹۵۱۵b(long byteCount) {
        m۱۹۵۱۹d(byteCount);
        return this.f۱۶۲۹۸c.m۱۹۳۸۴b(byteCount);
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: g  reason: contains not printable characters */
    public byte[] m۱۹۵۲۳g() {
        this.f۱۶۲۹۸c.m۱۹۳۶۸a(this.f۱۶۲۹۹d);
        return this.f۱۶۲۹۸c.m۱۹۳۹۹g();
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: f  reason: contains not printable characters */
    public byte[] m۱۹۵۲۲f(long byteCount) {
        m۱۹۵۱۹d(byteCount);
        return this.f۱۶۲۹۸c.m۱۹۳۹۷f(byteCount);
    }

    @Override // p۱۴۹f.AbstractCe
    public void readFully(byte[] sink) {
        try {
            m۱۹۵۱۹d((long) sink.length);
            this.f۱۶۲۹۸c.readFully(sink);
        } catch (EOFException e) {
            int offset = 0;
            while (true) {
                Cc cVar = this.f۱۶۲۹۸c;
                long j = cVar.f۱۶۲۷۰d;
                if (j > 0) {
                    int read = cVar.m۱۹۳۶۵a(sink, offset, (int) j);
                    if (read != -1) {
                        offset += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Cc cVar = this.f۱۶۲۹۸c;
        if (cVar.f۱۶۲۷۰d == 0 && this.f۱۶۲۹۹d.m۱۹۵۵۴b(cVar, 8192) == -1) {
            return -1;
        }
        return this.f۱۶۲۹۸c.read(sink);
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: f  reason: contains not printable characters */
    public String m۱۹۵۲۱f() {
        return m۱۹۵۱۷c(Long.MAX_VALUE);
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: c  reason: contains not printable characters */
    public String m۱۹۵۱۷c(long limit) {
        if (limit >= 0) {
            long scanLength = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
            long newline = m۱۹۵۰۹a((byte) 10, 0, scanLength);
            if (newline != -1) {
                return this.f۱۶۲۹۸c.m۱۹۴۰۲i(newline);
            }
            if (scanLength < Long.MAX_VALUE && m۱۹۵۱۱a(scanLength) && this.f۱۶۲۹۸c.m۱۹۳۹۸g(scanLength - 1) == 13 && m۱۹۵۱۱a(1 + scanLength) && this.f۱۶۲۹۸c.m۱۹۳۹۸g(scanLength) == 10) {
                return this.f۱۶۲۹۸c.m۱۹۴۰۲i(scanLength);
            }
            Cc data = new Cc();
            Cc cVar = this.f۱۶۲۹۸c;
            cVar.m۱۹۳۷۱a(data, 0, Math.min(32L, cVar.m۱۹۴۱۰q()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f۱۶۲۹۸c.m۱۹۴۱۰q(), limit) + " content=" + data.m۱۹۴۰۸o().m۱۹۴۴۶b() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + limit);
    }

    @Override // p۱۴۹f.AbstractCe
    public short readShort() {
        m۱۹۵۱۹d(2);
        return this.f۱۶۲۹۸c.readShort();
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: c  reason: contains not printable characters */
    public short m۱۹۵۱۸c() {
        m۱۹۵۱۹d(2);
        return this.f۱۶۲۹۸c.m۱۹۳۸۹c();
    }

    @Override // p۱۴۹f.AbstractCe
    public int readInt() {
        m۱۹۵۱۹d(4);
        return this.f۱۶۲۹۸c.readInt();
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: h  reason: contains not printable characters */
    public int m۱۹۵۲۴h() {
        m۱۹۵۱۹d(4);
        return this.f۱۶۲۹۸c.m۱۹۴۰۰h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    @Override // p۱۴۹f.AbstractCe
    /* renamed from: e  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m۱۹۵۲۰e() {
        /*
            r6 = this;
            r0 = 1
            r6.m۱۹۵۱۹d(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r1 = (long) r1
            boolean r1 = r6.m۱۹۵۱۱a(r1)
            if (r1 == 0) goto L_0x0041
            f.c r1 = r6.f۱۶۲۹۸c
            long r2 = (long) r0
            byte r1 = r1.m۱۹۳۹۸g(r2)
            r2 = 48
            if (r1 < r2) goto L_0x001e
            r2 = 57
            if (r1 <= r2) goto L_0x0025
        L_0x001e:
            if (r0 != 0) goto L_0x0028
            r2 = 45
            if (r1 == r2) goto L_0x0025
            goto L_0x0028
        L_0x0025:
            int r0 = r0 + 1
            goto L_0x0006
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.Byte r5 = java.lang.Byte.valueOf(r1)
            r3[r4] = r5
            java.lang.String r4 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.<init>(r3)
            throw r2
        L_0x0041:
            f.c r0 = r6.f۱۶۲۹۸c
            long r0 = r0.m۱۹۳۹۳e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۴۹f.Cn.m۱۹۵۲۰e():long");
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: j  reason: contains not printable characters */
    public long m۱۹۵۲۶j() {
        m۱۹۵۱۹d(1);
        int pos = 0;
        while (true) {
            if (!m۱۹۵۱۱a((long) (pos + 1))) {
                break;
            }
            byte b = this.f۱۶۲۹۸c.m۱۹۳۹۸g((long) pos);
            if ((b >= 48 && b <= 57) || ((b >= 97 && b <= 102) || (b >= 65 && b <= 70))) {
                pos++;
            } else if (pos == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(b)));
            }
        }
        return this.f۱۶۲۹۸c.m۱۹۴۰۴j();
    }

    @Override // p۱۴۹f.AbstractCe
    public void skip(long byteCount) {
        if (!this.f۱۶۳۰۰e) {
            while (byteCount > 0) {
                Cc cVar = this.f۱۶۲۹۸c;
                if (cVar.f۱۶۲۷۰d == 0 && this.f۱۶۲۹۹d.m۱۹۵۵۴b(cVar, 8192) == -1) {
                    throw new EOFException();
                }
                long toSkip = Math.min(byteCount, this.f۱۶۲۹۸c.m۱۹۴۱۰q());
                this.f۱۶۲۹۸c.skip(toSkip);
                byteCount -= toSkip;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۹۵۰۸a(byte b) {
        return m۱۹۵۰۹a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a  reason: contains not printable characters */
    public long m۱۹۵۰۹a(byte b, long fromIndex, long toIndex) {
        if (this.f۱۶۳۰۰e) {
            throw new IllegalStateException("closed");
        } else if (fromIndex < 0 || toIndex < fromIndex) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(fromIndex), Long.valueOf(toIndex)));
        } else {
            long fromIndex2 = fromIndex;
            while (fromIndex2 < toIndex) {
                long result = this.f۱۶۲۹۸c.m۱۹۳۶۷a(b, fromIndex2, toIndex);
                if (result != -1) {
                    return result;
                }
                Cc cVar = this.f۱۶۲۹۸c;
                long lastBufferSize = cVar.f۱۶۲۷۰d;
                if (lastBufferSize >= toIndex || this.f۱۶۲۹۹d.m۱۹۵۵۴b(cVar, 8192) == -1) {
                    return -1;
                }
                fromIndex2 = Math.max(fromIndex2, lastBufferSize);
            }
            return -1;
        }
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۵۱۲a(long offset, Cf bytes) {
        return m۱۹۵۱۳a(offset, bytes, 0, bytes.m۱۹۴۵۱f());
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۵۱۳a(long offset, Cf bytes, int bytesOffset, int byteCount) {
        if (this.f۱۶۳۰۰e) {
            throw new IllegalStateException("closed");
        } else if (offset < 0 || bytesOffset < 0 || byteCount < 0 || bytes.m۱۹۴۵۱f() - bytesOffset < byteCount) {
            return false;
        } else {
            for (int i = 0; i < byteCount; i++) {
                long bufferOffset = ((long) i) + offset;
                if (!(m۱۹۵۱۱a(1 + bufferOffset) && this.f۱۶۲۹۸c.m۱۹۳۹۸g(bufferOffset) == bytes.m۱۹۴۳۹a(bytesOffset + i))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: f.n$a  reason: invalid class name */
    class Ca extends InputStream {
        Ca() {
        }

        @Override // java.io.InputStream
        public int read() {
            Cn nVar = Cn.this;
            if (!nVar.f۱۶۳۰۰e) {
                Cc cVar = nVar.f۱۶۲۹۸c;
                if (cVar.f۱۶۲۷۰d == 0 && nVar.f۱۶۲۹۹d.m۱۹۵۵۴b(cVar, 8192) == -1) {
                    return -1;
                }
                return Cn.this.f۱۶۲۹۸c.readByte() & 255;
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int offset, int byteCount) {
            if (!Cn.this.f۱۶۳۰۰e) {
                Cu.m۱۹۵۶۹a((long) data.length, (long) offset, (long) byteCount);
                Cn nVar = Cn.this;
                Cc cVar = nVar.f۱۶۲۹۸c;
                if (cVar.f۱۶۲۷۰d == 0 && nVar.f۱۶۲۹۹d.m۱۹۵۵۴b(cVar, 8192) == -1) {
                    return -1;
                }
                return Cn.this.f۱۶۲۹۸c.m۱۹۳۶۵a(data, offset, byteCount);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream
        public int available() {
            Cn nVar = Cn.this;
            if (!nVar.f۱۶۳۰۰e) {
                return (int) Math.min(nVar.f۱۶۲۹۸c.f۱۶۲۷۰d, 2147483647L);
            }
            throw new IOException("closed");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
            Cn.this.close();
        }

        public String toString() {
            return Cn.this + ".inputStream()";
        }
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: k  reason: contains not printable characters */
    public InputStream m۱۹۵۲۷k() {
        return new Ca();
    }

    public boolean isOpen() {
        return !this.f۱۶۳۰۰e;
    }

    @Override // java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (!this.f۱۶۳۰۰e) {
            this.f۱۶۳۰۰e = true;
            this.f۱۶۲۹۹d.close();
            this.f۱۶۲۹۸c.m۱۹۴۰۶m();
        }
    }

    @Override // p۱۴۹f.AbstractCs
    /* renamed from: b  reason: contains not printable characters */
    public Ct m۱۹۵۱۶b() {
        return this.f۱۶۲۹۹d.m۱۹۵۵۵b();
    }

    public String toString() {
        return "buffer(" + this.f۱۶۲۹۹d + ")";
    }
}
