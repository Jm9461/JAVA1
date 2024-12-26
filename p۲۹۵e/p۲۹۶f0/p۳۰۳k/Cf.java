package p۲۹۵e.p۲۹۶f0.p۳۰۳k;

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
import p۲۹۵e.Cv;
import p۲۹۵e.EnumCw;
import p۲۹۵e.p۲۹۶f0.p۳۰۴l.AbstractCc;
import p۲۹۵e.p۲۹۶f0.p۳۰۴l.Ca;
import p۲۹۵e.p۲۹۶f0.p۳۰۴l.Cb;
import p۲۹۵e.p۲۹۶f0.p۳۰۴l.InterfaceCe;
import p۳۰۵f.Cc;

/* renamed from: e.f0.k.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cf {

    /* renamed from: a, reason: contains not printable characters */
    private static final Cf f۱۶۰۷۰a = m۱۷۰۰۶c();

    /* renamed from: b, reason: contains not printable characters */
    private static final Logger f۱۶۰۷۱b = Logger.getLogger(Cv.class.getName());

    /* renamed from: d, reason: contains not printable characters */
    public static Cf m۱۷۰۰۷d() {
        return f۱۶۰۷۰a;
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۷۰۱۱a() {
        return "OkHttp";
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۶a(SSLSocket sslSocket, String hostname, List<EnumCw> list) {
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۵a(SSLSocket sslSocket) {
    }

    /* renamed from: b, reason: contains not printable characters */
    public String mo۱۷۰۱۸b(SSLSocket socket) {
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۴a(Socket socket, InetSocketAddress address, int connectTimeout) {
        socket.connect(address, connectTimeout);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۲a(int level, String message, Throwable t) {
        Level logLevel = level == 5 ? Level.WARNING : Level.INFO;
        f۱۶۰۷۱b.log(logLevel, message, t);
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۷۰۲۰b(String hostname) {
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Object mo۱۷۰۱۰a(String closer) {
        if (f۱۶۰۷۱b.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۳a(String message, Object stackTrace) {
        if (stackTrace == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo۱۷۰۱۲a(5, message, (Throwable) stackTrace);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static List<String> m۱۷۰۰۴a(List<EnumCw> list) {
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

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCc mo۱۷۰۰۹a(X509TrustManager trustManager) {
        return new Ca(mo۱۷۰۱۷b(trustManager));
    }

    /* renamed from: e, reason: contains not printable characters */
    public static boolean m۱۷۰۰۸e() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        String preferredProvider = Security.getProviders()[0].getName();
        return "Conscrypt".equals(preferredProvider);
    }

    /* renamed from: c, reason: contains not printable characters */
    private static Cf m۱۷۰۰۶c() {
        Cf conscrypt;
        Cf android2 = Ca.m۱۶۹۶۹c();
        if (android2 != null) {
            return android2;
        }
        if (m۱۷۰۰۸e() && (conscrypt = Cb.m۱۶۹۸۵c()) != null) {
            return conscrypt;
        }
        Cf jdk9 = Cc.m۱۶۹۹۰c();
        if (jdk9 != null) {
            return jdk9;
        }
        Cf jdkWithJettyBoot = Cd.m۱۶۹۹۳c();
        if (jdkWithJettyBoot != null) {
            return jdkWithJettyBoot;
        }
        return new Cf();
    }

    /* renamed from: b, reason: contains not printable characters */
    static byte[] m۱۷۰۰۵b(List<EnumCw> list) {
        Cc result = new Cc();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumCw protocol = list.get(i);
            if (protocol != EnumCw.HTTP_1_0) {
                result.writeByte(protocol.toString().length());
                result.mo۱۷۴۲۶a(protocol.toString());
            }
        }
        return result.mo۱۷۴۴۶g();
    }

    /* renamed from: b, reason: contains not printable characters */
    public SSLContext mo۱۷۰۱۹b() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public InterfaceCe mo۱۷۰۱۷b(X509TrustManager trustManager) {
        return new Cb(trustManager.getAcceptedIssuers());
    }
}
