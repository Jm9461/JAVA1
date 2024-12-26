package android.support.p۰۴۳v4.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: android.support.v4.app.b  reason: invalid class name */
public final class Cb {
    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۲۰۶۹a(String permission) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(permission);
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۲۰۶۸a(Context context, String op, String proxiedPackageName) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(op, proxiedPackageName);
        }
        return 1;
    }
}
