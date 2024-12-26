package p۱۳۹e.p۱۴۰f0.p۱۴۳g;

import java.net.Proxy;
import p۱۳۹e.Cs;
import p۱۳۹e.Cy;

/* renamed from: e.f0.g.i  reason: invalid class name */
public final class Ci {
    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۸۷۹۷a(Cy request, Proxy.Type proxyType) {
        StringBuilder result = new StringBuilder();
        result.append(request.m۱۹۳۲۷e());
        result.append(' ');
        if (m۱۸۷۹۸b(request, proxyType)) {
            result.append(request.m۱۹۳۲۹g());
        } else {
            result.append(m۱۸۷۹۶a(request.m۱۹۳۲۹g()));
        }
        result.append(" HTTP/1.1");
        return result.toString();
    }

    /* renamed from: b  reason: contains not printable characters */
    private static boolean m۱۸۷۹۸b(Cy request, Proxy.Type proxyType) {
        return !request.m۱۹۳۲۶d() && proxyType == Proxy.Type.HTTP;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۸۷۹۶a(Cs url) {
        String path = url.m۱۹۲۳۰c();
        String query = url.m۱۹۲۳۲e();
        if (query == null) {
            return path;
        }
        return path + '?' + query;
    }
}
