package p۱۳۹e;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p۱۳۹e.p۱۴۰f0.Cc;

/* renamed from: e.s  reason: invalid class name */
public final class Cs {

    /* renamed from: i  reason: contains not printable characters */
    private static final char[] f۱۶۱۴۸i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: contains not printable characters */
    final String f۱۶۱۴۹a;

    /* renamed from: b  reason: contains not printable characters */
    private final String f۱۶۱۵۰b;

    /* renamed from: c  reason: contains not printable characters */
    private final String f۱۶۱۵۱c;

    /* renamed from: d  reason: contains not printable characters */
    final String f۱۶۱۵۲d;

    /* renamed from: e  reason: contains not printable characters */
    final int f۱۶۱۵۳e;

    /* renamed from: f  reason: contains not printable characters */
    private final List<String> f۱۶۱۵۴f;

    /* renamed from: g  reason: contains not printable characters */
    private final String f۱۶۱۵۵g;

    /* renamed from: h  reason: contains not printable characters */
    private final String f۱۶۱۵۶h;

    Cs(Ca builder) {
        List<String> list;
        this.f۱۶۱۴۹a = builder.f۱۶۱۵۷a;
        this.f۱۶۱۵۰b = m۱۹۲۱۶a(builder.f۱۶۱۵۸b, false);
        this.f۱۶۱۵۱c = m۱۹۲۱۶a(builder.f۱۶۱۵۹c, false);
        this.f۱۶۱۵۲d = builder.f۱۶۱۶۰d;
        this.f۱۶۱۵۳e = builder.m۱۹۲۵۶b();
        m۱۹۲۱۷a(builder.f۱۶۱۶۲f, false);
        List<String> list2 = builder.f۱۶۱۶۳g;
        String str = null;
        if (list2 != null) {
            list = m۱۹۲۱۷a(list2, true);
        } else {
            list = null;
        }
        this.f۱۶۱۵۴f = list;
        String str2 = builder.f۱۶۱۶۴h;
        this.f۱۶۱۵۵g = str2 != null ? m۱۹۲۱۶a(str2, false) : str;
        this.f۱۶۱۵۶h = builder.toString();
    }

