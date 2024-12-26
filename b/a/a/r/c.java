package b.a.a.r;

import a.b.g.g.n;
import android.content.Context;
import android.graphics.Typeface;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final n<String, Typeface> f۲۳۸۱a = new n<>();

    public static Typeface a(Context c2, String name) {
        synchronized (f۲۳۸۱a) {
            if (!f۲۳۸۱a.containsKey(name)) {
                try {
                    Typeface t = Typeface.createFromAsset(c2.getAssets(), String.format("fonts/%s", name));
                    f۲۳۸۱a.put(name, t);
                    return t;
                } catch (RuntimeException e2) {
                    return null;
                }
            } else {
                return f۲۳۸۱a.get(name);
            }
        }
    }
}
