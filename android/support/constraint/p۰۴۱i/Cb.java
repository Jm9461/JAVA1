package android.support.constraint.p۰۴۱i;

import android.support.constraint.p۰۴۱i.Ce;
import android.support.constraint.p۰۴۱i.Ci;

/* renamed from: android.support.constraint.i.b  reason: invalid class name */
public class Cb implements Ce.AbstractCa {

    /* renamed from: a  reason: contains not printable characters */
    Ci f۹۲۱۳a = null;

    /* renamed from: b  reason: contains not printable characters */
    float f۹۲۱۴b = 0.0f;

    /* renamed from: c  reason: contains not printable characters */
    boolean f۹۲۱۵c;

    /* renamed from: d  reason: contains not printable characters */
    public final Ca f۹۲۱۶d;

    /* renamed from: e  reason: contains not printable characters */
    boolean f۹۲۱۷e = false;

    public Cb(Cc cache) {
        this.f۹۲۱۶d = new Ca(this, cache);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۰۱۱b() {
        Ci iVar = this.f۹۲۱۳a;
        return iVar != null && (iVar.f۹۲۷۴g == Ci.EnumCa.UNRESTRICTED || this.f۹۲۱۴b >= 0.0f);
    }

    public String toString() {
        return m۱۱۰۱۸e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public String m۱۱۰۱۸e() {
        String s = (this.f۹۲۱۳a == null ? "" + "0" : "" + this.f۹۲۱۳a) + " = ";
        boolean addedVariable = false;
        if (this.f۹۲۱۴b != 0.0f) {
            s = s + this.f۹۲۱۴b;
            addedVariable = true;
        }
        int count = this.f۹۲۱۶d.f۹۲۰۲a;
        for (int i = 0; i < count; i++) {
            Ci v = this.f۹۲۱۶d.m۱۰۹۸۲a(i);
            if (v != null) {
                float amount = this.f۹۲۱۶d.m۱۰۹۹۲b(i);
                if (amount != 0.0f) {
                    String name = v.toString();
                    if (!addedVariable) {
                        if (amount < 0.0f) {
                            s = s + "- ";
                            amount *= -1.0f;
                        }
                    } else if (amount > 0.0f) {
                        s = s + " + ";
                    } else {
                        s = s + " - ";
                        amount *= -1.0f;
                    }
                    s = amount == 1.0f ? s + name : s + amount + " " + name;
                    addedVariable = true;
                }
            }
        }
        if (addedVariable) {
            return s;
        }
        return s + "0.0";
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۱۰۱۶d() {
        this.f۹۲۱۳a = null;
        this.f۹۲۱۶d.m۱۰۹۸۵a();
        this.f۹۲۱۴b = 0.0f;
        this.f۹۲۱۷e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۰۱۲b(Ci v) {
        return this.f۹۲۱۶d.m۱۰۹۹۱a(v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public Cb m۱۱۰۰۸b(Ci variable, int value) {
        this.f۹۲۱۳a = variable;
        variable.f۹۲۷۲e = (float) value;
        this.f۹۲۱۴b = (float) value;
        this.f۹۲۱۷e = true;
        return this;
    }

    /* renamed from: c  reason: contains not printable characters */
    public Cb m۱۱۰۱۳c(Ci variable, int value) {
        if (value < 0) {
            this.f۹۲۱۴b = (float) (value * -1);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variable, 1.0f);
        } else {
            this.f۹۲۱۴b = (float) value;
            this.f۹۲۱۶d.m۱۰۹۸۹a(variable, -1.0f);
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۰۹۹۸a(Ci variableA, Ci variableB, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f۹۲۱۴b = (float) m;
        }
        if (!inverse) {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableA, -1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableB, 1.0f);
        } else {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableA, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableB, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۰۹۹۷a(Ci error, int sign) {
        this.f۹۲۱۶d.m۱۰۹۸۹a(error, (float) sign);
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۱۰۰۱a(Ci variableA, Ci variableB, Ci slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f۹۲۱۴b = (float) m;
        }
        if (!inverse) {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableA, -1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableB, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(slack, 1.0f);
        } else {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableA, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableB, -1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(slack, -1.0f);
        }
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cb m۱۱۰۰۹b(Ci variableA, Ci variableB, Ci slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f۹۲۱۴b = (float) m;
        }
        if (!inverse) {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableA, -1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableB, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(slack, -1.0f);
        } else {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableA, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableB, -1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(slack, 1.0f);
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۰۹۹۵a(float currentWeight, float totalWeights, float nextWeight, Ci variableStartA, Ci variableEndA, Ci variableStartB, Ci variableEndB) {
        this.f۹۲۱۴b = 0.0f;
        if (totalWeights == 0.0f || currentWeight == nextWeight) {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableStartA, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableEndA, -1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableEndB, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableStartB, -1.0f);
        } else if (currentWeight == 0.0f) {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableStartA, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableEndA, -1.0f);
        } else if (nextWeight == 0.0f) {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableStartB, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableEndB, -1.0f);
        } else {
            float w = (currentWeight / totalWeights) / (nextWeight / totalWeights);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableStartA, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableEndA, -1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableEndB, w);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableStartB, -w);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۰۹۹۹a(Ci variableA, Ci variableB, int marginA, float bias, Ci variableC, Ci variableD, int marginB) {
        if (variableB == variableC) {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableA, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableD, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableB, -2.0f);
            return this;
        }
        if (bias == 0.5f) {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableA, 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableB, -1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableC, -1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableD, 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f۹۲۱۴b = (float) ((-marginA) + marginB);
            }
        } else if (bias <= 0.0f) {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableA, -1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableB, 1.0f);
            this.f۹۲۱۴b = (float) marginA;
        } else if (bias >= 1.0f) {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableC, -1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableD, 1.0f);
            this.f۹۲۱۴b = (float) marginB;
        } else {
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableA, (1.0f - bias) * 1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableB, (1.0f - bias) * -1.0f);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableC, -1.0f * bias);
            this.f۹۲۱۶d.m۱۰۹۸۹a(variableD, bias * 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f۹۲۱۴b = (((float) (-marginA)) * (1.0f - bias)) + (((float) marginB) * bias);
            }
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۰۹۹۶a(Ce system, int strength) {
        this.f۹۲۱۶d.m۱۰۹۸۹a(system.m۱۱۰۳۳a(strength, "ep"), 1.0f);
        this.f۹۲۱۶d.m۱۰۹۸۹a(system.m۱۱۰۳۳a(strength, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۱۰۰۰a(Ci variableA, Ci variableB, Ci variableC, float percent) {
        this.f۹۲۱۶d.m۱۰۹۸۹a(variableA, -1.0f);
        this.f۹۲۱۶d.m۱۰۹۸۹a(variableB, 1.0f - percent);
        this.f۹۲۱۶d.m۱۰۹۸۹a(variableC, percent);
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۱۰۰۲a(Ci variableA, Ci variableB, Ci variableC, Ci variableD, float ratio) {
        this.f۹۲۱۶d.m۱۰۹۸۹a(variableA, -1.0f);
        this.f۹۲۱۶d.m۱۰۹۸۹a(variableB, 1.0f);
        this.f۹۲۱۶d.m۱۰۹۸۹a(variableC, ratio);
        this.f۹۲۱۶d.m۱۰۹۸۹a(variableD, -ratio);
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cb m۱۱۰۱۰b(Ci at, Ci ab, Ci bt, Ci bb, float angleComponent) {
        this.f۹۲۱۶d.m۱۰۹۸۹a(bt, 0.5f);
        this.f۹۲۱۶d.m۱۰۹۸۹a(bb, 0.5f);
        this.f۹۲۱۶d.m۱۰۹۸۹a(at, -0.5f);
        this.f۹۲۱۶d.m۱۰۹۸۹a(ab, -0.5f);
        this.f۹۲۱۴b = -angleComponent;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۰۴a() {
        float f = this.f۹۲۱۴b;
        if (f < 0.0f) {
            this.f۹۲۱۴b = f * -1.0f;
            this.f۹۲۱۶d.m۱۰۹۹۴b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۰۰۷a(Ce system) {
        boolean addedExtra = false;
        Ci pivotCandidate = this.f۹۲۱۶d.m۱۰۹۸۳a(system);
        if (pivotCandidate == null) {
            addedExtra = true;
        } else {
            m۱۱۰۱۷d(pivotCandidate);
        }
        if (this.f۹۲۱۶d.f۹۲۰۲a == 0) {
            this.f۹۲۱۷e = true;
        }
        return addedExtra;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public Ci m۱۱۰۱۴c(Ci exclude) {
        return this.f۹۲۱۶d.m۱۰۹۸۴a((boolean[]) null, exclude);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۱۰۱۷d(Ci v) {
        Ci iVar = this.f۹۲۱۳a;
        if (iVar != null) {
            this.f۹۲۱۶d.m۱۰۹۸۹a(iVar, -1.0f);
            this.f۹۲۱۳a = null;
        }
        float amount = this.f۹۲۱۶d.m۱۰۹۸۱a(v, true) * -1.0f;
        this.f۹۲۱۳a = v;
        if (amount != 1.0f) {
            this.f۹۲۱۴b /= amount;
            this.f۹۲۱۶d.m۱۰۹۸۶a(amount);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۱۰۱۵c() {
        return this.f۹۲۱۳a == null && this.f۹۲۱۴b == 0.0f && this.f۹۲۱۶d.f۹۲۰۲a == 0;
    }

    @Override // android.support.constraint.p۰۴۱i.Ce.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Ci m۱۱۰۰۳a(Ce system, boolean[] avoid) {
        return this.f۹۲۱۶d.m۱۰۹۸۴a(avoid, (Ci) null);
    }

    @Override // android.support.constraint.p۰۴۱i.Ce.AbstractCa
    public void clear() {
        this.f۹۲۱۶d.m۱۰۹۸۵a();
        this.f۹۲۱۳a = null;
        this.f۹۲۱۴b = 0.0f;
    }

    @Override // android.support.constraint.p۰۴۱i.Ce.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۰۵a(Ce.AbstractCa row) {
        if (row instanceof Cb) {
            Cb copiedRow = (Cb) row;
            this.f۹۲۱۳a = null;
            this.f۹۲۱۶d.m۱۰۹۸۵a();
            int i = 0;
            while (true) {
                Ca aVar = copiedRow.f۹۲۱۶d;
                if (i < aVar.f۹۲۰۲a) {
                    this.f۹۲۱۶d.m۱۰۹۹۰a(aVar.m۱۰۹۸۲a(i), copiedRow.f۹۲۱۶d.m۱۰۹۹۲b(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.support.constraint.p۰۴۱i.Ce.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۰۶a(Ci error) {
        float weight = 1.0f;
        int i = error.f۹۲۷۱d;
        if (i == 1) {
            weight = 1.0f;
        } else if (i == 2) {
            weight = 1000.0f;
        } else if (i == 3) {
            weight = 1000000.0f;
        } else if (i == 4) {
            weight = 1.0E9f;
        } else if (i == 5) {
            weight = 1.0E12f;
        }
        this.f۹۲۱۶d.m۱۰۹۸۹a(error, weight);
    }

    @Override // android.support.constraint.p۰۴۱i.Ce.AbstractCa
    public Ci getKey() {
        return this.f۹۲۱۳a;
    }
}
