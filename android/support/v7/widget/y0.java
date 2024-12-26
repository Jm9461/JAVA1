package android.support.v7.widget;

import a.b.h.b.b;
import a.b.h.b.c;
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

/* access modifiers changed from: package-private */
public class y0 extends Drawable {
    private static final double q = Math.cos(Math.toRadians(45.0d));
    static a r;

    /* renamed from: a  reason: collision with root package name */
    private final int f۲۳۰۴a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f۲۳۰۵b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f۲۳۰۶c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f۲۳۰۷d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f۲۳۰۸e;

    /* renamed from: f  reason: collision with root package name */
    private float f۲۳۰۹f;

    /* renamed from: g  reason: collision with root package name */
    private Path f۲۳۱۰g;

    /* renamed from: h  reason: collision with root package name */
    private float f۲۳۱۱h;
    private float i;
    private float j;
    private ColorStateList k;
    private boolean l = true;
    private final int m;
    private final int n;
    private boolean o = true;
    private boolean p = false;

    interface a {
        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    y0(Resources resources, ColorStateList backgroundColor, float radius, float shadowSize, float maxShadowSize) {
        this.m = resources.getColor(b.cardview_shadow_start_color);
        this.n = resources.getColor(b.cardview_shadow_end_color);
        this.f۲۳۰۴a = resources.getDimensionPixelSize(c.cardview_compat_inset_shadow);
        this.f۲۳۰۵b = new Paint(5);
        b(backgroundColor);
        this.f۲۳۰۶c = new Paint(5);
        this.f۲۳۰۶c.setStyle(Paint.Style.FILL);
        this.f۲۳۰۹f = (float) ((int) (0.5f + radius));
        this.f۲۳۰۸e = new RectF();
        this.f۲۳۰۷d = new Paint(this.f۲۳۰۶c);
        this.f۲۳۰۷d.setAntiAlias(false);
        a(shadowSize, maxShadowSize);
    }

    private void b(ColorStateList color) {
        this.k = color == null ? ColorStateList.valueOf(0) : color;
        this.f۲۳۰۵b.setColor(this.k.getColorForState(getState(), this.k.getDefaultColor()));
    }

    private int d(float value) {
        int i2 = (int) (0.5f + value);
        if (i2 % 2 == 1) {
            return i2 - 1;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean addPaddingForCorners) {
        this.o = addPaddingForCorners;
        invalidateSelf();
    }

    public void setAlpha(int alpha) {
        this.f۲۳۰۵b.setAlpha(alpha);
        this.f۲۳۰۶c.setAlpha(alpha);
        this.f۲۳۰۷d.setAlpha(alpha);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.l = true;
    }

    private void a(float shadowSize, float maxShadowSize) {
        if (shadowSize < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + shadowSize + ". Must be >= 0");
        } else if (maxShadowSize >= 0.0f) {
            float shadowSize2 = (float) d(shadowSize);
            float maxShadowSize2 = (float) d(maxShadowSize);
            if (shadowSize2 > maxShadowSize2) {
                shadowSize2 = maxShadowSize2;
                if (!this.p) {
                    this.p = true;
                }
            }
            if (this.j != shadowSize2 || this.f۲۳۱۱h != maxShadowSize2) {
                this.j = shadowSize2;
                this.f۲۳۱۱h = maxShadowSize2;
                this.i = (float) ((int) ((1.5f * shadowSize2) + ((float) this.f۲۳۰۴a) + 0.5f));
                this.l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + maxShadowSize + ". Must be >= 0");
        }
    }

    public boolean getPadding(Rect padding) {
        int vOffset = (int) Math.ceil((double) b(this.f۲۳۱۱h, this.f۲۳۰۹f, this.o));
        int hOffset = (int) Math.ceil((double) a(this.f۲۳۱۱h, this.f۲۳۰۹f, this.o));
        padding.set(hOffset, vOffset, hOffset, vOffset);
        return true;
    }

