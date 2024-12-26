package p۲۹۵e.p۲۹۶f0.p۲۹۹g;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import p۲۹۵e.Ca0;
import p۲۹۵e.Cl;
import p۲۹۵e.Cr;
import p۲۹۵e.Cs;
import p۲۹۵e.Cy;
import p۲۹۵e.InterfaceCm;
import p۲۹۵e.p۲۹۶f0.Cc;

/* renamed from: e.f0.g.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ce {
    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    /* renamed from: a, reason: contains not printable characters */
    public static long m۱۶۶۸۶a(Ca0 response) {
        return m۱۶۶۸۷a(response.m۱۶۴۳۰q());
    }

    /* renamed from: a, reason: contains not printable characters */
    public static long m۱۶۶۸۷a(Cr headers) {
        return m۱۶۶۸۸a(headers.m۱۷۱۲۲a("Content-Length"));
    }

    /* renamed from: a, reason: contains not printable characters */
    private static long m۱۶۶۸۸a(String s) {
        if (s == null) {
            return -1L;
        }
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException e2) {
            return -1L;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۶۶۹۱a(Ca0 cachedResponse, Cr cachedRequest, Cy newRequest) {
        for (String field : m۱۶۶۹۷d(cachedResponse)) {
            if (!Cc.m۱۶۵۴۶a(cachedRequest.m۱۷۱۲۵b(field), newRequest.m۱۷۲۴۶b(field))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c, reason: contains not printable characters */
    public static boolean m۱۶۶۹۶c(Ca0 response) {
        return m۱۶۶۹۴b(response.m۱۶۴۳۰q());
    }

    /* renamed from: b, reason: contains not printable characters */
    public static boolean m۱۶۶۹۴b(Cr responseHeaders) {
        return m۱۶۶۹۵c(responseHeaders).contains("*");
    }

    /* renamed from: d, reason: contains not printable characters */
    private static Set<String> m۱۶۶۹۷d(Ca0 response) {
        return m۱۶۶۹۵c(response.m۱۶۴۳۰q());
    }

    /* renamed from: c, reason: contains not printable characters */
    public static Set<String> m۱۶۶۹۵c(Cr responseHeaders) {
        Set<String> result = Collections.emptySet();
        int size = responseHeaders.m۱۷۱۲۳b();
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(responseHeaders.m۱۷۱۲۱a(i))) {
                String value = responseHeaders.m۱۷۱۲۴b(i);
                if (result.isEmpty()) {
                    result = new TreeSet((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String varyField : value.split(",")) {
                    result.add(varyField.trim());
                }
            }
        }
        return result;
    }

    /* renamed from: e, reason: contains not printable characters */
    public static Cr m۱۶۶۹۸e(Ca0 response) {
        Cr requestHeaders = response.m۱۶۴۳۳t().m۱۶۴۳۸y().m۱۷۲۴۷c();
        Cr responseHeaders = response.m۱۶۴۳۰q();
        return m۱۶۶۸۹a(requestHeaders, responseHeaders);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cr m۱۶۶۸۹a(Cr requestHeaders, Cr responseHeaders) {
        Set<String> varyFields = m۱۶۶۹۵c(responseHeaders);
        if (varyFields.isEmpty()) {
            return new Cr.a().m۱۷۱۲۹a();
        }
        Cr.a result = new Cr.a();
        int size = requestHeaders.m۱۷۱۲۳b();
        for (int i = 0; i < size; i++) {
            String fieldName = requestHeaders.m۱۷۱۲۱a(i);
            if (varyFields.contains(fieldName)) {
                result.m۱۷۱۲۸a(fieldName, requestHeaders.m۱۷۱۲۴b(i));
            }
        }
        return result.m۱۷۱۲۹a();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۶۶۹۰a(InterfaceCm cookieJar, Cs url, Cr headers) {
        if (cookieJar == InterfaceCm.f۱۶۱۳۱a) {
            return;
        }
        List<Cl> list = Cl.m۱۷۰۷۰a(url, headers);
        if (list.isEmpty()) {
            return;
        }
        cookieJar.mo۱۷۰۷۹a(url, list);
    }

    /* renamed from: b, reason: contains not printable characters */
    public static boolean m۱۶۶۹۳b(Ca0 response) {
        if (response.m۱۶۴۳۸y().m۱۷۲۴۹e().equals("HEAD")) {
            return false;
        }
        int responseCode = response.m۱۶۴۲۸o();
        return (((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) && m۱۶۶۸۶a(response) == -1 && !"chunked".equalsIgnoreCase(response.m۱۶۴۲۴b("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۶۶۸۵a(String input, int pos, String characters) {
        while (pos < input.length() && characters.indexOf(input.charAt(pos)) == -1) {
            pos++;
        }
        return pos;
    }

    /* renamed from: b, reason: contains not printable characters */
    public static int m۱۶۶۹۲b(String input, int pos) {
        char c2;
        while (pos < input.length() && ((c2 = input.charAt(pos)) == ' ' || c2 == '\t')) {
            pos++;
        }
        return pos;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۶۶۸۴a(String value, int defaultValue) {
        try {
            long seconds = Long.parseLong(value);
            if (seconds > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (seconds < 0) {
                return 0;
            }
            return (int) seconds;
        } catch (NumberFormatException e2) {
            return defaultValue;
        }
    }
}
