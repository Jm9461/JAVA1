package p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۰e;

import android.R;
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
import p۲۰۸b.p۲۶۷j.p۲۶۸a.Cc;
import p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۱f.Ca;
import p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۱f.Cb;

/* renamed from: b.j.a.e.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ViewOnTouchListenerCc extends Drawable implements Animatable, View.OnTouchListener {

    /* renamed from: F, reason: contains not printable characters */
    private static final float[] f۱۳۰۲۸F = {0.0f, 0.99f, 1.0f};

    /* renamed from: A, reason: contains not printable characters */
    private long f۱۳۰۲۹A;

    /* renamed from: B, reason: contains not printable characters */
    private long f۱۳۰۳۰B;

    /* renamed from: C, reason: contains not printable characters */
    private int f۱۳۰۳۱C;

    /* renamed from: D, reason: contains not printable characters */
    private int f۱۳۰۳۲D;

    /* renamed from: E, reason: contains not printable characters */
    private final Runnable f۱۳۰۳۳E;

    /* renamed from: c, reason: contains not printable characters */
    private boolean f۱۳۰۳۴c;

    /* renamed from: d, reason: contains not printable characters */
    private Paint f۱۳۰۳۵d;

    /* renamed from: e, reason: contains not printable characters */
    private Paint f۱۳۰۳۶e;

    /* renamed from: f, reason: contains not printable characters */
    private c f۱۳۰۳۷f;

    /* renamed from: g, reason: contains not printable characters */
    private RadialGradient f۱۳۰۳۸g;

    /* renamed from: h, reason: contains not printable characters */
    private RadialGradient f۱۳۰۳۹h;

    /* renamed from: i, reason: contains not printable characters */
    private Matrix f۱۳۰۴۰i;

    /* renamed from: j, reason: contains not printable characters */
    private int f۱۳۰۴۱j;

    /* renamed from: k, reason: contains not printable characters */
    private Drawable f۱۳۰۴۲k;

    /* renamed from: l, reason: contains not printable characters */
    private RectF f۱۳۰۴۳l;

    /* renamed from: m, reason: contains not printable characters */
    private Path f۱۳۰۴۴m;

    /* renamed from: n, reason: contains not printable characters */
    private int f۱۳۰۴۵n;

    /* renamed from: o, reason: contains not printable characters */
    private int f۱۳۰۴۶o;

    /* renamed from: p, reason: contains not printable characters */
    private float f۱۳۰۴۷p;

    /* renamed from: q, reason: contains not printable characters */
    private PointF f۱۳۰۴۸q;

    /* renamed from: r, reason: contains not printable characters */
    private float f۱۳۰۴۹r;

    /* renamed from: s, reason: contains not printable characters */
    private int f۱۳۰۵۰s;

    /* renamed from: t, reason: contains not printable characters */
    private int f۱۳۰۵۱t;

    /* renamed from: u, reason: contains not printable characters */
    private int f۱۳۰۵۲u;

    /* renamed from: v, reason: contains not printable characters */
    private int f۱۳۰۵۳v;

    /* renamed from: w, reason: contains not printable characters */
    private float f۱۳۰۵۴w;

    /* renamed from: x, reason: contains not printable characters */
    private int f۱۳۰۵۵x;

    /* renamed from: y, reason: contains not printable characters */
    private Interpolator f۱۳۰۵۶y;

    /* renamed from: z, reason: contains not printable characters */
    private Interpolator f۱۳۰۵۷z;

    /* synthetic */ ViewOnTouchListenerCc(Drawable x0, int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, Interpolator x9, Interpolator x10, int x11, int x12, int x13, int x14, int x15, int x16, int x17, int x18, int x19, a x20) {
        this(x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19);
    }

    private ViewOnTouchListenerCc(Drawable backgroundDrawable, int backgroundAnimDuration, int backgroundColor, int rippleType, int delayClickType, int delayRippleTime, int maxRippleRadius, int rippleAnimDuration, int rippleColor, Interpolator inInterpolator, Interpolator outInterpolator, int type, int topLeftCornerRadius, int topRightCornerRadius, int bottomRightCornerRadius, int bottomLeftCornerRadius, int left, int top, int right, int bottom) {
        this.f۱۳۰۳۴c = false;
        this.f۱۳۰۴۱j = 255;
        this.f۱۳۰۳۲D = 0;
        this.f۱۳۰۳۳E = new a();
        m۱۴۳۹۰a(backgroundDrawable);
        this.f۱۳۰۴۵n = backgroundAnimDuration;
        this.f۱۳۰۴۶o = backgroundColor;
        this.f۱۳۰۵۰s = rippleType;
        m۱۴۳۸۸a(delayClickType);
        this.f۱۳۰۳۱C = delayRippleTime;
        this.f۱۳۰۵۱t = maxRippleRadius;
        this.f۱۳۰۵۲u = rippleAnimDuration;
        this.f۱۳۰۵۳v = rippleColor;
        if (this.f۱۳۰۵۰s == 0 && this.f۱۳۰۵۱t <= 0) {
            this.f۱۳۰۵۰s = -1;
        }
        this.f۱۳۰۵۶y = inInterpolator;
        this.f۱۳۰۵۷z = outInterpolator;
        m۱۴۳۸۹a(type, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, left, top, right, bottom);
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
            this.f۱۳۰۳۹h = new RadialGradient(0.0f, 0.0f, 16.0f, new int[]{0, Ca.m۱۴۴۲۴a(this.f۱۳۰۵۳v, 0.0f), this.f۱۳۰۵۳v}, f۱۳۰۲۸F, Shader.TileMode.CLAMP);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۹۰a(Drawable backgroundDrawable) {
        this.f۱۳۰۴۲k = backgroundDrawable;
        Drawable drawable = this.f۱۳۰۴۲k;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public Drawable m۱۴۳۹۱b() {
        return this.f۱۳۰۴۲k;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۸۸a(int type) {
        this.f۱۳۰۵۵x = type;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۸۹a(int type, int topLeftCornerRadius, int topRightCornerRadius, int bottomRightCornerRadius, int bottomLeftCornerRadius, int left, int top, int right, int bottom) {
        this.f۱۳۰۳۷f = new c(type, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, left, top, right, bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f۱۳۰۴۱j = alpha;
        Drawable drawable = this.f۱۳۰۴۲k;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter filter) {
        Drawable drawable = this.f۱۳۰۴۲k;
        if (drawable != null) {
            drawable.setColorFilter(filter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: c, reason: contains not printable characters */
    public long m۱۴۳۹۲c() {
        int i = this.f۱۳۰۵۵x;
        if (i == 0) {
            return -1L;
        }
        if (i != 1) {
            if (i == 2) {
                int i2 = this.f۱۳۰۳۲D;
                if (i2 == 3) {
                    return (Math.max(this.f۱۳۰۴۵n, this.f۱۳۰۵۲u) * 2) - (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A);
                }
                if (i2 == 4) {
                    return Math.max(this.f۱۳۰۴۵n, this.f۱۳۰۵۲u) - (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A);
                }
            }
        } else if (this.f۱۳۰۳۲D == 3) {
            return Math.max(this.f۱۳۰۴۵n, this.f۱۳۰۵۲u) - (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A);
        }
        return -1L;
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۴۳۸۰b(int state) {
        int i = this.f۱۳۰۳۲D;
        if (i != state) {
            if (i == 0 && state != 1) {
                return;
            }
            this.f۱۳۰۳۲D = state;
            int i2 = this.f۱۳۰۳۲D;
            if (i2 == 0 || i2 == 2) {
                stop();
            } else {
                start();
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۴۳۷۹a(float x, float y, float radius) {
        PointF pointF = this.f۱۳۰۴۸q;
        if (pointF.x != x || pointF.y != y || this.f۱۳۰۴۹r != radius) {
            this.f۱۳۰۴۸q.set(x, y);
            this.f۱۳۰۴۹r = radius;
            float radius2 = this.f۱۳۰۴۹r / 16.0f;
            this.f۱۳۰۴۰i.reset();
            this.f۱۳۰۴۰i.postTranslate(x, y);
            this.f۱۳۰۴۰i.postScale(radius2, radius2, x, y);
            this.f۱۳۰۳۸g.setLocalMatrix(this.f۱۳۰۴۰i);
            RadialGradient radialGradient = this.f۱۳۰۳۹h;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(this.f۱۳۰۴۰i);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۱۳۰۴۲k;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
        RectF rectF = this.f۱۳۰۴۳l;
        int i = bounds.left;
        c cVar = this.f۱۳۰۳۷f;
        rectF.set(i + cVar.f۱۳۰۸۱c, bounds.top + cVar.f۱۳۰۸۲d, bounds.right - cVar.f۱۳۰۸۳e, bounds.bottom - cVar.f۱۳۰۸۴f);
        this.f۱۳۰۴۴m.reset();
        c cVar2 = this.f۱۳۰۳۷f;
        int i2 = cVar2.f۱۳۰۷۹a;
        if (i2 == 0) {
            this.f۱۳۰۴۴m.addRoundRect(this.f۱۳۰۴۳l, cVar2.f۱۳۰۸۰b, Path.Direction.CW);
        } else if (i2 == 1) {
            this.f۱۳۰۴۴m.addOval(this.f۱۳۰۴۳l, Path.Direction.CW);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f۱۳۰۴۲k;
        return drawable != null && drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        Drawable drawable = this.f۱۳۰۴۲k;
        return drawable != null && drawable.setState(state);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f۱۳۰۴۲k;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        int i = this.f۱۳۰۵۰s;
        if (i == -1 || i == 0) {
            m۱۴۳۷۸a(canvas);
        } else if (i == 1) {
            m۱۴۳۸۱b(canvas);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۴۳۷۸a(Canvas canvas) {
        if (this.f۱۳۰۳۲D != 0) {
            if (this.f۱۳۰۴۷p > 0.0f) {
                this.f۱۳۰۳۶e.setColor(this.f۱۳۰۴۶o);
                this.f۱۳۰۳۶e.setAlpha(Math.round(this.f۱۳۰۴۱j * this.f۱۳۰۴۷p));
                canvas.drawPath(this.f۱۳۰۴۴m, this.f۱۳۰۳۶e);
            }
            if (this.f۱۳۰۴۹r > 0.0f) {
                float f2 = this.f۱۳۰۵۴w;
                if (f2 > 0.0f) {
                    this.f۱۳۰۳۵d.setAlpha(Math.round(this.f۱۳۰۴۱j * f2));
                    this.f۱۳۰۳۵d.setShader(this.f۱۳۰۳۸g);
                    canvas.drawPath(this.f۱۳۰۴۴m, this.f۱۳۰۳۵d);
                }
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۴۳۸۱b(Canvas canvas) {
        int i = this.f۱۳۰۳۲D;
        if (i != 0) {
            if (i != 4) {
                if (this.f۱۳۰۴۹r > 0.0f) {
                    this.f۱۳۰۳۵d.setShader(this.f۱۳۰۳۸g);
                    canvas.drawPath(this.f۱۳۰۴۴m, this.f۱۳۰۳۵d);
                    return;
                }
                return;
            }
            if (this.f۱۳۰۴۹r == 0.0f) {
                this.f۱۳۰۳۶e.setColor(this.f۱۳۰۵۳v);
                canvas.drawPath(this.f۱۳۰۴۴m, this.f۱۳۰۳۶e);
            } else {
                this.f۱۳۰۳۵d.setShader(this.f۱۳۰۳۹h);
                canvas.drawPath(this.f۱۳۰۴۴m, this.f۱۳۰۳۵d);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private int m۱۴۳۷۶a(float x, float y) {
        float x1 = x < this.f۱۳۰۴۳l.centerX() ? this.f۱۳۰۴۳l.right : this.f۱۳۰۴۳l.left;
        float y1 = y < this.f۱۳۰۴۳l.centerY() ? this.f۱۳۰۴۳l.bottom : this.f۱۳۰۴۳l.top;
        return (int) Math.round(Math.sqrt(Math.pow(x1 - x, 2.0d) + Math.pow(y1 - y, 2.0d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0 != 3) goto L۴۷;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            int r0 = r13.getAction()
            r1 = 0
            r2 = 4
            r3 = -1
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L56
            r7 = 3
            r8 = 2
            if (r0 == r6) goto L16
            if (r0 == r8) goto L56
            if (r0 == r7) goto L37
            goto Laf
        L16:
            long r9 = r11.f۱۳۰۳۰B
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L37
            int r0 = r11.f۱۳۰۳۲D
            if (r0 != 0) goto L37
            int r0 = r11.f۱۳۰۵۰s
            if (r0 == r6) goto L26
            if (r0 != r3) goto L34
        L26:
            float r0 = r13.getX()
            float r9 = r13.getY()
            int r0 = r11.m۱۴۳۷۶a(r0, r9)
            r11.f۱۳۰۵۱t = r0
        L34:
            r11.m۱۴۳۸۰b(r6)
        L37:
            r11.f۱۳۰۳۰B = r4
            int r0 = r11.f۱۳۰۳۲D
            if (r0 == 0) goto Laf
            if (r0 != r8) goto L52
            int r0 = r11.f۱۳۰۵۰s
            if (r0 == r6) goto L45
            if (r0 != r3) goto L4e
        L45:
            android.graphics.PointF r0 = r11.f۱۳۰۴۸q
            float r3 = r0.x
            float r0 = r0.y
            r11.m۱۴۳۷۹a(r3, r0, r1)
        L4e:
            r11.m۱۴۳۸۰b(r2)
            goto Laf
        L52:
            r11.m۱۴۳۸۰b(r7)
            goto Laf
        L56:
            int r0 = r11.f۱۳۰۳۲D
            if (r0 == 0) goto L75
            if (r0 != r2) goto L5d
            goto L75
        L5d:
            int r0 = r11.f۱۳۰۵۰s
            if (r0 != 0) goto Laf
            float r0 = r13.getX()
            float r1 = r13.getY()
            float r2 = r11.f۱۳۰۴۹r
            boolean r0 = r11.m۱۴۳۷۹a(r0, r1, r2)
            if (r0 == 0) goto Laf
            r11.invalidateSelf()
            goto Laf
        L75:
            long r7 = android.os.SystemClock.uptimeMillis()
            long r9 = r11.f۱۳۰۳۰B
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 != 0) goto L81
            r11.f۱۳۰۳۰B = r7
        L81:
            float r0 = r13.getX()
            float r2 = r13.getY()
            r11.m۱۴۳۷۹a(r0, r2, r1)
            long r0 = r11.f۱۳۰۳۰B
            int r2 = r11.f۱۳۰۳۱C
            long r4 = (long) r2
            long r4 = r7 - r4
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto Lae
            int r0 = r11.f۱۳۰۵۰s
            if (r0 == r6) goto L9d
            if (r0 != r3) goto Lab
        L9d:
            float r0 = r13.getX()
            float r1 = r13.getY()
            int r0 = r11.m۱۴۳۷۶a(r0, r1)
            r11.f۱۳۰۵۱t = r0
        Lab:
            r11.m۱۴۳۸۰b(r6)
        Lae:
        Laf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۰e.ViewOnTouchListenerCc.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۸۷a() {
        m۱۴۳۸۰b(0);
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۴۳۸۴d() {
        this.f۱۳۰۲۹A = SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (isRunning()) {
            return;
        }
        m۱۴۳۸۴d();
        scheduleSelf(this.f۱۳۰۳۳E, SystemClock.uptimeMillis() + 16);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f۱۳۰۳۴c = false;
        unscheduleSelf(this.f۱۳۰۳۳E);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        int i = this.f۱۳۰۳۲D;
        return (i == 0 || i == 2 || !this.f۱۳۰۳۴c) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable what, long when) {
        this.f۱۳۰۳۴c = true;
        super.scheduleSelf(what, when);
    }

    /* renamed from: b.j.a.e.c$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = ViewOnTouchListenerCc.this.f۱۳۰۵۰s;
            if (i == -1 || i == 0) {
                ViewOnTouchListenerCc.this.m۱۴۳۸۵e();
            } else if (i == 1) {
                ViewOnTouchListenerCc.this.m۱۴۳۸۶f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: contains not printable characters */
    public void m۱۴۳۸۵e() {
        if (this.f۱۳۰۳۲D != 4) {
            float backgroundProgress = Math.min(1.0f, (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A) / this.f۱۳۰۴۵n);
            this.f۱۳۰۴۷p = (this.f۱۳۰۵۶y.getInterpolation(backgroundProgress) * Color.alpha(this.f۱۳۰۴۶o)) / 255.0f;
            float touchProgress = Math.min(1.0f, (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A) / this.f۱۳۰۵۲u);
            this.f۱۳۰۵۴w = this.f۱۳۰۵۶y.getInterpolation(touchProgress);
            PointF pointF = this.f۱۳۰۴۸q;
            m۱۴۳۷۹a(pointF.x, pointF.y, this.f۱۳۰۵۱t * this.f۱۳۰۵۶y.getInterpolation(touchProgress));
            if (backgroundProgress == 1.0f && touchProgress == 1.0f) {
                this.f۱۳۰۲۹A = SystemClock.uptimeMillis();
                m۱۴۳۸۰b(this.f۱۳۰۳۲D == 1 ? 2 : 4);
            }
        } else {
            float backgroundProgress2 = Math.min(1.0f, (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A) / this.f۱۳۰۴۵n);
            this.f۱۳۰۴۷p = ((1.0f - this.f۱۳۰۵۷z.getInterpolation(backgroundProgress2)) * Color.alpha(this.f۱۳۰۴۶o)) / 255.0f;
            float touchProgress2 = Math.min(1.0f, (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A) / this.f۱۳۰۵۲u);
            this.f۱۳۰۵۴w = 1.0f - this.f۱۳۰۵۷z.getInterpolation(touchProgress2);
            PointF pointF2 = this.f۱۳۰۴۸q;
            m۱۴۳۷۹a(pointF2.x, pointF2.y, this.f۱۳۰۵۱t * ((this.f۱۳۰۵۷z.getInterpolation(touchProgress2) * 0.5f) + 1.0f));
            if (backgroundProgress2 == 1.0f && touchProgress2 == 1.0f) {
                m۱۴۳۸۰b(0);
            }
        }
        if (isRunning()) {
            scheduleSelf(this.f۱۳۰۳۳E, SystemClock.uptimeMillis() + 16);
        }
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: contains not printable characters */
    public void m۱۴۳۸۶f() {
        float progress = Math.min(1.0f, (SystemClock.uptimeMillis() - this.f۱۳۰۲۹A) / this.f۱۳۰۵۲u);
        if (this.f۱۳۰۳۲D != 4) {
            PointF pointF = this.f۱۳۰۴۸q;
            m۱۴۳۷۹a(pointF.x, pointF.y, this.f۱۳۰۵۱t * this.f۱۳۰۵۶y.getInterpolation(progress));
            if (progress == 1.0f) {
                this.f۱۳۰۲۹A = SystemClock.uptimeMillis();
                if (this.f۱۳۰۳۲D == 1) {
                    m۱۴۳۸۰b(2);
                } else {
                    PointF pointF2 = this.f۱۳۰۴۸q;
                    m۱۴۳۷۹a(pointF2.x, pointF2.y, 0.0f);
                    m۱۴۳۸۰b(4);
                }
            }
        } else {
            PointF pointF3 = this.f۱۳۰۴۸q;
            m۱۴۳۷۹a(pointF3.x, pointF3.y, this.f۱۳۰۵۱t * this.f۱۳۰۵۷z.getInterpolation(progress));
            if (progress == 1.0f) {
                m۱۴۳۸۰b(0);
            }
        }
        if (isRunning()) {
            scheduleSelf(this.f۱۳۰۳۳E, SystemClock.uptimeMillis() + 16);
        }
        invalidateSelf();
    }

    /* renamed from: b.j.a.e.c$c */
    public static class c {

        /* renamed from: a, reason: contains not printable characters */
        final int f۱۳۰۷۹a;

        /* renamed from: b, reason: contains not printable characters */
        final float[] f۱۳۰۸۰b = new float[8];

        /* renamed from: c, reason: contains not printable characters */
        final int f۱۳۰۸۱c;

        /* renamed from: d, reason: contains not printable characters */
        final int f۱۳۰۸۲d;

        /* renamed from: e, reason: contains not printable characters */
        final int f۱۳۰۸۳e;

        /* renamed from: f, reason: contains not printable characters */
        final int f۱۳۰۸۴f;

        public c(int type, int topLeftCornerRadius, int topRightCornerRadius, int bottomRightCornerRadius, int bottomLeftCornerRadius, int left, int top, int right, int bottom) {
            this.f۱۳۰۷۹a = type;
            float[] fArr = this.f۱۳۰۸۰b;
            fArr[0] = topLeftCornerRadius;
            fArr[1] = topLeftCornerRadius;
            fArr[2] = topRightCornerRadius;
            fArr[3] = topRightCornerRadius;
            fArr[4] = bottomRightCornerRadius;
            fArr[5] = bottomRightCornerRadius;
            fArr[6] = bottomLeftCornerRadius;
            fArr[7] = bottomLeftCornerRadius;
            this.f۱۳۰۸۱c = left;
            this.f۱۳۰۸۲d = top;
            this.f۱۳۰۸۳e = right;
            this.f۱۳۰۸۴f = bottom;
        }
    }

    /* renamed from: b.j.a.e.c$b */
    public static class b {

        /* renamed from: a, reason: contains not printable characters */
        private Drawable f۱۳۰۵۹a;

        /* renamed from: b, reason: contains not printable characters */
        private int f۱۳۰۶۰b;

        /* renamed from: c, reason: contains not printable characters */
        private int f۱۳۰۶۱c;

        /* renamed from: d, reason: contains not printable characters */
        private int f۱۳۰۶۲d;

        /* renamed from: e, reason: contains not printable characters */
        private int f۱۳۰۶۳e;

        /* renamed from: f, reason: contains not printable characters */
        private int f۱۳۰۶۴f;

        /* renamed from: g, reason: contains not printable characters */
        private int f۱۳۰۶۵g;

        /* renamed from: h, reason: contains not printable characters */
        private int f۱۳۰۶۶h;

        /* renamed from: i, reason: contains not printable characters */
        private int f۱۳۰۶۷i;

        /* renamed from: j, reason: contains not printable characters */
        private Interpolator f۱۳۰۶۸j;

        /* renamed from: k, reason: contains not printable characters */
        private Interpolator f۱۳۰۶۹k;

        /* renamed from: l, reason: contains not printable characters */
        private int f۱۳۰۷۰l;

        /* renamed from: m, reason: contains not printable characters */
        private int f۱۳۰۷۱m;

        /* renamed from: n, reason: contains not printable characters */
        private int f۱۳۰۷۲n;

        /* renamed from: o, reason: contains not printable characters */
        private int f۱۳۰۷۳o;

        /* renamed from: p, reason: contains not printable characters */
        private int f۱۳۰۷۴p;

        /* renamed from: q, reason: contains not printable characters */
        private int f۱۳۰۷۵q;

        /* renamed from: r, reason: contains not printable characters */
        private int f۱۳۰۷۶r;

        /* renamed from: s, reason: contains not printable characters */
        private int f۱۳۰۷۷s;

        /* renamed from: t, reason: contains not printable characters */
        private int f۱۳۰۷۸t;

        public b(Context context, int defStyleRes) {
            this(context, null, 0, defStyleRes);
        }

        public b(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            this.f۱۳۰۶۰b = 200;
            this.f۱۳۰۶۴f = 400;
            TypedArray a2 = context.obtainStyledAttributes(attrs, Cc.RippleDrawable, defStyleAttr, defStyleRes);
            m۱۴۳۹۷b(a2.getColor(Cc.RippleDrawable_rd_backgroundColor, 0));
            m۱۴۳۹۳a(a2.getInteger(Cc.RippleDrawable_rd_backgroundAnimDuration, context.getResources().getInteger(R.integer.config_mediumAnimTime)));
            m۱۴۴۱۲p(a2.getInteger(Cc.RippleDrawable_rd_rippleType, 0));
            m۱۴۴۰۳g(a2.getInteger(Cc.RippleDrawable_rd_delayClick, 0));
            m۱۴۴۰۴h(a2.getInteger(Cc.RippleDrawable_rd_delayRipple, 0));
            int type = Cb.m۱۴۴۲۷a(a2, Cc.RippleDrawable_rd_maxRippleRadius);
            if (type >= 16 && type <= 31) {
                m۱۴۴۰۷k(a2.getInteger(Cc.RippleDrawable_rd_maxRippleRadius, -1));
            } else {
                m۱۴۴۰۷k(a2.getDimensionPixelSize(Cc.RippleDrawable_rd_maxRippleRadius, Cb.m۱۴۴۳۰d(context, 48)));
            }
            m۱۴۴۱۱o(a2.getColor(Cc.RippleDrawable_rd_rippleColor, Cb.m۱۴۴۲۸b(context, 0)));
            m۱۴۴۱۰n(a2.getInteger(Cc.RippleDrawable_rd_rippleAnimDuration, context.getResources().getInteger(R.integer.config_mediumAnimTime)));
            int resId = a2.getResourceId(Cc.RippleDrawable_rd_inInterpolator, 0);
            if (resId != 0) {
                m۱۴۳۹۵a(AnimationUtils.loadInterpolator(context, resId));
            }
            int resId2 = a2.getResourceId(Cc.RippleDrawable_rd_outInterpolator, 0);
            if (resId2 != 0) {
                m۱۴۳۹۸b(AnimationUtils.loadInterpolator(context, resId2));
            }
            m۱۴۴۰۶j(a2.getInteger(Cc.RippleDrawable_rd_maskType, 0));
            m۱۴۴۰۲f(a2.getDimensionPixelSize(Cc.RippleDrawable_rd_cornerRadius, 0));
            m۱۴۴۱۴r(a2.getDimensionPixelSize(Cc.RippleDrawable_rd_topLeftCornerRadius, this.f۱۳۰۷۱m));
            m۱۴۴۱۵s(a2.getDimensionPixelSize(Cc.RippleDrawable_rd_topRightCornerRadius, this.f۱۳۰۷۲n));
            m۱۴۴۰۱e(a2.getDimensionPixelSize(Cc.RippleDrawable_rd_bottomRightCornerRadius, this.f۱۳۰۷۴p));
            m۱۴۴۰۰d(a2.getDimensionPixelSize(Cc.RippleDrawable_rd_bottomLeftCornerRadius, this.f۱۳۰۷۳o));
            m۱۴۴۰۸l(a2.getDimensionPixelSize(Cc.RippleDrawable_rd_padding, 0));
            m۱۴۴۰۵i(a2.getDimensionPixelSize(Cc.RippleDrawable_rd_leftPadding, this.f۱۳۰۷۵q));
            m۱۴۴۰۹m(a2.getDimensionPixelSize(Cc.RippleDrawable_rd_rightPadding, this.f۱۳۰۷۷s));
            m۱۴۴۱۳q(a2.getDimensionPixelSize(Cc.RippleDrawable_rd_topPadding, this.f۱۳۰۷۶r));
            m۱۴۳۹۹c(a2.getDimensionPixelSize(Cc.RippleDrawable_rd_bottomPadding, this.f۱۳۰۷۸t));
            a2.recycle();
        }

        /* renamed from: a, reason: contains not printable characters */
        public ViewOnTouchListenerCc m۱۴۳۹۶a() {
            if (this.f۱۳۰۶۸j == null) {
                this.f۱۳۰۶۸j = new AccelerateInterpolator();
            }
            if (this.f۱۳۰۶۹k == null) {
                this.f۱۳۰۶۹k = new DecelerateInterpolator();
            }
            return new ViewOnTouchListenerCc(this.f۱۳۰۵۹a, this.f۱۳۰۶۰b, this.f۱۳۰۶۱c, this.f۱۳۰۶۲d, this.f۱۳۰۶۶h, this.f۱۳۰۶۷i, this.f۱۳۰۶۳e, this.f۱۳۰۶۴f, this.f۱۳۰۶۵g, this.f۱۳۰۶۸j, this.f۱۳۰۶۹k, this.f۱۳۰۷۰l, this.f۱۳۰۷۱m, this.f۱۳۰۷۲n, this.f۱۳۰۷۴p, this.f۱۳۰۷۳o, this.f۱۳۰۷۵q, this.f۱۳۰۷۶r, this.f۱۳۰۷۷s, this.f۱۳۰۷۸t, null);
        }

        /* renamed from: a, reason: contains not printable characters */
        public b m۱۴۳۹۴a(Drawable drawable) {
            this.f۱۳۰۵۹a = drawable;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public b m۱۴۳۹۳a(int duration) {
            this.f۱۳۰۶۰b = duration;
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public b m۱۴۳۹۷b(int color) {
            this.f۱۳۰۶۱c = color;
            return this;
        }

        /* renamed from: p, reason: contains not printable characters */
        public b m۱۴۴۱۲p(int type) {
            this.f۱۳۰۶۲d = type;
            return this;
        }

        /* renamed from: g, reason: contains not printable characters */
        public b m۱۴۴۰۳g(int type) {
            this.f۱۳۰۶۶h = type;
            return this;
        }

        /* renamed from: h, reason: contains not printable characters */
        public b m۱۴۴۰۴h(int time) {
            this.f۱۳۰۶۷i = time;
            return this;
        }

        /* renamed from: k, reason: contains not printable characters */
        public b m۱۴۴۰۷k(int radius) {
            this.f۱۳۰۶۳e = radius;
            return this;
        }

        /* renamed from: n, reason: contains not printable characters */
        public b m۱۴۴۱۰n(int duration) {
            this.f۱۳۰۶۴f = duration;
            return this;
        }

        /* renamed from: o, reason: contains not printable characters */
        public b m۱۴۴۱۱o(int color) {
            this.f۱۳۰۶۵g = color;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public b m۱۴۳۹۵a(Interpolator interpolator) {
            this.f۱۳۰۶۸j = interpolator;
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        public b m۱۴۳۹۸b(Interpolator interpolator) {
            this.f۱۳۰۶۹k = interpolator;
            return this;
        }

        /* renamed from: j, reason: contains not printable characters */
        public b m۱۴۴۰۶j(int type) {
            this.f۱۳۰۷۰l = type;
            return this;
        }

        /* renamed from: f, reason: contains not printable characters */
        public b m۱۴۴۰۲f(int radius) {
            this.f۱۳۰۷۱m = radius;
            this.f۱۳۰۷۲n = radius;
            this.f۱۳۰۷۳o = radius;
            this.f۱۳۰۷۴p = radius;
            return this;
        }

        /* renamed from: r, reason: contains not printable characters */
        public b m۱۴۴۱۴r(int radius) {
            this.f۱۳۰۷۱m = radius;
            return this;
        }

        /* renamed from: s, reason: contains not printable characters */
        public b m۱۴۴۱۵s(int radius) {
            this.f۱۳۰۷۲n = radius;
            return this;
        }

        /* renamed from: d, reason: contains not printable characters */
        public b m۱۴۴۰۰d(int radius) {
            this.f۱۳۰۷۳o = radius;
            return this;
        }

        /* renamed from: e, reason: contains not printable characters */
        public b m۱۴۴۰۱e(int radius) {
            this.f۱۳۰۷۴p = radius;
            return this;
        }

        /* renamed from: l, reason: contains not printable characters */
        public b m۱۴۴۰۸l(int padding) {
            this.f۱۳۰۷۵q = padding;
            this.f۱۳۰۷۶r = padding;
            this.f۱۳۰۷۷s = padding;
            this.f۱۳۰۷۸t = padding;
            return this;
        }

        /* renamed from: i, reason: contains not printable characters */
        public b m۱۴۴۰۵i(int padding) {
            this.f۱۳۰۷۵q = padding;
            return this;
        }

        /* renamed from: q, reason: contains not printable characters */
        public b m۱۴۴۱۳q(int padding) {
            this.f۱۳۰۷۶r = padding;
            return this;
        }

        /* renamed from: m, reason: contains not printable characters */
        public b m۱۴۴۰۹m(int padding) {
            this.f۱۳۰۷۷s = padding;
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public b m۱۴۳۹۹c(int padding) {
            this.f۱۳۰۷۸t = padding;
            return this;
        }
    }
}
