package at.markushi.ui.a;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

public class a {
    public static void a(View view, Drawable d2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(d2);
        } else {
            view.setBackgroundDrawable(d2);
        }
    }
}
