package p۲۰۸b.p۲۵۹h.p۲۶۰a;

import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa;

/* renamed from: b.h.a.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cc extends AbstractCa {

    /* renamed from: k, reason: contains not printable characters */
    private boolean f۱۲۸۶۸k;

    /* renamed from: d, reason: contains not printable characters */
    private ArrayList<AbstractCa> f۱۲۸۶۱d = new ArrayList<>();

    /* renamed from: e, reason: contains not printable characters */
    private HashMap<AbstractCa, f> f۱۲۸۶۲e = new HashMap<>();

    /* renamed from: f, reason: contains not printable characters */
    private ArrayList<f> f۱۲۸۶۳f = new ArrayList<>();

    /* renamed from: g, reason: contains not printable characters */
    private ArrayList<f> f۱۲۸۶۴g = new ArrayList<>();

    /* renamed from: h, reason: contains not printable characters */
    private boolean f۱۲۸۶۵h = true;

    /* renamed from: i, reason: contains not printable characters */
    private b f۱۲۸۶۶i = null;

    /* renamed from: j, reason: contains not printable characters */
    boolean f۱۲۸۶۷j = false;

    /* renamed from: l, reason: contains not printable characters */
    private long f۱۲۸۶۹l = 0;

    /* renamed from: m, reason: contains not printable characters */
    private Cm f۱۲۸۷۰m = null;

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۱۳۷a(AbstractCa... items) {
        if (items != null) {
            this.f۱۲۸۶۵h = true;
            c builder = m۱۴۱۳۴a(items[0]);
            for (int i = 1; i < items.length; i++) {
                builder.m۱۴۱۴۵a(items[i]);
            }
        }
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۲۶۸a(Interpolator interpolator) {
        Iterator i$ = this.f۱۲۸۶۳f.iterator();
        while (i$.hasNext()) {
            f node = i$.next();
            node.f۱۲۸۸۳c.mo۱۴۲۶۸a(interpolator);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public c m۱۴۱۳۴a(AbstractCa anim) {
        if (anim != null) {
            this.f۱۲۸۶۵h = true;
            return new c(anim);
        }
        return null;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۴۱۳۹b(long startDelay) {
        this.f۱۲۸۶۹l = startDelay;
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public Cc mo۱۴۲۶۶a(long duration) {
        if (duration < 0) {
            throw new IllegalArgumentException("duration must be a value of zero or greater");
        }
        Iterator i$ = this.f۱۲۸۶۳f.iterator();
        while (i$.hasNext()) {
            f node = i$.next();
            node.f۱۲۸۸۳c.mo۱۴۲۶۶a(duration);
        }
        return this;
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۴۲۷۲b() {
        ArrayList<AbstractCa.a> arrayList;
        this.f۱۲۸۶۷j = false;
        m۱۴۱۳۱c();
        int numSortedNodes = this.f۱۲۸۶۴g.size();
        for (int i = 0; i < numSortedNodes; i++) {
            f node = this.f۱۲۸۶۴g.get(i);
            ArrayList<AbstractCa.a> arrayList2 = node.f۱۲۸۸۳c.m۱۴۱۱۶a();
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList<Animator.AnimatorListener> clonedListeners = new ArrayList<>(arrayList2);
                Iterator i$ = clonedListeners.iterator();
                while (i$.hasNext()) {
                    AbstractCa.a listener = (AbstractCa.a) i$.next();
                    if ((listener instanceof e) || (listener instanceof b)) {
                        node.f۱۲۸۸۳c.m۱۴۱۲۰b(listener);
                    }
                }
            }
        }
        ArrayList<AnimatorSet.Node> nodesToStart = new ArrayList<>();
        for (int i2 = 0; i2 < numSortedNodes; i2++) {
            f node2 = this.f۱۲۸۶۴g.get(i2);
            if (this.f۱۲۸۶۶i == null) {
                this.f۱۲۸۶۶i = new b(this);
            }
            ArrayList<d> arrayList3 = node2.f۱۲۸۸۴d;
            if (arrayList3 == null || arrayList3.size() == 0) {
                nodesToStart.add(node2);
            } else {
                int numDependencies = node2.f۱۲۸۸۴d.size();
                for (int j = 0; j < numDependencies; j++) {
                    d dependency = node2.f۱۲۸۸۴d.get(j);
                    dependency.f۱۲۸۷۸a.f۱۲۸۸۳c.m۱۴۱۱۸a(new e(this, node2, dependency.f۱۲۸۷۹b));
                }
                node2.f۱۲۸۸۵e = (ArrayList) node2.f۱۲۸۸۴d.clone();
            }
            node2.f۱۲۸۸۳c.m۱۴۱۱۸a(this.f۱۲۸۶۶i);
        }
        if (this.f۱۲۸۶۹l <= 0) {
            Iterator i$2 = nodesToStart.iterator();
            while (i$2.hasNext()) {
                f node3 = (f) i$2.next();
                node3.f۱۲۸۸۳c.mo۱۴۲۷۲b();
                this.f۱۲۸۶۱d.add(node3.f۱۲۸۸۳c);
            }
        } else {
            this.f۱۲۸۷۰m = Cm.m۱۴۲۵۳b(0.0f, 1.0f);
            this.f۱۲۸۷۰m.mo۱۴۲۶۶a(this.f۱۲۸۶۹l);
            this.f۱۲۸۷۰m.m۱۴۱۱۸a(new a(nodesToStart));
            this.f۱۲۸۷۰m.mo۱۴۲۷۲b();
        }
        ArrayList<AbstractCa.a> arrayList4 = this.f۱۲۸۶۰c;
        if (arrayList4 != null) {
            ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList4.clone();
            int numListeners = tmpListeners.size();
            for (int i3 = 0; i3 < numListeners; i3++) {
                ((AbstractCa.a) tmpListeners.get(i3)).mo۱۶۴۰۷c(this);
            }
        }
        if (this.f۱۲۸۶۳f.size() == 0 && this.f۱۲۸۶۹l == 0 && (arrayList = this.f۱۲۸۶۰c) != null) {
            ArrayList<Animator.AnimatorListener> tmpListeners2 = (ArrayList) arrayList.clone();
            int numListeners2 = tmpListeners2.size();
            for (int i4 = 0; i4 < numListeners2; i4++) {
                ((AbstractCa.a) tmpListeners2.get(i4)).mo۱۶۴۰۵a(this);
            }
        }
    }

    /* renamed from: b.h.a.c$a */
    class a extends AbstractCb {

        /* renamed from: a, reason: contains not printable characters */
        boolean f۱۲۸۷۱a = false;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۲۸۷۲b;

        a(ArrayList arrayList) {
            this.f۱۲۸۷۲b = arrayList;
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۴۰۵a(AbstractCa anim) {
            if (!this.f۱۲۸۷۱a) {
                int numNodes = this.f۱۲۸۷۲b.size();
                for (int i = 0; i < numNodes; i++) {
                    f node = (f) this.f۱۲۸۷۲b.get(i);
                    node.f۱۲۸۸۳c.mo۱۴۲۷۲b();
                    Cc.this.f۱۲۸۶۱d.add(node.f۱۲۸۸۳c);
                }
            }
        }
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: clone */
    public Cc mo۱۴۲۷۶clone() {
        Cc anim = (Cc) super.mo۱۴۲۷۶clone();
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
            f node = i$.next();
            f nodeClone = node.m۱۴۱۵۱clone();
            nodeCloneMap.put(node, nodeClone);
            anim.f۱۲۸۶۳f.add(nodeClone);
            anim.f۱۲۸۶۲e.put(nodeClone.f۱۲۸۸۳c, nodeClone);
            nodeClone.f۱۲۸۸۴d = null;
            nodeClone.f۱۲۸۸۵e = null;
            nodeClone.f۱۲۸۸۷g = null;
            nodeClone.f۱۲۸۸۶f = null;
            ArrayList<AbstractCa.a> arrayList = nodeClone.f۱۲۸۸۳c.m۱۴۱۱۶a();
            if (arrayList != null) {
                ArrayList<Animator.AnimatorListener> listenersToRemove = null;
                Iterator i$2 = arrayList.iterator();
                while (i$2.hasNext()) {
                    AbstractCa.a listener = i$2.next();
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
                        arrayList.remove((AbstractCa.a) i$3.next());
                    }
                }
            }
        }
        Iterator i$4 = this.f۱۲۸۶۳f.iterator();
        while (i$4.hasNext()) {
            f node2 = i$4.next();
            f nodeClone2 = (f) nodeCloneMap.get(node2);
            ArrayList<d> arrayList2 = node2.f۱۲۸۸۴d;
            if (arrayList2 != null) {
                Iterator i$5 = arrayList2.iterator();
                while (i$5.hasNext()) {
                    d dependency = i$5.next();
                    f clonedDependencyNode = (f) nodeCloneMap.get(dependency.f۱۲۸۷۸a);
                    d cloneDependency = new d(clonedDependencyNode, dependency.f۱۲۸۷۹b);
                    nodeClone2.m۱۴۱۵۰a(cloneDependency);
                }
            }
        }
        return anim;
    }

    /* renamed from: b.h.a.c$e */
    private static class e implements AbstractCa.a {

        /* renamed from: a, reason: contains not printable characters */
        private Cc f۱۲۸۸۰a;

        /* renamed from: b, reason: contains not printable characters */
        private f f۱۲۸۸۱b;

        /* renamed from: c, reason: contains not printable characters */
        private int f۱۲۸۸۲c;

        public e(Cc animatorSet, f node, int rule) {
            this.f۱۲۸۸۰a = animatorSet;
            this.f۱۲۸۸۱b = node;
            this.f۱۲۸۸۲c = rule;
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۴۰۵a(AbstractCa animation) {
            if (this.f۱۲۸۸۲c == 1) {
                m۱۴۱۴۶d(animation);
            }
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۶۴۱۰b(AbstractCa animation) {
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۶۴۰۷c(AbstractCa animation) {
            if (this.f۱۲۸۸۲c == 0) {
                m۱۴۱۴۶d(animation);
            }
        }

        /* renamed from: d, reason: contains not printable characters */
        private void m۱۴۱۴۶d(AbstractCa dependencyAnimation) {
            if (this.f۱۲۸۸۰a.f۱۲۸۶۷j) {
                return;
            }
            d dependencyToRemove = null;
            int numDependencies = this.f۱۲۸۸۱b.f۱۲۸۸۵e.size();
            int i = 0;
            while (true) {
                if (i >= numDependencies) {
                    break;
                }
                d dependency = this.f۱۲۸۸۱b.f۱۲۸۸۵e.get(i);
                if (dependency.f۱۲۸۷۹b != this.f۱۲۸۸۲c || dependency.f۱۲۸۷۸a.f۱۲۸۸۳c != dependencyAnimation) {
                    i++;
                } else {
                    dependencyToRemove = dependency;
                    dependencyAnimation.m۱۴۱۲۰b(this);
                    break;
                }
            }
            this.f۱۲۸۸۱b.f۱۲۸۸۵e.remove(dependencyToRemove);
            if (this.f۱۲۸۸۱b.f۱۲۸۸۵e.size() == 0) {
                this.f۱۲۸۸۱b.f۱۲۸۸۳c.mo۱۴۲۷۲b();
                this.f۱۲۸۸۰a.f۱۲۸۶۱d.add(this.f۱۲۸۸۱b.f۱۲۸۸۳c);
            }
        }
    }

    /* renamed from: b.h.a.c$b */
    private class b implements AbstractCa.a {

        /* renamed from: a, reason: contains not printable characters */
        private Cc f۱۲۸۷۴a;

        b(Cc animatorSet) {
            this.f۱۲۸۷۴a = animatorSet;
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۴۰۵a(AbstractCa animation) {
            animation.m۱۴۱۲۰b(this);
            Cc.this.f۱۲۸۶۱d.remove(animation);
            f animNode = (f) this.f۱۲۸۷۴a.f۱۲۸۶۲e.get(animation);
            animNode.f۱۲۸۸۸h = true;
            if (!Cc.this.f۱۲۸۶۷j) {
                ArrayList<AnimatorSet.Node> sortedNodes = this.f۱۲۸۷۴a.f۱۲۸۶۴g;
                boolean allDone = true;
                int numSortedNodes = sortedNodes.size();
                int i = 0;
                while (true) {
                    if (i >= numSortedNodes) {
                        break;
                    }
                    if (((f) sortedNodes.get(i)).f۱۲۸۸۸h) {
                        i++;
                    } else {
                        allDone = false;
                        break;
                    }
                }
                if (allDone) {
                    ArrayList<AbstractCa.a> arrayList = Cc.this.f۱۲۸۶۰c;
                    if (arrayList != null) {
                        ArrayList<Animator.AnimatorListener> tmpListeners = (ArrayList) arrayList.clone();
                        int numListeners = tmpListeners.size();
                        for (int i2 = 0; i2 < numListeners; i2++) {
                            ((AbstractCa.a) tmpListeners.get(i2)).mo۱۶۴۰۵a(this.f۱۲۸۷۴a);
                        }
                    }
                    this.f۱۲۸۷۴a.f۱۲۸۶۸k = false;
                }
            }
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۶۴۱۰b(AbstractCa animation) {
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa.a
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۶۴۰۷c(AbstractCa animation) {
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۴۱۳۱c() {
        if (this.f۱۲۸۶۵h) {
            this.f۱۲۸۶۴g.clear();
            ArrayList<AnimatorSet.Node> roots = new ArrayList<>();
            int numNodes = this.f۱۲۸۶۳f.size();
            for (int i = 0; i < numNodes; i++) {
                f node = this.f۱۲۸۶۳f.get(i);
                ArrayList<d> arrayList = node.f۱۲۸۸۴d;
                if (arrayList == null || arrayList.size() == 0) {
                    roots.add(node);
                }
            }
            ArrayList<AnimatorSet.Node> tmpRoots = new ArrayList<>();
            while (roots.size() > 0) {
                int numRoots = roots.size();
                for (int i2 = 0; i2 < numRoots; i2++) {
                    f root = (f) roots.get(i2);
                    this.f۱۲۸۶۴g.add(root);
                    ArrayList<f> arrayList2 = root.f۱۲۸۸۷g;
                    if (arrayList2 != null) {
                        int numDependents = arrayList2.size();
                        for (int j = 0; j < numDependents; j++) {
                            f node2 = root.f۱۲۸۸۷g.get(j);
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
            f node3 = this.f۱۲۸۶۳f.get(i3);
            ArrayList<d> arrayList3 = node3.f۱۲۸۸۴d;
            if (arrayList3 != null && arrayList3.size() > 0) {
                int numDependencies = node3.f۱۲۸۸۴d.size();
                for (int j2 = 0; j2 < numDependencies; j2++) {
                    d dependency = node3.f۱۲۸۸۴d.get(j2);
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

    /* renamed from: b.h.a.c$d */
    private static class d {

        /* renamed from: a, reason: contains not printable characters */
        public f f۱۲۸۷۸a;

        /* renamed from: b, reason: contains not printable characters */
        public int f۱۲۸۷۹b;

        public d(f node, int rule) {
            this.f۱۲۸۷۸a = node;
            this.f۱۲۸۷۹b = rule;
        }
    }

    /* renamed from: b.h.a.c$f */
    private static class f implements Cloneable {

        /* renamed from: c, reason: contains not printable characters */
        public AbstractCa f۱۲۸۸۳c;

        /* renamed from: d, reason: contains not printable characters */
        public ArrayList<d> f۱۲۸۸۴d = null;

        /* renamed from: e, reason: contains not printable characters */
        public ArrayList<d> f۱۲۸۸۵e = null;

        /* renamed from: f, reason: contains not printable characters */
        public ArrayList<f> f۱۲۸۸۶f = null;

        /* renamed from: g, reason: contains not printable characters */
        public ArrayList<f> f۱۲۸۸۷g = null;

        /* renamed from: h, reason: contains not printable characters */
        public boolean f۱۲۸۸۸h = false;

        public f(AbstractCa animation) {
            this.f۱۲۸۸۳c = animation;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۴۱۵۰a(d dependency) {
            if (this.f۱۲۸۸۴d == null) {
                this.f۱۲۸۸۴d = new ArrayList<>();
                this.f۱۲۸۸۶f = new ArrayList<>();
            }
            this.f۱۲۸۸۴d.add(dependency);
            if (!this.f۱۲۸۸۶f.contains(dependency.f۱۲۸۷۸a)) {
                this.f۱۲۸۸۶f.add(dependency.f۱۲۸۷۸a);
            }
            f dependencyNode = dependency.f۱۲۸۷۸a;
            if (dependencyNode.f۱۲۸۸۷g == null) {
                dependencyNode.f۱۲۸۸۷g = new ArrayList<>();
            }
            dependencyNode.f۱۲۸۸۷g.add(this);
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public f m۱۴۱۵۱clone() {
            try {
                f node = (f) super.clone();
                node.f۱۲۸۸۳c = this.f۱۲۸۸۳c.mo۱۴۲۷۶clone();
                return node;
            } catch (CloneNotSupportedException e2) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: b.h.a.c$c */
    public class c {

        /* renamed from: a, reason: contains not printable characters */
        private f f۱۲۸۷۶a;

        c(AbstractCa anim) {
            this.f۱۲۸۷۶a = (f) Cc.this.f۱۲۸۶۲e.get(anim);
            if (this.f۱۲۸۷۶a == null) {
                this.f۱۲۸۷۶a = new f(anim);
                Cc.this.f۱۲۸۶۲e.put(anim, this.f۱۲۸۷۶a);
                Cc.this.f۱۲۸۶۳f.add(this.f۱۲۸۷۶a);
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        public c m۱۴۱۴۵a(AbstractCa anim) {
            f node = (f) Cc.this.f۱۲۸۶۲e.get(anim);
            if (node == null) {
                node = new f(anim);
                Cc.this.f۱۲۸۶۲e.put(anim, node);
                Cc.this.f۱۲۸۶۳f.add(node);
            }
            d dependency = new d(this.f۱۲۸۷۶a, 0);
            node.m۱۴۱۵۰a(dependency);
            return this;
        }
    }
}
