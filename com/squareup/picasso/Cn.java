package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.n  reason: invalid class name */
final class Cn extends InputStream {

    /* renamed from: c  reason: contains not printable characters */
    private final InputStream f۱۵۴۵۳c;

    /* renamed from: d  reason: contains not printable characters */
    private long f۱۵۴۵۴d;

    /* renamed from: e  reason: contains not printable characters */
    private long f۱۵۴۵۵e;

    /* renamed from: f  reason: contains not printable characters */
    private long f۱۵۴۵۶f;

    /* renamed from: g  reason: contains not printable characters */
    private long f۱۵۴۵۷g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۵۴۵۸h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۵۴۵۹i;

    Cn(InputStream in) {
        this(in, 4096);
    }

    Cn(InputStream in, int size) {
        this(in, size, 1024);
    }

    private Cn(InputStream in, int size, int limitIncrement) {
        this.f۱۵۴۵۷g = -1;
        this.f۱۵۴۵۸h = true;
        this.f۱۵۴۵۹i = -1;
        this.f۱۵۴۵۳c = !in.markSupported() ? new BufferedInputStream(in, size) : in;
        this.f۱۵۴۵۹i = limitIncrement;
    }

    public void mark(int readLimit) {
        this.f۱۵۴۵۷g = m۱۸۳۷۵a(readLimit);
    }

    /* renamed from: a  reason: contains not printable characters */
    public long m۱۸۳۷۵a(int readLimit) {
        long offsetLimit = this.f۱۵۴۵۴d + ((long) readLimit);
        if (this.f۱۵۴۵۶f < offsetLimit) {
            m۱۸۳۷۴h(offsetLimit);
        }
        return this.f۱۵۴۵۴d;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۷۶a(boolean allowExpire) {
        this.f۱۵۴۵۸h = allowExpire;
    }

    /* renamed from: h  reason: contains not printable characters */
    private void m۱۸۳۷۴h(long limit) {
        try {
            if (this.f۱۵۴۵۵e >= this.f۱۵۴۵۴d || this.f۱۵۴۵۴d > this.f۱۵۴۵۶f) {
                this.f۱۵۴۵۵e = this.f۱۵۴۵۴d;
                this.f۱۵۴۵۳c.mark((int) (limit - this.f۱۵۴۵۴d));
            } else {
                this.f۱۵۴۵۳c.reset();
                this.f۱۵۴۵۳c.mark((int) (limit - this.f۱۵۴۵۵e));
                m۱۸۳۷۳a(this.f۱۵۴۵۵e, this.f۱۵۴۵۴d);
            }
            this.f۱۵۴۵۶f = limit;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        m۱۸۳۷۷g(this.f۱۵۴۵۷g);
    }

    /* renamed from: g  reason: contains not printable characters */
    public void m۱۸۳۷۷g(long token) {
        if (this.f۱۵۴۵۴d > this.f۱۵۴۵۶f || token < this.f۱۵۴۵۵e) {
            throw new IOException("Cannot reset");
        }
        this.f۱۵۴۵۳c.reset();
        m۱۸۳۷۳a(this.f۱۵۴۵۵e, token);
        this.f۱۵۴۵۴d = token;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۳۷۳a(long current, long target) {
        while (current < target) {
            long skipped = this.f۱۵۴۵۳c.skip(target - current);
            if (skipped == 0) {
                if (read() != -1) {
                    skipped = 1;
                } else {
                    return;
                }
            }
            current += skipped;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.f۱۵۴۵۸h) {
            long j = this.f۱۵۴۵۶f;
            if (this.f۱۵۴۵۴d + 1 > j) {
                m۱۸۳۷۴h(j + ((long) this.f۱۵۴۵۹i));
            }
        }
        int result = this.f۱۵۴۵۳c.read();
        if (result != -1) {
            this.f۱۵۴۵۴d++;
        }
        return result;
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer) {
        if (!this.f۱۵۴۵۸h) {
            long j = this.f۱۵۴۵۴d;
            if (((long) buffer.length) + j > this.f۱۵۴۵۶f) {
                m۱۸۳۷۴h(j + ((long) buffer.length) + ((long) this.f۱۵۴۵۹i));
            }
        }
        int count = this.f۱۵۴۵۳c.read(buffer);
        if (count != -1) {
            this.f۱۵۴۵۴d += (long) count;
        }
        return count;
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer, int offset, int length) {
        if (!this.f۱۵۴۵۸h) {
            long j = this.f۱۵۴۵۴d;
            if (((long) length) + j > this.f۱۵۴۵۶f) {
                m۱۸۳۷۴h(j + ((long) length) + ((long) this.f۱۵۴۵۹i));
            }
        }
        int count = this.f۱۵۴۵۳c.read(buffer, offset, length);
        if (count != -1) {
            this.f۱۵۴۵۴d += (long) count;
        }
        return count;
    }

    @Override // java.io.InputStream
    public long skip(long byteCount) {
        if (!this.f۱۵۴۵۸h) {
            long j = this.f۱۵۴۵۴d;
            if (j + byteCount > this.f۱۵۴۵۶f) {
                m۱۸۳۷۴h(j + byteCount + ((long) this.f۱۵۴۵۹i));
            }
        }
        long skipped = this.f۱۵۴۵۳c.skip(byteCount);
        this.f۱۵۴۵۴d += skipped;
        return skipped;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f۱۵۴۵۳c.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.f۱۵۴۵۳c.close();
    }

    public boolean markSupported() {
        return this.f۱۵۴۵۳c.markSupported();
    }
}
