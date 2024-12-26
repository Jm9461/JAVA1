package p۱۳۹e.p۱۴۰f0.p۱۴۷k;

import android.os.Build;
import android.util.Log;
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
import p۱۳۹e.EnumCw;
import p۱۳۹e.p۱۴۰f0.p۱۴۸l.AbstractCc;
import p۱۳۹e.p۱۴۰f0.p۱۴۸l.AbstractCe;

/* access modifiers changed from: package-private */
/* renamed from: e.f0.k.a  reason: invalid class name */
public class Ca extends Cf {

    /* renamed from: c  reason: contains not printable characters */
    private final Ce<Socket> f۱۶۰۴۵c;

    /* renamed from: d  reason: contains not printable characters */
    private final Ce<Socket> f۱۶۰۴۶d;

    /* renamed from: e  reason: contains not printable characters */
    private final Ce<Socket> f۱۶۰۴۷e;

    /* renamed from: f  reason: contains not printable characters */
    private final Ce<Socket> f۱۶۰۴۸f;

    /* renamed from: g  reason: contains not printable characters */
    private final Cc f۱۶۰۴۹g = Cc.m۱۹۰۶۱a();

    Ca(Class<?> cls, Ce<Socket> eVar, Ce<Socket> eVar2, Ce<Socket> eVar3, Ce<Socket> eVar4) {
        this.f۱۶۰۴۵c = eVar;
        this.f۱۶۰۴۶d = eVar2;
        this.f۱۶۰۴۷e = eVar3;
        this.f۱۶۰۴۸f = eVar4;
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۵۴a(Socket socket, InetSocketAddress address, int connectTimeout) {
        try {
            socket.connect(address, connectTimeout);
        } catch (AssertionError e) {
            if (p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۴a(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException ioException = new IOException("Exception in connect");
            ioException.initCause(e2);
            throw ioException;
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException ioException2 = new IOException("Exception in connect");
                ioException2.initCause(e3);
                throw ioException2;
            }
            throw e3;
        }
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۵۵a(SSLSocket sslSocket, String hostname, List<EnumCw> list) {
        if (hostname != null) {
            this.f۱۶۰۴۵c.m۱۹۰۸۱c(sslSocket, true);
            this.f۱۶۰۴۶d.m۱۹۰۸۱c(sslSocket, hostname);
        }
        Ce<Socket> eVar = this.f۱۶۰۴۸f;
        if (eVar != null && eVar.m۱۹۰۷۹a(sslSocket)) {
            this.f۱۶۰۴۸f.m۱۹۰۸۲d(sslSocket, Cf.m۱۹۰۸۴b(list));
        }
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: b  reason: contains not printable characters */
    public String m۱۹۰۵۷b(SSLSocket socket) {
        byte[] alpnResult;
        Ce<Socket> eVar = this.f۱۶۰۴۷e;
        if (eVar == null || !eVar.m۱۹۰۷۹a(socket) || (alpnResult = (byte[]) this.f۱۶۰۴۷e.m۱۹۰۸۲d(socket, new Object[0])) == null) {
            return null;
        }
        return new String(alpnResult, p۱۳۹e.p۱۴۰f0.Cc.f۱۵۷۰۶d);
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۵۲a(int level, String message, Throwable t) {
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

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۹۰۵۱a(String closer) {
        return this.f۱۶۰۴۹g.m۱۹۰۶۲a(closer);
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۵۳a(String message, Object stackTrace) {
        if (!this.f۱۶۰۴۹g.m۱۹۰۶۳a(stackTrace)) {
            m۱۹۰۵۲a(5, message, (Throwable) null);
        }
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۹۰۵۸b(String hostname) {
        try {
            Class<?> networkPolicyClass = Class.forName("android.security.NetworkSecurityPolicy");
            return m۱۹۰۴۷b(hostname, networkPolicyClass, networkPolicyClass.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            return super.m۱۹۰۹۹b(hostname);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            throw p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۱a("unable to determine cleartext support", e2);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۹۰۴۷b(String hostname, Class<?> networkPolicyClass, Object networkSecurityPolicy) {
        try {
            return ((Boolean) networkPolicyClass.getMethod("isCleartextTrafficPermitted", String.class).invoke(networkSecurityPolicy, hostname)).booleanValue();
        } catch (NoSuchMethodException e) {
            return m۱۹۰۴۶a(hostname, networkPolicyClass, networkSecurityPolicy);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۹۰۴۶a(String hostname, Class<?> networkPolicyClass, Object networkSecurityPolicy) {
        try {
            return ((Boolean) networkPolicyClass.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(networkSecurityPolicy, new Object[0])).booleanValue();
        } catch (NoSuchMethodException e) {
            return super.m۱۹۰۹۹b(hostname);
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private static boolean m۱۹۰۴۹f() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCc m۱۹۰۵۰a(X509TrustManager trustManager) {
        try {
            Class<?> extensionsClass = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new Ca(extensionsClass.getConstructor(X509TrustManager.class).newInstance(trustManager), extensionsClass.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception e) {
            return super.m۱۹۰۸۸a(trustManager);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public static Cf m۱۹۰۴۸c() {
        Class<?> sslParametersClass;
        OptionalMethod<Socket> setAlpnProtocols;
        Ce eVar;
        try {
            sslParametersClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException e) {
            try {
                sslParametersClass = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException e2) {
                return null;
            }
        }
        OptionalMethod<Socket> setUseSessionTickets = new Ce<>(null, "setUseSessionTickets", Boolean.TYPE);
        OptionalMethod<Socket> setHostname = new Ce<>(null, "setHostname", String.class);
        if (m۱۹۰۴۹f()) {
            Ce eVar2 = new Ce(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            setAlpnProtocols = new Ce<>(null, "setAlpnProtocols", byte[].class);
            eVar = eVar2;
        } else {
            eVar = null;
            setAlpnProtocols = null;
        }
        return new Ca(sslParametersClass, setUseSessionTickets, setHostname, eVar, setAlpnProtocols);
    }

    @Override // p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf
    /* renamed from: b  reason: contains not printable characters */
    public AbstractCe m۱۹۰۵۶b(X509TrustManager trustManager) {
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            return new Cb(trustManager, method);
        } catch (NoSuchMethodException e) {
            return super.m۱۹۰۹۶b(trustManager);
        }
    }

    /* renamed from: e.f0.k.a$a  reason: invalid class name */
    static final class Ca extends AbstractCc {

        /* renamed from: a  reason: contains not printable characters */
        private final Object f۱۶۰۵۰a;

        /* renamed from: b  reason: contains not printable characters */
        private final Method f۱۶۰۵۱b;

        Ca(Object x509TrustManagerExtensions, Method checkServerTrusted) {
            this.f۱۶۰۵۰a = x509TrustManagerExtensions;
            this.f۱۶۰۵۱b = checkServerTrusted;
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۸l.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public List<Certificate> m۱۹۰۵۹a(List<Certificate> chain, String hostname) {
            try {
                return (List) this.f۱۶۰۵۱b.invoke(this.f۱۶۰۵۰a, (X509Certificate[]) chain.toArray(new X509Certificate[chain.size()]), "RSA", hostname);
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException exception = new SSLPeerUnverifiedException(e.getMessage());
                exception.initCause(e);
                throw exception;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public boolean equals(Object other) {
            return other instanceof Ca;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: e.f0.k.a$c  reason: invalid class name */
    static final class Cc {

        /* renamed from: a  reason: contains not printable characters */
        private final Method f۱۶۰۵۴a;

        /* renamed from: b  reason: contains not printable characters */
        private final Method f۱۶۰۵۵b;

        /* renamed from: c  reason: contains not printable characters */
        private final Method f۱۶۰۵۶c;

        Cc(Method getMethod, Method openMethod, Method warnIfOpenMethod) {
            this.f۱۶۰۵۴a = getMethod;
            this.f۱۶۰۵۵b = openMethod;
            this.f۱۶۰۵۶c = warnIfOpenMethod;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public Object m۱۹۰۶۲a(String closer) {
            Method method = this.f۱۶۰۵۴a;
            if (method != null) {
                try {
                    Object closeGuardInstance = method.invoke(null, new Object[0]);
                    this.f۱۶۰۵۵b.invoke(closeGuardInstance, closer);
                    return closeGuardInstance;
                } catch (Exception e) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۹۰۶۳a(Object closeGuardInstance) {
            if (closeGuardInstance == null) {
                return false;
            }
            try {
                this.f۱۶۰۵۶c.invoke(closeGuardInstance, new Object[0]);
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        static Cc m۱۹۰۶۱a() {
            Method openMethod;
            Method getMethod;
            Method warnIfOpenMethod;
            try {
                Class<?> closeGuardClass = Class.forName("dalvik.system.CloseGuard");
                getMethod = closeGuardClass.getMethod("get", new Class[0]);
                openMethod = closeGuardClass.getMethod("open", String.class);
                warnIfOpenMethod = closeGuardClass.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception e) {
                getMethod = null;
                openMethod = null;
                warnIfOpenMethod = null;
            }
            return new Cc(getMethod, openMethod, warnIfOpenMethod);
        }
    }

    /* renamed from: e.f0.k.a$b  reason: invalid class name */
    static final class Cb implements AbstractCe {

        /* renamed from: a  reason: contains not printable characters */
        private final X509TrustManager f۱۶۰۵۲a;

        /* renamed from: b  reason: contains not printable characters */
        private final Method f۱۶۰۵۳b;

        Cb(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            this.f۱۶۰۵۳b = findByIssuerAndSignatureMethod;
            this.f۱۶۰۵۲a = trustManager;
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۸l.AbstractCe
        /* renamed from: a  reason: contains not printable characters */
        public X509Certificate m۱۹۰۶۰a(X509Certificate cert) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f۱۶۰۵۳b.invoke(this.f۱۶۰۵۲a, cert);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۱a("unable to get issues and signature", (Exception) e);
            } catch (InvocationTargetException e2) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Cb)) {
                return false;
            }
            Cb that = (Cb) obj;
            if (!this.f۱۶۰۵۲a.equals(that.f۱۶۰۵۲a) || !this.f۱۶۰۵۳b.equals(that.f۱۶۰۵۳b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f۱۶۰۵۲a.hashCode() + (this.f۱۶۰۵۳b.hashCode() * 31);
        }
    }
}
