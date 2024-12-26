package p۰۴۹at.markushi.p۰۵۰ui.p۰۵۱a;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: at.markushi.ui.a.a  reason: invalid class name */
public class Ca {
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۵۸۰۱a(View view, Drawable d) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(d);
        } else {
            view.setBackgroundDrawable(d);
        }
    }
}
