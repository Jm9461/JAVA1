package f;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class n implements e {

    /* renamed from: c  reason: collision with root package name */
    public final c f۴۲۰۴c = new c();

    /* renamed from: d  reason: collision with root package name */
    public final s f۴۲۰۵d;

    /* renamed from: e  reason: collision with root package name */
    boolean f۴۲۰۶e;

    n(s source) {
        if (source != null) {
            this.f۴۲۰۵d = source;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // f.e
    public c a() {
        return this.f۴۲۰۴c;
    }

    @Override // f.s
    public long b(c sink, long byteCount) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        } else if (!this.f۴۲۰۶e) {
            c cVar = this.f۴۲۰۴c;
            if (cVar.f۴۱۷۷d == 0 && this.f۴۲۰۵d.b(cVar, 8192) == -1) {
                return -1;
            }
            return this.f۴۲۰۴c.b(sink, Math.min(byteCount, this.f۴۲۰۴c.f۴۱۷۷d));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // f.e
    public boolean i() {
        if (!this.f۴۲۰۶e) {
            return this.f۴۲۰۴c.i() && this.f۴۲۰۵d.b(this.f۴۲۰۴c, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.e
    public void d(long byteCount) {
        if (!a(byteCount)) {
            throw new EOFException();
        }
    }

    public boolean a(long byteCount) {
        c cVar;
        if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        } else if (!this.f۴۲۰۶e) {
            do {
                cVar = this.f۴۲۰۴c;
                if (cVar.f۴۱۷۷d >= byteCount) {
                    return true;
                }
            } while (this.f۴۲۰۵d.b(cVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // f.e
    public byte readByte() {
        d(1);
        return this.f۴۲۰۴c.readByte();
    }

    @Override // f.e
    public f b(long byteCount) {
        d(byteCount);
        return this.f۴۲۰۴c.b(byteCount);
    }

    @Override // f.e
    public byte[] g() {
        this.f۴۲۰۴c.a(this.f۴۲۰۵d);
        return this.f۴۲۰۴c.g();
    }

    @Override // f.e
    public byte[] f(long byteCount) {
        d(byteCount);
        return this.f۴۲۰۴c.f(byteCount);
    }

    @Override // f.e
    public void readFully(byte[] sink) {
        try {
            d((long) sink.length);
            this.f۴۲۰۴c.readFully(sink);
        } catch (EOFException e2) {
            int offset = 0;
            while (true) {
                c cVar = this.f۴۲۰۴c;
                long j = cVar.f۴۱۷۷d;
                if (j > 0) {
                    int read = cVar.a(sink, offset, (int) j);
                    if (read != -1) {
                        offset += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e2;
                }
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        c cVar = this.f۴۲۰۴c;
        if (cVar.f۴۱۷۷d == 0 && this.f۴۲۰۵d.b(cVar, 8192) == -1) {
            return -1;
        }
        return this.f۴۲۰۴c.read(sink);
    }

    @Override // f.e
    public String f() {
        return c(Long.MAX_VALUE);
    }

    @Override // f.e
    public String c(long limit) {
        if (limit >= 0) {
            long scanLength = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
            long newline = a((byte) 10, 0, scanLength);
            if (newline != -1) {
                return this.f۴۲۰۴c.i(newline);
            }
            if (scanLength < Long.MAX_VALUE && a(scanLength) && this.f۴۲۰۴c.g(scanLength - 1) == 13 && a(1 + scanLength) && this.f۴۲۰۴c.g(scanLength) == 10) {
                return this.f۴۲۰۴c.i(scanLength);
            }
            c data = new c();
            c cVar = this.f۴۲۰۴c;
            cVar.a(data, 0, Math.min(32L, cVar.q()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f۴۲۰۴c.q(), limit) + " content=" + data.o().b() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + limit);
    }

    @Override // f.e
    public short readShort() {
        d(2);
        return this.f۴۲۰۴c.readShort();
    }

    @Override // f.e
    public short c() {
        d(2);
        return this.f۴۲۰۴c.c();
    }

    @Override // f.e
    public int readInt() {
        d(4);
        return this.f۴۲۰۴c.readInt();
    }

    @Override // f.e
    public int h() {
        d(4);
        return this.f۴۲۰۴c.h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    @Override // f.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long e() {
        /*
            r6 = this;
            r0 = 1
            r6.d(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r1 = (long) r1
            boolean r1 = r6.a(r1)
            if (r1 == 0) goto L_0x0041
            f.c r1 = r6.f۴۲۰۴c
            long r2 = (long) r0
            byte r1 = r1.g(r2)
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
            f.c r0 = r6.f۴۲۰۴c
            long r0 = r0.e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.n.e():long");
    }

    @Override // f.e
    public long j() {
        d(1);
        int pos = 0;
        while (true) {
            if (!a((long) (pos + 1))) {
                break;
            }
            byte b2 = this.f۴۲۰۴c.g((long) pos);
            if ((b2 >= 48 && b2 <= 57) || ((b2 >= 97 && b2 <= 102) || (b2 >= 65 && b2 <= 70))) {
                pos++;
            } else if (pos == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(b2)));
            }
        }
        return this.f۴۲۰۴c.j();
    }

    @Override // f.e
    public void skip(long byteCount) {
        if (!this.f۴۲۰۶e) {
            while (byteCount > 0) {
                c cVar = this.f۴۲۰۴c;
                if (cVar.f۴۱۷۷d == 0 && this.f۴۲۰۵d.b(cVar, 8192) == -1) {
                    throw new EOFException();
                }
                long toSkip = Math.min(byteCount, this.f۴۲۰۴c.q());
                this.f۴۲۰۴c.skip(toSkip);
                byteCount -= toSkip;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.e
    public long a(byte b2) {
        return a(b2, 0, Long.MAX_VALUE);
    }

    public long a(byte b2, long fromIndex, long toIndex) {
        if (this.f۴۲۰۶e) {
            throw new IllegalStateException("closed");
        } else if (fromIndex < 0 || toIndex < fromIndex) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(fromIndex), Long.valueOf(toIndex)));
        } else {
            long fromIndex2 = fromIndex;
            while (fromIndex2 < toIndex) {
                long result = this.f۴۲۰۴c.a(b2, fromIndex2, toIndex);
                if (result != -1) {
                    return result;
                }
                c cVar = this.f۴۲۰۴c;
                long lastBufferSize = cVar.f۴۱۷۷d;
                if (lastBufferSize >= toIndex || this.f۴۲۰۵d.b(cVar, 8192) == -1) {
                    return -1;
                }
                fromIndex2 = Math.max(fromIndex2, lastBufferSize);
            }
            return -1;
        }
    }

    @Override // f.e
    public boolean a(long offset, f bytes) {
        return a(offset, bytes, 0, bytes.f());
    }

    public boolean a(long offset, f bytes, int bytesOffset, int byteCount) {
        if (this.f۴۲۰۶e) {
            throw new IllegalStateException("closed");
        } else if (offset < 0 || bytesOffset < 0 || byteCount < 0 || bytes.f() - bytesOffset < byteCount) {
            return false;
        } else {
            for (int i = 0; i < byteCount; i++) {
                long bufferOffset = ((long) i) + offset;
                if (!(a(1 + bufferOffset) && this.f۴۲۰۴c.g(bufferOffset) == bytes.a(bytesOffset + i))) {
                    return false;
                }
            }
            return true;
        }
    }

    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int read() {
            n nVar = n.this;
            if (!nVar.f۴۲۰۶e) {
                c cVar = nVar.f۴۲۰۴c;
                if (cVar.f۴۱۷۷d == 0 && nVar.f۴۲۰۵d.b(cVar, 8192) == -1) {
                    return -1;
                }
                return n.this.f۴۲۰۴c.readByte() & 255;
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int offset, int byteCount) {
            if (!n.this.f۴۲۰۶e) {
                u.a((long) data.length, (long) offset, (long) byteCount);
                n nVar = n.this;
                c cVar = nVar.f۴۲۰۴c;
                if (cVar.f۴۱۷۷d == 0 && nVar.f۴۲۰۵d.b(cVar, 8192) == -1) {
                    return -1;
                }
                return n.this.f۴۲۰۴c.a(data, offset, byteCount);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream
        public int available() {
            n nVar = n.this;
            if (!nVar.f۴۲۰۶e) {
                return (int) Math.min(nVar.f۴۲۰۴c.f۴۱۷۷d, 2147483647L);
            }
            throw new IOException("closed");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
            n.this.close();
        }

        public String toString() {
            return n.this + ".inputStream()";
        }
    }

    @Override // f.e
    public InputStream k() {
        return new a();
    }

    public boolean isOpen() {
        return !this.f۴۲۰۶e;
    }

    @Override // java.io.Closeable, f.s, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (!this.f۴۲۰۶e) {
            this.f۴۲۰۶e = true;
            this.f۴۲۰۵d.close();
            this.f۴۲۰۴c.m();
        }
    }

    @Override // f.s
    public t b() {
        return this.f۴۲۰۵d.b();
    }

    public String toString() {
        return "buffer(" + this.f۴۲۰۵d + ")";
    }
}
