package e.f0.k;

import android.os.Build;
import android.util.Log;
import e.f0.l.e;
import e.w;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.OptionalMethod;

/* access modifiers changed from: package-private */
public class a extends f {

    /* renamed from: c  reason: collision with root package name */
    private final e<Socket> f۴۰۱۱c;

    /* renamed from: d  reason: collision with root package name */
    private final e<Socket> f۴۰۱۲d;

    /* renamed from: e  reason: collision with root package name */
    private final e<Socket> f۴۰۱۳e;

    /* renamed from: f  reason: collision with root package name */
    private final e<Socket> f۴۰۱۴f;

    /* renamed from: g  reason: collision with root package name */
    private final c f۴۰۱۵g = c.a();

    a(Class<?> cls, e<Socket> eVar, e<Socket> eVar2, e<Socket> eVar3, e<Socket> eVar4) {
        this.f۴۰۱۱c = eVar;
        this.f۴۰۱۲d = eVar2;
        this.f۴۰۱۳e = eVar3;
        this.f۴۰۱۴f = eVar4;
    }

    @Override // e.f0.k.f
    public void a(Socket socket, InetSocketAddress address, int connectTimeout) {
        try {
            socket.connect(address, connectTimeout);
        } catch (AssertionError e2) {
            if (e.f0.c.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException ioException = new IOException("Exception in connect");
            ioException.initCause(e3);
            throw ioException;
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException ioException2 = new IOException("Exception in connect");
                ioException2.initCause(e4);
                throw ioException2;
            }
            throw e4;
        }
    }

    @Override // e.f0.k.f
    public void a(SSLSocket sslSocket, String hostname, List<w> list) {
        if (hostname != null) {
            this.f۴۰۱۱c.c(sslSocket, true);
            this.f۴۰۱۲d.c(sslSocket, hostname);
        }
        e<Socket> eVar = this.f۴۰۱۴f;
        if (eVar != null && eVar.a(sslSocket)) {
            this.f۴۰۱۴f.d(sslSocket, f.b(list));
        }
    }

    @Override // e.f0.k.f
    public String b(SSLSocket socket) {
        byte[] alpnResult;
        e<Socket> eVar = this.f۴۰۱۳e;
        if (eVar == null || !eVar.a(socket) || (alpnResult = (byte[]) this.f۴۰۱۳e.d(socket, new Object[0])) == null) {
            return null;
        }
        return new String(alpnResult, e.f0.c.f۳۷۴۵d);
    }

    @Override // e.f0.k.f
    public void a(int level, String message, Throwable t) {
        int logLevel = 5;
        if (level != 5) {
            logLevel = 3;
        }
        if (t != null) {
            message = message + '\n' + Log.getStackTraceString(t);
        }
        int i = 0;
        int length = message.length();
        while (i < length) {
            int newline = message.indexOf(10, i);
            int newline2 = newline != -1 ? newline : length;
            do {
                int end = Math.min(newline2, i + 4000);
                Log.println(logLevel, "OkHttp", message.substring(i, end));
                i = end;
            } while (i < newline2);
            i++;
        }
    }

    @Override // e.f0.k.f
    public Object a(String closer) {
        return this.f۴۰۱۵g.a(closer);
    }

    @Override // e.f0.k.f
    public void a(String message, Object stackTrace) {
        if (!this.f۴۰۱۵g.a(stackTrace)) {
            a(5, message, (Throwable) null);
        }
    }

