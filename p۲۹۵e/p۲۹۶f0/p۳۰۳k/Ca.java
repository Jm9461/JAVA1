package p۲۹۵e.p۲۹۶f0.p۳۰۳k;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Constructor;
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
import p۲۹۵e.EnumCw;
import p۲۹۵e.p۲۹۶f0.Cc;
import p۲۹۵e.p۲۹۶f0.p۳۰۴l.AbstractCc;
import p۲۹۵e.p۲۹۶f0.p۳۰۴l.InterfaceCe;

/* renamed from: e.f0.k.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ca extends Cf {

    /* renamed from: c, reason: contains not printable characters */
    private final Ce<Socket> f۱۶۰۴۵c;

    /* renamed from: d, reason: contains not printable characters */
    private final Ce<Socket> f۱۶۰۴۶d;

    /* renamed from: e, reason: contains not printable characters */
    private final Ce<Socket> f۱۶۰۴۷e;

    /* renamed from: f, reason: contains not printable characters */
    private final Ce<Socket> f۱۶۰۴۸f;

    /* renamed from: g, reason: contains not printable characters */
    private final c f۱۶۰۴۹g = c.m۱۶۹۸۲a();

    /* JADX WARN: Generic types in debug info not equals: e.f0.k.e != okhttp3.internal.platform.OptionalMethod<java.net.Socket> */
    Ca(Class<?> sslParametersClass, Ce<Socket> ce, Ce<Socket> ce2, Ce<Socket> ce3, Ce<Socket> ce4) {
        this.f۱۶۰۴۵c = ce;
        this.f۱۶۰۴۶d = ce2;
        this.f۱۶۰۴۷e = ce3;
        this.f۱۶۰۴۸f = ce4;
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۴a(Socket socket, InetSocketAddress address, int connectTimeout) {
        try {
            socket.connect(address, connectTimeout);
        } catch (AssertionError e2) {
            if (!Cc.m۱۶۵۴۵a(e2)) {
                throw e2;
            }
            throw new IOException(e2);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException ioException = new IOException("Exception in connect");
                ioException.initCause(e3);
                throw ioException;
            }
            throw e3;
        } catch (SecurityException e4) {
            IOException ioException2 = new IOException("Exception in connect");
            ioException2.initCause(e4);
            throw ioException2;
        }
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۶a(SSLSocket sslSocket, String hostname, List<EnumCw> list) {
        if (hostname != null) {
            this.f۱۶۰۴۵c.m۱۷۰۰۲c(sslSocket, true);
            this.f۱۶۰۴۶d.m۱۷۰۰۲c(sslSocket, hostname);
        }
        Ce<Socket> ce = this.f۱۶۰۴۸f;
        if (ce != null && ce.m۱۷۰۰۰a((Ce<Socket>) sslSocket)) {
            Object[] parameters = {Cf.m۱۷۰۰۵b(list)};
            this.f۱۶۰۴۸f.m۱۷۰۰۳d(sslSocket, parameters);
        }
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: b, reason: contains not printable characters */
    public String mo۱۷۰۱۸b(SSLSocket socket) {
        byte[] alpnResult;
        Ce<Socket> ce = this.f۱۶۰۴۷e;
        if (ce == null || !ce.m۱۷۰۰۰a((Ce<Socket>) socket) || (alpnResult = (byte[]) this.f۱۶۰۴۷e.m۱۷۰۰۳d(socket, new Object[0])) == null) {
            return null;
        }
        return new String(alpnResult, Cc.f۱۵۷۰۶d);
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۲a(int level, String message, Throwable t) {
        int logLevel = level != 5 ? 3 : 5;
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

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: a, reason: contains not printable characters */
    public Object mo۱۷۰۱۰a(String closer) {
        return this.f۱۶۰۴۹g.m۱۶۹۸۳a(closer);
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۰۱۳a(String message, Object stackTrace) {
        boolean reported = this.f۱۶۰۴۹g.m۱۶۹۸۴a(stackTrace);
        if (!reported) {
            mo۱۷۰۱۲a(5, message, (Throwable) null);
        }
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۷۰۲۰b(String hostname) {
        try {
            Class<?> networkPolicyClass = Class.forName("android.security.NetworkSecurityPolicy");
            Method getInstanceMethod = networkPolicyClass.getMethod("getInstance", new Class[0]);
            Object networkSecurityPolicy = getInstanceMethod.invoke(null, new Object[0]);
            return m۱۶۹۶۸b(hostname, networkPolicyClass, networkSecurityPolicy);
        } catch (ClassNotFoundException e2) {
            return super.mo۱۷۰۲۰b(hostname);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw Cc.m۱۶۵۳۲a("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e4) {
            e = e4;
            throw Cc.m۱۶۵۳۲a("unable to determine cleartext support", e);
        } catch (NoSuchMethodException e5) {
            return super.mo۱۷۰۲۰b(hostname);
        } catch (InvocationTargetException e6) {
            e = e6;
            throw Cc.m۱۶۵۳۲a("unable to determine cleartext support", e);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۶۹۶۸b(String hostname, Class<?> networkPolicyClass, Object networkSecurityPolicy) {
        try {
            Method isCleartextTrafficPermittedMethod = networkPolicyClass.getMethod("isCleartextTrafficPermitted", String.class);
            return ((Boolean) isCleartextTrafficPermittedMethod.invoke(networkSecurityPolicy, hostname)).booleanValue();
        } catch (NoSuchMethodException e2) {
            return m۱۶۹۶۷a(hostname, networkPolicyClass, networkSecurityPolicy);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۶۹۶۷a(String hostname, Class<?> networkPolicyClass, Object networkSecurityPolicy) {
        try {
            Method isCleartextTrafficPermittedMethod = networkPolicyClass.getMethod("isCleartextTrafficPermitted", new Class[0]);
            return ((Boolean) isCleartextTrafficPermittedMethod.invoke(networkSecurityPolicy, new Object[0])).booleanValue();
        } catch (NoSuchMethodException e2) {
            return super.mo۱۷۰۲۰b(hostname);
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    private static boolean m۱۶۹۷۰f() {
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

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCc mo۱۷۰۰۹a(X509TrustManager trustManager) {
        try {
            Class<?> extensionsClass = Class.forName("android.net.http.X509TrustManagerExtensions");
            Constructor<?> constructor = extensionsClass.getConstructor(X509TrustManager.class);
            Object extensions = constructor.newInstance(trustManager);
            Method checkServerTrusted = extensionsClass.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
            return new a(extensions, checkServerTrusted);
        } catch (Exception e2) {
            return super.mo۱۷۰۰۹a(trustManager);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: e.f0.k.e != okhttp3.internal.platform.OptionalMethod<java.net.Socket> */
    /* renamed from: c, reason: contains not printable characters */
    public static Cf m۱۶۹۶۹c() {
        Class<?> sslParametersClass;
        Ce ce;
        Ce ce2;
        try {
            try {
                sslParametersClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException e2) {
                sslParametersClass = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Ce ce3 = new Ce(null, "setUseSessionTickets", Boolean.TYPE);
            Ce ce4 = new Ce(null, "setHostname", String.class);
            if (!m۱۶۹۷۰f()) {
                ce = null;
                ce2 = null;
            } else {
                Ce ce5 = new Ce(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                ce2 = new Ce(null, "setAlpnProtocols", byte[].class);
                ce = ce5;
            }
            return new Ca(sslParametersClass, ce3, ce4, ce, ce2);
        } catch (ClassNotFoundException e3) {
            return null;
        }
    }

    @Override // p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf
    /* renamed from: b, reason: contains not printable characters */
    public InterfaceCe mo۱۷۰۱۷b(X509TrustManager trustManager) {
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            return new b(trustManager, method);
        } catch (NoSuchMethodException e2) {
            return super.mo۱۷۰۱۷b(trustManager);
        }
    }

    /* renamed from: e.f0.k.a$a */
    static final class a extends AbstractCc {

        /* renamed from: a, reason: contains not printable characters */
        private final Object f۱۶۰۵۰a;

        /* renamed from: b, reason: contains not printable characters */
        private final Method f۱۶۰۵۱b;

        a(Object x509TrustManagerExtensions, Method checkServerTrusted) {
            this.f۱۶۰۵۰a = x509TrustManagerExtensions;
            this.f۱۶۰۵۱b = checkServerTrusted;
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۴l.AbstractCc
        /* renamed from: a, reason: contains not printable characters */
        public List<Certificate> mo۱۷۰۲۵a(List<Certificate> chain, String hostname) {
            try {
                X509Certificate[] certificates = (X509Certificate[]) chain.toArray(new X509Certificate[chain.size()]);
                return (List) this.f۱۶۰۵۱b.invoke(this.f۱۶۰۵۰a, certificates, "RSA", hostname);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                SSLPeerUnverifiedException exception = new SSLPeerUnverifiedException(e3.getMessage());
                exception.initCause(e3);
                throw exception;
            }
        }

        public boolean equals(Object other) {
            return other instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: e.f0.k.a$c */
    static final class c {

        /* renamed from: a, reason: contains not printable characters */
        private final Method f۱۶۰۵۴a;

        /* renamed from: b, reason: contains not printable characters */
        private final Method f۱۶۰۵۵b;

        /* renamed from: c, reason: contains not printable characters */
        private final Method f۱۶۰۵۶c;

        c(Method getMethod, Method openMethod, Method warnIfOpenMethod) {
            this.f۱۶۰۵۴a = getMethod;
            this.f۱۶۰۵۵b = openMethod;
            this.f۱۶۰۵۶c = warnIfOpenMethod;
        }

        /* renamed from: a, reason: contains not printable characters */
        Object m۱۶۹۸۳a(String closer) {
            Method method = this.f۱۶۰۵۴a;
            if (method != null) {
                try {
                    Object closeGuardInstance = method.invoke(null, new Object[0]);
                    this.f۱۶۰۵۵b.invoke(closeGuardInstance, closer);
                    return closeGuardInstance;
                } catch (Exception e2) {
                }
            }
            return null;
        }

        /* renamed from: a, reason: contains not printable characters */
        boolean m۱۶۹۸۴a(Object closeGuardInstance) {
            if (closeGuardInstance == null) {
                return false;
            }
            try {
                this.f۱۶۰۵۶c.invoke(closeGuardInstance, new Object[0]);
                return true;
            } catch (Exception e2) {
                return false;
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        static c m۱۶۹۸۲a() {
            Method getMethod;
            Method openMethod;
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

    /* renamed from: e.f0.k.a$b */
    static final class b implements InterfaceCe {

        /* renamed from: a, reason: contains not printable characters */
        private final X509TrustManager f۱۶۰۵۲a;

        /* renamed from: b, reason: contains not printable characters */
        private final Method f۱۶۰۵۳b;

        b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            this.f۱۶۰۵۳b = findByIssuerAndSignatureMethod;
            this.f۱۶۰۵۲a = trustManager;
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۴l.InterfaceCe
        /* renamed from: a, reason: contains not printable characters */
        public X509Certificate mo۱۷۰۳۲a(X509Certificate cert) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f۱۶۰۵۳b.invoke(this.f۱۶۰۵۲a, cert);
                if (trustAnchor == null) {
                    return null;
                }
                return trustAnchor.getTrustedCert();
            } catch (IllegalAccessException e2) {
                throw Cc.m۱۶۵۳۲a("unable to get issues and signature", (Exception) e2);
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
            return this.f۱۶۰۵۲a.equals(that.f۱۶۰۵۲a) && this.f۱۶۰۵۳b.equals(that.f۱۶۰۵۳b);
        }

        public int hashCode() {
            return this.f۱۶۰۵۲a.hashCode() + (this.f۱۶۰۵۳b.hashCode() * 31);
        }
    }
}
