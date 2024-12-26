package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb;

/* renamed from: a.b.h.d.a.e  reason: invalid class name */
class Ce extends Cb {

    /* renamed from: o  reason: contains not printable characters */
    private Ca f۸۸۷۵o;

    /* renamed from: p  reason: contains not printable characters */
    private boolean f۸۸۷۶p;

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb
    public boolean onStateChange(int[] stateSet) {
        boolean changed = super.onStateChange(stateSet);
        int idx = this.f۸۸۷۵o.m۱۰۷۶۰a(stateSet);
        if (idx < 0) {
            idx = this.f۸۸۷۵o.m۱۰۷۶۰a(StateSet.WILD_CARD);
        }
        return m۱۰۷۱۸a(idx) || changed;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int[] m۱۰۷۵۹a(AttributeSet attrs) {
        int j = 0;
        int numAttrs = attrs.getAttributeCount();
        int[] states = new int[numAttrs];
        for (int i = 0; i < numAttrs; i++) {
            int stateResId = attrs.getAttributeNameResource(i);
            if (!(stateResId == 0 || stateResId == 16842960 || stateResId == 16843161)) {
                int j2 = j + 1;
                states[j] = attrs.getAttributeBooleanValue(i, false) ? stateResId : -stateResId;
                j = j2;
            }
        }
        return StateSet.trimStateSet(states, j);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb
    public Drawable mutate() {
        if (!this.f۸۸۷۶p) {
            super.mutate();
            if (this == this) {
                this.f۸۸۷۵o.m۱۰۷۶۳m();
                this.f۸۸۷۶p = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb
    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۰۷۵۶a() {
        return new Ca(this.f۸۸۷۵o, this, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.h.d.a.e$a  reason: invalid class name */
    public static class Ca extends Cb.AbstractCc {

        /* renamed from: J  reason: contains not printable characters */
        int[][] f۸۸۷۷J;

        Ca(Ca orig, Ce owner, Resources res) {
            super(orig, owner, res);
            if (orig != null) {
                this.f۸۸۷۷J = orig.f۸۸۷۷J;
            } else {
                this.f۸۸۷۷J = new int[m۱۰۷۳۵c()][];
            }
        }

        /* access modifiers changed from: package-private */
        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb.AbstractCc
        /* renamed from: m  reason: contains not printable characters */
        public void m۱۰۷۶۳m() {
            int[][] iArr = this.f۸۸۷۷J;
            int[][] stateSets = new int[iArr.length][];
            for (int i = iArr.length - 1; i >= 0; i--) {
                int[][] iArr2 = this.f۸۸۷۷J;
                stateSets[i] = iArr2[i] != null ? (int[]) iArr2[i].clone() : null;
            }
            this.f۸۸۷۷J = stateSets;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۷۶۱a(int[] stateSet, Drawable drawable) {
            int pos = m۱۰۷۲۴a(drawable);
            this.f۸۸۷۷J[pos] = stateSet;
            return pos;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۰۷۶۰a(int[] stateSet) {
            int[][] stateSets = this.f۸۸۷۷J;
            int count = m۱۰۷۳۷d();
            for (int i = 0; i < count; i++) {
                if (StateSet.stateSetMatches(stateSets[i], stateSet)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new Ce(this, null);
        }

        public Drawable newDrawable(Resources res) {
            return new Ce(this, res);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۷۶۲a(int oldSize, int newSize) {
            super.m۱۰۷۲۶a(oldSize, newSize);
            int[][] newStateSets = new int[newSize][];
            System.arraycopy(this.f۸۸۷۷J, 0, newStateSets, 0, oldSize);
            this.f۸۸۷۷J = newStateSets;
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: protected */
    @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۷۵۸a(Cb.AbstractCc state) {
        super.m۱۰۷۱۵a(state);
        if (state instanceof Ca) {
            this.f۸۸۷۵o = (Ca) state;
        }
    }

    Ce(Ca state, Resources res) {
        m۱۰۷۵۸a(new Ca(state, this, res));
        onStateChange(getState());
    }

    Ce(Ca state) {
        if (state != null) {
            m۱۰۷۵۸a(state);
        }
    }
}
