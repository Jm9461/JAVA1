package android.support.v4.content.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

public final class f {
    public static Drawable a(Resources res, int id, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return res.getDrawable(id, theme);
        }
        return res.getDrawable(id);
    }

    public static abstract class a {
        public abstract void a(int i);

        public abstract void a(Typeface typeface);

        public final void a(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC۰۰۲۹a(typeface));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v4.content.e.f$a$a  reason: collision with other inner class name */
        public class RunnableC۰۰۲۹a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Typeface f۱۲۷۹c;

            RunnableC۰۰۲۹a(Typeface typeface) {
                this.f۱۲۷۹c = typeface;
            }

            public void run() {
                a.this.a(this.f۱۲۷۹c);
            }
        }

        public final void a(int reason, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new b(reason));
        }

        /* access modifiers changed from: package-private */
        public class b implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f۱۲۸۱c;

            b(int i) {
                this.f۱۲۸۱c = i;
            }

            public void run() {
                a.this.a(this.f۱۲۸۱c);
            }
        }
    }

    public static Typeface a(Context context, int id, TypedValue value, int style, a fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, id, value, style, fontCallback, null, true);
    }

    private static Typeface a(Context context, int id, TypedValue value, int style, a fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Resources resources = context.getResources();
        resources.getValue(id, value, true);
        Typeface typeface = a(context, resources, value, id, style, fontCallback, handler, isRequestFromLayoutInflator);
        if (typeface != null || fontCallback != null) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(id) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface a(android.content.Context r19, android.content.res.Resources r20, android.util.TypedValue r21, int r22, int r23, android.support.v4.content.e.f.a r24, android.os.Handler r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.e.f.a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, android.support.v4.content.e.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
