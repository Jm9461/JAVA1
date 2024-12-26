package p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۰e;

import android.R;
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
import p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۱f.Cd;

/* renamed from: b.j.a.e.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends Drawable implements Animatable {

    /* renamed from: c, reason: contains not printable characters */
    private boolean f۱۳۰۱۰c;

    /* renamed from: d, reason: contains not printable characters */
    private long f۱۳۰۱۱d;

    /* renamed from: e, reason: contains not printable characters */
    private float f۱۳۰۱۲e;

    /* renamed from: f, reason: contains not printable characters */
    private int f۱۳۰۱۳f;

    /* renamed from: g, reason: contains not printable characters */
    private Paint f۱۳۰۱۴g;

    /* renamed from: h, reason: contains not printable characters */
    private ColorStateList f۱۳۰۱۵h;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۳۰۱۶i;

    /* renamed from: j, reason: contains not printable characters */
    private int f۱۳۰۱۷j;

    /* renamed from: k, reason: contains not printable characters */
    private int f۱۳۰۱۸k;

    /* renamed from: l, reason: contains not printable characters */
    private boolean f۱۳۰۱۹l;

    /* renamed from: m, reason: contains not printable characters */
    private PathEffect f۱۳۰۲۰m;

    /* renamed from: n, reason: contains not printable characters */
    private Path f۱۳۰۲۱n;

    /* renamed from: o, reason: contains not printable characters */
    private boolean f۱۳۰۲۲o;

    /* renamed from: p, reason: contains not printable characters */
    private boolean f۱۳۰۲۳p;

    /* renamed from: q, reason: contains not printable characters */
    private int f۱۳۰۲۴q;

    /* renamed from: r, reason: contains not printable characters */
    private int f۱۳۰۲۵r;

    /* renamed from: s, reason: contains not printable characters */
    private final Runnable f۱۳۰۲۶s;

    public Cb(int height, ColorStateList colorStateList, int animDuration) {
        this(height, 0, 0, colorStateList, animDuration);
    }

    public Cb(int height, int paddingLeft, int paddingRight, ColorStateList colorStateList, int animDuration) {
        this.f۱۳۰۱۰c = false;
        this.f۱۳۰۱۹l = true;
        this.f۱۳۰۲۲o = false;
        this.f۱۳۰۲۳p = true;
        this.f۱۳۰۲۶s = new a();
        this.f۱۳۰۱۶i = height;
        this.f۱۳۰۲۴q = paddingLeft;
        this.f۱۳۰۲۵r = paddingRight;
        this.f۱۳۰۱۳f = animDuration;
        this.f۱۳۰۱۴g = new Paint();
        this.f۱۳۰۱۴g.setAntiAlias(true);
        this.f۱۳۰۱۴g.setStyle(Paint.Style.STROKE);
        this.f۱۳۰۱۴g.setStrokeWidth(this.f۱۳۰۱۶i);
        this.f۱۳۰۱۴g.setStrokeCap(Paint.Cap.ROUND);
        this.f۱۳۰۱۴g.setStrokeJoin(Paint.Join.ROUND);
        this.f۱۳۰۲۱n = new Path();
        this.f۱۳۰۲۳p = false;
        m۱۴۳۷۴a(colorStateList);
        this.f۱۳۰۲۳p = true;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۴۳۷۵b(int height) {
        if (this.f۱۳۰۱۶i != height) {
            this.f۱۳۰۱۶i = height;
            this.f۱۳۰۱۴g.setStrokeWidth(this.f۱۳۰۱۶i);
            invalidateSelf();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۷۴a(ColorStateList colorStateList) {
        this.f۱۳۰۱۵h = colorStateList;
        onStateChange(getState());
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۷۳a(int duration) {
        this.f۱۳۰۱۳f = duration;
    }

    /* renamed from: a, reason: contains not printable characters */
    private PathEffect m۱۴۳۶۹a() {
        if (this.f۱۳۰۲۰m == null) {
            this.f۱۳۰۲۰m = new DashPathEffect(new float[]{0.2f, this.f۱۳۰۱۶i * 2}, 0.0f);
        }
        return this.f۱۳۰۲۰m;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f۱۳۰۱۶i == 0) {
            return;
        }
        Rect bounds = getBounds();
        float y = bounds.bottom - (this.f۱۳۰۱۶i / 2);
        if (!isRunning()) {
            this.f۱۳۰۲۱n.reset();
            this.f۱۳۰۲۱n.moveTo(bounds.left + this.f۱۳۰۲۴q, y);
            this.f۱۳۰۲۱n.lineTo(bounds.right - this.f۱۳۰۲۵r, y);
            this.f۱۳۰۱۴g.setPathEffect(this.f۱۳۰۱۹l ? null : m۱۴۳۶۹a());
            this.f۱۳۰۱۴g.setColor(this.f۱۳۰۱۸k);
            canvas.drawPath(this.f۱۳۰۲۱n, this.f۱۳۰۱۴g);
            return;
        }
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = this.f۱۳۰۲۵r;
        int i4 = this.f۱۳۰۲۴q;
        float centerX = (((i + i2) - i3) + i4) / 2.0f;
        float f2 = this.f۱۳۰۱۲e;
        float start = ((1.0f - f2) * centerX) + ((i2 + i4) * f2);
        float end = ((1.0f - f2) * centerX) + ((i + i3) * f2);
        this.f۱۳۰۱۴g.setPathEffect(null);
        if (this.f۱۳۰۱۲e < 1.0f) {
            this.f۱۳۰۱۴g.setColor(this.f۱۳۰۱۷j);
            this.f۱۳۰۲۱n.reset();
            this.f۱۳۰۲۱n.moveTo(bounds.left + this.f۱۳۰۲۴q, y);
            this.f۱۳۰۲۱n.lineTo(start, y);
            this.f۱۳۰۲۱n.moveTo(bounds.right - this.f۱۳۰۲۵r, y);
            this.f۱۳۰۲۱n.lineTo(end, y);
            canvas.drawPath(this.f۱۳۰۲۱n, this.f۱۳۰۱۴g);
        }
        this.f۱۳۰۱۴g.setColor(this.f۱۳۰۱۸k);
        this.f۱۳۰۲۱n.reset();
        this.f۱۳۰۲۱n.moveTo(start, y);
        this.f۱۳۰۲۱n.lineTo(end, y);
        canvas.drawPath(this.f۱۳۰۲۱n, this.f۱۳۰۱۴g);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f۱۳۰۱۴g.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
        this.f۱۳۰۱۴g.setColorFilter(cf);
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
        this.f۱۳۰۱۹l = Cd.m۱۴۴۳۸a(state, R.attr.state_enabled);
        int color = this.f۱۳۰۱۵h.getColorForState(state, this.f۱۳۰۱۸k);
        if (this.f۱۳۰۱۸k != color) {
            if (!this.f۱۳۰۲۲o && this.f۱۳۰۲۳p && this.f۱۳۰۱۹l && this.f۱۳۰۱۳f > 0) {
                this.f۱۳۰۱۷j = isRunning() ? this.f۱۳۰۱۷j : this.f۱۳۰۱۸k;
                this.f۱۳۰۱۸k = color;
                start();
                return true;
            }
            this.f۱۳۰۱۷j = color;
            this.f۱۳۰۱۸k = color;
            return true;
        }
        if (!isRunning()) {
            this.f۱۳۰۱۷j = color;
            return false;
        }
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۴۳۷۱b() {
        this.f۱۳۰۱۱d = SystemClock.uptimeMillis();
        this.f۱۳۰۱۲e = 0.0f;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        m۱۴۳۷۱b();
        scheduleSelf(this.f۱۳۰۲۶s, SystemClock.uptimeMillis() + 16);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f۱۳۰۱۰c = false;
        unscheduleSelf(this.f۱۳۰۲۶s);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f۱۳۰۱۰c;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable what, long when) {
        this.f۱۳۰۱۰c = true;
        super.scheduleSelf(what, when);
    }

    /* renamed from: b.j.a.e.b$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Cb.this.m۱۴۳۷۲c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: contains not printable characters */
    public void m۱۴۳۷۲c() {
        long curTime = SystemClock.uptimeMillis();
        this.f۱۳۰۱۲e = Math.min(1.0f, (curTime - this.f۱۳۰۱۱d) / this.f۱۳۰۱۳f);
        if (this.f۱۳۰۱۲e == 1.0f) {
            this.f۱۳۰۱۰c = false;
        }
        if (isRunning()) {
            scheduleSelf(this.f۱۳۰۲۶s, SystemClock.uptimeMillis() + 16);
        }
        invalidateSelf();
    }
}
