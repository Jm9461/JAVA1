package f;

/* access modifiers changed from: package-private */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    static o f۴۲۱۵a;

    /* renamed from: b  reason: collision with root package name */
    static long f۴۲۱۶b;

    private p() {
    }

    static o a() {
        synchronized (p.class) {
            if (f۴۲۱۵a == null) {
                return new o();
            }
            o result = f۴۲۱۵a;
            f۴۲۱۵a = result.f۴۲۱۳f;
            result.f۴۲۱۳f = null;
            f۴۲۱۶b -= 8192;
            return result;
        }
    }

    static void a(o segment) {
        if (segment.f۴۲۱۳f != null || segment.f۴۲۱۴g != null) {
            throw new IllegalArgumentException();
        } else if (!segment.f۴۲۱۱d) {
            synchronized (p.class) {
                if (f۴۲۱۶b + 8192 <= 65536) {
                    f۴۲۱۶b += 8192;
                    segment.f۴۲۱۳f = f۴۲۱۵a;
                    segment.f۴۲۱۰c = 0;
                    segment.f۴۲۰۹b = 0;
                    f۴۲۱۵a = segment;
                }
            }
        }
    }
}
