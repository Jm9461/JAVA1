package p۲۰۸b.p۲۰۹a.p۲۱۰a.p۲۱۲r;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

@TargetApi(21)
/* renamed from: b.a.a.r.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb {
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۳۸۴۰a(Drawable d2, int color) {
        if (d2 instanceof RippleDrawable) {
            ((RippleDrawable) d2).setColor(ColorStateList.valueOf(color));
        }
    }
}
