package android.support.constraint.i.j;

import android.support.constraint.i.c;
import android.support.constraint.i.i;
import android.support.constraint.i.j.d;
import java.util.ArrayList;

public class e {
    public static float d0 = 0.5f;
    protected ArrayList<d> A = new ArrayList<>();
    protected b[] B;
    e C;
    int D;
    int E;
    protected float F;
    protected int G;
    protected int H;
    protected int I;
    private int J;
    private int K;
    protected int L;
    protected int M;
    int N;
    protected int O;
    protected int P;
    private int Q;
    private int R;
    float S;
    float T;
    private Object U;
    private int V;
    private String W;
    private String X;
    int Y;
    int Z;

    /* renamed from: a  reason: collision with root package name */
    public int f۶۸۲a = -1;
    float[] a0;

    /* renamed from: b  reason: collision with root package name */
    public int f۶۸۳b = -1;
    protected e[] b0;

    /* renamed from: c  reason: collision with root package name */
    l f۶۸۴c;
    protected e[] c0;

    /* renamed from: d  reason: collision with root package name */
    l f۶۸۵d;

    /* renamed from: e  reason: collision with root package name */
    int f۶۸۶e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f۶۸۷f = 0;

    /* renamed from: g  reason: collision with root package name */
    int[] f۶۸۸g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    int f۶۸۹h = 0;
    int i = 0;
    float j = 1.0f;
    int k = 0;
    int l = 0;
    float m = 1.0f;
    int n = -1;
    float o = 1.0f;
    private int[] p = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float q = 0.0f;
    d r = new d(this, d.EnumC۰۰۲۲d.LEFT);
    d s = new d(this, d.EnumC۰۰۲۲d.TOP);
    d t = new d(this, d.EnumC۰۰۲۲d.RIGHT);
    d u = new d(this, d.EnumC۰۰۲۲d.BOTTOM);
    d v = new d(this, d.EnumC۰۰۲۲d.BASELINE);
    d w = new d(this, d.EnumC۰۰۲۲d.CENTER_X);
    d x = new d(this, d.EnumC۰۰۲۲d.CENTER_Y);
    d y = new d(this, d.EnumC۰۰۲۲d.CENTER);
    protected d[] z = {this.r, this.t, this.s, this.u, this.v, this.y};

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public void f(int maxWidth) {
        this.p[0] = maxWidth;
    }

    public void e(int maxWidth) {
        this.p[1] = maxWidth;
    }

    public boolean A() {
        return this.f۶۸۶e == 0 && this.F == 0.0f && this.f۶۸۹h == 0 && this.i == 0 && this.B[0] == b.MATCH_CONSTRAINT;
    }

    public boolean z() {
        return this.f۶۸۷f == 0 && this.F == 0.0f && this.k == 0 && this.l == 0 && this.B[1] == b.MATCH_CONSTRAINT;
    }

    public void B() {
        this.r.j();
        this.s.j();
        this.t.j();
        this.u.j();
        this.v.j();
        this.w.j();
        this.x.j();
        this.y.j();
        this.C = null;
        this.q = 0.0f;
        this.D = 0;
        this.E = 0;
        this.F = 0.0f;
        this.G = -1;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        float f2 = d0;
        this.S = f2;
        this.T = f2;
        b[] bVarArr = this.B;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.U = null;
        this.V = 0;
        this.X = null;
        this.Y = 0;
        this.Z = 0;
        float[] fArr = this.a0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f۶۸۲a = -1;
        this.f۶۸۳b = -1;
        int[] iArr = this.p;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f۶۸۶e = 0;
        this.f۶۸۷f = 0;
        this.j = 1.0f;
        this.m = 1.0f;
        this.i = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.f۶۸۹h = 0;
        this.k = 0;
        this.n = -1;
        this.o = 1.0f;
        l lVar = this.f۶۸۴c;
        if (lVar != null) {
            lVar.d();
        }
        l lVar2 = this.f۶۸۵d;
        if (lVar2 != null) {
            lVar2.d();
        }
    }

