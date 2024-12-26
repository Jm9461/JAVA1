package a.b.h.d.a;

import a.b.h.d.a.b;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

class e extends b {
    private a o;
    private boolean p;

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // a.b.h.d.a.b
    public boolean onStateChange(int[] stateSet) {
        boolean changed = super.onStateChange(stateSet);
        int idx = this.o.a(stateSet);
        if (idx < 0) {
            idx = this.o.a(StateSet.WILD_CARD);
        }
        return a(idx) || changed;
    }

    /* access modifiers changed from: package-private */
    public int[] a(AttributeSet attrs) {
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

    @Override // a.b.h.d.a.b
    public Drawable mutate() {
        if (!this.p) {
            super.mutate();
            if (this == this) {
                this.o.m();
                this.p = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // a.b.h.d.a.b
    public a a() {
        return new a(this.o, this, null);
    }

    /* access modifiers changed from: package-private */
    public static class a extends b.c {
        int[][] J;

        a(a orig, e owner, Resources res) {
            super(orig, owner, res);
            if (orig != null) {
                this.J = orig.J;
            } else {
                this.J = new int[c()][];
            }
        }

        /* access modifiers changed from: package-private */
        @Override // a.b.h.d.a.b.c
        public void m() {
            int[][] iArr = this.J;
            int[][] stateSets = new int[iArr.length][];
            for (int i = iArr.length - 1; i >= 0; i--) {
                int[][] iArr2 = this.J;
                stateSets[i] = iArr2[i] != null ? (int[]) iArr2[i].clone() : null;
            }
            this.J = stateSets;
        }

        /* access modifiers changed from: package-private */
        public int a(int[] stateSet, Drawable drawable) {
            int pos = a(drawable);
            this.J[pos] = stateSet;
            return pos;
        }

        /* access modifiers changed from: package-private */
        public int a(int[] stateSet) {
            int[][] stateSets = this.J;
            int count = d();
            for (int i = 0; i < count; i++) {
                if (StateSet.stateSetMatches(stateSets[i], stateSet)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new e(this, null);
        }

        public Drawable newDrawable(Resources res) {
            return new e(this, res);
        }

        @Override // a.b.h.d.a.b.c
        public void a(int oldSize, int newSize) {
            super.a(oldSize, newSize);
            int[][] newStateSets = new int[newSize][];
            System.arraycopy(this.J, 0, newStateSets, 0, oldSize);
            this.J = newStateSets;
        }
    }

    @Override // a.b.h.d.a.b
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: protected */
    @Override // a.b.h.d.a.b
    public void a(b.c state) {
        super.a(state);
        if (state instanceof a) {
            this.o = (a) state;
        }
    }

    e(a state, Resources res) {
        a(new a(state, this, res));
        onStateChange(getState());
    }

    e(a state) {
        if (state != null) {
            a(state);
        }
    }
}
