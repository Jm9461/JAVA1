package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g;

/* access modifiers changed from: package-private */
/* renamed from: a.b.g.g.c  reason: invalid class name */
public class Cc {

    /* renamed from: a  reason: contains not printable characters */
    static final int[] f۸۷۴۴a = new int[0];

    /* renamed from: b  reason: contains not printable characters */
    static final long[] f۸۷۴۵b = new long[0];

    /* renamed from: c  reason: contains not printable characters */
    static final Object[] f۸۷۴۶c = new Object[0];

    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۰۵۹۰b(int need) {
        return m۱۰۵۸۶a(need * 4) / 4;
    }

    /* renamed from: c  reason: contains not printable characters */
    public static int m۱۰۵۹۱c(int need) {
        return m۱۰۵۸۶a(need * 8) / 8;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۰۵۸۶a(int need) {
        for (int i = 4; i < 32; i++) {
            if (need <= (1 << i) - 12) {
                return (1 << i) - 12;
            }
        }
        return need;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۰۵۸۹a(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۰۵۸۷a(int[] array, int size, int value) {
        int lo = 0;
        int hi = size - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            int midVal = array[mid];
            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal <= value) {
                return mid;
            } else {
                hi = mid - 1;
            }
        }
        return lo ^ -1;
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۰۵۸۸a(long[] array, int size, long value) {
        int lo = 0;
        int hi = size - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            long midVal = array[mid];
            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal <= value) {
                return mid;
            } else {
                hi = mid - 1;
            }
        }
        return lo ^ -1;
    }
}
