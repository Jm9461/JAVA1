package b.j.a.e;

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

public class d extends Drawable implements Animatable {

    /* renamed from: c  reason: collision with root package name */
    private boolean f۲۶۲۶c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f۲۶۲۷d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f۲۶۲۸e;

    /* renamed from: f  reason: collision with root package name */
    private RadialGradient f۲۶۲۹f;

    /* renamed from: g  reason: collision with root package name */
    private RadialGradient f۲۶۳۰g;

    /* renamed from: h  reason: collision with root package name */
    private Matrix f۲۶۳۱h;
    private int i;
    private RectF j;
    private Path k;
    private int l;
    private int m;
    private float n;
    private PointF o;
    private float p;
    private int q;
    private int r;
    private int s;
    private float t;
    private int u;
    private long v;
    private boolean w;
    private int x;
    private final Runnable y;

    public void setAlpha(int alpha) {
        this.i = alpha;
    }

    public void setColorFilter(ColorFilter filter) {
        this.f۲۶۲۸e.setColorFilter(filter);
        this.f۲۶۲۷d.setColorFilter(filter);
    }

    public int getOpacity() {
        return -3;
    }

    public long b() {
        int i2 = this.u;
        if (i2 == 0) {
            return -1;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                int i3 = this.x;
                if (i3 == 3) {
                    return ((long) (Math.max(this.l, this.r) * 2)) - (SystemClock.uptimeMillis() - this.v);
                }
                if (i3 == 4) {
                    return ((long) Math.max(this.l, this.r)) - (SystemClock.uptimeMillis() - this.v);
                }
            }
        } else if (this.x == 3) {
            return ((long) Math.max(this.l, this.r)) - (SystemClock.uptimeMillis() - this.v);
        }
        return -1;
    }

    private void a(int state) {
        if (this.x != state) {
            this.x = state;
            int i2 = this.x;
            if (i2 == 0) {
                stop();
            } else if (i2 != 2) {
                start();
            } else {
                stop();
            }
        }
    }

    private boolean a(float x2, float y2, float radius) {
        PointF pointF = this.o;
        if (pointF.x == x2 && pointF.y == y2 && this.p == radius) {
            return false;
        }
        this.o.set(x2, y2);
        this.p = radius;
        float radius2 = this.p / 16.0f;
        this.f۲۶۳۱h.reset();
        this.f۲۶۳۱h.postTranslate(x2, y2);
        this.f۲۶۳۱h.postScale(radius2, radius2, x2, y2);
        this.f۲۶۲۹f.setLocalMatrix(this.f۲۶۳۱h);
        RadialGradient radialGradient = this.f۲۶۳۰g;
        if (radialGradient == null) {
            return true;
        }
        radialGradient.setLocalMatrix(this.f۲۶۳۱h);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        this.j.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        this.k.reset();
        this.k.addRect(this.j, Path.Direction.CW);
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        boolean pressed = b.j.a.f.d.a(state, 16842919);
        if (this.w == pressed) {
            return false;
        }
        this.w = pressed;
        if (this.w) {
            Rect bounds = getBounds();
            int i2 = this.x;
            if (i2 == 0 || i2 == 4) {
                int i3 = this.q;
                if (i3 == 1 || i3 == -1) {
                    a(bounds.exactCenterX(), bounds.exactCenterY());
                }
                a(bounds.exactCenterX(), bounds.exactCenterY(), 0.0f);
                a(1);
            } else if (this.q == 0) {
                a(bounds.exactCenterX(), bounds.exactCenterY(), this.p);
            }
        } else {
            int i4 = this.x;
            if (i4 != 0) {
                if (i4 == 2) {
                    int i5 = this.q;
                    if (i5 == 1 || i5 == -1) {
                        PointF pointF = this.o;
                        a(pointF.x, pointF.y, 0.0f);
                    }
                    a(4);
                } else {
                    a(3);
                }
            }
        }
        return true;
    }

    public void draw(Canvas canvas) {
        int i2 = this.q;
        if (i2 == -1 || i2 == 0) {
            a(canvas);
        } else if (i2 == 1) {
            b(canvas);
        }
    }

    private void a(Canvas canvas) {
        if (this.x != 0) {
            if (this.n > 0.0f) {
                this.f۲۶۲۸e.setColor(this.m);
                this.f۲۶۲۸e.setAlpha(Math.round(((float) this.i) * this.n));
                canvas.drawPath(this.k, this.f۲۶۲۸e);
            }
            if (this.p > 0.0f) {
                float f2 = this.t;
                if (f2 > 0.0f) {
                    this.f۲۶۲۷d.setAlpha(Math.round(((float) this.i) * f2));
                    this.f۲۶۲۷d.setShader(this.f۲۶۲۹f);
                    canvas.drawPath(this.k, this.f۲۶۲۷d);
                }
            }
        }
    }

    private void b(Canvas canvas) {
        int i2 = this.x;
        if (i2 == 0) {
            return;
        }
        if (i2 == 4) {
            if (this.p == 0.0f) {
                this.f۲۶۲۸e.setColor(this.s);
                canvas.drawPath(this.k, this.f۲۶۲۸e);
                return;
            }
            this.f۲۶۲۷d.setShader(this.f۲۶۳۰g);
            canvas.drawPath(this.k, this.f۲۶۲۷d);
        } else if (this.p > 0.0f) {
            this.f۲۶۲۷d.setShader(this.f۲۶۲۹f);
            canvas.drawPath(this.k, this.f۲۶۲۷d);
        }
    }

    private int a(float x2, float y2) {
        return (int) Math.round(Math.sqrt(Math.pow((double) ((x2 < this.j.centerX() ? this.j.right : this.j.left) - x2), 2.0d) + Math.pow((double) ((y2 < this.j.centerY() ? this.j.bottom : this.j.top) - y2), 2.0d)));
    }

    public void a() {
        a(0);
    }

    private void c() {
        this.v = SystemClock.uptimeMillis();
    }

    public void start() {
        if (!isRunning()) {
            c();
            scheduleSelf(this.y, SystemClock.uptimeMillis() + 16);
            invalidateSelf();
        }
    }

    public void stop() {
        if (isRunning()) {
            this.f۲۶۲۶c = false;
            unscheduleSelf(this.y);
            invalidateSelf();
        }
    }

    public boolean isRunning() {
        return this.f۲۶۲۶c;
    }

    public void scheduleSelf(Runnable what, long when) {
        this.f۲۶۲۶c = true;
        super.scheduleSelf(what, when);
    }
}
