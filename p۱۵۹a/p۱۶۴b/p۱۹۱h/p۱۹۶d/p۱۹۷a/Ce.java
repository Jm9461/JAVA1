package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb;

/* renamed from: a.b.h.d.a.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ce extends Cb {

    /* renamed from: o, reason: contains not printable characters */
    private a f۸۸۷۵o;

    /* renamed from: p, reason: contains not printable characters */
    private boolean f۸۸۷۶p;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] stateSet) {
        boolean changed = super.onStateChange(stateSet);
        int idx = this.f۸۸۷۵o.m۸۶۹۱a(stateSet);
        if (idx < 0) {
            idx = this.f۸۸۷۵o.m۸۶۹۱a(StateSet.WILD_CARD);
        }
        return m۸۶۴۹a(idx) || changed;
    }

    /* renamed from: a, reason: contains not printable characters */
    int[] m۸۶۹۰a(AttributeSet attrs) {
        int j = 0;
        int numAttrs = attrs.getAttributeCount();
        int[] states = new int[numAttrs];
        for (int i = 0; i < numAttrs; i++) {
            int stateResId = attrs.getAttributeNameResource(i);
            if (stateResId != 0 && stateResId != 16842960 && stateResId != 16843161) {
                int j2 = j + 1;
                states[j] = attrs.getAttributeBooleanValue(i, false) ? stateResId : -stateResId;
                j = j2;
            }
        }
        return StateSet.trimStateSet(states, j);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f۸۸۷۶p) {
            super.mutate();
            if (this == this) {
                this.f۸۸۷۵o.mo۸۶۹۴m();
                this.f۸۸۷۶p = true;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb
    /* renamed from: a, reason: contains not printable characters */
    public a mo۸۶۸۸a() {
        return new a(this.f۸۸۷۵o, this, null);
    }

    /* renamed from: a.b.h.d.a.e$a */
    static class a extends Cb.c {

        /* renamed from: J, reason: contains not printable characters */
        int[][] f۸۸۷۷J;

        a(a orig, Ce owner, Resources res) {
            super(orig, owner, res);
            if (orig != null) {
                this.f۸۸۷۷J = orig.f۸۸۷۷J;
            } else {
                this.f۸۸۷۷J = new int[m۸۶۶۶c()][];
            }
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb.c
        /* renamed from: m, reason: contains not printable characters */
        void mo۸۶۹۴m() {
            int[][] iArr = this.f۸۸۷۷J;
            int[][] stateSets = new int[iArr.length][];
            for (int i = iArr.length - 1; i >= 0; i--) {
                int[][] iArr2 = this.f۸۸۷۷J;
                stateSets[i] = iArr2[i] != null ? (int[]) iArr2[i].clone() : null;
            }
            this.f۸۸۷۷J = stateSets;
        }

        /* renamed from: a, reason: contains not printable characters */
        int m۸۶۹۲a(int[] stateSet, Drawable drawable) {
            int pos = m۸۶۵۵a(drawable);
            this.f۸۸۷۷J[pos] = stateSet;
            return pos;
        }

        /* renamed from: a, reason: contains not printable characters */
        int m۸۶۹۱a(int[] stateSet) {
            int[][] stateSets = this.f۸۸۷۷J;
            int count = m۸۶۶۸d();
            for (int i = 0; i < count; i++) {
                if (StateSet.stateSetMatches(stateSets[i], stateSet)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new Ce(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res) {
            return new Ce(this, res);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb.c
        /* renamed from: a, reason: contains not printable characters */
        public void mo۸۶۹۳a(int oldSize, int newSize) {
            super.mo۸۶۹۳a(oldSize, newSize);
            int[][] newStateSets = new int[newSize][];
            System.arraycopy(this.f۸۸۷۷J, 0, newStateSets, 0, oldSize);
            this.f۸۸۷۷J = newStateSets;
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb
    /* renamed from: a, reason: contains not printable characters */
    protected void mo۸۶۸۹a(Cb.c state) {
        super.mo۸۶۸۹a(state);
        if (state instanceof a) {
            this.f۸۸۷۵o = (a) state;
        }
    }

    Ce(a state, Resources res) {
        a newState = new a(state, this, res);
        mo۸۶۸۹a(newState);
        onStateChange(getState());
    }

    Ce(a state) {
        if (state != null) {
            mo۸۶۸۹a(state);
        }
    }
}
