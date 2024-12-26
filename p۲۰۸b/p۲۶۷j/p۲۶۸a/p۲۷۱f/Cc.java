package p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۱f;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;

/* renamed from: b.j.a.f.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc {

    /* renamed from: a, reason: contains not printable characters */
    private static final HashMap<String, Typeface> f۱۳۱۰۹a = new HashMap<>();

    /* renamed from: a, reason: contains not printable characters */
    public static Typeface m۱۴۴۳۱a(Context context, String familyName, int style) {
        if (familyName != null && familyName.startsWith("asset:")) {
            synchronized (f۱۳۱۰۹a) {
                try {
                    try {
                        if (!f۱۳۱۰۹a.containsKey(familyName)) {
                            Typeface typeface = Typeface.createFromAsset(context.getAssets(), familyName.substring("asset:".length()));
                            f۱۳۱۰۹a.put(familyName, typeface);
                            return typeface;
                        }
                        return f۱۳۱۰۹a.get(familyName);
                    } catch (Exception e2) {
                        return Typeface.DEFAULT;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Typeface.create(familyName, style);
    }
}
