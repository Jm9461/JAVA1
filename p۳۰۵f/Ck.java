package p۳۰۵f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: f.k, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ck implements InterfaceCs {

    /* renamed from: c, reason: contains not printable characters */
    private final InterfaceCe f۱۶۲۸۵c;

    /* renamed from: d, reason: contains not printable characters */
    private final Inflater f۱۶۲۸۶d;

    /* renamed from: e, reason: contains not printable characters */
    private int f۱۶۲۸۷e;

    /* renamed from: f, reason: contains not printable characters */
    private boolean f۱۶۲۸۸f;

    Ck(InterfaceCe source, Inflater inflater) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f۱۶۲۸۵c = source;
        this.f۱۶۲۸۶d = inflater;
    }

    @Override // p۳۰۵f.InterfaceCs
    /* renamed from: b, reason: contains not printable characters */
    public long mo۱۷۴۷۷b(Cc sink, long byteCount) {
        boolean sourceExhausted;
        if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        }
        if (this.f۱۶۲۸۸f) {
            throw new IllegalStateException("closed");
        }
        if (byteCount == 0) {
            return 0L;
        }
        do {
            sourceExhausted = m۱۷۴۰۱d();
            try {
                Co tail = sink.m۱۷۳۰۷b(1);
                int toRead = (int) Math.min(byteCount, 8192 - tail.f۱۶۳۰۴c);
                int bytesInflated = this.f۱۶۲۸۶d.inflate(tail.f۱۶۳۰۲a, tail.f۱۶۳۰۴c, toRead);
                if (bytesInflated > 0) {
                    tail.f۱۶۳۰۴c += bytesInflated;
                    sink.f۱۶۲۷۰d += bytesInflated;
                    return bytesInflated;
                }
                if (!this.f۱۶۲۸۶d.finished() && !this.f۱۶۲۸۶d.needsDictionary()) {
                }
                m۱۷۳۹۸l();
                if (tail.f۱۶۳۰۳b == tail.f۱۶۳۰۴c) {
                    sink.f۱۶۲۶۹c = tail.m۱۷۴۵۵b();
                    Cp.m۱۷۴۵۸a(tail);
                    return -1L;
                }
                return -1L;
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        } while (!sourceExhausted);
        throw new EOFException("source exhausted prematurely");
    }

    /* renamed from: d, reason: contains not printable characters */
    public boolean m۱۷۴۰۱d() {
        if (!this.f۱۶۲۸۶d.needsInput()) {
            return false;
        }
        m۱۷۳۹۸l();
        if (this.f۱۶۲۸۶d.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f۱۶۲۸۵c.mo۱۷۴۴۸i()) {
            return true;
        }
        Co head = this.f۱۶۲۸۵c.mo۱۷۴۳۳a().f۱۶۲۶۹c;
        int i = head.f۱۶۳۰۴c;
        int i2 = head.f۱۶۳۰۳b;
        this.f۱۶۲۸۷e = i - i2;
        this.f۱۶۲۸۶d.setInput(head.f۱۶۳۰۲a, i2, this.f۱۶۲۸۷e);
        return false;
    }

    /* renamed from: l, reason: contains not printable characters */
    private void m۱۷۳۹۸l() {
        int i = this.f۱۶۲۸۷e;
        if (i == 0) {
            return;
        }
        int toRelease = i - this.f۱۶۲۸۶d.getRemaining();
        this.f۱۶۲۸۷e -= toRelease;
        this.f۱۶۲۸۵c.skip(toRelease);
    }

    @Override // p۳۰۵f.InterfaceCs
    /* renamed from: b, reason: contains not printable characters */
    public Ct mo۱۷۴۷۸b() {
        return this.f۱۶۲۸۵c.mo۱۷۴۷۸b();
    }

    @Override // p۳۰۵f.InterfaceCs, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f۱۶۲۸۸f) {
            return;
        }
        this.f۱۶۲۸۶d.end();
        this.f۱۶۲۸۸f = true;
        this.f۱۶۲۸۵c.close();
    }
}
