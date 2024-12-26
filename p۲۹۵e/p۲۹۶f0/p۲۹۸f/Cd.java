package p۲۹۵e.p۲۹۶f0.p۲۹۸f;

import java.util.LinkedHashSet;
import java.util.Set;
import p۲۹۵e.Cc0;

/* renamed from: e.f0.f.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cd {

    /* renamed from: a, reason: contains not printable characters */
    private final Set<Cc0> f۱۵۷۹۱a = new LinkedHashSet();

    /* renamed from: b, reason: contains not printable characters */
    public synchronized void m۱۶۶۳۹b(Cc0 failedRoute) {
        this.f۱۵۷۹۱a.add(failedRoute);
    }

    /* renamed from: a, reason: contains not printable characters */
    public synchronized void m۱۶۶۳۸a(Cc0 route) {
        this.f۱۵۷۹۱a.remove(route);
    }

    /* renamed from: c, reason: contains not printable characters */
    public synchronized boolean m۱۶۶۴۰c(Cc0 route) {
        return this.f۱۵۷۹۱a.contains(route);
    }
}
