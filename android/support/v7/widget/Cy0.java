package android.support.v7.widget;

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
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۳b.Cb;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۳b.Cc;

/* renamed from: android.support.v7.widget.y0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cy0 extends Drawable {

    /* renamed from: q, reason: contains not printable characters */
    private static final double f۱۲۴۱۱q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r, reason: contains not printable characters */
    static a f۱۲۴۱۲r;

    /* renamed from: a, reason: contains not printable characters */
    private final int f۱۲۴۱۳a;

    /* renamed from: c, reason: contains not printable characters */
    private Paint f۱۲۴۱۵c;

    /* renamed from: d, reason: contains not printable characters */
    private Paint f۱۲۴۱۶d;

    /* renamed from: e, reason: contains not printable characters */
    private final RectF f۱۲۴۱۷e;

    /* renamed from: f, reason: contains not printable characters */
    private float f۱۲۴۱۸f;

    /* renamed from: g, reason: contains not printable characters */
    private Path f۱۲۴۱۹g;

    /* renamed from: h, reason: contains not printable characters */
    private float f۱۲۴۲۰h;

    /* renamed from: i, reason: contains not printable characters */
    private float f۱۲۴۲۱i;

    /* renamed from: j, reason: contains not printable characters */
    private float f۱۲۴۲۲j;

    /* renamed from: k, reason: contains not printable characters */
    private ColorStateList f۱۲۴۲۳k;

    /* renamed from: m, reason: contains not printable characters */
    private final int f۱۲۴۲۵m;

    /* renamed from: n, reason: contains not printable characters */
    private final int f۱۲۴۲۶n;

    /* renamed from: l, reason: contains not printable characters */
    private boolean f۱۲۴۲۴l = true;

    /* renamed from: o, reason: contains not printable characters */
    private boolean f۱۲۴۲۷o = true;

    /* renamed from: p, reason: contains not printable characters */
    private boolean f۱۲۴۲۸p = false;

    /* renamed from: b, reason: contains not printable characters */
    private Paint f۱۲۴۱۴b = new Paint(5);

    /* renamed from: android.support.v7.widget.y0$a */
    interface a {
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۳۶۶۵a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    Cy0(Resources resources, ColorStateList backgroundColor, float radius, float shadowSize, float maxShadowSize) {
        this.f۱۲۴۲۵m = resources.getColor(Cb.cardview_shadow_start_color);
        this.f۱۲۴۲۶n = resources.getColor(Cb.cardview_shadow_end_color);
        this.f۱۲۴۱۳a = resources.getDimensionPixelSize(Cc.cardview_compat_inset_shadow);
        m۱۳۶۴۹b(backgroundColor);
        this.f۱۲۴۱۵c = new Paint(5);
        this.f۱۲۴۱۵c.setStyle(Paint.Style.FILL);
        this.f۱۲۴۱۸f = (int) (0.5f + radius);
        this.f۱۲۴۱۷e = new RectF();
        this.f۱۲۴۱۶d = new Paint(this.f۱۲۴۱۵c);
        this.f۱۲۴۱۶d.setAntiAlias(false);
        m۱۳۶۴۶a(shadowSize, maxShadowSize);
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۳۶۴۹b(ColorStateList color) {
        this.f۱۲۴۲۳k = color == null ? ColorStateList.valueOf(0) : color;
        this.f۱۲۴۱۴b.setColor(this.f۱۲۴۲۳k.getColorForState(getState(), this.f۱۲۴۲۳k.getDefaultColor()));
    }

    /* renamed from: d, reason: contains not printable characters */
    private int m۱۳۶۵۱d(float value) {
        int i = (int) (0.5f + value);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۶۵۷a(boolean addPaddingForCorners) {
        this.f۱۲۴۲۷o = addPaddingForCorners;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f۱۲۴۱۴b.setAlpha(alpha);
        this.f۱۲۴۱۵c.setAlpha(alpha);
        this.f۱۲۴۱۶d.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.f۱۲۴۲۴l = true;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۶۴۶a(float shadowSize, float maxShadowSize) {
        if (shadowSize < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + shadowSize + ". Must be >= 0");
        }
        if (maxShadowSize < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + maxShadowSize + ". Must be >= 0");
        }
        float shadowSize2 = m۱۳۶۵۱d(shadowSize);
        float maxShadowSize2 = m۱۳۶۵۱d(maxShadowSize);
        if (shadowSize2 > maxShadowSize2) {
            shadowSize2 = maxShadowSize2;
            if (!this.f۱۲۴۲۸p) {
                this.f۱۲۴۲۸p = true;
            }
        }
        if (this.f۱۲۴۲۲j == shadowSize2 && this.f۱۲۴۲۰h == maxShadowSize2) {
            return;
        }
        this.f۱۲۴۲۲j = shadowSize2;
        this.f۱۲۴۲۰h = maxShadowSize2;
        this.f۱۲۴۲۱i = (int) ((1.5f * shadowSize2) + this.f۱۲۴۱۳a + 0.5f);
        this.f۱۲۴۲۴l = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        int vOffset = (int) Math.ceil(m۱۳۶۴۸b(this.f۱۲۴۲۰h, this.f۱۲۴۱۸f, this.f۱۲۴۲۷o));
        int hOffset = (int) Math.ceil(m۱۳۶۴۵a(this.f۱۲۴۲۰h, this.f۱۲۴۱۸f, this.f۱۲۴۲۷o));
        padding.set(hOffset, vOffset, hOffset, vOffset);
        return true;
    }

    /* renamed from: b, reason: contains not printable characters */
    static float m۱۳۶۴۸b(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (addPaddingForCorners) {
            double d2 = 1.5f * maxShadowSize;
            double d3 = 1.0d - f۱۲۴۱۱q;
            double d4 = cornerRadius;
            Double.isNaN(d4);
            Double.isNaN(d2);
            return (float) (d2 + (d3 * d4));
        }
        return 1.5f * maxShadowSize;
    }

    /* renamed from: a, reason: contains not printable characters */
    static float m۱۳۶۴۵a(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (addPaddingForCorners) {
            double d2 = maxShadowSize;
            double d3 = 1.0d - f۱۲۴۱۱q;
            double d4 = cornerRadius;
            Double.isNaN(d4);
            Double.isNaN(d2);
            return (float) (d2 + (d3 * d4));
        }
        return maxShadowSize;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] stateSet) {
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

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f۱۲۴۲۳k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
        this.f۱۲۴۱۴b.setColorFilter(cf);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۶۵۴a(float radius) {
        if (radius < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + radius + ". Must be >= 0");
        }
        float radius2 = (int) (0.5f + radius);
        if (this.f۱۲۴۱۸f == radius2) {
            return;
        }
        this.f۱۲۴۱۸f = radius2;
        this.f۱۲۴۲۴l = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f۱۲۴۲۴l) {
            m۱۳۶۵۰b(getBounds());
            this.f۱۲۴۲۴l = false;
        }
        canvas.translate(0.0f, this.f۱۲۴۲۲j / 2.0f);
        m۱۳۶۴۷a(canvas);
        canvas.translate(0.0f, (-this.f۱۲۴۲۲j) / 2.0f);
        f۱۲۴۱۲r.mo۱۳۶۶۵a(canvas, this.f۱۲۴۱۷e, this.f۱۲۴۱۸f, this.f۱۲۴۱۴b);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۳۶۴۷a(Canvas canvas) {
        float f2 = this.f۱۲۴۱۸f;
        float edgeShadowTop = (-f2) - this.f۱۲۴۲۱i;
        float inset = f2 + this.f۱۲۴۱۳a + (this.f۱۲۴۲۲j / 2.0f);
        boolean drawHorizontalEdges = this.f۱۲۴۱۷e.width() - (inset * 2.0f) > 0.0f;
        boolean drawVerticalEdges = this.f۱۲۴۱۷e.height() - (inset * 2.0f) > 0.0f;
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

    /* renamed from: g, reason: contains not printable characters */
    private void m۱۳۶۵۲g() {
        float f2 = this.f۱۲۴۱۸f;
        RectF innerBounds = new RectF(-f2, -f2, f2, f2);
        RectF outerBounds = new RectF(innerBounds);
        float f3 = this.f۱۲۴۲۱i;
        outerBounds.inset(-f3, -f3);
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
        float f4 = this.f۱۲۴۱۸f;
        float f5 = this.f۱۲۴۲۱i;
        float startRatio = f4 / (f4 + f5);
        Paint paint = this.f۱۲۴۱۵c;
        float f6 = f4 + f5;
        int i = this.f۱۲۴۲۵m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i, i, this.f۱۲۴۲۶n}, new float[]{0.0f, startRatio, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f۱۲۴۱۶d;
        float f7 = this.f۱۲۴۱۸f;
        float f8 = this.f۱۲۴۲۱i;
        float f9 = (-f7) + f8;
        float f10 = (-f7) - f8;
        int i2 = this.f۱۲۴۲۵m;
        paint2.setShader(new LinearGradient(0.0f, f9, 0.0f, f10, new int[]{i2, i2, this.f۱۲۴۲۶n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f۱۲۴۱۶d.setAntiAlias(false);
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۳۶۵۰b(Rect bounds) {
        float f2 = this.f۱۲۴۲۰h;
        float verticalOffset = 1.5f * f2;
        this.f۱۲۴۱۷e.set(bounds.left + f2, bounds.top + verticalOffset, bounds.right - f2, bounds.bottom - verticalOffset);
        m۱۳۶۵۲g();
    }

    /* renamed from: b, reason: contains not printable characters */
    float m۱۳۶۵۸b() {
        return this.f۱۲۴۱۸f;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۶۵۶a(Rect into) {
        getPadding(into);
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۳۶۶۱c(float size) {
        m۱۳۶۴۶a(size, this.f۱۲۴۲۰h);
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۳۶۵۹b(float size) {
        m۱۳۶۴۶a(this.f۱۲۴۲۲j, size);
    }

    /* renamed from: f, reason: contains not printable characters */
    float m۱۳۶۶۴f() {
        return this.f۱۲۴۲۲j;
    }

    /* renamed from: c, reason: contains not printable characters */
    float m۱۳۶۶۰c() {
        return this.f۱۲۴۲۰h;
    }

    /* renamed from: e, reason: contains not printable characters */
    float m۱۳۶۶۳e() {
        float f2 = this.f۱۲۴۲۰h;
        float content = Math.max(f2, this.f۱۲۴۱۸f + this.f۱۲۴۱۳a + (f2 / 2.0f)) * 2.0f;
        return ((this.f۱۲۴۲۰h + this.f۱۲۴۱۳a) * 2.0f) + content;
    }

    /* renamed from: d, reason: contains not printable characters */
    float m۱۳۶۶۲d() {
        float f2 = this.f۱۲۴۲۰h;
        float content = Math.max(f2, this.f۱۲۴۱۸f + this.f۱۲۴۱۳a + ((f2 * 1.5f) / 2.0f)) * 2.0f;
        return (((this.f۱۲۴۲۰h * 1.5f) + this.f۱۲۴۱۳a) * 2.0f) + content;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۶۵۵a(ColorStateList color) {
        m۱۳۶۴۹b(color);
        invalidateSelf();
    }

    /* renamed from: a, reason: contains not printable characters */
    ColorStateList m۱۳۶۵۳a() {
        return this.f۱۲۴۲۳k;
    }
}
