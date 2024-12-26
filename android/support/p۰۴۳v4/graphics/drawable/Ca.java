package android.support.p۰۴۳v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.graphics.drawable.a  reason: invalid class name */
public final class Ca {

    /* renamed from: a  reason: contains not printable characters */
    private static Method f۱۰۴۹۱a;

    /* renamed from: b  reason: contains not printable characters */
    private static boolean f۱۰۴۹۲b;

    /* renamed from: c  reason: contains not printable characters */
    private static Method f۱۰۴۹۳c;

    /* renamed from: d  reason: contains not printable characters */
    private static boolean f۱۰۴۹۴d;

    @Deprecated
    /* renamed from: g  reason: contains not printable characters */
    public static void m۱۲۷۲۱g(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۷۱۲a(Drawable drawable, boolean mirrored) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(mirrored);
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public static boolean m۱۲۷۲۰f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۷۰۶a(Drawable drawable, float x, float y) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(x, y);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۷۰۷a(Drawable drawable, int left, int top, int right, int bottom) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(left, top, right, bottom);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۲۷۱۶b(Drawable drawable, int tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(tint);
        } else if (drawable instanceof AbstractCb) {
            ((AbstractCb) drawable).setTint(tint);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۷۰۸a(Drawable drawable, ColorStateList tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(tint);
        } else if (drawable instanceof AbstractCb) {
            ((AbstractCb) drawable).setTintList(tint);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۷۱۱a(Drawable drawable, PorterDuff.Mode tintMode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(tintMode);
        } else if (drawable instanceof AbstractCb) {
            ((AbstractCb) drawable).setTintMode(tintMode);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public static int m۱۲۷۱۷c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۷۰۹a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۲۷۱۳a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: d  reason: contains not printable characters */
    public static ColorFilter m۱۲۷۱۸d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۲۷۱۵b(Drawable drawable) {
        DrawableContainer.DrawableContainerState state;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m۱۲۷۱۵b(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof AbstractCc) {
                m۱۲۷۱۵b(((AbstractCc) drawable).m۱۲۷۲۳a());
            } else if ((drawable instanceof DrawableContainer) && (state = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int count = state.getChildCount();
                for (int i2 = 0; i2 < count; i2++) {
                    Drawable child = state.getChild(i2);
                    if (child != null) {
                        m۱۲۷۱۵b(child);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۷۱۰a(Drawable drawable, Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(res, parser, attrs, theme);
        } else {
            drawable.inflate(res, parser, attrs);
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    public static Drawable m۱۲۷۲۲h(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        if (i >= 21) {
            if (!(drawable instanceof AbstractCb)) {
                return new Ce(drawable);
            }
            return drawable;
        } else if (!(drawable instanceof AbstractCb)) {
            return new Cd(drawable);
        } else {
            return drawable;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۲۷۱۴a(Drawable drawable, int layoutDirection) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.setLayoutDirection(layoutDirection);
        }
        if (i < 17) {
            return false;
        }
        if (!f۱۰۴۹۲b) {
            try {
                f۱۰۴۹۱a = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f۱۰۴۹۱a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f۱۰۴۹۲b = true;
        }
        Method method = f۱۰۴۹۱a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(layoutDirection));
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f۱۰۴۹۱a = null;
            }
        }
        return false;
    }

    /* renamed from: e  reason: contains not printable characters */
    public static int m۱۲۷۱۹e(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i < 17) {
            return 0;
        }
        if (!f۱۰۴۹۴d) {
            try {
                f۱۰۴۹۳c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f۱۰۴۹۳c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f۱۰۴۹۴d = true;
        }
        Method method = f۱۰۴۹۳c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                f۱۰۴۹۳c = null;
            }
        }
        return 0;
    }
}
