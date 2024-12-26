package p۲۹۵e.p۲۹۶f0.p۲۹۸f;

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
import p۲۹۵e.Ck;
import p۲۹۵e.p۲۹۶f0.AbstractCa;

/* renamed from: e.f0.f.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cb {

    /* renamed from: a, reason: contains not printable characters */
    private final List<Ck> f۱۵۷۷۳a;

    /* renamed from: b, reason: contains not printable characters */
    private int f۱۵۷۷۴b = 0;

    /* renamed from: c, reason: contains not printable characters */
    private boolean f۱۵۷۷۵c;

    /* renamed from: d, reason: contains not printable characters */
    private boolean f۱۵۷۷۶d;

    public Cb(List<Ck> list) {
        this.f۱۵۷۷۳a = list;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ck m۱۶۶۱۸a(SSLSocket sslSocket) {
        Ck tlsConfiguration = null;
        int i = this.f۱۵۷۷۴b;
        int size = this.f۱۵۷۷۳a.size();
        while (true) {
            if (i >= size) {
                break;
            }
            Ck connectionSpec = this.f۱۵۷۷۳a.get(i);
            if (!connectionSpec.m۱۷۰۵۵a(sslSocket)) {
                i++;
            } else {
                tlsConfiguration = connectionSpec;
                this.f۱۵۷۷۴b = i + 1;
                break;
            }
        }
        if (tlsConfiguration == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f۱۵۷۷۶d + ", modes=" + this.f۱۵۷۷۳a + ", supported protocols=" + Arrays.toString(sslSocket.getEnabledProtocols()));
        }
        this.f۱۵۷۷۵c = m۱۶۶۱۷b(sslSocket);
        AbstractCa.f۱۵۷۰۱a.mo۱۷۲۲۲a(tlsConfiguration, sslSocket, this.f۱۵۷۷۶d);
        return tlsConfiguration;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۶۶۱۹a(IOException e2) {
        this.f۱۵۷۷۶d = true;
        if (!this.f۱۵۷۷۵c || (e2 instanceof ProtocolException) || (e2 instanceof InterruptedIOException)) {
            return false;
        }
        if (((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) || (e2 instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return (e2 instanceof SSLHandshakeException) || (e2 instanceof SSLProtocolException);
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۶۶۱۷b(SSLSocket socket) {
        for (int i = this.f۱۵۷۷۴b; i < this.f۱۵۷۷۳a.size(); i++) {
            if (this.f۱۵۷۷۳a.get(i).m۱۷۰۵۵a(socket)) {
                return true;
            }
        }
        return false;
    }
}
