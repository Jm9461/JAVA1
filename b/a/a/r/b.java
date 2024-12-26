package b.a.a.r;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

@TargetApi(21)
public class b {
    public static void a(Drawable d2, int color) {
        if (d2 instanceof RippleDrawable) {
            ((RippleDrawable) d2).setColor(ColorStateList.valueOf(color));
        }
    }
}
