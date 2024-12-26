package android.support.constraint.p۲۰۰i.p۲۰۱j;

import android.support.constraint.p۲۰۰i.Ce;
import android.support.constraint.p۲۰۰i.Ci;
import android.support.constraint.p۲۰۰i.p۲۰۱j.Cd;

/* renamed from: android.support.constraint.i.j.k, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ck extends Cm {

    /* renamed from: c, reason: contains not printable characters */
    Cd f۹۴۱۸c;

    /* renamed from: d, reason: contains not printable characters */
    Ck f۹۴۱۹d;

    /* renamed from: e, reason: contains not printable characters */
    float f۹۴۲۰e;

    /* renamed from: f, reason: contains not printable characters */
    Ck f۹۴۲۱f;

    /* renamed from: g, reason: contains not printable characters */
    float f۹۴۲۲g;

    /* renamed from: i, reason: contains not printable characters */
    private Ck f۹۴۲۴i;

    /* renamed from: h, reason: contains not printable characters */
    int f۹۴۲۳h = 0;

    /* renamed from: j, reason: contains not printable characters */
    private Cl f۹۴۲۵j = null;

    /* renamed from: k, reason: contains not printable characters */
    private int f۹۴۲۶k = 1;

    /* renamed from: l, reason: contains not printable characters */
    private Cl f۹۴۲۷l = null;

    /* renamed from: m, reason: contains not printable characters */
    private int f۹۴۲۸m = 1;

    public Ck(Cd anchor) {
        this.f۹۴۱۸c = anchor;
    }

    public String toString() {
        if (this.f۹۴۳۱b == 1) {
            if (this.f۹۴۲۱f == this) {
                return "[" + this.f۹۴۱۸c + ", RESOLVED: " + this.f۹۴۲۲g + "]  type: " + m۹۱۴۱a(this.f۹۴۲۳h);
            }
            return "[" + this.f۹۴۱۸c + ", RESOLVED: " + this.f۹۴۲۱f + ":" + this.f۹۴۲۲g + "] type: " + m۹۱۴۱a(this.f۹۴۲۳h);
        }
        return "{ " + this.f۹۴۱۸c + " UNRESOLVED} type: " + m۹۱۴۱a(this.f۹۴۲۳h);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۹۱۴۴a(Ck target, float offset) {
        if (this.f۹۴۳۱b == 0 || (this.f۹۴۲۱f != target && this.f۹۴۲۲g != offset)) {
            this.f۹۴۲۱f = target;
            this.f۹۴۲۲g = offset;
            if (this.f۹۴۳۱b == 1) {
                m۹۱۵۹b();
            }
            m۹۱۵۷a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    String m۹۱۴۱a(int type) {
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

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Cm
    /* renamed from: e, reason: contains not printable characters */
    public void mo۹۱۶۲e() {
        Ck ck;
        Ck ck2;
        Ck ck3;
        Ck ck4;
        Ck ck5;
        Ck ck6;
        float distance;
        float distance2;
        float percent;
        Ck ck7;
        boolean isEndAnchor = true;
        if (this.f۹۴۳۱b == 1 || this.f۹۴۲۳h == 4) {
            return;
        }
        Cl cl = this.f۹۴۲۵j;
        if (cl != null) {
            if (cl.f۹۴۳۱b != 1) {
                return;
            } else {
                this.f۹۴۲۰e = this.f۹۴۲۶k * cl.f۹۴۲۹c;
            }
        }
        Cl cl2 = this.f۹۴۲۷l;
        if (cl2 != null) {
            if (cl2.f۹۴۳۱b != 1) {
                return;
            } else {
                float f2 = cl2.f۹۴۲۹c;
            }
        }
        if (this.f۹۴۲۳h == 1 && ((ck7 = this.f۹۴۱۹d) == null || ck7.f۹۴۳۱b == 1)) {
            Ck ck8 = this.f۹۴۱۹d;
            if (ck8 == null) {
                this.f۹۴۲۱f = this;
                this.f۹۴۲۲g = this.f۹۴۲۰e;
            } else {
                this.f۹۴۲۱f = ck8.f۹۴۲۱f;
                this.f۹۴۲۲g = ck8.f۹۴۲۲g + this.f۹۴۲۰e;
            }
            m۹۱۵۷a();
            return;
        }
        if (this.f۹۴۲۳h != 2 || (ck4 = this.f۹۴۱۹d) == null || ck4.f۹۴۳۱b != 1 || (ck5 = this.f۹۴۲۴i) == null || (ck6 = ck5.f۹۴۱۹d) == null || ck6.f۹۴۳۱b != 1) {
            if (this.f۹۴۲۳h == 3 && (ck = this.f۹۴۱۹d) != null && ck.f۹۴۳۱b == 1 && (ck2 = this.f۹۴۲۴i) != null && (ck3 = ck2.f۹۴۱۹d) != null && ck3.f۹۴۳۱b == 1) {
                if (Ce.m۸۹۶۰h() != null) {
                    Ce.m۸۹۶۰h().f۹۲۶۱w++;
                }
                Ck ck9 = this.f۹۴۱۹d;
                this.f۹۴۲۱f = ck9.f۹۴۲۱f;
                Ck ck10 = this.f۹۴۲۴i;
                Ck ck11 = ck10.f۹۴۱۹d;
                ck10.f۹۴۲۱f = ck11.f۹۴۲۱f;
                this.f۹۴۲۲g = ck9.f۹۴۲۲g + this.f۹۴۲۰e;
                ck10.f۹۴۲۲g = ck11.f۹۴۲۲g + ck10.f۹۴۲۰e;
                m۹۱۵۷a();
                this.f۹۴۲۴i.m۹۱۵۷a();
                return;
            }
            if (this.f۹۴۲۳h == 5) {
                this.f۹۴۱۸c.f۹۳۰۵b.mo۹۰۳۱E();
                return;
            }
            return;
        }
        if (Ce.m۸۹۶۰h() != null) {
            Ce.m۸۹۶۰h().f۹۲۶۰v++;
        }
        this.f۹۴۲۱f = this.f۹۴۱۹d.f۹۴۲۱f;
        Ck ck12 = this.f۹۴۲۴i;
        ck12.f۹۴۲۱f = ck12.f۹۴۱۹d.f۹۴۲۱f;
        Cd.d dVar = this.f۹۴۱۸c.f۹۳۰۶c;
        if (dVar != Cd.d.RIGHT && dVar != Cd.d.BOTTOM) {
            isEndAnchor = false;
        }
        if (isEndAnchor) {
            distance = this.f۹۴۱۹d.f۹۴۲۲g - this.f۹۴۲۴i.f۹۴۱۹d.f۹۴۲۲g;
        } else {
            distance = this.f۹۴۲۴i.f۹۴۱۹d.f۹۴۲۲g - this.f۹۴۱۹d.f۹۴۲۲g;
        }
        Cd.d dVar2 = this.f۹۴۱۸c.f۹۳۰۶c;
        if (dVar2 == Cd.d.LEFT || dVar2 == Cd.d.RIGHT) {
            distance2 = distance - this.f۹۴۱۸c.f۹۳۰۵b.m۹۰۹۵t();
            percent = this.f۹۴۱۸c.f۹۳۰۵b.f۹۳۵۰S;
        } else {
            distance2 = distance - r0.f۹۳۰۵b.m۹۰۷۷i();
            percent = this.f۹۴۱۸c.f۹۳۰۵b.f۹۳۵۱T;
        }
        int margin = this.f۹۴۱۸c.m۹۰۱۶b();
        int oppositeMargin = this.f۹۴۲۴i.f۹۴۱۸c.m۹۰۱۶b();
        if (this.f۹۴۱۸c.m۹۰۲۱g() == this.f۹۴۲۴i.f۹۴۱۸c.m۹۰۲۱g()) {
            percent = 0.5f;
            margin = 0;
            oppositeMargin = 0;
        }
        float distance3 = (distance2 - margin) - oppositeMargin;
        if (isEndAnchor) {
            Ck ck13 = this.f۹۴۲۴i;
            ck13.f۹۴۲۲g = ck13.f۹۴۱۹d.f۹۴۲۲g + oppositeMargin + (distance3 * percent);
            this.f۹۴۲۲g = (this.f۹۴۱۹d.f۹۴۲۲g - margin) - ((1.0f - percent) * distance3);
        } else {
            this.f۹۴۲۲g = this.f۹۴۱۹d.f۹۴۲۲g + margin + (distance3 * percent);
            Ck ck14 = this.f۹۴۲۴i;
            ck14.f۹۴۲۲g = (ck14.f۹۴۱۹d.f۹۴۲۲g - oppositeMargin) - ((1.0f - percent) * distance3);
        }
        m۹۱۵۷a();
        this.f۹۴۲۴i.m۹۱۵۷a();
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۹۱۴۷b(int type) {
        this.f۹۴۲۳h = type;
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Cm
    /* renamed from: d, reason: contains not printable characters */
    public void mo۹۱۶۱d() {
        super.mo۹۱۶۱d();
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

    /* renamed from: g, reason: contains not printable characters */
    public void m۹۱۵۳g() {
        Cd targetAnchor = this.f۹۴۱۸c.m۹۰۲۱g();
        if (targetAnchor == null) {
            return;
        }
        if (targetAnchor.m۹۰۲۱g() == this.f۹۴۱۸c) {
            this.f۹۴۲۳h = 4;
            targetAnchor.m۹۰۱۸d().f۹۴۲۳h = 4;
        }
        int margin = this.f۹۴۱۸c.m۹۰۱۶b();
        Cd.d dVar = this.f۹۴۱۸c.f۹۳۰۶c;
        if (dVar == Cd.d.RIGHT || dVar == Cd.d.BOTTOM) {
            margin = -margin;
        }
        m۹۱۴۵a(targetAnchor.m۹۰۱۸d(), margin);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۹۱۴۲a(int type, Ck node, int offset) {
        this.f۹۴۲۳h = type;
        this.f۹۴۱۹d = node;
        this.f۹۴۲۰e = offset;
        this.f۹۴۱۹d.m۹۱۵۸a(this);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۹۱۴۵a(Ck node, int offset) {
        this.f۹۴۱۹d = node;
        this.f۹۴۲۰e = offset;
        this.f۹۴۱۹d.m۹۱۵۸a(this);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۹۱۴۶a(Ck node, int multiplier, Cl dimension) {
        this.f۹۴۱۹d = node;
        this.f۹۴۱۹d.m۹۱۵۸a(this);
        this.f۹۴۲۵j = dimension;
        this.f۹۴۲۶k = multiplier;
        this.f۹۴۲۵j.m۹۱۵۸a(this);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۹۱۴۸b(Ck opposite, float oppositeOffset) {
        this.f۹۴۲۴i = opposite;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۹۱۴۹b(Ck opposite, int multiplier, Cl dimension) {
        this.f۹۴۲۴i = opposite;
        this.f۹۴۲۷l = dimension;
        this.f۹۴۲۸m = multiplier;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۹۱۴۳a(Ce system) {
        Ci sv = this.f۹۴۱۸c.m۹۰۱۹e();
        Ck ck = this.f۹۴۲۱f;
        if (ck == null) {
            system.m۸۹۷۰a(sv, (int) this.f۹۴۲۲g);
        } else {
            Ci v = system.m۸۹۶۶a(ck.f۹۴۱۸c);
            system.m۸۹۶۳a(sv, v, (int) this.f۹۴۲۲g, 6);
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    public float m۹۱۵۲f() {
        return this.f۹۴۲۲g;
    }
}
