package e.f0.i;

import e.f0.c;
import f.f;
import java.io.IOException;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final f f۳۹۰۲a = f.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f۳۹۰۳b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    static final String[] f۳۹۰۴c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    static final String[] f۳۹۰۵d = new String[256];

    static {
        int i = 0;
        while (true) {
            String[] strArr = f۳۹۰۵d;
            if (i >= strArr.length) {
                break;
            }
            strArr[i] = c.a("%8s", Integer.toBinaryString(i)).replace(' ', '0');
            i++;
        }
        String[] strArr2 = f۳۹۰۴c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] prefixFlags = {1};
        strArr2[8] = "PADDED";
        for (int prefixFlag : prefixFlags) {
            f۳۹۰۴c[prefixFlag | 8] = f۳۹۰۴c[prefixFlag] + "|PADDED";
        }
        String[] strArr3 = f۳۹۰۴c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] frameFlags = {4, 32, 36};
        for (int frameFlag : frameFlags) {
            for (int prefixFlag2 : prefixFlags) {
                f۳۹۰۴c[prefixFlag2 | frameFlag] = f۳۹۰۴c[prefixFlag2] + '|' + f۳۹۰۴c[frameFlag];
                f۳۹۰۴c[prefixFlag2 | frameFlag | 8] = f۳۹۰۴c[prefixFlag2] + '|' + f۳۹۰۴c[frameFlag] + "|PADDED";
            }
        }
        int i2 = 0;
        while (true) {
            String[] strArr4 = f۳۹۰۴c;
            if (i2 < strArr4.length) {
                if (strArr4[i2] == null) {
                    strArr4[i2] = f۳۹۰۵d[i2];
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private e() {
    }

    static IllegalArgumentException a(String message, Object... args) {
        throw new IllegalArgumentException(c.a(message, args));
    }

    static IOException b(String message, Object... args) {
        throw new IOException(c.a(message, args));
    }

    static String a(boolean inbound, int streamId, int length, byte type, byte flags) {
        String[] strArr = f۳۹۰۳b;
        String formattedType = type < strArr.length ? strArr[type] : c.a("0x%02x", Byte.valueOf(type));
        String formattedFlags = a(type, flags);
        Object[] objArr = new Object[5];
        objArr[0] = inbound ? "<<" : ">>";
        objArr[1] = Integer.valueOf(streamId);
        objArr[2] = Integer.valueOf(length);
        objArr[3] = formattedType;
        objArr[4] = formattedFlags;
        return c.a("%s 0x%08x %5d %-13s %s", objArr);
    }

    static String a(byte type, byte flags) {
        if (flags == 0) {
            return "";
        }
        if (!(type == 2 || type == 3)) {
            if (type == 4 || type == 6) {
                return flags == 1 ? "ACK" : f۳۹۰۵d[flags];
            }
            if (!(type == 7 || type == 8)) {
                String[] strArr = f۳۹۰۴c;
                String result = flags < strArr.length ? strArr[flags] : f۳۹۰۵d[flags];
                if (type == 5 && (flags & 4) != 0) {
                    return result.replace("HEADERS", "PUSH_PROMISE");
                }
                if (type != 0 || (flags & 32) == 0) {
                    return result;
                }
                return result.replace("PRIORITY", "COMPRESSED");
            }
        }
        return f۳۹۰۵d[flags];
    }
}
