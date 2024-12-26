package p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r;

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
import p۰۵۲b.p۰۵۳a.p۰۵۴a.EnumCe;
import p۰۵۲b.p۰۵۳a.p۰۵۴a.View$OnClickListenerCf;

/* renamed from: b.a.a.r.a  reason: invalid class name */
public class Ca {
    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۵۸۸۹a(Context context) {
        return m۱۵۸۸۸a(m۱۵۸۹۸a(m۱۵۹۰۶e(context, 16842806)) ? -16777216 : -1, 0.3f);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۵۸۸۸a(int color, float factor) {
        return Color.argb(Math.round(((float) Color.alpha(color)) * factor), Color.red(color), Color.green(color), Color.blue(color));
    }

    /* renamed from: e  reason: contains not printable characters */
    public static int m۱۵۹۰۶e(Context context, int attr) {
        return m۱۵۸۹۰a(context, attr, 0);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۵۸۹۰a(Context context, int attr, int fallback) {
        TypedArray a = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            return a.getColor(0, fallback);
        } finally {
            a.recycle();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static ColorStateList m۱۵۸۹۳a(Context context, int colorAttr, ColorStateList fallback) {
        TypedArray a = context.getTheme().obtainStyledAttributes(new int[]{colorAttr});
        try {
            TypedValue value = a.peekValue(0);
            if (value == null) {
                return fallback;
            }
            if (value.type < 28 || value.type > 31) {
                ColorStateList stateList = a.getColorStateList(0);
                if (stateList != null) {
                    a.recycle();
                    return stateList;
                }
                a.recycle();
                return fallback;
            }
            ColorStateList b = m۱۵۹۰۲b(context, value.data);
            a.recycle();
            return b;
        } finally {
            a.recycle();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static ColorStateList m۱۵۸۹۲a(Context context, int colorId) {
        TypedValue value = new TypedValue();
        context.getResources().getValue(colorId, value, true);
        int i = value.type;
        if (i >= 28 && i <= 31) {
            return m۱۵۹۰۲b(context, value.data);
        }
        if (Build.VERSION.SDK_INT <= 22) {
            return context.getResources().getColorStateList(colorId);
        }
        return context.getColorStateList(colorId);
    }

    /* renamed from: c  reason: contains not printable characters */
    public static int m۱۵۹۰۴c(Context context, int colorId) {
        return android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, colorId);
    }

    /* renamed from: h  reason: contains not printable characters */
    public static String m۱۵۹۰۹h(Context context, int attr) {
        TypedValue v = new TypedValue();
        context.getTheme().resolveAttribute(attr, v, true);
        return (String) v.string;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.r.a$b  reason: invalid class name */
    public static /* synthetic */ class Cb {

        /* renamed from: a  reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۲۵۹۹a = new int[EnumCe.values().length];

        static {
            try {
                f۱۲۵۹۹a[EnumCe.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f۱۲۵۹۹a[EnumCe.END.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۵۸۹۱a(EnumCe value) {
        int i = Cb.f۱۲۵۹۹a[value.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return 0;
        }
        return 2;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static EnumCe m۱۵۸۹۵a(Context context, int attr, EnumCe defaultGravity) {
        TypedArray a = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            int i = a.getInt(0, m۱۵۸۹۱a(defaultGravity));
            if (i == 1) {
                EnumCe eVar = EnumCe.CENTER;
                a.recycle();
                return eVar;
            } else if (i != 2) {
                return EnumCe.START;
            } else {
                EnumCe eVar2 = EnumCe.END;
                a.recycle();
                return eVar2;
            }
        } finally {
            a.recycle();
        }
    }

    /* renamed from: g  reason: contains not printable characters */
    public static Drawable m۱۵۹۰۸g(Context context, int attr) {
        return m۱۵۸۹۴a(context, attr, (Drawable) null);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Drawable m۱۵۸۹۴a(Context context, int attr, Drawable fallback) {
        TypedArray a = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            Drawable d = a.getDrawable(0);
            if (d == null && fallback != null) {
                d = fallback;
            }
            return d;
        } finally {
            a.recycle();
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public static int m۱۵۹۰۷f(Context context, int attr) {
        return m۱۵۹۰۱b(context, attr, -1);
    }

    /* renamed from: b  reason: contains not printable characters */
    private static int m۱۵۹۰۱b(Context context, int attr, int fallback) {
        TypedArray a = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            return a.getDimensionPixelSize(0, fallback);
        } finally {
            a.recycle();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۵۸۹۹a(Context context, int attr, boolean fallback) {
        TypedArray a = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            return a.getBoolean(0, fallback);
        } finally {
            a.recycle();
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public static boolean m۱۵۹۰۵d(Context context, int attr) {
        return m۱۵۸۹۹a(context, attr, false);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۵۸۹۸a(int color) {
        double red = (double) Color.red(color);
        Double.isNaN(red);
        double green = (double) Color.green(color);
        Double.isNaN(green);
        double d = (red * 0.299d) + (green * 0.587d);
        double blue = (double) Color.blue(color);
        Double.isNaN(blue);
        return 1.0d - ((d + (blue * 0.114d)) / 255.0d) >= 0.5d;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۵۸۹۷a(View view, Drawable d) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(d);
        } else {
            view.setBackground(d);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۵۹۰۳b(DialogInterface di, View$OnClickListenerCf.Cd builder) {
        View$OnClickListenerCf dialog = (View$OnClickListenerCf) di;
        if (dialog.m۱۵۸۳۵e() != null) {
            dialog.m۱۵۸۳۵e().post(new RunnableCa(dialog, builder));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.a.a.r.a$a  reason: invalid class name */
    public static class RunnableCa implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View$OnClickListenerCf f۱۲۵۹۷c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ View$OnClickListenerCf.Cd f۱۲۵۹۸d;

        RunnableCa(View$OnClickListenerCf fVar, View$OnClickListenerCf.Cd dVar) {
            this.f۱۲۵۹۷c = fVar;
            this.f۱۲۵۹۸d = dVar;
        }

        public void run() {
            this.f۱۲۵۹۷c.m۱۵۸۳۵e().requestFocus();
            InputMethodManager imm = (InputMethodManager) this.f۱۲۵۹۸d.m۱۵۸۵۵b().getSystemService("input_method");
            if (imm != null) {
                imm.showSoftInput(this.f۱۲۵۹۷c.m۱۵۸۳۵e(), 1);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۵۸۹۶a(DialogInterface di, View$OnClickListenerCf.Cd builder) {
        InputMethodManager imm;
        View$OnClickListenerCf dialog = (View$OnClickListenerCf) di;
        if (dialog.m۱۵۸۳۵e() != null && (imm = (InputMethodManager) builder.m۱۵۸۵۵b().getSystemService("input_method")) != null) {
            View currentFocus = dialog.getCurrentFocus();
            IBinder windowToken = null;
            if (currentFocus != null) {
                windowToken = currentFocus.getWindowToken();
            } else if (dialog.m۱۵۸۳۷g() != null) {
                windowToken = dialog.m۱۵۸۳۷g().getWindowToken();
            }
            if (windowToken != null) {
                imm.hideSoftInputFromWindow(windowToken, 0);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static ColorStateList m۱۵۹۰۲b(Context context, int newPrimaryColor) {
        int fallBackButtonColor = m۱۵۹۰۶e(context, 16842806);
        if (newPrimaryColor == 0) {
            newPrimaryColor = fallBackButtonColor;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{m۱۵۸۸۸a(newPrimaryColor, 0.4f), newPrimaryColor});
    }

    /* renamed from: a  reason: contains not printable characters */
    public static <T> boolean m۱۵۹۰۰a(T find, T[] ary) {
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
