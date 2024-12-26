package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.i1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ci1 extends Cw0 {

    /* renamed from: b, reason: contains not printable characters */
    private final WeakReference<Context> f۱۲۱۰۱b;

    public Ci1(Context context, Resources res) {
        super(res);
        this.f۱۲۱۰۱b = new WeakReference<>(context);
    }

    @Override // android.support.v7.widget.Cw0, android.content.res.Resources
    public Drawable getDrawable(int id) {
        Drawable d2 = super.getDrawable(id);
        Context context = this.f۱۲۱۰۱b.get();
        if (d2 != null && context != null) {
            Cj.m۱۳۲۱۷a();
            Cj.m۱۳۲۲۳a(context, id, d2);
        }
        return d2;
    }
}
