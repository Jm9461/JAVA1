package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd;

/* renamed from: a.b.c.n.b  reason: invalid class name */
public class Cb extends FrameLayout implements AbstractCd {

    /* renamed from: c  reason: contains not printable characters */
    private final Cc f۸۳۰۵c;

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۰۰۱a() {
        this.f۸۳۰۵c.m۱۰۰۰۳a();
        throw null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۰۰۲b() {
        this.f۸۳۰۵c.m۱۰۰۰۸b();
        throw null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    public AbstractCd.Ce getRevealInfo() {
        this.f۸۳۰۵c.m۱۰۰۱۱e();
        throw null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    public void setRevealInfo(AbstractCd.Ce revealInfo) {
        this.f۸۳۰۵c.m۱۰۰۰۵a(revealInfo);
        throw null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    public int getCircularRevealScrimColor() {
        this.f۸۳۰۵c.m۱۰۰۱۰d();
        throw null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    public void setCircularRevealScrimColor(int color) {
        this.f۸۳۰۵c.m۱۰۰۰۴a(color);
        throw null;
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f۸۳۰۵c.m۱۰۰۰۹c();
        throw null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f۸۳۰۵c.m۱۰۰۰۷a(drawable);
        throw null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        Cc cVar = this.f۸۳۰۵c;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.m۱۰۰۰۶a(canvas);
            throw null;
        }
    }

    public boolean isOpaque() {
        Cc cVar = this.f۸۳۰۵c;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.m۱۰۰۱۲f();
        throw null;
    }
}
