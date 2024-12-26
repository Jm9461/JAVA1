package android.support.p۰۴۷v7.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.support.p۰۴۳v4.graphics.drawable.AbstractCc;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc;

/* renamed from: android.support.v7.widget.h0  reason: invalid class name */
public class Ch0 {
    static {
        new Rect();
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    static void m۱۵۲۵۶b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m۱۵۲۵۷c(drawable);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۵۲۵۵a(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState state = drawable.getConstantState();
            if (!(state instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable child : ((DrawableContainer.DrawableContainerState) state).getChildren()) {
                if (!m۱۵۲۵۵a(child)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof AbstractCc) {
            return m۱۵۲۵۵a(((AbstractCc) drawable).m۱۲۷۲۳a());
        } else {
            if (drawable instanceof Cc) {
                return m۱۵۲۵۵a(((Cc) drawable).m۱۰۷۴۷a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m۱۵۲۵۵a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private static void m۱۵۲۵۷c(Drawable drawable) {
        int[] originalState = drawable.getState();
        if (originalState == null || originalState.length == 0) {
            drawable.setState(Ce1.f۱۲۰۰۷e);
        } else {
            drawable.setState(Ce1.f۱۲۰۰۸f);
        }
        drawable.setState(originalState);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static PorterDuff.Mode m۱۵۲۵۴a(int value, PorterDuff.Mode defaultMode) {
        if (value == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (value == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (value == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (value) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return defaultMode;
        }
    }
}
