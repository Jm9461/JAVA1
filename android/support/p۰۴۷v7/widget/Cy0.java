package android.support.p۰۴۷v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۴b.Cb;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۴b.Cc;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.y0  reason: invalid class name */
public class Cy0 extends Drawable {

    /* renamed from: q  reason: contains not printable characters */
    private static final double f۱۲۴۱۱q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r  reason: contains not printable characters */
    static AbstractCa f۱۲۴۱۲r;

    /* renamed from: a  reason: contains not printable characters */
    private final int f۱۲۴۱۳a;

    /* renamed from: b  reason: contains not printable characters */
    private Paint f۱۲۴۱۴b;

    /* renamed from: c  reason: contains not printable characters */
    private Paint f۱۲۴۱۵c;

    /* renamed from: d  reason: contains not printable characters */
    private Paint f۱۲۴۱۶d;

    /* renamed from: e  reason: contains not printable characters */
    private final RectF f۱۲۴۱۷e;

    /* renamed from: f  reason: contains not printable characters */
    private float f۱۲۴۱۸f;

    /* renamed from: g  reason: contains not printable characters */
    private Path f۱۲۴۱۹g;

    /* renamed from: h  reason: contains not printable characters */
    private float f۱۲۴۲۰h;

    /* renamed from: i  reason: contains not printable characters */
    private float f۱۲۴۲۱i;

    /* renamed from: j  reason: contains not printable characters */
    private float f۱۲۴۲۲j;

    /* renamed from: k  reason: contains not printable characters */
    private ColorStateList f۱۲۴۲۳k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۲۴۲۴l = true;

    /* renamed from: m  reason: contains not printable characters */
    private final int f۱۲۴۲۵m;

    /* renamed from: n  reason: contains not printable characters */
    private final int f۱۲۴۲۶n;

    /* renamed from: o  reason: contains not printable characters */
    private boolean f۱۲۴۲۷o = true;

    /* renamed from: p  reason: contains not printable characters */
    private boolean f۱۲۴۲۸p = false;

