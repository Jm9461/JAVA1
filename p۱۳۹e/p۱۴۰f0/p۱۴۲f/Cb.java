package p۱۳۹e.p۱۴۰f0.p۱۴۲f;

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
import p۱۳۹e.Ck;
import p۱۳۹e.p۱۴۰f0.AbstractCa;

/* renamed from: e.f0.f.b  reason: invalid class name */
public final class Cb {

    /* renamed from: a  reason: contains not printable characters */
    private final List<Ck> f۱۵۷۷۳a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۵۷۷۴b = 0;

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۱۵۷۷۵c;

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۵۷۷۶d;

    public Cb(List<Ck> list) {
        this.f۱۵۷۷۳a = list;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ck m۱۸۶۹۷a(SSLSocket sslSocket) {
        Ck tlsConfiguration = null;
        int i = this.f۱۵۷۷۴b;
        int size = this.f۱۵۷۷۳a.size();
        while (true) {
            if (i >= size) {
                break;
            }
            Ck connectionSpec = this.f۱۵۷۷۳a.get(i);
            if (connectionSpec.m۱۹۱۳۴a(sslSocket)) {
                tlsConfiguration = connectionSpec;
                this.f۱۵۷۷۴b = i + 1;
                break;
            }
            i++;
        }
        if (tlsConfiguration != null) {
            this.f۱۵۷۷۵c = m۱۸۶۹۶b(sslSocket);
            AbstractCa.f۱۵۷۰۱a.m۱۸۶۰۰a(tlsConfiguration, sslSocket, this.f۱۵۷۷۶d);
            return tlsConfiguration;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f۱۵۷۷۶d + ", modes=" + this.f۱۵۷۷۳a + ", supported protocols=" + Arrays.toString(sslSocket.getEnabledProtocols()));
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۶۹۸a(IOException e) {
        this.f۱۵۷۷۶d = true;
        if (!this.f۱۵۷۷۵c || (e instanceof ProtocolException) || (e instanceof InterruptedIOException)) {
            return false;
        }
        if (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if ((e instanceof SSLHandshakeException) || (e instanceof SSLProtocolException)) {
            return true;
        }
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۸۶۹۶b(SSLSocket socket) {
        for (int i = this.f۱۵۷۷۴b; i < this.f۱۵۷۷۳a.size(); i++) {
            if (this.f۱۵۷۷۳a.get(i).m۱۹۱۳۴a(socket)) {
                return true;
            }
        }
        return false;
    }
}
