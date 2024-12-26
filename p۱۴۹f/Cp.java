package p۱۴۹f;

/* access modifiers changed from: package-private */
/* renamed from: f.p  reason: invalid class name */
public final class Cp {

    /* renamed from: a  reason: contains not printable characters */
    static Co f۱۶۳۰۹a;

    /* renamed from: b  reason: contains not printable characters */
    static long f۱۶۳۱۰b;

    private Cp() {
    }

    /* renamed from: a  reason: contains not printable characters */
    static Co m۱۹۵۳۴a() {
        synchronized (Cp.class) {
            if (f۱۶۳۰۹a == null) {
                return new Co();
            }
            Co result = f۱۶۳۰۹a;
            f۱۶۳۰۹a = result.f۱۶۳۰۷f;
            result.f۱۶۳۰۷f = null;
            f۱۶۳۱۰b -= 8192;
            return result;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۹۵۳۵a(Co segment) {
        if (segment.f۱۶۳۰۷f != null || segment.f۱۶۳۰۸g != null) {
            throw new IllegalArgumentException();
        } else if (!segment.f۱۶۳۰۵d) {
            synchronized (Cp.class) {
                if (f۱۶۳۱۰b + 8192 <= 65536) {
                    f۱۶۳۱۰b += 8192;
                    segment.f۱۶۳۰۷f = f۱۶۳۰۹a;
                    segment.f۱۶۳۰۴c = 0;
                    segment.f۱۶۳۰۳b = 0;
                    f۱۶۳۰۹a = segment;
                }
            }
        }
    }
}
