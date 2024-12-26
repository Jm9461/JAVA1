package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.design.widget.f  reason: invalid class name */
public class Cf extends Drawable {

    /* renamed from: a  reason: contains not printable characters */
    final Paint f۹۸۶۴a = new Paint(1);

    /* renamed from: b  reason: contains not printable characters */
    final Rect f۹۸۶۵b = new Rect();

    /* renamed from: c  reason: contains not printable characters */
    final RectF f۹۸۶۶c = new RectF();

    /* renamed from: d  reason: contains not printable characters */
    final Cb f۹۸۶۷d = new Cb();

    /* renamed from: e  reason: contains not printable characters */
    float f۹۸۶۸e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۹۸۶۹f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۹۸۷۰g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۹۸۷۱h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۹۸۷۲i;

    /* renamed from: j  reason: contains not printable characters */
    private ColorStateList f۹۸۷۳j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۹۸۷۴k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۹۸۷۵l = true;

    /* renamed from: m  reason: contains not printable characters */
    private float f۹۸۷۶m;

    public Cf() {
        this.f۹۸۶۴a.setStyle(Paint.Style.STROKE);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f۹۸۶۷d;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۱۲a(int topOuterStrokeColor, int topInnerStrokeColor, int bottomOuterStrokeColor, int bottomInnerStrokeColor) {
        this.f۹۸۶۹f = topOuterStrokeColor;
        this.f۹۸۷۰g = topInnerStrokeColor;
        this.f۹۸۷۱h = bottomOuterStrokeColor;
        this.f۹۸۷۲i = bottomInnerStrokeColor;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۱۱a(float width) {
        if (this.f۹۸۶۸e != width) {
            this.f۹۸۶۸e = width;
            this.f۹۸۶۴a.setStrokeWidth(1.3333f * width);
            this.f۹۸۷۵l = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f۹۸۷۵l) {
            this.f۹۸۶۴a.setShader(m۱۱۸۱۰a());
            this.f۹۸۷۵l = false;
        }
        float halfBorderWidth = this.f۹۸۶۴a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f۹۸۶۶c;
        copyBounds(this.f۹۸۶۵b);
        rectF.set(this.f۹۸۶۵b);
        rectF.left += halfBorderWidth;
        rectF.top += halfBorderWidth;
        rectF.right -= halfBorderWidth;
        rectF.bottom -= halfBorderWidth;
        canvas.save();
        canvas.rotate(this.f۹۸۷۶m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f۹۸۶۴a);
        canvas.restore();
    }

    public boolean getPadding(Rect padding) {
        int borderWidth = Math.round(this.f۹۸۶۸e);
        padding.set(borderWidth, borderWidth, borderWidth, borderWidth);
        return true;
    }

    public void setAlpha(int alpha) {
        this.f۹۸۶۴a.setAlpha(alpha);
        invalidateSelf();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۱۳a(ColorStateList tint) {
        if (tint != null) {
            this.f۹۸۷۴k = tint.getColorForState(getState(), this.f۹۸۷۴k);
        }
        this.f۹۸۷۳j = tint;
        this.f۹۸۷۵l = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f۹۸۶۴a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return this.f۹۸۶۸e > 0.0f ? -3 : -2;
    }

    /* renamed from: b  reason: contains not printable characters */
    public final void m۱۱۸۱۴b(float rotation) {
        if (rotation != this.f۹۸۷۶m) {
            this.f۹۸۷۶m = rotation;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        this.f۹۸۷۵l = true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f۹۸۷۳j;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        int newColor;
        ColorStateList colorStateList = this.f۹۸۷۳j;
        if (!(colorStateList == null || (newColor = colorStateList.getColorForState(state, this.f۹۸۷۴k)) == this.f۹۸۷۴k)) {
            this.f۹۸۷۵l = true;
            this.f۹۸۷۴k = newColor;
        }
        if (this.f۹۸۷۵l) {
            invalidateSelf();
        }
        return this.f۹۸۷۵l;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Shader m۱۱۸۱۰a() {
        Rect rect = this.f۹۸۶۵b;
        copyBounds(rect);
        float borderRatio = this.f۹۸۶۸e / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ca.m۱۰۴۱۹b(this.f۹۸۶۹f, this.f۹۸۷۴k), p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ca.m۱۰۴۱۹b(this.f۹۸۷۰g, this.f۹۸۷۴k), p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ca.m۱۰۴۱۹b(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ca.m۱۰۴۲۰c(this.f۹۸۷۰g, 0), this.f۹۸۷۴k), p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ca.m۱۰۴۱۹b(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ca.m۱۰۴۲۰c(this.f۹۸۷۲i, 0), this.f۹۸۷۴k), p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ca.m۱۰۴۱۹b(this.f۹۸۷۲i, this.f۹۸۷۴k), p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Ca.m۱۰۴۱۹b(this.f۹۸۷۱h, this.f۹۸۷۴k)}, new float[]{0.0f, borderRatio, 0.5f, 0.5f, 1.0f - borderRatio, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: android.support.design.widget.f$b  reason: invalid class name */
    private class Cb extends Drawable.ConstantState {
        private Cb() {
        }

        public Drawable newDrawable() {
            return Cf.this;
        }

        public int getChangingConfigurations() {
            return 0;
        }
    }
}
