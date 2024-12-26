package android.support.v7.widget;

import a.b.h.a.j;
import a.b.h.c.a.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v4.widget.k;
import android.util.AttributeSet;
import android.widget.ImageView;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f۲۱۷۸a;

    /* renamed from: b  reason: collision with root package name */
    private h1 f۲۱۷۹b;

    /* renamed from: c  reason: collision with root package name */
    private h1 f۲۱۸۰c;

    /* renamed from: d  reason: collision with root package name */
    private h1 f۲۱۸۱d;

    public n(ImageView view) {
        this.f۲۱۷۸a = view;
    }

    public void a(AttributeSet attrs, int defStyleAttr) {
        int id;
        j1 a2 = j1.a(this.f۲۱۷۸a.getContext(), attrs, j.AppCompatImageView, defStyleAttr, 0);
        try {
            Drawable drawable = this.f۲۱۷۸a.getDrawable();
            if (!(drawable != null || (id = a2.g(j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = a.c(this.f۲۱۷۸a.getContext(), id)) == null)) {
                this.f۲۱۷۸a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                h0.b(drawable);
            }
            if (a2.g(j.AppCompatImageView_tint)) {
                k.a(this.f۲۱۷۸a, a2.a(j.AppCompatImageView_tint));
            }
            if (a2.g(j.AppCompatImageView_tintMode)) {
                k.a(this.f۲۱۷۸a, h0.a(a2.d(j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    public void a(int resId) {
        if (resId != 0) {
            Drawable d2 = a.c(this.f۲۱۷۸a.getContext(), resId);
            if (d2 != null) {
                h0.b(d2);
            }
            this.f۲۱۷۸a.setImageDrawable(d2);
        } else {
            this.f۲۱۷۸a.setImageDrawable(null);
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        Drawable background = this.f۲۱۷۸a.getBackground();
        if (Build.VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList tint) {
        if (this.f۲۱۸۰c == null) {
            this.f۲۱۸۰c = new h1();
        }
        h1 h1Var = this.f۲۱۸۰c;
        h1Var.f۲۰۸۷a = tint;
        h1Var.f۲۰۹۰d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        h1 h1Var = this.f۲۱۸۰c;
        if (h1Var != null) {
            return h1Var.f۲۰۸۷a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode tintMode) {
        if (this.f۲۱۸۰c == null) {
            this.f۲۱۸۰c = new h1();
        }
        h1 h1Var = this.f۲۱۸۰c;
        h1Var.f۲۰۸۸b = tintMode;
        h1Var.f۲۰۸۹c = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        h1 h1Var = this.f۲۱۸۰c;
        if (h1Var != null) {
            return h1Var.f۲۰۸۸b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable imageViewDrawable = this.f۲۱۷۸a.getDrawable();
        if (imageViewDrawable != null) {
            h0.b(imageViewDrawable);
        }
        if (imageViewDrawable == null) {
            return;
        }
        if (!e() || !a(imageViewDrawable)) {
            h1 h1Var = this.f۲۱۸۰c;
            if (h1Var != null) {
                j.a(imageViewDrawable, h1Var, this.f۲۱۷۸a.getDrawableState());
                return;
            }
            h1 h1Var2 = this.f۲۱۷۹b;
            if (h1Var2 != null) {
                j.a(imageViewDrawable, h1Var2, this.f۲۱۷۸a.getDrawableState());
            }
        }
    }

    private boolean e() {
        int sdk = Build.VERSION.SDK_INT;
        if (sdk <= 21) {
            return sdk == 21;
        }
        if (this.f۲۱۷۹b != null) {
            return true;
        }
        return false;
    }

    private boolean a(Drawable imageSource) {
        if (this.f۲۱۸۱d == null) {
            this.f۲۱۸۱d = new h1();
        }
        h1 info2 = this.f۲۱۸۱d;
        info2.a();
        ColorStateList tintList = k.a(this.f۲۱۷۸a);
        if (tintList != null) {
            info2.f۲۰۹۰d = true;
            info2.f۲۰۸۷a = tintList;
        }
        PorterDuff.Mode mode = k.b(this.f۲۱۷۸a);
        if (mode != null) {
            info2.f۲۰۸۹c = true;
            info2.f۲۰۸۸b = mode;
        }
        if (!info2.f۲۰۹۰d && !info2.f۲۰۸۹c) {
            return false;
        }
        j.a(imageSource, info2, this.f۲۱۷۸a.getDrawableState());
        return true;
    }
}
