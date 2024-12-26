package b.d.a;

import android.graphics.Color;
import java.util.Random;

/* access modifiers changed from: package-private */
public class l {
    public static float a(float val, float min, float max) {
        return Math.max(Math.min(val, max), min);
    }

    public static int a(int val, int min, int max) {
        return Math.max(Math.min(val, max), min);
    }

    public static float[] a(int color) {
        return new float[]{((float) Color.red(color)) / 255.0f, ((float) Color.green(color)) / 255.0f, ((float) Color.blue(color)) / 255.0f, ((float) Color.alpha(color)) / 255.0f};
    }

    public static float b(float val, float newFromVal, float newToVal) {
        return a(val, -1.0f, 1.0f, newFromVal, newToVal);
    }

    public static float a(float val, float fromVal, float toVal, float newFromVal, float newToVal) {
        return ((newToVal - newFromVal) * ((val - fromVal) / (toVal - fromVal))) + newFromVal;
    }

    public static float a(float squareMag) {
        if (squareMag == 0.0f) {
            return 0.0f;
        }
        return (float) (Math.log10((double) squareMag) * 20.0d);
    }

    public static float c(float prevValue, float newValue, float a2) {
        return (a2 * newValue) + ((1.0f - a2) * prevValue);
    }

    public static float a(float t, float p0, float p1, float p2) {
        double d2 = (double) p0;
        double pow = Math.pow((double) (1.0f - t), 2.0d);
        Double.isNaN(d2);
        double d3 = (double) (2.0f * p1 * t * (1.0f - t));
        Double.isNaN(d3);
        double d4 = (d2 * pow) + d3;
        double d5 = (double) (p2 * t * t);
        Double.isNaN(d5);
        return (float) (d4 + d5);
    }

    public static float a(float value, Random random) {
        return a((float) ((random.nextInt(100) + 70) / 100), 0.7f, 1.3f) * value;
    }

    public static boolean a(byte[] array) {
        for (byte b2 : array) {
            if (b2 != 0) {
                return false;
            }
        }
        return true;
    }
}
