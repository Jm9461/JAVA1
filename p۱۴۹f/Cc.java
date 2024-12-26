package p۱۴۹f;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: f.c  reason: invalid class name */
public final class Cc implements AbstractCe, AbstractCd, Cloneable, ByteChannel {

    /* renamed from: e  reason: contains not printable characters */
    private static final byte[] f۱۶۲۶۸e = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: c  reason: contains not printable characters */
    Co f۱۶۲۶۹c;

    /* renamed from: d  reason: contains not printable characters */
    long f۱۶۲۷۰d;

    /* renamed from: q  reason: contains not printable characters */
    public long m۱۹۴۱۰q() {
        return this.f۱۶۲۷۰d;
    }

    @Override // p۱۴۹f.AbstractCe, p۱۴۹f.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۹۳۶۹a() {
        return this;
    }

    @Override // p۱۴۹f.AbstractCd
    /* renamed from: d  reason: contains not printable characters */
    public Cc m۱۹۳۹۰d() {
        return this;
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۹۴۰۳i() {
        return this.f۱۶۲۷۰d == 0;
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۹۳۹۲d(long byteCount) {
        if (this.f۱۶۲۷۰d < byteCount) {
            throw new EOFException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.c$a  reason: invalid class name */
    public class Ca extends InputStream {
        Ca() {
        }

        @Override // java.io.InputStream
        public int read() {
            Cc cVar = Cc.this;
            if (cVar.f۱۶۲۷۰d > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int offset, int byteCount) {
            return Cc.this.m۱۹۳۶۵a(sink, offset, byteCount);
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(Cc.this.f۱۶۲۷۰d, 2147483647L);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
        }

        public String toString() {
            return Cc.this + ".inputStream()";
        }
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: k  reason: contains not printable characters */
    public InputStream m۱۹۴۰۵k() {
        return new Ca();
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۹۳۷۱a(Cc out, long offset, long byteCount) {
        if (out != null) {
            Cu.m۱۹۵۶۹a(this.f۱۶۲۷۰d, offset, byteCount);
            if (byteCount == 0) {
                return this;
            }
            out.f۱۶۲۷۰d += byteCount;
            Co s = this.f۱۶۲۶۹c;
            while (true) {
                int i = s.f۱۶۳۰۴c;
                int i2 = s.f۱۶۳۰۳b;
                if (offset < ((long) (i - i2))) {
                    break;
                }
                offset -= (long) (i - i2);
                s = s.f۱۶۳۰۷f;
            }
            while (byteCount > 0) {
                Co copy = s.m۱۹۵۳۳c();
                copy.f۱۶۳۰۳b = (int) (((long) copy.f۱۶۳۰۳b) + offset);
                copy.f۱۶۳۰۴c = Math.min(copy.f۱۶۳۰۳b + ((int) byteCount), copy.f۱۶۳۰۴c);
                Co oVar = out.f۱۶۲۶۹c;
                if (oVar == null) {
                    copy.f۱۶۳۰۸g = copy;
                    copy.f۱۶۳۰۷f = copy;
                    out.f۱۶۲۶۹c = copy;
                } else {
                    oVar.f۱۶۳۰۸g.m۱۹۵۲۹a(copy);
                }
                byteCount -= (long) (copy.f۱۶۳۰۴c - copy.f۱۶۳۰۳b);
                offset = 0;
                s = s.f۱۶۳۰۷f;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: n  reason: contains not printable characters */
    public long m۱۹۴۰۷n() {
        long result = this.f۱۶۲۷۰d;
        if (result == 0) {
            return 0;
        }
        Co tail = this.f۱۶۲۶۹c.f۱۶۳۰۸g;
        int i = tail.f۱۶۳۰۴c;
        if (i >= 8192 || !tail.f۱۶۳۰۶e) {
            return result;
        }
        return result - ((long) (i - tail.f۱۶۳۰۳b));
    }

    /* JADX INFO: Multiple debug info for r3v1 byte: [D('pos' int), D('b' byte)] */
    @Override // p۱۴۹f.AbstractCe
    public byte readByte() {
        long j = this.f۱۶۲۷۰d;
        if (j != 0) {
            Co segment = this.f۱۶۲۶۹c;
            int pos = segment.f۱۶۳۰۳b;
            int limit = segment.f۱۶۳۰۴c;
            int pos2 = pos + 1;
            byte b = segment.f۱۶۳۰۲a[pos];
            this.f۱۶۲۷۰d = j - 1;
            if (pos2 == limit) {
                this.f۱۶۲۶۹c = segment.m۱۹۵۳۲b();
                Cp.m۱۹۵۳۵a(segment);
            } else {
                segment.f۱۶۳۰۳b = pos2;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: g  reason: contains not printable characters */
    public byte m۱۹۳۹۸g(long pos) {
        Cu.m۱۹۵۶۹a(this.f۱۶۲۷۰d, pos, 1);
        long j = this.f۱۶۲۷۰d;
        if (j - pos > pos) {
            Co s = this.f۱۶۲۶۹c;
            while (true) {
                int i = s.f۱۶۳۰۴c;
                int i2 = s.f۱۶۳۰۳b;
                int segmentByteCount = i - i2;
                if (pos < ((long) segmentByteCount)) {
                    return s.f۱۶۳۰۲a[i2 + ((int) pos)];
                }
                pos -= (long) segmentByteCount;
                s = s.f۱۶۳۰۷f;
            }
        } else {
            long pos2 = pos - j;
            Co s2 = this.f۱۶۲۶۹c.f۱۶۳۰۸g;
            while (true) {
                int i3 = s2.f۱۶۳۰۴c;
                int i4 = s2.f۱۶۳۰۳b;
                pos2 += (long) (i3 - i4);
                if (pos2 >= 0) {
                    return s2.f۱۶۳۰۲a[i4 + ((int) pos2)];
                }
                s2 = s2.f۱۶۳۰۸g;
            }
        }
    }

    @Override // p۱۴۹f.AbstractCe
    public short readShort() {
        long j = this.f۱۶۲۷۰d;
        if (j >= 2) {
            Co segment = this.f۱۶۲۶۹c;
            int pos = segment.f۱۶۳۰۳b;
            int limit = segment.f۱۶۳۰۴c;
            if (limit - pos < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] data = segment.f۱۶۳۰۲a;
            int pos2 = pos + 1;
            int pos3 = pos2 + 1;
            int s = ((data[pos] & 255) << 8) | (data[pos2] & 255);
            this.f۱۶۲۷۰d = j - 2;
            if (pos3 == limit) {
                this.f۱۶۲۶۹c = segment.m۱۹۵۳۲b();
                Cp.m۱۹۵۳۵a(segment);
            } else {
                segment.f۱۶۳۰۳b = pos3;
            }
            return (short) s;
        }
        throw new IllegalStateException("size < 2: " + this.f۱۶۲۷۰d);
    }

    @Override // p۱۴۹f.AbstractCe
    public int readInt() {
        long j = this.f۱۶۲۷۰d;
        if (j >= 4) {
            Co segment = this.f۱۶۲۶۹c;
            int pos = segment.f۱۶۳۰۳b;
            int limit = segment.f۱۶۳۰۴c;
            if (limit - pos < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] data = segment.f۱۶۳۰۲a;
            int pos2 = pos + 1;
            int pos3 = pos2 + 1;
            int i = ((data[pos] & 255) << 24) | ((data[pos2] & 255) << 16);
            int pos4 = pos3 + 1;
            int i2 = i | ((data[pos3] & 255) << 8);
            int pos5 = pos4 + 1;
            int i3 = i2 | (data[pos4] & 255);
            this.f۱۶۲۷۰d = j - 4;
            if (pos5 == limit) {
                this.f۱۶۲۶۹c = segment.m۱۹۵۳۲b();
                Cp.m۱۹۵۳۵a(segment);
            } else {
                segment.f۱۶۳۰۳b = pos5;
            }
            return i3;
        }
        throw new IllegalStateException("size < 4: " + this.f۱۶۲۷۰d);
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: c  reason: contains not printable characters */
    public short m۱۹۳۸۹c() {
        return Cu.m۱۹۵۶۸a(readShort());
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: h  reason: contains not printable characters */
    public int m۱۹۴۰۰h() {
        return Cu.m۱۹۵۶۷a(readInt());
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
    @Override // p۱۴۹f.AbstractCe
    /* renamed from: e  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m۱۹۳۹۳e() {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۴۹f.Cc.m۱۹۳۹۳e():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (r8 != r9) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        r15.f۱۶۲۶۹c = r6.m۱۹۵۳۲b();
        p۱۴۹f.Cp.m۱۹۵۳۵a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r6.f۱۶۳۰۳b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        if (r5 != false) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077 A[SYNTHETIC] */
    @Override // p۱۴۹f.AbstractCe
    /* renamed from: j  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m۱۹۴۰۴j() {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۴۹f.Cc.m۱۹۴۰۴j():long");
    }

    /* renamed from: o  reason: contains not printable characters */
    public Cf m۱۹۴۰۸o() {
        return new Cf(m۱۹۳۹۹g());
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: b  reason: contains not printable characters */
    public Cf m۱۹۳۸۴b(long byteCount) {
        return new Cf(m۱۹۳۹۷f(byteCount));
    }

    /* renamed from: p  reason: contains not printable characters */
    public String m۱۹۴۰۹p() {
        try {
            return m۱۹۳۷۹a(this.f۱۶۲۷۰d, Cu.f۱۶۳۱۷a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    public String m۱۹۴۰۱h(long byteCount) {
        return m۱۹۳۷۹a(byteCount, Cu.f۱۶۳۱۷a);
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۳۷۹a(long byteCount, Charset charset) {
        Cu.m۱۹۵۶۹a(this.f۱۶۲۷۰d, 0, byteCount);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (byteCount > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + byteCount);
        } else if (byteCount == 0) {
            return "";
        } else {
            Co s = this.f۱۶۲۶۹c;
            int i = s.f۱۶۳۰۳b;
            if (((long) i) + byteCount > ((long) s.f۱۶۳۰۴c)) {
                return new String(m۱۹۳۹۷f(byteCount), charset);
            }
            String result = new String(s.f۱۶۳۰۲a, i, (int) byteCount, charset);
            s.f۱۶۳۰۳b = (int) (((long) s.f۱۶۳۰۳b) + byteCount);
            this.f۱۶۲۷۰d -= byteCount;
            if (s.f۱۶۳۰۳b == s.f۱۶۳۰۴c) {
                this.f۱۶۲۶۹c = s.m۱۹۵۳۲b();
                Cp.m۱۹۵۳۵a(s);
            }
            return result;
        }
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: f  reason: contains not printable characters */
    public String m۱۹۳۹۶f() {
        return m۱۹۳۸۸c(Long.MAX_VALUE);
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: c  reason: contains not printable characters */
    public String m۱۹۳۸۸c(long limit) {
        if (limit >= 0) {
            long scanLength = Long.MAX_VALUE;
            if (limit != Long.MAX_VALUE) {
                scanLength = limit + 1;
            }
            long newline = m۱۹۳۶۷a((byte) 10, 0, scanLength);
            if (newline != -1) {
                return m۱۹۴۰۲i(newline);
            }
            if (scanLength < m۱۹۴۱۰q() && m۱۹۳۹۸g(scanLength - 1) == 13 && m۱۹۳۹۸g(scanLength) == 10) {
                return m۱۹۴۰۲i(scanLength);
            }
            Cc data = new Cc();
            m۱۹۳۷۱a(data, 0, Math.min(32L, m۱۹۴۱۰q()));
            throw new EOFException("\\n not found: limit=" + Math.min(m۱۹۴۱۰q(), limit) + " content=" + data.m۱۹۴۰۸o().m۱۹۴۴۶b() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + limit);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public String m۱۹۴۰۲i(long newline) {
        if (newline <= 0 || m۱۹۳۹۸g(newline - 1) != 13) {
            String result = m۱۹۴۰۱h(newline);
            skip(1);
            return result;
        }
        String result2 = m۱۹۴۰۱h(newline - 1);
        skip(2);
        return result2;
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: g  reason: contains not printable characters */
    public byte[] m۱۹۳۹۹g() {
        try {
            return m۱۹۳۹۷f(this.f۱۶۲۷۰d);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: f  reason: contains not printable characters */
    public byte[] m۱۹۳۹۷f(long byteCount) {
        Cu.m۱۹۵۶۹a(this.f۱۶۲۷۰d, 0, byteCount);
        if (byteCount <= 2147483647L) {
            byte[] result = new byte[((int) byteCount)];
            readFully(result);
            return result;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + byteCount);
    }

    @Override // p۱۴۹f.AbstractCe
    public void readFully(byte[] sink) {
        int offset = 0;
        while (offset < sink.length) {
            int read = m۱۹۳۶۵a(sink, offset, sink.length - offset);
            if (read != -1) {
                offset += read;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۹۳۶۵a(byte[] sink, int offset, int byteCount) {
        Cu.m۱۹۵۶۹a((long) sink.length, (long) offset, (long) byteCount);
        Co s = this.f۱۶۲۶۹c;
        if (s == null) {
            return -1;
        }
        int toCopy = Math.min(byteCount, s.f۱۶۳۰۴c - s.f۱۶۳۰۳b);
        System.arraycopy(s.f۱۶۳۰۲a, s.f۱۶۳۰۳b, sink, offset, toCopy);
        s.f۱۶۳۰۳b += toCopy;
        this.f۱۶۲۷۰d -= (long) toCopy;
        if (s.f۱۶۳۰۳b == s.f۱۶۳۰۴c) {
            this.f۱۶۲۶۹c = s.m۱۹۵۳۲b();
            Cp.m۱۹۵۳۵a(s);
        }
        return toCopy;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Co s = this.f۱۶۲۶۹c;
        if (s == null) {
            return -1;
        }
        int toCopy = Math.min(sink.remaining(), s.f۱۶۳۰۴c - s.f۱۶۳۰۳b);
        sink.put(s.f۱۶۳۰۲a, s.f۱۶۳۰۳b, toCopy);
        s.f۱۶۳۰۳b += toCopy;
        this.f۱۶۲۷۰d -= (long) toCopy;
        if (s.f۱۶۳۰۳b == s.f۱۶۳۰۴c) {
            this.f۱۶۲۶۹c = s.m۱۹۵۳۲b();
            Cp.m۱۹۵۳۵a(s);
        }
        return toCopy;
    }

    /* renamed from: m  reason: contains not printable characters */
    public void m۱۹۴۰۶m() {
        try {
            skip(this.f۱۶۲۷۰d);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p۱۴۹f.AbstractCe
    public void skip(long byteCount) {
        while (byteCount > 0) {
            Co oVar = this.f۱۶۲۶۹c;
            if (oVar != null) {
                int toSkip = (int) Math.min(byteCount, (long) (oVar.f۱۶۳۰۴c - oVar.f۱۶۳۰۳b));
                this.f۱۶۲۷۰d -= (long) toSkip;
                byteCount -= (long) toSkip;
                Co oVar2 = this.f۱۶۲۶۹c;
                oVar2.f۱۶۳۰۳b += toSkip;
                if (oVar2.f۱۶۳۰۳b == oVar2.f۱۶۳۰۴c) {
                    Co toRecycle = this.f۱۶۲۶۹c;
                    this.f۱۶۲۶۹c = toRecycle.m۱۹۵۳۲b();
                    Cp.m۱۹۵۳۵a(toRecycle);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۹۳۷۲a(Cf byteString) {
        if (byteString != null) {
            byteString.m۱۹۴۴۳a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // p۱۴۹f.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۹۳۷۳a(String string) {
        m۱۹۳۷۴a(string, 0, string.length());
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۹۳۷۴a(String string, int beginIndex, int endIndex) {
        if (string == null) {
            throw new IllegalArgumentException("string == null");
        } else if (beginIndex < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + beginIndex);
        } else if (endIndex < beginIndex) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + endIndex + " < " + beginIndex);
        } else if (endIndex <= string.length()) {
            int runSize = beginIndex;
            while (runSize < endIndex) {
                int c = string.charAt(runSize);
                if (c < 128) {
                    Co tail = m۱۹۳۸۵b(1);
                    byte[] data = tail.f۱۶۳۰۲a;
                    int segmentOffset = tail.f۱۶۳۰۴c - runSize;
                    int runLimit = Math.min(endIndex, 8192 - segmentOffset);
                    int i = runSize + 1;
                    data[runSize + segmentOffset] = (byte) c;
                    while (i < runLimit) {
                        int c2 = string.charAt(i);
                        if (c2 >= 128) {
                            break;
                        }
                        data[i + segmentOffset] = (byte) c2;
                        i++;
                    }
                    int i2 = tail.f۱۶۳۰۴c;
                    int runSize2 = (i + segmentOffset) - i2;
                    tail.f۱۶۳۰۴c = i2 + runSize2;
                    this.f۱۶۲۷۰d += (long) runSize2;
                    runSize = i;
                } else if (c < 2048) {
                    writeByte((c >> 6) | 192);
                    writeByte(128 | (c & 63));
                    runSize++;
                } else if (c < 55296 || c > 57343) {
                    writeByte((c >> 12) | 224);
                    writeByte(((c >> 6) & 63) | 128);
                    writeByte(128 | (c & 63));
                    runSize++;
                } else {
                    int low = runSize + 1 < endIndex ? string.charAt(runSize + 1) : 0;
                    if (c > 56319 || low < 56320 || low > 57343) {
                        writeByte(63);
                        runSize++;
                    } else {
                        int codePoint = (((-55297 & c) << 10) | (-56321 & low)) + 65536;
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

    /* renamed from: c  reason: contains not printable characters */
    public Cc m۱۹۳۸۷c(int codePoint) {
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

    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۹۳۷۵a(String string, int beginIndex, int endIndex, Charset charset) {
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
        } else if (charset.equals(Cu.f۱۶۳۱۷a)) {
            m۱۹۳۷۴a(string, beginIndex, endIndex);
            return this;
        } else {
            byte[] data = string.substring(beginIndex, endIndex).getBytes(charset);
            write(data, 0, data.length);
            return this;
        }
    }

    @Override // p۱۴۹f.AbstractCd
    public Cc write(byte[] source) {
        if (source != null) {
            write(source, 0, source.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // p۱۴۹f.AbstractCd
    public Cc write(byte[] source, int offset, int byteCount) {
        if (source != null) {
            Cu.m۱۹۵۶۹a((long) source.length, (long) offset, (long) byteCount);
            int limit = offset + byteCount;
            while (offset < limit) {
                Co tail = m۱۹۳۸۵b(1);
                int toCopy = Math.min(limit - offset, 8192 - tail.f۱۶۳۰۴c);
                System.arraycopy(source, offset, tail.f۱۶۳۰۲a, tail.f۱۶۳۰۴c, toCopy);
                offset += toCopy;
                tail.f۱۶۳۰۴c += toCopy;
            }
            this.f۱۶۲۷۰d += (long) byteCount;
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
                Co tail = m۱۹۳۸۵b(1);
                int toCopy = Math.min(remaining, 8192 - tail.f۱۶۳۰۴c);
                source.get(tail.f۱۶۳۰۲a, tail.f۱۶۳۰۴c, toCopy);
                remaining -= toCopy;
                tail.f۱۶۳۰۴c += toCopy;
            }
            this.f۱۶۲۷۰d += (long) byteCount;
            return byteCount;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a  reason: contains not printable characters */
    public long m۱۹۳۶۸a(AbstractCs source) {
        if (source != null) {
            long totalBytesRead = 0;
            while (true) {
                long readCount = source.m۱۹۵۵۴b(this, 8192);
                if (readCount == -1) {
                    return totalBytesRead;
                }
                totalBytesRead += readCount;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // p۱۴۹f.AbstractCd
    public Cc writeByte(int b) {
        Co tail = m۱۹۳۸۵b(1);
        byte[] bArr = tail.f۱۶۳۰۲a;
        int i = tail.f۱۶۳۰۴c;
        tail.f۱۶۳۰۴c = i + 1;
        bArr[i] = (byte) b;
        this.f۱۶۲۷۰d++;
        return this;
    }

    @Override // p۱۴۹f.AbstractCd
    public Cc writeShort(int s) {
        Co tail = m۱۹۳۸۵b(2);
        byte[] data = tail.f۱۶۳۰۲a;
        int limit = tail.f۱۶۳۰۴c;
        int limit2 = limit + 1;
        data[limit] = (byte) ((s >>> 8) & 255);
        data[limit2] = (byte) (s & 255);
        tail.f۱۶۳۰۴c = limit2 + 1;
        this.f۱۶۲۷۰d += 2;
        return this;
    }

    @Override // p۱۴۹f.AbstractCd
    public Cc writeInt(int i) {
        Co tail = m۱۹۳۸۵b(4);
        byte[] data = tail.f۱۶۳۰۲a;
        int limit = tail.f۱۶۳۰۴c;
        int limit2 = limit + 1;
        data[limit] = (byte) ((i >>> 24) & 255);
        int limit3 = limit2 + 1;
        data[limit2] = (byte) ((i >>> 16) & 255);
        int limit4 = limit3 + 1;
        data[limit3] = (byte) ((i >>> 8) & 255);
        data[limit4] = (byte) (i & 255);
        tail.f۱۶۳۰۴c = limit4 + 1;
        this.f۱۶۲۷۰d += 4;
        return this;
    }

    @Override // p۱۴۹f.AbstractCd
    /* renamed from: e  reason: contains not printable characters */
    public Cc m۱۹۳۹۴e(long v) {
        int width;
        if (v == 0) {
            writeByte(48);
            return this;
        }
        boolean negative = false;
        if (v < 0) {
            v = -v;
            if (v < 0) {
                m۱۹۳۷۳a("-9223372036854775808");
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
        Co tail = m۱۹۳۸۵b(width);
        byte[] data = tail.f۱۶۳۰۲a;
        int pos = tail.f۱۶۳۰۴c + width;
        while (v != 0) {
            pos--;
            data[pos] = f۱۶۲۶۸e[(int) (v % 10)];
            v /= 10;
        }
        if (negative) {
            data[pos - 1] = 45;
        }
        tail.f۱۶۳۰۴c += width;
        this.f۱۶۲۷۰d += (long) width;
        return this;
    }

    @Override // p۱۴۹f.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۹۳۷۰a(long v) {
        if (v == 0) {
            writeByte(48);
            return this;
        }
        int width = (Long.numberOfTrailingZeros(Long.highestOneBit(v)) / 4) + 1;
        Co tail = m۱۹۳۸۵b(width);
        byte[] data = tail.f۱۶۳۰۲a;
        int start = tail.f۱۶۳۰۴c;
        for (int pos = (tail.f۱۶۳۰۴c + width) - 1; pos >= start; pos--) {
            data[pos] = f۱۶۲۶۸e[(int) (15 & v)];
            v >>>= 4;
        }
        tail.f۱۶۳۰۴c += width;
        this.f۱۶۲۷۰d += (long) width;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public Co m۱۹۳۸۵b(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException();
        }
        Co oVar = this.f۱۶۲۶۹c;
        if (oVar == null) {
            this.f۱۶۲۶۹c = Cp.m۱۹۵۳۴a();
            Co oVar2 = this.f۱۶۲۶۹c;
            oVar2.f۱۶۳۰۸g = oVar2;
            oVar2.f۱۶۳۰۷f = oVar2;
            return oVar2;
        }
        Co tail = oVar.f۱۶۳۰۸g;
        if (tail.f۱۶۳۰۴c + minimumCapacity > 8192 || !tail.f۱۶۳۰۶e) {
            return tail.m۱۹۵۲۹a(Cp.m۱۹۵۳۴a());
        }
        return tail;
    }

    /* JADX INFO: Multiple debug info for r0v7 f.o: [D('tail' f.o), D('segmentToMove' f.o)] */
    @Override // p۱۴۹f.AbstractCr
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۳۸۰a(Cc source, long byteCount) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        } else if (source != this) {
            Cu.m۱۹۵۶۹a(source.f۱۶۲۷۰d, 0, byteCount);
            while (byteCount > 0) {
                Co oVar = source.f۱۶۲۶۹c;
                if (byteCount < ((long) (oVar.f۱۶۳۰۴c - oVar.f۱۶۳۰۳b))) {
                    Co oVar2 = this.f۱۶۲۶۹c;
                    Co tail = oVar2 != null ? oVar2.f۱۶۳۰۸g : null;
                    if (tail != null && tail.f۱۶۳۰۶e) {
                        if ((((long) tail.f۱۶۳۰۴c) + byteCount) - ((long) (tail.f۱۶۳۰۵d ? 0 : tail.f۱۶۳۰۳b)) <= 8192) {
                            source.f۱۶۲۶۹c.m۱۹۵۳۱a(tail, (int) byteCount);
                            source.f۱۶۲۷۰d -= byteCount;
                            this.f۱۶۲۷۰d += byteCount;
                            return;
                        }
                    }
                    source.f۱۶۲۶۹c = source.f۱۶۲۶۹c.m۱۹۵۲۸a((int) byteCount);
                }
                Co segmentToMove = source.f۱۶۲۶۹c;
                long movedByteCount = (long) (segmentToMove.f۱۶۳۰۴c - segmentToMove.f۱۶۳۰۳b);
                source.f۱۶۲۶۹c = segmentToMove.m۱۹۵۳۲b();
                Co oVar3 = this.f۱۶۲۶۹c;
                if (oVar3 == null) {
                    this.f۱۶۲۶۹c = segmentToMove;
                    Co oVar4 = this.f۱۶۲۶۹c;
                    oVar4.f۱۶۳۰۸g = oVar4;
                    oVar4.f۱۶۳۰۷f = oVar4;
                } else {
                    oVar3.f۱۶۳۰۸g.m۱۹۵۲۹a(segmentToMove).m۱۹۵۳۰a();
                }
                source.f۱۶۲۷۰d -= movedByteCount;
                this.f۱۶۲۷۰d += movedByteCount;
                byteCount -= movedByteCount;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    @Override // p۱۴۹f.AbstractCs
    /* renamed from: b  reason: contains not printable characters */
    public long m۱۹۳۸۳b(Cc sink, long byteCount) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (byteCount >= 0) {
            long j = this.f۱۶۲۷۰d;
            if (j == 0) {
                return -1;
            }
            if (byteCount > j) {
                byteCount = this.f۱۶۲۷۰d;
            }
            sink.m۱۹۳۸۰a(this, byteCount);
            return byteCount;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        }
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: a  reason: contains not printable characters */
    public long m۱۹۳۶۶a(byte b) {
        return m۱۹۳۶۷a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a  reason: contains not printable characters */
    public long m۱۹۳۶۷a(byte b, long fromIndex, long toIndex) {
        Co s;
        long offset;
        if (fromIndex < 0 || toIndex < fromIndex) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f۱۶۲۷۰d), Long.valueOf(fromIndex), Long.valueOf(toIndex)));
        }
        if (toIndex > this.f۱۶۲۷۰d) {
            toIndex = this.f۱۶۲۷۰d;
        }
        if (fromIndex == toIndex || (s = this.f۱۶۲۶۹c) == null) {
            return -1;
        }
        if (this.f۱۶۲۷۰d - fromIndex >= fromIndex) {
            offset = 0;
            while (true) {
                long nextOffset = ((long) (s.f۱۶۳۰۴c - s.f۱۶۳۰۳b)) + offset;
                if (nextOffset >= fromIndex) {
                    break;
                }
                s = s.f۱۶۳۰۷f;
                offset = nextOffset;
            }
        } else {
            offset = this.f۱۶۲۷۰d;
            while (offset > fromIndex) {
                s = s.f۱۶۳۰۸g;
                offset -= (long) (s.f۱۶۳۰۴c - s.f۱۶۳۰۳b);
            }
        }
        while (offset < toIndex) {
            byte[] data = s.f۱۶۳۰۲a;
            int limit = (int) Math.min((long) s.f۱۶۳۰۴c, (((long) s.f۱۶۳۰۳b) + toIndex) - offset);
            for (int pos = (int) ((((long) s.f۱۶۳۰۳b) + fromIndex) - offset); pos < limit; pos++) {
                if (data[pos] == b) {
                    return ((long) (pos - s.f۱۶۳۰۳b)) + offset;
                }
            }
            offset += (long) (s.f۱۶۳۰۴c - s.f۱۶۳۰۳b);
            fromIndex = offset;
            s = s.f۱۶۳۰۷f;
        }
        return -1;
    }

    @Override // p۱۴۹f.AbstractCe
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۳۸۱a(long offset, Cf bytes) {
        return m۱۹۳۸۲a(offset, bytes, 0, bytes.m۱۹۴۵۱f());
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۳۸۲a(long offset, Cf bytes, int bytesOffset, int byteCount) {
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || this.f۱۶۲۷۰d - offset < ((long) byteCount) || bytes.m۱۹۴۵۱f() - bytesOffset < byteCount) {
            return false;
        }
        for (int i = 0; i < byteCount; i++) {
            if (m۱۹۳۹۸g(((long) i) + offset) != bytes.m۱۹۴۳۹a(bytesOffset + i)) {
                return false;
            }
        }
        return true;
    }

    @Override // p۱۴۹f.AbstractCr, p۱۴۹f.AbstractCd, java.io.Flushable
    public void flush() {
    }

    public boolean isOpen() {
        return true;
    }

    @Override // p۱۴۹f.AbstractCs, p۱۴۹f.AbstractCr, java.lang.AutoCloseable, java.io.Closeable, java.nio.channels.Channel
    public void close() {
    }

    @Override // p۱۴۹f.AbstractCs, p۱۴۹f.AbstractCr
    /* renamed from: b  reason: contains not printable characters */
    public Ct m۱۹۳۸۶b() {
        return Ct.f۱۶۳۱۳d;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cc)) {
            return false;
        }
        Cc that = (Cc) o;
        long j = this.f۱۶۲۷۰d;
        if (j != that.f۱۶۲۷۰d) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        Co sa = this.f۱۶۲۶۹c;
        Co sb = that.f۱۶۲۶۹c;
        int posA = sa.f۱۶۳۰۳b;
        int posB = sb.f۱۶۳۰۳b;
        long pos = 0;
        while (pos < this.f۱۶۲۷۰d) {
            long count = (long) Math.min(sa.f۱۶۳۰۴c - posA, sb.f۱۶۳۰۴c - posB);
            int i = 0;
            while (((long) i) < count) {
                int posA2 = posA + 1;
                int posB2 = posB + 1;
                if (sa.f۱۶۳۰۲a[posA] != sb.f۱۶۳۰۲a[posB]) {
                    return false;
                }
                i++;
                posA = posA2;
                posB = posB2;
            }
            if (posA == sa.f۱۶۳۰۴c) {
                sa = sa.f۱۶۳۰۷f;
                posA = sa.f۱۶۳۰۳b;
            }
            if (posB == sb.f۱۶۳۰۴c) {
                sb = sb.f۱۶۳۰۷f;
                posB = sb.f۱۶۳۰۳b;
            }
            pos += count;
        }
        return true;
    }

    public int hashCode() {
        Co s = this.f۱۶۲۶۹c;
        if (s == null) {
            return 0;
        }
        int result = 1;
        do {
            int limit = s.f۱۶۳۰۴c;
            for (int pos = s.f۱۶۳۰۳b; pos < limit; pos++) {
                result = (result * 31) + s.f۱۶۳۰۲a[pos];
            }
            s = s.f۱۶۳۰۷f;
        } while (s != this.f۱۶۲۶۹c);
        return result;
    }

    public String toString() {
        return m۱۹۴۱۱r().toString();
    }

    @Override // java.lang.Object
    public Cc clone() {
        Cc result = new Cc();
        if (this.f۱۶۲۷۰d == 0) {
            return result;
        }
        result.f۱۶۲۶۹c = this.f۱۶۲۶۹c.m۱۹۵۳۳c();
        Co oVar = result.f۱۶۲۶۹c;
        oVar.f۱۶۳۰۸g = oVar;
        oVar.f۱۶۳۰۷f = oVar;
        for (Co s = this.f۱۶۲۶۹c.f۱۶۳۰۷f; s != this.f۱۶۲۶۹c; s = s.f۱۶۳۰۷f) {
            result.f۱۶۲۶۹c.f۱۶۳۰۸g.m۱۹۵۲۹a(s.m۱۹۵۳۳c());
        }
        result.f۱۶۲۷۰d = this.f۱۶۲۷۰d;
        return result;
    }

    /* renamed from: r  reason: contains not printable characters */
    public Cf m۱۹۴۱۱r() {
        long j = this.f۱۶۲۷۰d;
        if (j <= 2147483647L) {
            return m۱۹۳۷۸a((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f۱۶۲۷۰d);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cf m۱۹۳۷۸a(int byteCount) {
        if (byteCount == 0) {
            return Cf.f۱۶۲۷۳g;
        }
        return new Cq(this, byteCount);
    }
}
