package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.support.p۰۴۷v7.widget.p۰۴۸t1.AbstractCa;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.widget.LinearLayoutManager */
public class LinearLayoutManager extends RecyclerView.AbstractCo implements AbstractCa, RecyclerView.AbstractCz.AbstractCa {

    /* renamed from: A  reason: contains not printable characters */
    int f۱۱۴۸۶A;

    /* renamed from: B  reason: contains not printable characters */
    int f۱۱۴۸۷B;

    /* renamed from: C  reason: contains not printable characters */
    private boolean f۱۱۴۸۸C;

    /* renamed from: D  reason: contains not printable characters */
    Cd f۱۱۴۸۹D;

    /* renamed from: E  reason: contains not printable characters */
    final Ca f۱۱۴۹۰E;

    /* renamed from: F  reason: contains not printable characters */
    private final Cb f۱۱۴۹۱F;

    /* renamed from: G  reason: contains not printable characters */
    private int f۱۱۴۹۲G;

    /* renamed from: s  reason: contains not printable characters */
    int f۱۱۴۹۳s;

    /* renamed from: t  reason: contains not printable characters */
    private Cc f۱۱۴۹۴t;

    /* renamed from: u  reason: contains not printable characters */
    AbstractCt0 f۱۱۴۹۵u;

    /* renamed from: v  reason: contains not printable characters */
    private boolean f۱۱۴۹۶v;

    /* renamed from: w  reason: contains not printable characters */
    private boolean f۱۱۴۹۷w;

    /* renamed from: x  reason: contains not printable characters */
    boolean f۱۱۴۹۸x;

    /* renamed from: y  reason: contains not printable characters */
    private boolean f۱۱۴۹۹y;

