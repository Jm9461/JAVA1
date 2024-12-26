package android.support.p۰۴۳v4.content;

import android.content.Context;
import android.os.Process;
import android.support.p۰۴۳v4.app.Cb;

/* renamed from: android.support.v4.content.d  reason: invalid class name */
public final class Cd {
    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۲۶۳۸a(Context context, String permission, int pid, int uid, String packageName) {
        if (context.checkPermission(permission, pid, uid) == -1) {
            return -1;
        }
        String op = Cb.m۱۲۰۶۹a(permission);
        if (op == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packageNames = context.getPackageManager().getPackagesForUid(uid);
            if (packageNames == null || packageNames.length <= 0) {
                return -1;
            }
            packageName = packageNames[0];
        }
        if (Cb.m۱۲۰۶۸a(context, op, packageName) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۲۶۳۷a(Context context, String permission) {
        return m۱۲۶۳۸a(context, permission, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
