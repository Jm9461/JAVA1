package p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e;

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
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f.Ca;

/* renamed from: b.j.a.e.c  reason: invalid class name */
public class View$OnTouchListenerCc extends Drawable implements Animatable, View.OnTouchListener {

    /* renamed from: F  reason: contains not printable characters */
    private static final float[] f۱۳۰۲۸F = {0.0f, 0.99f, 1.0f};

    /* renamed from: A  reason: contains not printable characters */
    private long f۱۳۰۲۹A;

    /* renamed from: B  reason: contains not printable characters */
    private long f۱۳۰۳۰B;

    /* renamed from: C  reason: contains not printable characters */
    private int f۱۳۰۳۱C;

    /* renamed from: D  reason: contains not printable characters */
    private int f۱۳۰۳۲D;

    /* renamed from: E  reason: contains not printable characters */
    private final Runnable f۱۳۰۳۳E;

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۱۳۰۳۴c;

    /* renamed from: d  reason: contains not printable characters */
    private Paint f۱۳۰۳۵d;

    /* renamed from: e  reason: contains not printable characters */
    private Paint f۱۳۰۳۶e;

    /* renamed from: f  reason: contains not printable characters */
    private Cc f۱۳۰۳۷f;

    /* renamed from: g  reason: contains not printable characters */
    private RadialGradient f۱۳۰۳۸g;

    /* renamed from: h  reason: contains not printable characters */
    private RadialGradient f۱۳۰۳۹h;

    /* renamed from: i  reason: contains not printable characters */
    private Matrix f۱۳۰۴۰i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۳۰۴۱j;

    /* renamed from: k  reason: contains not printable characters */
    private Drawable f۱۳۰۴۲k;

    /* renamed from: l  reason: contains not printable characters */
    private RectF f۱۳۰۴۳l;

    /* renamed from: m  reason: contains not printable characters */
    private Path f۱۳۰۴۴m;

    /* renamed from: n  reason: contains not printable characters */
    private int f۱۳۰۴۵n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۳۰۴۶o;

    /* renamed from: p  reason: contains not printable characters */
    private float f۱۳۰۴۷p;

    /* renamed from: q  reason: contains not printable characters */
    private PointF f۱۳۰۴۸q;

    /* renamed from: r  reason: contains not printable characters */
    private float f۱۳۰۴۹r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۳۰۵۰s;

    /* renamed from: t  reason: contains not printable characters */
    private int f۱۳۰۵۱t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۳۰۵۲u;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۳۰۵۳v;

    /* renamed from: w  reason: contains not printable characters */
    private float f۱۳۰۵۴w;

    /* renamed from: x  reason: contains not printable characters */
    private int f۱۳۰۵۵x;

    /* renamed from: y  reason: contains not printable characters */
    private Interpolator f۱۳۰۵۶y;

    /* renamed from: z  reason: contains not printable characters */
    private Interpolator f۱۳۰۵۷z;

    /* synthetic */ View$OnTouchListenerCc(Drawable x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, Interpolator x9, Interpolator x10, int x11, int x12, int x13, int x14, int x15, int x16, int x17, int x18, int x19, RunnableCa x20) {
        this(x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19);
    }

