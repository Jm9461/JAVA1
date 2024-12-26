package e;

import java.io.IOException;

public enum w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    QUIC("quic");
    

    /* renamed from: c  reason: collision with root package name */
    private final String f۴۱۴۲c;

    private w(String protocol) {
        this.f۴۱۴۲c = protocol;
    }

    public static w a(String protocol) {
        if (protocol.equals(HTTP_1_0.f۴۱۴۲c)) {
            return HTTP_1_0;
        }
        if (protocol.equals(HTTP_1_1.f۴۱۴۲c)) {
            return HTTP_1_1;
        }
        if (protocol.equals(HTTP_2.f۴۱۴۲c)) {
            return HTTP_2;
        }
        if (protocol.equals(SPDY_3.f۴۱۴۲c)) {
            return SPDY_3;
        }
        if (protocol.equals(QUIC.f۴۱۴۲c)) {
            return QUIC;
        }
        throw new IOException("Unexpected protocol: " + protocol);
    }

    public String toString() {
        return this.f۴۱۴۲c;
    }
}
