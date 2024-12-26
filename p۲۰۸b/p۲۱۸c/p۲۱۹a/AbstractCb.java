package p۲۰۸b.p۲۱۸c.p۲۱۹a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: b.c.a.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCb {

    /* renamed from: a, reason: contains not printable characters */
    private final Set<String> f۱۲۶۰۵a = new HashSet(1);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۵۳۹۷a();

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۵۳۹۸a(String str);

    /* renamed from: a, reason: contains not printable characters */
    public final synchronized boolean m۱۳۸۵۴a(String permission, int result) {
        if (result == 0) {
            this.f۱۲۶۰۵a.remove(permission);
            if (this.f۱۲۶۰۵a.isEmpty()) {
                mo۱۵۳۹۷a();
                return true;
            }
            return false;
        }
        mo۱۵۳۹۸a(permission);
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public final synchronized void m۱۳۸۵۳a(String[] perms) {
        Collections.addAll(this.f۱۲۶۰۵a, perms);
    }
}
