package android.support.constraint.p۰۴۱i.p۰۴۲j;

import android.support.constraint.p۰۴۱i.Ce;
import android.support.constraint.p۰۴۱i.Ci;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Cd;

/* renamed from: android.support.constraint.i.j.k  reason: invalid class name */
public class Ck extends Cm {

    /* renamed from: c  reason: contains not printable characters */
    Cd f۹۴۱۸c;

    /* renamed from: d  reason: contains not printable characters */
    Ck f۹۴۱۹d;

    /* renamed from: e  reason: contains not printable characters */
    float f۹۴۲۰e;

    /* renamed from: f  reason: contains not printable characters */
    Ck f۹۴۲۱f;

    /* renamed from: g  reason: contains not printable characters */
    float f۹۴۲۲g;

    /* renamed from: h  reason: contains not printable characters */
    int f۹۴۲۳h = 0;

    /* renamed from: i  reason: contains not printable characters */
    private Ck f۹۴۲۴i;

    /* renamed from: j  reason: contains not printable characters */
    private Cl f۹۴۲۵j = null;

    /* renamed from: k  reason: contains not printable characters */
    private int f۹۴۲۶k = 1;

    /* renamed from: l  reason: contains not printable characters */
    private Cl f۹۴۲۷l = null;

    /* renamed from: m  reason: contains not printable characters */
    private int f۹۴۲۸m = 1;

    public Ck(Cd anchor) {
        this.f۹۴۱۸c = anchor;
    }

