package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۹f;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: a.b.g.f.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ce {

    /* renamed from: a, reason: contains not printable characters */
    private static final Locale f۸۷۳۰a = new Locale("", "");

    /* renamed from: b, reason: contains not printable characters */
    public static int m۸۴۸۵b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f۸۷۳۰a)) {
            String scriptSubtag = Ca.m۸۴۶۲b(locale);
            if (scriptSubtag == null) {
                return m۸۴۸۴a(locale);
            }
            if (scriptSubtag.equalsIgnoreCase("Arab") || scriptSubtag.equalsIgnoreCase("Hebr")) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۸۴۸۴a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
