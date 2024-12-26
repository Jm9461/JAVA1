package android.support.constraint.p۲۰۰i;

import android.support.constraint.p۲۰۰i.Ce;
import android.support.constraint.p۲۰۰i.Ci;

/* renamed from: android.support.constraint.i.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb implements Ce.a {

    /* renamed from: c, reason: contains not printable characters */
    boolean f۹۲۱۵c;

    /* renamed from: d, reason: contains not printable characters */
    public final Ca f۹۲۱۶d;

    /* renamed from: a, reason: contains not printable characters */
    Ci f۹۲۱۳a = null;

    /* renamed from: b, reason: contains not printable characters */
    float f۹۲۱۴b = 0.0f;

    /* renamed from: e, reason: contains not printable characters */
    boolean f۹۲۱۷e = false;

    public Cb(Cc cache) {
        this.f۹۲۱۶d = new Ca(this, cache);
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۸۹۴۳b() {
        Ci ci = this.f۹۲۱۳a;
        return ci != null && (ci.f۹۲۷۴g == Ci.a.UNRESTRICTED || this.f۹۲۱۴b >= 0.0f);
    }

    public String toString() {
        return m۸۹۵۰e();
    }

    /* renamed from: e, reason: contains not printable characters */
    String m۸۹۵۰e() {
        String s = (this.f۹۲۱۳a == null ? "0" : "" + this.f۹۲۱۳a) + " = ";
        boolean addedVariable = false;
        if (this.f۹۲۱۴b != 0.0f) {
            s = s + this.f۹۲۱۴b;
            addedVariable = true;
        }
        int count = this.f۹۲۱۶d.f۹۲۰۲a;
        for (int i = 0; i < count; i++) {
            Ci v = this.f۹۲۱۶d.m۸۹۱۴a(i);
            if (v != null) {
                float amount = this.f۹۲۱۶d.m۸۹۲۴b(i);
                if (amount != 0.0f) {
                    String name = v.toString();
                    if (addedVariable) {
                        if (amount > 0.0f) {
                            s = s + " + ";
                        } else {
                            s = s + " - ";
                            amount *= -1.0f;
                        }
                    } else if (amount < 0.0f) {
                        s = s + "- ";
                        amount *= -1.0f;
                    }
                    s = amount == 1.0f ? s + name : s + amount + " " + name;
                    addedVariable = true;
                }
            }
        }
        if (!addedVariable) {
            return s + "0.0";
        }
        return s;
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۸۹۴۸d() {
        this.f۹۲۱۳a = null;
        this.f۹۲۱۶d.m۸۹۱۷a();
        this.f۹۲۱۴b = 0.0f;
        this.f۹۲۱۷e = false;
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۸۹۴۴b(Ci v) {
        return this.f۹۲۱۶d.m۸۹۲۳a(v);
    }

    /* renamed from: b, reason: contains not printable characters */
    Cb m۸۹۴۰b(Ci variable, int value) {
        this.f۹۲۱۳a = variable;
        variable.f۹۲۷۲e = value;
        this.f۹۲۱۴b = value;
        this.f۹۲۱۷e = true;
        return this;
    }

    /* renamed from: c, reason: contains not printable characters */
    public Cb m۸۹۴۵c(Ci variable, int value) {
        if (value < 0) {
            this.f۹۲۱۴b = value * (-1);
            this.f۹۲۱۶d.m۸۹۲۱a(variable, 1.0f);
        } else {
            this.f۹۲۱۴b = value;
            this.f۹۲۱۶d.m۸۹۲۱a(variable, -1.0f);
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۸۹۳۰a(Ci variableA, Ci variableB, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f۹۲۱۴b = m;
        }
        if (!inverse) {
            this.f۹۲۱۶d.m۸۹۲۱a(variableA, -1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableB, 1.0f);
        } else {
            this.f۹۲۱۶d.m۸۹۲۱a(variableA, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableB, -1.0f);
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    Cb m۸۹۲۹a(Ci error, int sign) {
        this.f۹۲۱۶d.m۸۹۲۱a(error, sign);
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۸۹۳۳a(Ci variableA, Ci variableB, Ci slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f۹۲۱۴b = m;
        }
        if (!inverse) {
            this.f۹۲۱۶d.m۸۹۲۱a(variableA, -1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableB, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(slack, 1.0f);
        } else {
            this.f۹۲۱۶d.m۸۹۲۱a(variableA, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableB, -1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(slack, -1.0f);
        }
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cb m۸۹۴۱b(Ci variableA, Ci variableB, Ci slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f۹۲۱۴b = m;
        }
        if (!inverse) {
            this.f۹۲۱۶d.m۸۹۲۱a(variableA, -1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableB, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(slack, -1.0f);
        } else {
            this.f۹۲۱۶d.m۸۹۲۱a(variableA, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableB, -1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(slack, 1.0f);
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۸۹۲۷a(float currentWeight, float totalWeights, float nextWeight, Ci variableStartA, Ci variableEndA, Ci variableStartB, Ci variableEndB) {
        this.f۹۲۱۴b = 0.0f;
        if (totalWeights == 0.0f || currentWeight == nextWeight) {
            this.f۹۲۱۶d.m۸۹۲۱a(variableStartA, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableEndA, -1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableEndB, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableStartB, -1.0f);
        } else if (currentWeight == 0.0f) {
            this.f۹۲۱۶d.m۸۹۲۱a(variableStartA, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableEndA, -1.0f);
        } else if (nextWeight == 0.0f) {
            this.f۹۲۱۶d.m۸۹۲۱a(variableStartB, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableEndB, -1.0f);
        } else {
            float cw = currentWeight / totalWeights;
            float nw = nextWeight / totalWeights;
            float w = cw / nw;
            this.f۹۲۱۶d.m۸۹۲۱a(variableStartA, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableEndA, -1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableEndB, w);
            this.f۹۲۱۶d.m۸۹۲۱a(variableStartB, -w);
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    Cb m۸۹۳۱a(Ci variableA, Ci variableB, int marginA, float bias, Ci variableC, Ci variableD, int marginB) {
        if (variableB == variableC) {
            this.f۹۲۱۶d.m۸۹۲۱a(variableA, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableD, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableB, -2.0f);
            return this;
        }
        if (bias == 0.5f) {
            this.f۹۲۱۶d.m۸۹۲۱a(variableA, 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableB, -1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableC, -1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableD, 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f۹۲۱۴b = (-marginA) + marginB;
            }
        } else if (bias <= 0.0f) {
            this.f۹۲۱۶d.m۸۹۲۱a(variableA, -1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableB, 1.0f);
            this.f۹۲۱۴b = marginA;
        } else if (bias < 1.0f) {
            this.f۹۲۱۶d.m۸۹۲۱a(variableA, (1.0f - bias) * 1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableB, (1.0f - bias) * (-1.0f));
            this.f۹۲۱۶d.m۸۹۲۱a(variableC, (-1.0f) * bias);
            this.f۹۲۱۶d.m۸۹۲۱a(variableD, bias * 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f۹۲۱۴b = ((-marginA) * (1.0f - bias)) + (marginB * bias);
            }
        } else {
            this.f۹۲۱۶d.m۸۹۲۱a(variableC, -1.0f);
            this.f۹۲۱۶d.m۸۹۲۱a(variableD, 1.0f);
            this.f۹۲۱۴b = marginB;
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۸۹۲۸a(Ce system, int strength) {
        this.f۹۲۱۶d.m۸۹۲۱a(system.m۸۹۶۵a(strength, "ep"), 1.0f);
        this.f۹۲۱۶d.m۸۹۲۱a(system.m۸۹۶۵a(strength, "em"), -1.0f);
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    Cb m۸۹۳۲a(Ci variableA, Ci variableB, Ci variableC, float percent) {
        this.f۹۲۱۶d.m۸۹۲۱a(variableA, -1.0f);
        this.f۹۲۱۶d.m۸۹۲۱a(variableB, 1.0f - percent);
        this.f۹۲۱۶d.m۸۹۲۱a(variableC, percent);
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۸۹۳۴a(Ci variableA, Ci variableB, Ci variableC, Ci variableD, float ratio) {
        this.f۹۲۱۶d.m۸۹۲۱a(variableA, -1.0f);
        this.f۹۲۱۶d.m۸۹۲۱a(variableB, 1.0f);
        this.f۹۲۱۶d.m۸۹۲۱a(variableC, ratio);
        this.f۹۲۱۶d.m۸۹۲۱a(variableD, -ratio);
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cb m۸۹۴۲b(Ci at2, Ci ab, Ci bt, Ci bb, float angleComponent) {
        this.f۹۲۱۶d.m۸۹۲۱a(bt, 0.5f);
        this.f۹۲۱۶d.m۸۹۲۱a(bb, 0.5f);
        this.f۹۲۱۶d.m۸۹۲۱a(at2, -0.5f);
        this.f۹۲۱۶d.m۸۹۲۱a(ab, -0.5f);
        this.f۹۲۱۴b = -angleComponent;
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۸۹۳۶a() {
        float f2 = this.f۹۲۱۴b;
        if (f2 < 0.0f) {
            this.f۹۲۱۴b = f2 * (-1.0f);
            this.f۹۲۱۶d.m۸۹۲۶b();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۸۹۳۹a(Ce system) {
        boolean addedExtra = false;
        Ci pivotCandidate = this.f۹۲۱۶d.m۸۹۱۵a(system);
        if (pivotCandidate == null) {
            addedExtra = true;
        } else {
            m۸۹۴۹d(pivotCandidate);
        }
        if (this.f۹۲۱۶d.f۹۲۰۲a == 0) {
            this.f۹۲۱۷e = true;
        }
        return addedExtra;
    }

    /* renamed from: c, reason: contains not printable characters */
    Ci m۸۹۴۶c(Ci exclude) {
        return this.f۹۲۱۶d.m۸۹۱۶a((boolean[]) null, exclude);
    }

    /* renamed from: d, reason: contains not printable characters */
    void m۸۹۴۹d(Ci v) {
        Ci ci = this.f۹۲۱۳a;
        if (ci != null) {
            this.f۹۲۱۶d.m۸۹۲۱a(ci, -1.0f);
            this.f۹۲۱۳a = null;
        }
        float amount = this.f۹۲۱۶d.m۸۹۱۳a(v, true) * (-1.0f);
        this.f۹۲۱۳a = v;
        if (amount == 1.0f) {
            return;
        }
        this.f۹۲۱۴b /= amount;
        this.f۹۲۱۶d.m۸۹۱۸a(amount);
    }

    /* renamed from: c, reason: contains not printable characters */
    public boolean m۸۹۴۷c() {
        return this.f۹۲۱۳a == null && this.f۹۲۱۴b == 0.0f && this.f۹۲۱۶d.f۹۲۰۲a == 0;
    }

    @Override // android.support.constraint.p۲۰۰i.Ce.a
    /* renamed from: a, reason: contains not printable characters */
    public Ci mo۸۹۸۴a(Ce system, boolean[] avoid) {
        return this.f۹۲۱۶d.m۸۹۱۶a(avoid, (Ci) null);
    }

    @Override // android.support.constraint.p۲۰۰i.Ce.a
    public void clear() {
        this.f۹۲۱۶d.m۸۹۱۷a();
        this.f۹۲۱۳a = null;
        this.f۹۲۱۴b = 0.0f;
    }

    @Override // android.support.constraint.p۲۰۰i.Ce.a
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۹۸۵a(Ce.a row) {
        if (row instanceof Cb) {
            Cb copiedRow = (Cb) row;
            this.f۹۲۱۳a = null;
            this.f۹۲۱۶d.m۸۹۱۷a();
            int i = 0;
            while (true) {
                Ca ca = copiedRow.f۹۲۱۶d;
                if (i < ca.f۹۲۰۲a) {
                    Ci var = ca.m۸۹۱۴a(i);
                    float val = copiedRow.f۹۲۱۶d.m۸۹۲۴b(i);
                    this.f۹۲۱۶d.m۸۹۲۲a(var, val, true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.support.constraint.p۲۰۰i.Ce.a
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۹۸۶a(Ci error) {
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
        this.f۹۲۱۶d.m۸۹۲۱a(error, weight);
    }

    @Override // android.support.constraint.p۲۰۰i.Ce.a
    public Ci getKey() {
        return this.f۹۲۱۳a;
    }
}
