package b.l.a.a.e;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.e;
import android.support.v7.widget.AppCompatTextView;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import b.e.a.a.c;
import b.h.a.a;
import d.a.a.b;

public abstract class a extends e {
    private RelativeLayout r;
    private ImageView s;
    private AppCompatTextView t;
    private b.f.a.a u;
    private FrameLayout v;
    private b.l.a.a.f.a w;
    private boolean x = false;
    private int y = 0;

    public abstract void a(b.l.a.a.f.a aVar);

    public abstract void m();

    /* access modifiers changed from: protected */
    @Override // android.support.v4.app.g, android.support.v4.app.e0, android.support.v7.app.e
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.w = new b.l.a.a.f.a();
        a(this.w);
        this.y = b.l.a.a.g.b.a(this.w);
        c(this.y);
    }

    public void c(int flag) {
        setContentView(b.l.a.a.d.activity_main_lib);
        this.r = (RelativeLayout) findViewById(b.l.a.a.c.rlColor);
        this.t = (AppCompatTextView) findViewById(b.l.a.a.c.txtTitle);
        if (flag == 1) {
            this.v = (FrameLayout) findViewById(b.l.a.a.c.flCentral);
            n();
        } else if (flag == 2) {
            this.s = (ImageView) findViewById(b.l.a.a.c.imgLogo);
            this.s.setImageResource(this.w.i());
        }
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && !this.x) {
            o();
        }
    }

    public void n() {
        int viewSize = getResources().getDimensionPixelSize(b.l.a.a.b.fourthSampleViewSize);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(viewSize, viewSize);
        params.setMargins(0, 0, 0, 50);
        b.f.a.b loaderBuilder = new b.f.a.b();
        loaderBuilder.a(this.v);
        loaderBuilder.a(params);
        loaderBuilder.a(this.w.l());
        loaderBuilder.a(this.w.k(), this.w.j());
        loaderBuilder.e(this.w.o());
        loaderBuilder.c(Color.parseColor(String.format("#%06X", Integer.valueOf(getResources().getColor(this.w.n()) & 16777215))));
        loaderBuilder.a(Color.parseColor(String.format("#%06X", Integer.valueOf(getResources().getColor(this.w.m()) & 16777215))));
        loaderBuilder.d(this.w.e());
        loaderBuilder.b(this.w.d());
        loaderBuilder.a(new b.f.a.d.b());
        this.u = loaderBuilder.a();
        this.u.setOnStateChangeListener(new C۰۰۶۰a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.l.a.a.e.a$a  reason: collision with other inner class name */
    public class C۰۰۶۰a implements b.f.a.f.a {
        C۰۰۶۰a() {
        }

        @Override // b.f.a.f.a
        public void a(int i) {
            if (i == 3) {
                a.this.q();
            }
        }
    }

    public void o() {
        int finalRadius = Math.max(this.r.getWidth(), this.r.getHeight()) + (this.r.getHeight() / 2);
        int y2 = b.l.a.a.g.a.a(this.r, this.w.q());
        int x2 = b.l.a.a.g.a.a(this.r, this.w.p());
        this.r.setBackgroundColor(getResources().getColor(this.w.h()));
        d.a.a.b animator = d.a.a.e.a(this.r, x2, y2, 0.0f, (float) finalRadius);
        animator.a(new AccelerateDecelerateInterpolator());
        animator.a(this.w.a());
        animator.a(new b());
        animator.a();
        this.x = true;
    }

    /* access modifiers changed from: package-private */
    public class b implements b.a {
        b() {
        }

        @Override // d.a.a.b.a
        public void d() {
        }

        @Override // d.a.a.b.a
        public void b() {
        }

        @Override // d.a.a.b.a
        public void c() {
        }

        @Override // d.a.a.b.a
        public void a() {
            if (a.this.y == 1) {
                a.this.u.b();
            } else {
                a.this.p();
            }
        }
    }

    public void p() {
        this.s.setVisibility(0);
        this.s.setImageResource(this.w.i());
        c.b a2 = b.e.a.a.c.a(this.w.c());
        a2.a(new c());
        a2.a((long) this.w.b());
        a2.a(this.s);
    }

    /* access modifiers changed from: package-private */
    public class c implements a.AbstractC۰۰۵۲a {
        c() {
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void c(b.h.a.a animation) {
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void a(b.h.a.a animation) {
            a.this.q();
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void b(b.h.a.a animation) {
        }
    }

    public void q() {
        this.t.setText(this.w.s());
        this.t.setTextSize(this.w.u());
        this.t.setTextColor(getResources().getColor(this.w.t()));
        if (!this.w.r().isEmpty()) {
            a(this.w.r());
        }
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-2, -2);
        params.addRule(3, b.l.a.a.c.flCentral);
        params.addRule(14);
        this.t.setLayoutParams(params);
        this.t.setVisibility(0);
        c.b a2 = b.e.a.a.c.a(this.w.g());
        a2.a(new d());
        a2.a((long) this.w.f());
        a2.a(this.t);
    }

    /* access modifiers changed from: package-private */
    public class d implements a.AbstractC۰۰۵۲a {
        d() {
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void c(b.h.a.a animation) {
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void a(b.h.a.a animation) {
            a.this.m();
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void b(b.h.a.a animation) {
        }
    }

    public void a(String font) {
        this.t.setTypeface(Typeface.createFromAsset(getAssets(), font));
    }
}
