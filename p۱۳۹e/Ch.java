package p۱۳۹e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.CipherSuite;

/* renamed from: e.h  reason: invalid class name */
public final class Ch {

    /* renamed from: b  reason: contains not printable characters */
    static final Comparator<String> f۱۶۰۸۳b = new Ca();

    /* renamed from: c  reason: contains not printable characters */
    private static final Map<String, Ch> f۱۶۰۸۴c = new TreeMap(f۱۶۰۸۳b);

    /* renamed from: d  reason: contains not printable characters */
    public static final Ch f۱۶۰۸۵d = m۱۹۱۲۱a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: e  reason: contains not printable characters */
    public static final Ch f۱۶۰۸۶e = m۱۹۱۲۱a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: f  reason: contains not printable characters */
    public static final Ch f۱۶۰۸۷f = m۱۹۱۲۱a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: g  reason: contains not printable characters */
    public static final Ch f۱۶۰۸۸g = m۱۹۱۲۱a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: h  reason: contains not printable characters */
    public static final Ch f۱۶۰۸۹h = m۱۹۱۲۱a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: i  reason: contains not printable characters */
    public static final Ch f۱۶۰۹۰i = m۱۹۱۲۱a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: j  reason: contains not printable characters */
    public static final Ch f۱۶۰۹۱j = m۱۹۱۲۱a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: k  reason: contains not printable characters */
    public static final Ch f۱۶۰۹۲k = m۱۹۱۲۱a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: l  reason: contains not printable characters */
    public static final Ch f۱۶۰۹۳l = m۱۹۱۲۱a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: m  reason: contains not printable characters */
    public static final Ch f۱۶۰۹۴m = m۱۹۱۲۱a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: n  reason: contains not printable characters */
    public static final Ch f۱۶۰۹۵n = m۱۹۱۲۱a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: o  reason: contains not printable characters */
    public static final Ch f۱۶۰۹۶o = m۱۹۱۲۱a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: p  reason: contains not printable characters */
    public static final Ch f۱۶۰۹۷p = m۱۹۱۲۱a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: a  reason: contains not printable characters */
    final String f۱۶۰۹۸a;

