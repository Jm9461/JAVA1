package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.i1  reason: invalid class name */
public class Ci1 extends Cw0 {

    /* renamed from: b  reason: contains not printable characters */
    private final WeakReference<Context> f۱۲۱۰۱b;

    public Ci1(Context context, Resources res) {
        super(res);
        this.f۱۲۱۰۱b = new WeakReference<>(context);
    }

    @Override // android.support.p۰۴۷v7.widget.Cw0, android.content.res.Resources
    public Drawable getDrawable(int id) {
        Drawable d = super.getDrawable(id);
        Context context = this.f۱۲۱۰۱b.get();
        if (!(d == null || context == null)) {
            Cj.m۱۵۲۸۷a();
            Cj.m۱۵۲۹۳a(context, id, d);
        }
        return d;
    }
}
