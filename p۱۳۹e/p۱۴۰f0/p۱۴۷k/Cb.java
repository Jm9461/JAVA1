package p۱۳۹e.p۱۴۰f0.p۱۴۷k;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;
import p۱۳۹e.EnumCw;

/* renamed from: e.f0.k.b  reason: invalid class name */
public class Cb extends Cf {
    private Cb() {
    }

    /* renamed from: f  reason: contains not printable characters */
    private Provider m۱۹۰۶۵f() {
        return new OpenSSLProvider();
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۶۶a(SSLSocket sslSocket, String hostname, List<EnumCw> list) {
        if (Conscrypt.isConscrypt(sslSocket)) {
            if (hostname != null) {
                Conscrypt.setUseSessionTickets(sslSocket, true);
                Conscrypt.setHostname(sslSocket, hostname);
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) Cf.m۱۹۰۸۳a(list).toArray(new String[0]));
            return;
        }
        super.m۱۹۰۹۵a(sslSocket, hostname, list);
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: b  reason: contains not printable characters */
    public String m۱۹۰۶۷b(SSLSocket sslSocket) {
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return super.m۱۹۰۹۷b(sslSocket);
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: b  reason: contains not printable characters */
    public SSLContext m۱۹۰۶۸b() {
        try {
            return SSLContext.getInstance("TLS", m۱۹۰۶۵f());
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public static Cf m۱۹۰۶۴c() {
        try {
            Class.forName("org.conscrypt.ConscryptEngineSocket");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            Conscrypt.setUseEngineSocketByDefault(true);
            return new Cb();
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
