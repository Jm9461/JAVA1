package p۲۹۵e.p۲۹۶f0.p۳۰۴l;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: e.f0.l.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cb implements InterfaceCe {

    /* renamed from: a, reason: contains not printable characters */
    private final Map<X500Principal, Set<X509Certificate>> f۱۶۰۷۳a = new LinkedHashMap();

    public Cb(X509Certificate... caCerts) {
        for (X509Certificate caCert : caCerts) {
            X500Principal subject = caCert.getSubjectX500Principal();
            Set<X509Certificate> subjectCaCerts = this.f۱۶۰۷۳a.get(subject);
            if (subjectCaCerts == null) {
                subjectCaCerts = new LinkedHashSet(1);
                this.f۱۶۰۷۳a.put(subject, subjectCaCerts);
            }
            subjectCaCerts.add(caCert);
        }
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۴l.InterfaceCe
    /* renamed from: a, reason: contains not printable characters */
    public X509Certificate mo۱۷۰۳۲a(X509Certificate cert) {
        X500Principal issuer = cert.getIssuerX500Principal();
        Set<X509Certificate> subjectCaCerts = this.f۱۶۰۷۳a.get(issuer);
        if (subjectCaCerts == null) {
            return null;
        }
        for (X509Certificate caCert : subjectCaCerts) {
            PublicKey publicKey = caCert.getPublicKey();
            try {
                cert.verify(publicKey);
                return caCert;
            } catch (Exception e2) {
            }
        }
        return null;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof Cb) && ((Cb) other).f۱۶۰۷۳a.equals(this.f۱۶۰۷۳a);
    }

    public int hashCode() {
        return this.f۱۶۰۷۳a.hashCode();
    }
}
