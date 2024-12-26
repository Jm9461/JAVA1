package android.support.constraint.i.j;

import android.support.constraint.i.e;
import android.support.constraint.i.i;
import android.support.constraint.i.j.d;

public class k extends m {

    /* renamed from: c  reason: collision with root package name */
    d f۶۹۹c;

    /* renamed from: d  reason: collision with root package name */
    k f۷۰۰d;

    /* renamed from: e  reason: collision with root package name */
    float f۷۰۱e;

    /* renamed from: f  reason: collision with root package name */
    k f۷۰۲f;

    /* renamed from: g  reason: collision with root package name */
    float f۷۰۳g;

    /* renamed from: h  reason: collision with root package name */
    int f۷۰۴h = 0;
    private k i;
    private l j = null;
    private int k = 1;
    private l l = null;
    private int m = 1;

    public k(d anchor) {
        this.f۶۹۹c = anchor;
    }

    public String toString() {
        if (this.f۷۰۷b != 1) {
            return "{ " + this.f۶۹۹c + " UNRESOLVED} type: " + a(this.f۷۰۴h);
        } else if (this.f۷۰۲f == this) {
            return "[" + this.f۶۹۹c + ", RESOLVED: " + this.f۷۰۳g + "]  type: " + a(this.f۷۰۴h);
        } else {
            return "[" + this.f۶۹۹c + ", RESOLVED: " + this.f۷۰۲f + ":" + this.f۷۰۳g + "] type: " + a(this.f۷۰۴h);
        }
    }

