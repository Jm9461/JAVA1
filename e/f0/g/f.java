package e.f0.g;

public final class f {
    public static boolean a(String method) {
        return method.equals("POST") || method.equals("PATCH") || method.equals("PUT") || method.equals("DELETE") || method.equals("MOVE");
    }

    public static boolean e(String method) {
        return method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT");
    }

    public static boolean b(String method) {
        return !method.equals("GET") && !method.equals("HEAD");
    }

    public static boolean d(String method) {
        return method.equals("PROPFIND");
    }

    public static boolean c(String method) {
        return !method.equals("PROPFIND");
    }
}
