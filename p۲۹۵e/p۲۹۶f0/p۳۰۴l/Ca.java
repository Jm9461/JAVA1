package p۲۹۵e.p۲۹۶f0.p۳۰۴l;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: e.f0.l.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca extends AbstractCc {

    /* renamed from: a, reason: contains not printable characters */
    private final InterfaceCe f۱۶۰۷۲a;

    public Ca(InterfaceCe trustRootIndex) {
        this.f۱۶۰۷۲a = trustRootIndex;
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۴l.AbstractCc
    /* renamed from: a, reason: contains not printable characters */
    public List<Certificate> mo۱۷۰۲۵a(List<Certificate> chain, String hostname) {
        Deque<Certificate> queue = new ArrayDeque<>(chain);
        List<Certificate> result = new ArrayList<>();
        result.add(queue.removeFirst());
        boolean foundTrustedCertificate = false;
        for (int c2 = 0; c2 < 9; c2++) {
            X509Certificate toVerify = (X509Certificate) result.get(result.size() - 1);
            X509Certificate trustedCert = this.f۱۶۰۷۲a.mo۱۷۰۳۲a(toVerify);
            if (trustedCert != null) {
                if (result.size() > 1 || !toVerify.equals(trustedCert)) {
                    result.add(trustedCert);
                }
                if (m۱۷۰۲۱a(trustedCert, trustedCert)) {
                    return result;
                }
                foundTrustedCertificate = true;
            } else {
                Iterator<Certificate> i = queue.iterator();
                while (i.hasNext()) {
                    X509Certificate signingCert = (X509Certificate) i.next();
                    if (m۱۷۰۲۱a(toVerify, signingCert)) {
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

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۷۰۲۱a(X509Certificate toVerify, X509Certificate signingCert) {
        if (!toVerify.getIssuerDN().equals(signingCert.getSubjectDN())) {
            return false;
        }
        try {
            toVerify.verify(signingCert.getPublicKey());
            return true;
        } catch (GeneralSecurityException e2) {
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
        return (other instanceof Ca) && ((Ca) other).f۱۶۰۷۲a.equals(this.f۱۶۰۷۲a);
    }
}
