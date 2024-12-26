package android.support.p۰۴۷v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۳v4.widget.Cc;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.i  reason: invalid class name */
public class Ci {

    /* renamed from: a  reason: contains not printable characters */
    private final CompoundButton f۱۲۰۷۹a;

    /* renamed from: b  reason: contains not printable characters */
    private ColorStateList f۱۲۰۸۰b = null;

    /* renamed from: c  reason: contains not printable characters */
    private PorterDuff.Mode f۱۲۰۸۱c = null;

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۲۰۸۲d = false;

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۱۲۰۸۳e = false;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۱۲۰۸۴f;

    Ci(CompoundButton view) {
        this.f۱۲۰۷۹a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۲۶۳a(AttributeSet attrs, int defStyleAttr) {
        int resourceId;
        TypedArray a = this.f۱۲۰۷۹a.getContext().obtainStyledAttributes(attrs, Cj.CompoundButton, defStyleAttr, 0);
        try {
            if (a.hasValue(Cj.CompoundButton_android_button) && (resourceId = a.getResourceId(Cj.CompoundButton_android_button, 0)) != 0) {
                this.f۱۲۰۷۹a.setButtonDrawable(Ca.m۱۰۶۷۳c(this.f۱۲۰۷۹a.getContext(), resourceId));
            }
            if (a.hasValue(Cj.CompoundButton_buttonTint)) {
                Cc.m۱۳۲۲۳a(this.f۱۲۰۷۹a, a.getColorStateList(Cj.CompoundButton_buttonTint));
            }
            if (a.hasValue(Cj.CompoundButton_buttonTintMode)) {
                Cc.m۱۳۲۲۴a(this.f۱۲۰۷۹a, Ch0.m۱۵۲۵۴a(a.getInt(Cj.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            a.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۲۶۱a(ColorStateList tint) {
        this.f۱۲۰۸۰b = tint;
        this.f۱۲۰۸۲d = true;
        m۱۵۲۶۰a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public ColorStateList m۱۵۲۶۴b() {
        return this.f۱۲۰۸۰b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۲۶۲a(PorterDuff.Mode tintMode) {
        this.f۱۲۰۸۱c = tintMode;
        this.f۱۲۰۸۳e = true;
        m۱۵۲۶۰a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public PorterDuff.Mode m۱۵۲۶۵c() {
        return this.f۱۲۰۸۱c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۵۲۶۶d() {
        if (this.f۱۲۰۸۴f) {
            this.f۱۲۰۸۴f = false;
            return;
        }
        this.f۱۲۰۸۴f = true;
        m۱۵۲۶۰a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۲۶۰a() {
        Drawable buttonDrawable = Cc.m۱۳۲۲۲a(this.f۱۲۰۷۹a);
        if (buttonDrawable == null) {
            return;
        }
        if (this.f۱۲۰۸۲d || this.f۱۲۰۸۳e) {
            Drawable buttonDrawable2 = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(buttonDrawable).mutate();
            if (this.f۱۲۰۸۲d) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(buttonDrawable2, this.f۱۲۰۸۰b);
            }
            if (this.f۱۲۰۸۳e) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(buttonDrawable2, this.f۱۲۰۸۱c);
            }
            if (buttonDrawable2.isStateful()) {
                buttonDrawable2.setState(this.f۱۲۰۷۹a.getDrawableState());
            }
            this.f۱۲۰۷۹a.setButtonDrawable(buttonDrawable2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۲۵۹a(int superValue) {
        Drawable buttonDrawable;
        if (Build.VERSION.SDK_INT >= 17 || (buttonDrawable = Cc.m۱۳۲۲۲a(this.f۱۲۰۷۹a)) == null) {
            return superValue;
        }
        return superValue + buttonDrawable.getIntrinsicWidth();
    }
}
