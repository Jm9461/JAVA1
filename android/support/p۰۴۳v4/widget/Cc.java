package android.support.p۰۴۳v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.c  reason: invalid class name */
public final class Cc {

    /* renamed from: a  reason: contains not printable characters */
    private static Field f۱۰۷۶۴a;

    /* renamed from: b  reason: contains not printable characters */
    private static boolean f۱۰۷۶۵b;

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۲۲۳a(CompoundButton button, ColorStateList tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            button.setButtonTintList(tint);
        } else if (button instanceof AbstractCq) {
            ((AbstractCq) button).setSupportButtonTintList(tint);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۲۲۴a(CompoundButton button, PorterDuff.Mode tintMode) {
        if (Build.VERSION.SDK_INT >= 21) {
            button.setButtonTintMode(tintMode);
        } else if (button instanceof AbstractCq) {
            ((AbstractCq) button).setSupportButtonTintMode(tintMode);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Drawable m۱۳۲۲۲a(CompoundButton button) {
        if (Build.VERSION.SDK_INT >= 23) {
            return button.getButtonDrawable();
        }
        if (!f۱۰۷۶۵b) {
            try {
                f۱۰۷۶۴a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f۱۰۷۶۴a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f۱۰۷۶۵b = true;
        }
        Field field = f۱۰۷۶۴a;
        if (field != null) {
            try {
                return (Drawable) field.get(button);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f۱۰۷۶۴a = null;
            }
        }
        return null;
    }
}
