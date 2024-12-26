package p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r;

import android.content.Context;
import android.graphics.Typeface;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cn;

/* renamed from: b.a.a.r.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc {

    /* renamed from: a, reason: contains not printable characters */
    private static final Cn<String, Typeface> f۱۲۶۰۰a = new Cn<>();

    /* renamed from: a, reason: contains not printable characters */
    public static Typeface m۱۳۸۴۱a(Context c2, String name) {
        synchronized (f۱۲۶۰۰a) {
            if (!f۱۲۶۰۰a.containsKey(name)) {
                try {
                    Typeface t = Typeface.createFromAsset(c2.getAssets(), String.format("fonts/%s", name));
                    f۱۲۶۰۰a.put(name, t);
                    return t;
                } catch (RuntimeException e2) {
                    return null;
                }
            }
            return f۱۲۶۰۰a.get(name);
        }
    }
}