    public String toString() {
        if (this.f۹۴۳۱b != 1) {
            return "{ " + this.f۹۴۱۸c + " UNRESOLVED} type: " + m۱۱۲۰۹a(this.f۹۴۲۳h);
        } else if (this.f۹۴۲۱f == this) {
            return "[" + this.f۹۴۱۸c + ", RESOLVED: " + this.f۹۴۲۲g + "]  type: " + m۱۱۲۰۹a(this.f۹۴۲۳h);
        } else {
            return "[" + this.f۹۴۱۸c + ", RESOLVED: " + this.f۹۴۲۱f + ":" + this.f۹۴۲۲g + "] type: " + m۱۱۲۰۹a(this.f۹۴۲۳h);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۱۲a(Ck target, float offset) {
        if (this.f۹۴۳۱b == 0 || !(this.f۹۴۲۱f == target || this.f۹۴۲۲g == offset)) {
            this.f۹۴۲۱f = target;
            this.f۹۴۲۲g = offset;
            if (this.f۹۴۳۱b == 1) {
                m۱۱۲۲۷b();
            }
            m۱۱۲۲۵a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public String m۱۱۲۰۹a(int type) {
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

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Cm
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۱۲۱۹e() {
        Ck kVar;
        Ck kVar2;
        Ck kVar3;
        Ck kVar4;
        Ck kVar5;
        Ck kVar6;
        float distance;
        float distance2;
        float percent;
        Ck kVar7;
        boolean isEndAnchor = true;
        if (this.f۹۴۳۱b != 1 && this.f۹۴۲۳h != 4) {
            Cl lVar = this.f۹۴۲۵j;
            if (lVar != null) {
                if (lVar.f۹۴۳۱b == 1) {
                    this.f۹۴۲۰e = ((float) this.f۹۴۲۶k) * lVar.f۹۴۲۹c;
                } else {
                    return;
                }
            }
            Cl lVar2 = this.f۹۴۲۷l;
            if (lVar2 != null) {
                if (lVar2.f۹۴۳۱b == 1) {
                    float f = lVar2.f۹۴۲۹c;
                } else {
                    return;
                }
            }
            if (this.f۹۴۲۳h == 1 && ((kVar7 = this.f۹۴۱۹d) == null || kVar7.f۹۴۳۱b == 1)) {
                Ck kVar8 = this.f۹۴۱۹d;
                if (kVar8 == null) {
                    this.f۹۴۲۱f = this;
                    this.f۹۴۲۲g = this.f۹۴۲۰e;
                } else {
                    this.f۹۴۲۱f = kVar8.f۹۴۲۱f;
                    this.f۹۴۲۲g = kVar8.f۹۴۲۲g + this.f۹۴۲۰e;
                }
                m۱۱۲۲۵a();
            } else if (this.f۹۴۲۳h == 2 && (kVar4 = this.f۹۴۱۹d) != null && kVar4.f۹۴۳۱b == 1 && (kVar5 = this.f۹۴۲۴i) != null && (kVar6 = kVar5.f۹۴۱۹d) != null && kVar6.f۹۴۳۱b == 1) {
                if (Ce.m۱۱۰۲۸h() != null) {
                    Ce.m۱۱۰۲۸h().f۹۲۶۰v++;
                }
                this.f۹۴۲۱f = this.f۹۴۱۹d.f۹۴۲۱f;
                Ck kVar9 = this.f۹۴۲۴i;
                kVar9.f۹۴۲۱f = kVar9.f۹۴۱۹d.f۹۴۲۱f;
                Cd.EnumCd dVar = this.f۹۴۱۸c.f۹۳۰۶c;
                if (!(dVar == Cd.EnumCd.RIGHT || dVar == Cd.EnumCd.BOTTOM)) {
                    isEndAnchor = false;
                }
                if (isEndAnchor) {
                    distance = this.f۹۴۱۹d.f۹۴۲۲g - this.f۹۴۲۴i.f۹۴۱۹d.f۹۴۲۲g;
                } else {
                    distance = this.f۹۴۲۴i.f۹۴۱۹d.f۹۴۲۲g - this.f۹۴۱۹d.f۹۴۲۲g;
                }
                Cd dVar2 = this.f۹۴۱۸c;
                Cd.EnumCd dVar3 = dVar2.f۹۳۰۶c;
                if (dVar3 == Cd.EnumCd.LEFT || dVar3 == Cd.EnumCd.RIGHT) {
                    distance2 = distance - ((float) this.f۹۴۱۸c.f۹۳۰۵b.m۱۱۱۶۳t());
                    percent = this.f۹۴۱۸c.f۹۳۰۵b.f۹۳۵۰S;
                } else {
                    distance2 = distance - ((float) dVar2.f۹۳۰۵b.m۱۱۱۴۵i());
                    percent = this.f۹۴۱۸c.f۹۳۰۵b.f۹۳۵۱T;
                }
                int margin = this.f۹۴۱۸c.m۱۱۰۸۴b();
                int oppositeMargin = this.f۹۴۲۴i.f۹۴۱۸c.m۱۱۰۸۴b();
                if (this.f۹۴۱۸c.m۱۱۰۸۹g() == this.f۹۴۲۴i.f۹۴۱۸c.m۱۱۰۸۹g()) {
                    percent = 0.5f;
                    margin = 0;
                    oppositeMargin = 0;
                }
                float distance3 = (distance2 - ((float) margin)) - ((float) oppositeMargin);
                if (isEndAnchor) {
                    Ck kVar10 = this.f۹۴۲۴i;
                    kVar10.f۹۴۲۲g = kVar10.f۹۴۱۹d.f۹۴۲۲g + ((float) oppositeMargin) + (distance3 * percent);
                    this.f۹۴۲۲g = (this.f۹۴۱۹d.f۹۴۲۲g - ((float) margin)) - ((1.0f - percent) * distance3);
                } else {
                    this.f۹۴۲۲g = this.f۹۴۱۹d.f۹۴۲۲g + ((float) margin) + (distance3 * percent);
                    Ck kVar11 = this.f۹۴۲۴i;
                    kVar11.f۹۴۲۲g = (kVar11.f۹۴۱۹d.f۹۴۲۲g - ((float) oppositeMargin)) - ((1.0f - percent) * distance3);
                }
                m۱۱۲۲۵a();
                this.f۹۴۲۴i.m۱۱۲۲۵a();
            } else if (this.f۹۴۲۳h == 3 && (kVar = this.f۹۴۱۹d) != null && kVar.f۹۴۳۱b == 1 && (kVar2 = this.f۹۴۲۴i) != null && (kVar3 = kVar2.f۹۴۱۹d) != null && kVar3.f۹۴۳۱b == 1) {
                if (Ce.m۱۱۰۲۸h() != null) {
                    Ce.m۱۱۰۲۸h().f۹۲۶۱w++;
                }
                Ck kVar12 = this.f۹۴۱۹d;
                this.f۹۴۲۱f = kVar12.f۹۴۲۱f;
                Ck kVar13 = this.f۹۴۲۴i;
                Ck kVar14 = kVar13.f۹۴۱۹d;
                kVar13.f۹۴۲۱f = kVar14.f۹۴۲۱f;
                this.f۹۴۲۲g = kVar12.f۹۴۲۲g + this.f۹۴۲۰e;
                kVar13.f۹۴۲۲g = kVar14.f۹۴۲۲g + kVar13.f۹۴۲۰e;
                m۱۱۲۲۵a();
                this.f۹۴۲۴i.m۱۱۲۲۵a();
            } else if (this.f۹۴۲۳h == 5) {
                this.f۹۴۱۸c.f۹۳۰۵b.m۱۱۰۹۹E();
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۲۱۵b(int type) {
        this.f۹۴۲۳h = type;
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Cm
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۱۲۱۸d() {
        super.m۱۱۲۲۹d();
        this.f۹۴۱۹d = null;
        this.f۹۴۲۰e = 0.0f;
        this.f۹۴۲۵j = null;
        this.f۹۴۲۶k = 1;
        this.f۹۴۲۷l = null;
        this.f۹۴۲۸m = 1;
        this.f۹۴۲۱f = null;
        this.f۹۴۲۲g = 0.0f;
        this.f۹۴۲۴i = null;
        this.f۹۴۲۳h = 0;
    }

    /* renamed from: g  reason: contains not printable characters */
    public void m۱۱۲۲۱g() {
        Cd targetAnchor = this.f۹۴۱۸c.m۱۱۰۸۹g();
        if (targetAnchor != null) {
            if (targetAnchor.m۱۱۰۸۹g() == this.f۹۴۱۸c) {
                this.f۹۴۲۳h = 4;
                targetAnchor.m۱۱۰۸۶d().f۹۴۲۳h = 4;
            }
            int margin = this.f۹۴۱۸c.m۱۱۰۸۴b();
            Cd.EnumCd dVar = this.f۹۴۱۸c.f۹۳۰۶c;
            if (dVar == Cd.EnumCd.RIGHT || dVar == Cd.EnumCd.BOTTOM) {
                margin = -margin;
            }
            m۱۱۲۱۳a(targetAnchor.m۱۱۰۸۶d(), margin);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۱۰a(int type, Ck node, int offset) {
        this.f۹۴۲۳h = type;
        this.f۹۴۱۹d = node;
        this.f۹۴۲۰e = (float) offset;
        this.f۹۴۱۹d.m۱۱۲۲۶a(this);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۱۳a(Ck node, int offset) {
        this.f۹۴۱۹d = node;
        this.f۹۴۲۰e = (float) offset;
        this.f۹۴۱۹d.m۱۱۲۲۶a(this);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۱۴a(Ck node, int multiplier, Cl dimension) {
        this.f۹۴۱۹d = node;
        this.f۹۴۱۹d.m۱۱۲۲۶a(this);
        this.f۹۴۲۵j = dimension;
        this.f۹۴۲۶k = multiplier;
        this.f۹۴۲۵j.m۱۱۲۲۶a(this);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۲۱۶b(Ck opposite, float oppositeOffset) {
        this.f۹۴۲۴i = opposite;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۲۱۷b(Ck opposite, int multiplier, Cl dimension) {
        this.f۹۴۲۴i = opposite;
        this.f۹۴۲۷l = dimension;
        this.f۹۴۲۸m = multiplier;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۱۱a(Ce system) {
        Ci sv = this.f۹۴۱۸c.m۱۱۰۸۷e();
        Ck kVar = this.f۹۴۲۱f;
        if (kVar == null) {
            system.m۱۱۰۳۸a(sv, (int) this.f۹۴۲۲g);
        } else {
            system.m۱۱۰۳۱a(sv, system.m۱۱۰۳۴a(kVar.f۹۴۱۸c), (int) this.f۹۴۲۲g, 6);
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public float m۱۱۲۲۰f() {
        return this.f۹۴۲۲g;
    }
}
