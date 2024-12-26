package p۲۹۵e.p۲۹۶f0.p۲۹۹g;

/* renamed from: e.f0.g.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cf {
    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۶۶۹۹a(String method) {
        return method.equals("POST") || method.equals("PATCH") || method.equals("PUT") || method.equals("DELETE") || method.equals("MOVE");
    }

    /* renamed from: e, reason: contains not printable characters */
    public static boolean m۱۶۷۰۳e(String method) {
        return method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT");
    }

    /* renamed from: b, reason: contains not printable characters */
    public static boolean m۱۶۷۰۰b(String method) {
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    /* renamed from: d, reason: contains not printable characters */
    public static boolean m۱۶۷۰۲d(String method) {
        return method.equals("PROPFIND");
    }

    /* renamed from: c, reason: contains not printable characters */
    public static boolean m۱۶۷۰۱c(String method) {
        return !method.equals("PROPFIND");
    }
}
