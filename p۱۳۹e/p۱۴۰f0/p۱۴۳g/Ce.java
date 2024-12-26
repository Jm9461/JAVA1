package p۱۳۹e.p۱۴۰f0.p۱۴۳g;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import okhttp3.Cookie;
import p۱۳۹e.AbstractCm;
import p۱۳۹e.Ca0;
import p۱۳۹e.Cl;
import p۱۳۹e.Cr;
import p۱۳۹e.Cs;
import p۱۳۹e.Cy;
import p۱۳۹e.p۱۴۰f0.Cc;

/* renamed from: e.f0.g.e  reason: invalid class name */
public final class Ce {
    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    /* renamed from: a  reason: contains not printable characters */
    public static long m۱۸۷۶۵a(Ca0 response) {
        return m۱۸۷۶۶a(response.m۱۸۵۰۹q());
    }

    /* renamed from: a  reason: contains not printable characters */
    public static long m۱۸۷۶۶a(Cr headers) {
        return m۱۸۷۶۷a(headers.m۱۹۲۰۱a("Content-Length"));
    }

    /* renamed from: a  reason: contains not printable characters */
    private static long m۱۸۷۶۷a(String s) {
        if (s == null) {
            return -1;
        }
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۸۷۷۰a(Ca0 cachedResponse, Cr cachedRequest, Cy newRequest) {
        for (String field : m۱۸۷۷۶d(cachedResponse)) {
            if (!Cc.m۱۸۶۲۵a(cachedRequest.m۱۹۲۰۴b(field), newRequest.m۱۹۳۲۴b(field))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c  reason: contains not printable characters */
    public static boolean m۱۸۷۷۵c(Ca0 response) {
        return m۱۸۷۷۳b(response.m۱۸۵۰۹q());
    }

    /* renamed from: b  reason: contains not printable characters */
    public static boolean m۱۸۷۷۳b(Cr responseHeaders) {
        return m۱۸۷۷۴c(responseHeaders).contains("*");
    }

    /* renamed from: d  reason: contains not printable characters */
    private static Set<String> m۱۸۷۷۶d(Ca0 response) {
        return m۱۸۷۷۴c(response.m۱۸۵۰۹q());
    }

    /* renamed from: c  reason: contains not printable characters */
    public static Set<String> m۱۸۷۷۴c(Cr responseHeaders) {
        Set<String> result = Collections.emptySet();
        int size = responseHeaders.m۱۹۲۰۲b();
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(responseHeaders.m۱۹۲۰۰a(i))) {
                String value = responseHeaders.m۱۹۲۰۳b(i);
                if (result.isEmpty()) {
                    result = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String varyField : value.split(",")) {
                    result.add(varyField.trim());
                }
            }
        }
        return result;
    }

    /* renamed from: e  reason: contains not printable characters */
    public static Cr m۱۸۷۷۷e(Ca0 response) {
        return m۱۸۷۶۸a(response.m۱۸۵۱۲t().m۱۸۵۱۷y().m۱۹۳۲۵c(), response.m۱۸۵۰۹q());
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cr m۱۸۷۶۸a(Cr requestHeaders, Cr responseHeaders) {
        Set<String> varyFields = m۱۸۷۷۴c(responseHeaders);
        if (varyFields.isEmpty()) {
            return new Cr.Ca().m۱۹۲۰۸a();
        }
        Cr.Ca result = new Cr.Ca();
        int size = requestHeaders.m۱۹۲۰۲b();
        for (int i = 0; i < size; i++) {
            String fieldName = requestHeaders.m۱۹۲۰۰a(i);
            if (varyFields.contains(fieldName)) {
                result.m۱۹۲۰۷a(fieldName, requestHeaders.m۱۹۲۰۳b(i));
            }
        }
        return result.m۱۹۲۰۸a();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۸۷۶۹a(AbstractCm cookieJar, Cs url, Cr headers) {
        if (cookieJar != AbstractCm.f۱۶۱۳۱a) {
            List<Cookie> cookies = Cl.m۱۹۱۴۹a(url, headers);
            if (!cookies.isEmpty()) {
                cookieJar.m۱۹۱۵۶a(url, cookies);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static boolean m۱۸۷۷۲b(Ca0 response) {
        if (response.m۱۸۵۱۷y().m۱۹۳۲۷e().equals("HEAD")) {
            return false;
        }
        int responseCode = response.m۱۸۵۰۷o();
        if (((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) && m۱۸۷۶۵a(response) == -1 && !"chunked".equalsIgnoreCase(response.m۱۸۵۰۳b("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۸۷۶۴a(String input, int pos, String characters) {
        while (pos < input.length() && characters.indexOf(input.charAt(pos)) == -1) {
            pos++;
        }
        return pos;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۸۷۷۱b(String input, int pos) {
        while (pos < input.length() && ((c = input.charAt(pos)) == ' ' || c == '\t')) {
            pos++;
        }
        return pos;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۸۷۶۳a(String value, int defaultValue) {
        try {
            long seconds = Long.parseLong(value);
            if (seconds > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (seconds < 0) {
                return 0;
            }
            return (int) seconds;
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}
