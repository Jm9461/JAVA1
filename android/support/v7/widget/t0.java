package android.support.v7.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public abstract class t0 {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.o f۲۲۴۷a;

    /* renamed from: b  reason: collision with root package name */
    private int f۲۲۴۸b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f۲۲۴۹c;

    public abstract int a();

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    /* synthetic */ t0(RecyclerView.o x0, a x1) {
        this(x0);
    }

    private t0(RecyclerView.o layoutManager) {
        this.f۲۲۴۸b = Integer.MIN_VALUE;
        this.f۲۲۴۹c = new Rect();
        this.f۲۲۴۷a = layoutManager;
    }

    public void i() {
        this.f۲۲۴۸b = g();
    }

    public int h() {
        if (Integer.MIN_VALUE == this.f۲۲۴۸b) {
            return 0;
        }
        return g() - this.f۲۲۴۸b;
    }

    public static t0 a(RecyclerView.o layoutManager, int orientation) {
        if (orientation == 0) {
            return a(layoutManager);
        }
        if (orientation == 1) {
            return b(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* access modifiers changed from: package-private */
    public static class a extends t0 {
        a(RecyclerView.o layoutManager) {
            super(layoutManager, null);
        }

        @Override // android.support.v7.widget.t0
        public int b() {
            return this.f۲۲۴۷a.q() - this.f۲۲۴۷a.o();
        }

        @Override // android.support.v7.widget.t0
        public int a() {
            return this.f۲۲۴۷a.q();
        }

        @Override // android.support.v7.widget.t0
        public void a(int amount) {
            this.f۲۲۴۷a.d(amount);
        }

        @Override // android.support.v7.widget.t0
        public int f() {
            return this.f۲۲۴۷a.n();
        }

        @Override // android.support.v7.widget.t0
        public int b(View view) {
            RecyclerView.p params = (RecyclerView.p) view.getLayoutParams();
            return this.f۲۲۴۷a.h(view) + ((ViewGroup.MarginLayoutParams) params).leftMargin + ((ViewGroup.MarginLayoutParams) params).rightMargin;
        }

        @Override // android.support.v7.widget.t0
        public int c(View view) {
            RecyclerView.p params = (RecyclerView.p) view.getLayoutParams();
            return this.f۲۲۴۷a.g(view) + ((ViewGroup.MarginLayoutParams) params).topMargin + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
        }

        @Override // android.support.v7.widget.t0
        public int a(View view) {
            return this.f۲۲۴۷a.i(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // android.support.v7.widget.t0
        public int d(View view) {
            return this.f۲۲۴۷a.f(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // android.support.v7.widget.t0
        public int e(View view) {
            this.f۲۲۴۷a.a(view, true, this.f۲۲۴۹c);
            return this.f۲۲۴۹c.right;
        }

        @Override // android.support.v7.widget.t0
        public int f(View view) {
            this.f۲۲۴۷a.a(view, true, this.f۲۲۴۹c);
            return this.f۲۲۴۹c.left;
        }

        @Override // android.support.v7.widget.t0
        public int g() {
            return (this.f۲۲۴۷a.q() - this.f۲۲۴۷a.n()) - this.f۲۲۴۷a.o();
        }

        @Override // android.support.v7.widget.t0
        public int c() {
            return this.f۲۲۴۷a.o();
        }

        @Override // android.support.v7.widget.t0
        public int d() {
            return this.f۲۲۴۷a.r();
        }

        @Override // android.support.v7.widget.t0
        public int e() {
            return this.f۲۲۴۷a.i();
        }
    }

    public static t0 a(RecyclerView.o layoutManager) {
        return new a(layoutManager);
    }

    /* access modifiers changed from: package-private */
    public static class b extends t0 {
        b(RecyclerView.o layoutManager) {
            super(layoutManager, null);
        }

        @Override // android.support.v7.widget.t0
        public int b() {
            return this.f۲۲۴۷a.h() - this.f۲۲۴۷a.m();
        }

        @Override // android.support.v7.widget.t0
        public int a() {
            return this.f۲۲۴۷a.h();
        }

        @Override // android.support.v7.widget.t0
        public void a(int amount) {
            this.f۲۲۴۷a.e(amount);
        }

        @Override // android.support.v7.widget.t0
        public int f() {
            return this.f۲۲۴۷a.p();
        }

        @Override // android.support.v7.widget.t0
        public int b(View view) {
            RecyclerView.p params = (RecyclerView.p) view.getLayoutParams();
            return this.f۲۲۴۷a.g(view) + ((ViewGroup.MarginLayoutParams) params).topMargin + ((ViewGroup.MarginLayoutParams) params).bottomMargin;
        }

        @Override // android.support.v7.widget.t0
        public int c(View view) {
            RecyclerView.p params = (RecyclerView.p) view.getLayoutParams();
            return this.f۲۲۴۷a.h(view) + ((ViewGroup.MarginLayoutParams) params).leftMargin + ((ViewGroup.MarginLayoutParams) params).rightMargin;
        }

        @Override // android.support.v7.widget.t0
        public int a(View view) {
            return this.f۲۲۴۷a.e(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // android.support.v7.widget.t0
        public int d(View view) {
            return this.f۲۲۴۷a.j(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // android.support.v7.widget.t0
        public int e(View view) {
            this.f۲۲۴۷a.a(view, true, this.f۲۲۴۹c);
            return this.f۲۲۴۹c.bottom;
        }

        @Override // android.support.v7.widget.t0
        public int f(View view) {
            this.f۲۲۴۷a.a(view, true, this.f۲۲۴۹c);
            return this.f۲۲۴۹c.top;
        }

        @Override // android.support.v7.widget.t0
        public int g() {
            return (this.f۲۲۴۷a.h() - this.f۲۲۴۷a.p()) - this.f۲۲۴۷a.m();
        }

        @Override // android.support.v7.widget.t0
        public int c() {
            return this.f۲۲۴۷a.m();
        }

        @Override // android.support.v7.widget.t0
        public int d() {
            return this.f۲۲۴۷a.i();
        }

        @Override // android.support.v7.widget.t0
        public int e() {
            return this.f۲۲۴۷a.r();
        }
    }

    public static t0 b(RecyclerView.o layoutManager) {
        return new b(layoutManager);
    }
}
