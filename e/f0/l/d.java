package e.f0.l;

import e.f0.c;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class d implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final d f۴۰۴۰a = new d();

    private d() {
    }

    public boolean verify(String host, SSLSession session) {
        try {
            return a(host, (X509Certificate) session.getPeerCertificates()[0]);
        } catch (SSLException e2) {
            return false;
        }
    }

    public boolean a(String host, X509Certificate certificate) {
        if (c.d(host)) {
            return c(host, certificate);
        }
        return b(host, certificate);
    }

    private boolean c(String ipAddress, X509Certificate certificate) {
        List<String> altNames = a(certificate, 7);
        int size = altNames.size();
        for (int i = 0; i < size; i++) {
            if (ipAddress.equalsIgnoreCase(altNames.get(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean b(String hostname, X509Certificate certificate) {
        String hostname2 = hostname.toLowerCase(Locale.US);
        for (String altName : a(certificate, 2)) {
            if (a(hostname2, altName)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> a(X509Certificate certificate) {
        List<String> altIpaNames = a(certificate, 7);
        List<String> altDnsNames = a(certificate, 2);
        List<String> result = new ArrayList<>(altIpaNames.size() + altDnsNames.size());
        result.addAll(altIpaNames);
        result.addAll(altDnsNames);
        return result;
    }

    private static List<String> a(X509Certificate certificate, int type) {
        String altName;
        List<String> result = new ArrayList<>();
        try {
            Collection<?> subjectAltNames = certificate.getSubjectAlternativeNames();
            if (subjectAltNames == null) {
                return Collections.emptyList();
            }
            Iterator<?> it = subjectAltNames.iterator();
            while (it.hasNext()) {
                List<?> entry = (List) it.next();
                if (entry != null) {
                    if (entry.size() >= 2) {
                        Integer altNameType = (Integer) entry.get(0);
                        if (altNameType != null) {
                            if (altNameType.intValue() == type && (altName = (String) entry.get(1)) != null) {
                                result.add(altName);
                            }
                        }
                    }
                }
            }
            return result;
        } catch (CertificateParsingException e2) {
            return Collections.emptyList();
        }
    }

    public boolean a(String hostname, String pattern) {
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
        if (suffixStartIndexInHostname <= 0 || hostname.lastIndexOf(46, suffixStartIndexInHostname - 1) == -1) {
            return true;
        }
        return false;
    }
}
