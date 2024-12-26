package android.support.design.widget;

import a.b.h.d.a.c;
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
import android.support.v4.content.a;

public class r extends c {
    static final double s = Math.cos(Math.toRadians(45.0d));

    /* renamed from: d  reason: collision with root package name */
    final Paint f۱۰۰۴d;

    /* renamed from: e  reason: collision with root package name */
    final Paint f۱۰۰۵e;

    /* renamed from: f  reason: collision with root package name */
    final RectF f۱۰۰۶f;

    /* renamed from: g  reason: collision with root package name */
    float f۱۰۰۷g;

    /* renamed from: h  reason: collision with root package name */
    Path f۱۰۰۸h;
    float i;
    float j;
    float k;
    private boolean l = true;
    private final int m;
    private final int n;
    private final int o;
    private boolean p = true;
    private float q;
    private boolean r = false;

    public r(Context context, Drawable content, float radius, float shadowSize, float maxShadowSize) {
        super(content);
        this.m = a.a(context, a.b.c.c.design_fab_shadow_start_color);
        this.n = a.a(context, a.b.c.c.design_fab_shadow_mid_color);
        this.o = a.a(context, a.b.c.c.design_fab_shadow_end_color);
        this.f۱۰۰۴d = new Paint(5);
        this.f۱۰۰۴d.setStyle(Paint.Style.FILL);
        this.f۱۰۰۷g = (float) Math.round(radius);
        this.f۱۰۰۶f = new RectF();
        this.f۱۰۰۵e = new Paint(this.f۱۰۰۴d);
        this.f۱۰۰۵e.setAntiAlias(false);
        a(shadowSize, maxShadowSize);
    }

