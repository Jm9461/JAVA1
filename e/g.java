package e;

import e.f0.l.c;
import f.f;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.CertificatePinner;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final g f۴۰۴۱c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f۴۰۴۲a;

    /* renamed from: b  reason: collision with root package name */
    private final c f۴۰۴۳b;

    g(Set<b> set, c certificateChainCleaner) {
        this.f۴۰۴۲a = set;
        this.f۴۰۴۳b = certificateChainCleaner;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof g) || !e.f0.c.a(this.f۴۰۴۳b, ((g) other).f۴۰۴۳b) || !this.f۴۰۴۲a.equals(((g) other).f۴۰۴۲a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        c cVar = this.f۴۰۴۳b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f۴۰۴۲a.hashCode();
    }

    public void a(String hostname, List<Certificate> peerCertificates) {
        List<CertificatePinner.Pin> pins = a(hostname);
        if (!pins.isEmpty()) {
            c cVar = this.f۴۰۴۳b;
            if (cVar != null) {
                peerCertificates = cVar.a(peerCertificates, hostname);
            }
            int certsSize = peerCertificates.size();
            for (int c2 = 0; c2 < certsSize; c2++) {
                X509Certificate x509Certificate = (X509Certificate) peerCertificates.get(c2);
                f sha1 = null;
                f sha256 = null;
                int pinsSize = pins.size();
                for (int p = 0; p < pinsSize; p++) {
                    b pin = (b) pins.get(p);
                    if (pin.f۴۰۴۷c.equals("sha256/")) {
                        if (sha256 == null) {
                            sha256 = b(x509Certificate);
                        }
                        if (pin.f۴۰۴۸d.equals(sha256)) {
                            return;
                        }
                    } else if (pin.f۴۰۴۷c.equals("sha1/")) {
                        if (sha1 == null) {
                            sha1 = a(x509Certificate);
                        }
                        if (pin.f۴۰۴۸d.equals(sha1)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.f۴۰۴۷c);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            StringBuilder message = sb.append("\n  Peer certificate chain:");
            int certsSize2 = peerCertificates.size();
            for (int c3 = 0; c3 < certsSize2; c3++) {
                X509Certificate x509Certificate2 = (X509Certificate) peerCertificates.get(c3);
                message.append("\n    ");
                message.append(a((Certificate) x509Certificate2));
                message.append(": ");
                message.append(x509Certificate2.getSubjectDN().getName());
            }
            message.append("\n  Pinned certificates for ");
            message.append(hostname);
            message.append(":");
            int pinsSize2 = pins.size();
            for (int p2 = 0; p2 < pinsSize2; p2++) {
                message.append("\n    ");
                message.append((b) pins.get(p2));
            }
            throw new SSLPeerUnverifiedException(message.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public List<b> a(String hostname) {
        List<CertificatePinner.Pin> result = Collections.emptyList();
        for (b pin : this.f۴۰۴۲a) {
            if (pin.a(hostname)) {
                if (result.isEmpty()) {
                    result = new ArrayList<>();
                }
                result.add(pin);
            }
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    public g a(c certificateChainCleaner) {
        if (e.f0.c.a(this.f۴۰۴۳b, certificateChainCleaner)) {
            return this;
        }
        return new g(this.f۴۰۴۲a, certificateChainCleaner);
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + b((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static f a(X509Certificate x509Certificate) {
        return f.a(x509Certificate.getPublicKey().getEncoded()).d();
    }

    static f b(X509Certificate x509Certificate) {
        return f.a(x509Certificate.getPublicKey().getEncoded()).e();
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final String f۴۰۴۵a;

        /* renamed from: b  reason: collision with root package name */
        final String f۴۰۴۶b;

        /* renamed from: c  reason: collision with root package name */
        final String f۴۰۴۷c;

        /* renamed from: d  reason: collision with root package name */
        final f f۴۰۴۸d;

        /* access modifiers changed from: package-private */
        public boolean a(String hostname) {
            if (!this.f۴۰۴۵a.startsWith("*.")) {
                return hostname.equals(this.f۴۰۴۶b);
            }
            int firstDot = hostname.indexOf(46);
            if ((hostname.length() - firstDot) - 1 == this.f۴۰۴۶b.length()) {
                String str = this.f۴۰۴۶b;
                if (hostname.regionMatches(false, firstDot + 1, str, 0, str.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object other) {
            return (other instanceof b) && this.f۴۰۴۵a.equals(((b) other).f۴۰۴۵a) && this.f۴۰۴۷c.equals(((b) other).f۴۰۴۷c) && this.f۴۰۴۸d.equals(((b) other).f۴۰۴۸d);
        }

        public int hashCode() {
            return (((((17 * 31) + this.f۴۰۴۵a.hashCode()) * 31) + this.f۴۰۴۷c.hashCode()) * 31) + this.f۴۰۴۸d.hashCode();
        }

        public String toString() {
            return this.f۴۰۴۷c + this.f۴۰۴۸d.a();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<b> f۴۰۴۴a = new ArrayList();

        public g a() {
            return new g(new LinkedHashSet(this.f۴۰۴۴a), null);
        }
    }
}
