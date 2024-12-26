package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: a.b.g.g.i  reason: invalid class name */
public class Ci {
    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۰۶۳۳a(Object a, Object b) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(a, b);
        }
        return a == b || (a != null && a.equals(b));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۰۶۳۲a(Object... values) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(values);
        }
        return Arrays.hashCode(values);
    }
}
