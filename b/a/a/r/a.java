package b.a.a.r;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b.a.a.e;
import b.a.a.f;

public class a {
    public static int a(Context context) {
        return a(a(e(context, 16842806)) ? -16777216 : -1, 0.3f);
    }

    public static int a(int color, float factor) {
        return Color.argb(Math.round(((float) Color.alpha(color)) * factor), Color.red(color), Color.green(color), Color.blue(color));
    }

    public static int e(Context context, int attr) {
        return a(context, attr, 0);
    }

    public static int a(Context context, int attr, int fallback) {
        TypedArray a2 = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            return a2.getColor(0, fallback);
        } finally {
            a2.recycle();
        }
    }

    public static ColorStateList a(Context context, int colorAttr, ColorStateList fallback) {
        TypedArray a2 = context.getTheme().obtainStyledAttributes(new int[]{colorAttr});
        try {
            TypedValue value = a2.peekValue(0);
            if (value == null) {
                return fallback;
            }
            if (value.type < 28 || value.type > 31) {
                ColorStateList stateList = a2.getColorStateList(0);
                if (stateList != null) {
                    a2.recycle();
                    return stateList;
                }
                a2.recycle();
                return fallback;
            }
            ColorStateList b2 = b(context, value.data);
            a2.recycle();
            return b2;
        } finally {
            a2.recycle();
        }
    }

    public static ColorStateList a(Context context, int colorId) {
        TypedValue value = new TypedValue();
        context.getResources().getValue(colorId, value, true);
        int i = value.type;
        if (i >= 28 && i <= 31) {
            return b(context, value.data);
        }
        if (Build.VERSION.SDK_INT <= 22) {
            return context.getResources().getColorStateList(colorId);
        }
        return context.getColorStateList(colorId);
    }

    public static int c(Context context, int colorId) {
        return android.support.v4.content.a.a(context, colorId);
    }

    public static String h(Context context, int attr) {
        TypedValue v = new TypedValue();
        context.getTheme().resolveAttribute(attr, v, true);
        return (String) v.string;
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f۲۳۸۰a = new int[e.values().length];

        static {
            try {
                f۲۳۸۰a[e.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۲۳۸۰a[e.END.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    private static int a(e value) {
        int i = b.f۲۳۸۰a[value.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return 0;
        }
        return 2;
    }

    public static e a(Context context, int attr, e defaultGravity) {
        TypedArray a2 = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            int i = a2.getInt(0, a(defaultGravity));
            if (i == 1) {
                e eVar = e.CENTER;
                a2.recycle();
                return eVar;
            } else if (i != 2) {
                return e.START;
            } else {
                e eVar2 = e.END;
                a2.recycle();
                return eVar2;
            }
        } finally {
            a2.recycle();
        }
    }

    public static Drawable g(Context context, int attr) {
        return a(context, attr, (Drawable) null);
    }

    private static Drawable a(Context context, int attr, Drawable fallback) {
        TypedArray a2 = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            Drawable d2 = a2.getDrawable(0);
            if (d2 == null && fallback != null) {
                d2 = fallback;
            }
            return d2;
        } finally {
            a2.recycle();
        }
    }

    public static int f(Context context, int attr) {
        return b(context, attr, -1);
    }

    private static int b(Context context, int attr, int fallback) {
        TypedArray a2 = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            return a2.getDimensionPixelSize(0, fallback);
        } finally {
            a2.recycle();
        }
    }

    public static boolean a(Context context, int attr, boolean fallback) {
        TypedArray a2 = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            return a2.getBoolean(0, fallback);
        } finally {
            a2.recycle();
        }
    }

    public static boolean d(Context context, int attr) {
        return a(context, attr, false);
    }

    public static boolean a(int color) {
        double red = (double) Color.red(color);
        Double.isNaN(red);
        double green = (double) Color.green(color);
        Double.isNaN(green);
        double d2 = (red * 0.299d) + (green * 0.587d);
        double blue = (double) Color.blue(color);
        Double.isNaN(blue);
        return 1.0d - ((d2 + (blue * 0.114d)) / 255.0d) >= 0.5d;
    }

    public static void a(View view, Drawable d2) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(d2);
        } else {
            view.setBackground(d2);
        }
    }

    public static void b(DialogInterface di, f.d builder) {
        f dialog = (f) di;
        if (dialog.e() != null) {
            dialog.e().post(new RunnableC۰۰۴۴a(dialog, builder));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.r.a$a  reason: collision with other inner class name */
    public static class RunnableC۰۰۴۴a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f۲۳۷۸c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f.d f۲۳۷۹d;

        RunnableC۰۰۴۴a(f fVar, f.d dVar) {
            this.f۲۳۷۸c = fVar;
            this.f۲۳۷۹d = dVar;
        }

        public void run() {
            this.f۲۳۷۸c.e().requestFocus();
            InputMethodManager imm = (InputMethodManager) this.f۲۳۷۹d.b().getSystemService("input_method");
            if (imm != null) {
                imm.showSoftInput(this.f۲۳۷۸c.e(), 1);
            }
        }
    }

    public static void a(DialogInterface di, f.d builder) {
        InputMethodManager imm;
        f dialog = (f) di;
        if (dialog.e() != null && (imm = (InputMethodManager) builder.b().getSystemService("input_method")) != null) {
            View currentFocus = dialog.getCurrentFocus();
            IBinder windowToken = null;
            if (currentFocus != null) {
                windowToken = currentFocus.getWindowToken();
            } else if (dialog.g() != null) {
                windowToken = dialog.g().getWindowToken();
            }
            if (windowToken != null) {
                imm.hideSoftInputFromWindow(windowToken, 0);
            }
        }
    }

    public static ColorStateList b(Context context, int newPrimaryColor) {
        int fallBackButtonColor = e(context, 16842806);
        if (newPrimaryColor == 0) {
            newPrimaryColor = fallBackButtonColor;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{a(newPrimaryColor, 0.4f), newPrimaryColor});
    }

    public static <T> boolean a(T find, T[] ary) {
        if (ary == null || ary.length == 0) {
            return false;
        }
        for (T item : ary) {
            if (item.equals(find)) {
                return true;
            }
        }
        return false;
    }
}
