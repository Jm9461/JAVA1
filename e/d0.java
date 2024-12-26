package e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.TlsVersion;

public enum d0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: c  reason: collision with root package name */
    final String f۳۷۳۹c;

    private d0(String javaName) {
        this.f۳۷۳۹c = javaName;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.d0 a(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d0.a(java.lang.String):e.d0");
    }

    static List<d0> a(String... tlsVersions) {
        List<TlsVersion> result = new ArrayList<>(tlsVersions.length);
        for (String tlsVersion : tlsVersions) {
            result.add(a(tlsVersion));
        }
        return Collections.unmodifiableList(result);
    }

    public String a() {
        return this.f۳۷۳۹c;
    }
}
