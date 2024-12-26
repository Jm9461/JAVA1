package e.f0.k;

import e.f0.l.a;
import e.f0.l.b;
import e.f0.l.c;
import e.f0.l.e;
import e.v;
import e.w;
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

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final f f۴۰۳۶a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f۴۰۳۷b = Logger.getLogger(v.class.getName());

    public static f d() {
        return f۴۰۳۶a;
    }

    public String a() {
        return "OkHttp";
    }

    public void a(SSLSocket sslSocket, String hostname, List<w> list) {
    }

    public void a(SSLSocket sslSocket) {
    }

    public String b(SSLSocket socket) {
        return null;
    }

    public void a(Socket socket, InetSocketAddress address, int connectTimeout) {
        socket.connect(address, connectTimeout);
    }

    public void a(int level, String message, Throwable t) {
        f۴۰۳۷b.log(level == 5 ? Level.WARNING : Level.INFO, message, t);
    }

    public boolean b(String hostname) {
        return true;
    }

    public Object a(String closer) {
        if (f۴۰۳۷b.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public void a(String message, Object stackTrace) {
        if (stackTrace == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        a(5, message, (Throwable) stackTrace);
    }

    public static List<String> a(List<w> list) {
        List<String> names = new ArrayList<>(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            w protocol = list.get(i);
            if (protocol != w.HTTP_1_0) {
                names.add(protocol.toString());
            }
        }
        return names;
    }

    public c a(X509TrustManager trustManager) {
        return new a(b(trustManager));
    }

    public static boolean e() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    private static f c() {
        f conscrypt;
        f android2 = a.c();
        if (android2 != null) {
            return android2;
        }
        if (e() && (conscrypt = b.c()) != null) {
            return conscrypt;
        }
        f jdk9 = c.c();
        if (jdk9 != null) {
            return jdk9;
        }
        f jdkWithJettyBoot = d.c();
        if (jdkWithJettyBoot != null) {
            return jdkWithJettyBoot;
        }
        return new f();
    }

    static byte[] b(List<w> list) {
        f.c result = new f.c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            w protocol = list.get(i);
            if (protocol != w.HTTP_1_0) {
                result.writeByte(protocol.toString().length());
                result.a(protocol.toString());
            }
        }
        return result.g();
    }

    public SSLContext b() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public e b(X509TrustManager trustManager) {
        return new b(trustManager.getAcceptedIssuers());
    }
}
