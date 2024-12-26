package b.h.a;

import android.view.animation.Interpolator;
import b.h.a.a;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<a> f۲۵۲۰d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private HashMap<a, f> f۲۵۲۱e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<f> f۲۵۲۲f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<f> f۲۵۲۳g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f۲۵۲۴h = true;
    private b i = null;
    boolean j = false;
    private boolean k;
    private long l = 0;
    private m m = null;

    public void a(a... items) {
        if (items != null) {
            this.f۲۵۲۴h = true;
            C۰۰۵۳c builder = a(items[0]);
            for (int i2 = 1; i2 < items.length; i2++) {
                builder.a(items[i2]);
            }
        }
    }

    @Override // b.h.a.a
    public void a(Interpolator interpolator) {
        Iterator i$ = this.f۲۵۲۲f.iterator();
        while (i$.hasNext()) {
            i$.next().f۲۵۳۷c.a(interpolator);
        }
    }

    public C۰۰۵۳c a(a anim) {
        if (anim == null) {
            return null;
        }
        this.f۲۵۲۴h = true;
        return new C۰۰۵۳c(anim);
    }

    public void b(long startDelay) {
        this.l = startDelay;
    }

    @Override // b.h.a.a
    public c a(long duration) {
        if (duration >= 0) {
            Iterator i$ = this.f۲۵۲۲f.iterator();
            while (i$.hasNext()) {
                i$.next().f۲۵۳۷c.a(duration);
            }
            return this;
        }
        throw new IllegalArgumentException("duration must be a value of zero or greater");
    }

    @Override // b.h.a.a
    public void b() {
        ArrayList<a.AbstractC۰۰۵۲a> arrayList;
        this.j = false;
        c();
        int numSortedNodes = this.f۲۵۲۳g.size();
        for (int i2 = 0; i2 < numSortedNodes; i2++) {
            f node = this.f۲۵۲۳g.get(i2);
            ArrayList<Animator.AnimatorListener> oldListeners = node.f۲۵۳۷c.a();
            if (oldListeners != null && oldListeners.size() > 0) {
                Iterator i$ = new ArrayList<>(oldListeners).iterator();
                while (i$.hasNext()) {
                    a.AbstractC۰۰۵۲a listener = (a.AbstractC۰۰۵۲a) i$.next();
                    if ((listener instanceof e) || (listener instanceof b)) {
                        node.f۲۵۳۷c.b(listener);
                    }
                }
            }
        }
        ArrayList<AnimatorSet.Node> nodesToStart = new ArrayList<>();
        for (int i3 = 0; i3 < numSortedNodes; i3++) {
            f node2 = this.f۲۵۲۳g.get(i3);
            if (this.i == null) {
                this.i = new b(this);
            }
            ArrayList<d> arrayList2 = node2.f۲۵۳۸d;
            if (arrayList2 == null || arrayList2.size() == 0) {
                nodesToStart.add(node2);
            } else {
                int numDependencies = node2.f۲۵۳۸d.size();
                for (int j2 = 0; j2 < numDependencies; j2++) {
                    d dependency = node2.f۲۵۳۸d.get(j2);
                    dependency.f۲۵۳۲a.f۲۵۳۷c.a(new e(this, node2, dependency.f۲۵۳۳b));
                }
                node2.f۲۵۳۹e = (ArrayList) node2.f۲۵۳۸d.clone();
            }
            node2.f۲۵۳۷c.a(this.i);
        }
        if (this.l <= 0) {
            Iterator i$2 = nodesToStart.iterator();
            while (i$2.hasNext()) {
                f node3 = (f) i$2.next();
                node3.f۲۵۳۷c.b();
                this.f۲۵۲۰d.add(node3.f۲۵۳۷c);
            }
        } else {
            this.m = m.b(0.0f, 1.0f);
            this.m.a(this.l);
            this.m.a(new a(nodesToStart));
            this.m.b();
        }
        ArrayList<a.AbstractC۰۰۵۲a> arrayList3 = this.f۲۵۱۹c;
        if (arrayList3 != null) {
            ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList3.clone();
            int numListeners = tmpListeners.size();
            for (int i4 = 0; i4 < numListeners; i4++) {
                ((a.AbstractC۰۰۵۲a) tmpListeners.get(i4)).c(this);
            }
        }
        if (this.f۲۵۲۲f.size() == 0 && this.l == 0 && (arrayList = this.f۲۵۱۹c) != null) {
            ArrayList<Animator.AnimatorListener> tmpListeners2 = (ArrayList) arrayList.clone();
            int numListeners2 = tmpListeners2.size();
            for (int i5 = 0; i5 < numListeners2; i5++) {
                ((a.AbstractC۰۰۵۲a) tmpListeners2.get(i5)).a(this);
            }
        }
    }

    class a extends b {

        /* renamed from: a  reason: collision with root package name */
        boolean f۲۵۲۵a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f۲۵۲۶b;

        a(ArrayList arrayList) {
            this.f۲۵۲۶b = arrayList;
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void a(a anim) {
            if (!this.f۲۵۲۵a) {
                int numNodes = this.f۲۵۲۶b.size();
                for (int i = 0; i < numNodes; i++) {
                    f node = (f) this.f۲۵۲۶b.get(i);
                    node.f۲۵۳۷c.b();
                    c.this.f۲۵۲۰d.add(node.f۲۵۳۷c);
                }
            }
        }
    }

    @Override // b.h.a.a, b.h.a.a, java.lang.Object
    public c clone() {
        c anim = (c) super.clone();
        anim.f۲۵۲۴h = true;
        anim.j = false;
        anim.k = false;
        anim.f۲۵۲۰d = new ArrayList<>();
        anim.f۲۵۲۱e = new HashMap<>();
        anim.f۲۵۲۲f = new ArrayList<>();
        anim.f۲۵۲۳g = new ArrayList<>();
        HashMap<AnimatorSet.Node, AnimatorSet.Node> nodeCloneMap = new HashMap<>();
        Iterator i$ = this.f۲۵۲۲f.iterator();
        while (i$.hasNext()) {
            f node = (f) i$.next();
            f nodeClone = node.clone();
            nodeCloneMap.put(node, nodeClone);
            anim.f۲۵۲۲f.add(nodeClone);
            anim.f۲۵۲۱e.put(nodeClone.f۲۵۳۷c, nodeClone);
            nodeClone.f۲۵۳۸d = null;
            nodeClone.f۲۵۳۹e = null;
            nodeClone.f۲۵۴۱g = null;
            nodeClone.f۲۵۴۰f = null;
            ArrayList<Animator.AnimatorListener> cloneListeners = nodeClone.f۲۵۳۷c.a();
            if (cloneListeners != null) {
                ArrayList<Animator.AnimatorListener> listenersToRemove = null;
                Iterator i$2 = cloneListeners.iterator();
                while (i$2.hasNext()) {
                    a.AbstractC۰۰۵۲a listener = (a.AbstractC۰۰۵۲a) i$2.next();
                    if (listener instanceof b) {
                        if (listenersToRemove == null) {
                            listenersToRemove = new ArrayList<>();
                        }
                        listenersToRemove.add(listener);
                    }
                }
                if (listenersToRemove != null) {
                    Iterator i$3 = listenersToRemove.iterator();
                    while (i$3.hasNext()) {
                        cloneListeners.remove((a.AbstractC۰۰۵۲a) i$3.next());
                    }
                }
            }
        }
        Iterator i$4 = this.f۲۵۲۲f.iterator();
        while (i$4.hasNext()) {
            f node2 = i$4.next();
            f nodeClone2 = (f) nodeCloneMap.get(node2);
            ArrayList<d> arrayList = node2.f۲۵۳۸d;
            if (arrayList != null) {
                Iterator i$5 = arrayList.iterator();
                while (i$5.hasNext()) {
                    d dependency = i$5.next();
                    nodeClone2.a(new d((f) nodeCloneMap.get(dependency.f۲۵۳۲a), dependency.f۲۵۳۳b));
                }
            }
        }
        return anim;
    }

    private static class e implements a.AbstractC۰۰۵۲a {

        /* renamed from: a  reason: collision with root package name */
        private c f۲۵۳۴a;

        /* renamed from: b  reason: collision with root package name */
        private f f۲۵۳۵b;

        /* renamed from: c  reason: collision with root package name */
        private int f۲۵۳۶c;

        public e(c animatorSet, f node, int rule) {
            this.f۲۵۳۴a = animatorSet;
            this.f۲۵۳۵b = node;
            this.f۲۵۳۶c = rule;
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void a(a animation) {
            if (this.f۲۵۳۶c == 1) {
                d(animation);
            }
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void b(a animation) {
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void c(a animation) {
            if (this.f۲۵۳۶c == 0) {
                d(animation);
            }
        }

        private void d(a dependencyAnimation) {
            if (!this.f۲۵۳۴a.j) {
                d dependencyToRemove = null;
                int numDependencies = this.f۲۵۳۵b.f۲۵۳۹e.size();
                int i = 0;
                while (true) {
                    if (i >= numDependencies) {
                        break;
                    }
                    d dependency = this.f۲۵۳۵b.f۲۵۳۹e.get(i);
                    if (dependency.f۲۵۳۳b == this.f۲۵۳۶c && dependency.f۲۵۳۲a.f۲۵۳۷c == dependencyAnimation) {
                        dependencyToRemove = dependency;
                        dependencyAnimation.b(this);
                        break;
                    }
                    i++;
                }
                this.f۲۵۳۵b.f۲۵۳۹e.remove(dependencyToRemove);
                if (this.f۲۵۳۵b.f۲۵۳۹e.size() == 0) {
                    this.f۲۵۳۵b.f۲۵۳۷c.b();
                    this.f۲۵۳۴a.f۲۵۲۰d.add(this.f۲۵۳۵b.f۲۵۳۷c);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public class b implements a.AbstractC۰۰۵۲a {

        /* renamed from: a  reason: collision with root package name */
        private c f۲۵۲۸a;

        b(c animatorSet) {
            this.f۲۵۲۸a = animatorSet;
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void a(a animation) {
            animation.b(this);
            c.this.f۲۵۲۰d.remove(animation);
            ((f) this.f۲۵۲۸a.f۲۵۲۱e.get(animation)).f۲۵۴۲h = true;
            if (!c.this.j) {
                ArrayList<AnimatorSet.Node> sortedNodes = this.f۲۵۲۸a.f۲۵۲۳g;
                boolean allDone = true;
                int numSortedNodes = sortedNodes.size();
                int i = 0;
                while (true) {
                    if (i >= numSortedNodes) {
                        break;
                    } else if (!((f) sortedNodes.get(i)).f۲۵۴۲h) {
                        allDone = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (allDone) {
                    ArrayList<a.AbstractC۰۰۵۲a> arrayList = c.this.f۲۵۱۹c;
                    if (arrayList != null) {
                        ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList.clone();
                        int numListeners = tmpListeners.size();
                        for (int i2 = 0; i2 < numListeners; i2++) {
                            ((a.AbstractC۰۰۵۲a) tmpListeners.get(i2)).a(this.f۲۵۲۸a);
                        }
                    }
                    this.f۲۵۲۸a.k = false;
                }
            }
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void b(a animation) {
        }

        @Override // b.h.a.a.AbstractC۰۰۵۲a
        public void c(a animation) {
        }
    }

    private void c() {
        if (this.f۲۵۲۴h) {
            this.f۲۵۲۳g.clear();
            ArrayList<AnimatorSet.Node> roots = new ArrayList<>();
            int numNodes = this.f۲۵۲۲f.size();
            for (int i2 = 0; i2 < numNodes; i2++) {
                f node = this.f۲۵۲۲f.get(i2);
                ArrayList<d> arrayList = node.f۲۵۳۸d;
                if (arrayList == null || arrayList.size() == 0) {
                    roots.add(node);
                }
            }
            ArrayList<AnimatorSet.Node> tmpRoots = new ArrayList<>();
            while (roots.size() > 0) {
                int numRoots = roots.size();
                for (int i3 = 0; i3 < numRoots; i3++) {
                    f root = (f) roots.get(i3);
                    this.f۲۵۲۳g.add(root);
                    ArrayList<f> arrayList2 = root.f۲۵۴۱g;
                    if (arrayList2 != null) {
                        int numDependents = arrayList2.size();
                        for (int j2 = 0; j2 < numDependents; j2++) {
                            f node2 = root.f۲۵۴۱g.get(j2);
                            node2.f۲۵۴۰f.remove(root);
                            if (node2.f۲۵۴۰f.size() == 0) {
                                tmpRoots.add(node2);
                            }
                        }
                    }
                }
                roots.clear();
                roots.addAll(tmpRoots);
                tmpRoots.clear();
            }
            this.f۲۵۲۴h = false;
            if (this.f۲۵۲۳g.size() != this.f۲۵۲۲f.size()) {
                throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
            return;
        }
        int numNodes2 = this.f۲۵۲۲f.size();
        for (int i4 = 0; i4 < numNodes2; i4++) {
            f node3 = this.f۲۵۲۲f.get(i4);
            ArrayList<d> arrayList3 = node3.f۲۵۳۸d;
            if (arrayList3 != null && arrayList3.size() > 0) {
                int numDependencies = node3.f۲۵۳۸d.size();
                for (int j3 = 0; j3 < numDependencies; j3++) {
                    d dependency = node3.f۲۵۳۸d.get(j3);
                    if (node3.f۲۵۴۰f == null) {
                        node3.f۲۵۴۰f = new ArrayList<>();
                    }
                    if (!node3.f۲۵۴۰f.contains(dependency.f۲۵۳۲a)) {
                        node3.f۲۵۴۰f.add(dependency.f۲۵۳۲a);
                    }
                }
            }
            node3.f۲۵۴۲h = false;
        }
    }

    /* access modifiers changed from: private */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public f f۲۵۳۲a;

        /* renamed from: b  reason: collision with root package name */
        public int f۲۵۳۳b;

        public d(f node, int rule) {
            this.f۲۵۳۲a = node;
            this.f۲۵۳۳b = rule;
        }
    }

    /* access modifiers changed from: private */
    public static class f implements Cloneable {

        /* renamed from: c  reason: collision with root package name */
        public a f۲۵۳۷c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<d> f۲۵۳۸d = null;

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<d> f۲۵۳۹e = null;

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<f> f۲۵۴۰f = null;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<f> f۲۵۴۱g = null;

        /* renamed from: h  reason: collision with root package name */
        public boolean f۲۵۴۲h = false;

        public f(a animation) {
            this.f۲۵۳۷c = animation;
        }

        public void a(d dependency) {
            if (this.f۲۵۳۸d == null) {
                this.f۲۵۳۸d = new ArrayList<>();
                this.f۲۵۴۰f = new ArrayList<>();
            }
            this.f۲۵۳۸d.add(dependency);
            if (!this.f۲۵۴۰f.contains(dependency.f۲۵۳۲a)) {
                this.f۲۵۴۰f.add(dependency.f۲۵۳۲a);
            }
            f dependencyNode = dependency.f۲۵۳۲a;
            if (dependencyNode.f۲۵۴۱g == null) {
                dependencyNode.f۲۵۴۱g = new ArrayList<>();
            }
            dependencyNode.f۲۵۴۱g.add(this);
        }

        @Override // java.lang.Object
        public f clone() {
            try {
                f node = (f) super.clone();
                node.f۲۵۳۷c = this.f۲۵۳۷c.clone();
                return node;
            } catch (CloneNotSupportedException e2) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: b.h.a.c$c  reason: collision with other inner class name */
    public class C۰۰۵۳c {

        /* renamed from: a  reason: collision with root package name */
        private f f۲۵۳۰a;

        C۰۰۵۳c(a anim) {
            this.f۲۵۳۰a = (f) c.this.f۲۵۲۱e.get(anim);
            if (this.f۲۵۳۰a == null) {
                this.f۲۵۳۰a = new f(anim);
                c.this.f۲۵۲۱e.put(anim, this.f۲۵۳۰a);
                c.this.f۲۵۲۲f.add(this.f۲۵۳۰a);
            }
        }

        public C۰۰۵۳c a(a anim) {
            f node = (f) c.this.f۲۵۲۱e.get(anim);
            if (node == null) {
                node = new f(anim);
                c.this.f۲۵۲۱e.put(anim, node);
                c.this.f۲۵۲۲f.add(node);
            }
            node.a(new d(this.f۲۵۳۰a, 0));
            return this;
        }
    }
}
