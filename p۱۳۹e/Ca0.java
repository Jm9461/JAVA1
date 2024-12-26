package p۱۳۹e;

import java.io.Closeable;
import p۱۳۹e.Cr;

/* renamed from: e.a0  reason: invalid class name */
public final class Ca0 implements Closeable {

    /* renamed from: c  reason: contains not printable characters */
    final Cy f۱۵۶۱۰c;

    /* renamed from: d  reason: contains not printable characters */
    final EnumCw f۱۵۶۱۱d;

    /* renamed from: e  reason: contains not printable characters */
    final int f۱۵۶۱۲e;

    /* renamed from: f  reason: contains not printable characters */
    final String f۱۵۶۱۳f;

    /* renamed from: g  reason: contains not printable characters */
    final Cq f۱۵۶۱۴g;

    /* renamed from: h  reason: contains not printable characters */
    final Cr f۱۵۶۱۵h;

    /* renamed from: i  reason: contains not printable characters */
    final AbstractCb0 f۱۵۶۱۶i;

    /* renamed from: j  reason: contains not printable characters */
    final Ca0 f۱۵۶۱۷j;

    /* renamed from: k  reason: contains not printable characters */
    final Ca0 f۱۵۶۱۸k;

    /* renamed from: l  reason: contains not printable characters */
    final Ca0 f۱۵۶۱۹l;

    /* renamed from: m  reason: contains not printable characters */
    final long f۱۵۶۲۰m;

    /* renamed from: n  reason: contains not printable characters */
    final long f۱۵۶۲۱n;

    /* renamed from: o  reason: contains not printable characters */
    private volatile Cd f۱۵۶۲۲o;

    Ca0(Ca builder) {
        this.f۱۵۶۱۰c = builder.f۱۵۶۲۳a;
        this.f۱۵۶۱۱d = builder.f۱۵۶۲۴b;
        this.f۱۵۶۱۲e = builder.f۱۵۶۲۵c;
        this.f۱۵۶۱۳f = builder.f۱۵۶۲۶d;
        this.f۱۵۶۱۴g = builder.f۱۵۶۲۷e;
        this.f۱۵۶۱۵h = builder.f۱۵۶۲۸f.m۱۹۲۰۸a();
        this.f۱۵۶۱۶i = builder.f۱۵۶۲۹g;
        this.f۱۵۶۱۷j = builder.f۱۵۶۳۰h;
        this.f۱۵۶۱۸k = builder.f۱۵۶۳۱i;
        this.f۱۵۶۱۹l = builder.f۱۵۶۳۲j;
        this.f۱۵۶۲۰m = builder.f۱۵۶۳۳k;
        this.f۱۵۶۲۱n = builder.f۱۵۶۳۴l;
    }

    /* renamed from: y  reason: contains not printable characters */
    public Cy m۱۸۵۱۷y() {
        return this.f۱۵۶۱۰c;
    }

    /* renamed from: w  reason: contains not printable characters */
    public EnumCw m۱۸۵۱۵w() {
        return this.f۱۵۶۱۱d;
    }

    /* renamed from: o  reason: contains not printable characters */
    public int m۱۸۵۰۷o() {
        return this.f۱۵۶۱۲e;
    }

    /* renamed from: r  reason: contains not printable characters */
    public boolean m۱۸۵۱۰r() {
        int i = this.f۱۵۶۱۲e;
        return i >= 200 && i < 300;
    }

    /* renamed from: s  reason: contains not printable characters */
    public String m۱۸۵۱۱s() {
        return this.f۱۵۶۱۳f;
    }

    /* renamed from: p  reason: contains not printable characters */
    public Cq m۱۸۵۰۸p() {
        return this.f۱۵۶۱۴g;
    }

