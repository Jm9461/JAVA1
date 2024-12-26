package p۰۵۲b.p۰۶۲c.p۰۶۳a;

import android.app.Activity;
import android.os.Build;
import com.anthonycr.grant.PermissionsResultAction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: b.c.a.a  reason: invalid class name */
public final class Ca {

    /* renamed from: c  reason: contains not printable characters */
    private static final Ca f۱۲۶۰۲c = new Ca();

    /* renamed from: a  reason: contains not printable characters */
    private final Set<String> f۱۲۶۰۳a = new HashSet(1);

    /* renamed from: b  reason: contains not printable characters */
    private final List<AbstractCb> f۱۲۶۰۴b = new ArrayList(1);

    static {
        Ca.class.getSimpleName();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ca m۱۵۹۱۷a() {
        return f۱۲۶۰۲c;
    }

    private Ca() {
    }

    /* renamed from: a  reason: contains not printable characters */
    private synchronized void m۱۵۹۱۸a(String[] permissions, AbstractCb action) {
        if (action != null) {
            action.m۱۵۹۲۳a(permissions);
            this.f۱۲۶۰۴b.add(action);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۵۹۱۹a(Activity activity, String[] permissions, AbstractCb action) {
        if (activity != null) {
            m۱۵۹۱۸a(permissions, action);
            if (Build.VERSION.SDK_INT < 23) {
                for (String perm : permissions) {
                    if (action != null) {
                        if (android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۱a(activity, perm) != 0) {
                            action.m۱۵۹۲۴a(perm, -1);
                        } else {
                            action.m۱۵۹۲۴a(perm, 0);
                        }
                    }
                }
            } else {
                List<String> permList = new ArrayList<>(1);
                for (String perm2 : permissions) {
                    if (android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۱a(activity, perm2) != 0) {
                        if (!this.f۱۲۶۰۳a.contains(perm2)) {
                            permList.add(perm2);
                        }
                    } else if (action != null) {
                        action.m۱۵۹۲۴a(perm2, 0);
                    }
                }
                if (!permList.isEmpty()) {
                    this.f۱۲۶۰۳a.addAll(permList);
                    android.support.p۰۴۳v4.app.Ca.m۱۲۰۶۲a(activity, (String[]) permList.toArray(new String[permList.size()]), 1);
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۵۹۲۰a(String[] permissions, int[] results) {
        int size = permissions.length;
        if (results.length < size) {
            size = results.length;
        }
        for (int n = 0; n < size; n++) {
            Iterator<PermissionsResultAction> iterator = this.f۱۲۶۰۴b.iterator();
            while (iterator.hasNext()) {
                if (((AbstractCb) iterator.next()).m۱۵۹۲۴a(permissions[n], results[n])) {
                    iterator.remove();
                }
                this.f۱۲۶۰۳a.remove(permissions[n]);
            }
        }
    }
}
