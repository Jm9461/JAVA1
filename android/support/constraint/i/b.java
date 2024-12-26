package android.support.constraint.i;

import android.support.constraint.i.e;
import android.support.constraint.i.i;

public class b implements e.a {

    /* renamed from: a  reason: collision with root package name */
    i f۶۱۲a = null;

    /* renamed from: b  reason: collision with root package name */
    float f۶۱۳b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f۶۱۴c;

    /* renamed from: d  reason: collision with root package name */
    public final a f۶۱۵d;

    /* renamed from: e  reason: collision with root package name */
    boolean f۶۱۶e = false;

    public b(c cache) {
        this.f۶۱۵d = new a(this, cache);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        i iVar = this.f۶۱۲a;
        return iVar != null && (iVar.f۶۴۴g == i.a.UNRESTRICTED || this.f۶۱۳b >= 0.0f);
    }

    public String toString() {
        return e();
    }

    /* access modifiers changed from: package-private */
    public String e() {
        String s = (this.f۶۱۲a == null ? "" + "0" : "" + this.f۶۱۲a) + " = ";
        boolean addedVariable = false;
        if (this.f۶۱۳b != 0.0f) {
            s = s + this.f۶۱۳b;
            addedVariable = true;
        }
        int count = this.f۶۱۵d.f۶۰۴a;
        for (int i = 0; i < count; i++) {
            i v = this.f۶۱۵d.a(i);
            if (v != null) {
                float amount = this.f۶۱۵d.b(i);
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

    public void d() {
        this.f۶۱۲a = null;
        this.f۶۱۵d.a();
        this.f۶۱۳b = 0.0f;
        this.f۶۱۶e = false;
    }

    /* access modifiers changed from: package-private */
    public boolean b(i v) {
        return this.f۶۱۵d.a(v);
    }

    /* access modifiers changed from: package-private */
    public b b(i variable, int value) {
        this.f۶۱۲a = variable;
        variable.f۶۴۲e = (float) value;
        this.f۶۱۳b = (float) value;
        this.f۶۱۶e = true;
        return this;
    }

    public b c(i variable, int value) {
        if (value < 0) {
            this.f۶۱۳b = (float) (value * -1);
            this.f۶۱۵d.a(variable, 1.0f);
        } else {
            this.f۶۱۳b = (float) value;
            this.f۶۱۵d.a(variable, -1.0f);
        }
        return this;
    }

    public b a(i variableA, i variableB, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f۶۱۳b = (float) m;
        }
        if (!inverse) {
            this.f۶۱۵d.a(variableA, -1.0f);
            this.f۶۱۵d.a(variableB, 1.0f);
        } else {
            this.f۶۱۵d.a(variableA, 1.0f);
            this.f۶۱۵d.a(variableB, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public b a(i error, int sign) {
        this.f۶۱۵d.a(error, (float) sign);
        return this;
    }

    public b a(i variableA, i variableB, i slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f۶۱۳b = (float) m;
        }
        if (!inverse) {
            this.f۶۱۵d.a(variableA, -1.0f);
            this.f۶۱۵d.a(variableB, 1.0f);
            this.f۶۱۵d.a(slack, 1.0f);
        } else {
            this.f۶۱۵d.a(variableA, 1.0f);
            this.f۶۱۵d.a(variableB, -1.0f);
            this.f۶۱۵d.a(slack, -1.0f);
        }
        return this;
    }

    public b b(i variableA, i variableB, i slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f۶۱۳b = (float) m;
        }
        if (!inverse) {
            this.f۶۱۵d.a(variableA, -1.0f);
            this.f۶۱۵d.a(variableB, 1.0f);
            this.f۶۱۵d.a(slack, -1.0f);
        } else {
            this.f۶۱۵d.a(variableA, 1.0f);
            this.f۶۱۵d.a(variableB, -1.0f);
            this.f۶۱۵d.a(slack, 1.0f);
        }
        return this;
    }

    public b a(float currentWeight, float totalWeights, float nextWeight, i variableStartA, i variableEndA, i variableStartB, i variableEndB) {
        this.f۶۱۳b = 0.0f;
        if (totalWeights == 0.0f || currentWeight == nextWeight) {
            this.f۶۱۵d.a(variableStartA, 1.0f);
            this.f۶۱۵d.a(variableEndA, -1.0f);
            this.f۶۱۵d.a(variableEndB, 1.0f);
            this.f۶۱۵d.a(variableStartB, -1.0f);
        } else if (currentWeight == 0.0f) {
            this.f۶۱۵d.a(variableStartA, 1.0f);
            this.f۶۱۵d.a(variableEndA, -1.0f);
        } else if (nextWeight == 0.0f) {
            this.f۶۱۵d.a(variableStartB, 1.0f);
            this.f۶۱۵d.a(variableEndB, -1.0f);
        } else {
            float w = (currentWeight / totalWeights) / (nextWeight / totalWeights);
            this.f۶۱۵d.a(variableStartA, 1.0f);
            this.f۶۱۵d.a(variableEndA, -1.0f);
            this.f۶۱۵d.a(variableEndB, w);
            this.f۶۱۵d.a(variableStartB, -w);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public b a(i variableA, i variableB, int marginA, float bias, i variableC, i variableD, int marginB) {
        if (variableB == variableC) {
            this.f۶۱۵d.a(variableA, 1.0f);
            this.f۶۱۵d.a(variableD, 1.0f);
            this.f۶۱۵d.a(variableB, -2.0f);
            return this;
        }
        if (bias == 0.5f) {
            this.f۶۱۵d.a(variableA, 1.0f);
            this.f۶۱۵d.a(variableB, -1.0f);
            this.f۶۱۵d.a(variableC, -1.0f);
            this.f۶۱۵d.a(variableD, 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f۶۱۳b = (float) ((-marginA) + marginB);
            }
        } else if (bias <= 0.0f) {
            this.f۶۱۵d.a(variableA, -1.0f);
            this.f۶۱۵d.a(variableB, 1.0f);
            this.f۶۱۳b = (float) marginA;
        } else if (bias >= 1.0f) {
            this.f۶۱۵d.a(variableC, -1.0f);
            this.f۶۱۵d.a(variableD, 1.0f);
            this.f۶۱۳b = (float) marginB;
        } else {
            this.f۶۱۵d.a(variableA, (1.0f - bias) * 1.0f);
            this.f۶۱۵d.a(variableB, (1.0f - bias) * -1.0f);
            this.f۶۱۵d.a(variableC, -1.0f * bias);
            this.f۶۱۵d.a(variableD, bias * 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f۶۱۳b = (((float) (-marginA)) * (1.0f - bias)) + (((float) marginB) * bias);
            }
        }
        return this;
    }

    public b a(e system, int strength) {
        this.f۶۱۵d.a(system.a(strength, "ep"), 1.0f);
        this.f۶۱۵d.a(system.a(strength, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public b a(i variableA, i variableB, i variableC, float percent) {
        this.f۶۱۵d.a(variableA, -1.0f);
        this.f۶۱۵d.a(variableB, 1.0f - percent);
        this.f۶۱۵d.a(variableC, percent);
        return this;
    }

    public b a(i variableA, i variableB, i variableC, i variableD, float ratio) {
        this.f۶۱۵d.a(variableA, -1.0f);
        this.f۶۱۵d.a(variableB, 1.0f);
        this.f۶۱۵d.a(variableC, ratio);
        this.f۶۱۵d.a(variableD, -ratio);
        return this;
    }

    public b b(i at2, i ab, i bt, i bb, float angleComponent) {
        this.f۶۱۵d.a(bt, 0.5f);
        this.f۶۱۵d.a(bb, 0.5f);
        this.f۶۱۵d.a(at2, -0.5f);
        this.f۶۱۵d.a(ab, -0.5f);
        this.f۶۱۳b = -angleComponent;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        float f2 = this.f۶۱۳b;
        if (f2 < 0.0f) {
            this.f۶۱۳b = f2 * -1.0f;
            this.f۶۱۵d.b();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(e system) {
        boolean addedExtra = false;
        i pivotCandidate = this.f۶۱۵d.a(system);
        if (pivotCandidate == null) {
            addedExtra = true;
        } else {
            d(pivotCandidate);
        }
        if (this.f۶۱۵d.f۶۰۴a == 0) {
            this.f۶۱۶e = true;
        }
        return addedExtra;
    }

    /* access modifiers changed from: package-private */
    public i c(i exclude) {
        return this.f۶۱۵d.a((boolean[]) null, exclude);
    }

    /* access modifiers changed from: package-private */
    public void d(i v) {
        i iVar = this.f۶۱۲a;
        if (iVar != null) {
            this.f۶۱۵d.a(iVar, -1.0f);
            this.f۶۱۲a = null;
        }
        float amount = this.f۶۱۵d.a(v, true) * -1.0f;
        this.f۶۱۲a = v;
        if (amount != 1.0f) {
            this.f۶۱۳b /= amount;
            this.f۶۱۵d.a(amount);
        }
    }

    public boolean c() {
        return this.f۶۱۲a == null && this.f۶۱۳b == 0.0f && this.f۶۱۵d.f۶۰۴a == 0;
    }

    @Override // android.support.constraint.i.e.a
    public i a(e system, boolean[] avoid) {
        return this.f۶۱۵d.a(avoid, (i) null);
    }

    @Override // android.support.constraint.i.e.a
    public void clear() {
        this.f۶۱۵d.a();
        this.f۶۱۲a = null;
        this.f۶۱۳b = 0.0f;
    }

    @Override // android.support.constraint.i.e.a
    public void a(e.a row) {
        if (row instanceof b) {
            b copiedRow = (b) row;
            this.f۶۱۲a = null;
            this.f۶۱۵d.a();
            int i = 0;
            while (true) {
                a aVar = copiedRow.f۶۱۵d;
                if (i < aVar.f۶۰۴a) {
                    this.f۶۱۵d.a(aVar.a(i), copiedRow.f۶۱۵d.b(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.support.constraint.i.e.a
    public void a(i error) {
        float weight = 1.0f;
        int i = error.f۶۴۱d;
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
        this.f۶۱۵d.a(error, weight);
    }

    @Override // android.support.constraint.i.e.a
    public i getKey() {
        return this.f۶۱۲a;
    }
}
