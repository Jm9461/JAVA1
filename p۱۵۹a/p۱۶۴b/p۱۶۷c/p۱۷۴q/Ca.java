package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۴q;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;

/* renamed from: a.b.c.q.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {

    /* renamed from: a, reason: contains not printable characters */
    public static final boolean f۸۳۱۸a;

    /* renamed from: b, reason: contains not printable characters */
    private static final int[] f۸۳۱۹b;

    /* renamed from: c, reason: contains not printable characters */
    private static final int[] f۸۳۲۰c;

    /* renamed from: d, reason: contains not printable characters */
    private static final int[] f۸۳۲۱d;

    /* renamed from: e, reason: contains not printable characters */
    private static final int[] f۸۳۲۲e;

    /* renamed from: f, reason: contains not printable characters */
    private static final int[] f۸۳۲۳f;

    /* renamed from: g, reason: contains not printable characters */
    private static final int[] f۸۳۲۴g;

    /* renamed from: h, reason: contains not printable characters */
    private static final int[] f۸۳۲۵h;

    /* renamed from: i, reason: contains not printable characters */
    private static final int[] f۸۳۲۶i;

    /* renamed from: j, reason: contains not printable characters */
    private static final int[] f۸۳۲۷j;

    static {
        f۸۳۱۸a = Build.VERSION.SDK_INT >= 21;
        f۸۳۱۹b = new int[]{R.attr.state_pressed};
        f۸۳۲۰c = new int[]{R.attr.state_hovered, R.attr.state_focused};
        f۸۳۲۱d = new int[]{R.attr.state_focused};
        f۸۳۲۲e = new int[]{R.attr.state_hovered};
        f۸۳۲۳f = new int[]{R.attr.state_selected, R.attr.state_pressed};
        f۸۳۲۴g = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        f۸۳۲۵h = new int[]{R.attr.state_selected, R.attr.state_focused};
        f۸۳۲۶i = new int[]{R.attr.state_selected, R.attr.state_hovered};
        f۸۳۲۷j = new int[]{R.attr.state_selected};
    }

    /* renamed from: a, reason: contains not printable characters */
    public static ColorStateList m۷۹۶۷a(ColorStateList rippleColor) {
        if (f۸۳۱۸a) {
            int[][] states = new int[2][];
            int[] colors = new int[2];
            states[0] = f۸۳۲۷j;
            colors[0] = m۷۹۶۶a(rippleColor, f۸۳۲۳f);
            int i = 0 + 1;
            states[i] = StateSet.NOTHING;
            colors[i] = m۷۹۶۶a(rippleColor, f۸۳۱۹b);
            int i2 = i + 1;
            return new ColorStateList(states, colors);
        }
        int[][] states2 = new int[10][];
        int[] colors2 = new int[10];
        int[] iArr = f۸۳۲۳f;
        states2[0] = iArr;
        colors2[0] = m۷۹۶۶a(rippleColor, iArr);
        int i3 = 0 + 1;
        int[] iArr2 = f۸۳۲۴g;
        states2[i3] = iArr2;
        colors2[i3] = m۷۹۶۶a(rippleColor, iArr2);
        int i4 = i3 + 1;
        int[] iArr3 = f۸۳۲۵h;
        states2[i4] = iArr3;
        colors2[i4] = m۷۹۶۶a(rippleColor, iArr3);
        int i5 = i4 + 1;
        int[] iArr4 = f۸۳۲۶i;
        states2[i5] = iArr4;
        colors2[i5] = m۷۹۶۶a(rippleColor, iArr4);
        int i6 = i5 + 1;
        states2[i6] = f۸۳۲۷j;
        colors2[i6] = 0;
        int i7 = i6 + 1;
        int[] iArr5 = f۸۳۱۹b;
        states2[i7] = iArr5;
        colors2[i7] = m۷۹۶۶a(rippleColor, iArr5);
        int i8 = i7 + 1;
        int[] iArr6 = f۸۳۲۰c;
        states2[i8] = iArr6;
        colors2[i8] = m۷۹۶۶a(rippleColor, iArr6);
        int i9 = i8 + 1;
        int[] iArr7 = f۸۳۲۱d;
        states2[i9] = iArr7;
        colors2[i9] = m۷۹۶۶a(rippleColor, iArr7);
        int i10 = i9 + 1;
        int[] iArr8 = f۸۳۲۲e;
        states2[i10] = iArr8;
        colors2[i10] = m۷۹۶۶a(rippleColor, iArr8);
        int i11 = i10 + 1;
        states2[i11] = StateSet.NOTHING;
        colors2[i11] = 0;
        int i12 = i11 + 1;
        return new ColorStateList(states2, colors2);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۷۹۶۶a(ColorStateList rippleColor, int[] state) {
        int color;
        if (rippleColor != null) {
            color = rippleColor.getColorForState(state, rippleColor.getDefaultColor());
        } else {
            color = 0;
        }
        return f۸۳۱۸a ? m۷۹۶۵a(color) : color;
    }

    @TargetApi(21)
    /* renamed from: a, reason: contains not printable characters */
    private static int m۷۹۶۵a(int color) {
        int alpha = Math.min(Color.alpha(color) * 2, 255);
        return p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Ca.m۸۳۵۵c(color, alpha);
    }
}
