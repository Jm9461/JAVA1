package android.support.constraint.i;

import android.support.constraint.i.i;
import android.support.constraint.i.j.d;
import java.util.Arrays;
import java.util.HashMap;

public class e {
    private static int p = 1000;
    public static f q;

    /* renamed from: a  reason: collision with root package name */
    int f۶۲۰a = 0;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, i> f۶۲۱b = null;

    /* renamed from: c  reason: collision with root package name */
    private a f۶۲۲c;

    /* renamed from: d  reason: collision with root package name */
    private int f۶۲۳d = 32;

    /* renamed from: e  reason: collision with root package name */
    private int f۶۲۴e;

    /* renamed from: f  reason: collision with root package name */
    b[] f۶۲۵f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f۶۲۶g;

    /* renamed from: h  reason: collision with root package name */
    private boolean[] f۶۲۷h;
    int i;
    int j;
    private int k;
    final c l;
    private i[] m;
    private int n;
    private final a o;

    /* access modifiers changed from: package-private */
    public interface a {
        i a(e eVar, boolean[] zArr);

        void a(a aVar);

        void a(i iVar);

        void clear();

        i getKey();
    }

    public e() {
        int i2 = this.f۶۲۳d;
        this.f۶۲۴e = i2;
        this.f۶۲۵f = null;
        this.f۶۲۶g = false;
        this.f۶۲۷h = new boolean[i2];
        this.i = 1;
        this.j = 0;
        this.k = i2;
        this.m = new i[p];
        this.n = 0;
        b[] bVarArr = new b[i2];
        this.f۶۲۵f = new b[i2];
        j();
        this.l = new c();
        this.f۶۲۲c = new d(this.l);
        this.o = new b(this.l);
    }

    public static f h() {
        return q;
    }

    private void i() {
        this.f۶۲۳d *= 2;
        this.f۶۲۵f = (b[]) Arrays.copyOf(this.f۶۲۵f, this.f۶۲۳d);
        c cVar = this.l;
        cVar.f۶۱۹c = (i[]) Arrays.copyOf(cVar.f۶۱۹c, this.f۶۲۳d);
        int i2 = this.f۶۲۳d;
        this.f۶۲۷h = new boolean[i2];
        this.f۶۲۴e = i2;
        this.k = i2;
        f fVar = q;
        if (fVar != null) {
            fVar.f۶۳۱d++;
            fVar.o = Math.max(fVar.o, (long) i2);
            f fVar2 = q;
            fVar2.A = fVar2.o;
        }
    }

