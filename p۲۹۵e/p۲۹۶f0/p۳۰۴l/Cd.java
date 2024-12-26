package p۲۹۵e.p۲۹۶f0.p۳۰۴l;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p۲۹۵e.p۲۹۶f0.Cc;

/* renamed from: e.f0.l.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cd implements HostnameVerifier {

    /* renamed from: a, reason: contains not printable characters */
    public static final Cd f۱۶۰۷۴a = new Cd();

    private Cd() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        try {
            Certificate[] certificates = session.getPeerCertificates();
            return m۱۷۰۳۱a(host, (X509Certificate) certificates[0]);
        } catch (SSLException e2) {
            return false;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۷۰۳۱a(String host, X509Certificate certificate) {
        if (Cc.m۱۶۵۵۷d(host)) {
            return m۱۷۰۲۹c(host, certificate);
        }
        return m۱۷۰۲۸b(host, certificate);
    }

    /* renamed from: c, reason: contains not printable characters */
    private boolean m۱۷۰۲۹c(String ipAddress, X509Certificate certificate) {
        List<String> altNames = m۱۷۰۲۷a(certificate, 7);
        int size = altNames.size();
        for (int i = 0; i < size; i++) {
            if (ipAddress.equalsIgnoreCase(altNames.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۷۰۲۸b(String hostname, X509Certificate certificate) {
        String hostname2 = hostname.toLowerCase(Locale.US);
        List<String> altNames = m۱۷۰۲۷a(certificate, 2);
        for (String altName : altNames) {
            if (m۱۷۰۳۰a(hostname2, altName)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static List<String> m۱۷۰۲۶a(X509Certificate certificate) {
        List<String> altIpaNames = m۱۷۰۲۷a(certificate, 7);
        List<String> altDnsNames = m۱۷۰۲۷a(certificate, 2);
        List<String> result = new ArrayList<>(altIpaNames.size() + altDnsNames.size());
        result.addAll(altIpaNames);
        result.addAll(altDnsNames);
        return result;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static List<String> m۱۷۰۲۷a(X509Certificate certificate, int type) {
        Integer altNameType;
        String altName;
        List<String> result = new ArrayList<>();
        try {
            Collection<?> subjectAltNames = certificate.getSubjectAlternativeNames();
            if (subjectAltNames == null) {
                return Collections.emptyList();
            }
            for (Object subjectAltName : subjectAltNames) {
                List<?> entry = (List) subjectAltName;
                if (entry != null && entry.size() >= 2 && (altNameType = (Integer) entry.get(0)) != null && altNameType.intValue() == type && (altName = (String) entry.get(1)) != null) {
                    result.add(altName);
                }
            }
            return result;
        } catch (CertificateParsingException e2) {
            return Collections.emptyList();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۷۰۳۰a(String hostname, String pattern) {
        if (hostname == null || hostname.length() == 0 || hostname.startsWith(".") || hostname.endsWith("..") || pattern == null || pattern.length() == 0 || pattern.startsWith(".") || pattern.endsWith("..")) {
            return false;
        }
        if (!hostname.endsWith(".")) {
            hostname = hostname + '.';
        }
        if (!pattern.endsWith(".")) {
            pattern = pattern + '.';
        }
        String pattern2 = pattern.toLowerCase(Locale.US);
        if (!pattern2.contains("*")) {
            return hostname.equals(pattern2);
        }
        if (!pattern2.startsWith("*.") || pattern2.indexOf(42, 1) != -1 || hostname.length() < pattern2.length() || "*.".equals(pattern2)) {
            return false;
        }
        String suffix = pattern2.substring(1);
        if (!hostname.endsWith(suffix)) {
            return false;
        }
        int suffixStartIndexInHostname = hostname.length() - suffix.length();
        return suffixStartIndexInHostname <= 0 || hostname.lastIndexOf(46, suffixStartIndexInHostname + (-1)) == -1;
    }
}
