package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۶۹m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.internal.Ch;
import android.support.v4.view.Cu;
import android.support.v4.widget.Cp;
import android.support.v7.widget.Cg;
import android.util.AttributeSet;
import android.util.Log;
import p۱۵۹a.p۱۶۴b.p۱۶۷c.Cb;
import p۱۵۹a.p۱۶۴b.p۱۶۷c.Cj;
import p۱۵۹a.p۱۶۴b.p۱۶۷c.Ck;

/* renamed from: a.b.c.m.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends Cg {

    /* renamed from: e, reason: contains not printable characters */
    private final Cc f۸۲۷۳e;

    /* renamed from: f, reason: contains not printable characters */
    private int f۸۲۷۴f;

    /* renamed from: g, reason: contains not printable characters */
    private PorterDuff.Mode f۸۲۷۵g;

    /* renamed from: h, reason: contains not printable characters */
    private ColorStateList f۸۲۷۶h;

    /* renamed from: i, reason: contains not printable characters */
    private Drawable f۸۲۷۷i;

    /* renamed from: j, reason: contains not printable characters */
    private int f۸۲۷۸j;

    /* renamed from: k, reason: contains not printable characters */
    private int f۸۲۷۹k;

    /* renamed from: l, reason: contains not printable characters */
    private int f۸۲۸۰l;

    public Ca(Context context, AttributeSet attrs) {
        this(context, attrs, Cb.materialButtonStyle);
    }

    public Ca(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray attributes = android.support.design.internal.Cg.m۹۲۹۰c(context, attrs, Ck.MaterialButton, defStyleAttr, Cj.Widget_MaterialComponents_Button, new int[0]);
        this.f۸۲۷۴f = attributes.getDimensionPixelSize(Ck.MaterialButton_iconPadding, 0);
        this.f۸۲۷۵g = Ch.m۹۲۹۲a(attributes.getInt(Ck.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f۸۲۷۶h = p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۳p.Ca.m۷۹۶۳a(getContext(), attributes, Ck.MaterialButton_iconTint);
        this.f۸۲۷۷i = p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۳p.Ca.m۷۹۶۴b(getContext(), attributes, Ck.MaterialButton_icon);
        this.f۸۲۸۰l = attributes.getInteger(Ck.MaterialButton_iconGravity, 1);
        this.f۸۲۷۸j = attributes.getDimensionPixelSize(Ck.MaterialButton_iconSize, 0);
        this.f۸۲۷۳e = new Cc(this);
        this.f۸۲۷۳e.m۷۹۱۸a(attributes);
        attributes.recycle();
        setCompoundDrawablePadding(this.f۸۲۷۴f);
        m۷۹۰۶c();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT < 21 && m۷۹۰۵b()) {
            this.f۸۲۷۳e.m۷۹۱۹a(canvas);
        }
    }

    @Override // android.support.v7.widget.Cg, android.support.v4.view.InterfaceCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        if (m۷۹۰۵b()) {
            this.f۸۲۷۳e.m۷۹۲۶c(tint);
        } else if (this.f۸۲۷۳e != null) {
            super.setSupportBackgroundTintList(tint);
        }
    }

    @Override // android.support.v7.widget.Cg, android.support.v4.view.InterfaceCt
    public ColorStateList getSupportBackgroundTintList() {
        if (m۷۹۰۵b()) {
            return this.f۸۲۷۳e.m۷۹۲۸e();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // android.support.v7.widget.Cg, android.support.v4.view.InterfaceCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        if (m۷۹۰۵b()) {
            this.f۸۲۷۳e.m۷۹۲۰a(tintMode);
        } else if (this.f۸۲۷۳e != null) {
            super.setSupportBackgroundTintMode(tintMode);
        }
    }

    @Override // android.support.v7.widget.Cg, android.support.v4.view.InterfaceCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m۷۹۰۵b()) {
            return this.f۸۲۷۳e.m۷۹۲۹f();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList tintList) {
        setSupportBackgroundTintList(tintList);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode tintMode) {
        setSupportBackgroundTintMode(tintMode);
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        if (m۷۹۰۵b()) {
            this.f۸۲۷۳e.m۷۹۱۵a(color);
        } else {
            super.setBackgroundColor(color);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        setBackgroundDrawable(background);
    }

    @Override // android.support.v7.widget.Cg, android.view.View
    public void setBackgroundResource(int backgroundResourceId) {
        Drawable background = null;
        if (backgroundResourceId != 0) {
            background = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۴c(getContext(), backgroundResourceId);
        }
        setBackgroundDrawable(background);
    }

    @Override // android.support.v7.widget.Cg, android.view.View
    public void setBackgroundDrawable(Drawable background) {
        if (m۷۹۰۵b()) {
            if (background != getBackground()) {
                Log.i("MaterialButton", "Setting a custom background is not supported.");
                this.f۸۲۷۳e.m۷۹۳۱h();
                super.setBackgroundDrawable(background);
                return;
            }
            getBackground().setState(background.getState());
            return;
        }
        super.setBackgroundDrawable(background);
    }

    @Override // android.support.v7.widget.Cg, android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Cc cc;
        super.onLayout(changed, left, top, right, bottom);
        if (Build.VERSION.SDK_INT == 21 && (cc = this.f۸۲۷۳e) != null) {
            cc.m۷۹۱۶a(bottom - top, right - left);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f۸۲۷۷i == null || this.f۸۲۸۰l != 2) {
            return;
        }
        Paint textPaint = getPaint();
        int textWidth = (int) textPaint.measureText(getText().toString());
        int localIconSize = this.f۸۲۷۸j;
        if (localIconSize == 0) {
            localIconSize = this.f۸۲۷۷i.getIntrinsicWidth();
        }
        int newIconLeft = (((((getMeasuredWidth() - textWidth) - Cu.m۱۰۹۴۷n(this)) - localIconSize) - this.f۸۲۷۴f) - Cu.m۱۰۹۴۸o(this)) / 2;
        if (m۷۹۰۴a()) {
            newIconLeft = -newIconLeft;
        }
        if (this.f۸۲۷۹k != newIconLeft) {
            this.f۸۲۷۹k = newIconLeft;
            m۷۹۰۶c();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۷۹۰۴a() {
        return Cu.m۱۰۹۴۴k(this) == 1;
    }

    void setInternalBackground(Drawable background) {
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
        }
        if (this.f۸۲۷۸j != iconSize) {
            this.f۸۲۷۸j = iconSize;
            m۷۹۰۶c();
        }
    }

    public int getIconSize() {
        return this.f۸۲۷۸j;
    }

    public void setIcon(Drawable icon) {
        if (this.f۸۲۷۷i != icon) {
            this.f۸۲۷۷i = icon;
            m۷۹۰۶c();
        }
    }

    public void setIconResource(int iconResourceId) {
        Drawable icon = null;
        if (iconResourceId != 0) {
            icon = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۴c(getContext(), iconResourceId);
        }
        setIcon(icon);
    }

    public Drawable getIcon() {
        return this.f۸۲۷۷i;
    }

    public void setIconTint(ColorStateList iconTint) {
        if (this.f۸۲۷۶h != iconTint) {
            this.f۸۲۷۶h = iconTint;
            m۷۹۰۶c();
        }
    }

    public void setIconTintResource(int iconTintResourceId) {
        setIconTint(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۳b(getContext(), iconTintResourceId));
    }

    public ColorStateList getIconTint() {
        return this.f۸۲۷۶h;
    }

    public void setIconTintMode(PorterDuff.Mode iconTintMode) {
        if (this.f۸۲۷۵g != iconTintMode) {
            this.f۸۲۷۵g = iconTintMode;
            m۷۹۰۶c();
        }
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f۸۲۷۵g;
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۷۹۰۶c() {
        Drawable drawable = this.f۸۲۷۷i;
        if (drawable != null) {
            this.f۸۲۷۷i = drawable.mutate();
            android.support.v4.graphics.drawable.Ca.m۱۰۶۳۸a(this.f۸۲۷۷i, this.f۸۲۷۶h);
            PorterDuff.Mode mode = this.f۸۲۷۵g;
            if (mode != null) {
                android.support.v4.graphics.drawable.Ca.m۱۰۶۴۱a(this.f۸۲۷۷i, mode);
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
        Cp.m۱۱۲۳۵a(this, this.f۸۲۷۷i, null, null, null);
    }

    public void setRippleColor(ColorStateList rippleColor) {
        if (m۷۹۰۵b()) {
            this.f۸۲۷۳e.m۷۹۱۷a(rippleColor);
        }
    }

    public void setRippleColorResource(int rippleColorResourceId) {
        if (m۷۹۰۵b()) {
            setRippleColor(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۳b(getContext(), rippleColorResourceId));
        }
    }

    public ColorStateList getRippleColor() {
        if (m۷۹۰۵b()) {
            return this.f۸۲۷۳e.m۷۹۲۱b();
        }
        return null;
    }

    public void setStrokeColor(ColorStateList strokeColor) {
        if (m۷۹۰۵b()) {
            this.f۸۲۷۳e.m۷۹۲۳b(strokeColor);
        }
    }

    public void setStrokeColorResource(int strokeColorResourceId) {
        if (m۷۹۰۵b()) {
            setStrokeColor(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۳b(getContext(), strokeColorResourceId));
        }
    }

    public ColorStateList getStrokeColor() {
        if (m۷۹۰۵b()) {
            return this.f۸۲۷۳e.m۷۹۲۴c();
        }
        return null;
    }

    public void setStrokeWidth(int strokeWidth) {
        if (m۷۹۰۵b()) {
            this.f۸۲۷۳e.m۷۹۲۵c(strokeWidth);
        }
    }

    public void setStrokeWidthResource(int strokeWidthResourceId) {
        if (m۷۹۰۵b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(strokeWidthResourceId));
        }
    }

    public int getStrokeWidth() {
        if (m۷۹۰۵b()) {
            return this.f۸۲۷۳e.m۷۹۲۷d();
        }
        return 0;
    }

    public void setCornerRadius(int cornerRadius) {
        if (m۷۹۰۵b()) {
            this.f۸۲۷۳e.m۷۹۲۲b(cornerRadius);
        }
    }

    public void setCornerRadiusResource(int cornerRadiusResourceId) {
        if (m۷۹۰۵b()) {
            setCornerRadius(getResources().getDimensionPixelSize(cornerRadiusResourceId));
        }
    }

    public int getCornerRadius() {
        if (m۷۹۰۵b()) {
            return this.f۸۲۷۳e.m۷۹۱۴a();
        }
        return 0;
    }

    public int getIconGravity() {
        return this.f۸۲۸۰l;
    }

    public void setIconGravity(int iconGravity) {
        this.f۸۲۸۰l = iconGravity;
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۷۹۰۵b() {
        Cc cc = this.f۸۲۷۳e;
        return (cc == null || cc.m۷۹۳۰g()) ? false : true;
    }
}
