package android.support.constraint.p۰۴۱i.p۰۴۲j;

import android.support.constraint.p۰۴۱i.Ce;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Cd;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Ce;
import java.util.Arrays;

/* renamed from: android.support.constraint.i.j.f  reason: invalid class name */
public class Cf extends Co {

    /* renamed from: f0  reason: contains not printable characters */
    private boolean f۹۳۹۴f0 = false;

    /* renamed from: g0  reason: contains not printable characters */
    protected Ce f۹۳۹۵g0 = new Ce();

    /* renamed from: h0  reason: contains not printable characters */
    private Cn f۹۳۹۶h0;

    /* renamed from: i0  reason: contains not printable characters */
    int f۹۳۹۷i0;

    /* renamed from: j0  reason: contains not printable characters */
    int f۹۳۹۸j0;

    /* renamed from: k0  reason: contains not printable characters */
    int f۹۳۹۹k0;

    /* renamed from: l0  reason: contains not printable characters */
    int f۹۴۰۰l0;

    /* renamed from: m0  reason: contains not printable characters */
    int f۹۴۰۱m0 = 0;

    /* renamed from: n0  reason: contains not printable characters */
    int f۹۴۰۲n0 = 0;

    /* renamed from: o0  reason: contains not printable characters */
    Cc[] f۹۴۰۳o0 = new Cc[4];

    /* renamed from: p0  reason: contains not printable characters */
    Cc[] f۹۴۰۴p0 = new Cc[4];

    /* renamed from: q0  reason: contains not printable characters */
    private int f۹۴۰۵q0 = 3;

    /* renamed from: r0  reason: contains not printable characters */
    private boolean f۹۴۰۶r0 = false;

    /* renamed from: s0  reason: contains not printable characters */
    private boolean f۹۴۰۷s0 = false;

    /* renamed from: q  reason: contains not printable characters */
    public void m۱۱۱۹۱q(int value) {
        this.f۹۴۰۵q0 = value;
    }

    /* renamed from: K  reason: contains not printable characters */
    public int m۱۱۱۷۵K() {
        return this.f۹۴۰۵q0;
    }

