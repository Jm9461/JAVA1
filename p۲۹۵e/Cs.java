package p۲۹۵e;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p۲۹۵e.p۲۹۶f0.Cc;

/* renamed from: e.s, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cs {

    /* renamed from: i, reason: contains not printable characters */
    private static final char[] f۱۶۱۴۸i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: contains not printable characters */
    final String f۱۶۱۴۹a;

    /* renamed from: b, reason: contains not printable characters */
    private final String f۱۶۱۵۰b;

    /* renamed from: c, reason: contains not printable characters */
    private final String f۱۶۱۵۱c;

    /* renamed from: d, reason: contains not printable characters */
    final String f۱۶۱۵۲d;

    /* renamed from: e, reason: contains not printable characters */
    final int f۱۶۱۵۳e;

    /* renamed from: f, reason: contains not printable characters */
    private final List<String> f۱۶۱۵۴f;

    /* renamed from: g, reason: contains not printable characters */
    private final String f۱۶۱۵۵g;

    /* renamed from: h, reason: contains not printable characters */
    private final String f۱۶۱۵۶h;

    Cs(a builder) {
        List<String> list;
        this.f۱۶۱۴۹a = builder.f۱۶۱۵۷a;
        this.f۱۶۱۵۰b = m۱۷۱۳۷a(builder.f۱۶۱۵۸b, false);
        this.f۱۶۱۵۱c = m۱۷۱۳۷a(builder.f۱۶۱۵۹c, false);
        this.f۱۶۱۵۲d = builder.f۱۶۱۶۰d;
        this.f۱۶۱۵۳e = builder.m۱۷۱۷۷b();
        m۱۷۱۳۸a(builder.f۱۶۱۶۲f, false);
        List<String> list2 = builder.f۱۶۱۶۳g;
        if (list2 != null) {
            list = m۱۷۱۳۸a(list2, true);
        } else {
            list = null;
        }
        this.f۱۶۱۵۴f = list;
        String str = builder.f۱۶۱۶۴h;
        this.f۱۶۱۵۵g = str != null ? m۱۷۱۳۷a(str, false) : null;
        this.f۱۶۱۵۶h = builder.toString();
    }

    /* renamed from: n, reason: contains not printable characters */
    public URI m۱۷۱۶۲n() {
        a aVar = m۱۷۱۵۷i();
        aVar.m۱۷۱۷۹c();
        String uri = aVar.toString();
        try {
            return new URI(uri);
        } catch (URISyntaxException e2) {
            try {
                String stripped = uri.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", "");
                return URI.create(stripped);
            } catch (Exception e3) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: m, reason: contains not printable characters */
    public String m۱۷۱۶۱m() {
        return this.f۱۶۱۴۹a;
    }

    /* renamed from: h, reason: contains not printable characters */
    public boolean m۱۷۱۵۶h() {
        return this.f۱۶۱۴۹a.equals("https");
    }

    /* renamed from: f, reason: contains not printable characters */
    public String m۱۷۱۵۴f() {
        if (this.f۱۶۱۵۰b.isEmpty()) {
            return "";
        }
        int usernameStart = this.f۱۶۱۴۹a.length() + 3;
        String str = this.f۱۶۱۵۶h;
        int usernameEnd = Cc.m۱۶۵۳۰a(str, usernameStart, str.length(), ":@");
        return this.f۱۶۱۵۶h.substring(usernameStart, usernameEnd);
    }

    /* renamed from: b, reason: contains not printable characters */
    public String m۱۷۱۵۰b() {
        if (this.f۱۶۱۵۱c.isEmpty()) {
            return "";
        }
        int passwordStart = this.f۱۶۱۵۶h.indexOf(58, this.f۱۶۱۴۹a.length() + 3) + 1;
        int passwordEnd = this.f۱۶۱۵۶h.indexOf(64);
        return this.f۱۶۱۵۶h.substring(passwordStart, passwordEnd);
    }

    /* renamed from: g, reason: contains not printable characters */
    public String m۱۷۱۵۵g() {
        return this.f۱۶۱۵۲d;
    }

    /* renamed from: j, reason: contains not printable characters */
    public int m۱۷۱۵۸j() {
        return this.f۱۶۱۵۳e;
    }

    /* renamed from: c, reason: contains not printable characters */
    public static int m۱۷۱۴۴c(String scheme) {
        if (scheme.equals("http")) {
            return 80;
        }
        if (scheme.equals("https")) {
            return 443;
        }
        return -1;
    }

    /* renamed from: c, reason: contains not printable characters */
    public String m۱۷۱۵۱c() {
        int pathStart = this.f۱۶۱۵۶h.indexOf(47, this.f۱۶۱۴۹a.length() + 3);
        String str = this.f۱۶۱۵۶h;
        int pathEnd = Cc.m۱۶۵۳۰a(str, pathStart, str.length(), "?#");
        return this.f۱۶۱۵۶h.substring(pathStart, pathEnd);
    }

    /* renamed from: b, reason: contains not printable characters */
    static void m۱۷۱۴۳b(StringBuilder out, List<String> pathSegments) {
        int size = pathSegments.size();
        for (int i = 0; i < size; i++) {
            out.append('/');
            out.append(pathSegments.get(i));
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    public List<String> m۱۷۱۵۲d() {
        int pathStart = this.f۱۶۱۵۶h.indexOf(47, this.f۱۶۱۴۹a.length() + 3);
        String str = this.f۱۶۱۵۶h;
        int pathEnd = Cc.m۱۶۵۳۰a(str, pathStart, str.length(), "?#");
        List<String> result = new ArrayList<>();
        int i = pathStart;
        while (i < pathEnd) {
            int i2 = i + 1;
            int segmentEnd = Cc.m۱۶۵۲۹a(this.f۱۶۱۵۶h, i2, pathEnd, '/');
            result.add(this.f۱۶۱۵۶h.substring(i2, segmentEnd));
            i = segmentEnd;
        }
        return result;
    }

    /* renamed from: e, reason: contains not printable characters */
    public String m۱۷۱۵۳e() {
        if (this.f۱۶۱۵۴f == null) {
            return null;
        }
        int queryStart = this.f۱۶۱۵۶h.indexOf(63) + 1;
        String str = this.f۱۶۱۵۶h;
        int queryEnd = Cc.m۱۶۵۲۹a(str, queryStart, str.length(), '#');
        return this.f۱۶۱۵۶h.substring(queryStart, queryEnd);
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۱۷۱۴۱a(StringBuilder out, List<String> namesAndValues) {
        int size = namesAndValues.size();
        for (int i = 0; i < size; i += 2) {
            String name = namesAndValues.get(i);
            String value = namesAndValues.get(i + 1);
            if (i > 0) {
                out.append('&');
            }
            out.append(name);
            if (value != null) {
                out.append('=');
                out.append(value);
            }
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    static List<String> m۱۷۱۴۶e(String encodedQuery) {
        List<String> result = new ArrayList<>();
        int pos = 0;
        while (pos <= encodedQuery.length()) {
            int ampersandOffset = encodedQuery.indexOf(38, pos);
            if (ampersandOffset == -1) {
                ampersandOffset = encodedQuery.length();
            }
            int equalsOffset = encodedQuery.indexOf(61, pos);
            if (equalsOffset == -1 || equalsOffset > ampersandOffset) {
                result.add(encodedQuery.substring(pos, ampersandOffset));
                result.add(null);
            } else {
                result.add(encodedQuery.substring(pos, equalsOffset));
                result.add(encodedQuery.substring(equalsOffset + 1, ampersandOffset));
            }
            pos = ampersandOffset + 1;
        }
        return result;
    }

    /* renamed from: k, reason: contains not printable characters */
    public String m۱۷۱۵۹k() {
        if (this.f۱۶۱۵۴f == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        m۱۷۱۴۱a(result, this.f۱۶۱۵۴f);
        return result.toString();
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۷۱۴۸a() {
        if (this.f۱۶۱۵۵g == null) {
            return null;
        }
        int fragmentStart = this.f۱۶۱۵۶h.indexOf(35) + 1;
        return this.f۱۶۱۵۶h.substring(fragmentStart);
    }

    /* renamed from: l, reason: contains not printable characters */
    public String m۱۷۱۶۰l() {
        a aVar = m۱۷۱۴۷a("/...");
        aVar.m۱۷۱۸۲e("");
        aVar.m۱۷۱۸۰c("");
        return aVar.m۱۷۱۷۶a().toString();
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cs m۱۷۱۴۹b(String link) {
        a builder = m۱۷۱۴۷a(link);
        if (builder != null) {
            return builder.m۱۷۱۷۶a();
        }
        return null;
    }

    /* renamed from: i, reason: contains not printable characters */
    public a m۱۷۱۵۷i() {
        a result = new a();
        result.f۱۶۱۵۷a = this.f۱۶۱۴۹a;
        result.f۱۶۱۵۸b = m۱۷۱۵۴f();
        result.f۱۶۱۵۹c = m۱۷۱۵۰b();
        result.f۱۶۱۶۰d = this.f۱۶۱۵۲d;
        result.f۱۶۱۶۱e = this.f۱۶۱۵۳e != m۱۷۱۴۴c(this.f۱۶۱۴۹a) ? this.f۱۶۱۵۳e : -1;
        result.f۱۶۱۶۲f.clear();
        result.f۱۶۱۶۲f.addAll(m۱۷۱۵۲d());
        result.m۱۷۱۷۵a(m۱۷۱۵۳e());
        result.f۱۶۱۶۴h = m۱۷۱۴۸a();
        return result;
    }

    /* renamed from: a, reason: contains not printable characters */
    public a m۱۷۱۴۷a(String link) {
        a builder = new a();
        a.EnumC۱۴۷۱a result = builder.m۱۷۱۷۳a(this, link);
        if (result == a.EnumC۱۴۷۱a.SUCCESS) {
            return builder;
        }
        return null;
    }

    /* renamed from: d, reason: contains not printable characters */
    public static Cs m۱۷۱۴۵d(String url) {
        a builder = new a();
        a.EnumC۱۴۷۱a result = builder.m۱۷۱۷۳a(null, url);
        if (result == a.EnumC۱۴۷۱a.SUCCESS) {
            return builder.m۱۷۱۷۶a();
        }
        return null;
    }

    public boolean equals(Object other) {
        return (other instanceof Cs) && ((Cs) other).f۱۶۱۵۶h.equals(this.f۱۶۱۵۶h);
    }

    public int hashCode() {
        return this.f۱۶۱۵۶h.hashCode();
    }

    public String toString() {
        return this.f۱۶۱۵۶h;
    }

    /* renamed from: e.s$a */
    public static final class a {

        /* renamed from: a, reason: contains not printable characters */
        String f۱۶۱۵۷a;

        /* renamed from: d, reason: contains not printable characters */
        String f۱۶۱۶۰d;

        /* renamed from: g, reason: contains not printable characters */
        List<String> f۱۶۱۶۳g;

        /* renamed from: h, reason: contains not printable characters */
        String f۱۶۱۶۴h;

        /* renamed from: b, reason: contains not printable characters */
        String f۱۶۱۵۸b = "";

        /* renamed from: c, reason: contains not printable characters */
        String f۱۶۱۵۹c = "";

        /* renamed from: e, reason: contains not printable characters */
        int f۱۶۱۶۱e = -1;

        /* renamed from: f, reason: contains not printable characters */
        final List<String> f۱۶۱۶۲f = new ArrayList();

        /* renamed from: e.s$a$a, reason: collision with other inner class name */
        enum EnumC۱۴۷۱a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            this.f۱۶۱۶۲f.add("");
        }

        /* renamed from: d, reason: contains not printable characters */
        public a m۱۷۱۸۱d(String scheme) {
            if (scheme == null) {
                throw new NullPointerException("scheme == null");
            }
            if (scheme.equalsIgnoreCase("http")) {
                this.f۱۶۱۵۷a = "http";
            } else if (scheme.equalsIgnoreCase("https")) {
                this.f۱۶۱۵۷a = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + scheme);
            }
            return this;
        }

        /* renamed from: e, reason: contains not printable characters */
        public a m۱۷۱۸۲e(String username) {
            if (username == null) {
                throw new NullPointerException("username == null");
            }
            this.f۱۶۱۵۸b = Cs.m۱۷۱۳۶a(username, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public a m۱۷۱۸۰c(String password) {
            if (password == null) {
                throw new NullPointerException("password == null");
            }
            this.f۱۶۱۵۹c = Cs.m۱۷۱۳۶a(password, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public a m۱۷۱۷۸b(String host) {
            if (host == null) {
                throw new NullPointerException("host == null");
            }
            String encoded = m۱۷۱۶۳a(host, 0, host.length());
            if (encoded == null) {
                throw new IllegalArgumentException("unexpected host: " + host);
            }
            this.f۱۶۱۶۰d = encoded;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۱۷۴a(int port) {
            if (port <= 0 || port > 65535) {
                throw new IllegalArgumentException("unexpected port: " + port);
            }
            this.f۱۶۱۶۱e = port;
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        int m۱۷۱۷۷b() {
            int i = this.f۱۶۱۶۱e;
            return i != -1 ? i : Cs.m۱۷۱۴۴c(this.f۱۶۱۵۷a);
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۱۷۵a(String encodedQuery) {
            List<String> list;
            if (encodedQuery != null) {
                list = Cs.m۱۷۱۴۶e(Cs.m۱۷۱۳۶a(encodedQuery, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f۱۶۱۶۳g = list;
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        a m۱۷۱۷۹c() {
            int size = this.f۱۶۱۶۲f.size();
            for (int i = 0; i < size; i++) {
                String pathSegment = this.f۱۶۱۶۲f.get(i);
                this.f۱۶۱۶۲f.set(i, Cs.m۱۷۱۳۶a(pathSegment, "[]", true, true, false, true));
            }
            List<String> list = this.f۱۶۱۶۳g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String component = this.f۱۶۱۶۳g.get(i2);
                    if (component != null) {
                        this.f۱۶۱۶۳g.set(i2, Cs.m۱۷۱۳۶a(component, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str = this.f۱۶۱۶۴h;
            if (str != null) {
                this.f۱۶۱۶۴h = Cs.m۱۷۱۳۶a(str, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public Cs m۱۷۱۷۶a() {
            if (this.f۱۶۱۵۷a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f۱۶۱۶۰d == null) {
                throw new IllegalStateException("host == null");
            }
            return new Cs(this);
        }

        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append(this.f۱۶۱۵۷a);
            result.append("://");
            if (!this.f۱۶۱۵۸b.isEmpty() || !this.f۱۶۱۵۹c.isEmpty()) {
                result.append(this.f۱۶۱۵۸b);
                if (!this.f۱۶۱۵۹c.isEmpty()) {
                    result.append(':');
                    result.append(this.f۱۶۱۵۹c);
                }
                result.append('@');
            }
            if (this.f۱۶۱۶۰d.indexOf(58) != -1) {
                result.append('[');
                result.append(this.f۱۶۱۶۰d);
                result.append(']');
            } else {
                result.append(this.f۱۶۱۶۰d);
            }
            int effectivePort = m۱۷۱۷۷b();
            if (effectivePort != Cs.m۱۷۱۴۴c(this.f۱۶۱۵۷a)) {
                result.append(':');
                result.append(effectivePort);
            }
            Cs.m۱۷۱۴۳b(result, this.f۱۶۱۶۲f);
            if (this.f۱۶۱۶۳g != null) {
                result.append('?');
                Cs.m۱۷۱۴۱a(result, this.f۱۶۱۶۳g);
            }
            if (this.f۱۶۱۶۴h != null) {
                result.append('#');
                result.append(this.f۱۶۱۶۴h);
            }
            return result.toString();
        }

        /* renamed from: a, reason: contains not printable characters */
        EnumC۱۴۷۱a m۱۷۱۷۳a(Cs base, String input) {
            int componentDelimiterOffset;
            int i;
            int componentDelimiterOffset2;
            String str;
            int pathDelimiterOffset;
            int pos = Cc.m۱۶۵۵۰b(input, 0, input.length());
            int limit = Cc.m۱۶۵۵۵c(input, pos, input.length());
            int schemeDelimiterOffset = m۱۷۱۶۹e(input, pos, limit);
            int i2 = -1;
            if (schemeDelimiterOffset != -1) {
                if (input.regionMatches(true, pos, "https:", 0, 6)) {
                    this.f۱۶۱۵۷a = "https";
                    pos += "https:".length();
                } else if (input.regionMatches(true, pos, "http:", 0, 5)) {
                    this.f۱۶۱۵۷a = "http";
                    pos += "http:".length();
                } else {
                    return EnumC۱۴۷۱a.UNSUPPORTED_SCHEME;
                }
            } else if (base != null) {
                this.f۱۶۱۵۷a = base.f۱۶۱۴۹a;
            } else {
                return EnumC۱۴۷۱a.MISSING_SCHEME;
            }
            int slashCount = m۱۷۱۷۰f(input, pos, limit);
            int i3 = 63;
            int i4 = 35;
            if (slashCount < 2 && base != null && base.f۱۶۱۴۹a.equals(this.f۱۶۱۵۷a)) {
                this.f۱۶۱۵۸b = base.m۱۷۱۵۴f();
                this.f۱۶۱۵۹c = base.m۱۷۱۵۰b();
                this.f۱۶۱۶۰d = base.f۱۶۱۵۲d;
                this.f۱۶۱۶۱e = base.f۱۶۱۵۳e;
                this.f۱۶۱۶۲f.clear();
                this.f۱۶۱۶۲f.addAll(base.m۱۷۱۵۲d());
                if (pos == limit || input.charAt(pos) == '#') {
                    m۱۷۱۷۵a(base.m۱۷۱۵۳e());
                }
            } else {
                int pos2 = pos + slashCount;
                boolean hasUsername = false;
                boolean hasPassword = false;
                while (true) {
                    componentDelimiterOffset = Cc.m۱۶۵۳۰a(input, pos2, limit, "@/\\?#");
                    if (componentDelimiterOffset != limit) {
                        i = input.charAt(componentDelimiterOffset);
                    } else {
                        i = -1;
                    }
                    int c2 = i;
                    if (c2 == i2 || c2 == i4 || c2 == 47 || c2 == 92 || c2 == i3) {
                        break;
                    }
                    if (c2 == 64) {
                        if (hasPassword) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.f۱۶۱۵۹c);
                            sb.append("%40");
                            componentDelimiterOffset2 = componentDelimiterOffset;
                            sb.append(Cs.m۱۷۱۳۴a(input, pos2, componentDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f۱۶۱۵۹c = sb.toString();
                        } else {
                            int passwordColonOffset = Cc.m۱۶۵۲۹a(input, pos2, componentDelimiterOffset, ':');
                            String canonicalUsername = Cs.m۱۷۱۳۴a(input, pos2, passwordColonOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (hasUsername) {
                                str = this.f۱۶۱۵۸b + "%40" + canonicalUsername;
                            } else {
                                str = canonicalUsername;
                            }
                            this.f۱۶۱۵۸b = str;
                            componentDelimiterOffset2 = componentDelimiterOffset;
                            if (passwordColonOffset != componentDelimiterOffset2) {
                                hasPassword = true;
                                this.f۱۶۱۵۹c = Cs.m۱۷۱۳۴a(input, passwordColonOffset + 1, componentDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            }
                            hasUsername = true;
                        }
                        pos2 = componentDelimiterOffset2 + 1;
                    }
                    i4 = 35;
                    i3 = 63;
                    i2 = -1;
                }
                int pos3 = pos2;
                int portColonOffset = m۱۷۱۶۶c(input, pos3, componentDelimiterOffset);
                if (portColonOffset + 1 < componentDelimiterOffset) {
                    this.f۱۶۱۶۰d = m۱۷۱۶۳a(input, pos3, portColonOffset);
                    this.f۱۶۱۶۱e = m۱۷۱۶۵b(input, portColonOffset + 1, componentDelimiterOffset);
                    if (this.f۱۶۱۶۱e == -1) {
                        return EnumC۱۴۷۱a.INVALID_PORT;
                    }
                } else {
                    this.f۱۶۱۶۰d = m۱۷۱۶۳a(input, pos3, portColonOffset);
                    this.f۱۶۱۶۱e = Cs.m۱۷۱۴۴c(this.f۱۶۱۵۷a);
                }
                if (this.f۱۶۱۶۰d == null) {
                    return EnumC۱۴۷۱a.INVALID_HOST;
                }
                pos = componentDelimiterOffset;
            }
            int pathDelimiterOffset2 = Cc.m۱۶۵۳۰a(input, pos, limit, "?#");
            m۱۷۱۶۸d(input, pos, pathDelimiterOffset2);
            int pos4 = pathDelimiterOffset2;
            if (pos4 >= limit || input.charAt(pos4) != '?') {
                pathDelimiterOffset = 35;
            } else {
                int queryDelimiterOffset = Cc.m۱۶۵۲۹a(input, pos4, limit, '#');
                pathDelimiterOffset = 35;
                this.f۱۶۱۶۳g = Cs.m۱۷۱۴۶e(Cs.m۱۷۱۳۴a(input, pos4 + 1, queryDelimiterOffset, " \"'<>#", true, false, true, true, null));
                pos4 = queryDelimiterOffset;
            }
            if (pos4 < limit && input.charAt(pos4) == pathDelimiterOffset) {
                this.f۱۶۱۶۴h = Cs.m۱۷۱۳۴a(input, pos4 + 1, limit, "", true, false, false, false, null);
            }
            return EnumC۱۴۷۱a.SUCCESS;
        }

        /* renamed from: d, reason: contains not printable characters */
        private void m۱۷۱۶۸d(String input, int pos, int limit) {
            if (pos == limit) {
                return;
            }
            char c2 = input.charAt(pos);
            if (c2 == '/' || c2 == '\\') {
                this.f۱۶۱۶۲f.clear();
                this.f۱۶۱۶۲f.add("");
                pos++;
            } else {
                List<String> list = this.f۱۶۱۶۲f;
                list.set(list.size() - 1, "");
            }
            int i = pos;
            while (i < limit) {
                int pathSegmentDelimiterOffset = Cc.m۱۶۵۳۰a(input, i, limit, "/\\");
                boolean segmentHasTrailingSlash = pathSegmentDelimiterOffset < limit;
                m۱۷۱۶۴a(input, i, pathSegmentDelimiterOffset, segmentHasTrailingSlash, true);
                i = pathSegmentDelimiterOffset;
                if (segmentHasTrailingSlash) {
                    i++;
                }
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۱۷۱۶۴a(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String segment = Cs.m۱۷۱۳۴a(input, pos, limit, " \"<>^`{}|/\\?#", alreadyEncoded, false, false, true, null);
            if (m۱۷۱۷۱f(segment)) {
                return;
            }
            if (m۱۷۱۷۲g(segment)) {
                m۱۷۱۶۷d();
                return;
            }
            if (this.f۱۶۱۶۲f.get(r1.size() - 1).isEmpty()) {
                this.f۱۶۱۶۲f.set(r1.size() - 1, segment);
            } else {
                this.f۱۶۱۶۲f.add(segment);
            }
            if (addTrailingSlash) {
                this.f۱۶۱۶۲f.add("");
            }
        }

        /* renamed from: f, reason: contains not printable characters */
        private boolean m۱۷۱۷۱f(String input) {
            return input.equals(".") || input.equalsIgnoreCase("%2e");
        }

        /* renamed from: g, reason: contains not printable characters */
        private boolean m۱۷۱۷۲g(String input) {
            return input.equals("..") || input.equalsIgnoreCase("%2e.") || input.equalsIgnoreCase(".%2e") || input.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: d, reason: contains not printable characters */
        private void m۱۷۱۶۷d() {
            String removed = this.f۱۶۱۶۲f.remove(r0.size() - 1);
            if (removed.isEmpty() && !this.f۱۶۱۶۲f.isEmpty()) {
                this.f۱۶۱۶۲f.set(r1.size() - 1, "");
            } else {
                this.f۱۶۱۶۲f.add("");
            }
        }

        /* renamed from: e, reason: contains not printable characters */
        private static int m۱۷۱۶۹e(String input, int pos, int limit) {
            if (limit - pos < 2) {
                return -1;
            }
            char c0 = input.charAt(pos);
            if ((c0 < 'a' || c0 > 'z') && (c0 < 'A' || c0 > 'Z')) {
                return -1;
            }
            for (int i = pos + 1; i < limit; i++) {
                char c2 = input.charAt(i);
                if ((c2 < 'a' || c2 > 'z') && ((c2 < 'A' || c2 > 'Z') && ((c2 < '0' || c2 > '9') && c2 != '+' && c2 != '-' && c2 != '.'))) {
                    if (c2 == ':') {
                        return i;
                    }
                    return -1;
                }
            }
            return -1;
        }

        /* renamed from: f, reason: contains not printable characters */
        private static int m۱۷۱۷۰f(String input, int pos, int limit) {
            int slashCount = 0;
            while (pos < limit) {
                char c2 = input.charAt(pos);
                if (c2 != '\\' && c2 != '/') {
                    break;
                }
                slashCount++;
                pos++;
            }
            return slashCount;
        }

        /* renamed from: c, reason: contains not printable characters */
        private static int m۱۷۱۶۶c(String input, int pos, int limit) {
            int i = pos;
            while (i < limit) {
                char charAt = input.charAt(i);
                if (charAt != ':') {
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < limit) {
                            }
                        } while (input.charAt(i) != ']');
                    }
                    i++;
                } else {
                    return i;
                }
            }
            return limit;
        }

        /* renamed from: a, reason: contains not printable characters */
        private static String m۱۷۱۶۳a(String input, int pos, int limit) {
            String percentDecoded = Cs.m۱۷۱۳۵a(input, pos, limit, false);
            return Cc.m۱۶۵۳۴a(percentDecoded);
        }

        /* renamed from: b, reason: contains not printable characters */
        private static int m۱۷۱۶۵b(String input, int pos, int limit) {
            try {
                String portString = Cs.m۱۷۱۳۴a(input, pos, limit, "", false, false, false, true, null);
                int i = Integer.parseInt(portString);
                if (i <= 0 || i > 65535) {
                    return -1;
                }
                return i;
            } catch (NumberFormatException e2) {
                return -1;
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static String m۱۷۱۳۷a(String encoded, boolean plusIsSpace) {
        return m۱۷۱۳۵a(encoded, 0, encoded.length(), plusIsSpace);
    }

    /* renamed from: a, reason: contains not printable characters */
    private List<String> m۱۷۱۳۸a(List<String> list, boolean plusIsSpace) {
        int size = list.size();
        List<String> result = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            String s = list.get(i);
            result.add(s != null ? m۱۷۱۳۷a(s, plusIsSpace) : null);
        }
        return Collections.unmodifiableList(result);
    }

    /* renamed from: a, reason: contains not printable characters */
    static String m۱۷۱۳۵a(String encoded, int pos, int limit, boolean plusIsSpace) {
        for (int i = pos; i < limit; i++) {
            char c2 = encoded.charAt(i);
            if (c2 == '%' || (c2 == '+' && plusIsSpace)) {
                p۳۰۵f.Cc out = new p۳۰۵f.Cc();
                out.m۱۷۲۹۶a(encoded, pos, i);
                m۱۷۱۴۰a(out, encoded, i, limit, plusIsSpace);
                return out.m۱۷۳۳۱p();
            }
        }
        return encoded.substring(pos, limit);
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۱۷۱۴۰a(p۳۰۵f.Cc out, String encoded, int pos, int limit, boolean plusIsSpace) {
        int i = pos;
        while (i < limit) {
            int codePoint = encoded.codePointAt(i);
            if (codePoint == 37 && i + 2 < limit) {
                int d1 = Cc.m۱۶۵۲۸a(encoded.charAt(i + 1));
                int d2 = Cc.m۱۶۵۲۸a(encoded.charAt(i + 2));
                if (d1 != -1 && d2 != -1) {
                    out.writeByte((d1 << 4) + d2);
                    i += 2;
                }
                out.m۱۷۳۰۹c(codePoint);
            } else {
                if (codePoint == 43 && plusIsSpace) {
                    out.writeByte(32);
                }
                out.m۱۷۳۰۹c(codePoint);
            }
            i += Character.charCount(codePoint);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static boolean m۱۷۱۴۲a(String encoded, int pos, int limit) {
        return pos + 2 < limit && encoded.charAt(pos) == '%' && Cc.m۱۶۵۲۸a(encoded.charAt(pos + 1)) != -1 && Cc.m۱۶۵۲۸a(encoded.charAt(pos + 2)) != -1;
    }

    /* renamed from: a, reason: contains not printable characters */
    static String m۱۷۱۳۴a(String input, int pos, int limit, String encodeSet, boolean alreadyEncoded, boolean strict, boolean plusIsSpace, boolean asciiOnly, Charset charset) {
        int i = pos;
        while (i < limit) {
            int codePoint = input.codePointAt(i);
            if (codePoint >= 32 && codePoint != 127) {
                if ((codePoint < 128 || !asciiOnly) && encodeSet.indexOf(codePoint) == -1 && ((codePoint != 37 || (alreadyEncoded && (!strict || m۱۷۱۴۲a(input, i, limit)))) && (codePoint != 43 || !plusIsSpace))) {
                    i += Character.charCount(codePoint);
                }
            }
            p۳۰۵f.Cc out = new p۳۰۵f.Cc();
            out.m۱۷۲۹۶a(input, pos, i);
            m۱۷۱۳۹a(out, input, i, limit, encodeSet, alreadyEncoded, strict, plusIsSpace, asciiOnly, charset);
            return out.m۱۷۳۳۱p();
        }
        return input.substring(pos, limit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        r4 = new p۳۰۵f.Cc();
     */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m۱۷۱۳۹a(p۳۰۵f.Cc r12, java.lang.String r13, int r14, int r15, java.lang.String r16, boolean r17, boolean r18, boolean r19, boolean r20, java.nio.charset.Charset r21) {
        /*
            r0 = r12
            r1 = r13
            r2 = r15
            r3 = r21
            r4 = 0
            r5 = r14
        L7:
            if (r5 >= r2) goto Lb1
            int r6 = r13.codePointAt(r5)
            if (r17 == 0) goto L23
            r7 = 9
            if (r6 == r7) goto L1f
            r7 = 10
            if (r6 == r7) goto L1f
            r7 = 12
            if (r6 == r7) goto L1f
            r7 = 13
            if (r6 != r7) goto L23
        L1f:
            r7 = r16
            goto Laa
        L23:
            r7 = 43
            if (r6 != r7) goto L37
            if (r19 == 0) goto L37
            if (r17 == 0) goto L2e
            java.lang.String r7 = "+"
            goto L30
        L2e:
            java.lang.String r7 = "%2B"
        L30:
            r12.mo۱۷۴۲۶a(r7)
            r7 = r16
            goto Laa
        L37:
            r7 = 32
            r8 = 37
            if (r6 < r7) goto L65
            r7 = 127(0x7f, float:1.78E-43)
            if (r6 == r7) goto L65
            r7 = 128(0x80, float:1.8E-43)
            if (r6 < r7) goto L4b
            if (r20 != 0) goto L48
            goto L4b
        L48:
            r7 = r16
            goto L67
        L4b:
            r7 = r16
            int r9 = r7.indexOf(r6)
            r10 = -1
            if (r9 != r10) goto L67
            if (r6 != r8) goto L61
            if (r17 == 0) goto L67
            if (r18 == 0) goto L61
            boolean r9 = m۱۷۱۴۲a(r13, r5, r15)
            if (r9 != 0) goto L61
            goto L67
        L61:
            r12.m۱۷۳۰۹c(r6)
            goto Laa
        L65:
            r7 = r16
        L67:
            if (r4 != 0) goto L6f
            f.c r9 = new f.c
            r9.<init>()
            r4 = r9
        L6f:
            if (r3 == 0) goto L83
            java.nio.charset.Charset r9 = p۲۹۵e.p۲۹۶f0.Cc.f۱۵۷۰۶d
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L7a
            goto L83
        L7a:
            int r9 = java.lang.Character.charCount(r6)
            int r9 = r9 + r5
            r4.m۱۷۲۹۷a(r13, r5, r9, r3)
            goto L86
        L83:
            r4.m۱۷۳۰۹c(r6)
        L86:
            boolean r9 = r4.mo۱۷۴۴۸i()
            if (r9 != 0) goto Laa
            byte r9 = r4.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r12.writeByte(r8)
            char[] r10 = p۲۹۵e.Cs.f۱۶۱۴۸i
            int r11 = r9 >> 4
            r11 = r11 & 15
            char r10 = r10[r11]
            r12.writeByte(r10)
            char[] r10 = p۲۹۵e.Cs.f۱۶۱۴۸i
            r11 = r9 & 15
            char r10 = r10[r11]
            r12.writeByte(r10)
            goto L86
        Laa:
            int r8 = java.lang.Character.charCount(r6)
            int r5 = r5 + r8
            goto L7
        Lb1:
            r7 = r16
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p۲۹۵e.Cs.m۱۷۱۳۹a(f.c, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
    }

    /* renamed from: a, reason: contains not printable characters */
    static String m۱۷۱۳۶a(String input, String encodeSet, boolean alreadyEncoded, boolean strict, boolean plusIsSpace, boolean asciiOnly) {
        return m۱۷۱۳۴a(input, 0, input.length(), encodeSet, alreadyEncoded, strict, plusIsSpace, asciiOnly, null);
    }
}
