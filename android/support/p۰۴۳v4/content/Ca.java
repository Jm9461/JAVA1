package android.support.p۰۴۳v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* renamed from: android.support.v4.content.a  reason: invalid class name */
public class Ca {

    /* renamed from: a  reason: contains not printable characters */
    private static final Object f۱۰۴۴۶a = new Object();

    /* renamed from: b  reason: contains not printable characters */
    private static TypedValue f۱۰۴۴۷b;

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۲۶۲۲a(Context context, Intent[] intents, Bundle options) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intents, options);
            return true;
        }
        context.startActivities(intents);
        return true;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static File[] m۱۲۶۲۵b(Context context, String type) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(type);
        }
        return new File[]{context.getExternalFilesDir(type)};
    }

    /* renamed from: a  reason: contains not printable characters */
    public static File[] m۱۲۶۲۳a(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: c  reason: contains not printable characters */
    public static Drawable m۱۲۶۲۶c(Context context, int id) {
        Throwable th;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            return context.getDrawable(id);
        }
        if (i >= 16) {
            return context.getResources().getDrawable(id);
        }
        synchronized (f۱۰۴۴۶a) {
            try {
                if (f۱۰۴۴۷b == null) {
                    f۱۰۴۴۷b = new TypedValue();
                }
                context.getResources().getValue(id, f۱۰۴۴۷b, true);
                int resolvedId = f۱۰۴۴۷b.resourceId;
                try {
                    return context.getResources().getDrawable(resolvedId);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static ColorStateList m۱۲۶۲۴b(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(id);
        }
        return context.getResources().getColorStateList(id);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۲۶۲۰a(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(id);
        }
        return context.getResources().getColor(id);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۲۶۲۱a(Context context, String permission) {
        if (permission != null) {
            return context.checkPermission(permission, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }
}
