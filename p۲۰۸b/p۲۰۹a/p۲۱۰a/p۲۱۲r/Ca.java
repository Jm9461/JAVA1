package p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r;

import android.R;
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
import p۲۰۸b.p۲۰۹a.p۲۱۰a.EnumCe;
import p۲۰۸b.p۲۰۹a.p۲۱۰a.ViewOnClickListenerCf;

/* renamed from: b.a.a.r.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {
    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۳۸۱۹a(Context context) {
        int primaryColor = m۱۳۸۳۶e(context, R.attr.textColorPrimary);
        int disabledColor = m۱۳۸۲۸a(primaryColor) ? -16777216 : -1;
        return m۱۳۸۱۸a(disabledColor, 0.3f);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۳۸۱۸a(int color, float factor) {
        int alpha = Math.round(Color.alpha(color) * factor);
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        return Color.argb(alpha, red, green, blue);
    }

    /* renamed from: e, reason: contains not printable characters */
    public static int m۱۳۸۳۶e(Context context, int attr) {
        return m۱۳۸۲۰a(context, attr, 0);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۳۸۲۰a(Context context, int attr, int fallback) {
        TypedArray a2 = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            return a2.getColor(0, fallback);
        } finally {
            a2.recycle();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static ColorStateList m۱۳۸۲۳a(Context context, int colorAttr, ColorStateList fallback) {
        TypedArray a2 = context.getTheme().obtainStyledAttributes(new int[]{colorAttr});
        try {
            TypedValue value = a2.peekValue(0);
            if (value == null) {
                return fallback;
            }
            if (value.type >= 28 && value.type <= 31) {
                return m۱۳۸۳۲b(context, value.data);
            }
            ColorStateList stateList = a2.getColorStateList(0);
            return stateList != null ? stateList : fallback;
        } finally {
            a2.recycle();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static ColorStateList m۱۳۸۲۲a(Context context, int colorId) {
        TypedValue value = new TypedValue();
        context.getResources().getValue(colorId, value, true);
        int i = value.type;
        if (i >= 28 && i <= 31) {
            return m۱۳۸۳۲b(context, value.data);
        }
        if (Build.VERSION.SDK_INT <= 22) {
            return context.getResources().getColorStateList(colorId);
        }
        return context.getColorStateList(colorId);
    }

    /* renamed from: c, reason: contains not printable characters */
    public static int m۱۳۸۳۴c(Context context, int colorId) {
        return android.support.v4.content.Ca.m۱۰۵۵۰a(context, colorId);
    }

    /* renamed from: h, reason: contains not printable characters */
    public static String m۱۳۸۳۹h(Context context, int attr) {
        TypedValue v = new TypedValue();
        context.getTheme().resolveAttribute(attr, v, true);
        return (String) v.string;
    }

    /* renamed from: b.a.a.r.a$b */
    static /* synthetic */ class b {

        /* renamed from: a, reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۲۵۹۹a = new int[EnumCe.values().length];

        static {
            try {
                f۱۲۵۹۹a[EnumCe.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۱۲۵۹۹a[EnumCe.END.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۱۳۸۲۱a(EnumCe value) {
        int i = b.f۱۲۵۹۹a[value.ordinal()];
        if (i != 1) {
            return i != 2 ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static EnumCe m۱۳۸۲۵a(Context context, int attr, EnumCe defaultGravity) {
        TypedArray a2 = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            int i = a2.getInt(0, m۱۳۸۲۱a(defaultGravity));
            return i != 1 ? i != 2 ? EnumCe.START : EnumCe.END : EnumCe.CENTER;
        } finally {
            a2.recycle();
        }
    }

    /* renamed from: g, reason: contains not printable characters */
    public static Drawable m۱۳۸۳۸g(Context context, int attr) {
        return m۱۳۸۲۴a(context, attr, (Drawable) null);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Drawable m۱۳۸۲۴a(Context context, int attr, Drawable fallback) {
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

    /* renamed from: f, reason: contains not printable characters */
    public static int m۱۳۸۳۷f(Context context, int attr) {
        return m۱۳۸۳۱b(context, attr, -1);
    }

    /* renamed from: b, reason: contains not printable characters */
    private static int m۱۳۸۳۱b(Context context, int attr, int fallback) {
        TypedArray a2 = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            return a2.getDimensionPixelSize(0, fallback);
        } finally {
            a2.recycle();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۳۸۲۹a(Context context, int attr, boolean fallback) {
        TypedArray a2 = context.getTheme().obtainStyledAttributes(new int[]{attr});
        try {
            return a2.getBoolean(0, fallback);
        } finally {
            a2.recycle();
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    public static boolean m۱۳۸۳۵d(Context context, int attr) {
        return m۱۳۸۲۹a(context, attr, false);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۳۸۲۸a(int color) {
        double red = Color.red(color);
        Double.isNaN(red);
        double green = Color.green(color);
        Double.isNaN(green);
        double d2 = (red * 0.299d) + (green * 0.587d);
        double blue = Color.blue(color);
        Double.isNaN(blue);
        double darkness = 1.0d - ((d2 + (blue * 0.114d)) / 255.0d);
        return darkness >= 0.5d;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۳۸۲۷a(View view, Drawable d2) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(d2);
        } else {
            view.setBackground(d2);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static void m۱۳۸۳۳b(DialogInterface di, ViewOnClickListenerCf.d builder) {
        ViewOnClickListenerCf dialog = (ViewOnClickListenerCf) di;
        if (dialog.m۱۳۷۶۵e() == null) {
            return;
        }
        dialog.m۱۳۷۶۵e().post(new a(dialog, builder));
    }

    /* renamed from: b.a.a.r.a$a */
    static class a implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ ViewOnClickListenerCf f۱۲۵۹۷c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ ViewOnClickListenerCf.d f۱۲۵۹۸d;

        a(ViewOnClickListenerCf viewOnClickListenerCf, ViewOnClickListenerCf.d dVar) {
            this.f۱۲۵۹۷c = viewOnClickListenerCf;
            this.f۱۲۵۹۸d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f۱۲۵۹۷c.m۱۳۷۶۵e().requestFocus();
            InputMethodManager imm = (InputMethodManager) this.f۱۲۵۹۸d.m۱۳۷۸۵b().getSystemService("input_method");
            if (imm != null) {
                imm.showSoftInput(this.f۱۲۵۹۷c.m۱۳۷۶۵e(), 1);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۳۸۲۶a(DialogInterface di, ViewOnClickListenerCf.d builder) {
        InputMethodManager imm;
        ViewOnClickListenerCf dialog = (ViewOnClickListenerCf) di;
        if (dialog.m۱۳۷۶۵e() != null && (imm = (InputMethodManager) builder.m۱۳۷۸۵b().getSystemService("input_method")) != null) {
            View currentFocus = dialog.getCurrentFocus();
            IBinder windowToken = null;
            if (currentFocus != null) {
                windowToken = currentFocus.getWindowToken();
            } else if (dialog.m۱۳۷۶۷g() != null) {
                windowToken = dialog.m۱۳۷۶۷g().getWindowToken();
            }
            if (windowToken != null) {
                imm.hideSoftInputFromWindow(windowToken, 0);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static ColorStateList m۱۳۸۳۲b(Context context, int newPrimaryColor) {
        int fallBackButtonColor = m۱۳۸۳۶e(context, R.attr.textColorPrimary);
        if (newPrimaryColor == 0) {
            newPrimaryColor = fallBackButtonColor;
        }
        int[][] states = {new int[]{-16842910}, new int[0]};
        int[] colors = {m۱۳۸۱۸a(newPrimaryColor, 0.4f), newPrimaryColor};
        return new ColorStateList(states, colors);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static <T> boolean m۱۳۸۳۰a(T find, T[] ary) {
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
