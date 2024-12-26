package android.support.v7.widget;

import a.b.h.a.j;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.a;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* access modifiers changed from: package-private */
public class u extends r {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f۲۲۵۰d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f۲۲۵۱e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f۲۲۵۲f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f۲۲۵۳g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۲۲۵۴h = false;
    private boolean i = false;

    u(SeekBar view) {
        super(view);
        this.f۲۲۵۰d = view;
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.v7.widget.r
    public void a(AttributeSet attrs, int defStyleAttr) {
        super.a(attrs, defStyleAttr);
        j1 a2 = j1.a(this.f۲۲۵۰d.getContext(), attrs, j.AppCompatSeekBar, defStyleAttr, 0);
        Drawable drawable = a2.c(j.AppCompatSeekBar_android_thumb);
        if (drawable != null) {
            this.f۲۲۵۰d.setThumb(drawable);
        }
        a(a2.b(j.AppCompatSeekBar_tickMark));
        if (a2.g(j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f۲۲۵۳g = h0.a(a2.d(j.AppCompatSeekBar_tickMarkTintMode, -1), this.f۲۲۵۳g);
            this.i = true;
        }
        if (a2.g(j.AppCompatSeekBar_tickMarkTint)) {
            this.f۲۲۵۲f = a2.a(j.AppCompatSeekBar_tickMarkTint);
            this.f۲۲۵۴h = true;
        }
        a2.a();
        d();
    }

    /* access modifiers changed from: package-private */
    public void a(Drawable tickMark) {
        Drawable drawable = this.f۲۲۵۱e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f۲۲۵۱e = tickMark;
        if (tickMark != null) {
            tickMark.setCallback(this.f۲۲۵۰d);
            a.a(tickMark, android.support.v4.view.u.k(this.f۲۲۵۰d));
            if (tickMark.isStateful()) {
                tickMark.setState(this.f۲۲۵۰d.getDrawableState());
            }
            d();
        }
        this.f۲۲۵۰d.invalidate();
    }

    private void d() {
        if (this.f۲۲۵۱e == null) {
            return;
        }
        if (this.f۲۲۵۴h || this.i) {
            this.f۲۲۵۱e = a.h(this.f۲۲۵۱e.mutate());
            if (this.f۲۲۵۴h) {
                a.a(this.f۲۲۵۱e, this.f۲۲۵۲f);
            }
            if (this.i) {
                a.a(this.f۲۲۵۱e, this.f۲۲۵۳g);
            }
            if (this.f۲۲۵۱e.isStateful()) {
                this.f۲۲۵۱e.setState(this.f۲۲۵۰d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f۲۲۵۱e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable tickMark = this.f۲۲۵۱e;
        if (tickMark != null && tickMark.isStateful() && tickMark.setState(this.f۲۲۵۰d.getDrawableState())) {
            this.f۲۲۵۰d.invalidateDrawable(tickMark);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        if (this.f۲۲۵۱e != null) {
            int count = this.f۲۲۵۰d.getMax();
            int halfH = 1;
            if (count > 1) {
                int w = this.f۲۲۵۱e.getIntrinsicWidth();
                int h2 = this.f۲۲۵۱e.getIntrinsicHeight();
                int halfW = w >= 0 ? w / 2 : 1;
                if (h2 >= 0) {
                    halfH = h2 / 2;
                }
                this.f۲۲۵۱e.setBounds(-halfW, -halfH, halfW, halfH);
                float spacing = ((float) ((this.f۲۲۵۰d.getWidth() - this.f۲۲۵۰d.getPaddingLeft()) - this.f۲۲۵۰d.getPaddingRight())) / ((float) count);
                int saveCount = canvas.save();
                canvas.translate((float) this.f۲۲۵۰d.getPaddingLeft(), (float) (this.f۲۲۵۰d.getHeight() / 2));
                for (int i2 = 0; i2 <= count; i2++) {
                    this.f۲۲۵۱e.draw(canvas);
                    canvas.translate(spacing, 0.0f);
                }
                canvas.restoreToCount(saveCount);
            }
        }
    }
}