    /* renamed from: b  reason: contains not printable characters */
    public String m۱۸۵۰۳b(String name) {
        return m۱۸۵۰۲a(name, null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۸۵۰۲a(String name, String defaultValue) {
        String result = this.f۱۵۶۱۵h.m۱۹۲۰۱a(name);
        return result != null ? result : defaultValue;
    }

    /* renamed from: q  reason: contains not printable characters */
    public Cr m۱۸۵۰۹q() {
        return this.f۱۵۶۱۵h;
    }

    /* renamed from: l  reason: contains not printable characters */
    public AbstractCb0 m۱۸۵۰۴l() {
        return this.f۱۵۶۱۶i;
    }

    /* renamed from: u  reason: contains not printable characters */
    public Ca m۱۸۵۱۳u() {
        return new Ca(this);
    }

    /* renamed from: t  reason: contains not printable characters */
    public Ca0 m۱۸۵۱۲t() {
        return this.f۱۵۶۱۷j;
    }

    /* renamed from: n  reason: contains not printable characters */
    public Ca0 m۱۸۵۰۶n() {
        return this.f۱۵۶۱۸k;
    }

    /* renamed from: v  reason: contains not printable characters */
    public Ca0 m۱۸۵۱۴v() {
        return this.f۱۵۶۱۹l;
    }

    /* renamed from: m  reason: contains not printable characters */
    public Cd m۱۸۵۰۵m() {
        Cd result = this.f۱۵۶۲۲o;
        if (result != null) {
            return result;
        }
        Cd a = Cd.m۱۸۵۷۲a(this.f۱۵۶۱۵h);
        this.f۱۵۶۲۲o = a;
        return a;
    }

    /* renamed from: z  reason: contains not printable characters */
    public long m۱۸۵۱۸z() {
        return this.f۱۵۶۲۰m;
    }

    /* renamed from: x  reason: contains not printable characters */
    public long m۱۸۵۱۶x() {
        return this.f۱۵۶۲۱n;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractCb0 b0Var = this.f۱۵۶۱۶i;
        if (b0Var != null) {
            b0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public String toString() {
        return "Response{protocol=" + this.f۱۵۶۱۱d + ", code=" + this.f۱۵۶۱۲e + ", message=" + this.f۱۵۶۱۳f + ", url=" + this.f۱۵۶۱۰c.m۱۹۳۲۹g() + '}';
    }

    /* renamed from: e.a0$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        Cy f۱۵۶۲۳a;

        /* renamed from: b  reason: contains not printable characters */
        EnumCw f۱۵۶۲۴b;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۵۶۲۵c;

        /* renamed from: d  reason: contains not printable characters */
        String f۱۵۶۲۶d;

        /* renamed from: e  reason: contains not printable characters */
        Cq f۱۵۶۲۷e;

        /* renamed from: f  reason: contains not printable characters */
        Cr.Ca f۱۵۶۲۸f;

        /* renamed from: g  reason: contains not printable characters */
        AbstractCb0 f۱۵۶۲۹g;

        /* renamed from: h  reason: contains not printable characters */
        Ca0 f۱۵۶۳۰h;

        /* renamed from: i  reason: contains not printable characters */
        Ca0 f۱۵۶۳۱i;

        /* renamed from: j  reason: contains not printable characters */
        Ca0 f۱۵۶۳۲j;

        /* renamed from: k  reason: contains not printable characters */
        long f۱۵۶۳۳k;

        /* renamed from: l  reason: contains not printable characters */
        long f۱۵۶۳۴l;

        public Ca() {
            this.f۱۵۶۲۵c = -1;
            this.f۱۵۶۲۸f = new Cr.Ca();
        }

        Ca(Ca0 response) {
            this.f۱۵۶۲۵c = -1;
            this.f۱۵۶۲۳a = response.f۱۵۶۱۰c;
            this.f۱۵۶۲۴b = response.f۱۵۶۱۱d;
            this.f۱۵۶۲۵c = response.f۱۵۶۱۲e;
            this.f۱۵۶۲۶d = response.f۱۵۶۱۳f;
            this.f۱۵۶۲۷e = response.f۱۵۶۱۴g;
            this.f۱۵۶۲۸f = response.f۱۵۶۱۵h.m۱۹۱۹۹a();
            this.f۱۵۶۲۹g = response.f۱۵۶۱۶i;
            this.f۱۵۶۳۰h = response.f۱۵۶۱۷j;
            this.f۱۵۶۳۱i = response.f۱۵۶۱۸k;
            this.f۱۵۶۳۲j = response.f۱۵۶۱۹l;
            this.f۱۵۶۳۳k = response.f۱۵۶۲۰m;
            this.f۱۵۶۳۴l = response.f۱۵۶۲۱n;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۸۵۲۸a(Cy request) {
            this.f۱۵۶۲۳a = request;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۸۵۲۷a(EnumCw protocol) {
            this.f۱۵۶۲۴b = protocol;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۸۵۲۱a(int code) {
            this.f۱۵۶۲۵c = code;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۸۵۲۹a(String message) {
            this.f۱۵۶۲۶d = message;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۸۵۲۵a(Cq handshake) {
            this.f۱۵۶۲۷e = handshake;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۸۵۳۰a(String name, String value) {
            this.f۱۵۶۲۸f.m۱۹۲۰۷a(name, value);
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۸۵۲۶a(Cr headers) {
            this.f۱۵۶۲۸f = headers.m۱۹۱۹۹a();
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۸۵۲۴a(AbstractCb0 body) {
            this.f۱۵۶۲۹g = body;
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Ca m۱۸۵۳۳b(Ca0 networkResponse) {
            if (networkResponse != null) {
                m۱۸۵۱۹a("networkResponse", networkResponse);
            }
            this.f۱۵۶۳۰h = networkResponse;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۸۵۲۳a(Ca0 cacheResponse) {
            if (cacheResponse != null) {
                m۱۸۵۱۹a("cacheResponse", cacheResponse);
            }
            this.f۱۵۶۳۱i = cacheResponse;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۸۵۱۹a(String name, Ca0 response) {
            if (response.f۱۵۶۱۶i != null) {
                throw new IllegalArgumentException(name + ".body != null");
            } else if (response.f۱۵۶۱۷j != null) {
                throw new IllegalArgumentException(name + ".networkResponse != null");
            } else if (response.f۱۵۶۱۸k != null) {
                throw new IllegalArgumentException(name + ".cacheResponse != null");
            } else if (response.f۱۵۶۱۹l != null) {
                throw new IllegalArgumentException(name + ".priorResponse != null");
            }
        }

        /* renamed from: c  reason: contains not printable characters */
        public Ca m۱۸۵۳۴c(Ca0 priorResponse) {
            if (priorResponse != null) {
                m۱۸۵۲۰d(priorResponse);
            }
            this.f۱۵۶۳۲j = priorResponse;
            return this;
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۸۵۲۰d(Ca0 response) {
            if (response.f۱۵۶۱۶i != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        public Ca m۱۸۵۳۲b(long sentRequestAtMillis) {
            this.f۱۵۶۳۳k = sentRequestAtMillis;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۸۵۲۲a(long receivedResponseAtMillis) {
            this.f۱۵۶۳۴l = receivedResponseAtMillis;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca0 m۱۸۵۳۱a() {
            if (this.f۱۵۶۲۳a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f۱۵۶۲۴b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f۱۵۶۲۵c < 0) {
                throw new IllegalStateException("code < 0: " + this.f۱۵۶۲۵c);
            } else if (this.f۱۵۶۲۶d != null) {
                return new Ca0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }
}
