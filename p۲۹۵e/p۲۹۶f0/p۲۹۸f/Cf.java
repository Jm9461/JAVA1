package p۲۹۵e.p۲۹۶f0.p۲۹۸f;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Route;
import p۲۹۵e.AbstractCp;
import p۲۹۵e.Ca;
import p۲۹۵e.Cc0;
import p۲۹۵e.Cs;
import p۲۹۵e.InterfaceCe;
import p۲۹۵e.p۲۹۶f0.Cc;

/* renamed from: e.f0.f.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cf {

    /* renamed from: a, reason: contains not printable characters */
    private final Ca f۱۵۷۹۴a;

    /* renamed from: b, reason: contains not printable characters */
    private final Cd f۱۵۷۹۵b;

    /* renamed from: c, reason: contains not printable characters */
    private final InterfaceCe f۱۵۷۹۶c;

    /* renamed from: d, reason: contains not printable characters */
    private final AbstractCp f۱۵۷۹۷d;

    /* renamed from: f, reason: contains not printable characters */
    private int f۱۵۷۹۹f;

    /* renamed from: e, reason: contains not printable characters */
    private List<Proxy> f۱۵۷۹۸e = Collections.emptyList();

    /* renamed from: g, reason: contains not printable characters */
    private List<InetSocketAddress> f۱۵۸۰۰g = Collections.emptyList();

    /* renamed from: h, reason: contains not printable characters */
    private final List<Cc0> f۱۵۸۰۱h = new ArrayList();

    public Cf(Ca address, Cd routeDatabase, InterfaceCe call, AbstractCp eventListener) {
        this.f۱۵۷۹۴a = address;
        this.f۱۵۷۹۵b = routeDatabase;
        this.f۱۵۷۹۶c = call;
        this.f۱۵۷۹۷d = eventListener;
        m۱۶۶۴۵a(address.m۱۶۴۲۲k(), address.m۱۶۴۱۷f());
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۶۶۵۰a() {
        return m۱۶۶۴۷c() || !this.f۱۵۸۰۱h.isEmpty();
    }

    /* renamed from: b, reason: contains not printable characters */
    public a m۱۶۶۵۱b() {
        if (!m۱۶۶۵۰a()) {
            throw new NoSuchElementException();
        }
        List<Route> routes = new ArrayList<>();
        while (m۱۶۶۴۷c()) {
            Proxy proxy = m۱۶۶۴۸d();
            int size = this.f۱۵۸۰۰g.size();
            for (int i = 0; i < size; i++) {
                Cc0 route = new Cc0(this.f۱۵۷۹۴a, proxy, this.f۱۵۸۰۰g.get(i));
                if (this.f۱۵۷۹۵b.m۱۶۶۴۰c(route)) {
                    this.f۱۵۸۰۱h.add(route);
                } else {
                    routes.add(route);
                }
            }
            if (!routes.isEmpty()) {
                break;
            }
        }
        if (routes.isEmpty()) {
            routes.addAll(this.f۱۵۸۰۱h);
            this.f۱۵۸۰۱h.clear();
        }
        return new a(routes);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۶۴۹a(Cc0 failedRoute, IOException failure) {
        if (failedRoute.m۱۶۴۹۰b().type() != Proxy.Type.DIRECT && this.f۱۵۷۹۴a.m۱۶۴۱۹h() != null) {
            this.f۱۵۷۹۴a.m۱۶۴۱۹h().connectFailed(this.f۱۵۷۹۴a.m۱۶۴۲۲k().m۱۷۱۶۲n(), failedRoute.m۱۶۴۹۰b().address(), failure);
        }
        this.f۱۵۷۹۵b.m۱۶۶۳۹b(failedRoute);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۶۶۴۵a(Cs url, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.f۱۵۷۹۸e = Collections.singletonList(proxy);
        } else {
            List<Proxy> proxiesOrNull = this.f۱۵۷۹۴a.m۱۶۴۱۹h().select(url.m۱۷۱۶۲n());
            if (proxiesOrNull != null && !proxiesOrNull.isEmpty()) {
                list = Cc.m۱۶۵۳۸a(proxiesOrNull);
            } else {
                list = Cc.m۱۶۵۳۹a(Proxy.NO_PROXY);
            }
            this.f۱۵۷۹۸e = list;
        }
        this.f۱۵۷۹۹f = 0;
    }

    /* renamed from: c, reason: contains not printable characters */
    private boolean m۱۶۶۴۷c() {
        return this.f۱۵۷۹۹f < this.f۱۵۷۹۸e.size();
    }

    /* renamed from: d, reason: contains not printable characters */
    private Proxy m۱۶۶۴۸d() {
        if (!m۱۶۶۴۷c()) {
            throw new SocketException("No route to " + this.f۱۵۷۹۴a.m۱۶۴۲۲k().m۱۷۱۵۵g() + "; exhausted proxy configurations: " + this.f۱۵۷۹۸e);
        }
        List<Proxy> list = this.f۱۵۷۹۸e;
        int i = this.f۱۵۷۹۹f;
        this.f۱۵۷۹۹f = i + 1;
        Proxy result = list.get(i);
        m۱۶۶۴۶a(result);
        return result;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۶۶۴۶a(Proxy proxy) {
        String socketHost;
        int socketPort;
        this.f۱۵۸۰۰g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            socketHost = this.f۱۵۷۹۴a.m۱۶۴۲۲k().m۱۷۱۵۵g();
            socketPort = this.f۱۵۷۹۴a.m۱۶۴۲۲k().m۱۷۱۵۸j();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass());
            }
            InetSocketAddress proxySocketAddress = (InetSocketAddress) proxyAddress;
            socketHost = m۱۶۶۴۴a(proxySocketAddress);
            socketPort = proxySocketAddress.getPort();
        }
        if (socketPort < 1 || socketPort > 65535) {
            throw new SocketException("No route to " + socketHost + ":" + socketPort + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f۱۵۸۰۰g.add(InetSocketAddress.createUnresolved(socketHost, socketPort));
            return;
        }
        this.f۱۵۷۹۷d.m۱۷۰۹۸a(this.f۱۵۷۹۶c, socketHost);
        List<InetAddress> addresses = this.f۱۵۷۹۴a.m۱۶۴۱۴c().mo۱۷۰۸۹a(socketHost);
        if (addresses.isEmpty()) {
            throw new UnknownHostException(this.f۱۵۷۹۴a.m۱۶۴۱۴c() + " returned no addresses for " + socketHost);
        }
        this.f۱۵۷۹۷d.m۱۷۰۹۹a(this.f۱۵۷۹۶c, socketHost, addresses);
        int size = addresses.size();
        for (int i = 0; i < size; i++) {
            InetAddress inetAddress = addresses.get(i);
            this.f۱۵۸۰۰g.add(new InetSocketAddress(inetAddress, socketPort));
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static String m۱۶۶۴۴a(InetSocketAddress socketAddress) {
        InetAddress address = socketAddress.getAddress();
        if (address == null) {
            return socketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    /* renamed from: e.f0.f.f$a */
    public static final class a {

        /* renamed from: a, reason: contains not printable characters */
        private final List<Cc0> f۱۵۸۰۲a;

        /* renamed from: b, reason: contains not printable characters */
        private int f۱۵۸۰۳b = 0;

        a(List<Cc0> list) {
            this.f۱۵۸۰۲a = list;
        }

        /* renamed from: b, reason: contains not printable characters */
        public boolean m۱۶۶۵۳b() {
            return this.f۱۵۸۰۳b < this.f۱۵۸۰۲a.size();
        }

        /* renamed from: c, reason: contains not printable characters */
        public Cc0 m۱۶۶۵۴c() {
            if (!m۱۶۶۵۳b()) {
                throw new NoSuchElementException();
            }
            List<Cc0> list = this.f۱۵۸۰۲a;
            int i = this.f۱۵۸۰۳b;
            this.f۱۵۸۰۳b = i + 1;
            return list.get(i);
        }

        /* renamed from: a, reason: contains not printable characters */
        public List<Cc0> m۱۶۶۵۲a() {
            return new ArrayList(this.f۱۵۸۰۲a);
        }
    }
}
