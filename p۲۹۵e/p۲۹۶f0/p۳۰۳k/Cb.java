package p۲۹۵e.p۲۹۶f0.p۳۰۳k;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;
import p۲۹۵e.EnumCw;

/* renamed from: e.f0.k.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends Cf {
    private Cb() {
    }

    /* renamed from: f, reason: contains not printable characters */
    private Provider m۱۶۹۸۶f() {
        return new OpenSSLProvider();
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۶a(SSLSocket sslSocket, String hostname, List<EnumCw> list) {
        if (Conscrypt.isConscrypt(sslSocket)) {
            if (hostname != null) {
                Conscrypt.setUseSessionTickets(sslSocket, true);
                Conscrypt.setHostname(sslSocket, hostname);
            }
            List<String> names = Cf.m۱۷۰۰۴a(list);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) names.toArray(new String[0]));
            return;
        }
        super.mo۱۷۰۱۶a(sslSocket, hostname, list);
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: b, reason: contains not printable characters */
    public String mo۱۷۰۱۸b(SSLSocket sslSocket) {
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return super.mo۱۷۰۱۸b(sslSocket);
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: b, reason: contains not printable characters */
    public SSLContext mo۱۷۰۱۹b() {
        try {
            return SSLContext.getInstance("TLS", m۱۶۹۸۶f());
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public static Cf m۱۶۹۸۵c() {
        try {
            Class.forName("org.conscrypt.ConscryptEngineSocket");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            Conscrypt.setUseEngineSocketByDefault(true);
            return new Cb();
        } catch (ClassNotFoundException e2) {
            return null;
        }
    }
}
