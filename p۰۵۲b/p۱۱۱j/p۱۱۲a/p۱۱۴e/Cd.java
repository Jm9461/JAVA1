package p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e;

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

/* renamed from: b.j.a.e.d  reason: invalid class name */
public class Cd extends Drawable implements Animatable {

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۱۳۰۸۵c;

    /* renamed from: d  reason: contains not printable characters */
    private Paint f۱۳۰۸۶d;

    /* renamed from: e  reason: contains not printable characters */
    private Paint f۱۳۰۸۷e;

    /* renamed from: f  reason: contains not printable characters */
    private RadialGradient f۱۳۰۸۸f;

    /* renamed from: g  reason: contains not printable characters */
    private RadialGradient f۱۳۰۸۹g;

    /* renamed from: h  reason: contains not printable characters */
    private Matrix f۱۳۰۹۰h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۳۰۹۱i;

    /* renamed from: j  reason: contains not printable characters */
    private RectF f۱۳۰۹۲j;

    /* renamed from: k  reason: contains not printable characters */
    private Path f۱۳۰۹۳k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۳۰۹۴l;

    /* renamed from: m  reason: contains not printable characters */
    private int f۱۳۰۹۵m;

    /* renamed from: n  reason: contains not printable characters */
    private float f۱۳۰۹۶n;

    /* renamed from: o  reason: contains not printable characters */
    private PointF f۱۳۰۹۷o;

    /* renamed from: p  reason: contains not printable characters */
    private float f۱۳۰۹۸p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۳۰۹۹q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۳۱۰۰r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۳۱۰۱s;

    /* renamed from: t  reason: contains not printable characters */
    private float f۱۳۱۰۲t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۳۱۰۳u;

    /* renamed from: v  reason: contains not printable characters */
    private long f۱۳۱۰۴v;

    /* renamed from: w  reason: contains not printable characters */
    private boolean f۱۳۱۰۵w;

    /* renamed from: x  reason: contains not printable characters */
    private int f۱۳۱۰۶x;

    /* renamed from: y  reason: contains not printable characters */
    private final Runnable f۱۳۱۰۷y;

    public void setAlpha(int alpha) {
        this.f۱۳۰۹۱i = alpha;
    }

