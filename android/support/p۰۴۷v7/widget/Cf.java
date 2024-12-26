package android.support.p۰۴۷v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.view.View;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.f  reason: invalid class name */
public class Cf {

    /* renamed from: a  reason: contains not printable characters */
    private final View f۱۲۰۱۰a;

    /* renamed from: b  reason: contains not printable characters */
    private final Cj f۱۲۰۱۱b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۲۰۱۲c = -1;

    /* renamed from: d  reason: contains not printable characters */
    private Ch1 f۱۲۰۱۳d;

    /* renamed from: e  reason: contains not printable characters */
    private Ch1 f۱۲۰۱۴e;

    /* renamed from: f  reason: contains not printable characters */
    private Ch1 f۱۲۰۱۵f;

    Cf(View view) {
        this.f۱۲۰۱۰a = view;
        this.f۱۲۰۱۱b = Cj.m۱۵۲۸۷a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۲۰۲a(AttributeSet attrs, int defStyleAttr) {
        Cj1 a = Cj1.m۱۵۳۴۵a(this.f۱۲۰۱۰a.getContext(), attrs, Cj.ViewBackgroundHelper, defStyleAttr, 0);
        try {
            if (a.m۱۵۳۶۴g(Cj.ViewBackgroundHelper_android_background)) {
                this.f۱۲۰۱۲c = a.m۱۵۳۶۳g(Cj.ViewBackgroundHelper_android_background, -1);
                ColorStateList tint = this.f۱۲۰۱۱b.m۱۵۳۱۰b(this.f۱۲۰۱۰a.getContext(), this.f۱۲۰۱۲c);
                if (tint != null) {
                    m۱۵۱۹۹a(tint);
                }
            }
            if (a.m۱۵۳۶۴g(Cj.ViewBackgroundHelper_backgroundTint)) {
                Cu.m۱۲۹۸۱a(this.f۱۲۰۱۰a, a.m۱۵۳۴۸a(Cj.ViewBackgroundHelper_backgroundTint));
            }
            if (a.m۱۵۳۶۴g(Cj.ViewBackgroundHelper_backgroundTintMode)) {
                Cu.m۱۲۹۸۲a(this.f۱۲۰۱۰a, Ch0.m۱۵۲۵۴a(a.m۱۵۳۵۷d(Cj.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.m۱۵۳۵۰a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۱۹۸a(int resId) {
        this.f۱۲۰۱۲c = resId;
        Cj jVar = this.f۱۲۰۱۱b;
        m۱۵۱۹۹a(jVar != null ? jVar.m۱۵۳۱۰b(this.f۱۲۰۱۰a.getContext(), resId) : null);
        m۱۵۱۹۷a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۲۰۱a(Drawable background) {
        this.f۱۲۰۱۲c = -1;
        m۱۵۱۹۹a((ColorStateList) null);
        m۱۵۱۹۷a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۲۰۴b(ColorStateList tint) {
        if (this.f۱۲۰۱۴e == null) {
            this.f۱۲۰۱۴e = new Ch1();
        }
        Ch1 h1Var = this.f۱۲۰۱۴e;
        h1Var.f۱۲۰۷۵a = tint;
        h1Var.f۱۲۰۷۸d = true;
        m۱۵۱۹۷a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public ColorStateList m۱۵۲۰۳b() {
        Ch1 h1Var = this.f۱۲۰۱۴e;
        if (h1Var != null) {
            return h1Var.f۱۲۰۷۵a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۲۰۰a(PorterDuff.Mode tintMode) {
        if (this.f۱۲۰۱۴e == null) {
            this.f۱۲۰۱۴e = new Ch1();
        }
        Ch1 h1Var = this.f۱۲۰۱۴e;
        h1Var.f۱۲۰۷۶b = tintMode;
        h1Var.f۱۲۰۷۷c = true;
        m۱۵۱۹۷a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public PorterDuff.Mode m۱۵۲۰۵c() {
        Ch1 h1Var = this.f۱۲۰۱۴e;
        if (h1Var != null) {
            return h1Var.f۱۲۰۷۶b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۱۹۷a() {
        Drawable background = this.f۱۲۰۱۰a.getBackground();
        if (background == null) {
            return;
        }
        if (!m۱۵۱۹۶d() || !m۱۵۱۹۵b(background)) {
            Ch1 h1Var = this.f۱۲۰۱۴e;
            if (h1Var != null) {
                Cj.m۱۵۲۹۰a(background, h1Var, this.f۱۲۰۱۰a.getDrawableState());
                return;
            }
            Ch1 h1Var2 = this.f۱۲۰۱۳d;
            if (h1Var2 != null) {
                Cj.m۱۵۲۹۰a(background, h1Var2, this.f۱۲۰۱۰a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۱۹۹a(ColorStateList tint) {
        if (tint != null) {
            if (this.f۱۲۰۱۳d == null) {
                this.f۱۲۰۱۳d = new Ch1();
            }
            Ch1 h1Var = this.f۱۲۰۱۳d;
            h1Var.f۱۲۰۷۵a = tint;
            h1Var.f۱۲۰۷۸d = true;
        } else {
            this.f۱۲۰۱۳d = null;
        }
        m۱۵۱۹۷a();
    }

    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۵۱۹۶d() {
        int sdk = Build.VERSION.SDK_INT;
        if (sdk <= 21) {
            return sdk == 21;
        }
        if (this.f۱۲۰۱۳d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۵۱۹۵b(Drawable background) {
        if (this.f۱۲۰۱۵f == null) {
            this.f۱۲۰۱۵f = new Ch1();
        }
        Ch1 info2 = this.f۱۲۰۱۵f;
        info2.m۱۵۲۵۸a();
        ColorStateList tintList = Cu.m۱۳۰۰۰c(this.f۱۲۰۱۰a);
        if (tintList != null) {
            info2.f۱۲۰۷۸d = true;
            info2.f۱۲۰۷۵a = tintList;
        }
        PorterDuff.Mode mode = Cu.m۱۳۰۰۲d(this.f۱۲۰۱۰a);
        if (mode != null) {
            info2.f۱۲۰۷۷c = true;
            info2.f۱۲۰۷۶b = mode;
        }
        if (!info2.f۱۲۰۷۸d && !info2.f۱۲۰۷۷c) {
            return false;
        }
        Cj.m۱۵۲۹۰a(background, info2, this.f۱۲۰۱۰a.getDrawableState());
        return true;
    }
}
