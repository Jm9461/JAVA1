package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.Cu;
import android.util.AttributeSet;
import android.view.View;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;

/* renamed from: android.support.v7.widget.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cf {

    /* renamed from: a, reason: contains not printable characters */
    private final View f۱۲۰۱۰a;

    /* renamed from: d, reason: contains not printable characters */
    private Ch1 f۱۲۰۱۳d;

    /* renamed from: e, reason: contains not printable characters */
    private Ch1 f۱۲۰۱۴e;

    /* renamed from: f, reason: contains not printable characters */
    private Ch1 f۱۲۰۱۵f;

    /* renamed from: c, reason: contains not printable characters */
    private int f۱۲۰۱۲c = -1;

    /* renamed from: b, reason: contains not printable characters */
    private final Cj f۱۲۰۱۱b = Cj.m۱۳۲۱۷a();

    Cf(View view) {
        this.f۱۲۰۱۰a = view;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۱۳۲a(AttributeSet attrs, int defStyleAttr) {
        Cj1 a2 = Cj1.m۱۳۲۷۵a(this.f۱۲۰۱۰a.getContext(), attrs, Cj.ViewBackgroundHelper, defStyleAttr, 0);
        try {
            if (a2.m۱۳۲۹۴g(Cj.ViewBackgroundHelper_android_background)) {
                this.f۱۲۰۱۲c = a2.m۱۳۲۹۳g(Cj.ViewBackgroundHelper_android_background, -1);
                ColorStateList tint = this.f۱۲۰۱۱b.m۱۳۲۴۰b(this.f۱۲۰۱۰a.getContext(), this.f۱۲۰۱۲c);
                if (tint != null) {
                    m۱۳۱۲۹a(tint);
                }
            }
            if (a2.m۱۳۲۹۴g(Cj.ViewBackgroundHelper_backgroundTint)) {
                Cu.m۱۰۹۱۱a(this.f۱۲۰۱۰a, a2.m۱۳۲۷۸a(Cj.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.m۱۳۲۹۴g(Cj.ViewBackgroundHelper_backgroundTintMode)) {
                Cu.m۱۰۹۱۲a(this.f۱۲۰۱۰a, Ch0.m۱۳۱۸۴a(a2.m۱۳۲۸۷d(Cj.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a2.m۱۳۲۸۰a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۱۲۸a(int resId) {
        this.f۱۲۰۱۲c = resId;
        Cj cj = this.f۱۲۰۱۱b;
        m۱۳۱۲۹a(cj != null ? cj.m۱۳۲۴۰b(this.f۱۲۰۱۰a.getContext(), resId) : null);
        m۱۳۱۲۷a();
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۱۳۱a(Drawable background) {
        this.f۱۲۰۱۲c = -1;
        m۱۳۱۲۹a((ColorStateList) null);
        m۱۳۱۲۷a();
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۳۱۳۴b(ColorStateList tint) {
        if (this.f۱۲۰۱۴e == null) {
            this.f۱۲۰۱۴e = new Ch1();
        }
        Ch1 ch1 = this.f۱۲۰۱۴e;
        ch1.f۱۲۰۷۵a = tint;
        ch1.f۱۲۰۷۸d = true;
        m۱۳۱۲۷a();
    }

    /* renamed from: b, reason: contains not printable characters */
    ColorStateList m۱۳۱۳۳b() {
        Ch1 ch1 = this.f۱۲۰۱۴e;
        if (ch1 != null) {
            return ch1.f۱۲۰۷۵a;
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۱۳۰a(PorterDuff.Mode tintMode) {
        if (this.f۱۲۰۱۴e == null) {
            this.f۱۲۰۱۴e = new Ch1();
        }
        Ch1 ch1 = this.f۱۲۰۱۴e;
        ch1.f۱۲۰۷۶b = tintMode;
        ch1.f۱۲۰۷۷c = true;
        m۱۳۱۲۷a();
    }

    /* renamed from: c, reason: contains not printable characters */
    PorterDuff.Mode m۱۳۱۳۵c() {
        Ch1 ch1 = this.f۱۲۰۱۴e;
        if (ch1 != null) {
            return ch1.f۱۲۰۷۶b;
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۱۲۷a() {
        Drawable background = this.f۱۲۰۱۰a.getBackground();
        if (background != null) {
            if (m۱۳۱۲۶d() && m۱۳۱۲۵b(background)) {
                return;
            }
            Ch1 ch1 = this.f۱۲۰۱۴e;
            if (ch1 != null) {
                Cj.m۱۳۲۲۰a(background, ch1, this.f۱۲۰۱۰a.getDrawableState());
                return;
            }
            Ch1 ch12 = this.f۱۲۰۱۳d;
            if (ch12 != null) {
                Cj.m۱۳۲۲۰a(background, ch12, this.f۱۲۰۱۰a.getDrawableState());
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۱۲۹a(ColorStateList tint) {
        if (tint != null) {
            if (this.f۱۲۰۱۳d == null) {
                this.f۱۲۰۱۳d = new Ch1();
            }
            Ch1 ch1 = this.f۱۲۰۱۳d;
            ch1.f۱۲۰۷۵a = tint;
            ch1.f۱۲۰۷۸d = true;
        } else {
            this.f۱۲۰۱۳d = null;
        }
        m۱۳۱۲۷a();
    }

    /* renamed from: d, reason: contains not printable characters */
    private boolean m۱۳۱۲۶d() {
        int sdk = Build.VERSION.SDK_INT;
        return sdk > 21 ? this.f۱۲۰۱۳d != null : sdk == 21;
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۳۱۲۵b(Drawable background) {
        if (this.f۱۲۰۱۵f == null) {
            this.f۱۲۰۱۵f = new Ch1();
        }
        Ch1 info2 = this.f۱۲۰۱۵f;
        info2.m۱۳۱۸۸a();
        ColorStateList tintList = Cu.m۱۰۹۳۰c(this.f۱۲۰۱۰a);
        if (tintList != null) {
            info2.f۱۲۰۷۸d = true;
            info2.f۱۲۰۷۵a = tintList;
        }
        PorterDuff.Mode mode = Cu.m۱۰۹۳۲d(this.f۱۲۰۱۰a);
        if (mode != null) {
            info2.f۱۲۰۷۷c = true;
            info2.f۱۲۰۷۶b = mode;
        }
        if (info2.f۱۲۰۷۸d || info2.f۱۲۰۷۷c) {
            Cj.m۱۳۲۲۰a(background, info2, this.f۱۲۰۱۰a.getDrawableState());
            return true;
        }
        return false;
    }
}
