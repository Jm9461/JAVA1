package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm;

/* renamed from: a.b.f.q  reason: invalid class name */
public class Cq extends AbstractCm {

    /* renamed from: L  reason: contains not printable characters */
    private ArrayList<AbstractCm> f۸۶۲۰L = new ArrayList<>();

    /* renamed from: M  reason: contains not printable characters */
    private boolean f۸۶۲۱M = true;

    /* renamed from: N  reason: contains not printable characters */
    int f۸۶۲۲N;

    /* renamed from: O  reason: contains not printable characters */
    boolean f۸۶۲۳O = false;

    /* renamed from: P  reason: contains not printable characters */
    private int f۸۶۲۴P = 0;

    /* renamed from: b  reason: contains not printable characters */
    public Cq m۱۰۳۸۵b(int ordering) {
        if (ordering == 0) {
            this.f۸۶۲۱M = true;
        } else if (ordering == 1) {
            this.f۸۶۲۱M = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + ordering);
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cq m۱۰۳۷۴a(AbstractCm transition) {
        this.f۸۶۲۰L.add(transition);
        transition.f۸۵۹۸t = this;
        long j = this.f۸۵۸۳e;
        if (j >= 0) {
            transition.m۱۰۳۰۸a(j);
        }
        if ((this.f۸۶۲۴P & 1) != 0) {
            transition.m۱۰۳۱۰a(m۱۰۳۳۶d());
        }
        if ((this.f۸۶۲۴P & 2) != 0) {
            transition.m۱۰۳۱۸a(m۱۰۳۴۰g());
        }
        if ((this.f۸۶۲۴P & 4) != 0) {
            transition.m۱۰۳۱۶a(m۱۰۳۳۹f());
        }
        if ((this.f۸۶۲۴P & 8) != 0) {
            transition.m۱۰۳۱۷a(m۱۰۳۳۲c());
        }
        return this;
    }

    /* renamed from: q  reason: contains not printable characters */
    public int m۱۰۳۹۵q() {
        return this.f۸۶۲۰L.size();
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCm m۱۰۳۶۷a(int index) {
        if (index < 0 || index >= this.f۸۶۲۰L.size()) {
            return null;
        }
        return this.f۸۶۲۰L.get(index);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public Cq m۱۰۳۷۲a(long duration) {
        super.m۱۰۳۰۸a(duration);
        if (this.f۸۵۸۳e >= 0) {
            int numTransitions = this.f۸۶۲۰L.size();
            for (int i = 0; i < numTransitions; i++) {
                this.f۸۶۲۰L.get(i).m۱۰۳۰۸a(duration);
            }
        }
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: b  reason: contains not printable characters */
    public Cq m۱۰۳۸۳b(long startDelay) {
        super.m۱۰۳۲۷b(startDelay);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public Cq m۱۰۳۷۰a(TimeInterpolator interpolator) {
        this.f۸۶۲۴P |= 1;
        ArrayList<AbstractCm> arrayList = this.f۸۶۲۰L;
        if (arrayList != null) {
            int numTransitions = arrayList.size();
            for (int i = 0; i < numTransitions; i++) {
                this.f۸۶۲۰L.get(i).m۱۰۳۱۰a(interpolator);
            }
        }
        super.m۱۰۳۱۰a(interpolator);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public Cq m۱۰۳۷۱a(View target) {
        for (int i = 0; i < this.f۸۶۲۰L.size(); i++) {
            this.f۸۶۲۰L.get(i).m۱۰۳۱۱a(target);
        }
        super.m۱۰۳۱۱a(target);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public Cq m۱۰۳۶۹a(AbstractCm.AbstractCf listener) {
        super.m۱۰۳۰۹a(listener);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: d  reason: contains not printable characters */
    public Cq m۱۰۳۹۱d(View target) {
        for (int i = 0; i < this.f۸۶۲۰L.size(); i++) {
            this.f۸۶۲۰L.get(i).m۱۰۳۳۵d(target);
        }
        super.m۱۰۳۳۵d(target);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: b  reason: contains not printable characters */
    public Cq m۱۰۳۸۴b(AbstractCm.AbstractCf listener) {
        super.m۱۰۳۲۸b(listener);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۷۸a(AbstractCg pathMotion) {
        super.m۱۰۳۱۶a(pathMotion);
        this.f۸۶۲۴P |= 4;
        for (int i = 0; i < this.f۸۶۲۰L.size(); i++) {
            this.f۸۶۲۰L.get(i).m۱۰۳۱۶a(pathMotion);
        }
    }

    /* renamed from: r  reason: contains not printable characters */
    private void m۱۰۳۶۶r() {
        Cb listener = new Cb(this);
        Iterator<AbstractCm> it = this.f۸۶۲۰L.iterator();
        while (it.hasNext()) {
            it.next().m۱۰۳۰۹a(listener);
        }
        this.f۸۶۲۲N = this.f۸۶۲۰L.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.f.q$b  reason: invalid class name */
    public static class Cb extends Cn {

        /* renamed from: a  reason: contains not printable characters */
        Cq f۸۶۲۶a;

        Cb(Cq transitionSet) {
            this.f۸۶۲۶a = transitionSet;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf, p۰۰۰a.p۰۰۵b.p۰۲۲f.Cn
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۰۳۹۸c(AbstractCm transition) {
            Cq qVar = this.f۸۶۲۶a;
            if (!qVar.f۸۶۲۳O) {
                qVar.m۱۰۳۴۸p();
                this.f۸۶۲۶a.f۸۶۲۳O = true;
            }
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۳۹۷b(AbstractCm transition) {
            Cq qVar = this.f۸۶۲۶a;
            qVar.f۸۶۲۲N--;
            if (qVar.f۸۶۲۲N == 0) {
                qVar.f۸۶۲۳O = false;
                qVar.m۱۰۳۱۵a();
            }
            transition.m۱۰۳۲۸b(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۸۲a(ViewGroup sceneRoot, Ct startValues, Ct endValues, ArrayList<Cs> arrayList, ArrayList<Cs> arrayList2) {
        long startDelay = m۱۰۳۴۱h();
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            AbstractCm childTransition = this.f۸۶۲۰L.get(i);
            if (startDelay > 0 && (this.f۸۶۲۱M || i == 0)) {
                long childStartDelay = childTransition.m۱۰۳۴۱h();
                if (childStartDelay > 0) {
                    childTransition.m۱۰۳۲۷b(startDelay + childStartDelay);
                } else {
                    childTransition.m۱۰۳۲۷b(startDelay);
                }
            }
            childTransition.m۱۰۳۲۲a(sceneRoot, startValues, endValues, arrayList, arrayList2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: o  reason: contains not printable characters */
    public void m۱۰۳۹۴o() {
        if (this.f۸۶۲۰L.isEmpty()) {
            m۱۰۳۴۸p();
            m۱۰۳۱۵a();
            return;
        }
        m۱۰۳۶۶r();
        if (!this.f۸۶۲۱M) {
            for (int i = 1; i < this.f۸۶۲۰L.size(); i++) {
                this.f۸۶۲۰L.get(i - 1).m۱۰۳۰۹a(new Ca(this, this.f۸۶۲۰L.get(i)));
            }
            AbstractCm firstTransition = this.f۸۶۲۰L.get(0);
            if (firstTransition != null) {
                firstTransition.m۱۰۳۴۷o();
                return;
            }
            return;
        }
        Iterator<AbstractCm> it = this.f۸۶۲۰L.iterator();
        while (it.hasNext()) {
            it.next().m۱۰۳۴۷o();
        }
    }

    /* renamed from: a.b.f.q$a  reason: invalid class name */
    class Ca extends Cn {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCm f۸۶۲۵a;

        Ca(Cq this$0, AbstractCm mVar) {
            this.f۸۶۲۵a = mVar;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۳۹۶b(AbstractCm transition) {
            this.f۸۶۲۵a.m۱۰۳۴۷o();
            transition.m۱۰۳۲۸b(this);
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۳۸۹c(Cs transitionValues) {
        if (m۱۰۳۳۱b(transitionValues.f۸۶۳۱b)) {
            Iterator<AbstractCm> it = this.f۸۶۲۰L.iterator();
            while (it.hasNext()) {
                AbstractCm childTransition = it.next();
                if (childTransition.m۱۰۳۳۱b(transitionValues.f۸۶۳۱b)) {
                    childTransition.m۱۰۳۳۳c(transitionValues);
                    transitionValues.f۸۶۳۲c.add(childTransition);
                }
            }
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۸۱a(Cs transitionValues) {
        if (m۱۰۳۳۱b(transitionValues.f۸۶۳۱b)) {
            Iterator<AbstractCm> it = this.f۸۶۲۰L.iterator();
            while (it.hasNext()) {
                AbstractCm childTransition = it.next();
                if (childTransition.m۱۰۳۳۱b(transitionValues.f۸۶۳۱b)) {
                    childTransition.m۱۰۳۱۹a(transitionValues);
                    transitionValues.f۸۶۳۲c.add(childTransition);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۳۸۸b(Cs transitionValues) {
        super.m۱۰۳۳۰b(transitionValues);
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f۸۶۲۰L.get(i).m۱۰۳۳۰b(transitionValues);
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۳۹۰c(View sceneRoot) {
        super.m۱۰۳۳۴c(sceneRoot);
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f۸۶۲۰L.get(i).m۱۰۳۳۴c(sceneRoot);
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۰۳۹۳e(View sceneRoot) {
        super.m۱۰۳۳۸e(sceneRoot);
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f۸۶۲۰L.get(i).m۱۰۳۳۸e(sceneRoot);
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۸۰a(AbstractCp propagation) {
        super.m۱۰۳۱۸a(propagation);
        this.f۸۶۲۴P |= 2;
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f۸۶۲۰L.get(i).m۱۰۳۱۸a(propagation);
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۷۹a(AbstractCm.AbstractCe epicenterCallback) {
        super.m۱۰۳۱۷a(epicenterCallback);
        this.f۸۶۲۴P |= 8;
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f۸۶۲۰L.get(i).m۱۰۳۱۷a(epicenterCallback);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public String m۱۰۳۷۷a(String indent) {
        String result = super.m۱۰۳۱۴a(indent);
        for (int i = 0; i < this.f۸۶۲۰L.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(result);
            sb.append("\n");
            sb.append(this.f۸۶۲۰L.get(i).m۱۰۳۱۴a(indent + "  "));
            result = sb.toString();
        }
        return result;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm, p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm, java.lang.Object
    public AbstractCm clone() {
        Cq clone = (Cq) super.clone();
        clone.f۸۶۲۰L = new ArrayList<>();
        int numTransitions = this.f۸۶۲۰L.size();
        for (int i = 0; i < numTransitions; i++) {
            clone.m۱۰۳۷۴a(this.f۸۶۲۰L.get(i).clone());
        }
        return clone;
    }
}
