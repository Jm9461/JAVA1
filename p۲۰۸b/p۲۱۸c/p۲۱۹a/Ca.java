package p۲۰۸b.p۲۱۸c.p۲۱۹a;

import android.app.Activity;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: b.c.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca {

    /* renamed from: c, reason: contains not printable characters */
    private static final Ca f۱۲۶۰۲c;

    /* renamed from: a, reason: contains not printable characters */
    private final Set<String> f۱۲۶۰۳a = new HashSet(1);

    /* renamed from: b, reason: contains not printable characters */
    private final List<AbstractCb> f۱۲۶۰۴b = new ArrayList(1);

    static {
        Ca.class.getSimpleName();
        f۱۲۶۰۲c = new Ca();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Ca m۱۳۸۴۷a() {
        return f۱۲۶۰۲c;
    }

    private Ca() {
    }

    /* renamed from: a, reason: contains not printable characters */
    private synchronized void m۱۳۸۴۸a(String[] permissions, AbstractCb action) {
        if (action == null) {
            return;
        }
        action.m۱۳۸۵۳a(permissions);
        this.f۱۲۶۰۴b.add(action);
    }

    /* renamed from: a, reason: contains not printable characters */
    public synchronized void m۱۳۸۴۹a(Activity activity, String[] permissions, AbstractCb action) {
        if (activity == null) {
            return;
        }
        m۱۳۸۴۸a(permissions, action);
        if (Build.VERSION.SDK_INT < 23) {
            for (String perm : permissions) {
                if (action != null) {
                    if (android.support.v4.content.Ca.m۱۰۵۵۱a(activity, perm) != 0) {
                        action.m۱۳۸۵۴a(perm, -1);
                    } else {
                        action.m۱۳۸۵۴a(perm, 0);
                    }
                }
            }
        } else {
            List<String> permList = new ArrayList<>(1);
            for (String perm2 : permissions) {
                if (android.support.v4.content.Ca.m۱۰۵۵۱a(activity, perm2) != 0) {
                    if (!this.f۱۲۶۰۳a.contains(perm2)) {
                        permList.add(perm2);
                    }
                } else if (action != null) {
                    action.m۱۳۸۵۴a(perm2, 0);
                }
            }
            if (!permList.isEmpty()) {
                String[] permsToRequest = (String[]) permList.toArray(new String[permList.size()]);
                this.f۱۲۶۰۳a.addAll(permList);
                android.support.v4.app.Ca.m۹۹۹۲a(activity, permsToRequest, 1);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public synchronized void m۱۳۸۵۰a(String[] permissions, int[] results) {
        int size = permissions.length;
        if (results.length < size) {
            size = results.length;
        }
        for (int n = 0; n < size; n++) {
            Iterator<AbstractCb> it = this.f۱۲۶۰۴b.iterator();
            while (it.hasNext()) {
                if (it.next().m۱۳۸۵۴a(permissions[n], results[n])) {
                    it.remove();
                }
                this.f۱۲۶۰۳a.remove(permissions[n]);
            }
        }
    }
}
