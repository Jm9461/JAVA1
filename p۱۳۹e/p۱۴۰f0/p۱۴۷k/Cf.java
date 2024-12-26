package p۱۳۹e.p۱۴۰f0.p۱۴۷k;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p۱۳۹e.Cv;
import p۱۳۹e.EnumCw;
import p۱۳۹e.p۱۴۰f0.p۱۴۸l.AbstractCc;
import p۱۳۹e.p۱۴۰f0.p۱۴۸l.AbstractCe;
import p۱۳۹e.p۱۴۰f0.p۱۴۸l.Ca;
import p۱۳۹e.p۱۴۰f0.p۱۴۸l.Cb;
import p۱۴۹f.Cc;

/* renamed from: e.f0.k.f  reason: invalid class name */
public class Cf {

    /* renamed from: a  reason: contains not printable characters */
    private static final Cf f۱۶۰۷۰a = m۱۹۰۸۵c();

    /* renamed from: b  reason: contains not printable characters */
    private static final Logger f۱۶۰۷۱b = Logger.getLogger(Cv.class.getName());

    /* renamed from: d  reason: contains not printable characters */
    public static Cf m۱۹۰۸۶d() {
        return f۱۶۰۷۰a;
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۰۹۰a() {
        return "OkHttp";
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۹۵a(SSLSocket sslSocket, String hostname, List<EnumCw> list) {
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۹۴a(SSLSocket sslSocket) {
    }

    /* renamed from: b  reason: contains not printable characters */
    public String m۱۹۰۹۷b(SSLSocket socket) {
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۹۳a(Socket socket, InetSocketAddress address, int connectTimeout) {
        socket.connect(address, connectTimeout);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۹۱a(int level, String message, Throwable t) {
        f۱۶۰۷۱b.log(level == 5 ? Level.WARNING : Level.INFO, message, t);
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۹۰۹۹b(String hostname) {
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۹۰۸۹a(String closer) {
        if (f۱۶۰۷۱b.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۹۲a(String message, Object stackTrace) {
        if (stackTrace == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m۱۹۰۹۱a(5, message, (Throwable) stackTrace);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static List<String> m۱۹۰۸۳a(List<EnumCw> list) {
        List<String> names = new ArrayList<>(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumCw protocol = list.get(i);
            if (protocol != EnumCw.HTTP_1_0) {
                names.add(protocol.toString());
            }
        }
        return names;
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCc m۱۹۰۸۸a(X509TrustManager trustManager) {
        return new Ca(m۱۹۰۹۶b(trustManager));
    }

    /* renamed from: e  reason: contains not printable characters */
    public static boolean m۱۹۰۸۷e() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: c  reason: contains not printable characters */
    private static Cf m۱۹۰۸۵c() {
        Cf conscrypt;
        Cf android2 = Ca.m۱۹۰۴۸c();
        if (android2 != null) {
            return android2;
        }
        if (m۱۹۰۸۷e() && (conscrypt = Cb.m۱۹۰۶۴c()) != null) {
            return conscrypt;
        }
        Cf jdk9 = Cc.m۱۹۰۶۹c();
        if (jdk9 != null) {
            return jdk9;
        }
        Cf jdkWithJettyBoot = Cd.m۱۹۰۷۲c();
        if (jdkWithJettyBoot != null) {
            return jdkWithJettyBoot;
        }
        return new Cf();
    }

    /* renamed from: b  reason: contains not printable characters */
    static byte[] m۱۹۰۸۴b(List<EnumCw> list) {
        Cc result = new Cc();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumCw protocol = list.get(i);
            if (protocol != EnumCw.HTTP_1_0) {
                result.writeByte(protocol.toString().length());
                result.m۱۹۳۷۳a(protocol.toString());
            }
        }
        return result.m۱۹۳۹۹g();
    }

    /* renamed from: b  reason: contains not printable characters */
    public SSLContext m۱۹۰۹۸b() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public AbstractCe m۱۹۰۹۶b(X509TrustManager trustManager) {
        return new Cb(trustManager.getAcceptedIssuers());
    }
}
