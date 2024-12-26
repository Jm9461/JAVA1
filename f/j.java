package f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class j implements s {

    /* renamed from: c  reason: collision with root package name */
    private int f۴۱۸۷c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final e f۴۱۸۸d;

    /* renamed from: e  reason: collision with root package name */
    private final Inflater f۴۱۸۹e;

    /* renamed from: f  reason: collision with root package name */
    private final k f۴۱۹۰f;

    /* renamed from: g  reason: collision with root package name */
    private final CRC32 f۴۱۹۱g = new CRC32();

    public j(s source) {
        if (source != null) {
            this.f۴۱۸۹e = new Inflater(true);
            this.f۴۱۸۸d = l.a(source);
            this.f۴۱۹۰f = new k(this.f۴۱۸۸d, this.f۴۱۸۹e);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // f.s
    public long b(c sink, long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        } else if (byteCount == 0) {
            return 0;
        } else {
            if (this.f۴۱۸۷c == 0) {
                d();
                this.f۴۱۸۷c = 1;
            }
            if (this.f۴۱۸۷c == 1) {
                long offset = sink.f۴۱۷۷d;
                long result = this.f۴۱۹۰f.b(sink, byteCount);
                if (result != -1) {
                    a(sink, offset, result);
                    return result;
                }
                this.f۴۱۸۷c = 2;
            }
            if (this.f۴۱۸۷c == 2) {
                l();
                this.f۴۱۸۷c = 3;
                if (!this.f۴۱۸۸d.i()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    private void d() {
        this.f۴۱۸۸d.d(10);
        byte flags = this.f۴۱۸۸d.a().g(3);
        boolean fhcrc = ((flags >> 1) & 1) == 1;
        if (fhcrc) {
            a(this.f۴۱۸۸d.a(), 0, 10);
        }
        a("ID1ID2", 8075, this.f۴۱۸۸d.readShort());
        this.f۴۱۸۸d.skip(8);
        if (((flags >> 2) & 1) == 1) {
            this.f۴۱۸۸d.d(2);
            if (fhcrc) {
                a(this.f۴۱۸۸d.a(), 0, 2);
            }
            int xlen = this.f۴۱۸۸d.a().c();
            this.f۴۱۸۸d.d((long) xlen);
            if (fhcrc) {
                a(this.f۴۱۸۸d.a(), 0, (long) xlen);
            }
            this.f۴۱۸۸d.skip((long) xlen);
        }
        if (((flags >> 3) & 1) == 1) {
            long index = this.f۴۱۸۸d.a((byte) 0);
            if (index != -1) {
                if (fhcrc) {
                    a(this.f۴۱۸۸d.a(), 0, index + 1);
                }
                this.f۴۱۸۸d.skip(index + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((flags >> 4) & 1) == 1) {
            long index2 = this.f۴۱۸۸d.a((byte) 0);
            if (index2 != -1) {
                if (fhcrc) {
                    a(this.f۴۱۸۸d.a(), 0, index2 + 1);
                }
                this.f۴۱۸۸d.skip(1 + index2);
            } else {
                throw new EOFException();
            }
        }
        if (fhcrc) {
            a("FHCRC", this.f۴۱۸۸d.c(), (short) ((int) this.f۴۱۹۱g.getValue()));
            this.f۴۱۹۱g.reset();
        }
    }

    private void l() {
        a("CRC", this.f۴۱۸۸d.h(), (int) this.f۴۱۹۱g.getValue());
        a("ISIZE", this.f۴۱۸۸d.h(), (int) this.f۴۱۸۹e.getBytesWritten());
    }

    @Override // f.s
    public t b() {
        return this.f۴۱۸۸d.b();
    }

    @Override // java.io.Closeable, f.s, java.lang.AutoCloseable
    public void close() {
        this.f۴۱۹۰f.close();
    }

    private void a(c buffer, long offset, long byteCount) {
        o s = buffer.f۴۱۷۶c;
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
            int pos = (int) (((long) s.f۴۲۰۹b) + offset);
            int toUpdate = (int) Math.min((long) (s.f۴۲۱۰c - pos), byteCount);
            this.f۴۱۹۱g.update(s.f۴۲۰۸a, pos, toUpdate);
            byteCount -= (long) toUpdate;
            offset = 0;
            s = s.f۴۲۱۳f;
        }
    }

    private void a(String name, int expected, int actual) {
        if (actual != expected) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", name, Integer.valueOf(actual), Integer.valueOf(expected)));
        }
    }
}
