package p۲۰۸b.p۲۲۰d.p۲۲۱a;

import android.graphics.Color;
import java.util.Random;

/* renamed from: b.d.a.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cl {
    /* renamed from: a, reason: contains not printable characters */
    public static float m۱۳۹۳۳a(float val, float min, float max) {
        return Math.max(Math.min(val, max), min);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۳۹۳۷a(int val, int min, int max) {
        return Math.max(Math.min(val, max), min);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static float[] m۱۳۹۳۹a(int color) {
        return new float[]{Color.red(color) / 255.0f, Color.green(color) / 255.0f, Color.blue(color) / 255.0f, Color.alpha(color) / 255.0f};
    }

    /* renamed from: b, reason: contains not printable characters */
    public static float m۱۳۹۴۰b(float val, float newFromVal, float newToVal) {
        return m۱۳۹۳۵a(val, -1.0f, 1.0f, newFromVal, newToVal);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static float m۱۳۹۳۵a(float val, float fromVal, float toVal, float newFromVal, float newToVal) {
        float perc = (val - fromVal) / (toVal - fromVal);
        return ((newToVal - newFromVal) * perc) + newFromVal;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static float m۱۳۹۳۲a(float squareMag) {
        if (squareMag == 0.0f) {
            return 0.0f;
        }
        return (float) (Math.log10(squareMag) * 20.0d);
    }

    /* renamed from: c, reason: contains not printable characters */
    public static float m۱۳۹۴۱c(float prevValue, float newValue, float a2) {
        return (a2 * newValue) + ((1.0f - a2) * prevValue);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static float m۱۳۹۳۴a(float t, float p0, float p1, float p2) {
        double d2 = p0;
        double pow = Math.pow(1.0f - t, 2.0d);
        Double.isNaN(d2);
        double d3 = 2.0f * p1 * t * (1.0f - t);
        Double.isNaN(d3);
        double d4 = (d2 * pow) + d3;
        double d5 = p2 * t * t;
        Double.isNaN(d5);
        return (float) (d4 + d5);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static float m۱۳۹۳۶a(float value, Random random) {
        float perc = m۱۳۹۳۳a((random.nextInt(100) + 70) / 100, 0.7f, 1.3f);
        return perc * value;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۳۹۳۸a(byte[] array) {
        for (byte b2 : array) {
            if (b2 != 0) {
                return false;
            }
        }
        return true;
    }
}
