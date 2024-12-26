package p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.p۱۲۱e;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.p۰۴۷v7.app.ActivityCe;
import android.support.p۰۴۷v7.widget.AppCompatTextView;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.Cc;
import p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۷f.AbstractCa;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa;
import p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb;
import p۱۳۶d.p۱۳۷a.p۱۳۸a.Ce;

/* renamed from: b.l.a.a.e.a  reason: invalid class name */
public abstract class AbstractActivityCa extends ActivityCe {

    /* renamed from: r  reason: contains not printable characters */
    private RelativeLayout f۱۳۱۱۱r;

    /* renamed from: s  reason: contains not printable characters */
    private ImageView f۱۳۱۱۲s;

    /* renamed from: t  reason: contains not printable characters */
    private AppCompatTextView f۱۳۱۱۳t;

    /* renamed from: u  reason: contains not printable characters */
    private p۰۵۲b.p۰۹۳f.p۰۹۴a.Ca f۱۳۱۱۴u;

    /* renamed from: v  reason: contains not printable characters */
    private FrameLayout f۱۳۱۱۵v;

    /* renamed from: w  reason: contains not printable characters */
    private p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.p۱۲۲f.Ca f۱۳۱۱۶w;

    /* renamed from: x  reason: contains not printable characters */
    private boolean f۱۳۱۱۷x = false;

    /* renamed from: y  reason: contains not printable characters */
    private int f۱۳۱۱۸y = 0;

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۶۵۲۳a(p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.p۱۲۲f.Ca aVar);

