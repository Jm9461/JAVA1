package a.b.c.m;

import a.b.c.k;
import a.b.c.p.a;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.design.internal.h;
import android.support.v4.view.u;

/* access modifiers changed from: package-private */
public class c {
    private static final boolean w = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a  reason: collision with root package name */
    private final a f۴۸a;

    /* renamed from: b  reason: collision with root package name */
    private int f۴۹b;

    /* renamed from: c  reason: collision with root package name */
    private int f۵۰c;

    /* renamed from: d  reason: collision with root package name */
    private int f۵۱d;

    /* renamed from: e  reason: collision with root package name */
    private int f۵۲e;

    /* renamed from: f  reason: collision with root package name */
    private int f۵۳f;

    /* renamed from: g  reason: collision with root package name */
    private int f۵۴g;

    /* renamed from: h  reason: collision with root package name */
    private PorterDuff.Mode f۵۵h;
    private ColorStateList i;
    private ColorStateList j;
    private ColorStateList k;
    private final Paint l = new Paint(1);
    private final Rect m = new Rect();
    private final RectF n = new RectF();
    private GradientDrawable o;
    private Drawable p;
    private GradientDrawable q;
    private Drawable r;
    private GradientDrawable s;
    private GradientDrawable t;
    private GradientDrawable u;
    private boolean v = false;

    public c(a button) {
        this.f۴۸a = button;
    }

