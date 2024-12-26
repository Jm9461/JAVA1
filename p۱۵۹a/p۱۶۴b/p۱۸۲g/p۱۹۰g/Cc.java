package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g;

/* renamed from: a.b.g.g.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cc {

    /* renamed from: a, reason: contains not printable characters */
    static final int[] f۸۷۴۴a = new int[0];

    /* renamed from: b, reason: contains not printable characters */
    static final long[] f۸۷۴۵b = new long[0];

    /* renamed from: c, reason: contains not printable characters */
    static final Object[] f۸۷۴۶c = new Object[0];

    /* renamed from: b, reason: contains not printable characters */
    public static int m۸۵۱۹b(int need) {
        return m۸۵۱۵a(need * 4) / 4;
    }

    /* renamed from: c, reason: contains not printable characters */
    public static int m۸۵۲۰c(int need) {
        return m۸۵۱۵a(need * 8) / 8;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۸۵۱۵a(int need) {
        for (int i = 4; i < 32; i++) {
            if (need <= (1 << i) - 12) {
                return (1 << i) - 12;
            }
        }
        return need;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۸۵۱۸a(Object a2, Object b2) {
        return a2 == b2 || (a2 != null && a2.equals(b2));
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۸۵۱۶a(int[] array, int size, int value) {
        int lo = 0;
        int hi = size - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            int midVal = array[mid];
            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal > value) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return lo ^ (-1);
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۸۵۱۷a(long[] array, int size, long value) {
        int lo = 0;
        int hi = size - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            long midVal = array[mid];
            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal > value) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return lo ^ (-1);
    }
}
