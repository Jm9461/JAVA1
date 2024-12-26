package p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r;

import android.content.Context;
import android.graphics.Typeface;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cn;

/* renamed from: b.a.a.r.c  reason: invalid class name */
public class Cc {

    /* renamed from: a  reason: contains not printable characters */
    private static final Cn<String, Typeface> f۱۲۶۰۰a = new Cn<>();

    /* renamed from: a  reason: contains not printable characters */
    public static Typeface m۱۵۹۱۱a(Context c, String name) {
        synchronized (f۱۲۶۰۰a) {
            if (!f۱۲۶۰۰a.containsKey(name)) {
                try {
                    Typeface t = Typeface.createFromAsset(c.getAssets(), String.format("fonts/%s", name));
                    f۱۲۶۰۰a.put(name, t);
                    return t;
                } catch (RuntimeException e) {
                    return null;
                }
            } else {
                return f۱۲۶۰۰a.get(name);
            }
        }
    }
}
