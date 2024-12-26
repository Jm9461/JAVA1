package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

public class o1 extends Resources {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f۲۲۰۷b = false;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f۲۲۰۸a;

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    public o1(Context context, Resources res) {
        super(res.getAssets(), res.getDisplayMetrics(), res.getConfiguration());
        this.f۲۲۰۸a = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int id) {
        Context context = this.f۲۲۰۸a.get();
        if (context != null) {
            return j.a().a(context, this, id);
        }
        return super.getDrawable(id);
    }

    /* access modifiers changed from: package-private */
    public final Drawable a(int id) {
        return super.getDrawable(id);
    }

    public static boolean a() {
        return f۲۲۰۷b;
    }
}
