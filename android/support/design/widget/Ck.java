package android.support.design.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.design.widget.k  reason: invalid class name */
public class Ck {

    /* renamed from: a  reason: contains not printable characters */
    private static Method f۹۹۳۰a;

    /* renamed from: b  reason: contains not printable characters */
    private static boolean f۹۹۳۱b;

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۱۸۶۷a(DrawableContainer drawable, Drawable.ConstantState constantState) {
        return m۱۱۸۶۸b(drawable, constantState);
    }

    /* renamed from: b  reason: contains not printable characters */
    private static boolean m۱۱۸۶۸b(DrawableContainer drawable, Drawable.ConstantState constantState) {
        if (!f۹۹۳۱b) {
            try {
                f۹۹۳۰a = DrawableContainer.class.getDeclaredMethod("setConstantState", DrawableContainer.DrawableContainerState.class);
                f۹۹۳۰a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
            }
            f۹۹۳۱b = true;
        }
        Method method = f۹۹۳۰a;
        if (method != null) {
            try {
                method.invoke(drawable, constantState);
                return true;
            } catch (Exception e2) {
                Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
            }
        }
        return false;
    }
}