    public void setColorFilter(ColorFilter filter) {
        this.f۱۳۰۸۷e.setColorFilter(filter);
        this.f۱۳۰۸۶d.setColorFilter(filter);
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: b  reason: contains not printable characters */
    public long m۱۶۴۹۸b() {
        int i = this.f۱۳۱۰۳u;
        if (i == 0) {
            return -1;
        }
        if (i != 1) {
            if (i == 2) {
                int i2 = this.f۱۳۱۰۶x;
                if (i2 == 3) {
                    return ((long) (Math.max(this.f۱۳۰۹۴l, this.f۱۳۱۰۰r) * 2)) - (SystemClock.uptimeMillis() - this.f۱۳۱۰۴v);
                }
                if (i2 == 4) {
                    return ((long) Math.max(this.f۱۳۰۹۴l, this.f۱۳۱۰۰r)) - (SystemClock.uptimeMillis() - this.f۱۳۱۰۴v);
                }
            }
        } else if (this.f۱۳۱۰۶x == 3) {
            return ((long) Math.max(this.f۱۳۰۹۴l, this.f۱۳۱۰۰r)) - (SystemClock.uptimeMillis() - this.f۱۳۱۰۴v);
        }
        return -1;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۴۹۲a(int state) {
        if (this.f۱۳۱۰۶x != state) {
            this.f۱۳۱۰۶x = state;
            int i = this.f۱۳۱۰۶x;
            if (i == 0) {
                stop();
            } else if (i != 2) {
                start();
            } else {
                stop();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۶۴۹۴a(float x, float y, float radius) {
        PointF pointF = this.f۱۳۰۹۷o;
        if (pointF.x == x && pointF.y == y && this.f۱۳۰۹۸p == radius) {
            return false;
        }
        this.f۱۳۰۹۷o.set(x, y);
        this.f۱۳۰۹۸p = radius;
        float radius2 = this.f۱۳۰۹۸p / 16.0f;
        this.f۱۳۰۹۰h.reset();
        this.f۱۳۰۹۰h.postTranslate(x, y);
        this.f۱۳۰۹۰h.postScale(radius2, radius2, x, y);
        this.f۱۳۰۸۸f.setLocalMatrix(this.f۱۳۰۹۰h);
        RadialGradient radialGradient = this.f۱۳۰۸۹g;
        if (radialGradient == null) {
            return true;
        }
        radialGradient.setLocalMatrix(this.f۱۳۰۹۰h);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        this.f۱۳۰۹۲j.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        this.f۱۳۰۹۳k.reset();
        this.f۱۳۰۹۳k.addRect(this.f۱۳۰۹۲j, Path.Direction.CW);
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        boolean pressed = p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f.Cd.m۱۶۵۱۳a(state, 16842919);
        if (this.f۱۳۱۰۵w == pressed) {
            return false;
        }
        this.f۱۳۱۰۵w = pressed;
        if (this.f۱۳۱۰۵w) {
            Rect bounds = getBounds();
            int i = this.f۱۳۱۰۶x;
            if (i == 0 || i == 4) {
                int i2 = this.f۱۳۰۹۹q;
                if (i2 == 1 || i2 == -1) {
                    m۱۶۴۹۱a(bounds.exactCenterX(), bounds.exactCenterY());
                }
                m۱۶۴۹۴a(bounds.exactCenterX(), bounds.exactCenterY(), 0.0f);
                m۱۶۴۹۲a(1);
            } else if (this.f۱۳۰۹۹q == 0) {
                m۱۶۴۹۴a(bounds.exactCenterX(), bounds.exactCenterY(), this.f۱۳۰۹۸p);
            }
        } else {
            int i3 = this.f۱۳۱۰۶x;
            if (i3 != 0) {
                if (i3 == 2) {
                    int i4 = this.f۱۳۰۹۹q;
                    if (i4 == 1 || i4 == -1) {
                        PointF pointF = this.f۱۳۰۹۷o;
                        m۱۶۴۹۴a(pointF.x, pointF.y, 0.0f);
                    }
                    m۱۶۴۹۲a(4);
                } else {
                    m۱۶۴۹۲a(3);
                }
            }
        }
        return true;
    }

    public void draw(Canvas canvas) {
        int i = this.f۱۳۰۹۹q;
        if (i == -1 || i == 0) {
            m۱۶۴۹۳a(canvas);
        } else if (i == 1) {
            m۱۶۴۹۵b(canvas);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۴۹۳a(Canvas canvas) {
        if (this.f۱۳۱۰۶x != 0) {
            if (this.f۱۳۰۹۶n > 0.0f) {
                this.f۱۳۰۸۷e.setColor(this.f۱۳۰۹۵m);
                this.f۱۳۰۸۷e.setAlpha(Math.round(((float) this.f۱۳۰۹۱i) * this.f۱۳۰۹۶n));
                canvas.drawPath(this.f۱۳۰۹۳k, this.f۱۳۰۸۷e);
            }
            if (this.f۱۳۰۹۸p > 0.0f) {
                float f = this.f۱۳۱۰۲t;
                if (f > 0.0f) {
                    this.f۱۳۰۸۶d.setAlpha(Math.round(((float) this.f۱۳۰۹۱i) * f));
                    this.f۱۳۰۸۶d.setShader(this.f۱۳۰۸۸f);
                    canvas.drawPath(this.f۱۳۰۹۳k, this.f۱۳۰۸۶d);
                }
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۴۹۵b(Canvas canvas) {
        int i = this.f۱۳۱۰۶x;
        if (i == 0) {
            return;
        }
        if (i == 4) {
            if (this.f۱۳۰۹۸p == 0.0f) {
                this.f۱۳۰۸۷e.setColor(this.f۱۳۱۰۱s);
                canvas.drawPath(this.f۱۳۰۹۳k, this.f۱۳۰۸۷e);
                return;
            }
            this.f۱۳۰۸۶d.setShader(this.f۱۳۰۸۹g);
            canvas.drawPath(this.f۱۳۰۹۳k, this.f۱۳۰۸۶d);
        } else if (this.f۱۳۰۹۸p > 0.0f) {
            this.f۱۳۰۸۶d.setShader(this.f۱۳۰۸۸f);
            canvas.drawPath(this.f۱۳۰۹۳k, this.f۱۳۰۸۶d);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۶۴۹۱a(float x, float y) {
        return (int) Math.round(Math.sqrt(Math.pow((double) ((x < this.f۱۳۰۹۲j.centerX() ? this.f۱۳۰۹۲j.right : this.f۱۳۰۹۲j.left) - x), 2.0d) + Math.pow((double) ((y < this.f۱۳۰۹۲j.centerY() ? this.f۱۳۰۹۲j.bottom : this.f۱۳۰۹۲j.top) - y), 2.0d)));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۹۷a() {
        m۱۶۴۹۲a(0);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۶۴۹۶c() {
        this.f۱۳۱۰۴v = SystemClock.uptimeMillis();
    }

    public void start() {
        if (!isRunning()) {
            m۱۶۴۹۶c();
            scheduleSelf(this.f۱۳۱۰۷y, SystemClock.uptimeMillis() + 16);
            invalidateSelf();
        }
    }

    public void stop() {
        if (isRunning()) {
            this.f۱۳۰۸۵c = false;
            unscheduleSelf(this.f۱۳۱۰۷y);
            invalidateSelf();
        }
    }

    public boolean isRunning() {
        return this.f۱۳۰۸۵c;
    }

    public void scheduleSelf(Runnable what, long when) {
        this.f۱۳۰۸۵c = true;
        super.scheduleSelf(what, when);
    }
}