    public void a(k target, float offset) {
        if (this.f۷۰۷b == 0 || !(this.f۷۰۲f == target || this.f۷۰۳g == offset)) {
            this.f۷۰۲f = target;
            this.f۷۰۳g = offset;
            if (this.f۷۰۷b == 1) {
                b();
            }
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public String a(int type) {
        if (type == 1) {
            return "DIRECT";
        }
        if (type == 2) {
            return "CENTER";
        }
        if (type == 3) {
            return "MATCH";
        }
        if (type == 4) {
            return "CHAIN";
        }
        if (type == 5) {
            return "BARRIER";
        }
        return "UNCONNECTED";
    }

    @Override // android.support.constraint.i.j.m
    public void e() {
        k kVar;
        k kVar2;
        k kVar3;
        k kVar4;
        k kVar5;
        k kVar6;
        float distance;
        float distance2;
        float percent;
        k kVar7;
        boolean isEndAnchor = true;
        if (this.f۷۰۷b != 1 && this.f۷۰۴h != 4) {
            l lVar = this.j;
            if (lVar != null) {
                if (lVar.f۷۰۷b == 1) {
                    this.f۷۰۱e = ((float) this.k) * lVar.f۷۰۵c;
                } else {
                    return;
                }
            }
            l lVar2 = this.l;
            if (lVar2 != null) {
                if (lVar2.f۷۰۷b == 1) {
                    float f2 = lVar2.f۷۰۵c;
                } else {
                    return;
                }
            }
            if (this.f۷۰۴h == 1 && ((kVar7 = this.f۷۰۰d) == null || kVar7.f۷۰۷b == 1)) {
                k kVar8 = this.f۷۰۰d;
                if (kVar8 == null) {
                    this.f۷۰۲f = this;
                    this.f۷۰۳g = this.f۷۰۱e;
                } else {
                    this.f۷۰۲f = kVar8.f۷۰۲f;
                    this.f۷۰۳g = kVar8.f۷۰۳g + this.f۷۰۱e;
                }
                a();
            } else if (this.f۷۰۴h == 2 && (kVar4 = this.f۷۰۰d) != null && kVar4.f۷۰۷b == 1 && (kVar5 = this.i) != null && (kVar6 = kVar5.f۷۰۰d) != null && kVar6.f۷۰۷b == 1) {
                if (e.h() != null) {
                    e.h().v++;
                }
                this.f۷۰۲f = this.f۷۰۰d.f۷۰۲f;
                k kVar9 = this.i;
                kVar9.f۷۰۲f = kVar9.f۷۰۰d.f۷۰۲f;
                d.EnumC۰۰۲۲d dVar = this.f۶۹۹c.f۶۶۲c;
                if (!(dVar == d.EnumC۰۰۲۲d.RIGHT || dVar == d.EnumC۰۰۲۲d.BOTTOM)) {
                    isEndAnchor = false;
                }
                if (isEndAnchor) {
                    distance = this.f۷۰۰d.f۷۰۳g - this.i.f۷۰۰d.f۷۰۳g;
                } else {
                    distance = this.i.f۷۰۰d.f۷۰۳g - this.f۷۰۰d.f۷۰۳g;
                }
                d dVar2 = this.f۶۹۹c;
                d.EnumC۰۰۲۲d dVar3 = dVar2.f۶۶۲c;
                if (dVar3 == d.EnumC۰۰۲۲d.LEFT || dVar3 == d.EnumC۰۰۲۲d.RIGHT) {
                    distance2 = distance - ((float) this.f۶۹۹c.f۶۶۱b.t());
                    percent = this.f۶۹۹c.f۶۶۱b.S;
                } else {
                    distance2 = distance - ((float) dVar2.f۶۶۱b.i());
                    percent = this.f۶۹۹c.f۶۶۱b.T;
                }
                int margin = this.f۶۹۹c.b();
                int oppositeMargin = this.i.f۶۹۹c.b();
                if (this.f۶۹۹c.g() == this.i.f۶۹۹c.g()) {
                    percent = 0.5f;
                    margin = 0;
                    oppositeMargin = 0;
                }
                float distance3 = (distance2 - ((float) margin)) - ((float) oppositeMargin);
                if (isEndAnchor) {
                    k kVar10 = this.i;
                    kVar10.f۷۰۳g = kVar10.f۷۰۰d.f۷۰۳g + ((float) oppositeMargin) + (distance3 * percent);
                    this.f۷۰۳g = (this.f۷۰۰d.f۷۰۳g - ((float) margin)) - ((1.0f - percent) * distance3);
                } else {
                    this.f۷۰۳g = this.f۷۰۰d.f۷۰۳g + ((float) margin) + (distance3 * percent);
                    k kVar11 = this.i;
                    kVar11.f۷۰۳g = (kVar11.f۷۰۰d.f۷۰۳g - ((float) oppositeMargin)) - ((1.0f - percent) * distance3);
                }
                a();
                this.i.a();
            } else if (this.f۷۰۴h == 3 && (kVar = this.f۷۰۰d) != null && kVar.f۷۰۷b == 1 && (kVar2 = this.i) != null && (kVar3 = kVar2.f۷۰۰d) != null && kVar3.f۷۰۷b == 1) {
                if (e.h() != null) {
                    e.h().w++;
                }
                k kVar12 = this.f۷۰۰d;
                this.f۷۰۲f = kVar12.f۷۰۲f;
                k kVar13 = this.i;
                k kVar14 = kVar13.f۷۰۰d;
                kVar13.f۷۰۲f = kVar14.f۷۰۲f;
                this.f۷۰۳g = kVar12.f۷۰۳g + this.f۷۰۱e;
                kVar13.f۷۰۳g = kVar14.f۷۰۳g + kVar13.f۷۰۱e;
                a();
                this.i.a();
            } else if (this.f۷۰۴h == 5) {
                this.f۶۹۹c.f۶۶۱b.E();
            }
        }
    }

    public void b(int type) {
        this.f۷۰۴h = type;
    }

    @Override // android.support.constraint.i.j.m
    public void d() {
        super.d();
        this.f۷۰۰d = null;
        this.f۷۰۱e = 0.0f;
        this.j = null;
        this.k = 1;
        this.l = null;
        this.m = 1;
        this.f۷۰۲f = null;
        this.f۷۰۳g = 0.0f;
        this.i = null;
        this.f۷۰۴h = 0;
    }

    public void g() {
        d targetAnchor = this.f۶۹۹c.g();
        if (targetAnchor != null) {
            if (targetAnchor.g() == this.f۶۹۹c) {
                this.f۷۰۴h = 4;
                targetAnchor.d().f۷۰۴h = 4;
            }
            int margin = this.f۶۹۹c.b();
            d.EnumC۰۰۲۲d dVar = this.f۶۹۹c.f۶۶۲c;
            if (dVar == d.EnumC۰۰۲۲d.RIGHT || dVar == d.EnumC۰۰۲۲d.BOTTOM) {
                margin = -margin;
            }
            a(targetAnchor.d(), margin);
        }
    }

    public void a(int type, k node, int offset) {
        this.f۷۰۴h = type;
        this.f۷۰۰d = node;
        this.f۷۰۱e = (float) offset;
        this.f۷۰۰d.a(this);
    }

    public void a(k node, int offset) {
        this.f۷۰۰d = node;
        this.f۷۰۱e = (float) offset;
        this.f۷۰۰d.a(this);
    }

    public void a(k node, int multiplier, l dimension) {
        this.f۷۰۰d = node;
        this.f۷۰۰d.a(this);
        this.j = dimension;
        this.k = multiplier;
        this.j.a(this);
    }

    public void b(k opposite, float oppositeOffset) {
        this.i = opposite;
    }

    public void b(k opposite, int multiplier, l dimension) {
        this.i = opposite;
        this.l = dimension;
        this.m = multiplier;
    }

    /* access modifiers changed from: package-private */
    public void a(e system) {
        i sv = this.f۶۹۹c.e();
        k kVar = this.f۷۰۲f;
        if (kVar == null) {
            system.a(sv, (int) this.f۷۰۳g);
        } else {
            system.a(sv, system.a(kVar.f۶۹۹c), (int) this.f۷۰۳g, 6);
        }
    }

    public float f() {
        return this.f۷۰۳g;
    }
}
