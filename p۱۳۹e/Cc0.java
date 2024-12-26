package p۱۳۹e;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: e.c0  reason: invalid class name */
public final class Cc0 {

    /* renamed from: a  reason: contains not printable characters */
    final Ca f۱۵۶۶۹a;

    /* renamed from: b  reason: contains not printable characters */
    final Proxy f۱۵۶۷۰b;

    /* renamed from: c  reason: contains not printable characters */
    final InetSocketAddress f۱۵۶۷۱c;

    public Cc0(Ca address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (address == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f۱۵۶۶۹a = address;
            this.f۱۵۶۷۰b = proxy;
            this.f۱۵۶۷۱c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۸۵۶۸a() {
        return this.f۱۵۶۶۹a;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Proxy m۱۸۵۶۹b() {
        return this.f۱۵۶۷۰b;
    }

    /* renamed from: d  reason: contains not printable characters */
    public InetSocketAddress m۱۸۵۷۱d() {
        return this.f۱۵۶۷۱c;
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۸۵۷۰c() {
        return this.f۱۵۶۶۹a.f۱۵۶۰۷i != null && this.f۱۵۶۷۰b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object other) {
        return (other instanceof Cc0) && ((Cc0) other).f۱۵۶۶۹a.equals(this.f۱۵۶۶۹a) && ((Cc0) other).f۱۵۶۷۰b.equals(this.f۱۵۶۷۰b) && ((Cc0) other).f۱۵۶۷۱c.equals(this.f۱۵۶۷۱c);
    }

    public int hashCode() {
        return (((((17 * 31) + this.f۱۵۶۶۹a.hashCode()) * 31) + this.f۱۵۶۷۰b.hashCode()) * 31) + this.f۱۵۶۷۱c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f۱۵۶۷۱c + "}";
    }
}
