package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ca;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.e1  reason: invalid class name */
public class Ce1 {

    /* renamed from: a  reason: contains not printable characters */
    private static final ThreadLocal<TypedValue> f۱۲۰۰۳a = new ThreadLocal<>();

    /* renamed from: b  reason: contains not printable characters */
    static final int[] f۱۲۰۰۴b = {-16842910};

    /* renamed from: c  reason: contains not printable characters */
    static final int[] f۱۲۰۰۵c = {16842908};

    /* renamed from: d  reason: contains not printable characters */
    static final int[] f۱۲۰۰۶d = {16842919};

    /* renamed from: e  reason: contains not printable characters */
    static final int[] f۱۲۰۰۷e = {16842912};

    /* renamed from: f  reason: contains not printable characters */
    static final int[] f۱۲۰۰۸f = new int[0];

    /* renamed from: g  reason: contains not printable characters */
    private static final int[] f۱۲۰۰۹g = new int[1];

    static {
        new int[1][0] = 16843518;
        new int[1][0] = 16842913;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۵۱۹۳b(Context context, int attr) {
        int[] iArr = f۱۲۰۰۹g;
        iArr[0] = attr;
        Cj1 a = Cj1.m۱۵۳۴۴a(context, (AttributeSet) null, iArr);
        try {
            return a.m۱۵۳۴۷a(0, 0);
        } finally {
            a.m۱۵۳۵۰a();
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public static ColorStateList m۱۵۱۹۴c(Context context, int attr) {
        int[] iArr = f۱۲۰۰۹g;
        iArr[0] = attr;
        Cj1 a = Cj1.m۱۵۳۴۴a(context, (AttributeSet) null, iArr);
        try {
            return a.m۱۵۳۴۸a(0);
        } finally {
            a.m۱۵۳۵۰a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۵۱۹۰a(Context context, int attr) {
        ColorStateList csl = m۱۵۱۹۴c(context, attr);
        if (csl != null && csl.isStateful()) {
            return csl.getColorForState(f۱۲۰۰۴b, csl.getDefaultColor());
        }
        TypedValue tv = m۱۵۱۹۲a();
        context.getTheme().resolveAttribute(16842803, tv, true);
        return m۱۵۱۹۱a(context, attr, tv.getFloat());
    }

    /* renamed from: a  reason: contains not printable characters */
    private static TypedValue m۱۵۱۹۲a() {
        TypedValue typedValue = f۱۲۰۰۳a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f۱۲۰۰۳a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۵۱۹۱a(Context context, int attr, float alpha) {
        int color = m۱۵۱۹۳b(context, attr);
        return Ca.m۱۰۴۲۰c(color, Math.round(((float) Color.alpha(color)) * alpha));
    }
}