    private View$OnTouchListenerCc(Drawable backgroundDrawable, int backgroundAnimDuration, int backgroundColor, int rippleType, int delayClickType, int delayRippleTime, int maxRippleRadius, int rippleAnimDuration, int rippleColor, Interpolator inInterpolator, Interpolator outInterpolator, int type, int topLeftCornerRadius, int topRightCornerRadius, int bottomRightCornerRadius, int bottomLeftCornerRadius, int left, int top, int right, int bottom) {
        this.f۱۳۰۳۴c = false;
        this.f۱۳۰۴۱j = 255;
        this.f۱۳۰۳۲D = 0;
        this.f۱۳۰۳۳E = new RunnableCa();
        m۱۶۴۶۵a(backgroundDrawable);
        this.f۱۳۰۴۵n = backgroundAnimDuration;
        this.f۱۳۰۴۶o = backgroundColor;
        this.f۱۳۰۵۰s = rippleType;
        m۱۶۴۶۳a(delayClickType);
        this.f۱۳۰۳۱C = delayRippleTime;
        this.f۱۳۰۵۱t = maxRippleRadius;
        this.f۱۳۰۵۲u = rippleAnimDuration;
        this.f۱۳۰۵۳v = rippleColor;
        if (this.f۱۳۰۵۰s == 0 && this.f۱۳۰۵۱t <= 0) {
            this.f۱۳۰۵۰s = -1;
        }
        this.f۱۳۰۵۶y = inInterpolator;
        this.f۱۳۰۵۷z = outInterpolator;
        m۱۶۴۶۴a(type, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, left, top, right, bottom);
        this.f۱۳۰۳۶e = new Paint(1);
        this.f۱۳۰۳۶e.setStyle(Paint.Style.FILL);
        this.f۱۳۰۳۵d = new Paint(1);
        this.f۱۳۰۳۵d.setStyle(Paint.Style.FILL);
        this.f۱۳۰۴۴m = new Path();
        this.f۱۳۰۴۳l = new RectF();
        this.f۱۳۰۴۸q = new PointF();
        this.f۱۳۰۴۰i = new Matrix();
        int i = this.f۱۳۰۵۳v;
        this.f۱۳۰۳۸g = new RadialGradient(0.0f, 0.0f, 16.0f, new int[]{i, i, 0}, f۱۳۰۲۸F, Shader.TileMode.CLAMP);
        if (this.f۱۳۰۵۰s == 1) {
            this.f۱۳۰۳۹h = new RadialGradient(0.0f, 0.0f, 16.0f, new int[]{0, Ca.m۱۶۴۹۹a(this.f۱۳۰۵۳v, 0.0f), this.f۱۳۰۵۳v}, f۱۳۰۲۸F, Shader.TileMode.CLAMP);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۶۵a(Drawable backgroundDrawable) {
        this.f۱۳۰۴۲k = backgroundDrawable;
        Drawable drawable = this.f۱۳۰۴۲k;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public Drawable m۱۶۴۶۶b() {
        return this.f۱۳۰۴۲k;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۶۳a(int type) {
        this.f۱۳۰۵۵x = type;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۶۴a(int type, int topLeftCornerRadius, int topRightCornerRadius, int bottomRightCornerRadius, int bottomLeftCornerRadius, int left, int top, int right, int bottom) {
        this.f۱۳۰۳۷f = new Cc(type, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, left, top, right, bottom);
    }

    public void setAlpha(int alpha) {
        this.f۱۳۰۴۱j = alpha;
        Drawable drawable = this.f۱۳۰۴۲k;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        }
    }

    public void setColorFilter(ColorFilter filter) {
        Drawable drawable = this.f۱۳۰۴۲k;
        if (drawable != null) {
            drawable.setColorFilter(filter);
        }
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: c  reason: contains not printable characters */
    public long m۱۶۴۶۷c() {
        int i = this.f۱۳۰۵۵x;
        if (i == 0) {
            return -1;
        }
        if (i != 1) {
            if (i == 2) {
                int i2 = this.f۱۳۰۳۲D;
                if (i2 == 3) {
                    return ((long) (Math.max(this.f۱۳۰۴۵n, this.f۱۳۰۵۲u) * 2)) - (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A);
                }
                if (i2 == 4) {
                    return ((long) Math.max(this.f۱۳۰۴۵n, this.f۱۳۰۵۲u)) - (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A);
                }
            }
        } else if (this.f۱۳۰۳۲D == 3) {
            return ((long) Math.max(this.f۱۳۰۴۵n, this.f۱۳۰۵۲u)) - (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A);
        }
        return -1;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۴۵۵b(int state) {
        int i = this.f۱۳۰۳۲D;
        if (i == state) {
            return;
        }
        if (i != 0 || state == 1) {
            this.f۱۳۰۳۲D = state;
            int i2 = this.f۱۳۰۳۲D;
            if (i2 == 0 || i2 == 2) {
                stop();
            } else {
                start();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۶۴۵۴a(float x, float y, float radius) {
        PointF pointF = this.f۱۳۰۴۸q;
        if (pointF.x == x && pointF.y == y && this.f۱۳۰۴۹r == radius) {
            return false;
        }
        this.f۱۳۰۴۸q.set(x, y);
        this.f۱۳۰۴۹r = radius;
        float radius2 = this.f۱۳۰۴۹r / 16.0f;
        this.f۱۳۰۴۰i.reset();
        this.f۱۳۰۴۰i.postTranslate(x, y);
        this.f۱۳۰۴۰i.postScale(radius2, radius2, x, y);
        this.f۱۳۰۳۸g.setLocalMatrix(this.f۱۳۰۴۰i);
        RadialGradient radialGradient = this.f۱۳۰۳۹h;
        if (radialGradient == null) {
            return true;
        }
        radialGradient.setLocalMatrix(this.f۱۳۰۴۰i);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۱۳۰۴۲k;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
        RectF rectF = this.f۱۳۰۴۳l;
        int i = bounds.left;
        Cc cVar = this.f۱۳۰۳۷f;
        rectF.set((float) (i + cVar.f۱۳۰۸۱c), (float) (bounds.top + cVar.f۱۳۰۸۲d), (float) (bounds.right - cVar.f۱۳۰۸۳e), (float) (bounds.bottom - cVar.f۱۳۰۸۴f));
        this.f۱۳۰۴۴m.reset();
        Cc cVar2 = this.f۱۳۰۳۷f;
        int i2 = cVar2.f۱۳۰۷۹a;
        if (i2 == 0) {
            this.f۱۳۰۴۴m.addRoundRect(this.f۱۳۰۴۳l, cVar2.f۱۳۰۸۰b, Path.Direction.CW);
        } else if (i2 == 1) {
            this.f۱۳۰۴۴m.addOval(this.f۱۳۰۴۳l, Path.Direction.CW);
        }
    }

    public boolean isStateful() {
        Drawable drawable = this.f۱۳۰۴۲k;
        return drawable != null && drawable.isStateful();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        Drawable drawable = this.f۱۳۰۴۲k;
        return drawable != null && drawable.setState(state);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f۱۳۰۴۲k;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        int i = this.f۱۳۰۵۰s;
        if (i == -1 || i == 0) {
            m۱۶۴۵۳a(canvas);
        } else if (i == 1) {
            m۱۶۴۵۶b(canvas);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۴۵۳a(Canvas canvas) {
        if (this.f۱۳۰۳۲D != 0) {
            if (this.f۱۳۰۴۷p > 0.0f) {
                this.f۱۳۰۳۶e.setColor(this.f۱۳۰۴۶o);
                this.f۱۳۰۳۶e.setAlpha(Math.round(((float) this.f۱۳۰۴۱j) * this.f۱۳۰۴۷p));
                canvas.drawPath(this.f۱۳۰۴۴m, this.f۱۳۰۳۶e);
            }
            if (this.f۱۳۰۴۹r > 0.0f) {
                float f = this.f۱۳۰۵۴w;
                if (f > 0.0f) {
                    this.f۱۳۰۳۵d.setAlpha(Math.round(((float) this.f۱۳۰۴۱j) * f));
                    this.f۱۳۰۳۵d.setShader(this.f۱۳۰۳۸g);
                    canvas.drawPath(this.f۱۳۰۴۴m, this.f۱۳۰۳۵d);
                }
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۴۵۶b(Canvas canvas) {
        int i = this.f۱۳۰۳۲D;
        if (i == 0) {
            return;
        }
        if (i == 4) {
            if (this.f۱۳۰۴۹r == 0.0f) {
                this.f۱۳۰۳۶e.setColor(this.f۱۳۰۵۳v);
                canvas.drawPath(this.f۱۳۰۴۴m, this.f۱۳۰۳۶e);
                return;
            }
            this.f۱۳۰۳۵d.setShader(this.f۱۳۰۳۹h);
            canvas.drawPath(this.f۱۳۰۴۴m, this.f۱۳۰۳۵d);
        } else if (this.f۱۳۰۴۹r > 0.0f) {
            this.f۱۳۰۳۵d.setShader(this.f۱۳۰۳۸g);
            canvas.drawPath(this.f۱۳۰۴۴m, this.f۱۳۰۳۵d);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۶۴۵۱a(float x, float y) {
        return (int) Math.round(Math.sqrt(Math.pow((double) ((x < this.f۱۳۰۴۳l.centerX() ? this.f۱۳۰۴۳l.right : this.f۱۳۰۴۳l.left) - x), 2.0d) + Math.pow((double) ((y < this.f۱۳۰۴۳l.centerY() ? this.f۱۳۰۴۳l.bottom : this.f۱۳۰۴۳l.top) - y), 2.0d)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 != 3) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.View$OnTouchListenerCc.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۶۲a() {
        m۱۶۴۵۵b(0);
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۶۴۵۹d() {
        this.f۱۳۰۲۹A = SystemClock.uptimeMillis();
    }

    public void start() {
        if (!isRunning()) {
            m۱۶۴۵۹d();
            scheduleSelf(this.f۱۳۰۳۳E, SystemClock.uptimeMillis() + 16);
            invalidateSelf();
        }
    }

    public void stop() {
        this.f۱۳۰۳۴c = false;
        unscheduleSelf(this.f۱۳۰۳۳E);
        invalidateSelf();
    }

    public boolean isRunning() {
        int i = this.f۱۳۰۳۲D;
        return (i == 0 || i == 2 || !this.f۱۳۰۳۴c) ? false : true;
    }

    public void scheduleSelf(Runnable what, long when) {
        this.f۱۳۰۳۴c = true;
        super.scheduleSelf(what, when);
    }

    /* renamed from: b.j.a.e.c$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            int i = View$OnTouchListenerCc.this.f۱۳۰۵۰s;
            if (i == -1 || i == 0) {
                View$OnTouchListenerCc.this.m۱۶۴۶۰e();
            } else if (i == 1) {
                View$OnTouchListenerCc.this.m۱۶۴۶۱f();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e  reason: contains not printable characters */
    private void m۱۶۴۶۰e() {
        int i = 4;
        if (this.f۱۳۰۳۲D != 4) {
            float backgroundProgress = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A)) / ((float) this.f۱۳۰۴۵n));
            this.f۱۳۰۴۷p = (this.f۱۳۰۵۶y.getInterpolation(backgroundProgress) * ((float) Color.alpha(this.f۱۳۰۴۶o))) / 255.0f;
            float touchProgress = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A)) / ((float) this.f۱۳۰۵۲u));
            this.f۱۳۰۵۴w = this.f۱۳۰۵۶y.getInterpolation(touchProgress);
            PointF pointF = this.f۱۳۰۴۸q;
            m۱۶۴۵۴a(pointF.x, pointF.y, ((float) this.f۱۳۰۵۱t) * this.f۱۳۰۵۶y.getInterpolation(touchProgress));
            if (backgroundProgress == 1.0f && touchProgress == 1.0f) {
                this.f۱۳۰۲۹A = SystemClock.uptimeMillis();
                if (this.f۱۳۰۳۲D == 1) {
                    i = 2;
                }
                m۱۶۴۵۵b(i);
            }
        } else {
            float backgroundProgress2 = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A)) / ((float) this.f۱۳۰۴۵n));
            this.f۱۳۰۴۷p = ((1.0f - this.f۱۳۰۵۷z.getInterpolation(backgroundProgress2)) * ((float) Color.alpha(this.f۱۳۰۴۶o))) / 255.0f;
            float touchProgress2 = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A)) / ((float) this.f۱۳۰۵۲u));
            this.f۱۳۰۵۴w = 1.0f - this.f۱۳۰۵۷z.getInterpolation(touchProgress2);
            PointF pointF2 = this.f۱۳۰۴۸q;
            m۱۶۴۵۴a(pointF2.x, pointF2.y, ((float) this.f۱۳۰۵۱t) * ((this.f۱۳۰۵۷z.getInterpolation(touchProgress2) * 0.5f) + 1.0f));
            if (backgroundProgress2 == 1.0f && touchProgress2 == 1.0f) {
                m۱۶۴۵۵b(0);
            }
        }
        if (isRunning()) {
            scheduleSelf(this.f۱۳۰۳۳E, SystemClock.uptimeMillis() + 16);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f  reason: contains not printable characters */
    private void m۱۶۴۶۱f() {
        float progress = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A)) / ((float) this.f۱۳۰۵۲u));
        if (this.f۱۳۰۳۲D != 4) {
            PointF pointF = this.f۱۳۰۴۸q;
            m۱۶۴۵۴a(pointF.x, pointF.y, ((float) this.f۱۳۰۵۱t) * this.f۱۳۰۵۶y.getInterpolation(progress));
            if (progress == 1.0f) {
                this.f۱۳۰۲۹A = SystemClock.uptimeMillis();
                if (this.f۱۳۰۳۲D == 1) {
                    m۱۶۴۵۵b(2);
                } else {
                    PointF pointF2 = this.f۱۳۰۴۸q;
                    m۱۶۴۵۴a(pointF2.x, pointF2.y, 0.0f);
                    m۱۶۴۵۵b(4);
                }
            }
        } else {
            PointF pointF3 = this.f۱۳۰۴۸q;
            m۱۶۴۵۴a(pointF3.x, pointF3.y, ((float) this.f۱۳۰۵۱t) * this.f۱۳۰۵۷z.getInterpolation(progress));
            if (progress == 1.0f) {
                m۱۶۴۵۵b(0);
            }
        }
        if (isRunning()) {
            scheduleSelf(this.f۱۳۰۳۳E, SystemClock.uptimeMillis() + 16);
        }
        invalidateSelf();
    }

    /* renamed from: b.j.a.e.c$c  reason: invalid class name */
    public static class Cc {

        /* renamed from: a  reason: contains not printable characters */
        final int f۱۳۰۷۹a;

        /* renamed from: b  reason: contains not printable characters */
        final float[] f۱۳۰۸۰b = new float[8];

        /* renamed from: c  reason: contains not printable characters */
        final int f۱۳۰۸۱c;

        /* renamed from: d  reason: contains not printable characters */
        final int f۱۳۰۸۲d;

        /* renamed from: e  reason: contains not printable characters */
        final int f۱۳۰۸۳e;

        /* renamed from: f  reason: contains not printable characters */
        final int f۱۳۰۸۴f;

        public Cc(int type, int topLeftCornerRadius, int topRightCornerRadius, int bottomRightCornerRadius, int bottomLeftCornerRadius, int left, int top, int right, int bottom) {
            this.f۱۳۰۷۹a = type;
            float[] fArr = this.f۱۳۰۸۰b;
            fArr[0] = (float) topLeftCornerRadius;
            fArr[1] = (float) topLeftCornerRadius;
            fArr[2] = (float) topRightCornerRadius;
            fArr[3] = (float) topRightCornerRadius;
            fArr[4] = (float) bottomRightCornerRadius;
            fArr[5] = (float) bottomRightCornerRadius;
            fArr[6] = (float) bottomLeftCornerRadius;
            fArr[7] = (float) bottomLeftCornerRadius;
            this.f۱۳۰۸۱c = left;
            this.f۱۳۰۸۲d = top;
            this.f۱۳۰۸۳e = right;
            this.f۱۳۰۸۴f = bottom;
        }
    }

    /* renamed from: b.j.a.e.c$b  reason: invalid class name */
    public static class Cb {

        /* renamed from: a  reason: contains not printable characters */
        private Drawable f۱۳۰۵۹a;

        /* renamed from: b  reason: contains not printable characters */
        private int f۱۳۰۶۰b;

        /* renamed from: c  reason: contains not printable characters */
        private int f۱۳۰۶۱c;

        /* renamed from: d  reason: contains not printable characters */
        private int f۱۳۰۶۲d;

        /* renamed from: e  reason: contains not printable characters */
        private int f۱۳۰۶۳e;

        /* renamed from: f  reason: contains not printable characters */
        private int f۱۳۰۶۴f;

        /* renamed from: g  reason: contains not printable characters */
        private int f۱۳۰۶۵g;

        /* renamed from: h  reason: contains not printable characters */
        private int f۱۳۰۶۶h;

        /* renamed from: i  reason: contains not printable characters */
        private int f۱۳۰۶۷i;

        /* renamed from: j  reason: contains not printable characters */
        private Interpolator f۱۳۰۶۸j;

        /* renamed from: k  reason: contains not printable characters */
        private Interpolator f۱۳۰۶۹k;

        /* renamed from: l  reason: contains not printable characters */
        private int f۱۳۰۷۰l;

        /* renamed from: m  reason: contains not printable characters */
        private int f۱۳۰۷۱m;

        /* renamed from: n  reason: contains not printable characters */
        private int f۱۳۰۷۲n;

        /* renamed from: o  reason: contains not printable characters */
        private int f۱۳۰۷۳o;

        /* renamed from: p  reason: contains not printable characters */
        private int f۱۳۰۷۴p;

        /* renamed from: q  reason: contains not printable characters */
        private int f۱۳۰۷۵q;

        /* renamed from: r  reason: contains not printable characters */
        private int f۱۳۰۷۶r;

        /* renamed from: s  reason: contains not printable characters */
        private int f۱۳۰۷۷s;

        /* renamed from: t  reason: contains not printable characters */
        private int f۱۳۰۷۸t;

        public Cb(Context context, int defStyleRes) {
            this(context, null, 0, defStyleRes);
        }

        public Cb(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            this.f۱۳۰۶۰b = 200;
            this.f۱۳۰۶۴f = 400;
            TypedArray a = context.obtainStyledAttributes(attrs, p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable, defStyleAttr, defStyleRes);
            m۱۶۴۷۲b(a.getColor(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_backgroundColor, 0));
            m۱۶۴۶۸a(a.getInteger(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_backgroundAnimDuration, context.getResources().getInteger(17694721)));
            m۱۶۴۸۷p(a.getInteger(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_rippleType, 0));
            m۱۶۴۷۸g(a.getInteger(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_delayClick, 0));
            m۱۶۴۷۹h(a.getInteger(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_delayRipple, 0));
            int type = p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f.Cb.m۱۶۵۰۲a(a, p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_maxRippleRadius);
            if (type < 16 || type > 31) {
                m۱۶۴۸۲k(a.getDimensionPixelSize(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_maxRippleRadius, p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f.Cb.m۱۶۵۰۵d(context, 48)));
            } else {
                m۱۶۴۸۲k(a.getInteger(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_maxRippleRadius, -1));
            }
            m۱۶۴۸۶o(a.getColor(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_rippleColor, p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f.Cb.m۱۶۵۰۳b(context, 0)));
            m۱۶۴۸۵n(a.getInteger(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_rippleAnimDuration, context.getResources().getInteger(17694721)));
            int resId = a.getResourceId(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_inInterpolator, 0);
            if (resId != 0) {
                m۱۶۴۷۰a(AnimationUtils.loadInterpolator(context, resId));
            }
            int resId2 = a.getResourceId(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_outInterpolator, 0);
            if (resId2 != 0) {
                m۱۶۴۷۳b(AnimationUtils.loadInterpolator(context, resId2));
            }
            m۱۶۴۸۱j(a.getInteger(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_maskType, 0));
            m۱۶۴۷۷f(a.getDimensionPixelSize(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_cornerRadius, 0));
            m۱۶۴۸۹r(a.getDimensionPixelSize(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_topLeftCornerRadius, this.f۱۳۰۷۱m));
            m۱۶۴۹۰s(a.getDimensionPixelSize(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_topRightCornerRadius, this.f۱۳۰۷۲n));
            m۱۶۴۷۶e(a.getDimensionPixelSize(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_bottomRightCornerRadius, this.f۱۳۰۷۴p));
            m۱۶۴۷۵d(a.getDimensionPixelSize(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_bottomLeftCornerRadius, this.f۱۳۰۷۳o));
            m۱۶۴۸۳l(a.getDimensionPixelSize(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_padding, 0));
            m۱۶۴۸۰i(a.getDimensionPixelSize(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_leftPadding, this.f۱۳۰۷۵q));
            m۱۶۴۸۴m(a.getDimensionPixelSize(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_rightPadding, this.f۱۳۰۷۷s));
            m۱۶۴۸۸q(a.getDimensionPixelSize(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_topPadding, this.f۱۳۰۷۶r));
            m۱۶۴۷۴c(a.getDimensionPixelSize(p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc.RippleDrawable_rd_bottomPadding, this.f۱۳۰۷۸t));
            a.recycle();
        }

        /* renamed from: a  reason: contains not printable characters */
        public View$OnTouchListenerCc m۱۶۴۷۱a() {
            if (this.f۱۳۰۶۸j == null) {
                this.f۱۳۰۶۸j = new AccelerateInterpolator();
            }
            if (this.f۱۳۰۶۹k == null) {
                this.f۱۳۰۶۹k = new DecelerateInterpolator();
            }
            return new View$OnTouchListenerCc(this.f۱۳۰۵۹a, this.f۱۳۰۶۰b, this.f۱۳۰۶۱c, this.f۱۳۰۶۲d, this.f۱۳۰۶۶h, this.f۱۳۰۶۷i, this.f۱۳۰۶۳e, this.f۱۳۰۶۴f, this.f۱۳۰۶۵g, this.f۱۳۰۶۸j, this.f۱۳۰۶۹k, this.f۱۳۰۷۰l, this.f۱۳۰۷۱m, this.f۱۳۰۷۲n, this.f۱۳۰۷۴p, this.f۱۳۰۷۳o, this.f۱۳۰۷۵q, this.f۱۳۰۷۶r, this.f۱۳۰۷۷s, this.f۱۳۰۷۸t, null);
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cb m۱۶۴۶۹a(Drawable drawable) {
            this.f۱۳۰۵۹a = drawable;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cb m۱۶۴۶۸a(int duration) {
            this.f۱۳۰۶۰b = duration;
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cb m۱۶۴۷۲b(int color) {
            this.f۱۳۰۶۱c = color;
            return this;
        }

        /* renamed from: p  reason: contains not printable characters */
        public Cb m۱۶۴۸۷p(int type) {
            this.f۱۳۰۶۲d = type;
            return this;
        }

        /* renamed from: g  reason: contains not printable characters */
        public Cb m۱۶۴۷۸g(int type) {
            this.f۱۳۰۶۶h = type;
            return this;
        }

        /* renamed from: h  reason: contains not printable characters */
        public Cb m۱۶۴۷۹h(int time) {
            this.f۱۳۰۶۷i = time;
            return this;
        }

        /* renamed from: k  reason: contains not printable characters */
        public Cb m۱۶۴۸۲k(int radius) {
            this.f۱۳۰۶۳e = radius;
            return this;
        }

        /* renamed from: n  reason: contains not printable characters */
        public Cb m۱۶۴۸۵n(int duration) {
            this.f۱۳۰۶۴f = duration;
            return this;
        }

        /* renamed from: o  reason: contains not printable characters */
        public Cb m۱۶۴۸۶o(int color) {
            this.f۱۳۰۶۵g = color;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cb m۱۶۴۷۰a(Interpolator interpolator) {
            this.f۱۳۰۶۸j = interpolator;
            return this;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Cb m۱۶۴۷۳b(Interpolator interpolator) {
            this.f۱۳۰۶۹k = interpolator;
            return this;
        }

        /* renamed from: j  reason: contains not printable characters */
        public Cb m۱۶۴۸۱j(int type) {
            this.f۱۳۰۷۰l = type;
            return this;
        }

        /* renamed from: f  reason: contains not printable characters */
        public Cb m۱۶۴۷۷f(int radius) {
            this.f۱۳۰۷۱m = radius;
            this.f۱۳۰۷۲n = radius;
            this.f۱۳۰۷۳o = radius;
            this.f۱۳۰۷۴p = radius;
            return this;
        }

        /* renamed from: r  reason: contains not printable characters */
        public Cb m۱۶۴۸۹r(int radius) {
            this.f۱۳۰۷۱m = radius;
            return this;
        }

        /* renamed from: s  reason: contains not printable characters */
        public Cb m۱۶۴۹۰s(int radius) {
            this.f۱۳۰۷۲n = radius;
            return this;
        }

        /* renamed from: d  reason: contains not printable characters */
        public Cb m۱۶۴۷۵d(int radius) {
            this.f۱۳۰۷۳o = radius;
            return this;
        }

        /* renamed from: e  reason: contains not printable characters */
        public Cb m۱۶۴۷۶e(int radius) {
            this.f۱۳۰۷۴p = radius;
            return this;
        }

        /* renamed from: l  reason: contains not printable characters */
        public Cb m۱۶۴۸۳l(int padding) {
            this.f۱۳۰۷۵q = padding;
            this.f۱۳۰۷۶r = padding;
            this.f۱۳۰۷۷s = padding;
            this.f۱۳۰۷۸t = padding;
            return this;
        }

        /* renamed from: i  reason: contains not printable characters */
        public Cb m۱۶۴۸۰i(int padding) {
            this.f۱۳۰۷۵q = padding;
            return this;
        }

        /* renamed from: q  reason: contains not printable characters */
        public Cb m۱۶۴۸۸q(int padding) {
            this.f۱۳۰۷۶r = padding;
            return this;
        }

        /* renamed from: m  reason: contains not printable characters */
        public Cb m۱۶۴۸۴m(int padding) {
            this.f۱۳۰۷۷s = padding;
            return this;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Cb m۱۶۴۷۴c(int padding) {
            this.f۱۳۰۷۸t = padding;
            return this;
        }
    }
}
