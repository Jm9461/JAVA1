package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

final class n extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    private final InputStream f۳۵۵۸c;

    /* renamed from: d  reason: collision with root package name */
    private long f۳۵۵۹d;

    /* renamed from: e  reason: collision with root package name */
    private long f۳۵۶۰e;

    /* renamed from: f  reason: collision with root package name */
    private long f۳۵۶۱f;

    /* renamed from: g  reason: collision with root package name */
    private long f۳۵۶۲g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۳۵۶۳h;
    private int i;

    n(InputStream in) {
        this(in, 4096);
    }

    n(InputStream in, int size) {
        this(in, size, 1024);
    }

    private n(InputStream in, int size, int limitIncrement) {
        this.f۳۵۶۲g = -1;
        this.f۳۵۶۳h = true;
        this.i = -1;
        this.f۳۵۵۸c = !in.markSupported() ? new BufferedInputStream(in, size) : in;
        this.i = limitIncrement;
    }

    public void mark(int readLimit) {
        this.f۳۵۶۲g = a(readLimit);
    }

    public long a(int readLimit) {
        long offsetLimit = this.f۳۵۵۹d + ((long) readLimit);
        if (this.f۳۵۶۱f < offsetLimit) {
            h(offsetLimit);
        }
        return this.f۳۵۵۹d;
    }

    public void a(boolean allowExpire) {
        this.f۳۵۶۳h = allowExpire;
    }

    private void h(long limit) {
        try {
            if (this.f۳۵۶۰e >= this.f۳۵۵۹d || this.f۳۵۵۹d > this.f۳۵۶۱f) {
                this.f۳۵۶۰e = this.f۳۵۵۹d;
                this.f۳۵۵۸c.mark((int) (limit - this.f۳۵۵۹d));
            } else {
                this.f۳۵۵۸c.reset();
                this.f۳۵۵۸c.mark((int) (limit - this.f۳۵۶۰e));
                a(this.f۳۵۶۰e, this.f۳۵۵۹d);
            }
            this.f۳۵۶۱f = limit;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to mark: " + e2);
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        g(this.f۳۵۶۲g);
    }

    public void g(long token) {
        if (this.f۳۵۵۹d > this.f۳۵۶۱f || token < this.f۳۵۶۰e) {
            throw new IOException("Cannot reset");
        }
        this.f۳۵۵۸c.reset();
        a(this.f۳۵۶۰e, token);
        this.f۳۵۵۹d = token;
    }

    private void a(long current, long target) {
        while (current < target) {
            long skipped = this.f۳۵۵۸c.skip(target - current);
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
        if (!this.f۳۵۶۳h) {
            long j = this.f۳۵۶۱f;
            if (this.f۳۵۵۹d + 1 > j) {
                h(j + ((long) this.i));
            }
        }
        int result = this.f۳۵۵۸c.read();
        if (result != -1) {
            this.f۳۵۵۹d++;
        }
        return result;
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer) {
        if (!this.f۳۵۶۳h) {
            long j = this.f۳۵۵۹d;
            if (((long) buffer.length) + j > this.f۳۵۶۱f) {
                h(j + ((long) buffer.length) + ((long) this.i));
            }
        }
        int count = this.f۳۵۵۸c.read(buffer);
        if (count != -1) {
            this.f۳۵۵۹d += (long) count;
        }
        return count;
    }

    @Override // java.io.InputStream
    public int read(byte[] buffer, int offset, int length) {
        if (!this.f۳۵۶۳h) {
            long j = this.f۳۵۵۹d;
            if (((long) length) + j > this.f۳۵۶۱f) {
                h(j + ((long) length) + ((long) this.i));
            }
        }
        int count = this.f۳۵۵۸c.read(buffer, offset, length);
        if (count != -1) {
            this.f۳۵۵۹d += (long) count;
        }
        return count;
    }

    @Override // java.io.InputStream
    public long skip(long byteCount) {
        if (!this.f۳۵۶۳h) {
            long j = this.f۳۵۵۹d;
            if (j + byteCount > this.f۳۵۶۱f) {
                h(j + byteCount + ((long) this.i));
            }
        }
        long skipped = this.f۳۵۵۸c.skip(byteCount);
        this.f۳۵۵۹d += skipped;
        return skipped;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f۳۵۵۸c.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.f۳۵۵۸c.close();
    }

    public boolean markSupported() {
        return this.f۳۵۵۸c.markSupported();
    }
}
