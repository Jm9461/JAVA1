package c.a.a;

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
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static int f۲۶۶۰a = Color.parseColor("#FFFFFF");

    /* renamed from: b  reason: collision with root package name */
    private static int f۲۶۶۱b = Color.parseColor("#D50000");

    /* renamed from: c  reason: collision with root package name */
    private static int f۲۶۶۲c = Color.parseColor("#3F51B5");

    /* renamed from: d  reason: collision with root package name */
    private static int f۲۶۶۳d = Color.parseColor("#388E3C");

    /* renamed from: e  reason: collision with root package name */
    private static int f۲۶۶۴e = Color.parseColor("#FFA900");

    /* renamed from: f  reason: collision with root package name */
    private static int f۲۶۶۵f = Color.parseColor("#353A3E");

    /* renamed from: g  reason: collision with root package name */
    private static final Typeface f۲۶۶۶g = Typeface.create("sans-serif-condensed", 0);

    /* renamed from: h  reason: collision with root package name */
    private static Typeface f۲۶۶۷h = f۲۶۶۶g;
    private static int i = 16;
    private static boolean j = true;

    public static Toast a(Context context, CharSequence message, int duration) {
        return a(context, message, duration, null, false);
    }

    public static Toast a(Context context, CharSequence message, int duration, Drawable icon, boolean withIcon) {
        return a(context, message, icon, f۲۶۶۵f, duration, withIcon, true);
    }

    public static Toast d(Context context, CharSequence message, int duration, boolean withIcon) {
        return a(context, message, e.a(context, a.ic_error_outline_white_48dp), f۲۶۶۴e, duration, withIcon, true);
    }

    public static Toast b(Context context, CharSequence message, int duration, boolean withIcon) {
        return a(context, message, e.a(context, a.ic_info_outline_white_48dp), f۲۶۶۲c, duration, withIcon, true);
    }

    public static Toast c(Context context, CharSequence message, int duration, boolean withIcon) {
        return a(context, message, e.a(context, a.ic_check_white_48dp), f۲۶۶۳d, duration, withIcon, true);
    }

    public static Toast a(Context context, CharSequence message, int duration, boolean withIcon) {
        return a(context, message, e.a(context, a.ic_clear_white_48dp), f۲۶۶۱b, duration, withIcon, true);
    }

    @SuppressLint({"ShowToast"})
    public static Toast a(Context context, CharSequence message, Drawable icon, int tintColor, int duration, boolean withIcon, boolean shouldTint) {
        Drawable drawableFrame;
        Toast currentToast = Toast.makeText(context, (CharSequence) null, duration);
        View toastLayout = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(c.toast_layout, (ViewGroup) null);
        ImageView toastIcon = (ImageView) toastLayout.findViewById(b.toast_icon);
        TextView toastTextView = (TextView) toastLayout.findViewById(b.toast_text);
        if (shouldTint) {
            drawableFrame = e.b(context, tintColor);
        } else {
            drawableFrame = e.a(context, a.toast_frame);
        }
        e.a(toastLayout, drawableFrame);
        if (!withIcon) {
            toastIcon.setVisibility(8);
        } else if (icon != null) {
            if (j) {
                icon = e.a(icon, f۲۶۶۰a);
            }
            e.a(toastIcon, icon);
        } else {
            throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
        }
        toastTextView.setText(message);
        toastTextView.setTextColor(f۲۶۶۰a);
        toastTextView.setTypeface(f۲۶۶۷h);
        toastTextView.setTextSize(2, (float) i);
        currentToast.setView(toastLayout);
        return currentToast;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f۲۶۶۸a = d.f۲۶۶۰a;

        /* renamed from: b  reason: collision with root package name */
        private int f۲۶۶۹b = d.f۲۶۶۱b;

        /* renamed from: c  reason: collision with root package name */
        private int f۲۶۷۰c = d.f۲۶۶۲c;

        /* renamed from: d  reason: collision with root package name */
        private int f۲۶۷۱d = d.f۲۶۶۳d;

        /* renamed from: e  reason: collision with root package name */
        private int f۲۶۷۲e = d.f۲۶۶۴e;

        /* renamed from: f  reason: collision with root package name */
        private Typeface f۲۶۷۳f = d.f۲۶۶۷h;

        /* renamed from: g  reason: collision with root package name */
        private int f۲۶۷۴g = d.i;

        /* renamed from: h  reason: collision with root package name */
        private boolean f۲۶۷۵h = d.j;

        private a() {
        }

        public static a b() {
            return new a();
        }

        public a a(Typeface typeface) {
            this.f۲۶۷۳f = typeface;
            return this;
        }

        public a a(int sizeInSp) {
            this.f۲۶۷۴g = sizeInSp;
            return this;
        }

        public void a() {
            int unused = d.f۲۶۶۰a = this.f۲۶۶۸a;
            int unused2 = d.f۲۶۶۱b = this.f۲۶۶۹b;
            int unused3 = d.f۲۶۶۲c = this.f۲۶۷۰c;
            int unused4 = d.f۲۶۶۳d = this.f۲۶۷۱d;
            int unused5 = d.f۲۶۶۴e = this.f۲۶۷۲e;
            Typeface unused6 = d.f۲۶۶۷h = this.f۲۶۷۳f;
            int unused7 = d.i = this.f۲۶۷۴g;
            boolean unused8 = d.j = this.f۲۶۷۵h;
        }
    }
}
