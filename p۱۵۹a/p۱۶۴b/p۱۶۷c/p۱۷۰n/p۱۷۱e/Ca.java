package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.p۱۷۱e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.Cc;
import p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd;

/* renamed from: a.b.c.n.e.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends CardView implements InterfaceCd {

    /* renamed from: l, reason: contains not printable characters */
    private final Cc f۸۳۱۴l;

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public void mo۷۹۵۴a() {
        this.f۸۳۱۴l.m۷۹۳۶a();
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    /* renamed from: b, reason: contains not printable characters */
    public void mo۷۹۵۵b() {
        this.f۸۳۱۴l.m۷۹۴۱b();
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    public void setRevealInfo(InterfaceCd.e revealInfo) {
        this.f۸۳۱۴l.m۷۹۳۸a(revealInfo);
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    public InterfaceCd.e getRevealInfo() {
        this.f۸۳۱۴l.m۷۹۴۴e();
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    public void setCircularRevealScrimColor(int color) {
        this.f۸۳۱۴l.m۷۹۳۷a(color);
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    public int getCircularRevealScrimColor() {
        this.f۸۳۱۴l.m۷۹۴۳d();
        throw null;
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f۸۳۱۴l.m۷۹۴۲c();
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f۸۳۱۴l.m۷۹۴۰a(drawable);
        throw null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Cc cc = this.f۸۳۱۴l;
        if (cc != null) {
            cc.m۷۹۳۹a(canvas);
            throw null;
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public boolean isOpaque() {
        Cc cc = this.f۸۳۱۴l;
        if (cc != null) {
            cc.m۷۹۴۵f();
            throw null;
        }
        return super.isOpaque();
    }
}
