package b.j.a.e;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public class a extends Drawable implements Animatable {
    public static int p = 0;
    public static int q = 1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f۲۵۹۱c = false;

    /* renamed from: d  reason: collision with root package name */
    private long f۲۵۹۲d;

    /* renamed from: e  reason: collision with root package name */
    private float f۲۵۹۳e;

    /* renamed from: f  reason: collision with root package name */
    private int f۲۵۹۴f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f۲۵۹۵g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f۲۵۹۶h;
    private int i;
    private int j;
    private int k;
    private Interpolator l;
    private Path m;
    private boolean n = true;
    private final Runnable o = new RunnableC۰۰۵۸a();

    public a(int mode, int size, ColorStateList colorStateList, int animDuration, Interpolator interpolator, boolean clockwise) {
        this.i = size;
        this.f۲۵۹۴f = animDuration;
        this.k = mode;
        this.l = interpolator;
        if (this.l == null) {
            this.l = new DecelerateInterpolator();
        }
        this.n = clockwise;
        this.f۲۵۹۵g = new Paint();
        this.f۲۵۹۵g.setAntiAlias(true);
        this.f۲۵۹۵g.setStyle(Paint.Style.FILL);
        this.m = new Path();
        a(colorStateList);
    }

    public void a(ColorStateList colorStateList) {
        this.f۲۵۹۶h = colorStateList;
        onStateChange(getState());
    }

    public void a(int duration) {
        this.f۲۵۹۴f = duration;
    }

    public void a(Interpolator interpolator) {
        this.l = interpolator;
    }

    public void a(boolean clockwise) {
        this.n = clockwise;
    }

    public void b(int size) {
        if (this.i != size) {
            this.i = size;
            invalidateSelf();
        }
    }

    public void a(int mode, boolean animation) {
        if (this.k != mode) {
            this.k = mode;
            if (!animation || this.f۲۵۹۴f <= 0) {
                invalidateSelf();
            } else {
                start();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        float x = bounds.exactCenterX();
        float y = bounds.exactCenterY();
        this.m.reset();
        this.m.moveTo(x, (((float) this.i) / 2.0f) + y);
        Path path = this.m;
        int i2 = this.i;
        path.lineTo(x - ((float) i2), y - (((float) i2) / 2.0f));
        Path path2 = this.m;
        int i3 = this.i;
        path2.lineTo(((float) i3) + x, y - (((float) i3) / 2.0f));
        this.m.close();
    }

    public void draw(Canvas canvas) {
        float degree;
        int saveCount = canvas.save();
        Rect bounds = getBounds();
        if (isRunning()) {
            float value = this.l.getInterpolation(this.f۲۵۹۳e);
            if (this.n) {
                if (this.k == q) {
                    degree = 180.0f * value;
                } else {
                    degree = 180.0f * (1.0f + value);
                }
            } else if (this.k == q) {
                degree = value * -180.0f;
            } else {
                degree = (1.0f + value) * -180.0f;
            }
            canvas.rotate(degree, bounds.exactCenterX(), bounds.exactCenterY());
        } else if (this.k == q) {
            canvas.rotate(180.0f, bounds.exactCenterX(), bounds.exactCenterY());
        }
        this.f۲۵۹۵g.setColor(this.j);
        canvas.drawPath(this.m, this.f۲۵۹۵g);
        canvas.restoreToCount(saveCount);
    }

    public void setAlpha(int alpha) {
        this.f۲۵۹۵g.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f۲۵۹۵g.setColorFilter(cf);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        int color = this.f۲۵۹۶h.getColorForState(state, this.j);
        if (this.j == color) {
            return false;
        }
        this.j = color;
        return true;
    }

    private void a() {
        this.f۲۵۹۲d = SystemClock.uptimeMillis();
        this.f۲۵۹۳e = 0.0f;
    }

    public void start() {
        a();
        scheduleSelf(this.o, SystemClock.uptimeMillis() + 16);
        invalidateSelf();
    }

    public void stop() {
        this.f۲۵۹۱c = false;
        unscheduleSelf(this.o);
        invalidateSelf();
    }

    public boolean isRunning() {
        return this.f۲۵۹۱c;
    }

    public void scheduleSelf(Runnable what, long when) {
        this.f۲۵۹۱c = true;
        super.scheduleSelf(what, when);
    }

    /* renamed from: b.j.a.e.a$a  reason: collision with other inner class name */
    class RunnableC۰۰۵۸a implements Runnable {
        RunnableC۰۰۵۸a() {
        }

        public void run() {
            a.this.b();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b() {
        this.f۲۵۹۳e = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f۲۵۹۲d)) / ((float) this.f۲۵۹۴f));
        if (this.f۲۵۹۳e == 1.0f) {
            this.f۲۵۹۱c = false;
        }
        if (isRunning()) {
            scheduleSelf(this.o, SystemClock.uptimeMillis() + 16);
        }
        invalidateSelf();
    }
}