    /* renamed from: p  reason: contains not printable characters */
    public boolean m۱۱۱۹۰p(int feature) {
        return (this.f۹۴۰۵q0 & feature) == feature;
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Co, android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: B  reason: contains not printable characters */
    public void m۱۱۱۷۳B() {
        this.f۹۳۹۵g0.m۱۱۰۵۱f();
        this.f۹۳۹۷i0 = 0;
        this.f۹۳۹۹k0 = 0;
        this.f۹۳۹۸j0 = 0;
        this.f۹۴۰۰l0 = 0;
        super.m۱۱۲۳۵B();
    }

    /* renamed from: O  reason: contains not printable characters */
    public boolean m۱۱۱۷۹O() {
        return this.f۹۴۰۶r0;
    }

    /* renamed from: M  reason: contains not printable characters */
    public boolean m۱۱۱۷۷M() {
        return this.f۹۴۰۷s0;
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۱۱۸۸d(Ce system) {
        m۱۱۱۰۹a(system);
        int count = this.f۹۴۴۲e0.size();
        for (int i = 0; i < count; i++) {
            Ce widget = this.f۹۴۴۲e0.get(i);
            if (widget instanceof Cf) {
                Ce.EnumCb[] bVarArr = widget.f۹۳۳۳B;
                Ce.EnumCb horizontalBehaviour = bVarArr[0];
                Ce.EnumCb verticalBehaviour = bVarArr[1];
                if (horizontalBehaviour == Ce.EnumCb.WRAP_CONTENT) {
                    widget.m۱۱۱۱۱a(Ce.EnumCb.FIXED);
                }
                if (verticalBehaviour == Ce.EnumCb.WRAP_CONTENT) {
                    widget.m۱۱۱۲۵b(Ce.EnumCb.FIXED);
                }
                widget.m۱۱۱۰۹a(system);
                if (horizontalBehaviour == Ce.EnumCb.WRAP_CONTENT) {
                    widget.m۱۱۱۱۱a(horizontalBehaviour);
                }
                if (verticalBehaviour == Ce.EnumCb.WRAP_CONTENT) {
                    widget.m۱۱۱۲۵b(verticalBehaviour);
                }
            } else {
                Ci.m۱۱۲۰۶a(this, system, widget);
                widget.m۱۱۱۰۹a(system);
            }
        }
        if (this.f۹۴۰۱m0 > 0) {
            Cb.m۱۱۰۷۴a(this, system, 0);
        }
        if (this.f۹۴۰۲n0 > 0) {
            Cb.m۱۱۰۷۴a(this, system, 1);
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۱۸۵a(android.support.constraint.p۰۴۱i.Ce system, boolean[] flags) {
        flags[2] = false;
        m۱۱۱۳۲c(system);
        int count = this.f۹۴۴۲e0.size();
        for (int i = 0; i < count; i++) {
            Ce widget = this.f۹۴۴۲e0.get(i);
            widget.m۱۱۱۳۲c(system);
            if (widget.f۹۳۳۳B[0] == Ce.EnumCb.MATCH_CONSTRAINT && widget.m۱۱۱۶۳t() < widget.m۱۱۱۶۵v()) {
                flags[2] = true;
            }
            if (widget.f۹۳۳۳B[1] == Ce.EnumCb.MATCH_CONSTRAINT && widget.m۱۱۱۴۵i() < widget.m۱۱۱۶۴u()) {
                flags[2] = true;
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۱۸۷c(boolean isRtl) {
        this.f۹۳۹۴f0 = isRtl;
    }

    /* renamed from: N  reason: contains not printable characters */
    public boolean m۱۱۱۷۸N() {
        return this.f۹۳۹۴f0;
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۱۸۴a(int optimizationLevel) {
        super.m۱۱۱۰۴a(optimizationLevel);
        int count = this.f۹۴۴۲e0.size();
        for (int i = 0; i < count; i++) {
            this.f۹۴۴۲e0.get(i).m۱۱۱۰۴a(optimizationLevel);
        }
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Co
    /* renamed from: I  reason: contains not printable characters */
    public void m۱۱۱۷۴I() {
        boolean z;
        int prex = this.f۹۳۳۹H;
        int prey = this.f۹۳۴۰I;
        int width = 0;
        int prew = Math.max(0, m۱۱۱۶۳t());
        int preh = Math.max(0, m۱۱۱۴۵i());
        this.f۹۴۰۶r0 = false;
        this.f۹۴۰۷s0 = false;
        if (this.f۹۳۳۴C != null) {
            if (this.f۹۳۹۶h0 == null) {
                this.f۹۳۹۶h0 = new Cn(this);
            }
            this.f۹۳۹۶h0.m۱۱۲۳۲b(this);
            m۱۱۱۵۶n(this.f۹۳۹۷i0);
            m۱۱۱۵۸o(this.f۹۳۹۸j0);
            m۱۱۰۹۷C();
            m۱۱۲۴۰a(this.f۹۳۹۵g0.m۱۱۰۴۹d());
        } else {
            this.f۹۳۳۹H = 0;
            this.f۹۳۴۰I = 0;
        }
        if (this.f۹۴۰۵q0 != 0) {
            if (!m۱۱۱۹۰p(8)) {
                m۱۱۱۸۱Q();
            }
            m۱۱۱۸۰P();
            this.f۹۳۹۵g0.f۹۲۲۹g = true;
        } else {
            this.f۹۳۹۵g0.f۹۲۲۹g = false;
        }
        Ce.EnumCb[] bVarArr = this.f۹۳۳۳B;
        Ce.EnumCb originalVerticalDimensionBehaviour = bVarArr[1];
        Ce.EnumCb originalHorizontalDimensionBehaviour = bVarArr[0];
        m۱۱۱۷۰T();
        int count = this.f۹۴۴۲e0.size();
        for (int i = 0; i < count; i++) {
            Ce widget = this.f۹۴۴۲e0.get(i);
            if (widget instanceof Co) {
                ((Co) widget).m۱۱۲۳۸I();
            }
        }
        boolean needsSolving = true;
        int countSolve = 0;
        boolean wrap_override = false;
        while (needsSolving) {
            countSolve++;
            try {
                this.f۹۳۹۵g0.m۱۱۰۵۱f();
                m۱۱۱۲۴b(this.f۹۳۹۵g0);
                for (int i2 = 0; i2 < count; i2++) {
                    this.f۹۴۴۲e0.get(i2).m۱۱۱۲۴b(this.f۹۳۹۵g0);
                }
                needsSolving = m۱۱۱۸۸d(this.f۹۳۹۵g0);
                if (needsSolving) {
                    this.f۹۳۹۵g0.m۱۱۰۵۰e();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
            }
            char c = 2;
            if (!needsSolving) {
                m۱۱۱۳۲c(this.f۹۳۹۵g0);
                int i3 = 0;
                while (true) {
                    if (i3 >= count) {
                        break;
                    }
                    Ce widget2 = this.f۹۴۴۲e0.get(i3);
                    if (widget2.f۹۳۳۳B[width] != Ce.EnumCb.MATCH_CONSTRAINT) {
                        z = true;
                    } else if (widget2.m۱۱۱۶۳t() < widget2.m۱۱۱۶۵v()) {
                        Ci.f۹۴۱۷a[c] = true;
                        break;
                    } else {
                        z = true;
                    }
                    Ce.EnumCb[] bVarArr2 = widget2.f۹۳۳۳B;
                    char c2 = z ? 1 : 0;
                    char c3 = z ? 1 : 0;
                    char c4 = z ? 1 : 0;
                    if (bVarArr2[c2] == Ce.EnumCb.MATCH_CONSTRAINT && widget2.m۱۱۱۴۵i() < widget2.m۱۱۱۶۴u()) {
                        Ci.f۹۴۱۷a[2] = z;
                        break;
                    }
                    i3++;
                    c = 2;
                    width = 0;
                }
            } else {
                m۱۱۱۸۵a(this.f۹۳۹۵g0, Ci.f۹۴۱۷a);
            }
            boolean needsSolving2 = false;
            if (countSolve < 8 && Ci.f۹۴۱۷a[2]) {
                int maxX = 0;
                int maxY = 0;
                for (int i4 = 0; i4 < count; i4++) {
                    Ce widget3 = this.f۹۴۴۲e0.get(i4);
                    maxX = Math.max(maxX, widget3.f۹۳۳۹H + widget3.m۱۱۱۶۳t());
                    maxY = Math.max(maxY, widget3.f۹۳۴۰I + widget3.m۱۱۱۴۵i());
                }
                int maxX2 = Math.max(this.f۹۳۴۶O, maxX);
                int maxY2 = Math.max(this.f۹۳۴۷P, maxY);
                if (originalHorizontalDimensionBehaviour == Ce.EnumCb.WRAP_CONTENT && m۱۱۱۶۳t() < maxX2) {
                    m۱۱۱۵۰k(maxX2);
                    this.f۹۳۳۳B[0] = Ce.EnumCb.WRAP_CONTENT;
                    wrap_override = true;
                    needsSolving2 = true;
                }
                if (originalVerticalDimensionBehaviour == Ce.EnumCb.WRAP_CONTENT && m۱۱۱۴۵i() < maxY2) {
                    m۱۱۱۳۰c(maxY2);
                    this.f۹۳۳۳B[1] = Ce.EnumCb.WRAP_CONTENT;
                    wrap_override = true;
                    needsSolving2 = true;
                }
            }
            int width2 = Math.max(this.f۹۳۴۶O, m۱۱۱۶۳t());
            if (width2 > m۱۱۱۶۳t()) {
                m۱۱۱۵۰k(width2);
                this.f۹۳۳۳B[0] = Ce.EnumCb.FIXED;
                wrap_override = true;
                needsSolving2 = true;
            }
            int height = Math.max(this.f۹۳۴۷P, m۱۱۱۴۵i());
            if (height > m۱۱۱۴۵i()) {
                m۱۱۱۳۰c(height);
                this.f۹۳۳۳B[1] = Ce.EnumCb.FIXED;
                wrap_override = true;
                needsSolving2 = true;
            }
            if (!wrap_override) {
                if (this.f۹۳۳۳B[0] == Ce.EnumCb.WRAP_CONTENT && prew > 0 && m۱۱۱۶۳t() > prew) {
                    this.f۹۴۰۶r0 = true;
                    wrap_override = true;
                    this.f۹۳۳۳B[0] = Ce.EnumCb.FIXED;
                    m۱۱۱۵۰k(prew);
                    needsSolving2 = true;
                }
                if (this.f۹۳۳۳B[1] != Ce.EnumCb.WRAP_CONTENT || preh <= 0 || m۱۱۱۴۵i() <= preh) {
                    needsSolving = needsSolving2;
                } else {
                    this.f۹۴۰۷s0 = true;
                    this.f۹۳۳۳B[1] = Ce.EnumCb.FIXED;
                    m۱۱۱۳۰c(preh);
                    needsSolving = true;
                    wrap_override = true;
                }
            } else {
                needsSolving = needsSolving2;
            }
            width = 0;
        }
        if (this.f۹۳۳۴C != null) {
            int width3 = Math.max(this.f۹۳۴۶O, m۱۱۱۶۳t());
            int height2 = Math.max(this.f۹۳۴۷P, m۱۱۱۴۵i());
            this.f۹۳۹۶h0.m۱۱۲۳۱a(this);
            m۱۱۱۵۰k(this.f۹۳۹۷i0 + width3 + this.f۹۳۹۹k0);
            m۱۱۱۳۰c(this.f۹۳۹۸j0 + height2 + this.f۹۴۰۰l0);
        } else {
            this.f۹۳۳۹H = prex;
            this.f۹۳۴۰I = prey;
        }
        if (wrap_override) {
            Ce.EnumCb[] bVarArr3 = this.f۹۳۳۳B;
            bVarArr3[0] = originalHorizontalDimensionBehaviour;
            bVarArr3[1] = originalVerticalDimensionBehaviour;
        }
        m۱۱۲۴۰a(this.f۹۳۹۵g0.m۱۱۰۴۹d());
        if (this == m۱۱۲۳۷H()) {
            m۱۱۲۳۶F();
        }
    }

    /* renamed from: R  reason: contains not printable characters */
    public void m۱۱۱۸۲R() {
        m۱۱۱۸۱Q();
        m۱۱۱۸۴a(this.f۹۴۰۵q0);
    }

    /* renamed from: S  reason: contains not printable characters */
    public void m۱۱۱۸۳S() {
        Ck leftNode = m۱۱۱۰۲a(Cd.EnumCd.LEFT).m۱۱۰۸۶d();
        Ck topNode = m۱۱۱۰۲a(Cd.EnumCd.TOP).m۱۱۰۸۶d();
        leftNode.m۱۱۲۱۲a((Ck) null, 0.0f);
        topNode.m۱۱۲۱۲a((Ck) null, 0.0f);
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۱۱۸۹e(int width, int height) {
        Cl lVar;
        Cl lVar2;
        if (!(this.f۹۳۳۳B[0] == Ce.EnumCb.WRAP_CONTENT || (lVar2 = this.f۹۳۶۲c) == null)) {
            lVar2.m۱۱۲۲۲a(width);
        }
        if (this.f۹۳۳۳B[1] != Ce.EnumCb.WRAP_CONTENT && (lVar = this.f۹۳۶۴d) != null) {
            lVar.m۱۱۲۲۲a(height);
        }
    }

    /* renamed from: Q  reason: contains not printable characters */
    public void m۱۱۱۸۱Q() {
        int count = this.f۹۴۴۲e0.size();
        m۱۱۰۹۸D();
        for (int i = 0; i < count; i++) {
            this.f۹۴۴۲e0.get(i).m۱۱۰۹۸D();
        }
    }

    /* renamed from: P  reason: contains not printable characters */
    public void m۱۱۱۸۰P() {
        if (!m۱۱۱۹۰p(8)) {
            m۱۱۱۸۴a(this.f۹۴۰۵q0);
        }
        m۱۱۱۸۳S();
    }

    /* renamed from: L  reason: contains not printable characters */
    public boolean m۱۱۱۷۶L() {
        return false;
    }

    /* renamed from: T  reason: contains not printable characters */
    private void m۱۱۱۷۰T() {
        this.f۹۴۰۱m0 = 0;
        this.f۹۴۰۲n0 = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۱۸۶a(Ce constraintWidget, int type) {
        if (type == 0) {
            m۱۱۱۷۱d(constraintWidget);
        } else if (type == 1) {
            m۱۱۱۷۲e(constraintWidget);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۱۱۷۱d(Ce widget) {
        int i = this.f۹۴۰۱m0 + 1;
        Cc[] cVarArr = this.f۹۴۰۴p0;
        if (i >= cVarArr.length) {
            this.f۹۴۰۴p0 = (Cc[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f۹۴۰۴p0[this.f۹۴۰۱m0] = new Cc(widget, 0, m۱۱۱۷۸N());
        this.f۹۴۰۱m0++;
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۱۱۷۲e(Ce widget) {
        int i = this.f۹۴۰۲n0 + 1;
        Cc[] cVarArr = this.f۹۴۰۳o0;
        if (i >= cVarArr.length) {
            this.f۹۴۰۳o0 = (Cc[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f۹۴۰۳o0[this.f۹۴۰۲n0] = new Cc(widget, 1, m۱۱۱۷۸N());
        this.f۹۴۰۲n0++;
    }
}
