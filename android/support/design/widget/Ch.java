package android.support.design.widget;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.support.p۰۴۳v4.view.Cd;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.widget.Cj1;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۷c.Ca;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* renamed from: android.support.design.widget.h  reason: invalid class name */
public final class Ch {

    /* renamed from: T  reason: contains not printable characters */
    private static final boolean f۹۸۷۸T = (Build.VERSION.SDK_INT < 18);

    /* renamed from: U  reason: contains not printable characters */
    private static final Paint f۹۸۷۹U = null;

    /* renamed from: A  reason: contains not printable characters */
    private Paint f۹۸۸۰A;

    /* renamed from: B  reason: contains not printable characters */
    private float f۹۸۸۱B;

    /* renamed from: C  reason: contains not printable characters */
    private float f۹۸۸۲C;

    /* renamed from: D  reason: contains not printable characters */
    private float f۹۸۸۳D;

    /* renamed from: E  reason: contains not printable characters */
    private float f۹۸۸۴E;

    /* renamed from: F  reason: contains not printable characters */
    private int[] f۹۸۸۵F;

    /* renamed from: G  reason: contains not printable characters */
    private boolean f۹۸۸۶G;

    /* renamed from: H  reason: contains not printable characters */
    private final TextPaint f۹۸۸۷H;

    /* renamed from: I  reason: contains not printable characters */
    private final TextPaint f۹۸۸۸I;

    /* renamed from: J  reason: contains not printable characters */
    private TimeInterpolator f۹۸۸۹J;

    /* renamed from: K  reason: contains not printable characters */
    private TimeInterpolator f۹۸۹۰K;

    /* renamed from: L  reason: contains not printable characters */
    private float f۹۸۹۱L;

    /* renamed from: M  reason: contains not printable characters */
    private float f۹۸۹۲M;

    /* renamed from: N  reason: contains not printable characters */
    private float f۹۸۹۳N;

    /* renamed from: O  reason: contains not printable characters */
    private int f۹۸۹۴O;

    /* renamed from: P  reason: contains not printable characters */
    private float f۹۸۹۵P;

    /* renamed from: Q  reason: contains not printable characters */
    private float f۹۸۹۶Q;

    /* renamed from: R  reason: contains not printable characters */
    private float f۹۸۹۷R;

    /* renamed from: S  reason: contains not printable characters */
    private int f۹۸۹۸S;

    /* renamed from: a  reason: contains not printable characters */
    private final View f۹۸۹۹a;

    /* renamed from: b  reason: contains not printable characters */
    private boolean f۹۹۰۰b;

    /* renamed from: c  reason: contains not printable characters */
    private float f۹۹۰۱c;

    /* renamed from: d  reason: contains not printable characters */
    private final Rect f۹۹۰۲d;

    /* renamed from: e  reason: contains not printable characters */
    private final Rect f۹۹۰۳e;

    /* renamed from: f  reason: contains not printable characters */
    private final RectF f۹۹۰۴f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۹۹۰۵g = 16;

    /* renamed from: h  reason: contains not printable characters */
    private int f۹۹۰۶h = 16;

    /* renamed from: i  reason: contains not printable characters */
    private float f۹۹۰۷i = 15.0f;

    /* renamed from: j  reason: contains not printable characters */
    private float f۹۹۰۸j = 15.0f;

    /* renamed from: k  reason: contains not printable characters */
    private ColorStateList f۹۹۰۹k;

    /* renamed from: l  reason: contains not printable characters */
    private ColorStateList f۹۹۱۰l;

    /* renamed from: m  reason: contains not printable characters */
    private float f۹۹۱۱m;

    /* renamed from: n  reason: contains not printable characters */
    private float f۹۹۱۲n;

    /* renamed from: o  reason: contains not printable characters */
    private float f۹۹۱۳o;

    /* renamed from: p  reason: contains not printable characters */
    private float f۹۹۱۴p;

    /* renamed from: q  reason: contains not printable characters */
    private float f۹۹۱۵q;

    /* renamed from: r  reason: contains not printable characters */
    private float f۹۹۱۶r;

    /* renamed from: s  reason: contains not printable characters */
    private Typeface f۹۹۱۷s;

    /* renamed from: t  reason: contains not printable characters */
    private Typeface f۹۹۱۸t;

    /* renamed from: u  reason: contains not printable characters */
    private Typeface f۹۹۱۹u;

    /* renamed from: v  reason: contains not printable characters */
    private CharSequence f۹۹۲۰v;

