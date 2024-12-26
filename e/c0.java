package e;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    final a f۳۷۱۵a;

    /* renamed from: b  reason: collision with root package name */
    final Proxy f۳۷۱۶b;

    /* renamed from: c  reason: collision with root package name */
    final InetSocketAddress f۳۷۱۷c;

    public c0(a address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (address == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f۳۷۱۵a = address;
            this.f۳۷۱۶b = proxy;
            this.f۳۷۱۷c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public a a() {
        return this.f۳۷۱۵a;
    }

    public Proxy b() {
        return this.f۳۷۱۶b;
    }

    public InetSocketAddress d() {
        return this.f۳۷۱۷c;
    }

    public boolean c() {
        return this.f۳۷۱۵a.i != null && this.f۳۷۱۶b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object other) {
        return (other instanceof c0) && ((c0) other).f۳۷۱۵a.equals(this.f۳۷۱۵a) && ((c0) other).f۳۷۱۶b.equals(this.f۳۷۱۶b) && ((c0) other).f۳۷۱۷c.equals(this.f۳۷۱۷c);
    }

    public int hashCode() {
        return (((((17 * 31) + this.f۳۷۱۵a.hashCode()) * 31) + this.f۳۷۱۶b.hashCode()) * 31) + this.f۳۷۱۷c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f۳۷۱۷c + "}";
    }
}
