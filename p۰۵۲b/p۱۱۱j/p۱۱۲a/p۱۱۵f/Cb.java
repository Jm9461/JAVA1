package p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.Ca;

/* renamed from: b.j.a.f.b  reason: invalid class name */
public class Cb {

    /* renamed from: a  reason: contains not printable characters */
    private static TypedValue f۱۳۱۰۸a;

    /* renamed from: d  reason: contains not printable characters */
    public static int m۱۶۵۰۵d(Context context, int dp) {
        return (int) (TypedValue.applyDimension(1, (float) dp, context.getResources().getDisplayMetrics()) + 0.5f);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۶۵۰۱a(Context context, int id, int defaultValue) {
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
        } catch (Exception e) {
        }
        return defaultValue;
    }

    @TargetApi(21)
    /* renamed from: c  reason: contains not printable characters */
    public static int m۱۶۵۰۴c(Context context, int defaultValue) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m۱۶۵۰۱a(context, 16843817, defaultValue);
        }
        return m۱۶۵۰۱a(context, Ca.colorControlNormal, defaultValue);
    }

    @TargetApi(21)
    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۶۵۰۰a(Context context, int defaultValue) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m۱۶۵۰۱a(context, 16843818, defaultValue);
        }
        return m۱۶۵۰۱a(context, Ca.colorControlActivated, defaultValue);
    }

    @TargetApi(21)
    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۶۵۰۳b(Context context, int defaultValue) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m۱۶۵۰۱a(context, 16843820, defaultValue);
        }
        return m۱۶۵۰۱a(context, Ca.colorControlHighlight, defaultValue);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۶۵۰۲a(TypedArray array, int index) {
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
