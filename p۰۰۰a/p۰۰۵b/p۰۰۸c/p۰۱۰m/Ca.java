package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۰m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.internal.Ch;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.widget.Cp;
import android.support.p۰۴۷v7.widget.Cg;
import android.util.AttributeSet;
import android.util.Log;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cb;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cj;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck;

/* renamed from: a.b.c.m.a  reason: invalid class name */
public class Ca extends Cg {

    /* renamed from: e  reason: contains not printable characters */
    private final Cc f۸۲۷۳e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۸۲۷۴f;

    /* renamed from: g  reason: contains not printable characters */
    private PorterDuff.Mode f۸۲۷۵g;

    /* renamed from: h  reason: contains not printable characters */
    private ColorStateList f۸۲۷۶h;

    /* renamed from: i  reason: contains not printable characters */
    private Drawable f۸۲۷۷i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۸۲۷۸j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۸۲۷۹k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۸۲۸۰l;

    public Ca(Context context, AttributeSet attrs) {
        this(context, attrs, Cb.materialButtonStyle);
    }

    public Ca(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray attributes = android.support.design.internal.Cg.m۱۱۳۶۰c(context, attrs, Ck.MaterialButton, defStyleAttr, Cj.Widget_MaterialComponents_Button, new int[0]);
        this.f۸۲۷۴f = attributes.getDimensionPixelSize(Ck.MaterialButton_iconPadding, 0);
        this.f۸۲۷۵g = Ch.m۱۱۳۶۲a(attributes.getInt(Ck.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f۸۲۷۶h = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۴p.Ca.m۱۰۰۳۰a(getContext(), attributes, Ck.MaterialButton_iconTint);
        this.f۸۲۷۷i = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۴p.Ca.m۱۰۰۳۱b(getContext(), attributes, Ck.MaterialButton_icon);
        this.f۸۲۸۰l = attributes.getInteger(Ck.MaterialButton_iconGravity, 1);
        this.f۸۲۷۸j = attributes.getDimensionPixelSize(Ck.MaterialButton_iconSize, 0);
        this.f۸۲۷۳e = new Cc(this);
        this.f۸۲۷۳e.m۹۹۸۵a(attributes);
        attributes.recycle();
        setCompoundDrawablePadding(this.f۸۲۷۴f);
        m۹۹۷۳c();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT < 21 && m۹۹۷۲b()) {
            this.f۸۲۷۳e.m۹۹۸۶a(canvas);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.Cg, android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        if (m۹۹۷۲b()) {
            this.f۸۲۷۳e.m۹۹۹۳c(tint);
        } else if (this.f۸۲۷۳e != null) {
            super.setSupportBackgroundTintList(tint);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.Cg, android.support.p۰۴۳v4.view.AbstractCt
    public ColorStateList getSupportBackgroundTintList() {
        if (m۹۹۷۲b()) {
            return this.f۸۲۷۳e.m۹۹۹۵e();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // android.support.p۰۴۷v7.widget.Cg, android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        if (m۹۹۷۲b()) {
            this.f۸۲۷۳e.m۹۹۸۷a(tintMode);
        } else if (this.f۸۲۷۳e != null) {
            super.setSupportBackgroundTintMode(tintMode);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.Cg, android.support.p۰۴۳v4.view.AbstractCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m۹۹۷۲b()) {
            return this.f۸۲۷۳e.m۹۹۹۶f();
        }
        return super.getSupportBackgroundTintMode();
    }

    public void setBackgroundTintList(ColorStateList tintList) {
        setSupportBackgroundTintList(tintList);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public void setBackgroundTintMode(PorterDuff.Mode tintMode) {
        setSupportBackgroundTintMode(tintMode);
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public void setBackgroundColor(int color) {
        if (m۹۹۷۲b()) {
            this.f۸۲۷۳e.m۹۹۸۲a(color);
        } else {
            super.setBackgroundColor(color);
        }
    }

    public void setBackground(Drawable background) {
        setBackgroundDrawable(background);
    }

    @Override // android.support.p۰۴۷v7.widget.Cg
    public void setBackgroundResource(int backgroundResourceId) {
        Drawable background = null;
        if (backgroundResourceId != 0) {
            background = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(getContext(), backgroundResourceId);
        }
        setBackgroundDrawable(background);
    }

    @Override // android.support.p۰۴۷v7.widget.Cg
    public void setBackgroundDrawable(Drawable background) {
        if (!m۹۹۷۲b()) {
            super.setBackgroundDrawable(background);
        } else if (background != getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            this.f۸۲۷۳e.m۹۹۹۸h();
            super.setBackgroundDrawable(background);
        } else {
            getBackground().setState(background.getState());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.Cg
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Cc cVar;
        super.onLayout(changed, left, top, right, bottom);
        if (Build.VERSION.SDK_INT == 21 && (cVar = this.f۸۲۷۳e) != null) {
            cVar.m۹۹۸۳a(bottom - top, right - left);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f۸۲۷۷i != null && this.f۸۲۸۰l == 2) {
            int textWidth = (int) getPaint().measureText(getText().toString());
            int localIconSize = this.f۸۲۷۸j;
            if (localIconSize == 0) {
                localIconSize = this.f۸۲۷۷i.getIntrinsicWidth();
            }
            int newIconLeft = (((((getMeasuredWidth() - textWidth) - Cu.m۱۳۰۱۷n(this)) - localIconSize) - this.f۸۲۷۴f) - Cu.m۱۳۰۱۸o(this)) / 2;
            if (m۹۹۷۱a()) {
                newIconLeft = -newIconLeft;
            }
            if (this.f۸۲۷۹k != newIconLeft) {
                this.f۸۲۷۹k = newIconLeft;
                m۹۹۷۳c();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۹۹۷۱a() {
        return Cu.m۱۳۰۱۴k(this) == 1;
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable background) {
        super.setBackgroundDrawable(background);
    }

    public void setIconPadding(int iconPadding) {
        if (this.f۸۲۷۴f != iconPadding) {
            this.f۸۲۷۴f = iconPadding;
            setCompoundDrawablePadding(iconPadding);
        }
    }

    public int getIconPadding() {
        return this.f۸۲۷۴f;
    }

    public void setIconSize(int iconSize) {
        if (iconSize < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f۸۲۷۸j != iconSize) {
            this.f۸۲۷۸j = iconSize;
            m۹۹۷۳c();
        }
    }

    public int getIconSize() {
        return this.f۸۲۷۸j;
    }

    public void setIcon(Drawable icon) {
        if (this.f۸۲۷۷i != icon) {
            this.f۸۲۷۷i = icon;
            m۹۹۷۳c();
        }
    }

    public void setIconResource(int iconResourceId) {
        Drawable icon = null;
        if (iconResourceId != 0) {
            icon = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(getContext(), iconResourceId);
        }
        setIcon(icon);
    }

    public Drawable getIcon() {
        return this.f۸۲۷۷i;
    }

    public void setIconTint(ColorStateList iconTint) {
        if (this.f۸۲۷۶h != iconTint) {
            this.f۸۲۷۶h = iconTint;
            m۹۹۷۳c();
        }
    }

    public void setIconTintResource(int iconTintResourceId) {
        setIconTint(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(getContext(), iconTintResourceId));
    }

    public ColorStateList getIconTint() {
        return this.f۸۲۷۶h;
    }

    public void setIconTintMode(PorterDuff.Mode iconTintMode) {
        if (this.f۸۲۷۵g != iconTintMode) {
            this.f۸۲۷۵g = iconTintMode;
            m۹۹۷۳c();
        }
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f۸۲۷۵g;
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۹۹۷۳c() {
        Drawable drawable = this.f۸۲۷۷i;
        if (drawable != null) {
            this.f۸۲۷۷i = drawable.mutate();
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(this.f۸۲۷۷i, this.f۸۲۷۶h);
            PorterDuff.Mode mode = this.f۸۲۷۵g;
            if (mode != null) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(this.f۸۲۷۷i, mode);
            }
            int width = this.f۸۲۷۸j;
            if (width == 0) {
                width = this.f۸۲۷۷i.getIntrinsicWidth();
            }
            int height = this.f۸۲۷۸j;
            if (height == 0) {
                height = this.f۸۲۷۷i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f۸۲۷۷i;
            int i = this.f۸۲۷۹k;
            drawable2.setBounds(i, 0, i + width, height);
        }
        Cp.m۱۳۳۰۵a(this, this.f۸۲۷۷i, null, null, null);
    }

    public void setRippleColor(ColorStateList rippleColor) {
        if (m۹۹۷۲b()) {
            this.f۸۲۷۳e.m۹۹۸۴a(rippleColor);
        }
    }

    public void setRippleColorResource(int rippleColorResourceId) {
        if (m۹۹۷۲b()) {
            setRippleColor(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(getContext(), rippleColorResourceId));
        }
    }

    public ColorStateList getRippleColor() {
        if (m۹۹۷۲b()) {
            return this.f۸۲۷۳e.m۹۹۸۸b();
        }
        return null;
    }

    public void setStrokeColor(ColorStateList strokeColor) {
        if (m۹۹۷۲b()) {
            this.f۸۲۷۳e.m۹۹۹۰b(strokeColor);
        }
    }

    public void setStrokeColorResource(int strokeColorResourceId) {
        if (m۹۹۷۲b()) {
            setStrokeColor(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(getContext(), strokeColorResourceId));
        }
    }

    public ColorStateList getStrokeColor() {
        if (m۹۹۷۲b()) {
            return this.f۸۲۷۳e.m۹۹۹۱c();
        }
        return null;
    }

    public void setStrokeWidth(int strokeWidth) {
        if (m۹۹۷۲b()) {
            this.f۸۲۷۳e.m۹۹۹۲c(strokeWidth);
        }
    }

    public void setStrokeWidthResource(int strokeWidthResourceId) {
        if (m۹۹۷۲b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(strokeWidthResourceId));
        }
    }

    public int getStrokeWidth() {
        if (m۹۹۷۲b()) {
            return this.f۸۲۷۳e.m۹۹۹۴d();
        }
        return 0;
    }

    public void setCornerRadius(int cornerRadius) {
        if (m۹۹۷۲b()) {
            this.f۸۲۷۳e.m۹۹۸۹b(cornerRadius);
        }
    }

    public void setCornerRadiusResource(int cornerRadiusResourceId) {
        if (m۹۹۷۲b()) {
            setCornerRadius(getResources().getDimensionPixelSize(cornerRadiusResourceId));
        }
    }

    public int getCornerRadius() {
        if (m۹۹۷۲b()) {
            return this.f۸۲۷۳e.m۹۹۸۱a();
        }
        return 0;
    }

    public int getIconGravity() {
        return this.f۸۲۸۰l;
    }

    public void setIconGravity(int iconGravity) {
        this.f۸۲۸۰l = iconGravity;
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۹۹۷۲b() {
        Cc cVar = this.f۸۲۷۳e;
        return cVar != null && !cVar.m۹۹۹۷g();
    }
}