    private void j() {
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f۶۲۵f;
            if (i2 < bVarArr.length) {
                b row = bVarArr[i2];
                if (row != null) {
                    this.l.f۶۱۷a.a(row);
                }
                this.f۶۲۵f[i2] = null;
                i2++;
            } else {
                return;
            }
        }
    }

    public void f() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.l;
            i[] iVarArr = cVar.f۶۱۹c;
            if (i2 >= iVarArr.length) {
                break;
            }
            i variable = iVarArr[i2];
            if (variable != null) {
                variable.a();
            }
            i2++;
        }
        cVar.f۶۱۸b.a(this.m, this.n);
        this.n = 0;
        Arrays.fill(this.l.f۶۱۹c, (Object) null);
        HashMap<String, i> hashMap = this.f۶۲۱b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f۶۲۰a = 0;
        this.f۶۲۲c.clear();
        this.i = 1;
        for (int i3 = 0; i3 < this.j; i3++) {
            this.f۶۲۵f[i3].f۶۱۴c = false;
        }
        j();
        this.j = 0;
    }

    public i a(Object anchor) {
        if (anchor == null) {
            return null;
        }
        if (this.i + 1 >= this.f۶۲۴e) {
            i();
        }
        i variable = null;
        if (anchor instanceof d) {
            variable = ((d) anchor).e();
            if (variable == null) {
                ((d) anchor).a(this.l);
                variable = ((d) anchor).e();
            }
            int i2 = variable.f۶۳۹b;
            if (i2 == -1 || i2 > this.f۶۲۰a || this.l.f۶۱۹c[i2] == null) {
                if (variable.f۶۳۹b != -1) {
                    variable.a();
                }
                this.f۶۲۰a++;
                this.i++;
                int i3 = this.f۶۲۰a;
                variable.f۶۳۹b = i3;
                variable.f۶۴۴g = i.a.UNRESTRICTED;
                this.l.f۶۱۹c[i3] = variable;
            }
        }
        return variable;
    }

    public b b() {
        b row = this.l.f۶۱۷a.a();
        if (row == null) {
            row = new b(this.l);
        } else {
            row.d();
        }
        i.b();
        return row;
    }

    public i c() {
        f fVar = q;
        if (fVar != null) {
            fVar.m++;
        }
        if (this.i + 1 >= this.f۶۲۴e) {
            i();
        }
        i variable = a(i.a.SLACK, (String) null);
        this.f۶۲۰a++;
        this.i++;
        int i2 = this.f۶۲۰a;
        variable.f۶۳۹b = i2;
        this.l.f۶۱۹c[i2] = variable;
        return variable;
    }

    public i a() {
        f fVar = q;
        if (fVar != null) {
            fVar.n++;
        }
        if (this.i + 1 >= this.f۶۲۴e) {
            i();
        }
        i variable = a(i.a.SLACK, (String) null);
        this.f۶۲۰a++;
        this.i++;
        int i2 = this.f۶۲۰a;
        variable.f۶۳۹b = i2;
        this.l.f۶۱۹c[i2] = variable;
        return variable;
    }

    private void b(b row) {
        row.a(this, 0);
    }

    /* access modifiers changed from: package-private */
    public void a(b row, int sign, int strength) {
        row.a(a(strength, (String) null), sign);
    }

    public i a(int strength, String prefix) {
        f fVar = q;
        if (fVar != null) {
            fVar.l++;
        }
        if (this.i + 1 >= this.f۶۲۴e) {
            i();
        }
        i variable = a(i.a.ERROR, prefix);
        this.f۶۲۰a++;
        this.i++;
        int i2 = this.f۶۲۰a;
        variable.f۶۳۹b = i2;
        variable.f۶۴۱d = strength;
        this.l.f۶۱۹c[i2] = variable;
        this.f۶۲۲c.a(variable);
        return variable;
    }

    private i a(i.a type, String prefix) {
        i variable = this.l.f۶۱۸b.a();
        if (variable == null) {
            variable = new i(type, prefix);
            variable.a(type, prefix);
        } else {
            variable.a();
            variable.a(type, prefix);
        }
        int i2 = this.n;
        int i3 = p;
        if (i2 >= i3) {
            p = i3 * 2;
            this.m = (i[]) Arrays.copyOf(this.m, p);
        }
        i[] iVarArr = this.m;
        int i4 = this.n;
        this.n = i4 + 1;
        iVarArr[i4] = variable;
        return variable;
    }

    public int b(Object anchor) {
        i variable = ((d) anchor).e();
        if (variable != null) {
            return (int) (variable.f۶۴۲e + 0.5f);
        }
        return 0;
    }

    public void e() {
        f fVar = q;
        if (fVar != null) {
            fVar.f۶۳۲e++;
        }
        if (this.f۶۲۶g) {
            f fVar2 = q;
            if (fVar2 != null) {
                fVar2.q++;
            }
            boolean fullySolved = true;
            int i2 = 0;
            while (true) {
                if (i2 >= this.j) {
                    break;
                } else if (!this.f۶۲۵f[i2].f۶۱۶e) {
                    fullySolved = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (!fullySolved) {
                a(this.f۶۲۲c);
                return;
            }
            f fVar3 = q;
            if (fVar3 != null) {
                fVar3.p++;
            }
            g();
            return;
        }
        a(this.f۶۲۲c);
    }

    /* access modifiers changed from: package-private */
    public void a(a goal) {
        f fVar = q;
        if (fVar != null) {
            fVar.s++;
            fVar.t = Math.max(fVar.t, (long) this.i);
            f fVar2 = q;
            fVar2.u = Math.max(fVar2.u, (long) this.j);
        }
        d((b) goal);
        b(goal);
        a(goal, false);
        g();
    }

    private final void d(b row) {
        if (this.j > 0) {
            row.f۶۱۵d.a(row, this.f۶۲۵f);
            if (row.f۶۱۵d.f۶۰۴a == 0) {
                row.f۶۱۶e = true;
            }
        }
    }

    public void a(b row) {
        i pivotCandidate;
        if (row != null) {
            f fVar = q;
            if (fVar != null) {
                fVar.f۶۳۳f++;
                if (row.f۶۱۶e) {
                    fVar.f۶۳۴g++;
                }
            }
            if (this.j + 1 >= this.k || this.i + 1 >= this.f۶۲۴e) {
                i();
            }
            boolean added = false;
            if (!row.f۶۱۶e) {
                d(row);
                if (!row.c()) {
                    row.a();
                    if (row.a(this)) {
                        i extra = a();
                        row.f۶۱۲a = extra;
                        c(row);
                        added = true;
                        this.o.a(row);
                        a(this.o, true);
                        if (extra.f۶۴۰c == -1) {
                            if (row.f۶۱۲a == extra && (pivotCandidate = row.c(extra)) != null) {
                                f fVar2 = q;
                                if (fVar2 != null) {
                                    fVar2.j++;
                                }
                                row.d(pivotCandidate);
                            }
                            if (!row.f۶۱۶e) {
                                row.f۶۱۲a.c(row);
                            }
                            this.j--;
                        }
                    }
                    if (!row.b()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!added) {
                c(row);
            }
        }
    }

    private final void c(b row) {
        b[] bVarArr = this.f۶۲۵f;
        int i2 = this.j;
        if (bVarArr[i2] != null) {
            this.l.f۶۱۷a.a(bVarArr[i2]);
        }
        b[] bVarArr2 = this.f۶۲۵f;
        int i3 = this.j;
        bVarArr2[i3] = row;
        i iVar = row.f۶۱۲a;
        iVar.f۶۴۰c = i3;
        this.j = i3 + 1;
        iVar.c(row);
    }

    private final int a(a goal, boolean b2) {
        f fVar = q;
        if (fVar != null) {
            fVar.f۶۳۵h++;
        }
        boolean done = false;
        int tries = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            this.f۶۲۷h[i2] = false;
        }
        while (!done) {
            f fVar2 = q;
            if (fVar2 != null) {
                fVar2.i++;
            }
            tries++;
            if (tries >= this.i * 2) {
                return tries;
            }
            if (goal.getKey() != null) {
                this.f۶۲۷h[goal.getKey().f۶۳۹b] = true;
            }
            i pivotCandidate = goal.a(this, this.f۶۲۷h);
            if (pivotCandidate != null) {
                boolean[] zArr = this.f۶۲۷h;
                int i3 = pivotCandidate.f۶۳۹b;
                if (zArr[i3]) {
                    return tries;
                }
                zArr[i3] = true;
            }
            if (pivotCandidate != null) {
                float min = Float.MAX_VALUE;
                int pivotRowIndex = -1;
                for (int i4 = 0; i4 < this.j; i4++) {
                    b current = this.f۶۲۵f[i4];
                    if (current.f۶۱۲a.f۶۴۴g != i.a.UNRESTRICTED && !current.f۶۱۶e && current.b(pivotCandidate)) {
                        float a_j = current.f۶۱۵d.b(pivotCandidate);
                        if (a_j < 0.0f) {
                            float value = (-current.f۶۱۳b) / a_j;
                            if (value < min) {
                                min = value;
                                pivotRowIndex = i4;
                            }
                        }
                    }
                }
                if (pivotRowIndex > -1) {
                    b pivotEquation = this.f۶۲۵f[pivotRowIndex];
                    pivotEquation.f۶۱۲a.f۶۴۰c = -1;
                    f fVar3 = q;
                    if (fVar3 != null) {
                        fVar3.j++;
                    }
                    pivotEquation.d(pivotCandidate);
                    i iVar = pivotEquation.f۶۱۲a;
                    iVar.f۶۴۰c = pivotRowIndex;
                    iVar.c(pivotEquation);
                } else {
                    done = true;
                }
            } else {
                done = true;
            }
        }
        return tries;
    }

    private int b(a goal) {
        float f2;
        int tries = 0;
        boolean infeasibleSystem = false;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.j) {
                break;
            }
            b[] bVarArr = this.f۶۲۵f;
            if (bVarArr[i2].f۶۱۲a.f۶۴۴g != i.a.UNRESTRICTED && bVarArr[i2].f۶۱۳b < 0.0f) {
                infeasibleSystem = true;
                break;
            }
            i2++;
        }
        if (infeasibleSystem) {
            boolean done = false;
            tries = 0;
            while (!done) {
                f fVar = q;
                if (fVar != null) {
                    fVar.k++;
                }
                tries++;
                float min = Float.MAX_VALUE;
                int strength = 0;
                int pivotRowIndex = -1;
                int pivotColumnIndex = -1;
                int i3 = 0;
                while (i3 < this.j) {
                    b current = this.f۶۲۵f[i3];
                    if (current.f۶۱۲a.f۶۴۴g != i.a.UNRESTRICTED && !current.f۶۱۶e && current.f۶۱۳b < f2) {
                        int j2 = 1;
                        while (j2 < this.i) {
                            i candidate = this.l.f۶۱۹c[j2];
                            float a_j = current.f۶۱۵d.b(candidate);
                            if (a_j > f2) {
                                for (int k2 = 0; k2 < 7; k2++) {
                                    float value = candidate.f۶۴۳f[k2] / a_j;
                                    if ((value < min && k2 == strength) || k2 > strength) {
                                        min = value;
                                        pivotRowIndex = i3;
                                        pivotColumnIndex = j2;
                                        strength = k2;
                                    }
                                }
                            }
                            j2++;
                            f2 = 0.0f;
                        }
                    }
                    i3++;
                    f2 = 0.0f;
                }
                if (pivotRowIndex != -1) {
                    b pivotEquation = this.f۶۲۵f[pivotRowIndex];
                    pivotEquation.f۶۱۲a.f۶۴۰c = -1;
                    f fVar2 = q;
                    if (fVar2 != null) {
                        fVar2.j++;
                    }
                    pivotEquation.d(this.l.f۶۱۹c[pivotColumnIndex]);
                    i iVar = pivotEquation.f۶۱۲a;
                    iVar.f۶۴۰c = pivotRowIndex;
                    iVar.c(pivotEquation);
                } else {
                    done = true;
                }
                if (tries > this.i / 2) {
                    done = true;
                }
                f2 = 0.0f;
            }
        }
        return tries;
    }

    private void g() {
        for (int i2 = 0; i2 < this.j; i2++) {
            b row = this.f۶۲۵f[i2];
            row.f۶۱۲a.f۶۴۲e = row.f۶۱۳b;
        }
    }

    public c d() {
        return this.l;
    }

    public void b(i a2, i b2, int margin, int strength) {
        b row = b();
        i slack = c();
        slack.f۶۴۱d = 0;
        row.a(a2, b2, slack, margin);
        if (strength != 6) {
            a(row, (int) (-1.0f * row.f۶۱۵d.b(slack)), strength);
        }
        a(row);
    }

    public void a(i a2, i b2, boolean hasMatchConstraintWidgets) {
        b row = b();
        i slack = c();
        slack.f۶۴۱d = 0;
        row.a(a2, b2, slack, 0);
        if (hasMatchConstraintWidgets) {
            a(row, (int) (-1.0f * row.f۶۱۵d.b(slack)), 1);
        }
        a(row);
    }

    public void c(i a2, i b2, int margin, int strength) {
        b row = b();
        i slack = c();
        slack.f۶۴۱d = 0;
        row.b(a2, b2, slack, margin);
        if (strength != 6) {
            a(row, (int) (-1.0f * row.f۶۱۵d.b(slack)), strength);
        }
        a(row);
    }

    public void b(i a2, i b2, boolean hasMatchConstraintWidgets) {
        b row = b();
        i slack = c();
        slack.f۶۴۱d = 0;
        row.b(a2, b2, slack, 0);
        if (hasMatchConstraintWidgets) {
            a(row, (int) (-1.0f * row.f۶۱۵d.b(slack)), 1);
        }
        a(row);
    }

    public void a(i a2, i b2, int m1, float bias, i c2, i d2, int m2, int strength) {
        b row = b();
        row.a(a2, b2, m1, bias, c2, d2, m2);
        if (strength != 6) {
            row.a(this, strength);
        }
        a(row);
    }

    public void a(i a2, i b2, i c2, i d2, float ratio, int strength) {
        b row = b();
        row.a(a2, b2, c2, d2, ratio);
        if (strength != 6) {
            row.a(this, strength);
        }
        a(row);
    }

    public b a(i a2, i b2, int margin, int strength) {
        b row = b();
        row.a(a2, b2, margin);
        if (strength != 6) {
            row.a(this, strength);
        }
        a(row);
        return row;
    }

    public void a(i a2, int value) {
        int idx = a2.f۶۴۰c;
        if (a2.f۶۴۰c != -1) {
            b row = this.f۶۲۵f[idx];
            if (row.f۶۱۶e) {
                row.f۶۱۳b = (float) value;
            } else if (row.f۶۱۵d.f۶۰۴a == 0) {
                row.f۶۱۶e = true;
                row.f۶۱۳b = (float) value;
            } else {
                b newRow = b();
                newRow.c(a2, value);
                a(newRow);
            }
        } else {
            b row2 = b();
            row2.b(a2, value);
            a(row2);
        }
    }

    public static b a(e linearSystem, i variableA, i variableB, i variableC, float percent, boolean withError) {
        b row = linearSystem.b();
        if (withError) {
            linearSystem.b(row);
        }
        row.a(variableA, variableB, variableC, percent);
        return row;
    }

    public void a(android.support.constraint.i.j.e widget, android.support.constraint.i.j.e target, float angle, int radius) {
        i Al = a(widget.a(d.EnumC۰۰۲۲d.LEFT));
        i At = a(widget.a(d.EnumC۰۰۲۲d.TOP));
        i Ar = a(widget.a(d.EnumC۰۰۲۲d.RIGHT));
        i Ab = a(widget.a(d.EnumC۰۰۲۲d.BOTTOM));
        i Bl = a(target.a(d.EnumC۰۰۲۲d.LEFT));
        i Bt = a(target.a(d.EnumC۰۰۲۲d.TOP));
        i Br = a(target.a(d.EnumC۰۰۲۲d.RIGHT));
        i Bb = a(target.a(d.EnumC۰۰۲۲d.BOTTOM));
        b row = b();
        double sin = Math.sin((double) angle);
        double d2 = (double) radius;
        Double.isNaN(d2);
        row.b(At, Ab, Bt, Bb, (float) (sin * d2));
        a(row);
        b row2 = b();
        double cos = Math.cos((double) angle);
        double d3 = (double) radius;
        Double.isNaN(d3);
        row2.b(Al, Ar, Bl, Br, (float) (cos * d3));
        a(row2);
    }
}
