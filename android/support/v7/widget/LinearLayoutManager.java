package android.support.v7.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements android.support.v7.widget.t1.a, RecyclerView.z.a {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    int s;
    private c t;
    t0 u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int orientation, boolean reverseLayout) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        j(orientation);
        a(reverseLayout);
    }

    public LinearLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        RecyclerView.o.d properties = RecyclerView.o.a(context, attrs, defStyleAttr, defStyleRes);
        j(properties.f۱۸۷۰a);
        a(properties.f۱۸۷۲c);
        b(properties.f۱۸۷۳d);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public boolean u() {
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public RecyclerView.p c() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void b(RecyclerView view, RecyclerView.v recycler) {
        super.b(view, recycler);
        if (this.C) {
            b(recycler);
            recycler.a();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(AccessibilityEvent event) {
        super.a(event);
        if (e() > 0) {
            event.setFromIndex(F());
            event.setToIndex(G());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public Parcelable x() {
        d dVar = this.D;
        if (dVar != null) {
            return new d(dVar);
        }
        d state = new d();
        if (e() > 0) {
            E();
            boolean didLayoutFromEnd = this.v ^ this.x;
            state.f۱۸۱۷e = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = K();
                state.f۱۸۱۶d = this.u.b() - this.u.a(refChild);
                state.f۱۸۱۵c = l(refChild);
            } else {
                View refChild2 = L();
                state.f۱۸۱۵c = l(refChild2);
                state.f۱۸۱۶d = this.u.d(refChild2) - this.u.f();
            }
        } else {
            state.b();
        }
        return state;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(Parcelable state) {
        if (state instanceof d) {
            this.D = (d) state;
            y();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public boolean a() {
        return this.s == 0;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public boolean b() {
        return this.s == 1;
    }

    public void b(boolean stackFromEnd) {
        a((String) null);
        if (this.y != stackFromEnd) {
            this.y = stackFromEnd;
            y();
        }
    }

    public int H() {
        return this.s;
    }

    public void j(int orientation) {
        if (orientation == 0 || orientation == 1) {
            a((String) null);
            if (orientation != this.s || this.u == null) {
                this.u = t0.a(this, orientation);
                this.E.f۱۷۹۸a = this.u;
                this.s = orientation;
                y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + orientation);
    }

    private void M() {
        if (this.s == 1 || !I()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    public void a(boolean reverseLayout) {
        a((String) null);
        if (reverseLayout != this.w) {
            this.w = reverseLayout;
            y();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public View b(int position) {
        int childCount = e();
        if (childCount == 0) {
            return null;
        }
        int viewPosition = position - l(c(0));
        if (viewPosition >= 0 && viewPosition < childCount) {
            View child = c(viewPosition);
            if (l(child) == position) {
                return child;
            }
        }
        return super.b(position);
    }

    /* access modifiers changed from: protected */
    public int h(RecyclerView.a0 state) {
        if (state.c()) {
            return this.u.g();
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void e(RecyclerView.v recycler, RecyclerView.a0 state) {
        int extraForStart;
        int extraForEnd;
        int endOffset;
        int firstElement;
        int i;
        View existing;
        int upcomingOffset;
        int firstLayoutDirection = -1;
        if (!(this.D == null && this.A == -1) && state.a() == 0) {
            b(recycler);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.f۱۸۱۵c;
        }
        E();
        this.t.f۱۸۰۷a = false;
        M();
        View focused = g();
        if (!this.E.f۱۸۰۲e || this.A != -1 || this.D != null) {
            this.E.b();
            a aVar = this.E;
            aVar.f۱۸۰۱d = this.x ^ this.y;
            b(recycler, state, aVar);
            this.E.f۱۸۰۲e = true;
        } else if (focused != null && (this.u.d(focused) >= this.u.b() || this.u.a(focused) <= this.u.f())) {
            this.E.b(focused, l(focused));
        }
        int extra = h(state);
        if (this.t.j >= 0) {
            extraForEnd = extra;
            extraForStart = 0;
        } else {
            extraForStart = extra;
            extraForEnd = 0;
        }
        int extraForStart2 = extraForStart + this.u.f();
        int extraForEnd2 = extraForEnd + this.u.c();
        if (!(!state.d() || (i = this.A) == -1 || this.B == Integer.MIN_VALUE || (existing = b(i)) == null)) {
            if (this.x) {
                upcomingOffset = (this.u.b() - this.u.a(existing)) - this.B;
            } else {
                upcomingOffset = this.B - (this.u.d(existing) - this.u.f());
            }
            if (upcomingOffset > 0) {
                extraForStart2 += upcomingOffset;
            } else {
                extraForEnd2 -= upcomingOffset;
            }
        }
        if (this.E.f۱۸۰۱d) {
            if (this.x) {
                firstLayoutDirection = 1;
            }
        } else if (!this.x) {
            firstLayoutDirection = 1;
        }
        a(recycler, state, this.E, firstLayoutDirection);
        a(recycler);
        this.t.l = J();
        this.t.i = state.d();
        a aVar2 = this.E;
        if (aVar2.f۱۸۰۱d) {
            b(aVar2);
            c cVar = this.t;
            cVar.f۱۸۱۴h = extraForStart2;
            a(recycler, cVar, state, false);
            c cVar2 = this.t;
            int startOffset = cVar2.f۱۸۰۸b;
            int firstElement2 = cVar2.f۱۸۱۰d;
            int i2 = cVar2.f۱۸۰۹c;
            if (i2 > 0) {
                extraForEnd2 += i2;
            }
            a(this.E);
            c cVar3 = this.t;
            cVar3.f۱۸۱۴h = extraForEnd2;
            cVar3.f۱۸۱۰d += cVar3.f۱۸۱۱e;
            a(recycler, cVar3, state, false);
            c cVar4 = this.t;
            endOffset = cVar4.f۱۸۰۸b;
            if (cVar4.f۱۸۰۹c > 0) {
                int extraForStart3 = cVar4.f۱۸۰۹c;
                g(firstElement2, startOffset);
                c cVar5 = this.t;
                cVar5.f۱۸۱۴h = extraForStart3;
                a(recycler, cVar5, state, false);
                startOffset = this.t.f۱۸۰۸b;
            }
            firstElement = startOffset;
        } else {
            a(aVar2);
            c cVar6 = this.t;
            cVar6.f۱۸۱۴h = extraForEnd2;
            a(recycler, cVar6, state, false);
            c cVar7 = this.t;
            endOffset = cVar7.f۱۸۰۸b;
            int lastElement = cVar7.f۱۸۱۰d;
            int i3 = cVar7.f۱۸۰۹c;
            if (i3 > 0) {
                extraForStart2 += i3;
            }
            b(this.E);
            c cVar8 = this.t;
            cVar8.f۱۸۱۴h = extraForStart2;
            cVar8.f۱۸۱۰d += cVar8.f۱۸۱۱e;
            a(recycler, cVar8, state, false);
            c cVar9 = this.t;
            firstElement = cVar9.f۱۸۰۸b;
            if (cVar9.f۱۸۰۹c > 0) {
                int extraForEnd3 = cVar9.f۱۸۰۹c;
                f(lastElement, endOffset);
                c cVar10 = this.t;
                cVar10.f۱۸۱۴h = extraForEnd3;
                a(recycler, cVar10, state, false);
                endOffset = this.t.f۱۸۰۸b;
            }
        }
        if (e() > 0) {
            if (this.x ^ this.y) {
                int fixOffset = a(endOffset, recycler, state, true);
                int startOffset2 = firstElement + fixOffset;
                int fixOffset2 = b(startOffset2, recycler, state, false);
                firstElement = startOffset2 + fixOffset2;
                endOffset = endOffset + fixOffset + fixOffset2;
            } else {
                int fixOffset3 = b(firstElement, recycler, state, true);
                int endOffset2 = endOffset + fixOffset3;
                int fixOffset4 = a(endOffset2, recycler, state, false);
                firstElement = firstElement + fixOffset3 + fixOffset4;
                endOffset = endOffset2 + fixOffset4;
            }
        }
        b(recycler, state, firstElement, endOffset);
        if (!state.d()) {
            this.u.i();
        } else {
            this.E.b();
        }
        this.v = this.y;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void g(RecyclerView.a0 state) {
        super.g(state);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.b();
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.v recycler, RecyclerView.a0 state, a anchorInfo, int firstLayoutItemDirection) {
    }

    private void b(RecyclerView.v recycler, RecyclerView.a0 state, int startOffset, int endOffset) {
        if (!(!state.e() || e() == 0 || state.d())) {
            if (C()) {
                int scrapExtraStart = 0;
                int scrapExtraEnd = 0;
                List<RecyclerView.ViewHolder> scrapList = recycler.f();
                int scrapSize = scrapList.size();
                int firstChildPos = l(c(0));
                for (int i = 0; i < scrapSize; i++) {
                    RecyclerView.d0 scrap = (RecyclerView.d0) scrapList.get(i);
                    if (!scrap.p()) {
                        int direction = 1;
                        if ((scrap.i() < firstChildPos) != this.x) {
                            direction = -1;
                        }
                        if (direction == -1) {
                            scrapExtraStart += this.u.b(scrap.f۱۸۴۱c);
                        } else {
                            scrapExtraEnd += this.u.b(scrap.f۱۸۴۱c);
                        }
                    }
                }
                this.t.k = scrapList;
                if (scrapExtraStart > 0) {
                    g(l(L()), startOffset);
                    c cVar = this.t;
                    cVar.f۱۸۱۴h = scrapExtraStart;
                    cVar.f۱۸۰۹c = 0;
                    cVar.a();
                    a(recycler, this.t, state, false);
                }
                if (scrapExtraEnd > 0) {
                    f(l(K()), endOffset);
                    c cVar2 = this.t;
                    cVar2.f۱۸۱۴h = scrapExtraEnd;
                    cVar2.f۱۸۰۹c = 0;
                    cVar2.a();
                    a(recycler, this.t, state, false);
                }
                this.t.k = null;
            }
        }
    }

    private void b(RecyclerView.v recycler, RecyclerView.a0 state, a anchorInfo) {
        if (!a(state, anchorInfo) && !a(recycler, state, anchorInfo)) {
            anchorInfo.a();
            anchorInfo.f۱۷۹۹b = this.y ? state.a() - 1 : 0;
        }
    }

    private boolean a(RecyclerView.v recycler, RecyclerView.a0 state, a anchorInfo) {
        View referenceChild;
        int i;
        boolean notVisible = false;
        if (e() == 0) {
            return false;
        }
        View focused = g();
        if (focused != null && anchorInfo.a(focused, state)) {
            anchorInfo.b(focused, l(focused));
            return true;
        } else if (this.v != this.y) {
            return false;
        } else {
            if (anchorInfo.f۱۸۰۱d) {
                referenceChild = l(recycler, state);
            } else {
                referenceChild = m(recycler, state);
            }
            if (referenceChild == null) {
                return false;
            }
            anchorInfo.a(referenceChild, l(referenceChild));
            if (!state.d() && C()) {
                if (this.u.d(referenceChild) >= this.u.b() || this.u.a(referenceChild) < this.u.f()) {
                    notVisible = true;
                }
                if (notVisible) {
                    if (anchorInfo.f۱۸۰۱d) {
                        i = this.u.b();
                    } else {
                        i = this.u.f();
                    }
                    anchorInfo.f۱۸۰۰c = i;
                }
            }
            return true;
        }
    }

    private boolean a(RecyclerView.a0 state, a anchorInfo) {
        int i;
        int i2;
        boolean z2 = false;
        if (state.d() || (i = this.A) == -1) {
            return false;
        }
        if (i < 0 || i >= state.a()) {
            this.A = -1;
            this.B = Integer.MIN_VALUE;
            return false;
        }
        anchorInfo.f۱۷۹۹b = this.A;
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            anchorInfo.f۱۸۰۱d = this.D.f۱۸۱۷e;
            if (anchorInfo.f۱۸۰۱d) {
                anchorInfo.f۱۸۰۰c = this.u.b() - this.D.f۱۸۱۶d;
            } else {
                anchorInfo.f۱۸۰۰c = this.u.f() + this.D.f۱۸۱۶d;
            }
            return true;
        } else if (this.B == Integer.MIN_VALUE) {
            View child = b(this.A);
            if (child == null) {
                if (e() > 0) {
                    if ((this.A < l(c(0))) == this.x) {
                        z2 = true;
                    }
                    anchorInfo.f۱۸۰۱d = z2;
                }
                anchorInfo.a();
            } else if (this.u.b(child) > this.u.g()) {
                anchorInfo.a();
                return true;
            } else if (this.u.d(child) - this.u.f() < 0) {
                anchorInfo.f۱۸۰۰c = this.u.f();
                anchorInfo.f۱۸۰۱d = false;
                return true;
            } else if (this.u.b() - this.u.a(child) < 0) {
                anchorInfo.f۱۸۰۰c = this.u.b();
                anchorInfo.f۱۸۰۱d = true;
                return true;
            } else {
                if (anchorInfo.f۱۸۰۱d) {
                    i2 = this.u.a(child) + this.u.h();
                } else {
                    i2 = this.u.d(child);
                }
                anchorInfo.f۱۸۰۰c = i2;
            }
            return true;
        } else {
            boolean z3 = this.x;
            anchorInfo.f۱۸۰۱d = z3;
            if (z3) {
                anchorInfo.f۱۸۰۰c = this.u.b() - this.B;
            } else {
                anchorInfo.f۱۸۰۰c = this.u.f() + this.B;
            }
            return true;
        }
    }

    private int a(int endOffset, RecyclerView.v recycler, RecyclerView.a0 state, boolean canOffsetChildren) {
        int gap;
        int gap2 = this.u.b() - endOffset;
        if (gap2 <= 0) {
            return 0;
        }
        int fixOffset = -c(-gap2, recycler, state);
        int endOffset2 = endOffset + fixOffset;
        if (!canOffsetChildren || (gap = this.u.b() - endOffset2) <= 0) {
            return fixOffset;
        }
        this.u.a(gap);
        return gap + fixOffset;
    }

    private int b(int startOffset, RecyclerView.v recycler, RecyclerView.a0 state, boolean canOffsetChildren) {
        int gap;
        int gap2 = startOffset - this.u.f();
        if (gap2 <= 0) {
            return 0;
        }
        int fixOffset = -c(gap2, recycler, state);
        int startOffset2 = startOffset + fixOffset;
        if (!canOffsetChildren || (gap = startOffset2 - this.u.f()) <= 0) {
            return fixOffset;
        }
        this.u.a(-gap);
        return fixOffset - gap;
    }

    private void a(a anchorInfo) {
        f(anchorInfo.f۱۷۹۹b, anchorInfo.f۱۸۰۰c);
    }

    private void f(int itemPosition, int offset) {
        this.t.f۱۸۰۹c = this.u.b() - offset;
        this.t.f۱۸۱۱e = this.x ? -1 : 1;
        c cVar = this.t;
        cVar.f۱۸۱۰d = itemPosition;
        cVar.f۱۸۱۲f = 1;
        cVar.f۱۸۰۸b = offset;
        cVar.f۱۸۱۳g = Integer.MIN_VALUE;
    }

    private void b(a anchorInfo) {
        g(anchorInfo.f۱۷۹۹b, anchorInfo.f۱۸۰۰c);
    }

    private void g(int itemPosition, int offset) {
        this.t.f۱۸۰۹c = offset - this.u.f();
        c cVar = this.t;
        cVar.f۱۸۱۰d = itemPosition;
        cVar.f۱۸۱۱e = this.x ? 1 : -1;
        c cVar2 = this.t;
        cVar2.f۱۸۱۲f = -1;
        cVar2.f۱۸۰۸b = offset;
        cVar2.f۱۸۱۳g = Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        return j() == 1;
    }

    /* access modifiers changed from: package-private */
    public void E() {
        if (this.t == null) {
            this.t = D();
        }
    }

    /* access modifiers changed from: package-private */
    public c D() {
        return new c();
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void h(int position) {
        this.A = position;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        y();
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int a(int dx, RecyclerView.v recycler, RecyclerView.a0 state) {
        if (this.s == 1) {
            return 0;
        }
        return c(dx, recycler, state);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int b(int dy, RecyclerView.v recycler, RecyclerView.a0 state) {
        if (this.s == 0) {
            return 0;
        }
        return c(dy, recycler, state);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int b(RecyclerView.a0 state) {
        return j(state);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int e(RecyclerView.a0 state) {
        return j(state);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int a(RecyclerView.a0 state) {
        return i(state);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int d(RecyclerView.a0 state) {
        return i(state);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int c(RecyclerView.a0 state) {
        return k(state);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int f(RecyclerView.a0 state) {
        return k(state);
    }

    private int j(RecyclerView.a0 state) {
        if (e() == 0) {
            return 0;
        }
        E();
        return a1.a(state, this.u, b(!this.z, true), a(!this.z, true), this, this.z, this.x);
    }

    private int i(RecyclerView.a0 state) {
        if (e() == 0) {
            return 0;
        }
        E();
        return a1.a(state, this.u, b(!this.z, true), a(!this.z, true), this, this.z);
    }

    private int k(RecyclerView.a0 state) {
        if (e() == 0) {
            return 0;
        }
        E();
        return a1.b(state, this.u, b(!this.z, true), a(!this.z, true), this, this.z);
    }

    private void a(int layoutDirection, int requiredSpace, boolean canUseExistingSpace, RecyclerView.a0 state) {
        int scrollingOffset;
        this.t.l = J();
        this.t.f۱۸۱۴h = h(state);
        c cVar = this.t;
        cVar.f۱۸۱۲f = layoutDirection;
        int i = -1;
        if (layoutDirection == 1) {
            cVar.f۱۸۱۴h += this.u.c();
            View child = K();
            c cVar2 = this.t;
            if (!this.x) {
                i = 1;
            }
            cVar2.f۱۸۱۱e = i;
            c cVar3 = this.t;
            int l = l(child);
            c cVar4 = this.t;
            cVar3.f۱۸۱۰d = l + cVar4.f۱۸۱۱e;
            cVar4.f۱۸۰۸b = this.u.a(child);
            scrollingOffset = this.u.a(child) - this.u.b();
        } else {
            View child2 = L();
            this.t.f۱۸۱۴h += this.u.f();
            c cVar5 = this.t;
            if (this.x) {
                i = 1;
            }
            cVar5.f۱۸۱۱e = i;
            c cVar6 = this.t;
            int l2 = l(child2);
            c cVar7 = this.t;
            cVar6.f۱۸۱۰d = l2 + cVar7.f۱۸۱۱e;
            cVar7.f۱۸۰۸b = this.u.d(child2);
            scrollingOffset = (-this.u.d(child2)) + this.u.f();
        }
        c cVar8 = this.t;
        cVar8.f۱۸۰۹c = requiredSpace;
        if (canUseExistingSpace) {
            cVar8.f۱۸۰۹c -= scrollingOffset;
        }
        this.t.f۱۸۱۳g = scrollingOffset;
    }

    /* access modifiers changed from: package-private */
    public boolean J() {
        return this.u.d() == 0 && this.u.a() == 0;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.a0 state, c layoutState, RecyclerView.o.c layoutPrefetchRegistry) {
        int pos = layoutState.f۱۸۱۰d;
        if (pos >= 0 && pos < state.a()) {
            layoutPrefetchRegistry.a(pos, Math.max(0, layoutState.f۱۸۱۳g));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(int adapterItemCount, RecyclerView.o.c layoutPrefetchRegistry) {
        boolean fromEnd;
        int anchorPos;
        d dVar = this.D;
        int direction = -1;
        if (dVar == null || !dVar.a()) {
            M();
            fromEnd = this.x;
            if (this.A == -1) {
                anchorPos = fromEnd ? adapterItemCount - 1 : 0;
            } else {
                anchorPos = this.A;
            }
        } else {
            d dVar2 = this.D;
            fromEnd = dVar2.f۱۸۱۷e;
            anchorPos = dVar2.f۱۸۱۵c;
        }
        if (!fromEnd) {
            direction = 1;
        }
        int targetPos = anchorPos;
        for (int i = 0; i < this.G && targetPos >= 0 && targetPos < adapterItemCount; i++) {
            layoutPrefetchRegistry.a(targetPos, 0);
            targetPos += direction;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(int dx, int dy, RecyclerView.a0 state, RecyclerView.o.c layoutPrefetchRegistry) {
        int delta = this.s == 0 ? dx : dy;
        if (e() != 0 && delta != 0) {
            E();
            a(delta > 0 ? 1 : -1, Math.abs(delta), true, state);
            a(state, this.t, layoutPrefetchRegistry);
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int dy, RecyclerView.v recycler, RecyclerView.a0 state) {
        if (e() == 0 || dy == 0) {
            return 0;
        }
        this.t.f۱۸۰۷a = true;
        E();
        int layoutDirection = dy > 0 ? 1 : -1;
        int absDy = Math.abs(dy);
        a(layoutDirection, absDy, true, state);
        c cVar = this.t;
        int consumed = cVar.f۱۸۱۳g + a(recycler, cVar, state, false);
        if (consumed < 0) {
            return 0;
        }
        int scrolled = absDy > consumed ? layoutDirection * consumed : dy;
        this.u.a(-scrolled);
        this.t.j = scrolled;
        return scrolled;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(String message) {
        if (this.D == null) {
            super.a(message);
        }
    }

    private void a(RecyclerView.v recycler, int startIndex, int endIndex) {
        if (startIndex != endIndex) {
            if (endIndex > startIndex) {
                for (int i = endIndex - 1; i >= startIndex; i--) {
                    a(i, recycler);
                }
                return;
            }
            for (int i2 = startIndex; i2 > endIndex; i2--) {
                a(i2, recycler);
            }
        }
    }

    private void b(RecyclerView.v recycler, int dt) {
        if (dt >= 0) {
            int childCount = e();
            if (this.x) {
                for (int i = childCount - 1; i >= 0; i--) {
                    View child = c(i);
                    if (this.u.a(child) > dt || this.u.e(child) > dt) {
                        a(recycler, childCount - 1, i);
                        return;
                    }
                }
                return;
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View child2 = c(i2);
                if (this.u.a(child2) > dt || this.u.e(child2) > dt) {
                    a(recycler, 0, i2);
                    return;
                }
            }
        }
    }

    private void a(RecyclerView.v recycler, int dt) {
        int childCount = e();
        if (dt >= 0) {
            int limit = this.u.a() - dt;
            if (this.x) {
                for (int i = 0; i < childCount; i++) {
                    View child = c(i);
                    if (this.u.d(child) < limit || this.u.f(child) < limit) {
                        a(recycler, 0, i);
                        return;
                    }
                }
                return;
            }
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View child2 = c(i2);
                if (this.u.d(child2) < limit || this.u.f(child2) < limit) {
                    a(recycler, childCount - 1, i2);
                    return;
                }
            }
        }
    }

    private void a(RecyclerView.v recycler, c layoutState) {
        if (layoutState.f۱۸۰۷a && !layoutState.l) {
            if (layoutState.f۱۸۱۲f == -1) {
                a(recycler, layoutState.f۱۸۱۳g);
            } else {
                b(recycler, layoutState.f۱۸۱۳g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a(RecyclerView.v recycler, c layoutState, RecyclerView.a0 state, boolean stopOnFocusable) {
        int start = layoutState.f۱۸۰۹c;
        int i = layoutState.f۱۸۱۳g;
        if (i != Integer.MIN_VALUE) {
            int i2 = layoutState.f۱۸۰۹c;
            if (i2 < 0) {
                layoutState.f۱۸۱۳g = i + i2;
            }
            a(recycler, layoutState);
        }
        int remainingSpace = layoutState.f۱۸۰۹c + layoutState.f۱۸۱۴h;
        b layoutChunkResult = this.F;
        while (true) {
            if ((!layoutState.l && remainingSpace <= 0) || !layoutState.a(state)) {
                break;
            }
            layoutChunkResult.a();
            a(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.f۱۸۰۴b) {
                layoutState.f۱۸۰۸b += layoutChunkResult.f۱۸۰۳a * layoutState.f۱۸۱۲f;
                if (!layoutChunkResult.f۱۸۰۵c || this.t.k != null || !state.d()) {
                    int i3 = layoutState.f۱۸۰۹c;
                    int i4 = layoutChunkResult.f۱۸۰۳a;
                    layoutState.f۱۸۰۹c = i3 - i4;
                    remainingSpace -= i4;
                }
                int i5 = layoutState.f۱۸۱۳g;
                if (i5 != Integer.MIN_VALUE) {
                    layoutState.f۱۸۱۳g = i5 + layoutChunkResult.f۱۸۰۳a;
                    int i6 = layoutState.f۱۸۰۹c;
                    if (i6 < 0) {
                        layoutState.f۱۸۱۳g += i6;
                    }
                    a(recycler, layoutState);
                }
                if (stopOnFocusable && layoutChunkResult.f۱۸۰۶d) {
                    break;
                }
            } else {
                break;
            }
        }
        return start - layoutState.f۱۸۰۹c;
    }

    /* JADX INFO: Multiple debug info for r1v2 int: [D('right' int), D('left' int)] */
    /* JADX INFO: Multiple debug info for r1v4 int: [D('top' int), D('bottom' int)] */
    /* access modifiers changed from: package-private */
    public void a(RecyclerView.v recycler, RecyclerView.a0 state, c layoutState, b result) {
        int bottom;
        int right;
        int top;
        int left;
        int left2;
        int right2;
        View view = layoutState.a(recycler);
        if (view == null) {
            result.f۱۸۰۴b = true;
            return;
        }
        RecyclerView.p params = (RecyclerView.p) view.getLayoutParams();
        if (layoutState.k == null) {
            if (this.x == (layoutState.f۱۸۱۲f == -1)) {
                b(view);
            } else {
                b(view, 0);
            }
        } else {
            if (this.x == (layoutState.f۱۸۱۲f == -1)) {
                a(view);
            } else {
                a(view, 0);
            }
        }
        a(view, 0, 0);
        result.f۱۸۰۳a = this.u.b(view);
        if (this.s == 1) {
            if (I()) {
                right2 = q() - o();
                left2 = right2 - this.u.c(view);
            } else {
                left2 = n();
                right2 = this.u.c(view) + left2;
            }
            if (layoutState.f۱۸۱۲f == -1) {
                right = right2;
                bottom = layoutState.f۱۸۰۸b;
                left = left2;
                top = layoutState.f۱۸۰۸b - result.f۱۸۰۳a;
            } else {
                right = right2;
                top = layoutState.f۱۸۰۸b;
                left = left2;
                bottom = layoutState.f۱۸۰۸b + result.f۱۸۰۳a;
            }
        } else {
            int top2 = p();
            int bottom2 = this.u.c(view) + top2;
            if (layoutState.f۱۸۱۲f == -1) {
                top = top2;
                right = layoutState.f۱۸۰۸b;
                bottom = bottom2;
                left = layoutState.f۱۸۰۸b - result.f۱۸۰۳a;
            } else {
                top = top2;
                left = layoutState.f۱۸۰۸b;
                bottom = bottom2;
                right = layoutState.f۱۸۰۸b + result.f۱۸۰۳a;
            }
        }
        a(view, left, top, right, bottom);
        if (params.c() || params.b()) {
            result.f۱۸۰۵c = true;
        }
        result.f۱۸۰۶d = view.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.v7.widget.RecyclerView.o
    public boolean A() {
        return (i() == 1073741824 || r() == 1073741824 || !s()) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public int i(int focusDirection) {
        if (focusDirection != 1) {
            if (focusDirection != 2) {
                if (focusDirection != 17) {
                    if (focusDirection != 33) {
                        if (focusDirection != 66) {
                            if (focusDirection == 130 && this.s == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.s == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.s == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.s == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.s != 1 && I()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.s != 1 && I()) {
            return 1;
        } else {
            return -1;
        }
    }

    private View L() {
        return c(this.x ? e() - 1 : 0);
    }

    private View K() {
        return c(this.x ? 0 : e() - 1);
    }

    private View b(boolean completelyVisible, boolean acceptPartiallyVisible) {
        if (this.x) {
            return a(e() - 1, -1, completelyVisible, acceptPartiallyVisible);
        }
        return a(0, e(), completelyVisible, acceptPartiallyVisible);
    }

    private View a(boolean completelyVisible, boolean acceptPartiallyVisible) {
        if (this.x) {
            return a(0, e(), completelyVisible, acceptPartiallyVisible);
        }
        return a(e() - 1, -1, completelyVisible, acceptPartiallyVisible);
    }

    private View l(RecyclerView.v recycler, RecyclerView.a0 state) {
        if (this.x) {
            return g(recycler, state);
        }
        return i(recycler, state);
    }

    private View m(RecyclerView.v recycler, RecyclerView.a0 state) {
        if (this.x) {
            return i(recycler, state);
        }
        return g(recycler, state);
    }

    private View g(RecyclerView.v recycler, RecyclerView.a0 state) {
        return a(recycler, state, 0, e(), state.a());
    }

    private View i(RecyclerView.v recycler, RecyclerView.a0 state) {
        return a(recycler, state, e() - 1, -1, state.a());
    }

    /* access modifiers changed from: package-private */
    public View a(RecyclerView.v recycler, RecyclerView.a0 state, int start, int end, int itemCount) {
        E();
        View invalidMatch = null;
        View outOfBoundsMatch = null;
        int boundsStart = this.u.f();
        int boundsEnd = this.u.b();
        int diff = end > start ? 1 : -1;
        for (int i = start; i != end; i += diff) {
            View view = c(i);
            int position = l(view);
            if (position >= 0 && position < itemCount) {
                if (((RecyclerView.p) view.getLayoutParams()).c()) {
                    if (invalidMatch == null) {
                        invalidMatch = view;
                    }
                } else if (this.u.d(view) < boundsEnd && this.u.a(view) >= boundsStart) {
                    return view;
                } else {
                    if (outOfBoundsMatch == null) {
                        outOfBoundsMatch = view;
                    }
                }
            }
        }
        return outOfBoundsMatch != null ? outOfBoundsMatch : invalidMatch;
    }

    private View j(RecyclerView.v recycler, RecyclerView.a0 state) {
        if (this.x) {
            return f(recycler, state);
        }
        return h(recycler, state);
    }

    private View k(RecyclerView.v recycler, RecyclerView.a0 state) {
        if (this.x) {
            return h(recycler, state);
        }
        return f(recycler, state);
    }

    private View f(RecyclerView.v recycler, RecyclerView.a0 state) {
        return e(0, e());
    }

    private View h(RecyclerView.v recycler, RecyclerView.a0 state) {
        return e(e() - 1, -1);
    }

    public int F() {
        View child = a(0, e(), false, true);
        if (child == null) {
            return -1;
        }
        return l(child);
    }

    public int G() {
        View child = a(e() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return l(child);
    }

    /* access modifiers changed from: package-private */
    public View a(int fromIndex, int toIndex, boolean completelyVisible, boolean acceptPartiallyVisible) {
        int preferredBoundsFlag;
        E();
        int acceptableBoundsFlag = 0;
        if (completelyVisible) {
            preferredBoundsFlag = 24579;
        } else {
            preferredBoundsFlag = 320;
        }
        if (acceptPartiallyVisible) {
            acceptableBoundsFlag = 320;
        }
        if (this.s == 0) {
            return this.f۱۸۶۴e.a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
        }
        return this.f۱۸۶۵f.a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
    }

    /* access modifiers changed from: package-private */
    public View e(int fromIndex, int toIndex) {
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        E();
        if ((toIndex > fromIndex ? 1 : toIndex < fromIndex ? -1 : 0) == 0) {
            return c(fromIndex);
        }
        if (this.u.d(c(fromIndex)) < this.u.f()) {
            preferredBoundsFlag = 16644;
            acceptableBoundsFlag = 16388;
        } else {
            preferredBoundsFlag = 4161;
            acceptableBoundsFlag = 4097;
        }
        if (this.s == 0) {
            return this.f۱۸۶۴e.a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
        }
        return this.f۱۸۶۵f.a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public View a(View focused, int focusDirection, RecyclerView.v recycler, RecyclerView.a0 state) {
        int layoutDir;
        View nextCandidate;
        View nextFocus;
        M();
        if (e() == 0 || (layoutDir = i(focusDirection)) == Integer.MIN_VALUE) {
            return null;
        }
        E();
        E();
        a(layoutDir, (int) (((float) this.u.g()) * 0.33333334f), false, state);
        c cVar = this.t;
        cVar.f۱۸۱۳g = Integer.MIN_VALUE;
        cVar.f۱۸۰۷a = false;
        a(recycler, cVar, state, true);
        if (layoutDir == -1) {
            nextCandidate = k(recycler, state);
        } else {
            nextCandidate = j(recycler, state);
        }
        if (layoutDir == -1) {
            nextFocus = L();
        } else {
            nextFocus = K();
        }
        if (!nextFocus.hasFocusable()) {
            return nextCandidate;
        }
        if (nextCandidate == null) {
            return null;
        }
        return nextFocus;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public boolean C() {
        return this.D == null && this.v == this.y;
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f۱۸۰۷a = true;

        /* renamed from: b  reason: collision with root package name */
        int f۱۸۰۸b;

        /* renamed from: c  reason: collision with root package name */
        int f۱۸۰۹c;

        /* renamed from: d  reason: collision with root package name */
        int f۱۸۱۰d;

        /* renamed from: e  reason: collision with root package name */
        int f۱۸۱۱e;

        /* renamed from: f  reason: collision with root package name */
        int f۱۸۱۲f;

        /* renamed from: g  reason: collision with root package name */
        int f۱۸۱۳g;

        /* renamed from: h  reason: collision with root package name */
        int f۱۸۱۴h = 0;
        boolean i;
        int j;
        List<RecyclerView.d0> k = null;
        boolean l;

        c() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(RecyclerView.a0 state) {
            int i2 = this.f۱۸۱۰d;
            return i2 >= 0 && i2 < state.a();
        }

        /* access modifiers changed from: package-private */
        public View a(RecyclerView.v recycler) {
            if (this.k != null) {
                return b();
            }
            View view = recycler.d(this.f۱۸۱۰d);
            this.f۱۸۱۰d += this.f۱۸۱۱e;
            return view;
        }

        private View b() {
            int size = this.k.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.k.get(i2).f۱۸۴۱c;
                RecyclerView.p lp = (RecyclerView.p) view.getLayoutParams();
                if (!lp.c() && this.f۱۸۱۰d == lp.a()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            a((View) null);
        }

        public void a(View ignore) {
            View closest = b(ignore);
            if (closest == null) {
                this.f۱۸۱۰d = -1;
            } else {
                this.f۱۸۱۰d = ((RecyclerView.p) closest.getLayoutParams()).a();
            }
        }

        public View b(View ignore) {
            int distance;
            int size = this.k.size();
            View closest = null;
            int closestDistance = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.k.get(i2).f۱۸۴۱c;
                RecyclerView.p lp = (RecyclerView.p) view.getLayoutParams();
                if (view != ignore && !lp.c() && (distance = (lp.a() - this.f۱۸۱۰d) * this.f۱۸۱۱e) >= 0 && distance < closestDistance) {
                    closest = view;
                    closestDistance = distance;
                    if (distance == 0) {
                        break;
                    }
                }
            }
            return closest;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f۱۸۱۵c;

        /* renamed from: d  reason: collision with root package name */
        int f۱۸۱۶d;

        /* renamed from: e  reason: collision with root package name */
        boolean f۱۸۱۷e;

        public d() {
        }

        d(Parcel in) {
            this.f۱۸۱۵c = in.readInt();
            this.f۱۸۱۶d = in.readInt();
            this.f۱۸۱۷e = in.readInt() != 1 ? false : true;
        }

        public d(d other) {
            this.f۱۸۱۵c = other.f۱۸۱۵c;
            this.f۱۸۱۶d = other.f۱۸۱۶d;
            this.f۱۸۱۷e = other.f۱۸۱۷e;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f۱۸۱۵c >= 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f۱۸۱۵c = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f۱۸۱۵c);
            dest.writeInt(this.f۱۸۱۶d);
            dest.writeInt(this.f۱۸۱۷e ? 1 : 0);
        }

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel in) {
                return new d(in);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int size) {
                return new d[size];
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        t0 f۱۷۹۸a;

        /* renamed from: b  reason: collision with root package name */
        int f۱۷۹۹b;

        /* renamed from: c  reason: collision with root package name */
        int f۱۸۰۰c;

        /* renamed from: d  reason: collision with root package name */
        boolean f۱۸۰۱d;

        /* renamed from: e  reason: collision with root package name */
        boolean f۱۸۰۲e;

        a() {
            b();
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f۱۷۹۹b = -1;
            this.f۱۸۰۰c = Integer.MIN_VALUE;
            this.f۱۸۰۱d = false;
            this.f۱۸۰۲e = false;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i;
            if (this.f۱۸۰۱d) {
                i = this.f۱۷۹۸a.b();
            } else {
                i = this.f۱۷۹۸a.f();
            }
            this.f۱۸۰۰c = i;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f۱۷۹۹b + ", mCoordinate=" + this.f۱۸۰۰c + ", mLayoutFromEnd=" + this.f۱۸۰۱d + ", mValid=" + this.f۱۸۰۲e + '}';
        }

        /* access modifiers changed from: package-private */
        public boolean a(View child, RecyclerView.a0 state) {
            RecyclerView.p lp = (RecyclerView.p) child.getLayoutParams();
            return !lp.c() && lp.a() >= 0 && lp.a() < state.a();
        }

        public void b(View child, int position) {
            int endMargin;
            int spaceChange = this.f۱۷۹۸a.h();
            if (spaceChange >= 0) {
                a(child, position);
                return;
            }
            this.f۱۷۹۹b = position;
            if (this.f۱۸۰۱d) {
                int previousEndMargin = (this.f۱۷۹۸a.b() - spaceChange) - this.f۱۷۹۸a.a(child);
                this.f۱۸۰۰c = this.f۱۷۹۸a.b() - previousEndMargin;
                if (previousEndMargin > 0) {
                    int childSize = this.f۱۷۹۸a.b(child);
                    int layoutStart = this.f۱۷۹۸a.f();
                    int startMargin = (this.f۱۸۰۰c - childSize) - (Math.min(this.f۱۷۹۸a.d(child) - layoutStart, 0) + layoutStart);
                    if (startMargin < 0) {
                        this.f۱۸۰۰c += Math.min(previousEndMargin, -startMargin);
                        return;
                    }
                    return;
                }
                return;
            }
            int childStart = this.f۱۷۹۸a.d(child);
            int startMargin2 = childStart - this.f۱۷۹۸a.f();
            this.f۱۸۰۰c = childStart;
            if (startMargin2 > 0 && (endMargin = (this.f۱۷۹۸a.b() - Math.min(0, (this.f۱۷۹۸a.b() - spaceChange) - this.f۱۷۹۸a.a(child))) - (this.f۱۷۹۸a.b(child) + childStart)) < 0) {
                this.f۱۸۰۰c -= Math.min(startMargin2, -endMargin);
            }
        }

        public void a(View child, int position) {
            if (this.f۱۸۰۱d) {
                this.f۱۸۰۰c = this.f۱۷۹۸a.a(child) + this.f۱۷۹۸a.h();
            } else {
                this.f۱۸۰۰c = this.f۱۷۹۸a.d(child);
            }
            this.f۱۷۹۹b = position;
        }
    }

    /* access modifiers changed from: protected */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f۱۸۰۳a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f۱۸۰۴b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f۱۸۰۵c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f۱۸۰۶d;

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f۱۸۰۳a = 0;
            this.f۱۸۰۴b = false;
            this.f۱۸۰۵c = false;
            this.f۱۸۰۶d = false;
        }
    }
}
