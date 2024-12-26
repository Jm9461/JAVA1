package android.support.constraint.p۲۰۰i.p۲۰۱j;

import android.support.constraint.p۲۰۰i.Ce;
import android.support.constraint.p۲۰۰i.p۲۰۱j.Cd;
import android.support.constraint.p۲۰۰i.p۲۰۱j.Ce;
import java.util.Arrays;

/* renamed from: android.support.constraint.i.j.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cf extends Co {

    /* renamed from: h0, reason: contains not printable characters */
    private Cn f۹۳۹۶h0;

    /* renamed from: i0, reason: contains not printable characters */
    int f۹۳۹۷i0;

    /* renamed from: j0, reason: contains not printable characters */
    int f۹۳۹۸j0;

    /* renamed from: k0, reason: contains not printable characters */
    int f۹۳۹۹k0;

    /* renamed from: l0, reason: contains not printable characters */
    int f۹۴۰۰l0;

    /* renamed from: f0, reason: contains not printable characters */
    private boolean f۹۳۹۴f0 = false;

    /* renamed from: g0, reason: contains not printable characters */
    protected Ce f۹۳۹۵g0 = new Ce();

    /* renamed from: m0, reason: contains not printable characters */
    int f۹۴۰۱m0 = 0;

    /* renamed from: n0, reason: contains not printable characters */
    int f۹۴۰۲n0 = 0;

    /* renamed from: o0, reason: contains not printable characters */
    Cc[] f۹۴۰۳o0 = new Cc[4];

    /* renamed from: p0, reason: contains not printable characters */
    Cc[] f۹۴۰۴p0 = new Cc[4];

    /* renamed from: q0, reason: contains not printable characters */
    private int f۹۴۰۵q0 = 3;

    /* renamed from: r0, reason: contains not printable characters */
    private boolean f۹۴۰۶r0 = false;

    /* renamed from: s0, reason: contains not printable characters */
    private boolean f۹۴۰۷s0 = false;

    /* renamed from: q, reason: contains not printable characters */
    public void m۹۱۲۳q(int value) {
        this.f۹۴۰۵q0 = value;
    }

    /* renamed from: K, reason: contains not printable characters */
    public int m۹۱۰۷K() {
        return this.f۹۴۰۵q0;
    }

    /* renamed from: p, reason: contains not printable characters */
    public boolean m۹۱۲۲p(int feature) {
        return (this.f۹۴۰۵q0 & feature) == feature;
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Co, android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: B, reason: contains not printable characters */
    public void mo۹۱۶۷B() {
        this.f۹۳۹۵g0.m۸۹۸۳f();
        this.f۹۳۹۷i0 = 0;
        this.f۹۳۹۹k0 = 0;
        this.f۹۳۹۸j0 = 0;
        this.f۹۴۰۰l0 = 0;
        super.mo۹۱۶۷B();
    }

    /* renamed from: O, reason: contains not printable characters */
    public boolean m۹۱۱۱O() {
        return this.f۹۴۰۶r0;
    }

    /* renamed from: M, reason: contains not printable characters */
    public boolean m۹۱۰۹M() {
        return this.f۹۴۰۷s0;
    }

    /* renamed from: d, reason: contains not printable characters */
    public boolean m۹۱۲۰d(Ce system) {
        mo۹۱۲۷a(system);
        int count = this.f۹۴۴۲e0.size();
        for (int i = 0; i < count; i++) {
            Ce widget = this.f۹۴۴۲e0.get(i);
            if (widget instanceof Cf) {
                Ce.b[] bVarArr = widget.f۹۳۳۳B;
                Ce.b horizontalBehaviour = bVarArr[0];
                Ce.b verticalBehaviour = bVarArr[1];
                if (horizontalBehaviour == Ce.b.WRAP_CONTENT) {
                    widget.m۹۰۴۳a(Ce.b.FIXED);
                }
                if (verticalBehaviour == Ce.b.WRAP_CONTENT) {
                    widget.m۹۰۵۷b(Ce.b.FIXED);
                }
                widget.mo۹۱۲۷a(system);
                if (horizontalBehaviour == Ce.b.WRAP_CONTENT) {
                    widget.m۹۰۴۳a(horizontalBehaviour);
                }
                if (verticalBehaviour == Ce.b.WRAP_CONTENT) {
                    widget.m۹۰۵۷b(verticalBehaviour);
                }
            } else {
                Ci.m۹۱۳۸a(this, system, widget);
                widget.mo۹۱۲۷a(system);
            }
        }
        int i2 = this.f۹۴۰۱m0;
        if (i2 > 0) {
            Cb.m۹۰۰۶a(this, system, 0);
        }
        if (this.f۹۴۰۲n0 > 0) {
            Cb.m۹۰۰۶a(this, system, 1);
        }
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۹۱۱۷a(android.support.constraint.p۲۰۰i.Ce system, boolean[] flags) {
        flags[2] = false;
        mo۹۱۳۰c(system);
        int count = this.f۹۴۴۲e0.size();
        for (int i = 0; i < count; i++) {
            Ce widget = this.f۹۴۴۲e0.get(i);
            widget.mo۹۱۳۰c(system);
            if (widget.f۹۳۳۳B[0] == Ce.b.MATCH_CONSTRAINT && widget.m۹۰۹۵t() < widget.m۹۰۹۷v()) {
                flags[2] = true;
            }
            if (widget.f۹۳۳۳B[1] == Ce.b.MATCH_CONSTRAINT && widget.m۹۰۷۷i() < widget.m۹۰۹۶u()) {
                flags[2] = true;
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۹۱۱۹c(boolean isRtl) {
        this.f۹۳۹۴f0 = isRtl;
    }

    /* renamed from: N, reason: contains not printable characters */
    public boolean m۹۱۱۰N() {
        return this.f۹۳۹۴f0;
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: a, reason: contains not printable characters */
    public void mo۹۱۲۶a(int optimizationLevel) {
        super.mo۹۱۲۶a(optimizationLevel);
        int count = this.f۹۴۴۲e0.size();
        for (int i = 0; i < count; i++) {
            this.f۹۴۴۲e0.get(i).mo۹۱۲۶a(optimizationLevel);
        }
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Co
    /* renamed from: I, reason: contains not printable characters */
    public void mo۹۱۷۰I() {
        boolean z;
        int i = this.f۹۳۳۹H;
        int i2 = this.f۹۳۴۰I;
        int i3 = 0;
        int max = Math.max(0, m۹۰۹۵t());
        int max2 = Math.max(0, m۹۰۷۷i());
        this.f۹۴۰۶r0 = false;
        this.f۹۴۰۷s0 = false;
        if (this.f۹۳۳۴C != null) {
            if (this.f۹۳۹۶h0 == null) {
                this.f۹۳۹۶h0 = new Cn(this);
            }
            this.f۹۳۹۶h0.m۹۱۶۴b(this);
            m۹۰۸۸n(this.f۹۳۹۷i0);
            m۹۰۹۰o(this.f۹۳۹۸j0);
            m۹۰۲۹C();
            mo۹۱۷۲a(this.f۹۳۹۵g0.m۸۹۸۱d());
        } else {
            this.f۹۳۳۹H = 0;
            this.f۹۳۴۰I = 0;
        }
        if (this.f۹۴۰۵q0 != 0) {
            if (!m۹۱۲۲p(8)) {
                m۹۱۱۳Q();
            }
            m۹۱۱۲P();
            this.f۹۳۹۵g0.f۹۲۲۹g = true;
        } else {
            this.f۹۳۹۵g0.f۹۲۲۹g = false;
        }
        Ce.b[] bVarArr = this.f۹۳۳۳B;
        Ce.b bVar = bVarArr[1];
        Ce.b bVar2 = bVarArr[0];
        m۹۱۰۲T();
        int size = this.f۹۴۴۲e0.size();
        for (int i4 = 0; i4 < size; i4++) {
            Ce ce = this.f۹۴۴۲e0.get(i4);
            if (ce instanceof Co) {
                ((Co) ce).mo۹۱۷۰I();
            }
        }
        boolean z2 = true;
        int i5 = 0;
        boolean z3 = false;
        while (z2) {
            i5++;
            try {
                this.f۹۳۹۵g0.m۸۹۸۳f();
                m۹۰۵۶b(this.f۹۳۹۵g0);
                for (int i6 = 0; i6 < size; i6++) {
                    this.f۹۴۴۲e0.get(i6).m۹۰۵۶b(this.f۹۳۹۵g0);
                }
                z2 = m۹۱۲۰d(this.f۹۳۹۵g0);
                if (z2) {
                    this.f۹۳۹۵g0.m۸۹۸۲e();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("EXCEPTION : " + e2);
            }
            char c2 = 2;
            if (z2) {
                m۹۱۱۷a(this.f۹۳۹۵g0, Ci.f۹۴۱۷a);
            } else {
                mo۹۱۳۰c(this.f۹۳۹۵g0);
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    Ce ce2 = this.f۹۴۴۲e0.get(i7);
                    if (ce2.f۹۳۳۳B[i3] != Ce.b.MATCH_CONSTRAINT) {
                        z = true;
                    } else if (ce2.m۹۰۹۵t() >= ce2.m۹۰۹۷v()) {
                        z = true;
                    } else {
                        Ci.f۹۴۱۷a[c2] = true;
                        break;
                    }
                    if (ce2.f۹۳۳۳B[z ? 1 : 0] != Ce.b.MATCH_CONSTRAINT || ce2.m۹۰۷۷i() >= ce2.m۹۰۹۶u()) {
                        i7++;
                        c2 = 2;
                        i3 = 0;
                    } else {
                        Ci.f۹۴۱۷a[2] = z;
                        break;
                    }
                }
            }
            boolean z4 = false;
            if (i5 < 8 && Ci.f۹۴۱۷a[2]) {
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    Ce ce3 = this.f۹۴۴۲e0.get(i10);
                    i8 = Math.max(i8, ce3.f۹۳۳۹H + ce3.m۹۰۹۵t());
                    i9 = Math.max(i9, ce3.f۹۳۴۰I + ce3.m۹۰۷۷i());
                }
                int max3 = Math.max(this.f۹۳۴۶O, i8);
                int max4 = Math.max(this.f۹۳۴۷P, i9);
                if (bVar2 == Ce.b.WRAP_CONTENT && m۹۰۹۵t() < max3) {
                    m۹۰۸۲k(max3);
                    this.f۹۳۳۳B[0] = Ce.b.WRAP_CONTENT;
                    z3 = true;
                    z4 = true;
                }
                if (bVar == Ce.b.WRAP_CONTENT && m۹۰۷۷i() < max4) {
                    m۹۰۶۲c(max4);
                    this.f۹۳۳۳B[1] = Ce.b.WRAP_CONTENT;
                    z3 = true;
                    z4 = true;
                }
            }
            int max5 = Math.max(this.f۹۳۴۶O, m۹۰۹۵t());
            if (max5 > m۹۰۹۵t()) {
                m۹۰۸۲k(max5);
                this.f۹۳۳۳B[0] = Ce.b.FIXED;
                z3 = true;
                z4 = true;
            }
            int max6 = Math.max(this.f۹۳۴۷P, m۹۰۷۷i());
            if (max6 > m۹۰۷۷i()) {
                m۹۰۶۲c(max6);
                this.f۹۳۳۳B[1] = Ce.b.FIXED;
                z3 = true;
                z4 = true;
            }
            if (z3) {
                z2 = z4;
            } else {
                if (this.f۹۳۳۳B[0] == Ce.b.WRAP_CONTENT && max > 0 && m۹۰۹۵t() > max) {
                    this.f۹۴۰۶r0 = true;
                    z3 = true;
                    this.f۹۳۳۳B[0] = Ce.b.FIXED;
                    m۹۰۸۲k(max);
                    z4 = true;
                }
                if (this.f۹۳۳۳B[1] == Ce.b.WRAP_CONTENT && max2 > 0 && m۹۰۷۷i() > max2) {
                    this.f۹۴۰۷s0 = true;
                    this.f۹۳۳۳B[1] = Ce.b.FIXED;
                    m۹۰۶۲c(max2);
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = z4;
                }
            }
            i3 = 0;
        }
        if (this.f۹۳۳۴C != null) {
            int max7 = Math.max(this.f۹۳۴۶O, m۹۰۹۵t());
            int max8 = Math.max(this.f۹۳۴۷P, m۹۰۷۷i());
            this.f۹۳۹۶h0.m۹۱۶۳a(this);
            m۹۰۸۲k(this.f۹۳۹۷i0 + max7 + this.f۹۳۹۹k0);
            m۹۰۶۲c(this.f۹۳۹۸j0 + max8 + this.f۹۴۰۰l0);
        } else {
            this.f۹۳۳۹H = i;
            this.f۹۳۴۰I = i2;
        }
        if (z3) {
            Ce.b[] bVarArr2 = this.f۹۳۳۳B;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        mo۹۱۷۲a(this.f۹۳۹۵g0.m۸۹۸۱d());
        if (this == m۹۱۶۹H()) {
            mo۹۱۶۸F();
        }
    }

    /* renamed from: R, reason: contains not printable characters */
    public void m۹۱۱۴R() {
        m۹۱۱۳Q();
        mo۹۱۲۶a(this.f۹۴۰۵q0);
    }

    /* renamed from: S, reason: contains not printable characters */
    public void m۹۱۱۵S() {
        Ck leftNode = mo۹۱۲۵a(Cd.d.LEFT).m۹۰۱۸d();
        Ck topNode = mo۹۱۲۵a(Cd.d.TOP).m۹۰۱۸d();
        leftNode.m۹۱۴۴a((Ck) null, 0.0f);
        topNode.m۹۱۴۴a((Ck) null, 0.0f);
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۹۱۲۱e(int width, int height) {
        Cl cl;
        Cl cl2;
        if (this.f۹۳۳۳B[0] != Ce.b.WRAP_CONTENT && (cl2 = this.f۹۳۶۲c) != null) {
            cl2.m۹۱۵۴a(width);
        }
        if (this.f۹۳۳۳B[1] != Ce.b.WRAP_CONTENT && (cl = this.f۹۳۶۴d) != null) {
            cl.m۹۱۵۴a(height);
        }
    }

    /* renamed from: Q, reason: contains not printable characters */
    public void m۹۱۱۳Q() {
        int count = this.f۹۴۴۲e0.size();
        mo۹۰۳۰D();
        for (int i = 0; i < count; i++) {
            this.f۹۴۴۲e0.get(i).mo۹۰۳۰D();
        }
    }

    /* renamed from: P, reason: contains not printable characters */
    public void m۹۱۱۲P() {
        if (!m۹۱۲۲p(8)) {
            mo۹۱۲۶a(this.f۹۴۰۵q0);
        }
        m۹۱۱۵S();
    }

    /* renamed from: L, reason: contains not printable characters */
    public boolean m۹۱۰۸L() {
        return false;
    }

    /* renamed from: T, reason: contains not printable characters */
    private void m۹۱۰۲T() {
        this.f۹۴۰۱m0 = 0;
        this.f۹۴۰۲n0 = 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۹۱۱۸a(Ce constraintWidget, int type) {
        if (type == 0) {
            m۹۱۰۳d(constraintWidget);
        } else if (type == 1) {
            m۹۱۰۴e(constraintWidget);
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۹۱۰۳d(Ce widget) {
        int i = this.f۹۴۰۱m0 + 1;
        Cc[] ccArr = this.f۹۴۰۴p0;
        if (i >= ccArr.length) {
            this.f۹۴۰۴p0 = (Cc[]) Arrays.copyOf(ccArr, ccArr.length * 2);
        }
        this.f۹۴۰۴p0[this.f۹۴۰۱m0] = new Cc(widget, 0, m۹۱۱۰N());
        this.f۹۴۰۱m0++;
    }

    /* renamed from: e, reason: contains not printable characters */
    private void m۹۱۰۴e(Ce widget) {
        int i = this.f۹۴۰۲n0 + 1;
        Cc[] ccArr = this.f۹۴۰۳o0;
        if (i >= ccArr.length) {
            this.f۹۴۰۳o0 = (Cc[]) Arrays.copyOf(ccArr, ccArr.length * 2);
        }
        this.f۹۴۰۳o0[this.f۹۴۰۲n0] = new Cc(widget, 1, m۹۱۱۰N());
        this.f۹۴۰۲n0++;
    }
}
