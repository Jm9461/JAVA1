package p۲۹۵e;

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
import p۲۹۵e.p۲۹۶f0.Cc;
import p۲۹۵e.p۲۹۶f0.p۲۹۹g.Cd;

/* renamed from: e.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cl {

    /* renamed from: j, reason: contains not printable characters */
    private static final Pattern f۱۶۱۱۸j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: contains not printable characters */
    private static final Pattern f۱۶۱۱۹k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: contains not printable characters */
    private static final Pattern f۱۶۱۲۰l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: contains not printable characters */
    private static final Pattern f۱۶۱۲۱m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: contains not printable characters */
    private final String f۱۶۱۲۲a;

    /* renamed from: b, reason: contains not printable characters */
    private final String f۱۶۱۲۳b;

    /* renamed from: c, reason: contains not printable characters */
    private final long f۱۶۱۲۴c;

    /* renamed from: d, reason: contains not printable characters */
    private final String f۱۶۱۲۵d;

    /* renamed from: e, reason: contains not printable characters */
    private final String f۱۶۱۲۶e;

    /* renamed from: f, reason: contains not printable characters */
    private final boolean f۱۶۱۲۷f;

    /* renamed from: g, reason: contains not printable characters */
    private final boolean f۱۶۱۲۸g;

    /* renamed from: h, reason: contains not printable characters */
    private final boolean f۱۶۱۲۹h;

    /* renamed from: i, reason: contains not printable characters */
    private final boolean f۱۶۱۳۰i;

    private Cl(String name, String value, long expiresAt, String domain, String path, boolean secure, boolean httpOnly, boolean hostOnly, boolean persistent) {
        this.f۱۶۱۲۲a = name;
        this.f۱۶۱۲۳b = value;
        this.f۱۶۱۲۴c = expiresAt;
        this.f۱۶۱۲۵d = domain;
        this.f۱۶۱۲۶e = path;
        this.f۱۶۱۲۷f = secure;
        this.f۱۶۱۲۸g = httpOnly;
        this.f۱۶۱۳۰i = hostOnly;
        this.f۱۶۱۲۹h = persistent;
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۷۰۷۳a() {
        return this.f۱۶۱۲۲a;
    }

    /* renamed from: b, reason: contains not printable characters */
    public String m۱۷۰۷۵b() {
        return this.f۱۶۱۲۳b;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۷۰۷۱a(String urlHost, String domain) {
        if (urlHost.equals(domain)) {
            return true;
        }
        return urlHost.endsWith(domain) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !Cc.m۱۶۵۵۷d(urlHost);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cl m۱۷۰۶۸a(Cs url, String setCookie) {
        return m۱۷۰۶۷a(System.currentTimeMillis(), url, setCookie);
    }

    /* renamed from: a, reason: contains not printable characters */
    static Cl m۱۷۰۶۷a(long currentTimeMillis, Cs url, String setCookie) {
        long expiresAt;
        long deltaMilliseconds;
        String domain;
        String path;
        String attributeValue;
        int limit = setCookie.length();
        char c2 = ';';
        int cookiePairEnd = Cc.m۱۶۵۲۹a(setCookie, 0, limit, ';');
        char c3 = '=';
        int pairEqualsSign = Cc.m۱۶۵۲۹a(setCookie, 0, cookiePairEnd, '=');
        if (pairEqualsSign == cookiePairEnd) {
            return null;
        }
        String cookieName = Cc.m۱۶۵۵۶d(setCookie, 0, pairEqualsSign);
        if (!cookieName.isEmpty() && Cc.m۱۶۵۵۴c(cookieName) == -1) {
            String cookieValue = Cc.m۱۶۵۵۶d(setCookie, pairEqualsSign + 1, cookiePairEnd);
            if (Cc.m۱۶۵۵۴c(cookieValue) != -1) {
                return null;
            }
            long expiresAt2 = 253402300799999L;
            String domain2 = null;
            String path2 = null;
            int pos = cookiePairEnd + 1;
            long deltaSeconds = -1;
            boolean secureOnly = false;
            boolean httpOnly = false;
            boolean hostOnly = true;
            boolean persistent = false;
            int pos2 = pos;
            while (pos2 < limit) {
                int attributePairEnd = Cc.m۱۶۵۲۹a(setCookie, pos2, limit, c2);
                int attributeEqualsSign = Cc.m۱۶۵۲۹a(setCookie, pos2, attributePairEnd, c3);
                String attributeName = Cc.m۱۶۵۵۶d(setCookie, pos2, attributeEqualsSign);
                if (attributeEqualsSign < attributePairEnd) {
                    attributeValue = Cc.m۱۶۵۵۶d(setCookie, attributeEqualsSign + 1, attributePairEnd);
                } else {
                    attributeValue = "";
                }
                if (attributeName.equalsIgnoreCase("expires")) {
                    try {
                        expiresAt2 = m۱۷۰۶۶a(attributeValue, 0, attributeValue.length());
                        persistent = true;
                    } catch (IllegalArgumentException e2) {
                    }
                } else if (attributeName.equalsIgnoreCase("max-age")) {
                    try {
                        deltaSeconds = m۱۷۰۷۲b(attributeValue);
                        persistent = true;
                    } catch (NumberFormatException e3) {
                    }
                } else if (attributeName.equalsIgnoreCase("domain")) {
                    try {
                        String domain3 = m۱۷۰۶۹a(attributeValue);
                        hostOnly = false;
                        domain2 = domain3;
                    } catch (IllegalArgumentException e4) {
                    }
                } else if (attributeName.equalsIgnoreCase("path")) {
                    path2 = attributeValue;
                } else if (attributeName.equalsIgnoreCase("secure")) {
                    secureOnly = true;
                } else if (attributeName.equalsIgnoreCase("httponly")) {
                    httpOnly = true;
                }
                pos2 = attributePairEnd + 1;
                c2 = ';';
                c3 = '=';
            }
            if (deltaSeconds == Long.MIN_VALUE) {
                expiresAt = Long.MIN_VALUE;
            } else if (deltaSeconds == -1) {
                expiresAt = expiresAt2;
            } else {
                if (deltaSeconds <= 9223372036854775L) {
                    deltaMilliseconds = 1000 * deltaSeconds;
                } else {
                    deltaMilliseconds = Long.MAX_VALUE;
                }
                long expiresAt3 = currentTimeMillis + deltaMilliseconds;
                expiresAt = (expiresAt3 < currentTimeMillis || expiresAt3 > 253402300799999L) ? 253402300799999L : expiresAt3;
            }
            String urlHost = url.m۱۷۱۵۵g();
            if (domain2 == null) {
                domain = urlHost;
            } else {
                if (!m۱۷۰۷۱a(urlHost, domain2)) {
                    return null;
                }
                domain = domain2;
            }
            if (urlHost.length() != domain.length() && PublicSuffixDatabase.m۱۷۷۴۵a().m۱۷۷۴۹a(domain) == null) {
                return null;
            }
            String str = "/";
            if (path2 == null || !path2.startsWith("/")) {
                String encodedPath = url.m۱۷۱۵۱c();
                int lastSlash = encodedPath.lastIndexOf(47);
                if (lastSlash != 0) {
                    str = encodedPath.substring(0, lastSlash);
                }
                path = str;
            } else {
                path = path2;
            }
            return new Cl(cookieName, cookieValue, expiresAt, domain, path, secureOnly, httpOnly, hostOnly, persistent);
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static long m۱۷۰۶۶a(String s, int pos, int limit) {
        int pos2 = m۱۷۰۶۵a(s, pos, limit, false);
        int hour = -1;
        int minute = -1;
        int second = -1;
        int dayOfMonth = -1;
        int month = -1;
        int year = -1;
        Matcher matcher = f۱۶۱۲۱m.matcher(s);
        while (pos2 < limit) {
            int end = m۱۷۰۶۵a(s, pos2 + 1, limit, true);
            matcher.region(pos2, end);
            if (hour == -1 && matcher.usePattern(f۱۶۱۲۱m).matches()) {
                hour = Integer.parseInt(matcher.group(1));
                minute = Integer.parseInt(matcher.group(2));
                second = Integer.parseInt(matcher.group(3));
            } else if (dayOfMonth == -1 && matcher.usePattern(f۱۶۱۲۰l).matches()) {
                dayOfMonth = Integer.parseInt(matcher.group(1));
            } else if (month == -1 && matcher.usePattern(f۱۶۱۱۹k).matches()) {
                String monthString = matcher.group(1).toLowerCase(Locale.US);
                int month2 = f۱۶۱۱۹k.pattern().indexOf(monthString) / 4;
                month = month2;
            } else if (year == -1 && matcher.usePattern(f۱۶۱۱۸j).matches()) {
                year = Integer.parseInt(matcher.group(1));
            }
            pos2 = m۱۷۰۶۵a(s, end + 1, limit, false);
        }
        if (year >= 70 && year <= 99) {
            year += 1900;
        }
        if (year >= 0 && year <= 69) {
            year += 2000;
        }
        if (year < 1601) {
            throw new IllegalArgumentException();
        }
        if (month == -1) {
            throw new IllegalArgumentException();
        }
        if (dayOfMonth < 1 || dayOfMonth > 31) {
            throw new IllegalArgumentException();
        }
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException();
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException();
        }
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException();
        }
        Calendar calendar = new GregorianCalendar(Cc.f۱۵۷۰۷e);
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

    /* renamed from: a, reason: contains not printable characters */
    private static int m۱۷۰۶۵a(String input, int pos, int limit, boolean invert) {
        for (int i = pos; i < limit; i++) {
            int c2 = input.charAt(i);
            boolean dateCharacter = (c2 < 32 && c2 != 9) || c2 >= 127 || (c2 >= 48 && c2 <= 57) || ((c2 >= 97 && c2 <= 122) || ((c2 >= 65 && c2 <= 90) || c2 == 58));
            if (dateCharacter == (!invert)) {
                return i;
            }
        }
        return limit;
    }

    /* renamed from: b, reason: contains not printable characters */
    private static long m۱۷۰۷۲b(String s) {
        try {
            long parsed = Long.parseLong(s);
            if (parsed <= 0) {
                return Long.MIN_VALUE;
            }
            return parsed;
        } catch (NumberFormatException e2) {
            if (s.matches("-?\\d+")) {
                return s.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e2;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static String m۱۷۰۶۹a(String s) {
        if (s.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (s.startsWith(".")) {
            s = s.substring(1);
        }
        String canonicalDomain = Cc.m۱۶۵۳۴a(s);
        if (canonicalDomain == null) {
            throw new IllegalArgumentException();
        }
        return canonicalDomain;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static List<Cl> m۱۷۰۷۰a(Cs url, Cr headers) {
        List<String> cookieStrings = headers.m۱۷۱۲۵b("Set-Cookie");
        List<Cookie> cookies = null;
        int size = cookieStrings.size();
        for (int i = 0; i < size; i++) {
            Cl cookie = m۱۷۰۶۸a(url, cookieStrings.get(i));
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
        return m۱۷۰۷۴a(false);
    }

    /* renamed from: a, reason: contains not printable characters */
    String m۱۷۰۷۴a(boolean forObsoleteRfc2965) {
        StringBuilder result = new StringBuilder();
        result.append(this.f۱۶۱۲۲a);
        result.append('=');
        result.append(this.f۱۶۱۲۳b);
        if (this.f۱۶۱۲۹h) {
            if (this.f۱۶۱۲۴c == Long.MIN_VALUE) {
                result.append("; max-age=0");
            } else {
                result.append("; expires=");
                result.append(Cd.m۱۶۶۸۲a(new Date(this.f۱۶۱۲۴c)));
            }
        }
        if (!this.f۱۶۱۳۰i) {
            result.append("; domain=");
            if (forObsoleteRfc2965) {
                result.append(".");
            }
            result.append(this.f۱۶۱۲۵d);
        }
        result.append("; path=");
        result.append(this.f۱۶۱۲۶e);
        if (this.f۱۶۱۲۷f) {
            result.append("; secure");
        }
        if (this.f۱۶۱۲۸g) {
            result.append("; httponly");
        }
        return result.toString();
    }

    public boolean equals(Object other) {
        if (!(other instanceof Cl)) {
            return false;
        }
        Cl that = (Cl) other;
        return that.f۱۶۱۲۲a.equals(this.f۱۶۱۲۲a) && that.f۱۶۱۲۳b.equals(this.f۱۶۱۲۳b) && that.f۱۶۱۲۵d.equals(this.f۱۶۱۲۵d) && that.f۱۶۱۲۶e.equals(this.f۱۶۱۲۶e) && that.f۱۶۱۲۴c == this.f۱۶۱۲۴c && that.f۱۶۱۲۷f == this.f۱۶۱۲۷f && that.f۱۶۱۲۸g == this.f۱۶۱۲۸g && that.f۱۶۱۲۹h == this.f۱۶۱۲۹h && that.f۱۶۱۳۰i == this.f۱۶۱۳۰i;
    }

    public int hashCode() {
        int hashCode = ((((((((17 * 31) + this.f۱۶۱۲۲a.hashCode()) * 31) + this.f۱۶۱۲۳b.hashCode()) * 31) + this.f۱۶۱۲۵d.hashCode()) * 31) + this.f۱۶۱۲۶e.hashCode()) * 31;
        long j = this.f۱۶۱۲۴c;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f۱۶۱۲۷f ? 1 : 0)) * 31) + (!this.f۱۶۱۲۸g ? 1 : 0)) * 31) + (!this.f۱۶۱۲۹h ? 1 : 0)) * 31) + (!this.f۱۶۱۳۰i ? 1 : 0);
    }
}
