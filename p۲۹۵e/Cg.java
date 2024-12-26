package p۲۹۵e;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p۲۹۵e.p۲۹۶f0.Cc;
import p۲۹۵e.p۲۹۶f0.p۳۰۴l.AbstractCc;
import p۳۰۵f.Cf;

/* renamed from: e.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cg {

    /* renamed from: c, reason: contains not printable characters */
    public static final Cg f۱۶۰۷۵c = new a().m۱۷۰۳۹a();

    /* renamed from: a, reason: contains not printable characters */
    private final Set<b> f۱۶۰۷۶a;

    /* renamed from: b, reason: contains not printable characters */
    private final AbstractCc f۱۶۰۷۷b;

    Cg(Set<b> set, AbstractCc certificateChainCleaner) {
        this.f۱۶۰۷۶a = set;
        this.f۱۶۰۷۷b = certificateChainCleaner;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof Cg) && Cc.m۱۶۵۴۶a(this.f۱۶۰۷۷b, ((Cg) other).f۱۶۰۷۷b) && this.f۱۶۰۷۶a.equals(((Cg) other).f۱۶۰۷۶a);
    }

    public int hashCode() {
        AbstractCc abstractCc = this.f۱۶۰۷۷b;
        int result = abstractCc != null ? abstractCc.hashCode() : 0;
        return (result * 31) + this.f۱۶۰۷۶a.hashCode();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۷۰۳۸a(String hostname, List<Certificate> peerCertificates) {
        List<b> list = m۱۷۰۳۷a(hostname);
        if (list.isEmpty()) {
            return;
        }
        AbstractCc abstractCc = this.f۱۶۰۷۷b;
        if (abstractCc != null) {
            peerCertificates = abstractCc.mo۱۷۰۲۵a(peerCertificates, hostname);
        }
        int certsSize = peerCertificates.size();
        for (int c2 = 0; c2 < certsSize; c2++) {
            X509Certificate x509Certificate = (X509Certificate) peerCertificates.get(c2);
            Cf sha1 = null;
            Cf sha256 = null;
            int pinsSize = list.size();
            for (int p = 0; p < pinsSize; p++) {
                b pin = list.get(p);
                if (pin.f۱۶۰۸۱c.equals("sha256/")) {
                    if (sha256 == null) {
                        sha256 = m۱۷۰۳۵b(x509Certificate);
                    }
                    if (pin.f۱۶۰۸۲d.equals(sha256)) {
                        return;
                    }
                } else if (pin.f۱۶۰۸۱c.equals("sha1/")) {
                    if (sha1 == null) {
                        sha1 = m۱۷۰۳۳a(x509Certificate);
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
        for (int c3 = 0; c3 < certsSize2; c3++) {
            X509Certificate x509Certificate2 = (X509Certificate) peerCertificates.get(c3);
            message.append("\n    ");
            message.append(m۱۷۰۳۴a((Certificate) x509Certificate2));
            message.append(": ");
            message.append(x509Certificate2.getSubjectDN().getName());
        }
        message.append("\n  Pinned certificates for ");
        message.append(hostname);
        message.append(":");
        int pinsSize2 = list.size();
        for (int p2 = 0; p2 < pinsSize2; p2++) {
            b pin2 = list.get(p2);
            message.append("\n    ");
            message.append(pin2);
        }
        throw new SSLPeerUnverifiedException(message.toString());
    }

    /* renamed from: a, reason: contains not printable characters */
    List<b> m۱۷۰۳۷a(String hostname) {
        List<b> emptyList = Collections.emptyList();
        for (b pin : this.f۱۶۰۷۶a) {
            if (pin.m۱۷۰۴۰a(hostname)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                emptyList.add(pin);
            }
        }
        return emptyList;
    }

    /* renamed from: a, reason: contains not printable characters */
    Cg m۱۷۰۳۶a(AbstractCc certificateChainCleaner) {
        if (Cc.m۱۶۵۴۶a(this.f۱۶۰۷۷b, certificateChainCleaner)) {
            return this;
        }
        return new Cg(this.f۱۶۰۷۶a, certificateChainCleaner);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۷۰۳۴a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + m۱۷۰۳۵b((X509Certificate) certificate).mo۱۷۴۶۳a();
    }

    /* renamed from: a, reason: contains not printable characters */
    static Cf m۱۷۰۳۳a(X509Certificate x509Certificate) {
        return Cf.m۱۷۳۵۸a(x509Certificate.getPublicKey().getEncoded()).mo۱۷۴۶۹d();
    }

    /* renamed from: b, reason: contains not printable characters */
    static Cf m۱۷۰۳۵b(X509Certificate x509Certificate) {
        return Cf.m۱۷۳۵۸a(x509Certificate.getPublicKey().getEncoded()).mo۱۷۴۷۰e();
    }

    /* renamed from: e.g$b */
    static final class b {

        /* renamed from: a, reason: contains not printable characters */
        final String f۱۶۰۷۹a;

        /* renamed from: b, reason: contains not printable characters */
        final String f۱۶۰۸۰b;

        /* renamed from: c, reason: contains not printable characters */
        final String f۱۶۰۸۱c;

        /* renamed from: d, reason: contains not printable characters */
        final Cf f۱۶۰۸۲d;

        /* renamed from: a, reason: contains not printable characters */
        boolean m۱۷۰۴۰a(String hostname) {
            if (this.f۱۶۰۷۹a.startsWith("*.")) {
                int firstDot = hostname.indexOf(46);
                if ((hostname.length() - firstDot) - 1 == this.f۱۶۰۸۰b.length()) {
                    String str = this.f۱۶۰۸۰b;
                    if (hostname.regionMatches(false, firstDot + 1, str, 0, str.length())) {
                        return true;
                    }
                }
                return false;
            }
            return hostname.equals(this.f۱۶۰۸۰b);
        }

        public boolean equals(Object other) {
            return (other instanceof b) && this.f۱۶۰۷۹a.equals(((b) other).f۱۶۰۷۹a) && this.f۱۶۰۸۱c.equals(((b) other).f۱۶۰۸۱c) && this.f۱۶۰۸۲d.equals(((b) other).f۱۶۰۸۲d);
        }

        public int hashCode() {
            int result = (17 * 31) + this.f۱۶۰۷۹a.hashCode();
            return (((result * 31) + this.f۱۶۰۸۱c.hashCode()) * 31) + this.f۱۶۰۸۲d.hashCode();
        }

        public String toString() {
            return this.f۱۶۰۸۱c + this.f۱۶۰۸۲d.mo۱۷۴۶۳a();
        }
    }

    /* renamed from: e.g$a */
    public static final class a {

        /* renamed from: a, reason: contains not printable characters */
        private final List<b> f۱۶۰۷۸a = new ArrayList();

        /* renamed from: a, reason: contains not printable characters */
        public Cg m۱۷۰۳۹a() {
            return new Cg(new LinkedHashSet(this.f۱۶۰۷۸a), null);
        }
    }
}
