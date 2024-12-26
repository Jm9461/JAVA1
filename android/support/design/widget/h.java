package android.support.design.widget;

import a.b.g.c.a;
import a.b.h.a.j;
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
import android.support.v4.view.d;
import android.support.v4.view.u;
import android.support.v7.widget.j1;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;

public final class h {
    private static final boolean T = (Build.VERSION.SDK_INT < 18);
    private static final Paint U = null;
    private Paint A;
    private float B;
    private float C;
    private float D;
    private float E;
    private int[] F;
    private boolean G;
    private final TextPaint H;
    private final TextPaint I;
    private TimeInterpolator J;
    private TimeInterpolator K;
    private float L;
    private float M;
    private float N;
    private int O;
    private float P;
    private float Q;
    private float R;
    private int S;

    /* renamed from: a  reason: collision with root package name */
    private final View f۹۴۱a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f۹۴۲b;

    /* renamed from: c  reason: collision with root package name */
    private float f۹۴۳c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f۹۴۴d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f۹۴۵e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f۹۴۶f;

    /* renamed from: g  reason: collision with root package name */
    private int f۹۴۷g = 16;

    /* renamed from: h  reason: collision with root package name */
    private int f۹۴۸h = 16;
    private float i = 15.0f;
    private float j = 15.0f;
    private ColorStateList k;
    private ColorStateList l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private CharSequence v;
    private CharSequence w;
    private boolean x;
    private boolean y;
    private Bitmap z;

    static {
        Paint paint = U;
        if (paint != null) {
            paint.setAntiAlias(true);
            U.setColor(-65281);
        }
    }

    public h(View view) {
        this.f۹۴۱a = view;
        this.H = new TextPaint(129);
        this.I = new TextPaint(this.H);
        this.f۹۴۵e = new Rect();
        this.f۹۴۴d = new Rect();
        this.f۹۴۶f = new RectF();
    }

    public void b(TimeInterpolator interpolator) {
        this.K = interpolator;
        h();
    }

    public void a(TimeInterpolator interpolator) {
        this.J = interpolator;
        h();
    }

    public void a(float textSize) {
        if (this.i != textSize) {
            this.i = textSize;
            h();
        }
    }

    public void a(ColorStateList textColor) {
        if (this.l != textColor) {
            this.l = textColor;
            h();
        }
    }

    public void b(ColorStateList textColor) {
        if (this.k != textColor) {
            this.k = textColor;
            h();
        }
    }

    public void b(int left, int top, int right, int bottom) {
        if (!a(this.f۹۴۴d, left, top, right, bottom)) {
            this.f۹۴۴d.set(left, top, right, bottom);
            this.G = true;
            g();
        }
    }

    public void a(int left, int top, int right, int bottom) {
        if (!a(this.f۹۴۵e, left, top, right, bottom)) {
            this.f۹۴۵e.set(left, top, right, bottom);
            this.G = true;
            g();
        }
    }

