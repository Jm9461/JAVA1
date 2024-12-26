package android.support.constraint.i.j;

import android.support.constraint.i.e;
import android.support.constraint.i.j.d;
import android.support.constraint.i.j.e;
import java.util.Arrays;

public class f extends o {
    private boolean f0 = false;
    protected e g0 = new e();
    private n h0;
    int i0;
    int j0;
    int k0;
    int l0;
    int m0 = 0;
    int n0 = 0;
    c[] o0 = new c[4];
    c[] p0 = new c[4];
    private int q0 = 3;
    private boolean r0 = false;
    private boolean s0 = false;

    public void q(int value) {
        this.q0 = value;
    }

    public int K() {
        return this.q0;
    }

    public boolean p(int feature) {
        return (this.q0 & feature) == feature;
    }

    @Override // android.support.constraint.i.j.o, android.support.constraint.i.j.e
    public void B() {
        this.g0.f();
        this.i0 = 0;
        this.k0 = 0;
        this.j0 = 0;
        this.l0 = 0;
        super.B();
    }

    public boolean O() {
        return this.r0;
    }

    public boolean M() {
        return this.s0;
    }

    public boolean d(e system) {
        a(system);
        int count = this.e0.size();
        for (int i = 0; i < count; i++) {
            e widget = this.e0.get(i);
            if (widget instanceof f) {
                e.b[] bVarArr = widget.B;
                e.b horizontalBehaviour = bVarArr[0];
                e.b verticalBehaviour = bVarArr[1];
                if (horizontalBehaviour == e.b.WRAP_CONTENT) {
                    widget.a(e.b.FIXED);
                }
                if (verticalBehaviour == e.b.WRAP_CONTENT) {
                    widget.b(e.b.FIXED);
                }
                widget.a(system);
                if (horizontalBehaviour == e.b.WRAP_CONTENT) {
                    widget.a(horizontalBehaviour);
                }
                if (verticalBehaviour == e.b.WRAP_CONTENT) {
                    widget.b(verticalBehaviour);
                }
            } else {
                i.a(this, system, widget);
                widget.a(system);
            }
        }
        if (this.m0 > 0) {
            b.a(this, system, 0);
        }
        if (this.n0 > 0) {
            b.a(this, system, 1);
        }
        return true;
    }

    public void a(android.support.constraint.i.e system, boolean[] flags) {
        flags[2] = false;
        c(system);
        int count = this.e0.size();
        for (int i = 0; i < count; i++) {
            e widget = this.e0.get(i);
            widget.c(system);
            if (widget.B[0] == e.b.MATCH_CONSTRAINT && widget.t() < widget.v()) {
                flags[2] = true;
            }
            if (widget.B[1] == e.b.MATCH_CONSTRAINT && widget.i() < widget.u()) {
                flags[2] = true;
            }
        }
    }

    public void c(boolean isRtl) {
        this.f0 = isRtl;
    }

    public boolean N() {
        return this.f0;
    }

    @Override // android.support.constraint.i.j.e
    public void a(int optimizationLevel) {
        super.a(optimizationLevel);
        int count = this.e0.size();
        for (int i = 0; i < count; i++) {
            this.e0.get(i).a(optimizationLevel);
        }
    }

