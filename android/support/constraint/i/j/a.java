package android.support.constraint.i.j;

import android.support.constraint.i.e;
import android.support.constraint.i.i;
import android.support.constraint.i.j.e;
import java.util.ArrayList;

public class a extends h {
    private int g0 = 0;
    private ArrayList<k> h0 = new ArrayList<>(4);
    private boolean i0 = true;

    @Override // android.support.constraint.i.j.e
    public boolean a() {
        return true;
    }

    public void p(int barrierType) {
        this.g0 = barrierType;
    }

    public void c(boolean allowsGoneWidget) {
        this.i0 = allowsGoneWidget;
    }

    @Override // android.support.constraint.i.j.e
    public void D() {
        super.D();
        this.h0.clear();
    }

    @Override // android.support.constraint.i.j.e
    public void a(int optimizationLevel) {
        k node;
        e eVar = this.C;
        if (eVar != null && ((f) eVar).p(2)) {
            int i = this.g0;
            if (i == 0) {
                node = this.r.d();
            } else if (i == 1) {
                node = this.t.d();
            } else if (i == 2) {
                node = this.s.d();
            } else if (i == 3) {
                node = this.u.d();
            } else {
                return;
            }
            node.b(5);
            int i2 = this.g0;
            if (i2 == 0 || i2 == 1) {
                this.s.d().a((k) null, 0.0f);
                this.u.d().a((k) null, 0.0f);
            } else {
                this.r.d().a((k) null, 0.0f);
                this.t.d().a((k) null, 0.0f);
            }
            this.h0.clear();
            for (int i3 = 0; i3 < this.f0; i3++) {
                e widget = this.e0[i3];
                if (this.i0 || widget.a()) {
                    k depends = null;
                    int i4 = this.g0;
                    if (i4 == 0) {
                        depends = widget.r.d();
                    } else if (i4 == 1) {
                        depends = widget.t.d();
                    } else if (i4 == 2) {
                        depends = widget.s.d();
                    } else if (i4 == 3) {
                        depends = widget.u.d();
                    }
                    if (depends != null) {
                        this.h0.add(depends);
                        depends.a(node);
                    }
                }
            }
        }
    }

    @Override // android.support.constraint.i.j.e
    public void E() {
        k node;
        float value = 0.0f;
        int i = this.g0;
        if (i == 0) {
            node = this.r.d();
            value = Float.MAX_VALUE;
        } else if (i == 1) {
            node = this.t.d();
        } else if (i == 2) {
            node = this.s.d();
            value = Float.MAX_VALUE;
        } else if (i == 3) {
            node = this.u.d();
        } else {
            return;
        }
        int count = this.h0.size();
        k resolvedTarget = null;
        for (int i2 = 0; i2 < count; i2++) {
            k n = this.h0.get(i2);
            if (n.f۷۰۷b == 1) {
                int i3 = this.g0;
                if (i3 == 0 || i3 == 2) {
                    if (n.f۷۰۳g < value) {
                        value = n.f۷۰۳g;
                        resolvedTarget = n.f۷۰۲f;
                    }
                } else if (n.f۷۰۳g > value) {
                    value = n.f۷۰۳g;
                    resolvedTarget = n.f۷۰۲f;
                }
            } else {
                return;
            }
        }
        if (e.h() != null) {
            e.h().y++;
        }
        node.f۷۰۲f = resolvedTarget;
        node.f۷۰۳g = value;
        node.a();
        int i4 = this.g0;
        if (i4 == 0) {
            this.t.d().a(resolvedTarget, value);
        } else if (i4 == 1) {
            this.r.d().a(resolvedTarget, value);
        } else if (i4 == 2) {
            this.u.d().a(resolvedTarget, value);
        } else if (i4 == 3) {
            this.s.d().a(resolvedTarget, value);
        }
    }

    @Override // android.support.constraint.i.j.e
    public void a(e system) {
        Object[] objArr;
        d[] dVarArr = this.z;
        dVarArr[0] = this.r;
        dVarArr[2] = this.s;
        dVarArr[1] = this.t;
        dVarArr[3] = this.u;
        int i = 0;
        while (true) {
            objArr = this.z;
            if (i >= objArr.length) {
                break;
            }
            objArr[i].i = system.a(objArr[i]);
            i++;
        }
        int i2 = this.g0;
        if (i2 >= 0 && i2 < 4) {
            d position = objArr[i2];
            boolean hasMatchConstraintWidgets = false;
            int i3 = 0;
            while (true) {
                if (i3 >= this.f0) {
                    break;
                }
                e widget = this.e0[i3];
                if (this.i0 || widget.a()) {
                    int i4 = this.g0;
                    if ((i4 != 0 && i4 != 1) || widget.k() != e.b.MATCH_CONSTRAINT) {
                        int i5 = this.g0;
                        if ((i5 == 2 || i5 == 3) && widget.r() == e.b.MATCH_CONSTRAINT) {
                            hasMatchConstraintWidgets = true;
                            break;
                        }
                    } else {
                        hasMatchConstraintWidgets = true;
                        break;
                    }
                }
                i3++;
            }
            int i6 = this.g0;
            if (i6 == 0 || i6 == 1) {
                if (l().k() == e.b.WRAP_CONTENT) {
                    hasMatchConstraintWidgets = false;
                }
            } else if (l().r() == e.b.WRAP_CONTENT) {
                hasMatchConstraintWidgets = false;
            }
            for (int i7 = 0; i7 < this.f0; i7++) {
                e widget2 = this.e0[i7];
                if (this.i0 || widget2.a()) {
                    i target = system.a(widget2.z[this.g0]);
                    d[] dVarArr2 = widget2.z;
                    int i8 = this.g0;
                    dVarArr2[i8].i = target;
                    if (i8 == 0 || i8 == 2) {
                        system.b(position.i, target, hasMatchConstraintWidgets);
                    } else {
                        system.a(position.i, target, hasMatchConstraintWidgets);
                    }
                }
            }
            int i9 = this.g0;
            if (i9 == 0) {
                system.a(this.t.i, this.r.i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.a(this.r.i, this.C.t.i, 0, 5);
                }
            } else if (i9 == 1) {
                system.a(this.r.i, this.t.i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.a(this.r.i, this.C.r.i, 0, 5);
                }
            } else if (i9 == 2) {
                system.a(this.u.i, this.s.i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.a(this.s.i, this.C.u.i, 0, 5);
                }
            } else if (i9 == 3) {
                system.a(this.s.i, this.u.i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.a(this.s.i, this.C.s.i, 0, 5);
                }
            }
        }
    }
}
