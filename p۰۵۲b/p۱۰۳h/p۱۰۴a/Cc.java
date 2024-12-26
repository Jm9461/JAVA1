package p۰۵۲b.p۱۰۳h.p۱۰۴a;

import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa;

/* renamed from: b.h.a.c  reason: invalid class name */
public final class Cc extends AbstractCa {

    /* renamed from: d  reason: contains not printable characters */
    private ArrayList<AbstractCa> f۱۲۸۶۱d = new ArrayList<>();

    /* renamed from: e  reason: contains not printable characters */
    private HashMap<AbstractCa, Cf> f۱۲۸۶۲e = new HashMap<>();

    /* renamed from: f  reason: contains not printable characters */
    private ArrayList<Cf> f۱۲۸۶۳f = new ArrayList<>();

    /* renamed from: g  reason: contains not printable characters */
    private ArrayList<Cf> f۱۲۸۶۴g = new ArrayList<>();

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۲۸۶۵h = true;

    /* renamed from: i  reason: contains not printable characters */
    private Cb f۱۲۸۶۶i = null;

    /* renamed from: j  reason: contains not printable characters */
    boolean f۱۲۸۶۷j = false;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۱۲۸۶۸k;

    /* renamed from: l  reason: contains not printable characters */
    private long f۱۲۸۶۹l = 0;