    /* renamed from: z  reason: contains not printable characters */
    private boolean f۱۱۵۰۰z;

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int orientation, boolean reverseLayout) {
        this.f۱۱۴۹۳s = 1;
        this.f۱۱۴۹۷w = false;
        this.f۱۱۴۹۸x = false;
        this.f۱۱۴۹۹y = false;
        this.f۱۱۵۰۰z = true;
        this.f۱۱۴۸۶A = -1;
        this.f۱۱۴۸۷B = Integer.MIN_VALUE;
        this.f۱۱۴۸۹D = null;
        this.f۱۱۴۹۰E = new Ca();
        this.f۱۱۴۹۱F = new Cb();
        this.f۱۱۴۹۲G = 2;
        m۱۴۲۱۵j(orientation);
        m۱۴۱۹۵a(reverseLayout);
    }

    public LinearLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f۱۱۴۹۳s = 1;
        this.f۱۱۴۹۷w = false;
        this.f۱۱۴۹۸x = false;
        this.f۱۱۴۹۹y = false;
        this.f۱۱۵۰۰z = true;
        this.f۱۱۴۸۶A = -1;
        this.f۱۱۴۸۷B = Integer.MIN_VALUE;
        this.f۱۱۴۸۹D = null;
        this.f۱۱۴۹۰E = new Ca();
        this.f۱۱۴۹۱F = new Cb();
        this.f۱۱۴۹۲G = 2;
        RecyclerView.AbstractCo.Cd properties = RecyclerView.AbstractCo.m۱۴۴۹۶a(context, attrs, defStyleAttr, defStyleRes);
        m۱۴۲۱۵j(properties.f۱۱۶۸۸a);
        m۱۴۱۹۵a(properties.f۱۱۶۹۰c);
        m۱۴۲۰۱b(properties.f۱۱۶۹۱d);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: u  reason: contains not printable characters */
    public boolean m۱۴۲۱۶u() {
        return true;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: c  reason: contains not printable characters */
    public RecyclerView.Cp m۱۴۲۰۵c() {
        return new RecyclerView.Cp(-2, -2);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۲۰۰b(RecyclerView view, RecyclerView.Cv recycler) {
        super.m۱۴۵۶۴b(view, recycler);
        if (this.f۱۱۴۸۸C) {
            m۱۴۵۶۱b(recycler);
            recycler.m۱۴۶۷۴a();
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۹۳a(AccessibilityEvent event) {
        super.m۱۴۵۴۰a(event);
        if (m۱۴۵۸۸e() > 0) {
            event.setFromIndex(m۱۴۱۷۶F());
            event.setToIndex(m۱۴۱۷۷G());
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: x  reason: contains not printable characters */
    public Parcelable m۱۴۲۱۷x() {
        Cd dVar = this.f۱۱۴۸۹D;
        if (dVar != null) {
            return new Cd(dVar);
        }
        Cd state = new Cd();
        if (m۱۴۵۸۸e() > 0) {
            m۱۴۱۷۵E();
            boolean didLayoutFromEnd = this.f۱۱۴۹۶v ^ this.f۱۱۴۹۸x;
            state.f۱۱۵۲۴e = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = m۱۴۱۴۱K();
                state.f۱۱۵۲۳d = this.f۱۱۴۹۵u.m۱۵۵۸۴b() - this.f۱۱۴۹۵u.m۱۵۵۸۲a(refChild);
                state.f۱۱۵۲۲c = m۱۴۶۱۳l(refChild);
            } else {
                View refChild2 = m۱۴۱۴۲L();
                state.f۱۱۵۲۲c = m۱۴۶۱۳l(refChild2);
                state.f۱۱۵۲۳d = this.f۱۱۴۹۵u.m۱۵۵۸۹d(refChild2) - this.f۱۱۴۹۵u.m۱۵۵۹۲f();
            }
        } else {
            state.m۱۴۲۳۱b();
        }
        return state;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۸۹a(Parcelable state) {
        if (state instanceof Cd) {
            this.f۱۱۴۸۹D = (Cd) state;
            m۱۴۶۲۹y();
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۱۹۶a() {
        return this.f۱۱۴۹۳s == 0;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۴۲۰۲b() {
        return this.f۱۱۴۹۳s == 1;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۲۰۱b(boolean stackFromEnd) {
        m۱۴۱۹۴a((String) null);
        if (this.f۱۱۴۹۹y != stackFromEnd) {
            this.f۱۱۴۹۹y = stackFromEnd;
            m۱۴۶۲۹y();
        }
    }

    /* renamed from: H  reason: contains not printable characters */
    public int m۱۴۱۷۸H() {
        return this.f۱۱۴۹۳s;
    }

    /* renamed from: j  reason: contains not printable characters */
    public void m۱۴۲۱۵j(int orientation) {
        if (orientation == 0 || orientation == 1) {
            m۱۴۱۹۴a((String) null);
            if (orientation != this.f۱۱۴۹۳s || this.f۱۱۴۹۵u == null) {
                this.f۱۱۴۹۵u = AbstractCt0.m۱۵۵۷۹a(this, orientation);
                this.f۱۱۴۹۰E.f۱۱۵۰۱a = this.f۱۱۴۹۵u;
                this.f۱۱۴۹۳s = orientation;
                m۱۴۶۲۹y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + orientation);
    }

    /* renamed from: M  reason: contains not printable characters */
    private void m۱۴۱۴۳M() {
        if (this.f۱۱۴۹۳s == 1 || !m۱۴۱۷۹I()) {
            this.f۱۱۴۹۸x = this.f۱۱۴۹۷w;
        } else {
            this.f۱۱۴۹۸x = !this.f۱۱۴۹۷w;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۹۵a(boolean reverseLayout) {
        m۱۴۱۹۴a((String) null);
        if (reverseLayout != this.f۱۱۴۹۷w) {
            this.f۱۱۴۹۷w = reverseLayout;
            m۱۴۶۲۹y();
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public View m۱۴۱۹۹b(int position) {
        int childCount = m۱۴۵۸۸e();
        if (childCount == 0) {
            return null;
        }
        int viewPosition = position - m۱۴۶۱۳l(m۱۴۵۷۳c(0));
        if (viewPosition >= 0 && viewPosition < childCount) {
            View child = m۱۴۵۷۳c(viewPosition);
            if (m۱۴۶۱۳l(child) == position) {
                return child;
            }
        }
        return super.m۱۴۵۵۹b(position);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h  reason: contains not printable characters */
    public int m۱۴۲۱۲h(RecyclerView.Ca0 state) {
        if (state.m۱۴۳۵۷c()) {
            return this.f۱۱۴۹۵u.m۱۵۵۹۴g();
        }
        return 0;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۴۲۰۹e(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        int extraForStart;
        int extraForEnd;
        int endOffset;
        int firstElement;
        int i;
        View existing;
        int upcomingOffset;
        int firstLayoutDirection = -1;
        if (!(this.f۱۱۴۸۹D == null && this.f۱۱۴۸۶A == -1) && state.m۱۴۳۵۳a() == 0) {
            m۱۴۵۶۱b(recycler);
            return;
        }
        Cd dVar = this.f۱۱۴۸۹D;
        if (dVar != null && dVar.m۱۴۲۳۰a()) {
            this.f۱۱۴۸۶A = this.f۱۱۴۸۹D.f۱۱۵۲۲c;
        }
        m۱۴۱۷۵E();
        this.f۱۱۴۹۴t.f۱۱۵۱۰a = false;
        m۱۴۱۴۳M();
        View focused = m۱۴۶۰۰g();
        if (!this.f۱۱۴۹۰E.f۱۱۵۰۵e || this.f۱۱۴۸۶A != -1 || this.f۱۱۴۸۹D != null) {
            this.f۱۱۴۹۰E.m۱۴۲۲۱b();
            Ca aVar = this.f۱۱۴۹۰E;
            aVar.f۱۱۵۰۴d = this.f۱۱۴۹۸x ^ this.f۱۱۴۹۹y;
            m۱۴۱۵۸b(recycler, state, aVar);
            this.f۱۱۴۹۰E.f۱۱۵۰۵e = true;
        } else if (focused != null && (this.f۱۱۴۹۵u.m۱۵۵۸۹d(focused) >= this.f۱۱۴۹۵u.m۱۵۵۸۴b() || this.f۱۱۴۹۵u.m۱۵۵۸۲a(focused) <= this.f۱۱۴۹۵u.m۱۵۵۹۲f())) {
            this.f۱۱۴۹۰E.m۱۴۲۲۲b(focused, m۱۴۶۱۳l(focused));
        }
        int extra = m۱۴۲۱۲h(state);
        if (this.f۱۱۴۹۴t.f۱۱۵۱۹j >= 0) {
            extraForEnd = extra;
            extraForStart = 0;
        } else {
            extraForStart = extra;
            extraForEnd = 0;
        }
        int extraForStart2 = extraForStart + this.f۱۱۴۹۵u.m۱۵۵۹۲f();
        int extraForEnd2 = extraForEnd + this.f۱۱۴۹۵u.m۱۵۵۸۶c();
        if (!(!state.m۱۴۳۵۸d() || (i = this.f۱۱۴۸۶A) == -1 || this.f۱۱۴۸۷B == Integer.MIN_VALUE || (existing = m۱۴۱۹۹b(i)) == null)) {
            if (this.f۱۱۴۹۸x) {
                upcomingOffset = (this.f۱۱۴۹۵u.m۱۵۵۸۴b() - this.f۱۱۴۹۵u.m۱۵۵۸۲a(existing)) - this.f۱۱۴۸۷B;
            } else {
                upcomingOffset = this.f۱۱۴۸۷B - (this.f۱۱۴۹۵u.m۱۵۵۸۹d(existing) - this.f۱۱۴۹۵u.m۱۵۵۹۲f());
            }
            if (upcomingOffset > 0) {
                extraForStart2 += upcomingOffset;
            } else {
                extraForEnd2 -= upcomingOffset;
            }
        }
        if (this.f۱۱۴۹۰E.f۱۱۵۰۴d) {
            if (this.f۱۱۴۹۸x) {
                firstLayoutDirection = 1;
            }
        } else if (!this.f۱۱۴۹۸x) {
            firstLayoutDirection = 1;
        }
        m۱۴۱۹۱a(recycler, state, this.f۱۱۴۹۰E, firstLayoutDirection);
        m۱۴۵۲۱a(recycler);
        this.f۱۱۴۹۴t.f۱۱۵۲۱l = m۱۴۱۸۰J();
        this.f۱۱۴۹۴t.f۱۱۵۱۸i = state.m۱۴۳۵۸d();
        Ca aVar2 = this.f۱۱۴۹۰E;
        if (aVar2.f۱۱۵۰۴d) {
            m۱۴۱۵۵b(aVar2);
            Cc cVar = this.f۱۱۴۹۴t;
            cVar.f۱۱۵۱۷h = extraForStart2;
            m۱۴۱۸۳a(recycler, cVar, state, false);
            Cc cVar2 = this.f۱۱۴۹۴t;
            int startOffset = cVar2.f۱۱۵۱۱b;
            int firstElement2 = cVar2.f۱۱۵۱۳d;
            int i2 = cVar2.f۱۱۵۱۲c;
            if (i2 > 0) {
                extraForEnd2 += i2;
            }
            m۱۴۱۴۷a(this.f۱۱۴۹۰E);
            Cc cVar3 = this.f۱۱۴۹۴t;
            cVar3.f۱۱۵۱۷h = extraForEnd2;
            cVar3.f۱۱۵۱۳d += cVar3.f۱۱۵۱۴e;
            m۱۴۱۸۳a(recycler, cVar3, state, false);
            Cc cVar4 = this.f۱۱۴۹۴t;
            endOffset = cVar4.f۱۱۵۱۱b;
            if (cVar4.f۱۱۵۱۲c > 0) {
                int extraForStart3 = cVar4.f۱۱۵۱۲c;
                m۱۴۱۶۲g(firstElement2, startOffset);
                Cc cVar5 = this.f۱۱۴۹۴t;
                cVar5.f۱۱۵۱۷h = extraForStart3;
                m۱۴۱۸۳a(recycler, cVar5, state, false);
                startOffset = this.f۱۱۴۹۴t.f۱۱۵۱۱b;
            }
            firstElement = startOffset;
        } else {
            m۱۴۱۴۷a(aVar2);
            Cc cVar6 = this.f۱۱۴۹۴t;
            cVar6.f۱۱۵۱۷h = extraForEnd2;
            m۱۴۱۸۳a(recycler, cVar6, state, false);
            Cc cVar7 = this.f۱۱۴۹۴t;
            endOffset = cVar7.f۱۱۵۱۱b;
            int lastElement = cVar7.f۱۱۵۱۳d;
            int i3 = cVar7.f۱۱۵۱۲c;
            if (i3 > 0) {
                extraForStart2 += i3;
            }
            m۱۴۱۵۵b(this.f۱۱۴۹۰E);
            Cc cVar8 = this.f۱۱۴۹۴t;
            cVar8.f۱۱۵۱۷h = extraForStart2;
            cVar8.f۱۱۵۱۳d += cVar8.f۱۱۵۱۴e;
            m۱۴۱۸۳a(recycler, cVar8, state, false);
            Cc cVar9 = this.f۱۱۴۹۴t;
            firstElement = cVar9.f۱۱۵۱۱b;
            if (cVar9.f۱۱۵۱۲c > 0) {
                int extraForEnd3 = cVar9.f۱۱۵۱۲c;
                m۱۴۱۶۰f(lastElement, endOffset);
                Cc cVar10 = this.f۱۱۴۹۴t;
                cVar10.f۱۱۵۱۷h = extraForEnd3;
                m۱۴۱۸۳a(recycler, cVar10, state, false);
                endOffset = this.f۱۱۴۹۴t.f۱۱۵۱۱b;
            }
        }
        if (m۱۴۵۸۸e() > 0) {
            if (this.f۱۱۴۹۸x ^ this.f۱۱۴۹۹y) {
                int fixOffset = m۱۴۱۴۴a(endOffset, recycler, state, true);
                int startOffset2 = firstElement + fixOffset;
                int fixOffset2 = m۱۴۱۵۳b(startOffset2, recycler, state, false);
                firstElement = startOffset2 + fixOffset2;
                endOffset = endOffset + fixOffset + fixOffset2;
            } else {
                int fixOffset3 = m۱۴۱۵۳b(firstElement, recycler, state, true);
                int endOffset2 = endOffset + fixOffset3;
                int fixOffset4 = m۱۴۱۴۴a(endOffset2, recycler, state, false);
                firstElement = firstElement + fixOffset3 + fixOffset4;
                endOffset = endOffset2 + fixOffset4;
            }
        }
        m۱۴۱۵۷b(recycler, state, firstElement, endOffset);
        if (!state.m۱۴۳۵۸d()) {
            this.f۱۱۴۹۵u.m۱۵۵۹۶i();
        } else {
            this.f۱۱۴۹۰E.m۱۴۲۲۱b();
        }
        this.f۱۱۴۹۶v = this.f۱۱۴۹۹y;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۴۲۱۱g(RecyclerView.Ca0 state) {
        super.m۱۴۶۰۲g(state);
        this.f۱۱۴۸۹D = null;
        this.f۱۱۴۸۶A = -1;
        this.f۱۱۴۸۷B = Integer.MIN_VALUE;
        this.f۱۱۴۹۰E.m۱۴۲۲۱b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۹۱a(RecyclerView.Cv recycler, RecyclerView.Ca0 state, Ca anchorInfo, int firstLayoutItemDirection) {
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۴۱۵۷b(RecyclerView.Cv recycler, RecyclerView.Ca0 state, int startOffset, int endOffset) {
        if (!(!state.m۱۴۳۵۹e() || m۱۴۵۸۸e() == 0 || state.m۱۴۳۵۸d())) {
            if (m۱۴۱۷۳C()) {
                int scrapExtraStart = 0;
                int scrapExtraEnd = 0;
                List<RecyclerView.ViewHolder> scrapList = recycler.m۱۴۶۹۹f();
                int scrapSize = scrapList.size();
                int firstChildPos = m۱۴۶۱۳l(m۱۴۵۷۳c(0));
                for (int i = 0; i < scrapSize; i++) {
                    RecyclerView.AbstractCd0 scrap = (RecyclerView.AbstractCd0) scrapList.get(i);
                    if (!scrap.m۱۴۴۰۰p()) {
                        int direction = 1;
                        if ((scrap.m۱۴۳۹۳i() < firstChildPos) != this.f۱۱۴۹۸x) {
                            direction = -1;
                        }
                        if (direction == -1) {
                            scrapExtraStart += this.f۱۱۴۹۵u.m۱۵۵۸۵b(scrap.f۱۱۶۳۷c);
                        } else {
                            scrapExtraEnd += this.f۱۱۴۹۵u.m۱۵۵۸۵b(scrap.f۱۱۶۳۷c);
                        }
                    }
                }
                this.f۱۱۴۹۴t.f۱۱۵۲۰k = scrapList;
                if (scrapExtraStart > 0) {
                    m۱۴۱۶۲g(m۱۴۶۱۳l(m۱۴۱۴۲L()), startOffset);
                    Cc cVar = this.f۱۱۴۹۴t;
                    cVar.f۱۱۵۱۷h = scrapExtraStart;
                    cVar.f۱۱۵۱۲c = 0;
                    cVar.m۱۴۲۲۶a();
                    m۱۴۱۸۳a(recycler, this.f۱۱۴۹۴t, state, false);
                }
                if (scrapExtraEnd > 0) {
                    m۱۴۱۶۰f(m۱۴۶۱۳l(m۱۴۱۴۱K()), endOffset);
                    Cc cVar2 = this.f۱۱۴۹۴t;
                    cVar2.f۱۱۵۱۷h = scrapExtraEnd;
                    cVar2.f۱۱۵۱۲c = 0;
                    cVar2.m۱۴۲۲۶a();
                    m۱۴۱۸۳a(recycler, this.f۱۱۴۹۴t, state, false);
                }
                this.f۱۱۴۹۴t.f۱۱۵۲۰k = null;
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۴۱۵۸b(RecyclerView.Cv recycler, RecyclerView.Ca0 state, Ca anchorInfo) {
        if (!m۱۴۱۵۱a(state, anchorInfo) && !m۱۴۱۵۲a(recycler, state, anchorInfo)) {
            anchorInfo.m۱۴۲۱۸a();
            anchorInfo.f۱۱۵۰۲b = this.f۱۱۴۹۹y ? state.m۱۴۳۵۳a() - 1 : 0;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۴۱۵۲a(RecyclerView.Cv recycler, RecyclerView.Ca0 state, Ca anchorInfo) {
        View referenceChild;
        int i;
        boolean notVisible = false;
        if (m۱۴۵۸۸e() == 0) {
            return false;
        }
        View focused = m۱۴۶۰۰g();
        if (focused != null && anchorInfo.m۱۴۲۲۰a(focused, state)) {
            anchorInfo.m۱۴۲۲۲b(focused, m۱۴۶۱۳l(focused));
            return true;
        } else if (this.f۱۱۴۹۶v != this.f۱۱۴۹۹y) {
            return false;
        } else {
            if (anchorInfo.f۱۱۵۰۴d) {
                referenceChild = m۱۴۱۷۰l(recycler, state);
            } else {
                referenceChild = m۱۴۱۷۱m(recycler, state);
            }
            if (referenceChild == null) {
                return false;
            }
            anchorInfo.m۱۴۲۱۹a(referenceChild, m۱۴۶۱۳l(referenceChild));
            if (!state.m۱۴۳۵۸d() && m۱۴۱۷۳C()) {
                if (this.f۱۱۴۹۵u.m۱۵۵۸۹d(referenceChild) >= this.f۱۱۴۹۵u.m۱۵۵۸۴b() || this.f۱۱۴۹۵u.m۱۵۵۸۲a(referenceChild) < this.f۱۱۴۹۵u.m۱۵۵۹۲f()) {
                    notVisible = true;
                }
                if (notVisible) {
                    if (anchorInfo.f۱۱۵۰۴d) {
                        i = this.f۱۱۴۹۵u.m۱۵۵۸۴b();
                    } else {
                        i = this.f۱۱۴۹۵u.m۱۵۵۹۲f();
                    }
                    anchorInfo.f۱۱۵۰۳c = i;
                }
            }
            return true;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۴۱۵۱a(RecyclerView.Ca0 state, Ca anchorInfo) {
        int i;
        int i2;
        boolean z = false;
        if (state.m۱۴۳۵۸d() || (i = this.f۱۱۴۸۶A) == -1) {
            return false;
        }
        if (i < 0 || i >= state.m۱۴۳۵۳a()) {
            this.f۱۱۴۸۶A = -1;
            this.f۱۱۴۸۷B = Integer.MIN_VALUE;
            return false;
        }
        anchorInfo.f۱۱۵۰۲b = this.f۱۱۴۸۶A;
        Cd dVar = this.f۱۱۴۸۹D;
        if (dVar != null && dVar.m۱۴۲۳۰a()) {
            anchorInfo.f۱۱۵۰۴d = this.f۱۱۴۸۹D.f۱۱۵۲۴e;
            if (anchorInfo.f۱۱۵۰۴d) {
                anchorInfo.f۱۱۵۰۳c = this.f۱۱۴۹۵u.m۱۵۵۸۴b() - this.f۱۱۴۸۹D.f۱۱۵۲۳d;
            } else {
                anchorInfo.f۱۱۵۰۳c = this.f۱۱۴۹۵u.m۱۵۵۹۲f() + this.f۱۱۴۸۹D.f۱۱۵۲۳d;
            }
            return true;
        } else if (this.f۱۱۴۸۷B == Integer.MIN_VALUE) {
            View child = m۱۴۱۹۹b(this.f۱۱۴۸۶A);
            if (child == null) {
                if (m۱۴۵۸۸e() > 0) {
                    if ((this.f۱۱۴۸۶A < m۱۴۶۱۳l(m۱۴۵۷۳c(0))) == this.f۱۱۴۹۸x) {
                        z = true;
                    }
                    anchorInfo.f۱۱۵۰۴d = z;
                }
                anchorInfo.m۱۴۲۱۸a();
            } else if (this.f۱۱۴۹۵u.m۱۵۵۸۵b(child) > this.f۱۱۴۹۵u.m۱۵۵۹۴g()) {
                anchorInfo.m۱۴۲۱۸a();
                return true;
            } else if (this.f۱۱۴۹۵u.m۱۵۵۸۹d(child) - this.f۱۱۴۹۵u.m۱۵۵۹۲f() < 0) {
                anchorInfo.f۱۱۵۰۳c = this.f۱۱۴۹۵u.m۱۵۵۹۲f();
                anchorInfo.f۱۱۵۰۴d = false;
                return true;
            } else if (this.f۱۱۴۹۵u.m۱۵۵۸۴b() - this.f۱۱۴۹۵u.m۱۵۵۸۲a(child) < 0) {
                anchorInfo.f۱۱۵۰۳c = this.f۱۱۴۹۵u.m۱۵۵۸۴b();
                anchorInfo.f۱۱۵۰۴d = true;
                return true;
            } else {
                if (anchorInfo.f۱۱۵۰۴d) {
                    i2 = this.f۱۱۴۹۵u.m۱۵۵۸۲a(child) + this.f۱۱۴۹۵u.m۱۵۵۹۵h();
                } else {
                    i2 = this.f۱۱۴۹۵u.m۱۵۵۸۹d(child);
                }
                anchorInfo.f۱۱۵۰۳c = i2;
            }
            return true;
        } else {
            boolean z2 = this.f۱۱۴۹۸x;
            anchorInfo.f۱۱۵۰۴d = z2;
            if (z2) {
                anchorInfo.f۱۱۵۰۳c = this.f۱۱۴۹۵u.m۱۵۵۸۴b() - this.f۱۱۴۸۷B;
            } else {
                anchorInfo.f۱۱۵۰۳c = this.f۱۱۴۹۵u.m۱۵۵۹۲f() + this.f۱۱۴۸۷B;
            }
            return true;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۴۱۴۴a(int endOffset, RecyclerView.Cv recycler, RecyclerView.Ca0 state, boolean canOffsetChildren) {
        int gap;
        int gap2 = this.f۱۱۴۹۵u.m۱۵۵۸۴b() - endOffset;
        if (gap2 <= 0) {
            return 0;
        }
        int fixOffset = -m۱۴۲۰۳c(-gap2, recycler, state);
        int endOffset2 = endOffset + fixOffset;
        if (!canOffsetChildren || (gap = this.f۱۱۴۹۵u.m۱۵۵۸۴b() - endOffset2) <= 0) {
            return fixOffset;
        }
        this.f۱۱۴۹۵u.m۱۵۵۸۳a(gap);
        return gap + fixOffset;
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۴۱۵۳b(int startOffset, RecyclerView.Cv recycler, RecyclerView.Ca0 state, boolean canOffsetChildren) {
        int gap;
        int gap2 = startOffset - this.f۱۱۴۹۵u.m۱۵۵۹۲f();
        if (gap2 <= 0) {
            return 0;
        }
        int fixOffset = -m۱۴۲۰۳c(gap2, recycler, state);
        int startOffset2 = startOffset + fixOffset;
        if (!canOffsetChildren || (gap = startOffset2 - this.f۱۱۴۹۵u.m۱۵۵۹۲f()) <= 0) {
            return fixOffset;
        }
        this.f۱۱۴۹۵u.m۱۵۵۸۳a(-gap);
        return fixOffset - gap;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۱۴۷a(Ca anchorInfo) {
        m۱۴۱۶۰f(anchorInfo.f۱۱۵۰۲b, anchorInfo.f۱۱۵۰۳c);
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۴۱۶۰f(int itemPosition, int offset) {
        this.f۱۱۴۹۴t.f۱۱۵۱۲c = this.f۱۱۴۹۵u.m۱۵۵۸۴b() - offset;
        this.f۱۱۴۹۴t.f۱۱۵۱۴e = this.f۱۱۴۹۸x ? -1 : 1;
        Cc cVar = this.f۱۱۴۹۴t;
        cVar.f۱۱۵۱۳d = itemPosition;
        cVar.f۱۱۵۱۵f = 1;
        cVar.f۱۱۵۱۱b = offset;
        cVar.f۱۱۵۱۶g = Integer.MIN_VALUE;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۴۱۵۵b(Ca anchorInfo) {
        m۱۴۱۶۲g(anchorInfo.f۱۱۵۰۲b, anchorInfo.f۱۱۵۰۳c);
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۴۱۶۲g(int itemPosition, int offset) {
        this.f۱۱۴۹۴t.f۱۱۵۱۲c = offset - this.f۱۱۴۹۵u.m۱۵۵۹۲f();
        Cc cVar = this.f۱۱۴۹۴t;
        cVar.f۱۱۵۱۳d = itemPosition;
        cVar.f۱۱۵۱۴e = this.f۱۱۴۹۸x ? 1 : -1;
        Cc cVar2 = this.f۱۱۴۹۴t;
        cVar2.f۱۱۵۱۵f = -1;
        cVar2.f۱۱۵۱۱b = offset;
        cVar2.f۱۱۵۱۶g = Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I  reason: contains not printable characters */
    public boolean m۱۴۱۷۹I() {
        return m۱۴۶۰۸j() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E  reason: contains not printable characters */
    public void m۱۴۱۷۵E() {
        if (this.f۱۱۴۹۴t == null) {
            this.f۱۱۴۹۴t = m۱۴۱۷۴D();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D  reason: contains not printable characters */
    public Cc m۱۴۱۷۴D() {
        return new Cc();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۴۲۱۳h(int position) {
        this.f۱۱۴۸۶A = position;
        this.f۱۱۴۸۷B = Integer.MIN_VALUE;
        Cd dVar = this.f۱۱۴۸۹D;
        if (dVar != null) {
            dVar.m۱۴۲۳۱b();
        }
        m۱۴۶۲۹y();
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۴۱۸۱a(int dx, RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        if (this.f۱۱۴۹۳s == 1) {
            return 0;
        }
        return m۱۴۲۰۳c(dx, recycler, state);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۴۱۹۷b(int dy, RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        if (this.f۱۱۴۹۳s == 0) {
            return 0;
        }
        return m۱۴۲۰۳c(dy, recycler, state);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۴۱۹۸b(RecyclerView.Ca0 state) {
        return m۱۴۱۶۶j(state);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: e  reason: contains not printable characters */
    public int m۱۴۲۰۷e(RecyclerView.Ca0 state) {
        return m۱۴۱۶۶j(state);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۴۱۸۲a(RecyclerView.Ca0 state) {
        return m۱۴۱۶۴i(state);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: d  reason: contains not printable characters */
    public int m۱۴۲۰۶d(RecyclerView.Ca0 state) {
        return m۱۴۱۶۴i(state);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۴۲۰۴c(RecyclerView.Ca0 state) {
        return m۱۴۱۶۸k(state);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: f  reason: contains not printable characters */
    public int m۱۴۲۱۰f(RecyclerView.Ca0 state) {
        return m۱۴۱۶۸k(state);
    }

    /* renamed from: j  reason: contains not printable characters */
    private int m۱۴۱۶۶j(RecyclerView.Ca0 state) {
        if (m۱۴۵۸۸e() == 0) {
            return 0;
        }
        m۱۴۱۷۵E();
        return Ca1.m۱۴۹۸۹a(state, this.f۱۱۴۹۵u, m۱۴۱۵۴b(!this.f۱۱۵۰۰z, true), m۱۴۱۴۵a(!this.f۱۱۵۰۰z, true), this, this.f۱۱۵۰۰z, this.f۱۱۴۹۸x);
    }

    /* renamed from: i  reason: contains not printable characters */
    private int m۱۴۱۶۴i(RecyclerView.Ca0 state) {
        if (m۱۴۵۸۸e() == 0) {
            return 0;
        }
        m۱۴۱۷۵E();
        return Ca1.m۱۴۹۸۸a(state, this.f۱۱۴۹۵u, m۱۴۱۵۴b(!this.f۱۱۵۰۰z, true), m۱۴۱۴۵a(!this.f۱۱۵۰۰z, true), this, this.f۱۱۵۰۰z);
    }

    /* renamed from: k  reason: contains not printable characters */
    private int m۱۴۱۶۸k(RecyclerView.Ca0 state) {
        if (m۱۴۵۸۸e() == 0) {
            return 0;
        }
        m۱۴۱۷۵E();
        return Ca1.m۱۴۹۹۰b(state, this.f۱۱۴۹۵u, m۱۴۱۵۴b(!this.f۱۱۵۰۰z, true), m۱۴۱۴۵a(!this.f۱۱۵۰۰z, true), this, this.f۱۱۵۰۰z);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۱۴۶a(int layoutDirection, int requiredSpace, boolean canUseExistingSpace, RecyclerView.Ca0 state) {
        int scrollingOffset;
        this.f۱۱۴۹۴t.f۱۱۵۲۱l = m۱۴۱۸۰J();
        this.f۱۱۴۹۴t.f۱۱۵۱۷h = m۱۴۲۱۲h(state);
        Cc cVar = this.f۱۱۴۹۴t;
        cVar.f۱۱۵۱۵f = layoutDirection;
        int i = -1;
        if (layoutDirection == 1) {
            cVar.f۱۱۵۱۷h += this.f۱۱۴۹۵u.m۱۵۵۸۶c();
            View child = m۱۴۱۴۱K();
            Cc cVar2 = this.f۱۱۴۹۴t;
            if (!this.f۱۱۴۹۸x) {
                i = 1;
            }
            cVar2.f۱۱۵۱۴e = i;
            Cc cVar3 = this.f۱۱۴۹۴t;
            int l = m۱۴۶۱۳l(child);
            Cc cVar4 = this.f۱۱۴۹۴t;
            cVar3.f۱۱۵۱۳d = l + cVar4.f۱۱۵۱۴e;
            cVar4.f۱۱۵۱۱b = this.f۱۱۴۹۵u.m۱۵۵۸۲a(child);
            scrollingOffset = this.f۱۱۴۹۵u.m۱۵۵۸۲a(child) - this.f۱۱۴۹۵u.m۱۵۵۸۴b();
        } else {
            View child2 = m۱۴۱۴۲L();
            this.f۱۱۴۹۴t.f۱۱۵۱۷h += this.f۱۱۴۹۵u.m۱۵۵۹۲f();
            Cc cVar5 = this.f۱۱۴۹۴t;
            if (this.f۱۱۴۹۸x) {
                i = 1;
            }
            cVar5.f۱۱۵۱۴e = i;
            Cc cVar6 = this.f۱۱۴۹۴t;
            int l2 = m۱۴۶۱۳l(child2);
            Cc cVar7 = this.f۱۱۴۹۴t;
            cVar6.f۱۱۵۱۳d = l2 + cVar7.f۱۱۵۱۴e;
            cVar7.f۱۱۵۱۱b = this.f۱۱۴۹۵u.m۱۵۵۸۹d(child2);
            scrollingOffset = (-this.f۱۱۴۹۵u.m۱۵۵۸۹d(child2)) + this.f۱۱۴۹۵u.m۱۵۵۹۲f();
        }
        Cc cVar8 = this.f۱۱۴۹۴t;
        cVar8.f۱۱۵۱۲c = requiredSpace;
        if (canUseExistingSpace) {
            cVar8.f۱۱۵۱۲c -= scrollingOffset;
        }
        this.f۱۱۴۹۴t.f۱۱۵۱۶g = scrollingOffset;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J  reason: contains not printable characters */
    public boolean m۱۴۱۸۰J() {
        return this.f۱۱۴۹۵u.m۱۵۵۸۸d() == 0 && this.f۱۱۴۹۵u.m۱۵۵۸۱a() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۹۰a(RecyclerView.Ca0 state, Cc layoutState, RecyclerView.AbstractCo.AbstractCc layoutPrefetchRegistry) {
        int pos = layoutState.f۱۱۵۱۳d;
        if (pos >= 0 && pos < state.m۱۴۳۵۳a()) {
            layoutPrefetchRegistry.m۱۴۶۴۱a(pos, Math.max(0, layoutState.f۱۱۵۱۶g));
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۸۸a(int adapterItemCount, RecyclerView.AbstractCo.AbstractCc layoutPrefetchRegistry) {
        boolean fromEnd;
        int anchorPos;
        Cd dVar = this.f۱۱۴۸۹D;
        int direction = -1;
        if (dVar == null || !dVar.m۱۴۲۳۰a()) {
            m۱۴۱۴۳M();
            fromEnd = this.f۱۱۴۹۸x;
            if (this.f۱۱۴۸۶A == -1) {
                anchorPos = fromEnd ? adapterItemCount - 1 : 0;
            } else {
                anchorPos = this.f۱۱۴۸۶A;
            }
        } else {
            Cd dVar2 = this.f۱۱۴۸۹D;
            fromEnd = dVar2.f۱۱۵۲۴e;
            anchorPos = dVar2.f۱۱۵۲۲c;
        }
        if (!fromEnd) {
            direction = 1;
        }
        int targetPos = anchorPos;
        for (int i = 0; i < this.f۱۱۴۹۲G && targetPos >= 0 && targetPos < adapterItemCount; i++) {
            layoutPrefetchRegistry.m۱۴۶۴۱a(targetPos, 0);
            targetPos += direction;
        }
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۸۷a(int dx, int dy, RecyclerView.Ca0 state, RecyclerView.AbstractCo.AbstractCc layoutPrefetchRegistry) {
        int delta = this.f۱۱۴۹۳s == 0 ? dx : dy;
        if (m۱۴۵۸۸e() != 0 && delta != 0) {
            m۱۴۱۷۵E();
            m۱۴۱۴۶a(delta > 0 ? 1 : -1, Math.abs(delta), true, state);
            m۱۴۱۹۰a(state, this.f۱۱۴۹۴t, layoutPrefetchRegistry);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۴۲۰۳c(int dy, RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        if (m۱۴۵۸۸e() == 0 || dy == 0) {
            return 0;
        }
        this.f۱۱۴۹۴t.f۱۱۵۱۰a = true;
        m۱۴۱۷۵E();
        int layoutDirection = dy > 0 ? 1 : -1;
        int absDy = Math.abs(dy);
        m۱۴۱۴۶a(layoutDirection, absDy, true, state);
        Cc cVar = this.f۱۱۴۹۴t;
        int consumed = cVar.f۱۱۵۱۶g + m۱۴۱۸۳a(recycler, cVar, state, false);
        if (consumed < 0) {
            return 0;
        }
        int scrolled = absDy > consumed ? layoutDirection * consumed : dy;
        this.f۱۱۴۹۵u.m۱۵۵۸۳a(-scrolled);
        this.f۱۱۴۹۴t.f۱۱۵۱۹j = scrolled;
        return scrolled;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۹۴a(String message) {
        if (this.f۱۱۴۸۹D == null) {
            super.m۱۴۵۴۱a(message);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۱۴۹a(RecyclerView.Cv recycler, int startIndex, int endIndex) {
        if (startIndex != endIndex) {
            if (endIndex > startIndex) {
                for (int i = endIndex - 1; i >= startIndex; i--) {
                    m۱۴۵۱۶a(i, recycler);
                }
                return;
            }
            for (int i2 = startIndex; i2 > endIndex; i2--) {
                m۱۴۵۱۶a(i2, recycler);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۴۱۵۶b(RecyclerView.Cv recycler, int dt) {
        if (dt >= 0) {
            int childCount = m۱۴۵۸۸e();
            if (this.f۱۱۴۹۸x) {
                for (int i = childCount - 1; i >= 0; i--) {
                    View child = m۱۴۵۷۳c(i);
                    if (this.f۱۱۴۹۵u.m۱۵۵۸۲a(child) > dt || this.f۱۱۴۹۵u.m۱۵۵۹۱e(child) > dt) {
                        m۱۴۱۴۹a(recycler, childCount - 1, i);
                        return;
                    }
                }
                return;
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View child2 = m۱۴۵۷۳c(i2);
                if (this.f۱۱۴۹۵u.m۱۵۵۸۲a(child2) > dt || this.f۱۱۴۹۵u.m۱۵۵۹۱e(child2) > dt) {
                    m۱۴۱۴۹a(recycler, 0, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۱۴۸a(RecyclerView.Cv recycler, int dt) {
        int childCount = m۱۴۵۸۸e();
        if (dt >= 0) {
            int limit = this.f۱۱۴۹۵u.m۱۵۵۸۱a() - dt;
            if (this.f۱۱۴۹۸x) {
                for (int i = 0; i < childCount; i++) {
                    View child = m۱۴۵۷۳c(i);
                    if (this.f۱۱۴۹۵u.m۱۵۵۸۹d(child) < limit || this.f۱۱۴۹۵u.m۱۵۵۹۳f(child) < limit) {
                        m۱۴۱۴۹a(recycler, 0, i);
                        return;
                    }
                }
                return;
            }
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View child2 = m۱۴۵۷۳c(i2);
                if (this.f۱۱۴۹۵u.m۱۵۵۸۹d(child2) < limit || this.f۱۱۴۹۵u.m۱۵۵۹۳f(child2) < limit) {
                    m۱۴۱۴۹a(recycler, childCount - 1, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۱۵۰a(RecyclerView.Cv recycler, Cc layoutState) {
        if (layoutState.f۱۱۵۱۰a && !layoutState.f۱۱۵۲۱l) {
            if (layoutState.f۱۱۵۱۵f == -1) {
                m۱۴۱۴۸a(recycler, layoutState.f۱۱۵۱۶g);
            } else {
                m۱۴۱۵۶b(recycler, layoutState.f۱۱۵۱۶g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۴۱۸۳a(RecyclerView.Cv recycler, Cc layoutState, RecyclerView.Ca0 state, boolean stopOnFocusable) {
        int start = layoutState.f۱۱۵۱۲c;
        int i = layoutState.f۱۱۵۱۶g;
        if (i != Integer.MIN_VALUE) {
            int i2 = layoutState.f۱۱۵۱۲c;
            if (i2 < 0) {
                layoutState.f۱۱۵۱۶g = i + i2;
            }
            m۱۴۱۵۰a(recycler, layoutState);
        }
        int remainingSpace = layoutState.f۱۱۵۱۲c + layoutState.f۱۱۵۱۷h;
        Cb layoutChunkResult = this.f۱۱۴۹۱F;
        while (true) {
            if ((!layoutState.f۱۱۵۲۱l && remainingSpace <= 0) || !layoutState.m۱۴۲۲۸a(state)) {
                break;
            }
            layoutChunkResult.m۱۴۲۲۳a();
            m۱۴۱۹۲a(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.f۱۱۵۰۷b) {
                layoutState.f۱۱۵۱۱b += layoutChunkResult.f۱۱۵۰۶a * layoutState.f۱۱۵۱۵f;
                if (!layoutChunkResult.f۱۱۵۰۸c || this.f۱۱۴۹۴t.f۱۱۵۲۰k != null || !state.m۱۴۳۵۸d()) {
                    int i3 = layoutState.f۱۱۵۱۲c;
                    int i4 = layoutChunkResult.f۱۱۵۰۶a;
                    layoutState.f۱۱۵۱۲c = i3 - i4;
                    remainingSpace -= i4;
                }
                int i5 = layoutState.f۱۱۵۱۶g;
                if (i5 != Integer.MIN_VALUE) {
                    layoutState.f۱۱۵۱۶g = i5 + layoutChunkResult.f۱۱۵۰۶a;
                    int i6 = layoutState.f۱۱۵۱۲c;
                    if (i6 < 0) {
                        layoutState.f۱۱۵۱۶g += i6;
                    }
                    m۱۴۱۵۰a(recycler, layoutState);
                }
                if (stopOnFocusable && layoutChunkResult.f۱۱۵۰۹d) {
                    break;
                }
            } else {
                break;
            }
        }
        return start - layoutState.f۱۱۵۱۲c;
    }

    /* JADX INFO: Multiple debug info for r1v2 int: [D('right' int), D('left' int)] */
    /* JADX INFO: Multiple debug info for r1v4 int: [D('top' int), D('bottom' int)] */
    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۱۹۲a(RecyclerView.Cv recycler, RecyclerView.Ca0 state, Cc layoutState, Cb result) {
        int bottom;
        int right;
        int top;
        int left;
        int left2;
        int right2;
        View view = layoutState.m۱۴۲۲۵a(recycler);
        if (view == null) {
            result.f۱۱۵۰۷b = true;
            return;
        }
        RecyclerView.Cp params = (RecyclerView.Cp) view.getLayoutParams();
        if (layoutState.f۱۱۵۲۰k == null) {
            if (this.f۱۱۴۹۸x == (layoutState.f۱۱۵۱۵f == -1)) {
                m۱۴۵۶۵b(view);
            } else {
                m۱۴۵۶۶b(view, 0);
            }
        } else {
            if (this.f۱۱۴۹۸x == (layoutState.f۱۱۵۱۵f == -1)) {
                m۱۴۵۳۱a(view);
            } else {
                m۱۴۵۳۲a(view, 0);
            }
        }
        m۱۴۵۳۳a(view, 0, 0);
        result.f۱۱۵۰۶a = this.f۱۱۴۹۵u.m۱۵۵۸۵b(view);
        if (this.f۱۱۴۹۳s == 1) {
            if (m۱۴۱۷۹I()) {
                right2 = m۱۴۶۲۱q() - m۱۴۶۱۸o();
                left2 = right2 - this.f۱۱۴۹۵u.m۱۵۵۸۷c(view);
            } else {
                left2 = m۱۴۶۱۶n();
                right2 = this.f۱۱۴۹۵u.m۱۵۵۸۷c(view) + left2;
            }
            if (layoutState.f۱۱۵۱۵f == -1) {
                right = right2;
                bottom = layoutState.f۱۱۵۱۱b;
                left = left2;
                top = layoutState.f۱۱۵۱۱b - result.f۱۱۵۰۶a;
            } else {
                right = right2;
                top = layoutState.f۱۱۵۱۱b;
                left = left2;
                bottom = layoutState.f۱۱۵۱۱b + result.f۱۱۵۰۶a;
            }
        } else {
            int top2 = m۱۴۶۲۰p();
            int bottom2 = this.f۱۱۴۹۵u.m۱۵۵۸۷c(view) + top2;
            if (layoutState.f۱۱۵۱۵f == -1) {
                top = top2;
                right = layoutState.f۱۱۵۱۱b;
                bottom = bottom2;
                left = layoutState.f۱۱۵۱۱b - result.f۱۱۵۰۶a;
            } else {
                top = top2;
                left = layoutState.f۱۱۵۱۱b;
                bottom = bottom2;
                right = layoutState.f۱۱۵۱۱b + result.f۱۱۵۰۶a;
            }
        }
        m۱۴۵۳۴a(view, left, top, right, bottom);
        if (params.m۱۴۶۴۴c() || params.m۱۴۶۴۳b()) {
            result.f۱۱۵۰۸c = true;
        }
        result.f۱۱۵۰۹d = view.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: A  reason: contains not printable characters */
    public boolean m۱۴۱۷۲A() {
        return (m۱۴۶۰۶i() == 1073741824 || m۱۴۶۲۲r() == 1073741824 || !m۱۴۶۲۳s()) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public int m۱۴۲۱۴i(int focusDirection) {
        if (focusDirection != 1) {
            if (focusDirection != 2) {
                if (focusDirection != 17) {
                    if (focusDirection != 33) {
                        if (focusDirection != 66) {
                            if (focusDirection == 130 && this.f۱۱۴۹۳s == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f۱۱۴۹۳s == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f۱۱۴۹۳s == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f۱۱۴۹۳s == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f۱۱۴۹۳s != 1 && m۱۴۱۷۹I()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f۱۱۴۹۳s != 1 && m۱۴۱۷۹I()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: L  reason: contains not printable characters */
    private View m۱۴۱۴۲L() {
        return m۱۴۵۷۳c(this.f۱۱۴۹۸x ? m۱۴۵۸۸e() - 1 : 0);
    }

    /* renamed from: K  reason: contains not printable characters */
    private View m۱۴۱۴۱K() {
        return m۱۴۵۷۳c(this.f۱۱۴۹۸x ? 0 : m۱۴۵۸۸e() - 1);
    }

    /* renamed from: b  reason: contains not printable characters */
    private View m۱۴۱۵۴b(boolean completelyVisible, boolean acceptPartiallyVisible) {
        if (this.f۱۱۴۹۸x) {
            return m۱۴۱۸۴a(m۱۴۵۸۸e() - 1, -1, completelyVisible, acceptPartiallyVisible);
        }
        return m۱۴۱۸۴a(0, m۱۴۵۸۸e(), completelyVisible, acceptPartiallyVisible);
    }

    /* renamed from: a  reason: contains not printable characters */
    private View m۱۴۱۴۵a(boolean completelyVisible, boolean acceptPartiallyVisible) {
        if (this.f۱۱۴۹۸x) {
            return m۱۴۱۸۴a(0, m۱۴۵۸۸e(), completelyVisible, acceptPartiallyVisible);
        }
        return m۱۴۱۸۴a(m۱۴۵۸۸e() - 1, -1, completelyVisible, acceptPartiallyVisible);
    }

    /* renamed from: l  reason: contains not printable characters */
    private View m۱۴۱۷۰l(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        if (this.f۱۱۴۹۸x) {
            return m۱۴۱۶۱g(recycler, state);
        }
        return m۱۴۱۶۵i(recycler, state);
    }

    /* renamed from: m  reason: contains not printable characters */
    private View m۱۴۱۷۱m(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        if (this.f۱۱۴۹۸x) {
            return m۱۴۱۶۵i(recycler, state);
        }
        return m۱۴۱۶۱g(recycler, state);
    }

    /* renamed from: g  reason: contains not printable characters */
    private View m۱۴۱۶۱g(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        return m۱۴۱۸۵a(recycler, state, 0, m۱۴۵۸۸e(), state.m۱۴۳۵۳a());
    }

    /* renamed from: i  reason: contains not printable characters */
    private View m۱۴۱۶۵i(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        return m۱۴۱۸۵a(recycler, state, m۱۴۵۸۸e() - 1, -1, state.m۱۴۳۵۳a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۴۱۸۵a(RecyclerView.Cv recycler, RecyclerView.Ca0 state, int start, int end, int itemCount) {
        m۱۴۱۷۵E();
        View invalidMatch = null;
        View outOfBoundsMatch = null;
        int boundsStart = this.f۱۱۴۹۵u.m۱۵۵۹۲f();
        int boundsEnd = this.f۱۱۴۹۵u.m۱۵۵۸۴b();
        int diff = end > start ? 1 : -1;
        for (int i = start; i != end; i += diff) {
            View view = m۱۴۵۷۳c(i);
            int position = m۱۴۶۱۳l(view);
            if (position >= 0 && position < itemCount) {
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

    /* renamed from: j  reason: contains not printable characters */
    private View m۱۴۱۶۷j(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        if (this.f۱۱۴۹۸x) {
            return m۱۴۱۵۹f(recycler, state);
        }
        return m۱۴۱۶۳h(recycler, state);
    }

    /* renamed from: k  reason: contains not printable characters */
    private View m۱۴۱۶۹k(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        if (this.f۱۱۴۹۸x) {
            return m۱۴۱۶۳h(recycler, state);
        }
        return m۱۴۱۵۹f(recycler, state);
    }

    /* renamed from: f  reason: contains not printable characters */
    private View m۱۴۱۵۹f(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        return m۱۴۲۰۸e(0, m۱۴۵۸۸e());
    }

    /* renamed from: h  reason: contains not printable characters */
    private View m۱۴۱۶۳h(RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        return m۱۴۲۰۸e(m۱۴۵۸۸e() - 1, -1);
    }

    /* renamed from: F  reason: contains not printable characters */
    public int m۱۴۱۷۶F() {
        View child = m۱۴۱۸۴a(0, m۱۴۵۸۸e(), false, true);
        if (child == null) {
            return -1;
        }
        return m۱۴۶۱۳l(child);
    }

    /* renamed from: G  reason: contains not printable characters */
    public int m۱۴۱۷۷G() {
        View child = m۱۴۱۸۴a(m۱۴۵۸۸e() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return m۱۴۶۱۳l(child);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۴۱۸۴a(int fromIndex, int toIndex, boolean completelyVisible, boolean acceptPartiallyVisible) {
        int preferredBoundsFlag;
        m۱۴۱۷۵E();
        int acceptableBoundsFlag = 0;
        if (completelyVisible) {
            preferredBoundsFlag = 24579;
        } else {
            preferredBoundsFlag = 320;
        }
        if (acceptPartiallyVisible) {
            acceptableBoundsFlag = 320;
        }
        if (this.f۱۱۴۹۳s == 0) {
            return this.f۱۱۶۷۲e.m۱۵۵۱۴a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
        }
        return this.f۱۱۶۷۳f.m۱۵۵۱۴a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public View m۱۴۲۰۸e(int fromIndex, int toIndex) {
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        m۱۴۱۷۵E();
        if ((toIndex > fromIndex ? 1 : toIndex < fromIndex ? -1 : 0) == 0) {
            return m۱۴۵۷۳c(fromIndex);
        }
        if (this.f۱۱۴۹۵u.m۱۵۵۸۹d(m۱۴۵۷۳c(fromIndex)) < this.f۱۱۴۹۵u.m۱۵۵۹۲f()) {
            preferredBoundsFlag = 16644;
            acceptableBoundsFlag = 16388;
        } else {
            preferredBoundsFlag = 4161;
            acceptableBoundsFlag = 4097;
        }
        if (this.f۱۱۴۹۳s == 0) {
            return this.f۱۱۶۷۲e.m۱۵۵۱۴a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
        }
        return this.f۱۱۶۷۳f.m۱۵۵۱۴a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۴۱۸۶a(View focused, int focusDirection, RecyclerView.Cv recycler, RecyclerView.Ca0 state) {
        int layoutDir;
        View nextCandidate;
        View nextFocus;
        m۱۴۱۴۳M();
        if (m۱۴۵۸۸e() == 0 || (layoutDir = m۱۴۲۱۴i(focusDirection)) == Integer.MIN_VALUE) {
            return null;
        }
        m۱۴۱۷۵E();
        m۱۴۱۷۵E();
        m۱۴۱۴۶a(layoutDir, (int) (((float) this.f۱۱۴۹۵u.m۱۵۵۹۴g()) * 0.33333334f), false, state);
        Cc cVar = this.f۱۱۴۹۴t;
        cVar.f۱۱۵۱۶g = Integer.MIN_VALUE;
        cVar.f۱۱۵۱۰a = false;
        m۱۴۱۸۳a(recycler, cVar, state, true);
        if (layoutDir == -1) {
            nextCandidate = m۱۴۱۶۹k(recycler, state);
        } else {
            nextCandidate = m۱۴۱۶۷j(recycler, state);
        }
        if (layoutDir == -1) {
            nextFocus = m۱۴۱۴۲L();
        } else {
            nextFocus = m۱۴۱۴۱K();
        }
        if (!nextFocus.hasFocusable()) {
            return nextCandidate;
        }
        if (nextCandidate == null) {
            return null;
        }
        return nextFocus;
    }

    @Override // android.support.p۰۴۷v7.widget.RecyclerView.AbstractCo
    /* renamed from: C  reason: contains not printable characters */
    public boolean m۱۴۱۷۳C() {
        return this.f۱۱۴۸۹D == null && this.f۱۱۴۹۶v == this.f۱۱۴۹۹y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.LinearLayoutManager$c  reason: invalid class name */
    public static class Cc {

        /* renamed from: a  reason: contains not printable characters */
        boolean f۱۱۵۱۰a = true;

        /* renamed from: b  reason: contains not printable characters */
        int f۱۱۵۱۱b;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۱۵۱۲c;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۱۵۱۳d;

        /* renamed from: e  reason: contains not printable characters */
        int f۱۱۵۱۴e;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۱۵۱۵f;

        /* renamed from: g  reason: contains not printable characters */
        int f۱۱۵۱۶g;

        /* renamed from: h  reason: contains not printable characters */
        int f۱۱۵۱۷h = 0;

        /* renamed from: i  reason: contains not printable characters */
        boolean f۱۱۵۱۸i;

        /* renamed from: j  reason: contains not printable characters */
        int f۱۱۵۱۹j;

        /* renamed from: k  reason: contains not printable characters */
        List<RecyclerView.AbstractCd0> f۱۱۵۲۰k = null;

        /* renamed from: l  reason: contains not printable characters */
        boolean f۱۱۵۲۱l;

        Cc() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۲۲۸a(RecyclerView.Ca0 state) {
            int i = this.f۱۱۵۱۳d;
            return i >= 0 && i < state.m۱۴۳۵۳a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public View m۱۴۲۲۵a(RecyclerView.Cv recycler) {
            if (this.f۱۱۵۲۰k != null) {
                return m۱۴۲۲۴b();
            }
            View view = recycler.m۱۴۶۹۵d(this.f۱۱۵۱۳d);
            this.f۱۱۵۱۳d += this.f۱۱۵۱۴e;
            return view;
        }

        /* renamed from: b  reason: contains not printable characters */
        private View m۱۴۲۲۴b() {
            int size = this.f۱۱۵۲۰k.size();
            for (int i = 0; i < size; i++) {
                View view = this.f۱۱۵۲۰k.get(i).f۱۱۶۳۷c;
                RecyclerView.Cp lp = (RecyclerView.Cp) view.getLayoutParams();
                if (!lp.m۱۴۶۴۴c() && this.f۱۱۵۱۳d == lp.m۱۴۶۴۲a()) {
                    m۱۴۲۲۷a(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۲۲۶a() {
            m۱۴۲۲۷a((View) null);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۲۲۷a(View ignore) {
            View closest = m۱۴۲۲۹b(ignore);
            if (closest == null) {
                this.f۱۱۵۱۳d = -1;
            } else {
                this.f۱۱۵۱۳d = ((RecyclerView.Cp) closest.getLayoutParams()).m۱۴۶۴۲a();
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        public View m۱۴۲۲۹b(View ignore) {
            int distance;
            int size = this.f۱۱۵۲۰k.size();
            View closest = null;
            int closestDistance = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                View view = this.f۱۱۵۲۰k.get(i).f۱۱۶۳۷c;
                RecyclerView.Cp lp = (RecyclerView.Cp) view.getLayoutParams();
                if (view != ignore && !lp.m۱۴۶۴۴c() && (distance = (lp.m۱۴۶۴۲a() - this.f۱۱۵۱۳d) * this.f۱۱۵۱۴e) >= 0 && distance < closestDistance) {
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

    /* renamed from: android.support.v7.widget.LinearLayoutManager$d  reason: invalid class name */
    public static class Cd implements Parcelable {
        public static final Parcelable.Creator<Cd> CREATOR = new Ca();

        /* renamed from: c  reason: contains not printable characters */
        int f۱۱۵۲۲c;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۱۵۲۳d;

        /* renamed from: e  reason: contains not printable characters */
        boolean f۱۱۵۲۴e;

        public Cd() {
        }

        Cd(Parcel in) {
            this.f۱۱۵۲۲c = in.readInt();
            this.f۱۱۵۲۳d = in.readInt();
            this.f۱۱۵۲۴e = in.readInt() != 1 ? false : true;
        }

        public Cd(Cd other) {
            this.f۱۱۵۲۲c = other.f۱۱۵۲۲c;
            this.f۱۱۵۲۳d = other.f۱۱۵۲۳d;
            this.f۱۱۵۲۴e = other.f۱۱۵۲۴e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۲۳۰a() {
            return this.f۱۱۵۲۲c >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۲۳۱b() {
            this.f۱۱۵۲۲c = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f۱۱۵۲۲c);
            dest.writeInt(this.f۱۱۵۲۳d);
            dest.writeInt(this.f۱۱۵۲۴e ? 1 : 0);
        }

        /* renamed from: android.support.v7.widget.LinearLayoutManager$d$a  reason: invalid class name */
        static class Ca implements Parcelable.Creator<Cd> {
            Ca() {
            }

            @Override // android.os.Parcelable.Creator
            public Cd createFromParcel(Parcel in) {
                return new Cd(in);
            }

            @Override // android.os.Parcelable.Creator
            public Cd[] newArray(int size) {
                return new Cd[size];
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.LinearLayoutManager$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        AbstractCt0 f۱۱۵۰۱a;

        /* renamed from: b  reason: contains not printable characters */
        int f۱۱۵۰۲b;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۱۵۰۳c;

        /* renamed from: d  reason: contains not printable characters */
        boolean f۱۱۵۰۴d;

        /* renamed from: e  reason: contains not printable characters */
        boolean f۱۱۵۰۵e;

        Ca() {
            m۱۴۲۲۱b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۲۲۱b() {
            this.f۱۱۵۰۲b = -1;
            this.f۱۱۵۰۳c = Integer.MIN_VALUE;
            this.f۱۱۵۰۴d = false;
            this.f۱۱۵۰۵e = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۲۱۸a() {
            int i;
            if (this.f۱۱۵۰۴d) {
                i = this.f۱۱۵۰۱a.m۱۵۵۸۴b();
            } else {
                i = this.f۱۱۵۰۱a.m۱۵۵۹۲f();
            }
            this.f۱۱۵۰۳c = i;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f۱۱۵۰۲b + ", mCoordinate=" + this.f۱۱۵۰۳c + ", mLayoutFromEnd=" + this.f۱۱۵۰۴d + ", mValid=" + this.f۱۱۵۰۵e + '}';
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۲۲۰a(View child, RecyclerView.Ca0 state) {
            RecyclerView.Cp lp = (RecyclerView.Cp) child.getLayoutParams();
            return !lp.m۱۴۶۴۴c() && lp.m۱۴۶۴۲a() >= 0 && lp.m۱۴۶۴۲a() < state.m۱۴۳۵۳a();
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۲۲۲b(View child, int position) {
            int endMargin;
            int spaceChange = this.f۱۱۵۰۱a.m۱۵۵۹۵h();
            if (spaceChange >= 0) {
                m۱۴۲۱۹a(child, position);
                return;
            }
            this.f۱۱۵۰۲b = position;
            if (this.f۱۱۵۰۴d) {
                int previousEndMargin = (this.f۱۱۵۰۱a.m۱۵۵۸۴b() - spaceChange) - this.f۱۱۵۰۱a.m۱۵۵۸۲a(child);
                this.f۱۱۵۰۳c = this.f۱۱۵۰۱a.m۱۵۵۸۴b() - previousEndMargin;
                if (previousEndMargin > 0) {
                    int childSize = this.f۱۱۵۰۱a.m۱۵۵۸۵b(child);
                    int layoutStart = this.f۱۱۵۰۱a.m۱۵۵۹۲f();
                    int startMargin = (this.f۱۱۵۰۳c - childSize) - (Math.min(this.f۱۱۵۰۱a.m۱۵۵۸۹d(child) - layoutStart, 0) + layoutStart);
                    if (startMargin < 0) {
                        this.f۱۱۵۰۳c += Math.min(previousEndMargin, -startMargin);
                        return;
                    }
                    return;
                }
                return;
            }
            int childStart = this.f۱۱۵۰۱a.m۱۵۵۸۹d(child);
            int startMargin2 = childStart - this.f۱۱۵۰۱a.m۱۵۵۹۲f();
            this.f۱۱۵۰۳c = childStart;
            if (startMargin2 > 0 && (endMargin = (this.f۱۱۵۰۱a.m۱۵۵۸۴b() - Math.min(0, (this.f۱۱۵۰۱a.m۱۵۵۸۴b() - spaceChange) - this.f۱۱۵۰۱a.m۱۵۵۸۲a(child))) - (this.f۱۱۵۰۱a.m۱۵۵۸۵b(child) + childStart)) < 0) {
                this.f۱۱۵۰۳c -= Math.min(startMargin2, -endMargin);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۲۱۹a(View child, int position) {
            if (this.f۱۱۵۰۴d) {
                this.f۱۱۵۰۳c = this.f۱۱۵۰۱a.m۱۵۵۸۲a(child) + this.f۱۱۵۰۱a.m۱۵۵۹۵h();
            } else {
                this.f۱۱۵۰۳c = this.f۱۱۵۰۱a.m۱۵۵۸۹d(child);
            }
            this.f۱۱۵۰۲b = position;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: android.support.v7.widget.LinearLayoutManager$b  reason: invalid class name */
    public static class Cb {

        /* renamed from: a  reason: contains not printable characters */
        public int f۱۱۵۰۶a;

        /* renamed from: b  reason: contains not printable characters */
        public boolean f۱۱۵۰۷b;

        /* renamed from: c  reason: contains not printable characters */
        public boolean f۱۱۵۰۸c;

        /* renamed from: d  reason: contains not printable characters */
        public boolean f۱۱۵۰۹d;

        protected Cb() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۲۲۳a() {
            this.f۱۱۵۰۶a = 0;
            this.f۱۱۵۰۷b = false;
            this.f۱۱۵۰۸c = false;
            this.f۱۱۵۰۹d = false;
        }
    }
}
