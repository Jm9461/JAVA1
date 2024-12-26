package e.f0.l;

import e.f0.k.f;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

public abstract class c {
    public abstract List<Certificate> a(List<Certificate> list, String str);

    public static c a(X509TrustManager trustManager) {
        return f.d().a(trustManager);
    }
}
