package p۱۲۵c.p۱۲۶a.p۱۲۷a;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.View;

/* renamed from: c.a.a.e  reason: invalid class name */
final class Ce {
    /* renamed from: a  reason: contains not printable characters */
    static Drawable m۱۶۶۲۱a(Drawable drawable, int tintColor) {
        drawable.setColorFilter(tintColor, PorterDuff.Mode.SRC_IN);
        return drawable;
    }

    /* renamed from: b  reason: contains not printable characters */
    static Drawable m۱۶۶۲۳b(Context context, int tintColor) {
        NinePatchDrawable toastDrawable = (NinePatchDrawable) m۱۶۶۲۰a(context, Ca.toast_frame);
        m۱۶۶۲۱a(toastDrawable, tintColor);
        return toastDrawable;
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۶۶۲۲a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static Drawable m۱۶۶۲۰a(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(id);
        }
        return context.getResources().getDrawable(id);
    }
}