    /* renamed from: m  reason: contains not printable characters */
    public abstract void m۱۶۵۲۶m();

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0, android.support.p۰۴۷v7.app.ActivityCe
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f۱۳۱۱۶w = new p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.p۱۲۲f.Ca();
        m۱۶۵۲۳a(this.f۱۳۱۱۶w);
        this.f۱۳۱۱۸y = p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.p۱۲۳g.Cb.m۱۶۵۸۵a(this.f۱۳۱۱۶w);
        m۱۶۵۲۵c(this.f۱۳۱۱۸y);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۶۵۲۵c(int flag) {
        setContentView(p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.Cd.activity_main_lib);
        this.f۱۳۱۱۱r = (RelativeLayout) findViewById(p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.Cc.rlColor);
        this.f۱۳۱۱۳t = (AppCompatTextView) findViewById(p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.Cc.txtTitle);
        if (flag == 1) {
            this.f۱۳۱۱۵v = (FrameLayout) findViewById(p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.Cc.flCentral);
            m۱۶۵۲۷n();
        } else if (flag == 2) {
            this.f۱۳۱۱۲s = (ImageView) findViewById(p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.Cc.imgLogo);
            this.f۱۳۱۱۲s.setImageResource(this.f۱۳۱۱۶w.m۱۶۵۶۳i());
        }
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && !this.f۱۳۱۱۷x) {
            m۱۶۵۲۸o();
        }
    }

    /* renamed from: n  reason: contains not printable characters */
    public void m۱۶۵۲۷n() {
        int viewSize = getResources().getDimensionPixelSize(p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.Cb.fourthSampleViewSize);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(viewSize, viewSize);
        params.setMargins(0, 0, 0, 50);
        p۰۵۲b.p۰۹۳f.p۰۹۴a.Cb loaderBuilder = new p۰۵۲b.p۰۹۳f.p۰۹۴a.Cb();
        loaderBuilder.m۱۶۱۶۰a(this.f۱۳۱۱۵v);
        loaderBuilder.m۱۶۱۵۹a(params);
        loaderBuilder.m۱۶۱۶۲a(this.f۱۳۱۱۶w.m۱۶۵۶۹l());
        loaderBuilder.m۱۶۱۵۸a(this.f۱۳۱۱۶w.m۱۶۵۶۷k(), this.f۱۳۱۱۶w.m۱۶۵۶۵j());
        loaderBuilder.m۱۶۱۶۶e(this.f۱۳۱۱۶w.m۱۶۵۷۵o());
        loaderBuilder.m۱۶۱۶۴c(Color.parseColor(String.format("#%06X", Integer.valueOf(getResources().getColor(this.f۱۳۱۱۶w.m۱۶۵۷۳n()) & 16777215))));
        loaderBuilder.m۱۶۱۵۷a(Color.parseColor(String.format("#%06X", Integer.valueOf(getResources().getColor(this.f۱۳۱۱۶w.m۱۶۵۷۱m()) & 16777215))));
        loaderBuilder.m۱۶۱۶۵d(this.f۱۳۱۱۶w.m۱۶۵۵۵e());
        loaderBuilder.m۱۶۱۶۳b(this.f۱۳۱۱۶w.m۱۶۵۵۳d());
        loaderBuilder.m۱۶۱۶۱a(new p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۵d.Cb());
        this.f۱۳۱۱۴u = loaderBuilder.m۱۶۱۵۶a();
        this.f۱۳۱۱۴u.setOnStateChangeListener(new Ca());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.l.a.a.e.a$a  reason: invalid class name */
    public class Ca implements AbstractCa {
        Ca() {
        }

        @Override // p۰۵۲b.p۰۹۳f.p۰۹۴a.p۰۹۷f.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۵۳۱a(int i) {
            if (i == 3) {
                AbstractActivityCa.this.m۱۶۵۳۰q();
            }
        }
    }

    /* renamed from: o  reason: contains not printable characters */
    public void m۱۶۵۲۸o() {
        int finalRadius = Math.max(this.f۱۳۱۱۱r.getWidth(), this.f۱۳۱۱۱r.getHeight()) + (this.f۱۳۱۱۱r.getHeight() / 2);
        int y = p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.p۱۲۳g.Ca.m۱۶۵۸۴a(this.f۱۳۱۱۱r, this.f۱۳۱۱۶w.m۱۶۵۷۸q());
        int x = p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.p۱۲۳g.Ca.m۱۶۵۸۴a(this.f۱۳۱۱۱r, this.f۱۳۱۱۶w.m۱۶۵۷۷p());
        this.f۱۳۱۱۱r.setBackgroundColor(getResources().getColor(this.f۱۳۱۱۶w.m۱۶۵۶۱h()));
        AbstractCb animator = Ce.m۱۸۴۸۸a(this.f۱۳۱۱۱r, x, y, 0.0f, (float) finalRadius);
        animator.m۱۸۴۷۰a(new AccelerateDecelerateInterpolator());
        animator.m۱۸۴۶۹a(this.f۱۳۱۱۶w.m۱۶۵۴۲a());
        animator.m۱۸۴۷۱a(new Cb());
        animator.m۱۸۴۶۸a();
        this.f۱۳۱۱۷x = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.l.a.a.e.a$b  reason: invalid class name */
    public class Cb implements AbstractCb.AbstractCa {
        Cb() {
        }

        @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb.AbstractCa
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۶۵۳۵d() {
        }

        @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۶۵۳۳b() {
        }

        @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb.AbstractCa
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۶۵۳۴c() {
        }

        @Override // p۱۳۶d.p۱۳۷a.p۱۳۸a.AbstractCb.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۵۳۲a() {
            if (AbstractActivityCa.this.f۱۳۱۱۸y == 1) {
                AbstractActivityCa.this.f۱۳۱۱۴u.m۱۶۱۵۴b();
            } else {
                AbstractActivityCa.this.m۱۶۵۲۹p();
            }
        }
    }

    /* renamed from: p  reason: contains not printable characters */
    public void m۱۶۵۲۹p() {
        this.f۱۳۱۱۲s.setVisibility(0);
        this.f۱۳۱۱۲s.setImageResource(this.f۱۳۱۱۶w.m۱۶۵۶۳i());
        Cc.Cb a = p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.Cc.m۱۶۰۳۶a(this.f۱۳۱۱۶w.m۱۶۵۵۱c());
        a.m۱۶۰۴۴a(new Cc());
        a.m۱۶۰۴۳a((long) this.f۱۳۱۱۶w.m۱۶۵۴۷b());
        a.m۱۶۰۴۵a(this.f۱۳۱۱۲s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.l.a.a.e.a$c  reason: invalid class name */
    public class Cc implements AbstractCa.AbstractCa {
        Cc() {
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۶۵۳۸c(p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa animation) {
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۵۳۶a(p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa animation) {
            AbstractActivityCa.this.m۱۶۵۳۰q();
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۶۵۳۷b(p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa animation) {
        }
    }

    /* renamed from: q  reason: contains not printable characters */
    public void m۱۶۵۳۰q() {
        this.f۱۳۱۱۳t.setText(this.f۱۳۱۱۶w.m۱۶۵۸۰s());
        this.f۱۳۱۱۳t.setTextSize(this.f۱۳۱۱۶w.m۱۶۵۸۲u());
        this.f۱۳۱۱۳t.setTextColor(getResources().getColor(this.f۱۳۱۱۶w.m۱۶۵۸۱t()));
        if (!this.f۱۳۱۱۶w.m۱۶۵۷۹r().isEmpty()) {
            m۱۶۵۲۴a(this.f۱۳۱۱۶w.m۱۶۵۷۹r());
        }
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-2, -2);
        params.addRule(3, p۰۵۲b.p۱۱۸l.p۱۱۹a.p۱۲۰a.Cc.flCentral);
        params.addRule(14);
        this.f۱۳۱۱۳t.setLayoutParams(params);
        this.f۱۳۱۱۳t.setVisibility(0);
        Cc.Cb a = p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.Cc.m۱۶۰۳۶a(this.f۱۳۱۱۶w.m۱۶۵۵۹g());
        a.m۱۶۰۴۴a(new Cd());
        a.m۱۶۰۴۳a((long) this.f۱۳۱۱۶w.m۱۶۵۵۷f());
        a.m۱۶۰۴۵a(this.f۱۳۱۱۳t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.l.a.a.e.a$d  reason: invalid class name */
    public class Cd implements AbstractCa.AbstractCa {
        Cd() {
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۶۵۴۱c(p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa animation) {
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۵۳۹a(p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa animation) {
            AbstractActivityCa.this.m۱۶۵۲۶m();
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۶۵۴۰b(p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa animation) {
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۵۲۴a(String font) {
        this.f۱۳۱۱۳t.setTypeface(Typeface.createFromAsset(getAssets(), font));
    }
}
