package cafe.adriel.androidaudiorecorder;

import android.graphics.Color;
import android.os.Handler;
import cafe.adriel.androidaudiorecorder.j.a;
import cafe.adriel.androidaudiorecorder.j.b;
import g.c;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f۲۶۹۰a = new Handler();

    public static void a(int millis, Runnable callback) {
        f۲۶۹۰a.postDelayed(callback, (long) millis);
    }

    public static c a(cafe.adriel.androidaudiorecorder.j.c source, a channel, b sampleRate) {
        return new c.a(source.a(), 2, channel.a(), sampleRate.a());
    }

    public static boolean d(int color) {
        if (17170445 == color) {
            return true;
        }
        int[] rgb = {Color.red(color), Color.green(color), Color.blue(color)};
        double d2 = (double) (rgb[0] * rgb[0]);
        Double.isNaN(d2);
        double d3 = (double) (rgb[1] * rgb[1]);
        Double.isNaN(d3);
        double d4 = (d2 * 0.241d) + (d3 * 0.691d);
        double d5 = (double) (rgb[2] * rgb[2]);
        Double.isNaN(d5);
        if (((int) Math.sqrt(d4 + (d5 * 0.068d))) >= 200) {
            return true;
        }
        return false;
    }

    public static int b(int color) {
        return Color.argb(Color.alpha(color), Math.max((int) (((float) Color.red(color)) * 0.8f), 0), Math.max((int) (((float) Color.green(color)) * 0.8f), 0), Math.max((int) (((float) Color.blue(color)) * 0.8f), 0));
    }

    public static String a(int seconds) {
        return c(seconds / 3600) + ":" + c(seconds / 60) + ":" + c(seconds % 60);
    }

    private static String c(int value) {
        if (value < 0 || value > 9) {
            return value + "";
        }
        return "0" + value;
    }
}
