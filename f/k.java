package f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class k implements s {

    /* renamed from: c  reason: collision with root package name */
    private final e f۴۱۹۲c;

    /* renamed from: d  reason: collision with root package name */
    private final Inflater f۴۱۹۳d;

    /* renamed from: e  reason: collision with root package name */
    private int f۴۱۹۴e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f۴۱۹۵f;

    k(e source, Inflater inflater) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f۴۱۹۲c = source;
            this.f۴۱۹۳d = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    @Override // f.s
    public long b(c sink, long byteCount) {
        o tail;
        if (byteCount < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        } else if (this.f۴۱۹۵f) {
            throw new IllegalStateException("closed");
        } else if (byteCount == 0) {
            return 0;
        } else {
            while (true) {
                boolean sourceExhausted = d();
                try {
                    tail = sink.b(1);
                    int bytesInflated = this.f۴۱۹۳d.inflate(tail.f۴۲۰۸a, tail.f۴۲۱۰c, (int) Math.min(byteCount, (long) (8192 - tail.f۴۲۱۰c)));
                    if (bytesInflated > 0) {
                        tail.f۴۲۱۰c += bytesInflated;
                        sink.f۴۱۷۷d += (long) bytesInflated;
                        return (long) bytesInflated;
                    } else if (this.f۴۱۹۳d.finished()) {
                        break;
                    } else if (this.f۴۱۹۳d.needsDictionary()) {
                        break;
                    } else if (sourceExhausted) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            l();
            if (tail.f۴۲۰۹b != tail.f۴۲۱۰c) {
                return -1;
            }
            sink.f۴۱۷۶c = tail.b();
            p.a(tail);
            return -1;
        }
    }

    public boolean d() {
        if (!this.f۴۱۹۳d.needsInput()) {
            return false;
        }
        l();
        if (this.f۴۱۹۳d.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f۴۱۹۲c.i()) {
            return true;
        } else {
            o head = this.f۴۱۹۲c.a().f۴۱۷۶c;
            int i = head.f۴۲۱۰c;
            int i2 = head.f۴۲۰۹b;
            this.f۴۱۹۴e = i - i2;
            this.f۴۱۹۳d.setInput(head.f۴۲۰۸a, i2, this.f۴۱۹۴e);
            return false;
        }
    }

    private void l() {
        int i = this.f۴۱۹۴e;
        if (i != 0) {
            int toRelease = i - this.f۴۱۹۳d.getRemaining();
            this.f۴۱۹۴e -= toRelease;
            this.f۴۱۹۲c.skip((long) toRelease);
        }
    }

    @Override // f.s
    public t b() {
        return this.f۴۱۹۲c.b();
    }

    @Override // java.io.Closeable, f.s, java.lang.AutoCloseable
    public void close() {
        if (!this.f۴۱۹۵f) {
            this.f۴۱۹۳d.end();
            this.f۴۱۹۵f = true;
            this.f۴۱۹۲c.close();
        }
    }
}
