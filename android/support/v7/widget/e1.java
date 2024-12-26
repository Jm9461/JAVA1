package android.support.v7.widget;

import a.b.g.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* access modifiers changed from: package-private */
public class e1 {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f۲۰۲۶a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final int[] f۲۰۲۷b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f۲۰۲۸c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f۲۰۲۹d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f۲۰۳۰e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f۲۰۳۱f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f۲۰۳۲g = new int[1];

    static {
        new int[1][0] = 16843518;
        new int[1][0] = 16842913;
    }

    public static int b(Context context, int attr) {
        int[] iArr = f۲۰۳۲g;
        iArr[0] = attr;
        j1 a2 = j1.a(context, (AttributeSet) null, iArr);
        try {
            return a2.a(0, 0);
        } finally {
            a2.a();
        }
    }

    public static ColorStateList c(Context context, int attr) {
        int[] iArr = f۲۰۳۲g;
        iArr[0] = attr;
        j1 a2 = j1.a(context, (AttributeSet) null, iArr);
        try {
            return a2.a(0);
        } finally {
            a2.a();
        }
    }

    public static int a(Context context, int attr) {
        ColorStateList csl = c(context, attr);
        if (csl != null && csl.isStateful()) {
            return csl.getColorForState(f۲۰۲۷b, csl.getDefaultColor());
        }
        TypedValue tv = a();
        context.getTheme().resolveAttribute(16842803, tv, true);
        return a(context, attr, tv.getFloat());
    }

    private static TypedValue a() {
        TypedValue typedValue = f۲۰۲۶a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f۲۰۲۶a.set(typedValue2);
        return typedValue2;
    }

    static int a(Context context, int attr, float alpha) {
        int color = b(context, attr);
        return a.c(color, Math.round(((float) Color.alpha(color)) * alpha));
    }
}
