package b.j.a.f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import b.j.a.a;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static TypedValue f۲۶۳۲a;

    public static int d(Context context, int dp) {
        return (int) (TypedValue.applyDimension(1, (float) dp, context.getResources().getDisplayMetrics()) + 0.5f);
    }

    private static int a(Context context, int id, int defaultValue) {
        if (f۲۶۳۲a == null) {
            f۲۶۳۲a = new TypedValue();
        }
        try {
            Resources.Theme theme = context.getTheme();
            if (theme != null && theme.resolveAttribute(id, f۲۶۳۲a, true)) {
                if (f۲۶۳۲a.type >= 16 && f۲۶۳۲a.type <= 31) {
                    return f۲۶۳۲a.data;
                }
                if (f۲۶۳۲a.type == 3) {
                    return context.getResources().getColor(f۲۶۳۲a.resourceId);
                }
            }
        } catch (Exception e2) {
        }
        return defaultValue;
    }

    @TargetApi(21)
    public static int c(Context context, int defaultValue) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a(context, 16843817, defaultValue);
        }
        return a(context, a.colorControlNormal, defaultValue);
    }

    @TargetApi(21)
    public static int a(Context context, int defaultValue) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a(context, 16843818, defaultValue);
        }
        return a(context, a.colorControlActivated, defaultValue);
    }

    @TargetApi(21)
    public static int b(Context context, int defaultValue) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a(context, 16843820, defaultValue);
        }
        return a(context, a.colorControlHighlight, defaultValue);
    }

    public static int a(TypedArray array, int index) {
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
