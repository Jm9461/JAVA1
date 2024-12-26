package p۲۹۵e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.CipherSuite;

/* renamed from: e.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ch {

    /* renamed from: b, reason: contains not printable characters */
    static final Comparator<String> f۱۶۰۸۳b = new a();

    /* renamed from: c, reason: contains not printable characters */
    private static final Map<String, Ch> f۱۶۰۸۴c = new TreeMap(f۱۶۰۸۳b);

    /* renamed from: d, reason: contains not printable characters */
    public static final Ch f۱۶۰۸۵d;

    /* renamed from: e, reason: contains not printable characters */
    public static final Ch f۱۶۰۸۶e;

    /* renamed from: f, reason: contains not printable characters */
    public static final Ch f۱۶۰۸۷f;

    /* renamed from: g, reason: contains not printable characters */
    public static final Ch f۱۶۰۸۸g;

    /* renamed from: h, reason: contains not printable characters */
    public static final Ch f۱۶۰۸۹h;

    /* renamed from: i, reason: contains not printable characters */
    public static final Ch f۱۶۰۹۰i;

    /* renamed from: j, reason: contains not printable characters */
    public static final Ch f۱۶۰۹۱j;

    /* renamed from: k, reason: contains not printable characters */
    public static final Ch f۱۶۰۹۲k;

    /* renamed from: l, reason: contains not printable characters */
    public static final Ch f۱۶۰۹۳l;

    /* renamed from: m, reason: contains not printable characters */
    public static final Ch f۱۶۰۹۴m;

    /* renamed from: n, reason: contains not printable characters */
    public static final Ch f۱۶۰۹۵n;

    /* renamed from: o, reason: contains not printable characters */
    public static final Ch f۱۶۰۹۶o;

    /* renamed from: p, reason: contains not printable characters */
    public static final Ch f۱۶۰۹۷p;

    /* renamed from: a, reason: contains not printable characters */
    final String f۱۶۰۹۸a;

    /* renamed from: e.h$a */
    final class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(String a2, String b2) {
            int limit = Math.min(a2.length(), b2.length());
            for (int i = 4; i < limit; i++) {
                char charA = a2.charAt(i);
                char charB = b2.charAt(i);
                if (charA != charB) {
                    return charA < charB ? -1 : 1;
                }
            }
            int lengthA = a2.length();
            int lengthB = b2.length();
            if (lengthA != lengthB) {
                return lengthA < lengthB ? -1 : 1;
            }
            return 0;
        }
    }

    static {
        m۱۷۰۴۲a("SSL_RSA_WITH_NULL_MD5", 1);
        m۱۷۰۴۲a("SSL_RSA_WITH_NULL_SHA", 2);
        m۱۷۰۴۲a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        m۱۷۰۴۲a("SSL_RSA_WITH_RC4_128_MD5", 4);
        m۱۷۰۴۲a("SSL_RSA_WITH_RC4_128_SHA", 5);
        m۱۷۰۴۲a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        m۱۷۰۴۲a("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f۱۶۰۸۵d = m۱۷۰۴۲a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        m۱۷۰۴۲a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        m۱۷۰۴۲a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        m۱۷۰۴۲a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        m۱۷۰۴۲a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        m۱۷۰۴۲a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        m۱۷۰۴۲a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        m۱۷۰۴۲a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        m۱۷۰۴۲a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        m۱۷۰۴۲a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        m۱۷۰۴۲a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        m۱۷۰۴۲a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        m۱۷۰۴۲a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        m۱۷۰۴۲a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        m۱۷۰۴۲a("TLS_KRB5_WITH_RC4_128_SHA", 32);
        m۱۷۰۴۲a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        m۱۷۰۴۲a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        m۱۷۰۴۲a("TLS_KRB5_WITH_RC4_128_MD5", 36);
        m۱۷۰۴۲a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        m۱۷۰۴۲a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        m۱۷۰۴۲a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        m۱۷۰۴۲a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f۱۶۰۸۶e = m۱۷۰۴۲a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        m۱۷۰۴۲a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        m۱۷۰۴۲a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        m۱۷۰۴۲a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f۱۶۰۸۷f = m۱۷۰۴۲a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        m۱۷۰۴۲a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        m۱۷۰۴۲a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        m۱۷۰۴۲a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        m۱۷۰۴۲a("TLS_RSA_WITH_NULL_SHA256", 59);
        m۱۷۰۴۲a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        m۱۷۰۴۲a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        m۱۷۰۴۲a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        m۱۷۰۴۲a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        m۱۷۰۴۲a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        m۱۷۰۴۲a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        m۱۷۰۴۲a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        m۱۷۰۴۲a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        m۱۷۰۴۲a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        m۱۷۰۴۲a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        m۱۷۰۴۲a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        m۱۷۰۴۲a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        m۱۷۰۴۲a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        m۱۷۰۴۲a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        m۱۷۰۴۲a("TLS_PSK_WITH_RC4_128_SHA", 138);
        m۱۷۰۴۲a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        m۱۷۰۴۲a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        m۱۷۰۴۲a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        m۱۷۰۴۲a("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f۱۶۰۸۸g = m۱۷۰۴۲a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f۱۶۰۸۹h = m۱۷۰۴۲a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        m۱۷۰۴۲a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m۱۷۰۴۲a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        m۱۷۰۴۲a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        m۱۷۰۴۲a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        m۱۷۰۴۲a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        m۱۷۰۴۲a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        m۱۷۰۴۲a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        m۱۷۰۴۲a("TLS_FALLBACK_SCSV", 22016);
        m۱۷۰۴۲a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        m۱۷۰۴۲a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        m۱۷۰۴۲a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        m۱۷۰۴۲a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        m۱۷۰۴۲a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        m۱۷۰۴۲a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        m۱۷۰۴۲a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        m۱۷۰۴۲a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        m۱۷۰۴۲a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        m۱۷۰۴۲a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        m۱۷۰۴۲a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        m۱۷۰۴۲a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        m۱۷۰۴۲a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        m۱۷۰۴۲a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        m۱۷۰۴۲a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        m۱۷۰۴۲a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        m۱۷۰۴۲a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        m۱۷۰۴۲a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f۱۶۰۹۰i = m۱۷۰۴۲a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f۱۶۰۹۱j = m۱۷۰۴۲a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        m۱۷۰۴۲a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        m۱۷۰۴۲a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        m۱۷۰۴۲a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        m۱۷۰۴۲a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        m۱۷۰۴۲a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        m۱۷۰۴۲a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        m۱۷۰۴۲a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        m۱۷۰۴۲a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        m۱۷۰۴۲a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        m۱۷۰۴۲a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        m۱۷۰۴۲a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        m۱۷۰۴۲a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        m۱۷۰۴۲a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f۱۶۰۹۲k = m۱۷۰۴۲a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f۱۶۰۹۳l = m۱۷۰۴۲a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        m۱۷۰۴۲a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        m۱۷۰۴۲a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f۱۶۰۹۴m = m۱۷۰۴۲a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f۱۶۰۹۵n = m۱۷۰۴۲a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        m۱۷۰۴۲a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        m۱۷۰۴۲a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        m۱۷۰۴۲a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        m۱۷۰۴۲a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f۱۶۰۹۶o = m۱۷۰۴۲a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f۱۶۰۹۷p = m۱۷۰۴۲a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static synchronized Ch m۱۷۰۴۱a(String javaName) {
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

    /* renamed from: a, reason: contains not printable characters */
    static List<Ch> m۱۷۰۴۳a(String... cipherSuites) {
        List<CipherSuite> result = new ArrayList<>(cipherSuites.length);
        for (String cipherSuite : cipherSuites) {
            result.add(m۱۷۰۴۱a(cipherSuite));
        }
        return Collections.unmodifiableList(result);
    }

    private Ch(String javaName) {
        if (javaName == null) {
            throw new NullPointerException();
        }
        this.f۱۶۰۹۸a = javaName;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Ch m۱۷۰۴۲a(String javaName, int value) {
        return m۱۷۰۴۱a(javaName);
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۷۰۴۴a() {
        return this.f۱۶۰۹۸a;
    }

    public String toString() {
        return this.f۱۶۰۹۸a;
    }
}
