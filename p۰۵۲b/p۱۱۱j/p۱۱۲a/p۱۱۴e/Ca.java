package p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e;

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

/* renamed from: b.j.a.e.a  reason: invalid class name */
public class Ca extends Drawable implements Animatable {

    /* renamed from: p  reason: contains not printable characters */
    public static int f۱۲۹۹۴p = 0;

    /* renamed from: q  reason: contains not printable characters */
    public static int f۱۲۹۹۵q = 1;

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۱۲۹۹۶c = false;

    /* renamed from: d  reason: contains not printable characters */
    private long f۱۲۹۹۷d;

    /* renamed from: e  reason: contains not printable characters */
    private float f۱۲۹۹۸e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۲۹۹۹f;

    /* renamed from: g  reason: contains not printable characters */
    private Paint f۱۳۰۰۰g;

    /* renamed from: h  reason: contains not printable characters */
    private ColorStateList f۱۳۰۰۱h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۳۰۰۲i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۳۰۰۳j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۳۰۰۴k;

    /* renamed from: l  reason: contains not printable characters */
    private Interpolator f۱۳۰۰۵l;

    /* renamed from: m  reason: contains not printable characters */
    private Path f۱۳۰۰۶m;

    /* renamed from: n  reason: contains not printable characters */
    private boolean f۱۳۰۰۷n = true;

    /* renamed from: o  reason: contains not printable characters */
    private final Runnable f۱۳۰۰۸o = new RunnableCa();

    public Ca(int mode, int size, ColorStateList colorStateList, int animDuration, Interpolator interpolator, boolean clockwise) {
        this.f۱۳۰۰۲i = size;
        this.f۱۲۹۹۹f = animDuration;
        this.f۱۳۰۰۴k = mode;
        this.f۱۳۰۰۵l = interpolator;
        if (this.f۱۳۰۰۵l == null) {
            this.f۱۳۰۰۵l = new DecelerateInterpolator();
        }
        this.f۱۳۰۰۷n = clockwise;
        this.f۱۳۰۰۰g = new Paint();
        this.f۱۳۰۰۰g.setAntiAlias(true);
        this.f۱۳۰۰۰g.setStyle(Paint.Style.FILL);
        this.f۱۳۰۰۶m = new Path();
        m۱۶۴۴۰a(colorStateList);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۴۰a(ColorStateList colorStateList) {
        this.f۱۳۰۰۱h = colorStateList;
        onStateChange(getState());
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۳۸a(int duration) {
        this.f۱۲۹۹۹f = duration;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۴۱a(Interpolator interpolator) {
        this.f۱۳۰۰۵l = interpolator;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۴۲a(boolean clockwise) {
        this.f۱۳۰۰۷n = clockwise;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۴۴۳b(int size) {
        if (this.f۱۳۰۰۲i != size) {
            this.f۱۳۰۰۲i = size;
            invalidateSelf();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۳۹a(int mode, boolean animation) {
        if (this.f۱۳۰۰۴k != mode) {
            this.f۱۳۰۰۴k = mode;
            if (!animation || this.f۱۲۹۹۹f <= 0) {
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
        this.f۱۳۰۰۶m.reset();
        this.f۱۳۰۰۶m.moveTo(x, (((float) this.f۱۳۰۰۲i) / 2.0f) + y);
        Path path = this.f۱۳۰۰۶m;
        int i = this.f۱۳۰۰۲i;
        path.lineTo(x - ((float) i), y - (((float) i) / 2.0f));
        Path path2 = this.f۱۳۰۰۶m;
        int i2 = this.f۱۳۰۰۲i;
        path2.lineTo(((float) i2) + x, y - (((float) i2) / 2.0f));
        this.f۱۳۰۰۶m.close();
    }

    public void draw(Canvas canvas) {
        float degree;
        int saveCount = canvas.save();
        Rect bounds = getBounds();
        if (isRunning()) {
            float value = this.f۱۳۰۰۵l.getInterpolation(this.f۱۲۹۹۸e);
            if (this.f۱۳۰۰۷n) {
                if (this.f۱۳۰۰۴k == f۱۲۹۹۵q) {
                    degree = 180.0f * value;
                } else {
                    degree = 180.0f * (1.0f + value);
                }
            } else if (this.f۱۳۰۰۴k == f۱۲۹۹۵q) {
                degree = value * -180.0f;
            } else {
                degree = (1.0f + value) * -180.0f;
            }
            canvas.rotate(degree, bounds.exactCenterX(), bounds.exactCenterY());
        } else if (this.f۱۳۰۰۴k == f۱۲۹۹۵q) {
            canvas.rotate(180.0f, bounds.exactCenterX(), bounds.exactCenterY());
        }
        this.f۱۳۰۰۰g.setColor(this.f۱۳۰۰۳j);
        canvas.drawPath(this.f۱۳۰۰۶m, this.f۱۳۰۰۰g);
        canvas.restoreToCount(saveCount);
    }

    public void setAlpha(int alpha) {
        this.f۱۳۰۰۰g.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f۱۳۰۰۰g.setColorFilter(cf);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        int color = this.f۱۳۰۰۱h.getColorForState(state, this.f۱۳۰۰۳j);
        if (this.f۱۳۰۰۳j == color) {
            return false;
        }
        this.f۱۳۰۰۳j = color;
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۶۴۳۵a() {
        this.f۱۲۹۹۷d = SystemClock.uptimeMillis();
        this.f۱۲۹۹۸e = 0.0f;
    }

    public void start() {
        m۱۶۴۳۵a();
        scheduleSelf(this.f۱۳۰۰۸o, SystemClock.uptimeMillis() + 16);
        invalidateSelf();
    }

    public void stop() {
        this.f۱۲۹۹۶c = false;
        unscheduleSelf(this.f۱۳۰۰۸o);
        invalidateSelf();
    }

    public boolean isRunning() {
        return this.f۱۲۹۹۶c;
    }

    public void scheduleSelf(Runnable what, long when) {
        this.f۱۲۹۹۶c = true;
        super.scheduleSelf(what, when);
    }

    /* renamed from: b.j.a.e.a$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            Ca.this.m۱۶۴۳۷b();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۴۳۷b() {
        this.f۱۲۹۹۸e = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f۱۲۹۹۷d)) / ((float) this.f۱۲۹۹۹f));
        if (this.f۱۲۹۹۸e == 1.0f) {
            this.f۱۲۹۹۶c = false;
        }
        if (isRunning()) {
            scheduleSelf(this.f۱۳۰۰۸o, SystemClock.uptimeMillis() + 16);
        }
        invalidateSelf();
    }
}
