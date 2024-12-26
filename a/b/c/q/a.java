package a.b.c.q;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f۶۹a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f۷۰b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f۷۱c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f۷۲d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f۷۳e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f۷۴f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f۷۵g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f۷۶h = {16842913, 16842908};
    private static final int[] i = {16842913, 16843623};
    private static final int[] j = {16842913};

    public static ColorStateList a(ColorStateList rippleColor) {
        if (f۶۹a) {
            int[][] states = new int[2][];
            int[] colors = new int[2];
            states[0] = j;
            colors[0] = a(rippleColor, f۷۴f);
            int i2 = 0 + 1;
            states[i2] = StateSet.NOTHING;
            colors[i2] = a(rippleColor, f۷۰b);
            int i3 = i2 + 1;
            return new ColorStateList(states, colors);
        }
        int[][] states2 = new int[10][];
        int[] colors2 = new int[10];
        int[] iArr = f۷۴f;
        states2[0] = iArr;
        colors2[0] = a(rippleColor, iArr);
        int i4 = 0 + 1;
        int[] iArr2 = f۷۵g;
        states2[i4] = iArr2;
        colors2[i4] = a(rippleColor, iArr2);
        int i5 = i4 + 1;
        int[] iArr3 = f۷۶h;
        states2[i5] = iArr3;
        colors2[i5] = a(rippleColor, iArr3);
        int i6 = i5 + 1;
        int[] iArr4 = i;
        states2[i6] = iArr4;
        colors2[i6] = a(rippleColor, iArr4);
        int i7 = i6 + 1;
        states2[i7] = j;
        colors2[i7] = 0;
        int i8 = i7 + 1;
        int[] iArr5 = f۷۰b;
        states2[i8] = iArr5;
        colors2[i8] = a(rippleColor, iArr5);
        int i9 = i8 + 1;
        int[] iArr6 = f۷۱c;
        states2[i9] = iArr6;
        colors2[i9] = a(rippleColor, iArr6);
        int i10 = i9 + 1;
        int[] iArr7 = f۷۲d;
        states2[i10] = iArr7;
        colors2[i10] = a(rippleColor, iArr7);
        int i11 = i10 + 1;
        int[] iArr8 = f۷۳e;
        states2[i11] = iArr8;
        colors2[i11] = a(rippleColor, iArr8);
        int i12 = i11 + 1;
        states2[i12] = StateSet.NOTHING;
        colors2[i12] = 0;
        int i13 = i12 + 1;
        return new ColorStateList(states2, colors2);
    }

    private static int a(ColorStateList rippleColor, int[] state) {
        int color;
        if (rippleColor != null) {
            color = rippleColor.getColorForState(state, rippleColor.getDefaultColor());
        } else {
            color = 0;
        }
        return f۶۹a ? a(color) : color;
    }

    @TargetApi(21)
    private static int a(int color) {
        return a.b.g.a.a.c(color, Math.min(Color.alpha(color) * 2, 255));
    }
}
