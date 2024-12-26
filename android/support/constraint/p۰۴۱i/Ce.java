package android.support.constraint.p۰۴۱i;

import android.support.constraint.p۰۴۱i.Ci;
import android.support.constraint.p۰۴۱i.p۰۴۲j.Cd;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: android.support.constraint.i.e  reason: invalid class name */
public class Ce {

    /* renamed from: p  reason: contains not printable characters */
    private static int f۹۲۲۱p = 1000;

    /* renamed from: q  reason: contains not printable characters */
    public static Cf f۹۲۲۲q;

    /* renamed from: a  reason: contains not printable characters */
    int f۹۲۲۳a = 0;

    /* renamed from: b  reason: contains not printable characters */
    private HashMap<String, Ci> f۹۲۲۴b = null;

    /* renamed from: c  reason: contains not printable characters */
    private AbstractCa f۹۲۲۵c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۹۲۲۶d = 32;

    /* renamed from: e  reason: contains not printable characters */
    private int f۹۲۲۷e;

    /* renamed from: f  reason: contains not printable characters */
    Cb[] f۹۲۲۸f;

    /* renamed from: g  reason: contains not printable characters */
    public boolean f۹۲۲۹g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean[] f۹۲۳۰h;

    /* renamed from: i  reason: contains not printable characters */
    int f۹۲۳۱i;

    /* renamed from: j  reason: contains not printable characters */
    int f۹۲۳۲j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۹۲۳۳k;

    /* renamed from: l  reason: contains not printable characters */
    final Cc f۹۲۳۴l;

    /* renamed from: m  reason: contains not printable characters */
    private Ci[] f۹۲۳۵m;

    /* renamed from: n  reason: contains not printable characters */
    private int f۹۲۳۶n;

    /* renamed from: o  reason: contains not printable characters */
    private final AbstractCa f۹۲۳۷o;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.constraint.i.e$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        Ci m۱۱۰۵۲a(Ce eVar, boolean[] zArr);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۱۰۵۳a(AbstractCa aVar);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۱۰۵۴a(Ci iVar);

        void clear();

