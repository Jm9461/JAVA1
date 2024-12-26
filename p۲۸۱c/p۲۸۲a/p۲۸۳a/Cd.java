package p۲۸۱c.p۲۸۲a.p۲۸۳a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint({"InflateParams"})
/* renamed from: c.a.a.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cd {

    /* renamed from: a, reason: contains not printable characters */
    private static int f۱۳۱۵۹a = Color.parseColor("#FFFFFF");

    /* renamed from: b, reason: contains not printable characters */
    private static int f۱۳۱۶۰b = Color.parseColor("#D50000");

    /* renamed from: c, reason: contains not printable characters */
    private static int f۱۳۱۶۱c = Color.parseColor("#3F51B5");

    /* renamed from: d, reason: contains not printable characters */
    private static int f۱۳۱۶۲d = Color.parseColor("#388E3C");

    /* renamed from: e, reason: contains not printable characters */
    private static int f۱۳۱۶۳e = Color.parseColor("#FFA900");

    /* renamed from: f, reason: contains not printable characters */
    private static int f۱۳۱۶۴f = Color.parseColor("#353A3E");

    /* renamed from: g, reason: contains not printable characters */
    private static final Typeface f۱۳۱۶۵g = Typeface.create("sans-serif-condensed", 0);

    /* renamed from: h, reason: contains not printable characters */
    private static Typeface f۱۳۱۶۶h = f۱۳۱۶۵g;

    /* renamed from: i, reason: contains not printable characters */
    private static int f۱۳۱۶۷i = 16;

    /* renamed from: j, reason: contains not printable characters */
    private static boolean f۱۳۱۶۸j = true;

    /* renamed from: a, reason: contains not printable characters */
    public static Toast m۱۴۵۲۱a(Context context, CharSequence message, int duration) {
        return m۱۴۵۲۲a(context, message, duration, null, false);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Toast m۱۴۵۲۲a(Context context, CharSequence message, int duration, Drawable icon, boolean withIcon) {
        return m۱۴۵۲۴a(context, message, icon, f۱۳۱۶۴f, duration, withIcon, true);
    }

    /* renamed from: d, reason: contains not printable characters */
    public static Toast m۱۴۵۳۴d(Context context, CharSequence message, int duration, boolean withIcon) {
        return m۱۴۵۲۴a(context, message, Ce.m۱۴۵۴۵a(context, Ca.ic_error_outline_white_48dp), f۱۳۱۶۳e, duration, withIcon, true);
    }

    /* renamed from: b, reason: contains not printable characters */
    public static Toast m۱۴۵۲۸b(Context context, CharSequence message, int duration, boolean withIcon) {
        return m۱۴۵۲۴a(context, message, Ce.m۱۴۵۴۵a(context, Ca.ic_info_outline_white_48dp), f۱۳۱۶۱c, duration, withIcon, true);
    }

    /* renamed from: c, reason: contains not printable characters */
    public static Toast m۱۴۵۳۱c(Context context, CharSequence message, int duration, boolean withIcon) {
        return m۱۴۵۲۴a(context, message, Ce.m۱۴۵۴۵a(context, Ca.ic_check_white_48dp), f۱۳۱۶۲d, duration, withIcon, true);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Toast m۱۴۵۲۳a(Context context, CharSequence message, int duration, boolean withIcon) {
        return m۱۴۵۲۴a(context, message, Ce.m۱۴۵۴۵a(context, Ca.ic_clear_white_48dp), f۱۳۱۶۰b, duration, withIcon, true);
    }

    @SuppressLint({"ShowToast"})
    /* renamed from: a, reason: contains not printable characters */
    public static Toast m۱۴۵۲۴a(Context context, CharSequence message, Drawable icon, int tintColor, int duration, boolean withIcon, boolean shouldTint) {
        Drawable drawableFrame;
        Toast currentToast = Toast.makeText(context, (CharSequence) null, duration);
        View toastLayout = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(Cc.toast_layout, (ViewGroup) null);
        ImageView toastIcon = (ImageView) toastLayout.findViewById(Cb.toast_icon);
        TextView toastTextView = (TextView) toastLayout.findViewById(Cb.toast_text);
        if (shouldTint) {
            drawableFrame = Ce.m۱۴۵۴۸b(context, tintColor);
        } else {
            drawableFrame = Ce.m۱۴۵۴۵a(context, Ca.toast_frame);
        }
        Ce.m۱۴۵۴۷a(toastLayout, drawableFrame);
        if (withIcon) {
            if (icon == null) {
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            }
            if (f۱۳۱۶۸j) {
                icon = Ce.m۱۴۵۴۶a(icon, f۱۳۱۵۹a);
            }
            Ce.m۱۴۵۴۷a(toastIcon, icon);
        } else {
            toastIcon.setVisibility(8);
        }
        toastTextView.setText(message);
        toastTextView.setTextColor(f۱۳۱۵۹a);
        toastTextView.setTypeface(f۱۳۱۶۶h);
        toastTextView.setTextSize(2, f۱۳۱۶۷i);
        currentToast.setView(toastLayout);
        return currentToast;
    }

    /* renamed from: c.a.a.d$a */
    public static class a {

        /* renamed from: a, reason: contains not printable characters */
        private int f۱۳۱۶۹a = Cd.f۱۳۱۵۹a;

        /* renamed from: b, reason: contains not printable characters */
        private int f۱۳۱۷۰b = Cd.f۱۳۱۶۰b;

        /* renamed from: c, reason: contains not printable characters */
        private int f۱۳۱۷۱c = Cd.f۱۳۱۶۱c;

        /* renamed from: d, reason: contains not printable characters */
        private int f۱۳۱۷۲d = Cd.f۱۳۱۶۲d;

        /* renamed from: e, reason: contains not printable characters */
        private int f۱۳۱۷۳e = Cd.f۱۳۱۶۳e;

        /* renamed from: f, reason: contains not printable characters */
        private Typeface f۱۳۱۷۴f = Cd.f۱۳۱۶۶h;

        /* renamed from: g, reason: contains not printable characters */
        private int f۱۳۱۷۵g = Cd.f۱۳۱۶۷i;

        /* renamed from: h, reason: contains not printable characters */
        private boolean f۱۳۱۷۶h = Cd.f۱۳۱۶۸j;

        private a() {
        }

        /* renamed from: b, reason: contains not printable characters */
        public static a m۱۴۵۴۱b() {
            return new a();
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۴۵۴۳a(Typeface typeface) {
            this.f۱۳۱۷۴f = typeface;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۴۵۴۲a(int sizeInSp) {
            this.f۱۳۱۷۵g = sizeInSp;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۴۵۴۴a() {
            int unused = Cd.f۱۳۱۵۹a = this.f۱۳۱۶۹a;
            int unused2 = Cd.f۱۳۱۶۰b = this.f۱۳۱۷۰b;
            int unused3 = Cd.f۱۳۱۶۱c = this.f۱۳۱۷۱c;
            int unused4 = Cd.f۱۳۱۶۲d = this.f۱۳۱۷۲d;
            int unused5 = Cd.f۱۳۱۶۳e = this.f۱۳۱۷۳e;
            Typeface unused6 = Cd.f۱۳۱۶۶h = this.f۱۳۱۷۴f;
            int unused7 = Cd.f۱۳۱۶۷i = this.f۱۳۱۷۵g;
            boolean unused8 = Cd.f۱۳۱۶۸j = this.f۱۳۱۷۶h;
        }
    }
}
