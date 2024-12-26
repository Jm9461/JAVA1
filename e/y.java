package e;

import e.f0.g.f;
import e.r;
import java.util.List;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    final s f۴۱۵۱a;

    /* renamed from: b  reason: collision with root package name */
    final String f۴۱۵۲b;

    /* renamed from: c  reason: collision with root package name */
    final r f۴۱۵۳c;

    /* renamed from: d  reason: collision with root package name */
    final z f۴۱۵۴d;

    /* renamed from: e  reason: collision with root package name */
    final Object f۴۱۵۵e;

    /* renamed from: f  reason: collision with root package name */
    private volatile d f۴۱۵۶f;

    y(a builder) {
        this.f۴۱۵۱a = builder.f۴۱۵۷a;
        this.f۴۱۵۲b = builder.f۴۱۵۸b;
        this.f۴۱۵۳c = builder.f۴۱۵۹c.a();
        this.f۴۱۵۴d = builder.f۴۱۶۰d;
        Object obj = builder.f۴۱۶۱e;
        this.f۴۱۵۵e = obj == null ? this : obj;
    }

    public s g() {
        return this.f۴۱۵۱a;
    }

    public String e() {
        return this.f۴۱۵۲b;
    }

    public r c() {
        return this.f۴۱۵۳c;
    }

    public String a(String name) {
        return this.f۴۱۵۳c.a(name);
    }

    public List<String> b(String name) {
        return this.f۴۱۵۳c.b(name);
    }

    public z a() {
        return this.f۴۱۵۴d;
    }

    public a f() {
        return new a(this);
    }

    public d b() {
        d result = this.f۴۱۵۶f;
        if (result != null) {
            return result;
        }
        d a2 = d.a(this.f۴۱۵۳c);
        this.f۴۱۵۶f = a2;
        return a2;
    }

    public boolean d() {
        return this.f۴۱۵۱a.h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f۴۱۵۲b);
        sb.append(", url=");
        sb.append(this.f۴۱۵۱a);
        sb.append(", tag=");
        Object obj = this.f۴۱۵۵e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        s f۴۱۵۷a;

        /* renamed from: b  reason: collision with root package name */
        String f۴۱۵۸b;

        /* renamed from: c  reason: collision with root package name */
        r.a f۴۱۵۹c;

        /* renamed from: d  reason: collision with root package name */
        z f۴۱۶۰d;

        /* renamed from: e  reason: collision with root package name */
        Object f۴۱۶۱e;

        public a() {
            this.f۴۱۵۸b = "GET";
            this.f۴۱۵۹c = new r.a();
        }

        a(y request) {
            this.f۴۱۵۷a = request.f۴۱۵۱a;
            this.f۴۱۵۸b = request.f۴۱۵۲b;
            this.f۴۱۶۰d = request.f۴۱۵۴d;
            this.f۴۱۶۱e = request.f۴۱۵۵e;
            this.f۴۱۵۹c = request.f۴۱۵۳c.a();
        }

        public a a(s url) {
            if (url != null) {
                this.f۴۱۵۷a = url;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a b(String url) {
            if (url != null) {
                if (url.regionMatches(true, 0, "ws:", 0, 3)) {
                    url = "http:" + url.substring(3);
                } else if (url.regionMatches(true, 0, "wss:", 0, 4)) {
                    url = "https:" + url.substring(4);
                }
                s parsed = s.d(url);
                if (parsed != null) {
                    a(parsed);
                    return this;
                }
                throw new IllegalArgumentException("unexpected url: " + url);
            }
            throw new NullPointerException("url == null");
        }

        public a a(String name, String value) {
            this.f۴۱۵۹c.c(name, value);
            return this;
        }

        public a a(String name) {
            this.f۴۱۵۹c.c(name);
            return this;
        }

        public a a(r headers) {
            this.f۴۱۵۹c = headers.a();
            return this;
        }

        public a a(d cacheControl) {
            String value = cacheControl.toString();
            if (value.isEmpty()) {
                a("Cache-Control");
                return this;
            }
            a("Cache-Control", value);
            return this;
        }

        public a a(String method, z body) {
            if (method == null) {
                throw new NullPointerException("method == null");
            } else if (method.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (body != null && !f.b(method)) {
                throw new IllegalArgumentException("method " + method + " must not have a request body.");
            } else if (body != null || !f.e(method)) {
                this.f۴۱۵۸b = method;
                this.f۴۱۶۰d = body;
                return this;
            } else {
                throw new IllegalArgumentException("method " + method + " must have a request body.");
            }
        }

        public y a() {
            if (this.f۴۱۵۷a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }
    }
}
