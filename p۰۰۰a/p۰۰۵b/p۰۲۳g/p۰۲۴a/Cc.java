package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.p۰۴۳v4.content.p۰۴۴e.Cc;
import android.support.p۰۴۳v4.content.p۰۴۴e.Cf;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Cb;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cg;

/* renamed from: a.b.g.a.c  reason: invalid class name */
public class Cc {

    /* renamed from: a  reason: contains not printable characters */
    private static final Ch f۸۶۴۹a;

    /* renamed from: b  reason: contains not printable characters */
    private static final Cg<String, Typeface> f۸۶۵۰b = new Cg<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f۸۶۴۹a = new Cg();
        } else if (i >= 26) {
            f۸۶۴۹a = new Cf();
        } else if (i >= 24 && Ce.m۱۰۴۴۴a()) {
            f۸۶۴۹a = new Ce();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f۸۶۴۹a = new Cd();
        } else {
            f۸۶۴۹a = new Ch();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static Typeface m۱۰۴۴۰b(Resources resources, int id, int style) {
        return f۸۶۵۰b.m۱۰۶۱۲b(m۱۰۴۳۹a(resources, id, style));
    }

    /* renamed from: a  reason: contains not printable characters */
    private static String m۱۰۴۳۹a(Resources resources, int id, int style) {
        return resources.getResourcePackageName(id) + "-" + id + "-" + style;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Typeface m۱۰۴۳۸a(Context context, Cc.AbstractCa entry, Resources resources, int id, int style, Cf.AbstractCa fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Typeface typeface;
        if (entry instanceof Cc.Cd) {
            Cc.Cd providerEntry = (Cc.Cd) entry;
            typeface = Cb.m۱۰۵۰۷a(context, providerEntry.m۱۲۶۷۲b(), fontCallback, handler, !isRequestFromLayoutInflator ? fontCallback == null : providerEntry.m۱۲۶۷۱a() == 0, isRequestFromLayoutInflator ? providerEntry.m۱۲۶۷۳c() : -1, style);
        } else {
            typeface = f۸۶۴۹a.m۱۰۴۷۳a(context, (Cc.Cb) entry, resources, style);
            if (fontCallback != null) {
                if (typeface != null) {
                    fontCallback.m۱۲۶۸۸a(typeface, handler);
                } else {
                    fontCallback.m۱۲۶۸۶a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f۸۶۵۰b.m۱۰۶۰۸a(m۱۰۴۳۹a(resources, id, style), typeface);
        }
        return typeface;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Typeface m۱۰۴۳۶a(Context context, Resources resources, int id, String path, int style) {
        Typeface typeface = f۸۶۴۹a.m۱۰۴۷۱a(context, resources, id, path, style);
        if (typeface != null) {
            f۸۶۵۰b.m۱۰۶۰۸a(m۱۰۴۳۹a(resources, id, style), typeface);
        }
        return typeface;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Typeface m۱۰۴۳۷a(Context context, CancellationSignal cancellationSignal, Cb.Cf[] fonts, int style) {
        return f۸۶۴۹a.m۱۰۴۷۲a(context, cancellationSignal, fonts, style);
    }
}
