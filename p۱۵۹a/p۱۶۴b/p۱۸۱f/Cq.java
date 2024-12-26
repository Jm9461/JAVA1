package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm;

/* renamed from: a.b.f.q, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cq extends AbstractCm {

    /* renamed from: N, reason: contains not printable characters */
    int f۸۶۲۲N;

    /* renamed from: L, reason: contains not printable characters */
    private ArrayList<AbstractCm> f۸۶۲۰L = new ArrayList<>();

    /* renamed from: M, reason: contains not printable characters */
    private boolean f۸۶۲۱M = true;

    /* renamed from: O, reason: contains not printable characters */
    boolean f۸۶۲۳O = false;

    /* renamed from: P, reason: contains not printable characters */
    private int f۸۶۲۴P = 0;

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ AbstractCm mo۸۳۰۶a(long j) {
        mo۸۳۰۶a(j);
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cq m۸۳۱۹b(int ordering) {
        if (ordering != 0) {
            if (ordering == 1) {
                this.f۸۶۲۱M = false;
            } else {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + ordering);
            }
        } else {
            this.f۸۶۲۱M = true;
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cq m۸۳۰۸a(AbstractCm transition) {
        this.f۸۶۲۰L.add(transition);
        transition.f۸۵۹۸t = this;
        long j = this.f۸۵۸۳e;
        if (j >= 0) {
            transition.mo۸۳۰۶a(j);
        }
        if ((this.f۸۶۲۴P & 1) != 0) {
            transition.mo۸۳۰۹a(m۸۲۶۹d());
        }
        if ((this.f۸۶۲۴P & 2) != 0) {
            transition.mo۸۳۱۴a(m۸۲۷۳g());
        }
        if ((this.f۸۶۲۴P & 4) != 0) {
            transition.mo۸۳۱۲a(m۸۲۷۲f());
        }
        if ((this.f۸۶۲۴P & 8) != 0) {
            transition.mo۸۳۱۳a(m۸۲۶۵c());
        }
        return this;
    }

    /* renamed from: q, reason: contains not printable characters */
    public int m۸۳۳۰q() {
        return this.f۸۶۲۰L.size();
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCm m۸۳۰۱a(int index) {
        if (index < 0 || index >= this.f۸۶۲۰L.size()) {
            return null;
        }
        return this.f۸۶۲۰L.get(index);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public Cq mo۸۳۰۶a(long duration) {
        super.mo۸۳۰۶a(duration);
        if (this.f۸۵۸۳e >= 0) {
            int numTransitions = this.f۸۶۲۰L.size();
            for (int i = 0; i < numTransitions; i++) {
                this.f۸۶۲۰L.get(i).mo۸۳۰۶a(duration);
            }
        }
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: b, reason: contains not printable characters */
    public Cq mo۸۳۲۰b(long startDelay) {
        super.mo۸۳۲۰b(startDelay);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public Cq mo۸۳۰۹a(TimeInterpolator interpolator) {
        this.f۸۶۲۴P |= 1;
        ArrayList<AbstractCm> arrayList = this.f۸۶۲۰L;
        if (arrayList != null) {
            int numTransitions = arrayList.size();
            for (int i = 0; i < numTransitions; i++) {
                this.f۸۶۲۰L.get(i).mo۸۳۰۹a(interpolator);
            }
        }
        super.mo۸۳۰۹a(interpolator);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public Cq mo۸۳۱۰a(View target) {
        for (int i = 0; i < this.f۸۶۲۰L.size(); i++) {
            this.f۸۶۲۰L.get(i).mo۸۳۱۰a(target);
        }
        super.mo۸۳۱۰a(target);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public Cq mo۸۳۰۷a(AbstractCm.f listener) {
        super.mo۸۳۰۷a(listener);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: d, reason: contains not printable characters */
    public Cq mo۸۳۲۷d(View target) {
        for (int i = 0; i < this.f۸۶۲۰L.size(); i++) {
            this.f۸۶۲۰L.get(i).mo۸۳۲۷d(target);
        }
        super.mo۸۳۲۷d(target);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: b, reason: contains not printable characters */
    public Cq mo۸۳۲۱b(AbstractCm.f listener) {
        super.mo۸۳۲۱b(listener);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۱۲a(AbstractCg pathMotion) {
        super.mo۸۳۱۲a(pathMotion);
        this.f۸۶۲۴P |= 4;
        for (int i = 0; i < this.f۸۶۲۰L.size(); i++) {
            this.f۸۶۲۰L.get(i).mo۸۳۱۲a(pathMotion);
        }
    }

    /* renamed from: r, reason: contains not printable characters */
    private void m۸۳۰۰r() {
        b listener = new b(this);
        Iterator<AbstractCm> it = this.f۸۶۲۰L.iterator();
        while (it.hasNext()) {
            AbstractCm childTransition = it.next();
            childTransition.mo۸۳۰۷a(listener);
        }
        this.f۸۶۲۲N = this.f۸۶۲۰L.size();
    }

    /* renamed from: a.b.f.q$b */
    static class b extends Cn {

        /* renamed from: a, reason: contains not printable characters */
        Cq f۸۶۲۶a;

        b(Cq transitionSet) {
            this.f۸۶۲۶a = transitionSet;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.Cn, p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: c, reason: contains not printable characters */
        public void mo۸۳۳۳c(AbstractCm transition) {
            Cq cq = this.f۸۶۲۶a;
            if (!cq.f۸۶۲۳O) {
                cq.m۸۲۸۱p();
                this.f۸۶۲۶a.f۸۶۲۳O = true;
            }
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: b, reason: contains not printable characters */
        public void mo۸۳۳۲b(AbstractCm transition) {
            Cq cq = this.f۸۶۲۶a;
            cq.f۸۶۲۲N--;
            if (cq.f۸۶۲۲N == 0) {
                cq.f۸۶۲۳O = false;
                cq.m۸۲۴۸a();
            }
            transition.mo۸۳۲۱b(this);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    protected void mo۸۳۱۶a(ViewGroup sceneRoot, Ct startValues, Ct endValues, ArrayList<Cs> arrayList, ArrayList<Cs> arrayList2) {
        long startDelay = m۸۲۷۴h();
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            AbstractCm childTransition = this.f۸۶۲۰L.get(i);
            if (startDelay > 0 && (this.f۸۶۲۱M || i == 0)) {
                long childStartDelay = childTransition.m۸۲۷۴h();
                if (childStartDelay > 0) {
                    childTransition.mo۸۳۲۰b(startDelay + childStartDelay);
                } else {
                    childTransition.mo۸۳۲۰b(startDelay);
                }
            }
            childTransition.mo۸۳۱۶a(sceneRoot, startValues, endValues, arrayList, arrayList2);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: o, reason: contains not printable characters */
    protected void mo۸۳۲۹o() {
        if (this.f۸۶۲۰L.isEmpty()) {
            m۸۲۸۱p();
            m۸۲۴۸a();
            return;
        }
        m۸۳۰۰r();
        if (!this.f۸۶۲۱M) {
            for (int i = 1; i < this.f۸۶۲۰L.size(); i++) {
                AbstractCm previousTransition = this.f۸۶۲۰L.get(i - 1);
                AbstractCm nextTransition = this.f۸۶۲۰L.get(i);
                previousTransition.mo۸۳۰۷a(new a(this, nextTransition));
            }
            AbstractCm firstTransition = this.f۸۶۲۰L.get(0);
            if (firstTransition != null) {
                firstTransition.mo۸۳۲۹o();
                return;
            }
            return;
        }
        Iterator<AbstractCm> it = this.f۸۶۲۰L.iterator();
        while (it.hasNext()) {
            AbstractCm childTransition = it.next();
            childTransition.mo۸۳۲۹o();
        }
    }

    /* renamed from: a.b.f.q$a */
    class a extends Cn {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ AbstractCm f۸۶۲۵a;

        a(Cq this$0, AbstractCm abstractCm) {
            this.f۸۶۲۵a = abstractCm;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: b, reason: contains not printable characters */
        public void mo۸۳۳۲b(AbstractCm transition) {
            this.f۸۶۲۵a.mo۸۳۲۹o();
            transition.mo۸۳۲۱b(this);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: c, reason: contains not printable characters */
    public void mo۸۳۲۳c(Cs transitionValues) {
        if (m۸۲۶۴b(transitionValues.f۸۶۳۱b)) {
            Iterator<AbstractCm> it = this.f۸۶۲۰L.iterator();
            while (it.hasNext()) {
                AbstractCm childTransition = it.next();
                if (childTransition.m۸۲۶۴b(transitionValues.f۸۶۳۱b)) {
                    childTransition.mo۸۳۲۳c(transitionValues);
                    transitionValues.f۸۶۳۲c.add(childTransition);
                }
            }
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۱۵a(Cs transitionValues) {
        if (m۸۲۶۴b(transitionValues.f۸۶۳۱b)) {
            Iterator<AbstractCm> it = this.f۸۶۲۰L.iterator();
            while (it.hasNext()) {
                AbstractCm childTransition = it.next();
                if (childTransition.m۸۲۶۴b(transitionValues.f۸۶۳۱b)) {
                    childTransition.mo۸۳۱۵a(transitionValues);
                    transitionValues.f۸۶۳۲c.add(childTransition);
                }
            }
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: b, reason: contains not printable characters */
    void mo۸۳۲۲b(Cs transitionValues) {
        super.mo۸۳۲۲b(transitionValues);
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f۸۶۲۰L.get(i).mo۸۳۲۲b(transitionValues);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: c, reason: contains not printable characters */
    public void mo۸۳۲۴c(View sceneRoot) {
        super.mo۸۳۲۴c(sceneRoot);
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f۸۶۲۰L.get(i).mo۸۳۲۴c(sceneRoot);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: e, reason: contains not printable characters */
    public void mo۸۳۲۸e(View sceneRoot) {
        super.mo۸۳۲۸e(sceneRoot);
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f۸۶۲۰L.get(i).mo۸۳۲۸e(sceneRoot);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۱۴a(AbstractCp propagation) {
        super.mo۸۳۱۴a(propagation);
        this.f۸۶۲۴P |= 2;
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f۸۶۲۰L.get(i).mo۸۳۱۴a(propagation);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۱۳a(AbstractCm.e epicenterCallback) {
        super.mo۸۳۱۳a(epicenterCallback);
        this.f۸۶۲۴P |= 8;
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f۸۶۲۰L.get(i).mo۸۳۱۳a(epicenterCallback);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    String mo۸۳۱۱a(String indent) {
        String result = super.mo۸۳۱۱a(indent);
        for (int i = 0; i < this.f۸۶۲۰L.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(result);
            sb.append("\n");
            sb.append(this.f۸۶۲۰L.get(i).mo۸۳۱۱a(indent + "  "));
            result = sb.toString();
        }
        return result;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: clone */
    public AbstractCm mo۸۳۲۵clone() {
        Cq clone = (Cq) super.mo۸۳۲۵clone();
        clone.f۸۶۲۰L = new ArrayList<>();
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            clone.m۸۳۰۸a(this.f۸۶۲۰L.get(i).mo۸۳۲۵clone());
        }
        return clone;
    }
}
