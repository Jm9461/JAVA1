package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.x0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cx0 extends Drawable {

    /* renamed from: a, reason: contains not printable characters */
    private float f۱۲۴۰۰a;

    /* renamed from: c, reason: contains not printable characters */
    private final RectF f۱۲۴۰۲c;

    /* renamed from: d, reason: contains not printable characters */
    private final Rect f۱۲۴۰۳d;

    /* renamed from: e, reason: contains not printable characters */
    private float f۱۲۴۰۴e;

    /* renamed from: h, reason: contains not printable characters */
    private ColorStateList f۱۲۴۰۷h;

    /* renamed from: i, reason: contains not printable characters */
    private PorterDuffColorFilter f۱۲۴۰۸i;

    /* renamed from: j, reason: contains not printable characters */
    private ColorStateList f۱۲۴۰۹j;

    /* renamed from: f, reason: contains not printable characters */
    private boolean f۱۲۴۰۵f = false;

    /* renamed from: g, reason: contains not printable characters */
    private boolean f۱۲۴۰۶g = true;

    /* renamed from: k, reason: contains not printable characters */
    private PorterDuff.Mode f۱۲۴۱۰k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: contains not printable characters */
    private final Paint f۱۲۴۰۱b = new Paint(5);

    Cx0(ColorStateList backgroundColor, float radius) {
        this.f۱۲۴۰۰a = radius;
        m۱۳۶۳۶b(backgroundColor);
        this.f۱۲۴۰۲c = new RectF();
        this.f۱۲۴۰۳d = new Rect();
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۳۶۳۶b(ColorStateList color) {
        this.f۱۲۴۰۷h = color == null ? ColorStateList.valueOf(0) : color;
        this.f۱۲۴۰۱b.setColor(this.f۱۲۴۰۷h.getColorForState(getState(), this.f۱۲۴۰۷h.getDefaultColor()));
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۶۳۹a(float padding, boolean insetForPadding, boolean insetForRadius) {
        if (padding == this.f۱۲۴۰۴e && this.f۱۲۴۰۵f == insetForPadding && this.f۱۲۴۰۶g == insetForRadius) {
            return;
        }
        this.f۱۲۴۰۴e = padding;
        this.f۱۲۴۰۵f = insetForPadding;
        this.f۱۲۴۰۶g = insetForRadius;
        m۱۳۶۳۵a((Rect) null);
        invalidateSelf();
    }

    /* renamed from: b, reason: contains not printable characters */
    float m۱۳۶۴۱b() {
        return this.f۱۲۴۰۴e;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean clearColorFilter;
        Paint paint = this.f۱۲۴۰۱b;
        if (this.f۱۲۴۰۸i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f۱۲۴۰۸i);
            clearColorFilter = true;
        } else {
            clearColorFilter = false;
        }
        RectF rectF = this.f۱۲۴۰۲c;
        float f2 = this.f۱۲۴۰۰a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (clearColorFilter) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۶۳۵a(Rect bounds) {
        if (bounds == null) {
            bounds = getBounds();
        }
        this.f۱۲۴۰۲c.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        this.f۱۲۴۰۳d.set(bounds);
        if (this.f۱۲۴۰۵f) {
            float vInset = Cy0.m۱۳۶۴۸b(this.f۱۲۴۰۴e, this.f۱۲۴۰۰a, this.f۱۲۴۰۶g);
            float hInset = Cy0.m۱۳۶۴۵a(this.f۱۲۴۰۴e, this.f۱۲۴۰۰a, this.f۱۲۴۰۶g);
            this.f۱۲۴۰۳d.inset((int) Math.ceil(hInset), (int) Math.ceil(vInset));
            this.f۱۲۴۰۲c.set(this.f۱۲۴۰۳d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        m۱۳۶۳۵a(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f۱۲۴۰۳d, this.f۱۲۴۰۰a);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۶۳۸a(float radius) {
        if (radius == this.f۱۲۴۰۰a) {
            return;
        }
        this.f۱۲۴۰۰a = radius;
        m۱۳۶۳۵a((Rect) null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f۱۲۴۰۱b.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
        this.f۱۲۴۰۱b.setColorFilter(cf);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: c, reason: contains not printable characters */
    public float m۱۳۶۴۲c() {
        return this.f۱۲۴۰۰a;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۶۴۰a(ColorStateList color) {
        m۱۳۶۳۶b(color);
        invalidateSelf();
    }

    /* renamed from: a, reason: contains not printable characters */
    public ColorStateList m۱۳۶۳۷a() {
        return this.f۱۲۴۰۷h;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        this.f۱۲۴۰۹j = tint;
        this.f۱۲۴۰۸i = m۱۳۶۳۴a(this.f۱۲۴۰۹j, this.f۱۲۴۱۰k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        this.f۱۲۴۱۰k = tintMode;
        this.f۱۲۴۰۸i = m۱۳۶۳۴a(this.f۱۲۴۰۹j, this.f۱۲۴۱۰k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] stateSet) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f۱۲۴۰۷h;
        int newColor = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        boolean colorChanged = newColor != this.f۱۲۴۰۱b.getColor();
        if (colorChanged) {
            this.f۱۲۴۰۱b.setColor(newColor);
        }
        ColorStateList colorStateList2 = this.f۱۲۴۰۹j;
        if (colorStateList2 != null && (mode = this.f۱۲۴۱۰k) != null) {
            this.f۱۲۴۰۸i = m۱۳۶۳۴a(colorStateList2, mode);
            return true;
        }
        return colorChanged;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f۱۲۴۰۹j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f۱۲۴۰۷h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* renamed from: a, reason: contains not printable characters */
    private PorterDuffColorFilter m۱۳۶۳۴a(ColorStateList tint, PorterDuff.Mode tintMode) {
        if (tint == null || tintMode == null) {
            return null;
        }
        int color = tint.getColorForState(getState(), 0);
        return new PorterDuffColorFilter(color, tintMode);
    }
}
