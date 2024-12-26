package b.j.a.f;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Typeface> f۲۶۳۳a = new HashMap<>();

    public static Typeface a(Context context, String familyName, int style) {
        if (familyName == null || !familyName.startsWith("asset:")) {
            return Typeface.create(familyName, style);
        }
        synchronized (f۲۶۳۳a) {
            try {
                if (!f۲۶۳۳a.containsKey(familyName)) {
                    Typeface typeface = Typeface.createFromAsset(context.getAssets(), familyName.substring("asset:".length()));
                    f۲۶۳۳a.put(familyName, typeface);
                    return typeface;
                }
                return f۲۶۳۳a.get(familyName);
            } catch (Exception e2) {
                return Typeface.DEFAULT;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
