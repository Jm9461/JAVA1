package e;

import e.f0.c;
import e.f0.g.d;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Cookie;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public final class l {
    private static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    private final String f۴۰۷۶a;

    /* renamed from: b  reason: collision with root package name */
    private final String f۴۰۷۷b;

    /* renamed from: c  reason: collision with root package name */
    private final long f۴۰۷۸c;

    /* renamed from: d  reason: collision with root package name */
    private final String f۴۰۷۹d;

    /* renamed from: e  reason: collision with root package name */
    private final String f۴۰۸۰e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f۴۰۸۱f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f۴۰۸۲g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f۴۰۸۳h;
    private final boolean i;

    private l(String name, String value, long expiresAt, String domain, String path, boolean secure, boolean httpOnly, boolean hostOnly, boolean persistent) {
        this.f۴۰۷۶a = name;
        this.f۴۰۷۷b = value;
        this.f۴۰۷۸c = expiresAt;
        this.f۴۰۷۹d = domain;
        this.f۴۰۸۰e = path;
        this.f۴۰۸۱f = secure;
        this.f۴۰۸۲g = httpOnly;
        this.i = hostOnly;
        this.f۴۰۸۳h = persistent;
    }

    public String a() {
        return this.f۴۰۷۶a;
    }

    public String b() {
        return this.f۴۰۷۷b;
    }

    private static boolean a(String urlHost, String domain) {
        if (urlHost.equals(domain)) {
            return true;
        }
        if (!urlHost.endsWith(domain) || urlHost.charAt((urlHost.length() - domain.length()) - 1) != '.' || c.d(urlHost)) {
            return false;
        }
        return true;
    }

    public static l a(s url, String setCookie) {
        return a(System.currentTimeMillis(), url, setCookie);
    }

    static l a(long currentTimeMillis, s url, String setCookie) {
        long expiresAt;
        String domain;
        String path;
        long deltaMilliseconds;
        String attributeValue;
        int limit = setCookie.length();
        char c2 = ';';
        int cookiePairEnd = c.a(setCookie, 0, limit, ';');
        char c3 = '=';
        int pairEqualsSign = c.a(setCookie, 0, cookiePairEnd, '=');
        if (pairEqualsSign == cookiePairEnd) {
            return null;
        }
        String cookieName = c.d(setCookie, 0, pairEqualsSign);
        if (cookieName.isEmpty() || c.c(cookieName) != -1) {
            return null;
        }
        String cookieValue = c.d(setCookie, pairEqualsSign + 1, cookiePairEnd);
        if (c.c(cookieValue) != -1) {
            return null;
        }
        long expiresAt2 = 253402300799999L;
        String domain2 = null;
        String path2 = null;
        long deltaSeconds = -1;
        boolean secureOnly = false;
        boolean httpOnly = false;
        boolean hostOnly = true;
        boolean persistent = false;
        int pos = cookiePairEnd + 1;
        while (pos < limit) {
            int attributePairEnd = c.a(setCookie, pos, limit, c2);
            int attributeEqualsSign = c.a(setCookie, pos, attributePairEnd, c3);
            String attributeName = c.d(setCookie, pos, attributeEqualsSign);
            if (attributeEqualsSign < attributePairEnd) {
                attributeValue = c.d(setCookie, attributeEqualsSign + 1, attributePairEnd);
            } else {
                attributeValue = "";
            }
            if (attributeName.equalsIgnoreCase("expires")) {
                try {
                    expiresAt2 = a(attributeValue, 0, attributeValue.length());
                    persistent = true;
                } catch (IllegalArgumentException e2) {
                }
            } else if (attributeName.equalsIgnoreCase("max-age")) {
                try {
                    deltaSeconds = b(attributeValue);
                    persistent = true;
                } catch (NumberFormatException e3) {
                }
            } else if (attributeName.equalsIgnoreCase("domain")) {
                try {
                    hostOnly = false;
                    domain2 = a(attributeValue);
                } catch (IllegalArgumentException e4) {
                }
            } else if (attributeName.equalsIgnoreCase("path")) {
                path2 = attributeValue;
            } else if (attributeName.equalsIgnoreCase("secure")) {
                secureOnly = true;
            } else if (attributeName.equalsIgnoreCase("httponly")) {
                httpOnly = true;
            }
            pos = attributePairEnd + 1;
            c2 = ';';
            c3 = '=';
        }
        if (deltaSeconds == Long.MIN_VALUE) {
            expiresAt = Long.MIN_VALUE;
        } else if (deltaSeconds != -1) {
            if (deltaSeconds <= 9223372036854775L) {
                deltaMilliseconds = 1000 * deltaSeconds;
            } else {
                deltaMilliseconds = Long.MAX_VALUE;
            }
            long expiresAt3 = currentTimeMillis + deltaMilliseconds;
            expiresAt = (expiresAt3 < currentTimeMillis || expiresAt3 > 253402300799999L) ? 253402300799999L : expiresAt3;
        } else {
            expiresAt = expiresAt2;
        }
        String urlHost = url.g();
        if (domain2 == null) {
            domain = urlHost;
        } else if (!a(urlHost, domain2)) {
            return null;
        } else {
            domain = domain2;
        }
        if (urlHost.length() != domain.length() && PublicSuffixDatabase.a().a(domain) == null) {
            return null;
        }
        String str = "/";
        if (path2 == null || !path2.startsWith(str)) {
            String encodedPath = url.c();
            int lastSlash = encodedPath.lastIndexOf(47);
            if (lastSlash != 0) {
                str = encodedPath.substring(0, lastSlash);
            }
            path = str;
        } else {
            path = path2;
        }
        return new l(cookieName, cookieValue, expiresAt, domain, path, secureOnly, httpOnly, hostOnly, persistent);
    }

    private static long a(String s, int pos, int limit) {
        int pos2 = a(s, pos, limit, false);
        int hour = -1;
        int minute = -1;
        int second = -1;
        int dayOfMonth = -1;
        int month = -1;
        int year = -1;
        Matcher matcher = m.matcher(s);
        while (pos2 < limit) {
            int end = a(s, pos2 + 1, limit, true);
            matcher.region(pos2, end);
            if (hour == -1 && matcher.usePattern(m).matches()) {
                hour = Integer.parseInt(matcher.group(1));
                minute = Integer.parseInt(matcher.group(2));
                second = Integer.parseInt(matcher.group(3));
            } else if (dayOfMonth == -1 && matcher.usePattern(l).matches()) {
                dayOfMonth = Integer.parseInt(matcher.group(1));
            } else if (month == -1 && matcher.usePattern(k).matches()) {
                month = k.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (year == -1 && matcher.usePattern(j).matches()) {
                year = Integer.parseInt(matcher.group(1));
            }
            pos2 = a(s, end + 1, limit, false);
        }
        if (year >= 70 && year <= 99) {
            year += 1900;
        }
        if (year >= 0 && year <= 69) {
            year += 2000;
        }
        if (year < 1601) {
            throw new IllegalArgumentException();
        } else if (month == -1) {
            throw new IllegalArgumentException();
        } else if (dayOfMonth < 1 || dayOfMonth > 31) {
            throw new IllegalArgumentException();
        } else if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException();
        } else if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException();
        } else if (second < 0 || second > 59) {
            throw new IllegalArgumentException();
        } else {
            Calendar calendar = new GregorianCalendar(c.f۳۷۴۶e);
            calendar.setLenient(false);
            calendar.set(1, year);
            calendar.set(2, month - 1);
            calendar.set(5, dayOfMonth);
            calendar.set(11, hour);
            calendar.set(12, minute);
            calendar.set(13, second);
            calendar.set(14, 0);
            return calendar.getTimeInMillis();
        }
    }

    private static int a(String input, int pos, int limit, boolean invert) {
        for (int i2 = pos; i2 < limit; i2++) {
            int c2 = input.charAt(i2);
            if (((c2 < 32 && c2 != 9) || c2 >= 127 || (c2 >= 48 && c2 <= 57) || ((c2 >= 97 && c2 <= 122) || ((c2 >= 65 && c2 <= 90) || c2 == 58))) == (!invert)) {
                return i2;
            }
        }
        return limit;
    }

    private static long b(String s) {
        try {
            long parsed = Long.parseLong(s);
            if (parsed <= 0) {
                return Long.MIN_VALUE;
            }
            return parsed;
        } catch (NumberFormatException e2) {
            if (!s.matches("-?\\d+")) {
                throw e2;
            } else if (s.startsWith("-")) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    private static String a(String s) {
        if (!s.endsWith(".")) {
            if (s.startsWith(".")) {
                s = s.substring(1);
            }
            String canonicalDomain = c.a(s);
            if (canonicalDomain != null) {
                return canonicalDomain;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static List<l> a(s url, r headers) {
        List<String> cookieStrings = headers.b("Set-Cookie");
        List<Cookie> cookies = null;
        int size = cookieStrings.size();
        for (int i2 = 0; i2 < size; i2++) {
            l cookie = a(url, cookieStrings.get(i2));
            if (cookie != null) {
                if (cookies == null) {
                    cookies = new ArrayList<>();
                }
                cookies.add(cookie);
            }
        }
        if (cookies != null) {
            return Collections.unmodifiableList(cookies);
        }
        return Collections.emptyList();
    }

    public String toString() {
        return a(false);
    }

    /* access modifiers changed from: package-private */
    public String a(boolean forObsoleteRfc2965) {
        StringBuilder result = new StringBuilder();
        result.append(this.f۴۰۷۶a);
        result.append('=');
        result.append(this.f۴۰۷۷b);
        if (this.f۴۰۸۳h) {
            if (this.f۴۰۷۸c == Long.MIN_VALUE) {
                result.append("; max-age=0");
            } else {
                result.append("; expires=");
                result.append(d.a(new Date(this.f۴۰۷۸c)));
            }
        }
        if (!this.i) {
            result.append("; domain=");
            if (forObsoleteRfc2965) {
                result.append(".");
            }
            result.append(this.f۴۰۷۹d);
        }
        result.append("; path=");
        result.append(this.f۴۰۸۰e);
        if (this.f۴۰۸۱f) {
            result.append("; secure");
        }
        if (this.f۴۰۸۲g) {
            result.append("; httponly");
        }
        return result.toString();
    }

    public boolean equals(Object other) {
        if (!(other instanceof l)) {
            return false;
        }
        l that = (l) other;
        if (that.f۴۰۷۶a.equals(this.f۴۰۷۶a) && that.f۴۰۷۷b.equals(this.f۴۰۷۷b) && that.f۴۰۷۹d.equals(this.f۴۰۷۹d) && that.f۴۰۸۰e.equals(this.f۴۰۸۰e) && that.f۴۰۷۸c == this.f۴۰۷۸c && that.f۴۰۸۱f == this.f۴۰۸۱f && that.f۴۰۸۲g == this.f۴۰۸۲g && that.f۴۰۸۳h == this.f۴۰۸۳h && that.i == this.i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f۴۰۷۸c;
        return (((((((((((((((((17 * 31) + this.f۴۰۷۶a.hashCode()) * 31) + this.f۴۰۷۷b.hashCode()) * 31) + this.f۴۰۷۹d.hashCode()) * 31) + this.f۴۰۸۰e.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f۴۰۸۱f ? 1 : 0)) * 31) + (!this.f۴۰۸۲g ? 1 : 0)) * 31) + (!this.f۴۰۸۳h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }
}
