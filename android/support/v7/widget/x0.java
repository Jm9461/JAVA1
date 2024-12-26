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

/* access modifiers changed from: package-private */
public class x0 extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f۲۲۹۶a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f۲۲۹۷b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f۲۲۹۸c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f۲۲۹۹d;

    /* renamed from: e  reason: collision with root package name */
    private float f۲۳۰۰e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f۲۳۰۱f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f۲۳۰۲g = true;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f۲۳۰۳h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    x0(ColorStateList backgroundColor, float radius) {
        this.f۲۲۹۶a = radius;
        this.f۲۲۹۷b = new Paint(5);
        b(backgroundColor);
        this.f۲۲۹۸c = new RectF();
        this.f۲۲۹۹d = new Rect();
    }

    private void b(ColorStateList color) {
        this.f۲۳۰۳h = color == null ? ColorStateList.valueOf(0) : color;
        this.f۲۲۹۷b.setColor(this.f۲۳۰۳h.getColorForState(getState(), this.f۲۳۰۳h.getDefaultColor()));
    }

    /* access modifiers changed from: package-private */
    public void a(float padding, boolean insetForPadding, boolean insetForRadius) {
        if (padding != this.f۲۳۰۰e || this.f۲۳۰۱f != insetForPadding || this.f۲۳۰۲g != insetForRadius) {
            this.f۲۳۰۰e = padding;
            this.f۲۳۰۱f = insetForPadding;
            this.f۲۳۰۲g = insetForRadius;
            a((Rect) null);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f۲۳۰۰e;
    }

    public void draw(Canvas canvas) {
        boolean clearColorFilter;
        Paint paint = this.f۲۲۹۷b;
        if (this.i == null || paint.getColorFilter() != null) {
            clearColorFilter = false;
        } else {
            paint.setColorFilter(this.i);
            clearColorFilter = true;
        }
        RectF rectF = this.f۲۲۹۸c;
        float f2 = this.f۲۲۹۶a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (clearColorFilter) {
            paint.setColorFilter(null);
        }
    }

    private void a(Rect bounds) {
        if (bounds == null) {
            bounds = getBounds();
        }
        this.f۲۲۹۸c.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        this.f۲۲۹۹d.set(bounds);
        if (this.f۲۳۰۱f) {
            float vInset = y0.b(this.f۲۳۰۰e, this.f۲۲۹۶a, this.f۲۳۰۲g);
            this.f۲۲۹۹d.inset((int) Math.ceil((double) y0.a(this.f۲۳۰۰e, this.f۲۲۹۶a, this.f۲۳۰۲g)), (int) Math.ceil((double) vInset));
            this.f۲۲۹۸c.set(this.f۲۲۹۹d);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        a(bounds);
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f۲۲۹۹d, this.f۲۲۹۶a);
    }

    /* access modifiers changed from: package-private */
    public void a(float radius) {
        if (radius != this.f۲۲۹۶a) {
            this.f۲۲۹۶a = radius;
            a((Rect) null);
            invalidateSelf();
        }
    }

    public void setAlpha(int alpha) {
        this.f۲۲۹۷b.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f۲۲۹۷b.setColorFilter(cf);
    }

    public int getOpacity() {
        return -3;
    }

    public float c() {
        return this.f۲۲۹۶a;
    }

    public void a(ColorStateList color) {
        b(color);
        invalidateSelf();
    }

    public ColorStateList a() {
        return this.f۲۳۰۳h;
    }

    public void setTintList(ColorStateList tint) {
        this.j = tint;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        this.k = tintMode;
        this.i = a(this.j, this.k);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] stateSet) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f۲۳۰۳h;
        int newColor = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        boolean colorChanged = newColor != this.f۲۲۹۷b.getColor();
        if (colorChanged) {
            this.f۲۲۹۷b.setColor(newColor);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return colorChanged;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f۲۳۰۳h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    private PorterDuffColorFilter a(ColorStateList tint, PorterDuff.Mode tintMode) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return new PorterDuffColorFilter(tint.getColorForState(getState(), 0), tintMode);
    }
}
