package p۳۰۵f;

/* renamed from: f.p, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cp {

    /* renamed from: a, reason: contains not printable characters */
    static Co f۱۶۳۰۹a;

    /* renamed from: b, reason: contains not printable characters */
    static long f۱۶۳۱۰b;

    private Cp() {
    }

    /* renamed from: a, reason: contains not printable characters */
    static Co m۱۷۴۵۷a() {
        synchronized (Cp.class) {
            if (f۱۶۳۰۹a != null) {
                Co result = f۱۶۳۰۹a;
                f۱۶۳۰۹a = result.f۱۶۳۰۷f;
                result.f۱۶۳۰۷f = null;
                f۱۶۳۱۰b -= 8192;
                return result;
            }
            return new Co();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۱۷۴۵۸a(Co segment) {
        if (segment.f۱۶۳۰۷f != null || segment.f۱۶۳۰۸g != null) {
            throw new IllegalArgumentException();
        }
        if (segment.f۱۶۳۰۵d) {
            return;
        }
        synchronized (Cp.class) {
            if (f۱۶۳۱۰b + 8192 > 65536) {
                return;
            }
            f۱۶۳۱۰b += 8192;
            segment.f۱۶۳۰۷f = f۱۶۳۰۹a;
            segment.f۱۶۳۰۴c = 0;
            segment.f۱۶۳۰۳b = 0;
            f۱۶۳۰۹a = segment;
        }
    }
}
