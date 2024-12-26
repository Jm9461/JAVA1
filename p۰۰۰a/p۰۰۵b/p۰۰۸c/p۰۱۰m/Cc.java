package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۰m;

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
import android.support.p۰۴۳v4.view.Cu;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۴p.Ca;

/* access modifiers changed from: package-private */
/* renamed from: a.b.c.m.c  reason: invalid class name */
public class Cc {

    /* renamed from: w  reason: contains not printable characters */
    private static final boolean f۸۲۸۱w = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a  reason: contains not printable characters */
    private final Ca f۸۲۸۲a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۸۲۸۳b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۸۲۸۴c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۸۲۸۵d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۸۲۸۶e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۸۲۸۷f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۸۲۸۸g;

    /* renamed from: h  reason: contains not printable characters */
    private PorterDuff.Mode f۸۲۸۹h;

    /* renamed from: i  reason: contains not printable characters */
    private ColorStateList f۸۲۹۰i;

    /* renamed from: j  reason: contains not printable characters */
    private ColorStateList f۸۲۹۱j;

    /* renamed from: k  reason: contains not printable characters */
    private ColorStateList f۸۲۹۲k;

    /* renamed from: l  reason: contains not printable characters */
    private final Paint f۸۲۹۳l = new Paint(1);

    /* renamed from: m  reason: contains not printable characters */
    private final Rect f۸۲۹۴m = new Rect();

    /* renamed from: n  reason: contains not printable characters */
    private final RectF f۸۲۹۵n = new RectF();

    /* renamed from: o  reason: contains not printable characters */
    private GradientDrawable f۸۲۹۶o;

    /* renamed from: p  reason: contains not printable characters */
    private Drawable f۸۲۹۷p;

    /* renamed from: q  reason: contains not printable characters */
    private GradientDrawable f۸۲۹۸q;

    /* renamed from: r  reason: contains not printable characters */
    private Drawable f۸۲۹۹r;

    /* renamed from: s  reason: contains not printable characters */
    private GradientDrawable f۸۳۰۰s;

    /* renamed from: t  reason: contains not printable characters */
    private GradientDrawable f۸۳۰۱t;

    /* renamed from: u  reason: contains not printable characters */
    private GradientDrawable f۸۳۰۲u;

    /* renamed from: v  reason: contains not printable characters */
    private boolean f۸۳۰۳v = false;

