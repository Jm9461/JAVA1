package p۲۰۸b.p۲۷۴l.p۲۷۵a.p۲۷۶a.p۲۷۷e;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActivityCe;
import android.support.v7.widget.AppCompatTextView;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.Cc;
import p۲۰۸b.p۲۴۹f.p۲۵۰a.Ca;
import p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۳f.InterfaceCa;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa;
import p۲۰۸b.p۲۷۴l.p۲۷۵a.p۲۷۶a.Cc;
import p۲۰۸b.p۲۷۴l.p۲۷۵a.p۲۷۶a.Cd;
import p۲۰۸b.p۲۷۴l.p۲۷۵a.p۲۷۶a.p۲۷۹g.Cb;
import p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb;
import p۲۹۲d.p۲۹۳a.p۲۹۴a.Ce;

/* renamed from: b.l.a.a.e.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractActivityCa extends ActivityCe {

    /* renamed from: r, reason: contains not printable characters */
    private RelativeLayout f۱۳۱۱۱r;

    /* renamed from: s, reason: contains not printable characters */
    private ImageView f۱۳۱۱۲s;

    /* renamed from: t, reason: contains not printable characters */
    private AppCompatTextView f۱۳۱۱۳t;

    /* renamed from: u, reason: contains not printable characters */
    private Ca f۱۳۱۱۴u;

    /* renamed from: v, reason: contains not printable characters */
    private FrameLayout f۱۳۱۱۵v;

    /* renamed from: w, reason: contains not printable characters */
    private p۲۰۸b.p۲۷۴l.p۲۷۵a.p۲۷۶a.p۲۷۸f.Ca f۱۳۱۱۶w;

    /* renamed from: x, reason: contains not printable characters */
    private boolean f۱۳۱۱۷x = false;

    /* renamed from: y, reason: contains not printable characters */
    private int f۱۳۱۱۸y = 0;

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۵۴۰۱a(p۲۰۸b.p۲۷۴l.p۲۷۵a.p۲۷۶a.p۲۷۸f.Ca ca);

    /* renamed from: m, reason: contains not printable characters */
    public abstract void mo۱۵۴۰۲m();

    @Override // android.support.v7.app.ActivityCe, android.support.v4.app.ActivityCg, android.support.v4.app.ActivityCe0, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f۱۳۱۱۶w = new p۲۰۸b.p۲۷۴l.p۲۷۵a.p۲۷۶a.p۲۷۸f.Ca();
        mo۱۵۴۰۱a(this.f۱۳۱۱۶w);
        this.f۱۳۱۱۸y = Cb.m۱۴۵۱۰a(this.f۱۳۱۱۶w);
        m۱۴۴۵۰c(this.f۱۳۱۱۸y);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۴۴۵۰c(int flag) {
        setContentView(Cd.activity_main_lib);
        this.f۱۳۱۱۱r = (RelativeLayout) findViewById(Cc.rlColor);
        this.f۱۳۱۱۳t = (AppCompatTextView) findViewById(Cc.txtTitle);
        if (flag == 1) {
            this.f۱۳۱۱۵v = (FrameLayout) findViewById(Cc.flCentral);
            m۱۴۴۵۲n();
        } else if (flag == 2) {
            this.f۱۳۱۱۲s = (ImageView) findViewById(Cc.imgLogo);
            this.f۱۳۱۱۲s.setImageResource(this.f۱۳۱۱۶w.m۱۴۴۸۸i());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && !this.f۱۳۱۱۷x) {
            m۱۴۴۵۳o();
        }
    }

    /* renamed from: n, reason: contains not printable characters */
    public void m۱۴۴۵۲n() {
        int viewSize = getResources().getDimensionPixelSize(p۲۰۸b.p۲۷۴l.p۲۷۵a.p۲۷۶a.Cb.fourthSampleViewSize);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(viewSize, viewSize);
        params.setMargins(0, 0, 0, 50);
        p۲۰۸b.p۲۴۹f.p۲۵۰a.Cb loaderBuilder = new p۲۰۸b.p۲۴۹f.p۲۵۰a.Cb();
        loaderBuilder.m۱۴۰۸۹a(this.f۱۳۱۱۵v);
        loaderBuilder.m۱۴۰۸۸a(params);
        loaderBuilder.m۱۴۰۹۱a(this.f۱۳۱۱۶w.m۱۴۴۹۴l());
        loaderBuilder.m۱۴۰۸۷a(this.f۱۳۱۱۶w.m۱۴۴۹۲k(), this.f۱۳۱۱۶w.m۱۴۴۹۰j());
        loaderBuilder.m۱۴۰۹۵e(this.f۱۳۱۱۶w.m۱۴۵۰۰o());
        loaderBuilder.m۱۴۰۹۳c(Color.parseColor(String.format("#%06X", Integer.valueOf(getResources().getColor(this.f۱۳۱۱۶w.m۱۴۴۹۸n()) & 16777215))));
        loaderBuilder.m۱۴۰۸۶a(Color.parseColor(String.format("#%06X", Integer.valueOf(getResources().getColor(this.f۱۳۱۱۶w.m۱۴۴۹۶m()) & 16777215))));
        loaderBuilder.m۱۴۰۹۴d(this.f۱۳۱۱۶w.m۱۴۴۸۰e());
        loaderBuilder.m۱۴۰۹۲b(this.f۱۳۱۱۶w.m۱۴۴۷۸d());
        loaderBuilder.m۱۴۰۹۰a(new p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۱d.Cb());
        this.f۱۳۱۱۴u = loaderBuilder.m۱۴۰۸۵a();
        this.f۱۳۱۱۴u.setOnStateChangeListener(new a());
    }

    /* renamed from: b.l.a.a.e.a$a */
    class a implements InterfaceCa {
        a() {
        }

        @Override // p۲۰۸b.p۲۴۹f.p۲۵۰a.p۲۵۳f.InterfaceCa
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۴۴۵۶a(int i) {
            if (i == 3) {
                AbstractActivityCa.this.m۱۴۴۵۵q();
            }
        }
    }

    /* renamed from: o, reason: contains not printable characters */
    public void m۱۴۴۵۳o() {
        int finalRadius = Math.max(this.f۱۳۱۱۱r.getWidth(), this.f۱۳۱۱۱r.getHeight()) + (this.f۱۳۱۱۱r.getHeight() / 2);
        int y = p۲۰۸b.p۲۷۴l.p۲۷۵a.p۲۷۶a.p۲۷۹g.Ca.m۱۴۵۰۹a(this.f۱۳۱۱۱r, this.f۱۳۱۱۶w.m۱۴۵۰۳q());
        int x = p۲۰۸b.p۲۷۴l.p۲۷۵a.p۲۷۶a.p۲۷۹g.Ca.m۱۴۵۰۹a(this.f۱۳۱۱۱r, this.f۱۳۱۱۶w.m۱۴۵۰۲p());
        this.f۱۳۱۱۱r.setBackgroundColor(getResources().getColor(this.f۱۳۱۱۶w.m۱۴۴۸۶h()));
        AbstractCb animator = Ce.m۱۶۴۰۹a(this.f۱۳۱۱۱r, x, y, 0.0f, finalRadius);
        animator.mo۱۶۴۰۳a(new AccelerateDecelerateInterpolator());
        animator.mo۱۶۴۰۲a(this.f۱۳۱۱۶w.m۱۴۴۶۷a());
        animator.mo۱۶۴۰۴a(new b());
        animator.mo۱۶۴۰۱a();
        this.f۱۳۱۱۷x = true;
    }

    /* renamed from: b.l.a.a.e.a$b */
    class b implements AbstractCb.a {
        b() {
        }

        @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb.a
        /* renamed from: d, reason: contains not printable characters */
        public void mo۱۶۳۹۶d() {
        }

        @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb.a
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۶۳۹۴b() {
        }

        @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb.a
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۶۳۹۵c() {
        }

        @Override // p۲۹۲d.p۲۹۳a.p۲۹۴a.AbstractCb.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۳۹۳a() {
            if (AbstractActivityCa.this.f۱۳۱۱۸y == 1) {
                AbstractActivityCa.this.f۱۳۱۱۴u.m۱۴۰۸۳b();
            } else {
                AbstractActivityCa.this.m۱۴۴۵۴p();
            }
        }
    }

    /* renamed from: p, reason: contains not printable characters */
    public void m۱۴۴۵۴p() {
        this.f۱۳۱۱۲s.setVisibility(0);
        this.f۱۳۱۱۲s.setImageResource(this.f۱۳۱۱۶w.m۱۴۴۸۸i());
        Cc.b bVar = p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.Cc.m۱۳۹۶۵a(this.f۱۳۱۱۶w.m۱۴۴۷۶c());
        bVar.m۱۳۹۷۳a(new c());
        bVar.m۱۳۹۷۲a(this.f۱۳۱۱۶w.m۱۴۴۷۲b());
        bVar.m۱۳۹۷۴a(this.f۱۳۱۱۲s);
    }

    /* renamed from: b.l.a.a.e.a$c */
    class c implements AbstractCa.a {
        c() {
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۶۴۰۷c(AbstractCa animation) {
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۴۰۵a(AbstractCa animation) {
            AbstractActivityCa.this.m۱۴۴۵۵q();
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۶۴۱۰b(AbstractCa animation) {
        }
    }

    /* renamed from: q, reason: contains not printable characters */
    public void m۱۴۴۵۵q() {
        this.f۱۳۱۱۳t.setText(this.f۱۳۱۱۶w.m۱۴۵۰۵s());
        this.f۱۳۱۱۳t.setTextSize(this.f۱۳۱۱۶w.m۱۴۵۰۷u());
        this.f۱۳۱۱۳t.setTextColor(getResources().getColor(this.f۱۳۱۱۶w.m۱۴۵۰۶t()));
        if (!this.f۱۳۱۱۶w.m۱۴۵۰۴r().isEmpty()) {
            m۱۴۴۴۹a(this.f۱۳۱۱۶w.m۱۴۵۰۴r());
        }
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-2, -2);
        params.addRule(3, p۲۰۸b.p۲۷۴l.p۲۷۵a.p۲۷۶a.Cc.flCentral);
        params.addRule(14);
        this.f۱۳۱۱۳t.setLayoutParams(params);
        this.f۱۳۱۱۳t.setVisibility(0);
        Cc.b bVar = p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.Cc.m۱۳۹۶۵a(this.f۱۳۱۱۶w.m۱۴۴۸۴g());
        bVar.m۱۳۹۷۳a(new d());
        bVar.m۱۳۹۷۲a(this.f۱۳۱۱۶w.m۱۴۴۸۲f());
        bVar.m۱۳۹۷۴a(this.f۱۳۱۱۳t);
    }

    /* renamed from: b.l.a.a.e.a$d */
    class d implements AbstractCa.a {
        d() {
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۶۴۰۷c(AbstractCa animation) {
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۴۰۵a(AbstractCa animation) {
            AbstractActivityCa.this.mo۱۵۴۰۲m();
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۶۴۱۰b(AbstractCa animation) {
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۴۴۹a(String font) {
        Typeface type = Typeface.createFromAsset(getAssets(), font);
        this.f۱۳۱۱۳t.setTypeface(type);
    }
}
