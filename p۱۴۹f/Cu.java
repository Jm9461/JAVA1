package p۱۴۹f;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
/* renamed from: f.u  reason: invalid class name */
public final class Cu {

    /* renamed from: a  reason: contains not printable characters */
    public static final Charset f۱۶۳۱۷a = Charset.forName("UTF-8");

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۹۵۶۹a(long size, long offset, long byteCount) {
        if ((offset | byteCount) < 0 || offset > size || size - offset < byteCount) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(size), Long.valueOf(offset), Long.valueOf(byteCount)));
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static short m۱۹۵۶۸a(short s) {
        int i = 65535 & s;
        return (short) (((65280 & i) >>> 8) | ((i & 255) << 8));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۹۵۶۷a(int i) {
        return ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8) | ((i & 255) << 24);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۹۵۷۰a(Throwable t) {
        m۱۹۵۷۲b(t);
        throw null;
    }

    /* renamed from: b  reason: contains not printable characters */
    private static <T extends Throwable> void m۱۹۵۷۲b(Throwable t) {
        throw t;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۹۵۷۱a(byte[] a, int aOffset, byte[] b, int bOffset, int byteCount) {
        for (int i = 0; i < byteCount; i++) {
            if (a[i + aOffset] != b[i + bOffset]) {
                return false;
            }
        }
        return true;
    }
}
