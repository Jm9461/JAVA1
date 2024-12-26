package android.support.v7.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.t0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCt0 {

    /* renamed from: a, reason: contains not printable characters */
    protected final RecyclerView.AbstractCo f۱۲۳۳۴a;

    /* renamed from: b, reason: contains not printable characters */
    private int f۱۲۳۳۵b;

    /* renamed from: c, reason: contains not printable characters */
    final Rect f۱۲۳۳۶c;

    /* renamed from: a, reason: contains not printable characters */
    public abstract int mo۱۳۵۴۱a();

    /* renamed from: a, reason: contains not printable characters */
    public abstract int mo۱۳۵۴۲a(View view);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۳۵۴۳a(int i);

    /* renamed from: b, reason: contains not printable characters */
    public abstract int mo۱۳۵۴۴b();

    /* renamed from: b, reason: contains not printable characters */
    public abstract int mo۱۳۵۴۵b(View view);

    /* renamed from: c, reason: contains not printable characters */
    public abstract int mo۱۳۵۴۶c();

    /* renamed from: c, reason: contains not printable characters */
    public abstract int mo۱۳۵۴۷c(View view);

    /* renamed from: d, reason: contains not printable characters */
    public abstract int mo۱۳۵۴۸d();

    /* renamed from: d, reason: contains not printable characters */
    public abstract int mo۱۳۵۴۹d(View view);

    /* renamed from: e, reason: contains not printable characters */
    public abstract int mo۱۳۵۵۰e();

    /* renamed from: e, reason: contains not printable characters */
    public abstract int mo۱۳۵۵۱e(View view);

    /* renamed from: f, reason: contains not printable characters */
    public abstract int mo۱۳۵۵۲f();

    /* renamed from: f, reason: contains not printable characters */
    public abstract int mo۱۳۵۵۳f(View view);

    /* renamed from: g, reason: contains not printable characters */
    public abstract int mo۱۳۵۵۴g();

    /* synthetic */ AbstractCt0(RecyclerView.AbstractCo x0, a x1) {
        this(x0);
    }

    private AbstractCt0(RecyclerView.AbstractCo layoutManager) {
        this.f۱۲۳۳۵b = Integer.MIN_VALUE;
        this.f۱۲۳۳۶c = new Rect();
        this.f۱۲۳۳۴a = layoutManager;
    }

    /* renamed from: i, reason: contains not printable characters */
    public void m۱۳۵۲۶i() {
        this.f۱۲۳۳۵b = mo۱۳۵۵۴g();
    }

    /* renamed from: h, reason: contains not printable characters */
    public int m۱۳۵۲۵h() {
        if (Integer.MIN_VALUE == this.f۱۲۳۳۵b) {
            return 0;
        }
        return mo۱۳۵۵۴g() - this.f۱۲۳۳۵b;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static AbstractCt0 m۱۳۵۰۹a(RecyclerView.AbstractCo layoutManager, int orientation) {
        if (orientation == 0) {
            return m۱۳۵۰۸a(layoutManager);
        }
        if (orientation == 1) {
            return m۱۳۵۱۰b(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: android.support.v7.widget.t0$a */
    static class a extends AbstractCt0 {
        a(RecyclerView.AbstractCo layoutManager) {
            super(layoutManager, null);
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: b, reason: contains not printable characters */
        public int mo۱۳۵۴۴b() {
            return this.f۱۲۳۳۴a.m۱۲۵۵۱q() - this.f۱۲۳۳۴a.m۱۲۵۴۸o();
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: a, reason: contains not printable characters */
        public int mo۱۳۵۴۱a() {
            return this.f۱۲۳۳۴a.m۱۲۵۵۱q();
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۵۴۳a(int amount) {
            this.f۱۲۳۳۴a.mo۱۲۷۷۹d(amount);
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: f, reason: contains not printable characters */
        public int mo۱۳۵۵۲f() {
            return this.f۱۲۳۳۴a.m۱۲۵۴۶n();
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: b, reason: contains not printable characters */
        public int mo۱۳۵۴۵b(View view) {
            RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
            return this.f۱۲۳۳۴a.m۱۲۵۳۴h(view) + ((ViewGroup.MarginLayoutParams) params).leftMargin + ((ViewGroup.MarginLayoutParams) params).rightMargin;
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: c, reason: contains not printable characters */
        public int mo۱۳۵۴۷c(View view) {
            RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
            return this.f۱۲۳۳۴a.m۱۲۵۲۹g(view) + ((ViewGroup.MarginLayoutParams) params).topMargin + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: a, reason: contains not printable characters */
        public int mo۱۳۵۴۲a(View view) {
            RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
            return this.f۱۲۳۳۴a.m۱۲۵۳۷i(view) + ((ViewGroup.MarginLayoutParams) params).rightMargin;
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: d, reason: contains not printable characters */
        public int mo۱۳۵۴۹d(View view) {
            RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
            return this.f۱۲۳۳۴a.m۱۲۵۲۵f(view) - ((ViewGroup.MarginLayoutParams) params).leftMargin;
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: e, reason: contains not printable characters */
        public int mo۱۳۵۵۱e(View view) {
            this.f۱۲۳۳۴a.m۱۲۴۶۹a(view, true, this.f۱۲۳۳۶c);
            return this.f۱۲۳۳۶c.right;
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: f, reason: contains not printable characters */
        public int mo۱۳۵۵۳f(View view) {
            this.f۱۲۳۳۴a.m۱۲۴۶۹a(view, true, this.f۱۲۳۳۶c);
            return this.f۱۲۳۳۶c.left;
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: g, reason: contains not printable characters */
        public int mo۱۳۵۵۴g() {
            return (this.f۱۲۳۳۴a.m۱۲۵۵۱q() - this.f۱۲۳۳۴a.m۱۲۵۴۶n()) - this.f۱۲۳۳۴a.m۱۲۵۴۸o();
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: c, reason: contains not printable characters */
        public int mo۱۳۵۴۶c() {
            return this.f۱۲۳۳۴a.m۱۲۵۴۸o();
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: d, reason: contains not printable characters */
        public int mo۱۳۵۴۸d() {
            return this.f۱۲۳۳۴a.m۱۲۵۵۲r();
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: e, reason: contains not printable characters */
        public int mo۱۳۵۵۰e() {
            return this.f۱۲۳۳۴a.m۱۲۵۳۶i();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static AbstractCt0 m۱۳۵۰۸a(RecyclerView.AbstractCo layoutManager) {
        return new a(layoutManager);
    }

    /* renamed from: android.support.v7.widget.t0$b */
    static class b extends AbstractCt0 {
        b(RecyclerView.AbstractCo layoutManager) {
            super(layoutManager, null);
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: b, reason: contains not printable characters */
        public int mo۱۳۵۴۴b() {
            return this.f۱۲۳۳۴a.m۱۲۵۳۳h() - this.f۱۲۳۳۴a.m۱۲۵۴۴m();
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: a, reason: contains not printable characters */
        public int mo۱۳۵۴۱a() {
            return this.f۱۲۳۳۴a.m۱۲۵۳۳h();
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۵۴۳a(int amount) {
            this.f۱۲۳۳۴a.mo۱۲۷۸۲e(amount);
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: f, reason: contains not printable characters */
        public int mo۱۳۵۵۲f() {
            return this.f۱۲۳۳۴a.m۱۲۵۵۰p();
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: b, reason: contains not printable characters */
        public int mo۱۳۵۴۵b(View view) {
            RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
            return this.f۱۲۳۳۴a.m۱۲۵۲۹g(view) + ((ViewGroup.MarginLayoutParams) params).topMargin + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: c, reason: contains not printable characters */
        public int mo۱۳۵۴۷c(View view) {
            RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
            return this.f۱۲۳۳۴a.m۱۲۵۳۴h(view) + ((ViewGroup.MarginLayoutParams) params).leftMargin + ((ViewGroup.MarginLayoutParams) params).rightMargin;
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: a, reason: contains not printable characters */
        public int mo۱۳۵۴۲a(View view) {
            RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
            return this.f۱۲۳۳۴a.m۱۲۵۲۰e(view) + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: d, reason: contains not printable characters */
        public int mo۱۳۵۴۹d(View view) {
            RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
            return this.f۱۲۳۳۴a.m۱۲۵۳۹j(view) - ((ViewGroup.MarginLayoutParams) params).topMargin;
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: e, reason: contains not printable characters */
        public int mo۱۳۵۵۱e(View view) {
            this.f۱۲۳۳۴a.m۱۲۴۶۹a(view, true, this.f۱۲۳۳۶c);
            return this.f۱۲۳۳۶c.bottom;
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: f, reason: contains not printable characters */
        public int mo۱۳۵۵۳f(View view) {
            this.f۱۲۳۳۴a.m۱۲۴۶۹a(view, true, this.f۱۲۳۳۶c);
            return this.f۱۲۳۳۶c.top;
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: g, reason: contains not printable characters */
        public int mo۱۳۵۵۴g() {
            return (this.f۱۲۳۳۴a.m۱۲۵۳۳h() - this.f۱۲۳۳۴a.m۱۲۵۵۰p()) - this.f۱۲۳۳۴a.m۱۲۵۴۴m();
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: c, reason: contains not printable characters */
        public int mo۱۳۵۴۶c() {
            return this.f۱۲۳۳۴a.m۱۲۵۴۴m();
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: d, reason: contains not printable characters */
        public int mo۱۳۵۴۸d() {
            return this.f۱۲۳۳۴a.m۱۲۵۳۶i();
        }

        @Override // android.support.v7.widget.AbstractCt0
        /* renamed from: e, reason: contains not printable characters */
        public int mo۱۳۵۵۰e() {
            return this.f۱۲۳۳۴a.m۱۲۵۵۲r();
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static AbstractCt0 m۱۳۵۱۰b(RecyclerView.AbstractCo layoutManager) {
        return new b(layoutManager);
    }
}
