package a.b.g.g;

/* access modifiers changed from: package-private */
public class c {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f۳۷۶a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    static final long[] f۳۷۷b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    static final Object[] f۳۷۸c = new Object[0];

    public static int b(int need) {
        return a(need * 4) / 4;
    }

    public static int c(int need) {
        return a(need * 8) / 8;
    }

    public static int a(int need) {
        for (int i = 4; i < 32; i++) {
            if (need <= (1 << i) - 12) {
                return (1 << i) - 12;
            }
        }
        return need;
    }

    public static boolean a(Object a2, Object b2) {
        return a2 == b2 || (a2 != null && a2.equals(b2));
    }

    static int a(int[] array, int size, int value) {
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

    static int a(long[] array, int size, long value) {
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
