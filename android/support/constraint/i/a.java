package android.support.constraint.i;

import android.support.constraint.i.i;
import java.util.Arrays;

public class a {

    /* renamed from: a  reason: collision with root package name */
    int f۶۰۴a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final b f۶۰۵b;

    /* renamed from: c  reason: collision with root package name */
    private final c f۶۰۶c;

    /* renamed from: d  reason: collision with root package name */
    private int f۶۰۷d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f۶۰۸e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f۶۰۹f;

    /* renamed from: g  reason: collision with root package name */
    private int[] f۶۱۰g;

    /* renamed from: h  reason: collision with root package name */
    private float[] f۶۱۱h;
    private int i;
    private int j;
    private boolean k;

    a(b arrayRow, c cache) {
        int i2 = this.f۶۰۷d;
        this.f۶۰۹f = new int[i2];
        this.f۶۱۰g = new int[i2];
        this.f۶۱۱h = new float[i2];
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f۶۰۵b = arrayRow;
        this.f۶۰۶c = cache;
    }

    public final void a(i variable, float value) {
        if (value == 0.0f) {
            a(variable, true);
        } else if (this.i == -1) {
            this.i = 0;
            float[] fArr = this.f۶۱۱h;
            int i2 = this.i;
            fArr[i2] = value;
            this.f۶۰۹f[i2] = variable.f۶۳۹b;
            this.f۶۱۰g[i2] = -1;
            variable.j++;
            variable.a(this.f۶۰۵b);
            this.f۶۰۴a++;
            if (!this.k) {
                this.j++;
                int i3 = this.j;
                int[] iArr = this.f۶۰۹f;
                if (i3 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                }
            }
        } else {
            int current = this.i;
            int previous = -1;
            int counter = 0;
            while (current != -1 && counter < this.f۶۰۴a) {
                int[] iArr2 = this.f۶۰۹f;
                int i4 = iArr2[current];
                int i5 = variable.f۶۳۹b;
                if (i4 == i5) {
                    this.f۶۱۱h[current] = value;
                    return;
                }
                if (iArr2[current] < i5) {
                    previous = current;
                }
                current = this.f۶۱۰g[current];
                counter++;
            }
            int i6 = this.j;
            int availableIndice = i6 + 1;
            if (this.k) {
                int[] iArr3 = this.f۶۰۹f;
                if (iArr3[i6] == -1) {
                    availableIndice = this.j;
                } else {
                    availableIndice = iArr3.length;
                }
            }
            int[] iArr4 = this.f۶۰۹f;
            if (availableIndice >= iArr4.length && this.f۶۰۴a < iArr4.length) {
                int i7 = 0;
                while (true) {
                    int[] iArr5 = this.f۶۰۹f;
                    if (i7 >= iArr5.length) {
                        break;
                    } else if (iArr5[i7] == -1) {
                        availableIndice = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            int[] iArr6 = this.f۶۰۹f;
            if (availableIndice >= iArr6.length) {
                availableIndice = iArr6.length;
                this.f۶۰۷d *= 2;
                this.k = false;
                this.j = availableIndice - 1;
                this.f۶۱۱h = Arrays.copyOf(this.f۶۱۱h, this.f۶۰۷d);
                this.f۶۰۹f = Arrays.copyOf(this.f۶۰۹f, this.f۶۰۷d);
                this.f۶۱۰g = Arrays.copyOf(this.f۶۱۰g, this.f۶۰۷d);
            }
            this.f۶۰۹f[availableIndice] = variable.f۶۳۹b;
            this.f۶۱۱h[availableIndice] = value;
            if (previous != -1) {
                int[] iArr7 = this.f۶۱۰g;
                iArr7[availableIndice] = iArr7[previous];
                iArr7[previous] = availableIndice;
            } else {
                this.f۶۱۰g[availableIndice] = this.i;
                this.i = availableIndice;
            }
            variable.j++;
            variable.a(this.f۶۰۵b);
            this.f۶۰۴a++;
            if (!this.k) {
                this.j++;
            }
            if (this.f۶۰۴a >= this.f۶۰۹f.length) {
                this.k = true;
            }
            int i8 = this.j;
            int[] iArr8 = this.f۶۰۹f;
            if (i8 >= iArr8.length) {
                this.k = true;
                this.j = iArr8.length - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(i variable, float value, boolean removeFromDefinition) {
        if (value != 0.0f) {
            if (this.i == -1) {
                this.i = 0;
                float[] fArr = this.f۶۱۱h;
                int i2 = this.i;
                fArr[i2] = value;
                this.f۶۰۹f[i2] = variable.f۶۳۹b;
                this.f۶۱۰g[i2] = -1;
                variable.j++;
                variable.a(this.f۶۰۵b);
                this.f۶۰۴a++;
                if (!this.k) {
                    this.j++;
                    int i3 = this.j;
                    int[] iArr = this.f۶۰۹f;
                    if (i3 >= iArr.length) {
                        this.k = true;
                        this.j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int current = this.i;
            int previous = -1;
            int counter = 0;
            while (current != -1 && counter < this.f۶۰۴a) {
                int[] iArr2 = this.f۶۰۹f;
                int idx = iArr2[current];
                int i4 = variable.f۶۳۹b;
                if (idx == i4) {
                    float[] fArr2 = this.f۶۱۱h;
                    fArr2[current] = fArr2[current] + value;
                    if (fArr2[current] == 0.0f) {
                        if (current == this.i) {
                            this.i = this.f۶۱۰g[current];
                        } else {
                            int[] iArr3 = this.f۶۱۰g;
                            iArr3[previous] = iArr3[current];
                        }
                        if (removeFromDefinition) {
                            variable.b(this.f۶۰۵b);
                        }
                        if (this.k) {
                            this.j = current;
                        }
                        variable.j--;
                        this.f۶۰۴a--;
                        return;
                    }
                    return;
                }
                if (iArr2[current] < i4) {
                    previous = current;
                }
                current = this.f۶۱۰g[current];
                counter++;
            }
            int i5 = this.j;
            int availableIndice = i5 + 1;
            if (this.k) {
                int[] iArr4 = this.f۶۰۹f;
                if (iArr4[i5] == -1) {
                    availableIndice = this.j;
                } else {
                    availableIndice = iArr4.length;
                }
            }
            int[] iArr5 = this.f۶۰۹f;
            if (availableIndice >= iArr5.length && this.f۶۰۴a < iArr5.length) {
                int i6 = 0;
                while (true) {
                    int[] iArr6 = this.f۶۰۹f;
                    if (i6 >= iArr6.length) {
                        break;
                    } else if (iArr6[i6] == -1) {
                        availableIndice = i6;
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            int[] iArr7 = this.f۶۰۹f;
            if (availableIndice >= iArr7.length) {
                availableIndice = iArr7.length;
                this.f۶۰۷d *= 2;
                this.k = false;
                this.j = availableIndice - 1;
                this.f۶۱۱h = Arrays.copyOf(this.f۶۱۱h, this.f۶۰۷d);
                this.f۶۰۹f = Arrays.copyOf(this.f۶۰۹f, this.f۶۰۷d);
                this.f۶۱۰g = Arrays.copyOf(this.f۶۱۰g, this.f۶۰۷d);
            }
            this.f۶۰۹f[availableIndice] = variable.f۶۳۹b;
            this.f۶۱۱h[availableIndice] = value;
            if (previous != -1) {
                int[] iArr8 = this.f۶۱۰g;
                iArr8[availableIndice] = iArr8[previous];
                iArr8[previous] = availableIndice;
            } else {
                this.f۶۱۰g[availableIndice] = this.i;
                this.i = availableIndice;
            }
            variable.j++;
            variable.a(this.f۶۰۵b);
            this.f۶۰۴a++;
            if (!this.k) {
                this.j++;
            }
            int i7 = this.j;
            int[] iArr9 = this.f۶۰۹f;
            if (i7 >= iArr9.length) {
                this.k = true;
                this.j = iArr9.length - 1;
            }
        }
    }

    public final float a(i variable, boolean removeFromDefinition) {
        if (this.f۶۰۸e == variable) {
            this.f۶۰۸e = null;
        }
        if (this.i == -1) {
            return 0.0f;
        }
        int current = this.i;
        int previous = -1;
        int counter = 0;
        while (current != -1 && counter < this.f۶۰۴a) {
            if (this.f۶۰۹f[current] == variable.f۶۳۹b) {
                if (current == this.i) {
                    this.i = this.f۶۱۰g[current];
                } else {
                    int[] iArr = this.f۶۱۰g;
                    iArr[previous] = iArr[current];
                }
                if (removeFromDefinition) {
                    variable.b(this.f۶۰۵b);
                }
                variable.j--;
                this.f۶۰۴a--;
                this.f۶۰۹f[current] = -1;
                if (this.k) {
                    this.j = current;
                }
                return this.f۶۱۱h[current];
            }
            previous = current;
            current = this.f۶۱۰g[current];
            counter++;
        }
        return 0.0f;
    }

    public final void a() {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f۶۰۴a) {
            i variable = this.f۶۰۶c.f۶۱۹c[this.f۶۰۹f[current]];
            if (variable != null) {
                variable.b(this.f۶۰۵b);
            }
            current = this.f۶۱۰g[current];
            counter++;
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f۶۰۴a = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(i variable) {
        if (this.i == -1) {
            return false;
        }
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f۶۰۴a) {
            if (this.f۶۰۹f[current] == variable.f۶۳۹b) {
                return true;
            }
            current = this.f۶۱۰g[current];
            counter++;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f۶۰۴a) {
            float[] fArr = this.f۶۱۱h;
            fArr[current] = fArr[current] * -1.0f;
            current = this.f۶۱۰g[current];
            counter++;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(float amount) {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f۶۰۴a) {
            float[] fArr = this.f۶۱۱h;
            fArr[current] = fArr[current] / amount;
            current = this.f۶۱۰g[current];
            counter++;
        }
    }

    private boolean a(i variable, e system) {
        return variable.j <= 1;
    }

    /* access modifiers changed from: package-private */
    public i a(e system) {
        float f2;
        i restrictedCandidate = null;
        i unrestrictedCandidate = null;
        float unrestrictedCandidateAmount = 0.0f;
        float restrictedCandidateAmount = 0.0f;
        boolean unrestrictedCandidateIsNew = false;
        boolean restrictedCandidateIsNew = false;
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f۶۰۴a) {
            float[] fArr = this.f۶۱۱h;
            float amount = fArr[current];
            i variable = this.f۶۰۶c.f۶۱۹c[this.f۶۰۹f[current]];
            if (amount < 0.0f) {
                if (amount > (-0.001f)) {
                    fArr[current] = 0.0f;
                    amount = 0.0f;
                    variable.b(this.f۶۰۵b);
                    f2 = 0.0f;
                } else {
                    f2 = 0.0f;
                }
            } else if (amount < 0.001f) {
                f2 = 0.0f;
                fArr[current] = 0.0f;
                amount = 0.0f;
                variable.b(this.f۶۰۵b);
            } else {
                f2 = 0.0f;
            }
            if (amount != f2) {
                if (variable.f۶۴۴g == i.a.UNRESTRICTED) {
                    if (unrestrictedCandidate == null) {
                        unrestrictedCandidate = variable;
                        unrestrictedCandidateAmount = amount;
                        unrestrictedCandidateIsNew = a(variable, system);
                    } else if (unrestrictedCandidateAmount > amount) {
                        unrestrictedCandidate = variable;
                        unrestrictedCandidateAmount = amount;
                        unrestrictedCandidateIsNew = a(variable, system);
                    } else if (!unrestrictedCandidateIsNew && a(variable, system)) {
                        unrestrictedCandidate = variable;
                        unrestrictedCandidateAmount = amount;
                        unrestrictedCandidateIsNew = true;
                    }
                } else if (unrestrictedCandidate == null && amount < 0.0f) {
                    if (restrictedCandidate == null) {
                        restrictedCandidate = variable;
                        restrictedCandidateAmount = amount;
                        restrictedCandidateIsNew = a(variable, system);
                    } else if (restrictedCandidateAmount > amount) {
                        restrictedCandidate = variable;
                        restrictedCandidateAmount = amount;
                        restrictedCandidateIsNew = a(variable, system);
                    } else if (!restrictedCandidateIsNew && a(variable, system)) {
                        restrictedCandidate = variable;
                        restrictedCandidateAmount = amount;
                        restrictedCandidateIsNew = true;
                    }
                }
            }
            current = this.f۶۱۰g[current];
            counter++;
        }
        if (unrestrictedCandidate != null) {
            return unrestrictedCandidate;
        }
        return restrictedCandidate;
    }

    /* access modifiers changed from: package-private */
    public final void a(b self, b definition, boolean removeFromDefinition) {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f۶۰۴a) {
            int i2 = this.f۶۰۹f[current];
            i iVar = definition.f۶۱۲a;
            if (i2 == iVar.f۶۳۹b) {
                float value = this.f۶۱۱h[current];
                a(iVar, removeFromDefinition);
                a definitionVariables = definition.f۶۱۵d;
                int definitionCurrent = definitionVariables.i;
                int definitionCounter = 0;
                while (definitionCurrent != -1 && definitionCounter < definitionVariables.f۶۰۴a) {
                    a(this.f۶۰۶c.f۶۱۹c[definitionVariables.f۶۰۹f[definitionCurrent]], definitionVariables.f۶۱۱h[definitionCurrent] * value, removeFromDefinition);
                    definitionCurrent = definitionVariables.f۶۱۰g[definitionCurrent];
                    definitionCounter++;
                }
                self.f۶۱۳b += definition.f۶۱۳b * value;
                if (removeFromDefinition) {
                    definition.f۶۱۲a.b(self);
                }
                current = this.i;
                counter = 0;
            } else {
                current = this.f۶۱۰g[current];
                counter++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b self, b[] rows) {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f۶۰۴a) {
            i variable = this.f۶۰۶c.f۶۱۹c[this.f۶۰۹f[current]];
            if (variable.f۶۴۰c != -1) {
                float value = this.f۶۱۱h[current];
                a(variable, true);
                b definition = rows[variable.f۶۴۰c];
                if (!definition.f۶۱۶e) {
                    a definitionVariables = definition.f۶۱۵d;
                    int definitionCurrent = definitionVariables.i;
                    int definitionCounter = 0;
                    while (definitionCurrent != -1 && definitionCounter < definitionVariables.f۶۰۴a) {
                        a(this.f۶۰۶c.f۶۱۹c[definitionVariables.f۶۰۹f[definitionCurrent]], definitionVariables.f۶۱۱h[definitionCurrent] * value, true);
                        definitionCurrent = definitionVariables.f۶۱۰g[definitionCurrent];
                        definitionCounter++;
                    }
                }
                self.f۶۱۳b += definition.f۶۱۳b * value;
                definition.f۶۱۲a.b(self);
                current = this.i;
                counter = 0;
            } else {
                current = this.f۶۱۰g[current];
                counter++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public i a(boolean[] avoid, i exclude) {
        i.a aVar;
        int current = this.i;
        int counter = 0;
        i pivot = null;
        float value = 0.0f;
        while (current != -1 && counter < this.f۶۰۴a) {
            if (this.f۶۱۱h[current] < 0.0f) {
                i v = this.f۶۰۶c.f۶۱۹c[this.f۶۰۹f[current]];
                if ((avoid == null || !avoid[v.f۶۳۹b]) && v != exclude && ((aVar = v.f۶۴۴g) == i.a.SLACK || aVar == i.a.ERROR)) {
                    float currentValue = this.f۶۱۱h[current];
                    if (currentValue < value) {
                        value = currentValue;
                        pivot = v;
                    }
                }
            }
            current = this.f۶۱۰g[current];
            counter++;
        }
        return pivot;
    }

    /* access modifiers changed from: package-private */
    public final i a(int index) {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f۶۰۴a) {
            if (counter == index) {
                return this.f۶۰۶c.f۶۱۹c[this.f۶۰۹f[current]];
            }
            current = this.f۶۱۰g[current];
            counter++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float b(int index) {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f۶۰۴a) {
            if (counter == index) {
                return this.f۶۱۱h[current];
            }
            current = this.f۶۱۰g[current];
            counter++;
        }
        return 0.0f;
    }

    public final float b(i v) {
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f۶۰۴a) {
            if (this.f۶۰۹f[current] == v.f۶۳۹b) {
                return this.f۶۱۱h[current];
            }
            current = this.f۶۱۰g[current];
            counter++;
        }
        return 0.0f;
    }

    public String toString() {
        String result = "";
        int current = this.i;
        int counter = 0;
        while (current != -1 && counter < this.f۶۰۴a) {
            result = ((result + " -> ") + this.f۶۱۱h[current] + " : ") + this.f۶۰۶c.f۶۱۹c[this.f۶۰۹f[current]];
            current = this.f۶۱۰g[current];
            counter++;
        }
        return result;
    }
}
