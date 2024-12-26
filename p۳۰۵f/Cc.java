package p۳۰۵f;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: f.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cc implements InterfaceCe, InterfaceCd, Cloneable, ByteChannel {

    /* renamed from: e, reason: contains not printable characters */
    private static final byte[] f۱۶۲۶۸e = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: c, reason: contains not printable characters */
    Co f۱۶۲۶۹c;

    /* renamed from: d, reason: contains not printable characters */
    long f۱۶۲۷۰d;

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ InterfaceCd mo۱۷۴۲۵a(long j) {
        mo۱۷۴۲۵a(j);
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ InterfaceCd mo۱۷۴۲۶a(String str) {
        mo۱۷۴۲۶a(str);
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: d, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ InterfaceCd mo۱۷۴۲۹d() {
        mo۱۷۴۲۹d();
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: e, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ InterfaceCd mo۱۷۴۳۰e(long j) {
        mo۱۷۴۳۰e(j);
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    public /* bridge */ /* synthetic */ InterfaceCd write(byte[] bArr) {
        write(bArr);
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    public /* bridge */ /* synthetic */ InterfaceCd write(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    public /* bridge */ /* synthetic */ InterfaceCd writeByte(int i) {
        writeByte(i);
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    public /* bridge */ /* synthetic */ InterfaceCd writeInt(int i) {
        writeInt(i);
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    public /* bridge */ /* synthetic */ InterfaceCd writeShort(int i) {
        writeShort(i);
        return this;
    }

    /* renamed from: q, reason: contains not printable characters */
    public long m۱۷۳۳۲q() {
        return this.f۱۶۲۷۰d;
    }

    @Override // p۳۰۵f.InterfaceCe, p۳۰۵f.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public Cc mo۱۷۴۳۳a() {
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: d, reason: contains not printable characters */
    public Cc mo۱۷۴۲۹d() {
        return this;
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: i, reason: contains not printable characters */
    public boolean mo۱۷۴۴۸i() {
        return this.f۱۶۲۷۰d == 0;
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: d, reason: contains not printable characters */
    public void mo۱۷۴۴۲d(long byteCount) {
        if (this.f۱۶۲۷۰d < byteCount) {
            throw new EOFException();
        }
    }

    /* renamed from: f.c$a */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int read() {
            Cc cc = Cc.this;
            if (cc.f۱۶۲۷۰d > 0) {
                return cc.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int offset, int byteCount) {
            return Cc.this.m۱۷۲۸۷a(sink, offset, byteCount);
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(Cc.this.f۱۶۲۷۰d, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public String toString() {
            return Cc.this + ".inputStream()";
        }
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: k, reason: contains not printable characters */
    public InputStream mo۱۷۴۵۰k() {
        return new a();
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cc m۱۷۲۹۳a(Cc out, long offset, long byteCount) {
        if (out == null) {
            throw new IllegalArgumentException("out == null");
        }
        Cu.m۱۷۴۹۲a(this.f۱۶۲۷۰d, offset, byteCount);
        if (byteCount == 0) {
            return this;
        }
        out.f۱۶۲۷۰d += byteCount;
        Co s = this.f۱۶۲۶۹c;
        while (true) {
            int i = s.f۱۶۳۰۴c;
            int i2 = s.f۱۶۳۰۳b;
            if (offset < i - i2) {
                break;
            }
            offset -= i - i2;
            s = s.f۱۶۳۰۷f;
        }
        while (byteCount > 0) {
            Co copy = s.m۱۷۴۵۶c();
            copy.f۱۶۳۰۳b = (int) (copy.f۱۶۳۰۳b + offset);
            copy.f۱۶۳۰۴c = Math.min(copy.f۱۶۳۰۳b + ((int) byteCount), copy.f۱۶۳۰۴c);
            Co co = out.f۱۶۲۶۹c;
            if (co == null) {
                copy.f۱۶۳۰۸g = copy;
                copy.f۱۶۳۰۷f = copy;
                out.f۱۶۲۶۹c = copy;
            } else {
                co.f۱۶۳۰۸g.m۱۷۴۵۲a(copy);
            }
            byteCount -= copy.f۱۶۳۰۴c - copy.f۱۶۳۰۳b;
            offset = 0;
            s = s.f۱۶۳۰۷f;
        }
        return this;
    }

    /* renamed from: n, reason: contains not printable characters */
    public long m۱۷۳۲۹n() {
        long result = this.f۱۶۲۷۰d;
        if (result == 0) {
            return 0L;
        }
        Co tail = this.f۱۶۲۶۹c.f۱۶۳۰۸g;
        if (tail.f۱۶۳۰۴c < 8192 && tail.f۱۶۳۰۶e) {
            return result - (r3 - tail.f۱۶۳۰۳b);
        }
        return result;
    }

    @Override // p۳۰۵f.InterfaceCe
    public byte readByte() {
        long j = this.f۱۶۲۷۰d;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        Co segment = this.f۱۶۲۶۹c;
        int pos = segment.f۱۶۳۰۳b;
        int limit = segment.f۱۶۳۰۴c;
        byte[] data = segment.f۱۶۳۰۲a;
        int pos2 = pos + 1;
        byte b2 = data[pos];
        this.f۱۶۲۷۰d = j - 1;
        if (pos2 == limit) {
            this.f۱۶۲۶۹c = segment.m۱۷۴۵۵b();
            Cp.m۱۷۴۵۸a(segment);
        } else {
            segment.f۱۶۳۰۳b = pos2;
        }
        return b2;
    }

    /* renamed from: g, reason: contains not printable characters */
    public byte m۱۷۳۲۰g(long pos) {
        Cu.m۱۷۴۹۲a(this.f۱۶۲۷۰d, pos, 1L);
        long j = this.f۱۶۲۷۰d;
        if (j - pos > pos) {
            Co s = this.f۱۶۲۶۹c;
            while (true) {
                int i = s.f۱۶۳۰۴c;
                int i2 = s.f۱۶۳۰۳b;
                int segmentByteCount = i - i2;
                if (pos < segmentByteCount) {
                    return s.f۱۶۳۰۲a[i2 + ((int) pos)];
                }
                pos -= segmentByteCount;
                s = s.f۱۶۳۰۷f;
            }
        } else {
            long pos2 = pos - j;
            Co s2 = this.f۱۶۲۶۹c.f۱۶۳۰۸g;
            while (true) {
                int i3 = s2.f۱۶۳۰۴c;
                int i4 = s2.f۱۶۳۰۳b;
                pos2 += i3 - i4;
                if (pos2 >= 0) {
                    return s2.f۱۶۳۰۲a[i4 + ((int) pos2)];
                }
                s2 = s2.f۱۶۳۰۸g;
            }
        }
    }

    @Override // p۳۰۵f.InterfaceCe
    public short readShort() {
        long j = this.f۱۶۲۷۰d;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f۱۶۲۷۰d);
        }
        Co segment = this.f۱۶۲۶۹c;
        int pos = segment.f۱۶۳۰۳b;
        int limit = segment.f۱۶۳۰۴c;
        if (limit - pos < 2) {
            int s = ((readByte() & 255) << 8) | (readByte() & 255);
            return (short) s;
        }
        byte[] data = segment.f۱۶۳۰۲a;
        int pos2 = pos + 1;
        int pos3 = pos2 + 1;
        int s2 = ((data[pos] & 255) << 8) | (data[pos2] & 255);
        this.f۱۶۲۷۰d = j - 2;
        if (pos3 == limit) {
            this.f۱۶۲۶۹c = segment.m۱۷۴۵۵b();
            Cp.m۱۷۴۵۸a(segment);
        } else {
            segment.f۱۶۳۰۳b = pos3;
        }
        return (short) s2;
    }

    @Override // p۳۰۵f.InterfaceCe
    public int readInt() {
        long j = this.f۱۶۲۷۰d;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f۱۶۲۷۰d);
        }
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
            this.f۱۶۲۶۹c = segment.m۱۷۴۵۵b();
            Cp.m۱۷۴۵۸a(segment);
        } else {
            segment.f۱۶۳۰۳b = pos5;
        }
        return i3;
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: c, reason: contains not printable characters */
    public short mo۱۷۴۴۱c() {
        return Cu.m۱۷۴۹۱a(readShort());
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: h, reason: contains not printable characters */
    public int mo۱۷۴۴۷h() {
        return Cu.m۱۷۴۹۰a(readInt());
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        r20.f۱۶۲۷۰d -= r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        if (r4 == false) goto L۴۷;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e3, code lost:
    
        return -r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: e, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo۱۷۴۴۳e() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p۳۰۵f.Cc.mo۱۷۴۴۳e():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: j, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo۱۷۴۴۹j() {
        /*
            r15 = this;
            long r0 = r15.f۱۶۲۷۰d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lad
            r0 = 0
            r4 = 0
            r5 = 0
        Lc:
            f.o r6 = r15.f۱۶۲۶۹c
            byte[] r7 = r6.f۱۶۳۰۲a
            int r8 = r6.f۱۶۳۰۳b
            int r9 = r6.f۱۶۳۰۴c
        L14:
            if (r8 >= r9) goto L92
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L23
            r11 = 57
            if (r10 > r11) goto L23
            int r11 = r10 + (-48)
            goto L3c
        L23:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-97)
            int r11 = r11 + 10
            goto L3c
        L30:
            r11 = 65
            if (r10 < r11) goto L73
            r11 = 70
            if (r10 > r11) goto L73
            int r11 = r10 + (-65)
            int r11 = r11 + 10
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r0
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4c
            r12 = 4
            long r0 = r0 << r12
            long r12 = (long) r11
            long r0 = r0 | r12
            int r8 = r8 + 1
            int r4 = r4 + 1
            goto L14
        L4c:
            f.c r2 = new f.c
            r2.<init>()
            r2.mo۱۷۴۲۵a(r0)
            f.c r2 = r2.writeByte(r10)
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Number too large: "
            r12.append(r13)
            java.lang.String r13 = r2.m۱۷۳۳۱p()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r3.<init>(r12)
            throw r3
        L73:
            if (r4 == 0) goto L77
            r5 = 1
            goto L92
        L77:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r11 = "Expected leading [0-9a-fA-F] character but was 0x"
            r3.append(r11)
            java.lang.String r11 = java.lang.Integer.toHexString(r10)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L92:
            if (r8 != r9) goto L9e
            f.o r10 = r6.m۱۷۴۵۵b()
            r15.f۱۶۲۶۹c = r10
            p۳۰۵f.Cp.m۱۷۴۵۸a(r6)
            goto La0
        L9e:
            r6.f۱۶۳۰۳b = r8
        La0:
            if (r5 != 0) goto La6
            f.o r6 = r15.f۱۶۲۶۹c
            if (r6 != 0) goto Lc
        La6:
            long r2 = r15.f۱۶۲۷۰d
            long r6 = (long) r4
            long r2 = r2 - r6
            r15.f۱۶۲۷۰d = r2
            return r0
        Lad:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto Lb6
        Lb5:
            throw r0
        Lb6:
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: p۳۰۵f.Cc.mo۱۷۴۴۹j():long");
    }

    /* renamed from: o, reason: contains not printable characters */
    public Cf m۱۷۳۳۰o() {
        return new Cf(mo۱۷۴۴۶g());
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: b, reason: contains not printable characters */
    public Cf mo۱۷۴۳۸b(long byteCount) {
        return new Cf(mo۱۷۴۴۵f(byteCount));
    }

    /* renamed from: p, reason: contains not printable characters */
    public String m۱۷۳۳۱p() {
        try {
            return m۱۷۳۰۱a(this.f۱۶۲۷۰d, Cu.f۱۶۳۱۷a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    public String m۱۷۳۲۳h(long byteCount) {
        return m۱۷۳۰۱a(byteCount, Cu.f۱۶۳۱۷a);
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۷۳۰۱a(long byteCount, Charset charset) {
        Cu.m۱۷۴۹۲a(this.f۱۶۲۷۰d, 0L, byteCount);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (byteCount > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + byteCount);
        }
        if (byteCount == 0) {
            return "";
        }
        Co s = this.f۱۶۲۶۹c;
        int i = s.f۱۶۳۰۳b;
        if (i + byteCount > s.f۱۶۳۰۴c) {
            return new String(mo۱۷۴۴۵f(byteCount), charset);
        }
        String result = new String(s.f۱۶۳۰۲a, i, (int) byteCount, charset);
        s.f۱۶۳۰۳b = (int) (s.f۱۶۳۰۳b + byteCount);
        this.f۱۶۲۷۰d -= byteCount;
        if (s.f۱۶۳۰۳b == s.f۱۶۳۰۴c) {
            this.f۱۶۲۶۹c = s.m۱۷۴۵۵b();
            Cp.m۱۷۴۵۸a(s);
        }
        return result;
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
        long scanLength = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long newline = m۱۷۲۸۹a((byte) 10, 0L, scanLength);
        if (newline != -1) {
            return m۱۷۳۲۴i(newline);
        }
        if (scanLength < m۱۷۳۳۲q() && m۱۷۳۲۰g(scanLength - 1) == 13 && m۱۷۳۲۰g(scanLength) == 10) {
            return m۱۷۳۲۴i(scanLength);
        }
        Cc data = new Cc();
        m۱۷۲۹۳a(data, 0L, Math.min(32L, m۱۷۳۳۲q()));
        throw new EOFException("\\n not found: limit=" + Math.min(m۱۷۳۳۲q(), limit) + " content=" + data.m۱۷۳۳۰o().mo۱۷۴۶۷b() + (char) 8230);
    }

    /* renamed from: i, reason: contains not printable characters */
    String m۱۷۳۲۴i(long newline) {
        if (newline > 0 && m۱۷۳۲۰g(newline - 1) == 13) {
            String result = m۱۷۳۲۳h(newline - 1);
            skip(2L);
            return result;
        }
        String result2 = m۱۷۳۲۳h(newline);
        skip(1L);
        return result2;
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: g, reason: contains not printable characters */
    public byte[] mo۱۷۴۴۶g() {
        try {
            return mo۱۷۴۴۵f(this.f۱۶۲۷۰d);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: f, reason: contains not printable characters */
    public byte[] mo۱۷۴۴۵f(long byteCount) {
        Cu.m۱۷۴۹۲a(this.f۱۶۲۷۰d, 0L, byteCount);
        if (byteCount > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + byteCount);
        }
        byte[] result = new byte[(int) byteCount];
        readFully(result);
        return result;
    }

    @Override // p۳۰۵f.InterfaceCe
    public void readFully(byte[] sink) {
        int offset = 0;
        while (offset < sink.length) {
            int read = m۱۷۲۸۷a(sink, offset, sink.length - offset);
            if (read == -1) {
                throw new EOFException();
            }
            offset += read;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۷۲۸۷a(byte[] sink, int offset, int byteCount) {
        Cu.m۱۷۴۹۲a(sink.length, offset, byteCount);
        Co s = this.f۱۶۲۶۹c;
        if (s == null) {
            return -1;
        }
        int toCopy = Math.min(byteCount, s.f۱۶۳۰۴c - s.f۱۶۳۰۳b);
        System.arraycopy(s.f۱۶۳۰۲a, s.f۱۶۳۰۳b, sink, offset, toCopy);
        s.f۱۶۳۰۳b += toCopy;
        this.f۱۶۲۷۰d -= toCopy;
        if (s.f۱۶۳۰۳b == s.f۱۶۳۰۴c) {
            this.f۱۶۲۶۹c = s.m۱۷۴۵۵b();
            Cp.m۱۷۴۵۸a(s);
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
        this.f۱۶۲۷۰d -= toCopy;
        if (s.f۱۶۳۰۳b == s.f۱۶۳۰۴c) {
            this.f۱۶۲۶۹c = s.m۱۷۴۵۵b();
            Cp.m۱۷۴۵۸a(s);
        }
        return toCopy;
    }

    /* renamed from: m, reason: contains not printable characters */
    public void m۱۷۳۲۸m() {
        try {
            skip(this.f۱۶۲۷۰d);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // p۳۰۵f.InterfaceCe
    public void skip(long byteCount) {
        while (byteCount > 0) {
            if (this.f۱۶۲۶۹c == null) {
                throw new EOFException();
            }
            int toSkip = (int) Math.min(byteCount, r0.f۱۶۳۰۴c - r0.f۱۶۳۰۳b);
            this.f۱۶۲۷۰d -= toSkip;
            byteCount -= toSkip;
            Co co = this.f۱۶۲۶۹c;
            co.f۱۶۳۰۳b += toSkip;
            if (co.f۱۶۳۰۳b == co.f۱۶۳۰۴c) {
                Co toRecycle = this.f۱۶۲۶۹c;
                this.f۱۶۲۶۹c = toRecycle.m۱۷۴۵۵b();
                Cp.m۱۷۴۵۸a(toRecycle);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cc m۱۷۲۹۴a(Cf byteString) {
        if (byteString == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        byteString.mo۱۷۴۶۴a(this);
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public Cc mo۱۷۴۲۶a(String string) {
        m۱۷۲۹۶a(string, 0, string.length());
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cc m۱۷۲۹۶a(String string, int beginIndex, int endIndex) {
        if (string == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (beginIndex < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + beginIndex);
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + endIndex + " < " + beginIndex);
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + endIndex + " > " + string.length());
        }
        int i = beginIndex;
        while (i < endIndex) {
            int c2 = string.charAt(i);
            if (c2 < 128) {
                Co tail = m۱۷۳۰۷b(1);
                byte[] data = tail.f۱۶۳۰۲a;
                int segmentOffset = tail.f۱۶۳۰۴c - i;
                int runLimit = Math.min(endIndex, 8192 - segmentOffset);
                int i2 = i + 1;
                data[i + segmentOffset] = (byte) c2;
                while (i2 < runLimit) {
                    int c3 = string.charAt(i2);
                    if (c3 >= 128) {
                        break;
                    }
                    data[i2 + segmentOffset] = (byte) c3;
                    i2++;
                }
                int i3 = tail.f۱۶۳۰۴c;
                int runSize = (i2 + segmentOffset) - i3;
                tail.f۱۶۳۰۴c = i3 + runSize;
                this.f۱۶۲۷۰d += runSize;
                i = i2;
            } else if (c2 < 2048) {
                writeByte((c2 >> 6) | 192);
                writeByte(128 | (c2 & 63));
                i++;
            } else if (c2 < 55296 || c2 > 57343) {
                writeByte((c2 >> 12) | 224);
                writeByte(((c2 >> 6) & 63) | 128);
                writeByte(128 | (c2 & 63));
                i++;
            } else {
                int low = i + 1 < endIndex ? string.charAt(i + 1) : 0;
                if (c2 > 56319 || low < 56320 || low > 57343) {
                    writeByte(63);
                    i++;
                } else {
                    int codePoint = ((((-55297) & c2) << 10) | ((-56321) & low)) + 65536;
                    writeByte((codePoint >> 18) | 240);
                    writeByte(((codePoint >> 12) & 63) | 128);
                    writeByte(((codePoint >> 6) & 63) | 128);
                    writeByte(128 | (codePoint & 63));
                    i += 2;
                }
            }
        }
        return this;
    }

    /* renamed from: c, reason: contains not printable characters */
    public Cc m۱۷۳۰۹c(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
        } else if (codePoint < 2048) {
            writeByte((codePoint >> 6) | 192);
            writeByte(128 | (codePoint & 63));
        } else if (codePoint < 65536) {
            if (codePoint >= 55296 && codePoint <= 57343) {
                writeByte(63);
            } else {
                writeByte((codePoint >> 12) | 224);
                writeByte(((codePoint >> 6) & 63) | 128);
                writeByte(128 | (codePoint & 63));
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

    /* renamed from: a, reason: contains not printable characters */
    public Cc m۱۷۲۹۷a(String string, int beginIndex, int endIndex, Charset charset) {
        if (string == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (beginIndex < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + beginIndex);
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + endIndex + " < " + beginIndex);
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + endIndex + " > " + string.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(Cu.f۱۶۳۱۷a)) {
            m۱۷۲۹۶a(string, beginIndex, endIndex);
            return this;
        }
        byte[] data = string.substring(beginIndex, endIndex).getBytes(charset);
        write(data, 0, data.length);
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    public Cc write(byte[] source) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        write(source, 0, source.length);
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    public Cc write(byte[] source, int offset, int byteCount) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        Cu.m۱۷۴۹۲a(source.length, offset, byteCount);
        int limit = offset + byteCount;
        while (offset < limit) {
            Co tail = m۱۷۳۰۷b(1);
            int toCopy = Math.min(limit - offset, 8192 - tail.f۱۶۳۰۴c);
            System.arraycopy(source, offset, tail.f۱۶۳۰۲a, tail.f۱۶۳۰۴c, toCopy);
            offset += toCopy;
            tail.f۱۶۳۰۴c += toCopy;
        }
        this.f۱۶۲۷۰d += byteCount;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        int byteCount = source.remaining();
        int remaining = byteCount;
        while (remaining > 0) {
            Co tail = m۱۷۳۰۷b(1);
            int toCopy = Math.min(remaining, 8192 - tail.f۱۶۳۰۴c);
            source.get(tail.f۱۶۳۰۲a, tail.f۱۶۳۰۴c, toCopy);
            remaining -= toCopy;
            tail.f۱۶۳۰۴c += toCopy;
        }
        this.f۱۶۲۷۰d += byteCount;
        return byteCount;
    }

    /* renamed from: a, reason: contains not printable characters */
    public long m۱۷۲۹۰a(InterfaceCs source) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        long totalBytesRead = 0;
        while (true) {
            long readCount = source.mo۱۷۴۷۷b(this, 8192L);
            if (readCount != -1) {
                totalBytesRead += readCount;
            } else {
                return totalBytesRead;
            }
        }
    }

    @Override // p۳۰۵f.InterfaceCd
    public Cc writeByte(int b2) {
        Co tail = m۱۷۳۰۷b(1);
        byte[] bArr = tail.f۱۶۳۰۲a;
        int i = tail.f۱۶۳۰۴c;
        tail.f۱۶۳۰۴c = i + 1;
        bArr[i] = (byte) b2;
        this.f۱۶۲۷۰d++;
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    public Cc writeShort(int s) {
        Co tail = m۱۷۳۰۷b(2);
        byte[] data = tail.f۱۶۳۰۲a;
        int limit = tail.f۱۶۳۰۴c;
        int limit2 = limit + 1;
        data[limit] = (byte) ((s >>> 8) & 255);
        data[limit2] = (byte) (s & 255);
        tail.f۱۶۳۰۴c = limit2 + 1;
        this.f۱۶۲۷۰d += 2;
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    public Cc writeInt(int i) {
        Co tail = m۱۷۳۰۷b(4);
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

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: e, reason: contains not printable characters */
    public Cc mo۱۷۴۳۰e(long v) {
        if (v == 0) {
            writeByte(48);
            return this;
        }
        boolean negative = false;
        if (v < 0) {
            v = -v;
            if (v < 0) {
                mo۱۷۴۲۶a("-9223372036854775808");
                return this;
            }
            negative = true;
        }
        int width = v < 100000000 ? v < 10000 ? v < 100 ? v < 10 ? 1 : 2 : v < 1000 ? 3 : 4 : v < 1000000 ? v < 100000 ? 5 : 6 : v < 10000000 ? 7 : 8 : v < 1000000000000L ? v < 10000000000L ? v < 1000000000 ? 9 : 10 : v < 100000000000L ? 11 : 12 : v < 1000000000000000L ? v < 10000000000000L ? 13 : v < 100000000000000L ? 14 : 15 : v < 100000000000000000L ? v < 10000000000000000L ? 16 : 17 : v < 1000000000000000000L ? 18 : 19;
        if (negative) {
            width++;
        }
        Co tail = m۱۷۳۰۷b(width);
        byte[] data = tail.f۱۶۳۰۲a;
        int pos = tail.f۱۶۳۰۴c + width;
        while (v != 0) {
            int digit = (int) (v % 10);
            pos--;
            data[pos] = f۱۶۲۶۸e[digit];
            v /= 10;
        }
        if (negative) {
            data[pos - 1] = 45;
        }
        tail.f۱۶۳۰۴c += width;
        this.f۱۶۲۷۰d += width;
        return this;
    }

    @Override // p۳۰۵f.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public Cc mo۱۷۴۲۵a(long v) {
        if (v == 0) {
            writeByte(48);
            return this;
        }
        int width = (Long.numberOfTrailingZeros(Long.highestOneBit(v)) / 4) + 1;
        Co tail = m۱۷۳۰۷b(width);
        byte[] data = tail.f۱۶۳۰۲a;
        int start = tail.f۱۶۳۰۴c;
        for (int pos = (tail.f۱۶۳۰۴c + width) - 1; pos >= start; pos--) {
            data[pos] = f۱۶۲۶۸e[(int) (15 & v)];
            v >>>= 4;
        }
        tail.f۱۶۳۰۴c += width;
        this.f۱۶۲۷۰d += width;
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    Co m۱۷۳۰۷b(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException();
        }
        Co co = this.f۱۶۲۶۹c;
        if (co == null) {
            this.f۱۶۲۶۹c = Cp.m۱۷۴۵۷a();
            Co co2 = this.f۱۶۲۶۹c;
            co2.f۱۶۳۰۸g = co2;
            co2.f۱۶۳۰۷f = co2;
            return co2;
        }
        Co tail = co.f۱۶۳۰۸g;
        if (tail.f۱۶۳۰۴c + minimumCapacity > 8192 || !tail.f۱۶۳۰۶e) {
            return tail.m۱۷۴۵۲a(Cp.m۱۷۴۵۷a());
        }
        return tail;
    }

    @Override // p۳۰۵f.InterfaceCr
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۴۷۵a(Cc source, long byteCount) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        Cu.m۱۷۴۹۲a(source.f۱۶۲۷۰d, 0L, byteCount);
        while (byteCount > 0) {
            Co co = source.f۱۶۲۶۹c;
            if (byteCount < co.f۱۶۳۰۴c - co.f۱۶۳۰۳b) {
                Co co2 = this.f۱۶۲۶۹c;
                Co tail = co2 != null ? co2.f۱۶۳۰۸g : null;
                if (tail != null && tail.f۱۶۳۰۶e) {
                    if ((tail.f۱۶۳۰۴c + byteCount) - (tail.f۱۶۳۰۵d ? 0 : tail.f۱۶۳۰۳b) <= 8192) {
                        source.f۱۶۲۶۹c.m۱۷۴۵۴a(tail, (int) byteCount);
                        source.f۱۶۲۷۰d -= byteCount;
                        this.f۱۶۲۷۰d += byteCount;
                        return;
                    }
                }
                source.f۱۶۲۶۹c = source.f۱۶۲۶۹c.m۱۷۴۵۱a((int) byteCount);
            }
            Co tail2 = source.f۱۶۲۶۹c;
            long movedByteCount = tail2.f۱۶۳۰۴c - tail2.f۱۶۳۰۳b;
            source.f۱۶۲۶۹c = tail2.m۱۷۴۵۵b();
            Co co3 = this.f۱۶۲۶۹c;
            if (co3 == null) {
                this.f۱۶۲۶۹c = tail2;
                Co co4 = this.f۱۶۲۶۹c;
                co4.f۱۶۳۰۸g = co4;
                co4.f۱۶۳۰۷f = co4;
            } else {
                co3.f۱۶۳۰۸g.m۱۷۴۵۲a(tail2).m۱۷۴۵۳a();
            }
            source.f۱۶۲۷۰d -= movedByteCount;
            this.f۱۶۲۷۰d += movedByteCount;
            byteCount -= movedByteCount;
        }
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
        long j = this.f۱۶۲۷۰d;
        if (j == 0) {
            return -1L;
        }
        if (byteCount > j) {
            byteCount = this.f۱۶۲۷۰d;
        }
        sink.mo۱۷۴۷۵a(this, byteCount);
        return byteCount;
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: a, reason: contains not printable characters */
    public long mo۱۷۴۳۱a(byte b2) {
        return m۱۷۲۸۹a(b2, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m۱۷۲۸۹a(byte r11, long r12, long r14) {
        /*
            r10 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto L7c
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 < 0) goto L7c
            long r0 = r10.f۱۶۲۷۰d
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L12
            long r14 = r10.f۱۶۲۷۰d
        L12:
            r0 = -1
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 != 0) goto L19
            return r0
        L19:
            f.o r2 = r10.f۱۶۲۶۹c
            if (r2 != 0) goto L1e
            return r0
        L1e:
            long r3 = r10.f۱۶۲۷۰d
            long r3 = r3 - r12
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 >= 0) goto L35
            long r3 = r10.f۱۶۲۷۰d
        L27:
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 <= 0) goto L47
            f.o r2 = r2.f۱۶۳۰۸g
            int r5 = r2.f۱۶۳۰۴c
            int r6 = r2.f۱۶۳۰۳b
            int r5 = r5 - r6
            long r5 = (long) r5
            long r3 = r3 - r5
            goto L27
        L35:
            r3 = 0
        L37:
            int r5 = r2.f۱۶۳۰۴c
            int r6 = r2.f۱۶۳۰۳b
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r3
            r7 = r5
            int r9 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r9 >= 0) goto L47
            f.o r2 = r2.f۱۶۳۰۷f
            r3 = r7
            goto L37
        L47:
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 >= 0) goto L7b
            byte[] r5 = r2.f۱۶۳۰۲a
            int r6 = r2.f۱۶۳۰۴c
            long r6 = (long) r6
            int r8 = r2.f۱۶۳۰۳b
            long r8 = (long) r8
            long r8 = r8 + r14
            long r8 = r8 - r3
            long r6 = java.lang.Math.min(r6, r8)
            int r7 = (int) r6
            int r6 = r2.f۱۶۳۰۳b
            long r8 = (long) r6
            long r8 = r8 + r12
            long r8 = r8 - r3
            int r6 = (int) r8
        L60:
            if (r6 >= r7) goto L70
            r8 = r5[r6]
            if (r8 != r11) goto L6d
            int r0 = r2.f۱۶۳۰۳b
            int r0 = r6 - r0
            long r0 = (long) r0
            long r0 = r0 + r3
            return r0
        L6d:
            int r6 = r6 + 1
            goto L60
        L70:
            int r8 = r2.f۱۶۳۰۴c
            int r9 = r2.f۱۶۳۰۳b
            int r8 = r8 - r9
            long r8 = (long) r8
            long r3 = r3 + r8
            r12 = r3
            f.o r2 = r2.f۱۶۳۰۷f
            goto L47
        L7b:
            return r0
        L7c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            long r3 = r10.f۱۶۲۷۰d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1[r2] = r3
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            r3 = 1
            r1[r3] = r2
            r2 = 2
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            r1[r2] = r3
            java.lang.String r2 = "size=%s fromIndex=%s toIndex=%s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            goto La3
        La2:
            throw r0
        La3:
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: p۳۰۵f.Cc.m۱۷۲۸۹a(byte, long, long):long");
    }

    @Override // p۳۰۵f.InterfaceCe
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۷۴۳۵a(long offset, Cf bytes) {
        return m۱۷۳۰۴a(offset, bytes, 0, bytes.mo۱۷۴۷۱f());
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۷۳۰۴a(long offset, Cf bytes, int bytesOffset, int byteCount) {
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || this.f۱۶۲۷۰d - offset < byteCount || bytes.mo۱۷۴۷۱f() - bytesOffset < byteCount) {
            return false;
        }
        for (int i = 0; i < byteCount; i++) {
            if (m۱۷۳۲۰g(i + offset) != bytes.mo۱۷۴۶۱a(bytesOffset + i)) {
                return false;
            }
        }
        return true;
    }

    @Override // p۳۰۵f.InterfaceCd, p۳۰۵f.InterfaceCr, java.io.Flushable
    public void flush() {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p۳۰۵f.InterfaceCs
    /* renamed from: b, reason: contains not printable characters */
    public Ct mo۱۷۴۷۸b() {
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
            long count = Math.min(sa.f۱۶۳۰۴c - posA, sb.f۱۶۳۰۴c - posB);
            int i = 0;
            while (i < count) {
                int posA2 = posA + 1;
                int posB2 = posB + 1;
                if (sa.f۱۶۳۰۲a[posA] != sb.f۱۶۳۰۲a[posB]) {
                    return false;
                }
                i++;
                posA = posA2;
                posB = posB2;
            }
            int i2 = sa.f۱۶۳۰۴c;
            if (posA == i2) {
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
        return m۱۷۳۳۳r().toString();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Cc m۱۷۳۳۴clone() {
        Cc result = new Cc();
        if (this.f۱۶۲۷۰d == 0) {
            return result;
        }
        result.f۱۶۲۶۹c = this.f۱۶۲۶۹c.m۱۷۴۵۶c();
        Co co = result.f۱۶۲۶۹c;
        co.f۱۶۳۰۸g = co;
        co.f۱۶۳۰۷f = co;
        for (Co s = this.f۱۶۲۶۹c.f۱۶۳۰۷f; s != this.f۱۶۲۶۹c; s = s.f۱۶۳۰۷f) {
            result.f۱۶۲۶۹c.f۱۶۳۰۸g.m۱۷۴۵۲a(s.m۱۷۴۵۶c());
        }
        result.f۱۶۲۷۰d = this.f۱۶۲۷۰d;
        return result;
    }

    /* renamed from: r, reason: contains not printable characters */
    public Cf m۱۷۳۳۳r() {
        long j = this.f۱۶۲۷۰d;
        if (j > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f۱۶۲۷۰d);
        }
        return m۱۷۳۰۰a((int) j);
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cf m۱۷۳۰۰a(int byteCount) {
        return byteCount == 0 ? Cf.f۱۶۲۷۳g : new Cq(this, byteCount);
    }
}