    /* renamed from: n  reason: contains not printable characters */
    public URI m۱۹۲۴۱n() {
        Ca i = m۱۹۲۳۶i();
        i.m۱۹۲۵۸c();
        String uri = i.toString();
        try {
            return new URI(uri);
        } catch (URISyntaxException e) {
            try {
                return URI.create(uri.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception e2) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    public String m۱۹۲۴۰m() {
        return this.f۱۶۱۴۹a;
    }

    /* renamed from: h  reason: contains not printable characters */
    public boolean m۱۹۲۳۵h() {
        return this.f۱۶۱۴۹a.equals("https");
    }

    /* renamed from: f  reason: contains not printable characters */
    public String m۱۹۲۳۳f() {
        if (this.f۱۶۱۵۰b.isEmpty()) {
            return "";
        }
        int usernameStart = this.f۱۶۱۴۹a.length() + 3;
        String str = this.f۱۶۱۵۶h;
        return this.f۱۶۱۵۶h.substring(usernameStart, Cc.m۱۸۶۰۹a(str, usernameStart, str.length(), ":@"));
    }

    /* renamed from: b  reason: contains not printable characters */
    public String m۱۹۲۲۹b() {
        if (this.f۱۶۱۵۱c.isEmpty()) {
            return "";
        }
        int passwordEnd = this.f۱۶۱۵۶h.indexOf(64);
        return this.f۱۶۱۵۶h.substring(this.f۱۶۱۵۶h.indexOf(58, this.f۱۶۱۴۹a.length() + 3) + 1, passwordEnd);
    }

    /* renamed from: g  reason: contains not printable characters */
    public String m۱۹۲۳۴g() {
        return this.f۱۶۱۵۲d;
    }

    /* renamed from: j  reason: contains not printable characters */
    public int m۱۹۲۳۷j() {
        return this.f۱۶۱۵۳e;
    }

    /* renamed from: c  reason: contains not printable characters */
    public static int m۱۹۲۲۳c(String scheme) {
        if (scheme.equals("http")) {
            return 80;
        }
        if (scheme.equals("https")) {
            return 443;
        }
        return -1;
    }

    /* renamed from: c  reason: contains not printable characters */
    public String m۱۹۲۳۰c() {
        int pathStart = this.f۱۶۱۵۶h.indexOf(47, this.f۱۶۱۴۹a.length() + 3);
        String str = this.f۱۶۱۵۶h;
        return this.f۱۶۱۵۶h.substring(pathStart, Cc.m۱۸۶۰۹a(str, pathStart, str.length(), "?#"));
    }

    /* renamed from: b  reason: contains not printable characters */
    static void m۱۹۲۲۲b(StringBuilder out, List<String> pathSegments) {
        int size = pathSegments.size();
        for (int i = 0; i < size; i++) {
            out.append('/');
            out.append(pathSegments.get(i));
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public List<String> m۱۹۲۳۱d() {
        int pathStart = this.f۱۶۱۵۶h.indexOf(47, this.f۱۶۱۴۹a.length() + 3);
        String str = this.f۱۶۱۵۶h;
        int pathEnd = Cc.m۱۸۶۰۹a(str, pathStart, str.length(), "?#");
        List<String> result = new ArrayList<>();
        int i = pathStart;
        while (i < pathEnd) {
            int i2 = i + 1;
            int segmentEnd = Cc.m۱۸۶۰۸a(this.f۱۶۱۵۶h, i2, pathEnd, '/');
            result.add(this.f۱۶۱۵۶h.substring(i2, segmentEnd));
            i = segmentEnd;
        }
        return result;
    }

    /* renamed from: e  reason: contains not printable characters */
    public String m۱۹۲۳۲e() {
        if (this.f۱۶۱۵۴f == null) {
            return null;
        }
        int queryStart = this.f۱۶۱۵۶h.indexOf(63) + 1;
        String str = this.f۱۶۱۵۶h;
        return this.f۱۶۱۵۶h.substring(queryStart, Cc.m۱۸۶۰۸a(str, queryStart, str.length(), '#'));
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۹۲۲۰a(StringBuilder out, List<String> namesAndValues) {
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

    /* renamed from: e  reason: contains not printable characters */
    static List<String> m۱۹۲۲۵e(String encodedQuery) {
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

    /* renamed from: k  reason: contains not printable characters */
    public String m۱۹۲۳۸k() {
        if (this.f۱۶۱۵۴f == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        m۱۹۲۲۰a(result, this.f۱۶۱۵۴f);
        return result.toString();
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۲۲۷a() {
        if (this.f۱۶۱۵۵g == null) {
            return null;
        }
        return this.f۱۶۱۵۶h.substring(this.f۱۶۱۵۶h.indexOf(35) + 1);
    }

    /* renamed from: l  reason: contains not printable characters */
    public String m۱۹۲۳۹l() {
        Ca a = m۱۹۲۲۶a("/...");
        a.m۱۹۲۶۱e("");
        a.m۱۹۲۵۹c("");
        return a.m۱۹۲۵۵a().toString();
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cs m۱۹۲۲۸b(String link) {
        Ca builder = m۱۹۲۲۶a(link);
        if (builder != null) {
            return builder.m۱۹۲۵۵a();
        }
        return null;
    }

    /* renamed from: i  reason: contains not printable characters */
    public Ca m۱۹۲۳۶i() {
        Ca result = new Ca();
        result.f۱۶۱۵۷a = this.f۱۶۱۴۹a;
        result.f۱۶۱۵۸b = m۱۹۲۳۳f();
        result.f۱۶۱۵۹c = m۱۹۲۲۹b();
        result.f۱۶۱۶۰d = this.f۱۶۱۵۲d;
        result.f۱۶۱۶۱e = this.f۱۶۱۵۳e != m۱۹۲۲۳c(this.f۱۶۱۴۹a) ? this.f۱۶۱۵۳e : -1;
        result.f۱۶۱۶۲f.clear();
        result.f۱۶۱۶۲f.addAll(m۱۹۲۳۱d());
        result.m۱۹۲۵۴a(m۱۹۲۳۲e());
        result.f۱۶۱۶۴h = m۱۹۲۲۷a();
        return result;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۹۲۲۶a(String link) {
        Ca builder = new Ca();
        if (builder.m۱۹۲۵۲a(this, link) == Ca.EnumCa.SUCCESS) {
            return builder;
        }
        return null;
    }

    /* renamed from: d  reason: contains not printable characters */
    public static Cs m۱۹۲۲۴d(String url) {
        Ca builder = new Ca();
        if (builder.m۱۹۲۵۲a(null, url) == Ca.EnumCa.SUCCESS) {
            return builder.m۱۹۲۵۵a();
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

    /* renamed from: e.s$a  reason: invalid class name */
    public static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        String f۱۶۱۵۷a;

        /* renamed from: b  reason: contains not printable characters */
        String f۱۶۱۵۸b = "";

        /* renamed from: c  reason: contains not printable characters */
        String f۱۶۱۵۹c = "";

        /* renamed from: d  reason: contains not printable characters */
        String f۱۶۱۶۰d;

        /* renamed from: e  reason: contains not printable characters */
        int f۱۶۱۶۱e = -1;

        /* renamed from: f  reason: contains not printable characters */
        final List<String> f۱۶۱۶۲f = new ArrayList();

        /* renamed from: g  reason: contains not printable characters */
        List<String> f۱۶۱۶۳g;

        /* renamed from: h  reason: contains not printable characters */
        String f۱۶۱۶۴h;

        /* access modifiers changed from: package-private */
        /* renamed from: e.s$a$a  reason: invalid class name */
        public enum EnumCa {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public Ca() {
            this.f۱۶۱۶۲f.add("");
        }

        /* renamed from: d  reason: contains not printable characters */
        public Ca m۱۹۲۶۰d(String scheme) {
            if (scheme != null) {
                if (scheme.equalsIgnoreCase("http")) {
                    this.f۱۶۱۵۷a = "http";
                } else if (scheme.equalsIgnoreCase("https")) {
                    this.f۱۶۱۵۷a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        /* renamed from: e  reason: contains not printable characters */
        public Ca m۱۹۲۶۱e(String username) {
            if (username != null) {
                this.f۱۶۱۵۸b = Cs.m۱۹۲۱۵a(username, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        /* renamed from: c  reason: contains not printable characters */
        public Ca m۱۹۲۵۹c(String password) {
            if (password != null) {
                this.f۱۶۱۵۹c = Cs.m۱۹۲۱۵a(password, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        /* renamed from: b  reason: contains not printable characters */
        public Ca m۱۹۲۵۷b(String host) {
            if (host != null) {
                String encoded = m۱۹۲۴۲a(host, 0, host.length());
                if (encoded != null) {
                    this.f۱۶۱۶۰d = encoded;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + host);
            }
            throw new NullPointerException("host == null");
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۲۵۳a(int port) {
            if (port <= 0 || port > 65535) {
                throw new IllegalArgumentException("unexpected port: " + port);
            }
            this.f۱۶۱۶۱e = port;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۹۲۵۶b() {
            int i = this.f۱۶۱۶۱e;
            return i != -1 ? i : Cs.m۱۹۲۲۳c(this.f۱۶۱۵۷a);
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۲۵۴a(String encodedQuery) {
            List<String> list;
            if (encodedQuery != null) {
                list = Cs.m۱۹۲۲۵e(Cs.m۱۹۲۱۵a(encodedQuery, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f۱۶۱۶۳g = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public Ca m۱۹۲۵۸c() {
            int size = this.f۱۶۱۶۲f.size();
            for (int i = 0; i < size; i++) {
                this.f۱۶۱۶۲f.set(i, Cs.m۱۹۲۱۵a(this.f۱۶۱۶۲f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f۱۶۱۶۳g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String component = this.f۱۶۱۶۳g.get(i2);
                    if (component != null) {
                        this.f۱۶۱۶۳g.set(i2, Cs.m۱۹۲۱۵a(component, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str = this.f۱۶۱۶۴h;
            if (str != null) {
                this.f۱۶۱۶۴h = Cs.m۱۹۲۱۵a(str, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cs m۱۹۲۵۵a() {
            if (this.f۱۶۱۵۷a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f۱۶۱۶۰d != null) {
                return new Cs(this);
            } else {
                throw new IllegalStateException("host == null");
            }
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
            int effectivePort = m۱۹۲۵۶b();
            if (effectivePort != Cs.m۱۹۲۲۳c(this.f۱۶۱۵۷a)) {
                result.append(':');
                result.append(effectivePort);
            }
            Cs.m۱۹۲۲۲b(result, this.f۱۶۱۶۲f);
            if (this.f۱۶۱۶۳g != null) {
                result.append('?');
                Cs.m۱۹۲۲۰a(result, this.f۱۶۱۶۳g);
            }
            if (this.f۱۶۱۶۴h != null) {
                result.append('#');
                result.append(this.f۱۶۱۶۴h);
            }
            return result.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public EnumCa m۱۹۲۵۲a(Cs base, String input) {
            int pathDelimiterOffset;
            int componentDelimiterOffset;
            int c;
            int componentDelimiterOffset2;
            String str;
            int pos = Cc.m۱۸۶۲۹b(input, 0, input.length());
            int limit = Cc.m۱۸۶۳۴c(input, pos, input.length());
            int i = -1;
            if (m۱۹۲۴۸e(input, pos, limit) != -1) {
                if (input.regionMatches(true, pos, "https:", 0, 6)) {
                    this.f۱۶۱۵۷a = "https";
                    pos += "https:".length();
                } else if (!input.regionMatches(true, pos, "http:", 0, 5)) {
                    return EnumCa.UNSUPPORTED_SCHEME;
                } else {
                    this.f۱۶۱۵۷a = "http";
                    pos += "http:".length();
                }
            } else if (base == null) {
                return EnumCa.MISSING_SCHEME;
            } else {
                this.f۱۶۱۵۷a = base.f۱۶۱۴۹a;
            }
            int slashCount = m۱۹۲۴۹f(input, pos, limit);
            int i2 = 63;
            int i3 = 35;
            if (slashCount >= 2 || base == null || !base.f۱۶۱۴۹a.equals(this.f۱۶۱۵۷a)) {
                int pos2 = pos + slashCount;
                boolean hasUsername = false;
                boolean hasPassword = false;
                while (true) {
                    componentDelimiterOffset = Cc.m۱۸۶۰۹a(input, pos2, limit, "@/\\?#");
                    if (componentDelimiterOffset != limit) {
                        c = input.charAt(componentDelimiterOffset);
                    } else {
                        c = -1;
                    }
                    if (c == i || c == i3 || c == 47 || c == 92 || c == i2) {
                        int portColonOffset = m۱۹۲۴۵c(input, pos2, componentDelimiterOffset);
                    } else {
                        if (c == 64) {
                            if (!hasPassword) {
                                int passwordColonOffset = Cc.m۱۸۶۰۸a(input, pos2, componentDelimiterOffset, ':');
                                String canonicalUsername = Cs.m۱۹۲۱۳a(input, pos2, passwordColonOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                if (hasUsername) {
                                    str = this.f۱۶۱۵۸b + "%40" + canonicalUsername;
                                } else {
                                    str = canonicalUsername;
                                }
                                this.f۱۶۱۵۸b = str;
                                componentDelimiterOffset2 = componentDelimiterOffset;
                                if (passwordColonOffset != componentDelimiterOffset2) {
                                    hasPassword = true;
                                    this.f۱۶۱۵۹c = Cs.m۱۹۲۱۳a(input, passwordColonOffset + 1, componentDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                }
                                hasUsername = true;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append(this.f۱۶۱۵۹c);
                                sb.append("%40");
                                componentDelimiterOffset2 = componentDelimiterOffset;
                                sb.append(Cs.m۱۹۲۱۳a(input, pos2, componentDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                this.f۱۶۱۵۹c = sb.toString();
                            }
                            pos2 = componentDelimiterOffset2 + 1;
                        }
                        i3 = 35;
                        i2 = 63;
                        i = -1;
                    }
                }
                int portColonOffset2 = m۱۹۲۴۵c(input, pos2, componentDelimiterOffset);
                if (portColonOffset2 + 1 < componentDelimiterOffset) {
                    this.f۱۶۱۶۰d = m۱۹۲۴۲a(input, pos2, portColonOffset2);
                    this.f۱۶۱۶۱e = m۱۹۲۴۴b(input, portColonOffset2 + 1, componentDelimiterOffset);
                    if (this.f۱۶۱۶۱e == -1) {
                        return EnumCa.INVALID_PORT;
                    }
                } else {
                    this.f۱۶۱۶۰d = m۱۹۲۴۲a(input, pos2, portColonOffset2);
                    this.f۱۶۱۶۱e = Cs.m۱۹۲۲۳c(this.f۱۶۱۵۷a);
                }
                if (this.f۱۶۱۶۰d == null) {
                    return EnumCa.INVALID_HOST;
                }
                pos = componentDelimiterOffset;
            } else {
                this.f۱۶۱۵۸b = base.m۱۹۲۳۳f();
                this.f۱۶۱۵۹c = base.m۱۹۲۲۹b();
                this.f۱۶۱۶۰d = base.f۱۶۱۵۲d;
                this.f۱۶۱۶۱e = base.f۱۶۱۵۳e;
                this.f۱۶۱۶۲f.clear();
                this.f۱۶۱۶۲f.addAll(base.m۱۹۲۳۱d());
                if (pos == limit || input.charAt(pos) == '#') {
                    m۱۹۲۵۴a(base.m۱۹۲۳۲e());
                }
            }
            int pathDelimiterOffset2 = Cc.m۱۸۶۰۹a(input, pos, limit, "?#");
            m۱۹۲۴۷d(input, pos, pathDelimiterOffset2);
            int pos3 = pathDelimiterOffset2;
            if (pos3 >= limit || input.charAt(pos3) != '?') {
                pathDelimiterOffset = 35;
            } else {
                int queryDelimiterOffset = Cc.m۱۸۶۰۸a(input, pos3, limit, '#');
                pathDelimiterOffset = 35;
                this.f۱۶۱۶۳g = Cs.m۱۹۲۲۵e(Cs.m۱۹۲۱۳a(input, pos3 + 1, queryDelimiterOffset, " \"'<>#", true, false, true, true, null));
                pos3 = queryDelimiterOffset;
            }
            if (pos3 < limit && input.charAt(pos3) == pathDelimiterOffset) {
                this.f۱۶۱۶۴h = Cs.m۱۹۲۱۳a(input, pos3 + 1, limit, "", true, false, false, false, null);
            }
            return EnumCa.SUCCESS;
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۹۲۴۷d(String input, int pos, int limit) {
            if (pos != limit) {
                char c = input.charAt(pos);
                if (c == '/' || c == '\\') {
                    this.f۱۶۱۶۲f.clear();
                    this.f۱۶۱۶۲f.add("");
                    pos++;
                } else {
                    List<String> list = this.f۱۶۱۶۲f;
                    list.set(list.size() - 1, "");
                }
                int i = pos;
                while (i < limit) {
                    int pathSegmentDelimiterOffset = Cc.m۱۸۶۰۹a(input, i, limit, "/\\");
                    boolean segmentHasTrailingSlash = pathSegmentDelimiterOffset < limit;
                    m۱۹۲۴۳a(input, i, pathSegmentDelimiterOffset, segmentHasTrailingSlash, true);
                    i = pathSegmentDelimiterOffset;
                    if (segmentHasTrailingSlash) {
                        i++;
                    }
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۹۲۴۳a(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String segment = Cs.m۱۹۲۱۳a(input, pos, limit, " \"<>^`{}|/\\?#", alreadyEncoded, false, false, true, null);
            if (!m۱۹۲۵۰f(segment)) {
                if (m۱۹۲۵۱g(segment)) {
                    m۱۹۲۴۶d();
                    return;
                }
                List<String> list = this.f۱۶۱۶۲f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f۱۶۱۶۲f;
                    list2.set(list2.size() - 1, segment);
                } else {
                    this.f۱۶۱۶۲f.add(segment);
                }
                if (addTrailingSlash) {
                    this.f۱۶۱۶۲f.add("");
                }
            }
        }

        /* renamed from: f  reason: contains not printable characters */
        private boolean m۱۹۲۵۰f(String input) {
            return input.equals(".") || input.equalsIgnoreCase("%2e");
        }

        /* renamed from: g  reason: contains not printable characters */
        private boolean m۱۹۲۵۱g(String input) {
            return input.equals("..") || input.equalsIgnoreCase("%2e.") || input.equalsIgnoreCase(".%2e") || input.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۹۲۴۶d() {
            List<String> list = this.f۱۶۱۶۲f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f۱۶۱۶۲f.isEmpty()) {
                this.f۱۶۱۶۲f.add("");
                return;
            }
            List<String> list2 = this.f۱۶۱۶۲f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: e  reason: contains not printable characters */
        private static int m۱۹۲۴۸e(String input, int pos, int limit) {
            if (limit - pos < 2) {
                return -1;
            }
            char c0 = input.charAt(pos);
            if ((c0 < 'a' || c0 > 'z') && (c0 < 'A' || c0 > 'Z')) {
                return -1;
            }
            for (int i = pos + 1; i < limit; i++) {
                char c = input.charAt(i);
                if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && ((c < '0' || c > '9') && c != '+' && c != '-' && c != '.'))) {
                    if (c == ':') {
                        return i;
                    } else {
                        return -1;
                    }
                }
            }
            return -1;
        }

        /* renamed from: f  reason: contains not printable characters */
        private static int m۱۹۲۴۹f(String input, int pos, int limit) {
            int slashCount = 0;
            while (pos < limit) {
                char c = input.charAt(pos);
                if (c != '\\' && c != '/') {
                    break;
                }
                slashCount++;
                pos++;
            }
            return slashCount;
        }

        /* renamed from: c  reason: contains not printable characters */
        private static int m۱۹۲۴۵c(String input, int pos, int limit) {
            int i = pos;
            while (i < limit) {
                char charAt = input.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= limit) {
                            break;
                        }
                    } while (input.charAt(i) != ']');
                }
                i++;
            }
            return limit;
        }

        /* renamed from: a  reason: contains not printable characters */
        private static String m۱۹۲۴۲a(String input, int pos, int limit) {
            return Cc.m۱۸۶۱۳a(Cs.m۱۹۲۱۴a(input, pos, limit, false));
        }

        /* renamed from: b  reason: contains not printable characters */
        private static int m۱۹۲۴۴b(String input, int pos, int limit) {
            try {
                int i = Integer.parseInt(Cs.m۱۹۲۱۳a(input, pos, limit, "", false, false, false, true, null));
                if (i <= 0 || i > 65535) {
                    return -1;
                }
                return i;
            } catch (NumberFormatException e) {
                return -1;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static String m۱۹۲۱۶a(String encoded, boolean plusIsSpace) {
        return m۱۹۲۱۴a(encoded, 0, encoded.length(), plusIsSpace);
    }

    /* renamed from: a  reason: contains not printable characters */
    private List<String> m۱۹۲۱۷a(List<String> list, boolean plusIsSpace) {
        int size = list.size();
        List<String> result = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            String s = list.get(i);
            result.add(s != null ? m۱۹۲۱۶a(s, plusIsSpace) : null);
        }
        return Collections.unmodifiableList(result);
    }

    /* renamed from: a  reason: contains not printable characters */
    static String m۱۹۲۱۴a(String encoded, int pos, int limit, boolean plusIsSpace) {
        for (int i = pos; i < limit; i++) {
            char c = encoded.charAt(i);
            if (c == '%' || (c == '+' && plusIsSpace)) {
                p۱۴۹f.Cc out = new p۱۴۹f.Cc();
                out.m۱۹۳۷۴a(encoded, pos, i);
                m۱۹۲۱۹a(out, encoded, i, limit, plusIsSpace);
                return out.m۱۹۴۰۹p();
            }
        }
        return encoded.substring(pos, limit);
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۹۲۱۹a(p۱۴۹f.Cc out, String encoded, int pos, int limit, boolean plusIsSpace) {
        int i = pos;
        while (i < limit) {
            int codePoint = encoded.codePointAt(i);
            if (codePoint == 37 && i + 2 < limit) {
                int d1 = Cc.m۱۸۶۰۷a(encoded.charAt(i + 1));
                int d2 = Cc.m۱۸۶۰۷a(encoded.charAt(i + 2));
                if (!(d1 == -1 || d2 == -1)) {
                    out.writeByte((d1 << 4) + d2);
                    i += 2;
                    i += Character.charCount(codePoint);
                }
            } else if (codePoint == 43 && plusIsSpace) {
                out.writeByte(32);
                i += Character.charCount(codePoint);
            }
            out.m۱۹۳۸۷c(codePoint);
            i += Character.charCount(codePoint);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۹۲۲۱a(String encoded, int pos, int limit) {
        return pos + 2 < limit && encoded.charAt(pos) == '%' && Cc.m۱۸۶۰۷a(encoded.charAt(pos + 1)) != -1 && Cc.m۱۸۶۰۷a(encoded.charAt(pos + 2)) != -1;
    }

    /* renamed from: a  reason: contains not printable characters */
    static String m۱۹۲۱۳a(String input, int pos, int limit, String encodeSet, boolean alreadyEncoded, boolean strict, boolean plusIsSpace, boolean asciiOnly, Charset charset) {
        int i = pos;
        while (i < limit) {
            int codePoint = input.codePointAt(i);
            if (codePoint >= 32 && codePoint != 127) {
                if (codePoint < 128 || !asciiOnly) {
                    if (encodeSet.indexOf(codePoint) == -1 && ((codePoint != 37 || (alreadyEncoded && (!strict || m۱۹۲۲۱a(input, i, limit)))) && (codePoint != 43 || !plusIsSpace))) {
                        i += Character.charCount(codePoint);
                    }
                }
            }
            p۱۴۹f.Cc out = new p۱۴۹f.Cc();
            out.m۱۹۳۷۴a(input, pos, i);
            m۱۹۲۱۸a(out, input, i, limit, encodeSet, alreadyEncoded, strict, plusIsSpace, asciiOnly, charset);
            return out.m۱۹۴۰۹p();
        }
        return input.substring(pos, limit);
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۹۲۱۸a(p۱۴۹f.Cc out, String input, int pos, int limit, String encodeSet, boolean alreadyEncoded, boolean strict, boolean plusIsSpace, boolean asciiOnly, Charset charset) {
        p۱۴۹f.Cc encodedCharBuffer = null;
        int i = pos;
        while (i < limit) {
            int codePoint = input.codePointAt(i);
            if (!alreadyEncoded || !(codePoint == 9 || codePoint == 10 || codePoint == 12 || codePoint == 13)) {
                if (codePoint != 43 || !plusIsSpace) {
                    if (codePoint >= 32 && codePoint != 127) {
                        if (codePoint < 128 || !asciiOnly) {
                            if (encodeSet.indexOf(codePoint) == -1 && (codePoint != 37 || (alreadyEncoded && (!strict || m۱۹۲۲۱a(input, i, limit))))) {
                                out.m۱۹۳۸۷c(codePoint);
                            }
                        }
                    }
                    if (encodedCharBuffer == null) {
                        encodedCharBuffer = new p۱۴۹f.Cc();
                    }
                    if (charset == null || charset.equals(Cc.f۱۵۷۰۶d)) {
                        encodedCharBuffer.m۱۹۳۸۷c(codePoint);
                    } else {
                        encodedCharBuffer.m۱۹۳۷۵a(input, i, Character.charCount(codePoint) + i, charset);
                    }
                    while (!encodedCharBuffer.m۱۹۴۰۳i()) {
                        int b = encodedCharBuffer.readByte() & 255;
                        out.writeByte(37);
                        out.writeByte((int) f۱۶۱۴۸i[(b >> 4) & 15]);
                        out.writeByte((int) f۱۶۱۴۸i[b & 15]);
                    }
                } else {
                    out.m۱۹۳۷۳a(alreadyEncoded ? "+" : "%2B");
                }
            }
            i += Character.charCount(codePoint);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static String m۱۹۲۱۵a(String input, String encodeSet, boolean alreadyEncoded, boolean strict, boolean plusIsSpace, boolean asciiOnly) {
        return m۱۹۲۱۳a(input, 0, input.length(), encodeSet, alreadyEncoded, strict, plusIsSpace, asciiOnly, null);
    }
}
