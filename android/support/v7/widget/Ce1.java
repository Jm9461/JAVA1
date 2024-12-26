package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ca;

/* renamed from: android.support.v7.widget.e1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ce1 {

    /* renamed from: a, reason: contains not printable characters */
    private static final ThreadLocal<TypedValue> f۱۲۰۰۳a = new ThreadLocal<>();

    /* renamed from: b, reason: contains not printable characters */
    static final int[] f۱۲۰۰۴b = {-16842910};

    /* renamed from: c, reason: contains not printable characters */
    static final int[] f۱۲۰۰۵c = {R.attr.state_focused};

    /* renamed from: d, reason: contains not printable characters */
    static final int[] f۱۲۰۰۶d;

    /* renamed from: e, reason: contains not printable characters */
    static final int[] f۱۲۰۰۷e;

    /* renamed from: f, reason: contains not printable characters */
    static final int[] f۱۲۰۰۸f;

    /* renamed from: g, reason: contains not printable characters */
    private static final int[] f۱۲۰۰۹g;

    static {
        new int[1][0] = 16843518;
        f۱۲۰۰۶d = new int[]{R.attr.state_pressed};
        f۱۲۰۰۷e = new int[]{R.attr.state_checked};
        new int[1][0] = 16842913;
        f۱۲۰۰۸f = new int[0];
        f۱۲۰۰۹g = new int[1];
    }

    /* renamed from: b, reason: contains not printable characters */
    public static int m۱۳۱۲۳b(Context context, int attr) {
        int[] iArr = f۱۲۰۰۹g;
        iArr[0] = attr;
        Cj1 a2 = Cj1.m۱۳۲۷۴a(context, (AttributeSet) null, iArr);
        try {
            return a2.m۱۳۲۷۷a(0, 0);
        } finally {
            a2.m۱۳۲۸۰a();
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public static ColorStateList m۱۳۱۲۴c(Context context, int attr) {
        int[] iArr = f۱۲۰۰۹g;
        iArr[0] = attr;
        Cj1 a2 = Cj1.m۱۳۲۷۴a(context, (AttributeSet) null, iArr);
        try {
            return a2.m۱۳۲۷۸a(0);
        } finally {
            a2.m۱۳۲۸۰a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۳۱۲۰a(Context context, int attr) {
        ColorStateList csl = m۱۳۱۲۴c(context, attr);
        if (csl != null && csl.isStateful()) {
            return csl.getColorForState(f۱۲۰۰۴b, csl.getDefaultColor());
        }
        TypedValue tv = m۱۳۱۲۲a();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, tv, true);
        float disabledAlpha = tv.getFloat();
        return m۱۳۱۲۱a(context, attr, disabledAlpha);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static TypedValue m۱۳۱۲۲a() {
        TypedValue typedValue = f۱۲۰۰۳a.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            f۱۲۰۰۳a.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۱۳۱۲۱a(Context context, int attr, float alpha) {
        int color = m۱۳۱۲۳b(context, attr);
        int originalAlpha = Color.alpha(color);
        return Ca.m۸۳۵۵c(color, Math.round(originalAlpha * alpha));
    }
}
