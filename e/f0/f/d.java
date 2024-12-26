package e.f0.f;

import e.c0;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<c0> f۳۸۰۴a = new LinkedHashSet();

    public synchronized void b(c0 failedRoute) {
        this.f۳۸۰۴a.add(failedRoute);
    }

    public synchronized void a(c0 route) {
        this.f۳۸۰۴a.remove(route);
    }

    public synchronized boolean c(c0 route) {
        return this.f۳۸۰۴a.contains(route);
    }
}
