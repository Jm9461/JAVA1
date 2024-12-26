package e.f0.f;

import e.c0;
import e.e;
import e.f0.c;
import e.p;
import e.s;
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

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final e.a f۳۸۰۷a;

    /* renamed from: b  reason: collision with root package name */
    private final d f۳۸۰۸b;

    /* renamed from: c  reason: collision with root package name */
    private final e f۳۸۰۹c;

    /* renamed from: d  reason: collision with root package name */
    private final p f۳۸۱۰d;

    /* renamed from: e  reason: collision with root package name */
    private List<Proxy> f۳۸۱۱e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private int f۳۸۱۲f;

    /* renamed from: g  reason: collision with root package name */
    private List<InetSocketAddress> f۳۸۱۳g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    private final List<c0> f۳۸۱۴h = new ArrayList();

    public f(e.a address, d routeDatabase, e call, p eventListener) {
        this.f۳۸۰۷a = address;
        this.f۳۸۰۸b = routeDatabase;
        this.f۳۸۰۹c = call;
        this.f۳۸۱۰d = eventListener;
        a(address.k(), address.f());
    }

    public boolean a() {
        return c() || !this.f۳۸۱۴h.isEmpty();
    }

    public a b() {
        if (a()) {
            List<Route> routes = new ArrayList<>();
            while (c()) {
                Proxy proxy = d();
                int size = this.f۳۸۱۳g.size();
                for (int i = 0; i < size; i++) {
                    c0 route = new c0(this.f۳۸۰۷a, proxy, this.f۳۸۱۳g.get(i));
                    if (this.f۳۸۰۸b.c(route)) {
                        this.f۳۸۱۴h.add(route);
                    } else {
                        routes.add(route);
                    }
                }
                if (!routes.isEmpty()) {
                    break;
                }
            }
            if (routes.isEmpty()) {
                routes.addAll(this.f۳۸۱۴h);
                this.f۳۸۱۴h.clear();
            }
            return new a(routes);
        }
        throw new NoSuchElementException();
    }

    public void a(c0 failedRoute, IOException failure) {
        if (!(failedRoute.b().type() == Proxy.Type.DIRECT || this.f۳۸۰۷a.h() == null)) {
            this.f۳۸۰۷a.h().connectFailed(this.f۳۸۰۷a.k().n(), failedRoute.b().address(), failure);
        }
        this.f۳۸۰۸b.b(failedRoute);
    }

    private void a(s url, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.f۳۸۱۱e = Collections.singletonList(proxy);
        } else {
            List<Proxy> proxiesOrNull = this.f۳۸۰۷a.h().select(url.n());
            if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
                list = c.a(Proxy.NO_PROXY);
            } else {
                list = c.a(proxiesOrNull);
            }
            this.f۳۸۱۱e = list;
        }
        this.f۳۸۱۲f = 0;
    }

    private boolean c() {
        return this.f۳۸۱۲f < this.f۳۸۱۱e.size();
    }

    private Proxy d() {
        if (c()) {
            List<Proxy> list = this.f۳۸۱۱e;
            int i = this.f۳۸۱۲f;
            this.f۳۸۱۲f = i + 1;
            Proxy result = list.get(i);
            a(result);
            return result;
        }
        throw new SocketException("No route to " + this.f۳۸۰۷a.k().g() + "; exhausted proxy configurations: " + this.f۳۸۱۱e);
    }

    private void a(Proxy proxy) {
        String socketHost;
        int socketPort;
        this.f۳۸۱۳g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            socketHost = this.f۳۸۰۷a.k().g();
            socketPort = this.f۳۸۰۷a.k().j();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (proxyAddress instanceof InetSocketAddress) {
                InetSocketAddress proxySocketAddress = (InetSocketAddress) proxyAddress;
                socketHost = a(proxySocketAddress);
                socketPort = proxySocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass());
            }
        }
        if (socketPort < 1 || socketPort > 65535) {
            throw new SocketException("No route to " + socketHost + ":" + socketPort + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f۳۸۱۳g.add(InetSocketAddress.createUnresolved(socketHost, socketPort));
        } else {
            this.f۳۸۱۰d.a(this.f۳۸۰۹c, socketHost);
            List<InetAddress> addresses = this.f۳۸۰۷a.c().a(socketHost);
            if (!addresses.isEmpty()) {
                this.f۳۸۱۰d.a(this.f۳۸۰۹c, socketHost, addresses);
                int size = addresses.size();
                for (int i = 0; i < size; i++) {
                    this.f۳۸۱۳g.add(new InetSocketAddress(addresses.get(i), socketPort));
                }
                return;
            }
            throw new UnknownHostException(this.f۳۸۰۷a.c() + " returned no addresses for " + socketHost);
        }
    }

    static String a(InetSocketAddress socketAddress) {
        InetAddress address = socketAddress.getAddress();
        if (address == null) {
            return socketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<c0> f۳۸۱۵a;

        /* renamed from: b  reason: collision with root package name */
        private int f۳۸۱۶b = 0;

        a(List<c0> list) {
            this.f۳۸۱۵a = list;
        }

        public boolean b() {
            return this.f۳۸۱۶b < this.f۳۸۱۵a.size();
        }

        public c0 c() {
            if (b()) {
                List<c0> list = this.f۳۸۱۵a;
                int i = this.f۳۸۱۶b;
                this.f۳۸۱۶b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }

        public List<c0> a() {
            return new ArrayList(this.f۳۸۱۵a);
        }
    }
}
