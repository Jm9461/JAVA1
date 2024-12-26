package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.o1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Co1 extends Resources {

    /* renamed from: b, reason: contains not printable characters */
    private static boolean f۱۲۲۶۰b = false;

    /* renamed from: a, reason: contains not printable characters */
    private final WeakReference<Context> f۱۲۲۶۱a;

    /* renamed from: b, reason: contains not printable characters */
    public static boolean m۱۳۴۰۹b() {
        return m۱۳۴۰۸a() && Build.VERSION.SDK_INT <= 20;
    }

    public Co1(Context context, Resources res) {
        super(res.getAssets(), res.getDisplayMetrics(), res.getConfiguration());
        this.f۱۲۲۶۱a = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int id) {
        Context context = this.f۱۲۲۶۱a.get();
        if (context != null) {
            return Cj.m۱۳۲۱۷a().m۱۳۲۳۸a(context, this, id);
        }
        return super.getDrawable(id);
    }

    /* renamed from: a, reason: contains not printable characters */
    final Drawable m۱۳۴۱۰a(int id) {
        return super.getDrawable(id);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۳۴۰۸a() {
        return f۱۲۲۶۰b;
    }
}
