package p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۰e;

import android.R;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: b.j.a.e.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cd extends Drawable implements Animatable {

    /* renamed from: c, reason: contains not printable characters */
    private boolean f۱۳۰۸۵c;

    /* renamed from: d, reason: contains not printable characters */
    private Paint f۱۳۰۸۶d;

    /* renamed from: e, reason: contains not printable characters */
    private Paint f۱۳۰۸۷e;

    /* renamed from: f, reason: contains not printable characters */
    private RadialGradient f۱۳۰۸۸f;

    /* renamed from: g, reason: contains not printable characters */
    private RadialGradient f۱۳۰۸۹g;

    /* renamed from: h, reason: contains not printable characters */
    private Matrix f۱۳۰۹۰h;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۳۰۹۱i;

    /* renamed from: j, reason: contains not printable characters */
    private RectF f۱۳۰۹۲j;

    /* renamed from: k, reason: contains not printable characters */
    private Path f۱۳۰۹۳k;

    /* renamed from: l, reason: contains not printable characters */
    private int f۱۳۰۹۴l;

    /* renamed from: m, reason: contains not printable characters */
    private int f۱۳۰۹۵m;

    /* renamed from: n, reason: contains not printable characters */
    private float f۱۳۰۹۶n;

    /* renamed from: o, reason: contains not printable characters */
    private PointF f۱۳۰۹۷o;

    /* renamed from: p, reason: contains not printable characters */
    private float f۱۳۰۹۸p;

    /* renamed from: q, reason: contains not printable characters */
    private int f۱۳۰۹۹q;

    /* renamed from: r, reason: contains not printable characters */
    private int f۱۳۱۰۰r;

    /* renamed from: s, reason: contains not printable characters */
    private int f۱۳۱۰۱s;

    /* renamed from: t, reason: contains not printable characters */
    private float f۱۳۱۰۲t;

    /* renamed from: u, reason: contains not printable characters */
    private int f۱۳۱۰۳u;

    /* renamed from: v, reason: contains not printable characters */
    private long f۱۳۱۰۴v;

    /* renamed from: w, reason: contains not printable characters */
    private boolean f۱۳۱۰۵w;

    /* renamed from: x, reason: contains not printable characters */
    private int f۱۳۱۰۶x;

    /* renamed from: y, reason: contains not printable characters */
    private final Runnable f۱۳۱۰۷y;

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f۱۳۰۹۱i = alpha;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter filter) {
        this.f۱۳۰۸۷e.setColorFilter(filter);
        this.f۱۳۰۸۶d.setColorFilter(filter);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: b, reason: contains not printable characters */
    public long m۱۴۴۲۳b() {
        int i = this.f۱۳۱۰۳u;
        if (i == 0) {
            return -1L;
        }
        if (i != 1) {
            if (i == 2) {
                int i2 = this.f۱۳۱۰۶x;
                if (i2 == 3) {
                    return (Math.max(this.f۱۳۰۹۴l, this.f۱۳۱۰۰r) * 2) - (SystemClock.uptimeMillis() - this.f۱۳۱۰۴v);
                }
                if (i2 == 4) {
                    return Math.max(this.f۱۳۰۹۴l, this.f۱۳۱۰۰r) - (SystemClock.uptimeMillis() - this.f۱۳۱۰۴v);
                }
            }
        } else if (this.f۱۳۱۰۶x == 3) {
            return Math.max(this.f۱۳۰۹۴l, this.f۱۳۱۰۰r) - (SystemClock.uptimeMillis() - this.f۱۳۱۰۴v);
        }
        return -1L;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۴۴۱۷a(int state) {
        if (this.f۱۳۱۰۶x != state) {
            this.f۱۳۱۰۶x = state;
            int i = this.f۱۳۱۰۶x;
            if (i != 0) {
                if (i != 2) {
                    start();
                    return;
                } else {
                    stop();
                    return;
                }
            }
            stop();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۴۴۱۹a(float x, float y, float radius) {
        PointF pointF = this.f۱۳۰۹۷o;
        if (pointF.x != x || pointF.y != y || this.f۱۳۰۹۸p != radius) {
            this.f۱۳۰۹۷o.set(x, y);
            this.f۱۳۰۹۸p = radius;
            float radius2 = this.f۱۳۰۹۸p / 16.0f;
            this.f۱۳۰۹۰h.reset();
            this.f۱۳۰۹۰h.postTranslate(x, y);
            this.f۱۳۰۹۰h.postScale(radius2, radius2, x, y);
            this.f۱۳۰۸۸f.setLocalMatrix(this.f۱۳۰۹۰h);
            RadialGradient radialGradient = this.f۱۳۰۸۹g;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(this.f۱۳۰۹۰h);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        this.f۱۳۰۹۲j.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        this.f۱۳۰۹۳k.reset();
        this.f۱۳۰۹۳k.addRect(this.f۱۳۰۹۲j, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        boolean pressed = p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۱f.Cd.m۱۴۴۳۸a(state, R.attr.state_pressed);
        if (this.f۱۳۱۰۵w != pressed) {
            this.f۱۳۱۰۵w = pressed;
            if (this.f۱۳۱۰۵w) {
                Rect bounds = getBounds();
                int i = this.f۱۳۱۰۶x;
                if (i == 0 || i == 4) {
                    int i2 = this.f۱۳۰۹۹q;
                    if (i2 == 1 || i2 == -1) {
                        m۱۴۴۱۶a(bounds.exactCenterX(), bounds.exactCenterY());
                    }
                    m۱۴۴۱۹a(bounds.exactCenterX(), bounds.exactCenterY(), 0.0f);
                    m۱۴۴۱۷a(1);
                } else if (this.f۱۳۰۹۹q == 0) {
                    m۱۴۴۱۹a(bounds.exactCenterX(), bounds.exactCenterY(), this.f۱۳۰۹۸p);
                }
            } else {
                int i3 = this.f۱۳۱۰۶x;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i4 = this.f۱۳۰۹۹q;
                        if (i4 == 1 || i4 == -1) {
                            PointF pointF = this.f۱۳۰۹۷o;
                            m۱۴۴۱۹a(pointF.x, pointF.y, 0.0f);
                        }
                        m۱۴۴۱۷a(4);
                    } else {
                        m۱۴۴۱۷a(3);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = this.f۱۳۰۹۹q;
        if (i == -1 || i == 0) {
            m۱۴۴۱۸a(canvas);
        } else if (i == 1) {
            m۱۴۴۲۰b(canvas);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۴۴۱۸a(Canvas canvas) {
        if (this.f۱۳۱۰۶x != 0) {
            if (this.f۱۳۰۹۶n > 0.0f) {
                this.f۱۳۰۸۷e.setColor(this.f۱۳۰۹۵m);
                this.f۱۳۰۸۷e.setAlpha(Math.round(this.f۱۳۰۹۱i * this.f۱۳۰۹۶n));
                canvas.drawPath(this.f۱۳۰۹۳k, this.f۱۳۰۸۷e);
            }
            if (this.f۱۳۰۹۸p > 0.0f) {
                float f2 = this.f۱۳۱۰۲t;
                if (f2 > 0.0f) {
                    this.f۱۳۰۸۶d.setAlpha(Math.round(this.f۱۳۰۹۱i * f2));
                    this.f۱۳۰۸۶d.setShader(this.f۱۳۰۸۸f);
                    canvas.drawPath(this.f۱۳۰۹۳k, this.f۱۳۰۸۶d);
                }
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۴۴۲۰b(Canvas canvas) {
        int i = this.f۱۳۱۰۶x;
        if (i != 0) {
            if (i != 4) {
                if (this.f۱۳۰۹۸p > 0.0f) {
                    this.f۱۳۰۸۶d.setShader(this.f۱۳۰۸۸f);
                    canvas.drawPath(this.f۱۳۰۹۳k, this.f۱۳۰۸۶d);
                    return;
                }
                return;
            }
            if (this.f۱۳۰۹۸p == 0.0f) {
                this.f۱۳۰۸۷e.setColor(this.f۱۳۱۰۱s);
                canvas.drawPath(this.f۱۳۰۹۳k, this.f۱۳۰۸۷e);
            } else {
                this.f۱۳۰۸۶d.setShader(this.f۱۳۰۸۹g);
                canvas.drawPath(this.f۱۳۰۹۳k, this.f۱۳۰۸۶d);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private int m۱۴۴۱۶a(float x, float y) {
        float x1 = x < this.f۱۳۰۹۲j.centerX() ? this.f۱۳۰۹۲j.right : this.f۱۳۰۹۲j.left;
        float y1 = y < this.f۱۳۰۹۲j.centerY() ? this.f۱۳۰۹۲j.bottom : this.f۱۳۰۹۲j.top;
        return (int) Math.round(Math.sqrt(Math.pow(x1 - x, 2.0d) + Math.pow(y1 - y, 2.0d)));
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۴۲۲a() {
        m۱۴۴۱۷a(0);
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۴۴۲۱c() {
        this.f۱۳۱۰۴v = SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (isRunning()) {
            return;
        }
        m۱۴۴۲۱c();
        scheduleSelf(this.f۱۳۱۰۷y, SystemClock.uptimeMillis() + 16);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (!isRunning()) {
            return;
        }
        this.f۱۳۰۸۵c = false;
        unscheduleSelf(this.f۱۳۱۰۷y);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f۱۳۰۸۵c;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable what, long when) {
        this.f۱۳۰۸۵c = true;
        super.scheduleSelf(what, when);
    }
}
