package e;

import e.f0.c;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f۴۰۹۵a;

    /* renamed from: b  reason: collision with root package name */
    private final h f۴۰۹۶b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Certificate> f۴۰۹۷c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Certificate> f۴۰۹۸d;

    private q(d0 tlsVersion, h cipherSuite, List<Certificate> peerCertificates, List<Certificate> localCertificates) {
        this.f۴۰۹۵a = tlsVersion;
        this.f۴۰۹۶b = cipherSuite;
        this.f۴۰۹۷c = peerCertificates;
        this.f۴۰۹۸d = localCertificates;
    }

    public static q a(SSLSession session) {
        Certificate[] peerCertificates;
        List<Certificate> peerCertificatesList;
        List<Certificate> localCertificatesList;
        String cipherSuiteString = session.getCipherSuite();
        if (cipherSuiteString != null) {
            h cipherSuite = h.a(cipherSuiteString);
            String tlsVersionString = session.getProtocol();
            if (tlsVersionString != null) {
                d0 tlsVersion = d0.a(tlsVersionString);
                try {
                    peerCertificates = session.getPeerCertificates();
                } catch (SSLPeerUnverifiedException e2) {
                    peerCertificates = null;
                }
                if (peerCertificates != null) {
                    peerCertificatesList = c.a(peerCertificates);
                } else {
                    peerCertificatesList = Collections.emptyList();
                }
                Certificate[] localCertificates = session.getLocalCertificates();
                if (localCertificates != null) {
                    localCertificatesList = c.a(localCertificates);
                } else {
                    localCertificatesList = Collections.emptyList();
                }
                return new q(tlsVersion, cipherSuite, peerCertificatesList, localCertificatesList);
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public static q a(d0 tlsVersion, h cipherSuite, List<Certificate> peerCertificates, List<Certificate> localCertificates) {
        if (tlsVersion == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (cipherSuite != null) {
            return new q(tlsVersion, cipherSuite, c.a(peerCertificates), c.a(localCertificates));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    public d0 d() {
        return this.f۴۰۹۵a;
    }

    public h a() {
        return this.f۴۰۹۶b;
    }

    public List<Certificate> c() {
        return this.f۴۰۹۷c;
    }

    public List<Certificate> b() {
        return this.f۴۰۹۸d;
    }

    public boolean equals(Object other) {
        if (!(other instanceof q)) {
            return false;
        }
        q that = (q) other;
        if (!this.f۴۰۹۵a.equals(that.f۴۰۹۵a) || !this.f۴۰۹۶b.equals(that.f۴۰۹۶b) || !this.f۴۰۹۷c.equals(that.f۴۰۹۷c) || !this.f۴۰۹۸d.equals(that.f۴۰۹۸d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((17 * 31) + this.f۴۰۹۵a.hashCode()) * 31) + this.f۴۰۹۶b.hashCode()) * 31) + this.f۴۰۹۷c.hashCode()) * 31) + this.f۴۰۹۸d.hashCode();
    }
}
