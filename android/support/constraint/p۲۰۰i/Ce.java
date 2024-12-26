package android.support.constraint.p۲۰۰i;

import android.support.constraint.p۲۰۰i.Ci;
import android.support.constraint.p۲۰۰i.p۲۰۱j.Cd;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: android.support.constraint.i.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ce {

    /* renamed from: p, reason: contains not printable characters */
    private static int f۹۲۲۱p = 1000;

    /* renamed from: q, reason: contains not printable characters */
    public static Cf f۹۲۲۲q;

    /* renamed from: c, reason: contains not printable characters */
    private a f۹۲۲۵c;

    /* renamed from: e, reason: contains not printable characters */
    private int f۹۲۲۷e;

    /* renamed from: f, reason: contains not printable characters */
    Cb[] f۹۲۲۸f;

    /* renamed from: g, reason: contains not printable characters */
    public boolean f۹۲۲۹g;

    /* renamed from: h, reason: contains not printable characters */
    private boolean[] f۹۲۳۰h;

    /* renamed from: i, reason: contains not printable characters */
    int f۹۲۳۱i;

    /* renamed from: j, reason: contains not printable characters */
    int f۹۲۳۲j;

    /* renamed from: k, reason: contains not printable characters */
    private int f۹۲۳۳k;

    /* renamed from: l, reason: contains not printable characters */
    final Cc f۹۲۳۴l;

    /* renamed from: m, reason: contains not printable characters */
    private Ci[] f۹۲۳۵m;

    /* renamed from: n, reason: contains not printable characters */
    private int f۹۲۳۶n;

    /* renamed from: o, reason: contains not printable characters */
    private final a f۹۲۳۷o;

    /* renamed from: a, reason: contains not printable characters */
    int f۹۲۲۳a = 0;

    /* renamed from: b, reason: contains not printable characters */
    private HashMap<String, Ci> f۹۲۲۴b = null;

    /* renamed from: d, reason: contains not printable characters */
    private int f۹۲۲۶d = 32;

    /* renamed from: android.support.constraint.i.e$a */
    interface a {
        /* renamed from: a, reason: contains not printable characters */
        Ci mo۸۹۸۴a(Ce ce, boolean[] zArr);

        /* renamed from: a, reason: contains not printable characters */
        void mo۸۹۸۵a(a aVar);

        /* renamed from: a, reason: contains not printable characters */
        void mo۸۹۸۶a(Ci ci);

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
        Cb[] cbArr = new Cb[i];
        this.f۹۲۲۸f = new Cb[i];
        m۸۹۶۲j();
        this.f۹۲۳۴l = new Cc();
        this.f۹۲۲۵c = new Cd(this.f۹۲۳۴l);
        this.f۹۲۳۷o = new Cb(this.f۹۲۳۴l);
    }

    /* renamed from: h, reason: contains not printable characters */
    public static Cf m۸۹۶۰h() {
        return f۹۲۲۲q;
    }

    /* renamed from: i, reason: contains not printable characters */
    private void m۸۹۶۱i() {
        this.f۹۲۲۶d *= 2;
        this.f۹۲۲۸f = (Cb[]) Arrays.copyOf(this.f۹۲۲۸f, this.f۹۲۲۶d);
        Cc cc = this.f۹۲۳۴l;
        cc.f۹۲۲۰c = (Ci[]) Arrays.copyOf(cc.f۹۲۲۰c, this.f۹۲۲۶d);
        int i = this.f۹۲۲۶d;
        this.f۹۲۳۰h = new boolean[i];
        this.f۹۲۲۷e = i;
        this.f۹۲۳۳k = i;
        Cf cf = f۹۲۲۲q;
        if (cf != null) {
            cf.f۹۲۴۲d++;
            cf.f۹۲۵۳o = Math.max(cf.f۹۲۵۳o, i);
            Cf cf2 = f۹۲۲۲q;
            cf2.f۹۲۳۸A = cf2.f۹۲۵۳o;
        }
    }

    /* renamed from: j, reason: contains not printable characters */
    private void m۸۹۶۲j() {
        int i = 0;
        while (true) {
            Cb[] cbArr = this.f۹۲۲۸f;
            if (i < cbArr.length) {
                Cb row = cbArr[i];
                if (row != null) {
                    this.f۹۲۳۴l.f۹۲۱۸a.mo۸۹۹۲a(row);
                }
                this.f۹۲۲۸f[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    public void m۸۹۸۳f() {
        Cc cc;
        int i = 0;
        while (true) {
            cc = this.f۹۲۳۴l;
            Ci[] ciArr = cc.f۹۲۲۰c;
            if (i >= ciArr.length) {
                break;
            }
            Ci variable = ciArr[i];
            if (variable != null) {
                variable.m۸۹۹۴a();
            }
            i++;
        }
        cc.f۹۲۱۹b.mo۸۹۹۱a(this.f۹۲۳۵m, this.f۹۲۳۶n);
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
        m۸۹۶۲j();
        this.f۹۲۳۲j = 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ci m۸۹۶۶a(Object anchor) {
        if (anchor == null) {
            return null;
        }
        if (this.f۹۲۳۱i + 1 >= this.f۹۲۲۷e) {
            m۸۹۶۱i();
        }
        Ci variable = null;
        if (anchor instanceof Cd) {
            variable = ((Cd) anchor).m۹۰۱۹e();
            if (variable == null) {
                ((Cd) anchor).m۹۰۱۲a(this.f۹۲۳۴l);
                variable = ((Cd) anchor).m۹۰۱۹e();
            }
            int i = variable.f۹۲۶۹b;
            if (i == -1 || i > this.f۹۲۲۳a || this.f۹۲۳۴l.f۹۲۲۰c[i] == null) {
                if (variable.f۹۲۶۹b != -1) {
                    variable.m۸۹۹۴a();
                }
                this.f۹۲۲۳a++;
                this.f۹۲۳۱i++;
                int i2 = this.f۹۲۲۳a;
                variable.f۹۲۶۹b = i2;
                variable.f۹۲۷۴g = Ci.a.UNRESTRICTED;
                this.f۹۲۳۴l.f۹۲۲۰c[i2] = variable;
            }
        }
        return variable;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cb m۸۹۷۶b() {
        Cb row = this.f۹۲۳۴l.f۹۲۱۸a.mo۸۹۹۰a();
        if (row == null) {
            row = new Cb(this.f۹۲۳۴l);
        } else {
            row.m۸۹۴۸d();
        }
        Ci.m۸۹۹۳b();
        return row;
    }

    /* renamed from: c, reason: contains not printable characters */
    public Ci m۸۹۷۹c() {
        Cf cf = f۹۲۲۲q;
        if (cf != null) {
            cf.f۹۲۵۱m++;
        }
        if (this.f۹۲۳۱i + 1 >= this.f۹۲۲۷e) {
            m۸۹۶۱i();
        }
        Ci variable = m۸۹۵۴a(Ci.a.SLACK, (String) null);
        this.f۹۲۲۳a++;
        this.f۹۲۳۱i++;
        int i = this.f۹۲۲۳a;
        variable.f۹۲۶۹b = i;
        this.f۹۲۳۴l.f۹۲۲۰c[i] = variable;
        return variable;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ci m۸۹۶۴a() {
        Cf cf = f۹۲۲۲q;
        if (cf != null) {
            cf.f۹۲۵۲n++;
        }
        if (this.f۹۲۳۱i + 1 >= this.f۹۲۲۷e) {
            m۸۹۶۱i();
        }
        Ci variable = m۸۹۵۴a(Ci.a.SLACK, (String) null);
        this.f۹۲۲۳a++;
        this.f۹۲۳۱i++;
        int i = this.f۹۲۲۳a;
        variable.f۹۲۶۹b = i;
        this.f۹۲۳۴l.f۹۲۲۰c[i] = variable;
        return variable;
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۸۹۵۶b(Cb row) {
        row.m۸۹۲۸a(this, 0);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۸۹۶۸a(Cb row, int sign, int strength) {
        Ci error = m۸۹۶۵a(strength, (String) null);
        row.m۸۹۲۹a(error, sign);
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ci m۸۹۶۵a(int strength, String prefix) {
        Cf cf = f۹۲۲۲q;
        if (cf != null) {
            cf.f۹۲۵۰l++;
        }
        if (this.f۹۲۳۱i + 1 >= this.f۹۲۲۷e) {
            m۸۹۶۱i();
        }
        Ci variable = m۸۹۵۴a(Ci.a.ERROR, prefix);
        this.f۹۲۲۳a++;
        this.f۹۲۳۱i++;
        int i = this.f۹۲۲۳a;
        variable.f۹۲۶۹b = i;
        variable.f۹۲۷۱d = strength;
        this.f۹۲۳۴l.f۹۲۲۰c[i] = variable;
        this.f۹۲۲۵c.mo۸۹۸۶a(variable);
        return variable;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Ci m۸۹۵۴a(Ci.a type, String prefix) {
        Ci variable = this.f۹۲۳۴l.f۹۲۱۹b.mo۸۹۹۰a();
        if (variable == null) {
            variable = new Ci(type, prefix);
            variable.m۸۹۹۶a(type, prefix);
        } else {
            variable.m۸۹۹۴a();
            variable.m۸۹۹۶a(type, prefix);
        }
        int i = this.f۹۲۳۶n;
        int i2 = f۹۲۲۱p;
        if (i >= i2) {
            f۹۲۲۱p = i2 * 2;
            this.f۹۲۳۵m = (Ci[]) Arrays.copyOf(this.f۹۲۳۵m, f۹۲۲۱p);
        }
        Ci[] ciArr = this.f۹۲۳۵m;
        int i3 = this.f۹۲۳۶n;
        this.f۹۲۳۶n = i3 + 1;
        ciArr[i3] = variable;
        return variable;
    }

    /* renamed from: b, reason: contains not printable characters */
    public int m۸۹۷۵b(Object anchor) {
        Ci variable = ((Cd) anchor).m۹۰۱۹e();
        if (variable != null) {
            return (int) (variable.f۹۲۷۲e + 0.5f);
        }
        return 0;
    }

    /* renamed from: e, reason: contains not printable characters */
    public void m۸۹۸۲e() {
        Cf cf = f۹۲۲۲q;
        if (cf != null) {
            cf.f۹۲۴۳e++;
        }
        if (this.f۹۲۲۹g) {
            Cf cf2 = f۹۲۲۲q;
            if (cf2 != null) {
                cf2.f۹۲۵۵q++;
            }
            boolean fullySolved = true;
            int i = 0;
            while (true) {
                if (i >= this.f۹۲۳۲j) {
                    break;
                }
                Cb r = this.f۹۲۲۸f[i];
                if (r.f۹۲۱۷e) {
                    i++;
                } else {
                    fullySolved = false;
                    break;
                }
            }
            if (!fullySolved) {
                m۸۹۶۹a(this.f۹۲۲۵c);
                return;
            }
            Cf cf3 = f۹۲۲۲q;
            if (cf3 != null) {
                cf3.f۹۲۵۴p++;
            }
            m۸۹۵۹g();
            return;
        }
        m۸۹۶۹a(this.f۹۲۲۵c);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۸۹۶۹a(a goal) {
        Cf cf = f۹۲۲۲q;
        if (cf != null) {
            cf.f۹۲۵۷s++;
            cf.f۹۲۵۸t = Math.max(cf.f۹۲۵۸t, this.f۹۲۳۱i);
            Cf cf2 = f۹۲۲۲q;
            cf2.f۹۲۵۹u = Math.max(cf2.f۹۲۵۹u, this.f۹۲۳۲j);
        }
        m۸۹۵۸d((Cb) goal);
        m۸۹۵۵b(goal);
        m۸۹۵۲a(goal, false);
        m۸۹۵۹g();
    }

    /* renamed from: d, reason: contains not printable characters */
    private final void m۸۹۵۸d(Cb row) {
        if (this.f۹۲۳۲j > 0) {
            row.f۹۲۱۶d.m۸۹۲۰a(row, this.f۹۲۲۸f);
            if (row.f۹۲۱۶d.f۹۲۰۲a == 0) {
                row.f۹۲۱۷e = true;
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۹۶۷a(Cb row) {
        Ci pivotCandidate;
        if (row == null) {
            return;
        }
        Cf cf = f۹۲۲۲q;
        if (cf != null) {
            cf.f۹۲۴۴f++;
            if (row.f۹۲۱۷e) {
                cf.f۹۲۴۵g++;
            }
        }
        if (this.f۹۲۳۲j + 1 >= this.f۹۲۳۳k || this.f۹۲۳۱i + 1 >= this.f۹۲۲۷e) {
            m۸۹۶۱i();
        }
        boolean added = false;
        if (!row.f۹۲۱۷e) {
            m۸۹۵۸d(row);
            if (row.m۸۹۴۷c()) {
                return;
            }
            row.m۸۹۳۶a();
            if (row.m۸۹۳۹a(this)) {
                Ci extra = m۸۹۶۴a();
                row.f۹۲۱۳a = extra;
                m۸۹۵۷c(row);
                added = true;
                this.f۹۲۳۷o.mo۸۹۸۵a(row);
                m۸۹۵۲a(this.f۹۲۳۷o, true);
                if (extra.f۹۲۷۰c == -1) {
                    if (row.f۹۲۱۳a == extra && (pivotCandidate = row.m۸۹۴۶c(extra)) != null) {
                        Cf cf2 = f۹۲۲۲q;
                        if (cf2 != null) {
                            cf2.f۹۲۴۸j++;
                        }
                        row.m۸۹۴۹d(pivotCandidate);
                    }
                    if (!row.f۹۲۱۷e) {
                        row.f۹۲۱۳a.m۸۹۹۸c(row);
                    }
                    this.f۹۲۳۲j--;
                }
            }
            if (!row.m۸۹۴۳b()) {
                return;
            }
        }
        if (!added) {
            m۸۹۵۷c(row);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private final void m۸۹۵۷c(Cb row) {
        Cb[] cbArr = this.f۹۲۲۸f;
        int i = this.f۹۲۳۲j;
        if (cbArr[i] != null) {
            this.f۹۲۳۴l.f۹۲۱۸a.mo۸۹۹۲a(cbArr[i]);
        }
        Cb[] cbArr2 = this.f۹۲۲۸f;
        int i2 = this.f۹۲۳۲j;
        cbArr2[i2] = row;
        Ci ci = row.f۹۲۱۳a;
        ci.f۹۲۷۰c = i2;
        this.f۹۲۳۲j = i2 + 1;
        ci.m۸۹۹۸c(row);
    }

    /* renamed from: a, reason: contains not printable characters */
    private final int m۸۹۵۲a(a goal, boolean b2) {
        Cf cf = f۹۲۲۲q;
        if (cf != null) {
            cf.f۹۲۴۶h++;
        }
        boolean done = false;
        int tries = 0;
        for (int i = 0; i < this.f۹۲۳۱i; i++) {
            this.f۹۲۳۰h[i] = false;
        }
        while (!done) {
            Cf cf2 = f۹۲۲۲q;
            if (cf2 != null) {
                cf2.f۹۲۴۷i++;
            }
            tries++;
            if (tries >= this.f۹۲۳۱i * 2) {
                return tries;
            }
            if (goal.getKey() != null) {
                this.f۹۲۳۰h[goal.getKey().f۹۲۶۹b] = true;
            }
            Ci pivotCandidate = goal.mo۸۹۸۴a(this, this.f۹۲۳۰h);
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
                    Ci variable = current.f۹۲۱۳a;
                    if (variable.f۹۲۷۴g != Ci.a.UNRESTRICTED && !current.f۹۲۱۷e && current.m۸۹۴۴b(pivotCandidate)) {
                        float a_j = current.f۹۲۱۶d.m۸۹۲۵b(pivotCandidate);
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
                    Cf cf3 = f۹۲۲۲q;
                    if (cf3 != null) {
                        cf3.f۹۲۴۸j++;
                    }
                    pivotEquation.m۸۹۴۹d(pivotCandidate);
                    Ci ci = pivotEquation.f۹۲۱۳a;
                    ci.f۹۲۷۰c = pivotRowIndex;
                    ci.m۸۹۹۸c(pivotEquation);
                } else {
                    done = true;
                }
            } else {
                done = true;
            }
        }
        return tries;
    }

    /* renamed from: b, reason: contains not printable characters */
    private int m۸۹۵۵b(a goal) {
        float f2;
        int tries = 0;
        boolean infeasibleSystem = false;
        int i = 0;
        while (true) {
            f2 = 0.0f;
            if (i >= this.f۹۲۳۲j) {
                break;
            }
            Cb[] cbArr = this.f۹۲۲۸f;
            Ci variable = cbArr[i].f۹۲۱۳a;
            if (variable.f۹۲۷۴g == Ci.a.UNRESTRICTED || cbArr[i].f۹۲۱۴b >= 0.0f) {
                i++;
            } else {
                infeasibleSystem = true;
                break;
            }
        }
        if (infeasibleSystem) {
            boolean done = false;
            tries = 0;
            while (!done) {
                Cf cf = f۹۲۲۲q;
                if (cf != null) {
                    cf.f۹۲۴۹k++;
                }
                tries++;
                float min = Float.MAX_VALUE;
                int strength = 0;
                int pivotRowIndex = -1;
                int pivotColumnIndex = -1;
                int i2 = 0;
                while (i2 < this.f۹۲۳۲j) {
                    Cb current = this.f۹۲۲۸f[i2];
                    Ci variable2 = current.f۹۲۱۳a;
                    if (variable2.f۹۲۷۴g != Ci.a.UNRESTRICTED && !current.f۹۲۱۷e && current.f۹۲۱۴b < f2) {
                        int j = 1;
                        while (j < this.f۹۲۳۱i) {
                            Ci candidate = this.f۹۲۳۴l.f۹۲۲۰c[j];
                            float a_j = current.f۹۲۱۶d.m۸۹۲۵b(candidate);
                            if (a_j > f2) {
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
                            f2 = 0.0f;
                        }
                    }
                    i2++;
                    f2 = 0.0f;
                }
                if (pivotRowIndex != -1) {
                    Cb pivotEquation = this.f۹۲۲۸f[pivotRowIndex];
                    pivotEquation.f۹۲۱۳a.f۹۲۷۰c = -1;
                    Cf cf2 = f۹۲۲۲q;
                    if (cf2 != null) {
                        cf2.f۹۲۴۸j++;
                    }
                    pivotEquation.m۸۹۴۹d(this.f۹۲۳۴l.f۹۲۲۰c[pivotColumnIndex]);
                    Ci ci = pivotEquation.f۹۲۱۳a;
                    ci.f۹۲۷۰c = pivotRowIndex;
                    ci.m۸۹۹۸c(pivotEquation);
                } else {
                    done = true;
                }
                if (tries > this.f۹۲۳۱i / 2) {
                    done = true;
                }
                f2 = 0.0f;
            }
        }
        return tries;
    }

    /* renamed from: g, reason: contains not printable characters */
    private void m۸۹۵۹g() {
        for (int i = 0; i < this.f۹۲۳۲j; i++) {
            Cb row = this.f۹۲۲۸f[i];
            row.f۹۲۱۳a.f۹۲۷۲e = row.f۹۲۱۴b;
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    public Cc m۸۹۸۱d() {
        return this.f۹۲۳۴l;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۸۹۷۷b(Ci a2, Ci b2, int margin, int strength) {
        Cb row = m۸۹۷۶b();
        Ci slack = m۸۹۷۹c();
        slack.f۹۲۷۱d = 0;
        row.m۸۹۳۳a(a2, b2, slack, margin);
        if (strength != 6) {
            float slackValue = row.f۹۲۱۶d.m۸۹۲۵b(slack);
            m۸۹۶۸a(row, (int) ((-1.0f) * slackValue), strength);
        }
        m۸۹۶۷a(row);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۹۷۳a(Ci a2, Ci b2, boolean hasMatchConstraintWidgets) {
        Cb row = m۸۹۷۶b();
        Ci slack = m۸۹۷۹c();
        slack.f۹۲۷۱d = 0;
        row.m۸۹۳۳a(a2, b2, slack, 0);
        if (hasMatchConstraintWidgets) {
            float slackValue = row.f۹۲۱۶d.m۸۹۲۵b(slack);
            m۸۹۶۸a(row, (int) ((-1.0f) * slackValue), 1);
        }
        m۸۹۶۷a(row);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۸۹۸۰c(Ci a2, Ci b2, int margin, int strength) {
        Cb row = m۸۹۷۶b();
        Ci slack = m۸۹۷۹c();
        slack.f۹۲۷۱d = 0;
        row.m۸۹۴۱b(a2, b2, slack, margin);
        if (strength != 6) {
            float slackValue = row.f۹۲۱۶d.m۸۹۲۵b(slack);
            m۸۹۶۸a(row, (int) ((-1.0f) * slackValue), strength);
        }
        m۸۹۶۷a(row);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۸۹۷۸b(Ci a2, Ci b2, boolean hasMatchConstraintWidgets) {
        Cb row = m۸۹۷۶b();
        Ci slack = m۸۹۷۹c();
        slack.f۹۲۷۱d = 0;
        row.m۸۹۴۱b(a2, b2, slack, 0);
        if (hasMatchConstraintWidgets) {
            float slackValue = row.f۹۲۱۶d.m۸۹۲۵b(slack);
            m۸۹۶۸a(row, (int) ((-1.0f) * slackValue), 1);
        }
        m۸۹۶۷a(row);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۹۷۱a(Ci a2, Ci b2, int m1, float bias, Ci c2, Ci d2, int m2, int strength) {
        Cb row = m۸۹۷۶b();
        row.m۸۹۳۱a(a2, b2, m1, bias, c2, d2, m2);
        if (strength != 6) {
            row.m۸۹۲۸a(this, strength);
        }
        m۸۹۶۷a(row);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۹۷۲a(Ci a2, Ci b2, Ci c2, Ci d2, float ratio, int strength) {
        Cb row = m۸۹۷۶b();
        row.m۸۹۳۴a(a2, b2, c2, d2, ratio);
        if (strength != 6) {
            row.m۸۹۲۸a(this, strength);
        }
        m۸۹۶۷a(row);
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cb m۸۹۶۳a(Ci a2, Ci b2, int margin, int strength) {
        Cb row = m۸۹۷۶b();
        row.m۸۹۳۰a(a2, b2, margin);
        if (strength != 6) {
            row.m۸۹۲۸a(this, strength);
        }
        m۸۹۶۷a(row);
        return row;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۹۷۰a(Ci a2, int value) {
        int idx = a2.f۹۲۷۰c;
        if (a2.f۹۲۷۰c != -1) {
            Cb row = this.f۹۲۲۸f[idx];
            if (row.f۹۲۱۷e) {
                row.f۹۲۱۴b = value;
                return;
            }
            if (row.f۹۲۱۶d.f۹۲۰۲a == 0) {
                row.f۹۲۱۷e = true;
                row.f۹۲۱۴b = value;
                return;
            } else {
                Cb newRow = m۸۹۷۶b();
                newRow.m۸۹۴۵c(a2, value);
                m۸۹۶۷a(newRow);
                return;
            }
        }
        Cb row2 = m۸۹۷۶b();
        row2.m۸۹۴۰b(a2, value);
        m۸۹۶۷a(row2);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cb m۸۹۵۳a(Ce linearSystem, Ci variableA, Ci variableB, Ci variableC, float percent, boolean withError) {
        Cb row = linearSystem.m۸۹۷۶b();
        if (withError) {
            linearSystem.m۸۹۵۶b(row);
        }
        row.m۸۹۳۲a(variableA, variableB, variableC, percent);
        return row;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۹۷۴a(android.support.constraint.p۲۰۰i.p۲۰۱j.Ce widget, android.support.constraint.p۲۰۰i.p۲۰۱j.Ce target, float angle, int radius) {
        Ci Al = m۸۹۶۶a(widget.mo۹۱۲۵a(Cd.d.LEFT));
        Ci At = m۸۹۶۶a(widget.mo۹۱۲۵a(Cd.d.TOP));
        Ci Ar = m۸۹۶۶a(widget.mo۹۱۲۵a(Cd.d.RIGHT));
        Ci Ab = m۸۹۶۶a(widget.mo۹۱۲۵a(Cd.d.BOTTOM));
        Ci Bl = m۸۹۶۶a(target.mo۹۱۲۵a(Cd.d.LEFT));
        Ci Bt = m۸۹۶۶a(target.mo۹۱۲۵a(Cd.d.TOP));
        Ci Br = m۸۹۶۶a(target.mo۹۱۲۵a(Cd.d.RIGHT));
        Ci Bb = m۸۹۶۶a(target.mo۹۱۲۵a(Cd.d.BOTTOM));
        Cb row = m۸۹۷۶b();
        double sin = Math.sin(angle);
        double d2 = radius;
        Double.isNaN(d2);
        float angleComponent = (float) (sin * d2);
        row.m۸۹۴۲b(At, Ab, Bt, Bb, angleComponent);
        m۸۹۶۷a(row);
        Cb row2 = m۸۹۷۶b();
        double cos = Math.cos(angle);
        double d3 = radius;
        Double.isNaN(d3);
        float angleComponent2 = (float) (cos * d3);
        row2.m۸۹۴۲b(Al, Ar, Bl, Br, angleComponent2);
        m۸۹۶۷a(row2);
    }
}
