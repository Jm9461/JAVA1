package android.support.constraint.i.j;

import android.support.constraint.i.i;
import android.support.constraint.i.j.d;
import android.support.constraint.i.j.e;
import java.util.ArrayList;

public class g extends e {
    protected float e0 = -1.0f;
    protected int f0 = -1;
    protected int g0 = -1;
    private d h0 = this.s;
    private int i0 = 0;
    private boolean j0 = false;

    public g() {
        new j();
        this.A.clear();
        this.A.add(this.h0);
        int count = this.z.length;
        for (int i = 0; i < count; i++) {
            this.z[i] = this.h0;
        }
    }

    @Override // android.support.constraint.i.j.e
    public boolean a() {
        return true;
    }

    public void r(int orientation) {
        if (this.i0 != orientation) {
            this.i0 = orientation;
            this.A.clear();
            if (this.i0 == 1) {
                this.h0 = this.r;
            } else {
                this.h0 = this.s;
            }
            this.A.add(this.h0);
            int count = this.z.length;
            for (int i = 0; i < count; i++) {
                this.z[i] = this.h0;
            }
        }
    }

    public int H() {
        return this.i0;
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f۶۹۷a = new int[d.EnumC۰۰۲۲d.values().length];

        static {
            try {
                f۶۹۷a[d.EnumC۰۰۲۲d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۶۹۷a[d.EnumC۰۰۲۲d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۶۹۷a[d.EnumC۰۰۲۲d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f۶۹۷a[d.EnumC۰۰۲۲d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۶۹۷a[d.EnumC۰۰۲۲d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f۶۹۷a[d.EnumC۰۰۲۲d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f۶۹۷a[d.EnumC۰۰۲۲d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f۶۹۷a[d.EnumC۰۰۲۲d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f۶۹۷a[d.EnumC۰۰۲۲d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e10) {
            }
        }
    }

    @Override // android.support.constraint.i.j.e
    public d a(d.EnumC۰۰۲۲d anchorType) {
        switch (a.f۶۹۷a[anchorType.ordinal()]) {
            case 1:
            case 2:
                if (this.i0 == 1) {
                    return this.h0;
                }
                break;
            case 3:
            case 4:
                if (this.i0 == 0) {
                    return this.h0;
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

    @Override // android.support.constraint.i.j.e
    public ArrayList<d> b() {
        return this.A;
    }

    public void e(float value) {
        if (value > -1.0f) {
            this.e0 = value;
            this.f0 = -1;
            this.g0 = -1;
        }
    }

    public void p(int value) {
        if (value > -1) {
            this.e0 = -1.0f;
            this.f0 = value;
            this.g0 = -1;
        }
    }

    public void q(int value) {
        if (value > -1) {
            this.e0 = -1.0f;
            this.f0 = -1;
            this.g0 = value;
        }
    }

    @Override // android.support.constraint.i.j.e
    public void a(int optimizationLevel) {
        e constraintWidgetContainer = l();
        if (constraintWidgetContainer != null) {
            if (H() == 1) {
                this.s.d().a(1, constraintWidgetContainer.s.d(), 0);
                this.u.d().a(1, constraintWidgetContainer.s.d(), 0);
                if (this.f0 != -1) {
                    this.r.d().a(1, constraintWidgetContainer.r.d(), this.f0);
                    this.t.d().a(1, constraintWidgetContainer.r.d(), this.f0);
                } else if (this.g0 != -1) {
                    this.r.d().a(1, constraintWidgetContainer.t.d(), -this.g0);
                    this.t.d().a(1, constraintWidgetContainer.t.d(), -this.g0);
                } else if (this.e0 != -1.0f && constraintWidgetContainer.k() == e.b.FIXED) {
                    int position = (int) (((float) constraintWidgetContainer.D) * this.e0);
                    this.r.d().a(1, constraintWidgetContainer.r.d(), position);
                    this.t.d().a(1, constraintWidgetContainer.r.d(), position);
                }
            } else {
                this.r.d().a(1, constraintWidgetContainer.r.d(), 0);
                this.t.d().a(1, constraintWidgetContainer.r.d(), 0);
                if (this.f0 != -1) {
                    this.s.d().a(1, constraintWidgetContainer.s.d(), this.f0);
                    this.u.d().a(1, constraintWidgetContainer.s.d(), this.f0);
                } else if (this.g0 != -1) {
                    this.s.d().a(1, constraintWidgetContainer.u.d(), -this.g0);
                    this.u.d().a(1, constraintWidgetContainer.u.d(), -this.g0);
                } else if (this.e0 != -1.0f && constraintWidgetContainer.r() == e.b.FIXED) {
                    int position2 = (int) (((float) constraintWidgetContainer.E) * this.e0);
                    this.s.d().a(1, constraintWidgetContainer.s.d(), position2);
                    this.u.d().a(1, constraintWidgetContainer.s.d(), position2);
                }
            }
        }
    }

    @Override // android.support.constraint.i.j.e
    public void a(android.support.constraint.i.e system) {
        f parent = (f) l();
        if (parent != null) {
            d begin = parent.a(d.EnumC۰۰۲۲d.LEFT);
            d end = parent.a(d.EnumC۰۰۲۲d.RIGHT);
            e eVar = this.C;
            boolean z = true;
            boolean parentWrapContent = eVar != null && eVar.B[0] == e.b.WRAP_CONTENT;
            if (this.i0 == 0) {
                begin = parent.a(d.EnumC۰۰۲۲d.TOP);
                end = parent.a(d.EnumC۰۰۲۲d.BOTTOM);
                e eVar2 = this.C;
                if (eVar2 == null || eVar2.B[1] != e.b.WRAP_CONTENT) {
                    z = false;
                }
                parentWrapContent = z;
            }
            if (this.f0 != -1) {
                i guide = system.a(this.h0);
                system.a(guide, system.a(begin), this.f0, 6);
                if (parentWrapContent) {
                    system.b(system.a(end), guide, 0, 5);
                }
            } else if (this.g0 != -1) {
                i guide2 = system.a(this.h0);
                i parentRight = system.a(end);
                system.a(guide2, parentRight, -this.g0, 6);
                if (parentWrapContent) {
                    system.b(guide2, system.a(begin), 0, 5);
                    system.b(parentRight, guide2, 0, 5);
                }
            } else if (this.e0 != -1.0f) {
                system.a(android.support.constraint.i.e.a(system, system.a(this.h0), system.a(begin), system.a(end), this.e0, this.j0));
            }
        }
    }

    @Override // android.support.constraint.i.j.e
    public void c(android.support.constraint.i.e system) {
        if (l() != null) {
            int value = system.b(this.h0);
            if (this.i0 == 1) {
                n(value);
                o(0);
                c(l().i());
                k(0);
                return;
            }
            n(0);
            o(value);
            k(l().t());
            c(0);
        }
    }
}