    /* renamed from: w  reason: contains not printable characters */
    private CharSequence f۹۹۲۱w;

    /* renamed from: x  reason: contains not printable characters */
    private boolean f۹۹۲۲x;

    /* renamed from: y  reason: contains not printable characters */
    private boolean f۹۹۲۳y;

    /* renamed from: z  reason: contains not printable characters */
    private Bitmap f۹۹۲۴z;

    static {
        Paint paint = f۹۸۷۹U;
        if (paint != null) {
            paint.setAntiAlias(true);
            f۹۸۷۹U.setColor(-65281);
        }
    }

    public Ch(View view) {
        this.f۹۸۹۹a = view;
        this.f۹۸۸۷H = new TextPaint(129);
        this.f۹۸۸۸I = new TextPaint(this.f۹۸۸۷H);
        this.f۹۹۰۳e = new Rect();
        this.f۹۹۰۲d = new Rect();
        this.f۹۹۰۴f = new RectF();
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۸۴۶b(TimeInterpolator interpolator) {
        this.f۹۸۹۰K = interpolator;
        m۱۱۸۵۴h();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۳۵a(TimeInterpolator interpolator) {
        this.f۹۸۸۹J = interpolator;
        m۱۱۸۵۴h();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۳۲a(float textSize) {
        if (this.f۹۹۰۷i != textSize) {
            this.f۹۹۰۷i = textSize;
            m۱۱۸۵۴h();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۳۶a(ColorStateList textColor) {
        if (this.f۹۹۱۰l != textColor) {
            this.f۹۹۱۰l = textColor;
            m۱۱۸۵۴h();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۸۴۷b(ColorStateList textColor) {
        if (this.f۹۹۰۹k != textColor) {
            this.f۹۹۰۹k = textColor;
            m۱۱۸۵۴h();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۸۴۵b(int left, int top, int right, int bottom) {
        if (!m۱۱۸۱۹a(this.f۹۹۰۲d, left, top, right, bottom)) {
            this.f۹۹۰۲d.set(left, top, right, bottom);
            this.f۹۸۸۶G = true;
            m۱۱۸۵۳g();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۳۴a(int left, int top, int right, int bottom) {
        if (!m۱۱۸۱۹a(this.f۹۹۰۳e, left, top, right, bottom)) {
            this.f۹۹۰۳e.set(left, top, right, bottom);
            this.f۹۸۸۶G = true;
            m۱۱۸۵۳g();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public float m۱۱۸۳۱a() {
        if (this.f۹۹۲۰v == null) {
            return 0.0f;
        }
        m۱۱۸۱۷a(this.f۹۸۸۸I);
        TextPaint textPaint = this.f۹۸۸۸I;
        CharSequence charSequence = this.f۹۹۲۰v;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c  reason: contains not printable characters */
    public float m۱۱۸۴۸c() {
        m۱۱۸۱۷a(this.f۹۸۸۸I);
        return -this.f۹۸۸۸I.ascent();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۳۸a(RectF bounds) {
        float f;
        boolean isRtl = m۱۱۸۲۰b(this.f۹۹۲۰v);
        Rect rect = this.f۹۹۰۳e;
        if (!isRtl) {
            f = (float) rect.left;
        } else {
            f = ((float) rect.right) - m۱۱۸۳۱a();
        }
        bounds.left = f;
        Rect rect2 = this.f۹۹۰۳e;
        bounds.top = (float) rect2.top;
        bounds.right = !isRtl ? bounds.left + m۱۱۸۳۱a() : (float) rect2.right;
        bounds.bottom = ((float) this.f۹۹۰۳e.top) + m۱۱۸۴۸c();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۸۱۷a(TextPaint textPaint) {
        textPaint.setTextSize(this.f۹۹۰۸j);
        textPaint.setTypeface(this.f۹۹۱۷s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۱۸۵۳g() {
        this.f۹۹۰۰b = this.f۹۹۰۳e.width() > 0 && this.f۹۹۰۳e.height() > 0 && this.f۹۹۰۲d.width() > 0 && this.f۹۹۰۲d.height() > 0;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۸۴۹c(int gravity) {
        if (this.f۹۹۰۵g != gravity) {
            this.f۹۹۰۵g = gravity;
            m۱۱۸۵۴h();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۸۴۴b(int gravity) {
        if (this.f۹۹۰۶h != gravity) {
            this.f۹۹۰۶h = gravity;
            m۱۱۸۵۴h();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۳۳a(int resId) {
        Cj1 a = Cj1.m۱۵۳۴۳a(this.f۹۸۹۹a.getContext(), resId, Cj.TextAppearance);
        if (a.m۱۵۳۶۴g(Cj.TextAppearance_android_textColor)) {
            this.f۹۹۱۰l = a.m۱۵۳۴۸a(Cj.TextAppearance_android_textColor);
        }
        if (a.m۱۵۳۶۴g(Cj.TextAppearance_android_textSize)) {
            this.f۹۹۰۸j = (float) a.m۱۵۳۵۵c(Cj.TextAppearance_android_textSize, (int) this.f۹۹۰۸j);
        }
        this.f۹۸۹۴O = a.m۱۵۳۵۷d(Cj.TextAppearance_android_shadowColor, 0);
        this.f۹۸۹۲M = a.m۱۵۳۵۲b(Cj.TextAppearance_android_shadowDx, 0.0f);
        this.f۹۸۹۳N = a.m۱۵۳۵۲b(Cj.TextAppearance_android_shadowDy, 0.0f);
        this.f۹۸۹۱L = a.m۱۵۳۵۲b(Cj.TextAppearance_android_shadowRadius, 0.0f);
        a.m۱۵۳۵۰a();
        if (Build.VERSION.SDK_INT >= 16) {
            this.f۹۹۱۷s = m۱۱۸۲۲d(resId);
        }
        m۱۱۸۵۴h();
    }

    /* renamed from: d  reason: contains not printable characters */
    private Typeface m۱۱۸۲۲d(int resId) {
        TypedArray a = this.f۹۸۹۹a.getContext().obtainStyledAttributes(resId, new int[]{16843692});
        try {
            String family = a.getString(0);
            if (family != null) {
                return Typeface.create(family, 0);
            }
            a.recycle();
            return null;
        } finally {
            a.recycle();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۳۹a(Typeface typeface) {
        this.f۹۹۱۸t = typeface;
        this.f۹۹۱۷s = typeface;
        m۱۱۸۵۴h();
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۸۴۳b(float fraction) {
        float fraction2 = Ca.m۱۰۴۹۴a(fraction, 0.0f, 1.0f);
        if (fraction2 != this.f۹۹۰۱c) {
            this.f۹۹۰۱c = fraction2;
            m۱۱۸۲۷j();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public final boolean m۱۱۸۴۱a(int[] state) {
        this.f۹۸۸۵F = state;
        if (!m۱۱۸۵۲f()) {
            return false;
        }
        m۱۱۸۵۴h();
        return true;
    }

    /* renamed from: f  reason: contains not printable characters */
    public final boolean m۱۱۸۵۲f() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f۹۹۱۰l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f۹۹۰۹k) != null && colorStateList.isStateful());
    }

    /* renamed from: e  reason: contains not printable characters */
    public float m۱۱۸۵۱e() {
        return this.f۹۹۰۱c;
    }

    /* renamed from: j  reason: contains not printable characters */
    private void m۱۱۸۲۷j() {
        m۱۱۸۲۱c(this.f۹۹۰۱c);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۱۸۲۱c(float fraction) {
        m۱۱۸۲۴e(fraction);
        this.f۹۹۱۵q = m۱۱۸۱۵a(this.f۹۹۱۳o, this.f۹۹۱۴p, fraction, this.f۹۸۸۹J);
        this.f۹۹۱۶r = m۱۱۸۱۵a(this.f۹۹۱۱m, this.f۹۹۱۲n, fraction, this.f۹۸۸۹J);
        m۱۱۸۲۵f(m۱۱۸۱۵a(this.f۹۹۰۷i, this.f۹۹۰۸j, fraction, this.f۹۸۹۰K));
        if (this.f۹۹۱۰l != this.f۹۹۰۹k) {
            this.f۹۸۸۷H.setColor(m۱۱۸۱۶a(m۱۱۸۳۰m(), m۱۱۸۵۰d(), fraction));
        } else {
            this.f۹۸۸۷H.setColor(m۱۱۸۵۰d());
        }
        this.f۹۸۸۷H.setShadowLayer(m۱۱۸۱۵a(this.f۹۸۹۵P, this.f۹۸۹۱L, fraction, (TimeInterpolator) null), m۱۱۸۱۵a(this.f۹۸۹۶Q, this.f۹۸۹۲M, fraction, (TimeInterpolator) null), m۱۱۸۱۵a(this.f۹۸۹۷R, this.f۹۸۹۳N, fraction, (TimeInterpolator) null), m۱۱۸۱۶a(this.f۹۸۹۸S, this.f۹۸۹۴O, fraction));
        Cu.m۱۲۹۷۰B(this.f۹۸۹۹a);
    }

    /* renamed from: m  reason: contains not printable characters */
    private int m۱۱۸۳۰m() {
        int[] iArr = this.f۹۸۸۵F;
        if (iArr != null) {
            return this.f۹۹۰۹k.getColorForState(iArr, 0);
        }
        return this.f۹۹۰۹k.getDefaultColor();
    }

    /* renamed from: d  reason: contains not printable characters */
    public int m۱۱۸۵۰d() {
        int[] iArr = this.f۹۸۸۵F;
        if (iArr != null) {
            return this.f۹۹۱۰l.getColorForState(iArr, 0);
        }
        return this.f۹۹۱۰l.getDefaultColor();
    }

    /* renamed from: i  reason: contains not printable characters */
    private void m۱۱۸۲۶i() {
        float currentTextSize = this.f۹۸۸۴E;
        m۱۱۸۲۳d(this.f۹۹۰۸j);
        CharSequence charSequence = this.f۹۹۲۱w;
        float width = 0.0f;
        float width2 = charSequence != null ? this.f۹۸۸۷H.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int collapsedAbsGravity = Cd.m۱۲۸۲۵a(this.f۹۹۰۶h, this.f۹۹۲۲x ? 1 : 0);
        int i = collapsedAbsGravity & 112;
        if (i == 48) {
            this.f۹۹۱۲n = ((float) this.f۹۹۰۳e.top) - this.f۹۸۸۷H.ascent();
        } else if (i != 80) {
            this.f۹۹۱۲n = ((float) this.f۹۹۰۳e.centerY()) + (((this.f۹۸۸۷H.descent() - this.f۹۸۸۷H.ascent()) / 2.0f) - this.f۹۸۸۷H.descent());
        } else {
            this.f۹۹۱۲n = (float) this.f۹۹۰۳e.bottom;
        }
        int i2 = collapsedAbsGravity & 8388615;
        if (i2 == 1) {
            this.f۹۹۱۴p = ((float) this.f۹۹۰۳e.centerX()) - (width2 / 2.0f);
        } else if (i2 != 5) {
            this.f۹۹۱۴p = (float) this.f۹۹۰۳e.left;
        } else {
            this.f۹۹۱۴p = ((float) this.f۹۹۰۳e.right) - width2;
        }
        m۱۱۸۲۳d(this.f۹۹۰۷i);
        CharSequence charSequence2 = this.f۹۹۲۱w;
        if (charSequence2 != null) {
            width = this.f۹۸۸۷H.measureText(charSequence2, 0, charSequence2.length());
        }
        int expandedAbsGravity = Cd.m۱۲۸۲۵a(this.f۹۹۰۵g, this.f۹۹۲۲x ? 1 : 0);
        int i3 = expandedAbsGravity & 112;
        if (i3 == 48) {
            this.f۹۹۱۱m = ((float) this.f۹۹۰۲d.top) - this.f۹۸۸۷H.ascent();
        } else if (i3 != 80) {
            this.f۹۹۱۱m = ((float) this.f۹۹۰۲d.centerY()) + (((this.f۹۸۸۷H.descent() - this.f۹۸۸۷H.ascent()) / 2.0f) - this.f۹۸۸۷H.descent());
        } else {
            this.f۹۹۱۱m = (float) this.f۹۹۰۲d.bottom;
        }
        int i4 = expandedAbsGravity & 8388615;
        if (i4 == 1) {
            this.f۹۹۱۳o = ((float) this.f۹۹۰۲d.centerX()) - (width / 2.0f);
        } else if (i4 != 5) {
            this.f۹۹۱۳o = (float) this.f۹۹۰۲d.left;
        } else {
            this.f۹۹۱۳o = ((float) this.f۹۹۰۲d.right) - width;
        }
        m۱۱۸۲۸k();
        m۱۱۸۲۵f(currentTextSize);
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۱۸۲۴e(float fraction) {
        this.f۹۹۰۴f.left = m۱۱۸۱۵a((float) this.f۹۹۰۲d.left, (float) this.f۹۹۰۳e.left, fraction, this.f۹۸۸۹J);
        this.f۹۹۰۴f.top = m۱۱۸۱۵a(this.f۹۹۱۱m, this.f۹۹۱۲n, fraction, this.f۹۸۸۹J);
        this.f۹۹۰۴f.right = m۱۱۸۱۵a((float) this.f۹۹۰۲d.right, (float) this.f۹۹۰۳e.right, fraction, this.f۹۸۸۹J);
        this.f۹۹۰۴f.bottom = m۱۱۸۱۵a((float) this.f۹۹۰۲d.bottom, (float) this.f۹۹۰۳e.bottom, fraction, this.f۹۸۸۹J);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۳۷a(Canvas canvas) {
        float ascent;
        float y;
        int saveCount = canvas.save();
        if (this.f۹۹۲۱w != null && this.f۹۹۰۰b) {
            float x = this.f۹۹۱۵q;
            float y2 = this.f۹۹۱۶r;
            boolean drawTexture = this.f۹۹۲۳y && this.f۹۹۲۴z != null;
            if (drawTexture) {
                float f = this.f۹۸۸۱B;
                float f2 = this.f۹۸۸۳D;
                float f3 = this.f۹۸۸۲C * f2;
                ascent = f * f2;
            } else {
                float ascent2 = this.f۹۸۸۷H.ascent() * this.f۹۸۸۳D;
                float descent = this.f۹۸۸۳D * this.f۹۸۸۷H.descent();
                ascent = ascent2;
            }
            if (drawTexture) {
                y = y2 + ascent;
            } else {
                y = y2;
            }
            float y3 = this.f۹۸۸۳D;
            if (y3 != 1.0f) {
                canvas.scale(y3, y3, x, y);
            }
            if (drawTexture) {
                canvas.drawBitmap(this.f۹۹۲۴z, x, y, this.f۹۸۸۰A);
            } else {
                CharSequence charSequence = this.f۹۹۲۱w;
                canvas.drawText(charSequence, 0, charSequence.length(), x, y, this.f۹۸۸۷H);
            }
        }
        canvas.restoreToCount(saveCount);
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۱۸۲۰b(CharSequence text) {
        boolean defaultIsRtl = true;
        if (Cu.m۱۳۰۱۴k(this.f۹۸۹۹a) != 1) {
            defaultIsRtl = false;
        }
        return (defaultIsRtl ? p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f.Cd.f۸۷۲۳b : p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f.Cd.f۸۷۲۲a).m۱۰۵۴۴a(text, 0, text.length());
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۱۸۲۵f(float textSize) {
        m۱۱۸۲۳d(textSize);
        this.f۹۹۲۳y = f۹۸۷۸T && this.f۹۸۸۳D != 1.0f;
        if (this.f۹۹۲۳y) {
            m۱۱۸۲۹l();
        }
        Cu.m۱۲۹۷۰B(this.f۹۸۹۹a);
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۱۸۲۳d(float textSize) {
        float textSizeRatio;
        float newTextSize;
        if (this.f۹۹۲۰v != null) {
            float collapsedWidth = (float) this.f۹۹۰۳e.width();
            float expandedWidth = (float) this.f۹۹۰۲d.width();
            boolean updateDrawText = false;
            if (m۱۱۸۱۸a(textSize, this.f۹۹۰۸j)) {
                newTextSize = this.f۹۹۰۸j;
                this.f۹۸۸۳D = 1.0f;
                Typeface typeface = this.f۹۹۱۹u;
                Typeface typeface2 = this.f۹۹۱۷s;
                if (typeface != typeface2) {
                    this.f۹۹۱۹u = typeface2;
                    updateDrawText = true;
                }
                textSizeRatio = collapsedWidth;
            } else {
                newTextSize = this.f۹۹۰۷i;
                Typeface typeface3 = this.f۹۹۱۹u;
                Typeface typeface4 = this.f۹۹۱۸t;
                if (typeface3 != typeface4) {
                    this.f۹۹۱۹u = typeface4;
                    updateDrawText = true;
                }
                if (m۱۱۸۱۸a(textSize, this.f۹۹۰۷i)) {
                    this.f۹۸۸۳D = 1.0f;
                } else {
                    this.f۹۸۸۳D = textSize / this.f۹۹۰۷i;
                }
                float textSizeRatio2 = this.f۹۹۰۸j / this.f۹۹۰۷i;
                if (expandedWidth * textSizeRatio2 > collapsedWidth) {
                    textSizeRatio = Math.min(collapsedWidth / textSizeRatio2, expandedWidth);
                } else {
                    textSizeRatio = expandedWidth;
                }
            }
            boolean z = true;
            if (textSizeRatio > 0.0f) {
                updateDrawText = this.f۹۸۸۴E != newTextSize || this.f۹۸۸۶G || updateDrawText;
                this.f۹۸۸۴E = newTextSize;
                this.f۹۸۸۶G = false;
            }
            if (this.f۹۹۲۱w == null || updateDrawText) {
                this.f۹۸۸۷H.setTextSize(this.f۹۸۸۴E);
                this.f۹۸۸۷H.setTypeface(this.f۹۹۱۹u);
                TextPaint textPaint = this.f۹۸۸۷H;
                if (this.f۹۸۸۳D == 1.0f) {
                    z = false;
                }
                textPaint.setLinearText(z);
                CharSequence title = TextUtils.ellipsize(this.f۹۹۲۰v, this.f۹۸۸۷H, textSizeRatio, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(title, this.f۹۹۲۱w)) {
                    this.f۹۹۲۱w = title;
                    this.f۹۹۲۲x = m۱۱۸۲۰b(this.f۹۹۲۱w);
                }
            }
        }
    }

    /* renamed from: l  reason: contains not printable characters */
    private void m۱۱۸۲۹l() {
        if (this.f۹۹۲۴z == null && !this.f۹۹۰۲d.isEmpty() && !TextUtils.isEmpty(this.f۹۹۲۱w)) {
            m۱۱۸۲۱c(0.0f);
            this.f۹۸۸۱B = this.f۹۸۸۷H.ascent();
            this.f۹۸۸۲C = this.f۹۸۸۷H.descent();
            TextPaint textPaint = this.f۹۸۸۷H;
            CharSequence charSequence = this.f۹۹۲۱w;
            int w = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int h = Math.round(this.f۹۸۸۲C - this.f۹۸۸۱B);
            if (w > 0 && h > 0) {
                this.f۹۹۲۴z = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
                Canvas c = new Canvas(this.f۹۹۲۴z);
                CharSequence charSequence2 = this.f۹۹۲۱w;
                c.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) h) - this.f۹۸۸۷H.descent(), this.f۹۸۸۷H);
                if (this.f۹۸۸۰A == null) {
                    this.f۹۸۸۰A = new Paint(3);
                }
            }
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    public void m۱۱۸۵۴h() {
        if (this.f۹۸۹۹a.getHeight() > 0 && this.f۹۸۹۹a.getWidth() > 0) {
            m۱۱۸۲۶i();
            m۱۱۸۲۷j();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۴۰a(CharSequence text) {
        if (text == null || !text.equals(this.f۹۹۲۰v)) {
            this.f۹۹۲۰v = text;
            this.f۹۹۲۱w = null;
            m۱۱۸۲۸k();
            m۱۱۸۵۴h();
        }
    }

    /* renamed from: k  reason: contains not printable characters */
    private void m۱۱۸۲۸k() {
        Bitmap bitmap = this.f۹۹۲۴z;
        if (bitmap != null) {
            bitmap.recycle();
            this.f۹۹۲۴z = null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۱۸۱۸a(float value, float targetValue) {
        return Math.abs(value - targetValue) < 0.001f;
    }

    /* renamed from: b  reason: contains not printable characters */
    public ColorStateList m۱۱۸۴۲b() {
        return this.f۹۹۱۰l;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۱۸۱۶a(int color1, int color2, float ratio) {
        float inverseRatio = 1.0f - ratio;
        return Color.argb((int) ((((float) Color.alpha(color1)) * inverseRatio) + (((float) Color.alpha(color2)) * ratio)), (int) ((((float) Color.red(color1)) * inverseRatio) + (((float) Color.red(color2)) * ratio)), (int) ((((float) Color.green(color1)) * inverseRatio) + (((float) Color.green(color2)) * ratio)), (int) ((((float) Color.blue(color1)) * inverseRatio) + (((float) Color.blue(color2)) * ratio)));
    }

    /* renamed from: a  reason: contains not printable characters */
    private static float m۱۱۸۱۵a(float startValue, float endValue, float fraction, TimeInterpolator interpolator) {
        if (interpolator != null) {
            fraction = interpolator.getInterpolation(fraction);
        }
        return p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.m۹۹۴۳a(startValue, endValue, fraction);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۱۸۱۹a(Rect r, int left, int top, int right, int bottom) {
        return r.left == left && r.top == top && r.right == right && r.bottom == bottom;
    }
}
