package p۲۹۵e.p۲۹۶f0.p۳۰۱i;

import java.io.IOException;
import p۲۹۵e.p۲۹۶f0.Cc;
import p۳۰۵f.Cf;

/* renamed from: e.f0.i.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ce {

    /* renamed from: a, reason: contains not printable characters */
    static final Cf f۱۵۹۱۰a = Cf.m۱۷۳۶۱d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b, reason: contains not printable characters */
    private static final String[] f۱۵۹۱۱b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c, reason: contains not printable characters */
    static final String[] f۱۵۹۱۲c = new String[64];

    /* renamed from: d, reason: contains not printable characters */
    static final String[] f۱۵۹۱۳d = new String[256];

    static {
        int i = 0;
        while (true) {
            String[] strArr = f۱۵۹۱۳d;
            if (i >= strArr.length) {
                break;
            }
            strArr[i] = Cc.m۱۶۵۳۵a("%8s", Integer.toBinaryString(i)).replace(' ', '0');
            i++;
        }
        String[] strArr2 = f۱۵۹۱۲c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] prefixFlags = {1};
        strArr2[8] = "PADDED";
        for (int prefixFlag : prefixFlags) {
            f۱۵۹۱۲c[prefixFlag | 8] = f۱۵۹۱۲c[prefixFlag] + "|PADDED";
        }
        String[] strArr3 = f۱۵۹۱۲c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] frameFlags = {4, 32, 36};
        for (int frameFlag : frameFlags) {
            for (int prefixFlag2 : prefixFlags) {
                f۱۵۹۱۲c[prefixFlag2 | frameFlag] = f۱۵۹۱۲c[prefixFlag2] + '|' + f۱۵۹۱۲c[frameFlag];
                f۱۵۹۱۲c[prefixFlag2 | frameFlag | 8] = f۱۵۹۱۲c[prefixFlag2] + '|' + f۱۵۹۱۲c[frameFlag] + "|PADDED";
            }
        }
        int i2 = 0;
        while (true) {
            String[] strArr4 = f۱۵۹۱۲c;
            if (i2 < strArr4.length) {
                if (strArr4[i2] == null) {
                    strArr4[i2] = f۱۵۹۱۳d[i2];
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private Ce() {
    }

    /* renamed from: a, reason: contains not printable characters */
    static IllegalArgumentException m۱۶۷۸۴a(String message, Object... args) {
        throw new IllegalArgumentException(Cc.m۱۶۵۳۵a(message, args));
    }

    /* renamed from: b, reason: contains not printable characters */
    static IOException m۱۶۷۸۷b(String message, Object... args) {
        throw new IOException(Cc.m۱۶۵۳۵a(message, args));
    }

    /* renamed from: a, reason: contains not printable characters */
    static String m۱۶۷۸۶a(boolean inbound, int streamId, int length, byte type, byte flags) {
        String[] strArr = f۱۵۹۱۱b;
        String formattedType = type < strArr.length ? strArr[type] : Cc.m۱۶۵۳۵a("0x%02x", Byte.valueOf(type));
        String formattedFlags = m۱۶۷۸۵a(type, flags);
        Object[] objArr = new Object[5];
        objArr[0] = inbound ? "<<" : ">>";
        objArr[1] = Integer.valueOf(streamId);
        objArr[2] = Integer.valueOf(length);
        objArr[3] = formattedType;
        objArr[4] = formattedFlags;
        return Cc.m۱۶۵۳۵a("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: a, reason: contains not printable characters */
    static String m۱۶۷۸۵a(byte type, byte flags) {
        if (flags == 0) {
            return "";
        }
        if (type != 2 && type != 3) {
            if (type == 4 || type == 6) {
                return flags == 1 ? "ACK" : f۱۵۹۱۳d[flags];
            }
            if (type != 7 && type != 8) {
                String[] strArr = f۱۵۹۱۲c;
                String result = flags < strArr.length ? strArr[flags] : f۱۵۹۱۳d[flags];
                if (type == 5 && (flags & 4) != 0) {
                    return result.replace("HEADERS", "PUSH_PROMISE");
                }
                if (type == 0 && (flags & 32) != 0) {
                    return result.replace("PRIORITY", "COMPRESSED");
                }
                return result;
            }
        }
        return f۱۵۹۱۳d[flags];
    }
}
