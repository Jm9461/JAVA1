package p۱۳۹e.p۱۴۰f0.p۱۴۸l;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: e.f0.l.a  reason: invalid class name */
public final class Ca extends AbstractCc {

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCe f۱۶۰۷۲a;

    public Ca(AbstractCe trustRootIndex) {
        this.f۱۶۰۷۲a = trustRootIndex;
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۸l.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public List<Certificate> m۱۹۱۰۱a(List<Certificate> chain, String hostname) {
        Deque<Certificate> queue = new ArrayDeque<>(chain);
        List<Certificate> result = new ArrayList<>();
        result.add(queue.removeFirst());
        boolean foundTrustedCertificate = false;
        for (int c = 0; c < 9; c++) {
            X509Certificate toVerify = (X509Certificate) result.get(result.size() - 1);
            X509Certificate trustedCert = this.f۱۶۰۷۲a.m۱۹۱۱۱a(toVerify);
            if (trustedCert != null) {
                if (result.size() > 1 || !toVerify.equals(trustedCert)) {
                    result.add(trustedCert);
                }
                if (m۱۹۱۰۰a(trustedCert, trustedCert)) {
                    return result;
                }
                foundTrustedCertificate = true;
            } else {
                Iterator<Certificate> i = queue.iterator();
                while (i.hasNext()) {
                    X509Certificate signingCert = (X509Certificate) i.next();
                    if (m۱۹۱۰۰a(toVerify, signingCert)) {
                        i.remove();
                        result.add(signingCert);
                    }
                }
                if (foundTrustedCertificate) {
                    return result;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + toVerify);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + result);
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۹۱۰۰a(X509Certificate toVerify, X509Certificate signingCert) {
        if (!toVerify.getIssuerDN().equals(signingCert.getSubjectDN())) {
            return false;
        }
        try {
            toVerify.verify(signingCert.getPublicKey());
            return true;
        } catch (GeneralSecurityException e) {
            return false;
        }
    }

    public int hashCode() {
        return this.f۱۶۰۷۲a.hashCode();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Ca) || !((Ca) other).f۱۶۰۷۲a.equals(this.f۱۶۰۷۲a)) {
            return false;
        }
        return true;
    }
}
