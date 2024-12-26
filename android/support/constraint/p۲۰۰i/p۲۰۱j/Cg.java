package android.support.constraint.p۲۰۰i.p۲۰۱j;

import android.support.constraint.p۲۰۰i.Ci;
import android.support.constraint.p۲۰۰i.p۲۰۱j.Cd;
import android.support.constraint.p۲۰۰i.p۲۰۱j.Ce;
import java.util.ArrayList;

/* renamed from: android.support.constraint.i.j.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cg extends Ce {

    /* renamed from: e0, reason: contains not printable characters */
    protected float f۹۴۰۸e0 = -1.0f;

    /* renamed from: f0, reason: contains not printable characters */
    protected int f۹۴۰۹f0 = -1;

    /* renamed from: g0, reason: contains not printable characters */
    protected int f۹۴۱۰g0 = -1;

    /* renamed from: h0, reason: contains not printable characters */
    private Cd f۹۴۱۱h0 = this.f۹۳۷۹s;

    /* renamed from: i0, reason: contains not printable characters */
    private int f۹۴۱۲i0 = 0;

    /* renamed from: j0, reason: contains not printable characters */
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

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۹۱۲۸a() {
        return true;
    }

    /* renamed from: r, reason: contains not printable characters */
    public void m۹۱۳۴r(int orientation) {
        if (this.f۹۴۱۲i0 == orientation) {
            return;
        }
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

    /* renamed from: H, reason: contains not printable characters */
    public int m۹۱۲۴H() {
        return this.f۹۴۱۲i0;
    }

    /* renamed from: android.support.constraint.i.j.g$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: contains not printable characters */
        static final /* synthetic */ int[] f۹۴۱۴a = new int[Cd.d.values().length];

        static {
            try {
                f۹۴۱۴a[Cd.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۹۴۱۴a[Cd.d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۹۴۱۴a[Cd.d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f۹۴۱۴a[Cd.d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۹۴۱۴a[Cd.d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f۹۴۱۴a[Cd.d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f۹۴۱۴a[Cd.d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f۹۴۱۴a[Cd.d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f۹۴۱۴a[Cd.d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e10) {
            }
        }
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: a, reason: contains not printable characters */
    public Cd mo۹۱۲۵a(Cd.d anchorType) {
        switch (a.f۹۴۱۴a[anchorType.ordinal()]) {
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

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: b, reason: contains not printable characters */
    public ArrayList<Cd> mo۹۱۲۹b() {
        return this.f۹۳۳۲A;
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۹۱۳۱e(float value) {
        if (value > -1.0f) {
            this.f۹۴۰۸e0 = value;
            this.f۹۴۰۹f0 = -1;
            this.f۹۴۱۰g0 = -1;
        }
    }

    /* renamed from: p, reason: contains not printable characters */
    public void m۹۱۳۲p(int value) {
        if (value > -1) {
            this.f۹۴۰۸e0 = -1.0f;
            this.f۹۴۰۹f0 = value;
            this.f۹۴۱۰g0 = -1;
        }
    }

    /* renamed from: q, reason: contains not printable characters */
    public void m۹۱۳۳q(int value) {
        if (value > -1) {
            this.f۹۴۰۸e0 = -1.0f;
            this.f۹۴۰۹f0 = -1;
            this.f۹۴۱۰g0 = value;
        }
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: a, reason: contains not printable characters */
    public void mo۹۱۲۶a(int optimizationLevel) {
        Ce constraintWidgetContainer = m۹۰۸۳l();
        if (constraintWidgetContainer == null) {
            return;
        }
        if (m۹۱۲۴H() == 1) {
            this.f۹۳۷۹s.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۷۹s.m۹۰۱۸d(), 0);
            this.f۹۳۸۱u.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۷۹s.m۹۰۱۸d(), 0);
            if (this.f۹۴۰۹f0 != -1) {
                this.f۹۳۷۸r.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۷۸r.m۹۰۱۸d(), this.f۹۴۰۹f0);
                this.f۹۳۸۰t.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۷۸r.m۹۰۱۸d(), this.f۹۴۰۹f0);
                return;
            } else if (this.f۹۴۱۰g0 != -1) {
                this.f۹۳۷۸r.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۸۰t.m۹۰۱۸d(), -this.f۹۴۱۰g0);
                this.f۹۳۸۰t.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۸۰t.m۹۰۱۸d(), -this.f۹۴۱۰g0);
                return;
            } else {
                if (this.f۹۴۰۸e0 != -1.0f && constraintWidgetContainer.m۹۰۸۱k() == Ce.b.FIXED) {
                    int position = (int) (constraintWidgetContainer.f۹۳۳۵D * this.f۹۴۰۸e0);
                    this.f۹۳۷۸r.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۷۸r.m۹۰۱۸d(), position);
                    this.f۹۳۸۰t.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۷۸r.m۹۰۱۸d(), position);
                    return;
                }
                return;
            }
        }
        this.f۹۳۷۸r.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۷۸r.m۹۰۱۸d(), 0);
        this.f۹۳۸۰t.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۷۸r.m۹۰۱۸d(), 0);
        if (this.f۹۴۰۹f0 != -1) {
            this.f۹۳۷۹s.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۷۹s.m۹۰۱۸d(), this.f۹۴۰۹f0);
            this.f۹۳۸۱u.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۷۹s.m۹۰۱۸d(), this.f۹۴۰۹f0);
        } else if (this.f۹۴۱۰g0 != -1) {
            this.f۹۳۷۹s.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۸۱u.m۹۰۱۸d(), -this.f۹۴۱۰g0);
            this.f۹۳۸۱u.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۸۱u.m۹۰۱۸d(), -this.f۹۴۱۰g0);
        } else if (this.f۹۴۰۸e0 != -1.0f && constraintWidgetContainer.m۹۰۹۳r() == Ce.b.FIXED) {
            int position2 = (int) (constraintWidgetContainer.f۹۳۳۶E * this.f۹۴۰۸e0);
            this.f۹۳۷۹s.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۷۹s.m۹۰۱۸d(), position2);
            this.f۹۳۸۱u.m۹۰۱۸d().m۹۱۴۲a(1, constraintWidgetContainer.f۹۳۷۹s.m۹۰۱۸d(), position2);
        }
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: a, reason: contains not printable characters */
    public void mo۹۱۲۷a(android.support.constraint.p۲۰۰i.Ce system) {
        Cf parent = (Cf) m۹۰۸۳l();
        if (parent == null) {
            return;
        }
        Cd begin = parent.mo۹۱۲۵a(Cd.d.LEFT);
        Cd end = parent.mo۹۱۲۵a(Cd.d.RIGHT);
        Ce ce = this.f۹۳۳۴C;
        boolean parentWrapContent = ce != null && ce.f۹۳۳۳B[0] == Ce.b.WRAP_CONTENT;
        if (this.f۹۴۱۲i0 == 0) {
            begin = parent.mo۹۱۲۵a(Cd.d.TOP);
            end = parent.mo۹۱۲۵a(Cd.d.BOTTOM);
            Ce ce2 = this.f۹۳۳۴C;
            parentWrapContent = ce2 != null && ce2.f۹۳۳۳B[1] == Ce.b.WRAP_CONTENT;
        }
        if (this.f۹۴۰۹f0 != -1) {
            Ci guide = system.m۸۹۶۶a(this.f۹۴۱۱h0);
            Ci parentLeft = system.m۸۹۶۶a(begin);
            system.m۸۹۶۳a(guide, parentLeft, this.f۹۴۰۹f0, 6);
            if (parentWrapContent) {
                system.m۸۹۷۷b(system.m۸۹۶۶a(end), guide, 0, 5);
                return;
            }
            return;
        }
        if (this.f۹۴۱۰g0 == -1) {
            if (this.f۹۴۰۸e0 != -1.0f) {
                Ci guide2 = system.m۸۹۶۶a(this.f۹۴۱۱h0);
                Ci parentLeft2 = system.m۸۹۶۶a(begin);
                system.m۸۹۶۷a(android.support.constraint.p۲۰۰i.Ce.m۸۹۵۳a(system, guide2, parentLeft2, system.m۸۹۶۶a(end), this.f۹۴۰۸e0, this.f۹۴۱۳j0));
                return;
            }
            return;
        }
        Ci guide3 = system.m۸۹۶۶a(this.f۹۴۱۱h0);
        Ci parentRight = system.m۸۹۶۶a(end);
        system.m۸۹۶۳a(guide3, parentRight, -this.f۹۴۱۰g0, 6);
        if (parentWrapContent) {
            system.m۸۹۷۷b(guide3, system.m۸۹۶۶a(begin), 0, 5);
            system.m۸۹۷۷b(parentRight, guide3, 0, 5);
        }
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: c, reason: contains not printable characters */
    public void mo۹۱۳۰c(android.support.constraint.p۲۰۰i.Ce system) {
        if (m۹۰۸۳l() == null) {
            return;
        }
        int value = system.m۸۹۷۵b(this.f۹۴۱۱h0);
        if (this.f۹۴۱۲i0 == 1) {
            m۹۰۸۸n(value);
            m۹۰۹۰o(0);
            m۹۰۶۲c(m۹۰۸۳l().m۹۰۷۷i());
            m۹۰۸۲k(0);
            return;
        }
        m۹۰۸۸n(0);
        m۹۰۹۰o(value);
        m۹۰۸۲k(m۹۰۸۳l().m۹۰۹۵t());
        m۹۰۶۲c(0);
    }
}
