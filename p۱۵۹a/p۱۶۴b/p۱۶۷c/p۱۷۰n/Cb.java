package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd;

/* renamed from: a.b.c.n.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends FrameLayout implements InterfaceCd {

    /* renamed from: c, reason: contains not printable characters */
    private final Cc f۸۳۰۵c;

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    /* renamed from: a, reason: contains not printable characters */
    public void mo۷۹۵۴a() {
        this.f۸۳۰۵c.m۷۹۳۶a();
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    /* renamed from: b, reason: contains not printable characters */
    public void mo۷۹۵۵b() {
        this.f۸۳۰۵c.m۷۹۴۱b();
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    public InterfaceCd.e getRevealInfo() {
        this.f۸۳۰۵c.m۷۹۴۴e();
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    public void setRevealInfo(InterfaceCd.e revealInfo) {
        this.f۸۳۰۵c.m۷۹۳۸a(revealInfo);
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    public int getCircularRevealScrimColor() {
        this.f۸۳۰۵c.m۷۹۴۳d();
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    public void setCircularRevealScrimColor(int color) {
        this.f۸۳۰۵c.m۷۹۳۷a(color);
        throw null;
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f۸۳۰۵c.m۷۹۴۲c();
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۰n.InterfaceCd
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f۸۳۰۵c.m۷۹۴۰a(drawable);
        throw null;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        Cc cc = this.f۸۳۰۵c;
        if (cc != null) {
            cc.m۷۹۳۹a(canvas);
            throw null;
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public boolean isOpaque() {
        Cc cc = this.f۸۳۰۵c;
        if (cc != null) {
            cc.m۷۹۴۵f();
            throw null;
        }
        return super.isOpaque();
    }
}
