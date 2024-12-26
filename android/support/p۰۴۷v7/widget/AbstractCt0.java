package android.support.p۰۴۷v7.widget;

import android.graphics.Rect;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.t0  reason: invalid class name */
public abstract class AbstractCt0 {

    /* renamed from: a  reason: contains not printable characters */
    protected final RecyclerView.AbstractCo f۱۲۳۳۴a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۲۳۳۵b;

    /* renamed from: c  reason: contains not printable characters */
    final Rect f۱۲۳۳۶c;

    /* renamed from: a  reason: contains not printable characters */
    public abstract int m۱۵۵۸۱a();

    /* renamed from: a  reason: contains not printable characters */
    public abstract int m۱۵۵۸۲a(View view);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۵۵۸۳a(int i);

    /* renamed from: b  reason: contains not printable characters */
    public abstract int m۱۵۵۸۴b();

    /* renamed from: b  reason: contains not printable characters */
    public abstract int m۱۵۵۸۵b(View view);

    /* renamed from: c  reason: contains not printable characters */
    public abstract int m۱۵۵۸۶c();

    /* renamed from: c  reason: contains not printable characters */
    public abstract int m۱۵۵۸۷c(View view);

    /* renamed from: d  reason: contains not printable characters */
    public abstract int m۱۵۵۸۸d();

    /* renamed from: d  reason: contains not printable characters */
    public abstract int m۱۵۵۸۹d(View view);

    /* renamed from: e  reason: contains not printable characters */
    public abstract int m۱۵۵۹۰e();

    /* renamed from: e  reason: contains not printable characters */
    public abstract int m۱۵۵۹۱e(View view);

    /* renamed from: f  reason: contains not printable characters */
    public abstract int m۱۵۵۹۲f();

    /* renamed from: f  reason: contains not printable characters */
    public abstract int m۱۵۵۹۳f(View view);

    /* renamed from: g  reason: contains not printable characters */
    public abstract int m۱۵۵۹۴g();

    /* synthetic */ AbstractCt0(RecyclerView.AbstractCo x0, Ca x1) {
        this(x0);
    }

    private AbstractCt0(RecyclerView.AbstractCo layoutManager) {
        this.f۱۲۳۳۵b = Integer.MIN_VALUE;
        this.f۱۲۳۳۶c = new Rect();
        this.f۱۲۳۳۴a = layoutManager;
    }

    /* renamed from: i  reason: contains not printable characters */
    public void m۱۵۵۹۶i() {
        this.f۱۲۳۳۵b = m۱۵۵۹۴g();
    }

