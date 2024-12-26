package p۱۳۹e;

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
import p۱۳۹e.p۱۴۰f0.Cc;
import p۱۳۹e.p۱۴۰f0.p۱۴۳g.Cd;

/* renamed from: e.l  reason: invalid class name */
public final class Cl {

    /* renamed from: j  reason: contains not printable characters */
    private static final Pattern f۱۶۱۱۸j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: contains not printable characters */
    private static final Pattern f۱۶۱۱۹k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: contains not printable characters */
    private static final Pattern f۱۶۱۲۰l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: contains not printable characters */
    private static final Pattern f۱۶۱۲۱m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: contains not printable characters */
    private final String f۱۶۱۲۲a;

    /* renamed from: b  reason: contains not printable characters */
    private final String f۱۶۱۲۳b;

    /* renamed from: c  reason: contains not printable characters */
    private final long f۱۶۱۲۴c;

    /* renamed from: d  reason: contains not printable characters */
    private final String f۱۶۱۲۵d;

    /* renamed from: e  reason: contains not printable characters */
    private final String f۱۶۱۲۶e;

    /* renamed from: f  reason: contains not printable characters */
    private final boolean f۱۶۱۲۷f;

    /* renamed from: g  reason: contains not printable characters */
    private final boolean f۱۶۱۲۸g;

    /* renamed from: h  reason: contains not printable characters */
    private final boolean f۱۶۱۲۹h;

    /* renamed from: i  reason: contains not printable characters */
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

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۱۵۲a() {
        return this.f۱۶۱۲۲a;
    }

