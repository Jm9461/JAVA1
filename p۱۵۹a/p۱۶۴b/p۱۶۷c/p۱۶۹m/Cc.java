package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۶۹m;

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
import android.support.design.internal.Ch;
import android.support.v4.view.Cu;
import p۱۵۹a.p۱۶۴b.p۱۶۷c.Ck;
import p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۳p.Ca;

/* renamed from: a.b.c.m.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cc {

    /* renamed from: w, reason: contains not printable characters */
    private static final boolean f۸۲۸۱w;

    /* renamed from: a, reason: contains not printable characters */
    private final Ca f۸۲۸۲a;

    /* renamed from: b, reason: contains not printable characters */
    private int f۸۲۸۳b;

    /* renamed from: c, reason: contains not printable characters */
    private int f۸۲۸۴c;

    /* renamed from: d, reason: contains not printable characters */
    private int f۸۲۸۵d;

    /* renamed from: e, reason: contains not printable characters */
    private int f۸۲۸۶e;

    /* renamed from: f, reason: contains not printable characters */
    private int f۸۲۸۷f;

    /* renamed from: g, reason: contains not printable characters */
    private int f۸۲۸۸g;

    /* renamed from: h, reason: contains not printable characters */
    private PorterDuff.Mode f۸۲۸۹h;

    /* renamed from: i, reason: contains not printable characters */
    private ColorStateList f۸۲۹۰i;

    /* renamed from: j, reason: contains not printable characters */
    private ColorStateList f۸۲۹۱j;

    /* renamed from: k, reason: contains not printable characters */
    private ColorStateList f۸۲۹۲k;

    /* renamed from: o, reason: contains not printable characters */
    private GradientDrawable f۸۲۹۶o;

    /* renamed from: p, reason: contains not printable characters */
    private Drawable f۸۲۹۷p;

    /* renamed from: q, reason: contains not printable characters */
    private GradientDrawable f۸۲۹۸q;

    /* renamed from: r, reason: contains not printable characters */
    private Drawable f۸۲۹۹r;

    /* renamed from: s, reason: contains not printable characters */
    private GradientDrawable f۸۳۰۰s;

    /* renamed from: t, reason: contains not printable characters */
    private GradientDrawable f۸۳۰۱t;

    /* renamed from: u, reason: contains not printable characters */
    private GradientDrawable f۸۳۰۲u;

    /* renamed from: l, reason: contains not printable characters */
    private final Paint f۸۲۹۳l = new Paint(1);

    /* renamed from: m, reason: contains not printable characters */
    private final Rect f۸۲۹۴m = new Rect();

    /* renamed from: n, reason: contains not printable characters */
    private final RectF f۸۲۹۵n = new RectF();

    /* renamed from: v, reason: contains not printable characters */
    private boolean f۸۳۰۳v = false;

    static {
        f۸۲۸۱w = Build.VERSION.SDK_INT >= 21;
    }

    public Cc(Ca button) {
        this.f۸۲۸۲a = button;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۷۹۱۸a(TypedArray attributes) {
        this.f۸۲۸۳b = attributes.getDimensionPixelOffset(Ck.MaterialButton_android_insetLeft, 0);
        this.f۸۲۸۴c = attributes.getDimensionPixelOffset(Ck.MaterialButton_android_insetRight, 0);
        this.f۸۲۸۵d = attributes.getDimensionPixelOffset(Ck.MaterialButton_android_insetTop, 0);
        this.f۸۲۸۶e = attributes.getDimensionPixelOffset(Ck.MaterialButton_android_insetBottom, 0);
        this.f۸۲۸۷f = attributes.getDimensionPixelSize(Ck.MaterialButton_cornerRadius, 0);
        this.f۸۲۸۸g = attributes.getDimensionPixelSize(Ck.MaterialButton_strokeWidth, 0);
        this.f۸۲۸۹h = Ch.m۹۲۹۲a(attributes.getInt(Ck.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f۸۲۹۰i = Ca.m۷۹۶۳a(this.f۸۲۸۲a.getContext(), attributes, Ck.MaterialButton_backgroundTint);
        this.f۸۲۹۱j = Ca.m۷۹۶۳a(this.f۸۲۸۲a.getContext(), attributes, Ck.MaterialButton_strokeColor);
        this.f۸۲۹۲k = Ca.m۷۹۶۳a(this.f۸۲۸۲a.getContext(), attributes, Ck.MaterialButton_rippleColor);
        this.f۸۲۹۳l.setStyle(Paint.Style.STROKE);
        this.f۸۲۹۳l.setStrokeWidth(this.f۸۲۸۸g);
        Paint paint = this.f۸۲۹۳l;
        ColorStateList colorStateList = this.f۸۲۹۱j;
        paint.setColor(colorStateList != null ? colorStateList.getColorForState(this.f۸۲۸۲a.getDrawableState(), 0) : 0);
        int paddingStart = Cu.m۱۰۹۴۸o(this.f۸۲۸۲a);
        int paddingTop = this.f۸۲۸۲a.getPaddingTop();
        int paddingEnd = Cu.m۱۰۹۴۷n(this.f۸۲۸۲a);
        int paddingBottom = this.f۸۲۸۲a.getPaddingBottom();
        this.f۸۲۸۲a.setInternalBackground(f۸۲۸۱w ? m۷۹۰۹j() : m۷۹۰۸i());
        Cu.m۱۰۹۱۰a(this.f۸۲۸۲a, this.f۸۲۸۳b + paddingStart, this.f۸۲۸۵d + paddingTop, this.f۸۲۸۴c + paddingEnd, this.f۸۲۸۶e + paddingBottom);
    }

    /* renamed from: h, reason: contains not printable characters */
    void m۷۹۳۱h() {
        this.f۸۳۰۳v = true;
        this.f۸۲۸۲a.setSupportBackgroundTintList(this.f۸۲۹۰i);
        this.f۸۲۸۲a.setSupportBackgroundTintMode(this.f۸۲۸۹h);
    }

    /* renamed from: g, reason: contains not printable characters */
    boolean m۷۹۳۰g() {
        return this.f۸۳۰۳v;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۷۹۱۹a(Canvas canvas) {
        if (canvas != null && this.f۸۲۹۱j != null && this.f۸۲۸۸g > 0) {
            this.f۸۲۹۴m.set(this.f۸۲۸۲a.getBackground().getBounds());
            RectF rectF = this.f۸۲۹۵n;
            float f2 = this.f۸۲۹۴m.left;
            int i = this.f۸۲۸۸g;
            rectF.set(f2 + (i / 2.0f) + this.f۸۲۸۳b, r1.top + (i / 2.0f) + this.f۸۲۸۵d, (r1.right - (i / 2.0f)) - this.f۸۲۸۴c, (r1.bottom - (i / 2.0f)) - this.f۸۲۸۶e);
            float strokeCornerRadius = this.f۸۲۸۷f - (this.f۸۲۸۸g / 2.0f);
            canvas.drawRoundRect(this.f۸۲۹۵n, strokeCornerRadius, strokeCornerRadius, this.f۸۲۹۳l);
        }
    }

    /* renamed from: i, reason: contains not printable characters */
    private Drawable m۷۹۰۸i() {
        this.f۸۲۹۶o = new GradientDrawable();
        this.f۸۲۹۶o.setCornerRadius(this.f۸۲۸۷f + 1.0E-5f);
        this.f۸۲۹۶o.setColor(-1);
        this.f۸۲۹۷p = android.support.v4.graphics.drawable.Ca.m۱۰۶۵۲h(this.f۸۲۹۶o);
        android.support.v4.graphics.drawable.Ca.m۱۰۶۳۸a(this.f۸۲۹۷p, this.f۸۲۹۰i);
        PorterDuff.Mode mode = this.f۸۲۸۹h;
        if (mode != null) {
            android.support.v4.graphics.drawable.Ca.m۱۰۶۴۱a(this.f۸۲۹۷p, mode);
        }
        this.f۸۲۹۸q = new GradientDrawable();
        this.f۸۲۹۸q.setCornerRadius(this.f۸۲۸۷f + 1.0E-5f);
        this.f۸۲۹۸q.setColor(-1);
        this.f۸۲۹۹r = android.support.v4.graphics.drawable.Ca.m۱۰۶۵۲h(this.f۸۲۹۸q);
        android.support.v4.graphics.drawable.Ca.m۱۰۶۳۸a(this.f۸۲۹۹r, this.f۸۲۹۲k);
        return m۷۹۰۷a(new LayerDrawable(new Drawable[]{this.f۸۲۹۷p, this.f۸۲۹۹r}));
    }

    /* renamed from: a, reason: contains not printable characters */
    private InsetDrawable m۷۹۰۷a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f۸۲۸۳b, this.f۸۲۸۵d, this.f۸۲۸۴c, this.f۸۲۸۶e);
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۷۹۲۶c(ColorStateList tintList) {
        if (this.f۸۲۹۰i != tintList) {
            this.f۸۲۹۰i = tintList;
            if (f۸۲۸۱w) {
                m۷۹۱۳n();
                return;
            }
            Drawable drawable = this.f۸۲۹۷p;
            if (drawable != null) {
                android.support.v4.graphics.drawable.Ca.m۱۰۶۳۸a(drawable, this.f۸۲۹۰i);
            }
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    ColorStateList m۷۹۲۸e() {
        return this.f۸۲۹۰i;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۷۹۲۰a(PorterDuff.Mode mode) {
        PorterDuff.Mode mode2;
        if (this.f۸۲۸۹h != mode) {
            this.f۸۲۸۹h = mode;
            if (f۸۲۸۱w) {
                m۷۹۱۳n();
                return;
            }
            Drawable drawable = this.f۸۲۹۷p;
            if (drawable != null && (mode2 = this.f۸۲۸۹h) != null) {
                android.support.v4.graphics.drawable.Ca.m۱۰۶۴۱a(drawable, mode2);
            }
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    PorterDuff.Mode m۷۹۲۹f() {
        return this.f۸۲۸۹h;
    }

    /* renamed from: n, reason: contains not printable characters */
    private void m۷۹۱۳n() {
        GradientDrawable gradientDrawable = this.f۸۳۰۰s;
        if (gradientDrawable != null) {
            android.support.v4.graphics.drawable.Ca.m۱۰۶۳۸a(gradientDrawable, this.f۸۲۹۰i);
            PorterDuff.Mode mode = this.f۸۲۸۹h;
            if (mode != null) {
                android.support.v4.graphics.drawable.Ca.m۱۰۶۴۱a(this.f۸۳۰۰s, mode);
            }
        }
    }

    @TargetApi(21)
    /* renamed from: j, reason: contains not printable characters */
    private Drawable m۷۹۰۹j() {
        this.f۸۳۰۰s = new GradientDrawable();
        this.f۸۳۰۰s.setCornerRadius(this.f۸۲۸۷f + 1.0E-5f);
        this.f۸۳۰۰s.setColor(-1);
        m۷۹۱۳n();
        this.f۸۳۰۱t = new GradientDrawable();
        this.f۸۳۰۱t.setCornerRadius(this.f۸۲۸۷f + 1.0E-5f);
        this.f۸۳۰۱t.setColor(0);
        this.f۸۳۰۱t.setStroke(this.f۸۲۸۸g, this.f۸۲۹۱j);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f۸۳۰۰s, this.f۸۳۰۱t});
        InsetDrawable bgInsetDrawable = m۷۹۰۷a(layerDrawable);
        this.f۸۳۰۲u = new GradientDrawable();
        this.f۸۳۰۲u.setCornerRadius(this.f۸۲۸۷f + 1.0E-5f);
        this.f۸۳۰۲u.setColor(-1);
        return new Cb(p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۴q.Ca.m۷۹۶۷a(this.f۸۲۹۲k), bgInsetDrawable, this.f۸۳۰۲u);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۷۹۱۶a(int height, int width) {
        GradientDrawable gradientDrawable = this.f۸۳۰۲u;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.f۸۲۸۳b, this.f۸۲۸۵d, width - this.f۸۲۸۴c, height - this.f۸۲۸۶e);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۷۹۱۵a(int color) {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        if (f۸۲۸۱w && (gradientDrawable2 = this.f۸۳۰۰s) != null) {
            gradientDrawable2.setColor(color);
        } else if (!f۸۲۸۱w && (gradientDrawable = this.f۸۲۹۶o) != null) {
            gradientDrawable.setColor(color);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۷۹۱۷a(ColorStateList rippleColor) {
        Drawable drawable;
        if (this.f۸۲۹۲k != rippleColor) {
            this.f۸۲۹۲k = rippleColor;
            if (f۸۲۸۱w && (this.f۸۲۸۲a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f۸۲۸۲a.getBackground()).setColor(rippleColor);
            } else if (!f۸۲۸۱w && (drawable = this.f۸۲۹۹r) != null) {
                android.support.v4.graphics.drawable.Ca.m۱۰۶۳۸a(drawable, rippleColor);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    ColorStateList m۷۹۲۱b() {
        return this.f۸۲۹۲k;
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۷۹۲۳b(ColorStateList strokeColor) {
        if (this.f۸۲۹۱j != strokeColor) {
            this.f۸۲۹۱j = strokeColor;
            this.f۸۲۹۳l.setColor(strokeColor != null ? strokeColor.getColorForState(this.f۸۲۸۲a.getDrawableState(), 0) : 0);
            m۷۹۱۲m();
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    ColorStateList m۷۹۲۴c() {
        return this.f۸۲۹۱j;
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۷۹۲۵c(int strokeWidth) {
        if (this.f۸۲۸۸g != strokeWidth) {
            this.f۸۲۸۸g = strokeWidth;
            this.f۸۲۹۳l.setStrokeWidth(strokeWidth);
            m۷۹۱۲m();
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    int m۷۹۲۷d() {
        return this.f۸۲۸۸g;
    }

    /* renamed from: m, reason: contains not printable characters */
    private void m۷۹۱۲m() {
        if (f۸۲۸۱w && this.f۸۳۰۱t != null) {
            this.f۸۲۸۲a.setInternalBackground(m۷۹۰۹j());
        } else if (!f۸۲۸۱w) {
            this.f۸۲۸۲a.invalidate();
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۷۹۲۲b(int cornerRadius) {
        GradientDrawable gradientDrawable;
        if (this.f۸۲۸۷f != cornerRadius) {
            this.f۸۲۸۷f = cornerRadius;
            if (f۸۲۸۱w && this.f۸۳۰۰s != null && this.f۸۳۰۱t != null && this.f۸۳۰۲u != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    m۷۹۱۰k().setCornerRadius(cornerRadius + 1.0E-5f);
                    m۷۹۱۱l().setCornerRadius(cornerRadius + 1.0E-5f);
                }
                this.f۸۳۰۰s.setCornerRadius(cornerRadius + 1.0E-5f);
                this.f۸۳۰۱t.setCornerRadius(cornerRadius + 1.0E-5f);
                this.f۸۳۰۲u.setCornerRadius(cornerRadius + 1.0E-5f);
                return;
            }
            if (!f۸۲۸۱w && (gradientDrawable = this.f۸۲۹۶o) != null && this.f۸۲۹۸q != null) {
                gradientDrawable.setCornerRadius(cornerRadius + 1.0E-5f);
                this.f۸۲۹۸q.setCornerRadius(cornerRadius + 1.0E-5f);
                this.f۸۲۸۲a.invalidate();
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    int m۷۹۱۴a() {
        return this.f۸۲۸۷f;
    }

    /* renamed from: l, reason: contains not printable characters */
    private GradientDrawable m۷۹۱۱l() {
        if (f۸۲۸۱w && this.f۸۲۸۲a.getBackground() != null) {
            RippleDrawable background = (RippleDrawable) this.f۸۲۸۲a.getBackground();
            InsetDrawable insetDrawable = (InsetDrawable) background.getDrawable(0);
            LayerDrawable layerDrawable = (LayerDrawable) insetDrawable.getDrawable();
            return (GradientDrawable) layerDrawable.getDrawable(1);
        }
        return null;
    }

    /* renamed from: k, reason: contains not printable characters */
    private GradientDrawable m۷۹۱۰k() {
        if (f۸۲۸۱w && this.f۸۲۸۲a.getBackground() != null) {
            RippleDrawable background = (RippleDrawable) this.f۸۲۸۲a.getBackground();
            InsetDrawable insetDrawable = (InsetDrawable) background.getDrawable(0);
            LayerDrawable layerDrawable = (LayerDrawable) insetDrawable.getDrawable();
            return (GradientDrawable) layerDrawable.getDrawable(0);
        }
        return null;
    }
}
