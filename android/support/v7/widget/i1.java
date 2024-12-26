package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class i1 extends w0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f۲۱۰۵b;

    public i1(Context context, Resources res) {
        super(res);
        this.f۲۱۰۵b = new WeakReference<>(context);
    }

    @Override // android.support.v7.widget.w0, android.content.res.Resources
    public Drawable getDrawable(int id) {
        Drawable d2 = super.getDrawable(id);
        Context context = this.f۲۱۰۵b.get();
        if (!(d2 == null || context == null)) {
            j.a();
            j.a(context, id, d2);
        }
        return d2;
    }
}
