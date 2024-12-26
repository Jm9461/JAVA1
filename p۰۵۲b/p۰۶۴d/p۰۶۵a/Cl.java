package p۰۵۲b.p۰۶۴d.p۰۶۵a;

import android.graphics.Color;
import java.util.Random;

/* access modifiers changed from: package-private */
/* renamed from: b.d.a.l  reason: invalid class name */
public class Cl {
    /* renamed from: a  reason: contains not printable characters */
    public static float m۱۶۰۰۳a(float val, float min, float max) {
        return Math.max(Math.min(val, max), min);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۶۰۰۷a(int val, int min, int max) {
        return Math.max(Math.min(val, max), min);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static float[] m۱۶۰۰۹a(int color) {
        return new float[]{((float) Color.red(color)) / 255.0f, ((float) Color.green(color)) / 255.0f, ((float) Color.blue(color)) / 255.0f, ((float) Color.alpha(color)) / 255.0f};
    }

    /* renamed from: b  reason: contains not printable characters */
    public static float m۱۶۰۱۰b(float val, float newFromVal, float newToVal) {
        return m۱۶۰۰۵a(val, -1.0f, 1.0f, newFromVal, newToVal);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static float m۱۶۰۰۵a(float val, float fromVal, float toVal, float newFromVal, float newToVal) {
        return ((newToVal - newFromVal) * ((val - fromVal) / (toVal - fromVal))) + newFromVal;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static float m۱۶۰۰۲a(float squareMag) {
        if (squareMag == 0.0f) {
            return 0.0f;
        }
        return (float) (Math.log10((double) squareMag) * 20.0d);
    }

    /* renamed from: c  reason: contains not printable characters */
    public static float m۱۶۰۱۱c(float prevValue, float newValue, float a) {
        return (a * newValue) + ((1.0f - a) * prevValue);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static float m۱۶۰۰۴a(float t, float p0, float p1, float p2) {
        double d = (double) p0;
        double pow = Math.pow((double) (1.0f - t), 2.0d);
        Double.isNaN(d);
        double d2 = (double) (2.0f * p1 * t * (1.0f - t));
        Double.isNaN(d2);
        double d3 = (d * pow) + d2;
        double d4 = (double) (p2 * t * t);
        Double.isNaN(d4);
        return (float) (d3 + d4);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static float m۱۶۰۰۶a(float value, Random random) {
        return m۱۶۰۰۳a((float) ((random.nextInt(100) + 70) / 100), 0.7f, 1.3f) * value;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۶۰۰۸a(byte[] array) {
        for (byte b : array) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }
}
