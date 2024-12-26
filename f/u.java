package f;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f۴۲۲۲a = Charset.forName("UTF-8");

    public static void a(long size, long offset, long byteCount) {
        if ((offset | byteCount) < 0 || offset > size || size - offset < byteCount) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(size), Long.valueOf(offset), Long.valueOf(byteCount)));
        }
    }

    public static short a(short s) {
        int i = 65535 & s;
        return (short) (((65280 & i) >>> 8) | ((i & 255) << 8));
    }

    public static int a(int i) {
        return ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8) | ((i & 255) << 24);
    }

    public static void a(Throwable t) {
        b(t);
        throw null;
    }

    private static <T extends Throwable> void b(Throwable t) {
        throw t;
    }

    public static boolean a(byte[] a2, int aOffset, byte[] b2, int bOffset, int byteCount) {
        for (int i = 0; i < byteCount; i++) {
            if (a2[i + aOffset] != b2[i + bOffset]) {
                return false;
            }
        }
        return true;
    }
}
