package a.b.g.f;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Locale f۳۶۷a = new Locale("", "");

    public static int b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f۳۶۷a)) {
            return 0;
        }
        String scriptSubtag = a.b(locale);
        if (scriptSubtag == null) {
            return a(locale);
        }
        if (scriptSubtag.equalsIgnoreCase("Arab") || scriptSubtag.equalsIgnoreCase("Hebr")) {
            return 1;
        }
        return 0;
    }

    private static int a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
