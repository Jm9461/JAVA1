package a.b.c.n;

import a.b.c.n.d;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class b extends FrameLayout implements d {

    /* renamed from: c  reason: collision with root package name */
    private final c f۵۷c;

    @Override // a.b.c.n.d
    public void a() {
        this.f۵۷c.a();
        throw null;
    }

    @Override // a.b.c.n.d
    public void b() {
        this.f۵۷c.b();
        throw null;
    }

    @Override // a.b.c.n.d
    public d.e getRevealInfo() {
        this.f۵۷c.e();
        throw null;
    }

    @Override // a.b.c.n.d
    public void setRevealInfo(d.e revealInfo) {
        this.f۵۷c.a(revealInfo);
        throw null;
    }

    @Override // a.b.c.n.d
    public int getCircularRevealScrimColor() {
        this.f۵۷c.d();
        throw null;
    }

    @Override // a.b.c.n.d
    public void setCircularRevealScrimColor(int color) {
        this.f۵۷c.a(color);
        throw null;
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f۵۷c.c();
        throw null;
    }

    @Override // a.b.c.n.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f۵۷c.a(drawable);
        throw null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        c cVar = this.f۵۷c;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.a(canvas);
            throw null;
        }
    }

    public boolean isOpaque() {
        c cVar = this.f۵۷c;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.f();
        throw null;
    }
}
