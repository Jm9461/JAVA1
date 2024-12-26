package p۲۹۵e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.TlsVersion;

/* renamed from: e.d0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public enum EnumCd0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* renamed from: c, reason: contains not printable characters */
    final String f۱۵۷۰۰c;

    EnumCd0(String javaName) {
        this.f۱۵۷۰۰c = javaName;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: a, reason: contains not printable characters */
    public static EnumCd0 m۱۶۵۱۰a(String javaName) {
        char c2;
        int hashCode = javaName.hashCode();
        if (hashCode == 79201641) {
            if (javaName.equals("SSLv3")) {
                c2 = 4;
            }
            c2 = 65535;
        } else if (hashCode != 79923350) {
            switch (hashCode) {
                case -503070503:
                    if (javaName.equals("TLSv1.1")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -503070502:
                    if (javaName.equals("TLSv1.2")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -503070501:
                    if (javaName.equals("TLSv1.3")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
        } else {
            if (javaName.equals("TLSv1")) {
                c2 = 3;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            return TLS_1_3;
        }
        if (c2 == 1) {
            return TLS_1_2;
        }
        if (c2 == 2) {
            return TLS_1_1;
        }
        if (c2 == 3) {
            return TLS_1_0;
        }
        if (c2 == 4) {
            return SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
    }

    /* renamed from: a, reason: contains not printable characters */
    static List<EnumCd0> m۱۶۵۱۱a(String... tlsVersions) {
        List<TlsVersion> result = new ArrayList<>(tlsVersions.length);
        for (String tlsVersion : tlsVersions) {
            result.add(m۱۶۵۱۰a(tlsVersion));
        }
        return Collections.unmodifiableList(result);
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۶۵۱۲a() {
        return this.f۱۵۷۰۰c;
    }
}
