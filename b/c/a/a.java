package b.c.a;

import android.app.Activity;
import android.os.Build;
import com.anthonycr.grant.PermissionsResultAction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    private static final a f۲۳۸۴c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f۲۳۸۵a = new HashSet(1);

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f۲۳۸۶b = new ArrayList(1);

    static {
        a.class.getSimpleName();
    }

    public static a a() {
        return f۲۳۸۴c;
    }

    private a() {
    }

    private synchronized void a(String[] permissions, b action) {
        if (action != null) {
            action.a(permissions);
            this.f۲۳۸۶b.add(action);
        }
    }

    public synchronized void a(Activity activity, String[] permissions, b action) {
        if (activity != null) {
            a(permissions, action);
            if (Build.VERSION.SDK_INT < 23) {
                for (String perm : permissions) {
                    if (action != null) {
                        if (android.support.v4.content.a.a(activity, perm) != 0) {
                            action.a(perm, -1);
                        } else {
                            action.a(perm, 0);
                        }
                    }
                }
            } else {
                List<String> permList = new ArrayList<>(1);
                for (String perm2 : permissions) {
                    if (android.support.v4.content.a.a(activity, perm2) != 0) {
                        if (!this.f۲۳۸۵a.contains(perm2)) {
                            permList.add(perm2);
                        }
                    } else if (action != null) {
                        action.a(perm2, 0);
                    }
                }
                if (!permList.isEmpty()) {
                    this.f۲۳۸۵a.addAll(permList);
                    android.support.v4.app.a.a(activity, (String[]) permList.toArray(new String[permList.size()]), 1);
                }
            }
        }
    }

    public synchronized void a(String[] permissions, int[] results) {
        int size = permissions.length;
        if (results.length < size) {
            size = results.length;
        }
        for (int n = 0; n < size; n++) {
            Iterator<PermissionsResultAction> iterator = this.f۲۳۸۶b.iterator();
            while (iterator.hasNext()) {
                if (((b) iterator.next()).a(permissions[n], results[n])) {
                    iterator.remove();
                }
                this.f۲۳۸۵a.remove(permissions[n]);
            }
        }
    }
}