    /* renamed from: m  reason: contains not printable characters */
    private Cm f۱۲۸۷۰m = null;

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۲۰۷a(AbstractCa... items) {
        if (items != null) {
            this.f۱۲۸۶۵h = true;
            Cc builder = m۱۶۲۰۴a(items[0]);
            for (int i = 1; i < items.length; i++) {
                builder.m۱۶۲۱۴a(items[i]);
            }
        }
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۲۰۶a(Interpolator interpolator) {
        Iterator i$ = this.f۱۲۸۶۳f.iterator();
        while (i$.hasNext()) {
            i$.next().f۱۲۸۸۳c.m۱۶۱۸۸a(interpolator);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۶۲۰۴a(AbstractCa anim) {
        if (anim == null) {
            return null;
        }
        this.f۱۲۸۶۵h = true;
        return new Cc(anim);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۲۰۹b(long startDelay) {
        this.f۱۲۸۶۹l = startDelay;
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public Cc m۱۶۲۰۳a(long duration) {
        if (duration >= 0) {
            Iterator i$ = this.f۱۲۸۶۳f.iterator();
            while (i$.hasNext()) {
                i$.next().f۱۲۸۸۳c.m۱۶۱۸۶a(duration);
            }
            return this;
        }
        throw new IllegalArgumentException("duration must be a value of zero or greater");
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۲۰۸b() {
        ArrayList<AbstractCa.AbstractCa> arrayList;
        this.f۱۲۸۶۷j = false;
        m۱۶۲۰۱c();
        int numSortedNodes = this.f۱۲۸۶۴g.size();
        for (int i = 0; i < numSortedNodes; i++) {
            Cf node = this.f۱۲۸۶۴g.get(i);
            ArrayList<Animator.AnimatorListener> oldListeners = node.f۱۲۸۸۳c.m۱۶۱۸۷a();
            if (oldListeners != null && oldListeners.size() > 0) {
                Iterator i$ = new ArrayList<>(oldListeners).iterator();
                while (i$.hasNext()) {
                    AbstractCa.AbstractCa listener = (AbstractCa.AbstractCa) i$.next();
                    if ((listener instanceof Ce) || (listener instanceof Cb)) {
                        node.f۱۲۸۸۳c.m۱۶۱۹۱b(listener);
                    }
                }
            }
        }
        ArrayList<AnimatorSet.Node> nodesToStart = new ArrayList<>();
        for (int i2 = 0; i2 < numSortedNodes; i2++) {
            Cf node2 = this.f۱۲۸۶۴g.get(i2);
            if (this.f۱۲۸۶۶i == null) {
                this.f۱۲۸۶۶i = new Cb(this);
            }
            ArrayList<Cd> arrayList2 = node2.f۱۲۸۸۴d;
            if (arrayList2 == null || arrayList2.size() == 0) {
                nodesToStart.add(node2);
            } else {
                int numDependencies = node2.f۱۲۸۸۴d.size();
                for (int j = 0; j < numDependencies; j++) {
                    Cd dependency = node2.f۱۲۸۸۴d.get(j);
                    dependency.f۱۲۸۷۸a.f۱۲۸۸۳c.m۱۶۱۸۹a(new Ce(this, node2, dependency.f۱۲۸۷۹b));
                }
                node2.f۱۲۸۸۵e = (ArrayList) node2.f۱۲۸۸۴d.clone();
            }
            node2.f۱۲۸۸۳c.m۱۶۱۸۹a(this.f۱۲۸۶۶i);
        }
        if (this.f۱۲۸۶۹l <= 0) {
            Iterator i$2 = nodesToStart.iterator();
            while (i$2.hasNext()) {
                Cf node3 = (Cf) i$2.next();
                node3.f۱۲۸۸۳c.m۱۶۱۹۰b();
                this.f۱۲۸۶۱d.add(node3.f۱۲۸۸۳c);
            }
        } else {
            this.f۱۲۸۷۰m = Cm.m۱۶۳۲۷b(0.0f, 1.0f);
            this.f۱۲۸۷۰m.m۱۶۳۳۹a(this.f۱۲۸۶۹l);
            this.f۱۲۸۷۰m.m۱۶۱۸۹a(new Ca(nodesToStart));
            this.f۱۲۸۷۰m.m۱۶۳۴۶b();
        }
        ArrayList<AbstractCa.AbstractCa> arrayList3 = this.f۱۲۸۶۰c;
        if (arrayList3 != null) {
            ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList3.clone();
            int numListeners = tmpListeners.size();
            for (int i3 = 0; i3 < numListeners; i3++) {
                ((AbstractCa.AbstractCa) tmpListeners.get(i3)).m۱۶۱۹۴c(this);
            }
        }
        if (this.f۱۲۸۶۳f.size() == 0 && this.f۱۲۸۶۹l == 0 && (arrayList = this.f۱۲۸۶۰c) != null) {
            ArrayList<Animator.AnimatorListener> tmpListeners2 = (ArrayList) arrayList.clone();
            int numListeners2 = tmpListeners2.size();
            for (int i4 = 0; i4 < numListeners2; i4++) {
                ((AbstractCa.AbstractCa) tmpListeners2.get(i4)).m۱۶۱۹۲a(this);
            }
        }
    }

    /* renamed from: b.h.a.c$a  reason: invalid class name */
    class Ca extends AbstractCb {

        /* renamed from: a  reason: contains not printable characters */
        boolean f۱۲۸۷۱a = false;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۲۸۷۲b;

        Ca(ArrayList arrayList) {
            this.f۱۲۸۷۲b = arrayList;
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۲۱۰a(AbstractCa anim) {
            if (!this.f۱۲۸۷۱a) {
                int numNodes = this.f۱۲۸۷۲b.size();
                for (int i = 0; i < numNodes; i++) {
                    Cf node = (Cf) this.f۱۲۸۷۲b.get(i);
                    node.f۱۲۸۸۳c.m۱۶۱۹۰b();
                    Cc.this.f۱۲۸۶۱d.add(node.f۱۲۸۸۳c);
                }
            }
        }
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa, p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa, java.lang.Object
    public Cc clone() {
        Cc anim = (Cc) super.clone();
        anim.f۱۲۸۶۵h = true;
        anim.f۱۲۸۶۷j = false;
        anim.f۱۲۸۶۸k = false;
        anim.f۱۲۸۶۱d = new ArrayList<>();
        anim.f۱۲۸۶۲e = new HashMap<>();
        anim.f۱۲۸۶۳f = new ArrayList<>();
        anim.f۱۲۸۶۴g = new ArrayList<>();
        HashMap<AnimatorSet.Node, AnimatorSet.Node> nodeCloneMap = new HashMap<>();
        Iterator i$ = this.f۱۲۸۶۳f.iterator();
        while (i$.hasNext()) {
            Cf node = (Cf) i$.next();
            Cf nodeClone = node.clone();
            nodeCloneMap.put(node, nodeClone);
            anim.f۱۲۸۶۳f.add(nodeClone);
            anim.f۱۲۸۶۲e.put(nodeClone.f۱۲۸۸۳c, nodeClone);
            nodeClone.f۱۲۸۸۴d = null;
            nodeClone.f۱۲۸۸۵e = null;
            nodeClone.f۱۲۸۸۷g = null;
            nodeClone.f۱۲۸۸۶f = null;
            ArrayList<Animator.AnimatorListener> cloneListeners = nodeClone.f۱۲۸۸۳c.m۱۶۱۸۷a();
            if (cloneListeners != null) {
                ArrayList<Animator.AnimatorListener> listenersToRemove = null;
                Iterator i$2 = cloneListeners.iterator();
                while (i$2.hasNext()) {
                    AbstractCa.AbstractCa listener = (AbstractCa.AbstractCa) i$2.next();
                    if (listener instanceof Cb) {
                        if (listenersToRemove == null) {
                            listenersToRemove = new ArrayList<>();
                        }
                        listenersToRemove.add(listener);
                    }
                }
                if (listenersToRemove != null) {
                    Iterator i$3 = listenersToRemove.iterator();
                    while (i$3.hasNext()) {
                        cloneListeners.remove((AbstractCa.AbstractCa) i$3.next());
                    }
                }
            }
        }
        Iterator i$4 = this.f۱۲۸۶۳f.iterator();
        while (i$4.hasNext()) {
            Cf node2 = i$4.next();
            Cf nodeClone2 = (Cf) nodeCloneMap.get(node2);
            ArrayList<Cd> arrayList = node2.f۱۲۸۸۴d;
            if (arrayList != null) {
                Iterator i$5 = arrayList.iterator();
                while (i$5.hasNext()) {
                    Cd dependency = i$5.next();
                    nodeClone2.m۱۶۲۱۹a(new Cd((Cf) nodeCloneMap.get(dependency.f۱۲۸۷۸a), dependency.f۱۲۸۷۹b));
                }
            }
        }
        return anim;
    }

    /* renamed from: b.h.a.c$e  reason: invalid class name */
    private static class Ce implements AbstractCa.AbstractCa {

        /* renamed from: a  reason: contains not printable characters */
        private Cc f۱۲۸۸۰a;

        /* renamed from: b  reason: contains not printable characters */
        private Cf f۱۲۸۸۱b;

        /* renamed from: c  reason: contains not printable characters */
        private int f۱۲۸۸۲c;

        public Ce(Cc animatorSet, Cf node, int rule) {
            this.f۱۲۸۸۰a = animatorSet;
            this.f۱۲۸۸۱b = node;
            this.f۱۲۸۸۲c = rule;
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۲۱۶a(AbstractCa animation) {
            if (this.f۱۲۸۸۲c == 1) {
                m۱۶۲۱۵d(animation);
            }
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۶۲۱۷b(AbstractCa animation) {
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۶۲۱۸c(AbstractCa animation) {
            if (this.f۱۲۸۸۲c == 0) {
                m۱۶۲۱۵d(animation);
            }
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۶۲۱۵d(AbstractCa dependencyAnimation) {
            if (!this.f۱۲۸۸۰a.f۱۲۸۶۷j) {
                Cd dependencyToRemove = null;
                int numDependencies = this.f۱۲۸۸۱b.f۱۲۸۸۵e.size();
                int i = 0;
                while (true) {
                    if (i >= numDependencies) {
                        break;
                    }
                    Cd dependency = this.f۱۲۸۸۱b.f۱۲۸۸۵e.get(i);
                    if (dependency.f۱۲۸۷۹b == this.f۱۲۸۸۲c && dependency.f۱۲۸۷۸a.f۱۲۸۸۳c == dependencyAnimation) {
                        dependencyToRemove = dependency;
                        dependencyAnimation.m۱۶۱۹۱b(this);
                        break;
                    }
                    i++;
                }
                this.f۱۲۸۸۱b.f۱۲۸۸۵e.remove(dependencyToRemove);
                if (this.f۱۲۸۸۱b.f۱۲۸۸۵e.size() == 0) {
                    this.f۱۲۸۸۱b.f۱۲۸۸۳c.m۱۶۱۹۰b();
                    this.f۱۲۸۸۰a.f۱۲۸۶۱d.add(this.f۱۲۸۸۱b.f۱۲۸۸۳c);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.h.a.c$b  reason: invalid class name */
    public class Cb implements AbstractCa.AbstractCa {

        /* renamed from: a  reason: contains not printable characters */
        private Cc f۱۲۸۷۴a;

        Cb(Cc animatorSet) {
            this.f۱۲۸۷۴a = animatorSet;
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۲۱۱a(AbstractCa animation) {
            animation.m۱۶۱۹۱b(this);
            Cc.this.f۱۲۸۶۱d.remove(animation);
            ((Cf) this.f۱۲۸۷۴a.f۱۲۸۶۲e.get(animation)).f۱۲۸۸۸h = true;
            if (!Cc.this.f۱۲۸۶۷j) {
                ArrayList<AnimatorSet.Node> sortedNodes = this.f۱۲۸۷۴a.f۱۲۸۶۴g;
                boolean allDone = true;
                int numSortedNodes = sortedNodes.size();
                int i = 0;
                while (true) {
                    if (i >= numSortedNodes) {
                        break;
                    } else if (!((Cf) sortedNodes.get(i)).f۱۲۸۸۸h) {
                        allDone = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (allDone) {
                    ArrayList<AbstractCa.AbstractCa> arrayList = Cc.this.f۱۲۸۶۰c;
                    if (arrayList != null) {
                        ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList.clone();
                        int numListeners = tmpListeners.size();
                        for (int i2 = 0; i2 < numListeners; i2++) {
                            ((AbstractCa.AbstractCa) tmpListeners.get(i2)).m۱۶۱۹۲a(this.f۱۲۸۷۴a);
                        }
                    }
                    this.f۱۲۸۷۴a.f۱۲۸۶۸k = false;
                }
            }
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۶۲۱۲b(AbstractCa animation) {
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa.AbstractCa
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۶۲۱۳c(AbstractCa animation) {
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۶۲۰۱c() {
        if (this.f۱۲۸۶۵h) {
            this.f۱۲۸۶۴g.clear();
            ArrayList<AnimatorSet.Node> roots = new ArrayList<>();
            int numNodes = this.f۱۲۸۶۳f.size();
            for (int i = 0; i < numNodes; i++) {
                Cf node = this.f۱۲۸۶۳f.get(i);
                ArrayList<Cd> arrayList = node.f۱۲۸۸۴d;
                if (arrayList == null || arrayList.size() == 0) {
                    roots.add(node);
                }
            }
            ArrayList<AnimatorSet.Node> tmpRoots = new ArrayList<>();
            while (roots.size() > 0) {
                int numRoots = roots.size();
                for (int i2 = 0; i2 < numRoots; i2++) {
                    Cf root = (Cf) roots.get(i2);
                    this.f۱۲۸۶۴g.add(root);
                    ArrayList<Cf> arrayList2 = root.f۱۲۸۸۷g;
                    if (arrayList2 != null) {
                        int numDependents = arrayList2.size();
                        for (int j = 0; j < numDependents; j++) {
                            Cf node2 = root.f۱۲۸۸۷g.get(j);
                            node2.f۱۲۸۸۶f.remove(root);
                            if (node2.f۱۲۸۸۶f.size() == 0) {
                                tmpRoots.add(node2);
                            }
                        }
                    }
                }
                roots.clear();
                roots.addAll(tmpRoots);
                tmpRoots.clear();
            }
            this.f۱۲۸۶۵h = false;
            if (this.f۱۲۸۶۴g.size() != this.f۱۲۸۶۳f.size()) {
                throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
            return;
        }
        int numNodes2 = this.f۱۲۸۶۳f.size();
        for (int i3 = 0; i3 < numNodes2; i3++) {
            Cf node3 = this.f۱۲۸۶۳f.get(i3);
            ArrayList<Cd> arrayList3 = node3.f۱۲۸۸۴d;
            if (arrayList3 != null && arrayList3.size() > 0) {
                int numDependencies = node3.f۱۲۸۸۴d.size();
                for (int j2 = 0; j2 < numDependencies; j2++) {
                    Cd dependency = node3.f۱۲۸۸۴d.get(j2);
                    if (node3.f۱۲۸۸۶f == null) {
                        node3.f۱۲۸۸۶f = new ArrayList<>();
                    }
                    if (!node3.f۱۲۸۸۶f.contains(dependency.f۱۲۸۷۸a)) {
                        node3.f۱۲۸۸۶f.add(dependency.f۱۲۸۷۸a);
                    }
                }
            }
            node3.f۱۲۸۸۸h = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.h.a.c$d  reason: invalid class name */
    public static class Cd {

        /* renamed from: a  reason: contains not printable characters */
        public Cf f۱۲۸۷۸a;

        /* renamed from: b  reason: contains not printable characters */
        public int f۱۲۸۷۹b;

        public Cd(Cf node, int rule) {
            this.f۱۲۸۷۸a = node;
            this.f۱۲۸۷۹b = rule;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.h.a.c$f  reason: invalid class name */
    public static class Cf implements Cloneable {

        /* renamed from: c  reason: contains not printable characters */
        public AbstractCa f۱۲۸۸۳c;

        /* renamed from: d  reason: contains not printable characters */
        public ArrayList<Cd> f۱۲۸۸۴d = null;

        /* renamed from: e  reason: contains not printable characters */
        public ArrayList<Cd> f۱۲۸۸۵e = null;

        /* renamed from: f  reason: contains not printable characters */
        public ArrayList<Cf> f۱۲۸۸۶f = null;

        /* renamed from: g  reason: contains not printable characters */
        public ArrayList<Cf> f۱۲۸۸۷g = null;

        /* renamed from: h  reason: contains not printable characters */
        public boolean f۱۲۸۸۸h = false;

        public Cf(AbstractCa animation) {
            this.f۱۲۸۸۳c = animation;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۲۱۹a(Cd dependency) {
            if (this.f۱۲۸۸۴d == null) {
                this.f۱۲۸۸۴d = new ArrayList<>();
                this.f۱۲۸۸۶f = new ArrayList<>();
            }
            this.f۱۲۸۸۴d.add(dependency);
            if (!this.f۱۲۸۸۶f.contains(dependency.f۱۲۸۷۸a)) {
                this.f۱۲۸۸۶f.add(dependency.f۱۲۸۷۸a);
            }
            Cf dependencyNode = dependency.f۱۲۸۷۸a;
            if (dependencyNode.f۱۲۸۸۷g == null) {
                dependencyNode.f۱۲۸۸۷g = new ArrayList<>();
            }
            dependencyNode.f۱۲۸۸۷g.add(this);
        }

        @Override // java.lang.Object
        public Cf clone() {
            try {
                Cf node = (Cf) super.clone();
                node.f۱۲۸۸۳c = this.f۱۲۸۸۳c.clone();
                return node;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: b.h.a.c$c  reason: invalid class name */
    public class Cc {

        /* renamed from: a  reason: contains not printable characters */
        private Cf f۱۲۸۷۶a;

        Cc(AbstractCa anim) {
            this.f۱۲۸۷۶a = (Cf) Cc.this.f۱۲۸۶۲e.get(anim);
            if (this.f۱۲۸۷۶a == null) {
                this.f۱۲۸۷۶a = new Cf(anim);
                Cc.this.f۱۲۸۶۲e.put(anim, this.f۱۲۸۷۶a);
                Cc.this.f۱۲۸۶۳f.add(this.f۱۲۸۷۶a);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc m۱۶۲۱۴a(AbstractCa anim) {
            Cf node = (Cf) Cc.this.f۱۲۸۶۲e.get(anim);
            if (node == null) {
                node = new Cf(anim);
                Cc.this.f۱۲۸۶۲e.put(anim, node);
                Cc.this.f۱۲۸۶۳f.add(node);
            }
            node.m۱۶۲۱۹a(new Cd(this.f۱۲۸۷۶a, 0));
            return this;
        }
    }
}
