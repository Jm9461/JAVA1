package android.support.v7.widget;

import a.b.h.a.j;
import a.b.h.c.a.a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.widget.c;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* access modifiers changed from: package-private */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f۲۰۹۱a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f۲۰۹۲b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f۲۰۹۳c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f۲۰۹۴d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f۲۰۹۵e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f۲۰۹۶f;

    i(CompoundButton view) {
        this.f۲۰۹۱a = view;
    }

    /* access modifiers changed from: package-private */
    public void a(AttributeSet attrs, int defStyleAttr) {
        int resourceId;
        TypedArray a2 = this.f۲۰۹۱a.getContext().obtainStyledAttributes(attrs, j.CompoundButton, defStyleAttr, 0);
        try {
            if (a2.hasValue(j.CompoundButton_android_button) && (resourceId = a2.getResourceId(j.CompoundButton_android_button, 0)) != 0) {
                this.f۲۰۹۱a.setButtonDrawable(a.c(this.f۲۰۹۱a.getContext(), resourceId));
            }
            if (a2.hasValue(j.CompoundButton_buttonTint)) {
                c.a(this.f۲۰۹۱a, a2.getColorStateList(j.CompoundButton_buttonTint));
            }
            if (a2.hasValue(j.CompoundButton_buttonTintMode)) {
                c.a(this.f۲۰۹۱a, h0.a(a2.getInt(j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            a2.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList tint) {
        this.f۲۰۹۲b = tint;
        this.f۲۰۹۴d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f۲۰۹۲b;
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode tintMode) {
        this.f۲۰۹۳c = tintMode;
        this.f۲۰۹۵e = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f۲۰۹۳c;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.f۲۰۹۶f) {
            this.f۲۰۹۶f = false;
            return;
        }
        this.f۲۰۹۶f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable buttonDrawable = c.a(this.f۲۰۹۱a);
        if (buttonDrawable == null) {
            return;
        }
        if (this.f۲۰۹۴d || this.f۲۰۹۵e) {
            Drawable buttonDrawable2 = android.support.v4.graphics.drawable.a.h(buttonDrawable).mutate();
            if (this.f۲۰۹۴d) {
                android.support.v4.graphics.drawable.a.a(buttonDrawable2, this.f۲۰۹۲b);
            }
            if (this.f۲۰۹۵e) {
                android.support.v4.graphics.drawable.a.a(buttonDrawable2, this.f۲۰۹۳c);
            }
            if (buttonDrawable2.isStateful()) {
                buttonDrawable2.setState(this.f۲۰۹۱a.getDrawableState());
            }
            this.f۲۰۹۱a.setButtonDrawable(buttonDrawable2);
        }
    }

    /* access modifiers changed from: package-private */
    public int a(int superValue) {
        Drawable buttonDrawable;
        if (Build.VERSION.SDK_INT >= 17 || (buttonDrawable = c.a(this.f۲۰۹۱a)) == null) {
            return superValue;
        }
        return superValue + buttonDrawable.getIntrinsicWidth();
    }
}
