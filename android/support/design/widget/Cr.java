package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.content.Ca;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc;

/* renamed from: android.support.design.widget.r  reason: invalid class name */
public class Cr extends Cc {

    /* renamed from: s  reason: contains not printable characters */
    static final double f۱۰۰۲۰s = Math.cos(Math.toRadians(45.0d));

    /* renamed from: d  reason: contains not printable characters */
    final Paint f۱۰۰۲۱d;

    /* renamed from: e  reason: contains not printable characters */
    final Paint f۱۰۰۲۲e;

    /* renamed from: f  reason: contains not printable characters */
    final RectF f۱۰۰۲۳f;

    /* renamed from: g  reason: contains not printable characters */
    float f۱۰۰۲۴g;

    /* renamed from: h  reason: contains not printable characters */
    Path f۱۰۰۲۵h;

    /* renamed from: i  reason: contains not printable characters */
    float f۱۰۰۲۶i;

    /* renamed from: j  reason: contains not printable characters */
    float f۱۰۰۲۷j;

    /* renamed from: k  reason: contains not printable characters */
    float f۱۰۰۲۸k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۰۰۲۹l = true;

    /* renamed from: m  reason: contains not printable characters */
    private final int f۱۰۰۳۰m;

    /* renamed from: n  reason: contains not printable characters */
    private final int f۱۰۰۳۱n;

    /* renamed from: o  reason: contains not printable characters */
    private final int f۱۰۰۳۲o;

    /* renamed from: p  reason: contains not printable characters */
    private boolean f۱۰۰۳۳p = true;

    /* renamed from: q  reason: contains not printable characters */
    private float f۱۰۰۳۴q;

    /* renamed from: r  reason: contains not printable characters */
    private boolean f۱۰۰۳۵r = false;

    public Cr(Context context, Drawable content, float radius, float shadowSize, float maxShadowSize) {
        super(content);
        this.f۱۰۰۳۰m = Ca.m۱۲۶۲۰a(context, p۰۰۰a.p۰۰۵b.p۰۰۸c.Cc.design_fab_shadow_start_color);
        this.f۱۰۰۳۱n = Ca.m۱۲۶۲۰a(context, p۰۰۰a.p۰۰۵b.p۰۰۸c.Cc.design_fab_shadow_mid_color);
        this.f۱۰۰۳۲o = Ca.m۱۲۶۲۰a(context, p۰۰۰a.p۰۰۵b.p۰۰۸c.Cc.design_fab_shadow_end_color);
        this.f۱۰۰۲۱d = new Paint(5);
        this.f۱۰۰۲۱d.setStyle(Paint.Style.FILL);
        this.f۱۰۰۲۴g = (float) Math.round(radius);
        this.f۱۰۰۲۳f = new RectF();
        this.f۱۰۰۲۲e = new Paint(this.f۱۰۰۲۱d);
        this.f۱۰۰۲۲e.setAntiAlias(false);
        m۱۲۰۰۹a(shadowSize, maxShadowSize);
    }