    public float a() {
        if (this.v == null) {
            return 0.0f;
        }
        a(this.I);
        TextPaint textPaint = this.I;
        CharSequence charSequence = this.v;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public float c() {
        a(this.I);
        return -this.I.ascent();
    }

    public void a(RectF bounds) {
        float f2;
        boolean isRtl = b(this.v);
        Rect rect = this.f۹۴۵e;
        if (!isRtl) {
            f2 = (float) rect.left;
        } else {
            f2 = ((float) rect.right) - a();
        }
        bounds.left = f2;
        Rect rect2 = this.f۹۴۵e;
        bounds.top = (float) rect2.top;
        bounds.right = !isRtl ? bounds.left + a() : (float) rect2.right;
        bounds.bottom = ((float) this.f۹۴۵e.top) + c();
    }

    private void a(TextPaint textPaint) {
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f۹۴۲b = this.f۹۴۵e.width() > 0 && this.f۹۴۵e.height() > 0 && this.f۹۴۴d.width() > 0 && this.f۹۴۴d.height() > 0;
    }

    public void c(int gravity) {
        if (this.f۹۴۷g != gravity) {
            this.f۹۴۷g = gravity;
            h();
        }
    }

    public void b(int gravity) {
        if (this.f۹۴۸h != gravity) {
            this.f۹۴۸h = gravity;
            h();
        }
    }

    public void a(int resId) {
        j1 a2 = j1.a(this.f۹۴۱a.getContext(), resId, j.TextAppearance);
        if (a2.g(j.TextAppearance_android_textColor)) {
            this.l = a2.a(j.TextAppearance_android_textColor);
        }
        if (a2.g(j.TextAppearance_android_textSize)) {
            this.j = (float) a2.c(j.TextAppearance_android_textSize, (int) this.j);
        }
        this.O = a2.d(j.TextAppearance_android_shadowColor, 0);
        this.M = a2.b(j.TextAppearance_android_shadowDx, 0.0f);
        this.N = a2.b(j.TextAppearance_android_shadowDy, 0.0f);
        this.L = a2.b(j.TextAppearance_android_shadowRadius, 0.0f);
        a2.a();
        if (Build.VERSION.SDK_INT >= 16) {
            this.s = d(resId);
        }
        h();
    }

    private Typeface d(int resId) {
        TypedArray a2 = this.f۹۴۱a.getContext().obtainStyledAttributes(resId, new int[]{16843692});
        try {
            String family = a2.getString(0);
            if (family != null) {
                return Typeface.create(family, 0);
            }
            a2.recycle();
            return null;
        } finally {
            a2.recycle();
        }
    }

    public void a(Typeface typeface) {
        this.t = typeface;
        this.s = typeface;
        h();
    }

    public void b(float fraction) {
        float fraction2 = a.a(fraction, 0.0f, 1.0f);
        if (fraction2 != this.f۹۴۳c) {
            this.f۹۴۳c = fraction2;
            j();
        }
    }

    public final boolean a(int[] state) {
        this.F = state;
        if (!f()) {
            return false;
        }
        h();
        return true;
    }

    public final boolean f() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.k) != null && colorStateList.isStateful());
    }

    public float e() {
        return this.f۹۴۳c;
    }

    private void j() {
        c(this.f۹۴۳c);
    }

    private void c(float fraction) {
        e(fraction);
        this.q = a(this.o, this.p, fraction, this.J);
        this.r = a(this.m, this.n, fraction, this.J);
        f(a(this.i, this.j, fraction, this.K));
        if (this.l != this.k) {
            this.H.setColor(a(m(), d(), fraction));
        } else {
            this.H.setColor(d());
        }
        this.H.setShadowLayer(a(this.P, this.L, fraction, (TimeInterpolator) null), a(this.Q, this.M, fraction, (TimeInterpolator) null), a(this.R, this.N, fraction, (TimeInterpolator) null), a(this.S, this.O, fraction));
        u.B(this.f۹۴۱a);
    }

    private int m() {
        int[] iArr = this.F;
        if (iArr != null) {
            return this.k.getColorForState(iArr, 0);
        }
        return this.k.getDefaultColor();
    }

    public int d() {
        int[] iArr = this.F;
        if (iArr != null) {
            return this.l.getColorForState(iArr, 0);
        }
        return this.l.getDefaultColor();
    }

    private void i() {
        float currentTextSize = this.E;
        d(this.j);
        CharSequence charSequence = this.w;
        float width = 0.0f;
        float width2 = charSequence != null ? this.H.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int collapsedAbsGravity = d.a(this.f۹۴۸h, this.x ? 1 : 0);
        int i2 = collapsedAbsGravity & 112;
        if (i2 == 48) {
            this.n = ((float) this.f۹۴۵e.top) - this.H.ascent();
        } else if (i2 != 80) {
            this.n = ((float) this.f۹۴۵e.centerY()) + (((this.H.descent() - this.H.ascent()) / 2.0f) - this.H.descent());
        } else {
            this.n = (float) this.f۹۴۵e.bottom;
        }
        int i3 = collapsedAbsGravity & 8388615;
        if (i3 == 1) {
            this.p = ((float) this.f۹۴۵e.centerX()) - (width2 / 2.0f);
        } else if (i3 != 5) {
            this.p = (float) this.f۹۴۵e.left;
        } else {
            this.p = ((float) this.f۹۴۵e.right) - width2;
        }
        d(this.i);
        CharSequence charSequence2 = this.w;
        if (charSequence2 != null) {
            width = this.H.measureText(charSequence2, 0, charSequence2.length());
        }
        int expandedAbsGravity = d.a(this.f۹۴۷g, this.x ? 1 : 0);
        int i4 = expandedAbsGravity & 112;
        if (i4 == 48) {
            this.m = ((float) this.f۹۴۴d.top) - this.H.ascent();
        } else if (i4 != 80) {
            this.m = ((float) this.f۹۴۴d.centerY()) + (((this.H.descent() - this.H.ascent()) / 2.0f) - this.H.descent());
        } else {
            this.m = (float) this.f۹۴۴d.bottom;
        }
        int i5 = expandedAbsGravity & 8388615;
        if (i5 == 1) {
            this.o = ((float) this.f۹۴۴d.centerX()) - (width / 2.0f);
        } else if (i5 != 5) {
            this.o = (float) this.f۹۴۴d.left;
        } else {
            this.o = ((float) this.f۹۴۴d.right) - width;
        }
        k();
        f(currentTextSize);
    }

    private void e(float fraction) {
        this.f۹۴۶f.left = a((float) this.f۹۴۴d.left, (float) this.f۹۴۵e.left, fraction, this.J);
        this.f۹۴۶f.top = a(this.m, this.n, fraction, this.J);
        this.f۹۴۶f.right = a((float) this.f۹۴۴d.right, (float) this.f۹۴۵e.right, fraction, this.J);
        this.f۹۴۶f.bottom = a((float) this.f۹۴۴d.bottom, (float) this.f۹۴۵e.bottom, fraction, this.J);
    }

    public void a(Canvas canvas) {
        float ascent;
        float y2;
        int saveCount = canvas.save();
        if (this.w != null && this.f۹۴۲b) {
            float x2 = this.q;
            float y3 = this.r;
            boolean drawTexture = this.y && this.z != null;
            if (drawTexture) {
                float f2 = this.B;
                float f3 = this.D;
                float f4 = this.C * f3;
                ascent = f2 * f3;
            } else {
                float ascent2 = this.H.ascent() * this.D;
                float descent = this.D * this.H.descent();
                ascent = ascent2;
            }
            if (drawTexture) {
                y2 = y3 + ascent;
            } else {
                y2 = y3;
            }
            float y4 = this.D;
            if (y4 != 1.0f) {
                canvas.scale(y4, y4, x2, y2);
            }
            if (drawTexture) {
                canvas.drawBitmap(this.z, x2, y2, this.A);
            } else {
                CharSequence charSequence = this.w;
                canvas.drawText(charSequence, 0, charSequence.length(), x2, y2, this.H);
            }
        }
        canvas.restoreToCount(saveCount);
    }

    private boolean b(CharSequence text) {
        boolean defaultIsRtl = true;
        if (u.k(this.f۹۴۱a) != 1) {
            defaultIsRtl = false;
        }
        return (defaultIsRtl ? a.b.g.f.d.f۳۶۰b : a.b.g.f.d.f۳۵۹a).a(text, 0, text.length());
    }

    private void f(float textSize) {
        d(textSize);
        this.y = T && this.D != 1.0f;
        if (this.y) {
            l();
        }
        u.B(this.f۹۴۱a);
    }

    private void d(float textSize) {
        float textSizeRatio;
        float newTextSize;
        if (this.v != null) {
            float collapsedWidth = (float) this.f۹۴۵e.width();
            float expandedWidth = (float) this.f۹۴۴d.width();
            boolean updateDrawText = false;
            if (a(textSize, this.j)) {
                newTextSize = this.j;
                this.D = 1.0f;
                Typeface typeface = this.u;
                Typeface typeface2 = this.s;
                if (typeface != typeface2) {
                    this.u = typeface2;
                    updateDrawText = true;
                }
                textSizeRatio = collapsedWidth;
            } else {
                newTextSize = this.i;
                Typeface typeface3 = this.u;
                Typeface typeface4 = this.t;
                if (typeface3 != typeface4) {
                    this.u = typeface4;
                    updateDrawText = true;
                }
                if (a(textSize, this.i)) {
                    this.D = 1.0f;
                } else {
                    this.D = textSize / this.i;
                }
                float textSizeRatio2 = this.j / this.i;
                if (expandedWidth * textSizeRatio2 > collapsedWidth) {
                    textSizeRatio = Math.min(collapsedWidth / textSizeRatio2, expandedWidth);
                } else {
                    textSizeRatio = expandedWidth;
                }
            }
            boolean z2 = true;
            if (textSizeRatio > 0.0f) {
                updateDrawText = this.E != newTextSize || this.G || updateDrawText;
                this.E = newTextSize;
                this.G = false;
            }
            if (this.w == null || updateDrawText) {
                this.H.setTextSize(this.E);
                this.H.setTypeface(this.u);
                TextPaint textPaint = this.H;
                if (this.D == 1.0f) {
                    z2 = false;
                }
                textPaint.setLinearText(z2);
                CharSequence title = TextUtils.ellipsize(this.v, this.H, textSizeRatio, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(title, this.w)) {
                    this.w = title;
                    this.x = b(this.w);
                }
            }
        }
    }

    private void l() {
        if (this.z == null && !this.f۹۴۴d.isEmpty() && !TextUtils.isEmpty(this.w)) {
            c(0.0f);
            this.B = this.H.ascent();
            this.C = this.H.descent();
            TextPaint textPaint = this.H;
            CharSequence charSequence = this.w;
            int w2 = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int h2 = Math.round(this.C - this.B);
            if (w2 > 0 && h2 > 0) {
                this.z = Bitmap.createBitmap(w2, h2, Bitmap.Config.ARGB_8888);
                Canvas c2 = new Canvas(this.z);
                CharSequence charSequence2 = this.w;
                c2.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) h2) - this.H.descent(), this.H);
                if (this.A == null) {
                    this.A = new Paint(3);
                }
            }
        }
    }

    public void h() {
        if (this.f۹۴۱a.getHeight() > 0 && this.f۹۴۱a.getWidth() > 0) {
            i();
            j();
        }
    }

    public void a(CharSequence text) {
        if (text == null || !text.equals(this.v)) {
            this.v = text;
            this.w = null;
            k();
            h();
        }
    }

    private void k() {
        Bitmap bitmap = this.z;
        if (bitmap != null) {
            bitmap.recycle();
            this.z = null;
        }
    }

    private static boolean a(float value, float targetValue) {
        return Math.abs(value - targetValue) < 0.001f;
    }

    public ColorStateList b() {
        return this.l;
    }

    private static int a(int color1, int color2, float ratio) {
        float inverseRatio = 1.0f - ratio;
        return Color.argb((int) ((((float) Color.alpha(color1)) * inverseRatio) + (((float) Color.alpha(color2)) * ratio)), (int) ((((float) Color.red(color1)) * inverseRatio) + (((float) Color.red(color2)) * ratio)), (int) ((((float) Color.green(color1)) * inverseRatio) + (((float) Color.green(color2)) * ratio)), (int) ((((float) Color.blue(color1)) * inverseRatio) + (((float) Color.blue(color2)) * ratio)));
    }

    private static float a(float startValue, float endValue, float fraction, TimeInterpolator interpolator) {
        if (interpolator != null) {
            fraction = interpolator.getInterpolation(fraction);
        }
        return a.b.c.l.a.a(startValue, endValue, fraction);
    }

    private static boolean a(Rect r2, int left, int top, int right, int bottom) {
        return r2.left == left && r2.top == top && r2.right == right && r2.bottom == bottom;
    }
}
