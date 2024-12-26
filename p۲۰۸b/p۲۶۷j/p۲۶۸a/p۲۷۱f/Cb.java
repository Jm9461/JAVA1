package p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۱f;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import p۲۰۸b.p۲۶۷j.p۲۶۸a.Ca;

/* renamed from: b.j.a.f.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb {

    /* renamed from: a, reason: contains not printable characters */
    private static TypedValue f۱۳۱۰۸a;

    /* renamed from: d, reason: contains not printable characters */
    public static int m۱۴۴۳۰d(Context context, int dp) {
        return (int) (TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics()) + 0.5f);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۱۴۴۲۶a(Context context, int id, int defaultValue) {
        if (f۱۳۱۰۸a == null) {
            f۱۳۱۰۸a = new TypedValue();
        }
        try {
            Resources.Theme theme = context.getTheme();
            if (theme != null && theme.resolveAttribute(id, f۱۳۱۰۸a, true)) {
                if (f۱۳۱۰۸a.type >= 16 && f۱۳۱۰۸a.type <= 31) {
                    return f۱۳۱۰۸a.data;
                }
                if (f۱۳۱۰۸a.type == 3) {
                    return context.getResources().getColor(f۱۳۱۰۸a.resourceId);
                }
            }
        } catch (Exception e2) {
        }
        return defaultValue;
    }

    @TargetApi(21)
    /* renamed from: c, reason: contains not printable characters */
    public static int m۱۴۴۲۹c(Context context, int defaultValue) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m۱۴۴۲۶a(context, R.attr.colorControlNormal, defaultValue);
        }
        return m۱۴۴۲۶a(context, Ca.colorControlNormal, defaultValue);
    }

    @TargetApi(21)
    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۴۴۲۵a(Context context, int defaultValue) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m۱۴۴۲۶a(context, R.attr.colorControlActivated, defaultValue);
        }
        return m۱۴۴۲۶a(context, Ca.colorControlActivated, defaultValue);
    }

    @TargetApi(21)
    /* renamed from: b, reason: contains not printable characters */
    public static int m۱۴۴۲۸b(Context context, int defaultValue) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m۱۴۴۲۶a(context, R.attr.colorControlHighlight, defaultValue);
        }
        return m۱۴۴۲۶a(context, Ca.colorControlHighlight, defaultValue);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۴۴۲۷a(TypedArray array, int index) {
        if (Build.VERSION.SDK_INT >= 21) {
            return array.getType(index);
        }
        TypedValue value = array.peekValue(index);
        if (value == null) {
            return 0;
        }
        return value.type;
    }
}
