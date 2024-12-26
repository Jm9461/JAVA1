package android.support.constraint.p۰۴۱i.p۰۴۲j;

import android.support.constraint.p۰۴۱i.Ce;
import android.support.constraint.p۰۴۱i.Ci;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Ce;
import java.util.ArrayList;

/* renamed from: android.support.constraint.i.j.a  reason: invalid class name */
public class Ca extends Ch {

    /* renamed from: g0  reason: contains not printable characters */
    private int f۹۲۸۴g0 = 0;

    /* renamed from: h0  reason: contains not printable characters */
    private ArrayList<Ck> f۹۲۸۵h0 = new ArrayList<>(4);

    /* renamed from: i0  reason: contains not printable characters */
    private boolean f۹۲۸۶i0 = true;

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۰۷۱a() {
        return true;
    }

    /* renamed from: p  reason: contains not printable characters */
    public void m۱۱۰۷۳p(int barrierType) {
        this.f۹۲۸۴g0 = barrierType;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۰۷۲c(boolean allowsGoneWidget) {
        this.f۹۲۸۶i0 = allowsGoneWidget;
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: D  reason: contains not printable characters */
    public void m۱۱۰۶۷D() {
        super.m۱۱۰۹۸D();
        this.f۹۲۸۵h0.clear();
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۶۹a(int optimizationLevel) {
        Ck node;
        Ce eVar = this.f۹۳۳۴C;
        if (eVar != null && ((Cf) eVar).m۱۱۱۹۰p(2)) {
            int i = this.f۹۲۸۴g0;
            if (i == 0) {
                node = this.f۹۳۷۸r.m۱۱۰۸۶d();
            } else if (i == 1) {
                node = this.f۹۳۸۰t.m۱۱۰۸۶d();
            } else if (i == 2) {
                node = this.f۹۳۷۹s.m۱۱۰۸۶d();
            } else if (i == 3) {
                node = this.f۹۳۸۱u.m۱۱۰۸۶d();
            } else {
                return;
            }
            node.m۱۱۲۱۵b(5);
            int i2 = this.f۹۲۸۴g0;
            if (i2 == 0 || i2 == 1) {
                this.f۹۳۷۹s.m۱۱۰۸۶d().m۱۱۲۱۲a((Ck) null, 0.0f);
                this.f۹۳۸۱u.m۱۱۰۸۶d().m۱۱۲۱۲a((Ck) null, 0.0f);
            } else {
                this.f۹۳۷۸r.m۱۱۰۸۶d().m۱۱۲۱۲a((Ck) null, 0.0f);
                this.f۹۳۸۰t.m۱۱۰۸۶d().m۱۱۲۱۲a((Ck) null, 0.0f);
            }
            this.f۹۲۸۵h0.clear();
            for (int i3 = 0; i3 < this.f۹۴۱۶f0; i3++) {
                Ce widget = this.f۹۴۱۵e0[i3];
                if (this.f۹۲۸۶i0 || widget.m۱۱۱۱۸a()) {
                    Ck depends = null;
                    int i4 = this.f۹۲۸۴g0;
                    if (i4 == 0) {
                        depends = widget.f۹۳۷۸r.m۱۱۰۸۶d();
                    } else if (i4 == 1) {
                        depends = widget.f۹۳۸۰t.m۱۱۰۸۶d();
                    } else if (i4 == 2) {
                        depends = widget.f۹۳۷۹s.m۱۱۰۸۶d();
                    } else if (i4 == 3) {
                        depends = widget.f۹۳۸۱u.m۱۱۰۸۶d();
                    }
                    if (depends != null) {
                        this.f۹۲۸۵h0.add(depends);
                        depends.m۱۱۲۲۶a(node);
                    }
                }
            }
        }
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: E  reason: contains not printable characters */
    public void m۱۱۰۶۸E() {
        Ck node;
        float value = 0.0f;
        int i = this.f۹۲۸۴g0;
        if (i == 0) {
            node = this.f۹۳۷۸r.m۱۱۰۸۶d();
            value = Float.MAX_VALUE;
        } else if (i == 1) {
            node = this.f۹۳۸۰t.m۱۱۰۸۶d();
        } else if (i == 2) {
            node = this.f۹۳۷۹s.m۱۱۰۸۶d();
            value = Float.MAX_VALUE;
        } else if (i == 3) {
            node = this.f۹۳۸۱u.m۱۱۰۸۶d();
        } else {
            return;
        }
        int count = this.f۹۲۸۵h0.size();
        Ck resolvedTarget = null;
        for (int i2 = 0; i2 < count; i2++) {
            Ck n = this.f۹۲۸۵h0.get(i2);
            if (n.f۹۴۳۱b == 1) {
                int i3 = this.f۹۲۸۴g0;
                if (i3 == 0 || i3 == 2) {
                    if (n.f۹۴۲۲g < value) {
                        value = n.f۹۴۲۲g;
                        resolvedTarget = n.f۹۴۲۱f;
                    }
                } else if (n.f۹۴۲۲g > value) {
                    value = n.f۹۴۲۲g;
                    resolvedTarget = n.f۹۴۲۱f;
                }
            } else {
                return;
            }
        }
        if (Ce.m۱۱۰۲۸h() != null) {
            Ce.m۱۱۰۲۸h().f۹۲۶۳y++;
        }
        node.f۹۴۲۱f = resolvedTarget;
        node.f۹۴۲۲g = value;
        node.m۱۱۲۲۵a();
        int i4 = this.f۹۲۸۴g0;
        if (i4 == 0) {
            this.f۹۳۸۰t.m۱۱۰۸۶d().m۱۱۲۱۲a(resolvedTarget, value);
        } else if (i4 == 1) {
            this.f۹۳۷۸r.m۱۱۰۸۶d().m۱۱۲۱۲a(resolvedTarget, value);
        } else if (i4 == 2) {
            this.f۹۳۸۱u.m۱۱۰۸۶d().m۱۱۲۱۲a(resolvedTarget, value);
        } else if (i4 == 3) {
            this.f۹۳۷۹s.m۱۱۰۸۶d().m۱۱۲۱۲a(resolvedTarget, value);
        }
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۷۰a(Ce system) {
        Object[] objArr;
        Cd[] dVarArr = this.f۹۳۸۶z;
        dVarArr[0] = this.f۹۳۷۸r;
        dVarArr[2] = this.f۹۳۷۹s;
        dVarArr[1] = this.f۹۳۸۰t;
        dVarArr[3] = this.f۹۳۸۱u;
        int i = 0;
        while (true) {
            objArr = this.f۹۳۸۶z;
            if (i >= objArr.length) {
                break;
            }
            objArr[i].f۹۳۱۲i = system.m۱۱۰۳۴a(objArr[i]);
            i++;
        }
        int i2 = this.f۹۲۸۴g0;
        if (i2 >= 0 && i2 < 4) {
            Cd position = objArr[i2];
            boolean hasMatchConstraintWidgets = false;
            int i3 = 0;
            while (true) {
                if (i3 >= this.f۹۴۱۶f0) {
                    break;
                }
                Ce widget = this.f۹۴۱۵e0[i3];
                if (this.f۹۲۸۶i0 || widget.m۱۱۱۱۸a()) {
                    int i4 = this.f۹۲۸۴g0;
                    if ((i4 != 0 && i4 != 1) || widget.m۱۱۱۴۹k() != Ce.EnumCb.MATCH_CONSTRAINT) {
                        int i5 = this.f۹۲۸۴g0;
                        if ((i5 == 2 || i5 == 3) && widget.m۱۱۱۶۱r() == Ce.EnumCb.MATCH_CONSTRAINT) {
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
            int i6 = this.f۹۲۸۴g0;
            if (i6 == 0 || i6 == 1) {
                if (m۱۱۱۵۱l().m۱۱۱۴۹k() == Ce.EnumCb.WRAP_CONTENT) {
                    hasMatchConstraintWidgets = false;
                }
            } else if (m۱۱۱۵۱l().m۱۱۱۶۱r() == Ce.EnumCb.WRAP_CONTENT) {
                hasMatchConstraintWidgets = false;
            }
            for (int i7 = 0; i7 < this.f۹۴۱۶f0; i7++) {
                Ce widget2 = this.f۹۴۱۵e0[i7];
                if (this.f۹۲۸۶i0 || widget2.m۱۱۱۱۸a()) {
                    Ci target = system.m۱۱۰۳۴a(widget2.f۹۳۸۶z[this.f۹۲۸۴g0]);
                    Cd[] dVarArr2 = widget2.f۹۳۸۶z;
                    int i8 = this.f۹۲۸۴g0;
                    dVarArr2[i8].f۹۳۱۲i = target;
                    if (i8 == 0 || i8 == 2) {
                        system.m۱۱۰۴۶b(position.f۹۳۱۲i, target, hasMatchConstraintWidgets);
                    } else {
                        system.m۱۱۰۴۱a(position.f۹۳۱۲i, target, hasMatchConstraintWidgets);
                    }
                }
            }
            int i9 = this.f۹۲۸۴g0;
            if (i9 == 0) {
                system.m۱۱۰۳۱a(this.f۹۳۸۰t.f۹۳۱۲i, this.f۹۳۷۸r.f۹۳۱۲i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.m۱۱۰۳۱a(this.f۹۳۷۸r.f۹۳۱۲i, this.f۹۳۳۴C.f۹۳۸۰t.f۹۳۱۲i, 0, 5);
                }
            } else if (i9 == 1) {
                system.m۱۱۰۳۱a(this.f۹۳۷۸r.f۹۳۱۲i, this.f۹۳۸۰t.f۹۳۱۲i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.m۱۱۰۳۱a(this.f۹۳۷۸r.f۹۳۱۲i, this.f۹۳۳۴C.f۹۳۷۸r.f۹۳۱۲i, 0, 5);
                }
            } else if (i9 == 2) {
                system.m۱۱۰۳۱a(this.f۹۳۸۱u.f۹۳۱۲i, this.f۹۳۷۹s.f۹۳۱۲i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.m۱۱۰۳۱a(this.f۹۳۷۹s.f۹۳۱۲i, this.f۹۳۳۴C.f۹۳۸۱u.f۹۳۱۲i, 0, 5);
                }
            } else if (i9 == 3) {
                system.m۱۱۰۳۱a(this.f۹۳۷۹s.f۹۳۱۲i, this.f۹۳۸۱u.f۹۳۱۲i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.m۱۱۰۳۱a(this.f۹۳۷۹s.f۹۳۱۲i, this.f۹۳۳۴C.f۹۳۷۹s.f۹۳۱۲i, 0, 5);
                }
            }
        }
    }
}