    /* renamed from: c  reason: contains not printable characters */
    private static int m۱۲۰۰۶c(float value) {
        int i = Math.round(value);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۱۰a(boolean addPaddingForCorners) {
        this.f۱۰۰۳۳p = addPaddingForCorners;
        invalidateSelf();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc
    public void setAlpha(int alpha) {
        super.setAlpha(alpha);
        this.f۱۰۰۲۱d.setAlpha(alpha);
        this.f۱۰۰۲۲e.setAlpha(alpha);
    }

    /* access modifiers changed from: protected */
    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc
    public void onBoundsChange(Rect bounds) {
        this.f۱۰۰۲۹l = true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۰۹a(float shadowSize, float maxShadowSize) {
        if (shadowSize < 0.0f || maxShadowSize < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float shadowSize2 = (float) m۱۲۰۰۶c(shadowSize);
        float maxShadowSize2 = (float) m۱۲۰۰۶c(maxShadowSize);
        if (shadowSize2 > maxShadowSize2) {
            shadowSize2 = maxShadowSize2;
            if (!this.f۱۰۰۳۵r) {
                this.f۱۰۰۳۵r = true;
            }
        }
        if (this.f۱۰۰۲۸k != shadowSize2 || this.f۱۰۰۲۶i != maxShadowSize2) {
            this.f۱۰۰۲۸k = shadowSize2;
            this.f۱۰۰۲۶i = maxShadowSize2;
            this.f۱۰۰۲۷j = (float) Math.round(1.5f * shadowSize2);
            this.f۱۰۰۲۹l = true;
            invalidateSelf();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۰۱۲b(float size) {
        m۱۲۰۰۹a(size, this.f۱۰۰۲۶i);
    }

    /* renamed from: b  reason: contains not printable characters */
    public float m۱۲۰۱۱b() {
        return this.f۱۰۰۲۸k;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc
    public boolean getPadding(Rect padding) {
        int vOffset = (int) Math.ceil((double) m۱۲۰۰۵b(this.f۱۰۰۲۶i, this.f۱۰۰۲۴g, this.f۱۰۰۳۳p));
        int hOffset = (int) Math.ceil((double) m۱۲۰۰۲a(this.f۱۰۰۲۶i, this.f۱۰۰۲۴g, this.f۱۰۰۳۳p));
        padding.set(hOffset, vOffset, hOffset, vOffset);
        return true;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static float m۱۲۰۰۵b(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (!addPaddingForCorners) {
            return 1.5f * maxShadowSize;
        }
        double d = (double) (1.5f * maxShadowSize);
        double d2 = 1.0d - f۱۰۰۲۰s;
        double d3 = (double) cornerRadius;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static float m۱۲۰۰۲a(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (!addPaddingForCorners) {
            return maxShadowSize;
        }
        double d = (double) maxShadowSize;
        double d2 = 1.0d - f۱۰۰۲۰s;
        double d3 = (double) cornerRadius;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) (d + (d2 * d3));
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc
    public int getOpacity() {
        return -3;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cc
    public void draw(Canvas canvas) {
        if (this.f۱۰۰۲۹l) {
            m۱۲۰۰۴a(getBounds());
            this.f۱۰۰۲۹l = false;
        }
        m۱۲۰۰۳a(canvas);
        super.draw(canvas);
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۲۰۰۸a(float rotation) {
        if (this.f۱۰۰۳۴q != rotation) {
            this.f۱۰۰۳۴q = rotation;
            invalidateSelf();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۰۰۳a(Canvas canvas) {
        float shadowScaleHorizontal;
        float shadowScaleTop;
        float shadowOffsetHorizontal;
        int saved;
        float shadowScaleBottom;
        float shadowScaleHorizontal2;
        int rotateSaved = canvas.save();
        canvas.rotate(this.f۱۰۰۳۴q, this.f۱۰۰۲۳f.centerX(), this.f۱۰۰۲۳f.centerY());
        float edgeShadowTop = (-this.f۱۰۰۲۴g) - this.f۱۰۰۲۷j;
        float shadowOffset = this.f۱۰۰۲۴g;
        boolean drawVerticalEdges = true;
        boolean drawHorizontalEdges = this.f۱۰۰۲۳f.width() - (shadowOffset * 2.0f) > 0.0f;
        if (this.f۱۰۰۲۳f.height() - (shadowOffset * 2.0f) <= 0.0f) {
            drawVerticalEdges = false;
        }
        float f = this.f۱۰۰۲۸k;
        float shadowScaleHorizontal3 = shadowOffset / (shadowOffset + (f - (0.5f * f)));
        float shadowScaleTop2 = shadowOffset / (shadowOffset + (f - (0.25f * f)));
        float shadowScaleBottom2 = shadowOffset / (shadowOffset + (f - (f * 1.0f)));
        int saved2 = canvas.save();
        RectF rectF = this.f۱۰۰۲۳f;
        canvas.translate(rectF.left + shadowOffset, rectF.top + shadowOffset);
        canvas.scale(shadowScaleHorizontal3, shadowScaleTop2);
        canvas.drawPath(this.f۱۰۰۲۵h, this.f۱۰۰۲۱d);
        if (drawHorizontalEdges) {
            canvas.scale(1.0f / shadowScaleHorizontal3, 1.0f);
            saved = saved2;
            shadowScaleBottom = shadowScaleBottom2;
            shadowScaleTop = shadowScaleTop2;
            shadowScaleHorizontal = shadowScaleHorizontal3;
            shadowOffsetHorizontal = 1.0f;
            canvas.drawRect(0.0f, edgeShadowTop, this.f۱۰۰۲۳f.width() - (shadowOffset * 2.0f), -this.f۱۰۰۲۴g, this.f۱۰۰۲۲e);
        } else {
            shadowScaleBottom = shadowScaleBottom2;
            shadowScaleTop = shadowScaleTop2;
            shadowScaleHorizontal = shadowScaleHorizontal3;
            shadowOffsetHorizontal = 1.0f;
            saved = saved2;
        }
        canvas.restoreToCount(saved);
        int saved3 = canvas.save();
        RectF rectF2 = this.f۱۰۰۲۳f;
        canvas.translate(rectF2.right - shadowOffset, rectF2.bottom - shadowOffset);
        canvas.scale(shadowScaleHorizontal, shadowScaleBottom);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f۱۰۰۲۵h, this.f۱۰۰۲۱d);
        if (drawHorizontalEdges) {
            canvas.scale(shadowOffsetHorizontal / shadowScaleHorizontal, shadowOffsetHorizontal);
            shadowScaleHorizontal2 = shadowScaleHorizontal;
            canvas.drawRect(0.0f, edgeShadowTop, this.f۱۰۰۲۳f.width() - (shadowOffset * 2.0f), (-this.f۱۰۰۲۴g) + this.f۱۰۰۲۷j, this.f۱۰۰۲۲e);
        } else {
            shadowScaleHorizontal2 = shadowScaleHorizontal;
        }
        canvas.restoreToCount(saved3);
        int saved4 = canvas.save();
        RectF rectF3 = this.f۱۰۰۲۳f;
        canvas.translate(rectF3.left + shadowOffset, rectF3.bottom - shadowOffset);
        canvas.scale(shadowScaleHorizontal2, shadowScaleBottom);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f۱۰۰۲۵h, this.f۱۰۰۲۱d);
        if (drawVerticalEdges) {
            canvas.scale(1.0f / shadowScaleBottom, 1.0f);
            canvas.drawRect(0.0f, edgeShadowTop, this.f۱۰۰۲۳f.height() - (shadowOffset * 2.0f), -this.f۱۰۰۲۴g, this.f۱۰۰۲۲e);
        }
        canvas.restoreToCount(saved4);
        int saved5 = canvas.save();
        RectF rectF4 = this.f۱۰۰۲۳f;
        canvas.translate(rectF4.right - shadowOffset, rectF4.top + shadowOffset);
        canvas.scale(shadowScaleHorizontal2, shadowScaleTop);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f۱۰۰۲۵h, this.f۱۰۰۲۱d);
        if (drawVerticalEdges) {
            canvas.scale(1.0f / shadowScaleTop, 1.0f);
            canvas.drawRect(0.0f, edgeShadowTop, this.f۱۰۰۲۳f.height() - (2.0f * shadowOffset), -this.f۱۰۰۲۴g, this.f۱۰۰۲۲e);
        }
        canvas.restoreToCount(saved5);
        canvas.restoreToCount(rotateSaved);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۲۰۰۷c() {
        float f = this.f۱۰۰۲۴g;
        RectF innerBounds = new RectF(-f, -f, f, f);
        RectF outerBounds = new RectF(innerBounds);
        float f2 = this.f۱۰۰۲۷j;
        outerBounds.inset(-f2, -f2);
        Path path = this.f۱۰۰۲۵h;
        if (path == null) {
            this.f۱۰۰۲۵h = new Path();
        } else {
            path.reset();
        }
        this.f۱۰۰۲۵h.setFillType(Path.FillType.EVEN_ODD);
        this.f۱۰۰۲۵h.moveTo(-this.f۱۰۰۲۴g, 0.0f);
        this.f۱۰۰۲۵h.rLineTo(-this.f۱۰۰۲۷j, 0.0f);
        this.f۱۰۰۲۵h.arcTo(outerBounds, 180.0f, 90.0f, false);
        this.f۱۰۰۲۵h.arcTo(innerBounds, 270.0f, -90.0f, false);
        this.f۱۰۰۲۵h.close();
        float shadowRadius = -outerBounds.top;
        if (shadowRadius > 0.0f) {
            float startRatio = this.f۱۰۰۲۴g / shadowRadius;
            this.f۱۰۰۲۱d.setShader(new RadialGradient(0.0f, 0.0f, shadowRadius, new int[]{0, this.f۱۰۰۳۰m, this.f۱۰۰۳۱n, this.f۱۰۰۳۲o}, new float[]{0.0f, startRatio, startRatio + ((1.0f - startRatio) / 2.0f), 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f۱۰۰۲۲e.setShader(new LinearGradient(0.0f, innerBounds.top, 0.0f, outerBounds.top, new int[]{this.f۱۰۰۳۰m, this.f۱۰۰۳۱n, this.f۱۰۰۳۲o}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f۱۰۰۲۲e.setAntiAlias(false);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۰۰۴a(Rect bounds) {
        float f = this.f۱۰۰۲۶i;
        float verticalOffset = 1.5f * f;
        this.f۱۰۰۲۳f.set(((float) bounds.left) + f, ((float) bounds.top) + verticalOffset, ((float) bounds.right) - f, ((float) bounds.bottom) - verticalOffset);
        Drawable a = m۱۰۷۴۷a();
        RectF rectF = this.f۱۰۰۲۳f;
        a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        m۱۲۰۰۷c();
    }
}
