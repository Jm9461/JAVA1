package p۲۰۸b.p۲۷۴l.p۲۷۵a.p۲۷۶a.p۲۷۹g;

import android.widget.RelativeLayout;

/* renamed from: b.l.a.a.g.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {
    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۴۵۰۹a(RelativeLayout rl, int flag) {
        if (flag == 1) {
            int result = rl.getTop();
            return result;
        }
        if (flag == 2) {
            int result2 = rl.getBottom();
            return result2;
        }
        if (flag == 3) {
            int result3 = rl.getLeft();
            return result3;
        }
        if (flag != 4) {
            return 0;
        }
        int result4 = rl.getRight();
        return result4;
    }
}
