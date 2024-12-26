package p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f.Cd;

/* renamed from: b.j.a.e.b  reason: invalid class name */
public class Cb extends Drawable implements Animatable {

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۱۳۰۱۰c;

    /* renamed from: d  reason: contains not printable characters */
    private long f۱۳۰۱۱d;

    /* renamed from: e  reason: contains not printable characters */
    private float f۱۳۰۱۲e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۳۰۱۳f;

    /* renamed from: g  reason: contains not printable characters */
    private Paint f۱۳۰۱۴g;

    /* renamed from: h  reason: contains not printable characters */
    private ColorStateList f۱۳۰۱۵h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۳۰۱۶i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۳۰۱۷j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۳۰۱۸k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۳۰۱۹l;

    /* renamed from: m  reason: contains not printable characters */
    private PathEffect f۱۳۰۲۰m;

    /* renamed from: n  reason: contains not printable characters */
    private Path f۱۳۰۲۱n;

    /* renamed from: o  reason: contains not printable characters */
    private boolean f۱۳۰۲۲o;

    /* renamed from: p  reason: contains not printable characters */
    private boolean f۱۳۰۲۳p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۳۰۲۴q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۳۰۲۵r;

    /* renamed from: s  reason: contains not printable characters */
    private final Runnable f۱۳۰۲۶s;

    public Cb(int height, ColorStateList colorStateList, int animDuration) {
        this(height, 0, 0, colorStateList, animDuration);
    }

