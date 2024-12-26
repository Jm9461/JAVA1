package p۲۹۵e;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p۲۹۵e.p۲۹۶f0.Cc;

/* renamed from: e.q, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cq {

    /* renamed from: a, reason: contains not printable characters */
    private final EnumCd0 f۱۶۱۴۲a;

    /* renamed from: b, reason: contains not printable characters */
    private final Ch f۱۶۱۴۳b;

    /* renamed from: c, reason: contains not printable characters */
    private final List<Certificate> f۱۶۱۴۴c;

    /* renamed from: d, reason: contains not printable characters */
    private final List<Certificate> f۱۶۱۴۵d;

    private Cq(EnumCd0 tlsVersion, Ch cipherSuite, List<Certificate> peerCertificates, List<Certificate> localCertificates) {
        this.f۱۶۱۴۲a = tlsVersion;
        this.f۱۶۱۴۳b = cipherSuite;
        this.f۱۶۱۴۴c = peerCertificates;
        this.f۱۶۱۴۵d = localCertificates;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cq m۱۷۱۱۴a(SSLSession session) {
        Certificate[] peerCertificates;
        List<Certificate> peerCertificatesList;
        List<Certificate> localCertificatesList;
        String cipherSuiteString = session.getCipherSuite();
        if (cipherSuiteString == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        Ch cipherSuite = Ch.m۱۷۰۴۱a(cipherSuiteString);
        String tlsVersionString = session.getProtocol();
        if (tlsVersionString == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        EnumCd0 tlsVersion = EnumCd0.m۱۶۵۱۰a(tlsVersionString);
        try {
            peerCertificates = session.getPeerCertificates();
        } catch (SSLPeerUnverifiedException e2) {
            peerCertificates = null;
        }
        if (peerCertificates != null) {
            peerCertificatesList = Cc.m۱۶۵۳۹a(peerCertificates);
        } else {
            peerCertificatesList = Collections.emptyList();
        }
        Certificate[] localCertificates = session.getLocalCertificates();
        if (localCertificates != null) {
            localCertificatesList = Cc.m۱۶۵۳۹a(localCertificates);
        } else {
            localCertificatesList = Collections.emptyList();
        }
        return new Cq(tlsVersion, cipherSuite, peerCertificatesList, localCertificatesList);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cq m۱۷۱۱۳a(EnumCd0 tlsVersion, Ch cipherSuite, List<Certificate> peerCertificates, List<Certificate> localCertificates) {
        if (tlsVersion == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        if (cipherSuite == null) {
            throw new NullPointerException("cipherSuite == null");
        }
        return new Cq(tlsVersion, cipherSuite, Cc.m۱۶۵۳۸a(peerCertificates), Cc.m۱۶۵۳۸a(localCertificates));
    }

    /* renamed from: d, reason: contains not printable characters */
    public EnumCd0 m۱۷۱۱۸d() {
        return this.f۱۶۱۴۲a;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ch m۱۷۱۱۵a() {
        return this.f۱۶۱۴۳b;
    }

    /* renamed from: c, reason: contains not printable characters */
    public List<Certificate> m۱۷۱۱۷c() {
        return this.f۱۶۱۴۴c;
    }

    /* renamed from: b, reason: contains not printable characters */
    public List<Certificate> m۱۷۱۱۶b() {
        return this.f۱۶۱۴۵d;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Cq)) {
            return false;
        }
        Cq that = (Cq) other;
        return this.f۱۶۱۴۲a.equals(that.f۱۶۱۴۲a) && this.f۱۶۱۴۳b.equals(that.f۱۶۱۴۳b) && this.f۱۶۱۴۴c.equals(that.f۱۶۱۴۴c) && this.f۱۶۱۴۵d.equals(that.f۱۶۱۴۵d);
    }

    public int hashCode() {
        int result = (17 * 31) + this.f۱۶۱۴۲a.hashCode();
        return (((((result * 31) + this.f۱۶۱۴۳b.hashCode()) * 31) + this.f۱۶۱۴۴c.hashCode()) * 31) + this.f۱۶۱۴۵d.hashCode();
    }
}