    /* renamed from: e.h$a  reason: invalid class name */
    class Ca implements Comparator<String> {
        Ca() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public int compare(String a, String b) {
            int limit = Math.min(a.length(), b.length());
            for (int i = 4; i < limit; i++) {
                char charA = a.charAt(i);
                char charB = b.charAt(i);
                if (charA != charB) {
                    if (charA < charB) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
            int lengthA = a.length();
            int lengthB = b.length();
            if (lengthA == lengthB) {
                return 0;
            }
            if (lengthA < lengthB) {
                return -1;
            }
            return 1;
        }
    }

    static {
        m۱۹۱۲۱a("SSL_RSA_WITH_NULL_MD5", 1);
        m۱۹۱۲۱a("SSL_RSA_WITH_NULL_SHA", 2);
        m۱۹۱۲۱a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        m۱۹۱۲۱a("SSL_RSA_WITH_RC4_128_MD5", 4);
        m۱۹۱۲۱a("SSL_RSA_WITH_RC4_128_SHA", 5);
        m۱۹۱۲۱a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        m۱۹۱۲۱a("SSL_RSA_WITH_DES_CBC_SHA", 9);
        m۱۹۱۲۱a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        m۱۹۱۲۱a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        m۱۹۱۲۱a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        m۱۹۱۲۱a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        m۱۹۱۲۱a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        m۱۹۱۲۱a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        m۱۹۱۲۱a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        m۱۹۱۲۱a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        m۱۹۱۲۱a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        m۱۹۱۲۱a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        m۱۹۱۲۱a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        m۱۹۱۲۱a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        m۱۹۱۲۱a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        m۱۹۱۲۱a("TLS_KRB5_WITH_RC4_128_SHA", 32);
        m۱۹۱۲۱a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        m۱۹۱۲۱a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        m۱۹۱۲۱a("TLS_KRB5_WITH_RC4_128_MD5", 36);
        m۱۹۱۲۱a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        m۱۹۱۲۱a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        m۱۹۱۲۱a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        m۱۹۱۲۱a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        m۱۹۱۲۱a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        m۱۹۱۲۱a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        m۱۹۱۲۱a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        m۱۹۱۲۱a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        m۱۹۱۲۱a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        m۱۹۱۲۱a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        m۱۹۱۲۱a("TLS_RSA_WITH_NULL_SHA256", 59);
        m۱۹۱۲۱a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        m۱۹۱۲۱a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        m۱۹۱۲۱a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        m۱۹۱۲۱a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        m۱۹۱۲۱a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        m۱۹۱۲۱a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        m۱۹۱۲۱a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        m۱۹۱۲۱a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        m۱۹۱۲۱a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        m۱۹۱۲۱a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        m۱۹۱۲۱a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        m۱۹۱۲۱a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        m۱۹۱۲۱a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        m۱۹۱۲۱a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        m۱۹۱۲۱a("TLS_PSK_WITH_RC4_128_SHA", 138);
        m۱۹۱۲۱a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        m۱۹۱۲۱a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        m۱۹۱۲۱a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        m۱۹۱۲۱a("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        m۱۹۱۲۱a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m۱۹۱۲۱a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        m۱۹۱۲۱a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        m۱۹۱۲۱a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        m۱۹۱۲۱a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        m۱۹۱۲۱a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        m۱۹۱۲۱a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        m۱۹۱۲۱a("TLS_FALLBACK_SCSV", 22016);
        m۱۹۱۲۱a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        m۱۹۱۲۱a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        m۱۹۱۲۱a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        m۱۹۱۲۱a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        m۱۹۱۲۱a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        m۱۹۱۲۱a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        m۱۹۱۲۱a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        m۱۹۱۲۱a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        m۱۹۱۲۱a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        m۱۹۱۲۱a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        m۱۹۱۲۱a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        m۱۹۱۲۱a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        m۱۹۱۲۱a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        m۱۹۱۲۱a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        m۱۹۱۲۱a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        m۱۹۱۲۱a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        m۱۹۱۲۱a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        m۱۹۱۲۱a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        m۱۹۱۲۱a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        m۱۹۱۲۱a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        m۱۹۱۲۱a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        m۱۹۱۲۱a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        m۱۹۱۲۱a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        m۱۹۱۲۱a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        m۱۹۱۲۱a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        m۱۹۱۲۱a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        m۱۹۱۲۱a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        m۱۹۱۲۱a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        m۱۹۱۲۱a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        m۱۹۱۲۱a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        m۱۹۱۲۱a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        m۱۹۱۲۱a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        m۱۹۱۲۱a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        m۱۹۱۲۱a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        m۱۹۱۲۱a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        m۱۹۱۲۱a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        m۱۹۱۲۱a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static synchronized Ch m۱۹۱۲۰a(String javaName) {
        Ch result;
        synchronized (Ch.class) {
            result = f۱۶۰۸۴c.get(javaName);
            if (result == null) {
                result = new Ch(javaName);
                f۱۶۰۸۴c.put(javaName, result);
            }
        }
        return result;
    }

    /* renamed from: a  reason: contains not printable characters */
    static List<Ch> m۱۹۱۲۲a(String... cipherSuites) {
        List<CipherSuite> result = new ArrayList<>(cipherSuites.length);
        for (String cipherSuite : cipherSuites) {
            result.add(m۱۹۱۲۰a(cipherSuite));
        }
        return Collections.unmodifiableList(result);
    }

    private Ch(String javaName) {
        if (javaName != null) {
            this.f۱۶۰۹۸a = javaName;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Ch m۱۹۱۲۱a(String javaName, int value) {
        return m۱۹۱۲۰a(javaName);
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۱۲۳a() {
        return this.f۱۶۰۹۸a;
    }

    public String toString() {
        return this.f۱۶۰۹۸a;
    }
}