    static float b(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (!addPaddingForCorners) {
            return 1.5f * maxShadowSize;
        }
        double d2 = (double) (1.5f * maxShadowSize);
        double d3 = 1.0d - q;
        double d4 = (double) cornerRadius;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    static float a(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (!addPaddingForCorners) {
            return maxShadowSize;
        }
        double d2 = (double) maxShadowSize;
        double d3 = 1.0d - q;
        double d4 = (double) cornerRadius;
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (float) (d2 + (d3 * d4));
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] stateSet) {
        ColorStateList colorStateList = this.k;
        int newColor = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        if (this.f۲۳۰۵b.getColor() == newColor) {
            return false;
        }
        this.f۲۳۰۵b.setColor(newColor);
        this.l = true;
        invalidateSelf();
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void setColorFilter(ColorFilter cf) {
        this.f۲۳۰۵b.setColorFilter(cf);
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: package-private */
    public void a(float radius) {
        if (radius >= 0.0f) {
            float radius2 = (float) ((int) (0.5f + radius));
            if (this.f۲۳۰۹f != radius2) {
                this.f۲۳۰۹f = radius2;
                this.l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + radius + ". Must be >= 0");
    }

    public void draw(Canvas canvas) {
        if (this.l) {
            b(getBounds());
            this.l = false;
        }
        canvas.translate(0.0f, this.j / 2.0f);
        a(canvas);
        canvas.translate(0.0f, (-this.j) / 2.0f);
        r.a(canvas, this.f۲۳۰۸e, this.f۲۳۰۹f, this.f۲۳۰۵b);
    }

    private void a(Canvas canvas) {
        float f2 = this.f۲۳۰۹f;
        float edgeShadowTop = (-f2) - this.i;
        float inset = f2 + ((float) this.f۲۳۰۴a) + (this.j / 2.0f);
        boolean drawVerticalEdges = true;
        boolean drawHorizontalEdges = this.f۲۳۰۸e.width() - (inset * 2.0f) > 0.0f;
        if (this.f۲۳۰۸e.height() - (inset * 2.0f) <= 0.0f) {
            drawVerticalEdges = false;
        }
        int saved = canvas.save();
        RectF rectF = this.f۲۳۰۸e;
        canvas.translate(rectF.left + inset, rectF.top + inset);
        canvas.drawPath(this.f۲۳۱۰g, this.f۲۳۰۶c);
        if (drawHorizontalEdges) {
            canvas.drawRect(0.0f, edgeShadowTop, this.f۲۳۰۸e.width() - (inset * 2.0f), -this.f۲۳۰۹f, this.f۲۳۰۷d);
        }
        canvas.restoreToCount(saved);
        int saved2 = canvas.save();
        RectF rectF2 = this.f۲۳۰۸e;
        canvas.translate(rectF2.right - inset, rectF2.bottom - inset);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f۲۳۱۰g, this.f۲۳۰۶c);
        if (drawHorizontalEdges) {
            canvas.drawRect(0.0f, edgeShadowTop, this.f۲۳۰۸e.width() - (inset * 2.0f), (-this.f۲۳۰۹f) + this.i, this.f۲۳۰۷d);
        }
        canvas.restoreToCount(saved2);
        int saved3 = canvas.save();
        RectF rectF3 = this.f۲۳۰۸e;
        canvas.translate(rectF3.left + inset, rectF3.bottom - inset);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f۲۳۱۰g, this.f۲۳۰۶c);
        if (drawVerticalEdges) {
            canvas.drawRect(0.0f, edgeShadowTop, this.f۲۳۰۸e.height() - (inset * 2.0f), -this.f۲۳۰۹f, this.f۲۳۰۷d);
        }
        canvas.restoreToCount(saved3);
        int saved4 = canvas.save();
        RectF rectF4 = this.f۲۳۰۸e;
        canvas.translate(rectF4.right - inset, rectF4.top + inset);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f۲۳۱۰g, this.f۲۳۰۶c);
        if (drawVerticalEdges) {
            canvas.drawRect(0.0f, edgeShadowTop, this.f۲۳۰۸e.height() - (2.0f * inset), -this.f۲۳۰۹f, this.f۲۳۰۷d);
        }
        canvas.restoreToCount(saved4);
    }

    private void g() {
        float f2 = this.f۲۳۰۹f;
        RectF innerBounds = new RectF(-f2, -f2, f2, f2);
        RectF outerBounds = new RectF(innerBounds);
        float f3 = this.i;
        outerBounds.inset(-f3, -f3);
        Path path = this.f۲۳۱۰g;
        if (path == null) {
            this.f۲۳۱۰g = new Path();
        } else {
            path.reset();
        }
        this.f۲۳۱۰g.setFillType(Path.FillType.EVEN_ODD);
        this.f۲۳۱۰g.moveTo(-this.f۲۳۰۹f, 0.0f);
        this.f۲۳۱۰g.rLineTo(-this.i, 0.0f);
        this.f۲۳۱۰g.arcTo(outerBounds, 180.0f, 90.0f, false);
        this.f۲۳۱۰g.arcTo(innerBounds, 270.0f, -90.0f, false);
        this.f۲۳۱۰g.close();
        float f4 = this.f۲۳۰۹f;
        float f5 = this.i;
        Paint paint = this.f۲۳۰۶c;
        float f6 = f4 + f5;
        int i2 = this.m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.n}, new float[]{0.0f, f4 / (f4 + f5), 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f۲۳۰۷d;
        float f7 = this.f۲۳۰۹f;
        float f8 = this.i;
        float f9 = (-f7) - f8;
        int i3 = this.m;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, f9, new int[]{i3, i3, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f۲۳۰۷d.setAntiAlias(false);
    }

    private void b(Rect bounds) {
        float f2 = this.f۲۳۱۱h;
        float verticalOffset = 1.5f * f2;
        this.f۲۳۰۸e.set(((float) bounds.left) + f2, ((float) bounds.top) + verticalOffset, ((float) bounds.right) - f2, ((float) bounds.bottom) - verticalOffset);
        g();
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f۲۳۰۹f;
    }

    /* access modifiers changed from: package-private */
    public void a(Rect into) {
        getPadding(into);
    }

    /* access modifiers changed from: package-private */
    public void c(float size) {
        a(size, this.f۲۳۱۱h);
    }

    /* access modifiers changed from: package-private */
    public void b(float size) {
        a(this.j, size);
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f۲۳۱۱h;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        float f2 = this.f۲۳۱۱h;
        return ((this.f۲۳۱۱h + ((float) this.f۲۳۰۴a)) * 2.0f) + (Math.max(f2, this.f۲۳۰۹f + ((float) this.f۲۳۰۴a) + (f2 / 2.0f)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public float d() {
        float f2 = this.f۲۳۱۱h;
        return (((this.f۲۳۱۱h * 1.5f) + ((float) this.f۲۳۰۴a)) * 2.0f) + (Math.max(f2, this.f۲۳۰۹f + ((float) this.f۲۳۰۴a) + ((f2 * 1.5f) / 2.0f)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList color) {
        b(color);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList a() {
        return this.k;
    }
}
