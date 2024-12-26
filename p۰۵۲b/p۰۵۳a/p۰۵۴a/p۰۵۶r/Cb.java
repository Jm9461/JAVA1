package p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

@TargetApi(21)
/* renamed from: b.a.a.r.b  reason: invalid class name */
public class Cb {
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۵۹۱۰a(Drawable d, int color) {
        if (d instanceof RippleDrawable) {
            ((RippleDrawable) d).setColor(ColorStateList.valueOf(color));
        }
    }
}
