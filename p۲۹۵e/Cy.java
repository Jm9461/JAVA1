package p۲۹۵e;

import java.util.List;
import p۲۹۵e.Cr;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Cf;

/* renamed from: e.y, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cy {

    /* renamed from: a, reason: contains not printable characters */
    final Cs f۱۶۲۴۲a;

    /* renamed from: b, reason: contains not printable characters */
    final String f۱۶۲۴۳b;

    /* renamed from: c, reason: contains not printable characters */
    final Cr f۱۶۲۴۴c;

    /* renamed from: d, reason: contains not printable characters */
    final AbstractCz f۱۶۲۴۵d;

    /* renamed from: e, reason: contains not printable characters */
    final Object f۱۶۲۴۶e;

    /* renamed from: f, reason: contains not printable characters */
    private volatile Cd f۱۶۲۴۷f;

    Cy(a builder) {
        this.f۱۶۲۴۲a = builder.f۱۶۲۴۸a;
        this.f۱۶۲۴۳b = builder.f۱۶۲۴۹b;
        this.f۱۶۲۴۴c = builder.f۱۶۲۵۰c.m۱۷۱۲۹a();
        this.f۱۶۲۴۵d = builder.f۱۶۲۵۱d;
        Object obj = builder.f۱۶۲۵۲e;
        this.f۱۶۲۴۶e = obj == null ? this : obj;
    }

    /* renamed from: g, reason: contains not printable characters */
    public Cs m۱۷۲۵۱g() {
        return this.f۱۶۲۴۲a;
    }

    /* renamed from: e, reason: contains not printable characters */
    public String m۱۷۲۴۹e() {
        return this.f۱۶۲۴۳b;
    }

    /* renamed from: c, reason: contains not printable characters */
    public Cr m۱۷۲۴۷c() {
        return this.f۱۶۲۴۴c;
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۷۲۴۴a(String name) {
        return this.f۱۶۲۴۴c.m۱۷۱۲۲a(name);
    }

    /* renamed from: b, reason: contains not printable characters */
    public List<String> m۱۷۲۴۶b(String name) {
        return this.f۱۶۲۴۴c.m۱۷۱۲۵b(name);
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCz m۱۷۲۴۳a() {
        return this.f۱۶۲۴۵d;
    }

    /* renamed from: f, reason: contains not printable characters */
    public a m۱۷۲۵۰f() {
        return new a(this);
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cd m۱۷۲۴۵b() {
        Cd result = this.f۱۶۲۴۷f;
        if (result != null) {
            return result;
        }
        Cd cd = Cd.m۱۶۴۹۳a(this.f۱۶۲۴۴c);
        this.f۱۶۲۴۷f = cd;
        return cd;
    }

    /* renamed from: d, reason: contains not printable characters */
    public boolean m۱۷۲۴۸d() {
        return this.f۱۶۲۴۲a.m۱۷۱۵۶h();
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

    /* renamed from: e.y$a */
    public static class a {

        /* renamed from: a, reason: contains not printable characters */
        Cs f۱۶۲۴۸a;

        /* renamed from: b, reason: contains not printable characters */
        String f۱۶۲۴۹b;

        /* renamed from: c, reason: contains not printable characters */
        Cr.a f۱۶۲۵۰c;

        /* renamed from: d, reason: contains not printable characters */
        AbstractCz f۱۶۲۵۱d;

        /* renamed from: e, reason: contains not printable characters */
        Object f۱۶۲۵۲e;

        public a() {
            this.f۱۶۲۴۹b = "GET";
            this.f۱۶۲۵۰c = new Cr.a();
        }

        a(Cy request) {
            this.f۱۶۲۴۸a = request.f۱۶۲۴۲a;
            this.f۱۶۲۴۹b = request.f۱۶۲۴۳b;
            this.f۱۶۲۵۱d = request.f۱۶۲۴۵d;
            this.f۱۶۲۵۲e = request.f۱۶۲۴۶e;
            this.f۱۶۲۵۰c = request.f۱۶۲۴۴c.m۱۷۱۲۰a();
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۲۵۴a(Cs url) {
            if (url == null) {
                throw new NullPointerException("url == null");
            }
            this.f۱۶۲۴۸a = url;
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public a m۱۷۲۵۹b(String url) {
            if (url == null) {
                throw new NullPointerException("url == null");
            }
            if (url.regionMatches(true, 0, "ws:", 0, 3)) {
                url = "http:" + url.substring(3);
            } else if (url.regionMatches(true, 0, "wss:", 0, 4)) {
                url = "https:" + url.substring(4);
            }
            Cs parsed = Cs.m۱۷۱۴۵d(url);
            if (parsed == null) {
                throw new IllegalArgumentException("unexpected url: " + url);
            }
            m۱۷۲۵۴a(parsed);
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۲۵۷a(String name, String value) {
            this.f۱۶۲۵۰c.m۱۷۱۳۳c(name, value);
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۲۵۵a(String name) {
            this.f۱۶۲۵۰c.m۱۷۱۳۲c(name);
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۲۵۳a(Cr headers) {
            this.f۱۶۲۵۰c = headers.m۱۷۱۲۰a();
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۲۵۲a(Cd cacheControl) {
            String value = cacheControl.toString();
            if (value.isEmpty()) {
                m۱۷۲۵۵a("Cache-Control");
                return this;
            }
            m۱۷۲۵۷a("Cache-Control", value);
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۲۵۶a(String method, AbstractCz body) {
            if (method == null) {
                throw new NullPointerException("method == null");
            }
            if (method.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (body != null && !Cf.m۱۶۷۰۰b(method)) {
                throw new IllegalArgumentException("method " + method + " must not have a request body.");
            }
            if (body == null && Cf.m۱۶۷۰۳e(method)) {
                throw new IllegalArgumentException("method " + method + " must have a request body.");
            }
            this.f۱۶۲۴۹b = method;
            this.f۱۶۲۵۱d = body;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public Cy m۱۷۲۵۸a() {
            if (this.f۱۶۲۴۸a == null) {
                throw new IllegalStateException("url == null");
            }
            return new Cy(this);
        }
    }
}
