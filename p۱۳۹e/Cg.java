package p۱۳۹e;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.CertificatePinner;
import p۱۳۹e.p۱۴۰f0.Cc;
import p۱۳۹e.p۱۴۰f0.p۱۴۸l.AbstractCc;
import p۱۴۹f.Cf;

/* renamed from: e.g  reason: invalid class name */
public final class Cg {

    /* renamed from: c  reason: contains not printable characters */
    public static final Cg f۱۶۰۷۵c = new Ca().m۱۹۱۱۸a();

    /* renamed from: a  reason: contains not printable characters */
    private final Set<Cb> f۱۶۰۷۶a;

    /* renamed from: b  reason: contains not printable characters */
    private final AbstractCc f۱۶۰۷۷b;

    Cg(Set<Cb> set, AbstractCc certificateChainCleaner) {
        this.f۱۶۰۷۶a = set;
        this.f۱۶۰۷۷b = certificateChainCleaner;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Cg) || !Cc.m۱۸۶۲۵a(this.f۱۶۰۷۷b, ((Cg) other).f۱۶۰۷۷b) || !this.f۱۶۰۷۶a.equals(((Cg) other).f۱۶۰۷۶a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        AbstractCc cVar = this.f۱۶۰۷۷b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f۱۶۰۷۶a.hashCode();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۱۱۷a(String hostname, List<Certificate> peerCertificates) {
        List<CertificatePinner.Pin> pins = m۱۹۱۱۶a(hostname);
        if (!pins.isEmpty()) {
            AbstractCc cVar = this.f۱۶۰۷۷b;
            if (cVar != null) {
                peerCertificates = cVar.m۱۹۱۰۴a(peerCertificates, hostname);
            }
            int certsSize = peerCertificates.size();
            for (int c = 0; c < certsSize; c++) {
                X509Certificate x509Certificate = (X509Certificate) peerCertificates.get(c);
                Cf sha1 = null;
                Cf sha256 = null;
                int pinsSize = pins.size();
                for (int p = 0; p < pinsSize; p++) {
                    Cb pin = (Cb) pins.get(p);
                    if (pin.f۱۶۰۸۱c.equals("sha256/")) {
                        if (sha256 == null) {
                            sha256 = m۱۹۱۱۴b(x509Certificate);
                        }
                        if (pin.f۱۶۰۸۲d.equals(sha256)) {
                            return;
                        }
                    } else if (pin.f۱۶۰۸۱c.equals("sha1/")) {
                        if (sha1 == null) {
                            sha1 = m۱۹۱۱۲a(x509Certificate);
                        }
                        if (pin.f۱۶۰۸۲d.equals(sha1)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.f۱۶۰۸۱c);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            StringBuilder message = sb.append("\n  Peer certificate chain:");
            int certsSize2 = peerCertificates.size();
            for (int c2 = 0; c2 < certsSize2; c2++) {
                X509Certificate x509Certificate2 = (X509Certificate) peerCertificates.get(c2);
                message.append("\n    ");
                message.append(m۱۹۱۱۳a((Certificate) x509Certificate2));
                message.append(": ");
                message.append(x509Certificate2.getSubjectDN().getName());
            }
            message.append("\n  Pinned certificates for ");
            message.append(hostname);
            message.append(":");
            int pinsSize2 = pins.size();
            for (int p2 = 0; p2 < pinsSize2; p2++) {
                message.append("\n    ");
                message.append((Cb) pins.get(p2));
            }
            throw new SSLPeerUnverifiedException(message.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public List<Cb> m۱۹۱۱۶a(String hostname) {
        List<CertificatePinner.Pin> result = Collections.emptyList();
        for (Cb pin : this.f۱۶۰۷۶a) {
            if (pin.m۱۹۱۱۹a(hostname)) {
                if (result.isEmpty()) {
                    result = new ArrayList<>();
                }
                result.add(pin);
            }
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cg m۱۹۱۱۵a(AbstractCc certificateChainCleaner) {
        if (Cc.m۱۸۶۲۵a(this.f۱۶۰۷۷b, certificateChainCleaner)) {
            return this;
        }
        return new Cg(this.f۱۶۰۷۶a, certificateChainCleaner);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۹۱۱۳a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + m۱۹۱۱۴b((X509Certificate) certificate).m۱۹۴۴۲a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: a  reason: contains not printable characters */
    static Cf m۱۹۱۱۲a(X509Certificate x509Certificate) {
        return Cf.m۱۹۴۳۵a(x509Certificate.getPublicKey().getEncoded()).m۱۹۴۴۹d();
    }

    /* renamed from: b  reason: contains not printable characters */
    static Cf m۱۹۱۱۴b(X509Certificate x509Certificate) {
        return Cf.m۱۹۴۳۵a(x509Certificate.getPublicKey().getEncoded()).m۱۹۴۵۰e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.g$b  reason: invalid class name */
    public static final class Cb {

        /* renamed from: a  reason: contains not printable characters */
        final String f۱۶۰۷۹a;

        /* renamed from: b  reason: contains not printable characters */
        final String f۱۶۰۸۰b;

        /* renamed from: c  reason: contains not printable characters */
        final String f۱۶۰۸۱c;

        /* renamed from: d  reason: contains not printable characters */
        final Cf f۱۶۰۸۲d;

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۹۱۱۹a(String hostname) {
            if (!this.f۱۶۰۷۹a.startsWith("*.")) {
                return hostname.equals(this.f۱۶۰۸۰b);
            }
            int firstDot = hostname.indexOf(46);
            if ((hostname.length() - firstDot) - 1 == this.f۱۶۰۸۰b.length()) {
                String str = this.f۱۶۰۸۰b;
                if (hostname.regionMatches(false, firstDot + 1, str, 0, str.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object other) {
            return (other instanceof Cb) && this.f۱۶۰۷۹a.equals(((Cb) other).f۱۶۰۷۹a) && this.f۱۶۰۸۱c.equals(((Cb) other).f۱۶۰۸۱c) && this.f۱۶۰۸۲d.equals(((Cb) other).f۱۶۰۸۲d);
        }

        public int hashCode() {
            return (((((17 * 31) + this.f۱۶۰۷۹a.hashCode()) * 31) + this.f۱۶۰۸۱c.hashCode()) * 31) + this.f۱۶۰۸۲d.hashCode();
        }

        public String toString() {
            return this.f۱۶۰۸۱c + this.f۱۶۰۸۲d.m۱۹۴۴۲a();
        }
    }

    /* renamed from: e.g$a  reason: invalid class name */
    public static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        private final List<Cb> f۱۶۰۷۸a = new ArrayList();

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۹۱۱۸a() {
            return new Cg(new LinkedHashSet(this.f۱۶۰۷۸a), null);
        }
    }
}
