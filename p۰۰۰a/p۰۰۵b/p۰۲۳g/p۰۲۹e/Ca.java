package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e;

import android.util.Base64;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cm;

/* renamed from: a.b.g.e.a  reason: invalid class name */
public final class Ca {

    /* renamed from: a  reason: contains not printable characters */
    private final String f۸۶۶۲a;

    /* renamed from: b  reason: contains not printable characters */
    private final String f۸۶۶۳b;

    /* renamed from: c  reason: contains not printable characters */
    private final String f۸۶۶۴c;

    /* renamed from: d  reason: contains not printable characters */
    private final List<List<byte[]>> f۸۶۶۵d;

    /* renamed from: e  reason: contains not printable characters */
    private final int f۸۶۶۶e = 0;

    /* renamed from: f  reason: contains not printable characters */
    private final String f۸۶۶۷f = (this.f۸۶۶۲a + "-" + this.f۸۶۶۳b + "-" + this.f۸۶۶۴c);

    public Ca(String providerAuthority, String providerPackage, String query, List<List<byte[]>> certificates) {
        Cm.m۱۰۶۴۲a(providerAuthority);
        this.f۸۶۶۲a = providerAuthority;
        Cm.m۱۰۶۴۲a(providerPackage);
        this.f۸۶۶۳b = providerPackage;
        Cm.m۱۰۶۴۲a(query);
        this.f۸۶۶۴c = query;
        Cm.m۱۰۶۴۲a(certificates);
        this.f۸۶۶۵d = certificates;
    }

    /* renamed from: d  reason: contains not printable characters */
    public String m۱۰۵۰۱d() {
        return this.f۸۶۶۲a;
    }

    /* renamed from: e  reason: contains not printable characters */
    public String m۱۰۵۰۲e() {
        return this.f۸۶۶۳b;
    }

    /* renamed from: f  reason: contains not printable characters */
    public String m۱۰۵۰۳f() {
        return this.f۸۶۶۴c;
    }

    /* renamed from: a  reason: contains not printable characters */
    public List<List<byte[]>> m۱۰۴۹۸a() {
        return this.f۸۶۶۵d;
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۰۴۹۹b() {
        return this.f۸۶۶۶e;
    }

    /* renamed from: c  reason: contains not printable characters */
    public String m۱۰۵۰۰c() {
        return this.f۸۶۶۷f;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FontRequest {mProviderAuthority: " + this.f۸۶۶۲a + ", mProviderPackage: " + this.f۸۶۶۳b + ", mQuery: " + this.f۸۶۶۴c + ", mCertificates:");
        for (int i = 0; i < this.f۸۶۶۵d.size(); i++) {
            builder.append(" [");
            List<byte[]> set = this.f۸۶۶۵d.get(i);
            for (int j = 0; j < set.size(); j++) {
                builder.append(" \"");
                builder.append(Base64.encodeToString(set.get(j), 0));
                builder.append("\"");
            }
            builder.append(" ]");
        }
        builder.append("}");
        builder.append("mCertificatesArray: " + this.f۸۶۶۶e);
        return builder.toString();
    }
}
