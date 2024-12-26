package e.f0.g;

import e.s;
import e.y;
import java.net.Proxy;

public final class i {
    public static String a(y request, Proxy.Type proxyType) {
        StringBuilder result = new StringBuilder();
        result.append(request.e());
        result.append(' ');
        if (b(request, proxyType)) {
            result.append(request.g());
        } else {
            result.append(a(request.g()));
        }
        result.append(" HTTP/1.1");
        return result.toString();
    }

    private static boolean b(y request, Proxy.Type proxyType) {
        return !request.d() && proxyType == Proxy.Type.HTTP;
    }

    public static String a(s url) {
        String path = url.c();
        String query = url.e();
        if (query == null) {
            return path;
        }
        return path + '?' + query;
    }
}
