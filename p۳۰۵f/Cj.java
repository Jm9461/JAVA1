package p۳۰۵f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: f.j, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cj implements InterfaceCs {

    /* renamed from: d, reason: contains not printable characters */
    private final InterfaceCe f۱۶۲۸۱d;

    /* renamed from: e, reason: contains not printable characters */
    private final Inflater f۱۶۲۸۲e;

    /* renamed from: f, reason: contains not printable characters */
    private final Ck f۱۶۲۸۳f;

    /* renamed from: c, reason: contains not printable characters */
    private int f۱۶۲۸۰c = 0;

    /* renamed from: g, reason: contains not printable characters */
    private final CRC32 f۱۶۲۸۴g = new CRC32();

    public Cj(InterfaceCs source) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f۱۶۲۸۲e = new Inflater(true);
        this.f۱۶۲۸۱d = Cl.m۱۷۴۰۳a(source);
        this.f۱۶۲۸۳f = new Ck(this.f۱۶۲۸۱d, this.f۱۶۲۸۲e);
    }

    @Override // p۳۰۵f.InterfaceCs
    /* renamed from: b, reason: contains not printable characters */
    public long mo۱۷۴۷۷b(Cc sink, long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (this.f۱۶۲۸۰c == 0) {
            m۱۷۳۹۴d();
            this.f۱۶۲۸۰c = 1;
        }
        if (this.f۱۶۲۸۰c == 1) {
            long offset = sink.f۱۶۲۷۰d;
            long result = this.f۱۶۲۸۳f.mo۱۷۴۷۷b(sink, byteCount);
            if (result != -1) {
                m۱۷۳۹۲a(sink, offset, result);
                return result;
            }
            this.f۱۶۲۸۰c = 2;
        }
        if (this.f۱۶۲۸۰c == 2) {
            m۱۷۳۹۵l();
            this.f۱۶۲۸۰c = 3;
            if (!this.f۱۶۲۸۱d.mo۱۷۴۴۸i()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۷۳۹۴d() {
        this.f۱۶۲۸۱d.mo۱۷۴۴۲d(10L);
        byte flags = this.f۱۶۲۸۱d.mo۱۷۴۳۳a().m۱۷۳۲۰g(3L);
        boolean fhcrc = ((flags >> 1) & 1) == 1;
        if (fhcrc) {
            m۱۷۳۹۲a(this.f۱۶۲۸۱d.mo۱۷۴۳۳a(), 0L, 10L);
        }
        short id1id2 = this.f۱۶۲۸۱d.readShort();
        m۱۷۳۹۳a("ID1ID2", 8075, id1id2);
        this.f۱۶۲۸۱d.skip(8L);
        if (((flags >> 2) & 1) == 1) {
            this.f۱۶۲۸۱d.mo۱۷۴۴۲d(2L);
            if (fhcrc) {
                m۱۷۳۹۲a(this.f۱۶۲۸۱d.mo۱۷۴۳۳a(), 0L, 2L);
            }
            int xlen = this.f۱۶۲۸۱d.mo۱۷۴۳۳a().mo۱۷۴۴۱c();
            this.f۱۶۲۸۱d.mo۱۷۴۴۲d(xlen);
            if (fhcrc) {
                m۱۷۳۹۲a(this.f۱۶۲۸۱d.mo۱۷۴۳۳a(), 0L, xlen);
            }
            this.f۱۶۲۸۱d.skip(xlen);
        }
        if (((flags >> 3) & 1) == 1) {
            long index = this.f۱۶۲۸۱d.mo۱۷۴۳۱a((byte) 0);
            if (index == -1) {
                throw new EOFException();
            }
            if (fhcrc) {
                m۱۷۳۹۲a(this.f۱۶۲۸۱d.mo۱۷۴۳۳a(), 0L, index + 1);
            }
            this.f۱۶۲۸۱d.skip(index + 1);
        }
        if (((flags >> 4) & 1) == 1) {
            long index2 = this.f۱۶۲۸۱d.mo۱۷۴۳۱a((byte) 0);
            if (index2 == -1) {
                throw new EOFException();
            }
            if (fhcrc) {
                m۱۷۳۹۲a(this.f۱۶۲۸۱d.mo۱۷۴۳۳a(), 0L, index2 + 1);
            }
            this.f۱۶۲۸۱d.skip(1 + index2);
        }
        if (fhcrc) {
            m۱۷۳۹۳a("FHCRC", this.f۱۶۲۸۱d.mo۱۷۴۴۱c(), (short) this.f۱۶۲۸۴g.getValue());
            this.f۱۶۲۸۴g.reset();
        }
    }

    /* renamed from: l, reason: contains not printable characters */
    private void m۱۷۳۹۵l() {
        m۱۷۳۹۳a("CRC", this.f۱۶۲۸۱d.mo۱۷۴۴۷h(), (int) this.f۱۶۲۸۴g.getValue());
        m۱۷۳۹۳a("ISIZE", this.f۱۶۲۸۱d.mo۱۷۴۴۷h(), (int) this.f۱۶۲۸۲e.getBytesWritten());
    }

    @Override // p۳۰۵f.InterfaceCs
    /* renamed from: b, reason: contains not printable characters */
    public Ct mo۱۷۴۷۸b() {
        return this.f۱۶۲۸۱d.mo۱۷۴۷۸b();
    }

    @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f۱۶۲۸۳f.close();
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۷۳۹۲a(Cc buffer, long offset, long byteCount) {
        Co s = buffer.f۱۶۲۶۹c;
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
            int pos = (int) (s.f۱۶۳۰۳b + offset);
            int toUpdate = (int) Math.min(s.f۱۶۳۰۴c - pos, byteCount);
            this.f۱۶۲۸۴g.update(s.f۱۶۳۰۲a, pos, toUpdate);
            byteCount -= toUpdate;
            offset = 0;
            s = s.f۱۶۳۰۷f;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۷۳۹۳a(String name, int expected, int actual) {
        if (actual != expected) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", name, Integer.valueOf(actual), Integer.valueOf(expected)));
        }
    }
}
