package p۱۴۹f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: f.k  reason: invalid class name */
public final class Ck implements AbstractCs {

    /* renamed from: c  reason: contains not printable characters */
    private final AbstractCe f۱۶۲۸۵c;

    /* renamed from: d  reason: contains not printable characters */
    private final Inflater f۱۶۲۸۶d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۶۲۸۷e;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۱۶۲۸۸f;

    Ck(AbstractCe source, Inflater inflater) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f۱۶۲۸۵c = source;
            this.f۱۶۲۸۶d = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    @Override // p۱۴۹f.AbstractCs
    /* renamed from: b  reason: contains not printable characters */
    public long m۱۹۴۷۶b(Cc sink, long byteCount) {
        Co tail;
        if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        } else if (this.f۱۶۲۸۸f) {
            throw new IllegalStateException("closed");
        } else if (byteCount == 0) {
            return 0;
        } else {
            while (true) {
                boolean sourceExhausted = m۱۹۴۷۸d();
                try {
                    tail = sink.m۱۹۳۸۵b(1);
                    int bytesInflated = this.f۱۶۲۸۶d.inflate(tail.f۱۶۳۰۲a, tail.f۱۶۳۰۴c, (int) Math.min(byteCount, (long) (8192 - tail.f۱۶۳۰۴c)));
                    if (bytesInflated > 0) {
                        tail.f۱۶۳۰۴c += bytesInflated;
                        sink.f۱۶۲۷۰d += (long) bytesInflated;
                        return (long) bytesInflated;
                    } else if (this.f۱۶۲۸۶d.finished()) {
                        break;
                    } else if (this.f۱۶۲۸۶d.needsDictionary()) {
                        break;
                    } else if (sourceExhausted) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m۱۹۴۷۵l();
            if (tail.f۱۶۳۰۳b != tail.f۱۶۳۰۴c) {
                return -1;
            }
            sink.f۱۶۲۶۹c = tail.m۱۹۵۳۲b();
            Cp.m۱۹۵۳۵a(tail);
            return -1;
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۹۴۷۸d() {
        if (!this.f۱۶۲۸۶d.needsInput()) {
            return false;
        }
        m۱۹۴۷۵l();
        if (this.f۱۶۲۸۶d.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f۱۶۲۸۵c.m۱۹۴۲۹i()) {
            return true;
        } else {
            Co head = this.f۱۶۲۸۵c.m۱۹۴۱۸a().f۱۶۲۶۹c;
            int i = head.f۱۶۳۰۴c;
            int i2 = head.f۱۶۳۰۳b;
            this.f۱۶۲۸۷e = i - i2;
            this.f۱۶۲۸۶d.setInput(head.f۱۶۳۰۲a, i2, this.f۱۶۲۸۷e);
            return false;
        }
    }

    /* renamed from: l  reason: contains not printable characters */
    private void m۱۹۴۷۵l() {
        int i = this.f۱۶۲۸۷e;
        if (i != 0) {
            int toRelease = i - this.f۱۶۲۸۶d.getRemaining();
            this.f۱۶۲۸۷e -= toRelease;
            this.f۱۶۲۸۵c.skip((long) toRelease);
        }
    }

    @Override // p۱۴۹f.AbstractCs
    /* renamed from: b  reason: contains not printable characters */
    public Ct m۱۹۴۷۷b() {
        return this.f۱۶۲۸۵c.m۱۹۵۵۵b();
    }

    @Override // java.io.Closeable, p۱۴۹f.AbstractCs, java.lang.AutoCloseable
    public void close() {
        if (!this.f۱۶۲۸۸f) {
            this.f۱۶۲۸۶d.end();
            this.f۱۶۲۸۸f = true;
            this.f۱۶۲۸۵c.close();
        }
    }
}
