package e.f0.f;

import e.f0.a;
import e.k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<k> f۳۷۹۳a;

    /* renamed from: b  reason: collision with root package name */
    private int f۳۷۹۴b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f۳۷۹۵c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f۳۷۹۶d;

    public b(List<k> list) {
        this.f۳۷۹۳a = list;
    }

    public k a(SSLSocket sslSocket) {
        k tlsConfiguration = null;
        int i = this.f۳۷۹۴b;
        int size = this.f۳۷۹۳a.size();
        while (true) {
            if (i >= size) {
                break;
            }
            k connectionSpec = this.f۳۷۹۳a.get(i);
            if (connectionSpec.a(sslSocket)) {
                tlsConfiguration = connectionSpec;
                this.f۳۷۹۴b = i + 1;
                break;
            }
            i++;
        }
        if (tlsConfiguration != null) {
            this.f۳۷۹۵c = b(sslSocket);
            a.f۳۷۴۰a.a(tlsConfiguration, sslSocket, this.f۳۷۹۶d);
            return tlsConfiguration;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f۳۷۹۶d + ", modes=" + this.f۳۷۹۳a + ", supported protocols=" + Arrays.toString(sslSocket.getEnabledProtocols()));
    }

    public boolean a(IOException e2) {
        this.f۳۷۹۶d = true;
        if (!this.f۳۷۹۵c || (e2 instanceof ProtocolException) || (e2 instanceof InterruptedIOException)) {
            return false;
        }
        if (((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) || (e2 instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if ((e2 instanceof SSLHandshakeException) || (e2 instanceof SSLProtocolException)) {
            return true;
        }
        return false;
    }

    private boolean b(SSLSocket socket) {
        for (int i = this.f۳۷۹۴b; i < this.f۳۷۹۳a.size(); i++) {
            if (this.f۳۷۹۳a.get(i).a(socket)) {
                return true;
            }
        }
        return false;
    }
}