    public void D() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.z[i2].d().d();
        }
    }

    public void G() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.z[i2].d().g();
        }
    }

    public void a(int optimizationLevel) {
        i.a(optimizationLevel, this);
    }

    public void E() {
    }

    public l n() {
        if (this.f۶۸۴c == null) {
            this.f۶۸۴c = new l();
        }
        return this.f۶۸۴c;
    }

    public l m() {
        if (this.f۶۸۵d == null) {
            this.f۶۸۵d = new l();
        }
        return this.f۶۸۵d;
    }

    public e() {
        b bVar = b.FIXED;
        this.B = new b[]{bVar, bVar};
        this.C = null;
        this.D = 0;
        this.E = 0;
        this.F = 0.0f;
        this.G = -1;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        float f2 = d0;
        this.S = f2;
        this.T = f2;
        this.V = 0;
        this.W = null;
        this.X = null;
        this.Y = 0;
        this.Z = 0;
        this.a0 = new float[]{-1.0f, -1.0f};
        this.b0 = new e[]{null, null};
        this.c0 = new e[]{null, null};
        H();
    }

    public void a(c cache) {
        this.r.a(cache);
        this.s.a(cache);
        this.t.a(cache);
        this.u.a(cache);
        this.v.a(cache);
        this.y.a(cache);
        this.w.a(cache);
        this.x.a(cache);
    }

    private void H() {
        this.A.add(this.r);
        this.A.add(this.s);
        this.A.add(this.t);
        this.A.add(this.u);
        this.A.add(this.w);
        this.A.add(this.x);
        this.A.add(this.y);
        this.A.add(this.v);
    }

    public e l() {
        return this.C;
    }

    public void a(e widget) {
        this.C = widget;
    }

    public void b(boolean widthWrapContent) {
    }

    public void a(boolean heightWrapContent) {
    }

    public void a(e target, float angle, int radius) {
        d.EnumC۰۰۲۲d dVar = d.EnumC۰۰۲۲d.CENTER;
        a(dVar, target, dVar, radius, 0);
        this.q = angle;
    }

    public void j(int visibility) {
        this.V = visibility;
    }

    public int s() {
        return this.V;
    }

    public String f() {
        return this.W;
    }

    public void a(String name) {
        this.W = name;
    }

    public void b(android.support.constraint.i.e system) {
        system.a(this.r);
        system.a(this.s);
        system.a(this.t);
        system.a(this.u);
        if (this.N > 0) {
            system.a(this.v);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.X != null) {
            str = "type: " + this.X + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.W != null) {
            str2 = "id: " + this.W + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.H);
        sb.append(", ");
        sb.append(this.I);
        sb.append(") - (");
        sb.append(this.D);
        sb.append(" x ");
        sb.append(this.E);
        sb.append(") wrap: (");
        sb.append(this.Q);
        sb.append(" x ");
        sb.append(this.R);
        sb.append(")");
        return sb.toString();
    }

    public int w() {
        return this.H;
    }

    public int x() {
        return this.I;
    }

    public int t() {
        if (this.V == 8) {
            return 0;
        }
        return this.D;
    }

    public int v() {
        return this.Q;
    }

    public int i() {
        if (this.V == 8) {
            return 0;
        }
        return this.E;
    }

    public int u() {
        return this.R;
    }

    public int g() {
        return this.J + this.L;
    }

    public int h() {
        return this.K + this.M;
    }

    /* access modifiers changed from: protected */
    public int p() {
        return this.H + this.L;
    }

    /* access modifiers changed from: protected */
    public int q() {
        return this.I + this.M;
    }

    public int o() {
        return w() + this.D;
    }

    public int d() {
        return x() + this.E;
    }

    public float j() {
        return this.S;
    }

    public boolean y() {
        return this.N > 0;
    }

    public int c() {
        return this.N;
    }

    public Object e() {
        return this.U;
    }

    public ArrayList<d> b() {
        return this.A;
    }

    public void n(int x2) {
        this.H = x2;
    }

    public void o(int y2) {
        this.I = y2;
    }

    public void c(int x2, int y2) {
        this.H = x2;
        this.I = y2;
    }

    public void b(int x2, int y2) {
        this.L = x2;
        this.M = y2;
    }

    public void F() {
        int left = this.H;
        int top = this.I;
        int i2 = this.H + this.D;
        int i3 = this.I + this.E;
        this.J = left;
        this.K = top;
    }

    public void k(int w2) {
        this.D = w2;
        int i2 = this.D;
        int i3 = this.O;
        if (i2 < i3) {
            this.D = i3;
        }
    }

    public void c(int h2) {
        this.E = h2;
        int i2 = this.E;
        int i3 = this.P;
        if (i2 < i3) {
            this.E = i3;
        }
    }

    public void a(int horizontalMatchStyle, int min, int max, float percent) {
        this.f۶۸۶e = horizontalMatchStyle;
        this.f۶۸۹h = min;
        this.i = max;
        this.j = percent;
        if (percent < 1.0f && this.f۶۸۶e == 0) {
            this.f۶۸۶e = 2;
        }
    }

    public void b(int verticalMatchStyle, int min, int max, float percent) {
        this.f۶۸۷f = verticalMatchStyle;
        this.k = min;
        this.l = max;
        this.m = percent;
        if (percent < 1.0f && this.f۶۸۷f == 0) {
            this.f۶۸۷f = 2;
        }
    }

    public void b(String ratio) {
        int commaIndex;
        if (ratio == null || ratio.length() == 0) {
            this.F = 0.0f;
            return;
        }
        int dimensionRatioSide = -1;
        float dimensionRatio = 0.0f;
        int len = ratio.length();
        int commaIndex2 = ratio.indexOf(44);
        if (commaIndex2 <= 0 || commaIndex2 >= len - 1) {
            commaIndex = 0;
        } else {
            String dimension = ratio.substring(0, commaIndex2);
            if (dimension.equalsIgnoreCase("W")) {
                dimensionRatioSide = 0;
            } else if (dimension.equalsIgnoreCase("H")) {
                dimensionRatioSide = 1;
            }
            commaIndex = commaIndex2 + 1;
        }
        int colonIndex = ratio.indexOf(58);
        if (colonIndex < 0 || colonIndex >= len - 1) {
            String r2 = ratio.substring(commaIndex);
            if (r2.length() > 0) {
                try {
                    dimensionRatio = Float.parseFloat(r2);
                } catch (NumberFormatException e2) {
                }
            }
        } else {
            String nominator = ratio.substring(commaIndex, colonIndex);
            String denominator = ratio.substring(colonIndex + 1);
            if (nominator.length() > 0 && denominator.length() > 0) {
                try {
                    float nominatorValue = Float.parseFloat(nominator);
                    float denominatorValue = Float.parseFloat(denominator);
                    if (nominatorValue > 0.0f && denominatorValue > 0.0f) {
                        dimensionRatio = dimensionRatioSide == 1 ? Math.abs(denominatorValue / nominatorValue) : Math.abs(nominatorValue / denominatorValue);
                    }
                } catch (NumberFormatException e3) {
                }
            }
        }
        if (dimensionRatio > 0.0f) {
            this.F = dimensionRatio;
            this.G = dimensionRatioSide;
        }
    }

    public void a(float horizontalBiasPercent) {
        this.S = horizontalBiasPercent;
    }

    public void c(float verticalBiasPercent) {
        this.T = verticalBiasPercent;
    }

    public void h(int w2) {
        if (w2 < 0) {
            this.O = 0;
        } else {
            this.O = w2;
        }
    }

    public void g(int h2) {
        if (h2 < 0) {
            this.P = 0;
        } else {
            this.P = h2;
        }
    }

    public void m(int w2) {
        this.Q = w2;
    }

    public void l(int h2) {
        this.R = h2;
    }

    public void a(int left, int top, int right, int bottom) {
        int w2 = right - left;
        int h2 = bottom - top;
        this.H = left;
        this.I = top;
        if (this.V == 8) {
            this.D = 0;
            this.E = 0;
            return;
        }
        if (this.B[0] == b.FIXED && w2 < this.D) {
            w2 = this.D;
        }
        if (this.B[1] == b.FIXED && h2 < this.E) {
            h2 = this.E;
        }
        this.D = w2;
        this.E = h2;
        int i2 = this.E;
        int i3 = this.P;
        if (i2 < i3) {
            this.E = i3;
        }
        int i4 = this.D;
        int i5 = this.O;
        if (i4 < i5) {
            this.D = i5;
        }
    }

    public void a(int left, int right) {
        this.H = left;
        this.D = right - left;
        int i2 = this.D;
        int i3 = this.O;
        if (i2 < i3) {
            this.D = i3;
        }
    }

    public void d(int top, int bottom) {
        this.I = top;
        this.E = bottom - top;
        int i2 = this.E;
        int i3 = this.P;
        if (i2 < i3) {
            this.E = i3;
        }
    }

    public void b(int baseline) {
        this.N = baseline;
    }

    public void a(Object companion) {
        this.U = companion;
    }

    public void b(float horizontalWeight) {
        this.a0[0] = horizontalWeight;
    }

    public void d(float verticalWeight) {
        this.a0[1] = verticalWeight;
    }

    public void d(int horizontalChainStyle) {
        this.Y = horizontalChainStyle;
    }

    public void i(int verticalChainStyle) {
        this.Z = verticalChainStyle;
    }

    public boolean a() {
        return this.V != 8;
    }

    public void a(d.EnumC۰۰۲۲d startType, e target, d.EnumC۰۰۲۲d endType, int margin, int goneMargin) {
        a(startType).a(target.a(endType), margin, goneMargin, d.c.STRONG, 0, true);
    }

    public void C() {
        e parent = l();
        if (parent == null || !(parent instanceof f) || !((f) l()).L()) {
            int mAnchorsSize = this.A.size();
            for (int i2 = 0; i2 < mAnchorsSize; i2++) {
                this.A.get(i2).j();
            }
        }
    }

    public d a(d.EnumC۰۰۲۲d anchorType) {
        switch (a.f۶۹۰a[anchorType.ordinal()]) {
            case 1:
                return this.r;
            case 2:
                return this.s;
            case 3:
                return this.t;
            case 4:
                return this.u;
            case 5:
                return this.v;
            case 6:
                return this.y;
            case 7:
                return this.w;
            case 8:
                return this.x;
            case 9:
                return null;
            default:
                throw new AssertionError(anchorType.name());
        }
    }

    public b k() {
        return this.B[0];
    }

    public b r() {
        return this.B[1];
    }

    public void a(b behaviour) {
        this.B[0] = behaviour;
        if (behaviour == b.WRAP_CONTENT) {
            k(this.Q);
        }
    }

    public void b(b behaviour) {
        this.B[1] = behaviour;
        if (behaviour == b.WRAP_CONTENT) {
            c(this.R);
        }
    }

    /* JADX INFO: Multiple debug info for r3v2 int: [D('inHorizontalChain' boolean), D('width' int)] */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01ff, code lost:
        if (r0 == -1) goto L_0x0203;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.support.constraint.i.e r53) {
        /*
        // Method dump skipped, instructions count: 948
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.i.j.e.a(android.support.constraint.i.e):void");
    }

    public void a(boolean hparentWrapContent, boolean vparentWrapContent, boolean horizontalDimensionFixed, boolean verticalDimensionFixed) {
        if (this.n == -1) {
            if (horizontalDimensionFixed && !verticalDimensionFixed) {
                this.n = 0;
            } else if (!horizontalDimensionFixed && verticalDimensionFixed) {
                this.n = 1;
                if (this.G == -1) {
                    this.o = 1.0f / this.o;
                }
            }
        }
        if (this.n == 0 && (!this.s.i() || !this.u.i())) {
            this.n = 1;
        } else if (this.n == 1 && (!this.r.i() || !this.t.i())) {
            this.n = 0;
        }
        if (this.n == -1 && (!this.s.i() || !this.u.i() || !this.r.i() || !this.t.i())) {
            if (this.s.i() && this.u.i()) {
                this.n = 0;
            } else if (this.r.i() && this.t.i()) {
                this.o = 1.0f / this.o;
                this.n = 1;
            }
        }
        if (this.n == -1) {
            if (hparentWrapContent && !vparentWrapContent) {
                this.n = 0;
            } else if (!hparentWrapContent && vparentWrapContent) {
                this.o = 1.0f / this.o;
                this.n = 1;
            }
        }
        if (this.n == -1) {
            if (this.f۶۸۹h > 0 && this.k == 0) {
                this.n = 0;
            } else if (this.f۶۸۹h == 0 && this.k > 0) {
                this.o = 1.0f / this.o;
                this.n = 1;
            }
        }
        if (this.n == -1 && hparentWrapContent && vparentWrapContent) {
            this.o = 1.0f / this.o;
            this.n = 1;
        }
    }

    /* JADX INFO: Multiple debug info for r14v5 'beginTarget'  android.support.constraint.i.i: [D('dimension' int), D('beginTarget' android.support.constraint.i.i)] */
    /* JADX INFO: Multiple debug info for r14v6 'beginTarget'  android.support.constraint.i.i: [D('dimension' int), D('beginTarget' android.support.constraint.i.i)] */
    /* JADX INFO: Multiple debug info for r14v7 'beginTarget'  android.support.constraint.i.i: [D('dimension' int), D('beginTarget' android.support.constraint.i.i)] */
    private void a(android.support.constraint.i.e system, boolean parentWrapContent, i parentMin, i parentMax, b dimensionBehaviour, boolean wrapContent, d beginAnchor, d endAnchor, int beginPosition, int dimension, int minDimension, int maxDimension, float bias, boolean useRatio, boolean inChain, int matchConstraintDefault, int matchMinDimension, int matchMaxDimension, float matchPercentDimension, boolean applyPosition) {
        int matchConstraintDefault2;
        boolean variableSize;
        boolean variableSize2;
        int dimension2;
        i beginTarget;
        i endTarget;
        int matchConstraintDefault3;
        int numConnections;
        int dimension3;
        int matchMaxDimension2;
        int matchMinDimension2;
        i begin;
        i end;
        i end2;
        int i2;
        int i3;
        boolean applyBoundsCheck;
        int centeringStrength;
        i beginTarget2;
        int matchConstraintDefault4;
        boolean matchMinDimension3;
        i end3;
        i begin2;
        i endTarget2;
        int strength;
        int strength2;
        int dimension4;
        i percentEnd;
        i percentEnd2;
        int i4;
        i begin3 = system.a(beginAnchor);
        i end4 = system.a(endAnchor);
        i beginTarget3 = system.a(beginAnchor.g());
        i endTarget3 = system.a(endAnchor.g());
        if (system.f۶۲۶g && beginAnchor.d().f۷۰۷b == 1 && endAnchor.d().f۷۰۷b == 1) {
            if (android.support.constraint.i.e.h() != null) {
                android.support.constraint.i.e.h().r++;
            }
            beginAnchor.d().a(system);
            endAnchor.d().a(system);
            if (!inChain && parentWrapContent) {
                system.b(parentMax, end4, 0, 6);
                return;
            }
            return;
        }
        if (android.support.constraint.i.e.h() != null) {
            android.support.constraint.i.e.h().z++;
        }
        boolean isBeginConnected = beginAnchor.i();
        boolean isEndConnected = endAnchor.i();
        boolean isCenterConnected = this.y.i();
        int numConnections2 = 0;
        if (isBeginConnected) {
            numConnections2 = 0 + 1;
        }
        if (isEndConnected) {
            numConnections2++;
        }
        if (isCenterConnected) {
            numConnections2++;
        }
        if (useRatio) {
            matchConstraintDefault2 = 3;
        } else {
            matchConstraintDefault2 = matchConstraintDefault;
        }
        int i5 = a.f۶۹۱b[dimensionBehaviour.ordinal()];
        if (i5 == 1) {
            variableSize = false;
        } else if (i5 == 2) {
            variableSize = false;
        } else if (i5 == 3) {
            variableSize = false;
        } else if (i5 != 4) {
            variableSize = false;
        } else if (matchConstraintDefault2 == 4) {
            variableSize = false;
        } else {
            variableSize = true;
        }
        if (this.V == 8) {
            dimension2 = 0;
            variableSize2 = false;
        } else {
            dimension2 = dimension;
            variableSize2 = variableSize;
        }
        if (applyPosition) {
            if (!isBeginConnected && !isEndConnected && !isCenterConnected) {
                system.a(begin3, beginPosition);
            } else if (isBeginConnected && !isEndConnected) {
                system.a(begin3, beginTarget3, beginAnchor.b(), 6);
            }
        }
        if (!variableSize2) {
            if (wrapContent) {
                system.a(end4, begin3, 0, 3);
                if (minDimension > 0) {
                    i4 = 6;
                    system.b(end4, begin3, minDimension, 6);
                } else {
                    i4 = 6;
                }
                if (maxDimension < Integer.MAX_VALUE) {
                    system.c(end4, begin3, maxDimension, i4);
                }
            } else {
                system.a(end4, begin3, dimension2, 6);
            }
            matchMinDimension2 = matchMinDimension;
            matchMaxDimension2 = matchMaxDimension;
            dimension3 = dimension2;
            matchConstraintDefault3 = matchConstraintDefault2;
            endTarget = endTarget3;
            beginTarget = beginTarget3;
            numConnections = numConnections2;
        } else {
            int matchMinDimension4 = matchMinDimension;
            if (matchMinDimension4 == -2) {
                matchMinDimension4 = dimension2;
            }
            int matchMaxDimension3 = matchMaxDimension;
            if (matchMaxDimension3 == -2) {
                matchMaxDimension3 = dimension2;
            }
            if (matchMinDimension4 > 0) {
                if (parentWrapContent) {
                    system.b(end4, begin3, matchMinDimension4, 6);
                } else {
                    system.b(end4, begin3, matchMinDimension4, 6);
                }
                dimension2 = Math.max(dimension2, matchMinDimension4);
            }
            if (matchMaxDimension3 > 0) {
                if (parentWrapContent) {
                    system.c(end4, begin3, matchMaxDimension3, 1);
                } else {
                    system.c(end4, begin3, matchMaxDimension3, 6);
                }
                dimension4 = Math.min(dimension2, matchMaxDimension3);
            } else {
                dimension4 = dimension2;
            }
            if (matchConstraintDefault2 == 1) {
                if (parentWrapContent) {
                    system.a(end4, begin3, dimension4, 6);
                    matchConstraintDefault3 = matchConstraintDefault2;
                    dimension3 = dimension4;
                    matchMinDimension2 = matchMinDimension4;
                    matchMaxDimension2 = matchMaxDimension3;
                    beginTarget = beginTarget3;
                    numConnections = numConnections2;
                    endTarget = endTarget3;
                } else if (inChain) {
                    system.a(end4, begin3, dimension4, 4);
                    matchConstraintDefault3 = matchConstraintDefault2;
                    dimension3 = dimension4;
                    matchMinDimension2 = matchMinDimension4;
                    matchMaxDimension2 = matchMaxDimension3;
                    beginTarget = beginTarget3;
                    numConnections = numConnections2;
                    endTarget = endTarget3;
                } else {
                    system.a(end4, begin3, dimension4, 1);
                    matchConstraintDefault3 = matchConstraintDefault2;
                    dimension3 = dimension4;
                    matchMinDimension2 = matchMinDimension4;
                    matchMaxDimension2 = matchMaxDimension3;
                    beginTarget = beginTarget3;
                    numConnections = numConnections2;
                    endTarget = endTarget3;
                }
            } else if (matchConstraintDefault2 == 2) {
                if (beginAnchor.h() == d.EnumC۰۰۲۲d.TOP || beginAnchor.h() == d.EnumC۰۰۲۲d.BOTTOM) {
                    percentEnd = system.a(this.C.a(d.EnumC۰۰۲۲d.TOP));
                    percentEnd2 = system.a(this.C.a(d.EnumC۰۰۲۲d.BOTTOM));
                } else {
                    percentEnd = system.a(this.C.a(d.EnumC۰۰۲۲d.LEFT));
                    percentEnd2 = system.a(this.C.a(d.EnumC۰۰۲۲d.RIGHT));
                }
                android.support.constraint.i.b b2 = system.b();
                matchConstraintDefault3 = matchConstraintDefault2;
                dimension3 = dimension4;
                numConnections = numConnections2;
                matchMinDimension2 = matchMinDimension4;
                matchMaxDimension2 = matchMaxDimension3;
                endTarget = endTarget3;
                beginTarget = beginTarget3;
                b2.a(end4, begin3, percentEnd2, percentEnd, matchPercentDimension);
                system.a(b2);
                variableSize2 = false;
            } else {
                matchConstraintDefault3 = matchConstraintDefault2;
                dimension3 = dimension4;
                matchMinDimension2 = matchMinDimension4;
                matchMaxDimension2 = matchMaxDimension3;
                beginTarget = beginTarget3;
                numConnections = numConnections2;
                endTarget = endTarget3;
            }
            if (variableSize2 && numConnections != 2 && !useRatio) {
                variableSize2 = false;
                int d2 = Math.max(matchMinDimension2, dimension3);
                if (matchMaxDimension2 > 0) {
                    d2 = Math.min(matchMaxDimension2, d2);
                }
                system.a(end4, begin3, d2, 6);
            }
        }
        if (!applyPosition) {
            end = end4;
            begin = begin3;
        } else if (inChain) {
            end = end4;
            begin = begin3;
        } else {
            if (isBeginConnected || isEndConnected || isCenterConnected) {
                if (!isBeginConnected || isEndConnected) {
                    if (!isBeginConnected && isEndConnected) {
                        system.a(end4, endTarget, -endAnchor.b(), 6);
                        if (parentWrapContent) {
                            system.b(begin3, parentMin, 0, 5);
                            end2 = end4;
                            i3 = 0;
                            i2 = 6;
                        } else {
                            end2 = end4;
                            i3 = 0;
                            i2 = 6;
                        }
                    } else if (!isBeginConnected || !isEndConnected) {
                        end2 = end4;
                        i3 = 0;
                        i2 = 6;
                    } else {
                        boolean applyBoundsCheck2 = false;
                        boolean applyCentering = false;
                        if (variableSize2) {
                            if (parentWrapContent) {
                                if (minDimension == 0) {
                                    system.b(end4, begin3, 0, 6);
                                }
                            }
                            matchConstraintDefault4 = matchConstraintDefault3;
                            if (matchConstraintDefault4 == 0) {
                                int strength3 = 6;
                                if (matchMaxDimension2 > 0 || matchMinDimension2 > 0) {
                                    strength3 = 4;
                                    applyBoundsCheck2 = true;
                                }
                                beginTarget2 = beginTarget;
                                system.a(begin3, beginTarget2, beginAnchor.b(), strength3);
                                system.a(end4, endTarget, -endAnchor.b(), strength3);
                                if (matchMaxDimension2 > 0 || matchMinDimension2 > 0) {
                                    applyCentering = true;
                                }
                                applyBoundsCheck = applyBoundsCheck2;
                                matchMinDimension3 = applyCentering;
                                centeringStrength = 5;
                            } else {
                                beginTarget2 = beginTarget;
                                if (matchConstraintDefault4 == 1) {
                                    centeringStrength = 6;
                                    applyBoundsCheck = true;
                                    matchMinDimension3 = true;
                                } else if (matchConstraintDefault4 == 3) {
                                    if (!useRatio) {
                                        strength2 = 4;
                                        if (this.n != -1 && matchMaxDimension2 <= 0) {
                                            strength = 6;
                                            system.a(begin3, beginTarget2, beginAnchor.b(), strength);
                                            system.a(end4, endTarget, -endAnchor.b(), strength);
                                            applyBoundsCheck = true;
                                            matchMinDimension3 = true;
                                            centeringStrength = 5;
                                        }
                                    } else {
                                        strength2 = 4;
                                    }
                                    strength = strength2;
                                    system.a(begin3, beginTarget2, beginAnchor.b(), strength);
                                    system.a(end4, endTarget, -endAnchor.b(), strength);
                                    applyBoundsCheck = true;
                                    matchMinDimension3 = true;
                                    centeringStrength = 5;
                                } else {
                                    applyBoundsCheck = false;
                                    matchMinDimension3 = false;
                                    centeringStrength = 5;
                                }
                            }
                        } else {
                            matchConstraintDefault4 = matchConstraintDefault3;
                            beginTarget2 = beginTarget;
                            if (parentWrapContent) {
                                system.b(begin3, beginTarget2, beginAnchor.b(), 5);
                                system.c(end4, endTarget, -endAnchor.b(), 5);
                            }
                            applyBoundsCheck = false;
                            matchMinDimension3 = true;
                            centeringStrength = 5;
                        }
                        if (matchMinDimension3) {
                            end3 = end4;
                            endTarget2 = endTarget;
                            begin2 = begin3;
                            system.a(begin3, beginTarget2, beginAnchor.b(), bias, endTarget, end4, endAnchor.b(), centeringStrength);
                        } else {
                            end3 = end4;
                            endTarget2 = endTarget;
                            begin2 = begin3;
                        }
                        if (applyBoundsCheck) {
                            i2 = 6;
                            system.b(begin2, beginTarget2, beginAnchor.b(), 6);
                            end2 = end3;
                            system.c(end2, endTarget2, -endAnchor.b(), 6);
                        } else {
                            end2 = end3;
                            i2 = 6;
                        }
                        if (parentWrapContent) {
                            i3 = 0;
                            system.b(begin2, parentMin, 0, i2);
                        } else {
                            i3 = 0;
                        }
                    }
                } else if (parentWrapContent) {
                    system.b(parentMax, end4, 0, 5);
                    end2 = end4;
                    i3 = 0;
                    i2 = 6;
                } else {
                    end2 = end4;
                    i3 = 0;
                    i2 = 6;
                }
            } else if (parentWrapContent) {
                system.b(parentMax, end4, 0, 5);
                end2 = end4;
                i3 = 0;
                i2 = 6;
            } else {
                end2 = end4;
                i3 = 0;
                i2 = 6;
            }
            if (parentWrapContent) {
                system.b(parentMax, end2, i3, i2);
                return;
            }
            return;
        }
        if (numConnections < 2 && parentWrapContent) {
            system.b(begin, parentMin, 0, 6);
            system.b(parentMax, end, 0, 6);
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f۶۹۰a = new int[d.EnumC۰۰۲۲d.values().length];

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f۶۹۱b = new int[b.values().length];

        static {
            try {
                f۶۹۱b[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۶۹۱b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۶۹۱b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f۶۹۱b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۶۹۰a[d.EnumC۰۰۲۲d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f۶۹۰a[d.EnumC۰۰۲۲d.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f۶۹۰a[d.EnumC۰۰۲۲d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f۶۹۰a[d.EnumC۰۰۲۲d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f۶۹۰a[d.EnumC۰۰۲۲d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f۶۹۰a[d.EnumC۰۰۲۲d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f۶۹۰a[d.EnumC۰۰۲۲d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e12) {
            }
            try {
                f۶۹۰a[d.EnumC۰۰۲۲d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e13) {
            }
            try {
                f۶۹۰a[d.EnumC۰۰۲۲d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e14) {
            }
        }
    }

    public void c(android.support.constraint.i.e system) {
        int left = system.b(this.r);
        int top = system.b(this.s);
        int right = system.b(this.t);
        int bottom = system.b(this.u);
        int h2 = bottom - top;
        if (right - left < 0 || h2 < 0 || left == Integer.MIN_VALUE || left == Integer.MAX_VALUE || top == Integer.MIN_VALUE || top == Integer.MAX_VALUE || right == Integer.MIN_VALUE || right == Integer.MAX_VALUE || bottom == Integer.MIN_VALUE || bottom == Integer.MAX_VALUE) {
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
        }
        a(left, top, right, bottom);
    }
}
