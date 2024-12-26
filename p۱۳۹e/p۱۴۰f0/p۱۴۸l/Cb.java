package p۱۳۹e.p۱۴۰f0.p۱۴۸l;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: e.f0.l.b  reason: invalid class name */
public final class Cb implements AbstractCe {

    /* renamed from: a  reason: contains not printable characters */
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

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۸l.AbstractCe
    /* renamed from: a  reason: contains not printable characters */
    public X509Certificate m۱۹۱۰۲a(X509Certificate cert) {
        Set<X509Certificate> subjectCaCerts = this.f۱۶۰۷۳a.get(cert.getIssuerX500Principal());
        if (subjectCaCerts == null) {
            return null;
        }
        for (X509Certificate caCert : subjectCaCerts) {
            try {
                cert.verify(caCert.getPublicKey());
                return caCert;
            } catch (Exception e) {
            }
        }
        return null;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Cb) || !((Cb) other).f۱۶۰۷۳a.equals(this.f۱۶۰۷۳a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f۱۶۰۷۳a.hashCode();
    }
}
