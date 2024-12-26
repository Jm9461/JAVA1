package android.support.v4.content.p۲۰۲e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: android.support.v4.content.e.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cf {
    /* renamed from: a, reason: contains not printable characters */
    public static Drawable m۱۰۶۱۴a(Resources res, int id, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return res.getDrawable(id, theme);
        }
        return res.getDrawable(id);
    }

    /* renamed from: android.support.v4.content.e.f$a */
    public static abstract class a {
        /* renamed from: a, reason: contains not printable characters */
        public abstract void mo۱۳۶۰۶a(int i);

        /* renamed from: a, reason: contains not printable characters */
        public abstract void mo۱۳۶۰۷a(Typeface typeface);

        /* renamed from: a, reason: contains not printable characters */
        public final void m۱۰۶۱۸a(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC۱۴۲۷a(typeface));
        }

        /* renamed from: android.support.v4.content.e.f$a$a, reason: collision with other inner class name */
        class RunnableC۱۴۲۷a implements Runnable {

            /* renamed from: c, reason: contains not printable characters */
            final /* synthetic */ Typeface f۱۰۴۷۷c;

            RunnableC۱۴۲۷a(Typeface typeface) {
                this.f۱۰۴۷۷c = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.mo۱۳۶۰۷a(this.f۱۰۴۷۷c);
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        public final void m۱۰۶۱۶a(int reason, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new b(reason));
        }

        /* renamed from: android.support.v4.content.e.f$a$b */
        class b implements Runnable {

            /* renamed from: c, reason: contains not printable characters */
            final /* synthetic */ int f۱۰۴۷۹c;

            b(int i) {
                this.f۱۰۴۷۹c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.mo۱۳۶۰۶a(this.f۱۰۴۷۹c);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Typeface m۱۰۶۱۱a(Context context, int id, TypedValue value, int style, a fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return m۱۰۶۱۲a(context, id, value, style, fontCallback, null, true);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Typeface m۱۰۶۱۲a(Context context, int id, TypedValue value, int style, a fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Resources resources = context.getResources();
        resources.getValue(id, value, true);
        Typeface typeface = m۱۰۶۱۳a(context, resources, value, id, style, fontCallback, handler, isRequestFromLayoutInflator);
        if (typeface == null && fontCallback == null) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(id) + " could not be retrieved.");
        }
        return typeface;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface m۱۰۶۱۳a(android.content.Context r19, android.content.res.Resources r20, android.util.TypedValue r21, int r22, int r23, android.support.v4.content.p۲۰۲e.Cf.a r24, android.os.Handler r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.p۲۰۲e.Cf.m۱۰۶۱۳a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, android.support.v4.content.e.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
