package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.Ca;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;

/* renamed from: android.support.v7.widget.u, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cu extends Cr {

    /* renamed from: d, reason: contains not printable characters */
    private final SeekBar f۱۲۳۳۷d;

    /* renamed from: e, reason: contains not printable characters */
    private Drawable f۱۲۳۳۸e;

    /* renamed from: f, reason: contains not printable characters */
    private ColorStateList f۱۲۳۳۹f;

    /* renamed from: g, reason: contains not printable characters */
    private PorterDuff.Mode f۱۲۳۴۰g;

    /* renamed from: h, reason: contains not printable characters */
    private boolean f۱۲۳۴۱h;

    /* renamed from: i, reason: contains not printable characters */
    private boolean f۱۲۳۴۲i;

    Cu(SeekBar view) {
        super(view);
        this.f۱۲۳۳۹f = null;
        this.f۱۲۳۴۰g = null;
        this.f۱۲۳۴۱h = false;
        this.f۱۲۳۴۲i = false;
        this.f۱۲۳۳۷d = view;
    }

    @Override // android.support.v7.widget.Cr
    /* renamed from: a, reason: contains not printable characters */
    void mo۱۳۵۵۸a(AttributeSet attrs, int defStyleAttr) {
        super.mo۱۳۵۵۸a(attrs, defStyleAttr);
        Cj1 a2 = Cj1.m۱۳۲۷۵a(this.f۱۲۳۳۷d.getContext(), attrs, Cj.AppCompatSeekBar, defStyleAttr, 0);
        Drawable drawable = a2.m۱۳۲۸۶c(Cj.AppCompatSeekBar_android_thumb);
        if (drawable != null) {
            this.f۱۲۳۳۷d.setThumb(drawable);
        }
        Drawable tickMark = a2.m۱۳۲۸۴b(Cj.AppCompatSeekBar_tickMark);
        m۱۳۵۵۷a(tickMark);
        if (a2.m۱۳۲۹۴g(Cj.AppCompatSeekBar_tickMarkTintMode)) {
            this.f۱۲۳۴۰g = Ch0.m۱۳۱۸۴a(a2.m۱۳۲۸۷d(Cj.AppCompatSeekBar_tickMarkTintMode, -1), this.f۱۲۳۴۰g);
            this.f۱۲۳۴۲i = true;
        }
        if (a2.m۱۳۲۹۴g(Cj.AppCompatSeekBar_tickMarkTint)) {
            this.f۱۲۳۳۹f = a2.m۱۳۲۷۸a(Cj.AppCompatSeekBar_tickMarkTint);
            this.f۱۲۳۴۱h = true;
        }
        a2.m۱۳۲۸۰a();
        m۱۳۵۵۵d();
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۵۵۷a(Drawable tickMark) {
        Drawable drawable = this.f۱۲۳۳۸e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f۱۲۳۳۸e = tickMark;
        if (tickMark != null) {
            tickMark.setCallback(this.f۱۲۳۳۷d);
            Ca.m۱۰۶۴۴a(tickMark, android.support.v4.view.Cu.m۱۰۹۴۴k(this.f۱۲۳۳۷d));
            if (tickMark.isStateful()) {
                tickMark.setState(this.f۱۲۳۳۷d.getDrawableState());
            }
            m۱۳۵۵۵d();
        }
        this.f۱۲۳۳۷d.invalidate();
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۳۵۵۵d() {
        if (this.f۱۲۳۳۸e != null) {
            if (this.f۱۲۳۴۱h || this.f۱۲۳۴۲i) {
                this.f۱۲۳۳۸e = Ca.m۱۰۶۵۲h(this.f۱۲۳۳۸e.mutate());
                if (this.f۱۲۳۴۱h) {
                    Ca.m۱۰۶۳۸a(this.f۱۲۳۳۸e, this.f۱۲۳۳۹f);
                }
                if (this.f۱۲۳۴۲i) {
                    Ca.m۱۰۶۴۱a(this.f۱۲۳۳۸e, this.f۱۲۳۴۰g);
                }
                if (this.f۱۲۳۳۸e.isStateful()) {
                    this.f۱۲۳۳۸e.setState(this.f۱۲۳۳۷d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۳۵۶۰c() {
        Drawable drawable = this.f۱۲۳۳۸e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۳۵۵۹b() {
        Drawable tickMark = this.f۱۲۳۳۸e;
        if (tickMark != null && tickMark.isStateful() && tickMark.setState(this.f۱۲۳۳۷d.getDrawableState())) {
            this.f۱۲۳۳۷d.invalidateDrawable(tickMark);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۵۵۶a(Canvas canvas) {
        if (this.f۱۲۳۳۸e != null) {
            int count = this.f۱۲۳۳۷d.getMax();
            if (count > 1) {
                int w = this.f۱۲۳۳۸e.getIntrinsicWidth();
                int h2 = this.f۱۲۳۳۸e.getIntrinsicHeight();
                int halfW = w >= 0 ? w / 2 : 1;
                int halfH = h2 >= 0 ? h2 / 2 : 1;
                this.f۱۲۳۳۸e.setBounds(-halfW, -halfH, halfW, halfH);
                float spacing = ((this.f۱۲۳۳۷d.getWidth() - this.f۱۲۳۳۷d.getPaddingLeft()) - this.f۱۲۳۳۷d.getPaddingRight()) / count;
                int saveCount = canvas.save();
                canvas.translate(this.f۱۲۳۳۷d.getPaddingLeft(), this.f۱۲۳۳۷d.getHeight() / 2);
                for (int i = 0; i <= count; i++) {
                    this.f۱۲۳۳۸e.draw(canvas);
                    canvas.translate(spacing, 0.0f);
                }
                canvas.restoreToCount(saveCount);
            }
        }
    }
}
