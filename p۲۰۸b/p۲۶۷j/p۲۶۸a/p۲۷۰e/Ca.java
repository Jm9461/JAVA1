package p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۰e;

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

/* renamed from: b.j.a.e.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends Drawable implements Animatable {

    /* renamed from: p, reason: contains not printable characters */
    public static int f۱۲۹۹۴p = 0;

    /* renamed from: q, reason: contains not printable characters */
    public static int f۱۲۹۹۵q = 1;

    /* renamed from: d, reason: contains not printable characters */
    private long f۱۲۹۹۷d;

    /* renamed from: e, reason: contains not printable characters */
    private float f۱۲۹۹۸e;

    /* renamed from: f, reason: contains not printable characters */
    private int f۱۲۹۹۹f;

    /* renamed from: g, reason: contains not printable characters */
    private Paint f۱۳۰۰۰g;

    /* renamed from: h, reason: contains not printable characters */
    private ColorStateList f۱۳۰۰۱h;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۳۰۰۲i;

    /* renamed from: j, reason: contains not printable characters */
    private int f۱۳۰۰۳j;

    /* renamed from: k, reason: contains not printable characters */
    private int f۱۳۰۰۴k;

    /* renamed from: l, reason: contains not printable characters */
    private Interpolator f۱۳۰۰۵l;

    /* renamed from: m, reason: contains not printable characters */
    private Path f۱۳۰۰۶m;

    /* renamed from: n, reason: contains not printable characters */
    private boolean f۱۳۰۰۷n;

    /* renamed from: c, reason: contains not printable characters */
    private boolean f۱۲۹۹۶c = false;

    /* renamed from: o, reason: contains not printable characters */
    private final Runnable f۱۳۰۰۸o = new a();

    public Ca(int mode, int size, ColorStateList colorStateList, int animDuration, Interpolator interpolator, boolean clockwise) {
        this.f۱۳۰۰۷n = true;
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
        m۱۴۳۶۵a(colorStateList);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۶۵a(ColorStateList colorStateList) {
        this.f۱۳۰۰۱h = colorStateList;
        onStateChange(getState());
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۶۳a(int duration) {
        this.f۱۲۹۹۹f = duration;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۶۶a(Interpolator interpolator) {
        this.f۱۳۰۰۵l = interpolator;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۶۷a(boolean clockwise) {
        this.f۱۳۰۰۷n = clockwise;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۴۳۶۸b(int size) {
        if (this.f۱۳۰۰۲i != size) {
            this.f۱۳۰۰۲i = size;
            invalidateSelf();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۶۴a(int mode, boolean animation) {
        if (this.f۱۳۰۰۴k != mode) {
            this.f۱۳۰۰۴k = mode;
            if (animation && this.f۱۲۹۹۹f > 0) {
                start();
            } else {
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        float x = bounds.exactCenterX();
        float y = bounds.exactCenterY();
        this.f۱۳۰۰۶m.reset();
        this.f۱۳۰۰۶m.moveTo(x, (this.f۱۳۰۰۲i / 2.0f) + y);
        Path path = this.f۱۳۰۰۶m;
        int i = this.f۱۳۰۰۲i;
        path.lineTo(x - i, y - (i / 2.0f));
        Path path2 = this.f۱۳۰۰۶m;
        int i2 = this.f۱۳۰۰۲i;
        path2.lineTo(i2 + x, y - (i2 / 2.0f));
        this.f۱۳۰۰۶m.close();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float degree;
        int saveCount = canvas.save();
        Rect bounds = getBounds();
        if (!isRunning()) {
            if (this.f۱۳۰۰۴k == f۱۲۹۹۵q) {
                canvas.rotate(180.0f, bounds.exactCenterX(), bounds.exactCenterY());
            }
        } else {
            float value = this.f۱۳۰۰۵l.getInterpolation(this.f۱۲۹۹۸e);
            if (this.f۱۳۰۰۷n) {
                if (this.f۱۳۰۰۴k == f۱۲۹۹۵q) {
                    degree = 180.0f * value;
                } else {
                    degree = 180.0f * (1.0f + value);
                }
            } else if (this.f۱۳۰۰۴k == f۱۲۹۹۵q) {
                degree = value * (-180.0f);
            } else {
                degree = (1.0f + value) * (-180.0f);
            }
            canvas.rotate(degree, bounds.exactCenterX(), bounds.exactCenterY());
        }
        this.f۱۳۰۰۰g.setColor(this.f۱۳۰۰۳j);
        canvas.drawPath(this.f۱۳۰۰۶m, this.f۱۳۰۰۰g);
        canvas.restoreToCount(saveCount);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f۱۳۰۰۰g.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
        this.f۱۳۰۰۰g.setColorFilter(cf);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        int color = this.f۱۳۰۰۱h.getColorForState(state, this.f۱۳۰۰۳j);
        if (this.f۱۳۰۰۳j != color) {
            this.f۱۳۰۰۳j = color;
            return true;
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۴۳۶۰a() {
        this.f۱۲۹۹۷d = SystemClock.uptimeMillis();
        this.f۱۲۹۹۸e = 0.0f;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        m۱۴۳۶۰a();
        scheduleSelf(this.f۱۳۰۰۸o, SystemClock.uptimeMillis() + 16);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f۱۲۹۹۶c = false;
        unscheduleSelf(this.f۱۳۰۰۸o);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f۱۲۹۹۶c;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable what, long when) {
        this.f۱۲۹۹۶c = true;
        super.scheduleSelf(what, when);
    }

    /* renamed from: b.j.a.e.a$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Ca.this.m۱۴۳۶۲b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: contains not printable characters */
    public void m۱۴۳۶۲b() {
        long curTime = SystemClock.uptimeMillis();
        this.f۱۲۹۹۸e = Math.min(1.0f, (curTime - this.f۱۲۹۹۷d) / this.f۱۲۹۹۹f);
        if (this.f۱۲۹۹۸e == 1.0f) {
            this.f۱۲۹۹۶c = false;
        }
        if (isRunning()) {
            scheduleSelf(this.f۱۳۰۰۸o, SystemClock.uptimeMillis() + 16);
        }
        invalidateSelf();
    }
}
