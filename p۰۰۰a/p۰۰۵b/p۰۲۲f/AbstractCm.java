package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.support.p۰۴۳v4.view.Cu;
import android.support.transition.Transition;
import android.support.transition.TransitionValues;
import android.support.v4.util.ArrayMap;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cf;

/* renamed from: a.b.f.m  reason: invalid class name */
public abstract class AbstractCm implements Cloneable {

    /* renamed from: I  reason: contains not printable characters */
    private static final int[] f۸۵۷۰I = {2, 1, 3, 4};

    /* renamed from: J  reason: contains not printable characters */
    private static final AbstractCg f۸۵۷۱J = new Ca();

    /* renamed from: K  reason: contains not printable characters */
    private static ThreadLocal<p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<Animator, Cd>> f۸۵۷۲K = new ThreadLocal<>();

    /* renamed from: A  reason: contains not printable characters */
    private boolean f۸۵۷۳A = false;

    /* renamed from: B  reason: contains not printable characters */
    private boolean f۸۵۷۴B = false;

    /* renamed from: C  reason: contains not printable characters */
    private ArrayList<AbstractCf> f۸۵۷۵C = null;

    /* renamed from: D  reason: contains not printable characters */
    private ArrayList<Animator> f۸۵۷۶D = new ArrayList<>();

    /* renamed from: E  reason: contains not printable characters */
    AbstractCp f۸۵۷۷E;

    /* renamed from: F  reason: contains not printable characters */
    private AbstractCe f۸۵۷۸F;

    /* renamed from: G  reason: contains not printable characters */
    private p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<String, String> f۸۵۷۹G;

    /* renamed from: H  reason: contains not printable characters */
    private AbstractCg f۸۵۸۰H = f۸۵۷۱J;

    /* renamed from: c  reason: contains not printable characters */
    private String f۸۵۸۱c = getClass().getName();

    /* renamed from: d  reason: contains not printable characters */
    private long f۸۵۸۲d = -1;

    /* renamed from: e  reason: contains not printable characters */
    long f۸۵۸۳e = -1;

    /* renamed from: f  reason: contains not printable characters */
    private TimeInterpolator f۸۵۸۴f = null;

    /* renamed from: g  reason: contains not printable characters */
    ArrayList<Integer> f۸۵۸۵g = new ArrayList<>();

    /* renamed from: h  reason: contains not printable characters */
    ArrayList<View> f۸۵۸۶h = new ArrayList<>();

    /* renamed from: i  reason: contains not printable characters */
    private ArrayList<String> f۸۵۸۷i = null;

    /* renamed from: j  reason: contains not printable characters */
    private ArrayList<Class> f۸۵۸۸j = null;

    /* renamed from: k  reason: contains not printable characters */
    private ArrayList<Integer> f۸۵۸۹k = null;

    /* renamed from: l  reason: contains not printable characters */
    private ArrayList<View> f۸۵۹۰l = null;

    /* renamed from: m  reason: contains not printable characters */
    private ArrayList<Class> f۸۵۹۱m = null;

    /* renamed from: n  reason: contains not printable characters */
    private ArrayList<String> f۸۵۹۲n = null;

    /* renamed from: o  reason: contains not printable characters */
    private ArrayList<Integer> f۸۵۹۳o = null;

    /* renamed from: p  reason: contains not printable characters */
    private ArrayList<View> f۸۵۹۴p = null;

    /* renamed from: q  reason: contains not printable characters */
    private ArrayList<Class> f۸۵۹۵q = null;

    /* renamed from: r  reason: contains not printable characters */
    private Ct f۸۵۹۶r = new Ct();

    /* renamed from: s  reason: contains not printable characters */
    private Ct f۸۵۹۷s = new Ct();

    /* renamed from: t  reason: contains not printable characters */
    Cq f۸۵۹۸t = null;

    /* renamed from: u  reason: contains not printable characters */
    private int[] f۸۵۹۹u = f۸۵۷۰I;

    /* renamed from: v  reason: contains not printable characters */
    private ArrayList<Cs> f۸۶۰۰v;

    /* renamed from: w  reason: contains not printable characters */
    private ArrayList<Cs> f۸۶۰۱w;

    /* renamed from: x  reason: contains not printable characters */
    boolean f۸۶۰۲x = false;

    /* renamed from: y  reason: contains not printable characters */
    ArrayList<Animator> f۸۶۰۳y = new ArrayList<>();

    /* renamed from: z  reason: contains not printable characters */
    private int f۸۶۰۴z = 0;

    /* renamed from: a.b.f.m$e  reason: invalid class name */
    public static abstract class AbstractCe {
    }

    /* renamed from: a.b.f.m$f  reason: invalid class name */
    public interface AbstractCf {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۰۳۵۰a(AbstractCm mVar);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۰۳۵۱b(AbstractCm mVar);

        /* renamed from: c  reason: contains not printable characters */
        void m۱۰۳۵۲c(AbstractCm mVar);

