package android.support.v4.graphics.drawable;

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

/* renamed from: android.support.v4.graphics.drawable.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca {

    /* renamed from: a, reason: contains not printable characters */
    private static Method f۱۰۴۹۱a;

    /* renamed from: b, reason: contains not printable characters */
    private static boolean f۱۰۴۹۲b;

    /* renamed from: c, reason: contains not printable characters */
    private static Method f۱۰۴۹۳c;

    /* renamed from: d, reason: contains not printable characters */
    private static boolean f۱۰۴۹۴d;

    @Deprecated
    /* renamed from: g, reason: contains not printable characters */
    public static void m۱۰۶۵۱g(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۶۴۲a(Drawable drawable, boolean mirrored) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(mirrored);
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    public static boolean m۱۰۶۵۰f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۶۳۶a(Drawable drawable, float x, float y) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(x, y);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۶۳۷a(Drawable drawable, int left, int top, int right, int bottom) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(left, top, right, bottom);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b, reason: contains not printable characters */
    public static void m۱۰۶۴۶b(Drawable drawable, int tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(tint);
        } else if (drawable instanceof InterfaceCb) {
            ((InterfaceCb) drawable).setTint(tint);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۶۳۸a(Drawable drawable, ColorStateList tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(tint);
        } else if (drawable instanceof InterfaceCb) {
            ((InterfaceCb) drawable).setTintList(tint);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۶۴۱a(Drawable drawable, PorterDuff.Mode tintMode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(tintMode);
        } else if (drawable instanceof InterfaceCb) {
            ((InterfaceCb) drawable).setTintMode(tintMode);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public static int m۱۰۶۴۷c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۶۳۹a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۰۶۴۳a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: d, reason: contains not printable characters */
    public static ColorFilter m۱۰۶۴۸d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b, reason: contains not printable characters */
    public static void m۱۰۶۴۵b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
            return;
        }
        if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m۱۰۶۴۵b(((InsetDrawable) drawable).getDrawable());
                return;
            }
            if (drawable instanceof InterfaceCc) {
                m۱۰۶۴۵b(((InterfaceCc) drawable).mo۱۰۶۵۷a());
                return;
            }
            if (drawable instanceof DrawableContainer) {
                DrawableContainer container = (DrawableContainer) drawable;
                DrawableContainer.DrawableContainerState state = (DrawableContainer.DrawableContainerState) container.getConstantState();
                if (state != null) {
                    int count = state.getChildCount();
                    for (int i2 = 0; i2 < count; i2++) {
                        Drawable child = state.getChild(i2);
                        if (child != null) {
                            m۱۰۶۴۵b(child);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        drawable.clearColorFilter();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۶۴۰a(Drawable drawable, Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(res, parser, attrs, theme);
        } else {
            drawable.inflate(res, parser, attrs);
        }
    }

    /* renamed from: h, reason: contains not printable characters */
    public static Drawable m۱۰۶۵۲h(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        if (i >= 21) {
            if (!(drawable instanceof InterfaceCb)) {
                return new Ce(drawable);
            }
            return drawable;
        }
        if (!(drawable instanceof InterfaceCb)) {
            return new Cd(drawable);
        }
        return drawable;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۰۶۴۴a(Drawable drawable, int layoutDirection) {
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
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            f۱۰۴۹۲b = true;
        }
        Method method = f۱۰۴۹۱a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(layoutDirection));
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                f۱۰۴۹۱a = null;
            }
        }
        return false;
    }

    /* renamed from: e, reason: contains not printable characters */
    public static int m۱۰۶۴۹e(Drawable drawable) {
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
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            f۱۰۴۹۴d = true;
        }
        Method method = f۱۰۴۹۳c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                f۱۰۴۹۳c = null;
            }
        }
        return 0;
    }
}
