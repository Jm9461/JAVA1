package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a;

import android.graphics.Color;

/* renamed from: a.b.g.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca {
    static {
        new ThreadLocal();
    }

    /* renamed from: b, reason: contains not printable characters */
    public static int m۸۳۵۴b(int foreground, int background) {
        int bgAlpha = Color.alpha(background);
        int fgAlpha = Color.alpha(foreground);
        int a2 = m۸۳۵۲a(fgAlpha, bgAlpha);
        int r = m۸۳۵۳a(Color.red(foreground), fgAlpha, Color.red(background), bgAlpha, a2);
        int g2 = m۸۳۵۳a(Color.green(foreground), fgAlpha, Color.green(background), bgAlpha, a2);
        int b2 = m۸۳۵۳a(Color.blue(foreground), fgAlpha, Color.blue(background), bgAlpha, a2);
        return Color.argb(a2, r, g2, b2);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۸۳۵۲a(int foregroundAlpha, int backgroundAlpha) {
        return 255 - (((255 - backgroundAlpha) * (255 - foregroundAlpha)) / 255);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۸۳۵۳a(int fgC, int fgA, int bgC, int bgA, int a2) {
        if (a2 == 0) {
            return 0;
        }
        return (((fgC * 255) * fgA) + ((bgC * bgA) * (255 - fgA))) / (a2 * 255);
    }

    /* renamed from: c, reason: contains not printable characters */
    public static int m۸۳۵۵c(int color, int alpha) {
        if (alpha < 0 || alpha > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (16777215 & color) | (alpha << 24);
    }
}
