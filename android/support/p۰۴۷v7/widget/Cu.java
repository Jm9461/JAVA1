package android.support.p۰۴۷v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.graphics.drawable.Ca;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.u  reason: invalid class name */
public class Cu extends Cr {

    /* renamed from: d  reason: contains not printable characters */
    private final SeekBar f۱۲۳۳۷d;

    /* renamed from: e  reason: contains not printable characters */
    private Drawable f۱۲۳۳۸e;

    /* renamed from: f  reason: contains not printable characters */
    private ColorStateList f۱۲۳۳۹f = null;

    /* renamed from: g  reason: contains not printable characters */
    private PorterDuff.Mode f۱۲۳۴۰g = null;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۲۳۴۱h = false;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۱۲۳۴۲i = false;

    Cu(SeekBar view) {
        super(view);
        this.f۱۲۳۳۷d = view;
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p۰۴۷v7.widget.Cr
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۲۸a(AttributeSet attrs, int defStyleAttr) {
        super.m۱۵۵۵۸a(attrs, defStyleAttr);
        Cj1 a = Cj1.m۱۵۳۴۵a(this.f۱۲۳۳۷d.getContext(), attrs, Cj.AppCompatSeekBar, defStyleAttr, 0);
        Drawable drawable = a.m۱۵۳۵۶c(Cj.AppCompatSeekBar_android_thumb);
        if (drawable != null) {
            this.f۱۲۳۳۷d.setThumb(drawable);
        }
        m۱۵۶۲۷a(a.m۱۵۳۵۴b(Cj.AppCompatSeekBar_tickMark));
        if (a.m۱۵۳۶۴g(Cj.AppCompatSeekBar_tickMarkTintMode)) {
            this.f۱۲۳۴۰g = Ch0.m۱۵۲۵۴a(a.m۱۵۳۵۷d(Cj.AppCompatSeekBar_tickMarkTintMode, -1), this.f۱۲۳۴۰g);
            this.f۱۲۳۴۲i = true;
        }
        if (a.m۱۵۳۶۴g(Cj.AppCompatSeekBar_tickMarkTint)) {
            this.f۱۲۳۳۹f = a.m۱۵۳۴۸a(Cj.AppCompatSeekBar_tickMarkTint);
            this.f۱۲۳۴۱h = true;
        }
        a.m۱۵۳۵۰a();
        m۱۵۶۲۵d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۲۷a(Drawable tickMark) {
        Drawable drawable = this.f۱۲۳۳۸e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f۱۲۳۳۸e = tickMark;
        if (tickMark != null) {
            tickMark.setCallback(this.f۱۲۳۳۷d);
            Ca.m۱۲۷۱۴a(tickMark, android.support.p۰۴۳v4.view.Cu.m۱۳۰۱۴k(this.f۱۲۳۳۷d));
            if (tickMark.isStateful()) {
                tickMark.setState(this.f۱۲۳۳۷d.getDrawableState());
            }
            m۱۵۶۲۵d();
        }
        this.f۱۲۳۳۷d.invalidate();
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۵۶۲۵d() {
        if (this.f۱۲۳۳۸e == null) {
            return;
        }
        if (this.f۱۲۳۴۱h || this.f۱۲۳۴۲i) {
            this.f۱۲۳۳۸e = Ca.m۱۲۷۲۲h(this.f۱۲۳۳۸e.mutate());
            if (this.f۱۲۳۴۱h) {
                Ca.m۱۲۷۰۸a(this.f۱۲۳۳۸e, this.f۱۲۳۳۹f);
            }
            if (this.f۱۲۳۴۲i) {
                Ca.m۱۲۷۱۱a(this.f۱۲۳۳۸e, this.f۱۲۳۴۰g);
            }
            if (this.f۱۲۳۳۸e.isStateful()) {
                this.f۱۲۳۳۸e.setState(this.f۱۲۳۳۷d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۶۳۰c() {
        Drawable drawable = this.f۱۲۳۳۸e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۶۲۹b() {
        Drawable tickMark = this.f۱۲۳۳۸e;
        if (tickMark != null && tickMark.isStateful() && tickMark.setState(this.f۱۲۳۳۷d.getDrawableState())) {
            this.f۱۲۳۳۷d.invalidateDrawable(tickMark);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۲۶a(Canvas canvas) {
        if (this.f۱۲۳۳۸e != null) {
            int count = this.f۱۲۳۳۷d.getMax();
            int halfH = 1;
            if (count > 1) {
                int w = this.f۱۲۳۳۸e.getIntrinsicWidth();
                int h = this.f۱۲۳۳۸e.getIntrinsicHeight();
                int halfW = w >= 0 ? w / 2 : 1;
                if (h >= 0) {
                    halfH = h / 2;
                }
                this.f۱۲۳۳۸e.setBounds(-halfW, -halfH, halfW, halfH);
                float spacing = ((float) ((this.f۱۲۳۳۷d.getWidth() - this.f۱۲۳۳۷d.getPaddingLeft()) - this.f۱۲۳۳۷d.getPaddingRight())) / ((float) count);
                int saveCount = canvas.save();
                canvas.translate((float) this.f۱۲۳۳۷d.getPaddingLeft(), (float) (this.f۱۲۳۳۷d.getHeight() / 2));
                for (int i = 0; i <= count; i++) {
                    this.f۱۲۳۳۸e.draw(canvas);
                    canvas.translate(spacing, 0.0f);
                }
                canvas.restoreToCount(saveCount);
            }
        }
    }
}
