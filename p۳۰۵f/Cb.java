package p۳۰۵f;

import java.io.UnsupportedEncodingException;

/* renamed from: f.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cb {

    /* renamed from: a, reason: contains not printable characters */
    private static final byte[] f۱۶۲۶۷a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: a, reason: contains not printable characters */
    public static byte[] m۱۷۲۸۶a(String in) {
        int bits;
        char c2;
        int limit = in.length();
        while (limit > 0 && ((c2 = in.charAt(limit - 1)) == '=' || c2 == '\n' || c2 == '\r' || c2 == ' ' || c2 == '\t')) {
            limit--;
        }
        byte[] out = new byte[(int) ((limit * 6) / 8)];
        int outCount = 0;
        int inCount = 0;
        int word = 0;
        for (int pos = 0; pos < limit; pos++) {
            char c3 = in.charAt(pos);
            if (c3 >= 'A' && c3 <= 'Z') {
                bits = c3 - 'A';
            } else if (c3 >= 'a' && c3 <= 'z') {
                bits = c3 - 'G';
            } else if (c3 >= '0' && c3 <= '9') {
                bits = c3 + 4;
            } else if (c3 == '+' || c3 == '-') {
                bits = 62;
            } else if (c3 == '/' || c3 == '_') {
                bits = 63;
            } else {
                if (c3 != '\n' && c3 != '\r' && c3 != ' ' && c3 != '\t') {
                    return null;
                }
            }
            word = (word << 6) | ((byte) bits);
            inCount++;
            if (inCount % 4 == 0) {
                int outCount2 = outCount + 1;
                out[outCount] = (byte) (word >> 16);
                int outCount3 = outCount2 + 1;
                out[outCount2] = (byte) (word >> 8);
                out[outCount3] = (byte) word;
                outCount = outCount3 + 1;
            }
        }
        int lastWordChars = inCount % 4;
        if (lastWordChars == 1) {
            return null;
        }
        if (lastWordChars == 2) {
            out[outCount] = (byte) ((word << 12) >> 16);
            outCount++;
        } else if (lastWordChars == 3) {
            int word2 = word << 6;
            int outCount4 = outCount + 1;
            out[outCount] = (byte) (word2 >> 16);
            outCount = outCount4 + 1;
            out[outCount4] = (byte) (word2 >> 8);
        }
        if (outCount == out.length) {
            return out;
        }
        byte[] prefix = new byte[outCount];
        System.arraycopy(out, 0, prefix, 0, outCount);
        return prefix;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۷۲۸۴a(byte[] in) {
        return m۱۷۲۸۵a(in, f۱۶۲۶۷a);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static String m۱۷۲۸۵a(byte[] in, byte[] map) {
        int length = ((in.length + 2) / 3) * 4;
        byte[] out = new byte[length];
        int index = 0;
        int end = in.length - (in.length % 3);
        for (int i = 0; i < end; i += 3) {
            int index2 = index + 1;
            out[index] = map[(in[i] & 255) >> 2];
            int index3 = index2 + 1;
            out[index2] = map[((in[i] & 3) << 4) | ((in[i + 1] & 255) >> 4)];
            int index4 = index3 + 1;
            out[index3] = map[((in[i + 1] & 15) << 2) | ((in[i + 2] & 255) >> 6)];
            index = index4 + 1;
            out[index4] = map[in[i + 2] & 63];
        }
        int i2 = in.length;
        int i3 = i2 % 3;
        if (i3 == 1) {
            int index5 = index + 1;
            out[index] = map[(in[end] & 255) >> 2];
            int index6 = index5 + 1;
            out[index5] = map[(in[end] & 3) << 4];
            int index7 = index6 + 1;
            out[index6] = 61;
            int i4 = index7 + 1;
            out[index7] = 61;
        } else if (i3 == 2) {
            int index8 = index + 1;
            out[index] = map[(in[end] & 255) >> 2];
            int index9 = index8 + 1;
            out[index8] = map[((in[end] & 3) << 4) | ((in[end + 1] & 255) >> 4)];
            int index10 = index9 + 1;
            out[index9] = map[(in[end + 1] & 15) << 2];
            int i5 = index10 + 1;
            out[index10] = 61;
        }
        try {
            return new String(out, "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}
