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

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Method f۱۲۹۱a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f۱۲۹۲b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f۱۲۹۳c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f۱۲۹۴d;

    @Deprecated
    public static void g(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void a(Drawable drawable, boolean mirrored) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(mirrored);
        }
    }

    public static boolean f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    public static void a(Drawable drawable, float x, float y) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(x, y);
        }
    }

    public static void a(Drawable drawable, int left, int top, int right, int bottom) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(left, top, right, bottom);
        }
    }

    public static void b(Drawable drawable, int tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(tint);
        } else if (drawable instanceof b) {
            ((b) drawable).setTint(tint);
        }
    }

    public static void a(Drawable drawable, ColorStateList tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(tint);
        } else if (drawable instanceof b) {
            ((b) drawable).setTintList(tint);
        }
    }

    public static void a(Drawable drawable, PorterDuff.Mode tintMode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(tintMode);
        } else if (drawable instanceof b) {
            ((b) drawable).setTintMode(tintMode);
        }
    }

    public static int c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static boolean a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public static ColorFilter d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public static void b(Drawable drawable) {
        DrawableContainer.DrawableContainerState state;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                b(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof c) {
                b(((c) drawable).a());
            } else if ((drawable instanceof DrawableContainer) && (state = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int count = state.getChildCount();
                for (int i2 = 0; i2 < count; i2++) {
                    Drawable child = state.getChild(i2);
                    if (child != null) {
                        b(child);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    public static void a(Drawable drawable, Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(res, parser, attrs, theme);
        } else {
            drawable.inflate(res, parser, attrs);
        }
    }

    public static Drawable h(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        if (i >= 21) {
            if (!(drawable instanceof b)) {
                return new e(drawable);
            }
            return drawable;
        } else if (!(drawable instanceof b)) {
            return new d(drawable);
        } else {
            return drawable;
        }
    }

    public static boolean a(Drawable drawable, int layoutDirection) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.setLayoutDirection(layoutDirection);
        }
        if (i < 17) {
            return false;
        }
        if (!f۱۲۹۲b) {
            try {
                f۱۲۹۱a = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f۱۲۹۱a.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            f۱۲۹۲b = true;
        }
        Method method = f۱۲۹۱a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(layoutDirection));
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                f۱۲۹۱a = null;
            }
        }
        return false;
    }

    public static int e(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i < 17) {
            return 0;
        }
        if (!f۱۲۹۴d) {
            try {
                f۱۲۹۳c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f۱۲۹۳c.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            f۱۲۹۴d = true;
        }
        Method method = f۱۲۹۳c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                f۱۲۹۳c = null;
            }
        }
        return 0;
    }
}
