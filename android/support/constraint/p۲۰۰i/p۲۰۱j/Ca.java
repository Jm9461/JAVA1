package android.support.constraint.p۲۰۰i.p۲۰۱j;

import android.support.constraint.p۲۰۰i.Ce;
import android.support.constraint.p۲۰۰i.Ci;
import android.support.constraint.p۲۰۰i.p۲۰۱j.Ce;
import java.util.ArrayList;

/* renamed from: android.support.constraint.i.j.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends Ch {

    /* renamed from: g0, reason: contains not printable characters */
    private int f۹۲۸۴g0 = 0;

    /* renamed from: h0, reason: contains not printable characters */
    private ArrayList<Ck> f۹۲۸۵h0 = new ArrayList<>(4);

    /* renamed from: i0, reason: contains not printable characters */
    private boolean f۹۲۸۶i0 = true;

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۹۱۲۸a() {
        return true;
    }

    /* renamed from: p, reason: contains not printable characters */
    public void m۹۰۰۵p(int barrierType) {
        this.f۹۲۸۴g0 = barrierType;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۹۰۰۴c(boolean allowsGoneWidget) {
        this.f۹۲۸۶i0 = allowsGoneWidget;
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: D, reason: contains not printable characters */
    public void mo۹۰۳۰D() {
        super.mo۹۰۳۰D();
        this.f۹۲۸۵h0.clear();
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: a, reason: contains not printable characters */
    public void mo۹۱۲۶a(int optimizationLevel) {
        Ck node;
        Ce ce = this.f۹۳۳۴C;
        if (ce == null || !((Cf) ce).m۹۱۲۲p(2)) {
            return;
        }
        int i = this.f۹۲۸۴g0;
        if (i == 0) {
            node = this.f۹۳۷۸r.m۹۰۱۸d();
        } else if (i == 1) {
            node = this.f۹۳۸۰t.m۹۰۱۸d();
        } else if (i == 2) {
            node = this.f۹۳۷۹s.m۹۰۱۸d();
        } else if (i == 3) {
            node = this.f۹۳۸۱u.m۹۰۱۸d();
        } else {
            return;
        }
        node.m۹۱۴۷b(5);
        int i2 = this.f۹۲۸۴g0;
        if (i2 == 0 || i2 == 1) {
            this.f۹۳۷۹s.m۹۰۱۸d().m۹۱۴۴a((Ck) null, 0.0f);
            this.f۹۳۸۱u.m۹۰۱۸d().m۹۱۴۴a((Ck) null, 0.0f);
        } else {
            this.f۹۳۷۸r.m۹۰۱۸d().m۹۱۴۴a((Ck) null, 0.0f);
            this.f۹۳۸۰t.m۹۰۱۸d().m۹۱۴۴a((Ck) null, 0.0f);
        }
        this.f۹۲۸۵h0.clear();
        for (int i3 = 0; i3 < this.f۹۴۱۶f0; i3++) {
            Ce widget = this.f۹۴۱۵e0[i3];
            if (this.f۹۲۸۶i0 || widget.mo۹۱۲۸a()) {
                Ck depends = null;
                int i4 = this.f۹۲۸۴g0;
                if (i4 == 0) {
                    depends = widget.f۹۳۷۸r.m۹۰۱۸d();
                } else if (i4 == 1) {
                    depends = widget.f۹۳۸۰t.m۹۰۱۸d();
                } else if (i4 == 2) {
                    depends = widget.f۹۳۷۹s.m۹۰۱۸d();
                } else if (i4 == 3) {
                    depends = widget.f۹۳۸۱u.m۹۰۱۸d();
                }
                if (depends != null) {
                    this.f۹۲۸۵h0.add(depends);
                    depends.m۹۱۵۸a(node);
                }
            }
        }
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: E, reason: contains not printable characters */
    public void mo۹۰۳۱E() {
        Ck node;
        float value = 0.0f;
        int i = this.f۹۲۸۴g0;
        if (i == 0) {
            node = this.f۹۳۷۸r.m۹۰۱۸d();
            value = Float.MAX_VALUE;
        } else if (i == 1) {
            node = this.f۹۳۸۰t.m۹۰۱۸d();
        } else if (i == 2) {
            node = this.f۹۳۷۹s.m۹۰۱۸d();
            value = Float.MAX_VALUE;
        } else if (i == 3) {
            node = this.f۹۳۸۱u.m۹۰۱۸d();
        } else {
            return;
        }
        int count = this.f۹۲۸۵h0.size();
        Ck resolvedTarget = null;
        for (int i2 = 0; i2 < count; i2++) {
            Ck n = this.f۹۲۸۵h0.get(i2);
            if (n.f۹۴۳۱b != 1) {
                return;
            }
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
        }
        if (Ce.m۸۹۶۰h() != null) {
            Ce.m۸۹۶۰h().f۹۲۶۳y++;
        }
        node.f۹۴۲۱f = resolvedTarget;
        node.f۹۴۲۲g = value;
        node.m۹۱۵۷a();
        int i4 = this.f۹۲۸۴g0;
        if (i4 == 0) {
            this.f۹۳۸۰t.m۹۰۱۸d().m۹۱۴۴a(resolvedTarget, value);
            return;
        }
        if (i4 == 1) {
            this.f۹۳۷۸r.m۹۰۱۸d().m۹۱۴۴a(resolvedTarget, value);
        } else if (i4 == 2) {
            this.f۹۳۸۱u.m۹۰۱۸d().m۹۱۴۴a(resolvedTarget, value);
        } else if (i4 == 3) {
            this.f۹۳۷۹s.m۹۰۱۸d().m۹۱۴۴a(resolvedTarget, value);
        }
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: a, reason: contains not printable characters */
    public void mo۹۱۲۷a(Ce system) {
        Cd[] cdArr;
        Cd[] cdArr2 = this.f۹۳۸۶z;
        cdArr2[0] = this.f۹۳۷۸r;
        cdArr2[2] = this.f۹۳۷۹s;
        cdArr2[1] = this.f۹۳۸۰t;
        cdArr2[3] = this.f۹۳۸۱u;
        int i = 0;
        while (true) {
            cdArr = this.f۹۳۸۶z;
            if (i >= cdArr.length) {
                break;
            }
            cdArr[i].f۹۳۱۲i = system.m۸۹۶۶a(cdArr[i]);
            i++;
        }
        int i2 = this.f۹۲۸۴g0;
        if (i2 >= 0 && i2 < 4) {
            Cd position = cdArr[i2];
            boolean hasMatchConstraintWidgets = false;
            int i3 = 0;
            while (true) {
                if (i3 >= this.f۹۴۱۶f0) {
                    break;
                }
                Ce widget = this.f۹۴۱۵e0[i3];
                if (this.f۹۲۸۶i0 || widget.mo۹۱۲۸a()) {
                    int i4 = this.f۹۲۸۴g0;
                    if ((i4 == 0 || i4 == 1) && widget.m۹۰۸۱k() == Ce.b.MATCH_CONSTRAINT) {
                        hasMatchConstraintWidgets = true;
                        break;
                    }
                    int i5 = this.f۹۲۸۴g0;
                    if ((i5 == 2 || i5 == 3) && widget.m۹۰۹۳r() == Ce.b.MATCH_CONSTRAINT) {
                        hasMatchConstraintWidgets = true;
                        break;
                    }
                }
                i3++;
            }
            int i6 = this.f۹۲۸۴g0;
            if (i6 == 0 || i6 == 1) {
                if (m۹۰۸۳l().m۹۰۸۱k() == Ce.b.WRAP_CONTENT) {
                    hasMatchConstraintWidgets = false;
                }
            } else if (m۹۰۸۳l().m۹۰۹۳r() == Ce.b.WRAP_CONTENT) {
                hasMatchConstraintWidgets = false;
            }
            for (int i7 = 0; i7 < this.f۹۴۱۶f0; i7++) {
                Ce widget2 = this.f۹۴۱۵e0[i7];
                if (this.f۹۲۸۶i0 || widget2.mo۹۱۲۸a()) {
                    Ci target = system.m۸۹۶۶a(widget2.f۹۳۸۶z[this.f۹۲۸۴g0]);
                    Cd[] cdArr3 = widget2.f۹۳۸۶z;
                    int i8 = this.f۹۲۸۴g0;
                    cdArr3[i8].f۹۳۱۲i = target;
                    if (i8 == 0 || i8 == 2) {
                        system.m۸۹۷۸b(position.f۹۳۱۲i, target, hasMatchConstraintWidgets);
                    } else {
                        system.m۸۹۷۳a(position.f۹۳۱۲i, target, hasMatchConstraintWidgets);
                    }
                }
            }
            int i9 = this.f۹۲۸۴g0;
            if (i9 == 0) {
                system.m۸۹۶۳a(this.f۹۳۸۰t.f۹۳۱۲i, this.f۹۳۷۸r.f۹۳۱۲i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.m۸۹۶۳a(this.f۹۳۷۸r.f۹۳۱۲i, this.f۹۳۳۴C.f۹۳۸۰t.f۹۳۱۲i, 0, 5);
                    return;
                }
                return;
            }
            if (i9 == 1) {
                system.m۸۹۶۳a(this.f۹۳۷۸r.f۹۳۱۲i, this.f۹۳۸۰t.f۹۳۱۲i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.m۸۹۶۳a(this.f۹۳۷۸r.f۹۳۱۲i, this.f۹۳۳۴C.f۹۳۷۸r.f۹۳۱۲i, 0, 5);
                    return;
                }
                return;
            }
            if (i9 == 2) {
                system.m۸۹۶۳a(this.f۹۳۸۱u.f۹۳۱۲i, this.f۹۳۷۹s.f۹۳۱۲i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.m۸۹۶۳a(this.f۹۳۷۹s.f۹۳۱۲i, this.f۹۳۳۴C.f۹۳۸۱u.f۹۳۱۲i, 0, 5);
                    return;
                }
                return;
            }
            if (i9 == 3) {
                system.m۸۹۶۳a(this.f۹۳۷۹s.f۹۳۱۲i, this.f۹۳۸۱u.f۹۳۱۲i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.m۸۹۶۳a(this.f۹۳۷۹s.f۹۳۱۲i, this.f۹۳۳۴C.f۹۳۷۹s.f۹۳۱۲i, 0, 5);
                }
            }
        }
    }
}
