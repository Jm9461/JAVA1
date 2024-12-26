package a.b.c.n.e;

import a.b.c.n.c;
import a.b.c.n.d;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;

public class a extends CardView implements d {
    private final c l;

    @Override // a.b.c.n.d
    public void a() {
        this.l.a();
        throw null;
    }

    @Override // a.b.c.n.d
    public void b() {
        this.l.b();
        throw null;
    }

    @Override // a.b.c.n.d
    public void setRevealInfo(d.e revealInfo) {
        this.l.a(revealInfo);
        throw null;
    }

    @Override // a.b.c.n.d
    public d.e getRevealInfo() {
        this.l.e();
        throw null;
    }

    @Override // a.b.c.n.d
    public void setCircularRevealScrimColor(int color) {
        this.l.a(color);
        throw null;
    }

    @Override // a.b.c.n.d
    public int getCircularRevealScrimColor() {
        this.l.d();
        throw null;
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.l.c();
        throw null;
    }

    @Override // a.b.c.n.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.l.a(drawable);
        throw null;
    }

    public void draw(Canvas canvas) {
        c cVar = this.l;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.a(canvas);
            throw null;
        }
    }

    public boolean isOpaque() {
        c cVar = this.l;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.f();
        throw null;
    }
}
