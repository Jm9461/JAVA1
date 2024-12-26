package at.markushi.p۲۰۶ui.p۲۰۷a;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: at.markushi.ui.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۳۷۳۱a(View view, Drawable d2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(d2);
        } else {
            view.setBackgroundDrawable(d2);
        }
    }
}