    /* renamed from: b  reason: contains not printable characters */
    public String m۱۹۱۵۴b() {
        return this.f۱۶۱۲۳b;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۹۱۵۰a(String urlHost, String domain) {
        if (urlHost.equals(domain)) {
            return true;
        }
        if (!urlHost.endsWith(domain) || urlHost.charAt((urlHost.length() - domain.length()) - 1) != '.' || Cc.m۱۸۶۳۶d(urlHost)) {
            return false;
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cl m۱۹۱۴۷a(Cs url, String setCookie) {
        return m۱۹۱۴۶a(System.currentTimeMillis(), url, setCookie);
    }

    /* renamed from: a  reason: contains not printable characters */
    static Cl m۱۹۱۴۶a(long currentTimeMillis, Cs url, String setCookie) {
        long expiresAt;
        String domain;
        String path;
        long deltaMilliseconds;
        String attributeValue;
        int limit = setCookie.length();
        char c = ';';
        int cookiePairEnd = Cc.m۱۸۶۰۸a(setCookie, 0, limit, ';');
        char c2 = '=';
        int pairEqualsSign = Cc.m۱۸۶۰۸a(setCookie, 0, cookiePairEnd, '=');
        if (pairEqualsSign == cookiePairEnd) {
            return null;
        }
        String cookieName = Cc.m۱۸۶۳۵d(setCookie, 0, pairEqualsSign);
        if (cookieName.isEmpty() || Cc.m۱۸۶۳۳c(cookieName) != -1) {
            return null;
        }
        String cookieValue = Cc.m۱۸۶۳۵d(setCookie, pairEqualsSign + 1, cookiePairEnd);
        if (Cc.m۱۸۶۳۳c(cookieValue) != -1) {
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
            int attributePairEnd = Cc.m۱۸۶۰۸a(setCookie, pos, limit, c);
            int attributeEqualsSign = Cc.m۱۸۶۰۸a(setCookie, pos, attributePairEnd, c2);
            String attributeName = Cc.m۱۸۶۳۵d(setCookie, pos, attributeEqualsSign);
            if (attributeEqualsSign < attributePairEnd) {
                attributeValue = Cc.m۱۸۶۳۵d(setCookie, attributeEqualsSign + 1, attributePairEnd);
            } else {
                attributeValue = "";
            }
            if (attributeName.equalsIgnoreCase("expires")) {
                try {
                    expiresAt2 = m۱۹۱۴۵a(attributeValue, 0, attributeValue.length());
                    persistent = true;
                } catch (IllegalArgumentException e) {
                }
            } else if (attributeName.equalsIgnoreCase("max-age")) {
                try {
                    deltaSeconds = m۱۹۱۵۱b(attributeValue);
                    persistent = true;
                } catch (NumberFormatException e2) {
                }
            } else if (attributeName.equalsIgnoreCase("domain")) {
                try {
                    hostOnly = false;
                    domain2 = m۱۹۱۴۸a(attributeValue);
                } catch (IllegalArgumentException e3) {
                }
            } else if (attributeName.equalsIgnoreCase("path")) {
                path2 = attributeValue;
            } else if (attributeName.equalsIgnoreCase("secure")) {
                secureOnly = true;
            } else if (attributeName.equalsIgnoreCase("httponly")) {
                httpOnly = true;
            }
            pos = attributePairEnd + 1;
            c = ';';
            c2 = '=';
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
        String urlHost = url.m۱۹۲۳۴g();
        if (domain2 == null) {
            domain = urlHost;
        } else if (!m۱۹۱۵۰a(urlHost, domain2)) {
            return null;
        } else {
            domain = domain2;
        }
        if (urlHost.length() != domain.length() && PublicSuffixDatabase.m۱۹۸۱۹a().m۱۹۸۲۳a(domain) == null) {
            return null;
        }
        String str = "/";
        if (path2 == null || !path2.startsWith(str)) {
            String encodedPath = url.m۱۹۲۳۰c();
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

    /* renamed from: a  reason: contains not printable characters */
    private static long m۱۹۱۴۵a(String s, int pos, int limit) {
        int pos2 = m۱۹۱۴۴a(s, pos, limit, false);
        int hour = -1;
        int minute = -1;
        int second = -1;
        int dayOfMonth = -1;
        int month = -1;
        int year = -1;
        Matcher matcher = f۱۶۱۲۱m.matcher(s);
        while (pos2 < limit) {
            int end = m۱۹۱۴۴a(s, pos2 + 1, limit, true);
            matcher.region(pos2, end);
            if (hour == -1 && matcher.usePattern(f۱۶۱۲۱m).matches()) {
                hour = Integer.parseInt(matcher.group(1));
                minute = Integer.parseInt(matcher.group(2));
                second = Integer.parseInt(matcher.group(3));
            } else if (dayOfMonth == -1 && matcher.usePattern(f۱۶۱۲۰l).matches()) {
                dayOfMonth = Integer.parseInt(matcher.group(1));
            } else if (month == -1 && matcher.usePattern(f۱۶۱۱۹k).matches()) {
                month = f۱۶۱۱۹k.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (year == -1 && matcher.usePattern(f۱۶۱۱۸j).matches()) {
                year = Integer.parseInt(matcher.group(1));
            }
            pos2 = m۱۹۱۴۴a(s, end + 1, limit, false);
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
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۹۱۴۴a(String input, int pos, int limit, boolean invert) {
        for (int i = pos; i < limit; i++) {
            int c = input.charAt(i);
            if (((c < 32 && c != 9) || c >= 127 || (c >= 48 && c <= 57) || ((c >= 97 && c <= 122) || ((c >= 65 && c <= 90) || c == 58))) == (!invert)) {
                return i;
            }
        }
        return limit;
    }

    /* renamed from: b  reason: contains not printable characters */
    private static long m۱۹۱۵۱b(String s) {
        try {
            long parsed = Long.parseLong(s);
            if (parsed <= 0) {
                return Long.MIN_VALUE;
            }
            return parsed;
        } catch (NumberFormatException e) {
            if (!s.matches("-?\\d+")) {
                throw e;
            } else if (s.startsWith("-")) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static String m۱۹۱۴۸a(String s) {
        if (!s.endsWith(".")) {
            if (s.startsWith(".")) {
                s = s.substring(1);
            }
            String canonicalDomain = Cc.m۱۸۶۱۳a(s);
            if (canonicalDomain != null) {
                return canonicalDomain;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static List<Cl> m۱۹۱۴۹a(Cs url, Cr headers) {
        List<String> cookieStrings = headers.m۱۹۲۰۴b("Set-Cookie");
        List<Cookie> cookies = null;
        int size = cookieStrings.size();
        for (int i = 0; i < size; i++) {
            Cl cookie = m۱۹۱۴۷a(url, cookieStrings.get(i));
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
        return m۱۹۱۵۳a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۱۵۳a(boolean forObsoleteRfc2965) {
        StringBuilder result = new StringBuilder();
        result.append(this.f۱۶۱۲۲a);
        result.append('=');
        result.append(this.f۱۶۱۲۳b);
        if (this.f۱۶۱۲۹h) {
            if (this.f۱۶۱۲۴c == Long.MIN_VALUE) {
                result.append("; max-age=0");
            } else {
                result.append("; expires=");
                result.append(Cd.m۱۸۷۶۱a(new Date(this.f۱۶۱۲۴c)));
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
        if (that.f۱۶۱۲۲a.equals(this.f۱۶۱۲۲a) && that.f۱۶۱۲۳b.equals(this.f۱۶۱۲۳b) && that.f۱۶۱۲۵d.equals(this.f۱۶۱۲۵d) && that.f۱۶۱۲۶e.equals(this.f۱۶۱۲۶e) && that.f۱۶۱۲۴c == this.f۱۶۱۲۴c && that.f۱۶۱۲۷f == this.f۱۶۱۲۷f && that.f۱۶۱۲۸g == this.f۱۶۱۲۸g && that.f۱۶۱۲۹h == this.f۱۶۱۲۹h && that.f۱۶۱۳۰i == this.f۱۶۱۳۰i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f۱۶۱۲۴c;
        return (((((((((((((((((17 * 31) + this.f۱۶۱۲۲a.hashCode()) * 31) + this.f۱۶۱۲۳b.hashCode()) * 31) + this.f۱۶۱۲۵d.hashCode()) * 31) + this.f۱۶۱۲۶e.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f۱۶۱۲۷f ? 1 : 0)) * 31) + (!this.f۱۶۱۲۸g ? 1 : 0)) * 31) + (!this.f۱۶۱۲۹h ? 1 : 0)) * 31) + (!this.f۱۶۱۳۰i ? 1 : 0);
    }
}
