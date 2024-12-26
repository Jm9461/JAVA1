package e.f0.k;

import e.w;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

public class b extends f {
    private b() {
    }

    private Provider f() {
        return new OpenSSLProvider();
    }

    @Override // e.f0.k.f
    public void a(SSLSocket sslSocket, String hostname, List<w> list) {
        if (Conscrypt.isConscrypt(sslSocket)) {
            if (hostname != null) {
                Conscrypt.setUseSessionTickets(sslSocket, true);
                Conscrypt.setHostname(sslSocket, hostname);
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) f.a(list).toArray(new String[0]));
            return;
        }
        super.a(sslSocket, hostname, list);
    }

    @Override // e.f0.k.f
    public String b(SSLSocket sslSocket) {
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return super.b(sslSocket);
    }

    @Override // e.f0.k.f
    public SSLContext b() {
        try {
            return SSLContext.getInstance("TLS", f());
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public static f c() {
        try {
            Class.forName("org.conscrypt.ConscryptEngineSocket");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            Conscrypt.setUseEngineSocketByDefault(true);
            return new b();
        } catch (ClassNotFoundException e2) {
            return null;
        }
    }
}
