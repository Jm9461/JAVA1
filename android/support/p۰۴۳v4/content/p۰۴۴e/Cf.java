package android.support.p۰۴۳v4.content.p۰۴۴e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: android.support.v4.content.e.f  reason: invalid class name */
public final class Cf {
    /* renamed from: a  reason: contains not printable characters */
    public static Drawable m۱۲۶۸۴a(Resources res, int id, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return res.getDrawable(id, theme);
        }
        return res.getDrawable(id);
    }

    /* renamed from: android.support.v4.content.e.f$a  reason: invalid class name */
    public static abstract class AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۲۶۸۵a(int i);

        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۲۶۸۷a(Typeface typeface);

        /* renamed from: a  reason: contains not printable characters */
        public final void m۱۲۶۸۸a(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableCa(typeface));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v4.content.e.f$a$a  reason: invalid class name */
        public class RunnableCa implements Runnable {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ Typeface f۱۰۴۷۷c;

            RunnableCa(Typeface typeface) {
                this.f۱۰۴۷۷c = typeface;
            }

            public void run() {
                AbstractCa.this.m۱۲۶۸۷a(this.f۱۰۴۷۷c);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public final void m۱۲۶۸۶a(int reason, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableCb(reason));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v4.content.e.f$a$b  reason: invalid class name */
        public class RunnableCb implements Runnable {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ int f۱۰۴۷۹c;

            RunnableCb(int i) {
                this.f۱۰۴۷۹c = i;
            }

            public void run() {
                AbstractCa.this.m۱۲۶۸۵a(this.f۱۰۴۷۹c);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Typeface m۱۲۶۸۱a(Context context, int id, TypedValue value, int style, AbstractCa fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return m۱۲۶۸۲a(context, id, value, style, fontCallback, null, true);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Typeface m۱۲۶۸۲a(Context context, int id, TypedValue value, int style, AbstractCa fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Resources resources = context.getResources();
        resources.getValue(id, value, true);
        Typeface typeface = m۱۲۶۸۳a(context, resources, value, id, style, fontCallback, handler, isRequestFromLayoutInflator);
        if (typeface != null || fontCallback != null) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(id) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f3  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m۱۲۶۸۳a(android.content.Context r19, android.content.res.Resources r20, android.util.TypedValue r21, int r22, int r23, android.support.p۰۴۳v4.content.p۰۴۴e.Cf.AbstractCa r24, android.os.Handler r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۳v4.content.p۰۴۴e.Cf.m۱۲۶۸۳a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, android.support.v4.content.e.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
