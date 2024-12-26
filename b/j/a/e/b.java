package b.j.a.e;

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
import b.j.a.f.d;

public class b extends Drawable implements Animatable {

    /* renamed from: c  reason: collision with root package name */
    private boolean f۲۵۹۸c;

    /* renamed from: d  reason: collision with root package name */
    private long f۲۵۹۹d;

    /* renamed from: e  reason: collision with root package name */
    private float f۲۶۰۰e;

    /* renamed from: f  reason: collision with root package name */
    private int f۲۶۰۱f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f۲۶۰۲g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f۲۶۰۳h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private PathEffect m;
    private Path n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private final Runnable s;

    public b(int height, ColorStateList colorStateList, int animDuration) {
        this(height, 0, 0, colorStateList, animDuration);
    }

    public b(int height, int paddingLeft, int paddingRight, ColorStateList colorStateList, int animDuration) {
        this.f۲۵۹۸c = false;
        this.l = true;
        this.o = false;
        this.p = true;
        this.s = new a();
        this.i = height;
        this.q = paddingLeft;
        this.r = paddingRight;
        this.f۲۶۰۱f = animDuration;
        this.f۲۶۰۲g = new Paint();
        this.f۲۶۰۲g.setAntiAlias(true);
        this.f۲۶۰۲g.setStyle(Paint.Style.STROKE);
        this.f۲۶۰۲g.setStrokeWidth((float) this.i);
        this.f۲۶۰۲g.setStrokeCap(Paint.Cap.ROUND);
        this.f۲۶۰۲g.setStrokeJoin(Paint.Join.ROUND);
        this.n = new Path();
        this.p = false;
        a(colorStateList);
        this.p = true;
    }

    public void b(int height) {
        if (this.i != height) {
            this.i = height;
            this.f۲۶۰۲g.setStrokeWidth((float) this.i);
            invalidateSelf();
        }
    }

    public void a(ColorStateList colorStateList) {
        this.f۲۶۰۳h = colorStateList;
        onStateChange(getState());
    }

    public void a(int duration) {
        this.f۲۶۰۱f = duration;
    }

    private PathEffect a() {
        if (this.m == null) {
            this.m = new DashPathEffect(new float[]{0.2f, (float) (this.i * 2)}, 0.0f);
        }
        return this.m;
    }

    public void draw(Canvas canvas) {
        if (this.i != 0) {
            Rect bounds = getBounds();
            float y = (float) (bounds.bottom - (this.i / 2));
            PathEffect pathEffect = null;
            if (!isRunning()) {
                this.n.reset();
                this.n.moveTo((float) (bounds.left + this.q), y);
                this.n.lineTo((float) (bounds.right - this.r), y);
                Paint paint = this.f۲۶۰۲g;
                if (!this.l) {
                    pathEffect = a();
                }
                paint.setPathEffect(pathEffect);
                this.f۲۶۰۲g.setColor(this.k);
                canvas.drawPath(this.n, this.f۲۶۰۲g);
                return;
            }
            int i2 = bounds.right;
            int i3 = bounds.left;
            int i4 = this.r;
            int i5 = this.q;
            float centerX = ((float) (((i2 + i3) - i4) + i5)) / 2.0f;
            float f2 = this.f۲۶۰۰e;
            float start = ((1.0f - f2) * centerX) + (((float) (i3 + i5)) * f2);
            float end = ((1.0f - f2) * centerX) + (((float) (i2 + i4)) * f2);
            this.f۲۶۰۲g.setPathEffect(null);
            if (this.f۲۶۰۰e < 1.0f) {
                this.f۲۶۰۲g.setColor(this.j);
                this.n.reset();
                this.n.moveTo((float) (bounds.left + this.q), y);
                this.n.lineTo(start, y);
                this.n.moveTo((float) (bounds.right - this.r), y);
                this.n.lineTo(end, y);
                canvas.drawPath(this.n, this.f۲۶۰۲g);
            }
            this.f۲۶۰۲g.setColor(this.k);
            this.n.reset();
            this.n.moveTo(start, y);
            this.n.lineTo(end, y);
            canvas.drawPath(this.n, this.f۲۶۰۲g);
        }
    }

    public void setAlpha(int alpha) {
        this.f۲۶۰۲g.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f۲۶۰۲g.setColorFilter(cf);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        this.l = d.a(state, 16842910);
        int color = this.f۲۶۰۳h.getColorForState(state, this.k);
        if (this.k != color) {
            if (this.o || !this.p || !this.l || this.f۲۶۰۱f <= 0) {
                this.j = color;
                this.k = color;
                return true;
            }
            this.j = isRunning() ? this.j : this.k;
            this.k = color;
            start();
            return true;
        } else if (isRunning()) {
            return false;
        } else {
            this.j = color;
            return false;
        }
    }

    private void b() {
        this.f۲۵۹۹d = SystemClock.uptimeMillis();
        this.f۲۶۰۰e = 0.0f;
    }

    public void start() {
        b();
        scheduleSelf(this.s, SystemClock.uptimeMillis() + 16);
        invalidateSelf();
    }

    public void stop() {
        this.f۲۵۹۸c = false;
        unscheduleSelf(this.s);
        invalidateSelf();
    }

    public boolean isRunning() {
        return this.f۲۵۹۸c;
    }

    public void scheduleSelf(Runnable what, long when) {
        this.f۲۵۹۸c = true;
        super.scheduleSelf(what, when);
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            b.this.c();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c() {
        this.f۲۶۰۰e = Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f۲۵۹۹d)) / ((float) this.f۲۶۰۱f));
        if (this.f۲۶۰۰e == 1.0f) {
            this.f۲۵۹۸c = false;
        }
        if (isRunning()) {
            scheduleSelf(this.s, SystemClock.uptimeMillis() + 16);
        }
        invalidateSelf();
    }
}
