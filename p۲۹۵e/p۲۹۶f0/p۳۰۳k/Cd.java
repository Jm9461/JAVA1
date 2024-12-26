package p۲۹۵e.p۲۹۶f0.p۳۰۳k;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p۲۹۵e.EnumCw;
import p۲۹۵e.p۲۹۶f0.Cc;

/* renamed from: e.f0.k.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cd extends Cf {

    /* renamed from: c, reason: contains not printable characters */
    private final Method f۱۶۰۵۹c;

    /* renamed from: d, reason: contains not printable characters */
    private final Method f۱۶۰۶۰d;

    /* renamed from: e, reason: contains not printable characters */
    private final Method f۱۶۰۶۱e;

    /* renamed from: f, reason: contains not printable characters */
    private final Class<?> f۱۶۰۶۲f;

    /* renamed from: g, reason: contains not printable characters */
    private final Class<?> f۱۶۰۶۳g;

    Cd(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        this.f۱۶۰۵۹c = putMethod;
        this.f۱۶۰۶۰d = getMethod;
        this.f۱۶۰۶۱e = removeMethod;
        this.f۱۶۰۶۲f = clientProviderClass;
        this.f۱۶۰۶۳g = serverProviderClass;
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۶a(SSLSocket sslSocket, String hostname, List<EnumCw> list) {
        List<String> names = Cf.m۱۷۰۰۴a(list);
        try {
            Object provider = Proxy.newProxyInstance(Cf.class.getClassLoader(), new Class[]{this.f۱۶۰۶۲f, this.f۱۶۰۶۳g}, new a(names));
            this.f۱۶۰۵۹c.invoke(null, sslSocket, provider);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw Cc.m۱۶۵۳۲a("unable to set alpn", (Exception) e2);
        }
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۵a(SSLSocket sslSocket) {
        try {
            this.f۱۶۰۶۱e.invoke(null, sslSocket);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw Cc.m۱۶۵۳۲a("unable to remove alpn", (Exception) e2);
        }
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: b, reason: contains not printable characters */
    public String mo۱۷۰۱۸b(SSLSocket socket) {
        try {
            a provider = (a) Proxy.getInvocationHandler(this.f۱۶۰۶۰d.invoke(null, socket));
            if (!provider.f۱۶۰۶۵b && provider.f۱۶۰۶۶c == null) {
                Cf.m۱۷۰۰۷d().mo۱۷۰۱۲a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (provider.f۱۶۰۶۵b) {
                return null;
            }
            return provider.f۱۶۰۶۶c;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw Cc.m۱۶۵۳۲a("unable to get selected protocol", (Exception) e2);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public static Cf m۱۶۹۹۳c() {
        try {
            Class<?> negoClass = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> providerClass = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider");
            Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider");
            Method putMethod = negoClass.getMethod("put", SSLSocket.class, providerClass);
            Method getMethod = negoClass.getMethod("get", SSLSocket.class);
            Method removeMethod = negoClass.getMethod("remove", SSLSocket.class);
            return new Cd(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            return null;
        }
    }

    /* renamed from: e.f0.k.d$a */
    private static class a implements InvocationHandler {

        /* renamed from: a, reason: contains not printable characters */
        private final List<String> f۱۶۰۶۴a;

        /* renamed from: b, reason: contains not printable characters */
        boolean f۱۶۰۶۵b;

        /* renamed from: c, reason: contains not printable characters */
        String f۱۶۰۶۶c;

        a(List<String> protocols) {
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
            }
            if (methodName.equals("protocols") && args.length == 0) {
                return this.f۱۶۰۶۴a;
            }
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
            }
            if ((methodName.equals("protocolSelected") || methodName.equals("selected")) && args.length == 1) {
                this.f۱۶۰۶۶c = (String) args[0];
                return null;
            }
            return method.invoke(this, args);
        }
    }
}
