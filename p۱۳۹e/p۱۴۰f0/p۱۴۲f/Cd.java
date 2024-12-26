package p۱۳۹e.p۱۴۰f0.p۱۴۲f;

import java.util.LinkedHashSet;
import java.util.Set;
import p۱۳۹e.Cc0;

/* renamed from: e.f0.f.d  reason: invalid class name */
public final class Cd {

    /* renamed from: a  reason: contains not printable characters */
    private final Set<Cc0> f۱۵۷۹۱a = new LinkedHashSet();

    /* renamed from: b  reason: contains not printable characters */
    public synchronized void m۱۸۷۱۸b(Cc0 failedRoute) {
        this.f۱۵۷۹۱a.add(failedRoute);
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۸۷۱۷a(Cc0 route) {
        this.f۱۵۷۹۱a.remove(route);
    }

    /* renamed from: c  reason: contains not printable characters */
    public synchronized boolean m۱۸۷۱۹c(Cc0 route) {
        return this.f۱۵۷۹۱a.contains(route);
    }
}
