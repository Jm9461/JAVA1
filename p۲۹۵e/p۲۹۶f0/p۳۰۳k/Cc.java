package p۲۹۵e.p۲۹۶f0.p۳۰۳k;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p۲۹۵e.EnumCw;

/* renamed from: e.f0.k.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cc extends Cf {

    /* renamed from: c, reason: contains not printable characters */
    final Method f۱۶۰۵۷c;

    /* renamed from: d, reason: contains not printable characters */
    final Method f۱۶۰۵۸d;

    Cc(Method setProtocolMethod, Method getProtocolMethod) {
        this.f۱۶۰۵۷c = setProtocolMethod;
        this.f۱۶۰۵۸d = getProtocolMethod;
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۶a(SSLSocket sslSocket, String hostname, List<EnumCw> list) {
        try {
            SSLParameters sslParameters = sslSocket.getSSLParameters();
            List<String> names = Cf.m۱۷۰۰۴a(list);
            this.f۱۶۰۵۷c.invoke(sslParameters, names.toArray(new String[names.size()]));
            sslSocket.setSSLParameters(sslParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۳۲a("unable to set ssl parameters", (Exception) e2);
        }
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: b, reason: contains not printable characters */
    public String mo۱۷۰۱۸b(SSLSocket socket) {
        try {
            String protocol = (String) this.f۱۶۰۵۸d.invoke(socket, new Object[0]);
            if (protocol == null) {
                return null;
            }
            if (protocol.equals("")) {
                return null;
            }
            return protocol;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۳۲a("unable to get selected protocols", (Exception) e2);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public static Cc m۱۶۹۹۰c() {
        try {
            Method setProtocolMethod = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            Method getProtocolMethod = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            return new Cc(setProtocolMethod, getProtocolMethod);
        } catch (NoSuchMethodException e2) {
            return null;
        }
    }
}
