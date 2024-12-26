package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.content.p۲۰۲e.Cc;
import android.support.v4.content.p۲۰۲e.Cf;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۸e.Cb;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cg;

/* renamed from: a.b.g.a.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc {

    /* renamed from: a, reason: contains not printable characters */
    private static final Ch f۸۶۴۹a;

    /* renamed from: b, reason: contains not printable characters */
    private static final Cg<String, Typeface> f۸۶۵۰b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f۸۶۴۹a = new Cg();
        } else if (i >= 26) {
            f۸۶۴۹a = new Cf();
        } else if (i >= 24 && Ce.m۸۳۷۹a()) {
            f۸۶۴۹a = new Ce();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f۸۶۴۹a = new Cd();
        } else {
            f۸۶۴۹a = new Ch();
        }
        f۸۶۵۰b = new Cg<>(16);
    }

    /* renamed from: b, reason: contains not printable characters */
    public static Typeface m۸۳۷۵b(Resources resources, int id, int style) {
        return f۸۶۵۰b.m۸۵۴۲b(m۸۳۷۴a(resources, id, style));
    }

    /* renamed from: a, reason: contains not printable characters */
    private static String m۸۳۷۴a(Resources resources, int id, int style) {
        return resources.getResourcePackageName(id) + "-" + id + "-" + style;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Typeface m۸۳۷۳a(Context context, Cc.a entry, Resources resources, int id, int style, Cf.a fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Typeface typeface;
        if (!(entry instanceof Cc.d)) {
            typeface = f۸۶۴۹a.mo۸۴۰۸a(context, (Cc.b) entry, resources, style);
            if (fontCallback != null) {
                if (typeface != null) {
                    fontCallback.m۱۰۶۱۸a(typeface, handler);
                } else {
                    fontCallback.m۱۰۶۱۶a(-3, handler);
                }
            }
        } else {
            Cc.d providerEntry = (Cc.d) entry;
            boolean isBlocking = !isRequestFromLayoutInflator ? fontCallback != null : providerEntry.m۱۰۶۰۱a() != 0;
            int timeout = isRequestFromLayoutInflator ? providerEntry.m۱۰۶۰۳c() : -1;
            typeface = Cb.m۸۴۳۸a(context, providerEntry.m۱۰۶۰۲b(), fontCallback, handler, isBlocking, timeout, style);
        }
        if (typeface != null) {
            f۸۶۵۰b.m۸۵۳۸a(m۸۳۷۴a(resources, id, style), typeface);
        }
        return typeface;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Typeface m۸۳۷۱a(Context context, Resources resources, int id, String path, int style) {
        Typeface typeface = f۸۶۴۹a.mo۸۴۰۶a(context, resources, id, path, style);
        if (typeface != null) {
            String resourceUid = m۸۳۷۴a(resources, id, style);
            f۸۶۵۰b.m۸۵۳۸a(resourceUid, typeface);
        }
        return typeface;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Typeface m۸۳۷۲a(Context context, CancellationSignal cancellationSignal, Cb.f[] fonts, int style) {
        return f۸۶۴۹a.mo۸۴۰۷a(context, cancellationSignal, fonts, style);
    }
}
