package p۱۳۹e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.TlsVersion;

/* renamed from: e.d0  reason: invalid class name */
public enum EnumCd0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: c  reason: contains not printable characters */
    final String f۱۵۷۰۰c;

    private EnumCd0(String javaName) {
        this.f۱۵۷۰۰c = javaName;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p۱۳۹e.EnumCd0 m۱۸۵۸۹a(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۳۹e.EnumCd0.m۱۸۵۸۹a(java.lang.String):e.d0");
    }

    /* renamed from: a  reason: contains not printable characters */
    static List<EnumCd0> m۱۸۵۹۰a(String... tlsVersions) {
        List<TlsVersion> result = new ArrayList<>(tlsVersions.length);
        for (String tlsVersion : tlsVersions) {
            result.add(m۱۸۵۸۹a(tlsVersion));
        }
        return Collections.unmodifiableList(result);
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۸۵۹۱a() {
        return this.f۱۵۷۰۰c;
    }
}
