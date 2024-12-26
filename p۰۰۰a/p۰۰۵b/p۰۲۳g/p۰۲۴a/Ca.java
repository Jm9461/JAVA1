package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a;

import android.graphics.Color;

/* renamed from: a.b.g.a.a  reason: invalid class name */
public final class Ca {
    static {
        new ThreadLocal();
    }

    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۰۴۱۹b(int foreground, int background) {
        int bgAlpha = Color.alpha(background);
        int fgAlpha = Color.alpha(foreground);
        int a = m۱۰۴۱۷a(fgAlpha, bgAlpha);
        return Color.argb(a, m۱۰۴۱۸a(Color.red(foreground), fgAlpha, Color.red(background), bgAlpha, a), m۱۰۴۱۸a(Color.green(foreground), fgAlpha, Color.green(background), bgAlpha, a), m۱۰۴۱۸a(Color.blue(foreground), fgAlpha, Color.blue(background), bgAlpha, a));
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۰۴۱۷a(int foregroundAlpha, int backgroundAlpha) {
        return 255 - (((255 - backgroundAlpha) * (255 - foregroundAlpha)) / 255);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۰۴۱۸a(int fgC, int fgA, int bgC, int bgA, int a) {
        if (a == 0) {
            return 0;
        }
        return (((fgC * 255) * fgA) + ((bgC * bgA) * (255 - fgA))) / (a * 255);
    }

    /* renamed from: c  reason: contains not printable characters */
    public static int m۱۰۴۲۰c(int color, int alpha) {
        if (alpha >= 0 && alpha <= 255) {
            return (16777215 & color) | (alpha << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
