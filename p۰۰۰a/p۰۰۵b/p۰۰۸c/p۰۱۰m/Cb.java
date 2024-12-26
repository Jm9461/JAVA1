package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۰m;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;

/* access modifiers changed from: package-private */
@TargetApi(21)
/* renamed from: a.b.c.m.b  reason: invalid class name */
public class Cb extends RippleDrawable {
    Cb(ColorStateList color, InsetDrawable content, Drawable mask) {
        super(color, content, mask);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (getDrawable(0) != null) {
            ((GradientDrawable) ((LayerDrawable) ((InsetDrawable) getDrawable(0)).getDrawable()).getDrawable(0)).setColorFilter(colorFilter);
        }
    }
}
