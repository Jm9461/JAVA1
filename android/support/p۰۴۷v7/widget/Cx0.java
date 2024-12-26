package android.support.p۰۴۷v7.widget;

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

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.x0  reason: invalid class name */
public class Cx0 extends Drawable {

    /* renamed from: a  reason: contains not printable characters */
    private float f۱۲۴۰۰a;

    /* renamed from: b  reason: contains not printable characters */
    private final Paint f۱۲۴۰۱b;

    /* renamed from: c  reason: contains not printable characters */
    private final RectF f۱۲۴۰۲c;

    /* renamed from: d  reason: contains not printable characters */
    private final Rect f۱۲۴۰۳d;

    /* renamed from: e  reason: contains not printable characters */
    private float f۱۲۴۰۴e;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۱۲۴۰۵f = false;

    /* renamed from: g  reason: contains not printable characters */
    private boolean f۱۲۴۰۶g = true;

    /* renamed from: h  reason: contains not printable characters */
    private ColorStateList f۱۲۴۰۷h;

    /* renamed from: i  reason: contains not printable characters */
    private PorterDuffColorFilter f۱۲۴۰۸i;

    /* renamed from: j  reason: contains not printable characters */
    private ColorStateList f۱۲۴۰۹j;

    /* renamed from: k  reason: contains not printable characters */
    private PorterDuff.Mode f۱۲۴۱۰k = PorterDuff.Mode.SRC_IN;

    Cx0(ColorStateList backgroundColor, float radius) {
        this.f۱۲۴۰۰a = radius;
        this.f۱۲۴۰۱b = new Paint(5);
        m۱۵۷۰۶b(backgroundColor);
        this.f۱۲۴۰۲c = new RectF();
        this.f۱۲۴۰۳d = new Rect();
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۵۷۰۶b(ColorStateList color) {
        this.f۱۲۴۰۷h = color == null ? ColorStateList.valueOf(0) : color;
        this.f۱۲۴۰۱b.setColor(this.f۱۲۴۰۷h.getColorForState(getState(), this.f۱۲۴۰۷h.getDefaultColor()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۰۹a(float padding, boolean insetForPadding, boolean insetForRadius) {
        if (padding != this.f۱۲۴۰۴e || this.f۱۲۴۰۵f != insetForPadding || this.f۱۲۴۰۶g != insetForRadius) {
            this.f۱۲۴۰۴e = padding;
            this.f۱۲۴۰۵f = insetForPadding;
            this.f۱۲۴۰۶g = insetForRadius;
            m۱۵۷۰۵a((Rect) null);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public float m۱۵۷۱۱b() {
        return this.f۱۲۴۰۴e;
    }

    public void draw(Canvas canvas) {
        boolean clearColorFilter;
        Paint paint = this.f۱۲۴۰۱b;
        if (this.f۱۲۴۰۸i == null || paint.getColorFilter() != null) {
            clearColorFilter = false;
        } else {
            paint.setColorFilter(this.f۱۲۴۰۸i);
            clearColorFilter = true;
        }
        RectF rectF = this.f۱۲۴۰۲c;
        float f = this.f۱۲۴۰۰a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (clearColorFilter) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۷۰۵a(Rect bounds) {
        if (bounds == null) {
            bounds = getBounds();
        }
        this.f۱۲۴۰۲c.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        this.f۱۲۴۰۳d.set(bounds);
        if (this.f۱۲۴۰۵f) {
            float vInset = Cy0.m۱۵۷۱۸b(this.f۱۲۴۰۴e, this.f۱۲۴۰۰a, this.f۱۲۴۰۶g);
            this.f۱۲۴۰۳d.inset((int) Math.ceil((double) Cy0.m۱۵۷۱۵a(this.f۱۲۴۰۴e, this.f۱۲۴۰۰a, this.f۱۲۴۰۶g)), (int) Math.ceil((double) vInset));
            this.f۱۲۴۰۲c.set(this.f۱۲۴۰۳d);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        m۱۵۷۰۵a(bounds);
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f۱۲۴۰۳d, this.f۱۲۴۰۰a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۰۸a(float radius) {
        if (radius != this.f۱۲۴۰۰a) {
            this.f۱۲۴۰۰a = radius;
            m۱۵۷۰۵a((Rect) null);
            invalidateSelf();
        }
    }

    public void setAlpha(int alpha) {
        this.f۱۲۴۰۱b.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f۱۲۴۰۱b.setColorFilter(cf);
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: c  reason: contains not printable characters */
    public float m۱۵۷۱۲c() {
        return this.f۱۲۴۰۰a;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۱۰a(ColorStateList color) {
        m۱۵۷۰۶b(color);
        invalidateSelf();
    }

    /* renamed from: a  reason: contains not printable characters */
    public ColorStateList m۱۵۷۰۷a() {
        return this.f۱۲۴۰۷h;
    }

    public void setTintList(ColorStateList tint) {
        this.f۱۲۴۰۹j = tint;
        this.f۱۲۴۰۸i = m۱۵۷۰۴a(this.f۱۲۴۰۹j, this.f۱۲۴۱۰k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        this.f۱۲۴۱۰k = tintMode;
        this.f۱۲۴۰۸i = m۱۵۷۰۴a(this.f۱۲۴۰۹j, this.f۱۲۴۱۰k);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] stateSet) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f۱۲۴۰۷h;
        int newColor = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        boolean colorChanged = newColor != this.f۱۲۴۰۱b.getColor();
        if (colorChanged) {
            this.f۱۲۴۰۱b.setColor(newColor);
        }
        ColorStateList colorStateList2 = this.f۱۲۴۰۹j;
        if (colorStateList2 == null || (mode = this.f۱۲۴۱۰k) == null) {
            return colorChanged;
        }
        this.f۱۲۴۰۸i = m۱۵۷۰۴a(colorStateList2, mode);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f۱۲۴۰۹j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f۱۲۴۰۷h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* renamed from: a  reason: contains not printable characters */
    private PorterDuffColorFilter m۱۵۷۰۴a(ColorStateList tint, PorterDuff.Mode tintMode) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return new PorterDuffColorFilter(tint.getColorForState(getState(), 0), tintMode);
    }
}
