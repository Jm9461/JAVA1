package e.f0.k;

import e.w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* access modifiers changed from: package-private */
public final class c extends f {

    /* renamed from: c  reason: collision with root package name */
    final Method f۴۰۲۳c;

    /* renamed from: d  reason: collision with root package name */
    final Method f۴۰۲۴d;

    c(Method setProtocolMethod, Method getProtocolMethod) {
        this.f۴۰۲۳c = setProtocolMethod;
        this.f۴۰۲۴d = getProtocolMethod;
    }

    @Override // e.f0.k.f
    public void a(SSLSocket sslSocket, String hostname, List<w> list) {
        try {
            SSLParameters sslParameters = sslSocket.getSSLParameters();
            List<String> names = f.a(list);
            this.f۴۰۲۳c.invoke(sslParameters, names.toArray(new String[names.size()]));
            sslSocket.setSSLParameters(sslParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw e.f0.c.a("unable to set ssl parameters", (Exception) e2);
        }
    }

    @Override // e.f0.k.f
    public String b(SSLSocket socket) {
        try {
            String protocol = (String) this.f۴۰۲۴d.invoke(socket, new Object[0]);
            if (protocol == null || protocol.equals("")) {
                return null;
            }
            return protocol;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw e.f0.c.a("unable to get selected protocols", (Exception) e2);
        }
    }

    public static c c() {
        try {
            return new c(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException e2) {
            return null;
        }
    }
}
