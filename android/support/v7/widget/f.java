package android.support.v7.widget;

import a.b.h.a.j;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.View;

/* access modifiers changed from: package-private */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final View f۲۰۳۳a;

    /* renamed from: b  reason: collision with root package name */
    private final j f۲۰۳۴b;

    /* renamed from: c  reason: collision with root package name */
    private int f۲۰۳۵c = -1;

    /* renamed from: d  reason: collision with root package name */
    private h1 f۲۰۳۶d;

    /* renamed from: e  reason: collision with root package name */
    private h1 f۲۰۳۷e;

    /* renamed from: f  reason: collision with root package name */
    private h1 f۲۰۳۸f;

    f(View view) {
        this.f۲۰۳۳a = view;
        this.f۲۰۳۴b = j.a();
    }

    /* access modifiers changed from: package-private */
    public void a(AttributeSet attrs, int defStyleAttr) {
        j1 a2 = j1.a(this.f۲۰۳۳a.getContext(), attrs, j.ViewBackgroundHelper, defStyleAttr, 0);
        try {
            if (a2.g(j.ViewBackgroundHelper_android_background)) {
                this.f۲۰۳۵c = a2.g(j.ViewBackgroundHelper_android_background, -1);
                ColorStateList tint = this.f۲۰۳۴b.b(this.f۲۰۳۳a.getContext(), this.f۲۰۳۵c);
                if (tint != null) {
                    a(tint);
                }
            }
            if (a2.g(j.ViewBackgroundHelper_backgroundTint)) {
                u.a(this.f۲۰۳۳a, a2.a(j.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.g(j.ViewBackgroundHelper_backgroundTintMode)) {
                u.a(this.f۲۰۳۳a, h0.a(a2.d(j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int resId) {
        this.f۲۰۳۵c = resId;
        j jVar = this.f۲۰۳۴b;
        a(jVar != null ? jVar.b(this.f۲۰۳۳a.getContext(), resId) : null);
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(Drawable background) {
        this.f۲۰۳۵c = -1;
        a((ColorStateList) null);
        a();
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList tint) {
        if (this.f۲۰۳۷e == null) {
            this.f۲۰۳۷e = new h1();
        }
        h1 h1Var = this.f۲۰۳۷e;
        h1Var.f۲۰۸۷a = tint;
        h1Var.f۲۰۹۰d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        h1 h1Var = this.f۲۰۳۷e;
        if (h1Var != null) {
            return h1Var.f۲۰۸۷a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode tintMode) {
        if (this.f۲۰۳۷e == null) {
            this.f۲۰۳۷e = new h1();
        }
        h1 h1Var = this.f۲۰۳۷e;
        h1Var.f۲۰۸۸b = tintMode;
        h1Var.f۲۰۸۹c = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        h1 h1Var = this.f۲۰۳۷e;
        if (h1Var != null) {
            return h1Var.f۲۰۸۸b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable background = this.f۲۰۳۳a.getBackground();
        if (background == null) {
            return;
        }
        if (!d() || !b(background)) {
            h1 h1Var = this.f۲۰۳۷e;
            if (h1Var != null) {
                j.a(background, h1Var, this.f۲۰۳۳a.getDrawableState());
                return;
            }
            h1 h1Var2 = this.f۲۰۳۶d;
            if (h1Var2 != null) {
                j.a(background, h1Var2, this.f۲۰۳۳a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList tint) {
        if (tint != null) {
            if (this.f۲۰۳۶d == null) {
                this.f۲۰۳۶d = new h1();
            }
            h1 h1Var = this.f۲۰۳۶d;
            h1Var.f۲۰۸۷a = tint;
            h1Var.f۲۰۹۰d = true;
        } else {
            this.f۲۰۳۶d = null;
        }
        a();
    }

    private boolean d() {
        int sdk = Build.VERSION.SDK_INT;
        if (sdk <= 21) {
            return sdk == 21;
        }
        if (this.f۲۰۳۶d != null) {
            return true;
        }
        return false;
    }

    private boolean b(Drawable background) {
        if (this.f۲۰۳۸f == null) {
            this.f۲۰۳۸f = new h1();
        }
        h1 info2 = this.f۲۰۳۸f;
        info2.a();
        ColorStateList tintList = u.c(this.f۲۰۳۳a);
        if (tintList != null) {
            info2.f۲۰۹۰d = true;
            info2.f۲۰۸۷a = tintList;
        }
        PorterDuff.Mode mode = u.d(this.f۲۰۳۳a);
        if (mode != null) {
            info2.f۲۰۸۹c = true;
            info2.f۲۰۸۸b = mode;
        }
        if (!info2.f۲۰۹۰d && !info2.f۲۰۸۹c) {
            return false;
        }
        j.a(background, info2, this.f۲۰۳۳a.getDrawableState());
        return true;
    }
}
