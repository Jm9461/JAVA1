package p۲۹۵e.p۲۹۶f0.p۲۹۹g;

import java.net.Proxy;
import p۲۹۵e.Cs;
import p۲۹۵e.Cy;

/* renamed from: e.f0.g.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ci {
    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۶۷۱۸a(Cy request, Proxy.Type proxyType) {
        StringBuilder result = new StringBuilder();
        result.append(request.m۱۷۲۴۹e());
        result.append(' ');
        if (m۱۶۷۱۹b(request, proxyType)) {
            result.append(request.m۱۷۲۵۱g());
        } else {
            result.append(m۱۶۷۱۷a(request.m۱۷۲۵۱g()));
        }
        result.append(" HTTP/1.1");
        return result.toString();
    }

    /* renamed from: b, reason: contains not printable characters */
    private static boolean m۱۶۷۱۹b(Cy request, Proxy.Type proxyType) {
        return !request.m۱۷۲۴۸d() && proxyType == Proxy.Type.HTTP;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۶۷۱۷a(Cs url) {
        String path = url.m۱۷۱۵۱c();
        String query = url.m۱۷۱۵۳e();
        if (query == null) {
            return path;
        }
        return path + '?' + query;
    }
}