    /* renamed from: h  reason: contains not printable characters */
    public int m۱۵۵۹۵h() {
        if (Integer.MIN_VALUE == this.f۱۲۳۳۵b) {
            return 0;
        }
        return m۱۵۵۹۴g() - this.f۱۲۳۳۵b;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCt0 m۱۵۵۷۹a(RecyclerView.AbstractCo layoutManager, int orientation) {
        if (orientation == 0) {
            return m۱۵۵۷۸a(layoutManager);
        }
        if (orientation == 1) {
            return m۱۵۵۸۰b(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.t0$a  reason: invalid class name */
    public static class Ca extends AbstractCt0 {
        Ca(RecyclerView.AbstractCo layoutManager) {
            super(layoutManager, null);
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۵۶۰۰b() {
            return this.f۱۲۳۳۴a.m۱۴۶۲۱q() - this.f۱۲۳۳۴a.m۱۴۶۱۸o();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۵۵۹۷a() {
            return this.f۱۲۳۳۴a.m۱۴۶۲۱q();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۵۹۹a(int amount) {
            this.f۱۲۳۳۴a.m۱۴۵۸۴d(amount);
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: f  reason: contains not printable characters */
        public int m۱۵۶۰۸f() {
            return this.f۱۲۳۳۴a.m۱۴۶۱۶n();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۵۶۰۱b(View view) {
            RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
            return this.f۱۲۳۳۴a.m۱۴۶۰۴h(view) + ((ViewGroup.MarginLayoutParams) params).leftMargin + ((ViewGroup.MarginLayoutParams) params).rightMargin;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۵۶۰۳c(View view) {
            RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
            return this.f۱۲۳۳۴a.m۱۴۵۹۹g(view) + ((ViewGroup.MarginLayoutParams) params).topMargin + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۵۵۹۸a(View view) {
            return this.f۱۲۳۳۴a.m۱۴۶۰۷i(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.Cp) view.getLayoutParams())).rightMargin;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: d  reason: contains not printable characters */
        public int m۱۵۶۰۵d(View view) {
            return this.f۱۲۳۳۴a.m۱۴۵۹۵f(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.Cp) view.getLayoutParams())).leftMargin;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: e  reason: contains not printable characters */
        public int m۱۵۶۰۷e(View view) {
            this.f۱۲۳۳۴a.m۱۴۵۳۹a(view, true, this.f۱۲۳۳۶c);
            return this.f۱۲۳۳۶c.right;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: f  reason: contains not printable characters */
        public int m۱۵۶۰۹f(View view) {
            this.f۱۲۳۳۴a.m۱۴۵۳۹a(view, true, this.f۱۲۳۳۶c);
            return this.f۱۲۳۳۶c.left;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: g  reason: contains not printable characters */
        public int m۱۵۶۱۰g() {
            return (this.f۱۲۳۳۴a.m۱۴۶۲۱q() - this.f۱۲۳۳۴a.m۱۴۶۱۶n()) - this.f۱۲۳۳۴a.m۱۴۶۱۸o();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۵۶۰۲c() {
            return this.f۱۲۳۳۴a.m۱۴۶۱۸o();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: d  reason: contains not printable characters */
        public int m۱۵۶۰۴d() {
            return this.f۱۲۳۳۴a.m۱۴۶۲۲r();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: e  reason: contains not printable characters */
        public int m۱۵۶۰۶e() {
            return this.f۱۲۳۳۴a.m۱۴۶۰۶i();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCt0 m۱۵۵۷۸a(RecyclerView.AbstractCo layoutManager) {
        return new Ca(layoutManager);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.t0$b  reason: invalid class name */
    public static class Cb extends AbstractCt0 {
        Cb(RecyclerView.AbstractCo layoutManager) {
            super(layoutManager, null);
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۵۶۱۴b() {
            return this.f۱۲۳۳۴a.m۱۴۶۰۳h() - this.f۱۲۳۳۴a.m۱۴۶۱۴m();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۵۶۱۱a() {
            return this.f۱۲۳۳۴a.m۱۴۶۰۳h();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۶۱۳a(int amount) {
            this.f۱۲۳۳۴a.m۱۴۵۹۱e(amount);
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: f  reason: contains not printable characters */
        public int m۱۵۶۲۲f() {
            return this.f۱۲۳۳۴a.m۱۴۶۲۰p();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۵۶۱۵b(View view) {
            RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
            return this.f۱۲۳۳۴a.m۱۴۵۹۹g(view) + ((ViewGroup.MarginLayoutParams) params).topMargin + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۵۶۱۷c(View view) {
            RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
            return this.f۱۲۳۳۴a.m۱۴۶۰۴h(view) + ((ViewGroup.MarginLayoutParams) params).leftMargin + ((ViewGroup.MarginLayoutParams) params).rightMargin;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۵۶۱۲a(View view) {
            return this.f۱۲۳۳۴a.m۱۴۵۹۰e(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.Cp) view.getLayoutParams())).bottomMargin;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: d  reason: contains not printable characters */
        public int m۱۵۶۱۹d(View view) {
            return this.f۱۲۳۳۴a.m۱۴۶۰۹j(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.Cp) view.getLayoutParams())).topMargin;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: e  reason: contains not printable characters */
        public int m۱۵۶۲۱e(View view) {
            this.f۱۲۳۳۴a.m۱۴۵۳۹a(view, true, this.f۱۲۳۳۶c);
            return this.f۱۲۳۳۶c.bottom;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: f  reason: contains not printable characters */
        public int m۱۵۶۲۳f(View view) {
            this.f۱۲۳۳۴a.m۱۴۵۳۹a(view, true, this.f۱۲۳۳۶c);
            return this.f۱۲۳۳۶c.top;
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: g  reason: contains not printable characters */
        public int m۱۵۶۲۴g() {
            return (this.f۱۲۳۳۴a.m۱۴۶۰۳h() - this.f۱۲۳۳۴a.m۱۴۶۲۰p()) - this.f۱۲۳۳۴a.m۱۴۶۱۴m();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۵۶۱۶c() {
            return this.f۱۲۳۳۴a.m۱۴۶۱۴m();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: d  reason: contains not printable characters */
        public int m۱۵۶۱۸d() {
            return this.f۱۲۳۳۴a.m۱۴۶۰۶i();
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCt0
        /* renamed from: e  reason: contains not printable characters */
        public int m۱۵۶۲۰e() {
            return this.f۱۲۳۳۴a.m۱۴۶۲۲r();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static AbstractCt0 m۱۵۵۸۰b(RecyclerView.AbstractCo layoutManager) {
        return new Cb(layoutManager);
    }
}
