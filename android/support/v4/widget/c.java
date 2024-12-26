package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Field f۱۴۳۷a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f۱۴۳۸b;

    public static void a(CompoundButton button, ColorStateList tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            button.setButtonTintList(tint);
        } else if (button instanceof q) {
            ((q) button).setSupportButtonTintList(tint);
        }
    }

    public static void a(CompoundButton button, PorterDuff.Mode tintMode) {
        if (Build.VERSION.SDK_INT >= 21) {
            button.setButtonTintMode(tintMode);
        } else if (button instanceof q) {
            ((q) button).setSupportButtonTintMode(tintMode);
        }
    }

    public static Drawable a(CompoundButton button) {
        if (Build.VERSION.SDK_INT >= 23) {
            return button.getButtonDrawable();
        }
        if (!f۱۴۳۸b) {
            try {
                f۱۴۳۷a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f۱۴۳۷a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            f۱۴۳۸b = true;
        }
        Field field = f۱۴۳۷a;
        if (field != null) {
            try {
                return (Drawable) field.get(button);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                f۱۴۳۷a = null;
            }
        }
        return null;
    }
}
