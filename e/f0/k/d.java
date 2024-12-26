package e.f0.k;

import e.f0.c;
import e.w;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* access modifiers changed from: package-private */
public class d extends f {

    /* renamed from: c  reason: collision with root package name */
    private final Method f۴۰۲۵c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f۴۰۲۶d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f۴۰۲۷e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f۴۰۲۸f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f۴۰۲۹g;

    d(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        this.f۴۰۲۵c = putMethod;
        this.f۴۰۲۶d = getMethod;
        this.f۴۰۲۷e = removeMethod;
        this.f۴۰۲۸f = clientProviderClass;
        this.f۴۰۲۹g = serverProviderClass;
    }

    @Override // e.f0.k.f
    public void a(SSLSocket sslSocket, String hostname, List<w> list) {
        List<String> names = f.a(list);
        try {
            Object provider = Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f۴۰۲۸f, this.f۴۰۲۹g}, new a(names));
            this.f۴۰۲۵c.invoke(null, sslSocket, provider);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.a("unable to set alpn", (Exception) e2);
        }
    }

    @Override // e.f0.k.f
    public void a(SSLSocket sslSocket) {
        try {
            this.f۴۰۲۷e.invoke(null, sslSocket);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.a("unable to remove alpn", (Exception) e2);
        }
    }

    @Override // e.f0.k.f
    public String b(SSLSocket socket) {
        try {
            a provider = (a) Proxy.getInvocationHandler(this.f۴۰۲۶d.invoke(null, socket));
            if (!provider.f۴۰۳۱b && provider.f۴۰۳۲c == null) {
                f.d().a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (provider.f۴۰۳۱b) {
                return null;
            } else {
                return provider.f۴۰۳۲c;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw c.a("unable to get selected protocol", (Exception) e2);
        }
    }

    public static f c() {
        try {
            Class<?> negoClass = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> providerClass = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
            Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider");
            Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider");
            return new d(negoClass.getMethod("put", SSLSocket.class, providerClass), negoClass.getMethod("get", SSLSocket.class), negoClass.getMethod("remove", SSLSocket.class), clientProviderClass, serverProviderClass);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            return null;
        }
    }

    private static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f۴۰۳۰a;

        /* renamed from: b  reason: collision with root package name */
        boolean f۴۰۳۱b;

        /* renamed from: c  reason: collision with root package name */
        String f۴۰۳۲c;

        a(List<String> protocols) {
            this.f۴۰۳۰a = protocols;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] args) {
            String methodName = method.getName();
            Class<?> returnType = method.getReturnType();
            if (args == null) {
                args = c.f۳۷۴۳b;
            }
            if (methodName.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (methodName.equals("unsupported") && Void.TYPE == returnType) {
                this.f۴۰۳۱b = true;
                return null;
            } else if (methodName.equals("protocols") && args.length == 0) {
                return this.f۴۰۳۰a;
            } else {
                if ((methodName.equals("selectProtocol") || methodName.equals("select")) && String.class == returnType && args.length == 1 && (args[0] instanceof List)) {
                    List<String> peerProtocols = (List) args[0];
                    int size = peerProtocols.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f۴۰۳۰a.contains(peerProtocols.get(i))) {
                            String str = peerProtocols.get(i);
                            this.f۴۰۳۲c = str;
                            return str;
                        }
                    }
                    String str2 = this.f۴۰۳۰a.get(0);
                    this.f۴۰۳۲c = str2;
                    return str2;
                } else if ((!methodName.equals("protocolSelected") && !methodName.equals("selected")) || args.length != 1) {
                    return method.invoke(this, args);
                } else {
                    this.f۴۰۳۲c = (String) args[0];
                    return null;
                }
            }
        }
    }
}
