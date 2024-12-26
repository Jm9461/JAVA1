package b.c.a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f۲۳۸۷a = new HashSet(1);

    public abstract void a();

    public abstract void a(String str);

    public final synchronized boolean a(String permission, int result) {
        if (result == 0) {
            this.f۲۳۸۷a.remove(permission);
            if (!this.f۲۳۸۷a.isEmpty()) {
                return false;
            }
            a();
            return true;
        }
        a(permission);
        return true;
    }

    public final synchronized void a(String[] perms) {
        Collections.addAll(this.f۲۳۸۷a, perms);
    }
}
