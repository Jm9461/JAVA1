package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.d0.c;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.a {
    boolean A = false;
    private BitSet B;
    int C = -1;
    int D = Integer.MIN_VALUE;
    d E = new d();
    private int F = 2;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private int[] O;
    private final Runnable P = new a();
    private int s = -1;
    f[] t;
    t0 u;
    t0 v;
    private int w;
    private int x;
    private final n0 y;
    boolean z = false;

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.F();
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        RecyclerView.o.d properties = RecyclerView.o.a(context, attrs, defStyleAttr, defStyleRes);
        i(properties.f۱۸۷۰a);
        j(properties.f۱۸۷۱b);
        c(properties.f۱۸۷۲c);
        this.y = new n0();
        M();
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public boolean u() {
        return this.F != 0;
    }

    private void M() {
        this.u = t0.a(this, this.w);
        this.v = t0.a(this, 1 - this.w);
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        int maxPos;
        int minPos;
        if (e() == 0 || this.F == 0 || !t()) {
            return false;
        }
        if (this.A) {
            minPos = I();
            maxPos = H();
        } else {
            minPos = H();
            maxPos = I();
        }
        if (minPos == 0 && J() != null) {
            this.E.a();
            z();
            y();
            return true;
        } else if (!this.M) {
            return false;
        } else {
            int invalidGapDir = this.A ? -1 : 1;
            d.a invalidFsi = this.E.a(minPos, maxPos + 1, invalidGapDir, true);
            if (invalidFsi == null) {
                this.M = false;
                this.E.b(maxPos + 1);
                return false;
            }
            d.a validFsi = this.E.a(minPos, invalidFsi.f۱۹۳۰c, invalidGapDir * -1, true);
            if (validFsi == null) {
                this.E.b(invalidFsi.f۱۹۳۰c);
            } else {
                this.E.b(validFsi.f۱۹۳۰c + 1);
            }
            z();
            y();
            return true;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void f(int state) {
        if (state == 0) {
            F();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void b(RecyclerView view, RecyclerView.v recycler) {
        super.b(view, recycler);
        a(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].c();
        }
        view.requestLayout();
    }

    /* access modifiers changed from: package-private */
    public View J() {
        int childLimit;
        int firstChildIndex;
        int endChildIndex = e() - 1;
        BitSet mSpansToCheck = new BitSet(this.s);
        mSpansToCheck.set(0, this.s, true);
        int nextChildDiff = -1;
        int preferredSpanDir = (this.w != 1 || !L()) ? -1 : 1;
        if (this.A) {
            firstChildIndex = endChildIndex;
            childLimit = 0 - 1;
        } else {
            firstChildIndex = 0;
            childLimit = endChildIndex + 1;
        }
        if (firstChildIndex < childLimit) {
            nextChildDiff = 1;
        }
        for (int i = firstChildIndex; i != childLimit; i += nextChildDiff) {
            View child = c(i);
            c lp = (c) child.getLayoutParams();
            if (mSpansToCheck.get(lp.f۱۹۲۶e.f۱۹۴۴e)) {
                if (a(lp.f۱۹۲۶e)) {
                    return child;
                }
                mSpansToCheck.clear(lp.f۱۹۲۶e.f۱۹۴۴e);
            }
            if (!lp.f۱۹۲۷f && i + nextChildDiff != childLimit) {
                View nextChild = c(i + nextChildDiff);
                boolean compareSpans = false;
                if (this.A) {
                    int myEnd = this.u.a(child);
                    int nextEnd = this.u.a(nextChild);
                    if (myEnd < nextEnd) {
                        return child;
                    }
                    if (myEnd == nextEnd) {
                        compareSpans = true;
                    }
                } else {
                    int myStart = this.u.d(child);
                    int nextStart = this.u.d(nextChild);
                    if (myStart > nextStart) {
                        return child;
                    }
                    if (myStart == nextStart) {
                        compareSpans = true;
                    }
                }
                if (!compareSpans) {
                    continue;
                } else {
                    if ((lp.f۱۹۲۶e.f۱۹۴۴e - ((c) nextChild.getLayoutParams()).f۱۹۲۶e.f۱۹۴۴e < 0) != (preferredSpanDir < 0)) {
                        return child;
                    }
                }
            }
        }
        return null;
    }

    private boolean a(f span) {
        if (this.A) {
            if (span.g() < this.u.b()) {
                ArrayList<View> arrayList = span.f۱۹۴۰a;
                return !span.b(arrayList.get(arrayList.size() - 1)).f۱۹۲۷f;
            }
        } else if (span.h() > this.u.f()) {
            return !span.b(span.f۱۹۴۰a.get(0)).f۱۹۲۷f;
        }
        return false;
    }

    public void j(int spanCount) {
        a((String) null);
        if (spanCount != this.s) {
            K();
            this.s = spanCount;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int i = 0; i < this.s; i++) {
                this.t[i] = new f(i);
            }
            y();
        }
    }

    public void i(int orientation) {
        if (orientation == 0 || orientation == 1) {
            a((String) null);
            if (orientation != this.w) {
                this.w = orientation;
                t0 tmp = this.u;
                this.u = this.v;
                this.v = tmp;
                y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void c(boolean reverseLayout) {
        a((String) null);
        e eVar = this.I;
        if (!(eVar == null || eVar.j == reverseLayout)) {
            eVar.j = reverseLayout;
        }
        this.z = reverseLayout;
        y();
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(String message) {
        if (this.I == null) {
            super.a(message);
        }
    }

    public void K() {
        this.E.a();
        y();
    }

    private void O() {
        if (this.w == 1 || !L()) {
            this.A = this.z;
        } else {
            this.A = !this.z;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean L() {
        return j() == 1;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(Rect childrenBounds, int wSpec, int hSpec) {
        int width;
        int usedHeight;
        int horizontalPadding = n() + o();
        int verticalPadding = p() + m();
        if (this.w == 1) {
            width = RecyclerView.o.a(hSpec, childrenBounds.height() + verticalPadding, k());
            usedHeight = RecyclerView.o.a(wSpec, (this.x * this.s) + horizontalPadding, l());
        } else {
            int width2 = RecyclerView.o.a(wSpec, childrenBounds.width() + horizontalPadding, l());
            width = RecyclerView.o.a(hSpec, (this.x * this.s) + verticalPadding, k());
            usedHeight = width2;
        }
        c(usedHeight, width);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void e(RecyclerView.v recycler, RecyclerView.a0 state) {
        c(recycler, state, true);
    }

    private void c(RecyclerView.v recycler, RecyclerView.a0 state, boolean shouldCheckForGaps) {
        e eVar;
        b anchorInfo = this.L;
        if (!(this.I == null && this.C == -1) && state.a() == 0) {
            b(recycler);
            anchorInfo.b();
            return;
        }
        boolean needToCheckForGaps = true;
        boolean recalculateAnchor = (anchorInfo.f۱۹۲۳e && this.C == -1 && this.I == null) ? false : true;
        if (recalculateAnchor) {
            anchorInfo.b();
            if (this.I != null) {
                a(anchorInfo);
            } else {
                O();
                anchorInfo.f۱۹۲۱c = this.A;
            }
            b(state, anchorInfo);
            anchorInfo.f۱۹۲۳e = true;
        }
        if (this.I == null && this.C == -1 && !(anchorInfo.f۱۹۲۱c == this.G && L() == this.H)) {
            this.E.a();
            anchorInfo.f۱۹۲۲d = true;
        }
        if (e() > 0 && ((eVar = this.I) == null || eVar.f۱۹۳۶e < 1)) {
            if (anchorInfo.f۱۹۲۲d) {
                for (int i = 0; i < this.s; i++) {
                    this.t[i].c();
                    int i2 = anchorInfo.f۱۹۲۰b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.t[i].d(i2);
                    }
                }
            } else if (recalculateAnchor || this.L.f۱۹۲۴f == null) {
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].a(this.A, anchorInfo.f۱۹۲۰b);
                }
                this.L.a(this.t);
            } else {
                for (int i4 = 0; i4 < this.s; i4++) {
                    f span = this.t[i4];
                    span.c();
                    span.d(this.L.f۱۹۲۴f[i4]);
                }
            }
        }
        a(recycler);
        this.y.f۲۱۸۲a = false;
        this.M = false;
        k(this.v.g());
        b(anchorInfo.f۱۹۱۹a, state);
        if (anchorInfo.f۱۹۲۱c) {
            w(-1);
            a(recycler, this.y, state);
            w(1);
            n0 n0Var = this.y;
            n0Var.f۲۱۸۴c = anchorInfo.f۱۹۱۹a + n0Var.f۲۱۸۵d;
            a(recycler, n0Var, state);
        } else {
            w(1);
            a(recycler, this.y, state);
            w(-1);
            n0 n0Var2 = this.y;
            n0Var2.f۲۱۸۴c = anchorInfo.f۱۹۱۹a + n0Var2.f۲۱۸۵d;
            a(recycler, n0Var2, state);
        }
        N();
        if (e() > 0) {
            if (this.A) {
                a(recycler, state, true);
                b(recycler, state, false);
            } else {
                b(recycler, state, true);
                a(recycler, state, false);
            }
        }
        boolean hasGaps = false;
        if (shouldCheckForGaps && !state.d()) {
            if (this.F == 0 || e() <= 0 || (!this.M && J() == null)) {
                needToCheckForGaps = false;
            }
            if (needToCheckForGaps) {
                a(this.P);
                if (F()) {
                    hasGaps = true;
                }
            }
        }
        if (state.d()) {
            this.L.b();
        }
        this.G = anchorInfo.f۱۹۲۱c;
        this.H = L();
        if (hasGaps) {
            this.L.b();
            c(recycler, state, false);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void g(RecyclerView.a0 state) {
        super.g(state);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.b();
    }

    /* JADX INFO: Multiple debug info for r2v2 int: [D('i' int), D('before' int)] */
    private void N() {
        if (this.v.d() != 1073741824) {
            float maxSize = 0.0f;
            int childCount = e();
            for (int i = 0; i < childCount; i++) {
                View child = c(i);
                float size = (float) this.v.b(child);
                if (size >= maxSize) {
                    if (((c) child.getLayoutParams()).f()) {
                        size = (1.0f * size) / ((float) this.s);
                    }
                    maxSize = Math.max(maxSize, size);
                }
            }
            int before = this.x;
            int desired = Math.round(((float) this.s) * maxSize);
            if (this.v.d() == Integer.MIN_VALUE) {
                desired = Math.min(desired, this.v.g());
            }
            k(desired);
            if (this.x != before) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    View child2 = c(i2);
                    c lp = (c) child2.getLayoutParams();
                    if (!lp.f۱۹۲۷f) {
                        if (!L() || this.w != 1) {
                            int i3 = lp.f۱۹۲۶e.f۱۹۴۴e;
                            int newOffset = this.x * i3;
                            int prevOffset = i3 * before;
                            if (this.w == 1) {
                                child2.offsetLeftAndRight(newOffset - prevOffset);
                            } else {
                                child2.offsetTopAndBottom(newOffset - prevOffset);
                            }
                        } else {
                            int i4 = this.s;
                            int i5 = lp.f۱۹۲۶e.f۱۹۴۴e;
                            child2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.x) - ((-((i4 - 1) - i5)) * before));
                        }
                    }
                }
            }
        }
    }

    private void a(b anchorInfo) {
        e eVar = this.I;
        int i = eVar.f۱۹۳۶e;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].c();
                    e eVar2 = this.I;
                    int line = eVar2.f۱۹۳۷f[i2];
                    if (line != Integer.MIN_VALUE) {
                        if (eVar2.k) {
                            line += this.u.b();
                        } else {
                            line += this.u.f();
                        }
                    }
                    this.t[i2].d(line);
                }
            } else {
                eVar.b();
                e eVar3 = this.I;
                eVar3.f۱۹۳۴c = eVar3.f۱۹۳۵d;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.l;
        c(eVar4.j);
        O();
        e eVar5 = this.I;
        int i3 = eVar5.f۱۹۳۴c;
        if (i3 != -1) {
            this.C = i3;
            anchorInfo.f۱۹۲۱c = eVar5.k;
        } else {
            anchorInfo.f۱۹۲۱c = this.A;
        }
        e eVar6 = this.I;
        if (eVar6.f۱۹۳۸g > 1) {
            d dVar = this.E;
            dVar.f۱۹۲۸a = eVar6.f۱۹۳۹h;
            dVar.f۱۹۲۹b = eVar6.i;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.a0 state, b anchorInfo) {
        if (!a(state, anchorInfo) && !c(state, anchorInfo)) {
            anchorInfo.a();
            anchorInfo.f۱۹۱۹a = 0;
        }
    }

    private boolean c(RecyclerView.a0 state, b anchorInfo) {
        int i;
        if (this.G) {
            i = q(state.a());
        } else {
            i = p(state.a());
        }
        anchorInfo.f۱۹۱۹a = i;
        anchorInfo.f۱۹۲۰b = Integer.MIN_VALUE;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.a0 state, b anchorInfo) {
        int i;
        int i2;
        int i3;
        boolean z2 = false;
        if (state.d() || (i = this.C) == -1) {
            return false;
        }
        if (i < 0 || i >= state.a()) {
            this.C = -1;
            this.D = Integer.MIN_VALUE;
            return false;
        }
        e eVar = this.I;
        if (eVar == null || eVar.f۱۹۳۴c == -1 || eVar.f۱۹۳۶e < 1) {
            View child = b(this.C);
            if (child != null) {
                if (this.A) {
                    i2 = I();
                } else {
                    i2 = H();
                }
                anchorInfo.f۱۹۱۹a = i2;
                if (this.D != Integer.MIN_VALUE) {
                    if (anchorInfo.f۱۹۲۱c) {
                        anchorInfo.f۱۹۲۰b = (this.u.b() - this.D) - this.u.a(child);
                    } else {
                        anchorInfo.f۱۹۲۰b = (this.u.f() + this.D) - this.u.d(child);
                    }
                    return true;
                } else if (this.u.b(child) > this.u.g()) {
                    if (anchorInfo.f۱۹۲۱c) {
                        i3 = this.u.b();
                    } else {
                        i3 = this.u.f();
                    }
                    anchorInfo.f۱۹۲۰b = i3;
                    return true;
                } else {
                    int startGap = this.u.d(child) - this.u.f();
                    if (startGap < 0) {
                        anchorInfo.f۱۹۲۰b = -startGap;
                        return true;
                    }
                    int endGap = this.u.b() - this.u.a(child);
                    if (endGap < 0) {
                        anchorInfo.f۱۹۲۰b = endGap;
                        return true;
                    }
                    anchorInfo.f۱۹۲۰b = Integer.MIN_VALUE;
                }
            } else {
                anchorInfo.f۱۹۱۹a = this.C;
                int i4 = this.D;
                if (i4 == Integer.MIN_VALUE) {
                    if (l(anchorInfo.f۱۹۱۹a) == 1) {
                        z2 = true;
                    }
                    anchorInfo.f۱۹۲۱c = z2;
                    anchorInfo.a();
                } else {
                    anchorInfo.a(i4);
                }
                anchorInfo.f۱۹۲۲d = true;
            }
        } else {
            anchorInfo.f۱۹۲۰b = Integer.MIN_VALUE;
            anchorInfo.f۱۹۱۹a = this.C;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void k(int totalSpace) {
        this.x = totalSpace / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(totalSpace, this.v.d());
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public boolean C() {
        return this.I == null;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int b(RecyclerView.a0 state) {
        return i(state);
    }

    private int i(RecyclerView.a0 state) {
        if (e() == 0) {
            return 0;
        }
        return a1.a(state, this.u, b(!this.N), a(!this.N), this, this.N, this.A);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int e(RecyclerView.a0 state) {
        return i(state);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int a(RecyclerView.a0 state) {
        return h(state);
    }

    private int h(RecyclerView.a0 state) {
        if (e() == 0) {
            return 0;
        }
        return a1.a(state, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int d(RecyclerView.a0 state) {
        return h(state);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int c(RecyclerView.a0 state) {
        return j(state);
    }

    private int j(RecyclerView.a0 state) {
        if (e() == 0) {
            return 0;
        }
        return a1.b(state, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int f(RecyclerView.a0 state) {
        return j(state);
    }

    private void a(View child, c lp, boolean alreadyMeasured) {
        if (lp.f۱۹۲۷f) {
            if (this.w == 1) {
                a(child, this.J, RecyclerView.o.a(h(), i(), p() + m(), ((ViewGroup.MarginLayoutParams) lp).height, true), alreadyMeasured);
            } else {
                a(child, RecyclerView.o.a(q(), r(), n() + o(), ((ViewGroup.MarginLayoutParams) lp).width, true), this.J, alreadyMeasured);
            }
        } else if (this.w == 1) {
            a(child, RecyclerView.o.a(this.x, r(), 0, ((ViewGroup.MarginLayoutParams) lp).width, false), RecyclerView.o.a(h(), i(), p() + m(), ((ViewGroup.MarginLayoutParams) lp).height, true), alreadyMeasured);
        } else {
            a(child, RecyclerView.o.a(q(), r(), n() + o(), ((ViewGroup.MarginLayoutParams) lp).width, true), RecyclerView.o.a(this.x, i(), 0, ((ViewGroup.MarginLayoutParams) lp).height, false), alreadyMeasured);
        }
    }

    private void a(View child, int widthSpec, int heightSpec, boolean alreadyMeasured) {
        boolean measure;
        a(child, this.K);
        c lp = (c) child.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) lp).leftMargin;
        Rect rect = this.K;
        int widthSpec2 = c(widthSpec, i + rect.left, ((ViewGroup.MarginLayoutParams) lp).rightMargin + rect.right);
        int i2 = ((ViewGroup.MarginLayoutParams) lp).topMargin;
        Rect rect2 = this.K;
        int heightSpec2 = c(heightSpec, i2 + rect2.top, ((ViewGroup.MarginLayoutParams) lp).bottomMargin + rect2.bottom);
        if (alreadyMeasured) {
            measure = b(child, widthSpec2, heightSpec2, lp);
        } else {
            measure = a(child, widthSpec2, heightSpec2, lp);
        }
        if (measure) {
            child.measure(widthSpec2, heightSpec2);
        }
    }

    private int c(int spec, int startInset, int endInset) {
        if (startInset == 0 && endInset == 0) {
            return spec;
        }
        int mode = View.MeasureSpec.getMode(spec);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(spec) - startInset) - endInset), mode);
        }
        return spec;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(Parcelable state) {
        if (state instanceof e) {
            this.I = (e) state;
            y();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public Parcelable x() {
        int i;
        int line;
        int[] iArr;
        e eVar = this.I;
        if (eVar != null) {
            return new e(eVar);
        }
        e state = new e();
        state.j = this.z;
        state.k = this.G;
        state.l = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f۱۹۲۸a) == null) {
            state.f۱۹۳۸g = 0;
        } else {
            state.f۱۹۳۹h = iArr;
            state.f۱۹۳۸g = state.f۱۹۳۹h.length;
            state.i = dVar.f۱۹۲۹b;
        }
        if (e() > 0) {
            if (this.G) {
                i = I();
            } else {
                i = H();
            }
            state.f۱۹۳۴c = i;
            state.f۱۹۳۵d = G();
            int i2 = this.s;
            state.f۱۹۳۶e = i2;
            state.f۱۹۳۷f = new int[i2];
            for (int i3 = 0; i3 < this.s; i3++) {
                if (this.G) {
                    line = this.t[i3].a(Integer.MIN_VALUE);
                    if (line != Integer.MIN_VALUE) {
                        line -= this.u.b();
                    }
                } else {
                    line = this.t[i3].b(Integer.MIN_VALUE);
                    if (line != Integer.MIN_VALUE) {
                        line -= this.u.f();
                    }
                }
                state.f۱۹۳۷f[i3] = line;
            }
        } else {
            state.f۱۹۳۴c = -1;
            state.f۱۹۳۵d = -1;
            state.f۱۹۳۶e = 0;
        }
        return state;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(RecyclerView.v recycler, RecyclerView.a0 state, View host, android.support.v4.view.d0.c info2) {
        ViewGroup.LayoutParams lp = host.getLayoutParams();
        if (!(lp instanceof c)) {
            super.a(host, info2);
            return;
        }
        c sglp = (c) lp;
        if (this.w == 0) {
            info2.b(c.C۰۰۳۲c.a(sglp.e(), sglp.f۱۹۲۷f ? this.s : 1, -1, -1, sglp.f۱۹۲۷f, false));
        } else {
            info2.b(c.C۰۰۳۲c.a(-1, -1, sglp.e(), sglp.f۱۹۲۷f ? this.s : 1, sglp.f۱۹۲۷f, false));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(AccessibilityEvent event) {
        super.a(event);
        if (e() > 0) {
            View start = b(false);
            View end = a(false);
            if (start != null && end != null) {
                int startPos = l(start);
                int endPos = l(end);
                if (startPos < endPos) {
                    event.setFromIndex(startPos);
                    event.setToIndex(endPos);
                    return;
                }
                event.setFromIndex(endPos);
                event.setToIndex(startPos);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int G() {
        View first;
        if (this.A) {
            first = a(true);
        } else {
            first = b(true);
        }
        if (first == null) {
            return -1;
        }
        return l(first);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int b(RecyclerView.v recycler, RecyclerView.a0 state) {
        if (this.w == 0) {
            return this.s;
        }
        return super.b(recycler, state);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int a(RecyclerView.v recycler, RecyclerView.a0 state) {
        if (this.w == 1) {
            return this.s;
        }
        return super.a(recycler, state);
    }

    /* access modifiers changed from: package-private */
    public View b(boolean fullyVisible) {
        int boundsStart = this.u.f();
        int boundsEnd = this.u.b();
        int limit = e();
        View partiallyVisible = null;
        for (int i = 0; i < limit; i++) {
            View child = c(i);
            int childStart = this.u.d(child);
            if (this.u.a(child) > boundsStart && childStart < boundsEnd) {
                if (childStart >= boundsStart || !fullyVisible) {
                    return child;
                }
                if (partiallyVisible == null) {
                    partiallyVisible = child;
                }
            }
        }
        return partiallyVisible;
    }

    /* access modifiers changed from: package-private */
    public View a(boolean fullyVisible) {
        int boundsStart = this.u.f();
        int boundsEnd = this.u.b();
        View partiallyVisible = null;
        for (int i = e() - 1; i >= 0; i--) {
            View child = c(i);
            int childStart = this.u.d(child);
            int childEnd = this.u.a(child);
            if (childEnd > boundsStart && childStart < boundsEnd) {
                if (childEnd <= boundsEnd || !fullyVisible) {
                    return child;
                }
                if (partiallyVisible == null) {
                    partiallyVisible = child;
                }
            }
        }
        return partiallyVisible;
    }

    private void a(RecyclerView.v recycler, RecyclerView.a0 state, boolean canOffsetChildren) {
        int gap;
        int maxEndLine = r(Integer.MIN_VALUE);
        if (maxEndLine != Integer.MIN_VALUE && (gap = this.u.b() - maxEndLine) > 0) {
            int gap2 = gap - (-c(-gap, recycler, state));
            if (canOffsetChildren && gap2 > 0) {
                this.u.a(gap2);
            }
        }
    }

    private void b(RecyclerView.v recycler, RecyclerView.a0 state, boolean canOffsetChildren) {
        int gap;
        int minStartLine = u(Integer.MAX_VALUE);
        if (minStartLine != Integer.MAX_VALUE && (gap = minStartLine - this.u.f()) > 0) {
            int gap2 = gap - c(gap, recycler, state);
            if (canOffsetChildren && gap2 > 0) {
                this.u.a(-gap2);
            }
        }
    }

    private void b(int anchorPosition, RecyclerView.a0 state) {
        int targetPos;
        n0 n0Var = this.y;
        boolean z2 = false;
        n0Var.f۲۱۸۳b = 0;
        n0Var.f۲۱۸۴c = anchorPosition;
        int startExtra = 0;
        int endExtra = 0;
        if (w() && (targetPos = state.b()) != -1) {
            if (this.A == (targetPos < anchorPosition)) {
                endExtra = this.u.g();
            } else {
                startExtra = this.u.g();
            }
        }
        if (f()) {
            this.y.f۲۱۸۷f = this.u.f() - startExtra;
            this.y.f۲۱۸۸g = this.u.b() + endExtra;
        } else {
            this.y.f۲۱۸۸g = this.u.a() + endExtra;
            this.y.f۲۱۸۷f = -startExtra;
        }
        n0 n0Var2 = this.y;
        n0Var2.f۲۱۸۹h = false;
        n0Var2.f۲۱۸۲a = true;
        if (this.u.d() == 0 && this.u.a() == 0) {
            z2 = true;
        }
        n0Var2.i = z2;
    }

    private void w(int direction) {
        n0 n0Var = this.y;
        n0Var.f۲۱۸۶e = direction;
        int i = 1;
        if (this.A != (direction == -1)) {
            i = -1;
        }
        n0Var.f۲۱۸۵d = i;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void d(int dx) {
        super.d(dx);
        for (int i = 0; i < this.s; i++) {
            this.t[i].c(dx);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void e(int dy) {
        super.e(dy);
        for (int i = 0; i < this.s; i++) {
            this.t[i].c(dy);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void b(RecyclerView recyclerView, int positionStart, int itemCount) {
        b(positionStart, itemCount, 2);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int positionStart, int itemCount) {
        b(positionStart, itemCount, 1);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void d(RecyclerView recyclerView) {
        this.E.a();
        y();
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int from, int to, int itemCount) {
        b(from, to, 8);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
        b(positionStart, itemCount, 4);
    }

    private void b(int positionStart, int itemCountOrToPosition, int cmd) {
        int affectedRangeStart;
        int affectedRangeEnd;
        int minPosition = this.A ? I() : H();
        if (cmd != 8) {
            affectedRangeStart = positionStart;
            affectedRangeEnd = positionStart + itemCountOrToPosition;
        } else if (positionStart < itemCountOrToPosition) {
            affectedRangeEnd = itemCountOrToPosition + 1;
            affectedRangeStart = positionStart;
        } else {
            affectedRangeEnd = positionStart + 1;
            affectedRangeStart = itemCountOrToPosition;
        }
        this.E.e(affectedRangeStart);
        if (cmd == 1) {
            this.E.a(positionStart, itemCountOrToPosition);
        } else if (cmd == 2) {
            this.E.b(positionStart, itemCountOrToPosition);
        } else if (cmd == 8) {
            this.E.b(positionStart, 1);
            this.E.a(itemCountOrToPosition, 1);
        }
        if (affectedRangeEnd > minPosition) {
            if (affectedRangeStart <= (this.A ? H() : I())) {
                y();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(android.support.v7.widget.RecyclerView.v r23, android.support.v7.widget.n0 r24, android.support.v7.widget.RecyclerView.a0 r25) {
        /*
        // Method dump skipped, instructions count: 562
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.a(android.support.v7.widget.RecyclerView$v, android.support.v7.widget.n0, android.support.v7.widget.RecyclerView$a0):int");
    }

    private d.a n(int newItemTop) {
        d.a fsi = new d.a();
        fsi.f۱۹۳۲e = new int[this.s];
        for (int i = 0; i < this.s; i++) {
            fsi.f۱۹۳۲e[i] = newItemTop - this.t[i].a(newItemTop);
        }
        return fsi;
    }

    private d.a o(int newItemBottom) {
        d.a fsi = new d.a();
        fsi.f۱۹۳۲e = new int[this.s];
        for (int i = 0; i < this.s; i++) {
            fsi.f۱۹۳۲e[i] = this.t[i].b(newItemBottom) - newItemBottom;
        }
        return fsi;
    }

    private void a(View view, c lp, n0 layoutState) {
        if (layoutState.f۲۱۸۶e == 1) {
            if (lp.f۱۹۲۷f) {
                p(view);
            } else {
                lp.f۱۹۲۶e.a(view);
            }
        } else if (lp.f۱۹۲۷f) {
            q(view);
        } else {
            lp.f۱۹۲۶e.c(view);
        }
    }

    private void a(RecyclerView.v recycler, n0 layoutState) {
        int line;
        int line2;
        if (layoutState.f۲۱۸۲a && !layoutState.i) {
            if (layoutState.f۲۱۸۳b == 0) {
                if (layoutState.f۲۱۸۶e == -1) {
                    a(recycler, layoutState.f۲۱۸۸g);
                } else {
                    b(recycler, layoutState.f۲۱۸۷f);
                }
            } else if (layoutState.f۲۱۸۶e == -1) {
                int i = layoutState.f۲۱۸۷f;
                int scrolled = i - s(i);
                if (scrolled < 0) {
                    line2 = layoutState.f۲۱۸۸g;
                } else {
                    line2 = layoutState.f۲۱۸۸g - Math.min(scrolled, layoutState.f۲۱۸۳b);
                }
                a(recycler, line2);
            } else {
                int scrolled2 = t(layoutState.f۲۱۸۸g) - layoutState.f۲۱۸۸g;
                if (scrolled2 < 0) {
                    line = layoutState.f۲۱۸۷f;
                } else {
                    line = layoutState.f۲۱۸۷f + Math.min(scrolled2, layoutState.f۲۱۸۳b);
                }
                b(recycler, line);
            }
        }
    }

    private void p(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    private void q(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].c(view);
        }
    }

    private void e(int layoutDir, int targetLine) {
        for (int i = 0; i < this.s; i++) {
            if (!this.t[i].f۱۹۴۰a.isEmpty()) {
                a(this.t[i], layoutDir, targetLine);
            }
        }
    }

    private void a(f span, int layoutDir, int targetLine) {
        int deletedSize = span.f();
        if (layoutDir == -1) {
            if (span.h() + deletedSize <= targetLine) {
                this.B.set(span.f۱۹۴۴e, false);
            }
        } else if (span.g() - deletedSize >= targetLine) {
            this.B.set(span.f۱۹۴۴e, false);
        }
    }

    private int s(int def) {
        int maxStart = this.t[0].b(def);
        for (int i = 1; i < this.s; i++) {
            int spanStart = this.t[i].b(def);
            if (spanStart > maxStart) {
                maxStart = spanStart;
            }
        }
        return maxStart;
    }

    private int u(int def) {
        int minStart = this.t[0].b(def);
        for (int i = 1; i < this.s; i++) {
            int spanStart = this.t[i].b(def);
            if (spanStart < minStart) {
                minStart = spanStart;
            }
        }
        return minStart;
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        int end = this.t[0].a(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].a(Integer.MIN_VALUE) != end) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        int start = this.t[0].b(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].b(Integer.MIN_VALUE) != start) {
                return false;
            }
        }
        return true;
    }

    private int r(int def) {
        int maxEnd = this.t[0].a(def);
        for (int i = 1; i < this.s; i++) {
            int spanEnd = this.t[i].a(def);
            if (spanEnd > maxEnd) {
                maxEnd = spanEnd;
            }
        }
        return maxEnd;
    }

    private int t(int def) {
        int minEnd = this.t[0].a(def);
        for (int i = 1; i < this.s; i++) {
            int spanEnd = this.t[i].a(def);
            if (spanEnd < minEnd) {
                minEnd = spanEnd;
            }
        }
        return minEnd;
    }

    private void b(RecyclerView.v recycler, int line) {
        while (e() > 0) {
            View child = c(0);
            if (this.u.a(child) <= line && this.u.e(child) <= line) {
                c lp = (c) child.getLayoutParams();
                if (lp.f۱۹۲۷f) {
                    for (int j = 0; j < this.s; j++) {
                        if (this.t[j].f۱۹۴۰a.size() == 1) {
                            return;
                        }
                    }
                    for (int j2 = 0; j2 < this.s; j2++) {
                        this.t[j2].k();
                    }
                } else if (lp.f۱۹۲۶e.f۱۹۴۰a.size() != 1) {
                    lp.f۱۹۲۶e.k();
                } else {
                    return;
                }
                a(child, recycler);
            } else {
                return;
            }
        }
    }

    private void a(RecyclerView.v recycler, int line) {
        for (int i = e() - 1; i >= 0; i--) {
            View child = c(i);
            if (this.u.d(child) >= line && this.u.f(child) >= line) {
                c lp = (c) child.getLayoutParams();
                if (lp.f۱۹۲۷f) {
                    for (int j = 0; j < this.s; j++) {
                        if (this.t[j].f۱۹۴۰a.size() == 1) {
                            return;
                        }
                    }
                    for (int j2 = 0; j2 < this.s; j2++) {
                        this.t[j2].j();
                    }
                } else if (lp.f۱۹۲۶e.f۱۹۴۰a.size() != 1) {
                    lp.f۱۹۲۶e.j();
                } else {
                    return;
                }
                a(child, recycler);
            } else {
                return;
            }
        }
    }

    private boolean v(int layoutDir) {
        if (this.w == 0) {
            if ((layoutDir == -1) != this.A) {
                return true;
            }
            return false;
        }
        if (((layoutDir == -1) == this.A) == L()) {
            return true;
        }
        return false;
    }

    private f a(n0 layoutState) {
        int diff;
        int endIndex;
        int startIndex;
        if (v(layoutState.f۲۱۸۶e)) {
            startIndex = this.s - 1;
            endIndex = -1;
            diff = -1;
        } else {
            startIndex = 0;
            endIndex = this.s;
            diff = 1;
        }
        if (layoutState.f۲۱۸۶e == 1) {
            f min = null;
            int minLine = Integer.MAX_VALUE;
            int defaultLine = this.u.f();
            for (int i = startIndex; i != endIndex; i += diff) {
                f other = this.t[i];
                int otherLine = other.a(defaultLine);
                if (otherLine < minLine) {
                    min = other;
                    minLine = otherLine;
                }
            }
            return min;
        }
        f max = null;
        int maxLine = Integer.MIN_VALUE;
        int defaultLine2 = this.u.b();
        for (int i2 = startIndex; i2 != endIndex; i2 += diff) {
            f other2 = this.t[i2];
            int otherLine2 = other2.b(defaultLine2);
            if (otherLine2 > maxLine) {
                max = other2;
                maxLine = otherLine2;
            }
        }
        return max;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public boolean b() {
        return this.w == 1;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public boolean a() {
        return this.w == 0;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int a(int dx, RecyclerView.v recycler, RecyclerView.a0 state) {
        return c(dx, recycler, state);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int b(int dy, RecyclerView.v recycler, RecyclerView.a0 state) {
        return c(dy, recycler, state);
    }

    private int l(int position) {
        if (e() != 0) {
            if ((position < H()) != this.A) {
                return -1;
            }
            return 1;
        } else if (this.A) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void h(int position) {
        e eVar = this.I;
        if (!(eVar == null || eVar.f۱۹۳۴c == position)) {
            eVar.a();
        }
        this.C = position;
        this.D = Integer.MIN_VALUE;
        y();
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(int dx, int dy, RecyclerView.a0 state, RecyclerView.o.c layoutPrefetchRegistry) {
        int distance;
        int delta = this.w == 0 ? dx : dy;
        if (!(e() == 0 || delta == 0)) {
            a(delta, state);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.s) {
                this.O = new int[this.s];
            }
            int itemPrefetchCount = 0;
            for (int i = 0; i < this.s; i++) {
                n0 n0Var = this.y;
                if (n0Var.f۲۱۸۵d == -1) {
                    int i2 = n0Var.f۲۱۸۷f;
                    distance = i2 - this.t[i].b(i2);
                } else {
                    distance = this.t[i].a(n0Var.f۲۱۸۸g) - this.y.f۲۱۸۸g;
                }
                if (distance >= 0) {
                    this.O[itemPrefetchCount] = distance;
                    itemPrefetchCount++;
                }
            }
            Arrays.sort(this.O, 0, itemPrefetchCount);
            for (int i3 = 0; i3 < itemPrefetchCount && this.y.a(state); i3++) {
                layoutPrefetchRegistry.a(this.y.f۲۱۸۴c, this.O[i3]);
                n0 n0Var2 = this.y;
                n0Var2.f۲۱۸۴c += n0Var2.f۲۱۸۵d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int delta, RecyclerView.a0 state) {
        int referenceChildPosition;
        int layoutDir;
        if (delta > 0) {
            layoutDir = 1;
            referenceChildPosition = I();
        } else {
            layoutDir = -1;
            referenceChildPosition = H();
        }
        this.y.f۲۱۸۲a = true;
        b(referenceChildPosition, state);
        w(layoutDir);
        n0 n0Var = this.y;
        n0Var.f۲۱۸۴c = n0Var.f۲۱۸۵d + referenceChildPosition;
        n0Var.f۲۱۸۳b = Math.abs(delta);
    }

    /* access modifiers changed from: package-private */
    public int c(int dt, RecyclerView.v recycler, RecyclerView.a0 state) {
        int totalScroll;
        if (e() == 0 || dt == 0) {
            return 0;
        }
        a(dt, state);
        int consumed = a(recycler, this.y, state);
        if (this.y.f۲۱۸۳b < consumed) {
            totalScroll = dt;
        } else if (dt < 0) {
            totalScroll = -consumed;
        } else {
            totalScroll = consumed;
        }
        this.u.a(-totalScroll);
        this.G = this.A;
        n0 n0Var = this.y;
        n0Var.f۲۱۸۳b = 0;
        a(recycler, n0Var);
        return totalScroll;
    }

    /* access modifiers changed from: package-private */
    public int I() {
        int childCount = e();
        if (childCount == 0) {
            return 0;
        }
        return l(c(childCount - 1));
    }

    /* access modifiers changed from: package-private */
    public int H() {
        if (e() == 0) {
            return 0;
        }
        return l(c(0));
    }

    private int p(int itemCount) {
        int limit = e();
        for (int i = 0; i < limit; i++) {
            int position = l(c(i));
            if (position >= 0 && position < itemCount) {
                return position;
            }
        }
        return 0;
    }

    private int q(int itemCount) {
        for (int i = e() - 1; i >= 0; i--) {
            int position = l(c(i));
            if (position >= 0 && position < itemCount) {
                return position;
            }
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public RecyclerView.p c() {
        if (this.w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public RecyclerView.p a(Context c2, AttributeSet attrs) {
        return new c(c2, attrs);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public RecyclerView.p a(ViewGroup.LayoutParams lp) {
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) lp);
        }
        return new c(lp);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public boolean a(RecyclerView.p lp) {
        return lp instanceof c;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public View a(View focused, int direction, RecyclerView.v recycler, RecyclerView.a0 state) {
        View directChild;
        int referenceChildPosition;
        int i;
        int i2;
        int i3;
        View view;
        if (e() == 0 || (directChild = c(focused)) == null) {
            return null;
        }
        O();
        int layoutDir = m(direction);
        if (layoutDir == Integer.MIN_VALUE) {
            return null;
        }
        c prevFocusLayoutParams = (c) directChild.getLayoutParams();
        boolean prevFocusFullSpan = prevFocusLayoutParams.f۱۹۲۷f;
        f prevFocusSpan = prevFocusLayoutParams.f۱۹۲۶e;
        if (layoutDir == 1) {
            referenceChildPosition = I();
        } else {
            referenceChildPosition = H();
        }
        b(referenceChildPosition, state);
        w(layoutDir);
        n0 n0Var = this.y;
        n0Var.f۲۱۸۴c = n0Var.f۲۱۸۵d + referenceChildPosition;
        n0Var.f۲۱۸۳b = (int) (((float) this.u.g()) * 0.33333334f);
        n0 n0Var2 = this.y;
        n0Var2.f۲۱۸۹h = true;
        boolean shouldSearchFromStart = false;
        n0Var2.f۲۱۸۲a = false;
        a(recycler, n0Var2, state);
        this.G = this.A;
        if (!(prevFocusFullSpan || (view = prevFocusSpan.a(referenceChildPosition, layoutDir)) == null || view == directChild)) {
            return view;
        }
        if (v(layoutDir)) {
            for (int i4 = this.s - 1; i4 >= 0; i4--) {
                View view2 = this.t[i4].a(referenceChildPosition, layoutDir);
                if (!(view2 == null || view2 == directChild)) {
                    return view2;
                }
            }
        } else {
            for (int i5 = 0; i5 < this.s; i5++) {
                View view3 = this.t[i5].a(referenceChildPosition, layoutDir);
                if (!(view3 == null || view3 == directChild)) {
                    return view3;
                }
            }
        }
        if ((!this.z) == (layoutDir == -1)) {
            shouldSearchFromStart = true;
        }
        if (!prevFocusFullSpan) {
            if (shouldSearchFromStart) {
                i3 = prevFocusSpan.d();
            } else {
                i3 = prevFocusSpan.e();
            }
            View unfocusableCandidate = b(i3);
            if (!(unfocusableCandidate == null || unfocusableCandidate == directChild)) {
                return unfocusableCandidate;
            }
        }
        if (v(layoutDir)) {
            for (int i6 = this.s - 1; i6 >= 0; i6--) {
                if (i6 != prevFocusSpan.f۱۹۴۴e) {
                    if (shouldSearchFromStart) {
                        i2 = this.t[i6].d();
                    } else {
                        i2 = this.t[i6].e();
                    }
                    View unfocusableCandidate2 = b(i2);
                    if (!(unfocusableCandidate2 == null || unfocusableCandidate2 == directChild)) {
                        return unfocusableCandidate2;
                    }
                }
            }
        } else {
            for (int i7 = 0; i7 < this.s; i7++) {
                if (shouldSearchFromStart) {
                    i = this.t[i7].d();
                } else {
                    i = this.t[i7].e();
                }
                View unfocusableCandidate3 = b(i);
                if (!(unfocusableCandidate3 == null || unfocusableCandidate3 == directChild)) {
                    return unfocusableCandidate3;
                }
            }
        }
        return null;
    }

    private int m(int focusDirection) {
        if (focusDirection != 1) {
            if (focusDirection != 2) {
                if (focusDirection != 17) {
                    if (focusDirection != 33) {
                        if (focusDirection != 66) {
                            if (focusDirection == 130 && this.w == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.w == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.w == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.w == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.w != 1 && L()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.w != 1 && L()) {
            return 1;
        } else {
            return -1;
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        f f۱۹۲۶e;

        /* renamed from: f  reason: collision with root package name */
        boolean f۱۹۲۷f;

        public c(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }

        public c(int width, int height) {
            super(width, height);
        }

        public c(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public c(ViewGroup.LayoutParams source) {
            super(source);
        }

        public boolean f() {
            return this.f۱۹۲۷f;
        }

        public final int e() {
            f fVar = this.f۱۹۲۶e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f۱۹۴۴e;
        }
    }

    /* access modifiers changed from: package-private */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f۱۹۴۰a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f۱۹۴۱b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f۱۹۴۲c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        int f۱۹۴۳d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f۱۹۴۴e;

        f(int index) {
            this.f۱۹۴۴e = index;
        }

        /* access modifiers changed from: package-private */
        public int b(int def) {
            int i = this.f۱۹۴۱b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            if (this.f۱۹۴۰a.size() == 0) {
                return def;
            }
            b();
            return this.f۱۹۴۱b;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            d.a fsi;
            View startView = this.f۱۹۴۰a.get(0);
            c lp = b(startView);
            this.f۱۹۴۱b = StaggeredGridLayoutManager.this.u.d(startView);
            if (lp.f۱۹۲۷f && (fsi = StaggeredGridLayoutManager.this.E.c(lp.a())) != null && fsi.f۱۹۳۱d == -1) {
                this.f۱۹۴۱b -= fsi.a(this.f۱۹۴۴e);
            }
        }

        /* access modifiers changed from: package-private */
        public int h() {
            int i = this.f۱۹۴۱b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            b();
            return this.f۱۹۴۱b;
        }

        /* access modifiers changed from: package-private */
        public int a(int def) {
            int i = this.f۱۹۴۲c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            if (this.f۱۹۴۰a.size() == 0) {
                return def;
            }
            a();
            return this.f۱۹۴۲c;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            d.a fsi;
            ArrayList<View> arrayList = this.f۱۹۴۰a;
            View endView = arrayList.get(arrayList.size() - 1);
            c lp = b(endView);
            this.f۱۹۴۲c = StaggeredGridLayoutManager.this.u.a(endView);
            if (lp.f۱۹۲۷f && (fsi = StaggeredGridLayoutManager.this.E.c(lp.a())) != null && fsi.f۱۹۳۱d == 1) {
                this.f۱۹۴۲c += fsi.a(this.f۱۹۴۴e);
            }
        }

        /* access modifiers changed from: package-private */
        public int g() {
            int i = this.f۱۹۴۲c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            a();
            return this.f۱۹۴۲c;
        }

        /* access modifiers changed from: package-private */
        public void c(View view) {
            c lp = b(view);
            lp.f۱۹۲۶e = this;
            this.f۱۹۴۰a.add(0, view);
            this.f۱۹۴۱b = Integer.MIN_VALUE;
            if (this.f۱۹۴۰a.size() == 1) {
                this.f۱۹۴۲c = Integer.MIN_VALUE;
            }
            if (lp.c() || lp.b()) {
                this.f۱۹۴۳d += StaggeredGridLayoutManager.this.u.b(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            c lp = b(view);
            lp.f۱۹۲۶e = this;
            this.f۱۹۴۰a.add(view);
            this.f۱۹۴۲c = Integer.MIN_VALUE;
            if (this.f۱۹۴۰a.size() == 1) {
                this.f۱۹۴۱b = Integer.MIN_VALUE;
            }
            if (lp.c() || lp.b()) {
                this.f۱۹۴۳d += StaggeredGridLayoutManager.this.u.b(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(boolean reverseLayout, int offset) {
            int reference;
            if (reverseLayout) {
                reference = a(Integer.MIN_VALUE);
            } else {
                reference = b(Integer.MIN_VALUE);
            }
            c();
            if (reference != Integer.MIN_VALUE) {
                if (reverseLayout && reference < StaggeredGridLayoutManager.this.u.b()) {
                    return;
                }
                if (reverseLayout || reference <= StaggeredGridLayoutManager.this.u.f()) {
                    if (offset != Integer.MIN_VALUE) {
                        reference += offset;
                    }
                    this.f۱۹۴۲c = reference;
                    this.f۱۹۴۱b = reference;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f۱۹۴۰a.clear();
            i();
            this.f۱۹۴۳d = 0;
        }

        /* access modifiers changed from: package-private */
        public void i() {
            this.f۱۹۴۱b = Integer.MIN_VALUE;
            this.f۱۹۴۲c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void d(int line) {
            this.f۱۹۴۱b = line;
            this.f۱۹۴۲c = line;
        }

        /* access modifiers changed from: package-private */
        public void j() {
            int size = this.f۱۹۴۰a.size();
            View end = this.f۱۹۴۰a.remove(size - 1);
            c lp = b(end);
            lp.f۱۹۲۶e = null;
            if (lp.c() || lp.b()) {
                this.f۱۹۴۳d -= StaggeredGridLayoutManager.this.u.b(end);
            }
            if (size == 1) {
                this.f۱۹۴۱b = Integer.MIN_VALUE;
            }
            this.f۱۹۴۲c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            View start = this.f۱۹۴۰a.remove(0);
            c lp = b(start);
            lp.f۱۹۲۶e = null;
            if (this.f۱۹۴۰a.size() == 0) {
                this.f۱۹۴۲c = Integer.MIN_VALUE;
            }
            if (lp.c() || lp.b()) {
                this.f۱۹۴۳d -= StaggeredGridLayoutManager.this.u.b(start);
            }
            this.f۱۹۴۱b = Integer.MIN_VALUE;
        }

        public int f() {
            return this.f۱۹۴۳d;
        }

        /* access modifiers changed from: package-private */
        public c b(View view) {
            return (c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public void c(int dt) {
            int i = this.f۱۹۴۱b;
            if (i != Integer.MIN_VALUE) {
                this.f۱۹۴۱b = i + dt;
            }
            int i2 = this.f۱۹۴۲c;
            if (i2 != Integer.MIN_VALUE) {
                this.f۱۹۴۲c = i2 + dt;
            }
        }

        public int d() {
            if (StaggeredGridLayoutManager.this.z) {
                return a(this.f۱۹۴۰a.size() - 1, -1, true);
            }
            return a(0, this.f۱۹۴۰a.size(), true);
        }

        public int e() {
            if (StaggeredGridLayoutManager.this.z) {
                return a(0, this.f۱۹۴۰a.size(), true);
            }
            return a(this.f۱۹۴۰a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        public int a(int fromIndex, int toIndex, boolean completelyVisible, boolean acceptCompletelyVisible, boolean acceptEndPointInclusion) {
            int start = StaggeredGridLayoutManager.this.u.f();
            int end = StaggeredGridLayoutManager.this.u.b();
            int next = toIndex > fromIndex ? 1 : -1;
            for (int i = fromIndex; i != toIndex; i += next) {
                View child = this.f۱۹۴۰a.get(i);
                int childStart = StaggeredGridLayoutManager.this.u.d(child);
                int childEnd = StaggeredGridLayoutManager.this.u.a(child);
                boolean childEndInclusion = false;
                boolean childStartInclusion = !acceptEndPointInclusion ? childStart < end : childStart <= end;
                if (!acceptEndPointInclusion ? childEnd > start : childEnd >= start) {
                    childEndInclusion = true;
                }
                if (childStartInclusion && childEndInclusion) {
                    if (!completelyVisible || !acceptCompletelyVisible) {
                        if (acceptCompletelyVisible) {
                            return StaggeredGridLayoutManager.this.l(child);
                        }
                        if (childStart < start || childEnd > end) {
                            return StaggeredGridLayoutManager.this.l(child);
                        }
                    } else if (childStart >= start && childEnd <= end) {
                        return StaggeredGridLayoutManager.this.l(child);
                    }
                }
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int a(int fromIndex, int toIndex, boolean acceptEndPointInclusion) {
            return a(fromIndex, toIndex, false, false, acceptEndPointInclusion);
        }

        public View a(int referenceChildPosition, int layoutDir) {
            View candidate = null;
            if (layoutDir != -1) {
                for (int i = this.f۱۹۴۰a.size() - 1; i >= 0; i--) {
                    View view = this.f۱۹۴۰a.get(i);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.l(view) >= referenceChildPosition) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.l(view) <= referenceChildPosition) || !view.hasFocusable()) {
                        break;
                    }
                    candidate = view;
                }
            } else {
                int limit = this.f۱۹۴۰a.size();
                for (int i2 = 0; i2 < limit; i2++) {
                    View view2 = this.f۱۹۴۰a.get(i2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.l(view2) <= referenceChildPosition) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.l(view2) >= referenceChildPosition) || !view2.hasFocusable()) {
                        break;
                    }
                    candidate = view2;
                }
            }
            return candidate;
        }
    }

    /* access modifiers changed from: package-private */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int[] f۱۹۲۸a;

        /* renamed from: b  reason: collision with root package name */
        List<a> f۱۹۲۹b;

        d() {
        }

        /* access modifiers changed from: package-private */
        public int b(int position) {
            List<a> list = this.f۱۹۲۹b;
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (this.f۱۹۲۹b.get(i).f۱۹۳۰c >= position) {
                        this.f۱۹۲۹b.remove(i);
                    }
                }
            }
            return e(position);
        }

        /* access modifiers changed from: package-private */
        public int e(int position) {
            int[] iArr = this.f۱۹۲۸a;
            if (iArr == null || position >= iArr.length) {
                return -1;
            }
            int endPosition = g(position);
            if (endPosition == -1) {
                int[] iArr2 = this.f۱۹۲۸a;
                Arrays.fill(iArr2, position, iArr2.length, -1);
                return this.f۱۹۲۸a.length;
            }
            Arrays.fill(this.f۱۹۲۸a, position, endPosition + 1, -1);
            return endPosition + 1;
        }

        /* access modifiers changed from: package-private */
        public int d(int position) {
            int[] iArr = this.f۱۹۲۸a;
            if (iArr == null || position >= iArr.length) {
                return -1;
            }
            return iArr[position];
        }

        /* access modifiers changed from: package-private */
        public void a(int position, f span) {
            a(position);
            this.f۱۹۲۸a[position] = span.f۱۹۴۴e;
        }

        /* access modifiers changed from: package-private */
        public int f(int position) {
            int len = this.f۱۹۲۸a.length;
            while (len <= position) {
                len *= 2;
            }
            return len;
        }

        /* access modifiers changed from: package-private */
        public void a(int position) {
            int[] iArr = this.f۱۹۲۸a;
            if (iArr == null) {
                this.f۱۹۲۸a = new int[(Math.max(position, 10) + 1)];
                Arrays.fill(this.f۱۹۲۸a, -1);
            } else if (position >= iArr.length) {
                int[] old = this.f۱۹۲۸a;
                this.f۱۹۲۸a = new int[f(position)];
                System.arraycopy(old, 0, this.f۱۹۲۸a, 0, old.length);
                int[] iArr2 = this.f۱۹۲۸a;
                Arrays.fill(iArr2, old.length, iArr2.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.f۱۹۲۸a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f۱۹۲۹b = null;
        }

        /* access modifiers changed from: package-private */
        public void b(int positionStart, int itemCount) {
            int[] iArr = this.f۱۹۲۸a;
            if (iArr != null && positionStart < iArr.length) {
                a(positionStart + itemCount);
                int[] iArr2 = this.f۱۹۲۸a;
                System.arraycopy(iArr2, positionStart + itemCount, iArr2, positionStart, (iArr2.length - positionStart) - itemCount);
                int[] iArr3 = this.f۱۹۲۸a;
                Arrays.fill(iArr3, iArr3.length - itemCount, iArr3.length, -1);
                d(positionStart, itemCount);
            }
        }

        private void d(int positionStart, int itemCount) {
            List<a> list = this.f۱۹۲۹b;
            if (list != null) {
                int end = positionStart + itemCount;
                for (int i = list.size() - 1; i >= 0; i--) {
                    a fsi = this.f۱۹۲۹b.get(i);
                    int i2 = fsi.f۱۹۳۰c;
                    if (i2 >= positionStart) {
                        if (i2 < end) {
                            this.f۱۹۲۹b.remove(i);
                        } else {
                            fsi.f۱۹۳۰c = i2 - itemCount;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int positionStart, int itemCount) {
            int[] iArr = this.f۱۹۲۸a;
            if (iArr != null && positionStart < iArr.length) {
                a(positionStart + itemCount);
                int[] iArr2 = this.f۱۹۲۸a;
                System.arraycopy(iArr2, positionStart, iArr2, positionStart + itemCount, (iArr2.length - positionStart) - itemCount);
                Arrays.fill(this.f۱۹۲۸a, positionStart, positionStart + itemCount, -1);
                c(positionStart, itemCount);
            }
        }

        private void c(int positionStart, int itemCount) {
            List<a> list = this.f۱۹۲۹b;
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    a fsi = this.f۱۹۲۹b.get(i);
                    int i2 = fsi.f۱۹۳۰c;
                    if (i2 >= positionStart) {
                        fsi.f۱۹۳۰c = i2 + itemCount;
                    }
                }
            }
        }

        private int g(int position) {
            if (this.f۱۹۲۹b == null) {
                return -1;
            }
            a item = c(position);
            if (item != null) {
                this.f۱۹۲۹b.remove(item);
            }
            int nextFsiIndex = -1;
            int count = this.f۱۹۲۹b.size();
            int i = 0;
            while (true) {
                if (i >= count) {
                    break;
                } else if (this.f۱۹۲۹b.get(i).f۱۹۳۰c >= position) {
                    nextFsiIndex = i;
                    break;
                } else {
                    i++;
                }
            }
            if (nextFsiIndex == -1) {
                return -1;
            }
            this.f۱۹۲۹b.remove(nextFsiIndex);
            return this.f۱۹۲۹b.get(nextFsiIndex).f۱۹۳۰c;
        }

        public void a(a fullSpanItem) {
            if (this.f۱۹۲۹b == null) {
                this.f۱۹۲۹b = new ArrayList();
            }
            int size = this.f۱۹۲۹b.size();
            for (int i = 0; i < size; i++) {
                a other = this.f۱۹۲۹b.get(i);
                if (other.f۱۹۳۰c == fullSpanItem.f۱۹۳۰c) {
                    this.f۱۹۲۹b.remove(i);
                }
                if (other.f۱۹۳۰c >= fullSpanItem.f۱۹۳۰c) {
                    this.f۱۹۲۹b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f۱۹۲۹b.add(fullSpanItem);
        }

        public a c(int position) {
            List<a> list = this.f۱۹۲۹b;
            if (list == null) {
                return null;
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                a fsi = this.f۱۹۲۹b.get(i);
                if (fsi.f۱۹۳۰c == position) {
                    return fsi;
                }
            }
            return null;
        }

        public a a(int minPos, int maxPos, int gapDir, boolean hasUnwantedGapAfter) {
            List<a> list = this.f۱۹۲۹b;
            if (list == null) {
                return null;
            }
            int limit = list.size();
            for (int i = 0; i < limit; i++) {
                a fsi = this.f۱۹۲۹b.get(i);
                int i2 = fsi.f۱۹۳۰c;
                if (i2 >= maxPos) {
                    return null;
                }
                if (i2 >= minPos && (gapDir == 0 || fsi.f۱۹۳۱d == gapDir || (hasUnwantedGapAfter && fsi.f۱۹۳۳f))) {
                    return fsi;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C۰۰۳۷a();

            /* renamed from: c  reason: collision with root package name */
            int f۱۹۳۰c;

            /* renamed from: d  reason: collision with root package name */
            int f۱۹۳۱d;

            /* renamed from: e  reason: collision with root package name */
            int[] f۱۹۳۲e;

            /* renamed from: f  reason: collision with root package name */
            boolean f۱۹۳۳f;

            a(Parcel in) {
                this.f۱۹۳۰c = in.readInt();
                this.f۱۹۳۱d = in.readInt();
                this.f۱۹۳۳f = in.readInt() != 1 ? false : true;
                int spanCount = in.readInt();
                if (spanCount > 0) {
                    this.f۱۹۳۲e = new int[spanCount];
                    in.readIntArray(this.f۱۹۳۲e);
                }
            }

            a() {
            }

            /* access modifiers changed from: package-private */
            public int a(int spanIndex) {
                int[] iArr = this.f۱۹۳۲e;
                if (iArr == null) {
                    return 0;
                }
                return iArr[spanIndex];
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.f۱۹۳۰c);
                dest.writeInt(this.f۱۹۳۱d);
                dest.writeInt(this.f۱۹۳۳f ? 1 : 0);
                int[] iArr = this.f۱۹۳۲e;
                if (iArr == null || iArr.length <= 0) {
                    dest.writeInt(0);
                    return;
                }
                dest.writeInt(iArr.length);
                dest.writeIntArray(this.f۱۹۳۲e);
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f۱۹۳۰c + ", mGapDir=" + this.f۱۹۳۱d + ", mHasUnwantedGapAfter=" + this.f۱۹۳۳f + ", mGapPerSpan=" + Arrays.toString(this.f۱۹۳۲e) + '}';
            }

            /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            static class C۰۰۳۷a implements Parcelable.Creator<a> {
                C۰۰۳۷a() {
                }

                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel in) {
                    return new a(in);
                }

                @Override // android.os.Parcelable.Creator
                public a[] newArray(int size) {
                    return new a[size];
                }
            }
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f۱۹۳۴c;

        /* renamed from: d  reason: collision with root package name */
        int f۱۹۳۵d;

        /* renamed from: e  reason: collision with root package name */
        int f۱۹۳۶e;

        /* renamed from: f  reason: collision with root package name */
        int[] f۱۹۳۷f;

        /* renamed from: g  reason: collision with root package name */
        int f۱۹۳۸g;

        /* renamed from: h  reason: collision with root package name */
        int[] f۱۹۳۹h;
        List<d.a> i;
        boolean j;
        boolean k;
        boolean l;

        public e() {
        }

        e(Parcel in) {
            this.f۱۹۳۴c = in.readInt();
            this.f۱۹۳۵d = in.readInt();
            this.f۱۹۳۶e = in.readInt();
            int i2 = this.f۱۹۳۶e;
            if (i2 > 0) {
                this.f۱۹۳۷f = new int[i2];
                in.readIntArray(this.f۱۹۳۷f);
            }
            this.f۱۹۳۸g = in.readInt();
            int i3 = this.f۱۹۳۸g;
            if (i3 > 0) {
                this.f۱۹۳۹h = new int[i3];
                in.readIntArray(this.f۱۹۳۹h);
            }
            boolean z = false;
            this.j = in.readInt() == 1;
            this.k = in.readInt() == 1;
            this.l = in.readInt() == 1 ? true : z;
            this.i = in.readArrayList(d.a.class.getClassLoader());
        }

        public e(e other) {
            this.f۱۹۳۶e = other.f۱۹۳۶e;
            this.f۱۹۳۴c = other.f۱۹۳۴c;
            this.f۱۹۳۵d = other.f۱۹۳۵d;
            this.f۱۹۳۷f = other.f۱۹۳۷f;
            this.f۱۹۳۸g = other.f۱۹۳۸g;
            this.f۱۹۳۹h = other.f۱۹۳۹h;
            this.j = other.j;
            this.k = other.k;
            this.l = other.l;
            this.i = other.i;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f۱۹۳۷f = null;
            this.f۱۹۳۶e = 0;
            this.f۱۹۳۸g = 0;
            this.f۱۹۳۹h = null;
            this.i = null;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f۱۹۳۷f = null;
            this.f۱۹۳۶e = 0;
            this.f۱۹۳۴c = -1;
            this.f۱۹۳۵d = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f۱۹۳۴c);
            dest.writeInt(this.f۱۹۳۵d);
            dest.writeInt(this.f۱۹۳۶e);
            if (this.f۱۹۳۶e > 0) {
                dest.writeIntArray(this.f۱۹۳۷f);
            }
            dest.writeInt(this.f۱۹۳۸g);
            if (this.f۱۹۳۸g > 0) {
                dest.writeIntArray(this.f۱۹۳۹h);
            }
            dest.writeInt(this.j ? 1 : 0);
            dest.writeInt(this.k ? 1 : 0);
            dest.writeInt(this.l ? 1 : 0);
            dest.writeList(this.i);
        }

        static class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel in) {
                return new e(in);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int size) {
                return new e[size];
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f۱۹۱۹a;

        /* renamed from: b  reason: collision with root package name */
        int f۱۹۲۰b;

        /* renamed from: c  reason: collision with root package name */
        boolean f۱۹۲۱c;

        /* renamed from: d  reason: collision with root package name */
        boolean f۱۹۲۲d;

        /* renamed from: e  reason: collision with root package name */
        boolean f۱۹۲۳e;

        /* renamed from: f  reason: collision with root package name */
        int[] f۱۹۲۴f;

        b() {
            b();
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f۱۹۱۹a = -1;
            this.f۱۹۲۰b = Integer.MIN_VALUE;
            this.f۱۹۲۱c = false;
            this.f۱۹۲۲d = false;
            this.f۱۹۲۳e = false;
            int[] iArr = this.f۱۹۲۴f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(f[] spans) {
            int spanCount = spans.length;
            int[] iArr = this.f۱۹۲۴f;
            if (iArr == null || iArr.length < spanCount) {
                this.f۱۹۲۴f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < spanCount; i++) {
                this.f۱۹۲۴f[i] = spans[i].b(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i;
            if (this.f۱۹۲۱c) {
                i = StaggeredGridLayoutManager.this.u.b();
            } else {
                i = StaggeredGridLayoutManager.this.u.f();
            }
            this.f۱۹۲۰b = i;
        }

        /* access modifiers changed from: package-private */
        public void a(int addedDistance) {
            if (this.f۱۹۲۱c) {
                this.f۱۹۲۰b = StaggeredGridLayoutManager.this.u.b() - addedDistance;
            } else {
                this.f۱۹۲۰b = StaggeredGridLayoutManager.this.u.f() + addedDistance;
            }
        }
    }
}
