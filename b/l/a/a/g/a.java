package b.l.a.a.g;

import android.widget.RelativeLayout;

public class a {
    public static int a(RelativeLayout rl, int flag) {
        if (flag == 1) {
            return rl.getTop();
        }
        if (flag == 2) {
            return rl.getBottom();
        }
        if (flag == 3) {
            return rl.getLeft();
        }
        if (flag != 4) {
            return 0;
        }
        return rl.getRight();
    }
}
