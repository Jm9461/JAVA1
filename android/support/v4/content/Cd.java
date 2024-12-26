package android.support.v4.content;

import android.content.Context;
import android.os.Process;
import android.support.v4.app.Cb;

/* renamed from: android.support.v4.content.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cd {
    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۰۵۶۸a(Context context, String permission, int pid, int uid, String packageName) {
        if (context.checkPermission(permission, pid, uid) == -1) {
            return -1;
        }
        String op = Cb.m۹۹۹۹a(permission);
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
        if (Cb.m۹۹۹۸a(context, op, packageName) == 0) {
            return 0;
        }
        return -2;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۰۵۶۷a(Context context, String permission) {
        return m۱۰۵۶۸a(context, permission, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
