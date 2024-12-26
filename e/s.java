package e;

import e.f0.c;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class s {
    private static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    final String f۴۱۰۱a;

    /* renamed from: b  reason: collision with root package name */
    private final String f۴۱۰۲b;

    /* renamed from: c  reason: collision with root package name */
    private final String f۴۱۰۳c;

    /* renamed from: d  reason: collision with root package name */
    final String f۴۱۰۴d;

    /* renamed from: e  reason: collision with root package name */
    final int f۴۱۰۵e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f۴۱۰۶f;

    /* renamed from: g  reason: collision with root package name */
    private final String f۴۱۰۷g;

    /* renamed from: h  reason: collision with root package name */
    private final String f۴۱۰۸h;

    s(a builder) {
        List<String> list;
        this.f۴۱۰۱a = builder.f۴۱۰۹a;
        this.f۴۱۰۲b = a(builder.f۴۱۱۰b, false);
        this.f۴۱۰۳c = a(builder.f۴۱۱۱c, false);
        this.f۴۱۰۴d = builder.f۴۱۱۲d;
        this.f۴۱۰۵e = builder.b();
        a(builder.f۴۱۱۴f, false);
        List<String> list2 = builder.f۴۱۱۵g;
        String str = null;
        if (list2 != null) {
            list = a(list2, true);
        } else {
            list = null;
        }
        this.f۴۱۰۶f = list;
        String str2 = builder.f۴۱۱۶h;
        this.f۴۱۰۷g = str2 != null ? a(str2, false) : str;
        this.f۴۱۰۸h = builder.toString();
    }

    public URI n() {
        a i2 = i();
        i2.c();
        String uri = i2.toString();
        try {
            return new URI(uri);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(uri.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception e3) {
                throw new RuntimeException(e2);
            }
        }
    }

    public String m() {
        return this.f۴۱۰۱a;
    }

    public boolean h() {
        return this.f۴۱۰۱a.equals("https");
    }

    public String f() {
        if (this.f۴۱۰۲b.isEmpty()) {
            return "";
        }
        int usernameStart = this.f۴۱۰۱a.length() + 3;
        String str = this.f۴۱۰۸h;
        return this.f۴۱۰۸h.substring(usernameStart, c.a(str, usernameStart, str.length(), ":@"));
    }

    public String b() {
        if (this.f۴۱۰۳c.isEmpty()) {
            return "";
        }
        int passwordEnd = this.f۴۱۰۸h.indexOf(64);
        return this.f۴۱۰۸h.substring(this.f۴۱۰۸h.indexOf(58, this.f۴۱۰۱a.length() + 3) + 1, passwordEnd);
    }

    public String g() {
        return this.f۴۱۰۴d;
    }

    public int j() {
        return this.f۴۱۰۵e;
    }

    public static int c(String scheme) {
        if (scheme.equals("http")) {
            return 80;
        }
        if (scheme.equals("https")) {
            return 443;
        }
        return -1;
    }

    public String c() {
        int pathStart = this.f۴۱۰۸h.indexOf(47, this.f۴۱۰۱a.length() + 3);
        String str = this.f۴۱۰۸h;
        return this.f۴۱۰۸h.substring(pathStart, c.a(str, pathStart, str.length(), "?#"));
    }

    static void b(StringBuilder out, List<String> pathSegments) {
        int size = pathSegments.size();
        for (int i2 = 0; i2 < size; i2++) {
            out.append('/');
            out.append(pathSegments.get(i2));
        }
    }

    public List<String> d() {
        int pathStart = this.f۴۱۰۸h.indexOf(47, this.f۴۱۰۱a.length() + 3);
        String str = this.f۴۱۰۸h;
        int pathEnd = c.a(str, pathStart, str.length(), "?#");
        List<String> result = new ArrayList<>();
        int i2 = pathStart;
        while (i2 < pathEnd) {
            int i3 = i2 + 1;
            int segmentEnd = c.a(this.f۴۱۰۸h, i3, pathEnd, '/');
            result.add(this.f۴۱۰۸h.substring(i3, segmentEnd));
            i2 = segmentEnd;
        }
        return result;
    }

    public String e() {
        if (this.f۴۱۰۶f == null) {
            return null;
        }
        int queryStart = this.f۴۱۰۸h.indexOf(63) + 1;
        String str = this.f۴۱۰۸h;
        return this.f۴۱۰۸h.substring(queryStart, c.a(str, queryStart, str.length(), '#'));
    }

    static void a(StringBuilder out, List<String> namesAndValues) {
        int size = namesAndValues.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String name = namesAndValues.get(i2);
            String value = namesAndValues.get(i2 + 1);
            if (i2 > 0) {
                out.append('&');
            }
            out.append(name);
            if (value != null) {
                out.append('=');
                out.append(value);
            }
        }
    }

    static List<String> e(String encodedQuery) {
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

    public String k() {
        if (this.f۴۱۰۶f == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        a(result, this.f۴۱۰۶f);
        return result.toString();
    }

    public String a() {
        if (this.f۴۱۰۷g == null) {
            return null;
        }
        return this.f۴۱۰۸h.substring(this.f۴۱۰۸h.indexOf(35) + 1);
    }

    public String l() {
        a a2 = a("/...");
        a2.e("");
        a2.c("");
        return a2.a().toString();
    }

    public s b(String link) {
        a builder = a(link);
        if (builder != null) {
            return builder.a();
        }
        return null;
    }

    public a i() {
        a result = new a();
        result.f۴۱۰۹a = this.f۴۱۰۱a;
        result.f۴۱۱۰b = f();
        result.f۴۱۱۱c = b();
        result.f۴۱۱۲d = this.f۴۱۰۴d;
        result.f۴۱۱۳e = this.f۴۱۰۵e != c(this.f۴۱۰۱a) ? this.f۴۱۰۵e : -1;
        result.f۴۱۱۴f.clear();
        result.f۴۱۱۴f.addAll(d());
        result.a(e());
        result.f۴۱۱۶h = a();
        return result;
    }

    public a a(String link) {
        a builder = new a();
        if (builder.a(this, link) == a.EnumC۰۱۲۳a.SUCCESS) {
            return builder;
        }
        return null;
    }

    public static s d(String url) {
        a builder = new a();
        if (builder.a(null, url) == a.EnumC۰۱۲۳a.SUCCESS) {
            return builder.a();
        }
        return null;
    }

    public boolean equals(Object other) {
        return (other instanceof s) && ((s) other).f۴۱۰۸h.equals(this.f۴۱۰۸h);
    }

    public int hashCode() {
        return this.f۴۱۰۸h.hashCode();
    }

    public String toString() {
        return this.f۴۱۰۸h;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f۴۱۰۹a;

        /* renamed from: b  reason: collision with root package name */
        String f۴۱۱۰b = "";

        /* renamed from: c  reason: collision with root package name */
        String f۴۱۱۱c = "";

        /* renamed from: d  reason: collision with root package name */
        String f۴۱۱۲d;

        /* renamed from: e  reason: collision with root package name */
        int f۴۱۱۳e = -1;

        /* renamed from: f  reason: collision with root package name */
        final List<String> f۴۱۱۴f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        List<String> f۴۱۱۵g;

        /* renamed from: h  reason: collision with root package name */
        String f۴۱۱۶h;

        /* access modifiers changed from: package-private */
        /* renamed from: e.s$a$a  reason: collision with other inner class name */
        public enum EnumC۰۱۲۳a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            this.f۴۱۱۴f.add("");
        }

        public a d(String scheme) {
            if (scheme != null) {
                if (scheme.equalsIgnoreCase("http")) {
                    this.f۴۱۰۹a = "http";
                } else if (scheme.equalsIgnoreCase("https")) {
                    this.f۴۱۰۹a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public a e(String username) {
            if (username != null) {
                this.f۴۱۱۰b = s.a(username, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public a c(String password) {
            if (password != null) {
                this.f۴۱۱۱c = s.a(password, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public a b(String host) {
            if (host != null) {
                String encoded = a(host, 0, host.length());
                if (encoded != null) {
                    this.f۴۱۱۲d = encoded;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + host);
            }
            throw new NullPointerException("host == null");
        }

        public a a(int port) {
            if (port <= 0 || port > 65535) {
                throw new IllegalArgumentException("unexpected port: " + port);
            }
            this.f۴۱۱۳e = port;
            return this;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            int i = this.f۴۱۱۳e;
            return i != -1 ? i : s.c(this.f۴۱۰۹a);
        }

        public a a(String encodedQuery) {
            List<String> list;
            if (encodedQuery != null) {
                list = s.e(s.a(encodedQuery, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f۴۱۱۵g = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a c() {
            int size = this.f۴۱۱۴f.size();
            for (int i = 0; i < size; i++) {
                this.f۴۱۱۴f.set(i, s.a(this.f۴۱۱۴f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f۴۱۱۵g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String component = this.f۴۱۱۵g.get(i2);
                    if (component != null) {
                        this.f۴۱۱۵g.set(i2, s.a(component, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str = this.f۴۱۱۶h;
            if (str != null) {
                this.f۴۱۱۶h = s.a(str, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public s a() {
            if (this.f۴۱۰۹a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f۴۱۱۲d != null) {
                return new s(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append(this.f۴۱۰۹a);
            result.append("://");
            if (!this.f۴۱۱۰b.isEmpty() || !this.f۴۱۱۱c.isEmpty()) {
                result.append(this.f۴۱۱۰b);
                if (!this.f۴۱۱۱c.isEmpty()) {
                    result.append(':');
                    result.append(this.f۴۱۱۱c);
                }
                result.append('@');
            }
            if (this.f۴۱۱۲d.indexOf(58) != -1) {
                result.append('[');
                result.append(this.f۴۱۱۲d);
                result.append(']');
            } else {
                result.append(this.f۴۱۱۲d);
            }
            int effectivePort = b();
            if (effectivePort != s.c(this.f۴۱۰۹a)) {
                result.append(':');
                result.append(effectivePort);
            }
            s.b(result, this.f۴۱۱۴f);
            if (this.f۴۱۱۵g != null) {
                result.append('?');
                s.a(result, this.f۴۱۱۵g);
            }
            if (this.f۴۱۱۶h != null) {
                result.append('#');
                result.append(this.f۴۱۱۶h);
            }
            return result.toString();
        }

        /* access modifiers changed from: package-private */
        public EnumC۰۱۲۳a a(s base, String input) {
            int pathDelimiterOffset;
            int componentDelimiterOffset;
            int c2;
            int componentDelimiterOffset2;
            String str;
            int pos = c.b(input, 0, input.length());
            int limit = c.c(input, pos, input.length());
            int i = -1;
            if (e(input, pos, limit) != -1) {
                if (input.regionMatches(true, pos, "https:", 0, 6)) {
                    this.f۴۱۰۹a = "https";
                    pos += "https:".length();
                } else if (!input.regionMatches(true, pos, "http:", 0, 5)) {
                    return EnumC۰۱۲۳a.UNSUPPORTED_SCHEME;
                } else {
                    this.f۴۱۰۹a = "http";
                    pos += "http:".length();
                }
            } else if (base == null) {
                return EnumC۰۱۲۳a.MISSING_SCHEME;
            } else {
                this.f۴۱۰۹a = base.f۴۱۰۱a;
            }
            int slashCount = f(input, pos, limit);
            int i2 = 63;
            int i3 = 35;
            if (slashCount >= 2 || base == null || !base.f۴۱۰۱a.equals(this.f۴۱۰۹a)) {
                int pos2 = pos + slashCount;
                boolean hasUsername = false;
                boolean hasPassword = false;
                while (true) {
                    componentDelimiterOffset = c.a(input, pos2, limit, "@/\\?#");
                    if (componentDelimiterOffset != limit) {
                        c2 = input.charAt(componentDelimiterOffset);
                    } else {
                        c2 = -1;
                    }
                    if (c2 == i || c2 == i3 || c2 == 47 || c2 == 92 || c2 == i2) {
                        int portColonOffset = c(input, pos2, componentDelimiterOffset);
                    } else {
                        if (c2 == 64) {
                            if (!hasPassword) {
                                int passwordColonOffset = c.a(input, pos2, componentDelimiterOffset, ':');
                                String canonicalUsername = s.a(input, pos2, passwordColonOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                if (hasUsername) {
                                    str = this.f۴۱۱۰b + "%40" + canonicalUsername;
                                } else {
                                    str = canonicalUsername;
                                }
                                this.f۴۱۱۰b = str;
                                componentDelimiterOffset2 = componentDelimiterOffset;
                                if (passwordColonOffset != componentDelimiterOffset2) {
                                    hasPassword = true;
                                    this.f۴۱۱۱c = s.a(input, passwordColonOffset + 1, componentDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                }
                                hasUsername = true;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append(this.f۴۱۱۱c);
                                sb.append("%40");
                                componentDelimiterOffset2 = componentDelimiterOffset;
                                sb.append(s.a(input, pos2, componentDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                this.f۴۱۱۱c = sb.toString();
                            }
                            pos2 = componentDelimiterOffset2 + 1;
                        }
                        i3 = 35;
                        i2 = 63;
                        i = -1;
                    }
                }
                int portColonOffset2 = c(input, pos2, componentDelimiterOffset);
                if (portColonOffset2 + 1 < componentDelimiterOffset) {
                    this.f۴۱۱۲d = a(input, pos2, portColonOffset2);
                    this.f۴۱۱۳e = b(input, portColonOffset2 + 1, componentDelimiterOffset);
                    if (this.f۴۱۱۳e == -1) {
                        return EnumC۰۱۲۳a.INVALID_PORT;
                    }
                } else {
                    this.f۴۱۱۲d = a(input, pos2, portColonOffset2);
                    this.f۴۱۱۳e = s.c(this.f۴۱۰۹a);
                }
                if (this.f۴۱۱۲d == null) {
                    return EnumC۰۱۲۳a.INVALID_HOST;
                }
                pos = componentDelimiterOffset;
            } else {
                this.f۴۱۱۰b = base.f();
                this.f۴۱۱۱c = base.b();
                this.f۴۱۱۲d = base.f۴۱۰۴d;
                this.f۴۱۱۳e = base.f۴۱۰۵e;
                this.f۴۱۱۴f.clear();
                this.f۴۱۱۴f.addAll(base.d());
                if (pos == limit || input.charAt(pos) == '#') {
                    a(base.e());
                }
            }
            int pathDelimiterOffset2 = c.a(input, pos, limit, "?#");
            d(input, pos, pathDelimiterOffset2);
            int pos3 = pathDelimiterOffset2;
            if (pos3 >= limit || input.charAt(pos3) != '?') {
                pathDelimiterOffset = 35;
            } else {
                int queryDelimiterOffset = c.a(input, pos3, limit, '#');
                pathDelimiterOffset = 35;
                this.f۴۱۱۵g = s.e(s.a(input, pos3 + 1, queryDelimiterOffset, " \"'<>#", true, false, true, true, null));
                pos3 = queryDelimiterOffset;
            }
            if (pos3 < limit && input.charAt(pos3) == pathDelimiterOffset) {
                this.f۴۱۱۶h = s.a(input, pos3 + 1, limit, "", true, false, false, false, null);
            }
            return EnumC۰۱۲۳a.SUCCESS;
        }

        private void d(String input, int pos, int limit) {
            if (pos != limit) {
                char c2 = input.charAt(pos);
                if (c2 == '/' || c2 == '\\') {
                    this.f۴۱۱۴f.clear();
                    this.f۴۱۱۴f.add("");
                    pos++;
                } else {
                    List<String> list = this.f۴۱۱۴f;
                    list.set(list.size() - 1, "");
                }
                int i = pos;
                while (i < limit) {
                    int pathSegmentDelimiterOffset = c.a(input, i, limit, "/\\");
                    boolean segmentHasTrailingSlash = pathSegmentDelimiterOffset < limit;
                    a(input, i, pathSegmentDelimiterOffset, segmentHasTrailingSlash, true);
                    i = pathSegmentDelimiterOffset;
                    if (segmentHasTrailingSlash) {
                        i++;
                    }
                }
            }
        }

        private void a(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String segment = s.a(input, pos, limit, " \"<>^`{}|/\\?#", alreadyEncoded, false, false, true, null);
            if (!f(segment)) {
                if (g(segment)) {
                    d();
                    return;
                }
                List<String> list = this.f۴۱۱۴f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f۴۱۱۴f;
                    list2.set(list2.size() - 1, segment);
                } else {
                    this.f۴۱۱۴f.add(segment);
                }
                if (addTrailingSlash) {
                    this.f۴۱۱۴f.add("");
                }
            }
        }

        private boolean f(String input) {
            return input.equals(".") || input.equalsIgnoreCase("%2e");
        }

        private boolean g(String input) {
            return input.equals("..") || input.equalsIgnoreCase("%2e.") || input.equalsIgnoreCase(".%2e") || input.equalsIgnoreCase("%2e%2e");
        }

        private void d() {
            List<String> list = this.f۴۱۱۴f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f۴۱۱۴f.isEmpty()) {
                this.f۴۱۱۴f.add("");
                return;
            }
            List<String> list2 = this.f۴۱۱۴f;
            list2.set(list2.size() - 1, "");
        }

        private static int e(String input, int pos, int limit) {
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
                    } else {
                        return -1;
                    }
                }
            }
            return -1;
        }

        private static int f(String input, int pos, int limit) {
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

        private static int c(String input, int pos, int limit) {
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

        private static String a(String input, int pos, int limit) {
            return c.a(s.a(input, pos, limit, false));
        }

        private static int b(String input, int pos, int limit) {
            try {
                int i = Integer.parseInt(s.a(input, pos, limit, "", false, false, false, true, null));
                if (i <= 0 || i > 65535) {
                    return -1;
                }
                return i;
            } catch (NumberFormatException e2) {
                return -1;
            }
        }
    }

    static String a(String encoded, boolean plusIsSpace) {
        return a(encoded, 0, encoded.length(), plusIsSpace);
    }

    private List<String> a(List<String> list, boolean plusIsSpace) {
        int size = list.size();
        List<String> result = new ArrayList<>(size);
        for (int i2 = 0; i2 < size; i2++) {
            String s = list.get(i2);
            result.add(s != null ? a(s, plusIsSpace) : null);
        }
        return Collections.unmodifiableList(result);
    }

    static String a(String encoded, int pos, int limit, boolean plusIsSpace) {
        for (int i2 = pos; i2 < limit; i2++) {
            char c2 = encoded.charAt(i2);
            if (c2 == '%' || (c2 == '+' && plusIsSpace)) {
                f.c out = new f.c();
                out.a(encoded, pos, i2);
                a(out, encoded, i2, limit, plusIsSpace);
                return out.p();
            }
        }
        return encoded.substring(pos, limit);
    }

    static void a(f.c out, String encoded, int pos, int limit, boolean plusIsSpace) {
        int i2 = pos;
        while (i2 < limit) {
            int codePoint = encoded.codePointAt(i2);
            if (codePoint == 37 && i2 + 2 < limit) {
                int d1 = c.a(encoded.charAt(i2 + 1));
                int d2 = c.a(encoded.charAt(i2 + 2));
                if (!(d1 == -1 || d2 == -1)) {
                    out.writeByte((d1 << 4) + d2);
                    i2 += 2;
                    i2 += Character.charCount(codePoint);
                }
            } else if (codePoint == 43 && plusIsSpace) {
                out.writeByte(32);
                i2 += Character.charCount(codePoint);
            }
            out.c(codePoint);
            i2 += Character.charCount(codePoint);
        }
    }

    static boolean a(String encoded, int pos, int limit) {
        return pos + 2 < limit && encoded.charAt(pos) == '%' && c.a(encoded.charAt(pos + 1)) != -1 && c.a(encoded.charAt(pos + 2)) != -1;
    }

    static String a(String input, int pos, int limit, String encodeSet, boolean alreadyEncoded, boolean strict, boolean plusIsSpace, boolean asciiOnly, Charset charset) {
        int i2 = pos;
        while (i2 < limit) {
            int codePoint = input.codePointAt(i2);
            if (codePoint >= 32 && codePoint != 127) {
                if (codePoint < 128 || !asciiOnly) {
                    if (encodeSet.indexOf(codePoint) == -1 && ((codePoint != 37 || (alreadyEncoded && (!strict || a(input, i2, limit)))) && (codePoint != 43 || !plusIsSpace))) {
                        i2 += Character.charCount(codePoint);
                    }
                }
            }
            f.c out = new f.c();
            out.a(input, pos, i2);
            a(out, input, i2, limit, encodeSet, alreadyEncoded, strict, plusIsSpace, asciiOnly, charset);
            return out.p();
        }
        return input.substring(pos, limit);
    }

    static void a(f.c out, String input, int pos, int limit, String encodeSet, boolean alreadyEncoded, boolean strict, boolean plusIsSpace, boolean asciiOnly, Charset charset) {
        f.c encodedCharBuffer = null;
        int i2 = pos;
        while (i2 < limit) {
            int codePoint = input.codePointAt(i2);
            if (!alreadyEncoded || !(codePoint == 9 || codePoint == 10 || codePoint == 12 || codePoint == 13)) {
                if (codePoint != 43 || !plusIsSpace) {
                    if (codePoint >= 32 && codePoint != 127) {
                        if (codePoint < 128 || !asciiOnly) {
                            if (encodeSet.indexOf(codePoint) == -1 && (codePoint != 37 || (alreadyEncoded && (!strict || a(input, i2, limit))))) {
                                out.c(codePoint);
                            }
                        }
                    }
                    if (encodedCharBuffer == null) {
                        encodedCharBuffer = new f.c();
                    }
                    if (charset == null || charset.equals(c.f۳۷۴۵d)) {
                        encodedCharBuffer.c(codePoint);
                    } else {
                        encodedCharBuffer.a(input, i2, Character.charCount(codePoint) + i2, charset);
                    }
                    while (!encodedCharBuffer.i()) {
                        int b2 = encodedCharBuffer.readByte() & 255;
                        out.writeByte(37);
                        out.writeByte((int) i[(b2 >> 4) & 15]);
                        out.writeByte((int) i[b2 & 15]);
                    }
                } else {
                    out.a(alreadyEncoded ? "+" : "%2B");
                }
            }
            i2 += Character.charCount(codePoint);
        }
    }

    static String a(String input, String encodeSet, boolean alreadyEncoded, boolean strict, boolean plusIsSpace, boolean asciiOnly) {
        return a(input, 0, input.length(), encodeSet, alreadyEncoded, strict, plusIsSpace, asciiOnly, null);
    }
}
