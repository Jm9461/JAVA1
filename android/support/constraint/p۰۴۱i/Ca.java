package android.support.constraint.p۰۴۱i;

import android.support.constraint.p۰۴۱i.Ci;
import java.util.Arrays;

/* renamed from: android.support.constraint.i.a  reason: invalid class name */
public class Ca {

    /* renamed from: a  reason: contains not printable characters */
    int f۹۲۰۲a = 0;

    /* renamed from: b  reason: contains not printable characters */
    private final Cb f۹۲۰۳b;

    /* renamed from: c  reason: contains not printable characters */
    private final Cc f۹۲۰۴c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۹۲۰۵d = 8;

    /* renamed from: e  reason: contains not printable characters */
    private Ci f۹۲۰۶e = null;

    /* renamed from: f  reason: contains not printable characters */
    private int[] f۹۲۰۷f;

    /* renamed from: g  reason: contains not printable characters */
    private int[] f۹۲۰۸g;

    /* renamed from: h  reason: contains not printable characters */
    private float[] f۹۲۰۹h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۹۲۱۰i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۹۲۱۱j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۹۲۱۲k;

    Ca(Cb arrayRow, Cc cache) {
        int i = this.f۹۲۰۵d;
        this.f۹۲۰۷f = new int[i];
        this.f۹۲۰۸g = new int[i];
        this.f۹۲۰۹h = new float[i];
        this.f۹۲۱۰i = -1;
        this.f۹۲۱۱j = -1;
        this.f۹۲۱۲k = false;
        this.f۹۲۰۳b = arrayRow;
        this.f۹۲۰۴c = cache;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۰۹۸۹a(Ci variable, float value) {
        if (value == 0.0f) {
            m۱۰۹۸۱a(variable, true);
        } else if (this.f۹۲۱۰i == -1) {
            this.f۹۲۱۰i = 0;
            float[] fArr = this.f۹۲۰۹h;
            int i = this.f۹۲۱۰i;
            fArr[i] = value;
            this.f۹۲۰۷f[i] = variable.f۹۲۶۹b;
            this.f۹۲۰۸g[i] = -1;
            variable.f۹۲۷۷j++;
            variable.m۱۱۰۶۳a(this.f۹۲۰۳b);
            this.f۹۲۰۲a++;
            if (!this.f۹۲۱۲k) {
                this.f۹۲۱۱j++;
                int i2 = this.f۹۲۱۱j;
                int[] iArr = this.f۹۲۰۷f;
                if (i2 >= iArr.length) {
                    this.f۹۲۱۲k = true;
                    this.f۹۲۱۱j = iArr.length - 1;
                }
            }
        } else {
            int current = this.f۹۲۱۰i;
            int previous = -1;
            int counter = 0;
            while (current != -1 && counter < this.f۹۲۰۲a) {
                int[] iArr2 = this.f۹۲۰۷f;
                int i3 = iArr2[current];
                int i4 = variable.f۹۲۶۹b;
                if (i3 == i4) {
                    this.f۹۲۰۹h[current] = value;
                    return;
                }
                if (iArr2[current] < i4) {
                    previous = current;
                }
                current = this.f۹۲۰۸g[current];
                counter++;
            }
            int i5 = this.f۹۲۱۱j;
            int availableIndice = i5 + 1;
            if (this.f۹۲۱۲k) {
                int[] iArr3 = this.f۹۲۰۷f;
                if (iArr3[i5] == -1) {
                    availableIndice = this.f۹۲۱۱j;
                } else {
                    availableIndice = iArr3.length;
                }
            }
            int[] iArr4 = this.f۹۲۰۷f;
            if (availableIndice >= iArr4.length && this.f۹۲۰۲a < iArr4.length) {
                int i6 = 0;
                while (true) {
                    int[] iArr5 = this.f۹۲۰۷f;
                    if (i6 >= iArr5.length) {
                        break;
                    } else if (iArr5[i6] == -1) {
                        availableIndice = i6;
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            int[] iArr6 = this.f۹۲۰۷f;
            if (availableIndice >= iArr6.length) {
                availableIndice = iArr6.length;
                this.f۹۲۰۵d *= 2;
                this.f۹۲۱۲k = false;
                this.f۹۲۱۱j = availableIndice - 1;
                this.f۹۲۰۹h = Arrays.copyOf(this.f۹۲۰۹h, this.f۹۲۰۵d);
                this.f۹۲۰۷f = Arrays.copyOf(this.f۹۲۰۷f, this.f۹۲۰۵d);
                this.f۹۲۰۸g = Arrays.copyOf(this.f۹۲۰۸g, this.f۹۲۰۵d);
            }
            this.f۹۲۰۷f[availableIndice] = variable.f۹۲۶۹b;
            this.f۹۲۰۹h[availableIndice] = value;
            if (previous != -1) {
                int[] iArr7 = this.f۹۲۰۸g;
                iArr7[availableIndice] = iArr7[previous];
                iArr7[previous] = availableIndice;
            } else {
                this.f۹۲۰۸g[availableIndice] = this.f۹۲۱۰i;
                this.f۹۲۱۰i = availableIndice;
            }
            variable.f۹۲۷۷j++;
            variable.m۱۱۰۶۳a(this.f۹۲۰۳b);
            this.f۹۲۰۲a++;
            if (!this.f۹۲۱۲k) {
                this.f۹۲۱۱j++;
            }
            if (this.f۹۲۰۲a >= this.f۹۲۰۷f.length) {
                this.f۹۲۱۲k = true;
            }
            int i7 = this.f۹۲۱۱j;
            int[] iArr8 = this.f۹۲۰۷f;
            if (i7 >= iArr8.length) {
                this.f۹۲۱۲k = true;
                this.f۹۲۱۱j = iArr8.length - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۰۹۹۰a(Ci variable, float value, boolean removeFromDefinition) {
        if (value != 0.0f) {
            if (this.f۹۲۱۰i == -1) {
                this.f۹۲۱۰i = 0;
                float[] fArr = this.f۹۲۰۹h;
                int i = this.f۹۲۱۰i;
                fArr[i] = value;
                this.f۹۲۰۷f[i] = variable.f۹۲۶۹b;
                this.f۹۲۰۸g[i] = -1;
                variable.f۹۲۷۷j++;
                variable.m۱۱۰۶۳a(this.f۹۲۰۳b);
                this.f۹۲۰۲a++;
                if (!this.f۹۲۱۲k) {
                    this.f۹۲۱۱j++;
                    int i2 = this.f۹۲۱۱j;
                    int[] iArr = this.f۹۲۰۷f;
                    if (i2 >= iArr.length) {
                        this.f۹۲۱۲k = true;
                        this.f۹۲۱۱j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int current = this.f۹۲۱۰i;
            int previous = -1;
            int counter = 0;
            while (current != -1 && counter < this.f۹۲۰۲a) {
                int[] iArr2 = this.f۹۲۰۷f;
                int idx = iArr2[current];
                int i3 = variable.f۹۲۶۹b;
                if (idx == i3) {
                    float[] fArr2 = this.f۹۲۰۹h;
                    fArr2[current] = fArr2[current] + value;
                    if (fArr2[current] == 0.0f) {
                        if (current == this.f۹۲۱۰i) {
                            this.f۹۲۱۰i = this.f۹۲۰۸g[current];
                        } else {
                            int[] iArr3 = this.f۹۲۰۸g;
                            iArr3[previous] = iArr3[current];
                        }
                        if (removeFromDefinition) {
                            variable.m۱۱۰۶۵b(this.f۹۲۰۳b);
                        }
                        if (this.f۹۲۱۲k) {
                            this.f۹۲۱۱j = current;
                        }
                        variable.f۹۲۷۷j--;
                        this.f۹۲۰۲a--;
                        return;
                    }
                    return;
                }
                if (iArr2[current] < i3) {
                    previous = current;
                }
                current = this.f۹۲۰۸g[current];
                counter++;
            }
            int i4 = this.f۹۲۱۱j;
            int availableIndice = i4 + 1;
            if (this.f۹۲۱۲k) {
                int[] iArr4 = this.f۹۲۰۷f;
                if (iArr4[i4] == -1) {
                    availableIndice = this.f۹۲۱۱j;
                } else {
                    availableIndice = iArr4.length;
                }
            }
            int[] iArr5 = this.f۹۲۰۷f;
            if (availableIndice >= iArr5.length && this.f۹۲۰۲a < iArr5.length) {
                int i5 = 0;
                while (true) {
                    int[] iArr6 = this.f۹۲۰۷f;
                    if (i5 >= iArr6.length) {
                        break;
                    } else if (iArr6[i5] == -1) {
                        availableIndice = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            int[] iArr7 = this.f۹۲۰۷f;
            if (availableIndice >= iArr7.length) {
                availableIndice = iArr7.length;
                this.f۹۲۰۵d *= 2;
                this.f۹۲۱۲k = false;
                this.f۹۲۱۱j = availableIndice - 1;
                this.f۹۲۰۹h = Arrays.copyOf(this.f۹۲۰۹h, this.f۹۲۰۵d);
                this.f۹۲۰۷f = Arrays.copyOf(this.f۹۲۰۷f, this.f۹۲۰۵d);
                this.f۹۲۰۸g = Arrays.copyOf(this.f۹۲۰۸g, this.f۹۲۰۵d);
            }
            this.f۹۲۰۷f[availableIndice] = variable.f۹۲۶۹b;
            this.f۹۲۰۹h[availableIndice] = value;
            if (previous != -1) {
                int[] iArr8 = this.f۹۲۰۸g;
                iArr8[availableIndice] = iArr8[previous];
                iArr8[previous] = availableIndice;
            } else {
                this.f۹۲۰۸g[availableIndice] = this.f۹۲۱۰i;
                this.f۹۲۱۰i = availableIndice;
            }
            variable.f۹۲۷۷j++;
            variable.m۱۱۰۶۳a(this.f۹۲۰۳b);
            this.f۹۲۰۲a++;
            if (!this.f۹۲۱۲k) {
                this.f۹۲۱۱j++;
            }
            int i6 = this.f۹۲۱۱j;
            int[] iArr9 = this.f۹۲۰۷f;
            if (i6 >= iArr9.length) {
                this.f۹۲۱۲k = true;
                this.f۹۲۱۱j = iArr9.length - 1;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public final float m۱۰۹۸۱a(Ci variable, boolean removeFromDefinition) {
        if (this.f۹۲۰۶e == variable) {
            this.f۹۲۰۶e = null;
        }
        if (this.f۹۲۱۰i == -1) {
            return 0.0f;
        }
        int current = this.f۹۲۱۰i;
        int previous = -1;
        int counter = 0;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            if (this.f۹۲۰۷f[current] == variable.f۹۲۶۹b) {
                if (current == this.f۹۲۱۰i) {
                    this.f۹۲۱۰i = this.f۹۲۰۸g[current];
                } else {
                    int[] iArr = this.f۹۲۰۸g;
                    iArr[previous] = iArr[current];
                }
                if (removeFromDefinition) {
                    variable.m۱۱۰۶۵b(this.f۹۲۰۳b);
                }
                variable.f۹۲۷۷j--;
                this.f۹۲۰۲a--;
                this.f۹۲۰۷f[current] = -1;
                if (this.f۹۲۱۲k) {
                    this.f۹۲۱۱j = current;
                }
                return this.f۹۲۰۹h[current];
            }
            previous = current;
            current = this.f۹۲۰۸g[current];
            counter++;
        }
        return 0.0f;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۰۹۸۵a() {
        int current = this.f۹۲۱۰i;
        int counter = 0;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            Ci variable = this.f۹۲۰۴c.f۹۲۲۰c[this.f۹۲۰۷f[current]];
            if (variable != null) {
                variable.m۱۱۰۶۵b(this.f۹۲۰۳b);
            }
            current = this.f۹۲۰۸g[current];
            counter++;
        }
        this.f۹۲۱۰i = -1;
        this.f۹۲۱۱j = -1;
        this.f۹۲۱۲k = false;
        this.f۹۲۰۲a = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final boolean m۱۰۹۹۱a(Ci variable) {
        if (this.f۹۲۱۰i == -1) {
            return false;
        }
        int current = this.f۹۲۱۰i;
        int counter = 0;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            if (this.f۹۲۰۷f[current] == variable.f۹۲۶۹b) {
                return true;
            }
            current = this.f۹۲۰۸g[current];
            counter++;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۹۹۴b() {
        int current = this.f۹۲۱۰i;
        int counter = 0;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            float[] fArr = this.f۹۲۰۹h;
            fArr[current] = fArr[current] * -1.0f;
            current = this.f۹۲۰۸g[current];
            counter++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۸۶a(float amount) {
        int current = this.f۹۲۱۰i;
        int counter = 0;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            float[] fArr = this.f۹۲۰۹h;
            fArr[current] = fArr[current] / amount;
            current = this.f۹۲۰۸g[current];
            counter++;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۰۹۸۰a(Ci variable, Ce system) {
        return variable.f۹۲۷۷j <= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Ci m۱۰۹۸۳a(Ce system) {
        float f;
        Ci restrictedCandidate = null;
        Ci unrestrictedCandidate = null;
        float unrestrictedCandidateAmount = 0.0f;
        float restrictedCandidateAmount = 0.0f;
        boolean unrestrictedCandidateIsNew = false;
        boolean restrictedCandidateIsNew = false;
        int current = this.f۹۲۱۰i;
        int counter = 0;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            float[] fArr = this.f۹۲۰۹h;
            float amount = fArr[current];
            Ci variable = this.f۹۲۰۴c.f۹۲۲۰c[this.f۹۲۰۷f[current]];
            if (amount < 0.0f) {
                if (amount > (-0.001f)) {
                    fArr[current] = 0.0f;
                    amount = 0.0f;
                    variable.m۱۱۰۶۵b(this.f۹۲۰۳b);
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
            } else if (amount < 0.001f) {
                f = 0.0f;
                fArr[current] = 0.0f;
                amount = 0.0f;
                variable.m۱۱۰۶۵b(this.f۹۲۰۳b);
            } else {
                f = 0.0f;
            }
            if (amount != f) {
                if (variable.f۹۲۷۴g == Ci.EnumCa.UNRESTRICTED) {
                    if (unrestrictedCandidate == null) {
                        unrestrictedCandidate = variable;
                        unrestrictedCandidateAmount = amount;
                        unrestrictedCandidateIsNew = m۱۰۹۸۰a(variable, system);
                    } else if (unrestrictedCandidateAmount > amount) {
                        unrestrictedCandidate = variable;
                        unrestrictedCandidateAmount = amount;
                        unrestrictedCandidateIsNew = m۱۰۹۸۰a(variable, system);
                    } else if (!unrestrictedCandidateIsNew && m۱۰۹۸۰a(variable, system)) {
                        unrestrictedCandidate = variable;
                        unrestrictedCandidateAmount = amount;
                        unrestrictedCandidateIsNew = true;
                    }
                } else if (unrestrictedCandidate == null && amount < 0.0f) {
                    if (restrictedCandidate == null) {
                        restrictedCandidate = variable;
                        restrictedCandidateAmount = amount;
                        restrictedCandidateIsNew = m۱۰۹۸۰a(variable, system);
                    } else if (restrictedCandidateAmount > amount) {
                        restrictedCandidate = variable;
                        restrictedCandidateAmount = amount;
                        restrictedCandidateIsNew = m۱۰۹۸۰a(variable, system);
                    } else if (!restrictedCandidateIsNew && m۱۰۹۸۰a(variable, system)) {
                        restrictedCandidate = variable;
                        restrictedCandidateAmount = amount;
                        restrictedCandidateIsNew = true;
                    }
                }
            }
            current = this.f۹۲۰۸g[current];
            counter++;
        }
        if (unrestrictedCandidate != null) {
            return unrestrictedCandidate;
        }
        return restrictedCandidate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۰۹۸۷a(Cb self, Cb definition, boolean removeFromDefinition) {
        int current = this.f۹۲۱۰i;
        int counter = 0;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            int i = this.f۹۲۰۷f[current];
            Ci iVar = definition.f۹۲۱۳a;
            if (i == iVar.f۹۲۶۹b) {
                float value = this.f۹۲۰۹h[current];
                m۱۰۹۸۱a(iVar, removeFromDefinition);
                Ca definitionVariables = definition.f۹۲۱۶d;
                int definitionCurrent = definitionVariables.f۹۲۱۰i;
                int definitionCounter = 0;
                while (definitionCurrent != -1 && definitionCounter < definitionVariables.f۹۲۰۲a) {
                    m۱۰۹۹۰a(this.f۹۲۰۴c.f۹۲۲۰c[definitionVariables.f۹۲۰۷f[definitionCurrent]], definitionVariables.f۹۲۰۹h[definitionCurrent] * value, removeFromDefinition);
                    definitionCurrent = definitionVariables.f۹۲۰۸g[definitionCurrent];
                    definitionCounter++;
                }
                self.f۹۲۱۴b += definition.f۹۲۱۴b * value;
                if (removeFromDefinition) {
                    definition.f۹۲۱۳a.m۱۱۰۶۵b(self);
                }
                current = this.f۹۲۱۰i;
                counter = 0;
            } else {
                current = this.f۹۲۰۸g[current];
                counter++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۸۸a(Cb self, Cb[] rows) {
        int current = this.f۹۲۱۰i;
        int counter = 0;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            Ci variable = this.f۹۲۰۴c.f۹۲۲۰c[this.f۹۲۰۷f[current]];
            if (variable.f۹۲۷۰c != -1) {
                float value = this.f۹۲۰۹h[current];
                m۱۰۹۸۱a(variable, true);
                Cb definition = rows[variable.f۹۲۷۰c];
                if (!definition.f۹۲۱۷e) {
                    Ca definitionVariables = definition.f۹۲۱۶d;
                    int definitionCurrent = definitionVariables.f۹۲۱۰i;
                    int definitionCounter = 0;
                    while (definitionCurrent != -1 && definitionCounter < definitionVariables.f۹۲۰۲a) {
                        m۱۰۹۹۰a(this.f۹۲۰۴c.f۹۲۲۰c[definitionVariables.f۹۲۰۷f[definitionCurrent]], definitionVariables.f۹۲۰۹h[definitionCurrent] * value, true);
                        definitionCurrent = definitionVariables.f۹۲۰۸g[definitionCurrent];
                        definitionCounter++;
                    }
                }
                self.f۹۲۱۴b += definition.f۹۲۱۴b * value;
                definition.f۹۲۱۳a.m۱۱۰۶۵b(self);
                current = this.f۹۲۱۰i;
                counter = 0;
            } else {
                current = this.f۹۲۰۸g[current];
                counter++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Ci m۱۰۹۸۴a(boolean[] avoid, Ci exclude) {
        Ci.EnumCa aVar;
        int current = this.f۹۲۱۰i;
        int counter = 0;
        Ci pivot = null;
        float value = 0.0f;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            if (this.f۹۲۰۹h[current] < 0.0f) {
                Ci v = this.f۹۲۰۴c.f۹۲۲۰c[this.f۹۲۰۷f[current]];
                if ((avoid == null || !avoid[v.f۹۲۶۹b]) && v != exclude && ((aVar = v.f۹۲۷۴g) == Ci.EnumCa.SLACK || aVar == Ci.EnumCa.ERROR)) {
                    float currentValue = this.f۹۲۰۹h[current];
                    if (currentValue < value) {
                        value = currentValue;
                        pivot = v;
                    }
                }
            }
            current = this.f۹۲۰۸g[current];
            counter++;
        }
        return pivot;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final Ci m۱۰۹۸۲a(int index) {
        int current = this.f۹۲۱۰i;
        int counter = 0;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            if (counter == index) {
                return this.f۹۲۰۴c.f۹۲۲۰c[this.f۹۲۰۷f[current]];
            }
            current = this.f۹۲۰۸g[current];
            counter++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public final float m۱۰۹۹۲b(int index) {
        int current = this.f۹۲۱۰i;
        int counter = 0;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            if (counter == index) {
                return this.f۹۲۰۹h[current];
            }
            current = this.f۹۲۰۸g[current];
            counter++;
        }
        return 0.0f;
    }

    /* renamed from: b  reason: contains not printable characters */
    public final float m۱۰۹۹۳b(Ci v) {
        int current = this.f۹۲۱۰i;
        int counter = 0;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            if (this.f۹۲۰۷f[current] == v.f۹۲۶۹b) {
                return this.f۹۲۰۹h[current];
            }
            current = this.f۹۲۰۸g[current];
            counter++;
        }
        return 0.0f;
    }

    public String toString() {
        String result = "";
        int current = this.f۹۲۱۰i;
        int counter = 0;
        while (current != -1 && counter < this.f۹۲۰۲a) {
            result = ((result + " -> ") + this.f۹۲۰۹h[current] + " : ") + this.f۹۲۰۴c.f۹۲۲۰c[this.f۹۲۰۷f[current]];
            current = this.f۹۲۰۸g[current];
            counter++;
        }
        return result;
    }
}
