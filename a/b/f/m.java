package a.b.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.support.transition.Transition;
import android.support.transition.TransitionValues;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.u;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class m implements Cloneable {
    private static final int[] I = {2, 1, 3, 4};
    private static final g J = new a();
    private static ThreadLocal<a.b.g.g.a<Animator, d>> K = new ThreadLocal<>();
    private boolean A = false;
    private boolean B = false;
    private ArrayList<f> C = null;
    private ArrayList<Animator> D = new ArrayList<>();
    p E;
    private e F;
    private a.b.g.g.a<String, String> G;
    private g H = J;

    /* renamed from: c  reason: collision with root package name */
    private String f۲۴۱c = getClass().getName();

    /* renamed from: d  reason: collision with root package name */
    private long f۲۴۲d = -1;

    /* renamed from: e  reason: collision with root package name */
    long f۲۴۳e = -1;

    /* renamed from: f  reason: collision with root package name */
    private TimeInterpolator f۲۴۴f = null;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<Integer> f۲۴۵g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    ArrayList<View> f۲۴۶h = new ArrayList<>();
    private ArrayList<String> i = null;
    private ArrayList<Class> j = null;
    private ArrayList<Integer> k = null;
    private ArrayList<View> l = null;
    private ArrayList<Class> m = null;
    private ArrayList<String> n = null;
    private ArrayList<Integer> o = null;
    private ArrayList<View> p = null;
    private ArrayList<Class> q = null;
    private t r = new t();
    private t s = new t();
    q t = null;
    private int[] u = I;
    private ArrayList<s> v;
    private ArrayList<s> w;
    boolean x = false;
    ArrayList<Animator> y = new ArrayList<>();
    private int z = 0;

    public static abstract class e {
    }

    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);
    }

    public abstract void a(s sVar);

    public abstract void c(s sVar);

    static class a extends g {
        a() {
        }

        @Override // a.b.f.g
        public Path a(float startX, float startY, float endX, float endY) {
            Path path = new Path();
            path.moveTo(startX, startY);
            path.lineTo(endX, endY);
            return path;
        }
    }

    public m a(long duration) {
        this.f۲۴۳e = duration;
        return this;
    }

    public long b() {
        return this.f۲۴۳e;
    }

    public m b(long startDelay) {
        this.f۲۴۲d = startDelay;
        return this;
    }

    public long h() {
        return this.f۲۴۲d;
    }

    public m a(TimeInterpolator interpolator) {
        this.f۲۴۴f = interpolator;
        return this;
    }

    public TimeInterpolator d() {
        return this.f۲۴۴f;
    }

    public String[] n() {
        return null;
    }

    public Animator a(ViewGroup sceneRoot, s startValues, s endValues) {
        return null;
    }

    private void b(a.b.g.g.a<View, s> aVar, a.b.g.g.a<View, s> aVar2) {
        s end;
        View view;
        for (int i2 = aVar.size() - 1; i2 >= 0; i2--) {
            View view2 = aVar.b(i2);
            if (!(view2 == null || !b(view2) || (end = aVar2.remove(view2)) == null || (view = end.f۲۶۸b) == null || !b(view))) {
                this.v.add(aVar.c(i2));
                this.w.add(end);
            }
        }
    }

    private void a(a.b.g.g.a<View, s> aVar, a.b.g.g.a<View, s> aVar2, a.b.g.g.f<View> fVar, a.b.g.g.f<View> fVar2) {
        View endView;
        int numStartIds = fVar.b();
        for (int i2 = 0; i2 < numStartIds; i2++) {
            View startView = fVar.c(i2);
            if (startView != null && b(startView) && (endView = fVar2.b(fVar.a(i2))) != null && b(endView)) {
                s startValues = aVar.get(startView);
                s endValues = aVar2.get(endView);
                if (!(startValues == null || endValues == null)) {
                    this.v.add(startValues);
                    this.w.add(endValues);
                    aVar.remove(startView);
                    aVar2.remove(endView);
                }
            }
        }
    }

    private void a(a.b.g.g.a<View, s> aVar, a.b.g.g.a<View, s> aVar2, SparseArray<View> startIds, SparseArray<View> endIds) {
        View endView;
        int numStartIds = startIds.size();
        for (int i2 = 0; i2 < numStartIds; i2++) {
            View startView = startIds.valueAt(i2);
            if (startView != null && b(startView) && (endView = endIds.get(startIds.keyAt(i2))) != null && b(endView)) {
                s startValues = aVar.get(startView);
                s endValues = aVar2.get(endView);
                if (!(startValues == null || endValues == null)) {
                    this.v.add(startValues);
                    this.w.add(endValues);
                    aVar.remove(startView);
                    aVar2.remove(endView);
                }
            }
        }
    }

    private void a(a.b.g.g.a<View, s> aVar, a.b.g.g.a<View, s> aVar2, a.b.g.g.a<String, View> aVar3, a.b.g.g.a<String, View> aVar4) {
        View endView;
        int numStartNames = aVar3.size();
        for (int i2 = 0; i2 < numStartNames; i2++) {
            View startView = aVar3.d(i2);
            if (startView != null && b(startView) && (endView = aVar4.get(aVar3.b(i2))) != null && b(endView)) {
                s startValues = aVar.get(startView);
                s endValues = aVar2.get(endView);
                if (!(startValues == null || endValues == null)) {
                    this.v.add(startValues);
                    this.w.add(endValues);
                    aVar.remove(startView);
                    aVar2.remove(endView);
                }
            }
        }
    }

    private void a(a.b.g.g.a<View, s> aVar, a.b.g.g.a<View, s> aVar2) {
        for (int i2 = 0; i2 < aVar.size(); i2++) {
            s start = aVar.d(i2);
            if (b(start.f۲۶۸b)) {
                this.v.add(start);
                this.w.add(null);
            }
        }
        for (int i3 = 0; i3 < aVar2.size(); i3++) {
            s end = aVar2.d(i3);
            if (b(end.f۲۶۸b)) {
                this.w.add(end);
                this.v.add(null);
            }
        }
    }

    private void a(t startValues, t endValues) {
        ArrayMap<View, TransitionValues> unmatchedStart = new a.b.g.g.a<>(startValues.f۲۷۰a);
        ArrayMap<View, TransitionValues> unmatchedEnd = new a.b.g.g.a<>(endValues.f۲۷۰a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.u;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 == 1) {
                    b((a.b.g.g.a<View, s>) unmatchedStart, (a.b.g.g.a<View, s>) unmatchedEnd);
                } else if (i3 == 2) {
                    a((a.b.g.g.a<View, s>) unmatchedStart, (a.b.g.g.a<View, s>) unmatchedEnd, startValues.f۲۷۳d, endValues.f۲۷۳d);
                } else if (i3 == 3) {
                    a((a.b.g.g.a<View, s>) unmatchedStart, (a.b.g.g.a<View, s>) unmatchedEnd, startValues.f۲۷۱b, endValues.f۲۷۱b);
                } else if (i3 == 4) {
                    a((a.b.g.g.a<View, s>) unmatchedStart, (a.b.g.g.a<View, s>) unmatchedEnd, startValues.f۲۷۲c, endValues.f۲۷۲c);
                }
                i2++;
            } else {
                a((a.b.g.g.a<View, s>) unmatchedStart, (a.b.g.g.a<View, s>) unmatchedEnd);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(ViewGroup sceneRoot, t startValues, t endValues, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i2;
        int startValuesListCount;
        s infoValues;
        View view;
        Animator animator;
        long minStartDelay;
        Animator animator2;
        Animator animator3;
        int numExistingAnims;
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = q();
        long minStartDelay2 = Long.MAX_VALUE;
        SparseIntArray startDelays = new SparseIntArray();
        int startValuesListCount2 = arrayList.size();
        int i3 = 0;
        while (i3 < startValuesListCount2) {
            s start = arrayList.get(i3);
            s end = arrayList2.get(i3);
            s start2 = (start == null || start.f۲۶۹c.contains(this)) ? start : null;
            s end2 = (end == null || end.f۲۶۹c.contains(this)) ? end : null;
            if (start2 == null && end2 == null) {
                startValuesListCount = startValuesListCount2;
                i2 = i3;
            } else if (start2 == null || end2 == null || a(start2, end2)) {
                Animator animator4 = a(sceneRoot, start2, end2);
                if (animator4 != null) {
                    s infoValues2 = null;
                    if (end2 != null) {
                        View view2 = end2.f۲۶۸b;
                        String[] properties = n();
                        if (view2 == null || properties == null) {
                            animator3 = animator4;
                            startValuesListCount = startValuesListCount2;
                            i2 = i3;
                        } else {
                            animator3 = animator4;
                            if (properties.length > 0) {
                                infoValues2 = new s();
                                infoValues2.f۲۶۸b = view2;
                                startValuesListCount = startValuesListCount2;
                                s newValues = endValues.f۲۷۰a.get(view2);
                                if (newValues != null) {
                                    int j2 = 0;
                                    while (j2 < properties.length) {
                                        infoValues2.f۲۶۷a.put(properties[j2], newValues.f۲۶۷a.get(properties[j2]));
                                        j2++;
                                        i3 = i3;
                                        newValues = newValues;
                                    }
                                    i2 = i3;
                                } else {
                                    i2 = i3;
                                }
                                int numExistingAnims2 = runningAnimators.size();
                                int j3 = 0;
                                while (true) {
                                    if (j3 >= numExistingAnims2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    d info2 = runningAnimators.get((Animator) runningAnimators.b(j3));
                                    if (info2.f۲۵۲c != null && info2.f۲۵۰a == view2) {
                                        numExistingAnims = numExistingAnims2;
                                        if (info2.f۲۵۱b.equals(e()) && info2.f۲۵۲c.equals(infoValues2)) {
                                            animator2 = null;
                                            break;
                                        }
                                    } else {
                                        numExistingAnims = numExistingAnims2;
                                    }
                                    j3++;
                                    numExistingAnims2 = numExistingAnims;
                                }
                                animator = animator2;
                                infoValues = infoValues2;
                                view = view2;
                            } else {
                                startValuesListCount = startValuesListCount2;
                                i2 = i3;
                            }
                        }
                        animator2 = animator3;
                        animator = animator2;
                        infoValues = infoValues2;
                        view = view2;
                    } else {
                        startValuesListCount = startValuesListCount2;
                        i2 = i3;
                        view = start2.f۲۶۸b;
                        infoValues = null;
                        animator = animator4;
                    }
                    if (animator != null) {
                        p pVar = this.E;
                        if (pVar != null) {
                            long delay = pVar.a(sceneRoot, this, start2, end2);
                            startDelays.put(this.D.size(), (int) delay);
                            minStartDelay = Math.min(delay, minStartDelay2);
                        } else {
                            minStartDelay = minStartDelay2;
                        }
                        runningAnimators.put(animator, new d(view, e(), this, d0.d(sceneRoot), infoValues));
                        this.D.add(animator);
                        minStartDelay2 = minStartDelay;
                    }
                } else {
                    startValuesListCount = startValuesListCount2;
                    i2 = i3;
                }
            } else {
                startValuesListCount = startValuesListCount2;
                i2 = i3;
            }
            i3 = i2 + 1;
            startValuesListCount2 = startValuesListCount;
        }
        if (minStartDelay2 != 0) {
            for (int i4 = 0; i4 < startDelays.size(); i4++) {
                Animator animator5 = this.D.get(startDelays.keyAt(i4));
                animator5.setStartDelay((((long) startDelays.valueAt(i4)) - minStartDelay2) + animator5.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(View target) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int targetId = target.getId();
        ArrayList<Integer> arrayList3 = this.k;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(targetId))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.l;
        if (arrayList4 != null && arrayList4.contains(target)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.m;
        if (arrayList5 != null) {
            int numTypes = arrayList5.size();
            for (int i2 = 0; i2 < numTypes; i2++) {
                if (this.m.get(i2).isInstance(target)) {
                    return false;
                }
            }
        }
        if (!(this.n == null || u.q(target) == null || !this.n.contains(u.q(target)))) {
            return false;
        }
        if ((this.f۲۴۵g.size() == 0 && this.f۲۴۶h.size() == 0 && (((arrayList = this.j) == null || arrayList.isEmpty()) && ((arrayList2 = this.i) == null || arrayList2.isEmpty()))) || this.f۲۴۵g.contains(Integer.valueOf(targetId)) || this.f۲۴۶h.contains(target)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.i;
        if (arrayList6 != null && arrayList6.contains(u.q(target))) {
            return true;
        }
        if (this.j != null) {
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                if (this.j.get(i3).isInstance(target)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static a.b.g.g.a<Animator, d> q() {
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = (a.b.g.g.a) K.get();
        if (runningAnimators != null) {
            return runningAnimators;
        }
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators2 = new a.b.g.g.a<>();
        K.set(runningAnimators2);
        return runningAnimators2;
    }

    /* access modifiers changed from: protected */
    public void o() {
        p();
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = q();
        Iterator<Animator> it = this.D.iterator();
        while (it.hasNext()) {
            Animator anim = it.next();
            if (runningAnimators.containsKey(anim)) {
                p();
                a(anim, (a.b.g.g.a<Animator, d>) runningAnimators);
            }
        }
        this.D.clear();
        a();
    }

    private void a(Animator animator, a.b.g.g.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            a(animator);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.b.g.g.a f۲۴۷a;

        b(a.b.g.g.a aVar) {
            this.f۲۴۷a = aVar;
        }

        public void onAnimationStart(Animator animation) {
            m.this.y.add(animation);
        }

        public void onAnimationEnd(Animator animation) {
            this.f۲۴۷a.remove(animation);
            m.this.y.remove(animation);
        }
    }

    public m a(View target) {
        this.f۲۴۶h.add(target);
        return this;
    }

    public m d(View target) {
        this.f۲۴۶h.remove(target);
        return this;
    }

    public List<Integer> i() {
        return this.f۲۴۵g;
    }

    public List<View> m() {
        return this.f۲۴۶h;
    }

    public List<String> j() {
        return this.i;
    }

    public List<Class> k() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup sceneRoot, boolean start) {
        a.b.g.g.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        a(start);
        if ((this.f۲۴۵g.size() > 0 || this.f۲۴۶h.size() > 0) && (((arrayList = this.i) == null || arrayList.isEmpty()) && ((arrayList2 = this.j) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f۲۴۵g.size(); i2++) {
                View view = sceneRoot.findViewById(this.f۲۴۵g.get(i2).intValue());
                if (view != null) {
                    s values = new s();
                    values.f۲۶۸b = view;
                    if (start) {
                        c(values);
                    } else {
                        a(values);
                    }
                    values.f۲۶۹c.add(this);
                    b(values);
                    if (start) {
                        a(this.r, view, values);
                    } else {
                        a(this.s, view, values);
                    }
                }
            }
            for (int i3 = 0; i3 < this.f۲۴۶h.size(); i3++) {
                View view2 = this.f۲۴۶h.get(i3);
                s values2 = new s();
                values2.f۲۶۸b = view2;
                if (start) {
                    c(values2);
                } else {
                    a(values2);
                }
                values2.f۲۶۹c.add(this);
                b(values2);
                if (start) {
                    a(this.r, view2, values2);
                } else {
                    a(this.s, view2, values2);
                }
            }
        } else {
            c(sceneRoot, start);
        }
        if (!(start || (aVar = this.G) == null)) {
            int numOverrides = aVar.size();
            ArrayList<View> overriddenViews = new ArrayList<>(numOverrides);
            for (int i4 = 0; i4 < numOverrides; i4++) {
                overriddenViews.add(this.r.f۲۷۳d.remove(this.G.b(i4)));
            }
            for (int i5 = 0; i5 < numOverrides; i5++) {
                View view3 = overriddenViews.get(i5);
                if (view3 != null) {
                    this.r.f۲۷۳d.put(this.G.d(i5), view3);
                }
            }
        }
    }

    private static void a(t transitionValuesMaps, View view, s transitionValues) {
        transitionValuesMaps.f۲۷۰a.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (transitionValuesMaps.f۲۷۱b.indexOfKey(id) >= 0) {
                transitionValuesMaps.f۲۷۱b.put(id, null);
            } else {
                transitionValuesMaps.f۲۷۱b.put(id, view);
            }
        }
        String name = u.q(view);
        if (name != null) {
            if (transitionValuesMaps.f۲۷۳d.containsKey(name)) {
                transitionValuesMaps.f۲۷۳d.put(name, null);
            } else {
                transitionValuesMaps.f۲۷۳d.put(name, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listview = (ListView) view.getParent();
            if (listview.getAdapter().hasStableIds()) {
                long itemId = listview.getItemIdAtPosition(listview.getPositionForView(view));
                if (transitionValuesMaps.f۲۷۲c.c(itemId) >= 0) {
                    View alreadyMatched = transitionValuesMaps.f۲۷۲c.b(itemId);
                    if (alreadyMatched != null) {
                        u.b(alreadyMatched, false);
                        transitionValuesMaps.f۲۷۲c.c(itemId, null);
                        return;
                    }
                    return;
                }
                u.b(view, true);
                transitionValuesMaps.f۲۷۲c.c(itemId, view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean start) {
        if (start) {
            this.r.f۲۷۰a.clear();
            this.r.f۲۷۱b.clear();
            this.r.f۲۷۲c.a();
            return;
        }
        this.s.f۲۷۰a.clear();
        this.s.f۲۷۱b.clear();
        this.s.f۲۷۲c.a();
    }

    private void c(View view, boolean start) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.k;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.l;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.m;
                    if (arrayList3 != null) {
                        int numTypes = arrayList3.size();
                        for (int i2 = 0; i2 < numTypes; i2++) {
                            if (this.m.get(i2).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        s values = new s();
                        values.f۲۶۸b = view;
                        if (start) {
                            c(values);
                        } else {
                            a(values);
                        }
                        values.f۲۶۹c.add(this);
                        b(values);
                        if (start) {
                            a(this.r, view, values);
                        } else {
                            a(this.s, view, values);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.o;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.p;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.q;
                                if (arrayList6 != null) {
                                    int numTypes2 = arrayList6.size();
                                    for (int i3 = 0; i3 < numTypes2; i3++) {
                                        if (this.q.get(i3).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup parent = (ViewGroup) view;
                                for (int i4 = 0; i4 < parent.getChildCount(); i4++) {
                                    c(parent.getChildAt(i4), start);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public s b(View view, boolean start) {
        q qVar = this.t;
        if (qVar != null) {
            return qVar.b(view, start);
        }
        return (start ? this.r : this.s).f۲۷۰a.get(view);
    }

    /* access modifiers changed from: package-private */
    public s a(View view, boolean viewInStart) {
        q qVar = this.t;
        if (qVar != null) {
            return qVar.a(view, viewInStart);
        }
        ArrayList<TransitionValues> lookIn = viewInStart ? this.v : this.w;
        if (lookIn == null) {
            return null;
        }
        int count = lookIn.size();
        int index = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= count) {
                break;
            }
            s values = (s) lookIn.get(i2);
            if (values == null) {
                return null;
            }
            if (values.f۲۶۸b == view) {
                index = i2;
                break;
            }
            i2++;
        }
        if (index < 0) {
            return null;
        }
        return (viewInStart ? this.w : this.v).get(index);
    }

    public void c(View sceneRoot) {
        if (!this.B) {
            ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = q();
            int numOldAnims = runningAnimators.size();
            l0 windowId = d0.d(sceneRoot);
            for (int i2 = numOldAnims - 1; i2 >= 0; i2--) {
                d info2 = runningAnimators.d(i2);
                if (info2.f۲۵۰a != null && windowId.equals(info2.f۲۵۳d)) {
                    a.a(runningAnimators.b(i2));
                }
            }
            ArrayList<f> arrayList = this.C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.C.clone();
                int numListeners = tmpListeners.size();
                for (int i3 = 0; i3 < numListeners; i3++) {
                    ((f) tmpListeners.get(i3)).a(this);
                }
            }
            this.A = true;
        }
    }

    public void e(View sceneRoot) {
        if (this.A) {
            if (!this.B) {
                ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = q();
                int numOldAnims = runningAnimators.size();
                l0 windowId = d0.d(sceneRoot);
                for (int i2 = numOldAnims - 1; i2 >= 0; i2--) {
                    d info2 = runningAnimators.d(i2);
                    if (info2.f۲۵۰a != null && windowId.equals(info2.f۲۵۳d)) {
                        a.b(runningAnimators.b(i2));
                    }
                }
                ArrayList<f> arrayList = this.C;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.C.clone();
                    int numListeners = tmpListeners.size();
                    for (int i3 = 0; i3 < numListeners; i3++) {
                        ((f) tmpListeners.get(i3)).d(this);
                    }
                }
            }
            this.A = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup sceneRoot) {
        d oldInfo;
        this.v = new ArrayList<>();
        this.w = new ArrayList<>();
        a(this.r, this.s);
        ArrayMap<Animator, Transition.AnimationInfo> runningAnimators = q();
        int numOldAnims = runningAnimators.size();
        l0 windowId = d0.d(sceneRoot);
        for (int i2 = numOldAnims - 1; i2 >= 0; i2--) {
            Animator anim = runningAnimators.b(i2);
            if (!(anim == null || (oldInfo = runningAnimators.get(anim)) == null || oldInfo.f۲۵۰a == null || !windowId.equals(oldInfo.f۲۵۳d))) {
                s oldValues = oldInfo.f۲۵۲c;
                View oldView = oldInfo.f۲۵۰a;
                boolean cancel = true;
                s startValues = b(oldView, true);
                s endValues = a(oldView, true);
                if ((startValues == null && endValues == null) || !oldInfo.f۲۵۴e.a(oldValues, endValues)) {
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
        a(sceneRoot, this.r, this.s, this.v, this.w);
        o();
    }

    public boolean a(s startValues, s endValues) {
        if (startValues == null || endValues == null) {
            return false;
        }
        String[] properties = n();
        if (properties != null) {
            for (String property : properties) {
                if (a(startValues, endValues, property)) {
                    return true;
                }
            }
            return false;
        }
        for (String key : startValues.f۲۶۷a.keySet()) {
            if (a(startValues, endValues, key)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(s oldValues, s newValues, String key) {
        Object oldValue = oldValues.f۲۶۷a.get(key);
        Object newValue = newValues.f۲۶۷a.get(key);
        if (oldValue == null && newValue == null) {
            return false;
        }
        if (oldValue == null || newValue == null) {
            return true;
        }
        return !oldValue.equals(newValue);
    }

    /* access modifiers changed from: protected */
    public void a(Animator animator) {
        if (animator == null) {
            a();
            return;
        }
        if (b() >= 0) {
            animator.setDuration(b());
        }
        if (h() >= 0) {
            animator.setStartDelay(h());
        }
        if (d() != null) {
            animator.setInterpolator(d());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* access modifiers changed from: package-private */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animation) {
            m.this.a();
            animation.removeListener(this);
        }
    }

    /* access modifiers changed from: protected */
    public void p() {
        if (this.z == 0) {
            ArrayList<f> arrayList = this.C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.C.clone();
                int numListeners = tmpListeners.size();
                for (int i2 = 0; i2 < numListeners; i2++) {
                    ((f) tmpListeners.get(i2)).c(this);
                }
            }
            this.B = false;
        }
        this.z++;
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.z--;
        if (this.z == 0) {
            ArrayList<f> arrayList = this.C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.C.clone();
                int numListeners = tmpListeners.size();
                for (int i2 = 0; i2 < numListeners; i2++) {
                    ((f) tmpListeners.get(i2)).b(this);
                }
            }
            for (int i3 = 0; i3 < this.r.f۲۷۲c.b(); i3++) {
                View view = this.r.f۲۷۲c.c(i3);
                if (view != null) {
                    u.b(view, false);
                }
            }
            for (int i4 = 0; i4 < this.s.f۲۷۲c.b(); i4++) {
                View view2 = this.s.f۲۷۲c.c(i4);
                if (view2 != null) {
                    u.b(view2, false);
                }
            }
            this.B = true;
        }
    }

    public m a(f listener) {
        if (this.C == null) {
            this.C = new ArrayList<>();
        }
        this.C.add(listener);
        return this;
    }

    public m b(f listener) {
        ArrayList<f> arrayList = this.C;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(listener);
        if (this.C.size() == 0) {
            this.C = null;
        }
        return this;
    }

    public void a(g pathMotion) {
        if (pathMotion == null) {
            this.H = J;
        } else {
            this.H = pathMotion;
        }
    }

    public g f() {
        return this.H;
    }

    public void a(e epicenterCallback) {
        this.F = epicenterCallback;
    }

    public e c() {
        return this.F;
    }

    public void a(p transitionPropagation) {
        this.E = transitionPropagation;
    }

    public p g() {
        return this.E;
    }

    /* access modifiers changed from: package-private */
    public void b(s transitionValues) {
        String[] propertyNames;
        if (this.E != null && !transitionValues.f۲۶۷a.isEmpty() && (propertyNames = this.E.a()) != null) {
            boolean containsAll = true;
            int i2 = 0;
            while (true) {
                if (i2 >= propertyNames.length) {
                    break;
                } else if (!transitionValues.f۲۶۷a.containsKey(propertyNames[i2])) {
                    containsAll = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (!containsAll) {
                this.E.a(transitionValues);
            }
        }
    }

    public String toString() {
        return a("");
    }

    @Override // java.lang.Object
    public m clone() {
        try {
            m clone = (m) super.clone();
            clone.D = new ArrayList<>();
            clone.r = new t();
            clone.s = new t();
            clone.v = null;
            clone.w = null;
            return clone;
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public String e() {
        return this.f۲۴۱c;
    }

    /* access modifiers changed from: package-private */
    public String a(String indent) {
        String result = indent + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f۲۴۳e != -1) {
            result = result + "dur(" + this.f۲۴۳e + ") ";
        }
        if (this.f۲۴۲d != -1) {
            result = result + "dly(" + this.f۲۴۲d + ") ";
        }
        if (this.f۲۴۴f != null) {
            result = result + "interp(" + this.f۲۴۴f + ") ";
        }
        if (this.f۲۴۵g.size() <= 0 && this.f۲۴۶h.size() <= 0) {
            return result;
        }
        String result2 = result + "tgts(";
        if (this.f۲۴۵g.size() > 0) {
            for (int i2 = 0; i2 < this.f۲۴۵g.size(); i2++) {
                if (i2 > 0) {
                    result2 = result2 + ", ";
                }
                result2 = result2 + this.f۲۴۵g.get(i2);
            }
        }
        if (this.f۲۴۶h.size() > 0) {
            for (int i3 = 0; i3 < this.f۲۴۶h.size(); i3++) {
                if (i3 > 0) {
                    result2 = result2 + ", ";
                }
                result2 = result2 + this.f۲۴۶h.get(i3);
            }
        }
        return result2 + ")";
    }

    /* access modifiers changed from: private */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        View f۲۵۰a;

        /* renamed from: b  reason: collision with root package name */
        String f۲۵۱b;

        /* renamed from: c  reason: collision with root package name */
        s f۲۵۲c;

        /* renamed from: d  reason: collision with root package name */
        l0 f۲۵۳d;

        /* renamed from: e  reason: collision with root package name */
        m f۲۵۴e;

        d(View view, String name, m transition, l0 windowId, s values) {
            this.f۲۵۰a = view;
            this.f۲۵۱b = name;
            this.f۲۵۲c = values;
            this.f۲۵۳d = windowId;
            this.f۲۵۴e = transition;
        }
    }
}
