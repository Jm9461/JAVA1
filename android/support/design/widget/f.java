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

public class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final Paint f۹۳۲a = new Paint(1);

    /* renamed from: b  reason: collision with root package name */
    final Rect f۹۳۳b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    final RectF f۹۳۴c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    final b f۹۳۵d = new b();

    /* renamed from: e  reason: collision with root package name */
    float f۹۳۶e;

    /* renamed from: f  reason: collision with root package name */
    private int f۹۳۷f;

    /* renamed from: g  reason: collision with root package name */
    private int f۹۳۸g;

    /* renamed from: h  reason: collision with root package name */
    private int f۹۳۹h;
    private int i;
    private ColorStateList j;
    private int k;
    private boolean l = true;
    private float m;

    public f() {
        this.f۹۳۲a.setStyle(Paint.Style.STROKE);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f۹۳۵d;
    }

    public void a(int topOuterStrokeColor, int topInnerStrokeColor, int bottomOuterStrokeColor, int bottomInnerStrokeColor) {
        this.f۹۳۷f = topOuterStrokeColor;
        this.f۹۳۸g = topInnerStrokeColor;
        this.f۹۳۹h = bottomOuterStrokeColor;
        this.i = bottomInnerStrokeColor;
    }

    public void a(float width) {
        if (this.f۹۳۶e != width) {
            this.f۹۳۶e = width;
            this.f۹۳۲a.setStrokeWidth(1.3333f * width);
            this.l = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.l) {
            this.f۹۳۲a.setShader(a());
            this.l = false;
        }
        float halfBorderWidth = this.f۹۳۲a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f۹۳۴c;
        copyBounds(this.f۹۳۳b);
        rectF.set(this.f۹۳۳b);
        rectF.left += halfBorderWidth;
        rectF.top += halfBorderWidth;
        rectF.right -= halfBorderWidth;
        rectF.bottom -= halfBorderWidth;
        canvas.save();
        canvas.rotate(this.m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f۹۳۲a);
        canvas.restore();
    }

    public boolean getPadding(Rect padding) {
        int borderWidth = Math.round(this.f۹۳۶e);
        padding.set(borderWidth, borderWidth, borderWidth, borderWidth);
        return true;
    }

    public void setAlpha(int alpha) {
        this.f۹۳۲a.setAlpha(alpha);
        invalidateSelf();
    }

    public void a(ColorStateList tint) {
        if (tint != null) {
            this.k = tint.getColorForState(getState(), this.k);
        }
        this.j = tint;
        this.l = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f۹۳۲a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return this.f۹۳۶e > 0.0f ? -3 : -2;
    }

    public final void b(float rotation) {
        if (rotation != this.m) {
            this.m = rotation;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        this.l = true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.j;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        int newColor;
        ColorStateList colorStateList = this.j;
        if (!(colorStateList == null || (newColor = colorStateList.getColorForState(state, this.k)) == this.k)) {
            this.l = true;
            this.k = newColor;
        }
        if (this.l) {
            invalidateSelf();
        }
        return this.l;
    }

    private Shader a() {
        Rect rect = this.f۹۳۳b;
        copyBounds(rect);
        float borderRatio = this.f۹۳۶e / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{a.b.g.a.a.b(this.f۹۳۷f, this.k), a.b.g.a.a.b(this.f۹۳۸g, this.k), a.b.g.a.a.b(a.b.g.a.a.c(this.f۹۳۸g, 0), this.k), a.b.g.a.a.b(a.b.g.a.a.c(this.i, 0), this.k), a.b.g.a.a.b(this.i, this.k), a.b.g.a.a.b(this.f۹۳۹h, this.k)}, new float[]{0.0f, borderRatio, 0.5f, 0.5f, 1.0f - borderRatio, 1.0f}, Shader.TileMode.CLAMP);
    }

    private class b extends Drawable.ConstantState {
        private b() {
        }

        public Drawable newDrawable() {
            return f.this;
        }

        public int getChangingConfigurations() {
            return 0;
        }
    }
}
