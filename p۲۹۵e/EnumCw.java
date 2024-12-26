package p۲۹۵e;

import java.io.IOException;

/* renamed from: e.w, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public enum EnumCw {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    QUIC("quic");


    /* renamed from: c, reason: contains not printable characters */
    private final String f۱۶۲۳۳c;

    EnumCw(String protocol) {
        this.f۱۶۲۳۳c = protocol;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static EnumCw m۱۷۲۳۰a(String protocol) {
        if (protocol.equals(HTTP_1_0.f۱۶۲۳۳c)) {
            return HTTP_1_0;
        }
        if (protocol.equals(HTTP_1_1.f۱۶۲۳۳c)) {
            return HTTP_1_1;
        }
        if (protocol.equals(HTTP_2.f۱۶۲۳۳c)) {
            return HTTP_2;
        }
        if (protocol.equals(SPDY_3.f۱۶۲۳۳c)) {
            return SPDY_3;
        }
        if (protocol.equals(QUIC.f۱۶۲۳۳c)) {
            return QUIC;
        }
        throw new IOException("Unexpected protocol: " + protocol);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f۱۶۲۳۳c;
    }
}
