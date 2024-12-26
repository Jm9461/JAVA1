package p۱۳۹e.p۱۴۰f0.p۱۴۷k;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p۱۳۹e.EnumCw;

/* access modifiers changed from: package-private */
/* renamed from: e.f0.k.c  reason: invalid class name */
public final class Cc extends Cf {

    /* renamed from: c  reason: contains not printable characters */
    final Method f۱۶۰۵۷c;

    /* renamed from: d  reason: contains not printable characters */
    final Method f۱۶۰۵۸d;

    Cc(Method setProtocolMethod, Method getProtocolMethod) {
        this.f۱۶۰۵۷c = setProtocolMethod;
        this.f۱۶۰۵۸d = getProtocolMethod;
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۷۰a(SSLSocket sslSocket, String hostname, List<EnumCw> list) {
        try {
            SSLParameters sslParameters = sslSocket.getSSLParameters();
            List<String> names = Cf.m۱۹۰۸۳a(list);
            this.f۱۶۰۵۷c.invoke(sslParameters, names.toArray(new String[names.size()]));
            sslSocket.setSSLParameters(sslParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۱a("unable to set ssl parameters", (Exception) e);
        }
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: b  reason: contains not printable characters */
    public String m۱۹۰۷۱b(SSLSocket socket) {
        try {
            String protocol = (String) this.f۱۶۰۵۸d.invoke(socket, new Object[0]);
            if (protocol == null || protocol.equals("")) {
                return null;
            }
            return protocol;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۱a("unable to get selected protocols", (Exception) e);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public static Cc m۱۹۰۶۹c() {
        try {
            return new Cc(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException e) {
            return null;
        }
    }
}
