package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.p۰۱۲e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۷v7.widget.CardView;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.Cc;

/* renamed from: a.b.c.n.e.a  reason: invalid class name */
public class Ca extends CardView implements AbstractCd {

    /* renamed from: l  reason: contains not printable characters */
    private final Cc f۸۳۱۴l;

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۰۲۱a() {
        this.f۸۳۱۴l.m۱۰۰۰۳a();
        throw null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۰۲۲b() {
        this.f۸۳۱۴l.m۱۰۰۰۸b();
        throw null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    public void setRevealInfo(AbstractCd.Ce revealInfo) {
        this.f۸۳۱۴l.m۱۰۰۰۵a(revealInfo);
        throw null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    public AbstractCd.Ce getRevealInfo() {
        this.f۸۳۱۴l.m۱۰۰۱۱e();
        throw null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    public void setCircularRevealScrimColor(int color) {
        this.f۸۳۱۴l.m۱۰۰۰۴a(color);
        throw null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    public int getCircularRevealScrimColor() {
        this.f۸۳۱۴l.m۱۰۰۱۰d();
        throw null;
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f۸۳۱۴l.m۱۰۰۰۹c();
        throw null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f۸۳۱۴l.m۱۰۰۰۷a(drawable);
        throw null;
    }

    public void draw(Canvas canvas) {
        Cc cVar = this.f۸۳۱۴l;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.m۱۰۰۰۶a(canvas);
            throw null;
        }
    }

    public boolean isOpaque() {
        Cc cVar = this.f۸۳۱۴l;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.m۱۰۰۱۲f();
        throw null;
    }
}
