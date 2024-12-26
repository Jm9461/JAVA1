package p۲۸۱c.p۲۸۲a.p۲۸۳a;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.View;

/* renamed from: c.a.a.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Ce {
    /* renamed from: a, reason: contains not printable characters */
    static Drawable m۱۴۵۴۶a(Drawable drawable, int tintColor) {
        drawable.setColorFilter(tintColor, PorterDuff.Mode.SRC_IN);
        return drawable;
    }

    /* renamed from: b, reason: contains not printable characters */
    static Drawable m۱۴۵۴۸b(Context context, int tintColor) {
        NinePatchDrawable toastDrawable = (NinePatchDrawable) m۱۴۵۴۵a(context, Ca.toast_frame);
        m۱۴۵۴۶a(toastDrawable, tintColor);
        return toastDrawable;
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۱۴۵۴۷a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static Drawable m۱۴۵۴۵a(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(id);
        }
        return context.getResources().getDrawable(id);
    }
}