    public Cb(int height, int paddingLeft, int paddingRight, ColorStateList colorStateList, int animDuration) {
        this.f۱۳۰۱۰c = false;
        this.f۱۳۰۱۹l = true;
        this.f۱۳۰۲۲o = false;
        this.f۱۳۰۲۳p = true;
        this.f۱۳۰۲۶s = new RunnableCa();
        this.f۱۳۰۱۶i = height;
        this.f۱۳۰۲۴q = paddingLeft;
        this.f۱۳۰۲۵r = paddingRight;
        this.f۱۳۰۱۳f = animDuration;
        this.f۱۳۰۱۴g = new Paint();
        this.f۱۳۰۱۴g.setAntiAlias(true);
        this.f۱۳۰۱۴g.setStyle(Paint.Style.STROKE);
        this.f۱۳۰۱۴g.setStrokeWidth((float) this.f۱۳۰۱۶i);
        this.f۱۳۰۱۴g.setStrokeCap(Paint.Cap.ROUND);
        this.f۱۳۰۱۴g.setStrokeJoin(Paint.Join.ROUND);
        this.f۱۳۰۲۱n = new Path();
        this.f۱۳۰۲۳p = false;
        m۱۶۴۴۹a(colorStateList);
        this.f۱۳۰۲۳p = true;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۴۵۰b(int height) {
        if (this.f۱۳۰۱۶i != height) {
            this.f۱۳۰۱۶i = height;
            this.f۱۳۰۱۴g.setStrokeWidth((float) this.f۱۳۰۱۶i);
            invalidateSelf();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۴۹a(ColorStateList colorStateList) {
        this.f۱۳۰۱۵h = colorStateList;
        onStateChange(getState());
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۴۸a(int duration) {
        this.f۱۳۰۱۳f = duration;
    }

    /* renamed from: a  reason: contains not printable characters */
    private PathEffect m۱۶۴۴۴a() {
        if (this.f۱۳۰۲۰m == null) {
            this.f۱۳۰۲۰m = new DashPathEffect(new float[]{0.2f, (float) (this.f۱۳۰۱۶i * 2)}, 0.0f);
        }
        return this.f۱۳۰۲۰m;
    }

    public void draw(Canvas canvas) {
        if (this.f۱۳۰۱۶i != 0) {
            Rect bounds = getBounds();
            float y = (float) (bounds.bottom - (this.f۱۳۰۱۶i / 2));
            PathEffect pathEffect = null;
            if (!isRunning()) {
                this.f۱۳۰۲۱n.reset();
                this.f۱۳۰۲۱n.moveTo((float) (bounds.left + this.f۱۳۰۲۴q), y);
                this.f۱۳۰۲۱n.lineTo((float) (bounds.right - this.f۱۳۰۲۵r), y);
                Paint paint = this.f۱۳۰۱۴g;
                if (!this.f۱۳۰۱۹l) {
                    pathEffect = m۱۶۴۴۴a();
                }
                paint.setPathEffect(pathEffect);
                this.f۱۳۰۱۴g.setColor(this.f۱۳۰۱۸k);
                canvas.drawPath(this.f۱۳۰۲۱n, this.f۱۳۰۱۴g);
                return;
            }
            int i = bounds.right;
            int i2 = bounds.left;
            int i3 = this.f۱۳۰۲۵r;
            int i4 = this.f۱۳۰۲۴q;
            float centerX = ((float) (((i + i2) - i3) + i4)) / 2.0f;
            float f = this.f۱۳۰۱۲e;
            float start = ((1.0f - f) * centerX) + (((float) (i2 + i4)) * f);
            float end = ((1.0f - f) * centerX) + (((float) (i + i3)) * f);
            this.f۱۳۰۱۴g.setPathEffect(null);
            if (this.f۱۳۰۱۲e < 1.0f) {
                this.f۱۳۰۱۴g.setColor(this.f۱۳۰۱۷j);
                this.f۱۳۰۲۱n.reset();
                this.f۱۳۰۲۱n.moveTo((float) (bounds.left + this.f۱۳۰۲۴q), y);
                this.f۱۳۰۲۱n.lineTo(start, y);
                this.f۱۳۰۲۱n.moveTo((float) (bounds.right - this.f۱۳۰۲۵r), y);
                this.f۱۳۰۲۱n.lineTo(end, y);
                canvas.drawPath(this.f۱۳۰۲۱n, this.f۱۳۰۱۴g);
            }
            this.f۱۳۰۱۴g.setColor(this.f۱۳۰۱۸k);
            this.f۱۳۰۲۱n.reset();
            this.f۱۳۰۲۱n.moveTo(start, y);
            this.f۱۳۰۲۱n.lineTo(end, y);
            canvas.drawPath(this.f۱۳۰۲۱n, this.f۱۳۰۱۴g);
        }
    }

    public void setAlpha(int alpha) {
        this.f۱۳۰۱۴g.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f۱۳۰۱۴g.setColorFilter(cf);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        this.f۱۳۰۱۹l = Cd.m۱۶۵۱۳a(state, 16842910);
        int color = this.f۱۳۰۱۵h.getColorForState(state, this.f۱۳۰۱۸k);
        if (this.f۱۳۰۱۸k != color) {
            if (this.f۱۳۰۲۲o || !this.f۱۳۰۲۳p || !this.f۱۳۰۱۹l || this.f۱۳۰۱۳f <= 0) {
                this.f۱۳۰۱۷j = color;
                this.f۱۳۰۱۸k = color;
                return true;
            }
            this.f۱۳۰۱۷j = isRunning() ? this.f۱۳۰۱۷j : this.f۱۳۰۱۸k;
            this.f۱۳۰۱۸k = color;
            start();
            return true;
        } else if (isRunning()) {
            return false;
        } else {
            this.f۱۳۰۱۷j = color;
            return false;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۴۴۶b() {
        this.f۱۳۰۱۱d = SystemClock.uptimeMillis();
        this.f۱۳۰۱۲e = 0.0f;
    }

    public void start() {
        m۱۶۴۴۶b();
        scheduleSelf(this.f۱۳۰۲۶s, SystemClock.uptimeMillis() + 16);
        invalidateSelf();
    }

    public void stop() {
        this.f۱۳۰۱۰c = false;
        unscheduleSelf(this.f۱۳۰۲۶s);
        invalidateSelf();
    }

    public boolean isRunning() {
        return this.f۱۳۰۱۰c;
    }

    public void scheduleSelf(Runnable what, long when) {
        this.f۱۳۰۱۰c = true;
        super.scheduleSelf(what, when);
    }

    /* renamed from: b.j.a.e.b$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            Cb.this.m۱۶۴۴۷c();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c  reason: contains not printable characters */
    private void m۱۶۴۴۷c() {
        this.f۱۳۰۱۲e = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f۱۳۰۱۱d)) / ((float) this.f۱۳۰۱۳f));
        if (this.f۱۳۰۱۲e == 1.0f) {
            this.f۱۳۰۱۰c = false;
        }
        if (isRunning()) {
            scheduleSelf(this.f۱۳۰۲۶s, SystemClock.uptimeMillis() + 16);
        }
        invalidateSelf();
    }
}
