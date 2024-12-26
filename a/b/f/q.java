package a.b.f;

import a.b.f.m;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class q extends m {
    private ArrayList<m> L = new ArrayList<>();
    private boolean M = true;
    int N;
    boolean O = false;
    private int P = 0;

    public q b(int ordering) {
        if (ordering == 0) {
            this.M = true;
        } else if (ordering == 1) {
            this.M = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + ordering);
        }
        return this;
    }

    public q a(m transition) {
        this.L.add(transition);
        transition.t = this;
        long j = this.f۲۴۳e;
        if (j >= 0) {
            transition.a(j);
        }
        if ((this.P & 1) != 0) {
            transition.a(d());
        }
        if ((this.P & 2) != 0) {
            transition.a(g());
        }
        if ((this.P & 4) != 0) {
            transition.a(f());
        }
        if ((this.P & 8) != 0) {
            transition.a(c());
        }
        return this;
    }

    public int q() {
        return this.L.size();
    }

    public m a(int index) {
        if (index < 0 || index >= this.L.size()) {
            return null;
        }
        return this.L.get(index);
    }

    @Override // a.b.f.m
    public q a(long duration) {
        super.a(duration);
        if (this.f۲۴۳e >= 0) {
            int numTransitions = this.L.size();
            for (int i = 0; i < numTransitions; i++) {
                this.L.get(i).a(duration);
            }
        }
        return this;
    }

    @Override // a.b.f.m
    public q b(long startDelay) {
        super.b(startDelay);
        return this;
    }

    @Override // a.b.f.m
    public q a(TimeInterpolator interpolator) {
        this.P |= 1;
        ArrayList<m> arrayList = this.L;
        if (arrayList != null) {
            int numTransitions = arrayList.size();
            for (int i = 0; i < numTransitions; i++) {
                this.L.get(i).a(interpolator);
            }
        }
        super.a(interpolator);
        return this;
    }

    @Override // a.b.f.m
    public q a(View target) {
        for (int i = 0; i < this.L.size(); i++) {
            this.L.get(i).a(target);
        }
        super.a(target);
        return this;
    }

    @Override // a.b.f.m
    public q a(m.f listener) {
        super.a(listener);
        return this;
    }

    @Override // a.b.f.m
    public q d(View target) {
        for (int i = 0; i < this.L.size(); i++) {
            this.L.get(i).d(target);
        }
        super.d(target);
        return this;
    }

    @Override // a.b.f.m
    public q b(m.f listener) {
        super.b(listener);
        return this;
    }

    @Override // a.b.f.m
    public void a(g pathMotion) {
        super.a(pathMotion);
        this.P |= 4;
        for (int i = 0; i < this.L.size(); i++) {
            this.L.get(i).a(pathMotion);
        }
    }

    private void r() {
        b listener = new b(this);
        Iterator<m> it = this.L.iterator();
        while (it.hasNext()) {
            it.next().a(listener);
        }
        this.N = this.L.size();
    }

    /* access modifiers changed from: package-private */
    public static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        q f۲۶۳a;

        b(q transitionSet) {
            this.f۲۶۳a = transitionSet;
        }

        @Override // a.b.f.m.f, a.b.f.n
        public void c(m transition) {
            q qVar = this.f۲۶۳a;
            if (!qVar.O) {
                qVar.p();
                this.f۲۶۳a.O = true;
            }
        }

        @Override // a.b.f.m.f
        public void b(m transition) {
            q qVar = this.f۲۶۳a;
            qVar.N--;
            if (qVar.N == 0) {
                qVar.O = false;
                qVar.a();
            }
            transition.b(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // a.b.f.m
    public void a(ViewGroup sceneRoot, t startValues, t endValues, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long startDelay = h();
        int numTransitions = this.L.size();
        for (int i = 0; i < numTransitions; i++) {
            m childTransition = this.L.get(i);
            if (startDelay > 0 && (this.M || i == 0)) {
                long childStartDelay = childTransition.h();
                if (childStartDelay > 0) {
                    childTransition.b(startDelay + childStartDelay);
                } else {
                    childTransition.b(startDelay);
                }
            }
            childTransition.a(sceneRoot, startValues, endValues, arrayList, arrayList2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // a.b.f.m
    public void o() {
        if (this.L.isEmpty()) {
            p();
            a();
            return;
        }
        r();
        if (!this.M) {
            for (int i = 1; i < this.L.size(); i++) {
                this.L.get(i - 1).a(new a(this, this.L.get(i)));
            }
            m firstTransition = this.L.get(0);
            if (firstTransition != null) {
                firstTransition.o();
                return;
            }
            return;
        }
        Iterator<m> it = this.L.iterator();
        while (it.hasNext()) {
            it.next().o();
        }
    }

    class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f۲۶۲a;

        a(q this$0, m mVar) {
            this.f۲۶۲a = mVar;
        }

        @Override // a.b.f.m.f
        public void b(m transition) {
            this.f۲۶۲a.o();
            transition.b(this);
        }
    }

    @Override // a.b.f.m
    public void c(s transitionValues) {
        if (b(transitionValues.f۲۶۸b)) {
            Iterator<m> it = this.L.iterator();
            while (it.hasNext()) {
                m childTransition = it.next();
                if (childTransition.b(transitionValues.f۲۶۸b)) {
                    childTransition.c(transitionValues);
                    transitionValues.f۲۶۹c.add(childTransition);
                }
            }
        }
    }

    @Override // a.b.f.m
    public void a(s transitionValues) {
        if (b(transitionValues.f۲۶۸b)) {
            Iterator<m> it = this.L.iterator();
            while (it.hasNext()) {
                m childTransition = it.next();
                if (childTransition.b(transitionValues.f۲۶۸b)) {
                    childTransition.a(transitionValues);
                    transitionValues.f۲۶۹c.add(childTransition);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // a.b.f.m
    public void b(s transitionValues) {
        super.b(transitionValues);
        int numTransitions = this.L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.L.get(i).b(transitionValues);
        }
    }

    @Override // a.b.f.m
    public void c(View sceneRoot) {
        super.c(sceneRoot);
        int numTransitions = this.L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.L.get(i).c(sceneRoot);
        }
    }

    @Override // a.b.f.m
    public void e(View sceneRoot) {
        super.e(sceneRoot);
        int numTransitions = this.L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.L.get(i).e(sceneRoot);
        }
    }

    @Override // a.b.f.m
    public void a(p propagation) {
        super.a(propagation);
        this.P |= 2;
        int numTransitions = this.L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.L.get(i).a(propagation);
        }
    }

    @Override // a.b.f.m
    public void a(m.e epicenterCallback) {
        super.a(epicenterCallback);
        this.P |= 8;
        int numTransitions = this.L.size();
        for (int i = 0; i < numTransitions; i++) {
            this.L.get(i).a(epicenterCallback);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // a.b.f.m
    public String a(String indent) {
        String result = super.a(indent);
        for (int i = 0; i < this.L.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(result);
            sb.append("\n");
            sb.append(this.L.get(i).a(indent + "  "));
            result = sb.toString();
        }
        return result;
    }

    @Override // a.b.f.m, a.b.f.m, java.lang.Object
    public m clone() {
        q clone = (q) super.clone();
        clone.L = new ArrayList<>();
        int numTransitions = this.L.size();
        for (int i = 0; i < numTransitions; i++) {
            clone.a(this.L.get(i).clone());
        }
        return clone;
    }
}
