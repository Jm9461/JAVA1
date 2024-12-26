package p۱۳۹e.p۱۴۰f0.p۱۴۷k;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p۱۳۹e.EnumCw;
import p۱۳۹e.p۱۴۰f0.Cc;

/* access modifiers changed from: package-private */
/* renamed from: e.f0.k.d  reason: invalid class name */
public class Cd extends Cf {

    /* renamed from: c  reason: contains not printable characters */
    private final Method f۱۶۰۵۹c;

    /* renamed from: d  reason: contains not printable characters */
    private final Method f۱۶۰۶۰d;

    /* renamed from: e  reason: contains not printable characters */
    private final Method f۱۶۰۶۱e;

    /* renamed from: f  reason: contains not printable characters */
    private final Class<?> f۱۶۰۶۲f;

    /* renamed from: g  reason: contains not printable characters */
    private final Class<?> f۱۶۰۶۳g;

    Cd(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        this.f۱۶۰۵۹c = putMethod;
        this.f۱۶۰۶۰d = getMethod;
        this.f۱۶۰۶۱e = removeMethod;
        this.f۱۶۰۶۲f = clientProviderClass;
        this.f۱۶۰۶۳g = serverProviderClass;
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۷۴a(SSLSocket sslSocket, String hostname, List<EnumCw> list) {
        List<String> names = Cf.m۱۹۰۸۳a(list);
        try {
            Object provider = Proxy.newProxyInstance(Cf.class.getClassLoader(), new Class[]{this.f۱۶۰۶۲f, this.f۱۶۰۶۳g}, new Ca(names));
            this.f۱۶۰۵۹c.invoke(null, sslSocket, provider);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw Cc.m۱۸۶۱۱a("unable to set alpn", (Exception) e);
        }
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۷۳a(SSLSocket sslSocket) {
        try {
            this.f۱۶۰۶۱e.invoke(null, sslSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw Cc.m۱۸۶۱۱a("unable to remove alpn", (Exception) e);
        }
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: b  reason: contains not printable characters */
    public String m۱۹۰۷۵b(SSLSocket socket) {
        try {
            Ca provider = (Ca) Proxy.getInvocationHandler(this.f۱۶۰۶۰d.invoke(null, socket));
            if (!provider.f۱۶۰۶۵b && provider.f۱۶۰۶۶c == null) {
                Cf.m۱۹۰۸۶d().m۱۹۰۹۱a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (provider.f۱۶۰۶۵b) {
                return null;
            } else {
                return provider.f۱۶۰۶۶c;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw Cc.m۱۸۶۱۱a("unable to get selected protocol", (Exception) e);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public static Cf m۱۹۰۷۲c() {
        try {
            Class<?> negoClass = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> providerClass = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
            Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider");
            Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider");
            return new Cd(negoClass.getMethod("put", SSLSocket.class, providerClass), negoClass.getMethod("get", SSLSocket.class), negoClass.getMethod("remove", SSLSocket.class), clientProviderClass, serverProviderClass);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            return null;
        }
    }

    /* renamed from: e.f0.k.d$a  reason: invalid class name */
    private static class Ca implements InvocationHandler {

        /* renamed from: a  reason: contains not printable characters */
        private final List<String> f۱۶۰۶۴a;

        /* renamed from: b  reason: contains not printable characters */
        boolean f۱۶۰۶۵b;

        /* renamed from: c  reason: contains not printable characters */
        String f۱۶۰۶۶c;

        Ca(List<String> protocols) {
            this.f۱۶۰۶۴a = protocols;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] args) {
            String methodName = method.getName();
            Class<?> returnType = method.getReturnType();
            if (args == null) {
                args = Cc.f۱۵۷۰۴b;
            }
            if (methodName.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (methodName.equals("unsupported") && Void.TYPE == returnType) {
                this.f۱۶۰۶۵b = true;
                return null;
            } else if (methodName.equals("protocols") && args.length == 0) {
                return this.f۱۶۰۶۴a;
            } else {
                if ((methodName.equals("selectProtocol") || methodName.equals("select")) && String.class == returnType && args.length == 1 && (args[0] instanceof List)) {
                    List<String> peerProtocols = (List) args[0];
                    int size = peerProtocols.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f۱۶۰۶۴a.contains(peerProtocols.get(i))) {
                            String str = peerProtocols.get(i);
                            this.f۱۶۰۶۶c = str;
                            return str;
                        }
                    }
                    String str2 = this.f۱۶۰۶۴a.get(0);
                    this.f۱۶۰۶۶c = str2;
                    return str2;
                } else if ((!methodName.equals("protocolSelected") && !methodName.equals("selected")) || args.length != 1) {
                    return method.invoke(this, args);
                } else {
                    this.f۱۶۰۶۶c = (String) args[0];
                    return null;
                }
            }
        }
    }
}
