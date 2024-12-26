package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v4.widget.Ck;
import android.util.AttributeSet;
import android.widget.ImageView;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca;

/* renamed from: android.support.v7.widget.n, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cn {

    /* renamed from: a, reason: contains not printable characters */
    private final ImageView f۱۲۲۲۱a;

    /* renamed from: b, reason: contains not printable characters */
    private Ch1 f۱۲۲۲۲b;

    /* renamed from: c, reason: contains not printable characters */
    private Ch1 f۱۲۲۲۳c;

    /* renamed from: d, reason: contains not printable characters */
    private Ch1 f۱۲۲۲۴d;

    public Cn(ImageView view) {
        this.f۱۲۲۲۱a = view;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۳۷۹a(AttributeSet attrs, int defStyleAttr) {
        int id;
        Cj1 a2 = Cj1.m۱۳۲۷۵a(this.f۱۲۲۲۱a.getContext(), attrs, Cj.AppCompatImageView, defStyleAttr, 0);
        try {
            Drawable drawable = this.f۱۲۲۲۱a.getDrawable();
            if (drawable == null && (id = a2.m۱۳۲۹۳g(Cj.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = Ca.m۸۶۰۴c(this.f۱۲۲۲۱a.getContext(), id)) != null) {
                this.f۱۲۲۲۱a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Ch0.m۱۳۱۸۶b(drawable);
            }
            if (a2.m۱۳۲۹۴g(Cj.AppCompatImageView_tint)) {
                Ck.m۱۱۲۱۶a(this.f۱۲۲۲۱a, a2.m۱۳۲۷۸a(Cj.AppCompatImageView_tint));
            }
            if (a2.m۱۳۲۹۴g(Cj.AppCompatImageView_tintMode)) {
                Ck.m۱۱۲۱۷a(this.f۱۲۲۲۱a, Ch0.m۱۳۱۸۴a(a2.m۱۳۲۸۷d(Cj.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a2.m۱۳۲۸۰a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۳۷۶a(int resId) {
        if (resId != 0) {
            Drawable d2 = Ca.m۸۶۰۴c(this.f۱۲۲۲۱a.getContext(), resId);
            if (d2 != null) {
                Ch0.m۱۳۱۸۶b(d2);
            }
            this.f۱۲۲۲۱a.setImageDrawable(d2);
        } else {
            this.f۱۲۲۲۱a.setImageDrawable(null);
        }
        m۱۳۳۷۵a();
    }

    /* renamed from: d, reason: contains not printable characters */
    boolean m۱۳۳۸۲d() {
        Drawable background = this.f۱۲۲۲۱a.getBackground();
        if (Build.VERSION.SDK_INT >= 21 && (background instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۳۷۷a(ColorStateList tint) {
        if (this.f۱۲۲۲۳c == null) {
            this.f۱۲۲۲۳c = new Ch1();
        }
        Ch1 ch1 = this.f۱۲۲۲۳c;
        ch1.f۱۲۰۷۵a = tint;
        ch1.f۱۲۰۷۸d = true;
        m۱۳۳۷۵a();
    }

    /* renamed from: b, reason: contains not printable characters */
    ColorStateList m۱۳۳۸۰b() {
        Ch1 ch1 = this.f۱۲۲۲۳c;
        if (ch1 != null) {
            return ch1.f۱۲۰۷۵a;
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۳۷۸a(PorterDuff.Mode tintMode) {
        if (this.f۱۲۲۲۳c == null) {
            this.f۱۲۲۲۳c = new Ch1();
        }
        Ch1 ch1 = this.f۱۲۲۲۳c;
        ch1.f۱۲۰۷۶b = tintMode;
        ch1.f۱۲۰۷۷c = true;
        m۱۳۳۷۵a();
    }

    /* renamed from: c, reason: contains not printable characters */
    PorterDuff.Mode m۱۳۳۸۱c() {
        Ch1 ch1 = this.f۱۲۲۲۳c;
        if (ch1 != null) {
            return ch1.f۱۲۰۷۶b;
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۳۷۵a() {
        Drawable imageViewDrawable = this.f۱۲۲۲۱a.getDrawable();
        if (imageViewDrawable != null) {
            Ch0.m۱۳۱۸۶b(imageViewDrawable);
        }
        if (imageViewDrawable != null) {
            if (m۱۳۳۷۴e() && m۱۳۳۷۳a(imageViewDrawable)) {
                return;
            }
            Ch1 ch1 = this.f۱۲۲۲۳c;
            if (ch1 != null) {
                Cj.m۱۳۲۲۰a(imageViewDrawable, ch1, this.f۱۲۲۲۱a.getDrawableState());
                return;
            }
            Ch1 ch12 = this.f۱۲۲۲۲b;
            if (ch12 != null) {
                Cj.m۱۳۲۲۰a(imageViewDrawable, ch12, this.f۱۲۲۲۱a.getDrawableState());
            }
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    private boolean m۱۳۳۷۴e() {
        int sdk = Build.VERSION.SDK_INT;
        return sdk > 21 ? this.f۱۲۲۲۲b != null : sdk == 21;
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۳۳۷۳a(Drawable imageSource) {
        if (this.f۱۲۲۲۴d == null) {
            this.f۱۲۲۲۴d = new Ch1();
        }
        Ch1 info2 = this.f۱۲۲۲۴d;
        info2.m۱۳۱۸۸a();
        ColorStateList tintList = Ck.m۱۱۲۱۵a(this.f۱۲۲۲۱a);
        if (tintList != null) {
            info2.f۱۲۰۷۸d = true;
            info2.f۱۲۰۷۵a = tintList;
        }
        PorterDuff.Mode mode = Ck.m۱۱۲۱۸b(this.f۱۲۲۲۱a);
        if (mode != null) {
            info2.f۱۲۰۷۷c = true;
            info2.f۱۲۰۷۶b = mode;
        }
        if (info2.f۱۲۰۷۸d || info2.f۱۲۰۷۷c) {
            Cj.m۱۳۲۲۰a(imageSource, info2, this.f۱۲۲۲۱a.getDrawableState());
            return true;
        }
        return false;
    }
}
