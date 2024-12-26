package android.support.constraint.p۰۴۱i.p۰۴۲j;

import android.support.constraint.p۰۴۱i.Ci;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Cd;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Ce;
import java.util.ArrayList;

/* renamed from: android.support.constraint.i.j.g  reason: invalid class name */
public class Cg extends Ce {

    /* renamed from: e0  reason: contains not printable characters */
    protected float f۹۴۰۸e0 = -1.0f;

    /* renamed from: f0  reason: contains not printable characters */
    protected int f۹۴۰۹f0 = -1;

    /* renamed from: g0  reason: contains not printable characters */
    protected int f۹۴۱۰g0 = -1;

    /* renamed from: h0  reason: contains not printable characters */
    private Cd f۹۴۱۱h0 = this.f۹۳۷۹s;

    /* renamed from: i0  reason: contains not printable characters */
    private int f۹۴۱۲i0 = 0;

    /* renamed from: j0  reason: contains not printable characters */
    private boolean f۹۴۱۳j0 = false;

    public Cg() {
        new Cj();
        this.f۹۳۳۲A.clear();
        this.f۹۳۳۲A.add(this.f۹۴۱۱h0);
        int count = this.f۹۳۸۶z.length;
        for (int i = 0; i < count; i++) {
            this.f۹۳۸۶z[i] = this.f۹۴۱۱h0;
        }
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۱۹۶a() {
        return true;
    }

    /* renamed from: r  reason: contains not printable characters */
    public void m۱۱۲۰۲r(int orientation) {
        if (this.f۹۴۱۲i0 != orientation) {
            this.f۹۴۱۲i0 = orientation;
            this.f۹۳۳۲A.clear();
            if (this.f۹۴۱۲i0 == 1) {
                this.f۹۴۱۱h0 = this.f۹۳۷۸r;
            } else {
                this.f۹۴۱۱h0 = this.f۹۳۷۹s;
            }
            this.f۹۳۳۲A.add(this.f۹۴۱۱h0);
            int count = this.f۹۳۸۶z.length;
            for (int i = 0; i < count; i++) {
                this.f۹۳۸۶z[i] = this.f۹۴۱۱h0;
            }
        }
    }

    /* renamed from: H  reason: contains not printable characters */
    public int m۱۱۱۹۲H() {
        return this.f۹۴۱۲i0;
    }

    /* renamed from: android.support.constraint.i.j.g$a  reason: invalid class name */
    static /* synthetic */ class Ca {

        /* renamed from: a  reason: contains not printable characters */
        static final /* synthetic */ int[] f۹۴۱۴a = new int[Cd.EnumCd.values().length];

        static {
            try {
                f۹۴۱۴a[Cd.EnumCd.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f۹۴۱۴a[Cd.EnumCd.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۹۴۱۴a[Cd.EnumCd.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۹۴۱۴a[Cd.EnumCd.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f۹۴۱۴a[Cd.EnumCd.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۹۴۱۴a[Cd.EnumCd.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f۹۴۱۴a[Cd.EnumCd.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f۹۴۱۴a[Cd.EnumCd.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f۹۴۱۴a[Cd.EnumCd.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: a  reason: contains not printable characters */
    public Cd m۱۱۱۹۳a(Cd.EnumCd anchorType) {
        switch (Ca.f۹۴۱۴a[anchorType.ordinal()]) {
            case 1:
            case 2:
                if (this.f۹۴۱۲i0 == 1) {
                    return this.f۹۴۱۱h0;
                }
                break;
            case 3:
            case 4:
                if (this.f۹۴۱۲i0 == 0) {
                    return this.f۹۴۱۱h0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(anchorType.name());
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: b  reason: contains not printable characters */
    public ArrayList<Cd> m۱۱۱۹۷b() {
        return this.f۹۳۳۲A;
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۱۱۹۹e(float value) {
        if (value > -1.0f) {
            this.f۹۴۰۸e0 = value;
            this.f۹۴۰۹f0 = -1;
            this.f۹۴۱۰g0 = -1;
        }
    }

    /* renamed from: p  reason: contains not printable characters */
    public void m۱۱۲۰۰p(int value) {
        if (value > -1) {
            this.f۹۴۰۸e0 = -1.0f;
            this.f۹۴۰۹f0 = value;
            this.f۹۴۱۰g0 = -1;
        }
    }

    /* renamed from: q  reason: contains not printable characters */
    public void m۱۱۲۰۱q(int value) {
        if (value > -1) {
            this.f۹۴۰۸e0 = -1.0f;
            this.f۹۴۰۹f0 = -1;
            this.f۹۴۱۰g0 = value;
        }
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۱۹۴a(int optimizationLevel) {
        Ce constraintWidgetContainer = m۱۱۱۵۱l();
        if (constraintWidgetContainer != null) {
            if (m۱۱۱۹۲H() == 1) {
                this.f۹۳۷۹s.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۷۹s.m۱۱۰۸۶d(), 0);
                this.f۹۳۸۱u.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۷۹s.m۱۱۰۸۶d(), 0);
                if (this.f۹۴۰۹f0 != -1) {
                    this.f۹۳۷۸r.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۷۸r.m۱۱۰۸۶d(), this.f۹۴۰۹f0);
                    this.f۹۳۸۰t.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۷۸r.m۱۱۰۸۶d(), this.f۹۴۰۹f0);
                } else if (this.f۹۴۱۰g0 != -1) {
                    this.f۹۳۷۸r.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۸۰t.m۱۱۰۸۶d(), -this.f۹۴۱۰g0);
                    this.f۹۳۸۰t.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۸۰t.m۱۱۰۸۶d(), -this.f۹۴۱۰g0);
                } else if (this.f۹۴۰۸e0 != -1.0f && constraintWidgetContainer.m۱۱۱۴۹k() == Ce.EnumCb.FIXED) {
                    int position = (int) (((float) constraintWidgetContainer.f۹۳۳۵D) * this.f۹۴۰۸e0);
                    this.f۹۳۷۸r.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۷۸r.m۱۱۰۸۶d(), position);
                    this.f۹۳۸۰t.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۷۸r.m۱۱۰۸۶d(), position);
                }
            } else {
                this.f۹۳۷۸r.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۷۸r.m۱۱۰۸۶d(), 0);
                this.f۹۳۸۰t.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۷۸r.m۱۱۰۸۶d(), 0);
                if (this.f۹۴۰۹f0 != -1) {
                    this.f۹۳۷۹s.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۷۹s.m۱۱۰۸۶d(), this.f۹۴۰۹f0);
                    this.f۹۳۸۱u.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۷۹s.m۱۱۰۸۶d(), this.f۹۴۰۹f0);
                } else if (this.f۹۴۱۰g0 != -1) {
                    this.f۹۳۷۹s.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۸۱u.m۱۱۰۸۶d(), -this.f۹۴۱۰g0);
                    this.f۹۳۸۱u.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۸۱u.m۱۱۰۸۶d(), -this.f۹۴۱۰g0);
                } else if (this.f۹۴۰۸e0 != -1.0f && constraintWidgetContainer.m۱۱۱۶۱r() == Ce.EnumCb.FIXED) {
                    int position2 = (int) (((float) constraintWidgetContainer.f۹۳۳۶E) * this.f۹۴۰۸e0);
                    this.f۹۳۷۹s.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۷۹s.m۱۱۰۸۶d(), position2);
                    this.f۹۳۸۱u.m۱۱۰۸۶d().m۱۱۲۱۰a(1, constraintWidgetContainer.f۹۳۷۹s.m۱۱۰۸۶d(), position2);
                }
            }
        }
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۱۹۵a(android.support.constraint.p۰۴۱i.Ce system) {
        Cf parent = (Cf) m۱۱۱۵۱l();
        if (parent != null) {
            Cd begin = parent.m۱۱۱۰۲a(Cd.EnumCd.LEFT);
            Cd end = parent.m۱۱۱۰۲a(Cd.EnumCd.RIGHT);
            Ce eVar = this.f۹۳۳۴C;
            boolean z = true;
            boolean parentWrapContent = eVar != null && eVar.f۹۳۳۳B[0] == Ce.EnumCb.WRAP_CONTENT;
            if (this.f۹۴۱۲i0 == 0) {
                begin = parent.m۱۱۱۰۲a(Cd.EnumCd.TOP);
                end = parent.m۱۱۱۰۲a(Cd.EnumCd.BOTTOM);
                Ce eVar2 = this.f۹۳۳۴C;
                if (eVar2 == null || eVar2.f۹۳۳۳B[1] != Ce.EnumCb.WRAP_CONTENT) {
                    z = false;
                }
                parentWrapContent = z;
            }
            if (this.f۹۴۰۹f0 != -1) {
                Ci guide = system.m۱۱۰۳۴a(this.f۹۴۱۱h0);
                system.m۱۱۰۳۱a(guide, system.m۱۱۰۳۴a(begin), this.f۹۴۰۹f0, 6);
                if (parentWrapContent) {
                    system.m۱۱۰۴۵b(system.m۱۱۰۳۴a(end), guide, 0, 5);
                }
            } else if (this.f۹۴۱۰g0 != -1) {
                Ci guide2 = system.m۱۱۰۳۴a(this.f۹۴۱۱h0);
                Ci parentRight = system.m۱۱۰۳۴a(end);
                system.m۱۱۰۳۱a(guide2, parentRight, -this.f۹۴۱۰g0, 6);
                if (parentWrapContent) {
                    system.m۱۱۰۴۵b(guide2, system.m۱۱۰۳۴a(begin), 0, 5);
                    system.m۱۱۰۴۵b(parentRight, guide2, 0, 5);
                }
            } else if (this.f۹۴۰۸e0 != -1.0f) {
                system.m۱۱۰۳۵a(android.support.constraint.p۰۴۱i.Ce.m۱۱۰۲۱a(system, system.m۱۱۰۳۴a(this.f۹۴۱۱h0), system.m۱۱۰۳۴a(begin), system.m۱۱۰۳۴a(end), this.f۹۴۰۸e0, this.f۹۴۱۳j0));
            }
        }
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۱۹۸c(android.support.constraint.p۰۴۱i.Ce system) {
        if (m۱۱۱۵۱l() != null) {
            int value = system.m۱۱۰۴۳b(this.f۹۴۱۱h0);
            if (this.f۹۴۱۲i0 == 1) {
                m۱۱۱۵۶n(value);
                m۱۱۱۵۸o(0);
                m۱۱۱۳۰c(m۱۱۱۵۱l().m۱۱۱۴۵i());
                m۱۱۱۵۰k(0);
                return;
            }
            m۱۱۱۵۶n(0);
            m۱۱۱۵۸o(value);
            m۱۱۱۵۰k(m۱۱۱۵۱l().m۱۱۱۶۳t());
            m۱۱۱۳۰c(0);
        }
    }
}
