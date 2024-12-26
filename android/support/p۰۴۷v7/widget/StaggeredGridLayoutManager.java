package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cc;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: android.support.v7.widget.StaggeredGridLayoutManager */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractCo implements RecyclerView.AbstractCz.AbstractCa {

    /* renamed from: A  reason: contains not printable characters */
    boolean f۱۱۷۸۹A = false;

    /* renamed from: B  reason: contains not printable characters */
    private BitSet f۱۱۷۹۰B;

    /* renamed from: C  reason: contains not printable characters */
    int f۱۱۷۹۱C = -1;

    /* renamed from: D  reason: contains not printable characters */
    int f۱۱۷۹۲D = Integer.MIN_VALUE;

    /* renamed from: E  reason: contains not printable characters */
    Cd f۱۱۷۹۳E = new Cd();

    /* renamed from: F  reason: contains not printable characters */
    private int f۱۱۷۹۴F = 2;

    /* renamed from: G  reason: contains not printable characters */
    private boolean f۱۱۷۹۵G;

    /* renamed from: H  reason: contains not printable characters */
    private boolean f۱۱۷۹۶H;

    /* renamed from: I  reason: contains not printable characters */
    private Ce f۱۱۷۹۷I;

    /* renamed from: J  reason: contains not printable characters */
    private int f۱۱۷۹۸J;

    /* renamed from: K  reason: contains not printable characters */
    private final Rect f۱۱۷۹۹K = new Rect();

    /* renamed from: L  reason: contains not printable characters */
    private final Cb f۱۱۸۰۰L = new Cb();

    /* renamed from: M  reason: contains not printable characters */
    private boolean f۱۱۸۰۱M = false;

    /* renamed from: N  reason: contains not printable characters */
    private boolean f۱۱۸۰۲N = true;

    /* renamed from: O  reason: contains not printable characters */
    private int[] f۱۱۸۰۳O;

    /* renamed from: P  reason: contains not printable characters */
    private final Runnable f۱۱۸۰۴P = new RunnableCa();

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۱۸۰۵s = -1;

    /* renamed from: t  reason: contains not printable characters */
    Cf[] f۱۱۸۰۶t;

    /* renamed from: u  reason: contains not printable characters */
    AbstractCt0 f۱۱۸۰۷u;

    /* renamed from: v  reason: contains not printable characters */
    AbstractCt0 f۱۱۸۰۸v;

    /* renamed from: w  reason: contains not printable characters */
    private int f۱۱۸۰۹w;

    /* renamed from: x  reason: contains not printable characters */
    private int f۱۱۸۱۰x;

    /* renamed from: y  reason: contains not printable characters */
    private final Cn0 f۱۱۸۱۱y;

    /* renamed from: z  reason: contains not printable characters */
    boolean f۱۱۸۱۲z = false;

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.m۱۴۸۰۹F();
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        RecyclerView.AbstractCo.Cd properties = RecyclerView.AbstractCo.m۱۴۴۹۶a(context, attrs, defStyleAttr, defStyleRes);
        m۱۴۸۵۸i(properties.f۱۱۶۸۸a);
        m۱۴۸۵۹j(properties.f۱۱۶۸۹b);
        m۱۴۸۴۷c(properties.f۱۱۶۹۰c);
        this.f۱۱۸۱۱y = new Cn0();
        m۱۴۷۶۷M();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: u  reason: contains not printable characters */
    public boolean m۱۴۸۶۱u() {
        return this.f۱۱۷۹۴F != 0;
    }

    /* renamed from: M  reason: contains not printable characters */
    private void m۱۴۷۶۷M() {
        this.f۱۱۸۰۷u = AbstractCt0.m۱۵۵۷۹a(this, this.f۱۱۸۰۹w);
        this.f۱۱۸۰۸v = AbstractCt0.m۱۵۵۷۹a(this, 1 - this.f۱۱۸۰۹w);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F  reason: contains not printable characters */
    public boolean m۱۴۸۰۹F() {
        int maxPos;
        int minPos;
        if (m۱۴۵۸۸e() == 0 || this.f۱۱۷۹۴F == 0 || !m۱۴۶۲۴t()) {
            return false;
        }
        if (this.f۱۱۷۸۹A) {
            minPos = m۱۴۸۱۲I();
            maxPos = m۱۴۸۱۱H();
        } else {
            minPos = m۱۴۸۱۱H();
            maxPos = m۱۴۸۱۲I();
        }
        if (minPos == 0 && m۱۴۸۱۳J() != null) {
            this.f۱۱۷۹۳E.m۱۴۸۷۳a();
            m۱۴۶۳۰z();
            m۱۴۶۲۹y();
            return true;
        } else if (!this.f۱۱۸۰۱M) {
            return false;
        } else {
            int invalidGapDir = this.f۱۱۷۸۹A ? -1 : 1;
            Cd.Ca invalidFsi = this.f۱۱۷۹۳E.m۱۴۸۷۲a(minPos, maxPos + 1, invalidGapDir, true);
            if (invalidFsi == null) {
                this.f۱۱۸۰۱M = false;
                this.f۱۱۷۹۳E.m۱۴۸۷۸b(maxPos + 1);
                return false;
            }
            Cd.Ca validFsi = this.f۱۱۷۹۳E.m۱۴۸۷۲a(minPos, invalidFsi.f۱۱۸۲۵c, invalidGapDir * -1, true);
            if (validFsi == null) {
                this.f۱۱۷۹۳E.m۱۴۸۷۸b(invalidFsi.f۱۱۸۲۵c);
            } else {
                this.f۱۱۷۹۳E.m۱۴۸۷۸b(validFsi.f۱۱۸۲۵c + 1);
            }
            m۱۴۶۳۰z();
            m۱۴۶۲۹y();
            return true;
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۴۸۵۵f(int state) {
        if (state == 0) {
            m۱۴۸۰۹F();
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۸۴۲b(RecyclerView view, RecyclerView.Cv recycler) {
        super.m۱۴۵۶۴b(view, recycler);
        m۱۴۵۵۵a(this.f۱۱۸۰۴P);
        for (int i = 0; i < this.f۱۱۸۰۵s; i++) {
            this.f۱۱۸۰۶t[i].m۱۴۸۹۷c();
        }
        view.requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J  reason: contains not printable characters */
    public View m۱۴۸۱۳J() {
        int childLimit;
        int firstChildIndex;
        int endChildIndex = m۱۴۵۸۸e() - 1;
        BitSet mSpansToCheck = new BitSet(this.f۱۱۸۰۵s);
        mSpansToCheck.set(0, this.f۱۱۸۰۵s, true);
        int nextChildDiff = -1;
        int preferredSpanDir = (this.f۱۱۸۰۹w != 1 || !m۱۴۸۱۵L()) ? -1 : 1;
        if (this.f۱۱۷۸۹A) {
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
            View child = m۱۴۵۷۳c(i);
            Cc lp = (Cc) child.getLayoutParams();
            if (mSpansToCheck.get(lp.f۱۱۸۲۱e.f۱۱۸۴۳e)) {
                if (m۱۴۷۸۰a(lp.f۱۱۸۲۱e)) {
                    return child;
                }
                mSpansToCheck.clear(lp.f۱۱۸۲۱e.f۱۱۸۴۳e);
            }
            if (!lp.f۱۱۸۲۲f && i + nextChildDiff != childLimit) {
                View nextChild = m۱۴۵۷۳c(i + nextChildDiff);
                boolean compareSpans = false;
                if (this.f۱۱۷۸۹A) {
                    int myEnd = this.f۱۱۸۰۷u.m۱۵۵۸۲a(child);
                    int nextEnd = this.f۱۱۸۰۷u.m۱۵۵۸۲a(nextChild);
                    if (myEnd < nextEnd) {
                        return child;
                    }
                    if (myEnd == nextEnd) {
                        compareSpans = true;
                    }
                } else {
                    int myStart = this.f۱۱۸۰۷u.m۱۵۵۸۹d(child);
                    int nextStart = this.f۱۱۸۰۷u.m۱۵۵۸۹d(nextChild);
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
                    if ((lp.f۱۱۸۲۱e.f۱۱۸۴۳e - ((Cc) nextChild.getLayoutParams()).f۱۱۸۲۱e.f۱۱۸۴۳e < 0) != (preferredSpanDir < 0)) {
                        return child;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۴۷۸۰a(Cf span) {
        if (this.f۱۱۷۸۹A) {
            if (span.m۱۴۹۰۴g() < this.f۱۱۸۰۷u.m۱۵۵۸۴b()) {
                ArrayList<View> arrayList = span.f۱۱۸۳۹a;
                return !span.m۱۴۸۹۵b(arrayList.get(arrayList.size() - 1)).f۱۱۸۲۲f;
            }
        } else if (span.m۱۴۹۰۵h() > this.f۱۱۸۰۷u.m۱۵۵۹۲f()) {
            return !span.m۱۴۸۹۵b(span.f۱۱۸۳۹a.get(0)).f۱۱۸۲۲f;
        }
        return false;
    }

    /* renamed from: j  reason: contains not printable characters */
    public void m۱۴۸۵۹j(int spanCount) {
        m۱۴۸۳۲a((String) null);
        if (spanCount != this.f۱۱۸۰۵s) {
            m۱۴۸۱۴K();
            this.f۱۱۸۰۵s = spanCount;
            this.f۱۱۷۹۰B = new BitSet(this.f۱۱۸۰۵s);
            this.f۱۱۸۰۶t = new Cf[this.f۱۱۸۰۵s];
            for (int i = 0; i < this.f۱۱۸۰۵s; i++) {
                this.f۱۱۸۰۶t[i] = new Cf(i);
            }
            m۱۴۶۲۹y();
        }
    }

    /* renamed from: i  reason: contains not printable characters */
    public void m۱۴۸۵۸i(int orientation) {
        if (orientation == 0 || orientation == 1) {
            m۱۴۸۳۲a((String) null);
            if (orientation != this.f۱۱۸۰۹w) {
                this.f۱۱۸۰۹w = orientation;
                AbstractCt0 tmp = this.f۱۱۸۰۷u;
                this.f۱۱۸۰۷u = this.f۱۱۸۰۸v;
                this.f۱۱۸۰۸v = tmp;
                m۱۴۶۲۹y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۴۸۴۷c(boolean reverseLayout) {
        m۱۴۸۳۲a((String) null);
        Ce eVar = this.f۱۱۷۹۷I;
        if (!(eVar == null || eVar.f۱۱۸۳۶j == reverseLayout)) {
            eVar.f۱۱۸۳۶j = reverseLayout;
        }
        this.f۱۱۸۱۲z = reverseLayout;
        m۱۴۶۲۹y();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۸۳۲a(String message) {
        if (this.f۱۱۷۹۷I == null) {
            super.m۱۴۵۴۱a(message);
        }
    }

    /* renamed from: K  reason: contains not printable characters */
    public void m۱۴۸۱۴K() {
        this.f۱۱۷۹۳E.m۱۴۸۷۳a();
        m۱۴۶۲۹y();
    }

    /* renamed from: O  reason: contains not printable characters */
    private void m۱۴۷۶۹O() {
        if (this.f۱۱۸۰۹w == 1 || !m۱۴۸۱۵L()) {
            this.f۱۱۷۸۹A = this.f۱۱۸۱۲z;
        } else {
            this.f۱۱۷۸۹A = !this.f۱۱۸۱۲z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L  reason: contains not printable characters */
    public boolean m۱۴۸۱۵L() {
        return m۱۴۶۰۸j() == 1;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۸۲۵a(Rect childrenBounds, int wSpec, int hSpec) {
        int width;
        int usedHeight;
        int horizontalPadding = m۱۴۶۱۶n() + m۱۴۶۱۸o();
        int verticalPadding = m۱۴۶۲۰p() + m۱۴۶۱۴m();
        if (this.f۱۱۸۰۹w == 1) {
            width = RecyclerView.AbstractCo.m۱۴۴۹۴a(hSpec, childrenBounds.height() + verticalPadding, m۱۴۶۱۰k());
            usedHeight = RecyclerView.AbstractCo.m۱۴۴۹۴a(wSpec, (this.f۱۱۸۱۰x * this.f۱۱۸۰۵s) + horizontalPadding, m۱۴۶۱۲l());
        } else {
            int width2 = RecyclerView.AbstractCo.m۱۴۴۹۴a(wSpec, childrenBounds.width() + horizontalPadding, m۱۴۶۱۲l());
            width = RecyclerView.AbstractCo.m۱۴۴۹۴a(hSpec, (this.f۱۱۸۱۰x * this.f۱۱۸۰۵s) + verticalPadding, m۱۴۶۱۰k());
            usedHeight = width2;
        }
        m۱۴۵۷۵c(usedHeight, width);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۴۸۵۳e(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        m۱۴۷۸۶c(recycler, state, true);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۴۷۸۶c(RecyclerView.Cv recycler, RecyclerView.Ca0 state, boolean shouldCheckForGaps) {
        Ce eVar;
        Cb anchorInfo = this.f۱۱۸۰۰L;
        if (!(this.f۱۱۷۹۷I == null && this.f۱۱۷۹۱C == -1) && state.m۱۴۳۵۳a() == 0) {
            m۱۴۵۶۱b(recycler);
            anchorInfo.m۱۴۸۶۶b();
            return;
        }
        boolean needToCheckForGaps = true;
        boolean recalculateAnchor = (anchorInfo.f۱۱۸۱۸e && this.f۱۱۷۹۱C == -1 && this.f۱۱۷۹۷I == null) ? false : true;
        if (recalculateAnchor) {
            anchorInfo.m۱۴۸۶۶b();
            if (this.f۱۱۷۹۷I != null) {
                m۱۴۷۷۵a(anchorInfo);
            } else {
                m۱۴۷۶۹O();
                anchorInfo.f۱۱۸۱۶c = this.f۱۱۷۸۹A;
            }
            m۱۴۸۴۰b(state, anchorInfo);
            anchorInfo.f۱۱۸۱۸e = true;
        }
        if (this.f۱۱۷۹۷I == null && this.f۱۱۷۹۱C == -1 && !(anchorInfo.f۱۱۸۱۶c == this.f۱۱۷۹۵G && m۱۴۸۱۵L() == this.f۱۱۷۹۶H)) {
            this.f۱۱۷۹۳E.m۱۴۸۷۳a();
            anchorInfo.f۱۱۸۱۷d = true;
        }
        if (m۱۴۵۸۸e() > 0 && ((eVar = this.f۱۱۷۹۷I) == null || eVar.f۱۱۸۳۱e < 1)) {
            if (anchorInfo.f۱۱۸۱۷d) {
                for (int i = 0; i < this.f۱۱۸۰۵s; i++) {
                    this.f۱۱۸۰۶t[i].m۱۴۸۹۷c();
                    int i2 = anchorInfo.f۱۱۸۱۵b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.f۱۱۸۰۶t[i].m۱۴۹۰۱d(i2);
                    }
                }
            } else if (recalculateAnchor || this.f۱۱۸۰۰L.f۱۱۸۱۹f == null) {
                for (int i3 = 0; i3 < this.f۱۱۸۰۵s; i3++) {
                    this.f۱۱۸۰۶t[i3].m۱۴۸۹۳a(this.f۱۱۷۸۹A, anchorInfo.f۱۱۸۱۵b);
                }
                this.f۱۱۸۰۰L.m۱۴۸۶۵a(this.f۱۱۸۰۶t);
            } else {
                for (int i4 = 0; i4 < this.f۱۱۸۰۵s; i4++) {
                    Cf span = this.f۱۱۸۰۶t[i4];
                    span.m۱۴۸۹۷c();
                    span.m۱۴۹۰۱d(this.f۱۱۸۰۰L.f۱۱۸۱۹f[i4]);
                }
            }
        }
        m۱۴۵۲۱a(recycler);
        this.f۱۱۸۱۱y.f۱۲۲۲۵a = false;
        this.f۱۱۸۰۱M = false;
        m۱۴۸۶۰k(this.f۱۱۸۰۸v.m۱۵۵۹۴g());
        m۱۴۷۸۲b(anchorInfo.f۱۱۸۱۴a, state);
        if (anchorInfo.f۱۱۸۱۶c) {
            m۱۴۸۰۵w(-1);
            m۱۴۷۷۰a(recycler, this.f۱۱۸۱۱y, state);
            m۱۴۸۰۵w(1);
            Cn0 n0Var = this.f۱۱۸۱۱y;
            n0Var.f۱۲۲۲۷c = anchorInfo.f۱۱۸۱۴a + n0Var.f۱۲۲۲۸d;
            m۱۴۷۷۰a(recycler, n0Var, state);
        } else {
            m۱۴۸۰۵w(1);
            m۱۴۷۷۰a(recycler, this.f۱۱۸۱۱y, state);
            m۱۴۸۰۵w(-1);
            Cn0 n0Var2 = this.f۱۱۸۱۱y;
            n0Var2.f۱۲۲۲۷c = anchorInfo.f۱۱۸۱۴a + n0Var2.f۱۲۲۲۸d;
            m۱۴۷۷۰a(recycler, n0Var2, state);
        }
        m۱۴۷۶۸N();
        if (m۱۴۵۸۸e() > 0) {
            if (this.f۱۱۷۸۹A) {
                m۱۴۷۷۳a(recycler, state, true);
                m۱۴۷۸۴b(recycler, state, false);
            } else {
                m۱۴۷۸۴b(recycler, state, true);
                m۱۴۷۷۳a(recycler, state, false);
            }
        }
        boolean hasGaps = false;
        if (shouldCheckForGaps && !state.m۱۴۳۵۸d()) {
            if (this.f۱۱۷۹۴F == 0 || m۱۴۵۸۸e() <= 0 || (!this.f۱۱۸۰۱M && m۱۴۸۱۳J() == null)) {
                needToCheckForGaps = false;
            }
            if (needToCheckForGaps) {
                m۱۴۵۵۵a(this.f۱۱۸۰۴P);
                if (m۱۴۸۰۹F()) {
                    hasGaps = true;
                }
            }
        }
        if (state.m۱۴۳۵۸d()) {
            this.f۱۱۸۰۰L.m۱۴۸۶۶b();
        }
        this.f۱۱۷۹۵G = anchorInfo.f۱۱۸۱۶c;
        this.f۱۱۷۹۶H = m۱۴۸۱۵L();
        if (hasGaps) {
            this.f۱۱۸۰۰L.m۱۴۸۶۶b();
            m۱۴۷۸۶c(recycler, state, false);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۴۸۵۶g(RecyclerView.Ca0 state) {
        super.m۱۴۶۰۲g(state);
        this.f۱۱۷۹۱C = -1;
        this.f۱۱۷۹۲D = Integer.MIN_VALUE;
        this.f۱۱۷۹۷I = null;
        this.f۱۱۸۰۰L.m۱۴۸۶۶b();
    }

    /* JADX INFO: Multiple debug info for r2v2 int: [D('i' int), D('before' int)] */
    /* renamed from: N  reason: contains not printable characters */
    private void m۱۴۷۶۸N() {
        if (this.f۱۱۸۰۸v.m۱۵۵۸۸d() != 1073741824) {
            float maxSize = 0.0f;
            int childCount = m۱۴۵۸۸e();
            for (int i = 0; i < childCount; i++) {
                View child = m۱۴۵۷۳c(i);
                float size = (float) this.f۱۱۸۰۸v.m۱۵۵۸۵b(child);
                if (size >= maxSize) {
                    if (((Cc) child.getLayoutParams()).m۱۴۸۶۸f()) {
                        size = (1.0f * size) / ((float) this.f۱۱۸۰۵s);
                    }
                    maxSize = Math.max(maxSize, size);
                }
            }
            int before = this.f۱۱۸۱۰x;
            int desired = Math.round(((float) this.f۱۱۸۰۵s) * maxSize);
            if (this.f۱۱۸۰۸v.m۱۵۵۸۸d() == Integer.MIN_VALUE) {
                desired = Math.min(desired, this.f۱۱۸۰۸v.m۱۵۵۹۴g());
            }
            m۱۴۸۶۰k(desired);
            if (this.f۱۱۸۱۰x != before) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    View child2 = m۱۴۵۷۳c(i2);
                    Cc lp = (Cc) child2.getLayoutParams();
                    if (!lp.f۱۱۸۲۲f) {
                        if (!m۱۴۸۱۵L() || this.f۱۱۸۰۹w != 1) {
                            int i3 = lp.f۱۱۸۲۱e.f۱۱۸۴۳e;
                            int newOffset = this.f۱۱۸۱۰x * i3;
                            int prevOffset = i3 * before;
                            if (this.f۱۱۸۰۹w == 1) {
                                child2.offsetLeftAndRight(newOffset - prevOffset);
                            } else {
                                child2.offsetTopAndBottom(newOffset - prevOffset);
                            }
                        } else {
                            int i4 = this.f۱۱۸۰۵s;
                            int i5 = lp.f۱۱۸۲۱e.f۱۱۸۴۳e;
                            child2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f۱۱۸۱۰x) - ((-((i4 - 1) - i5)) * before));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۷۷۵a(Cb anchorInfo) {
        Ce eVar = this.f۱۱۷۹۷I;
        int i = eVar.f۱۱۸۳۱e;
        if (i > 0) {
            if (i == this.f۱۱۸۰۵s) {
                for (int i2 = 0; i2 < this.f۱۱۸۰۵s; i2++) {
                    this.f۱۱۸۰۶t[i2].m۱۴۸۹۷c();
                    Ce eVar2 = this.f۱۱۷۹۷I;
                    int line = eVar2.f۱۱۸۳۲f[i2];
                    if (line != Integer.MIN_VALUE) {
                        if (eVar2.f۱۱۸۳۷k) {
                            line += this.f۱۱۸۰۷u.m۱۵۵۸۴b();
                        } else {
                            line += this.f۱۱۸۰۷u.m۱۵۵۹۲f();
                        }
                    }
                    this.f۱۱۸۰۶t[i2].m۱۴۹۰۱d(line);
                }
            } else {
                eVar.m۱۴۸۸۶b();
                Ce eVar3 = this.f۱۱۷۹۷I;
                eVar3.f۱۱۸۲۹c = eVar3.f۱۱۸۳۰d;
            }
        }
        Ce eVar4 = this.f۱۱۷۹۷I;
        this.f۱۱۷۹۶H = eVar4.f۱۱۸۳۸l;
        m۱۴۸۴۷c(eVar4.f۱۱۸۳۶j);
        m۱۴۷۶۹O();
        Ce eVar5 = this.f۱۱۷۹۷I;
        int i3 = eVar5.f۱۱۸۲۹c;
        if (i3 != -1) {
            this.f۱۱۷۹۱C = i3;
            anchorInfo.f۱۱۸۱۶c = eVar5.f۱۱۸۳۷k;
        } else {
            anchorInfo.f۱۱۸۱۶c = this.f۱۱۷۸۹A;
        }
        Ce eVar6 = this.f۱۱۷۹۷I;
        if (eVar6.f۱۱۸۳۳g > 1) {
            Cd dVar = this.f۱۱۷۹۳E;
            dVar.f۱۱۸۲۳a = eVar6.f۱۱۸۳۴h;
            dVar.f۱۱۸۲۴b = eVar6.f۱۱۸۳۵i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۸۴۰b(RecyclerView.Ca0 state, Cb anchorInfo) {
        if (!m۱۴۸۳۴a(state, anchorInfo) && !m۱۴۷۸۷c(state, anchorInfo)) {
            anchorInfo.m۱۴۸۶۳a();
            anchorInfo.f۱۱۸۱۴a = 0;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private boolean m۱۴۷۸۷c(RecyclerView.Ca0 state, Cb anchorInfo) {
        int i;
        if (this.f۱۱۷۹۵G) {
            i = m۱۴۷۹۸q(state.m۱۴۳۵۳a());
        } else {
            i = m۱۴۷۹۶p(state.m۱۴۳۵۳a());
        }
        anchorInfo.f۱۱۸۱۴a = i;
        anchorInfo.f۱۱۸۱۵b = Integer.MIN_VALUE;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۸۳۴a(RecyclerView.Ca0 state, Cb anchorInfo) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (state.m۱۴۳۵۸d() || (i = this.f۱۱۷۹۱C) == -1) {
            return false;
        }
        if (i < 0 || i >= state.m۱۴۳۵۳a()) {
            this.f۱۱۷۹۱C = -1;
            this.f۱۱۷۹۲D = Integer.MIN_VALUE;
            return false;
        }
        Ce eVar = this.f۱۱۷۹۷I;
        if (eVar == null || eVar.f۱۱۸۲۹c == -1 || eVar.f۱۱۸۳۱e < 1) {
            View child = m۱۴۵۵۹b(this.f۱۱۷۹۱C);
            if (child != null) {
                if (this.f۱۱۷۸۹A) {
                    i2 = m۱۴۸۱۲I();
                } else {
                    i2 = m۱۴۸۱۱H();
                }
                anchorInfo.f۱۱۸۱۴a = i2;
                if (this.f۱۱۷۹۲D != Integer.MIN_VALUE) {
                    if (anchorInfo.f۱۱۸۱۶c) {
                        anchorInfo.f۱۱۸۱۵b = (this.f۱۱۸۰۷u.m۱۵۵۸۴b() - this.f۱۱۷۹۲D) - this.f۱۱۸۰۷u.m۱۵۵۸۲a(child);
                    } else {
                        anchorInfo.f۱۱۸۱۵b = (this.f۱۱۸۰۷u.m۱۵۵۹۲f() + this.f۱۱۷۹۲D) - this.f۱۱۸۰۷u.m۱۵۵۸۹d(child);
                    }
                    return true;
                } else if (this.f۱۱۸۰۷u.m۱۵۵۸۵b(child) > this.f۱۱۸۰۷u.m۱۵۵۹۴g()) {
                    if (anchorInfo.f۱۱۸۱۶c) {
                        i3 = this.f۱۱۸۰۷u.m۱۵۵۸۴b();
                    } else {
                        i3 = this.f۱۱۸۰۷u.m۱۵۵۹۲f();
                    }
                    anchorInfo.f۱۱۸۱۵b = i3;
                    return true;
                } else {
                    int startGap = this.f۱۱۸۰۷u.m۱۵۵۸۹d(child) - this.f۱۱۸۰۷u.m۱۵۵۹۲f();
                    if (startGap < 0) {
                        anchorInfo.f۱۱۸۱۵b = -startGap;
                        return true;
                    }
                    int endGap = this.f۱۱۸۰۷u.m۱۵۵۸۴b() - this.f۱۱۸۰۷u.m۱۵۵۸۲a(child);
                    if (endGap < 0) {
                        anchorInfo.f۱۱۸۱۵b = endGap;
                        return true;
                    }
                    anchorInfo.f۱۱۸۱۵b = Integer.MIN_VALUE;
                }
            } else {
                anchorInfo.f۱۱۸۱۴a = this.f۱۱۷۹۱C;
                int i4 = this.f۱۱۷۹۲D;
                if (i4 == Integer.MIN_VALUE) {
                    if (m۱۴۷۹۲l(anchorInfo.f۱۱۸۱۴a) == 1) {
                        z = true;
                    }
                    anchorInfo.f۱۱۸۱۶c = z;
                    anchorInfo.m۱۴۸۶۳a();
                } else {
                    anchorInfo.m۱۴۸۶۴a(i4);
                }
                anchorInfo.f۱۱۸۱۷d = true;
            }
        } else {
            anchorInfo.f۱۱۸۱۵b = Integer.MIN_VALUE;
            anchorInfo.f۱۱۸۱۴a = this.f۱۱۷۹۱C;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k  reason: contains not printable characters */
    public void m۱۴۸۶۰k(int totalSpace) {
        this.f۱۱۸۱۰x = totalSpace / this.f۱۱۸۰۵s;
        this.f۱۱۷۹۸J = View.MeasureSpec.makeMeasureSpec(totalSpace, this.f۱۱۸۰۸v.m۱۵۵۸۸d());
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: C  reason: contains not printable characters */
    public boolean m۱۴۸۰۶C() {
        return this.f۱۱۷۹۷I == null;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۴۸۳۷b(RecyclerView.Ca0 state) {
        return m۱۴۷۹۰i(state);
    }

    /* renamed from: i  reason: contains not printable characters */
    private int m۱۴۷۹۰i(RecyclerView.Ca0 state) {
        if (m۱۴۵۸۸e() == 0) {
            return 0;
        }
        return Ca1.m۱۴۹۸۹a(state, this.f۱۱۸۰۷u, m۱۴۸۳۹b(!this.f۱۱۸۰۲N), m۱۴۸۲۲a(!this.f۱۱۸۰۲N), this, this.f۱۱۸۰۲N, this.f۱۱۷۸۹A);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: e  reason: contains not printable characters */
    public int m۱۴۸۵۱e(RecyclerView.Ca0 state) {
        return m۱۴۷۹۰i(state);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۴۸۱۷a(RecyclerView.Ca0 state) {
        return m۱۴۷۸۹h(state);
    }

    /* renamed from: h  reason: contains not printable characters */
    private int m۱۴۷۸۹h(RecyclerView.Ca0 state) {
        if (m۱۴۵۸۸e() == 0) {
            return 0;
        }
        return Ca1.m۱۴۹۸۸a(state, this.f۱۱۸۰۷u, m۱۴۸۳۹b(!this.f۱۱۸۰۲N), m۱۴۸۲۲a(!this.f۱۱۸۰۲N), this, this.f۱۱۸۰۲N);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: d  reason: contains not printable characters */
    public int m۱۴۸۴۸d(RecyclerView.Ca0 state) {
        return m۱۴۷۸۹h(state);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۴۸۴۵c(RecyclerView.Ca0 state) {
        return m۱۴۷۹۱j(state);
    }

    /* renamed from: j  reason: contains not printable characters */
    private int m۱۴۷۹۱j(RecyclerView.Ca0 state) {
        if (m۱۴۵۸۸e() == 0) {
            return 0;
        }
        return Ca1.m۱۴۹۹۰b(state, this.f۱۱۸۰۷u, m۱۴۸۳۹b(!this.f۱۱۸۰۲N), m۱۴۸۲۲a(!this.f۱۱۸۰۲N), this, this.f۱۱۸۰۲N);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: f  reason: contains not printable characters */
    public int m۱۴۸۵۴f(RecyclerView.Ca0 state) {
        return m۱۴۷۹۱j(state);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۷۷۹a(View child, Cc lp, boolean alreadyMeasured) {
        if (lp.f۱۱۸۲۲f) {
            if (this.f۱۱۸۰۹w == 1) {
                m۱۴۷۷۷a(child, this.f۱۱۷۹۸J, RecyclerView.AbstractCo.m۱۴۴۹۵a(m۱۴۶۰۳h(), m۱۴۶۰۶i(), m۱۴۶۲۰p() + m۱۴۶۱۴m(), ((ViewGroup.MarginLayoutParams) lp).height, true), alreadyMeasured);
            } else {
                m۱۴۷۷۷a(child, RecyclerView.AbstractCo.m۱۴۴۹۵a(m۱۴۶۲۱q(), m۱۴۶۲۲r(), m۱۴۶۱۶n() + m۱۴۶۱۸o(), ((ViewGroup.MarginLayoutParams) lp).width, true), this.f۱۱۷۹۸J, alreadyMeasured);
            }
        } else if (this.f۱۱۸۰۹w == 1) {
            m۱۴۷۷۷a(child, RecyclerView.AbstractCo.m۱۴۴۹۵a(this.f۱۱۸۱۰x, m۱۴۶۲۲r(), 0, ((ViewGroup.MarginLayoutParams) lp).width, false), RecyclerView.AbstractCo.m۱۴۴۹۵a(m۱۴۶۰۳h(), m۱۴۶۰۶i(), m۱۴۶۲۰p() + m۱۴۶۱۴m(), ((ViewGroup.MarginLayoutParams) lp).height, true), alreadyMeasured);
        } else {
            m۱۴۷۷۷a(child, RecyclerView.AbstractCo.m۱۴۴۹۵a(m۱۴۶۲۱q(), m۱۴۶۲۲r(), m۱۴۶۱۶n() + m۱۴۶۱۸o(), ((ViewGroup.MarginLayoutParams) lp).width, true), RecyclerView.AbstractCo.m۱۴۴۹۵a(this.f۱۱۸۱۰x, m۱۴۶۰۶i(), 0, ((ViewGroup.MarginLayoutParams) lp).height, false), alreadyMeasured);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۷۷۷a(View child, int widthSpec, int heightSpec, boolean alreadyMeasured) {
        boolean measure;
        m۱۴۵۳۶a(child, this.f۱۱۷۹۹K);
        Cc lp = (Cc) child.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) lp).leftMargin;
        Rect rect = this.f۱۱۷۹۹K;
        int widthSpec2 = m۱۴۷۸۵c(widthSpec, i + rect.left, ((ViewGroup.MarginLayoutParams) lp).rightMargin + rect.right);
        int i2 = ((ViewGroup.MarginLayoutParams) lp).topMargin;
        Rect rect2 = this.f۱۱۷۹۹K;
        int heightSpec2 = m۱۴۷۸۵c(heightSpec, i2 + rect2.top, ((ViewGroup.MarginLayoutParams) lp).bottomMargin + rect2.bottom);
        if (alreadyMeasured) {
            measure = m۱۴۵۶۹b(child, widthSpec2, heightSpec2, lp);
        } else {
            measure = m۱۴۵۵۲a(child, widthSpec2, heightSpec2, lp);
        }
        if (measure) {
            child.measure(widthSpec2, heightSpec2);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private int m۱۴۷۸۵c(int spec, int startInset, int endInset) {
        if (startInset == 0 && endInset == 0) {
            return spec;
        }
        int mode = View.MeasureSpec.getMode(spec);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(spec) - startInset) - endInset), mode);
        }
        return spec;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۸۲۶a(Parcelable state) {
        if (state instanceof Ce) {
            this.f۱۱۷۹۷I = (Ce) state;
            m۱۴۶۲۹y();
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: x  reason: contains not printable characters */
    public Parcelable m۱۴۸۶۲x() {
        int i;
        int line;
        int[] iArr;
        Ce eVar = this.f۱۱۷۹۷I;
        if (eVar != null) {
            return new Ce(eVar);
        }
        Ce state = new Ce();
        state.f۱۱۸۳۶j = this.f۱۱۸۱۲z;
        state.f۱۱۸۳۷k = this.f۱۱۷۹۵G;
        state.f۱۱۸۳۸l = this.f۱۱۷۹۶H;
        Cd dVar = this.f۱۱۷۹۳E;
        if (dVar == null || (iArr = dVar.f۱۱۸۲۳a) == null) {
            state.f۱۱۸۳۳g = 0;
        } else {
            state.f۱۱۸۳۴h = iArr;
            state.f۱۱۸۳۳g = state.f۱۱۸۳۴h.length;
            state.f۱۱۸۳۵i = dVar.f۱۱۸۲۴b;
        }
        if (m۱۴۵۸۸e() > 0) {
            if (this.f۱۱۷۹۵G) {
                i = m۱۴۸۱۲I();
            } else {
                i = m۱۴۸۱۱H();
            }
            state.f۱۱۸۲۹c = i;
            state.f۱۱۸۳۰d = m۱۴۸۱۰G();
            int i2 = this.f۱۱۸۰۵s;
            state.f۱۱۸۳۱e = i2;
            state.f۱۱۸۳۲f = new int[i2];
            for (int i3 = 0; i3 < this.f۱۱۸۰۵s; i3++) {
                if (this.f۱۱۷۹۵G) {
                    line = this.f۱۱۸۰۶t[i3].m۱۴۸۸۷a(Integer.MIN_VALUE);
                    if (line != Integer.MIN_VALUE) {
                        line -= this.f۱۱۸۰۷u.m۱۵۵۸۴b();
                    }
                } else {
                    line = this.f۱۱۸۰۶t[i3].m۱۴۸۹۴b(Integer.MIN_VALUE);
                    if (line != Integer.MIN_VALUE) {
                        line -= this.f۱۱۸۰۷u.m۱۵۵۹۲f();
                    }
                }
                state.f۱۱۸۳۲f[i3] = line;
            }
        } else {
            state.f۱۱۸۲۹c = -1;
            state.f۱۱۸۳۰d = -1;
            state.f۱۱۸۳۱e = 0;
        }
        return state;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۸۲۷a(RecyclerView.Cv recycler, RecyclerView.Ca0 state, View host, android.support.p۰۴۳v4.view.p۰۴۵d0.Cc info2) {
        ViewGroup.LayoutParams lp = host.getLayoutParams();
        if (!(lp instanceof Cc)) {
            super.m۱۴۵۳۷a(host, info2);
            return;
        }
        Cc sglp = (Cc) lp;
        if (this.f۱۱۸۰۹w == 0) {
            info2.m۱۲۸۵۱b(Cc.Cc.m۱۲۸۹۴a(sglp.m۱۴۸۶۷e(), sglp.f۱۱۸۲۲f ? this.f۱۱۸۰۵s : 1, -1, -1, sglp.f۱۱۸۲۲f, false));
        } else {
            info2.m۱۲۸۵۱b(Cc.Cc.m۱۲۸۹۴a(-1, -1, sglp.m۱۴۸۶۷e(), sglp.f۱۱۸۲۲f ? this.f۱۱۸۰۵s : 1, sglp.f۱۱۸۲۲f, false));
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۸۳۱a(AccessibilityEvent event) {
        super.m۱۴۵۴۰a(event);
        if (m۱۴۵۸۸e() > 0) {
            View start = m۱۴۸۳۹b(false);
            View end = m۱۴۸۲۲a(false);
            if (start != null && end != null) {
                int startPos = m۱۴۶۱۳l(start);
                int endPos = m۱۴۶۱۳l(end);
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
    /* renamed from: G  reason: contains not printable characters */
    public int m۱۴۸۱۰G() {
        View first;
        if (this.f۱۱۷۸۹A) {
            first = m۱۴۸۲۲a(true);
        } else {
            first = m۱۴۸۳۹b(true);
        }
        if (first == null) {
            return -1;
        }
        return m۱۴۶۱۳l(first);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۴۸۳۸b(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        if (this.f۱۱۸۰۹w == 0) {
            return this.f۱۱۸۰۵s;
        }
        return super.m۱۴۵۵۸b(recycler, state);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۴۸۱۸a(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        if (this.f۱۱۸۰۹w == 1) {
            return this.f۱۱۸۰۵s;
        }
        return super.m۱۴۵۰۸a(recycler, state);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public View m۱۴۸۳۹b(boolean fullyVisible) {
        int boundsStart = this.f۱۱۸۰۷u.m۱۵۵۹۲f();
        int boundsEnd = this.f۱۱۸۰۷u.m۱۵۵۸۴b();
        int limit = m۱۴۵۸۸e();
        View partiallyVisible = null;
        for (int i = 0; i < limit; i++) {
            View child = m۱۴۵۷۳c(i);
            int childStart = this.f۱۱۸۰۷u.m۱۵۵۸۹d(child);
            if (this.f۱۱۸۰۷u.m۱۵۵۸۲a(child) > boundsStart && childStart < boundsEnd) {
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
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۴۸۲۲a(boolean fullyVisible) {
        int boundsStart = this.f۱۱۸۰۷u.m۱۵۵۹۲f();
        int boundsEnd = this.f۱۱۸۰۷u.m۱۵۵۸۴b();
        View partiallyVisible = null;
        for (int i = m۱۴۵۸۸e() - 1; i >= 0; i--) {
            View child = m۱۴۵۷۳c(i);
            int childStart = this.f۱۱۸۰۷u.m۱۵۵۸۹d(child);
            int childEnd = this.f۱۱۸۰۷u.m۱۵۵۸۲a(child);
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

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۷۷۳a(RecyclerView.Cv recycler, RecyclerView.Ca0 state, boolean canOffsetChildren) {
        int gap;
        int maxEndLine = m۱۴۸۰۰r(Integer.MIN_VALUE);
        if (maxEndLine != Integer.MIN_VALUE && (gap = this.f۱۱۸۰۷u.m۱۵۵۸۴b() - maxEndLine) > 0) {
            int gap2 = gap - (-m۱۴۸۴۴c(-gap, recycler, state));
            if (canOffsetChildren && gap2 > 0) {
                this.f۱۱۸۰۷u.m۱۵۵۸۳a(gap2);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۴۷۸۴b(RecyclerView.Cv recycler, RecyclerView.Ca0 state, boolean canOffsetChildren) {
        int gap;
        int minStartLine = m۱۴۸۰۳u(Integer.MAX_VALUE);
        if (minStartLine != Integer.MAX_VALUE && (gap = minStartLine - this.f۱۱۸۰۷u.m۱۵۵۹۲f()) > 0) {
            int gap2 = gap - m۱۴۸۴۴c(gap, recycler, state);
            if (canOffsetChildren && gap2 > 0) {
                this.f۱۱۸۰۷u.m۱۵۵۸۳a(-gap2);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۴۷۸۲b(int anchorPosition, RecyclerView.Ca0 state) {
        int targetPos;
        Cn0 n0Var = this.f۱۱۸۱۱y;
        boolean z = false;
        n0Var.f۱۲۲۲۶b = 0;
        n0Var.f۱۲۲۲۷c = anchorPosition;
        int startExtra = 0;
        int endExtra = 0;
        if (m۱۴۶۲۷w() && (targetPos = state.m۱۴۳۵۶b()) != -1) {
            if (this.f۱۱۷۸۹A == (targetPos < anchorPosition)) {
                endExtra = this.f۱۱۸۰۷u.m۱۵۵۹۴g();
            } else {
                startExtra = this.f۱۱۸۰۷u.m۱۵۵۹۴g();
            }
        }
        if (m۱۴۵۹۸f()) {
            this.f۱۱۸۱۱y.f۱۲۲۳۰f = this.f۱۱۸۰۷u.m۱۵۵۹۲f() - startExtra;
            this.f۱۱۸۱۱y.f۱۲۲۳۱g = this.f۱۱۸۰۷u.m۱۵۵۸۴b() + endExtra;
        } else {
            this.f۱۱۸۱۱y.f۱۲۲۳۱g = this.f۱۱۸۰۷u.m۱۵۵۸۱a() + endExtra;
            this.f۱۱۸۱۱y.f۱۲۲۳۰f = -startExtra;
        }
        Cn0 n0Var2 = this.f۱۱۸۱۱y;
        n0Var2.f۱۲۲۳۲h = false;
        n0Var2.f۱۲۲۲۵a = true;
        if (this.f۱۱۸۰۷u.m۱۵۵۸۸d() == 0 && this.f۱۱۸۰۷u.m۱۵۵۸۱a() == 0) {
            z = true;
        }
        n0Var2.f۱۲۲۳۳i = z;
    }

    /* renamed from: w  reason: contains not printable characters */
    private void m۱۴۸۰۵w(int direction) {
        Cn0 n0Var = this.f۱۱۸۱۱y;
        n0Var.f۱۲۲۲۹e = direction;
        int i = 1;
        if (this.f۱۱۷۸۹A != (direction == -1)) {
            i = -1;
        }
        n0Var.f۱۲۲۲۸d = i;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۴۸۴۹d(int dx) {
        super.m۱۴۵۸۴d(dx);
        for (int i = 0; i < this.f۱۱۸۰۵s; i++) {
            this.f۱۱۸۰۶t[i].m۱۴۸۹۸c(dx);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۴۸۵۲e(int dy) {
        super.m۱۴۵۹۱e(dy);
        for (int i = 0; i < this.f۱۱۸۰۵s; i++) {
            this.f۱۱۸۰۶t[i].m۱۴۸۹۸c(dy);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۸۴۱b(RecyclerView recyclerView, int positionStart, int itemCount) {
        m۱۴۷۸۱b(positionStart, itemCount, 2);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۸۲۸a(RecyclerView recyclerView, int positionStart, int itemCount) {
        m۱۴۷۸۱b(positionStart, itemCount, 1);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۴۸۵۰d(RecyclerView recyclerView) {
        this.f۱۱۷۹۳E.m۱۴۸۷۳a();
        m۱۴۶۲۹y();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۸۲۹a(RecyclerView recyclerView, int from, int to, int itemCount) {
        m۱۴۷۸۱b(from, to, 8);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۸۳۰a(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
        m۱۴۷۸۱b(positionStart, itemCount, 4);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۴۷۸۱b(int positionStart, int itemCountOrToPosition, int cmd) {
        int affectedRangeStart;
        int affectedRangeEnd;
        int minPosition = this.f۱۱۷۸۹A ? m۱۴۸۱۲I() : m۱۴۸۱۱H();
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
        this.f۱۱۷۹۳E.m۱۴۸۸۲e(affectedRangeStart);
        if (cmd == 1) {
            this.f۱۱۷۹۳E.m۱۴۸۷۵a(positionStart, itemCountOrToPosition);
        } else if (cmd == 2) {
            this.f۱۱۷۹۳E.m۱۴۸۷۹b(positionStart, itemCountOrToPosition);
        } else if (cmd == 8) {
            this.f۱۱۷۹۳E.m۱۴۸۷۹b(positionStart, 1);
            this.f۱۱۷۹۳E.m۱۴۸۷۵a(itemCountOrToPosition, 1);
        }
        if (affectedRangeEnd > minPosition) {
            if (affectedRangeStart <= (this.f۱۱۷۸۹A ? m۱۴۸۱۱H() : m۱۴۸۱۲I())) {
                m۱۴۶۲۹y();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m۱۴۷۷۰a(android.support.p۰۴۷v7.widget.RecyclerView.Cv r23, android.support.p۰۴۷v7.widget.Cn0 r24, android.support.p۰۴۷v7.widget.RecyclerView.Ca0 r25) {
        /*
        // Method dump skipped, instructions count: 562
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.StaggeredGridLayoutManager.m۱۴۷۷۰a(android.support.v7.widget.RecyclerView$v, android.support.v7.widget.n0, android.support.v7.widget.RecyclerView$a0):int");
    }

    /* renamed from: n  reason: contains not printable characters */
    private Cd.Ca m۱۴۷۹۴n(int newItemTop) {
        Cd.Ca fsi = new Cd.Ca();
        fsi.f۱۱۸۲۷e = new int[this.f۱۱۸۰۵s];
        for (int i = 0; i < this.f۱۱۸۰۵s; i++) {
            fsi.f۱۱۸۲۷e[i] = newItemTop - this.f۱۱۸۰۶t[i].m۱۴۸۸۷a(newItemTop);
        }
        return fsi;
    }

    /* renamed from: o  reason: contains not printable characters */
    private Cd.Ca m۱۴۷۹۵o(int newItemBottom) {
        Cd.Ca fsi = new Cd.Ca();
        fsi.f۱۱۸۲۷e = new int[this.f۱۱۸۰۵s];
        for (int i = 0; i < this.f۱۱۸۰۵s; i++) {
            fsi.f۱۱۸۲۷e[i] = this.f۱۱۸۰۶t[i].m۱۴۸۹۴b(newItemBottom) - newItemBottom;
        }
        return fsi;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۷۷۸a(View view, Cc lp, Cn0 layoutState) {
        if (layoutState.f۱۲۲۲۹e == 1) {
            if (lp.f۱۱۸۲۲f) {
                m۱۴۷۹۷p(view);
            } else {
                lp.f۱۱۸۲۱e.m۱۴۸۹۲a(view);
            }
        } else if (lp.f۱۱۸۲۲f) {
            m۱۴۷۹۹q(view);
        } else {
            lp.f۱۱۸۲۱e.m۱۴۸۹۹c(view);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۷۷۴a(RecyclerView.Cv recycler, Cn0 layoutState) {
        int line;
        int line2;
        if (layoutState.f۱۲۲۲۵a && !layoutState.f۱۲۲۳۳i) {
            if (layoutState.f۱۲۲۲۶b == 0) {
                if (layoutState.f۱۲۲۲۹e == -1) {
                    m۱۴۷۷۲a(recycler, layoutState.f۱۲۲۳۱g);
                } else {
                    m۱۴۷۸۳b(recycler, layoutState.f۱۲۲۳۰f);
                }
            } else if (layoutState.f۱۲۲۲۹e == -1) {
                int i = layoutState.f۱۲۲۳۰f;
                int scrolled = i - m۱۴۸۰۱s(i);
                if (scrolled < 0) {
                    line2 = layoutState.f۱۲۲۳۱g;
                } else {
                    line2 = layoutState.f۱۲۲۳۱g - Math.min(scrolled, layoutState.f۱۲۲۲۶b);
                }
                m۱۴۷۷۲a(recycler, line2);
            } else {
                int scrolled2 = m۱۴۸۰۲t(layoutState.f۱۲۲۳۱g) - layoutState.f۱۲۲۳۱g;
                if (scrolled2 < 0) {
                    line = layoutState.f۱۲۲۳۰f;
                } else {
                    line = layoutState.f۱۲۲۳۰f + Math.min(scrolled2, layoutState.f۱۲۲۲۶b);
                }
                m۱۴۷۸۳b(recycler, line);
            }
        }
    }

    /* renamed from: p  reason: contains not printable characters */
    private void m۱۴۷۹۷p(View view) {
        for (int i = this.f۱۱۸۰۵s - 1; i >= 0; i--) {
            this.f۱۱۸۰۶t[i].m۱۴۸۹۲a(view);
        }
    }

    /* renamed from: q  reason: contains not printable characters */
    private void m۱۴۷۹۹q(View view) {
        for (int i = this.f۱۱۸۰۵s - 1; i >= 0; i--) {
            this.f۱۱۸۰۶t[i].m۱۴۸۹۹c(view);
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۴۷۸۸e(int layoutDir, int targetLine) {
        for (int i = 0; i < this.f۱۱۸۰۵s; i++) {
            if (!this.f۱۱۸۰۶t[i].f۱۱۸۳۹a.isEmpty()) {
                m۱۴۷۷۶a(this.f۱۱۸۰۶t[i], layoutDir, targetLine);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۷۷۶a(Cf span, int layoutDir, int targetLine) {
        int deletedSize = span.m۱۴۹۰۳f();
        if (layoutDir == -1) {
            if (span.m۱۴۹۰۵h() + deletedSize <= targetLine) {
                this.f۱۱۷۹۰B.set(span.f۱۱۸۴۳e, false);
            }
        } else if (span.m۱۴۹۰۴g() - deletedSize >= targetLine) {
            this.f۱۱۷۹۰B.set(span.f۱۱۸۴۳e, false);
        }
    }

    /* renamed from: s  reason: contains not printable characters */
    private int m۱۴۸۰۱s(int def) {
        int maxStart = this.f۱۱۸۰۶t[0].m۱۴۸۹۴b(def);
        for (int i = 1; i < this.f۱۱۸۰۵s; i++) {
            int spanStart = this.f۱۱۸۰۶t[i].m۱۴۸۹۴b(def);
            if (spanStart > maxStart) {
                maxStart = spanStart;
            }
        }
        return maxStart;
    }

    /* renamed from: u  reason: contains not printable characters */
    private int m۱۴۸۰۳u(int def) {
        int minStart = this.f۱۱۸۰۶t[0].m۱۴۸۹۴b(def);
        for (int i = 1; i < this.f۱۱۸۰۵s; i++) {
            int spanStart = this.f۱۱۸۰۶t[i].m۱۴۸۹۴b(def);
            if (spanStart < minStart) {
                minStart = spanStart;
            }
        }
        return minStart;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D  reason: contains not printable characters */
    public boolean m۱۴۸۰۷D() {
        int end = this.f۱۱۸۰۶t[0].m۱۴۸۸۷a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f۱۱۸۰۵s; i++) {
            if (this.f۱۱۸۰۶t[i].m۱۴۸۸۷a(Integer.MIN_VALUE) != end) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E  reason: contains not printable characters */
    public boolean m۱۴۸۰۸E() {
        int start = this.f۱۱۸۰۶t[0].m۱۴۸۹۴b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f۱۱۸۰۵s; i++) {
            if (this.f۱۱۸۰۶t[i].m۱۴۸۹۴b(Integer.MIN_VALUE) != start) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r  reason: contains not printable characters */
    private int m۱۴۸۰۰r(int def) {
        int maxEnd = this.f۱۱۸۰۶t[0].m۱۴۸۸۷a(def);
        for (int i = 1; i < this.f۱۱۸۰۵s; i++) {
            int spanEnd = this.f۱۱۸۰۶t[i].m۱۴۸۸۷a(def);
            if (spanEnd > maxEnd) {
                maxEnd = spanEnd;
            }
        }
        return maxEnd;
    }

    /* renamed from: t  reason: contains not printable characters */
    private int m۱۴۸۰۲t(int def) {
        int minEnd = this.f۱۱۸۰۶t[0].m۱۴۸۸۷a(def);
        for (int i = 1; i < this.f۱۱۸۰۵s; i++) {
            int spanEnd = this.f۱۱۸۰۶t[i].m۱۴۸۸۷a(def);
            if (spanEnd < minEnd) {
                minEnd = spanEnd;
            }
        }
        return minEnd;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۴۷۸۳b(RecyclerView.Cv recycler, int line) {
        while (m۱۴۵۸۸e() > 0) {
            View child = m۱۴۵۷۳c(0);
            if (this.f۱۱۸۰۷u.m۱۵۵۸۲a(child) <= line && this.f۱۱۸۰۷u.m۱۵۵۹۱e(child) <= line) {
                Cc lp = (Cc) child.getLayoutParams();
                if (lp.f۱۱۸۲۲f) {
                    for (int j = 0; j < this.f۱۱۸۰۵s; j++) {
                        if (this.f۱۱۸۰۶t[j].f۱۱۸۳۹a.size() == 1) {
                            return;
                        }
                    }
                    for (int j2 = 0; j2 < this.f۱۱۸۰۵s; j2++) {
                        this.f۱۱۸۰۶t[j2].m۱۴۹۰۸k();
                    }
                } else if (lp.f۱۱۸۲۱e.f۱۱۸۳۹a.size() != 1) {
                    lp.f۱۱۸۲۱e.m۱۴۹۰۸k();
                } else {
                    return;
                }
                m۱۴۵۳۸a(child, recycler);
            } else {
                return;
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۷۷۲a(RecyclerView.Cv recycler, int line) {
        for (int i = m۱۴۵۸۸e() - 1; i >= 0; i--) {
            View child = m۱۴۵۷۳c(i);
            if (this.f۱۱۸۰۷u.m۱۵۵۸۹d(child) >= line && this.f۱۱۸۰۷u.m۱۵۵۹۳f(child) >= line) {
                Cc lp = (Cc) child.getLayoutParams();
                if (lp.f۱۱۸۲۲f) {
                    for (int j = 0; j < this.f۱۱۸۰۵s; j++) {
                        if (this.f۱۱۸۰۶t[j].f۱۱۸۳۹a.size() == 1) {
                            return;
                        }
                    }
                    for (int j2 = 0; j2 < this.f۱۱۸۰۵s; j2++) {
                        this.f۱۱۸۰۶t[j2].m۱۴۹۰۷j();
                    }
                } else if (lp.f۱۱۸۲۱e.f۱۱۸۳۹a.size() != 1) {
                    lp.f۱۱۸۲۱e.m۱۴۹۰۷j();
                } else {
                    return;
                }
                m۱۴۵۳۸a(child, recycler);
            } else {
                return;
            }
        }
    }

    /* renamed from: v  reason: contains not printable characters */
    private boolean m۱۴۸۰۴v(int layoutDir) {
        if (this.f۱۱۸۰۹w == 0) {
            if ((layoutDir == -1) != this.f۱۱۷۸۹A) {
                return true;
            }
            return false;
        }
        if (((layoutDir == -1) == this.f۱۱۷۸۹A) == m۱۴۸۱۵L()) {
            return true;
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Cf m۱۴۷۷۱a(Cn0 layoutState) {
        int diff;
        int endIndex;
        int startIndex;
        if (m۱۴۸۰۴v(layoutState.f۱۲۲۲۹e)) {
            startIndex = this.f۱۱۸۰۵s - 1;
            endIndex = -1;
            diff = -1;
        } else {
            startIndex = 0;
            endIndex = this.f۱۱۸۰۵s;
            diff = 1;
        }
        if (layoutState.f۱۲۲۲۹e == 1) {
            Cf min = null;
            int minLine = Integer.MAX_VALUE;
            int defaultLine = this.f۱۱۸۰۷u.m۱۵۵۹۲f();
            for (int i = startIndex; i != endIndex; i += diff) {
                Cf other = this.f۱۱۸۰۶t[i];
                int otherLine = other.m۱۴۸۸۷a(defaultLine);
                if (otherLine < minLine) {
                    min = other;
                    minLine = otherLine;
                }
            }
            return min;
        }
        Cf max = null;
        int maxLine = Integer.MIN_VALUE;
        int defaultLine2 = this.f۱۱۸۰۷u.m۱۵۵۸۴b();
        for (int i2 = startIndex; i2 != endIndex; i2 += diff) {
            Cf other2 = this.f۱۱۸۰۶t[i2];
            int otherLine2 = other2.m۱۴۸۹۴b(defaultLine2);
            if (otherLine2 > maxLine) {
                max = other2;
                maxLine = otherLine2;
            }
        }
        return max;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۴۸۴۳b() {
        return this.f۱۱۸۰۹w == 1;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۸۳۳a() {
        return this.f۱۱۸۰۹w == 0;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۴۸۱۶a(int dx, RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        return m۱۴۸۴۴c(dx, recycler, state);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۴۸۳۶b(int dy, RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        return m۱۴۸۴۴c(dy, recycler, state);
    }

    /* renamed from: l  reason: contains not printable characters */
    private int m۱۴۷۹۲l(int position) {
        if (m۱۴۵۸۸e() != 0) {
            if ((position < m۱۴۸۱۱H()) != this.f۱۱۷۸۹A) {
                return -1;
            }
            return 1;
        } else if (this.f۱۱۷۸۹A) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۴۸۵۷h(int position) {
        Ce eVar = this.f۱۱۷۹۷I;
        if (!(eVar == null || eVar.f۱۱۸۲۹c == position)) {
            eVar.m۱۴۸۸۵a();
        }
        this.f۱۱۷۹۱C = position;
        this.f۱۱۷۹۲D = Integer.MIN_VALUE;
        m۱۴۶۲۹y();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۸۲۳a(int dx, int dy, RecyclerView.Ca0 state, RecyclerView.AbstractCo.AbstractCc layoutPrefetchRegistry) {
        int distance;
        int delta = this.f۱۱۸۰۹w == 0 ? dx : dy;
        if (!(m۱۴۵۸۸e() == 0 || delta == 0)) {
            m۱۴۸۲۴a(delta, state);
            int[] iArr = this.f۱۱۸۰۳O;
            if (iArr == null || iArr.length < this.f۱۱۸۰۵s) {
                this.f۱۱۸۰۳O = new int[this.f۱۱۸۰۵s];
            }
            int itemPrefetchCount = 0;
            for (int i = 0; i < this.f۱۱۸۰۵s; i++) {
                Cn0 n0Var = this.f۱۱۸۱۱y;
                if (n0Var.f۱۲۲۲۸d == -1) {
                    int i2 = n0Var.f۱۲۲۳۰f;
                    distance = i2 - this.f۱۱۸۰۶t[i].m۱۴۸۹۴b(i2);
                } else {
                    distance = this.f۱۱۸۰۶t[i].m۱۴۸۸۷a(n0Var.f۱۲۲۳۱g) - this.f۱۱۸۱۱y.f۱۲۲۳۱g;
                }
                if (distance >= 0) {
                    this.f۱۱۸۰۳O[itemPrefetchCount] = distance;
                    itemPrefetchCount++;
                }
            }
            Arrays.sort(this.f۱۱۸۰۳O, 0, itemPrefetchCount);
            for (int i3 = 0; i3 < itemPrefetchCount && this.f۱۱۸۱۱y.m۱۵۴۵۴a(state); i3++) {
                layoutPrefetchRegistry.m۱۴۶۴۱a(this.f۱۱۸۱۱y.f۱۲۲۲۷c, this.f۱۱۸۰۳O[i3]);
                Cn0 n0Var2 = this.f۱۱۸۱۱y;
                n0Var2.f۱۲۲۲۷c += n0Var2.f۱۲۲۲۸d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۸۲۴a(int delta, RecyclerView.Ca0 state) {
        int referenceChildPosition;
        int layoutDir;
        if (delta > 0) {
            layoutDir = 1;
            referenceChildPosition = m۱۴۸۱۲I();
        } else {
            layoutDir = -1;
            referenceChildPosition = m۱۴۸۱۱H();
        }
        this.f۱۱۸۱۱y.f۱۲۲۲۵a = true;
        m۱۴۷۸۲b(referenceChildPosition, state);
        m۱۴۸۰۵w(layoutDir);
        Cn0 n0Var = this.f۱۱۸۱۱y;
        n0Var.f۱۲۲۲۷c = n0Var.f۱۲۲۲۸d + referenceChildPosition;
        n0Var.f۱۲۲۲۶b = Math.abs(delta);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۴۸۴۴c(int dt, RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        int totalScroll;
        if (m۱۴۵۸۸e() == 0 || dt == 0) {
            return 0;
        }
        m۱۴۸۲۴a(dt, state);
        int consumed = m۱۴۷۷۰a(recycler, this.f۱۱۸۱۱y, state);
        if (this.f۱۱۸۱۱y.f۱۲۲۲۶b < consumed) {
            totalScroll = dt;
        } else if (dt < 0) {
            totalScroll = -consumed;
        } else {
            totalScroll = consumed;
        }
        this.f۱۱۸۰۷u.m۱۵۵۸۳a(-totalScroll);
        this.f۱۱۷۹۵G = this.f۱۱۷۸۹A;
        Cn0 n0Var = this.f۱۱۸۱۱y;
        n0Var.f۱۲۲۲۶b = 0;
        m۱۴۷۷۴a(recycler, n0Var);
        return totalScroll;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I  reason: contains not printable characters */
    public int m۱۴۸۱۲I() {
        int childCount = m۱۴۵۸۸e();
        if (childCount == 0) {
            return 0;
        }
        return m۱۴۶۱۳l(m۱۴۵۷۳c(childCount - 1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H  reason: contains not printable characters */
    public int m۱۴۸۱۱H() {
        if (m۱۴۵۸۸e() == 0) {
            return 0;
        }
        return m۱۴۶۱۳l(m۱۴۵۷۳c(0));
    }

    /* renamed from: p  reason: contains not printable characters */
    private int m۱۴۷۹۶p(int itemCount) {
        int limit = m۱۴۵۸۸e();
        for (int i = 0; i < limit; i++) {
            int position = m۱۴۶۱۳l(m۱۴۵۷۳c(i));
            if (position >= 0 && position < itemCount) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: q  reason: contains not printable characters */
    private int m۱۴۷۹۸q(int itemCount) {
        for (int i = m۱۴۵۸۸e() - 1; i >= 0; i--) {
            int position = m۱۴۶۱۳l(m۱۴۵۷۳c(i));
            if (position >= 0 && position < itemCount) {
                return position;
            }
        }
        return 0;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: c  reason: contains not printable characters */
    public RecyclerView.Cp m۱۴۸۴۶c() {
        if (this.f۱۱۸۰۹w == 0) {
            return new Cc(-2, -1);
        }
        return new Cc(-1, -2);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public RecyclerView.Cp m۱۴۸۱۹a(Context c, AttributeSet attrs) {
        return new Cc(c, attrs);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public RecyclerView.Cp m۱۴۸۲۰a(ViewGroup.LayoutParams lp) {
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new Cc((ViewGroup.MarginLayoutParams) lp);
        }
        return new Cc(lp);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۸۳۵a(RecyclerView.Cp lp) {
        return lp instanceof Cc;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۴۸۲۱a(View focused, int direction, RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        View directChild;
        int referenceChildPosition;
        int i;
        int i2;
        int i3;
        View view;
        if (m۱۴۵۸۸e() == 0 || (directChild = m۱۴۵۷۴c(focused)) == null) {
            return null;
        }
        m۱۴۷۶۹O();
        int layoutDir = m۱۴۷۹۳m(direction);
        if (layoutDir == Integer.MIN_VALUE) {
            return null;
        }
        Cc prevFocusLayoutParams = (Cc) directChild.getLayoutParams();
        boolean prevFocusFullSpan = prevFocusLayoutParams.f۱۱۸۲۲f;
        Cf prevFocusSpan = prevFocusLayoutParams.f۱۱۸۲۱e;
        if (layoutDir == 1) {
            referenceChildPosition = m۱۴۸۱۲I();
        } else {
            referenceChildPosition = m۱۴۸۱۱H();
        }
        m۱۴۷۸۲b(referenceChildPosition, state);
        m۱۴۸۰۵w(layoutDir);
        Cn0 n0Var = this.f۱۱۸۱۱y;
        n0Var.f۱۲۲۲۷c = n0Var.f۱۲۲۲۸d + referenceChildPosition;
        n0Var.f۱۲۲۲۶b = (int) (((float) this.f۱۱۸۰۷u.m۱۵۵۹۴g()) * 0.33333334f);
        Cn0 n0Var2 = this.f۱۱۸۱۱y;
        n0Var2.f۱۲۲۳۲h = true;
        boolean shouldSearchFromStart = false;
        n0Var2.f۱۲۲۲۵a = false;
        m۱۴۷۷۰a(recycler, n0Var2, state);
        this.f۱۱۷۹۵G = this.f۱۱۷۸۹A;
        if (!(prevFocusFullSpan || (view = prevFocusSpan.m۱۴۸۹۰a(referenceChildPosition, layoutDir)) == null || view == directChild)) {
            return view;
        }
        if (m۱۴۸۰۴v(layoutDir)) {
            for (int i4 = this.f۱۱۸۰۵s - 1; i4 >= 0; i4--) {
                View view2 = this.f۱۱۸۰۶t[i4].m۱۴۸۹۰a(referenceChildPosition, layoutDir);
                if (!(view2 == null || view2 == directChild)) {
                    return view2;
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f۱۱۸۰۵s; i5++) {
                View view3 = this.f۱۱۸۰۶t[i5].m۱۴۸۹۰a(referenceChildPosition, layoutDir);
                if (!(view3 == null || view3 == directChild)) {
                    return view3;
                }
            }
        }
        if ((!this.f۱۱۸۱۲z) == (layoutDir == -1)) {
            shouldSearchFromStart = true;
        }
        if (!prevFocusFullSpan) {
            if (shouldSearchFromStart) {
                i3 = prevFocusSpan.m۱۴۹۰۰d();
            } else {
                i3 = prevFocusSpan.m۱۴۹۰۲e();
            }
            View unfocusableCandidate = m۱۴۵۵۹b(i3);
            if (!(unfocusableCandidate == null || unfocusableCandidate == directChild)) {
                return unfocusableCandidate;
            }
        }
        if (m۱۴۸۰۴v(layoutDir)) {
            for (int i6 = this.f۱۱۸۰۵s - 1; i6 >= 0; i6--) {
                if (i6 != prevFocusSpan.f۱۱۸۴۳e) {
                    if (shouldSearchFromStart) {
                        i2 = this.f۱۱۸۰۶t[i6].m۱۴۹۰۰d();
                    } else {
                        i2 = this.f۱۱۸۰۶t[i6].m۱۴۹۰۲e();
                    }
                    View unfocusableCandidate2 = m۱۴۵۵۹b(i2);
                    if (!(unfocusableCandidate2 == null || unfocusableCandidate2 == directChild)) {
                        return unfocusableCandidate2;
                    }
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f۱۱۸۰۵s; i7++) {
                if (shouldSearchFromStart) {
                    i = this.f۱۱۸۰۶t[i7].m۱۴۹۰۰d();
                } else {
                    i = this.f۱۱۸۰۶t[i7].m۱۴۹۰۲e();
                }
                View unfocusableCandidate3 = m۱۴۵۵۹b(i);
                if (!(unfocusableCandidate3 == null || unfocusableCandidate3 == directChild)) {
                    return unfocusableCandidate3;
                }
            }
        }
        return null;
    }

    /* renamed from: m  reason: contains not printable characters */
    private int m۱۴۷۹۳m(int focusDirection) {
        if (focusDirection != 1) {
            if (focusDirection != 2) {
                if (focusDirection != 17) {
                    if (focusDirection != 33) {
                        if (focusDirection != 66) {
                            if (focusDirection == 130 && this.f۱۱۸۰۹w == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f۱۱۸۰۹w == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f۱۱۸۰۹w == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f۱۱۸۰۹w == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f۱۱۸۰۹w != 1 && m۱۴۸۱۵L()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f۱۱۸۰۹w != 1 && m۱۴۸۱۵L()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$c  reason: invalid class name */
    public static class Cc extends RecyclerView.Cp {

        /* renamed from: e  reason: contains not printable characters */
        Cf f۱۱۸۲۱e;

        /* renamed from: f  reason: contains not printable characters */
        boolean f۱۱۸۲۲f;

        public Cc(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public Cc(int width, int height) {
            super(width, height);
        }

        public Cc(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public Cc(ViewGroup.LayoutParams source) {
            super(source);
        }

        /* renamed from: f  reason: contains not printable characters */
        public boolean m۱۴۸۶۸f() {
            return this.f۱۱۸۲۲f;
        }

        /* renamed from: e  reason: contains not printable characters */
        public final int m۱۴۸۶۷e() {
            Cf fVar = this.f۱۱۸۲۱e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f۱۱۸۴۳e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$f  reason: invalid class name */
    public class Cf {

        /* renamed from: a  reason: contains not printable characters */
        ArrayList<View> f۱۱۸۳۹a = new ArrayList<>();

        /* renamed from: b  reason: contains not printable characters */
        int f۱۱۸۴۰b = Integer.MIN_VALUE;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۱۸۴۱c = Integer.MIN_VALUE;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۱۸۴۲d = 0;

        /* renamed from: e  reason: contains not printable characters */
        final int f۱۱۸۴۳e;

        Cf(int index) {
            this.f۱۱۸۴۳e = index;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۴۸۹۴b(int def) {
            int i = this.f۱۱۸۴۰b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            if (this.f۱۱۸۳۹a.size() == 0) {
                return def;
            }
            m۱۴۸۹۶b();
            return this.f۱۱۸۴۰b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۸۹۶b() {
            Cd.Ca fsi;
            View startView = this.f۱۱۸۳۹a.get(0);
            Cc lp = m۱۴۸۹۵b(startView);
            this.f۱۱۸۴۰b = StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۸۹d(startView);
            if (lp.f۱۱۸۲۲f && (fsi = StaggeredGridLayoutManager.this.f۱۱۷۹۳E.m۱۴۸۸۰c(lp.m۱۴۶۴۲a())) != null && fsi.f۱۱۸۲۶d == -1) {
                this.f۱۱۸۴۰b -= fsi.m۱۴۸۸۴a(this.f۱۱۸۴۳e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h  reason: contains not printable characters */
        public int m۱۴۹۰۵h() {
            int i = this.f۱۱۸۴۰b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m۱۴۸۹۶b();
            return this.f۱۱۸۴۰b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۴۸۸۷a(int def) {
            int i = this.f۱۱۸۴۱c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            if (this.f۱۱۸۳۹a.size() == 0) {
                return def;
            }
            m۱۴۸۹۱a();
            return this.f۱۱۸۴۱c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۸۹۱a() {
            Cd.Ca fsi;
            ArrayList<View> arrayList = this.f۱۱۸۳۹a;
            View endView = arrayList.get(arrayList.size() - 1);
            Cc lp = m۱۴۸۹۵b(endView);
            this.f۱۱۸۴۱c = StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۸۲a(endView);
            if (lp.f۱۱۸۲۲f && (fsi = StaggeredGridLayoutManager.this.f۱۱۷۹۳E.m۱۴۸۸۰c(lp.m۱۴۶۴۲a())) != null && fsi.f۱۱۸۲۶d == 1) {
                this.f۱۱۸۴۱c += fsi.m۱۴۸۸۴a(this.f۱۱۸۴۳e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g  reason: contains not printable characters */
        public int m۱۴۹۰۴g() {
            int i = this.f۱۱۸۴۱c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m۱۴۸۹۱a();
            return this.f۱۱۸۴۱c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۸۹۹c(View view) {
            Cc lp = m۱۴۸۹۵b(view);
            lp.f۱۱۸۲۱e = this;
            this.f۱۱۸۳۹a.add(0, view);
            this.f۱۱۸۴۰b = Integer.MIN_VALUE;
            if (this.f۱۱۸۳۹a.size() == 1) {
                this.f۱۱۸۴۱c = Integer.MIN_VALUE;
            }
            if (lp.m۱۴۶۴۴c() || lp.m۱۴۶۴۳b()) {
                this.f۱۱۸۴۲d += StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۸۵b(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۸۹۲a(View view) {
            Cc lp = m۱۴۸۹۵b(view);
            lp.f۱۱۸۲۱e = this;
            this.f۱۱۸۳۹a.add(view);
            this.f۱۱۸۴۱c = Integer.MIN_VALUE;
            if (this.f۱۱۸۳۹a.size() == 1) {
                this.f۱۱۸۴۰b = Integer.MIN_VALUE;
            }
            if (lp.m۱۴۶۴۴c() || lp.m۱۴۶۴۳b()) {
                this.f۱۱۸۴۲d += StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۸۵b(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۸۹۳a(boolean reverseLayout, int offset) {
            int reference;
            if (reverseLayout) {
                reference = m۱۴۸۸۷a(Integer.MIN_VALUE);
            } else {
                reference = m۱۴۸۹۴b(Integer.MIN_VALUE);
            }
            m۱۴۸۹۷c();
            if (reference != Integer.MIN_VALUE) {
                if (reverseLayout && reference < StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۸۴b()) {
                    return;
                }
                if (reverseLayout || reference <= StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۹۲f()) {
                    if (offset != Integer.MIN_VALUE) {
                        reference += offset;
                    }
                    this.f۱۱۸۴۱c = reference;
                    this.f۱۱۸۴۰b = reference;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۸۹۷c() {
            this.f۱۱۸۳۹a.clear();
            m۱۴۹۰۶i();
            this.f۱۱۸۴۲d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i  reason: contains not printable characters */
        public void m۱۴۹۰۶i() {
            this.f۱۱۸۴۰b = Integer.MIN_VALUE;
            this.f۱۱۸۴۱c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۴۹۰۱d(int line) {
            this.f۱۱۸۴۰b = line;
            this.f۱۱۸۴۱c = line;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j  reason: contains not printable characters */
        public void m۱۴۹۰۷j() {
            int size = this.f۱۱۸۳۹a.size();
            View end = this.f۱۱۸۳۹a.remove(size - 1);
            Cc lp = m۱۴۸۹۵b(end);
            lp.f۱۱۸۲۱e = null;
            if (lp.m۱۴۶۴۴c() || lp.m۱۴۶۴۳b()) {
                this.f۱۱۸۴۲d -= StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۸۵b(end);
            }
            if (size == 1) {
                this.f۱۱۸۴۰b = Integer.MIN_VALUE;
            }
            this.f۱۱۸۴۱c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k  reason: contains not printable characters */
        public void m۱۴۹۰۸k() {
            View start = this.f۱۱۸۳۹a.remove(0);
            Cc lp = m۱۴۸۹۵b(start);
            lp.f۱۱۸۲۱e = null;
            if (this.f۱۱۸۳۹a.size() == 0) {
                this.f۱۱۸۴۱c = Integer.MIN_VALUE;
            }
            if (lp.m۱۴۶۴۴c() || lp.m۱۴۶۴۳b()) {
                this.f۱۱۸۴۲d -= StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۸۵b(start);
            }
            this.f۱۱۸۴۰b = Integer.MIN_VALUE;
        }

        /* renamed from: f  reason: contains not printable characters */
        public int m۱۴۹۰۳f() {
            return this.f۱۱۸۴۲d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public Cc m۱۴۸۹۵b(View view) {
            return (Cc) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۸۹۸c(int dt) {
            int i = this.f۱۱۸۴۰b;
            if (i != Integer.MIN_VALUE) {
                this.f۱۱۸۴۰b = i + dt;
            }
            int i2 = this.f۱۱۸۴۱c;
            if (i2 != Integer.MIN_VALUE) {
                this.f۱۱۸۴۱c = i2 + dt;
            }
        }

        /* renamed from: d  reason: contains not printable characters */
        public int m۱۴۹۰۰d() {
            if (StaggeredGridLayoutManager.this.f۱۱۸۱۲z) {
                return m۱۴۸۸۸a(this.f۱۱۸۳۹a.size() - 1, -1, true);
            }
            return m۱۴۸۸۸a(0, this.f۱۱۸۳۹a.size(), true);
        }

        /* renamed from: e  reason: contains not printable characters */
        public int m۱۴۹۰۲e() {
            if (StaggeredGridLayoutManager.this.f۱۱۸۱۲z) {
                return m۱۴۸۸۸a(0, this.f۱۱۸۳۹a.size(), true);
            }
            return m۱۴۸۸۸a(this.f۱۱۸۳۹a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۴۸۸۹a(int fromIndex, int toIndex, boolean completelyVisible, boolean acceptCompletelyVisible, boolean acceptEndPointInclusion) {
            int start = StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۹۲f();
            int end = StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۸۴b();
            int next = toIndex > fromIndex ? 1 : -1;
            for (int i = fromIndex; i != toIndex; i += next) {
                View child = this.f۱۱۸۳۹a.get(i);
                int childStart = StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۸۹d(child);
                int childEnd = StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۸۲a(child);
                boolean childEndInclusion = false;
                boolean childStartInclusion = !acceptEndPointInclusion ? childStart < end : childStart <= end;
                if (!acceptEndPointInclusion ? childEnd > start : childEnd >= start) {
                    childEndInclusion = true;
                }
                if (childStartInclusion && childEndInclusion) {
                    if (!completelyVisible || !acceptCompletelyVisible) {
                        if (acceptCompletelyVisible) {
                            return StaggeredGridLayoutManager.this.m۱۴۶۱۳l(child);
                        }
                        if (childStart < start || childEnd > end) {
                            return StaggeredGridLayoutManager.this.m۱۴۶۱۳l(child);
                        }
                    } else if (childStart >= start && childEnd <= end) {
                        return StaggeredGridLayoutManager.this.m۱۴۶۱۳l(child);
                    }
                }
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۴۸۸۸a(int fromIndex, int toIndex, boolean acceptEndPointInclusion) {
            return m۱۴۸۸۹a(fromIndex, toIndex, false, false, acceptEndPointInclusion);
        }

        /* renamed from: a  reason: contains not printable characters */
        public View m۱۴۸۹۰a(int referenceChildPosition, int layoutDir) {
            View candidate = null;
            if (layoutDir != -1) {
                for (int i = this.f۱۱۸۳۹a.size() - 1; i >= 0; i--) {
                    View view = this.f۱۱۸۳۹a.get(i);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f۱۱۸۱۲z && staggeredGridLayoutManager.m۱۴۶۱۳l(view) >= referenceChildPosition) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f۱۱۸۱۲z && staggeredGridLayoutManager2.m۱۴۶۱۳l(view) <= referenceChildPosition) || !view.hasFocusable()) {
                        break;
                    }
                    candidate = view;
                }
            } else {
                int limit = this.f۱۱۸۳۹a.size();
                for (int i2 = 0; i2 < limit; i2++) {
                    View view2 = this.f۱۱۸۳۹a.get(i2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f۱۱۸۱۲z && staggeredGridLayoutManager3.m۱۴۶۱۳l(view2) <= referenceChildPosition) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f۱۱۸۱۲z && staggeredGridLayoutManager4.m۱۴۶۱۳l(view2) >= referenceChildPosition) || !view2.hasFocusable()) {
                        break;
                    }
                    candidate = view2;
                }
            }
            return candidate;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$d  reason: invalid class name */
    public static class Cd {

        /* renamed from: a  reason: contains not printable characters */
        int[] f۱۱۸۲۳a;

        /* renamed from: b  reason: contains not printable characters */
        List<Ca> f۱۱۸۲۴b;

        Cd() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۴۸۷۸b(int position) {
            List<Ca> list = this.f۱۱۸۲۴b;
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (this.f۱۱۸۲۴b.get(i).f۱۱۸۲۵c >= position) {
                        this.f۱۱۸۲۴b.remove(i);
                    }
                }
            }
            return m۱۴۸۸۲e(position);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e  reason: contains not printable characters */
        public int m۱۴۸۸۲e(int position) {
            int[] iArr = this.f۱۱۸۲۳a;
            if (iArr == null || position >= iArr.length) {
                return -1;
            }
            int endPosition = m۱۴۸۷۱g(position);
            if (endPosition == -1) {
                int[] iArr2 = this.f۱۱۸۲۳a;
                Arrays.fill(iArr2, position, iArr2.length, -1);
                return this.f۱۱۸۲۳a.length;
            }
            Arrays.fill(this.f۱۱۸۲۳a, position, endPosition + 1, -1);
            return endPosition + 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d  reason: contains not printable characters */
        public int m۱۴۸۸۱d(int position) {
            int[] iArr = this.f۱۱۸۲۳a;
            if (iArr == null || position >= iArr.length) {
                return -1;
            }
            return iArr[position];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۸۷۶a(int position, Cf span) {
            m۱۴۸۷۴a(position);
            this.f۱۱۸۲۳a[position] = span.f۱۱۸۴۳e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f  reason: contains not printable characters */
        public int m۱۴۸۸۳f(int position) {
            int len = this.f۱۱۸۲۳a.length;
            while (len <= position) {
                len *= 2;
            }
            return len;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۸۷۴a(int position) {
            int[] iArr = this.f۱۱۸۲۳a;
            if (iArr == null) {
                this.f۱۱۸۲۳a = new int[(Math.max(position, 10) + 1)];
                Arrays.fill(this.f۱۱۸۲۳a, -1);
            } else if (position >= iArr.length) {
                int[] old = this.f۱۱۸۲۳a;
                this.f۱۱۸۲۳a = new int[m۱۴۸۸۳f(position)];
                System.arraycopy(old, 0, this.f۱۱۸۲۳a, 0, old.length);
                int[] iArr2 = this.f۱۱۸۲۳a;
                Arrays.fill(iArr2, old.length, iArr2.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۸۷۳a() {
            int[] iArr = this.f۱۱۸۲۳a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f۱۱۸۲۴b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۸۷۹b(int positionStart, int itemCount) {
            int[] iArr = this.f۱۱۸۲۳a;
            if (iArr != null && positionStart < iArr.length) {
                m۱۴۸۷۴a(positionStart + itemCount);
                int[] iArr2 = this.f۱۱۸۲۳a;
                System.arraycopy(iArr2, positionStart + itemCount, iArr2, positionStart, (iArr2.length - positionStart) - itemCount);
                int[] iArr3 = this.f۱۱۸۲۳a;
                Arrays.fill(iArr3, iArr3.length - itemCount, iArr3.length, -1);
                m۱۴۸۷۰d(positionStart, itemCount);
            }
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۴۸۷۰d(int positionStart, int itemCount) {
            List<Ca> list = this.f۱۱۸۲۴b;
            if (list != null) {
                int end = positionStart + itemCount;
                for (int i = list.size() - 1; i >= 0; i--) {
                    Ca fsi = this.f۱۱۸۲۴b.get(i);
                    int i2 = fsi.f۱۱۸۲۵c;
                    if (i2 >= positionStart) {
                        if (i2 < end) {
                            this.f۱۱۸۲۴b.remove(i);
                        } else {
                            fsi.f۱۱۸۲۵c = i2 - itemCount;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۸۷۵a(int positionStart, int itemCount) {
            int[] iArr = this.f۱۱۸۲۳a;
            if (iArr != null && positionStart < iArr.length) {
                m۱۴۸۷۴a(positionStart + itemCount);
                int[] iArr2 = this.f۱۱۸۲۳a;
                System.arraycopy(iArr2, positionStart, iArr2, positionStart + itemCount, (iArr2.length - positionStart) - itemCount);
                Arrays.fill(this.f۱۱۸۲۳a, positionStart, positionStart + itemCount, -1);
                m۱۴۸۶۹c(positionStart, itemCount);
            }
        }

        /* renamed from: c  reason: contains not printable characters */
        private void m۱۴۸۶۹c(int positionStart, int itemCount) {
            List<Ca> list = this.f۱۱۸۲۴b;
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    Ca fsi = this.f۱۱۸۲۴b.get(i);
                    int i2 = fsi.f۱۱۸۲۵c;
                    if (i2 >= positionStart) {
                        fsi.f۱۱۸۲۵c = i2 + itemCount;
                    }
                }
            }
        }

        /* renamed from: g  reason: contains not printable characters */
        private int m۱۴۸۷۱g(int position) {
            if (this.f۱۱۸۲۴b == null) {
                return -1;
            }
            Ca item = m۱۴۸۸۰c(position);
            if (item != null) {
                this.f۱۱۸۲۴b.remove(item);
            }
            int nextFsiIndex = -1;
            int count = this.f۱۱۸۲۴b.size();
            int i = 0;
            while (true) {
                if (i >= count) {
                    break;
                } else if (this.f۱۱۸۲۴b.get(i).f۱۱۸۲۵c >= position) {
                    nextFsiIndex = i;
                    break;
                } else {
                    i++;
                }
            }
            if (nextFsiIndex == -1) {
                return -1;
            }
            this.f۱۱۸۲۴b.remove(nextFsiIndex);
            return this.f۱۱۸۲۴b.get(nextFsiIndex).f۱۱۸۲۵c;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۸۷۷a(Ca fullSpanItem) {
            if (this.f۱۱۸۲۴b == null) {
                this.f۱۱۸۲۴b = new ArrayList();
            }
            int size = this.f۱۱۸۲۴b.size();
            for (int i = 0; i < size; i++) {
                Ca other = this.f۱۱۸۲۴b.get(i);
                if (other.f۱۱۸۲۵c == fullSpanItem.f۱۱۸۲۵c) {
                    this.f۱۱۸۲۴b.remove(i);
                }
                if (other.f۱۱۸۲۵c >= fullSpanItem.f۱۱۸۲۵c) {
                    this.f۱۱۸۲۴b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f۱۱۸۲۴b.add(fullSpanItem);
        }

        /* renamed from: c  reason: contains not printable characters */
        public Ca m۱۴۸۸۰c(int position) {
            List<Ca> list = this.f۱۱۸۲۴b;
            if (list == null) {
                return null;
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                Ca fsi = this.f۱۱۸۲۴b.get(i);
                if (fsi.f۱۱۸۲۵c == position) {
                    return fsi;
                }
            }
            return null;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۴۸۷۲a(int minPos, int maxPos, int gapDir, boolean hasUnwantedGapAfter) {
            List<Ca> list = this.f۱۱۸۲۴b;
            if (list == null) {
                return null;
            }
            int limit = list.size();
            for (int i = 0; i < limit; i++) {
                Ca fsi = this.f۱۱۸۲۴b.get(i);
                int i2 = fsi.f۱۱۸۲۵c;
                if (i2 >= maxPos) {
                    return null;
                }
                if (i2 >= minPos && (gapDir == 0 || fsi.f۱۱۸۲۶d == gapDir || (hasUnwantedGapAfter && fsi.f۱۱۸۲۸f))) {
                    return fsi;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$d$a  reason: invalid class name */
        public static class Ca implements Parcelable {
            public static final Parcelable.Creator<Ca> CREATOR = new Ca();

            /* renamed from: c  reason: contains not printable characters */
            int f۱۱۸۲۵c;

            /* renamed from: d  reason: contains not printable characters */
            int f۱۱۸۲۶d;

            /* renamed from: e  reason: contains not printable characters */
            int[] f۱۱۸۲۷e;

            /* renamed from: f  reason: contains not printable characters */
            boolean f۱۱۸۲۸f;

            Ca(Parcel in) {
                this.f۱۱۸۲۵c = in.readInt();
                this.f۱۱۸۲۶d = in.readInt();
                this.f۱۱۸۲۸f = in.readInt() != 1 ? false : true;
                int spanCount = in.readInt();
                if (spanCount > 0) {
                    this.f۱۱۸۲۷e = new int[spanCount];
                    in.readIntArray(this.f۱۱۸۲۷e);
                }
            }

            Ca() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a  reason: contains not printable characters */
            public int m۱۴۸۸۴a(int spanIndex) {
                int[] iArr = this.f۱۱۸۲۷e;
                if (iArr == null) {
                    return 0;
                }
                return iArr[spanIndex];
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.f۱۱۸۲۵c);
                dest.writeInt(this.f۱۱۸۲۶d);
                dest.writeInt(this.f۱۱۸۲۸f ? 1 : 0);
                int[] iArr = this.f۱۱۸۲۷e;
                if (iArr == null || iArr.length <= 0) {
                    dest.writeInt(0);
                    return;
                }
                dest.writeInt(iArr.length);
                dest.writeIntArray(this.f۱۱۸۲۷e);
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f۱۱۸۲۵c + ", mGapDir=" + this.f۱۱۸۲۶d + ", mHasUnwantedGapAfter=" + this.f۱۱۸۲۸f + ", mGapPerSpan=" + Arrays.toString(this.f۱۱۸۲۷e) + '}';
            }

            /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$d$a$a  reason: invalid class name */
            static class Ca implements Parcelable.Creator<Ca> {
                Ca() {
                }

                @Override // android.os.Parcelable.Creator
                public Ca createFromParcel(Parcel in) {
                    return new Ca(in);
                }

                @Override // android.os.Parcelable.Creator
                public Ca[] newArray(int size) {
                    return new Ca[size];
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$e  reason: invalid class name */
    public static class Ce implements Parcelable {
        public static final Parcelable.Creator<Ce> CREATOR = new Ca();

        /* renamed from: c  reason: contains not printable characters */
        int f۱۱۸۲۹c;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۱۸۳۰d;

        /* renamed from: e  reason: contains not printable characters */
        int f۱۱۸۳۱e;

        /* renamed from: f  reason: contains not printable characters */
        int[] f۱۱۸۳۲f;

        /* renamed from: g  reason: contains not printable characters */
        int f۱۱۸۳۳g;

        /* renamed from: h  reason: contains not printable characters */
        int[] f۱۱۸۳۴h;

        /* renamed from: i  reason: contains not printable characters */
        List<Cd.Ca> f۱۱۸۳۵i;

        /* renamed from: j  reason: contains not printable characters */
        boolean f۱۱۸۳۶j;

        /* renamed from: k  reason: contains not printable characters */
        boolean f۱۱۸۳۷k;

        /* renamed from: l  reason: contains not printable characters */
        boolean f۱۱۸۳۸l;

        public Ce() {
        }

        Ce(Parcel in) {
            this.f۱۱۸۲۹c = in.readInt();
            this.f۱۱۸۳۰d = in.readInt();
            this.f۱۱۸۳۱e = in.readInt();
            int i = this.f۱۱۸۳۱e;
            if (i > 0) {
                this.f۱۱۸۳۲f = new int[i];
                in.readIntArray(this.f۱۱۸۳۲f);
            }
            this.f۱۱۸۳۳g = in.readInt();
            int i2 = this.f۱۱۸۳۳g;
            if (i2 > 0) {
                this.f۱۱۸۳۴h = new int[i2];
                in.readIntArray(this.f۱۱۸۳۴h);
            }
            boolean z = false;
            this.f۱۱۸۳۶j = in.readInt() == 1;
            this.f۱۱۸۳۷k = in.readInt() == 1;
            this.f۱۱۸۳۸l = in.readInt() == 1 ? true : z;
            this.f۱۱۸۳۵i = in.readArrayList(Cd.Ca.class.getClassLoader());
        }

        public Ce(Ce other) {
            this.f۱۱۸۳۱e = other.f۱۱۸۳۱e;
            this.f۱۱۸۲۹c = other.f۱۱۸۲۹c;
            this.f۱۱۸۳۰d = other.f۱۱۸۳۰d;
            this.f۱۱۸۳۲f = other.f۱۱۸۳۲f;
            this.f۱۱۸۳۳g = other.f۱۱۸۳۳g;
            this.f۱۱۸۳۴h = other.f۱۱۸۳۴h;
            this.f۱۱۸۳۶j = other.f۱۱۸۳۶j;
            this.f۱۱۸۳۷k = other.f۱۱۸۳۷k;
            this.f۱۱۸۳۸l = other.f۱۱۸۳۸l;
            this.f۱۱۸۳۵i = other.f۱۱۸۳۵i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۸۸۶b() {
            this.f۱۱۸۳۲f = null;
            this.f۱۱۸۳۱e = 0;
            this.f۱۱۸۳۳g = 0;
            this.f۱۱۸۳۴h = null;
            this.f۱۱۸۳۵i = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۸۸۵a() {
            this.f۱۱۸۳۲f = null;
            this.f۱۱۸۳۱e = 0;
            this.f۱۱۸۲۹c = -1;
            this.f۱۱۸۳۰d = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f۱۱۸۲۹c);
            dest.writeInt(this.f۱۱۸۳۰d);
            dest.writeInt(this.f۱۱۸۳۱e);
            if (this.f۱۱۸۳۱e > 0) {
                dest.writeIntArray(this.f۱۱۸۳۲f);
            }
            dest.writeInt(this.f۱۱۸۳۳g);
            if (this.f۱۱۸۳۳g > 0) {
                dest.writeIntArray(this.f۱۱۸۳۴h);
            }
            dest.writeInt(this.f۱۱۸۳۶j ? 1 : 0);
            dest.writeInt(this.f۱۱۸۳۷k ? 1 : 0);
            dest.writeInt(this.f۱۱۸۳۸l ? 1 : 0);
            dest.writeList(this.f۱۱۸۳۵i);
        }

        /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$e$a  reason: invalid class name */
        static class Ca implements Parcelable.Creator<Ce> {
            Ca() {
            }

            @Override // android.os.Parcelable.Creator
            public Ce createFromParcel(Parcel in) {
                return new Ce(in);
            }

            @Override // android.os.Parcelable.Creator
            public Ce[] newArray(int size) {
                return new Ce[size];
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$b  reason: invalid class name */
    public class Cb {

        /* renamed from: a  reason: contains not printable characters */
        int f۱۱۸۱۴a;

        /* renamed from: b  reason: contains not printable characters */
        int f۱۱۸۱۵b;

        /* renamed from: c  reason: contains not printable characters */
        boolean f۱۱۸۱۶c;

        /* renamed from: d  reason: contains not printable characters */
        boolean f۱۱۸۱۷d;

        /* renamed from: e  reason: contains not printable characters */
        boolean f۱۱۸۱۸e;

        /* renamed from: f  reason: contains not printable characters */
        int[] f۱۱۸۱۹f;

        Cb() {
            m۱۴۸۶۶b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۸۶۶b() {
            this.f۱۱۸۱۴a = -1;
            this.f۱۱۸۱۵b = Integer.MIN_VALUE;
            this.f۱۱۸۱۶c = false;
            this.f۱۱۸۱۷d = false;
            this.f۱۱۸۱۸e = false;
            int[] iArr = this.f۱۱۸۱۹f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۸۶۵a(Cf[] spans) {
            int spanCount = spans.length;
            int[] iArr = this.f۱۱۸۱۹f;
            if (iArr == null || iArr.length < spanCount) {
                this.f۱۱۸۱۹f = new int[StaggeredGridLayoutManager.this.f۱۱۸۰۶t.length];
            }
            for (int i = 0; i < spanCount; i++) {
                this.f۱۱۸۱۹f[i] = spans[i].m۱۴۸۹۴b(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۸۶۳a() {
            int i;
            if (this.f۱۱۸۱۶c) {
                i = StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۸۴b();
            } else {
                i = StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۹۲f();
            }
            this.f۱۱۸۱۵b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۸۶۴a(int addedDistance) {
            if (this.f۱۱۸۱۶c) {
                this.f۱۱۸۱۵b = StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۸۴b() - addedDistance;
            } else {
                this.f۱۱۸۱۵b = StaggeredGridLayoutManager.this.f۱۱۸۰۷u.m۱۵۵۹۲f() + addedDistance;
            }
        }
    }
}
