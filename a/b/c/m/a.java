package a.b.c.m;

import a.b.c.b;
import a.b.c.j;
import a.b.c.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.internal.h;
import android.support.v4.view.u;
import android.support.v4.widget.p;
import android.support.v7.widget.g;
import android.util.AttributeSet;
import android.util.Log;

public class a extends g {

    /* renamed from: e  reason: collision with root package name */
    private final c f۴۴e;

    /* renamed from: f  reason: collision with root package name */
    private int f۴۵f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f۴۶g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f۴۷h;
    private Drawable i;
    private int j;
    private int k;
    private int l;

    public a(Context context, AttributeSet attrs) {
        this(context, attrs, b.materialButtonStyle);
    }

    public a(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray attributes = android.support.design.internal.g.c(context, attrs, k.MaterialButton, defStyleAttr, j.Widget_MaterialComponents_Button, new int[0]);
        this.f۴۵f = attributes.getDimensionPixelSize(k.MaterialButton_iconPadding, 0);
        this.f۴۶g = h.a(attributes.getInt(k.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f۴۷h = a.b.c.p.a.a(getContext(), attributes, k.MaterialButton_iconTint);
        this.i = a.b.c.p.a.b(getContext(), attributes, k.MaterialButton_icon);
        this.l = attributes.getInteger(k.MaterialButton_iconGravity, 1);
        this.j = attributes.getDimensionPixelSize(k.MaterialButton_iconSize, 0);
        this.f۴۴e = new c(this);
        this.f۴۴e.a(attributes);
        attributes.recycle();
        setCompoundDrawablePadding(this.f۴۵f);
        c();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT < 21 && b()) {
            this.f۴۴e.a(canvas);
        }
    }

    @Override // android.support.v7.widget.g, android.support.v4.view.t
    public void setSupportBackgroundTintList(ColorStateList tint) {
        if (b()) {
            this.f۴۴e.c(tint);
        } else if (this.f۴۴e != null) {
            super.setSupportBackgroundTintList(tint);
        }
    }

    @Override // android.support.v7.widget.g, android.support.v4.view.t
    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.f۴۴e.e();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // android.support.v7.widget.g, android.support.v4.view.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        if (b()) {
            this.f۴۴e.a(tintMode);
        } else if (this.f۴۴e != null) {
            super.setSupportBackgroundTintMode(tintMode);
        }
    }

    @Override // android.support.v7.widget.g, android.support.v4.view.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.f۴۴e.f();
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
        if (b()) {
            this.f۴۴e.a(color);
        } else {
            super.setBackgroundColor(color);
        }
    }

    public void setBackground(Drawable background) {
        setBackgroundDrawable(background);
    }

    @Override // android.support.v7.widget.g
    public void setBackgroundResource(int backgroundResourceId) {
        Drawable background = null;
        if (backgroundResourceId != 0) {
            background = a.b.h.c.a.a.c(getContext(), backgroundResourceId);
        }
        setBackgroundDrawable(background);
    }

    @Override // android.support.v7.widget.g
    public void setBackgroundDrawable(Drawable background) {
        if (!b()) {
            super.setBackgroundDrawable(background);
        } else if (background != getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            this.f۴۴e.h();
            super.setBackgroundDrawable(background);
        } else {
            getBackground().setState(background.getState());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.widget.g
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        c cVar;
        super.onLayout(changed, left, top, right, bottom);
        if (Build.VERSION.SDK_INT == 21 && (cVar = this.f۴۴e) != null) {
            cVar.a(bottom - top, right - left);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.i != null && this.l == 2) {
            int textWidth = (int) getPaint().measureText(getText().toString());
            int localIconSize = this.j;
            if (localIconSize == 0) {
                localIconSize = this.i.getIntrinsicWidth();
            }
            int newIconLeft = (((((getMeasuredWidth() - textWidth) - u.n(this)) - localIconSize) - this.f۴۵f) - u.o(this)) / 2;
            if (a()) {
                newIconLeft = -newIconLeft;
            }
            if (this.k != newIconLeft) {
                this.k = newIconLeft;
                c();
            }
        }
    }

    private boolean a() {
        return u.k(this) == 1;
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable background) {
        super.setBackgroundDrawable(background);
    }

    public void setIconPadding(int iconPadding) {
        if (this.f۴۵f != iconPadding) {
            this.f۴۵f = iconPadding;
            setCompoundDrawablePadding(iconPadding);
        }
    }

    public int getIconPadding() {
        return this.f۴۵f;
    }

    public void setIconSize(int iconSize) {
        if (iconSize < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.j != iconSize) {
            this.j = iconSize;
            c();
        }
    }

    public int getIconSize() {
        return this.j;
    }

    public void setIcon(Drawable icon) {
        if (this.i != icon) {
            this.i = icon;
            c();
        }
    }

    public void setIconResource(int iconResourceId) {
        Drawable icon = null;
        if (iconResourceId != 0) {
            icon = a.b.h.c.a.a.c(getContext(), iconResourceId);
        }
        setIcon(icon);
    }

    public Drawable getIcon() {
        return this.i;
    }

    public void setIconTint(ColorStateList iconTint) {
        if (this.f۴۷h != iconTint) {
            this.f۴۷h = iconTint;
            c();
        }
    }

    public void setIconTintResource(int iconTintResourceId) {
        setIconTint(a.b.h.c.a.a.b(getContext(), iconTintResourceId));
    }

    public ColorStateList getIconTint() {
        return this.f۴۷h;
    }

    public void setIconTintMode(PorterDuff.Mode iconTintMode) {
        if (this.f۴۶g != iconTintMode) {
            this.f۴۶g = iconTintMode;
            c();
        }
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f۴۶g;
    }

    private void c() {
        Drawable drawable = this.i;
        if (drawable != null) {
            this.i = drawable.mutate();
            android.support.v4.graphics.drawable.a.a(this.i, this.f۴۷h);
            PorterDuff.Mode mode = this.f۴۶g;
            if (mode != null) {
                android.support.v4.graphics.drawable.a.a(this.i, mode);
            }
            int width = this.j;
            if (width == 0) {
                width = this.i.getIntrinsicWidth();
            }
            int height = this.j;
            if (height == 0) {
                height = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i2 = this.k;
            drawable2.setBounds(i2, 0, i2 + width, height);
        }
        p.a(this, this.i, null, null, null);
    }

    public void setRippleColor(ColorStateList rippleColor) {
        if (b()) {
            this.f۴۴e.a(rippleColor);
        }
    }

    public void setRippleColorResource(int rippleColorResourceId) {
        if (b()) {
            setRippleColor(a.b.h.c.a.a.b(getContext(), rippleColorResourceId));
        }
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f۴۴e.b();
        }
        return null;
    }

    public void setStrokeColor(ColorStateList strokeColor) {
        if (b()) {
            this.f۴۴e.b(strokeColor);
        }
    }

    public void setStrokeColorResource(int strokeColorResourceId) {
        if (b()) {
            setStrokeColor(a.b.h.c.a.a.b(getContext(), strokeColorResourceId));
        }
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f۴۴e.c();
        }
        return null;
    }

    public void setStrokeWidth(int strokeWidth) {
        if (b()) {
            this.f۴۴e.c(strokeWidth);
        }
    }

    public void setStrokeWidthResource(int strokeWidthResourceId) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(strokeWidthResourceId));
        }
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f۴۴e.d();
        }
        return 0;
    }

    public void setCornerRadius(int cornerRadius) {
        if (b()) {
            this.f۴۴e.b(cornerRadius);
        }
    }

    public void setCornerRadiusResource(int cornerRadiusResourceId) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(cornerRadiusResourceId));
        }
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f۴۴e.a();
        }
        return 0;
    }

    public int getIconGravity() {
        return this.l;
    }

    public void setIconGravity(int iconGravity) {
        this.l = iconGravity;
    }

    private boolean b() {
        c cVar = this.f۴۴e;
        return cVar != null && !cVar.g();
    }
}