        /* renamed from: d  reason: contains not printable characters */
        void m۱۰۳۵۳d(AbstractCm mVar);
    }

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۰۳۱۹a(Cs sVar);

    /* renamed from: c  reason: contains not printable characters */
    public abstract void m۱۰۳۳۳c(Cs sVar);

    /* renamed from: a.b.f.m$a  reason: invalid class name */
    static class Ca extends AbstractCg {
        Ca() {
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCg
        /* renamed from: a  reason: contains not printable characters */
        public Path m۱۰۳۴۹a(float startX, float startY, float endX, float endY) {
            Path path = new Path();
            path.moveTo(startX, startY);
            path.lineTo(endX, endY);
            return path;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCm m۱۰۳۰۸a(long duration) {
        this.f۸۵۸۳e = duration;
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public long m۱۰۳۲۶b() {
        return this.f۸۵۸۳e;
    }

    /* renamed from: b  reason: contains not printable characters */
    public AbstractCm m۱۰۳۲۷b(long startDelay) {
        this.f۸۵۸۲d = startDelay;
        return this;
    }

    /* renamed from: h  reason: contains not printable characters */
    public long m۱۰۳۴۱h() {
        return this.f۸۵۸۲d;
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCm m۱۰۳۱۰a(TimeInterpolator interpolator) {
        this.f۸۵۸۴f = interpolator;
        return this;
    }

    /* renamed from: d  reason: contains not printable characters */
    public TimeInterpolator m۱۰۳۳۶d() {
        return this.f۸۵۸۴f;
    }

    /* renamed from: n  reason: contains not printable characters */
    public String[] m۱۰۳۴۶n() {
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Animator m۱۰۳۱۳a(ViewGroup sceneRoot, Cs startValues, Cs endValues) {
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۳۰۵b(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs> aVar, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs> aVar2) {
        Cs end;
        View view;
        for (int i = aVar.size() - 1; i >= 0; i--) {
            View view2 = aVar.m۱۰۶۵۴b(i);
            if (!(view2 == null || !m۱۰۳۳۱b(view2) || (end = aVar2.remove(view2)) == null || (view = end.f۸۶۳۱b) == null || !m۱۰۳۳۱b(view))) {
                this.f۸۶۰۰v.add(aVar.m۱۰۶۵۵c(i));
                this.f۸۶۰۱w.add(end);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۳۰۱a(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs> aVar, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs> aVar2, Cf<View> fVar, Cf<View> fVar2) {
        View endView;
        int numStartIds = fVar.m۱۰۵۹۹b();
        for (int i = 0; i < numStartIds; i++) {
            View startView = fVar.m۱۰۶۰۴c(i);
            if (startView != null && m۱۰۳۳۱b(startView) && (endView = fVar2.m۱۰۶۰۰b(fVar.m۱۰۵۹۵a(i))) != null && m۱۰۳۳۱b(endView)) {
                Cs startValues = aVar.get(startView);
                Cs endValues = aVar2.get(endView);
                if (!(startValues == null || endValues == null)) {
                    this.f۸۶۰۰v.add(startValues);
                    this.f۸۶۰۱w.add(endValues);
                    aVar.remove(startView);
                    aVar2.remove(endView);
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۳۰۲a(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs> aVar, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs> aVar2, SparseArray<View> startIds, SparseArray<View> endIds) {
        View endView;
        int numStartIds = startIds.size();
        for (int i = 0; i < numStartIds; i++) {
            View startView = startIds.valueAt(i);
            if (startView != null && m۱۰۳۳۱b(startView) && (endView = endIds.get(startIds.keyAt(i))) != null && m۱۰۳۳۱b(endView)) {
                Cs startValues = aVar.get(startView);
                Cs endValues = aVar2.get(endView);
                if (!(startValues == null || endValues == null)) {
                    this.f۸۶۰۰v.add(startValues);
                    this.f۸۶۰۱w.add(endValues);
                    aVar.remove(startView);
                    aVar2.remove(endView);
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۳۰۰a(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs> aVar, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs> aVar2, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<String, View> aVar3, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<String, View> aVar4) {
        View endView;
        int numStartNames = aVar3.size();
        for (int i = 0; i < numStartNames; i++) {
            View startView = aVar3.m۱۰۶۵۶d(i);
            if (startView != null && m۱۰۳۳۱b(startView) && (endView = aVar4.get(aVar3.m۱۰۶۵۴b(i))) != null && m۱۰۳۳۱b(endView)) {
                Cs startValues = aVar.get(startView);
                Cs endValues = aVar2.get(endView);
                if (!(startValues == null || endValues == null)) {
                    this.f۸۶۰۰v.add(startValues);
                    this.f۸۶۰۱w.add(endValues);
                    aVar.remove(startView);
                    aVar2.remove(endView);
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۲۹۹a(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs> aVar, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            Cs start = aVar.m۱۰۶۵۶d(i);
            if (m۱۰۳۳۱b(start.f۸۶۳۱b)) {
                this.f۸۶۰۰v.add(start);
                this.f۸۶۰۱w.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            Cs end = aVar2.m۱۰۶۵۶d(i2);
            if (m۱۰۳۳۱b(end.f۸۶۳۱b)) {
                this.f۸۶۰۱w.add(end);
                this.f۸۶۰۰v.add(null);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۲۹۷a(Ct startValues, Ct endValues) {
        ArrayMap<View, TransitionValues> unmatchedStart = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<>(startValues.f۸۶۳۳a);
        ArrayMap<View, TransitionValues> unmatchedEnd = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<>(endValues.f۸۶۳۳a);
        int i = 0;
        while (true) {
            int[] iArr = this.f۸۵۹۹u;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m۱۰۳۰۵b((p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs>) unmatchedStart, (p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs>) unmatchedEnd);
                } else if (i2 == 2) {
                    m۱۰۳۰۰a((p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs>) unmatchedStart, (p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs>) unmatchedEnd, startValues.f۸۶۳۶d, endValues.f۸۶۳۶d);
                } else if (i2 == 3) {
                    m۱۰۳۰۲a((p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs>) unmatchedStart, (p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs>) unmatchedEnd, startValues.f۸۶۳۴b, endValues.f۸۶۳۴b);
                } else if (i2 == 4) {
                    m۱۰۳۰۱a((p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs>) unmatchedStart, (p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs>) unmatchedEnd, startValues.f۸۶۳۵c, endValues.f۸۶۳۵c);
                }
                i++;
            } else {
                m۱۰۲۹۹a((p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs>) unmatchedStart, (p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<View, Cs>) unmatchedEnd);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۲۲a(ViewGroup sceneRoot, Ct startValues, Ct endValues, ArrayList<Cs> arrayList, ArrayList<Cs> arrayList2) {
        int i;
        int startValuesListCount;
        Cs infoValues;
        View view;
        Animator animator;
        long minStartDelay;
        Animator animator2;
        Animator animator3;
        int numExistingAnims;
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = m۱۰۳۰۷q();
        long minStartDelay2 = Long.MAX_VALUE;
        SparseIntArray startDelays = new SparseIntArray();
        int startValuesListCount2 = arrayList.size();
        int i2 = 0;
        while (i2 < startValuesListCount2) {
            Cs start = arrayList.get(i2);
            Cs end = arrayList2.get(i2);
            Cs start2 = (start == null || start.f۸۶۳۲c.contains(this)) ? start : null;
            Cs end2 = (end == null || end.f۸۶۳۲c.contains(this)) ? end : null;
            if (start2 == null && end2 == null) {
                startValuesListCount = startValuesListCount2;
                i = i2;
            } else if (start2 == null || end2 == null || m۱۰۳۲۵a(start2, end2)) {
                Animator animator4 = m۱۰۳۱۳a(sceneRoot, start2, end2);
                if (animator4 != null) {
                    Cs infoValues2 = null;
                    if (end2 != null) {
                        View view2 = end2.f۸۶۳۱b;
                        String[] properties = m۱۰۳۴۶n();
                        if (view2 == null || properties == null) {
                            animator3 = animator4;
                            startValuesListCount = startValuesListCount2;
                            i = i2;
                        } else {
                            animator3 = animator4;
                            if (properties.length > 0) {
                                infoValues2 = new Cs();
                                infoValues2.f۸۶۳۱b = view2;
                                startValuesListCount = startValuesListCount2;
                                Cs newValues = endValues.f۸۶۳۳a.get(view2);
                                if (newValues != null) {
                                    int j = 0;
                                    while (j < properties.length) {
                                        infoValues2.f۸۶۳۰a.put(properties[j], newValues.f۸۶۳۰a.get(properties[j]));
                                        j++;
                                        i2 = i2;
                                        newValues = newValues;
                                    }
                                    i = i2;
                                } else {
                                    i = i2;
                                }
                                int numExistingAnims2 = runningAnimators.size();
                                int j2 = 0;
                                while (true) {
                                    if (j2 >= numExistingAnims2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    Cd info2 = runningAnimators.get((Animator) runningAnimators.m۱۰۶۵۴b(j2));
                                    if (info2.f۸۶۱۰c != null && info2.f۸۶۰۸a == view2) {
                                        numExistingAnims = numExistingAnims2;
                                        if (info2.f۸۶۰۹b.equals(m۱۰۳۳۷e()) && info2.f۸۶۱۰c.equals(infoValues2)) {
                                            animator2 = null;
                                            break;
                                        }
                                    } else {
                                        numExistingAnims = numExistingAnims2;
                                    }
                                    j2++;
                                    numExistingAnims2 = numExistingAnims;
                                }
                                animator = animator2;
                                infoValues = infoValues2;
                                view = view2;
                            } else {
                                startValuesListCount = startValuesListCount2;
                                i = i2;
                            }
                        }
                        animator2 = animator3;
                        animator = animator2;
                        infoValues = infoValues2;
                        view = view2;
                    } else {
                        startValuesListCount = startValuesListCount2;
                        i = i2;
                        view = start2.f۸۶۳۱b;
                        infoValues = null;
                        animator = animator4;
                    }
                    if (animator != null) {
                        AbstractCp pVar = this.f۸۵۷۷E;
                        if (pVar != null) {
                            long delay = pVar.m۱۰۳۶۳a(sceneRoot, this, start2, end2);
                            startDelays.put(this.f۸۵۷۶D.size(), (int) delay);
                            minStartDelay = Math.min(delay, minStartDelay2);
                        } else {
                            minStartDelay = minStartDelay2;
                        }
                        runningAnimators.put(animator, new Cd(view, m۱۰۳۳۷e(), this, Cd0.m۱۰۲۲۱d(sceneRoot), infoValues));
                        this.f۸۵۷۶D.add(animator);
                        minStartDelay2 = minStartDelay;
                    }
                } else {
                    startValuesListCount = startValuesListCount2;
                    i = i2;
                }
            } else {
                startValuesListCount = startValuesListCount2;
                i = i2;
            }
            i2 = i + 1;
            startValuesListCount2 = startValuesListCount;
        }
        if (minStartDelay2 != 0) {
            for (int i3 = 0; i3 < startDelays.size(); i3++) {
                Animator animator5 = this.f۸۵۷۶D.get(startDelays.keyAt(i3));
                animator5.setStartDelay((((long) startDelays.valueAt(i3)) - minStartDelay2) + animator5.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۰۳۳۱b(View target) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int targetId = target.getId();
        ArrayList<Integer> arrayList3 = this.f۸۵۸۹k;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(targetId))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f۸۵۹۰l;
        if (arrayList4 != null && arrayList4.contains(target)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.f۸۵۹۱m;
        if (arrayList5 != null) {
            int numTypes = arrayList5.size();
            for (int i = 0; i < numTypes; i++) {
                if (this.f۸۵۹۱m.get(i).isInstance(target)) {
                    return false;
                }
            }
        }
        if (!(this.f۸۵۹۲n == null || Cu.m۱۳۰۲۰q(target) == null || !this.f۸۵۹۲n.contains(Cu.m۱۳۰۲۰q(target)))) {
            return false;
        }
        if ((this.f۸۵۸۵g.size() == 0 && this.f۸۵۸۶h.size() == 0 && (((arrayList = this.f۸۵۸۸j) == null || arrayList.isEmpty()) && ((arrayList2 = this.f۸۵۸۷i) == null || arrayList2.isEmpty()))) || this.f۸۵۸۵g.contains(Integer.valueOf(targetId)) || this.f۸۵۸۶h.contains(target)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f۸۵۸۷i;
        if (arrayList6 != null && arrayList6.contains(Cu.m۱۳۰۲۰q(target))) {
            return true;
        }
        if (this.f۸۵۸۸j != null) {
            for (int i2 = 0; i2 < this.f۸۵۸۸j.size(); i2++) {
                if (this.f۸۵۸۸j.get(i2).isInstance(target)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: q  reason: contains not printable characters */
    private static p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<Animator, Cd> m۱۰۳۰۷q() {
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = (p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca) f۸۵۷۲K.get();
        if (runningAnimators != null) {
            return runningAnimators;
        }
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators2 = new p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<>();
        f۸۵۷۲K.set(runningAnimators2);
        return runningAnimators2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o  reason: contains not printable characters */
    public void m۱۰۳۴۷o() {
        m۱۰۳۴۸p();
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = m۱۰۳۰۷q();
        Iterator<Animator> it = this.f۸۵۷۶D.iterator();
        while (it.hasNext()) {
            Animator anim = it.next();
            if (runningAnimators.containsKey(anim)) {
                m۱۰۳۴۸p();
                m۱۰۳۰۳a(anim, (p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<Animator, Cd>) runningAnimators);
            }
        }
        this.f۸۵۷۶D.clear();
        m۱۰۳۱۵a();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۳۰۳a(Animator animator, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<Animator, Cd> aVar) {
        if (animator != null) {
            animator.addListener(new Cb(aVar));
            m۱۰۳۲۰a(animator);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.f.m$b  reason: invalid class name */
    public class Cb extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca f۸۶۰۵a;

        Cb(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca aVar) {
            this.f۸۶۰۵a = aVar;
        }

        public void onAnimationStart(Animator animation) {
            AbstractCm.this.f۸۶۰۳y.add(animation);
        }

        public void onAnimationEnd(Animator animation) {
            this.f۸۶۰۵a.remove(animation);
            AbstractCm.this.f۸۶۰۳y.remove(animation);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCm m۱۰۳۱۱a(View target) {
        this.f۸۵۸۶h.add(target);
        return this;
    }

    /* renamed from: d  reason: contains not printable characters */
    public AbstractCm m۱۰۳۳۵d(View target) {
        this.f۸۵۸۶h.remove(target);
        return this;
    }

    /* renamed from: i  reason: contains not printable characters */
    public List<Integer> m۱۰۳۴۲i() {
        return this.f۸۵۸۵g;
    }

    /* renamed from: m  reason: contains not printable characters */
    public List<View> m۱۰۳۴۵m() {
        return this.f۸۵۸۶h;
    }

    /* renamed from: j  reason: contains not printable characters */
    public List<String> m۱۰۳۴۳j() {
        return this.f۸۵۸۷i;
    }

    /* renamed from: k  reason: contains not printable characters */
    public List<Class> m۱۰۳۴۴k() {
        return this.f۸۵۸۸j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۲۳a(ViewGroup sceneRoot, boolean start) {
        p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        m۱۰۳۲۴a(start);
        if ((this.f۸۵۸۵g.size() > 0 || this.f۸۵۸۶h.size() > 0) && (((arrayList = this.f۸۵۸۷i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f۸۵۸۸j) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f۸۵۸۵g.size(); i++) {
                View view = sceneRoot.findViewById(this.f۸۵۸۵g.get(i).intValue());
                if (view != null) {
                    Cs values = new Cs();
                    values.f۸۶۳۱b = view;
                    if (start) {
                        m۱۰۳۳۳c(values);
                    } else {
                        m۱۰۳۱۹a(values);
                    }
                    values.f۸۶۳۲c.add(this);
                    m۱۰۳۳۰b(values);
                    if (start) {
                        m۱۰۲۹۸a(this.f۸۵۹۶r, view, values);
                    } else {
                        m۱۰۲۹۸a(this.f۸۵۹۷s, view, values);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f۸۵۸۶h.size(); i2++) {
                View view2 = this.f۸۵۸۶h.get(i2);
                Cs values2 = new Cs();
                values2.f۸۶۳۱b = view2;
                if (start) {
                    m۱۰۳۳۳c(values2);
                } else {
                    m۱۰۳۱۹a(values2);
                }
                values2.f۸۶۳۲c.add(this);
                m۱۰۳۳۰b(values2);
                if (start) {
                    m۱۰۲۹۸a(this.f۸۵۹۶r, view2, values2);
                } else {
                    m۱۰۲۹۸a(this.f۸۵۹۷s, view2, values2);
                }
            }
        } else {
            m۱۰۳۰۶c(sceneRoot, start);
        }
        if (!(start || (aVar = this.f۸۵۷۹G) == null)) {
            int numOverrides = aVar.size();
            ArrayList<View> overriddenViews = new ArrayList<>(numOverrides);
            for (int i3 = 0; i3 < numOverrides; i3++) {
                overriddenViews.add(this.f۸۵۹۶r.f۸۶۳۶d.remove(this.f۸۵۷۹G.m۱۰۶۵۴b(i3)));
            }
            for (int i4 = 0; i4 < numOverrides; i4++) {
                View view3 = overriddenViews.get(i4);
                if (view3 != null) {
                    this.f۸۵۹۶r.f۸۶۳۶d.put(this.f۸۵۷۹G.m۱۰۶۵۶d(i4), view3);
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۰۲۹۸a(Ct transitionValuesMaps, View view, Cs transitionValues) {
        transitionValuesMaps.f۸۶۳۳a.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (transitionValuesMaps.f۸۶۳۴b.indexOfKey(id) >= 0) {
                transitionValuesMaps.f۸۶۳۴b.put(id, null);
            } else {
                transitionValuesMaps.f۸۶۳۴b.put(id, view);
            }
        }
        String name = Cu.m۱۳۰۲۰q(view);
        if (name != null) {
            if (transitionValuesMaps.f۸۶۳۶d.containsKey(name)) {
                transitionValuesMaps.f۸۶۳۶d.put(name, null);
            } else {
                transitionValuesMaps.f۸۶۳۶d.put(name, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listview = (ListView) view.getParent();
            if (listview.getAdapter().hasStableIds()) {
                long itemId = listview.getItemIdAtPosition(listview.getPositionForView(view));
                if (transitionValuesMaps.f۸۶۳۵c.m۱۰۶۰۳c(itemId) >= 0) {
                    View alreadyMatched = transitionValuesMaps.f۸۶۳۵c.m۱۰۶۰۰b(itemId);
                    if (alreadyMatched != null) {
                        Cu.m۱۲۹۹۸b(alreadyMatched, false);
                        transitionValuesMaps.f۸۶۳۵c.m۱۰۶۰۵c(itemId, null);
                        return;
                    }
                    return;
                }
                Cu.m۱۲۹۹۸b(view, true);
                transitionValuesMaps.f۸۶۳۵c.m۱۰۶۰۵c(itemId, view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۲۴a(boolean start) {
        if (start) {
            this.f۸۵۹۶r.f۸۶۳۳a.clear();
            this.f۸۵۹۶r.f۸۶۳۴b.clear();
            this.f۸۵۹۶r.f۸۶۳۵c.m۱۰۵۹۶a();
            return;
        }
        this.f۸۵۹۷s.f۸۶۳۳a.clear();
        this.f۸۵۹۷s.f۸۶۳۴b.clear();
        this.f۸۵۹۷s.f۸۶۳۵c.m۱۰۵۹۶a();
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۳۰۶c(View view, boolean start) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f۸۵۸۹k;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f۸۵۹۰l;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.f۸۵۹۱m;
                    if (arrayList3 != null) {
                        int numTypes = arrayList3.size();
                        for (int i = 0; i < numTypes; i++) {
                            if (this.f۸۵۹۱m.get(i).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        Cs values = new Cs();
                        values.f۸۶۳۱b = view;
                        if (start) {
                            m۱۰۳۳۳c(values);
                        } else {
                            m۱۰۳۱۹a(values);
                        }
                        values.f۸۶۳۲c.add(this);
                        m۱۰۳۳۰b(values);
                        if (start) {
                            m۱۰۲۹۸a(this.f۸۵۹۶r, view, values);
                        } else {
                            m۱۰۲۹۸a(this.f۸۵۹۷s, view, values);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f۸۵۹۳o;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f۸۵۹۴p;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.f۸۵۹۵q;
                                if (arrayList6 != null) {
                                    int numTypes2 = arrayList6.size();
                                    for (int i2 = 0; i2 < numTypes2; i2++) {
                                        if (this.f۸۵۹۵q.get(i2).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup parent = (ViewGroup) view;
                                for (int i3 = 0; i3 < parent.getChildCount(); i3++) {
                                    m۱۰۳۰۶c(parent.getChildAt(i3), start);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cs m۱۰۳۲۹b(View view, boolean start) {
        Cq qVar = this.f۸۵۹۸t;
        if (qVar != null) {
            return qVar.m۱۰۳۲۹b(view, start);
        }
        return (start ? this.f۸۵۹۶r : this.f۸۵۹۷s).f۸۶۳۳a.get(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cs m۱۰۳۱۲a(View view, boolean viewInStart) {
        Cq qVar = this.f۸۵۹۸t;
        if (qVar != null) {
            return qVar.m۱۰۳۱۲a(view, viewInStart);
        }
        ArrayList<TransitionValues> lookIn = viewInStart ? this.f۸۶۰۰v : this.f۸۶۰۱w;
        if (lookIn == null) {
            return null;
        }
        int count = lookIn.size();
        int index = -1;
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            }
            Cs values = (Cs) lookIn.get(i);
            if (values == null) {
                return null;
            }
            if (values.f۸۶۳۱b == view) {
                index = i;
                break;
            }
            i++;
        }
        if (index < 0) {
            return null;
        }
        return (viewInStart ? this.f۸۶۰۱w : this.f۸۶۰۰v).get(index);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۳۳۴c(View sceneRoot) {
        if (!this.f۸۵۷۴B) {
            ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = m۱۰۳۰۷q();
            int numOldAnims = runningAnimators.size();
            AbstractCl0 windowId = Cd0.m۱۰۲۲۱d(sceneRoot);
            for (int i = numOldAnims - 1; i >= 0; i--) {
                Cd info2 = runningAnimators.m۱۰۶۵۶d(i);
                if (info2.f۸۶۰۸a != null && windowId.equals(info2.f۸۶۱۱d)) {
                    Ca.m۱۰۱۶۴a(runningAnimators.m۱۰۶۵۴b(i));
                }
            }
            ArrayList<AbstractCf> arrayList = this.f۸۵۷۵C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f۸۵۷۵C.clone();
                int numListeners = tmpListeners.size();
                for (int i2 = 0; i2 < numListeners; i2++) {
                    ((AbstractCf) tmpListeners.get(i2)).m۱۰۳۵۰a(this);
                }
            }
            this.f۸۵۷۳A = true;
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۰۳۳۸e(View sceneRoot) {
        if (this.f۸۵۷۳A) {
            if (!this.f۸۵۷۴B) {
                ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = m۱۰۳۰۷q();
                int numOldAnims = runningAnimators.size();
                AbstractCl0 windowId = Cd0.m۱۰۲۲۱d(sceneRoot);
                for (int i = numOldAnims - 1; i >= 0; i--) {
                    Cd info2 = runningAnimators.m۱۰۶۵۶d(i);
                    if (info2.f۸۶۰۸a != null && windowId.equals(info2.f۸۶۱۱d)) {
                        Ca.m۱۰۱۶۶b(runningAnimators.m۱۰۶۵۴b(i));
                    }
                }
                ArrayList<AbstractCf> arrayList = this.f۸۵۷۵C;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f۸۵۷۵C.clone();
                    int numListeners = tmpListeners.size();
                    for (int i2 = 0; i2 < numListeners; i2++) {
                        ((AbstractCf) tmpListeners.get(i2)).m۱۰۳۵۳d(this);
                    }
                }
            }
            this.f۸۵۷۳A = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۲۱a(ViewGroup sceneRoot) {
        Cd oldInfo;
        this.f۸۶۰۰v = new ArrayList<>();
        this.f۸۶۰۱w = new ArrayList<>();
        m۱۰۲۹۷a(this.f۸۵۹۶r, this.f۸۵۹۷s);
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = m۱۰۳۰۷q();
        int numOldAnims = runningAnimators.size();
        AbstractCl0 windowId = Cd0.m۱۰۲۲۱d(sceneRoot);
        for (int i = numOldAnims - 1; i >= 0; i--) {
            Animator anim = runningAnimators.m۱۰۶۵۴b(i);
            if (!(anim == null || (oldInfo = runningAnimators.get(anim)) == null || oldInfo.f۸۶۰۸a == null || !windowId.equals(oldInfo.f۸۶۱۱d))) {
                Cs oldValues = oldInfo.f۸۶۱۰c;
                View oldView = oldInfo.f۸۶۰۸a;
                boolean cancel = true;
                Cs startValues = m۱۰۳۲۹b(oldView, true);
                Cs endValues = m۱۰۳۱۲a(oldView, true);
                if ((startValues == null && endValues == null) || !oldInfo.f۸۶۱۲e.m۱۰۳۲۵a(oldValues, endValues)) {
                    cancel = false;
                }
                if (cancel) {
                    if (anim.isRunning() || anim.isStarted()) {
                        anim.cancel();
                    } else {
                        runningAnimators.remove(anim);
                    }
                }
            }
        }
        m۱۰۳۲۲a(sceneRoot, this.f۸۵۹۶r, this.f۸۵۹۷s, this.f۸۶۰۰v, this.f۸۶۰۱w);
        m۱۰۳۴۷o();
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۰۳۲۵a(Cs startValues, Cs endValues) {
        if (startValues == null || endValues == null) {
            return false;
        }
        String[] properties = m۱۰۳۴۶n();
        if (properties != null) {
            for (String property : properties) {
                if (m۱۰۳۰۴a(startValues, endValues, property)) {
                    return true;
                }
            }
            return false;
        }
        for (String key : startValues.f۸۶۳۰a.keySet()) {
            if (m۱۰۳۰۴a(startValues, endValues, key)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۰۳۰۴a(Cs oldValues, Cs newValues, String key) {
        Object oldValue = oldValues.f۸۶۳۰a.get(key);
        Object newValue = newValues.f۸۶۳۰a.get(key);
        if (oldValue == null && newValue == null) {
            return false;
        }
        if (oldValue == null || newValue == null) {
            return true;
        }
        return !oldValue.equals(newValue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۲۰a(Animator animator) {
        if (animator == null) {
            m۱۰۳۱۵a();
            return;
        }
        if (m۱۰۳۲۶b() >= 0) {
            animator.setDuration(m۱۰۳۲۶b());
        }
        if (m۱۰۳۴۱h() >= 0) {
            animator.setStartDelay(m۱۰۳۴۱h());
        }
        if (m۱۰۳۳۶d() != null) {
            animator.setInterpolator(m۱۰۳۳۶d());
        }
        animator.addListener(new Cc());
        animator.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.f.m$c  reason: invalid class name */
    public class Cc extends AnimatorListenerAdapter {
        Cc() {
        }

        public void onAnimationEnd(Animator animation) {
            AbstractCm.this.m۱۰۳۱۵a();
            animation.removeListener(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p  reason: contains not printable characters */
    public void m۱۰۳۴۸p() {
        if (this.f۸۶۰۴z == 0) {
            ArrayList<AbstractCf> arrayList = this.f۸۵۷۵C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f۸۵۷۵C.clone();
                int numListeners = tmpListeners.size();
                for (int i = 0; i < numListeners; i++) {
                    ((AbstractCf) tmpListeners.get(i)).m۱۰۳۵۲c(this);
                }
            }
            this.f۸۵۷۴B = false;
        }
        this.f۸۶۰۴z++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۱۵a() {
        this.f۸۶۰۴z--;
        if (this.f۸۶۰۴z == 0) {
            ArrayList<AbstractCf> arrayList = this.f۸۵۷۵C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f۸۵۷۵C.clone();
                int numListeners = tmpListeners.size();
                for (int i = 0; i < numListeners; i++) {
                    ((AbstractCf) tmpListeners.get(i)).m۱۰۳۵۱b(this);
                }
            }
            for (int i2 = 0; i2 < this.f۸۵۹۶r.f۸۶۳۵c.m۱۰۵۹۹b(); i2++) {
                View view = this.f۸۵۹۶r.f۸۶۳۵c.m۱۰۶۰۴c(i2);
                if (view != null) {
                    Cu.m۱۲۹۹۸b(view, false);
                }
            }
            for (int i3 = 0; i3 < this.f۸۵۹۷s.f۸۶۳۵c.m۱۰۵۹۹b(); i3++) {
                View view2 = this.f۸۵۹۷s.f۸۶۳۵c.m۱۰۶۰۴c(i3);
                if (view2 != null) {
                    Cu.m۱۲۹۹۸b(view2, false);
                }
            }
            this.f۸۵۷۴B = true;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCm m۱۰۳۰۹a(AbstractCf listener) {
        if (this.f۸۵۷۵C == null) {
            this.f۸۵۷۵C = new ArrayList<>();
        }
        this.f۸۵۷۵C.add(listener);
        return this;
    }

    /* renamed from: b  reason: contains not printable characters */
    public AbstractCm m۱۰۳۲۸b(AbstractCf listener) {
        ArrayList<AbstractCf> arrayList = this.f۸۵۷۵C;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(listener);
        if (this.f۸۵۷۵C.size() == 0) {
            this.f۸۵۷۵C = null;
        }
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۱۶a(AbstractCg pathMotion) {
        if (pathMotion == null) {
            this.f۸۵۸۰H = f۸۵۷۱J;
        } else {
            this.f۸۵۸۰H = pathMotion;
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public AbstractCg m۱۰۳۳۹f() {
        return this.f۸۵۸۰H;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۱۷a(AbstractCe epicenterCallback) {
        this.f۸۵۷۸F = epicenterCallback;
    }

    /* renamed from: c  reason: contains not printable characters */
    public AbstractCe m۱۰۳۳۲c() {
        return this.f۸۵۷۸F;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۳۱۸a(AbstractCp transitionPropagation) {
        this.f۸۵۷۷E = transitionPropagation;
    }

    /* renamed from: g  reason: contains not printable characters */
    public AbstractCp m۱۰۳۴۰g() {
        return this.f۸۵۷۷E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۳۳۰b(Cs transitionValues) {
        String[] propertyNames;
        if (this.f۸۵۷۷E != null && !transitionValues.f۸۶۳۰a.isEmpty() && (propertyNames = this.f۸۵۷۷E.m۱۰۳۶۵a()) != null) {
            boolean containsAll = true;
            int i = 0;
            while (true) {
                if (i >= propertyNames.length) {
                    break;
                } else if (!transitionValues.f۸۶۳۰a.containsKey(propertyNames[i])) {
                    containsAll = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!containsAll) {
                this.f۸۵۷۷E.m۱۰۳۶۴a(transitionValues);
            }
        }
    }

    public String toString() {
        return m۱۰۳۱۴a("");
    }

    @Override // java.lang.Object
    public AbstractCm clone() {
        try {
            AbstractCm clone = (AbstractCm) super.clone();
            clone.f۸۵۷۶D = new ArrayList<>();
            clone.f۸۵۹۶r = new Ct();
            clone.f۸۵۹۷s = new Ct();
            clone.f۸۶۰۰v = null;
            clone.f۸۶۰۱w = null;
            return clone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    public String m۱۰۳۳۷e() {
        return this.f۸۵۸۱c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public String m۱۰۳۱۴a(String indent) {
        String result = indent + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f۸۵۸۳e != -1) {
            result = result + "dur(" + this.f۸۵۸۳e + ") ";
        }
        if (this.f۸۵۸۲d != -1) {
            result = result + "dly(" + this.f۸۵۸۲d + ") ";
        }
        if (this.f۸۵۸۴f != null) {
            result = result + "interp(" + this.f۸۵۸۴f + ") ";
        }
        if (this.f۸۵۸۵g.size() <= 0 && this.f۸۵۸۶h.size() <= 0) {
            return result;
        }
        String result2 = result + "tgts(";
        if (this.f۸۵۸۵g.size() > 0) {
            for (int i = 0; i < this.f۸۵۸۵g.size(); i++) {
                if (i > 0) {
                    result2 = result2 + ", ";
                }
                result2 = result2 + this.f۸۵۸۵g.get(i);
            }
        }
        if (this.f۸۵۸۶h.size() > 0) {
            for (int i2 = 0; i2 < this.f۸۵۸۶h.size(); i2++) {
                if (i2 > 0) {
                    result2 = result2 + ", ";
                }
                result2 = result2 + this.f۸۵۸۶h.get(i2);
            }
        }
        return result2 + ")";
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.f.m$d  reason: invalid class name */
    public static class Cd {

        /* renamed from: a  reason: contains not printable characters */
        View f۸۶۰۸a;

        /* renamed from: b  reason: contains not printable characters */
        String f۸۶۰۹b;

        /* renamed from: c  reason: contains not printable characters */
        Cs f۸۶۱۰c;

        /* renamed from: d  reason: contains not printable characters */
        AbstractCl0 f۸۶۱۱d;

        /* renamed from: e  reason: contains not printable characters */
        AbstractCm f۸۶۱۲e;

        Cd(View view, String name, AbstractCm transition, AbstractCl0 windowId, Cs values) {
            this.f۸۶۰۸a = view;
            this.f۸۶۰۹b = name;
            this.f۸۶۱۰c = values;
            this.f۸۶۱۱d = windowId;
            this.f۸۶۱۲e = transition;
        }
    }
}