    @Override // android.support.constraint.i.j.o
    public void I() {
        boolean z;
        int prex = this.H;
        int prey = this.I;
        int width = 0;
        int prew = Math.max(0, t());
        int preh = Math.max(0, i());
        this.r0 = false;
        this.s0 = false;
        if (this.C != null) {
            if (this.h0 == null) {
                this.h0 = new n(this);
            }
            this.h0.b(this);
            n(this.i0);
            o(this.j0);
            C();
            a(this.g0.d());
        } else {
            this.H = 0;
            this.I = 0;
        }
        if (this.q0 != 0) {
            if (!p(8)) {
                Q();
            }
            P();
            this.g0.f۶۲۶g = true;
        } else {
            this.g0.f۶۲۶g = false;
        }
        e.b[] bVarArr = this.B;
        e.b originalVerticalDimensionBehaviour = bVarArr[1];
        e.b originalHorizontalDimensionBehaviour = bVarArr[0];
        T();
        int count = this.e0.size();
        for (int i = 0; i < count; i++) {
            e widget = this.e0.get(i);
            if (widget instanceof o) {
                ((o) widget).I();
            }
        }
        boolean needsSolving = true;
        int countSolve = 0;
        boolean wrap_override = false;
        while (needsSolving) {
            countSolve++;
            try {
                this.g0.f();
                b(this.g0);
                for (int i2 = 0; i2 < count; i2++) {
                    this.e0.get(i2).b(this.g0);
                }
                needsSolving = d(this.g0);
                if (needsSolving) {
                    this.g0.e();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("EXCEPTION : " + e2);
            }
            char c2 = 2;
            if (!needsSolving) {
                c(this.g0);
                int i3 = 0;
                while (true) {
                    if (i3 >= count) {
                        break;
                    }
                    e widget2 = this.e0.get(i3);
                    if (widget2.B[width] != e.b.MATCH_CONSTRAINT) {
                        z = true;
                    } else if (widget2.t() < widget2.v()) {
                        i.f۶۹۸a[c2] = true;
                        break;
                    } else {
                        z = true;
                    }
                    e.b[] bVarArr2 = widget2.B;
                    char c3 = z ? 1 : 0;
                    char c4 = z ? 1 : 0;
                    char c5 = z ? 1 : 0;
                    if (bVarArr2[c3] == e.b.MATCH_CONSTRAINT && widget2.i() < widget2.u()) {
                        i.f۶۹۸a[2] = z;
                        break;
                    }
                    i3++;
                    c2 = 2;
                    width = 0;
                }
            } else {
                a(this.g0, i.f۶۹۸a);
            }
            boolean needsSolving2 = false;
            if (countSolve < 8 && i.f۶۹۸a[2]) {
                int maxX = 0;
                int maxY = 0;
                for (int i4 = 0; i4 < count; i4++) {
                    e widget3 = this.e0.get(i4);
                    maxX = Math.max(maxX, widget3.H + widget3.t());
                    maxY = Math.max(maxY, widget3.I + widget3.i());
                }
                int maxX2 = Math.max(this.O, maxX);
                int maxY2 = Math.max(this.P, maxY);
                if (originalHorizontalDimensionBehaviour == e.b.WRAP_CONTENT && t() < maxX2) {
                    k(maxX2);
                    this.B[0] = e.b.WRAP_CONTENT;
                    wrap_override = true;
                    needsSolving2 = true;
                }
                if (originalVerticalDimensionBehaviour == e.b.WRAP_CONTENT && i() < maxY2) {
                    c(maxY2);
                    this.B[1] = e.b.WRAP_CONTENT;
                    wrap_override = true;
                    needsSolving2 = true;
                }
            }
            int width2 = Math.max(this.O, t());
            if (width2 > t()) {
                k(width2);
                this.B[0] = e.b.FIXED;
                wrap_override = true;
                needsSolving2 = true;
            }
            int height = Math.max(this.P, i());
            if (height > i()) {
                c(height);
                this.B[1] = e.b.FIXED;
                wrap_override = true;
                needsSolving2 = true;
            }
            if (!wrap_override) {
                if (this.B[0] == e.b.WRAP_CONTENT && prew > 0 && t() > prew) {
                    this.r0 = true;
                    wrap_override = true;
                    this.B[0] = e.b.FIXED;
                    k(prew);
                    needsSolving2 = true;
                }
                if (this.B[1] != e.b.WRAP_CONTENT || preh <= 0 || i() <= preh) {
                    needsSolving = needsSolving2;
                } else {
                    this.s0 = true;
                    this.B[1] = e.b.FIXED;
                    c(preh);
                    needsSolving = true;
                    wrap_override = true;
                }
            } else {
                needsSolving = needsSolving2;
            }
            width = 0;
        }
        if (this.C != null) {
            int width3 = Math.max(this.O, t());
            int height2 = Math.max(this.P, i());
            this.h0.a(this);
            k(this.i0 + width3 + this.k0);
            c(this.j0 + height2 + this.l0);
        } else {
            this.H = prex;
            this.I = prey;
        }
        if (wrap_override) {
            e.b[] bVarArr3 = this.B;
            bVarArr3[0] = originalHorizontalDimensionBehaviour;
            bVarArr3[1] = originalVerticalDimensionBehaviour;
        }
        a(this.g0.d());
        if (this == H()) {
            F();
        }
    }

    public void R() {
        Q();
        a(this.q0);
    }

    public void S() {
        k leftNode = a(d.EnumC۰۰۲۲d.LEFT).d();
        k topNode = a(d.EnumC۰۰۲۲d.TOP).d();
        leftNode.a((k) null, 0.0f);
        topNode.a((k) null, 0.0f);
    }

    public void e(int width, int height) {
        l lVar;
        l lVar2;
        if (!(this.B[0] == e.b.WRAP_CONTENT || (lVar2 = this.f۶۸۴c) == null)) {
            lVar2.a(width);
        }
        if (this.B[1] != e.b.WRAP_CONTENT && (lVar = this.f۶۸۵d) != null) {
            lVar.a(height);
        }
    }

    public void Q() {
        int count = this.e0.size();
        D();
        for (int i = 0; i < count; i++) {
            this.e0.get(i).D();
        }
    }

    public void P() {
        if (!p(8)) {
            a(this.q0);
        }
        S();
    }

    public boolean L() {
        return false;
    }

    private void T() {
        this.m0 = 0;
        this.n0 = 0;
    }

    /* access modifiers changed from: package-private */
    public void a(e constraintWidget, int type) {
        if (type == 0) {
            d(constraintWidget);
        } else if (type == 1) {
            e(constraintWidget);
        }
    }

    private void d(e widget) {
        int i = this.m0 + 1;
        c[] cVarArr = this.p0;
        if (i >= cVarArr.length) {
            this.p0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.p0[this.m0] = new c(widget, 0, N());
        this.m0++;
    }

    private void e(e widget) {
        int i = this.n0 + 1;
        c[] cVarArr = this.o0;
        if (i >= cVarArr.length) {
            this.o0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.o0[this.n0] = new c(widget, 1, N());
        this.n0++;
    }
}
