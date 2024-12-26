package e.f0.g;

import e.a0;
import e.f0.c;
import e.l;
import e.m;
import e.r;
import e.s;
import e.y;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import okhttp3.Cookie;

public final class e {
    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    public static long a(a0 response) {
        return a(response.q());
    }

    public static long a(r headers) {
        return a(headers.a("Content-Length"));
    }

    private static long a(String s) {
        if (s == null) {
            return -1;
        }
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException e2) {
            return -1;
        }
    }

    public static boolean a(a0 cachedResponse, r cachedRequest, y newRequest) {
        for (String field : d(cachedResponse)) {
            if (!c.a(cachedRequest.b(field), newRequest.b(field))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(a0 response) {
        return b(response.q());
    }

    public static boolean b(r responseHeaders) {
        return c(responseHeaders).contains("*");
    }

    private static Set<String> d(a0 response) {
        return c(response.q());
    }

    public static Set<String> c(r responseHeaders) {
        Set<String> result = Collections.emptySet();
        int size = responseHeaders.b();
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(responseHeaders.a(i))) {
                String value = responseHeaders.b(i);
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

    public static r e(a0 response) {
        return a(response.t().y().c(), response.q());
    }

    public static r a(r requestHeaders, r responseHeaders) {
        Set<String> varyFields = c(responseHeaders);
        if (varyFields.isEmpty()) {
            return new r.a().a();
        }
        r.a result = new r.a();
        int size = requestHeaders.b();
        for (int i = 0; i < size; i++) {
            String fieldName = requestHeaders.a(i);
            if (varyFields.contains(fieldName)) {
                result.a(fieldName, requestHeaders.b(i));
            }
        }
        return result.a();
    }

    public static void a(m cookieJar, s url, r headers) {
        if (cookieJar != m.f۴۰۸۴a) {
            List<Cookie> cookies = l.a(url, headers);
            if (!cookies.isEmpty()) {
                cookieJar.a(url, cookies);
            }
        }
    }

    public static boolean b(a0 response) {
        if (response.y().e().equals("HEAD")) {
            return false;
        }
        int responseCode = response.o();
        if (((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) && a(response) == -1 && !"chunked".equalsIgnoreCase(response.b("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static int a(String input, int pos, String characters) {
        while (pos < input.length() && characters.indexOf(input.charAt(pos)) == -1) {
            pos++;
        }
        return pos;
    }

    public static int b(String input, int pos) {
        while (pos < input.length() && ((c = input.charAt(pos)) == ' ' || c == '\t')) {
            pos++;
        }
        return pos;
    }

    public static int a(String value, int defaultValue) {
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
