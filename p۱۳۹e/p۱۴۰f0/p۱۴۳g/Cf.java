package p۱۳۹e.p۱۴۰f0.p۱۴۳g;

/* renamed from: e.f0.g.f  reason: invalid class name */
public final class Cf {
    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۸۷۷۸a(String method) {
        return method.equals("POST") || method.equals("PATCH") || method.equals("PUT") || method.equals("DELETE") || method.equals("MOVE");
    }

    /* renamed from: e  reason: contains not printable characters */
    public static boolean m۱۸۷۸۲e(String method) {
        return method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT");
    }

    /* renamed from: b  reason: contains not printable characters */
    public static boolean m۱۸۷۷۹b(String method) {
        return !method.equals("GET") && !method.equals("HEAD");
    }

    /* renamed from: d  reason: contains not printable characters */
    public static boolean m۱۸۷۸۱d(String method) {
        return method.equals("PROPFIND");
    }

    /* renamed from: c  reason: contains not printable characters */
    public static boolean m۱۸۷۸۰c(String method) {
        return !method.equals("PROPFIND");
    }
}
