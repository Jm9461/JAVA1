package a.b.g.a;

import a.b.g.e.b;
import a.b.g.g.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.content.e.c;
import android.support.v4.content.e.f;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final h f۲۸۶a;

    /* renamed from: b  reason: collision with root package name */
    private static final g<String, Typeface> f۲۸۷b = new g<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f۲۸۶a = new g();
        } else if (i >= 26) {
            f۲۸۶a = new f();
        } else if (i >= 24 && e.a()) {
            f۲۸۶a = new e();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f۲۸۶a = new d();
        } else {
            f۲۸۶a = new h();
        }
    }

    public static Typeface b(Resources resources, int id, int style) {
        return f۲۸۷b.b(a(resources, id, style));
    }

    private static String a(Resources resources, int id, int style) {
        return resources.getResourcePackageName(id) + "-" + id + "-" + style;
    }

    public static Typeface a(Context context, c.a entry, Resources resources, int id, int style, f.a fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Typeface typeface;
        if (entry instanceof c.d) {
            c.d providerEntry = (c.d) entry;
            typeface = b.a(context, providerEntry.b(), fontCallback, handler, !isRequestFromLayoutInflator ? fontCallback == null : providerEntry.a() == 0, isRequestFromLayoutInflator ? providerEntry.c() : -1, style);
        } else {
            typeface = f۲۸۶a.a(context, (c.b) entry, resources, style);
            if (fontCallback != null) {
                if (typeface != null) {
                    fontCallback.a(typeface, handler);
                } else {
                    fontCallback.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f۲۸۷b.a(a(resources, id, style), typeface);
        }
        return typeface;
    }

    public static Typeface a(Context context, Resources resources, int id, String path, int style) {
        Typeface typeface = f۲۸۶a.a(context, resources, id, path, style);
        if (typeface != null) {
            f۲۸۷b.a(a(resources, id, style), typeface);
        }
        return typeface;
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fonts, int style) {
        return f۲۸۶a.a(context, cancellationSignal, fonts, style);
    }
}
