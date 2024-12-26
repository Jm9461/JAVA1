package p۰۵۲b.p۰۶۲c.p۰۶۳a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: b.c.a.b  reason: invalid class name */
public abstract class AbstractCb {

    /* renamed from: a  reason: contains not printable characters */
    private final Set<String> f۱۲۶۰۵a = new HashSet(1);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۵۹۲۱a();

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۵۹۲۲a(String str);

    /* renamed from: a  reason: contains not printable characters */
    public final synchronized boolean m۱۵۹۲۴a(String permission, int result) {
        if (result == 0) {
            this.f۱۲۶۰۵a.remove(permission);
            if (!this.f۱۲۶۰۵a.isEmpty()) {
                return false;
            }
            m۱۵۹۲۱a();
            return true;
        }
        m۱۵۹۲۲a(permission);
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final synchronized void m۱۵۹۲۳a(String[] perms) {
        Collections.addAll(this.f۱۲۶۰۵a, perms);
    }
}
