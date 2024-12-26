package a.b.g.g;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

public class i {
    public static boolean a(Object a2, Object b2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(a2, b2);
        }
        return a2 == b2 || (a2 != null && a2.equals(b2));
    }

    public static int a(Object... values) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(values);
        }
        return Arrays.hashCode(values);
    }
}