    public Cc(Ca button) {
        this.f۸۲۸۲a = button;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۹۹۸۵a(TypedArray attributes) {
        int i = 0;
        this.f۸۲۸۳b = attributes.getDimensionPixelOffset(Ck.MaterialButton_android_insetLeft, 0);
        this.f۸۲۸۴c = attributes.getDimensionPixelOffset(Ck.MaterialButton_android_insetRight, 0);
        this.f۸۲۸۵d = attributes.getDimensionPixelOffset(Ck.MaterialButton_android_insetTop, 0);
        this.f۸۲۸۶e = attributes.getDimensionPixelOffset(Ck.MaterialButton_android_insetBottom, 0);
        this.f۸۲۸۷f = attributes.getDimensionPixelSize(Ck.MaterialButton_cornerRadius, 0);
        this.f۸۲۸۸g = attributes.getDimensionPixelSize(Ck.MaterialButton_strokeWidth, 0);
        this.f۸۲۸۹h = Ch.m۱۱۳۶۲a(attributes.getInt(Ck.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f۸۲۹۰i = Ca.m۱۰۰۳۰a(this.f۸۲۸۲a.getContext(), attributes, Ck.MaterialButton_backgroundTint);
        this.f۸۲۹۱j = Ca.m۱۰۰۳۰a(this.f۸۲۸۲a.getContext(), attributes, Ck.MaterialButton_strokeColor);
        this.f۸۲۹۲k = Ca.m۱۰۰۳۰a(this.f۸۲۸۲a.getContext(), attributes, Ck.MaterialButton_rippleColor);
        this.f۸۲۹۳l.setStyle(Paint.Style.STROKE);
        this.f۸۲۹۳l.setStrokeWidth((float) this.f۸۲۸۸g);
        Paint paint = this.f۸۲۹۳l;
        ColorStateList colorStateList = this.f۸۲۹۱j;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(this.f۸۲۸۲a.getDrawableState(), 0);
        }
        paint.setColor(i);
        int paddingStart = Cu.m۱۳۰۱۸o(this.f۸۲۸۲a);
        int paddingTop = this.f۸۲۸۲a.getPaddingTop();
        int paddingEnd = Cu.m۱۳۰۱۷n(this.f۸۲۸۲a);
        int paddingBottom = this.f۸۲۸۲a.getPaddingBottom();
        this.f۸۲۸۲a.setInternalBackground(f۸۲۸۱w ? m۹۹۷۶j() : m۹۹۷۵i());
        Cu.m۱۲۹۸۰a(this.f۸۲۸۲a, this.f۸۲۸۳b + paddingStart, this.f۸۲۸۵d + paddingTop, this.f۸۲۸۴c + paddingEnd, this.f۸۲۸۶e + paddingBottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public void m۹۹۹۸h() {
        this.f۸۳۰۳v = true;
        this.f۸۲۸۲a.setSupportBackgroundTintList(this.f۸۲۹۰i);
        this.f۸۲۸۲a.setSupportBackgroundTintMode(this.f۸۲۸۹h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public boolean m۹۹۹۷g() {
        return this.f۸۳۰۳v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۹۹۸۶a(Canvas canvas) {
        if (canvas != null && this.f۸۲۹۱j != null && this.f۸۲۸۸g > 0) {
            this.f۸۲۹۴m.set(this.f۸۲۸۲a.getBackground().getBounds());
            RectF rectF = this.f۸۲۹۵n;
            Rect rect = this.f۸۲۹۴m;
            int i = this.f۸۲۸۸g;
            rectF.set(((float) rect.left) + (((float) i) / 2.0f) + ((float) this.f۸۲۸۳b), ((float) rect.top) + (((float) i) / 2.0f) + ((float) this.f۸۲۸۵d), (((float) rect.right) - (((float) i) / 2.0f)) - ((float) this.f۸۲۸۴c), (((float) rect.bottom) - (((float) i) / 2.0f)) - ((float) this.f۸۲۸۶e));
            float strokeCornerRadius = ((float) this.f۸۲۸۷f) - (((float) this.f۸۲۸۸g) / 2.0f);
            canvas.drawRoundRect(this.f۸۲۹۵n, strokeCornerRadius, strokeCornerRadius, this.f۸۲۹۳l);
        }
    }

    /* renamed from: i  reason: contains not printable characters */
    private Drawable m۹۹۷۵i() {
        this.f۸۲۹۶o = new GradientDrawable();
        this.f۸۲۹۶o.setCornerRadius(((float) this.f۸۲۸۷f) + 1.0E-5f);
        this.f۸۲۹۶o.setColor(-1);
        this.f۸۲۹۷p = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(this.f۸۲۹۶o);
        android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(this.f۸۲۹۷p, this.f۸۲۹۰i);
        PorterDuff.Mode mode = this.f۸۲۸۹h;
        if (mode != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(this.f۸۲۹۷p, mode);
        }
        this.f۸۲۹۸q = new GradientDrawable();
        this.f۸۲۹۸q.setCornerRadius(((float) this.f۸۲۸۷f) + 1.0E-5f);
        this.f۸۲۹۸q.setColor(-1);
        this.f۸۲۹۹r = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(this.f۸۲۹۸q);
        android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(this.f۸۲۹۹r, this.f۸۲۹۲k);
        return m۹۹۷۴a(new LayerDrawable(new Drawable[]{this.f۸۲۹۷p, this.f۸۲۹۹r}));
    }

    /* renamed from: a  reason: contains not printable characters */
    private InsetDrawable m۹۹۷۴a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f۸۲۸۳b, this.f۸۲۸۵d, this.f۸۲۸۴c, this.f۸۲۸۶e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۹۹۹۳c(ColorStateList tintList) {
        if (this.f۸۲۹۰i != tintList) {
            this.f۸۲۹۰i = tintList;
            if (f۸۲۸۱w) {
                m۹۹۸۰n();
                return;
            }
            Drawable drawable = this.f۸۲۹۷p;
            if (drawable != null) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(drawable, this.f۸۲۹۰i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public ColorStateList m۹۹۹۵e() {
        return this.f۸۲۹۰i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۹۹۸۷a(PorterDuff.Mode mode) {
        PorterDuff.Mode mode2;
        if (this.f۸۲۸۹h != mode) {
            this.f۸۲۸۹h = mode;
            if (f۸۲۸۱w) {
                m۹۹۸۰n();
                return;
            }
            Drawable drawable = this.f۸۲۹۷p;
            if (drawable != null && (mode2 = this.f۸۲۸۹h) != null) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(drawable, mode2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public PorterDuff.Mode m۹۹۹۶f() {
        return this.f۸۲۸۹h;
    }

    /* renamed from: n  reason: contains not printable characters */
    private void m۹۹۸۰n() {
        GradientDrawable gradientDrawable = this.f۸۳۰۰s;
        if (gradientDrawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(gradientDrawable, this.f۸۲۹۰i);
            PorterDuff.Mode mode = this.f۸۲۸۹h;
            if (mode != null) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(this.f۸۳۰۰s, mode);
            }
        }
    }

    @TargetApi(21)
    /* renamed from: j  reason: contains not printable characters */
    private Drawable m۹۹۷۶j() {
        this.f۸۳۰۰s = new GradientDrawable();
        this.f۸۳۰۰s.setCornerRadius(((float) this.f۸۲۸۷f) + 1.0E-5f);
        this.f۸۳۰۰s.setColor(-1);
        m۹۹۸۰n();
        this.f۸۳۰۱t = new GradientDrawable();
        this.f۸۳۰۱t.setCornerRadius(((float) this.f۸۲۸۷f) + 1.0E-5f);
        this.f۸۳۰۱t.setColor(0);
        this.f۸۳۰۱t.setStroke(this.f۸۲۸۸g, this.f۸۲۹۱j);
        InsetDrawable bgInsetDrawable = m۹۹۷۴a(new LayerDrawable(new Drawable[]{this.f۸۳۰۰s, this.f۸۳۰۱t}));
        this.f۸۳۰۲u = new GradientDrawable();
        this.f۸۳۰۲u.setCornerRadius(((float) this.f۸۲۸۷f) + 1.0E-5f);
        this.f۸۳۰۲u.setColor(-1);
        return new Cb(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۵q.Ca.m۱۰۰۳۴a(this.f۸۲۹۲k), bgInsetDrawable, this.f۸۳۰۲u);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۹۹۸۳a(int height, int width) {
        GradientDrawable gradientDrawable = this.f۸۳۰۲u;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.f۸۲۸۳b, this.f۸۲۸۵d, width - this.f۸۲۸۴c, height - this.f۸۲۸۶e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۹۹۸۲a(int color) {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        if (f۸۲۸۱w && (gradientDrawable2 = this.f۸۳۰۰s) != null) {
            gradientDrawable2.setColor(color);
        } else if (!f۸۲۸۱w && (gradientDrawable = this.f۸۲۹۶o) != null) {
            gradientDrawable.setColor(color);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۹۹۸۴a(ColorStateList rippleColor) {
        Drawable drawable;
        if (this.f۸۲۹۲k != rippleColor) {
            this.f۸۲۹۲k = rippleColor;
            if (f۸۲۸۱w && (this.f۸۲۸۲a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f۸۲۸۲a.getBackground()).setColor(rippleColor);
            } else if (!f۸۲۸۱w && (drawable = this.f۸۲۹۹r) != null) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(drawable, rippleColor);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public ColorStateList m۹۹۸۸b() {
        return this.f۸۲۹۲k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۹۹۹۰b(ColorStateList strokeColor) {
        if (this.f۸۲۹۱j != strokeColor) {
            this.f۸۲۹۱j = strokeColor;
            Paint paint = this.f۸۲۹۳l;
            int i = 0;
            if (strokeColor != null) {
                i = strokeColor.getColorForState(this.f۸۲۸۲a.getDrawableState(), 0);
            }
            paint.setColor(i);
            m۹۹۷۹m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public ColorStateList m۹۹۹۱c() {
        return this.f۸۲۹۱j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۹۹۹۲c(int strokeWidth) {
        if (this.f۸۲۸۸g != strokeWidth) {
            this.f۸۲۸۸g = strokeWidth;
            this.f۸۲۹۳l.setStrokeWidth((float) strokeWidth);
            m۹۹۷۹m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public int m۹۹۹۴d() {
        return this.f۸۲۸۸g;
    }

    /* renamed from: m  reason: contains not printable characters */
    private void m۹۹۷۹m() {
        if (f۸۲۸۱w && this.f۸۳۰۱t != null) {
            this.f۸۲۸۲a.setInternalBackground(m۹۹۷۶j());
        } else if (!f۸۲۸۱w) {
            this.f۸۲۸۲a.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۹۹۸۹b(int cornerRadius) {
        GradientDrawable gradientDrawable;
        if (this.f۸۲۸۷f != cornerRadius) {
            this.f۸۲۸۷f = cornerRadius;
            if (f۸۲۸۱w && this.f۸۳۰۰s != null && this.f۸۳۰۱t != null && this.f۸۳۰۲u != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    m۹۹۷۷k().setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                    m۹۹۷۸l().setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                }
                this.f۸۳۰۰s.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                this.f۸۳۰۱t.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                this.f۸۳۰۲u.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
            } else if (!f۸۲۸۱w && (gradientDrawable = this.f۸۲۹۶o) != null && this.f۸۲۹۸q != null) {
                gradientDrawable.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                this.f۸۲۹۸q.setCornerRadius(((float) cornerRadius) + 1.0E-5f);
                this.f۸۲۸۲a.invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۹۹۸۱a() {
        return this.f۸۲۸۷f;
    }

    /* renamed from: l  reason: contains not printable characters */
    private GradientDrawable m۹۹۷۸l() {
        if (!f۸۲۸۱w || this.f۸۲۸۲a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f۸۲۸۲a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    /* renamed from: k  reason: contains not printable characters */
    private GradientDrawable m۹۹۷۷k() {
        if (!f۸۲۸۱w || this.f۸۲۸۲a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f۸۲۸۲a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }
}
