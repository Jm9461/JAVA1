package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.d0.c;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;

public class GridLayoutManager extends LinearLayoutManager {
    boolean H = false;
    int I = -1;
    int[] J;
    View[] K;
    final SparseIntArray L = new SparseIntArray();
    final SparseIntArray M = new SparseIntArray();
    c N = new a();
    final Rect O = new Rect();

    public GridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        k(RecyclerView.o.a(context, attrs, defStyleAttr, defStyleRes).f۱۸۷۱b);
    }

    public GridLayoutManager(Context context, int spanCount) {
        super(context);
        k(spanCount);
    }

    public GridLayoutManager(Context context, int spanCount, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
        k(spanCount);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void b(boolean stackFromEnd) {
        if (!stackFromEnd) {
            super.b(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int b(RecyclerView.v recycler, RecyclerView.a0 state) {
        if (this.s == 0) {
            return this.I;
        }
        if (state.a() < 1) {
            return 0;
        }
        return a(recycler, state, state.a() - 1) + 1;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public int a(RecyclerView.v recycler, RecyclerView.a0 state) {
        if (this.s == 1) {
            return this.I;
        }
        if (state.a() < 1) {
            return 0;
        }
        return a(recycler, state, state.a() - 1) + 1;
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(RecyclerView.v recycler, RecyclerView.a0 state, View host, android.support.v4.view.d0.c info2) {
        ViewGroup.LayoutParams lp = host.getLayoutParams();
        if (!(lp instanceof b)) {
            super.a(host, info2);
            return;
        }
        b glp = (b) lp;
        int spanGroupIndex = a(recycler, state, glp.a());
        if (this.s == 0) {
            info2.b(c.C۰۰۳۲c.a(glp.e(), glp.f(), spanGroupIndex, 1, this.I > 1 && glp.f() == this.I, false));
        } else {
            info2.b(c.C۰۰۳۲c.a(spanGroupIndex, 1, glp.e(), glp.f(), this.I > 1 && glp.f() == this.I, false));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.o
    public void e(RecyclerView.v recycler, RecyclerView.a0 state) {
        if (state.d()) {
            K();
        }
        super.e(recycler, state);
        L();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.o
    public void g(RecyclerView.a0 state) {
        super.g(state);
        this.H = false;
    }

    private void L() {
        this.L.clear();
        this.M.clear();
    }

    private void K() {
        int childCount = e();
        for (int i = 0; i < childCount; i++) {
            b lp = (b) c(i).getLayoutParams();
            int viewPosition = lp.a();
            this.L.put(viewPosition, lp.f());
            this.M.put(viewPosition, lp.e());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int positionStart, int itemCount) {
        this.N.a();
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void d(RecyclerView recyclerView) {
        this.N.a();
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void b(RecyclerView recyclerView, int positionStart, int itemCount) {
        this.N.a();
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
        this.N.a();
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int from, int to, int itemCount) {
        this.N.a();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.o
    public RecyclerView.p c() {
        if (this.s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public RecyclerView.p a(Context c2, AttributeSet attrs) {
        return new b(c2, attrs);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public RecyclerView.p a(ViewGroup.LayoutParams lp) {
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) lp);
        }
        return new b(lp);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public boolean a(RecyclerView.p lp) {
        return lp instanceof b;
    }

    private void N() {
        int totalSpace;
        if (H() == 1) {
            totalSpace = (q() - o()) - n();
        } else {
            totalSpace = (h() - m()) - p();
        }
        l(totalSpace);
    }

    @Override // android.support.v7.widget.RecyclerView.o
    public void a(Rect childrenBounds, int wSpec, int hSpec) {
        int width;
        int usedHeight;
        if (this.J == null) {
            super.a(childrenBounds, wSpec, hSpec);
        }
        int horizontalPadding = n() + o();
        int verticalPadding = p() + m();
        if (this.s == 1) {
            width = RecyclerView.o.a(hSpec, childrenBounds.height() + verticalPadding, k());
            int[] iArr = this.J;
            usedHeight = RecyclerView.o.a(wSpec, iArr[iArr.length - 1] + horizontalPadding, l());
        } else {
            int width2 = RecyclerView.o.a(wSpec, childrenBounds.width() + horizontalPadding, l());
            int[] iArr2 = this.J;
            width = RecyclerView.o.a(hSpec, iArr2[iArr2.length - 1] + verticalPadding, k());
            usedHeight = width2;
        }
        c(usedHeight, width);
    }

    private void l(int totalSpace) {
        this.J = a(this.J, this.I, totalSpace);
    }

    static int[] a(int[] cachedBorders, int spanCount, int totalSpace) {
        if (!(cachedBorders != null && cachedBorders.length == spanCount + 1 && cachedBorders[cachedBorders.length - 1] == totalSpace)) {
            cachedBorders = new int[(spanCount + 1)];
        }
        cachedBorders[0] = 0;
        int sizePerSpan = totalSpace / spanCount;
        int sizePerSpanRemainder = totalSpace % spanCount;
        int consumedPixels = 0;
        int additionalSize = 0;
        for (int i = 1; i <= spanCount; i++) {
            int itemSize = sizePerSpan;
            additionalSize += sizePerSpanRemainder;
            if (additionalSize > 0 && spanCount - additionalSize < sizePerSpanRemainder) {
                itemSize++;
                additionalSize -= spanCount;
            }
            consumedPixels += itemSize;
            cachedBorders[i] = consumedPixels;
        }
        return cachedBorders;
    }

    /* access modifiers changed from: package-private */
    public int f(int startSpan, int spanSize) {
        if (this.s != 1 || !I()) {
            int[] iArr = this.J;
            return iArr[startSpan + spanSize] - iArr[startSpan];
        }
        int[] iArr2 = this.J;
        int i = this.I;
        return iArr2[i - startSpan] - iArr2[(i - startSpan) - spanSize];
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.v7.widget.LinearLayoutManager
    public void a(RecyclerView.v recycler, RecyclerView.a0 state, LinearLayoutManager.a anchorInfo, int itemDirection) {
        super.a(recycler, state, anchorInfo, itemDirection);
        N();
        if (state.a() > 0 && !state.d()) {
            b(recycler, state, anchorInfo, itemDirection);
        }
        M();
    }

    private void M() {
        View[] viewArr = this.K;
        if (viewArr == null || viewArr.length != this.I) {
            this.K = new View[this.I];
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.o
    public int a(int dx, RecyclerView.v recycler, RecyclerView.a0 state) {
        N();
        M();
        return super.a(dx, recycler, state);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.o
    public int b(int dy, RecyclerView.v recycler, RecyclerView.a0 state) {
        N();
        M();
        return super.b(dy, recycler, state);
    }

    private void b(RecyclerView.v recycler, RecyclerView.a0 state, LinearLayoutManager.a anchorInfo, int itemDirection) {
        boolean layingOutInPrimaryDirection = itemDirection == 1;
        int span = b(recycler, state, anchorInfo.f۱۷۹۹b);
        if (layingOutInPrimaryDirection) {
            while (span > 0) {
                int i = anchorInfo.f۱۷۹۹b;
                if (i > 0) {
                    anchorInfo.f۱۷۹۹b = i - 1;
                    span = b(recycler, state, anchorInfo.f۱۷۹۹b);
                } else {
                    return;
                }
            }
            return;
        }
        int indexLimit = state.a() - 1;
        int pos = anchorInfo.f۱۷۹۹b;
        int bestSpan = span;
        while (pos < indexLimit) {
            int next = b(recycler, state, pos + 1);
            if (next <= bestSpan) {
                break;
            }
            pos++;
            bestSpan = next;
        }
        anchorInfo.f۱۷۹۹b = pos;
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.v7.widget.LinearLayoutManager
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
            if (position >= 0 && position < itemCount && b(recycler, state, position) == 0) {
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

    private int a(RecyclerView.v recycler, RecyclerView.a0 state, int viewPosition) {
        if (!state.d()) {
            return this.N.b(viewPosition, this.I);
        }
        int adapterPosition = recycler.a(viewPosition);
        if (adapterPosition != -1) {
            return this.N.b(adapterPosition, this.I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + viewPosition);
        return 0;
    }

    private int b(RecyclerView.v recycler, RecyclerView.a0 state, int pos) {
        if (!state.d()) {
            return this.N.a(pos, this.I);
        }
        int cached = this.M.get(pos, -1);
        if (cached != -1) {
            return cached;
        }
        int adapterPosition = recycler.a(pos);
        if (adapterPosition != -1) {
            return this.N.a(adapterPosition, this.I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + pos);
        return 0;
    }

    private int c(RecyclerView.v recycler, RecyclerView.a0 state, int pos) {
        if (!state.d()) {
            return this.N.a(pos);
        }
        int cached = this.L.get(pos, -1);
        if (cached != -1) {
            return cached;
        }
        int adapterPosition = recycler.a(pos);
        if (adapterPosition != -1) {
            return this.N.a(adapterPosition);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + pos);
        return 1;
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.v7.widget.LinearLayoutManager
    public void a(RecyclerView.a0 state, LinearLayoutManager.c layoutState, RecyclerView.o.c layoutPrefetchRegistry) {
        int remainingSpan = this.I;
        for (int count = 0; count < this.I && layoutState.a(state) && remainingSpan > 0; count++) {
            int pos = layoutState.f۱۸۱۰d;
            layoutPrefetchRegistry.a(pos, Math.max(0, layoutState.f۱۸۱۳g));
            remainingSpan -= this.N.a(pos);
            layoutState.f۱۸۱۰d += layoutState.f۱۸۱۱e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: android.support.v7.widget.GridLayoutManager */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // android.support.v7.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.support.v7.widget.RecyclerView.v r26, android.support.v7.widget.RecyclerView.a0 r27, android.support.v7.widget.LinearLayoutManager.c r28, android.support.v7.widget.LinearLayoutManager.b r29) {
        /*
        // Method dump skipped, instructions count: 681
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.a(android.support.v7.widget.RecyclerView$v, android.support.v7.widget.RecyclerView$a0, android.support.v7.widget.LinearLayoutManager$c, android.support.v7.widget.LinearLayoutManager$b):void");
    }

    private void a(View view, int otherDirParentSpecMode, boolean alreadyMeasured) {
        int hSpec;
        int wSpec;
        b lp = (b) view.getLayoutParams();
        Rect decorInsets = lp.f۱۸۷۵b;
        int verticalInsets = decorInsets.top + decorInsets.bottom + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
        int horizontalInsets = decorInsets.left + decorInsets.right + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin;
        int availableSpaceInOther = f(lp.f۱۷۹۴e, lp.f۱۷۹۵f);
        if (this.s == 1) {
            wSpec = RecyclerView.o.a(availableSpaceInOther, otherDirParentSpecMode, horizontalInsets, ((ViewGroup.MarginLayoutParams) lp).width, false);
            hSpec = RecyclerView.o.a(this.u.g(), i(), verticalInsets, ((ViewGroup.MarginLayoutParams) lp).height, true);
        } else {
            hSpec = RecyclerView.o.a(availableSpaceInOther, otherDirParentSpecMode, verticalInsets, ((ViewGroup.MarginLayoutParams) lp).height, false);
            wSpec = RecyclerView.o.a(this.u.g(), r(), horizontalInsets, ((ViewGroup.MarginLayoutParams) lp).width, true);
        }
        a(view, wSpec, hSpec, alreadyMeasured);
    }

    private void a(float maxSizeInOther, int currentOtherDirSize) {
        l(Math.max(Math.round(((float) this.I) * maxSizeInOther), currentOtherDirSize));
    }

    private void a(View child, int widthSpec, int heightSpec, boolean alreadyMeasured) {
        boolean measure;
        RecyclerView.p lp = (RecyclerView.p) child.getLayoutParams();
        if (alreadyMeasured) {
            measure = b(child, widthSpec, heightSpec, lp);
        } else {
            measure = a(child, widthSpec, heightSpec, lp);
        }
        if (measure) {
            child.measure(widthSpec, heightSpec);
        }
    }

    private void a(RecyclerView.v recycler, RecyclerView.a0 state, int count, int consumedSpanCount, boolean layingOutInPrimaryDirection) {
        int diff;
        int end;
        int start;
        if (layingOutInPrimaryDirection) {
            start = 0;
            end = count;
            diff = 1;
        } else {
            start = count - 1;
            end = -1;
            diff = -1;
        }
        int span = 0;
        for (int i = start; i != end; i += diff) {
            View view = this.K[i];
            b params = (b) view.getLayoutParams();
            params.f۱۷۹۵f = c(recycler, state, l(view));
            params.f۱۷۹۴e = span;
            span += params.f۱۷۹۵f;
        }
    }

    public void k(int spanCount) {
        if (spanCount != this.I) {
            this.H = true;
            if (spanCount >= 1) {
                this.I = spanCount;
                this.N.a();
                y();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + spanCount);
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f۱۷۹۶a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        private boolean f۱۷۹۷b = false;

        public abstract int a(int i);

        public abstract int c(int i, int i2);

        public void a() {
            this.f۱۷۹۶a.clear();
        }

        /* access modifiers changed from: package-private */
        public int a(int position, int spanCount) {
            if (!this.f۱۷۹۷b) {
                return c(position, spanCount);
            }
            int existing = this.f۱۷۹۶a.get(position, -1);
            if (existing != -1) {
                return existing;
            }
            int value = c(position, spanCount);
            this.f۱۷۹۶a.put(position, value);
            return value;
        }

        public int b(int adapterPosition, int spanCount) {
            int span = 0;
            int group = 0;
            int positionSpanSize = a(adapterPosition);
            for (int i = 0; i < adapterPosition; i++) {
                int size = a(i);
                span += size;
                if (span == spanCount) {
                    span = 0;
                    group++;
                } else if (span > spanCount) {
                    span = size;
                    group++;
                }
            }
            if (span + positionSpanSize > spanCount) {
                return group + 1;
            }
            return group;
        }
    }

    /* JADX INFO: Multiple debug info for r3v3 int: [D('prevFocusedChild' android.view.View), D('candidateStart' int)] */
    /* JADX INFO: Multiple debug info for r13v12 int: [D('assignAsWeek' boolean), D('overlap' int)] */
    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.o
    public View a(View focused, int focusDirection, RecyclerView.v recycler, RecyclerView.a0 state) {
        int limit;
        int inc;
        int start;
        int focusableSpanGroupIndex;
        View prevFocusedChild;
        int focusableWeakCandidateOverlap;
        int focusableWeakCandidateSpanIndex;
        boolean assignAsWeek;
        RecyclerView.v vVar = recycler;
        RecyclerView.a0 a0Var = state;
        View prevFocusedChild2 = c(focused);
        if (prevFocusedChild2 == null) {
            return null;
        }
        b lp = (b) prevFocusedChild2.getLayoutParams();
        int prevSpanStart = lp.f۱۷۹۴e;
        int prevSpanEnd = lp.f۱۷۹۴e + lp.f۱۷۹۵f;
        if (super.a(focused, focusDirection, recycler, state) == null) {
            return null;
        }
        if ((i(focusDirection) == 1) != this.x) {
            start = e() - 1;
            inc = -1;
            limit = -1;
        } else {
            start = 0;
            inc = 1;
            limit = e();
        }
        boolean preferLastSpan = this.s == 1 && I();
        View focusableWeakCandidate = null;
        View unfocusableWeakCandidate = null;
        int focusableSpanGroupIndex2 = a(vVar, a0Var, start);
        int i = start;
        int focusableWeakCandidateSpanIndex2 = -1;
        int focusableWeakCandidateOverlap2 = 0;
        int unfocusableWeakCandidateSpanIndex = -1;
        int unfocusableWeakCandidateOverlap = 0;
        while (true) {
            if (i == limit) {
                break;
            }
            int spanGroupIndex = a(vVar, a0Var, i);
            View candidate = c(i);
            if (candidate == prevFocusedChild2) {
                break;
            }
            if (!candidate.hasFocusable() || spanGroupIndex == focusableSpanGroupIndex2) {
                b candidateLp = (b) candidate.getLayoutParams();
                prevFocusedChild = prevFocusedChild2;
                int candidateStart = candidateLp.f۱۷۹۴e;
                focusableSpanGroupIndex = focusableSpanGroupIndex2;
                int candidateEnd = candidateLp.f۱۷۹۴e + candidateLp.f۱۷۹۵f;
                if (candidate.hasFocusable() && candidateStart == prevSpanStart && candidateEnd == prevSpanEnd) {
                    return candidate;
                }
                if ((!candidate.hasFocusable() || focusableWeakCandidate != null) && (candidate.hasFocusable() || unfocusableWeakCandidate != null)) {
                    assignAsWeek = false;
                    int overlap = Math.min(candidateEnd, prevSpanEnd) - Math.max(candidateStart, prevSpanStart);
                    if (!candidate.hasFocusable()) {
                        focusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                        if (focusableWeakCandidate == null) {
                            focusableWeakCandidateOverlap = focusableWeakCandidateOverlap2;
                            boolean z = false;
                            if (a(candidate, false, true)) {
                                if (overlap > unfocusableWeakCandidateOverlap) {
                                    assignAsWeek = true;
                                } else if (overlap == unfocusableWeakCandidateOverlap) {
                                    if (candidateStart > unfocusableWeakCandidateSpanIndex) {
                                        z = true;
                                    }
                                    if (preferLastSpan == z) {
                                        assignAsWeek = true;
                                    }
                                }
                            }
                        } else {
                            focusableWeakCandidateOverlap = focusableWeakCandidateOverlap2;
                        }
                    } else if (overlap > focusableWeakCandidateOverlap2) {
                        assignAsWeek = true;
                        focusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                        focusableWeakCandidateOverlap = focusableWeakCandidateOverlap2;
                    } else {
                        if (overlap == focusableWeakCandidateOverlap2) {
                            focusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                            if (preferLastSpan == (candidateStart > focusableWeakCandidateSpanIndex2)) {
                                assignAsWeek = true;
                                focusableWeakCandidateOverlap = focusableWeakCandidateOverlap2;
                            }
                        } else {
                            focusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                        }
                        focusableWeakCandidateOverlap = focusableWeakCandidateOverlap2;
                    }
                } else {
                    focusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                    focusableWeakCandidateOverlap = focusableWeakCandidateOverlap2;
                    assignAsWeek = true;
                }
                if (assignAsWeek) {
                    if (candidate.hasFocusable()) {
                        int focusableWeakCandidateSpanIndex3 = candidateLp.f۱۷۹۴e;
                        focusableWeakCandidateOverlap = Math.min(candidateEnd, prevSpanEnd) - Math.max(candidateStart, prevSpanStart);
                        focusableWeakCandidate = candidate;
                        focusableWeakCandidateSpanIndex2 = focusableWeakCandidateSpanIndex3;
                    } else {
                        unfocusableWeakCandidateSpanIndex = candidateLp.f۱۷۹۴e;
                        unfocusableWeakCandidate = candidate;
                        unfocusableWeakCandidateOverlap = Math.min(candidateEnd, prevSpanEnd) - Math.max(candidateStart, prevSpanStart);
                        focusableWeakCandidateSpanIndex2 = focusableWeakCandidateSpanIndex;
                    }
                    i += inc;
                    vVar = recycler;
                    a0Var = state;
                    focusableWeakCandidateOverlap2 = focusableWeakCandidateOverlap;
                    start = start;
                    prevFocusedChild2 = prevFocusedChild;
                    focusableSpanGroupIndex2 = focusableSpanGroupIndex;
                }
            } else if (focusableWeakCandidate != null) {
                break;
            } else {
                prevFocusedChild = prevFocusedChild2;
                focusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                focusableWeakCandidateOverlap = focusableWeakCandidateOverlap2;
                focusableSpanGroupIndex = focusableSpanGroupIndex2;
            }
            focusableWeakCandidateSpanIndex2 = focusableWeakCandidateSpanIndex;
            i += inc;
            vVar = recycler;
            a0Var = state;
            focusableWeakCandidateOverlap2 = focusableWeakCandidateOverlap;
            start = start;
            prevFocusedChild2 = prevFocusedChild;
            focusableSpanGroupIndex2 = focusableSpanGroupIndex;
        }
        return focusableWeakCandidate != null ? focusableWeakCandidate : unfocusableWeakCandidate;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.o
    public boolean C() {
        return this.D == null && !this.H;
    }

    public static final class a extends c {
        @Override // android.support.v7.widget.GridLayoutManager.c
        public int a(int position) {
            return 1;
        }

        @Override // android.support.v7.widget.GridLayoutManager.c
        public int c(int position, int spanCount) {
            return position % spanCount;
        }
    }

    public static class b extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        int f۱۷۹۴e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f۱۷۹۵f = 0;

        public b(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }

        public b(int width, int height) {
            super(width, height);
        }

        public b(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public b(ViewGroup.LayoutParams source) {
            super(source);
        }

        public int e() {
            return this.f۱۷۹۴e;
        }

        public int f() {
            return this.f۱۷۹۵f;
        }
    }
}