    public void a(TypedArray attributes) {
        int i2 = 0;
        this.f۴۹b = attributes.getDimensionPixelOffset(k.MaterialButton_android_insetLeft, 0);
        this.f۵۰c = attributes.getDimensionPixelOffset(k.MaterialButton_android_insetRight, 0);
        this.f۵۱d = attributes.getDimensionPixelOffset(k.MaterialButton_android_insetTop, 0);
        this.f۵۲e = attributes.getDimensionPixelOffset(k.MaterialButton_android_insetBottom, 0);
        this.f۵۳f = attributes.getDimensionPixelSize(k.MaterialButton_cornerRadius, 0);
        this.f۵۴g = attributes.getDimensionPixelSize(k.MaterialButton_strokeWidth, 0);
        this.f۵۵h = h.a(attributes.getInt(k.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.i = a.a(this.f۴۸a.getContext(), attributes, k.MaterialButton_backgroundTint);
        this.j = a.a(this.f۴۸a.getContext(), attributes, k.MaterialButton_strokeColor);
        this.k = a.a(this.f۴۸a.getContext(), attributes, k.MaterialButton_rippleColor);
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setStrokeWidth((float) this.f۵۴g);
        Paint paint = this.l;
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(this.f۴۸a.getDrawableState(), 0);
        }
        paint.setColor(i2);
        int paddingStart = u.o(this.f۴۸a);
        int paddingTop = this.f۴۸a.getPaddingTop();
        int paddingEnd = u.n(this.f۴۸a);
        int paddingBottom = this.f۴۸a.getPaddingBottom();
        this.f۴۸a.setInternalBackground(w ? j() : i());
        u.a(this.f۴۸a, this.f۴۹b + paddingStart, this.f۵۱d + paddingTop, this.f۵۰c + paddingEnd, this.f۵۲e + paddingBottom);
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.v = true;
        this.f۴۸a.setSupportBackgroundTintList(this.i);
        this.f۴۸a.setSupportBackgroundTintMode(this.f۵۵h);
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        if (canvas != null && this.j != null && this.f۵۴g > 0) {
            this.m.set(this.f۴۸a.getBackground().getBounds());
            RectF rectF = this.n;
            Rect rect = this.m;
            int i2 = this.f۵۴g;
            rectF.set(((float) rect.left) + (((float) i2) / 2.0f) + ((float) this.f۴۹b), ((float) rect.top) + (((float) i2) / 2.0f) + ((float) this.f۵۱d), (((float) rect.right) - (((float) i2) / 2.0f)) - ((float) this.f۵۰c), (((float) rect.bottom) - (((float) i2) / 2.0f)) - ((float) this.f۵۲e));
            float strokeCornerRadius = ((float) this.f۵۳f) - (((float) this.f۵۴g) / 2.0f);
            canvas.drawRoundRect(this.n, strokeCornerRadius, strokeCornerRadius, this.l);
        }
    }

    private Drawable i() {
        this.o = new GradientDrawable();
        this.o.setCornerRadius(((float) this.f۵۳f) + 1.0E-5f);
        this.o.setColor(-1);
        this.p = android.support.v4.graphics.drawable.a.h(this.o);
        android.support.v4.graphics.drawable.a.a(this.p, this.i);
        PorterDuff.Mode mode = this.f۵۵h;
        if (mode != null) {
            android.support.v4.graphics.drawable.a.a(this.p, mode);
        }
        this.q = new GradientDrawable();
        this.q.setCornerRadius(((float) this.f۵۳f) + 1.0E-5f);
        this.q.setColor(-1);
        this.r = android.support.v4.graphics.drawable.a.h(this.q);
        android.support.v4.graphics.drawable.a.a(this.r, this.k);
        return a(new LayerDrawable(new Drawable[]{this.p, this.r}));
    }

    private InsetDrawable a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f۴۹b, this.f۵۱d, this.f۵۰c, this.f۵۲e);
    }

    /* access modifiers changed from: package-private */
    public void c(ColorStateList tintList) {
        if (this.i != tintList) {
            this.i = tintList;
            if (w) {
                n();
                return;
            }
            Drawable drawable = this.p;
            if (drawable != null) {
                android.support.v4.graphics.drawable.a.a(drawable, this.i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList e() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        PorterDuff.Mode mode2;
        if (this.f۵۵h != mode) {
            this.f۵۵h = mode;
            if (w) {
                n();
                return;
            }
            Drawable drawable = this.p;
            if (drawable != null && (mode2 = this.f۵۵h) != null) {
                android.support.v4.graphics.drawable.a.a(drawable, mode2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode f() {
        return this.f۵۵h;
    }

    private void n() {
        GradientDrawable gradientDrawable = this.s;
        if (gradientDrawable != null) {
            android.support.v4.graphics.drawable.a.a(gradientDrawable, this.i);
            PorterDuff.Mode mode = this.f۵۵h;
            if (mode != null) {
                android.support.v4.graphics.drawable.a.a(this.s, mode);
            }
        }
    }

    @TargetApi(21)
    private Drawable j() {
        this.s = new GradientDrawable();
        this.s.setCornerRadius(((float) this.f۵۳f) + 1.0E-5f);
        this.s.setColor(-1);
        n();
        this.t = new GradientDrawable();
        this.t.setCornerRadius(((float) this.f۵۳f) + 1.0E-5f);
        this.t.setColor(0);
        this.t.setStroke(this.f۵۴g, this.j);
        InsetDrawable bgInsetDrawable = a(new LayerDrawable(new Drawable[]{this.s, this.t}));
        this.u = new GradientDrawable();
        this.u.setCornerRadius(((float) this.f۵۳f) + 1.0E-5f);
        this.u.setColor(-1);
        return new b(a.b.c.q.a.a(this.k), bgInsetDrawable, this.u);
    }

    /* access modifiers changed from: package-private */
    public void a(int height, int width) {
        GradientDrawable gradientDrawable = this.u;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.f۴۹b, this.f۵۱d, width - this.f۵۰c, height - this.f۵۲e);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int color) {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        if (w && (gradientDrawable2 = this.s) != null) {
            gradientDrawable2.setColor(color);
        } else if (!w && (gradientDrawable = this.o) != null) {
            gradientDrawable.setColor(color);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList rippleColor) {
        Drawable drawable;
        if (this.k != rippleColor) {
            this.k = rippleColor;
            if (w && (this.f۴۸a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f۴۸a.getBackground()).setColor(rippleColor);
            } else if (!w && (drawable = this.r) != null) {
                android.support.v4.graphics.drawable.a.a(drawable, rippleColor);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList strokeColor) {
        if (this.j != strokeColor) {
            this.j = strokeColor;
            Paint paint = this.l;
            int i2 = 0;
            if (strokeColor != null) {
                i2 = strokeColor.getColorForState(this.f۴۸a.getDrawableState(), 0);
            }
            paint.setColor(i2);
            m();
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public void c(int strokeWidth) {
        if (this.f۵۴g != strokeWidth) {
            this.f۵۴g = strokeWidth;
            this.l.setStrokeWidth((float) strokeWidth);
            m();
        }
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f۵۴g;
    }

    private void m() {
        if (w && this.t != null) {
            this.f۴۸a.setInternalBackground(j());
        } else if (!w) {
            this.f۴۸a.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int cornerRadius) {
        GradientDrawable gradientDrawable;
        if (this.f۵۳f != cornerRadius) {
            this.f۵۳f = cornerRadius;
            if (w && this.s != null && this.t != null && this.u != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    k().setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                    l().setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                }
                this.s.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                this.t.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                this.u.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
            } else if (!w && (gradientDrawable = this.o) != null && this.q != null) {
                gradientDrawable.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                this.q.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                this.f۴۸a.invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f۵۳f;
    }

    private GradientDrawable l() {
        if (!w || this.f۴۸a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f۴۸a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    private GradientDrawable k() {
        if (!w || this.f۴۸a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f۴۸a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }
}