    /* renamed from: android.support.v7.widget.y0$a  reason: invalid class name */
    interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۷۳۵a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    Cy0(Resources resources, ColorStateList backgroundColor, float radius, float shadowSize, float maxShadowSize) {
        this.f۱۲۴۲۵m = resources.getColor(Cb.cardview_shadow_start_color);
        this.f۱۲۴۲۶n = resources.getColor(Cb.cardview_shadow_end_color);
        this.f۱۲۴۱۳a = resources.getDimensionPixelSize(Cc.cardview_compat_inset_shadow);
        this.f۱۲۴۱۴b = new Paint(5);
        m۱۵۷۱۹b(backgroundColor);
        this.f۱۲۴۱۵c = new Paint(5);
        this.f۱۲۴۱۵c.setStyle(Paint.Style.FILL);
        this.f۱۲۴۱۸f = (float) ((int) (0.5f + radius));
        this.f۱۲۴۱۷e = new RectF();
        this.f۱۲۴۱۶d = new Paint(this.f۱۲۴۱۵c);
        this.f۱۲۴۱۶d.setAntiAlias(false);
        m۱۵۷۱۶a(shadowSize, maxShadowSize);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۵۷۱۹b(ColorStateList color) {
        this.f۱۲۴۲۳k = color == null ? ColorStateList.valueOf(0) : color;
        this.f۱۲۴۱۴b.setColor(this.f۱۲۴۲۳k.getColorForState(getState(), this.f۱۲۴۲۳k.getDefaultColor()));
    }

    /* renamed from: d  reason: contains not printable characters */
    private int m۱۵۷۲۱d(float value) {
        int i = (int) (0.5f + value);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۲۷a(boolean addPaddingForCorners) {
        this.f۱۲۴۲۷o = addPaddingForCorners;
        invalidateSelf();
    }

    public void setAlpha(int alpha) {
        this.f۱۲۴۱۴b.setAlpha(alpha);
        this.f۱۲۴۱۵c.setAlpha(alpha);
        this.f۱۲۴۱۶d.setAlpha(alpha);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.f۱۲۴۲۴l = true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۷۱۶a(float shadowSize, float maxShadowSize) {
        if (shadowSize < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + shadowSize + ". Must be >= 0");
        } else if (maxShadowSize >= 0.0f) {
            float shadowSize2 = (float) m۱۵۷۲۱d(shadowSize);
            float maxShadowSize2 = (float) m۱۵۷۲۱d(maxShadowSize);
            if (shadowSize2 > maxShadowSize2) {
                shadowSize2 = maxShadowSize2;
                if (!this.f۱۲۴۲۸p) {
                    this.f۱۲۴۲۸p = true;
                }
            }
            if (this.f۱۲۴۲۲j != shadowSize2 || this.f۱۲۴۲۰h != maxShadowSize2) {
                this.f۱۲۴۲۲j = shadowSize2;
                this.f۱۲۴۲۰h = maxShadowSize2;
                this.f۱۲۴۲۱i = (float) ((int) ((1.5f * shadowSize2) + ((float) this.f۱۲۴۱۳a) + 0.5f));
                this.f۱۲۴۲۴l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + maxShadowSize + ". Must be >= 0");
        }
    }

    public boolean getPadding(Rect padding) {
        int vOffset = (int) Math.ceil((double) m۱۵۷۱۸b(this.f۱۲۴۲۰h, this.f۱۲۴۱۸f, this.f۱۲۴۲۷o));
        int hOffset = (int) Math.ceil((double) m۱۵۷۱۵a(this.f۱۲۴۲۰h, this.f۱۲۴۱۸f, this.f۱۲۴۲۷o));
        padding.set(hOffset, vOffset, hOffset, vOffset);
        return true;
    }

    /* renamed from: b  reason: contains not printable characters */
    static float m۱۵۷۱۸b(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (!addPaddingForCorners) {
            return 1.5f * maxShadowSize;
        }
        double d = (double) (1.5f * maxShadowSize);
        double d2 = 1.0d - f۱۲۴۱۱q;
        double d3 = (double) cornerRadius;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    /* renamed from: a  reason: contains not printable characters */
    static float m۱۵۷۱۵a(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (!addPaddingForCorners) {
            return maxShadowSize;
        }
        double d = (double) maxShadowSize;
        double d2 = 1.0d - f۱۲۴۱۱q;
        double d3 = (double) cornerRadius;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] stateSet) {
        ColorStateList colorStateList = this.f۱۲۴۲۳k;
        int newColor = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        if (this.f۱۲۴۱۴b.getColor() == newColor) {
            return false;
        }
        this.f۱۲۴۱۴b.setColor(newColor);
        this.f۱۲۴۲۴l = true;
        invalidateSelf();
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f۱۲۴۲۳k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void setColorFilter(ColorFilter cf) {
        this.f۱۲۴۱۴b.setColorFilter(cf);
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۲۴a(float radius) {
        if (radius >= 0.0f) {
            float radius2 = (float) ((int) (0.5f + radius));
            if (this.f۱۲۴۱۸f != radius2) {
                this.f۱۲۴۱۸f = radius2;
                this.f۱۲۴۲۴l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + radius + ". Must be >= 0");
    }

    public void draw(Canvas canvas) {
        if (this.f۱۲۴۲۴l) {
            m۱۵۷۲۰b(getBounds());
            this.f۱۲۴۲۴l = false;
        }
        canvas.translate(0.0f, this.f۱۲۴۲۲j / 2.0f);
        m۱۵۷۱۷a(canvas);
        canvas.translate(0.0f, (-this.f۱۲۴۲۲j) / 2.0f);
        f۱۲۴۱۲r.m۱۵۷۳۵a(canvas, this.f۱۲۴۱۷e, this.f۱۲۴۱۸f, this.f۱۲۴۱۴b);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۷۱۷a(Canvas canvas) {
        float f = this.f۱۲۴۱۸f;
        float edgeShadowTop = (-f) - this.f۱۲۴۲۱i;
        float inset = f + ((float) this.f۱۲۴۱۳a) + (this.f۱۲۴۲۲j / 2.0f);
        boolean drawVerticalEdges = true;
        boolean drawHorizontalEdges = this.f۱۲۴۱۷e.width() - (inset * 2.0f) > 0.0f;
        if (this.f۱۲۴۱۷e.height() - (inset * 2.0f) <= 0.0f) {
            drawVerticalEdges = false;
        }
        int saved = canvas.save();
        RectF rectF = this.f۱۲۴۱۷e;
        canvas.translate(rectF.left + inset, rectF.top + inset);
        canvas.drawPath(this.f۱۲۴۱۹g, this.f۱۲۴۱۵c);
        if (drawHorizontalEdges) {
            canvas.drawRect(0.0f, edgeShadowTop, this.f۱۲۴۱۷e.width() - (inset * 2.0f), -this.f۱۲۴۱۸f, this.f۱۲۴۱۶d);
        }
        canvas.restoreToCount(saved);
        int saved2 = canvas.save();
        RectF rectF2 = this.f۱۲۴۱۷e;
        canvas.translate(rectF2.right - inset, rectF2.bottom - inset);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f۱۲۴۱۹g, this.f۱۲۴۱۵c);
        if (drawHorizontalEdges) {
            canvas.drawRect(0.0f, edgeShadowTop, this.f۱۲۴۱۷e.width() - (inset * 2.0f), (-this.f۱۲۴۱۸f) + this.f۱۲۴۲۱i, this.f۱۲۴۱۶d);
        }
        canvas.restoreToCount(saved2);
        int saved3 = canvas.save();
        RectF rectF3 = this.f۱۲۴۱۷e;
        canvas.translate(rectF3.left + inset, rectF3.bottom - inset);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f۱۲۴۱۹g, this.f۱۲۴۱۵c);
        if (drawVerticalEdges) {
            canvas.drawRect(0.0f, edgeShadowTop, this.f۱۲۴۱۷e.height() - (inset * 2.0f), -this.f۱۲۴۱۸f, this.f۱۲۴۱۶d);
        }
        canvas.restoreToCount(saved3);
        int saved4 = canvas.save();
        RectF rectF4 = this.f۱۲۴۱۷e;
        canvas.translate(rectF4.right - inset, rectF4.top + inset);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f۱۲۴۱۹g, this.f۱۲۴۱۵c);
        if (drawVerticalEdges) {
            canvas.drawRect(0.0f, edgeShadowTop, this.f۱۲۴۱۷e.height() - (2.0f * inset), -this.f۱۲۴۱۸f, this.f۱۲۴۱۶d);
        }
        canvas.restoreToCount(saved4);
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۵۷۲۲g() {
        float f = this.f۱۲۴۱۸f;
        RectF innerBounds = new RectF(-f, -f, f, f);
        RectF outerBounds = new RectF(innerBounds);
        float f2 = this.f۱۲۴۲۱i;
        outerBounds.inset(-f2, -f2);
        Path path = this.f۱۲۴۱۹g;
        if (path == null) {
            this.f۱۲۴۱۹g = new Path();
        } else {
            path.reset();
        }
        this.f۱۲۴۱۹g.setFillType(Path.FillType.EVEN_ODD);
        this.f۱۲۴۱۹g.moveTo(-this.f۱۲۴۱۸f, 0.0f);
        this.f۱۲۴۱۹g.rLineTo(-this.f۱۲۴۲۱i, 0.0f);
        this.f۱۲۴۱۹g.arcTo(outerBounds, 180.0f, 90.0f, false);
        this.f۱۲۴۱۹g.arcTo(innerBounds, 270.0f, -90.0f, false);
        this.f۱۲۴۱۹g.close();
        float f3 = this.f۱۲۴۱۸f;
        float f4 = this.f۱۲۴۲۱i;
        Paint paint = this.f۱۲۴۱۵c;
        float f5 = f3 + f4;
        int i = this.f۱۲۴۲۵m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f۱۲۴۲۶n}, new float[]{0.0f, f3 / (f3 + f4), 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f۱۲۴۱۶d;
        float f6 = this.f۱۲۴۱۸f;
        float f7 = this.f۱۲۴۲۱i;
        float f8 = (-f6) - f7;
        int i2 = this.f۱۲۴۲۵m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, f8, new int[]{i2, i2, this.f۱۲۴۲۶n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f۱۲۴۱۶d.setAntiAlias(false);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۵۷۲۰b(Rect bounds) {
        float f = this.f۱۲۴۲۰h;
        float verticalOffset = 1.5f * f;
        this.f۱۲۴۱۷e.set(((float) bounds.left) + f, ((float) bounds.top) + verticalOffset, ((float) bounds.right) - f, ((float) bounds.bottom) - verticalOffset);
        m۱۵۷۲۲g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public float m۱۵۷۲۸b() {
        return this.f۱۲۴۱۸f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۲۶a(Rect into) {
        getPadding(into);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۷۳۱c(float size) {
        m۱۵۷۱۶a(size, this.f۱۲۴۲۰h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۷۲۹b(float size) {
        m۱۵۷۱۶a(this.f۱۲۴۲۲j, size);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public float m۱۵۷۳۴f() {
        return this.f۱۲۴۲۲j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public float m۱۵۷۳۰c() {
        return this.f۱۲۴۲۰h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public float m۱۵۷۳۳e() {
        float f = this.f۱۲۴۲۰h;
        return ((this.f۱۲۴۲۰h + ((float) this.f۱۲۴۱۳a)) * 2.0f) + (Math.max(f, this.f۱۲۴۱۸f + ((float) this.f۱۲۴۱۳a) + (f / 2.0f)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public float m۱۵۷۳۲d() {
        float f = this.f۱۲۴۲۰h;
        return (((this.f۱۲۴۲۰h * 1.5f) + ((float) this.f۱۲۴۱۳a)) * 2.0f) + (Math.max(f, this.f۱۲۴۱۸f + ((float) this.f۱۲۴۱۳a) + ((f * 1.5f) / 2.0f)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۲۵a(ColorStateList color) {
        m۱۵۷۱۹b(color);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public ColorStateList m۱۵۷۲۳a() {
        return this.f۱۲۴۲۳k;
    }
}
