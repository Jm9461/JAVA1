package a.b.g.e;

import a.b.g.g.m;
import android.util.Base64;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f۲۹۹a;

    /* renamed from: b  reason: collision with root package name */
    private final String f۳۰۰b;

    /* renamed from: c  reason: collision with root package name */
    private final String f۳۰۱c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f۳۰۲d;

    /* renamed from: e  reason: collision with root package name */
    private final int f۳۰۳e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f۳۰۴f = (this.f۲۹۹a + "-" + this.f۳۰۰b + "-" + this.f۳۰۱c);

    public a(String providerAuthority, String providerPackage, String query, List<List<byte[]>> certificates) {
        m.a(providerAuthority);
        this.f۲۹۹a = providerAuthority;
        m.a(providerPackage);
        this.f۳۰۰b = providerPackage;
        m.a(query);
        this.f۳۰۱c = query;
        m.a(certificates);
        this.f۳۰۲d = certificates;
    }

    public String d() {
        return this.f۲۹۹a;
    }

    public String e() {
        return this.f۳۰۰b;
    }

    public String f() {
        return this.f۳۰۱c;
    }

    public List<List<byte[]>> a() {
        return this.f۳۰۲d;
    }

    public int b() {
        return this.f۳۰۳e;
    }

    public String c() {
        return this.f۳۰۴f;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FontRequest {mProviderAuthority: " + this.f۲۹۹a + ", mProviderPackage: " + this.f۳۰۰b + ", mQuery: " + this.f۳۰۱c + ", mCertificates:");
        for (int i = 0; i < this.f۳۰۲d.size(); i++) {
            builder.append(" [");
            List<byte[]> set = this.f۳۰۲d.get(i);
            for (int j = 0; j < set.size(); j++) {
                builder.append(" \"");
                builder.append(Base64.encodeToString(set.get(j), 0));
                builder.append("\"");
            }
            builder.append(" ]");
        }
        builder.append("}");
        builder.append("mCertificatesArray: " + this.f۳۰۳e);
        return builder.toString();
    }
}
