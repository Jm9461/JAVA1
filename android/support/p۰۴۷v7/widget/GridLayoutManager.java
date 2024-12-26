package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cc;
import android.support.p۰۴۷v7.widget.LinearLayoutManager;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.GridLayoutManager */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: H  reason: contains not printable characters */
    boolean f۱۱۴۷۴H = false;

    /* renamed from: I  reason: contains not printable characters */
    int f۱۱۴۷۵I = -1;

    /* renamed from: J  reason: contains not printable characters */
    int[] f۱۱۴۷۶J;

    /* renamed from: K  reason: contains not printable characters */
    View[] f۱۱۴۷۷K;

    /* renamed from: L  reason: contains not printable characters */
    final SparseIntArray f۱۱۴۷۸L = new SparseIntArray();

    /* renamed from: M  reason: contains not printable characters */
    final SparseIntArray f۱۱۴۷۹M = new SparseIntArray();

    /* renamed from: N  reason: contains not printable characters */
    AbstractCc f۱۱۴۸۰N = new Ca();

    /* renamed from: O  reason: contains not printable characters */
    final Rect f۱۱۴۸۱O = new Rect();

    public GridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        m۱۴۱۳۱k(RecyclerView.AbstractCo.m۱۴۴۹۶a(context, attrs, defStyleAttr, defStyleRes).f۱۱۶۸۹b);
    }

    public GridLayoutManager(Context context, int spanCount) {
        super(context);
        m۱۴۱۳۱k(spanCount);
    }

    public GridLayoutManager(Context context, int spanCount, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
        m۱۴۱۳۱k(spanCount);
    }

    @Override // android.support.p۰۴۷v7.widget.LinearLayoutManager
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۱۲۵b(boolean stackFromEnd) {
        if (!stackFromEnd) {
            super.m۱۴۲۰۱b(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۴۱۲۳b(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        if (this.f۱۱۴۹۳s == 0) {
            return this.f۱۱۴۷۵I;
        }
        if (state.m۱۴۳۵۳a() < 1) {
            return 0;
        }
        return m۱۴۰۹۶a(recycler, state, state.m۱۴۳۵۳a() - 1) + 1;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۴۱۰۸a(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        if (this.f۱۱۴۹۳s == 1) {
            return this.f۱۱۴۷۵I;
        }
        if (state.m۱۴۳۵۳a() < 1) {
            return 0;
        }
        return m۱۴۰۹۶a(recycler, state, state.m۱۴۳۵۳a() - 1) + 1;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۱۷a(RecyclerView.Cv recycler, RecyclerView.Ca0 state, View host, Cc info2) {
        ViewGroup.LayoutParams lp = host.getLayoutParams();
        if (!(lp instanceof Cb)) {
            super.m۱۴۵۳۷a(host, info2);
            return;
        }
        Cb glp = (Cb) lp;
        int spanGroupIndex = m۱۴۰۹۶a(recycler, state, glp.m۱۴۶۴۲a());
        if (this.f۱۱۴۹۳s == 0) {
            info2.m۱۲۸۵۱b(Cc.Cc.m۱۲۸۹۴a(glp.m۱۴۱۳۴e(), glp.m۱۴۱۳۵f(), spanGroupIndex, 1, this.f۱۱۴۷۵I > 1 && glp.m۱۴۱۳۵f() == this.f۱۱۴۷۵I, false));
        } else {
            info2.m۱۲۸۵۱b(Cc.Cc.m۱۲۸۹۴a(spanGroupIndex, 1, glp.m۱۴۱۳۴e(), glp.m۱۴۱۳۵f(), this.f۱۱۴۷۵I > 1 && glp.m۱۴۱۳۵f() == this.f۱۱۴۷۵I, false));
        }
    }

    @Override // android.support.p۰۴۷v7.widget.LinearLayoutManager, android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۴۱۲۸e(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        if (state.m۱۴۳۵۸d()) {
            m۱۴۰۹۲K();
        }
        super.m۱۴۲۰۹e(recycler, state);
        m۱۴۰۹۳L();
    }

    @Override // android.support.p۰۴۷v7.widget.LinearLayoutManager, android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۴۱۳۰g(RecyclerView.Ca0 state) {
        super.m۱۴۲۱۱g(state);
        this.f۱۱۴۷۴H = false;
    }

    /* renamed from: L  reason: contains not printable characters */
    private void m۱۴۰۹۳L() {
        this.f۱۱۴۷۸L.clear();
        this.f۱۱۴۷۹M.clear();
    }

    /* renamed from: K  reason: contains not printable characters */
    private void m۱۴۰۹۲K() {
        int childCount = m۱۴۵۸۸e();
        for (int i = 0; i < childCount; i++) {
            Cb lp = (Cb) m۱۴۵۷۳c(i).getLayoutParams();
            int viewPosition = lp.m۱۴۶۴۲a();
            this.f۱۱۴۷۸L.put(viewPosition, lp.m۱۴۱۳۵f());
            this.f۱۱۴۷۹M.put(viewPosition, lp.m۱۴۱۳۴e());
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۱۸a(RecyclerView recyclerView, int positionStart, int itemCount) {
        this.f۱۱۴۸۰N.m۱۴۱۳۸a();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۴۱۲۷d(RecyclerView recyclerView) {
        this.f۱۱۴۸۰N.m۱۴۱۳۸a();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۱۲۴b(RecyclerView recyclerView, int positionStart, int itemCount) {
        this.f۱۱۴۸۰N.m۱۴۱۳۸a();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۲۰a(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
        this.f۱۱۴۸۰N.m۱۴۱۳۸a();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۱۹a(RecyclerView recyclerView, int from, int to, int itemCount) {
        this.f۱۱۴۸۰N.m۱۴۱۳۸a();
    }

    @Override // android.support.p۰۴۷v7.widget.LinearLayoutManager, android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: c  reason: contains not printable characters */
    public RecyclerView.Cp m۱۴۱۲۶c() {
        if (this.f۱۱۴۹۳s == 0) {
            return new Cb(-2, -1);
        }
        return new Cb(-1, -2);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public RecyclerView.Cp m۱۴۱۰۹a(Context c, AttributeSet attrs) {
        return new Cb(c, attrs);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public RecyclerView.Cp m۱۴۱۱۰a(ViewGroup.LayoutParams lp) {
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new Cb((ViewGroup.MarginLayoutParams) lp);
        }
        return new Cb(lp);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۱۲۱a(RecyclerView.Cp lp) {
        return lp instanceof Cb;
    }

    /* renamed from: N  reason: contains not printable characters */
    private void m۱۴۰۹۵N() {
        int totalSpace;
        if (m۱۴۱۷۸H() == 1) {
            totalSpace = (m۱۴۶۲۱q() - m۱۴۶۱۸o()) - m۱۴۶۱۶n();
        } else {
            totalSpace = (m۱۴۶۰۳h() - m۱۴۶۱۴m()) - m۱۴۶۲۰p();
        }
        m۱۴۱۰۵l(totalSpace);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۱۳a(Rect childrenBounds, int wSpec, int hSpec) {
        int width;
        int usedHeight;
        if (this.f۱۱۴۷۶J == null) {
            super.m۱۴۵۱۷a(childrenBounds, wSpec, hSpec);
        }
        int horizontalPadding = m۱۴۶۱۶n() + m۱۴۶۱۸o();
        int verticalPadding = m۱۴۶۲۰p() + m۱۴۶۱۴m();
        if (this.f۱۱۴۹۳s == 1) {
            width = RecyclerView.AbstractCo.m۱۴۴۹۴a(hSpec, childrenBounds.height() + verticalPadding, m۱۴۶۱۰k());
            int[] iArr = this.f۱۱۴۷۶J;
            usedHeight = RecyclerView.AbstractCo.m۱۴۴۹۴a(wSpec, iArr[iArr.length - 1] + horizontalPadding, m۱۴۶۱۲l());
        } else {
            int width2 = RecyclerView.AbstractCo.m۱۴۴۹۴a(wSpec, childrenBounds.width() + horizontalPadding, m۱۴۶۱۲l());
            int[] iArr2 = this.f۱۱۴۷۶J;
            width = RecyclerView.AbstractCo.m۱۴۴۹۴a(hSpec, iArr2[iArr2.length - 1] + verticalPadding, m۱۴۶۱۰k());
            usedHeight = width2;
        }
        m۱۴۵۷۵c(usedHeight, width);
    }

    /* renamed from: l  reason: contains not printable characters */
    private void m۱۴۱۰۵l(int totalSpace) {
        this.f۱۱۴۷۶J = m۱۴۱۰۱a(this.f۱۱۴۷۶J, this.f۱۱۴۷۵I, totalSpace);
    }

    /* renamed from: a  reason: contains not printable characters */
    static int[] m۱۴۱۰۱a(int[] cachedBorders, int spanCount, int totalSpace) {
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
    /* renamed from: f  reason: contains not printable characters */
    public int m۱۴۱۲۹f(int startSpan, int spanSize) {
        if (this.f۱۱۴۹۳s != 1 || !m۱۴۱۷۹I()) {
            int[] iArr = this.f۱۱۴۷۶J;
            return iArr[startSpan + spanSize] - iArr[startSpan];
        }
        int[] iArr2 = this.f۱۱۴۷۶J;
        int i = this.f۱۱۴۷۵I;
        return iArr2[i - startSpan] - iArr2[(i - startSpan) - spanSize];
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p۰۴۷v7.widget.LinearLayoutManager
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۱۵a(RecyclerView.Cv recycler, RecyclerView.Ca0 state, LinearLayoutManager.Ca anchorInfo, int itemDirection) {
        super.m۱۴۱۹۱a(recycler, state, anchorInfo, itemDirection);
        m۱۴۰۹۵N();
        if (state.m۱۴۳۵۳a() > 0 && !state.m۱۴۳۵۸d()) {
            m۱۴۱۰۳b(recycler, state, anchorInfo, itemDirection);
        }
        m۱۴۰۹۴M();
    }

    /* renamed from: M  reason: contains not printable characters */
    private void m۱۴۰۹۴M() {
        View[] viewArr = this.f۱۱۴۷۷K;
        if (viewArr == null || viewArr.length != this.f۱۱۴۷۵I) {
            this.f۱۱۴۷۷K = new View[this.f۱۱۴۷۵I];
        }
    }

    @Override // android.support.p۰۴۷v7.widget.LinearLayoutManager, android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۴۱۰۷a(int dx, RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        m۱۴۰۹۵N();
        m۱۴۰۹۴M();
        return super.m۱۴۱۸۱a(dx, recycler, state);
    }

    @Override // android.support.p۰۴۷v7.widget.LinearLayoutManager, android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۴۱۲۲b(int dy, RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        m۱۴۰۹۵N();
        m۱۴۰۹۴M();
        return super.m۱۴۱۹۷b(dy, recycler, state);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۴۱۰۳b(RecyclerView.Cv recycler, RecyclerView.Ca0 state, LinearLayoutManager.Ca anchorInfo, int itemDirection) {
        boolean layingOutInPrimaryDirection = itemDirection == 1;
        int span = m۱۴۱۰۲b(recycler, state, anchorInfo.f۱۱۵۰۲b);
        if (layingOutInPrimaryDirection) {
            while (span > 0) {
                int i = anchorInfo.f۱۱۵۰۲b;
                if (i > 0) {
                    anchorInfo.f۱۱۵۰۲b = i - 1;
                    span = m۱۴۱۰۲b(recycler, state, anchorInfo.f۱۱۵۰۲b);
                } else {
                    return;
                }
            }
            return;
        }
        int indexLimit = state.m۱۴۳۵۳a() - 1;
        int pos = anchorInfo.f۱۱۵۰۲b;
        int bestSpan = span;
        while (pos < indexLimit) {
            int next = m۱۴۱۰۲b(recycler, state, pos + 1);
            if (next <= bestSpan) {
                break;
            }
            pos++;
            bestSpan = next;
        }
        anchorInfo.f۱۱۵۰۲b = pos;
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p۰۴۷v7.widget.LinearLayoutManager
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۴۱۱۱a(RecyclerView.Cv recycler, RecyclerView.Ca0 state, int start, int end, int itemCount) {
        m۱۴۱۷۵E();
        View invalidMatch = null;
        View outOfBoundsMatch = null;
        int boundsStart = this.f۱۱۴۹۵u.m۱۵۵۹۲f();
        int boundsEnd = this.f۱۱۴۹۵u.m۱۵۵۸۴b();
        int diff = end > start ? 1 : -1;
        for (int i = start; i != end; i += diff) {
            View view = m۱۴۵۷۳c(i);
            int position = m۱۴۶۱۳l(view);
            if (position >= 0 && position < itemCount && m۱۴۱۰۲b(recycler, state, position) == 0) {
                if (((RecyclerView.Cp) view.getLayoutParams()).m۱۴۶۴۴c()) {
                    if (invalidMatch == null) {
                        invalidMatch = view;
                    }
                } else if (this.f۱۱۴۹۵u.m۱۵۵۸۹d(view) < boundsEnd && this.f۱۱۴۹۵u.m۱۵۵۸۲a(view) >= boundsStart) {
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

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۴۰۹۶a(RecyclerView.Cv recycler, RecyclerView.Ca0 state, int viewPosition) {
        if (!state.m۱۴۳۵۸d()) {
            return this.f۱۱۴۸۰N.m۱۴۱۳۹b(viewPosition, this.f۱۱۴۷۵I);
        }
        int adapterPosition = recycler.m۱۴۶۷۰a(viewPosition);
        if (adapterPosition != -1) {
            return this.f۱۱۴۸۰N.m۱۴۱۳۹b(adapterPosition, this.f۱۱۴۷۵I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + viewPosition);
        return 0;
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۴۱۰۲b(RecyclerView.Cv recycler, RecyclerView.Ca0 state, int pos) {
        if (!state.m۱۴۳۵۸d()) {
            return this.f۱۱۴۸۰N.m۱۴۱۳۷a(pos, this.f۱۱۴۷۵I);
        }
        int cached = this.f۱۱۴۷۹M.get(pos, -1);
        if (cached != -1) {
            return cached;
        }
        int adapterPosition = recycler.m۱۴۶۷۰a(pos);
        if (adapterPosition != -1) {
            return this.f۱۱۴۸۰N.m۱۴۱۳۷a(adapterPosition, this.f۱۱۴۷۵I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + pos);
        return 0;
    }

    /* renamed from: c  reason: contains not printable characters */
    private int m۱۴۱۰۴c(RecyclerView.Cv recycler, RecyclerView.Ca0 state, int pos) {
        if (!state.m۱۴۳۵۸d()) {
            return this.f۱۱۴۸۰N.m۱۴۱۳۶a(pos);
        }
        int cached = this.f۱۱۴۷۸L.get(pos, -1);
        if (cached != -1) {
            return cached;
        }
        int adapterPosition = recycler.m۱۴۶۷۰a(pos);
        if (adapterPosition != -1) {
            return this.f۱۱۴۸۰N.m۱۴۱۳۶a(adapterPosition);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + pos);
        return 1;
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p۰۴۷v7.widget.LinearLayoutManager
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۱۴a(RecyclerView.Ca0 state, LinearLayoutManager.Cc layoutState, RecyclerView.AbstractCo.AbstractCc layoutPrefetchRegistry) {
        int remainingSpan = this.f۱۱۴۷۵I;
        for (int count = 0; count < this.f۱۱۴۷۵I && layoutState.m۱۴۲۲۸a(state) && remainingSpan > 0; count++) {
            int pos = layoutState.f۱۱۵۱۳d;
            layoutPrefetchRegistry.m۱۴۶۴۱a(pos, Math.max(0, layoutState.f۱۱۵۱۶g));
            remainingSpan -= this.f۱۱۴۸۰N.m۱۴۱۳۶a(pos);
            layoutState.f۱۱۵۱۳d += layoutState.f۱۱۵۱۴e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: android.support.v7.widget.GridLayoutManager */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // android.support.p۰۴۷v7.widget.LinearLayoutManager
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m۱۴۱۱۶a(android.support.p۰۴۷v7.widget.RecyclerView.Cv r26, android.support.p۰۴۷v7.widget.RecyclerView.Ca0 r27, android.support.p۰۴۷v7.widget.LinearLayoutManager.Cc r28, android.support.p۰۴۷v7.widget.LinearLayoutManager.Cb r29) {
        /*
        // Method dump skipped, instructions count: 681
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.GridLayoutManager.m۱۴۱۱۶a(android.support.v7.widget.RecyclerView$v, android.support.v7.widget.RecyclerView$a0, android.support.v7.widget.LinearLayoutManager$c, android.support.v7.widget.LinearLayoutManager$b):void");
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۱۰۰a(View view, int otherDirParentSpecMode, boolean alreadyMeasured) {
        int hSpec;
        int wSpec;
        Cb lp = (Cb) view.getLayoutParams();
        Rect decorInsets = lp.f۱۱۶۹۳b;
        int verticalInsets = decorInsets.top + decorInsets.bottom + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
        int horizontalInsets = decorInsets.left + decorInsets.right + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin;
        int availableSpaceInOther = m۱۴۱۲۹f(lp.f۱۱۴۸۲e, lp.f۱۱۴۸۳f);
        if (this.f۱۱۴۹۳s == 1) {
            wSpec = RecyclerView.AbstractCo.m۱۴۴۹۵a(availableSpaceInOther, otherDirParentSpecMode, horizontalInsets, ((ViewGroup.MarginLayoutParams) lp).width, false);
            hSpec = RecyclerView.AbstractCo.m۱۴۴۹۵a(this.f۱۱۴۹۵u.m۱۵۵۹۴g(), m۱۴۶۰۶i(), verticalInsets, ((ViewGroup.MarginLayoutParams) lp).height, true);
        } else {
            hSpec = RecyclerView.AbstractCo.m۱۴۴۹۵a(availableSpaceInOther, otherDirParentSpecMode, verticalInsets, ((ViewGroup.MarginLayoutParams) lp).height, false);
            wSpec = RecyclerView.AbstractCo.m۱۴۴۹۵a(this.f۱۱۴۹۵u.m۱۵۵۹۴g(), m۱۴۶۲۲r(), horizontalInsets, ((ViewGroup.MarginLayoutParams) lp).width, true);
        }
        m۱۴۰۹۹a(view, wSpec, hSpec, alreadyMeasured);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۰۹۷a(float maxSizeInOther, int currentOtherDirSize) {
        m۱۴۱۰۵l(Math.max(Math.round(((float) this.f۱۱۴۷۵I) * maxSizeInOther), currentOtherDirSize));
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۰۹۹a(View child, int widthSpec, int heightSpec, boolean alreadyMeasured) {
        boolean measure;
        RecyclerView.Cp lp = (RecyclerView.Cp) child.getLayoutParams();
        if (alreadyMeasured) {
            measure = m۱۴۵۶۹b(child, widthSpec, heightSpec, lp);
        } else {
            measure = m۱۴۵۵۲a(child, widthSpec, heightSpec, lp);
        }
        if (measure) {
            child.measure(widthSpec, heightSpec);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۰۹۸a(RecyclerView.Cv recycler, RecyclerView.Ca0 state, int count, int consumedSpanCount, boolean layingOutInPrimaryDirection) {
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
            View view = this.f۱۱۴۷۷K[i];
            Cb params = (Cb) view.getLayoutParams();
            params.f۱۱۴۸۳f = m۱۴۱۰۴c(recycler, state, m۱۴۶۱۳l(view));
            params.f۱۱۴۸۲e = span;
            span += params.f۱۱۴۸۳f;
        }
    }

    /* renamed from: k  reason: contains not printable characters */
    public void m۱۴۱۳۱k(int spanCount) {
        if (spanCount != this.f۱۱۴۷۵I) {
            this.f۱۱۴۷۴H = true;
            if (spanCount >= 1) {
                this.f۱۱۴۷۵I = spanCount;
                this.f۱۱۴۸۰N.m۱۴۱۳۸a();
                m۱۴۶۲۹y();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + spanCount);
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$c  reason: invalid class name */
    public static abstract class AbstractCc {

        /* renamed from: a  reason: contains not printable characters */
        final SparseIntArray f۱۱۴۸۴a = new SparseIntArray();

        /* renamed from: b  reason: contains not printable characters */
        private boolean f۱۱۴۸۵b = false;

        /* renamed from: a  reason: contains not printable characters */
        public abstract int m۱۴۱۳۶a(int i);

        /* renamed from: c  reason: contains not printable characters */
        public abstract int m۱۴۱۴۰c(int i, int i2);

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۱۳۸a() {
            this.f۱۱۴۸۴a.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۴۱۳۷a(int position, int spanCount) {
            if (!this.f۱۱۴۸۵b) {
                return m۱۴۱۴۰c(position, spanCount);
            }
            int existing = this.f۱۱۴۸۴a.get(position, -1);
            if (existing != -1) {
                return existing;
            }
            int value = m۱۴۱۴۰c(position, spanCount);
            this.f۱۱۴۸۴a.put(position, value);
            return value;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۴۱۳۹b(int adapterPosition, int spanCount) {
            int span = 0;
            int group = 0;
            int positionSpanSize = m۱۴۱۳۶a(adapterPosition);
            for (int i = 0; i < adapterPosition; i++) {
                int size = m۱۴۱۳۶a(i);
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
    @Override // android.support.p۰۴۷v7.widget.LinearLayoutManager, android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۴۱۱۲a(View focused, int focusDirection, RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        int limit;
        int inc;
        int start;
        int focusableSpanGroupIndex;
        View prevFocusedChild;
        int focusableWeakCandidateOverlap;
        int focusableWeakCandidateSpanIndex;
        boolean assignAsWeek;
        RecyclerView.Cv vVar = recycler;
        RecyclerView.Ca0 a0Var = state;
        View prevFocusedChild2 = m۱۴۵۷۴c(focused);
        if (prevFocusedChild2 == null) {
            return null;
        }
        Cb lp = (Cb) prevFocusedChild2.getLayoutParams();
        int prevSpanStart = lp.f۱۱۴۸۲e;
        int prevSpanEnd = lp.f۱۱۴۸۲e + lp.f۱۱۴۸۳f;
        if (super.m۱۴۱۸۶a(focused, focusDirection, recycler, state) == null) {
            return null;
        }
        if ((m۱۴۲۱۴i(focusDirection) == 1) != this.f۱۱۴۹۸x) {
            start = m۱۴۵۸۸e() - 1;
            inc = -1;
            limit = -1;
        } else {
            start = 0;
            inc = 1;
            limit = m۱۴۵۸۸e();
        }
        boolean preferLastSpan = this.f۱۱۴۹۳s == 1 && m۱۴۱۷۹I();
        View focusableWeakCandidate = null;
        View unfocusableWeakCandidate = null;
        int focusableSpanGroupIndex2 = m۱۴۰۹۶a(vVar, a0Var, start);
        int i = start;
        int focusableWeakCandidateSpanIndex2 = -1;
        int focusableWeakCandidateOverlap2 = 0;
        int unfocusableWeakCandidateSpanIndex = -1;
        int unfocusableWeakCandidateOverlap = 0;
        while (true) {
            if (i == limit) {
                break;
            }
            int spanGroupIndex = m۱۴۰۹۶a(vVar, a0Var, i);
            View candidate = m۱۴۵۷۳c(i);
            if (candidate == prevFocusedChild2) {
                break;
            }
            if (!candidate.hasFocusable() || spanGroupIndex == focusableSpanGroupIndex2) {
                Cb candidateLp = (Cb) candidate.getLayoutParams();
                prevFocusedChild = prevFocusedChild2;
                int candidateStart = candidateLp.f۱۱۴۸۲e;
                focusableSpanGroupIndex = focusableSpanGroupIndex2;
                int candidateEnd = candidateLp.f۱۱۴۸۲e + candidateLp.f۱۱۴۸۳f;
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
                            if (m۱۴۵۵۴a(candidate, false, true)) {
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
                        int focusableWeakCandidateSpanIndex3 = candidateLp.f۱۱۴۸۲e;
                        focusableWeakCandidateOverlap = Math.min(candidateEnd, prevSpanEnd) - Math.max(candidateStart, prevSpanStart);
                        focusableWeakCandidate = candidate;
                        focusableWeakCandidateSpanIndex2 = focusableWeakCandidateSpanIndex3;
                    } else {
                        unfocusableWeakCandidateSpanIndex = candidateLp.f۱۱۴۸۲e;
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

    @Override // android.support.p۰۴۷v7.widget.LinearLayoutManager, android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: C  reason: contains not printable characters */
    public boolean m۱۴۱۰۶C() {
        return this.f۱۱۴۸۹D == null && !this.f۱۱۴۷۴H;
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$a  reason: invalid class name */
    public static final class Ca extends AbstractCc {
        @Override // android.support.p۰۴۷v7.widget.GridLayoutManager.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۴۱۳۲a(int position) {
            return 1;
        }

        @Override // android.support.p۰۴۷v7.widget.GridLayoutManager.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۴۱۳۳c(int position, int spanCount) {
            return position % spanCount;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$b  reason: invalid class name */
    public static class Cb extends RecyclerView.Cp {

        /* renamed from: e  reason: contains not printable characters */
        int f۱۱۴۸۲e = -1;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۱۴۸۳f = 0;

        public Cb(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public Cb(int width, int height) {
            super(width, height);
        }

        public Cb(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public Cb(ViewGroup.LayoutParams source) {
            super(source);
        }

        /* renamed from: e  reason: contains not printable characters */
        public int m۱۴۱۳۴e() {
            return this.f۱۱۴۸۲e;
        }

        /* renamed from: f  reason: contains not printable characters */
        public int m۱۴۱۳۵f() {
            return this.f۱۱۴۸۳f;
        }
    }
}