        Ci getKey();
    }

    public Ce() {
        int i = this.f۹۲۲۶d;
        this.f۹۲۲۷e = i;
        this.f۹۲۲۸f = null;
        this.f۹۲۲۹g = false;
        this.f۹۲۳۰h = new boolean[i];
        this.f۹۲۳۱i = 1;
        this.f۹۲۳۲j = 0;
        this.f۹۲۳۳k = i;
        this.f۹۲۳۵m = new Ci[f۹۲۲۱p];
        this.f۹۲۳۶n = 0;
        Cb[] bVarArr = new Cb[i];
        this.f۹۲۲۸f = new Cb[i];
        m۱۱۰۳۰j();
        this.f۹۲۳۴l = new Cc();
        this.f۹۲۲۵c = new Cd(this.f۹۲۳۴l);
        this.f۹۲۳۷o = new Cb(this.f۹۲۳۴l);
    }

    /* renamed from: h  reason: contains not printable characters */
    public static Cf m۱۱۰۲۸h() {
        return f۹۲۲۲q;
    }

    /* renamed from: i  reason: contains not printable characters */
    private void m۱۱۰۲۹i() {
        this.f۹۲۲۶d *= 2;
        this.f۹۲۲۸f = (Cb[]) Arrays.copyOf(this.f۹۲۲۸f, this.f۹۲۲۶d);
        Cc cVar = this.f۹۲۳۴l;
        cVar.f۹۲۲۰c = (Ci[]) Arrays.copyOf(cVar.f۹۲۲۰c, this.f۹۲۲۶d);
        int i = this.f۹۲۲۶d;
        this.f۹۲۳۰h = new boolean[i];
        this.f۹۲۲۷e = i;
        this.f۹۲۳۳k = i;
        Cf fVar = f۹۲۲۲q;
        if (fVar != null) {
            fVar.f۹۲۴۲d++;
            fVar.f۹۲۵۳o = Math.max(fVar.f۹۲۵۳o, (long) i);
            Cf fVar2 = f۹۲۲۲q;
            fVar2.f۹۲۳۸A = fVar2.f۹۲۵۳o;
        }
    }

    /* renamed from: j  reason: contains not printable characters */
    private void m۱۱۰۳۰j() {
        int i = 0;
        while (true) {
            Cb[] bVarArr = this.f۹۲۲۸f;
            if (i < bVarArr.length) {
                Cb row = bVarArr[i];
                if (row != null) {
                    this.f۹۲۳۴l.f۹۲۱۸a.m۱۱۰۵۷a(row);
                }
                this.f۹۲۲۸f[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public void m۱۱۰۵۱f() {
        Cc cVar;
        int i = 0;
        while (true) {
            cVar = this.f۹۲۳۴l;
            Ci[] iVarArr = cVar.f۹۲۲۰c;
            if (i >= iVarArr.length) {
                break;
            }
            Ci variable = iVarArr[i];
            if (variable != null) {
                variable.m۱۱۰۶۲a();
            }
            i++;
        }
        cVar.f۹۲۱۹b.m۱۱۰۵۶a(this.f۹۲۳۵m, this.f۹۲۳۶n);
        this.f۹۲۳۶n = 0;
        Arrays.fill(this.f۹۲۳۴l.f۹۲۲۰c, (Object) null);
        HashMap<String, Ci> hashMap = this.f۹۲۲۴b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f۹۲۲۳a = 0;
        this.f۹۲۲۵c.clear();
        this.f۹۲۳۱i = 1;
        for (int i2 = 0; i2 < this.f۹۲۳۲j; i2++) {
            this.f۹۲۲۸f[i2].f۹۲۱۵c = false;
        }
        m۱۱۰۳۰j();
        this.f۹۲۳۲j = 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ci m۱۱۰۳۴a(Object anchor) {
        if (anchor == null) {
            return null;
        }
        if (this.f۹۲۳۱i + 1 >= this.f۹۲۲۷e) {
            m۱۱۰۲۹i();
        }
        Ci variable = null;
        if (anchor instanceof Cd) {
            variable = ((Cd) anchor).m۱۱۰۸۷e();
            if (variable == null) {
                ((Cd) anchor).m۱۱۰۸۰a(this.f۹۲۳۴l);
                variable = ((Cd) anchor).m۱۱۰۸۷e();
            }
            int i = variable.f۹۲۶۹b;
            if (i == -1 || i > this.f۹۲۲۳a || this.f۹۲۳۴l.f۹۲۲۰c[i] == null) {
                if (variable.f۹۲۶۹b != -1) {
                    variable.m۱۱۰۶۲a();
                }
                this.f۹۲۲۳a++;
                this.f۹۲۳۱i++;
                int i2 = this.f۹۲۲۳a;
                variable.f۹۲۶۹b = i2;
                variable.f۹۲۷۴g = Ci.EnumCa.UNRESTRICTED;
                this.f۹۲۳۴l.f۹۲۲۰c[i2] = variable;
            }
        }
        return variable;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cb m۱۱۰۴۴b() {
        Cb row = this.f۹۲۳۴l.f۹۲۱۸a.m۱۱۰۵۵a();
        if (row == null) {
            row = new Cb(this.f۹۲۳۴l);
        } else {
            row.m۱۱۰۱۶d();
        }
        Ci.m۱۱۰۶۱b();
        return row;
    }

    /* renamed from: c  reason: contains not printable characters */
    public Ci m۱۱۰۴۷c() {
        Cf fVar = f۹۲۲۲q;
        if (fVar != null) {
            fVar.f۹۲۵۱m++;
        }
        if (this.f۹۲۳۱i + 1 >= this.f۹۲۲۷e) {
            m۱۱۰۲۹i();
        }
        Ci variable = m۱۱۰۲۲a(Ci.EnumCa.SLACK, (String) null);
        this.f۹۲۲۳a++;
        this.f۹۲۳۱i++;
        int i = this.f۹۲۲۳a;
        variable.f۹۲۶۹b = i;
        this.f۹۲۳۴l.f۹۲۲۰c[i] = variable;
        return variable;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ci m۱۱۰۳۲a() {
        Cf fVar = f۹۲۲۲q;
        if (fVar != null) {
            fVar.f۹۲۵۲n++;
        }
        if (this.f۹۲۳۱i + 1 >= this.f۹۲۲۷e) {
            m۱۱۰۲۹i();
        }
        Ci variable = m۱۱۰۲۲a(Ci.EnumCa.SLACK, (String) null);
        this.f۹۲۲۳a++;
        this.f۹۲۳۱i++;
        int i = this.f۹۲۲۳a;
        variable.f۹۲۶۹b = i;
        this.f۹۲۳۴l.f۹۲۲۰c[i] = variable;
        return variable;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۱۰۲۴b(Cb row) {
        row.m۱۰۹۹۶a(this, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۳۶a(Cb row, int sign, int strength) {
        row.m۱۰۹۹۷a(m۱۱۰۳۳a(strength, (String) null), sign);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ci m۱۱۰۳۳a(int strength, String prefix) {
        Cf fVar = f۹۲۲۲q;
        if (fVar != null) {
            fVar.f۹۲۵۰l++;
        }
        if (this.f۹۲۳۱i + 1 >= this.f۹۲۲۷e) {
            m۱۱۰۲۹i();
        }
        Ci variable = m۱۱۰۲۲a(Ci.EnumCa.ERROR, prefix);
        this.f۹۲۲۳a++;
        this.f۹۲۳۱i++;
        int i = this.f۹۲۲۳a;
        variable.f۹۲۶۹b = i;
        variable.f۹۲۷۱d = strength;
        this.f۹۲۳۴l.f۹۲۲۰c[i] = variable;
        this.f۹۲۲۵c.m۱۱۰۵۴a(variable);
        return variable;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Ci m۱۱۰۲۲a(Ci.EnumCa type, String prefix) {
        Ci variable = this.f۹۲۳۴l.f۹۲۱۹b.m۱۱۰۵۵a();
        if (variable == null) {
            variable = new Ci(type, prefix);
            variable.m۱۱۰۶۴a(type, prefix);
        } else {
            variable.m۱۱۰۶۲a();
            variable.m۱۱۰۶۴a(type, prefix);
        }
        int i = this.f۹۲۳۶n;
        int i2 = f۹۲۲۱p;
        if (i >= i2) {
            f۹۲۲۱p = i2 * 2;
            this.f۹۲۳۵m = (Ci[]) Arrays.copyOf(this.f۹۲۳۵m, f۹۲۲۱p);
        }
        Ci[] iVarArr = this.f۹۲۳۵m;
        int i3 = this.f۹۲۳۶n;
        this.f۹۲۳۶n = i3 + 1;
        iVarArr[i3] = variable;
        return variable;
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۱۰۴۳b(Object anchor) {
        Ci variable = ((Cd) anchor).m۱۱۰۸۷e();
        if (variable != null) {
            return (int) (variable.f۹۲۷۲e + 0.5f);
        }
        return 0;
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۱۰۵۰e() {
        Cf fVar = f۹۲۲۲q;
        if (fVar != null) {
            fVar.f۹۲۴۳e++;
        }
        if (this.f۹۲۲۹g) {
            Cf fVar2 = f۹۲۲۲q;
            if (fVar2 != null) {
                fVar2.f۹۲۵۵q++;
            }
            boolean fullySolved = true;
            int i = 0;
            while (true) {
                if (i >= this.f۹۲۳۲j) {
                    break;
                } else if (!this.f۹۲۲۸f[i].f۹۲۱۷e) {
                    fullySolved = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!fullySolved) {
                m۱۱۰۳۷a(this.f۹۲۲۵c);
                return;
            }
            Cf fVar3 = f۹۲۲۲q;
            if (fVar3 != null) {
                fVar3.f۹۲۵۴p++;
            }
            m۱۱۰۲۷g();
            return;
        }
        m۱۱۰۳۷a(this.f۹۲۲۵c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۳۷a(AbstractCa goal) {
        Cf fVar = f۹۲۲۲q;
        if (fVar != null) {
            fVar.f۹۲۵۷s++;
            fVar.f۹۲۵۸t = Math.max(fVar.f۹۲۵۸t, (long) this.f۹۲۳۱i);
            Cf fVar2 = f۹۲۲۲q;
            fVar2.f۹۲۵۹u = Math.max(fVar2.f۹۲۵۹u, (long) this.f۹۲۳۲j);
        }
        m۱۱۰۲۶d((Cb) goal);
        m۱۱۰۲۳b(goal);
        m۱۱۰۲۰a(goal, false);
        m۱۱۰۲۷g();
    }

    /* renamed from: d  reason: contains not printable characters */
    private final void m۱۱۰۲۶d(Cb row) {
        if (this.f۹۲۳۲j > 0) {
            row.f۹۲۱۶d.m۱۰۹۸۸a(row, this.f۹۲۲۸f);
            if (row.f۹۲۱۶d.f۹۲۰۲a == 0) {
                row.f۹۲۱۷e = true;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۳۵a(Cb row) {
        Ci pivotCandidate;
        if (row != null) {
            Cf fVar = f۹۲۲۲q;
            if (fVar != null) {
                fVar.f۹۲۴۴f++;
                if (row.f۹۲۱۷e) {
                    fVar.f۹۲۴۵g++;
                }
            }
            if (this.f۹۲۳۲j + 1 >= this.f۹۲۳۳k || this.f۹۲۳۱i + 1 >= this.f۹۲۲۷e) {
                m۱۱۰۲۹i();
            }
            boolean added = false;
            if (!row.f۹۲۱۷e) {
                m۱۱۰۲۶d(row);
                if (!row.m۱۱۰۱۵c()) {
                    row.m۱۱۰۰۴a();
                    if (row.m۱۱۰۰۷a(this)) {
                        Ci extra = m۱۱۰۳۲a();
                        row.f۹۲۱۳a = extra;
                        m۱۱۰۲۵c(row);
                        added = true;
                        this.f۹۲۳۷o.m۱۱۰۵۳a(row);
                        m۱۱۰۲۰a(this.f۹۲۳۷o, true);
                        if (extra.f۹۲۷۰c == -1) {
                            if (row.f۹۲۱۳a == extra && (pivotCandidate = row.m۱۱۰۱۴c(extra)) != null) {
                                Cf fVar2 = f۹۲۲۲q;
                                if (fVar2 != null) {
                                    fVar2.f۹۲۴۸j++;
                                }
                                row.m۱۱۰۱۷d(pivotCandidate);
                            }
                            if (!row.f۹۲۱۷e) {
                                row.f۹۲۱۳a.m۱۱۰۶۶c(row);
                            }
                            this.f۹۲۳۲j--;
                        }
                    }
                    if (!row.m۱۱۰۱۱b()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!added) {
                m۱۱۰۲۵c(row);
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private final void m۱۱۰۲۵c(Cb row) {
        Cb[] bVarArr = this.f۹۲۲۸f;
        int i = this.f۹۲۳۲j;
        if (bVarArr[i] != null) {
            this.f۹۲۳۴l.f۹۲۱۸a.m۱۱۰۵۷a(bVarArr[i]);
        }
        Cb[] bVarArr2 = this.f۹۲۲۸f;
        int i2 = this.f۹۲۳۲j;
        bVarArr2[i2] = row;
        Ci iVar = row.f۹۲۱۳a;
        iVar.f۹۲۷۰c = i2;
        this.f۹۲۳۲j = i2 + 1;
        iVar.m۱۱۰۶۶c(row);
    }

    /* renamed from: a  reason: contains not printable characters */
    private final int m۱۱۰۲۰a(AbstractCa goal, boolean b) {
        Cf fVar = f۹۲۲۲q;
        if (fVar != null) {
            fVar.f۹۲۴۶h++;
        }
        boolean done = false;
        int tries = 0;
        for (int i = 0; i < this.f۹۲۳۱i; i++) {
            this.f۹۲۳۰h[i] = false;
        }
        while (!done) {
            Cf fVar2 = f۹۲۲۲q;
            if (fVar2 != null) {
                fVar2.f۹۲۴۷i++;
            }
            tries++;
            if (tries >= this.f۹۲۳۱i * 2) {
                return tries;
            }
            if (goal.getKey() != null) {
                this.f۹۲۳۰h[goal.getKey().f۹۲۶۹b] = true;
            }
            Ci pivotCandidate = goal.m۱۱۰۵۲a(this, this.f۹۲۳۰h);
            if (pivotCandidate != null) {
                boolean[] zArr = this.f۹۲۳۰h;
                int i2 = pivotCandidate.f۹۲۶۹b;
                if (zArr[i2]) {
                    return tries;
                }
                zArr[i2] = true;
            }
            if (pivotCandidate != null) {
                float min = Float.MAX_VALUE;
                int pivotRowIndex = -1;
                for (int i3 = 0; i3 < this.f۹۲۳۲j; i3++) {
                    Cb current = this.f۹۲۲۸f[i3];
                    if (current.f۹۲۱۳a.f۹۲۷۴g != Ci.EnumCa.UNRESTRICTED && !current.f۹۲۱۷e && current.m۱۱۰۱۲b(pivotCandidate)) {
                        float a_j = current.f۹۲۱۶d.m۱۰۹۹۳b(pivotCandidate);
                        if (a_j < 0.0f) {
                            float value = (-current.f۹۲۱۴b) / a_j;
                            if (value < min) {
                                min = value;
                                pivotRowIndex = i3;
                            }
                        }
                    }
                }
                if (pivotRowIndex > -1) {
                    Cb pivotEquation = this.f۹۲۲۸f[pivotRowIndex];
                    pivotEquation.f۹۲۱۳a.f۹۲۷۰c = -1;
                    Cf fVar3 = f۹۲۲۲q;
                    if (fVar3 != null) {
                        fVar3.f۹۲۴۸j++;
                    }
                    pivotEquation.m۱۱۰۱۷d(pivotCandidate);
                    Ci iVar = pivotEquation.f۹۲۱۳a;
                    iVar.f۹۲۷۰c = pivotRowIndex;
                    iVar.m۱۱۰۶۶c(pivotEquation);
                } else {
                    done = true;
                }
            } else {
                done = true;
            }
        }
        return tries;
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۱۰۲۳b(AbstractCa goal) {
        float f;
        int tries = 0;
        boolean infeasibleSystem = false;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f۹۲۳۲j) {
                break;
            }
            Cb[] bVarArr = this.f۹۲۲۸f;
            if (bVarArr[i].f۹۲۱۳a.f۹۲۷۴g != Ci.EnumCa.UNRESTRICTED && bVarArr[i].f۹۲۱۴b < 0.0f) {
                infeasibleSystem = true;
                break;
            }
            i++;
        }
        if (infeasibleSystem) {
            boolean done = false;
            tries = 0;
            while (!done) {
                Cf fVar = f۹۲۲۲q;
                if (fVar != null) {
                    fVar.f۹۲۴۹k++;
                }
                tries++;
                float min = Float.MAX_VALUE;
                int strength = 0;
                int pivotRowIndex = -1;
                int pivotColumnIndex = -1;
                int i2 = 0;
                while (i2 < this.f۹۲۳۲j) {
                    Cb current = this.f۹۲۲۸f[i2];
                    if (current.f۹۲۱۳a.f۹۲۷۴g != Ci.EnumCa.UNRESTRICTED && !current.f۹۲۱۷e && current.f۹۲۱۴b < f) {
                        int j = 1;
                        while (j < this.f۹۲۳۱i) {
                            Ci candidate = this.f۹۲۳۴l.f۹۲۲۰c[j];
                            float a_j = current.f۹۲۱۶d.m۱۰۹۹۳b(candidate);
                            if (a_j > f) {
                                for (int k = 0; k < 7; k++) {
                                    float value = candidate.f۹۲۷۳f[k] / a_j;
                                    if ((value < min && k == strength) || k > strength) {
                                        min = value;
                                        pivotRowIndex = i2;
                                        pivotColumnIndex = j;
                                        strength = k;
                                    }
                                }
                            }
                            j++;
                            f = 0.0f;
                        }
                    }
                    i2++;
                    f = 0.0f;
                }
                if (pivotRowIndex != -1) {
                    Cb pivotEquation = this.f۹۲۲۸f[pivotRowIndex];
                    pivotEquation.f۹۲۱۳a.f۹۲۷۰c = -1;
                    Cf fVar2 = f۹۲۲۲q;
                    if (fVar2 != null) {
                        fVar2.f۹۲۴۸j++;
                    }
                    pivotEquation.m۱۱۰۱۷d(this.f۹۲۳۴l.f۹۲۲۰c[pivotColumnIndex]);
                    Ci iVar = pivotEquation.f۹۲۱۳a;
                    iVar.f۹۲۷۰c = pivotRowIndex;
                    iVar.m۱۱۰۶۶c(pivotEquation);
                } else {
                    done = true;
                }
                if (tries > this.f۹۲۳۱i / 2) {
                    done = true;
                }
                f = 0.0f;
            }
        }
        return tries;
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۱۰۲۷g() {
        for (int i = 0; i < this.f۹۲۳۲j; i++) {
            Cb row = this.f۹۲۲۸f[i];
            row.f۹۲۱۳a.f۹۲۷۲e = row.f۹۲۱۴b;
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public Cc m۱۱۰۴۹d() {
        return this.f۹۲۳۴l;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۰۴۵b(Ci a, Ci b, int margin, int strength) {
        Cb row = m۱۱۰۴۴b();
        Ci slack = m۱۱۰۴۷c();
        slack.f۹۲۷۱d = 0;
        row.m۱۱۰۰۱a(a, b, slack, margin);
        if (strength != 6) {
            m۱۱۰۳۶a(row, (int) (-1.0f * row.f۹۲۱۶d.m۱۰۹۹۳b(slack)), strength);
        }
        m۱۱۰۳۵a(row);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۴۱a(Ci a, Ci b, boolean hasMatchConstraintWidgets) {
        Cb row = m۱۱۰۴۴b();
        Ci slack = m۱۱۰۴۷c();
        slack.f۹۲۷۱d = 0;
        row.m۱۱۰۰۱a(a, b, slack, 0);
        if (hasMatchConstraintWidgets) {
            m۱۱۰۳۶a(row, (int) (-1.0f * row.f۹۲۱۶d.m۱۰۹۹۳b(slack)), 1);
        }
        m۱۱۰۳۵a(row);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۰۴۸c(Ci a, Ci b, int margin, int strength) {
        Cb row = m۱۱۰۴۴b();
        Ci slack = m۱۱۰۴۷c();
        slack.f۹۲۷۱d = 0;
        row.m۱۱۰۰۹b(a, b, slack, margin);
        if (strength != 6) {
            m۱۱۰۳۶a(row, (int) (-1.0f * row.f۹۲۱۶d.m۱۰۹۹۳b(slack)), strength);
        }
        m۱۱۰۳۵a(row);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۰۴۶b(Ci a, Ci b, boolean hasMatchConstraintWidgets) {
        Cb row = m۱۱۰۴۴b();
        Ci slack = m۱۱۰۴۷c();
        slack.f۹۲۷۱d = 0;
        row.m۱۱۰۰۹b(a, b, slack, 0);
        if (hasMatchConstraintWidgets) {
            m۱۱۰۳۶a(row, (int) (-1.0f * row.f۹۲۱۶d.m۱۰۹۹۳b(slack)), 1);
        }
        m۱۱۰۳۵a(row);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۳۹a(Ci a, Ci b, int m1, float bias, Ci c, Ci d, int m2, int strength) {
        Cb row = m۱۱۰۴۴b();
        row.m۱۰۹۹۹a(a, b, m1, bias, c, d, m2);
        if (strength != 6) {
            row.m۱۰۹۹۶a(this, strength);
        }
        m۱۱۰۳۵a(row);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۴۰a(Ci a, Ci b, Ci c, Ci d, float ratio, int strength) {
        Cb row = m۱۱۰۴۴b();
        row.m۱۱۰۰۲a(a, b, c, d, ratio);
        if (strength != 6) {
            row.m۱۰۹۹۶a(this, strength);
        }
        m۱۱۰۳۵a(row);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cb m۱۱۰۳۱a(Ci a, Ci b, int margin, int strength) {
        Cb row = m۱۱۰۴۴b();
        row.m۱۰۹۹۸a(a, b, margin);
        if (strength != 6) {
            row.m۱۰۹۹۶a(this, strength);
        }
        m۱۱۰۳۵a(row);
        return row;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۳۸a(Ci a, int value) {
        int idx = a.f۹۲۷۰c;
        if (a.f۹۲۷۰c != -1) {
            Cb row = this.f۹۲۲۸f[idx];
            if (row.f۹۲۱۷e) {
                row.f۹۲۱۴b = (float) value;
            } else if (row.f۹۲۱۶d.f۹۲۰۲a == 0) {
                row.f۹۲۱۷e = true;
                row.f۹۲۱۴b = (float) value;
            } else {
                Cb newRow = m۱۱۰۴۴b();
                newRow.m۱۱۰۱۳c(a, value);
                m۱۱۰۳۵a(newRow);
            }
        } else {
            Cb row2 = m۱۱۰۴۴b();
            row2.m۱۱۰۰۸b(a, value);
            m۱۱۰۳۵a(row2);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cb m۱۱۰۲۱a(Ce linearSystem, Ci variableA, Ci variableB, Ci variableC, float percent, boolean withError) {
        Cb row = linearSystem.m۱۱۰۴۴b();
        if (withError) {
            linearSystem.m۱۱۰۲۴b(row);
        }
        row.m۱۱۰۰۰a(variableA, variableB, variableC, percent);
        return row;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۴۲a(android.support.constraint.p۰۴۱i.p۰۴۲j.Ce widget, android.support.constraint.p۰۴۱i.p۰۴۲j.Ce target, float angle, int radius) {
        Ci Al = m۱۱۰۳۴a(widget.m۱۱۱۰۲a(Cd.EnumCd.LEFT));
        Ci At = m۱۱۰۳۴a(widget.m۱۱۱۰۲a(Cd.EnumCd.TOP));
        Ci Ar = m۱۱۰۳۴a(widget.m۱۱۱۰۲a(Cd.EnumCd.RIGHT));
        Ci Ab = m۱۱۰۳۴a(widget.m۱۱۱۰۲a(Cd.EnumCd.BOTTOM));
        Ci Bl = m۱۱۰۳۴a(target.m۱۱۱۰۲a(Cd.EnumCd.LEFT));
        Ci Bt = m۱۱۰۳۴a(target.m۱۱۱۰۲a(Cd.EnumCd.TOP));
        Ci Br = m۱۱۰۳۴a(target.m۱۱۱۰۲a(Cd.EnumCd.RIGHT));
        Ci Bb = m۱۱۰۳۴a(target.m۱۱۱۰۲a(Cd.EnumCd.BOTTOM));
        Cb row = m۱۱۰۴۴b();
        double sin = Math.sin((double) angle);
        double d = (double) radius;
        Double.isNaN(d);
        row.m۱۱۰۱۰b(At, Ab, Bt, Bb, (float) (sin * d));
        m۱۱۰۳۵a(row);
        Cb row2 = m۱۱۰۴۴b();
        double cos = Math.cos((double) angle);
        double d2 = (double) radius;
        Double.isNaN(d2);
        row2.m۱۱۰۱۰b(Al, Ar, Bl, Br, (float) (cos * d2));
        m۱۱۰۳۵a(row2);
    }
}
