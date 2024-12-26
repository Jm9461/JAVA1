package p۱۳۹e.p۱۴۰f0.p۱۴۲f;

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
import p۱۳۹e.AbstractCe;
import p۱۳۹e.AbstractCp;
import p۱۳۹e.Cc0;
import p۱۳۹e.Cs;
import p۱۳۹e.p۱۴۰f0.Cc;

/* renamed from: e.f0.f.f  reason: invalid class name */
public final class Cf {

    /* renamed from: a  reason: contains not printable characters */
    private final p۱۳۹e.Ca f۱۵۷۹۴a;

    /* renamed from: b  reason: contains not printable characters */
    private final Cd f۱۵۷۹۵b;

    /* renamed from: c  reason: contains not printable characters */
    private final AbstractCe f۱۵۷۹۶c;

    /* renamed from: d  reason: contains not printable characters */
    private final AbstractCp f۱۵۷۹۷d;

    /* renamed from: e  reason: contains not printable characters */
    private List<Proxy> f۱۵۷۹۸e = Collections.emptyList();

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۵۷۹۹f;

    /* renamed from: g  reason: contains not printable characters */
    private List<InetSocketAddress> f۱۵۸۰۰g = Collections.emptyList();

    /* renamed from: h  reason: contains not printable characters */
    private final List<Cc0> f۱۵۸۰۱h = new ArrayList();

    public Cf(p۱۳۹e.Ca address, Cd routeDatabase, AbstractCe call, AbstractCp eventListener) {
        this.f۱۵۷۹۴a = address;
        this.f۱۵۷۹۵b = routeDatabase;
        this.f۱۵۷۹۶c = call;
        this.f۱۵۷۹۷d = eventListener;
        m۱۸۷۲۴a(address.m۱۸۵۰۱k(), address.m۱۸۴۹۶f());
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۷۲۹a() {
        return m۱۸۷۲۶c() || !this.f۱۵۸۰۱h.isEmpty();
    }

    /* renamed from: b  reason: contains not printable characters */
    public Ca m۱۸۷۳۰b() {
        if (m۱۸۷۲۹a()) {
            List<Route> routes = new ArrayList<>();
            while (m۱۸۷۲۶c()) {
                Proxy proxy = m۱۸۷۲۷d();
                int size = this.f۱۵۸۰۰g.size();
                for (int i = 0; i < size; i++) {
                    Cc0 route = new Cc0(this.f۱۵۷۹۴a, proxy, this.f۱۵۸۰۰g.get(i));
                    if (this.f۱۵۷۹۵b.m۱۸۷۱۹c(route)) {
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
            return new Ca(routes);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۷۲۸a(Cc0 failedRoute, IOException failure) {
        if (!(failedRoute.m۱۸۵۶۹b().type() == Proxy.Type.DIRECT || this.f۱۵۷۹۴a.m۱۸۴۹۸h() == null)) {
            this.f۱۵۷۹۴a.m۱۸۴۹۸h().connectFailed(this.f۱۵۷۹۴a.m۱۸۵۰۱k().m۱۹۲۴۱n(), failedRoute.m۱۸۵۶۹b().address(), failure);
        }
        this.f۱۵۷۹۵b.m۱۸۷۱۸b(failedRoute);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۷۲۴a(Cs url, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.f۱۵۷۹۸e = Collections.singletonList(proxy);
        } else {
            List<Proxy> proxiesOrNull = this.f۱۵۷۹۴a.m۱۸۴۹۸h().select(url.m۱۹۲۴۱n());
            if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
                list = Cc.m۱۸۶۱۸a(Proxy.NO_PROXY);
            } else {
                list = Cc.m۱۸۶۱۷a(proxiesOrNull);
            }
            this.f۱۵۷۹۸e = list;
        }
        this.f۱۵۷۹۹f = 0;
    }

    /* renamed from: c  reason: contains not printable characters */
    private boolean m۱۸۷۲۶c() {
        return this.f۱۵۷۹۹f < this.f۱۵۷۹۸e.size();
    }

    /* renamed from: d  reason: contains not printable characters */
    private Proxy m۱۸۷۲۷d() {
        if (m۱۸۷۲۶c()) {
            List<Proxy> list = this.f۱۵۷۹۸e;
            int i = this.f۱۵۷۹۹f;
            this.f۱۵۷۹۹f = i + 1;
            Proxy result = list.get(i);
            m۱۸۷۲۵a(result);
            return result;
        }
        throw new SocketException("No route to " + this.f۱۵۷۹۴a.m۱۸۵۰۱k().m۱۹۲۳۴g() + "; exhausted proxy configurations: " + this.f۱۵۷۹۸e);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۷۲۵a(Proxy proxy) {
        String socketHost;
        int socketPort;
        this.f۱۵۸۰۰g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            socketHost = this.f۱۵۷۹۴a.m۱۸۵۰۱k().m۱۹۲۳۴g();
            socketPort = this.f۱۵۷۹۴a.m۱۸۵۰۱k().m۱۹۲۳۷j();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (proxyAddress instanceof InetSocketAddress) {
                InetSocketAddress proxySocketAddress = (InetSocketAddress) proxyAddress;
                socketHost = m۱۸۷۲۳a(proxySocketAddress);
                socketPort = proxySocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass());
            }
        }
        if (socketPort < 1 || socketPort > 65535) {
            throw new SocketException("No route to " + socketHost + ":" + socketPort + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f۱۵۸۰۰g.add(InetSocketAddress.createUnresolved(socketHost, socketPort));
        } else {
            this.f۱۵۷۹۷d.m۱۹۱۷۷a(this.f۱۵۷۹۶c, socketHost);
            List<InetAddress> addresses = this.f۱۵۷۹۴a.m۱۸۴۹۳c().m۱۹۱۶۷a(socketHost);
            if (!addresses.isEmpty()) {
                this.f۱۵۷۹۷d.m۱۹۱۷۸a(this.f۱۵۷۹۶c, socketHost, addresses);
                int size = addresses.size();
                for (int i = 0; i < size; i++) {
                    this.f۱۵۸۰۰g.add(new InetSocketAddress(addresses.get(i), socketPort));
                }
                return;
            }
            throw new UnknownHostException(this.f۱۵۷۹۴a.m۱۸۴۹۳c() + " returned no addresses for " + socketHost);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static String m۱۸۷۲۳a(InetSocketAddress socketAddress) {
        InetAddress address = socketAddress.getAddress();
        if (address == null) {
            return socketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    /* renamed from: e.f0.f.f$a  reason: invalid class name */
    public static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        private final List<Cc0> f۱۵۸۰۲a;

        /* renamed from: b  reason: contains not printable characters */
        private int f۱۵۸۰۳b = 0;

        Ca(List<Cc0> list) {
            this.f۱۵۸۰۲a = list;
        }

        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۸۷۳۲b() {
            return this.f۱۵۸۰۳b < this.f۱۵۸۰۲a.size();
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cc0 m۱۸۷۳۳c() {
            if (m۱۸۷۳۲b()) {
                List<Cc0> list = this.f۱۵۸۰۲a;
                int i = this.f۱۵۸۰۳b;
                this.f۱۵۸۰۳b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }

        /* renamed from: a  reason: contains not printable characters */
        public List<Cc0> m۱۸۷۳۱a() {
            return new ArrayList(this.f۱۵۸۰۲a);
        }
    }
}
