package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: a.b.g.g.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ci {
    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۸۵۶۳a(Object a2, Object b2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(a2, b2);
        }
        return a2 == b2 || (a2 != null && a2.equals(b2));
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۸۵۶۲a(Object... values) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(values);
        }
        return Arrays.hashCode(values);
    }
}
