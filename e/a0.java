package e;

import e.r;
import java.io.Closeable;

public final class a0 implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    final y f۳۶۷۲c;

    /* renamed from: d  reason: collision with root package name */
    final w f۳۶۷۳d;

    /* renamed from: e  reason: collision with root package name */
    final int f۳۶۷۴e;

    /* renamed from: f  reason: collision with root package name */
    final String f۳۶۷۵f;

    /* renamed from: g  reason: collision with root package name */
    final q f۳۶۷۶g;

    /* renamed from: h  reason: collision with root package name */
    final r f۳۶۷۷h;
    final b0 i;
    final a0 j;
    final a0 k;
    final a0 l;
    final long m;
    final long n;
    private volatile d o;

    a0(a builder) {
        this.f۳۶۷۲c = builder.f۳۶۷۸a;
        this.f۳۶۷۳d = builder.f۳۶۷۹b;
        this.f۳۶۷۴e = builder.f۳۶۸۰c;
        this.f۳۶۷۵f = builder.f۳۶۸۱d;
        this.f۳۶۷۶g = builder.f۳۶۸۲e;
        this.f۳۶۷۷h = builder.f۳۶۸۳f.a();
        this.i = builder.f۳۶۸۴g;
        this.j = builder.f۳۶۸۵h;
        this.k = builder.i;
        this.l = builder.j;
        this.m = builder.k;
        this.n = builder.l;
    }

    public y y() {
        return this.f۳۶۷۲c;
    }

    public w w() {
        return this.f۳۶۷۳d;
    }

    public int o() {
        return this.f۳۶۷۴e;
    }

    public boolean r() {
        int i2 = this.f۳۶۷۴e;
        return i2 >= 200 && i2 < 300;
    }

    public String s() {
        return this.f۳۶۷۵f;
    }

    public q p() {
        return this.f۳۶۷۶g;
    }

    public String b(String name) {
        return a(name, null);
    }

    public String a(String name, String defaultValue) {
        String result = this.f۳۶۷۷h.a(name);
        return result != null ? result : defaultValue;
    }

    public r q() {
        return this.f۳۶۷۷h;
    }

    public b0 l() {
        return this.i;
    }

    public a u() {
        return new a(this);
    }

    public a0 t() {
        return this.j;
    }

    public a0 n() {
        return this.k;
    }

    public a0 v() {
        return this.l;
    }

    public d m() {
        d result = this.o;
        if (result != null) {
            return result;
        }
        d a2 = d.a(this.f۳۶۷۷h);
        this.o = a2;
        return a2;
    }

    public long z() {
        return this.m;
    }

    public long x() {
        return this.n;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.i;
        if (b0Var != null) {
            b0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public String toString() {
        return "Response{protocol=" + this.f۳۶۷۳d + ", code=" + this.f۳۶۷۴e + ", message=" + this.f۳۶۷۵f + ", url=" + this.f۳۶۷۲c.g() + '}';
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        y f۳۶۷۸a;

        /* renamed from: b  reason: collision with root package name */
        w f۳۶۷۹b;

        /* renamed from: c  reason: collision with root package name */
        int f۳۶۸۰c;

        /* renamed from: d  reason: collision with root package name */
        String f۳۶۸۱d;

        /* renamed from: e  reason: collision with root package name */
        q f۳۶۸۲e;

        /* renamed from: f  reason: collision with root package name */
        r.a f۳۶۸۳f;

        /* renamed from: g  reason: collision with root package name */
        b0 f۳۶۸۴g;

        /* renamed from: h  reason: collision with root package name */
        a0 f۳۶۸۵h;
        a0 i;
        a0 j;
        long k;
        long l;

        public a() {
            this.f۳۶۸۰c = -1;
            this.f۳۶۸۳f = new r.a();
        }

        a(a0 response) {
            this.f۳۶۸۰c = -1;
            this.f۳۶۷۸a = response.f۳۶۷۲c;
            this.f۳۶۷۹b = response.f۳۶۷۳d;
            this.f۳۶۸۰c = response.f۳۶۷۴e;
            this.f۳۶۸۱d = response.f۳۶۷۵f;
            this.f۳۶۸۲e = response.f۳۶۷۶g;
            this.f۳۶۸۳f = response.f۳۶۷۷h.a();
            this.f۳۶۸۴g = response.i;
            this.f۳۶۸۵h = response.j;
            this.i = response.k;
            this.j = response.l;
            this.k = response.m;
            this.l = response.n;
        }

        public a a(y request) {
            this.f۳۶۷۸a = request;
            return this;
        }

        public a a(w protocol) {
            this.f۳۶۷۹b = protocol;
            return this;
        }

        public a a(int code) {
            this.f۳۶۸۰c = code;
            return this;
        }

        public a a(String message) {
            this.f۳۶۸۱d = message;
            return this;
        }

        public a a(q handshake) {
            this.f۳۶۸۲e = handshake;
            return this;
        }

        public a a(String name, String value) {
            this.f۳۶۸۳f.a(name, value);
            return this;
        }

        public a a(r headers) {
            this.f۳۶۸۳f = headers.a();
            return this;
        }

        public a a(b0 body) {
            this.f۳۶۸۴g = body;
            return this;
        }

        public a b(a0 networkResponse) {
            if (networkResponse != null) {
                a("networkResponse", networkResponse);
            }
            this.f۳۶۸۵h = networkResponse;
            return this;
        }

        public a a(a0 cacheResponse) {
            if (cacheResponse != null) {
                a("cacheResponse", cacheResponse);
            }
            this.i = cacheResponse;
            return this;
        }

        private void a(String name, a0 response) {
            if (response.i != null) {
                throw new IllegalArgumentException(name + ".body != null");
            } else if (response.j != null) {
                throw new IllegalArgumentException(name + ".networkResponse != null");
            } else if (response.k != null) {
                throw new IllegalArgumentException(name + ".cacheResponse != null");
            } else if (response.l != null) {
                throw new IllegalArgumentException(name + ".priorResponse != null");
            }
        }

        public a c(a0 priorResponse) {
            if (priorResponse != null) {
                d(priorResponse);
            }
            this.j = priorResponse;
            return this;
        }

        private void d(a0 response) {
            if (response.i != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a b(long sentRequestAtMillis) {
            this.k = sentRequestAtMillis;
            return this;
        }

        public a a(long receivedResponseAtMillis) {
            this.l = receivedResponseAtMillis;
            return this;
        }

        public a0 a() {
            if (this.f۳۶۷۸a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f۳۶۷۹b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f۳۶۸۰c < 0) {
                throw new IllegalStateException("code < 0: " + this.f۳۶۸۰c);
            } else if (this.f۳۶۸۱d != null) {
                return new a0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }
}