    @Override // e.f0.k.f
    public boolean b(String hostname) {
        try {
            Class<?> networkPolicyClass = Class.forName("android.security.NetworkSecurityPolicy");
            return b(hostname, networkPolicyClass, networkPolicyClass.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            return super.b(hostname);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            throw e.f0.c.a("unable to determine cleartext support", e3);
        }
    }

    private boolean b(String hostname, Class<?> networkPolicyClass, Object networkSecurityPolicy) {
        try {
            return ((Boolean) networkPolicyClass.getMethod("isCleartextTrafficPermitted", String.class).invoke(networkSecurityPolicy, hostname)).booleanValue();
        } catch (NoSuchMethodException e2) {
            return a(hostname, networkPolicyClass, networkSecurityPolicy);
        }
    }

    private boolean a(String hostname, Class<?> networkPolicyClass, Object networkSecurityPolicy) {
        try {
            return ((Boolean) networkPolicyClass.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(networkSecurityPolicy, new Object[0])).booleanValue();
        } catch (NoSuchMethodException e2) {
            return super.b(hostname);
        }
    }

    private static boolean f() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    @Override // e.f0.k.f
    public e.f0.l.c a(X509TrustManager trustManager) {
        try {
            Class<?> extensionsClass = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C۰۱۲۲a(extensionsClass.getConstructor(X509TrustManager.class).newInstance(trustManager), extensionsClass.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception e2) {
            return super.a(trustManager);
        }
    }

    public static f c() {
        Class<?> sslParametersClass;
        OptionalMethod<Socket> setAlpnProtocols;
        e eVar;
        try {
            sslParametersClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException e2) {
            try {
                sslParametersClass = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException e3) {
                return null;
            }
        }
        OptionalMethod<Socket> setUseSessionTickets = new e<>(null, "setUseSessionTickets", Boolean.TYPE);
        OptionalMethod<Socket> setHostname = new e<>(null, "setHostname", String.class);
        if (f()) {
            e eVar2 = new e(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            setAlpnProtocols = new e<>(null, "setAlpnProtocols", byte[].class);
            eVar = eVar2;
        } else {
            eVar = null;
            setAlpnProtocols = null;
        }
        return new a(sslParametersClass, setUseSessionTickets, setHostname, eVar, setAlpnProtocols);
    }

    @Override // e.f0.k.f
    public e b(X509TrustManager trustManager) {
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            return new b(trustManager, method);
        } catch (NoSuchMethodException e2) {
            return super.b(trustManager);
        }
    }

    /* renamed from: e.f0.k.a$a  reason: collision with other inner class name */
    static final class C۰۱۲۲a extends e.f0.l.c {

        /* renamed from: a  reason: collision with root package name */
        private final Object f۴۰۱۶a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f۴۰۱۷b;

        C۰۱۲۲a(Object x509TrustManagerExtensions, Method checkServerTrusted) {
            this.f۴۰۱۶a = x509TrustManagerExtensions;
            this.f۴۰۱۷b = checkServerTrusted;
        }

        @Override // e.f0.l.c
        public List<Certificate> a(List<Certificate> chain, String hostname) {
            try {
                return (List) this.f۴۰۱۷b.invoke(this.f۴۰۱۶a, (X509Certificate[]) chain.toArray(new X509Certificate[chain.size()]), "RSA", hostname);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException exception = new SSLPeerUnverifiedException(e2.getMessage());
                exception.initCause(e2);
                throw exception;
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        public boolean equals(Object other) {
            return other instanceof C۰۱۲۲a;
        }

        public int hashCode() {
            return 0;
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Method f۴۰۲۰a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f۴۰۲۱b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f۴۰۲۲c;

        c(Method getMethod, Method openMethod, Method warnIfOpenMethod) {
            this.f۴۰۲۰a = getMethod;
            this.f۴۰۲۱b = openMethod;
            this.f۴۰۲۲c = warnIfOpenMethod;
        }

        /* access modifiers changed from: package-private */
        public Object a(String closer) {
            Method method = this.f۴۰۲۰a;
            if (method != null) {
                try {
                    Object closeGuardInstance = method.invoke(null, new Object[0]);
                    this.f۴۰۲۱b.invoke(closeGuardInstance, closer);
                    return closeGuardInstance;
                } catch (Exception e2) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Object closeGuardInstance) {
            if (closeGuardInstance == null) {
                return false;
            }
            try {
                this.f۴۰۲۲c.invoke(closeGuardInstance, new Object[0]);
                return true;
            } catch (Exception e2) {
                return false;
            }
        }

        static c a() {
            Method openMethod;
            Method getMethod;
            Method warnIfOpenMethod;
            try {
                Class<?> closeGuardClass = Class.forName("dalvik.system.CloseGuard");
                getMethod = closeGuardClass.getMethod("get", new Class[0]);
                openMethod = closeGuardClass.getMethod("open", String.class);
                warnIfOpenMethod = closeGuardClass.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception e2) {
                getMethod = null;
                openMethod = null;
                warnIfOpenMethod = null;
            }
            return new c(getMethod, openMethod, warnIfOpenMethod);
        }
    }

    static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f۴۰۱۸a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f۴۰۱۹b;

        b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            this.f۴۰۱۹b = findByIssuerAndSignatureMethod;
            this.f۴۰۱۸a = trustManager;
        }

        @Override // e.f0.l.e
        public X509Certificate a(X509Certificate cert) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f۴۰۱۹b.invoke(this.f۴۰۱۸a, cert);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e2) {
                throw e.f0.c.a("unable to get issues and signature", (Exception) e2);
            } catch (InvocationTargetException e3) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b that = (b) obj;
            if (!this.f۴۰۱۸a.equals(that.f۴۰۱۸a) || !this.f۴۰۱۹b.equals(that.f۴۰۱۹b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f۴۰۱۸a.hashCode() + (this.f۴۰۱۹b.hashCode() * 31);
        }
    }
}
