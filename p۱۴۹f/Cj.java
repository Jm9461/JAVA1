package p۱۴۹f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: f.j  reason: invalid class name */
public final class Cj implements AbstractCs {

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۶۲۸۰c = 0;

    /* renamed from: d  reason: contains not printable characters */
    private final AbstractCe f۱۶۲۸۱d;

    /* renamed from: e  reason: contains not printable characters */
    private final Inflater f۱۶۲۸۲e;

    /* renamed from: f  reason: contains not printable characters */
    private final Ck f۱۶۲۸۳f;

    /* renamed from: g  reason: contains not printable characters */
    private final CRC32 f۱۶۲۸۴g = new CRC32();

    public Cj(AbstractCs source) {
        if (source != null) {
            this.f۱۶۲۸۲e = new Inflater(true);
            this.f۱۶۲۸۱d = Cl.m۱۹۴۸۰a(source);
            this.f۱۶۲۸۳f = new Ck(this.f۱۶۲۸۱d, this.f۱۶۲۸۲e);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // p۱۴۹f.AbstractCs
    /* renamed from: b  reason: contains not printable characters */
    public long m۱۹۴۷۳b(Cc sink, long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        } else if (byteCount == 0) {
            return 0;
        } else {
            if (this.f۱۶۲۸۰c == 0) {
                m۱۹۴۷۱d();
                this.f۱۶۲۸۰c = 1;
            }
            if (this.f۱۶۲۸۰c == 1) {
                long offset = sink.f۱۶۲۷۰d;
                long result = this.f۱۶۲۸۳f.m۱۹۴۷۶b(sink, byteCount);
                if (result != -1) {
                    m۱۹۴۶۹a(sink, offset, result);
                    return result;
                }
                this.f۱۶۲۸۰c = 2;
            }
            if (this.f۱۶۲۸۰c == 2) {
                m۱۹۴۷۲l();
                this.f۱۶۲۸۰c = 3;
                if (!this.f۱۶۲۸۱d.m۱۹۴۲۹i()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۹۴۷۱d() {
        this.f۱۶۲۸۱d.m۱۹۴۲۳d(10);
        byte flags = this.f۱۶۲۸۱d.m۱۹۴۱۸a().m۱۹۳۹۸g(3);
        boolean fhcrc = ((flags >> 1) & 1) == 1;
        if (fhcrc) {
            m۱۹۴۶۹a(this.f۱۶۲۸۱d.m۱۹۴۱۸a(), 0, 10);
        }
        m۱۹۴۷۰a("ID1ID2", 8075, this.f۱۶۲۸۱d.readShort());
        this.f۱۶۲۸۱d.skip(8);
        if (((flags >> 2) & 1) == 1) {
            this.f۱۶۲۸۱d.m۱۹۴۲۳d(2);
            if (fhcrc) {
                m۱۹۴۶۹a(this.f۱۶۲۸۱d.m۱۹۴۱۸a(), 0, 2);
            }
            int xlen = this.f۱۶۲۸۱d.m۱۹۴۱۸a().m۱۹۳۸۹c();
            this.f۱۶۲۸۱d.m۱۹۴۲۳d((long) xlen);
            if (fhcrc) {
                m۱۹۴۶۹a(this.f۱۶۲۸۱d.m۱۹۴۱۸a(), 0, (long) xlen);
            }
            this.f۱۶۲۸۱d.skip((long) xlen);
        }
        if (((flags >> 3) & 1) == 1) {
            long index = this.f۱۶۲۸۱d.m۱۹۴۱۷a((byte) 0);
            if (index != -1) {
                if (fhcrc) {
                    m۱۹۴۶۹a(this.f۱۶۲۸۱d.m۱۹۴۱۸a(), 0, index + 1);
                }
                this.f۱۶۲۸۱d.skip(index + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((flags >> 4) & 1) == 1) {
            long index2 = this.f۱۶۲۸۱d.m۱۹۴۱۷a((byte) 0);
            if (index2 != -1) {
                if (fhcrc) {
                    m۱۹۴۶۹a(this.f۱۶۲۸۱d.m۱۹۴۱۸a(), 0, index2 + 1);
                }
                this.f۱۶۲۸۱d.skip(1 + index2);
            } else {
                throw new EOFException();
            }
        }
        if (fhcrc) {
            m۱۹۴۷۰a("FHCRC", this.f۱۶۲۸۱d.m۱۹۴۲۲c(), (short) ((int) this.f۱۶۲۸۴g.getValue()));
            this.f۱۶۲۸۴g.reset();
        }
    }

    /* renamed from: l  reason: contains not printable characters */
    private void m۱۹۴۷۲l() {
        m۱۹۴۷۰a("CRC", this.f۱۶۲۸۱d.m۱۹۴۲۸h(), (int) this.f۱۶۲۸۴g.getValue());
        m۱۹۴۷۰a("ISIZE", this.f۱۶۲۸۱d.m۱۹۴۲۸h(), (int) this.f۱۶۲۸۲e.getBytesWritten());
    }

    @Override // p۱۴۹f.AbstractCs
    /* renamed from: b  reason: contains not printable characters */
    public Ct m۱۹۴۷۴b() {
        return this.f۱۶۲۸۱d.m۱۹۵۵۵b();
    }

    @Override // java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
    public void close() {
        this.f۱۶۲۸۳f.close();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۹۴۶۹a(Cc buffer, long offset, long byteCount) {
        Co s = buffer.f۱۶۲۶۹c;
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
            int pos = (int) (((long) s.f۱۶۳۰۳b) + offset);
            int toUpdate = (int) Math.min((long) (s.f۱۶۳۰۴c - pos), byteCount);
            this.f۱۶۲۸۴g.update(s.f۱۶۳۰۲a, pos, toUpdate);
            byteCount -= (long) toUpdate;
            offset = 0;
            s = s.f۱۶۳۰۷f;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۹۴۷۰a(String name, int expected, int actual) {
        if (actual != expected) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", name, Integer.valueOf(actual), Integer.valueOf(expected)));
        }
    }
}
