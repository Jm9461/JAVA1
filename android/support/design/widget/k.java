package android.support.design.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.util.Log;
import java.lang.reflect.Method;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static Method f۹۵۴a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f۹۵۵b;

    public static boolean a(DrawableContainer drawable, Drawable.ConstantState constantState) {
        return b(drawable, constantState);
    }

    private static boolean b(DrawableContainer drawable, Drawable.ConstantState constantState) {
        if (!f۹۵۵b) {
            try {
                f۹۵۴a = DrawableContainer.class.getDeclaredMethod("setConstantState", DrawableContainer.DrawableContainerState.class);
                f۹۵۴a.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
            }
            f۹۵۵b = true;
        }
        Method method = f۹۵۴a;
        if (method != null) {
            try {
                method.invoke(drawable, constantState);
                return true;
            } catch (Exception e3) {
                Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
            }
        }
        return false;
    }
}
