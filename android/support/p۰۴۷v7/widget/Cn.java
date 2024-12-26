package android.support.p۰۴۷v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p۰۴۳v4.widget.Ck;
import android.util.AttributeSet;
import android.widget.ImageView;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca;

/* renamed from: android.support.v7.widget.n  reason: invalid class name */
public class Cn {

    /* renamed from: a  reason: contains not printable characters */
    private final ImageView f۱۲۲۲۱a;

    /* renamed from: b  reason: contains not printable characters */
    private Ch1 f۱۲۲۲۲b;

    /* renamed from: c  reason: contains not printable characters */
    private Ch1 f۱۲۲۲۳c;

    /* renamed from: d  reason: contains not printable characters */
    private Ch1 f۱۲۲۲۴d;

    public Cn(ImageView view) {
        this.f۱۲۲۲۱a = view;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۴۹a(AttributeSet attrs, int defStyleAttr) {
        int id;
        Cj1 a = Cj1.m۱۵۳۴۵a(this.f۱۲۲۲۱a.getContext(), attrs, Cj.AppCompatImageView, defStyleAttr, 0);
        try {
            Drawable drawable = this.f۱۲۲۲۱a.getDrawable();
            if (!(drawable != null || (id = a.m۱۵۳۶۳g(Cj.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = Ca.m۱۰۶۷۳c(this.f۱۲۲۲۱a.getContext(), id)) == null)) {
                this.f۱۲۲۲۱a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Ch0.m۱۵۲۵۶b(drawable);
            }
            if (a.m۱۵۳۶۴g(Cj.AppCompatImageView_tint)) {
                Ck.m۱۳۲۸۶a(this.f۱۲۲۲۱a, a.m۱۵۳۴۸a(Cj.AppCompatImageView_tint));
            }
            if (a.m۱۵۳۶۴g(Cj.AppCompatImageView_tintMode)) {
                Ck.m۱۳۲۸۷a(this.f۱۲۲۲۱a, Ch0.m۱۵۲۵۴a(a.m۱۵۳۵۷d(Cj.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a.m۱۵۳۵۰a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۴۶a(int resId) {
        if (resId != 0) {
            Drawable d = Ca.m۱۰۶۷۳c(this.f۱۲۲۲۱a.getContext(), resId);
            if (d != null) {
                Ch0.m۱۵۲۵۶b(d);
            }
            this.f۱۲۲۲۱a.setImageDrawable(d);
        } else {
            this.f۱۲۲۲۱a.setImageDrawable(null);
        }
        m۱۵۴۴۵a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۵۴۵۲d() {
        Drawable background = this.f۱۲۲۲۱a.getBackground();
        if (Build.VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۴۷a(ColorStateList tint) {
        if (this.f۱۲۲۲۳c == null) {
            this.f۱۲۲۲۳c = new Ch1();
        }
        Ch1 h1Var = this.f۱۲۲۲۳c;
        h1Var.f۱۲۰۷۵a = tint;
        h1Var.f۱۲۰۷۸d = true;
        m۱۵۴۴۵a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public ColorStateList m۱۵۴۵۰b() {
        Ch1 h1Var = this.f۱۲۲۲۳c;
        if (h1Var != null) {
            return h1Var.f۱۲۰۷۵a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۴۸a(PorterDuff.Mode tintMode) {
        if (this.f۱۲۲۲۳c == null) {
            this.f۱۲۲۲۳c = new Ch1();
        }
        Ch1 h1Var = this.f۱۲۲۲۳c;
        h1Var.f۱۲۰۷۶b = tintMode;
        h1Var.f۱۲۰۷۷c = true;
        m۱۵۴۴۵a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public PorterDuff.Mode m۱۵۴۵۱c() {
        Ch1 h1Var = this.f۱۲۲۲۳c;
        if (h1Var != null) {
            return h1Var.f۱۲۰۷۶b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۴۵a() {
        Drawable imageViewDrawable = this.f۱۲۲۲۱a.getDrawable();
        if (imageViewDrawable != null) {
            Ch0.m۱۵۲۵۶b(imageViewDrawable);
        }
        if (imageViewDrawable == null) {
            return;
        }
        if (!m۱۵۴۴۴e() || !m۱۵۴۴۳a(imageViewDrawable)) {
            Ch1 h1Var = this.f۱۲۲۲۳c;
            if (h1Var != null) {
                Cj.m۱۵۲۹۰a(imageViewDrawable, h1Var, this.f۱۲۲۲۱a.getDrawableState());
                return;
            }
            Ch1 h1Var2 = this.f۱۲۲۲۲b;
            if (h1Var2 != null) {
                Cj.m۱۵۲۹۰a(imageViewDrawable, h1Var2, this.f۱۲۲۲۱a.getDrawableState());
            }
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private boolean m۱۵۴۴۴e() {
        int sdk = Build.VERSION.SDK_INT;
        if (sdk <= 21) {
            return sdk == 21;
        }
        if (this.f۱۲۲۲۲b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۵۴۴۳a(Drawable imageSource) {
        if (this.f۱۲۲۲۴d == null) {
            this.f۱۲۲۲۴d = new Ch1();
        }
        Ch1 info2 = this.f۱۲۲۲۴d;
        info2.m۱۵۲۵۸a();
        ColorStateList tintList = Ck.m۱۳۲۸۵a(this.f۱۲۲۲۱a);
        if (tintList != null) {
            info2.f۱۲۰۷۸d = true;
            info2.f۱۲۰۷۵a = tintList;
        }
        PorterDuff.Mode mode = Ck.m۱۳۲۸۸b(this.f۱۲۲۲۱a);
        if (mode != null) {
            info2.f۱۲۰۷۷c = true;
            info2.f۱۲۰۷۶b = mode;
        }
        if (!info2.f۱۲۰۷۸d && !info2.f۱۲۰۷۷c) {
            return false;
        }
        Cj.m۱۵۲۹۰a(imageSource, info2, this.f۱۲۲۲۱a.getDrawableState());
        return true;
    }
}
