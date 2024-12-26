package p۱۳۹e;

import java.util.List;
import p۱۳۹e.Cr;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Cf;

/* renamed from: e.y  reason: invalid class name */
public final class Cy {

    /* renamed from: a  reason: contains not printable characters */
    final Cs f۱۶۲۴۲a;

    /* renamed from: b  reason: contains not printable characters */
    final String f۱۶۲۴۳b;

    /* renamed from: c  reason: contains not printable characters */
    final Cr f۱۶۲۴۴c;

    /* renamed from: d  reason: contains not printable characters */
    final AbstractCz f۱۶۲۴۵d;

    /* renamed from: e  reason: contains not printable characters */
    final Object f۱۶۲۴۶e;

    /* renamed from: f  reason: contains not printable characters */
    private volatile Cd f۱۶۲۴۷f;

    Cy(Ca builder) {
        this.f۱۶۲۴۲a = builder.f۱۶۲۴۸a;
        this.f۱۶۲۴۳b = builder.f۱۶۲۴۹b;
        this.f۱۶۲۴۴c = builder.f۱۶۲۵۰c.m۱۹۲۰۸a();
        this.f۱۶۲۴۵d = builder.f۱۶۲۵۱d;
        Object obj = builder.f۱۶۲۵۲e;
        this.f۱۶۲۴۶e = obj == null ? this : obj;
    }

    /* renamed from: g  reason: contains not printable characters */
    public Cs m۱۹۳۲۹g() {
        return this.f۱۶۲۴۲a;
    }

    /* renamed from: e  reason: contains not printable characters */
    public String m۱۹۳۲۷e() {
        return this.f۱۶۲۴۳b;
    }

    /* renamed from: c  reason: contains not printable characters */
    public Cr m۱۹۳۲۵c() {
        return this.f۱۶۲۴۴c;
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۳۲۲a(String name) {
        return this.f۱۶۲۴۴c.m۱۹۲۰۱a(name);
    }

    /* renamed from: b  reason: contains not printable characters */
    public List<String> m۱۹۳۲۴b(String name) {
        return this.f۱۶۲۴۴c.m۱۹۲۰۴b(name);
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCz m۱۹۳۲۱a() {
        return this.f۱۶۲۴۵d;
    }

    /* renamed from: f  reason: contains not printable characters */
    public Ca m۱۹۳۲۸f() {
        return new Ca(this);
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cd m۱۹۳۲۳b() {
        Cd result = this.f۱۶۲۴۷f;
        if (result != null) {
            return result;
        }
        Cd a = Cd.m۱۸۵۷۲a(this.f۱۶۲۴۴c);
        this.f۱۶۲۴۷f = a;
        return a;
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۹۳۲۶d() {
        return this.f۱۶۲۴۲a.m۱۹۲۳۵h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f۱۶۲۴۳b);
        sb.append(", url=");
        sb.append(this.f۱۶۲۴۲a);
        sb.append(", tag=");
        Object obj = this.f۱۶۲۴۶e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: e.y$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        Cs f۱۶۲۴۸a;

        /* renamed from: b  reason: contains not printable characters */
        String f۱۶۲۴۹b;

        /* renamed from: c  reason: contains not printable characters */
        Cr.Ca f۱۶۲۵۰c;

        /* renamed from: d  reason: contains not printable characters */
        AbstractCz f۱۶۲۵۱d;

        /* renamed from: e  reason: contains not printable characters */
        Object f۱۶۲۵۲e;

        public Ca() {
            this.f۱۶۲۴۹b = "GET";
            this.f۱۶۲۵۰c = new Cr.Ca();
        }

        Ca(Cy request) {
            this.f۱۶۲۴۸a = request.f۱۶۲۴۲a;
            this.f۱۶۲۴۹b = request.f۱۶۲۴۳b;
            this.f۱۶۲۵۱d = request.f۱۶۲۴۵d;
            this.f۱۶۲۵۲e = request.f۱۶۲۴۶e;
            this.f۱۶۲۵۰c = request.f۱۶۲۴۴c.m۱۹۱۹۹a();
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۳۳۲a(Cs url) {
            if (url != null) {
                this.f۱۶۲۴۸a = url;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: b  reason: contains not printable characters */
        public Ca m۱۹۳۳۷b(String url) {
            if (url != null) {
                if (url.regionMatches(true, 0, "ws:", 0, 3)) {
                    url = "http:" + url.substring(3);
                } else if (url.regionMatches(true, 0, "wss:", 0, 4)) {
                    url = "https:" + url.substring(4);
                }
                Cs parsed = Cs.m۱۹۲۲۴d(url);
                if (parsed != null) {
                    m۱۹۳۳۲a(parsed);
                    return this;
                }
                throw new IllegalArgumentException("unexpected url: " + url);
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۳۳۵a(String name, String value) {
            this.f۱۶۲۵۰c.m۱۹۲۱۲c(name, value);
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۳۳۳a(String name) {
            this.f۱۶۲۵۰c.m۱۹۲۱۱c(name);
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۳۳۱a(Cr headers) {
            this.f۱۶۲۵۰c = headers.m۱۹۱۹۹a();
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۳۳۰a(Cd cacheControl) {
            String value = cacheControl.toString();
            if (value.isEmpty()) {
                m۱۹۳۳۳a("Cache-Control");
                return this;
            }
            m۱۹۳۳۵a("Cache-Control", value);
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۳۳۴a(String method, AbstractCz body) {
            if (method == null) {
                throw new NullPointerException("method == null");
            } else if (method.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (body != null && !Cf.m۱۸۷۷۹b(method)) {
                throw new IllegalArgumentException("method " + method + " must not have a request body.");
            } else if (body != null || !Cf.m۱۸۷۸۲e(method)) {
                this.f۱۶۲۴۹b = method;
                this.f۱۶۲۵۱d = body;
                return this;
            } else {
                throw new IllegalArgumentException("method " + method + " must have a request body.");
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cy m۱۹۳۳۶a() {
            if (this.f۱۶۲۴۸a != null) {
                return new Cy(this);
            }
            throw new IllegalStateException("url == null");
        }
    }
}
