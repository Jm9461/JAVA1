package f;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f۴۱۷۵e = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: c  reason: collision with root package name */
    o f۴۱۷۶c;

    /* renamed from: d  reason: collision with root package name */
    long f۴۱۷۷d;

    public long q() {
        return this.f۴۱۷۷d;
    }

    @Override // f.e, f.d
    public c a() {
        return this;
    }

    @Override // f.d
    public c d() {
        return this;
    }

    @Override // f.e
    public boolean i() {
        return this.f۴۱۷۷d == 0;
    }

    @Override // f.e
    public void d(long byteCount) {
        if (this.f۴۱۷۷d < byteCount) {
            throw new EOFException();
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f۴۱۷۷d > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int offset, int byteCount) {
            return c.this.a(sink, offset, byteCount);
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f۴۱۷۷d, 2147483647L);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
        }

        public String toString() {
            return c.this + ".inputStream()";
        }
    }

    @Override // f.e
    public InputStream k() {
        return new a();
    }

    public c a(c out, long offset, long byteCount) {
        if (out != null) {
            u.a(this.f۴۱۷۷d, offset, byteCount);
            if (byteCount == 0) {
                return this;
            }
            out.f۴۱۷۷d += byteCount;
            o s = this.f۴۱۷۶c;
            while (true) {
                int i = s.f۴۲۱۰c;
                int i2 = s.f۴۲۰۹b;
                if (offset < ((long) (i - i2))) {
                    break;
                }
                offset -= (long) (i - i2);
                s = s.f۴۲۱۳f;
            }
            while (byteCount > 0) {
                o copy = s.c();
                copy.f۴۲۰۹b = (int) (((long) copy.f۴۲۰۹b) + offset);
                copy.f۴۲۱۰c = Math.min(copy.f۴۲۰۹b + ((int) byteCount), copy.f۴۲۱۰c);
                o oVar = out.f۴۱۷۶c;
                if (oVar == null) {
                    copy.f۴۲۱۴g = copy;
                    copy.f۴۲۱۳f = copy;
                    out.f۴۱۷۶c = copy;
                } else {
                    oVar.f۴۲۱۴g.a(copy);
                }
                byteCount -= (long) (copy.f۴۲۱۰c - copy.f۴۲۰۹b);
                offset = 0;
                s = s.f۴۲۱۳f;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public long n() {
        long result = this.f۴۱۷۷d;
        if (result == 0) {
            return 0;
        }
        o tail = this.f۴۱۷۶c.f۴۲۱۴g;
        int i = tail.f۴۲۱۰c;
        if (i >= 8192 || !tail.f۴۲۱۲e) {
            return result;
        }
        return result - ((long) (i - tail.f۴۲۰۹b));
    }

    /* JADX INFO: Multiple debug info for r3v1 byte: [D('pos' int), D('b' byte)] */
    @Override // f.e
    public byte readByte() {
        long j = this.f۴۱۷۷d;
        if (j != 0) {
            o segment = this.f۴۱۷۶c;
            int pos = segment.f۴۲۰۹b;
            int limit = segment.f۴۲۱۰c;
            int pos2 = pos + 1;
            byte b2 = segment.f۴۲۰۸a[pos];
            this.f۴۱۷۷d = j - 1;
            if (pos2 == limit) {
                this.f۴۱۷۶c = segment.b();
                p.a(segment);
            } else {
                segment.f۴۲۰۹b = pos2;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public byte g(long pos) {
        u.a(this.f۴۱۷۷d, pos, 1);
        long j = this.f۴۱۷۷d;
        if (j - pos > pos) {
            o s = this.f۴۱۷۶c;
            while (true) {
                int i = s.f۴۲۱۰c;
                int i2 = s.f۴۲۰۹b;
                int segmentByteCount = i - i2;
                if (pos < ((long) segmentByteCount)) {
                    return s.f۴۲۰۸a[i2 + ((int) pos)];
                }
                pos -= (long) segmentByteCount;
                s = s.f۴۲۱۳f;
            }
        } else {
            long pos2 = pos - j;
            o s2 = this.f۴۱۷۶c.f۴۲۱۴g;
            while (true) {
                int i3 = s2.f۴۲۱۰c;
                int i4 = s2.f۴۲۰۹b;
                pos2 += (long) (i3 - i4);
                if (pos2 >= 0) {
                    return s2.f۴۲۰۸a[i4 + ((int) pos2)];
                }
                s2 = s2.f۴۲۱۴g;
            }
        }
    }

    @Override // f.e
    public short readShort() {
        long j = this.f۴۱۷۷d;
        if (j >= 2) {
            o segment = this.f۴۱۷۶c;
            int pos = segment.f۴۲۰۹b;
            int limit = segment.f۴۲۱۰c;
            if (limit - pos < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] data = segment.f۴۲۰۸a;
            int pos2 = pos + 1;
            int pos3 = pos2 + 1;
            int s = ((data[pos] & 255) << 8) | (data[pos2] & 255);
            this.f۴۱۷۷d = j - 2;
            if (pos3 == limit) {
                this.f۴۱۷۶c = segment.b();
                p.a(segment);
            } else {
                segment.f۴۲۰۹b = pos3;
            }
            return (short) s;
        }
        throw new IllegalStateException("size < 2: " + this.f۴۱۷۷d);
    }

    @Override // f.e
    public int readInt() {
        long j = this.f۴۱۷۷d;
        if (j >= 4) {
            o segment = this.f۴۱۷۶c;
            int pos = segment.f۴۲۰۹b;
            int limit = segment.f۴۲۱۰c;
            if (limit - pos < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] data = segment.f۴۲۰۸a;
            int pos2 = pos + 1;
            int pos3 = pos2 + 1;
            int i = ((data[pos] & 255) << 24) | ((data[pos2] & 255) << 16);
            int pos4 = pos3 + 1;
            int i2 = i | ((data[pos3] & 255) << 8);
            int pos5 = pos4 + 1;
            int i3 = i2 | (data[pos4] & 255);
            this.f۴۱۷۷d = j - 4;
            if (pos5 == limit) {
                this.f۴۱۷۶c = segment.b();
                p.a(segment);
            } else {
                segment.f۴۲۰۹b = pos5;
            }
            return i3;
        }
        throw new IllegalStateException("size < 4: " + this.f۴۱۷۷d);
    }

    @Override // f.e
    public short c() {
        return u.a(readShort());
    }

    @Override // f.e
    public int h() {
        return u.a(readInt());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
        if (r4 == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return -r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return r1;
     */
    @Override // f.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long e() {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: f.c.e():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (r8 != r9) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        r15.f۴۱۷۶c = r6.b();
        f.p.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r6.f۴۲۰۹b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        if (r5 != false) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077 A[SYNTHETIC] */
    @Override // f.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long j() {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: f.c.j():long");
    }

    public f o() {
        return new f(g());
    }

    @Override // f.e
    public f b(long byteCount) {
        return new f(f(byteCount));
    }

    public String p() {
        try {
            return a(this.f۴۱۷۷d, u.f۴۲۲۲a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public String h(long byteCount) {
        return a(byteCount, u.f۴۲۲۲a);
    }

    public String a(long byteCount, Charset charset) {
        u.a(this.f۴۱۷۷d, 0, byteCount);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (byteCount > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + byteCount);
        } else if (byteCount == 0) {
            return "";
        } else {
            o s = this.f۴۱۷۶c;
            int i = s.f۴۲۰۹b;
            if (((long) i) + byteCount > ((long) s.f۴۲۱۰c)) {
                return new String(f(byteCount), charset);
            }
            String result = new String(s.f۴۲۰۸a, i, (int) byteCount, charset);
            s.f۴۲۰۹b = (int) (((long) s.f۴۲۰۹b) + byteCount);
            this.f۴۱۷۷d -= byteCount;
            if (s.f۴۲۰۹b == s.f۴۲۱۰c) {
                this.f۴۱۷۶c = s.b();
                p.a(s);
            }
            return result;
        }
    }

    @Override // f.e
    public String f() {
        return c(Long.MAX_VALUE);
    }

    @Override // f.e
    public String c(long limit) {
        if (limit >= 0) {
            long scanLength = Long.MAX_VALUE;
            if (limit != Long.MAX_VALUE) {
                scanLength = limit + 1;
            }
            long newline = a((byte) 10, 0, scanLength);
            if (newline != -1) {
                return i(newline);
            }
            if (scanLength < q() && g(scanLength - 1) == 13 && g(scanLength) == 10) {
                return i(scanLength);
            }
            c data = new c();
            a(data, 0, Math.min(32L, q()));
            throw new EOFException("\\n not found: limit=" + Math.min(q(), limit) + " content=" + data.o().b() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + limit);
    }

    /* access modifiers changed from: package-private */
    public String i(long newline) {
        if (newline <= 0 || g(newline - 1) != 13) {
            String result = h(newline);
            skip(1);
            return result;
        }
        String result2 = h(newline - 1);
        skip(2);
        return result2;
    }

    @Override // f.e
    public byte[] g() {
        try {
            return f(this.f۴۱۷۷d);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // f.e
    public byte[] f(long byteCount) {
        u.a(this.f۴۱۷۷d, 0, byteCount);
        if (byteCount <= 2147483647L) {
            byte[] result = new byte[((int) byteCount)];
            readFully(result);
            return result;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + byteCount);
    }

    @Override // f.e
    public void readFully(byte[] sink) {
        int offset = 0;
        while (offset < sink.length) {
            int read = a(sink, offset, sink.length - offset);
            if (read != -1) {
                offset += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int a(byte[] sink, int offset, int byteCount) {
        u.a((long) sink.length, (long) offset, (long) byteCount);
        o s = this.f۴۱۷۶c;
        if (s == null) {
            return -1;
        }
        int toCopy = Math.min(byteCount, s.f۴۲۱۰c - s.f۴۲۰۹b);
        System.arraycopy(s.f۴۲۰۸a, s.f۴۲۰۹b, sink, offset, toCopy);
        s.f۴۲۰۹b += toCopy;
        this.f۴۱۷۷d -= (long) toCopy;
        if (s.f۴۲۰۹b == s.f۴۲۱۰c) {
            this.f۴۱۷۶c = s.b();
            p.a(s);
        }
        return toCopy;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        o s = this.f۴۱۷۶c;
        if (s == null) {
            return -1;
        }
        int toCopy = Math.min(sink.remaining(), s.f۴۲۱۰c - s.f۴۲۰۹b);
        sink.put(s.f۴۲۰۸a, s.f۴۲۰۹b, toCopy);
        s.f۴۲۰۹b += toCopy;
        this.f۴۱۷۷d -= (long) toCopy;
        if (s.f۴۲۰۹b == s.f۴۲۱۰c) {
            this.f۴۱۷۶c = s.b();
            p.a(s);
        }
        return toCopy;
    }

    public void m() {
        try {
            skip(this.f۴۱۷۷d);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // f.e
    public void skip(long byteCount) {
        while (byteCount > 0) {
            o oVar = this.f۴۱۷۶c;
            if (oVar != null) {
                int toSkip = (int) Math.min(byteCount, (long) (oVar.f۴۲۱۰c - oVar.f۴۲۰۹b));
                this.f۴۱۷۷d -= (long) toSkip;
                byteCount -= (long) toSkip;
                o oVar2 = this.f۴۱۷۶c;
                oVar2.f۴۲۰۹b += toSkip;
                if (oVar2.f۴۲۰۹b == oVar2.f۴۲۱۰c) {
                    o toRecycle = this.f۴۱۷۶c;
                    this.f۴۱۷۶c = toRecycle.b();
                    p.a(toRecycle);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public c a(f byteString) {
        if (byteString != null) {
            byteString.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // f.d
    public c a(String string) {
        a(string, 0, string.length());
        return this;
    }

    public c a(String string, int beginIndex, int endIndex) {
        if (string == null) {
            throw new IllegalArgumentException("string == null");
        } else if (beginIndex < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + beginIndex);
        } else if (endIndex < beginIndex) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + endIndex + " < " + beginIndex);
        } else if (endIndex <= string.length()) {
            int runSize = beginIndex;
            while (runSize < endIndex) {
                int c2 = string.charAt(runSize);
                if (c2 < 128) {
                    o tail = b(1);
                    byte[] data = tail.f۴۲۰۸a;
                    int segmentOffset = tail.f۴۲۱۰c - runSize;
                    int runLimit = Math.min(endIndex, 8192 - segmentOffset);
                    int i = runSize + 1;
                    data[runSize + segmentOffset] = (byte) c2;
                    while (i < runLimit) {
                        int c3 = string.charAt(i);
                        if (c3 >= 128) {
                            break;
                        }
                        data[i + segmentOffset] = (byte) c3;
                        i++;
                    }
                    int i2 = tail.f۴۲۱۰c;
                    int runSize2 = (i + segmentOffset) - i2;
                    tail.f۴۲۱۰c = i2 + runSize2;
                    this.f۴۱۷۷d += (long) runSize2;
                    runSize = i;
                } else if (c2 < 2048) {
                    writeByte((c2 >> 6) | 192);
                    writeByte(128 | (c2 & 63));
                    runSize++;
                } else if (c2 < 55296 || c2 > 57343) {
                    writeByte((c2 >> 12) | 224);
                    writeByte(((c2 >> 6) & 63) | 128);
                    writeByte(128 | (c2 & 63));
                    runSize++;
                } else {
                    int low = runSize + 1 < endIndex ? string.charAt(runSize + 1) : 0;
                    if (c2 > 56319 || low < 56320 || low > 57343) {
                        writeByte(63);
                        runSize++;
                    } else {
                        int codePoint = (((-55297 & c2) << 10) | (-56321 & low)) + 65536;
                        writeByte((codePoint >> 18) | 240);
                        writeByte(((codePoint >> 12) & 63) | 128);
                        writeByte(((codePoint >> 6) & 63) | 128);
                        writeByte(128 | (codePoint & 63));
                        runSize += 2;
                    }
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + endIndex + " > " + string.length());
        }
    }

    public c c(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
        } else if (codePoint < 2048) {
            writeByte((codePoint >> 6) | 192);
            writeByte(128 | (codePoint & 63));
        } else if (codePoint < 65536) {
            if (codePoint < 55296 || codePoint > 57343) {
                writeByte((codePoint >> 12) | 224);
                writeByte(((codePoint >> 6) & 63) | 128);
                writeByte(128 | (codePoint & 63));
            } else {
                writeByte(63);
            }
        } else if (codePoint <= 1114111) {
            writeByte((codePoint >> 18) | 240);
            writeByte(((codePoint >> 12) & 63) | 128);
            writeByte(((codePoint >> 6) & 63) | 128);
            writeByte(128 | (codePoint & 63));
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(codePoint));
        }
        return this;
    }

    public c a(String string, int beginIndex, int endIndex, Charset charset) {
        if (string == null) {
            throw new IllegalArgumentException("string == null");
        } else if (beginIndex < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + beginIndex);
        } else if (endIndex < beginIndex) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + endIndex + " < " + beginIndex);
        } else if (endIndex > string.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + endIndex + " > " + string.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(u.f۴۲۲۲a)) {
            a(string, beginIndex, endIndex);
            return this;
        } else {
            byte[] data = string.substring(beginIndex, endIndex).getBytes(charset);
            write(data, 0, data.length);
            return this;
        }
    }

    @Override // f.d
    public c write(byte[] source) {
        if (source != null) {
            write(source, 0, source.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // f.d
    public c write(byte[] source, int offset, int byteCount) {
        if (source != null) {
            u.a((long) source.length, (long) offset, (long) byteCount);
            int limit = offset + byteCount;
            while (offset < limit) {
                o tail = b(1);
                int toCopy = Math.min(limit - offset, 8192 - tail.f۴۲۱۰c);
                System.arraycopy(source, offset, tail.f۴۲۰۸a, tail.f۴۲۱۰c, toCopy);
                offset += toCopy;
                tail.f۴۲۱۰c += toCopy;
            }
            this.f۴۱۷۷d += (long) byteCount;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        if (source != null) {
            int byteCount = source.remaining();
            int remaining = byteCount;
            while (remaining > 0) {
                o tail = b(1);
                int toCopy = Math.min(remaining, 8192 - tail.f۴۲۱۰c);
                source.get(tail.f۴۲۰۸a, tail.f۴۲۱۰c, toCopy);
                remaining -= toCopy;
                tail.f۴۲۱۰c += toCopy;
            }
            this.f۴۱۷۷d += (long) byteCount;
            return byteCount;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long a(s source) {
        if (source != null) {
            long totalBytesRead = 0;
            while (true) {
                long readCount = source.b(this, 8192);
                if (readCount == -1) {
                    return totalBytesRead;
                }
                totalBytesRead += readCount;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // f.d
    public c writeByte(int b2) {
        o tail = b(1);
        byte[] bArr = tail.f۴۲۰۸a;
        int i = tail.f۴۲۱۰c;
        tail.f۴۲۱۰c = i + 1;
        bArr[i] = (byte) b2;
        this.f۴۱۷۷d++;
        return this;
    }

    @Override // f.d
    public c writeShort(int s) {
        o tail = b(2);
        byte[] data = tail.f۴۲۰۸a;
        int limit = tail.f۴۲۱۰c;
        int limit2 = limit + 1;
        data[limit] = (byte) ((s >>> 8) & 255);
        data[limit2] = (byte) (s & 255);
        tail.f۴۲۱۰c = limit2 + 1;
        this.f۴۱۷۷d += 2;
        return this;
    }

    @Override // f.d
    public c writeInt(int i) {
        o tail = b(4);
        byte[] data = tail.f۴۲۰۸a;
        int limit = tail.f۴۲۱۰c;
        int limit2 = limit + 1;
        data[limit] = (byte) ((i >>> 24) & 255);
        int limit3 = limit2 + 1;
        data[limit2] = (byte) ((i >>> 16) & 255);
        int limit4 = limit3 + 1;
        data[limit3] = (byte) ((i >>> 8) & 255);
        data[limit4] = (byte) (i & 255);
        tail.f۴۲۱۰c = limit4 + 1;
        this.f۴۱۷۷d += 4;
        return this;
    }

    @Override // f.d
    public c e(long v) {
        int width;
        if (v == 0) {
            writeByte(48);
            return this;
        }
        boolean negative = false;
        if (v < 0) {
            v = -v;
            if (v < 0) {
                a("-9223372036854775808");
                return this;
            }
            negative = true;
        }
        if (v < 100000000) {
            width = v < 10000 ? v < 100 ? v < 10 ? 1 : 2 : v < 1000 ? 3 : 4 : v < 1000000 ? v < 100000 ? 5 : 6 : v < 10000000 ? 7 : 8;
        } else if (v < 1000000000000L) {
            width = v < 10000000000L ? v < 1000000000 ? 9 : 10 : v < 100000000000L ? 11 : 12;
        } else if (v < 1000000000000000L) {
            width = v < 10000000000000L ? 13 : v < 100000000000000L ? 14 : 15;
        } else if (v < 100000000000000000L) {
            width = v < 10000000000000000L ? 16 : 17;
        } else {
            width = v < 1000000000000000000L ? 18 : 19;
        }
        if (negative) {
            width++;
        }
        o tail = b(width);
        byte[] data = tail.f۴۲۰۸a;
        int pos = tail.f۴۲۱۰c + width;
        while (v != 0) {
            pos--;
            data[pos] = f۴۱۷۵e[(int) (v % 10)];
            v /= 10;
        }
        if (negative) {
            data[pos - 1] = 45;
        }
        tail.f۴۲۱۰c += width;
        this.f۴۱۷۷d += (long) width;
        return this;
    }

    @Override // f.d
    public c a(long v) {
        if (v == 0) {
            writeByte(48);
            return this;
        }
        int width = (Long.numberOfTrailingZeros(Long.highestOneBit(v)) / 4) + 1;
        o tail = b(width);
        byte[] data = tail.f۴۲۰۸a;
        int start = tail.f۴۲۱۰c;
        for (int pos = (tail.f۴۲۱۰c + width) - 1; pos >= start; pos--) {
            data[pos] = f۴۱۷۵e[(int) (15 & v)];
            v >>>= 4;
        }
        tail.f۴۲۱۰c += width;
        this.f۴۱۷۷d += (long) width;
        return this;
    }

    /* access modifiers changed from: package-private */
    public o b(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException();
        }
        o oVar = this.f۴۱۷۶c;
        if (oVar == null) {
            this.f۴۱۷۶c = p.a();
            o oVar2 = this.f۴۱۷۶c;
            oVar2.f۴۲۱۴g = oVar2;
            oVar2.f۴۲۱۳f = oVar2;
            return oVar2;
        }
        o tail = oVar.f۴۲۱۴g;
        if (tail.f۴۲۱۰c + minimumCapacity > 8192 || !tail.f۴۲۱۲e) {
            return tail.a(p.a());
        }
        return tail;
    }

    /* JADX INFO: Multiple debug info for r0v7 f.o: [D('tail' f.o), D('segmentToMove' f.o)] */
    @Override // f.r
    public void a(c source, long byteCount) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        } else if (source != this) {
            u.a(source.f۴۱۷۷d, 0, byteCount);
            while (byteCount > 0) {
                o oVar = source.f۴۱۷۶c;
                if (byteCount < ((long) (oVar.f۴۲۱۰c - oVar.f۴۲۰۹b))) {
                    o oVar2 = this.f۴۱۷۶c;
                    o tail = oVar2 != null ? oVar2.f۴۲۱۴g : null;
                    if (tail != null && tail.f۴۲۱۲e) {
                        if ((((long) tail.f۴۲۱۰c) + byteCount) - ((long) (tail.f۴۲۱۱d ? 0 : tail.f۴۲۰۹b)) <= 8192) {
                            source.f۴۱۷۶c.a(tail, (int) byteCount);
                            source.f۴۱۷۷d -= byteCount;
                            this.f۴۱۷۷d += byteCount;
                            return;
                        }
                    }
                    source.f۴۱۷۶c = source.f۴۱۷۶c.a((int) byteCount);
                }
                o segmentToMove = source.f۴۱۷۶c;
                long movedByteCount = (long) (segmentToMove.f۴۲۱۰c - segmentToMove.f۴۲۰۹b);
                source.f۴۱۷۶c = segmentToMove.b();
                o oVar3 = this.f۴۱۷۶c;
                if (oVar3 == null) {
                    this.f۴۱۷۶c = segmentToMove;
                    o oVar4 = this.f۴۱۷۶c;
                    oVar4.f۴۲۱۴g = oVar4;
                    oVar4.f۴۲۱۳f = oVar4;
                } else {
                    oVar3.f۴۲۱۴g.a(segmentToMove).a();
                }
                source.f۴۱۷۷d -= movedByteCount;
                this.f۴۱۷۷d += movedByteCount;
                byteCount -= movedByteCount;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    @Override // f.s
    public long b(c sink, long byteCount) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (byteCount >= 0) {
            long j = this.f۴۱۷۷d;
            if (j == 0) {
                return -1;
            }
            if (byteCount > j) {
                byteCount = this.f۴۱۷۷d;
            }
            sink.a(this, byteCount);
            return byteCount;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        }
    }

    @Override // f.e
    public long a(byte b2) {
        return a(b2, 0, Long.MAX_VALUE);
    }

    public long a(byte b2, long fromIndex, long toIndex) {
        o s;
        long offset;
        if (fromIndex < 0 || toIndex < fromIndex) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f۴۱۷۷d), Long.valueOf(fromIndex), Long.valueOf(toIndex)));
        }
        if (toIndex > this.f۴۱۷۷d) {
            toIndex = this.f۴۱۷۷d;
        }
        if (fromIndex == toIndex || (s = this.f۴۱۷۶c) == null) {
            return -1;
        }
        if (this.f۴۱۷۷d - fromIndex >= fromIndex) {
            offset = 0;
            while (true) {
                long nextOffset = ((long) (s.f۴۲۱۰c - s.f۴۲۰۹b)) + offset;
                if (nextOffset >= fromIndex) {
                    break;
                }
                s = s.f۴۲۱۳f;
                offset = nextOffset;
            }
        } else {
            offset = this.f۴۱۷۷d;
            while (offset > fromIndex) {
                s = s.f۴۲۱۴g;
                offset -= (long) (s.f۴۲۱۰c - s.f۴۲۰۹b);
            }
        }
        while (offset < toIndex) {
            byte[] data = s.f۴۲۰۸a;
            int limit = (int) Math.min((long) s.f۴۲۱۰c, (((long) s.f۴۲۰۹b) + toIndex) - offset);
            for (int pos = (int) ((((long) s.f۴۲۰۹b) + fromIndex) - offset); pos < limit; pos++) {
                if (data[pos] == b2) {
                    return ((long) (pos - s.f۴۲۰۹b)) + offset;
                }
            }
            offset += (long) (s.f۴۲۱۰c - s.f۴۲۰۹b);
            fromIndex = offset;
            s = s.f۴۲۱۳f;
        }
        return -1;
    }

    @Override // f.e
    public boolean a(long offset, f bytes) {
        return a(offset, bytes, 0, bytes.f());
    }

    public boolean a(long offset, f bytes, int bytesOffset, int byteCount) {
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || this.f۴۱۷۷d - offset < ((long) byteCount) || bytes.f() - bytesOffset < byteCount) {
            return false;
        }
        for (int i = 0; i < byteCount; i++) {
            if (g(((long) i) + offset) != bytes.a(bytesOffset + i)) {
                return false;
            }
        }
        return true;
    }

    @Override // f.r, f.d, java.io.Flushable
    public void flush() {
    }

    public boolean isOpen() {
        return true;
    }

    @Override // f.s, f.r, java.lang.AutoCloseable, java.io.Closeable, java.nio.channels.Channel
    public void close() {
    }

    @Override // f.s, f.r
    public t b() {
        return t.f۴۲۱۸d;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        c that = (c) o;
        long j = this.f۴۱۷۷d;
        if (j != that.f۴۱۷۷d) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        o sa = this.f۴۱۷۶c;
        o sb = that.f۴۱۷۶c;
        int posA = sa.f۴۲۰۹b;
        int posB = sb.f۴۲۰۹b;
        long pos = 0;
        while (pos < this.f۴۱۷۷d) {
            long count = (long) Math.min(sa.f۴۲۱۰c - posA, sb.f۴۲۱۰c - posB);
            int i = 0;
            while (((long) i) < count) {
                int posA2 = posA + 1;
                int posB2 = posB + 1;
                if (sa.f۴۲۰۸a[posA] != sb.f۴۲۰۸a[posB]) {
                    return false;
                }
                i++;
                posA = posA2;
                posB = posB2;
            }
            if (posA == sa.f۴۲۱۰c) {
                sa = sa.f۴۲۱۳f;
                posA = sa.f۴۲۰۹b;
            }
            if (posB == sb.f۴۲۱۰c) {
                sb = sb.f۴۲۱۳f;
                posB = sb.f۴۲۰۹b;
            }
            pos += count;
        }
        return true;
    }

    public int hashCode() {
        o s = this.f۴۱۷۶c;
        if (s == null) {
            return 0;
        }
        int result = 1;
        do {
            int limit = s.f۴۲۱۰c;
            for (int pos = s.f۴۲۰۹b; pos < limit; pos++) {
                result = (result * 31) + s.f۴۲۰۸a[pos];
            }
            s = s.f۴۲۱۳f;
        } while (s != this.f۴۱۷۶c);
        return result;
    }

    public String toString() {
        return r().toString();
    }

    @Override // java.lang.Object
    public c clone() {
        c result = new c();
        if (this.f۴۱۷۷d == 0) {
            return result;
        }
        result.f۴۱۷۶c = this.f۴۱۷۶c.c();
        o oVar = result.f۴۱۷۶c;
        oVar.f۴۲۱۴g = oVar;
        oVar.f۴۲۱۳f = oVar;
        for (o s = this.f۴۱۷۶c.f۴۲۱۳f; s != this.f۴۱۷۶c; s = s.f۴۲۱۳f) {
            result.f۴۱۷۶c.f۴۲۱۴g.a(s.c());
        }
        result.f۴۱۷۷d = this.f۴۱۷۷d;
        return result;
    }

    public f r() {
        long j = this.f۴۱۷۷d;
        if (j <= 2147483647L) {
            return a((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f۴۱۷۷d);
    }

    public f a(int byteCount) {
        if (byteCount == 0) {
            return f.f۴۱۸۰g;
        }
        return new q(this, byteCount);
    }
}