    private static int c(float value) {
        int i2 = Math.round(value);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    public void a(boolean addPaddingForCorners) {
        this.p = addPaddingForCorners;
        invalidateSelf();
    }

    @Override // a.b.h.d.a.c
    public void setAlpha(int alpha) {
        super.setAlpha(alpha);
        this.f۱۰۰۴d.setAlpha(alpha);
        this.f۱۰۰۵e.setAlpha(alpha);
    }

    /* access modifiers changed from: protected */
    @Override // a.b.h.d.a.c
    public void onBoundsChange(Rect bounds) {
        this.l = true;
    }

    public void a(float shadowSize, float maxShadowSize) {
        if (shadowSize < 0.0f || maxShadowSize < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float shadowSize2 = (float) c(shadowSize);
        float maxShadowSize2 = (float) c(maxShadowSize);
        if (shadowSize2 > maxShadowSize2) {
            shadowSize2 = maxShadowSize2;
            if (!this.r) {
                this.r = true;
            }
        }
        if (this.k != shadowSize2 || this.i != maxShadowSize2) {
            this.k = shadowSize2;
            this.i = maxShadowSize2;
            this.j = (float) Math.round(1.5f * shadowSize2);
            this.l = true;
            invalidateSelf();
        }
    }

    public void b(float size) {
        a(size, this.i);
    }

    public float b() {
        return this.k;
    }

    @Override // a.b.h.d.a.c
    public boolean getPadding(Rect padding) {
        int vOffset = (int) Math.ceil((double) b(this.i, this.f۱۰۰۷g, this.p));
        int hOffset = (int) Math.ceil((double) a(this.i, this.f۱۰۰۷g, this.p));
        padding.set(hOffset, vOffset, hOffset, vOffset);
        return true;
    }

    public static float b(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (!addPaddingForCorners) {
            return 1.5f * maxShadowSize;
        }
        double d2 = (double) (1.5f * maxShadowSize);
        double d3 = 1.0d - s;
        double d4 = (double) cornerRadius;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    public static float a(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (!addPaddingForCorners) {
            return maxShadowSize;
        }
        double d2 = (double) maxShadowSize;
        double d3 = 1.0d - s;
        double d4 = (double) cornerRadius;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    @Override // a.b.h.d.a.c
    public int getOpacity() {
        return -3;
    }

    @Override // a.b.h.d.a.c
    public void draw(Canvas canvas) {
        if (this.l) {
            a(getBounds());
            this.l = false;
        }
        a(canvas);
        super.draw(canvas);
    }

    public final void a(float rotation) {
        if (this.q != rotation) {
            this.q = rotation;
            invalidateSelf();
        }
    }

    private void a(Canvas canvas) {
        float shadowScaleHorizontal;
        float shadowScaleTop;
        float shadowOffsetHorizontal;
        int saved;
        float shadowScaleBottom;
        float shadowScaleHorizontal2;
        int rotateSaved = canvas.save();
        canvas.rotate(this.q, this.f۱۰۰۶f.centerX(), this.f۱۰۰۶f.centerY());
        float edgeShadowTop = (-this.f۱۰۰۷g) - this.j;
        float shadowOffset = this.f۱۰۰۷g;
        boolean drawVerticalEdges = true;
        boolean drawHorizontalEdges = this.f۱۰۰۶f.width() - (shadowOffset * 2.0f) > 0.0f;
        if (this.f۱۰۰۶f.height() - (shadowOffset * 2.0f) <= 0.0f) {
            drawVerticalEdges = false;
        }
        float f2 = this.k;
        float shadowScaleHorizontal3 = shadowOffset / (shadowOffset + (f2 - (0.5f * f2)));
        float shadowScaleTop2 = shadowOffset / (shadowOffset + (f2 - (0.25f * f2)));
        float shadowScaleBottom2 = shadowOffset / (shadowOffset + (f2 - (f2 * 1.0f)));
        int saved2 = canvas.save();
        RectF rectF = this.f۱۰۰۶f;
        canvas.translate(rectF.left + shadowOffset, rectF.top + shadowOffset);
        canvas.scale(shadowScaleHorizontal3, shadowScaleTop2);
        canvas.drawPath(this.f۱۰۰۸h, this.f۱۰۰۴d);
        if (drawHorizontalEdges) {
            canvas.scale(1.0f / shadowScaleHorizontal3, 1.0f);
            saved = saved2;
            shadowScaleBottom = shadowScaleBottom2;
            shadowScaleTop = shadowScaleTop2;
            shadowScaleHorizontal = shadowScaleHorizontal3;
            shadowOffsetHorizontal = 1.0f;
            canvas.drawRect(0.0f, edgeShadowTop, this.f۱۰۰۶f.width() - (shadowOffset * 2.0f), -this.f۱۰۰۷g, this.f۱۰۰۵e);
        } else {
            shadowScaleBottom = shadowScaleBottom2;
            shadowScaleTop = shadowScaleTop2;
            shadowScaleHorizontal = shadowScaleHorizontal3;
            shadowOffsetHorizontal = 1.0f;
            saved = saved2;
        }
        canvas.restoreToCount(saved);
        int saved3 = canvas.save();
        RectF rectF2 = this.f۱۰۰۶f;
        canvas.translate(rectF2.right - shadowOffset, rectF2.bottom - shadowOffset);
        canvas.scale(shadowScaleHorizontal, shadowScaleBottom);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f۱۰۰۸h, this.f۱۰۰۴d);
        if (drawHorizontalEdges) {
            canvas.scale(shadowOffsetHorizontal / shadowScaleHorizontal, shadowOffsetHorizontal);
            shadowScaleHorizontal2 = shadowScaleHorizontal;
            canvas.drawRect(0.0f, edgeShadowTop, this.f۱۰۰۶f.width() - (shadowOffset * 2.0f), (-this.f۱۰۰۷g) + this.j, this.f۱۰۰۵e);
        } else {
            shadowScaleHorizontal2 = shadowScaleHorizontal;
        }
        canvas.restoreToCount(saved3);
        int saved4 = canvas.save();
        RectF rectF3 = this.f۱۰۰۶f;
        canvas.translate(rectF3.left + shadowOffset, rectF3.bottom - shadowOffset);
        canvas.scale(shadowScaleHorizontal2, shadowScaleBottom);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f۱۰۰۸h, this.f۱۰۰۴d);
        if (drawVerticalEdges) {
            canvas.scale(1.0f / shadowScaleBottom, 1.0f);
            canvas.drawRect(0.0f, edgeShadowTop, this.f۱۰۰۶f.height() - (shadowOffset * 2.0f), -this.f۱۰۰۷g, this.f۱۰۰۵e);
        }
        canvas.restoreToCount(saved4);
        int saved5 = canvas.save();
        RectF rectF4 = this.f۱۰۰۶f;
        canvas.translate(rectF4.right - shadowOffset, rectF4.top + shadowOffset);
        canvas.scale(shadowScaleHorizontal2, shadowScaleTop);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f۱۰۰۸h, this.f۱۰۰۴d);
        if (drawVerticalEdges) {
            canvas.scale(1.0f / shadowScaleTop, 1.0f);
            canvas.drawRect(0.0f, edgeShadowTop, this.f۱۰۰۶f.height() - (2.0f * shadowOffset), -this.f۱۰۰۷g, this.f۱۰۰۵e);
        }
        canvas.restoreToCount(saved5);
        canvas.restoreToCount(rotateSaved);
    }

    private void c() {
        float f2 = this.f۱۰۰۷g;
        RectF innerBounds = new RectF(-f2, -f2, f2, f2);
        RectF outerBounds = new RectF(innerBounds);
        float f3 = this.j;
        outerBounds.inset(-f3, -f3);
        Path path = this.f۱۰۰۸h;
        if (path == null) {
            this.f۱۰۰۸h = new Path();
        } else {
            path.reset();
        }
        this.f۱۰۰۸h.setFillType(Path.FillType.EVEN_ODD);
        this.f۱۰۰۸h.moveTo(-this.f۱۰۰۷g, 0.0f);
        this.f۱۰۰۸h.rLineTo(-this.j, 0.0f);
        this.f۱۰۰۸h.arcTo(outerBounds, 180.0f, 90.0f, false);
        this.f۱۰۰۸h.arcTo(innerBounds, 270.0f, -90.0f, false);
        this.f۱۰۰۸h.close();
        float shadowRadius = -outerBounds.top;
        if (shadowRadius > 0.0f) {
            float startRatio = this.f۱۰۰۷g / shadowRadius;
            this.f۱۰۰۴d.setShader(new RadialGradient(0.0f, 0.0f, shadowRadius, new int[]{0, this.m, this.n, this.o}, new float[]{0.0f, startRatio, startRatio + ((1.0f - startRatio) / 2.0f), 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f۱۰۰۵e.setShader(new LinearGradient(0.0f, innerBounds.top, 0.0f, outerBounds.top, new int[]{this.m, this.n, this.o}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f۱۰۰۵e.setAntiAlias(false);
    }

    private void a(Rect bounds) {
        float f2 = this.i;
        float verticalOffset = 1.5f * f2;
        this.f۱۰۰۶f.set(((float) bounds.left) + f2, ((float) bounds.top) + verticalOffset, ((float) bounds.right) - f2, ((float) bounds.bottom) - verticalOffset);
        Drawable a2 = a();
        RectF rectF = this.f۱۰۰۶f;
        a2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        c();
    }
}
