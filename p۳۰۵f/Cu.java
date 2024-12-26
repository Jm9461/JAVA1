package p۳۰۵f;

import java.nio.charset.Charset;

/* renamed from: f.u, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cu {

    /* renamed from: a, reason: contains not printable characters */
    public static final Charset f۱۶۳۱۷a = Charset.forName("UTF-8");

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۷۴۹۲a(long size, long offset, long byteCount) {
        if ((offset | byteCount) < 0 || offset > size || size - offset < byteCount) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(size), Long.valueOf(offset), Long.valueOf(byteCount)));
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static short m۱۷۴۹۱a(short s) {
        int i = 65535 & s;
        int reversed = ((65280 & i) >>> 8) | ((i & 255) << 8);
        return (short) reversed;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۷۴۹۰a(int i) {
        return (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8) | ((i & 255) << 24);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۷۴۹۳a(Throwable t) {
        m۱۷۴۹۵b(t);
        throw null;
    }

    /* renamed from: b, reason: contains not printable characters */
    private static <T extends Throwable> void m۱۷۴۹۵b(Throwable t) {
        throw t;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۷۴۹۴a(byte[] a2, int aOffset, byte[] b2, int bOffset, int byteCount) {
        for (int i = 0; i < byteCount; i++) {
            if (a2[i + aOffset] != b2[i + bOffset]) {
                return false;
            }
        }
        return true;
    }
}
