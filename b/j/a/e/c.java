package b.j.a.e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public class c extends Drawable implements Animatable, View.OnTouchListener {
    private static final float[] F = {0.0f, 0.99f, 1.0f};
    private long A;
    private long B;
    private int C;
    private int D;
    private final Runnable E;

    /* renamed from: c  reason: collision with root package name */
    private boolean f۲۶۰۵c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f۲۶۰۶d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f۲۶۰۷e;

    /* renamed from: f  reason: collision with root package name */
    private C۰۰۵۹c f۲۶۰۸f;

    /* renamed from: g  reason: collision with root package name */
    private RadialGradient f۲۶۰۹g;

    /* renamed from: h  reason: collision with root package name */
    private RadialGradient f۲۶۱۰h;
    private Matrix i;
    private int j;
    private Drawable k;
    private RectF l;
    private Path m;
    private int n;
    private int o;
    private float p;
    private PointF q;
    private float r;
    private int s;
    private int t;
    private int u;
    private int v;
    private float w;
    private int x;
    private Interpolator y;
    private Interpolator z;

    /* synthetic */ c(Drawable x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, Interpolator x9, Interpolator x10, int x11, int x12, int x13, int x14, int x15, int x16, int x17, int x18, int x19, a x20) {
        this(x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19);
    }

    private c(Drawable backgroundDrawable, int backgroundAnimDuration, int backgroundColor, int rippleType, int delayClickType, int delayRippleTime, int maxRippleRadius, int rippleAnimDuration, int rippleColor, Interpolator inInterpolator, Interpolator outInterpolator, int type, int topLeftCornerRadius, int topRightCornerRadius, int bottomRightCornerRadius, int bottomLeftCornerRadius, int left, int top, int right, int bottom) {
        this.f۲۶۰۵c = false;
        this.j = 255;
        this.D = 0;
        this.E = new a();
        a(backgroundDrawable);
        this.n = backgroundAnimDuration;
        this.o = backgroundColor;
        this.s = rippleType;
        a(delayClickType);
        this.C = delayRippleTime;
        this.t = maxRippleRadius;
        this.u = rippleAnimDuration;
        this.v = rippleColor;
        if (this.s == 0 && this.t <= 0) {
            this.s = -1;
        }
        this.y = inInterpolator;
        this.z = outInterpolator;
        a(type, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, left, top, right, bottom);
        this.f۲۶۰۷e = new Paint(1);
        this.f۲۶۰۷e.setStyle(Paint.Style.FILL);
        this.f۲۶۰۶d = new Paint(1);
        this.f۲۶۰۶d.setStyle(Paint.Style.FILL);
        this.m = new Path();
        this.l = new RectF();
        this.q = new PointF();
        this.i = new Matrix();
        int i2 = this.v;
        this.f۲۶۰۹g = new RadialGradient(0.0f, 0.0f, 16.0f, new int[]{i2, i2, 0}, F, Shader.TileMode.CLAMP);
        if (this.s == 1) {
            this.f۲۶۱۰h = new RadialGradient(0.0f, 0.0f, 16.0f, new int[]{0, b.j.a.f.a.a(this.v, 0.0f), this.v}, F, Shader.TileMode.CLAMP);
        }
    }

    public void a(Drawable backgroundDrawable) {
        this.k = backgroundDrawable;
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
    }

    public Drawable b() {
        return this.k;
    }

    public void a(int type) {
        this.x = type;
    }

    public void a(int type, int topLeftCornerRadius, int topRightCornerRadius, int bottomRightCornerRadius, int bottomLeftCornerRadius, int left, int top, int right, int bottom) {
        this.f۲۶۰۸f = new C۰۰۵۹c(type, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, left, top, right, bottom);
    }

    public void setAlpha(int alpha) {
        this.j = alpha;
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        }
    }

    public void setColorFilter(ColorFilter filter) {
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setColorFilter(filter);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public long c() {
        int i2 = this.x;
        if (i2 == 0) {
            return -1;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                int i3 = this.D;
                if (i3 == 3) {
                    return ((long) (Math.max(this.n, this.u) * 2)) - (SystemClock.uptimeMillis() - this.A);
                }
                if (i3 == 4) {
                    return ((long) Math.max(this.n, this.u)) - (SystemClock.uptimeMillis() - this.A);
                }
            }
        } else if (this.D == 3) {
            return ((long) Math.max(this.n, this.u)) - (SystemClock.uptimeMillis() - this.A);
        }
        return -1;
    }

    private void b(int state) {
        int i2 = this.D;
        if (i2 == state) {
            return;
        }
        if (i2 != 0 || state == 1) {
            this.D = state;
            int i3 = this.D;
            if (i3 == 0 || i3 == 2) {
                stop();
            } else {
                start();
            }
        }
    }

    private boolean a(float x2, float y2, float radius) {
        PointF pointF = this.q;
        if (pointF.x == x2 && pointF.y == y2 && this.r == radius) {
            return false;
        }
        this.q.set(x2, y2);
        this.r = radius;
        float radius2 = this.r / 16.0f;
        this.i.reset();
        this.i.postTranslate(x2, y2);
        this.i.postScale(radius2, radius2, x2, y2);
        this.f۲۶۰۹g.setLocalMatrix(this.i);
        RadialGradient radialGradient = this.f۲۶۱۰h;
        if (radialGradient == null) {
            return true;
        }
        radialGradient.setLocalMatrix(this.i);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
        RectF rectF = this.l;
        int i2 = bounds.left;
        C۰۰۵۹c cVar = this.f۲۶۰۸f;
        rectF.set((float) (i2 + cVar.f۲۶۲۲c), (float) (bounds.top + cVar.f۲۶۲۳d), (float) (bounds.right - cVar.f۲۶۲۴e), (float) (bounds.bottom - cVar.f۲۶۲۵f));
        this.m.reset();
        C۰۰۵۹c cVar2 = this.f۲۶۰۸f;
        int i3 = cVar2.f۲۶۲۰a;
        if (i3 == 0) {
            this.m.addRoundRect(this.l, cVar2.f۲۶۲۱b, Path.Direction.CW);
        } else if (i3 == 1) {
            this.m.addOval(this.l, Path.Direction.CW);
        }
    }

    public boolean isStateful() {
        Drawable drawable = this.k;
        return drawable != null && drawable.isStateful();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        Drawable drawable = this.k;
        return drawable != null && drawable.setState(state);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        int i2 = this.s;
        if (i2 == -1 || i2 == 0) {
            a(canvas);
        } else if (i2 == 1) {
            b(canvas);
        }
    }

    private void a(Canvas canvas) {
        if (this.D != 0) {
            if (this.p > 0.0f) {
                this.f۲۶۰۷e.setColor(this.o);
                this.f۲۶۰۷e.setAlpha(Math.round(((float) this.j) * this.p));
                canvas.drawPath(this.m, this.f۲۶۰۷e);
            }
            if (this.r > 0.0f) {
                float f2 = this.w;
                if (f2 > 0.0f) {
                    this.f۲۶۰۶d.setAlpha(Math.round(((float) this.j) * f2));
                    this.f۲۶۰۶d.setShader(this.f۲۶۰۹g);
                    canvas.drawPath(this.m, this.f۲۶۰۶d);
                }
            }
        }
    }

    private void b(Canvas canvas) {
        int i2 = this.D;
        if (i2 == 0) {
            return;
        }
        if (i2 == 4) {
            if (this.r == 0.0f) {
                this.f۲۶۰۷e.setColor(this.v);
                canvas.drawPath(this.m, this.f۲۶۰۷e);
                return;
            }
            this.f۲۶۰۶d.setShader(this.f۲۶۱۰h);
            canvas.drawPath(this.m, this.f۲۶۰۶d);
        } else if (this.r > 0.0f) {
            this.f۲۶۰۶d.setShader(this.f۲۶۰۹g);
            canvas.drawPath(this.m, this.f۲۶۰۶d);
        }
    }

    private int a(float x2, float y2) {
        return (int) Math.round(Math.sqrt(Math.pow((double) ((x2 < this.l.centerX() ? this.l.right : this.l.left) - x2), 2.0d) + Math.pow((double) ((y2 < this.l.centerY() ? this.l.bottom : this.l.top) - y2), 2.0d)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 != 3) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.e.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void a() {
        b(0);
    }

    private void d() {
        this.A = SystemClock.uptimeMillis();
    }

    public void start() {
        if (!isRunning()) {
            d();
            scheduleSelf(this.E, SystemClock.uptimeMillis() + 16);
            invalidateSelf();
        }
    }

    public void stop() {
        this.f۲۶۰۵c = false;
        unscheduleSelf(this.E);
        invalidateSelf();
    }

    public boolean isRunning() {
        int i2 = this.D;
        return (i2 == 0 || i2 == 2 || !this.f۲۶۰۵c) ? false : true;
    }

    public void scheduleSelf(Runnable what, long when) {
        this.f۲۶۰۵c = true;
        super.scheduleSelf(what, when);
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            int i = c.this.s;
            if (i == -1 || i == 0) {
                c.this.e();
            } else if (i == 1) {
                c.this.f();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e() {
        int i2 = 4;
        if (this.D != 4) {
            float backgroundProgress = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.A)) / ((float) this.n));
            this.p = (this.y.getInterpolation(backgroundProgress) * ((float) Color.alpha(this.o))) / 255.0f;
            float touchProgress = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.A)) / ((float) this.u));
            this.w = this.y.getInterpolation(touchProgress);
            PointF pointF = this.q;
            a(pointF.x, pointF.y, ((float) this.t) * this.y.getInterpolation(touchProgress));
            if (backgroundProgress == 1.0f && touchProgress == 1.0f) {
                this.A = SystemClock.uptimeMillis();
                if (this.D == 1) {
                    i2 = 2;
                }
                b(i2);
            }
        } else {
            float backgroundProgress2 = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.A)) / ((float) this.n));
            this.p = ((1.0f - this.z.getInterpolation(backgroundProgress2)) * ((float) Color.alpha(this.o))) / 255.0f;
            float touchProgress2 = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.A)) / ((float) this.u));
            this.w = 1.0f - this.z.getInterpolation(touchProgress2);
            PointF pointF2 = this.q;
            a(pointF2.x, pointF2.y, ((float) this.t) * ((this.z.getInterpolation(touchProgress2) * 0.5f) + 1.0f));
            if (backgroundProgress2 == 1.0f && touchProgress2 == 1.0f) {
                b(0);
            }
        }
        if (isRunning()) {
            scheduleSelf(this.E, SystemClock.uptimeMillis() + 16);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void f() {
        float progress = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.A)) / ((float) this.u));
        if (this.D != 4) {
            PointF pointF = this.q;
            a(pointF.x, pointF.y, ((float) this.t) * this.y.getInterpolation(progress));
            if (progress == 1.0f) {
                this.A = SystemClock.uptimeMillis();
                if (this.D == 1) {
                    b(2);
                } else {
                    PointF pointF2 = this.q;
                    a(pointF2.x, pointF2.y, 0.0f);
                    b(4);
                }
            }
        } else {
            PointF pointF3 = this.q;
            a(pointF3.x, pointF3.y, ((float) this.t) * this.z.getInterpolation(progress));
            if (progress == 1.0f) {
                b(0);
            }
        }
        if (isRunning()) {
            scheduleSelf(this.E, SystemClock.uptimeMillis() + 16);
        }
        invalidateSelf();
    }

    /* renamed from: b.j.a.e.c$c  reason: collision with other inner class name */
    public static class C۰۰۵۹c {

        /* renamed from: a  reason: collision with root package name */
        final int f۲۶۲۰a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f۲۶۲۱b = new float[8];

        /* renamed from: c  reason: collision with root package name */
        final int f۲۶۲۲c;

        /* renamed from: d  reason: collision with root package name */
        final int f۲۶۲۳d;

        /* renamed from: e  reason: collision with root package name */
        final int f۲۶۲۴e;

        /* renamed from: f  reason: collision with root package name */
        final int f۲۶۲۵f;

        public C۰۰۵۹c(int type, int topLeftCornerRadius, int topRightCornerRadius, int bottomRightCornerRadius, int bottomLeftCornerRadius, int left, int top, int right, int bottom) {
            this.f۲۶۲۰a = type;
            float[] fArr = this.f۲۶۲۱b;
            fArr[0] = (float) topLeftCornerRadius;
            fArr[1] = (float) topLeftCornerRadius;
            fArr[2] = (float) topRightCornerRadius;
            fArr[3] = (float) topRightCornerRadius;
            fArr[4] = (float) bottomRightCornerRadius;
            fArr[5] = (float) bottomRightCornerRadius;
            fArr[6] = (float) bottomLeftCornerRadius;
            fArr[7] = (float) bottomLeftCornerRadius;
            this.f۲۶۲۲c = left;
            this.f۲۶۲۳d = top;
            this.f۲۶۲۴e = right;
            this.f۲۶۲۵f = bottom;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f۲۶۱۲a;

        /* renamed from: b  reason: collision with root package name */
        private int f۲۶۱۳b;

        /* renamed from: c  reason: collision with root package name */
        private int f۲۶۱۴c;

        /* renamed from: d  reason: collision with root package name */
        private int f۲۶۱۵d;

        /* renamed from: e  reason: collision with root package name */
        private int f۲۶۱۶e;

        /* renamed from: f  reason: collision with root package name */
        private int f۲۶۱۷f;

        /* renamed from: g  reason: collision with root package name */
        private int f۲۶۱۸g;

        /* renamed from: h  reason: collision with root package name */
        private int f۲۶۱۹h;
        private int i;
        private Interpolator j;
        private Interpolator k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;

        public b(Context context, int defStyleRes) {
            this(context, null, 0, defStyleRes);
        }

        public b(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            this.f۲۶۱۳b = 200;
            this.f۲۶۱۷f = 400;
            TypedArray a2 = context.obtainStyledAttributes(attrs, b.j.a.c.RippleDrawable, defStyleAttr, defStyleRes);
            b(a2.getColor(b.j.a.c.RippleDrawable_rd_backgroundColor, 0));
            a(a2.getInteger(b.j.a.c.RippleDrawable_rd_backgroundAnimDuration, context.getResources().getInteger(17694721)));
            p(a2.getInteger(b.j.a.c.RippleDrawable_rd_rippleType, 0));
            g(a2.getInteger(b.j.a.c.RippleDrawable_rd_delayClick, 0));
            h(a2.getInteger(b.j.a.c.RippleDrawable_rd_delayRipple, 0));
            int type = b.j.a.f.b.a(a2, b.j.a.c.RippleDrawable_rd_maxRippleRadius);
            if (type < 16 || type > 31) {
                k(a2.getDimensionPixelSize(b.j.a.c.RippleDrawable_rd_maxRippleRadius, b.j.a.f.b.d(context, 48)));
            } else {
                k(a2.getInteger(b.j.a.c.RippleDrawable_rd_maxRippleRadius, -1));
            }
            o(a2.getColor(b.j.a.c.RippleDrawable_rd_rippleColor, b.j.a.f.b.b(context, 0)));
            n(a2.getInteger(b.j.a.c.RippleDrawable_rd_rippleAnimDuration, context.getResources().getInteger(17694721)));
            int resId = a2.getResourceId(b.j.a.c.RippleDrawable_rd_inInterpolator, 0);
            if (resId != 0) {
                a(AnimationUtils.loadInterpolator(context, resId));
            }
            int resId2 = a2.getResourceId(b.j.a.c.RippleDrawable_rd_outInterpolator, 0);
            if (resId2 != 0) {
                b(AnimationUtils.loadInterpolator(context, resId2));
            }
            j(a2.getInteger(b.j.a.c.RippleDrawable_rd_maskType, 0));
            f(a2.getDimensionPixelSize(b.j.a.c.RippleDrawable_rd_cornerRadius, 0));
            r(a2.getDimensionPixelSize(b.j.a.c.RippleDrawable_rd_topLeftCornerRadius, this.m));
            s(a2.getDimensionPixelSize(b.j.a.c.RippleDrawable_rd_topRightCornerRadius, this.n));
            e(a2.getDimensionPixelSize(b.j.a.c.RippleDrawable_rd_bottomRightCornerRadius, this.p));
            d(a2.getDimensionPixelSize(b.j.a.c.RippleDrawable_rd_bottomLeftCornerRadius, this.o));
            l(a2.getDimensionPixelSize(b.j.a.c.RippleDrawable_rd_padding, 0));
            i(a2.getDimensionPixelSize(b.j.a.c.RippleDrawable_rd_leftPadding, this.q));
            m(a2.getDimensionPixelSize(b.j.a.c.RippleDrawable_rd_rightPadding, this.s));
            q(a2.getDimensionPixelSize(b.j.a.c.RippleDrawable_rd_topPadding, this.r));
            c(a2.getDimensionPixelSize(b.j.a.c.RippleDrawable_rd_bottomPadding, this.t));
            a2.recycle();
        }

        public c a() {
            if (this.j == null) {
                this.j = new AccelerateInterpolator();
            }
            if (this.k == null) {
                this.k = new DecelerateInterpolator();
            }
            return new c(this.f۲۶۱۲a, this.f۲۶۱۳b, this.f۲۶۱۴c, this.f۲۶۱۵d, this.f۲۶۱۹h, this.i, this.f۲۶۱۶e, this.f۲۶۱۷f, this.f۲۶۱۸g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, null);
        }

        public b a(Drawable drawable) {
            this.f۲۶۱۲a = drawable;
            return this;
        }

        public b a(int duration) {
            this.f۲۶۱۳b = duration;
            return this;
        }

        public b b(int color) {
            this.f۲۶۱۴c = color;
            return this;
        }

        public b p(int type) {
            this.f۲۶۱۵d = type;
            return this;
        }

        public b g(int type) {
            this.f۲۶۱۹h = type;
            return this;
        }

        public b h(int time) {
            this.i = time;
            return this;
        }

        public b k(int radius) {
            this.f۲۶۱۶e = radius;
            return this;
        }

        public b n(int duration) {
            this.f۲۶۱۷f = duration;
            return this;
        }

        public b o(int color) {
            this.f۲۶۱۸g = color;
            return this;
        }

        public b a(Interpolator interpolator) {
            this.j = interpolator;
            return this;
        }

        public b b(Interpolator interpolator) {
            this.k = interpolator;
            return this;
        }

        public b j(int type) {
            this.l = type;
            return this;
        }

        public b f(int radius) {
            this.m = radius;
            this.n = radius;
            this.o = radius;
            this.p = radius;
            return this;
        }

        public b r(int radius) {
            this.m = radius;
            return this;
        }

        public b s(int radius) {
            this.n = radius;
            return this;
        }

        public b d(int radius) {
            this.o = radius;
            return this;
        }

        public b e(int radius) {
            this.p = radius;
            return this;
        }

        public b l(int padding) {
            this.q = padding;
            this.r = padding;
            this.s = padding;
            this.t = padding;
            return this;
        }

        public b i(int padding) {
            this.q = padding;
            return this;
        }

        public b q(int padding) {
            this.r = padding;
            return this;
        }

        public b m(int padding) {
            this.s = padding;
            return this;
        }

        public b c(int padding) {
            this.t = padding;
            return this;
        }
    }
}
