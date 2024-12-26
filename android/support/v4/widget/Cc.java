package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cc {

    /* renamed from: a, reason: contains not printable characters */
    private static Field f۱۰۷۶۴a;

    /* renamed from: b, reason: contains not printable characters */
    private static boolean f۱۰۷۶۵b;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۱۵۳a(CompoundButton compoundButton, ColorStateList tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(tint);
        } else if (compoundButton instanceof InterfaceCq) {
            ((InterfaceCq) compoundButton).setSupportButtonTintList(tint);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۱۵۴a(CompoundButton compoundButton, PorterDuff.Mode tintMode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(tintMode);
        } else if (compoundButton instanceof InterfaceCq) {
            ((InterfaceCq) compoundButton).setSupportButtonTintMode(tintMode);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Drawable m۱۱۱۵۲a(CompoundButton button) {
        if (Build.VERSION.SDK_INT >= 23) {
            return button.getButtonDrawable();
        }
        if (!f۱۰۷۶۵b) {
            try {
                f۱۰۷۶۴a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f۱۰۷۶۴a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            f۱۰۷۶۵b = true;
        }
        Field field = f۱۰۷۶۴a;
        if (field != null) {
            try {
                return (Drawable) field.get(button);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                f۱۰۷۶۴a = null;
            }
        }
        return null;
    }
}
