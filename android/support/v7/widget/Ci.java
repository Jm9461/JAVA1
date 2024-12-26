package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.widget.Cc;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca;

/* renamed from: android.support.v7.widget.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ci {

    /* renamed from: a, reason: contains not printable characters */
    private final CompoundButton f۱۲۰۷۹a;

    /* renamed from: b, reason: contains not printable characters */
    private ColorStateList f۱۲۰۸۰b = null;

    /* renamed from: c, reason: contains not printable characters */
    private PorterDuff.Mode f۱۲۰۸۱c = null;

    /* renamed from: d, reason: contains not printable characters */
    private boolean f۱۲۰۸۲d = false;

    /* renamed from: e, reason: contains not printable characters */
    private boolean f۱۲۰۸۳e = false;

    /* renamed from: f, reason: contains not printable characters */
    private boolean f۱۲۰۸۴f;

    Ci(CompoundButton view) {
        this.f۱۲۰۷۹a = view;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۱۹۳a(AttributeSet attrs, int defStyleAttr) {
        int resourceId;
        TypedArray a2 = this.f۱۲۰۷۹a.getContext().obtainStyledAttributes(attrs, Cj.CompoundButton, defStyleAttr, 0);
        try {
            if (a2.hasValue(Cj.CompoundButton_android_button) && (resourceId = a2.getResourceId(Cj.CompoundButton_android_button, 0)) != 0) {
                this.f۱۲۰۷۹a.setButtonDrawable(Ca.m۸۶۰۴c(this.f۱۲۰۷۹a.getContext(), resourceId));
            }
            if (a2.hasValue(Cj.CompoundButton_buttonTint)) {
                Cc.m۱۱۱۵۳a(this.f۱۲۰۷۹a, a2.getColorStateList(Cj.CompoundButton_buttonTint));
            }
            if (a2.hasValue(Cj.CompoundButton_buttonTintMode)) {
                Cc.m۱۱۱۵۴a(this.f۱۲۰۷۹a, Ch0.m۱۳۱۸۴a(a2.getInt(Cj.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            a2.recycle();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۱۹۱a(ColorStateList tint) {
        this.f۱۲۰۸۰b = tint;
        this.f۱۲۰۸۲d = true;
        m۱۳۱۹۰a();
    }

    /* renamed from: b, reason: contains not printable characters */
    ColorStateList m۱۳۱۹۴b() {
        return this.f۱۲۰۸۰b;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۱۹۲a(PorterDuff.Mode tintMode) {
        this.f۱۲۰۸۱c = tintMode;
        this.f۱۲۰۸۳e = true;
        m۱۳۱۹۰a();
    }

    /* renamed from: c, reason: contains not printable characters */
    PorterDuff.Mode m۱۳۱۹۵c() {
        return this.f۱۲۰۸۱c;
    }

    /* renamed from: d, reason: contains not printable characters */
    void m۱۳۱۹۶d() {
        if (this.f۱۲۰۸۴f) {
            this.f۱۲۰۸۴f = false;
        } else {
            this.f۱۲۰۸۴f = true;
            m۱۳۱۹۰a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۱۹۰a() {
        Drawable buttonDrawable = Cc.m۱۱۱۵۲a(this.f۱۲۰۷۹a);
        if (buttonDrawable != null) {
            if (this.f۱۲۰۸۲d || this.f۱۲۰۸۳e) {
                Drawable buttonDrawable2 = android.support.v4.graphics.drawable.Ca.m۱۰۶۵۲h(buttonDrawable).mutate();
                if (this.f۱۲۰۸۲d) {
                    android.support.v4.graphics.drawable.Ca.m۱۰۶۳۸a(buttonDrawable2, this.f۱۲۰۸۰b);
                }
                if (this.f۱۲۰۸۳e) {
                    android.support.v4.graphics.drawable.Ca.m۱۰۶۴۱a(buttonDrawable2, this.f۱۲۰۸۱c);
                }
                if (buttonDrawable2.isStateful()) {
                    buttonDrawable2.setState(this.f۱۲۰۷۹a.getDrawableState());
                }
                this.f۱۲۰۷۹a.setButtonDrawable(buttonDrawable2);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    int m۱۳۱۸۹a(int superValue) {
        Drawable buttonDrawable;
        if (Build.VERSION.SDK_INT < 17 && (buttonDrawable = Cc.m۱۱۱۵۲a(this.f۱۲۰۷۹a)) != null) {
            return superValue + buttonDrawable.getIntrinsicWidth();
        }
        return superValue;
    }
}
