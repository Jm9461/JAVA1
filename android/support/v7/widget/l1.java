package android.support.v7.widget;

import android.os.Build;
import android.view.View;

public class l1 {
    public static void a(View view, CharSequence tooltipText) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(tooltipText);
        } else {
            m1.a(view, tooltipText);
        }
    }
}
