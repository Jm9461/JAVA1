package e.f0.l;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Map<X500Principal, Set<X509Certificate>> f۴۰۳۹a = new LinkedHashMap();

    public b(X509Certificate... caCerts) {
        for (X509Certificate caCert : caCerts) {
            X500Principal subject = caCert.getSubjectX500Principal();
            Set<X509Certificate> subjectCaCerts = this.f۴۰۳۹a.get(subject);
            if (subjectCaCerts == null) {
                subjectCaCerts = new LinkedHashSet(1);
                this.f۴۰۳۹a.put(subject, subjectCaCerts);
            }
            subjectCaCerts.add(caCert);
        }
    }

    @Override // e.f0.l.e
    public X509Certificate a(X509Certificate cert) {
        Set<X509Certificate> subjectCaCerts = this.f۴۰۳۹a.get(cert.getIssuerX500Principal());
        if (subjectCaCerts == null) {
            return null;
        }
        for (X509Certificate caCert : subjectCaCerts) {
            try {
                cert.verify(caCert.getPublicKey());
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
        if (!(other instanceof b) || !((b) other).f۴۰۳۹a.equals(this.f۴۰۳۹a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f۴۰۳۹a.hashCode();
    }
}
