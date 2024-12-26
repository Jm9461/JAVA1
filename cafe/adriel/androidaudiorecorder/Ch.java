package cafe.adriel.androidaudiorecorder;

import android.graphics.Color;
import android.os.Handler;
import cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCa;
import cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCb;
import cafe.adriel.androidaudiorecorder.p۱۲۸j.EnumCc;
import p۱۵۰g.AbstractCc;

/* renamed from: cafe.adriel.androidaudiorecorder.h  reason: invalid class name */
public class Ch {

    /* renamed from: a  reason: contains not printable characters */
    private static final Handler f۱۳۲۱۴a = new Handler();

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۶۶۰a(int millis, Runnable callback) {
        f۱۳۲۱۴a.postDelayed(callback, (long) millis);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCc m۱۶۶۵۸a(EnumCc source, EnumCa channel, EnumCb sampleRate) {
        return new AbstractCc.Ca(source.m۱۶۶۶۹a(), 2, channel.m۱۶۶۶۷a(), sampleRate.m۱۶۶۶۸a());
    }

    /* renamed from: d  reason: contains not printable characters */
    public static boolean m۱۶۶۶۳d(int color) {
        if (17170445 == color) {
            return true;
        }
        int[] rgb = {Color.red(color), Color.green(color), Color.blue(color)};
        double d = (double) (rgb[0] * rgb[0]);
        Double.isNaN(d);
        double d2 = (double) (rgb[1] * rgb[1]);
        Double.isNaN(d2);
        double d3 = (d * 0.241d) + (d2 * 0.691d);
        double d4 = (double) (rgb[2] * rgb[2]);
        Double.isNaN(d4);
        if (((int) Math.sqrt(d3 + (d4 * 0.068d))) >= 200) {
            return true;
        }
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۶۶۶۱b(int color) {
        return Color.argb(Color.alpha(color), Math.max((int) (((float) Color.red(color)) * 0.8f), 0), Math.max((int) (((float) Color.green(color)) * 0.8f), 0), Math.max((int) (((float) Color.blue(color)) * 0.8f), 0));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۶۶۵۹a(int seconds) {
        return m۱۶۶۶۲c(seconds / 3600) + ":" + m۱۶۶۶۲c(seconds / 60) + ":" + m۱۶۶۶۲c(seconds % 60);
    }

    /* renamed from: c  reason: contains not printable characters */
    private static String m۱۶۶۶۲c(int value) {
        if (value < 0 || value > 9) {
            return value + "";
        }
        return "0" + value;
    }
}
