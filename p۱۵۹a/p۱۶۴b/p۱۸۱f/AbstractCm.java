package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.support.transition.Transition;
import android.support.v4.view.Cu;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cf;

/* renamed from: a.b.f.m, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCm implements Cloneable {

    /* renamed from: I, reason: contains not printable characters */
    private static final int[] f۸۵۷۰I = {2, 1, 3, 4};

    /* renamed from: J, reason: contains not printable characters */
    private static final AbstractCg f۸۵۷۱J = new a();

    /* renamed from: K, reason: contains not printable characters */
    private static ThreadLocal<Ca<Animator, d>> f۸۵۷۲K = new ThreadLocal<>();

    /* renamed from: E, reason: contains not printable characters */
    AbstractCp f۸۵۷۷E;

    /* renamed from: F, reason: contains not printable characters */
    private e f۸۵۷۸F;

    /* renamed from: G, reason: contains not printable characters */
    private Ca<String, String> f۸۵۷۹G;

    /* renamed from: v, reason: contains not printable characters */
    private ArrayList<Cs> f۸۶۰۰v;

    /* renamed from: w, reason: contains not printable characters */
    private ArrayList<Cs> f۸۶۰۱w;

    /* renamed from: c, reason: contains not printable characters */
    private String f۸۵۸۱c = getClass().getName();

    /* renamed from: d, reason: contains not printable characters */
    private long f۸۵۸۲d = -1;

    /* renamed from: e, reason: contains not printable characters */
    long f۸۵۸۳e = -1;

    /* renamed from: f, reason: contains not printable characters */
    private TimeInterpolator f۸۵۸۴f = null;

    /* renamed from: g, reason: contains not printable characters */
    ArrayList<Integer> f۸۵۸۵g = new ArrayList<>();

    /* renamed from: h, reason: contains not printable characters */
    ArrayList<View> f۸۵۸۶h = new ArrayList<>();

    /* renamed from: i, reason: contains not printable characters */
    private ArrayList<String> f۸۵۸۷i = null;

    /* renamed from: j, reason: contains not printable characters */
    private ArrayList<Class> f۸۵۸۸j = null;

    /* renamed from: k, reason: contains not printable characters */
    private ArrayList<Integer> f۸۵۸۹k = null;

    /* renamed from: l, reason: contains not printable characters */
    private ArrayList<View> f۸۵۹۰l = null;

    /* renamed from: m, reason: contains not printable characters */
    private ArrayList<Class> f۸۵۹۱m = null;

    /* renamed from: n, reason: contains not printable characters */
    private ArrayList<String> f۸۵۹۲n = null;

    /* renamed from: o, reason: contains not printable characters */
    private ArrayList<Integer> f۸۵۹۳o = null;

    /* renamed from: p, reason: contains not printable characters */
    private ArrayList<View> f۸۵۹۴p = null;

    /* renamed from: q, reason: contains not printable characters */
    private ArrayList<Class> f۸۵۹۵q = null;

    /* renamed from: r, reason: contains not printable characters */
    private Ct f۸۵۹۶r = new Ct();

    /* renamed from: s, reason: contains not printable characters */
    private Ct f۸۵۹۷s = new Ct();

    /* renamed from: t, reason: contains not printable characters */
    Cq f۸۵۹۸t = null;

    /* renamed from: u, reason: contains not printable characters */
    private int[] f۸۵۹۹u = f۸۵۷۰I;

    /* renamed from: x, reason: contains not printable characters */
    boolean f۸۶۰۲x = false;

    /* renamed from: y, reason: contains not printable characters */
    ArrayList<Animator> f۸۶۰۳y = new ArrayList<>();

    /* renamed from: z, reason: contains not printable characters */
    private int f۸۶۰۴z = 0;

    /* renamed from: A, reason: contains not printable characters */
    private boolean f۸۵۷۳A = false;

    /* renamed from: B, reason: contains not printable characters */
    private boolean f۸۵۷۴B = false;

    /* renamed from: C, reason: contains not printable characters */
    private ArrayList<f> f۸۵۷۵C = null;

    /* renamed from: D, reason: contains not printable characters */
    private ArrayList<Animator> f۸۵۷۶D = new ArrayList<>();

    /* renamed from: H, reason: contains not printable characters */
    private AbstractCg f۸۵۸۰H = f۸۵۷۱J;

    /* renamed from: a.b.f.m$e */
    public static abstract class e {
    }

    /* renamed from: a.b.f.m$f */
    public interface f {
        /* renamed from: a, reason: contains not printable characters */
        void mo۸۲۸۸a(AbstractCm abstractCm);

        /* renamed from: b, reason: contains not printable characters */
        void mo۸۳۳۲b(AbstractCm abstractCm);

        /* renamed from: c, reason: contains not printable characters */
        void mo۸۳۳۳c(AbstractCm abstractCm);

        /* renamed from: d, reason: contains not printable characters */
        void mo۸۲۹۰d(AbstractCm abstractCm);
    }

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۸۳۱۵a(Cs cs);

    /* renamed from: c, reason: contains not printable characters */
    public abstract void mo۸۳۲۳c(Cs cs);

    /* renamed from: a.b.f.m$a */
    static class a extends AbstractCg {
        a() {
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCg
        /* renamed from: a, reason: contains not printable characters */
        public Path mo۸۲۸۳a(float startX, float startY, float endX, float endY) {
            Path path = new Path();
            path.moveTo(startX, startY);
            path.lineTo(endX, endY);
            return path;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCm mo۸۳۰۶a(long duration) {
        this.f۸۵۸۳e = duration;
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public long m۸۲۵۹b() {
        return this.f۸۵۸۳e;
    }

    /* renamed from: b, reason: contains not printable characters */
    public AbstractCm mo۸۳۲۰b(long startDelay) {
        this.f۸۵۸۲d = startDelay;
        return this;
    }

    /* renamed from: h, reason: contains not printable characters */
    public long m۸۲۷۴h() {
        return this.f۸۵۸۲d;
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCm mo۸۳۰۹a(TimeInterpolator interpolator) {
        this.f۸۵۸۴f = interpolator;
        return this;
    }

    /* renamed from: d, reason: contains not printable characters */
    public TimeInterpolator m۸۲۶۹d() {
        return this.f۸۵۸۴f;
    }

    /* renamed from: n, reason: contains not printable characters */
    public String[] mo۸۲۷۹n() {
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Animator mo۸۲۴۶a(ViewGroup sceneRoot, Cs startValues, Cs endValues) {
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.view.View, android.support.transition.TransitionValues> */
    /* renamed from: b, reason: contains not printable characters */
    private void m۸۲۳۸b(Ca<View, Cs> ca, Ca<View, Cs> ca2) {
        Cs end;
        View view;
        for (int i = ca.size() - 1; i >= 0; i--) {
            View view2 = ca.m۸۵۸۴b(i);
            if (view2 != null && m۸۲۶۴b(view2) && (end = ca2.remove(view2)) != null && (view = end.f۸۶۳۱b) != null && m۸۲۶۴b(view)) {
                Cs start = ca.m۸۵۸۵c(i);
                this.f۸۶۰۰v.add(start);
                this.f۸۶۰۱w.add(end);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.view.View, android.support.transition.TransitionValues> */
    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.f != android.support.v4.util.LongSparseArray<android.view.View> */
    /* renamed from: a, reason: contains not printable characters */
    private void m۸۲۳۴a(Ca<View, Cs> ca, Ca<View, Cs> ca2, Cf<View> cf, Cf<View> cf2) {
        View endView;
        int numStartIds = cf.m۸۵۲۸b();
        for (int i = 0; i < numStartIds; i++) {
            View startView = cf.m۸۵۳۳c(i);
            if (startView != null && m۸۲۶۴b(startView) && (endView = cf2.m۸۵۲۹b(cf.m۸۵۲۴a(i))) != null && m۸۲۶۴b(endView)) {
                Cs startValues = ca.get(startView);
                Cs endValues = ca2.get(endView);
                if (startValues != null && endValues != null) {
                    this.f۸۶۰۰v.add(startValues);
                    this.f۸۶۰۱w.add(endValues);
                    ca.remove(startView);
                    ca2.remove(endView);
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.view.View, android.support.transition.TransitionValues> */
    /* renamed from: a, reason: contains not printable characters */
    private void m۸۲۳۵a(Ca<View, Cs> ca, Ca<View, Cs> ca2, SparseArray<View> startIds, SparseArray<View> endIds) {
        View endView;
        int numStartIds = startIds.size();
        for (int i = 0; i < numStartIds; i++) {
            View startView = startIds.valueAt(i);
            if (startView != null && m۸۲۶۴b(startView) && (endView = endIds.get(startIds.keyAt(i))) != null && m۸۲۶۴b(endView)) {
                Cs startValues = ca.get(startView);
                Cs endValues = ca2.get(endView);
                if (startValues != null && endValues != null) {
                    this.f۸۶۰۰v.add(startValues);
                    this.f۸۶۰۱w.add(endValues);
                    ca.remove(startView);
                    ca2.remove(endView);
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.view.View, android.support.transition.TransitionValues> */
    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, android.view.View> */
    /* renamed from: a, reason: contains not printable characters */
    private void m۸۲۳۳a(Ca<View, Cs> ca, Ca<View, Cs> ca2, Ca<String, View> ca3, Ca<String, View> ca4) {
        View endView;
        int numStartNames = ca3.size();
        for (int i = 0; i < numStartNames; i++) {
            View startView = ca3.m۸۵۸۶d(i);
            if (startView != null && m۸۲۶۴b(startView) && (endView = ca4.get(ca3.m۸۵۸۴b(i))) != null && m۸۲۶۴b(endView)) {
                Cs startValues = ca.get(startView);
                Cs endValues = ca2.get(endView);
                if (startValues != null && endValues != null) {
                    this.f۸۶۰۰v.add(startValues);
                    this.f۸۶۰۱w.add(endValues);
                    ca.remove(startView);
                    ca2.remove(endView);
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.view.View, android.support.transition.TransitionValues> */
    /* renamed from: a, reason: contains not printable characters */
    private void m۸۲۳۲a(Ca<View, Cs> ca, Ca<View, Cs> ca2) {
        for (int i = 0; i < ca.size(); i++) {
            Cs start = ca.m۸۵۸۶d(i);
            if (m۸۲۶۴b(start.f۸۶۳۱b)) {
                this.f۸۶۰۰v.add(start);
                this.f۸۶۰۱w.add(null);
            }
        }
        for (int i2 = 0; i2 < ca2.size(); i2++) {
            Cs end = ca2.m۸۵۸۶d(i2);
            if (m۸۲۶۴b(end.f۸۶۳۱b)) {
                this.f۸۶۰۱w.add(end);
                this.f۸۶۰۰v.add(null);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.view.View, android.support.transition.TransitionValues> */
    /* renamed from: a, reason: contains not printable characters */
    private void m۸۲۳۰a(Ct startValues, Ct endValues) {
        Ca<View, Cs> ca = new Ca<>(startValues.f۸۶۳۳a);
        Ca<View, Cs> ca2 = new Ca<>(endValues.f۸۶۳۳a);
        int i = 0;
        while (true) {
            int[] iArr = this.f۸۵۹۹u;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m۸۲۳۸b(ca, ca2);
                } else if (i2 == 2) {
                    m۸۲۳۳a(ca, ca2, startValues.f۸۶۳۶d, endValues.f۸۶۳۶d);
                } else if (i2 == 3) {
                    m۸۲۳۵a(ca, ca2, startValues.f۸۶۳۴b, endValues.f۸۶۳۴b);
                } else if (i2 == 4) {
                    m۸۲۳۴a(ca, ca2, startValues.f۸۶۳۵c, endValues.f۸۶۳۵c);
                }
                i++;
            } else {
                m۸۲۳۲a(ca, ca2);
                return;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.animation.Animator, android.support.transition.Transition$AnimationInfo> */
    /* renamed from: a, reason: contains not printable characters */
    protected void mo۸۳۱۶a(ViewGroup sceneRoot, Ct startValues, Ct endValues, ArrayList<Cs> arrayList, ArrayList<Cs> arrayList2) {
        Cs start;
        Cs end;
        int startValuesListCount;
        int i;
        View view;
        Cs infoValues;
        Animator animator;
        long minStartDelay;
        Animator animator2;
        Animator animator3;
        int numExistingAnims;
        Ca<Animator, d> ca = m۸۲۴۰q();
        long minStartDelay2 = Long.MAX_VALUE;
        SparseIntArray startDelays = new SparseIntArray();
        int startValuesListCount2 = arrayList.size();
        int i2 = 0;
        while (i2 < startValuesListCount2) {
            Cs start2 = arrayList.get(i2);
            Cs end2 = arrayList2.get(i2);
            if (start2 != null && !start2.f۸۶۳۲c.contains(this)) {
                start = null;
            } else {
                start = start2;
            }
            if (end2 != null && !end2.f۸۶۳۲c.contains(this)) {
                end = null;
            } else {
                end = end2;
            }
            if (start == null && end == null) {
                startValuesListCount = startValuesListCount2;
                i = i2;
            } else {
                boolean isChanged = start == null || end == null || mo۸۲۵۸a(start, end);
                if (!isChanged) {
                    startValuesListCount = startValuesListCount2;
                    i = i2;
                } else {
                    Animator animator4 = mo۸۲۴۶a(sceneRoot, start, end);
                    if (animator4 != null) {
                        Cs infoValues2 = null;
                        if (end == null) {
                            startValuesListCount = startValuesListCount2;
                            i = i2;
                            view = start.f۸۶۳۱b;
                            infoValues = null;
                            animator = animator4;
                        } else {
                            View view2 = end.f۸۶۳۱b;
                            String[] properties = mo۸۲۷۹n();
                            if (view2 == null || properties == null) {
                                animator2 = animator4;
                                startValuesListCount = startValuesListCount2;
                                i = i2;
                            } else {
                                animator2 = animator4;
                                if (properties.length <= 0) {
                                    startValuesListCount = startValuesListCount2;
                                    i = i2;
                                } else {
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
                                    int numExistingAnims2 = ca.size();
                                    int j2 = 0;
                                    while (true) {
                                        if (j2 >= numExistingAnims2) {
                                            animator3 = animator2;
                                            break;
                                        }
                                        Animator anim = ca.m۸۵۸۴b(j2);
                                        d info2 = ca.get(anim);
                                        if (info2.f۸۶۱۰c == null || info2.f۸۶۰۸a != view2) {
                                            numExistingAnims = numExistingAnims2;
                                        } else {
                                            numExistingAnims = numExistingAnims2;
                                            if (info2.f۸۶۰۹b.equals(m۸۲۷۰e()) && info2.f۸۶۱۰c.equals(infoValues2)) {
                                                animator3 = null;
                                                break;
                                            }
                                        }
                                        j2++;
                                        numExistingAnims2 = numExistingAnims;
                                    }
                                    animator = animator3;
                                    infoValues = infoValues2;
                                    view = view2;
                                }
                            }
                            animator3 = animator2;
                            animator = animator3;
                            infoValues = infoValues2;
                            view = view2;
                        }
                        if (animator != null) {
                            AbstractCp abstractCp = this.f۸۵۷۷E;
                            if (abstractCp == null) {
                                minStartDelay = minStartDelay2;
                            } else {
                                long delay = abstractCp.m۸۲۹۷a(sceneRoot, this, start, end);
                                startDelays.put(this.f۸۵۷۶D.size(), (int) delay);
                                minStartDelay = Math.min(delay, minStartDelay2);
                            }
                            ca.put(animator, new d(view, m۸۲۷۰e(), this, Cd0.m۸۱۵۴d(sceneRoot), infoValues));
                            this.f۸۵۷۶D.add(animator);
                            minStartDelay2 = minStartDelay;
                        }
                    } else {
                        startValuesListCount = startValuesListCount2;
                        i = i2;
                    }
                }
            }
            i2 = i + 1;
            startValuesListCount2 = startValuesListCount;
        }
        if (minStartDelay2 != 0) {
            for (int i3 = 0; i3 < startDelays.size(); i3++) {
                int index = startDelays.keyAt(i3);
                Animator animator5 = this.f۸۵۷۶D.get(index);
                animator5.setStartDelay((startDelays.valueAt(i3) - minStartDelay2) + animator5.getStartDelay());
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۸۲۶۴b(View target) {
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
                Class type = this.f۸۵۹۱m.get(i);
                if (type.isInstance(target)) {
                    return false;
                }
            }
        }
        if (this.f۸۵۹۲n != null && Cu.m۱۰۹۵۰q(target) != null && this.f۸۵۹۲n.contains(Cu.m۱۰۹۵۰q(target))) {
            return false;
        }
        if ((this.f۸۵۸۵g.size() == 0 && this.f۸۵۸۶h.size() == 0 && (((arrayList = this.f۸۵۸۸j) == null || arrayList.isEmpty()) && ((arrayList2 = this.f۸۵۸۷i) == null || arrayList2.isEmpty()))) || this.f۸۵۸۵g.contains(Integer.valueOf(targetId)) || this.f۸۵۸۶h.contains(target)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f۸۵۸۷i;
        if (arrayList6 != null && arrayList6.contains(Cu.m۱۰۹۵۰q(target))) {
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

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.animation.Animator, android.support.transition.Transition$AnimationInfo> */
    /* renamed from: q, reason: contains not printable characters */
    private static Ca<Animator, d> m۸۲۴۰q() {
        Ca<Animator, d> ca = f۸۵۷۲K.get();
        if (ca == null) {
            Ca<Animator, d> ca2 = new Ca<>();
            f۸۵۷۲K.set(ca2);
            return ca2;
        }
        return ca;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.animation.Animator, android.support.transition.Transition$AnimationInfo> */
    /* renamed from: o, reason: contains not printable characters */
    protected void mo۸۳۲۹o() {
        m۸۲۸۱p();
        Ca<Animator, d> ca = m۸۲۴۰q();
        Iterator<Animator> it = this.f۸۵۷۶D.iterator();
        while (it.hasNext()) {
            Animator anim = it.next();
            if (ca.containsKey(anim)) {
                m۸۲۸۱p();
                m۸۲۳۶a(anim, ca);
            }
        }
        this.f۸۵۷۶D.clear();
        m۸۲۴۸a();
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.animation.Animator, android.support.transition.Transition$AnimationInfo> */
    /* renamed from: a, reason: contains not printable characters */
    private void m۸۲۳۶a(Animator animator, Ca<Animator, d> ca) {
        if (animator != null) {
            animator.addListener(new b(ca));
            m۸۲۵۳a(animator);
        }
    }

    /* renamed from: a.b.f.m$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ Ca f۸۶۰۵a;

        b(Ca ca) {
            this.f۸۶۰۵a = ca;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AbstractCm.this.f۸۶۰۳y.add(animation);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.f۸۶۰۵a.remove(animation);
            AbstractCm.this.f۸۶۰۳y.remove(animation);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCm mo۸۳۱۰a(View target) {
        this.f۸۵۸۶h.add(target);
        return this;
    }

    /* renamed from: d, reason: contains not printable characters */
    public AbstractCm mo۸۳۲۷d(View target) {
        this.f۸۵۸۶h.remove(target);
        return this;
    }

    /* renamed from: i, reason: contains not printable characters */
    public List<Integer> m۸۲۷۵i() {
        return this.f۸۵۸۵g;
    }

    /* renamed from: m, reason: contains not printable characters */
    public List<View> m۸۲۷۸m() {
        return this.f۸۵۸۶h;
    }

    /* renamed from: j, reason: contains not printable characters */
    public List<String> m۸۲۷۶j() {
        return this.f۸۵۸۷i;
    }

    /* renamed from: k, reason: contains not printable characters */
    public List<Class> m۸۲۷۷k() {
        return this.f۸۵۸۸j;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۸۲۵۶a(ViewGroup sceneRoot, boolean start) {
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        Ca<String, String> ca;
        m۸۲۵۷a(start);
        if ((this.f۸۵۸۵g.size() > 0 || this.f۸۵۸۶h.size() > 0) && (((arrayList = this.f۸۵۸۷i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f۸۵۸۸j) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f۸۵۸۵g.size(); i++) {
                int id = this.f۸۵۸۵g.get(i).intValue();
                View view = sceneRoot.findViewById(id);
                if (view != null) {
                    Cs values = new Cs();
                    values.f۸۶۳۱b = view;
                    if (start) {
                        mo۸۳۲۳c(values);
                    } else {
                        mo۸۳۱۵a(values);
                    }
                    values.f۸۶۳۲c.add(this);
                    mo۸۳۲۲b(values);
                    if (start) {
                        m۸۲۳۱a(this.f۸۵۹۶r, view, values);
                    } else {
                        m۸۲۳۱a(this.f۸۵۹۷s, view, values);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f۸۵۸۶h.size(); i2++) {
                View view2 = this.f۸۵۸۶h.get(i2);
                Cs values2 = new Cs();
                values2.f۸۶۳۱b = view2;
                if (start) {
                    mo۸۳۲۳c(values2);
                } else {
                    mo۸۳۱۵a(values2);
                }
                values2.f۸۶۳۲c.add(this);
                mo۸۳۲۲b(values2);
                if (start) {
                    m۸۲۳۱a(this.f۸۵۹۶r, view2, values2);
                } else {
                    m۸۲۳۱a(this.f۸۵۹۷s, view2, values2);
                }
            }
        } else {
            m۸۲۳۹c(sceneRoot, start);
        }
        if (!start && (ca = this.f۸۵۷۹G) != null) {
            int numOverrides = ca.size();
            ArrayList<View> overriddenViews = new ArrayList<>(numOverrides);
            for (int i3 = 0; i3 < numOverrides; i3++) {
                String fromName = this.f۸۵۷۹G.m۸۵۸۴b(i3);
                overriddenViews.add(this.f۸۵۹۶r.f۸۶۳۶d.remove(fromName));
            }
            for (int i4 = 0; i4 < numOverrides; i4++) {
                View view3 = overriddenViews.get(i4);
                if (view3 != null) {
                    String toName = this.f۸۵۷۹G.m۸۵۸۶d(i4);
                    this.f۸۵۹۶r.f۸۶۳۶d.put(toName, view3);
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۸۲۳۱a(Ct transitionValuesMaps, View view, Cs transitionValues) {
        transitionValuesMaps.f۸۶۳۳a.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            if (transitionValuesMaps.f۸۶۳۴b.indexOfKey(id) >= 0) {
                transitionValuesMaps.f۸۶۳۴b.put(id, null);
            } else {
                transitionValuesMaps.f۸۶۳۴b.put(id, view);
            }
        }
        String name = Cu.m۱۰۹۵۰q(view);
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
                int position = listview.getPositionForView(view);
                long itemId = listview.getItemIdAtPosition(position);
                if (transitionValuesMaps.f۸۶۳۵c.m۸۵۳۲c(itemId) >= 0) {
                    View alreadyMatched = transitionValuesMaps.f۸۶۳۵c.m۸۵۲۹b(itemId);
                    if (alreadyMatched != null) {
                        Cu.m۱۰۹۲۸b(alreadyMatched, false);
                        transitionValuesMaps.f۸۶۳۵c.m۸۵۳۴c(itemId, null);
                        return;
                    }
                    return;
                }
                Cu.m۱۰۹۲۸b(view, true);
                transitionValuesMaps.f۸۶۳۵c.m۸۵۳۴c(itemId, view);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۸۲۵۷a(boolean start) {
        if (start) {
            this.f۸۵۹۶r.f۸۶۳۳a.clear();
            this.f۸۵۹۶r.f۸۶۳۴b.clear();
            this.f۸۵۹۶r.f۸۶۳۵c.m۸۵۲۵a();
        } else {
            this.f۸۵۹۷s.f۸۶۳۳a.clear();
            this.f۸۵۹۷s.f۸۶۳۴b.clear();
            this.f۸۵۹۷s.f۸۶۳۵c.m۸۵۲۵a();
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۸۲۳۹c(View view, boolean start) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f۸۵۸۹k;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList2 = this.f۸۵۹۰l;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
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
                mo۸۳۲۳c(values);
            } else {
                mo۸۳۱۵a(values);
            }
            values.f۸۶۳۲c.add(this);
            mo۸۳۲۲b(values);
            if (start) {
                m۸۲۳۱a(this.f۸۵۹۶r, view, values);
            } else {
                m۸۲۳۱a(this.f۸۵۹۷s, view, values);
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList<Integer> arrayList4 = this.f۸۵۹۳o;
            if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id))) {
                return;
            }
            ArrayList<View> arrayList5 = this.f۸۵۹۴p;
            if (arrayList5 != null && arrayList5.contains(view)) {
                return;
            }
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
                m۸۲۳۹c(parent.getChildAt(i3), start);
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public Cs m۸۲۶۲b(View view, boolean start) {
        Cq cq = this.f۸۵۹۸t;
        if (cq != null) {
            return cq.m۸۲۶۲b(view, start);
        }
        Ct valuesMaps = start ? this.f۸۵۹۶r : this.f۸۵۹۷s;
        return valuesMaps.f۸۶۳۳a.get(view);
    }

    /* renamed from: a, reason: contains not printable characters */
    Cs m۸۲۴۵a(View view, boolean viewInStart) {
        Cq cq = this.f۸۵۹۸t;
        if (cq != null) {
            return cq.m۸۲۴۵a(view, viewInStart);
        }
        ArrayList<Cs> arrayList = viewInStart ? this.f۸۶۰۰v : this.f۸۶۰۱w;
        if (arrayList == null) {
            return null;
        }
        int count = arrayList.size();
        int index = -1;
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            }
            Cs values = arrayList.get(i);
            if (values == null) {
                return null;
            }
            if (values.f۸۶۳۱b != view) {
                i++;
            } else {
                index = i;
                break;
            }
        }
        if (index < 0) {
            return null;
        }
        return (viewInStart ? this.f۸۶۰۱w : this.f۸۶۰۰v).get(index);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.animation.Animator, android.support.transition.Transition$AnimationInfo> */
    /* renamed from: c, reason: contains not printable characters */
    public void mo۸۳۲۴c(View sceneRoot) {
        if (!this.f۸۵۷۴B) {
            Ca<Animator, d> ca = m۸۲۴۰q();
            int numOldAnims = ca.size();
            InterfaceCl0 windowId = Cd0.m۸۱۵۴d(sceneRoot);
            for (int i = numOldAnims - 1; i >= 0; i--) {
                d info2 = ca.m۸۵۸۶d(i);
                if (info2.f۸۶۰۸a != null && windowId.equals(info2.f۸۶۱۱d)) {
                    Animator anim = ca.m۸۵۸۴b(i);
                    Ca.m۸۰۹۷a(anim);
                }
            }
            ArrayList<f> arrayList = this.f۸۵۷۵C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f۸۵۷۵C.clone();
                int numListeners = tmpListeners.size();
                for (int i2 = 0; i2 < numListeners; i2++) {
                    ((f) tmpListeners.get(i2)).mo۸۲۸۸a(this);
                }
            }
            this.f۸۵۷۳A = true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.animation.Animator, android.support.transition.Transition$AnimationInfo> */
    /* renamed from: e, reason: contains not printable characters */
    public void mo۸۳۲۸e(View sceneRoot) {
        if (this.f۸۵۷۳A) {
            if (!this.f۸۵۷۴B) {
                Ca<Animator, d> ca = m۸۲۴۰q();
                int numOldAnims = ca.size();
                InterfaceCl0 windowId = Cd0.m۸۱۵۴d(sceneRoot);
                for (int i = numOldAnims - 1; i >= 0; i--) {
                    d info2 = ca.m۸۵۸۶d(i);
                    if (info2.f۸۶۰۸a != null && windowId.equals(info2.f۸۶۱۱d)) {
                        Animator anim = ca.m۸۵۸۴b(i);
                        Ca.m۸۰۹۹b(anim);
                    }
                }
                ArrayList<f> arrayList = this.f۸۵۷۵C;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f۸۵۷۵C.clone();
                    int numListeners = tmpListeners.size();
                    for (int i2 = 0; i2 < numListeners; i2++) {
                        ((f) tmpListeners.get(i2)).mo۸۲۹۰d(this);
                    }
                }
            }
            this.f۸۵۷۳A = false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<android.animation.Animator, android.support.transition.Transition$AnimationInfo> */
    /* renamed from: a, reason: contains not printable characters */
    void m۸۲۵۴a(ViewGroup sceneRoot) {
        d oldInfo;
        this.f۸۶۰۰v = new ArrayList<>();
        this.f۸۶۰۱w = new ArrayList<>();
        m۸۲۳۰a(this.f۸۵۹۶r, this.f۸۵۹۷s);
        Ca<Animator, d> ca = m۸۲۴۰q();
        int numOldAnims = ca.size();
        InterfaceCl0 windowId = Cd0.m۸۱۵۴d(sceneRoot);
        for (int i = numOldAnims - 1; i >= 0; i--) {
            Animator anim = ca.m۸۵۸۴b(i);
            if (anim != null && (oldInfo = ca.get(anim)) != null && oldInfo.f۸۶۰۸a != null && windowId.equals(oldInfo.f۸۶۱۱d)) {
                Cs oldValues = oldInfo.f۸۶۱۰c;
                View oldView = oldInfo.f۸۶۰۸a;
                Cs startValues = m۸۲۶۲b(oldView, true);
                Cs endValues = m۸۲۴۵a(oldView, true);
                boolean cancel = !(startValues == null && endValues == null) && oldInfo.f۸۶۱۲e.mo۸۲۵۸a(oldValues, endValues);
                if (cancel) {
                    if (anim.isRunning() || anim.isStarted()) {
                        anim.cancel();
                    } else {
                        ca.remove(anim);
                    }
                }
            }
        }
        mo۸۳۱۶a(sceneRoot, this.f۸۵۹۶r, this.f۸۵۹۷s, this.f۸۶۰۰v, this.f۸۶۰۱w);
        mo۸۳۲۹o();
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۸۲۵۸a(Cs startValues, Cs endValues) {
        if (startValues == null || endValues == null) {
            return false;
        }
        String[] properties = mo۸۲۷۹n();
        if (properties != null) {
            for (String property : properties) {
                if (m۸۲۳۷a(startValues, endValues, property)) {
                    return true;
                }
            }
            return false;
        }
        for (String key : startValues.f۸۶۳۰a.keySet()) {
            if (m۸۲۳۷a(startValues, endValues, key)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۸۲۳۷a(Cs oldValues, Cs newValues, String key) {
        Object oldValue = oldValues.f۸۶۳۰a.get(key);
        Object newValue = newValues.f۸۶۳۰a.get(key);
        if (oldValue == null && newValue == null) {
            return false;
        }
        if (oldValue == null || newValue == null) {
            return true;
        }
        boolean changed = !oldValue.equals(newValue);
        return changed;
    }

    /* renamed from: a, reason: contains not printable characters */
    protected void m۸۲۵۳a(Animator animator) {
        if (animator == null) {
            m۸۲۴۸a();
            return;
        }
        if (m۸۲۵۹b() >= 0) {
            animator.setDuration(m۸۲۵۹b());
        }
        if (m۸۲۷۴h() >= 0) {
            animator.setStartDelay(m۸۲۷۴h());
        }
        if (m۸۲۶۹d() != null) {
            animator.setInterpolator(m۸۲۶۹d());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* renamed from: a.b.f.m$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractCm.this.m۸۲۴۸a();
            animation.removeListener(this);
        }
    }

    /* renamed from: p, reason: contains not printable characters */
    protected void m۸۲۸۱p() {
        if (this.f۸۶۰۴z == 0) {
            ArrayList<f> arrayList = this.f۸۵۷۵C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f۸۵۷۵C.clone();
                int numListeners = tmpListeners.size();
                for (int i = 0; i < numListeners; i++) {
                    ((f) tmpListeners.get(i)).mo۸۳۳۳c(this);
                }
            }
            this.f۸۵۷۴B = false;
        }
        this.f۸۶۰۴z++;
    }

    /* renamed from: a, reason: contains not printable characters */
    protected void m۸۲۴۸a() {
        this.f۸۶۰۴z--;
        if (this.f۸۶۰۴z == 0) {
            ArrayList<f> arrayList = this.f۸۵۷۵C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<Transition.TransitionListener> tmpListeners = (ArrayList) this.f۸۵۷۵C.clone();
                int numListeners = tmpListeners.size();
                for (int i = 0; i < numListeners; i++) {
                    ((f) tmpListeners.get(i)).mo۸۳۳۲b(this);
                }
            }
            for (int i2 = 0; i2 < this.f۸۵۹۶r.f۸۶۳۵c.m۸۵۲۸b(); i2++) {
                View view = this.f۸۵۹۶r.f۸۶۳۵c.m۸۵۳۳c(i2);
                if (view != null) {
                    Cu.m۱۰۹۲۸b(view, false);
                }
            }
            for (int i3 = 0; i3 < this.f۸۵۹۷s.f۸۶۳۵c.m۸۵۲۸b(); i3++) {
                View view2 = this.f۸۵۹۷s.f۸۶۳۵c.m۸۵۳۳c(i3);
                if (view2 != null) {
                    Cu.m۱۰۹۲۸b(view2, false);
                }
            }
            this.f۸۵۷۴B = true;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCm mo۸۳۰۷a(f listener) {
        if (this.f۸۵۷۵C == null) {
            this.f۸۵۷۵C = new ArrayList<>();
        }
        this.f۸۵۷۵C.add(listener);
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    public AbstractCm mo۸۳۲۱b(f listener) {
        ArrayList<f> arrayList = this.f۸۵۷۵C;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(listener);
        if (this.f۸۵۷۵C.size() == 0) {
            this.f۸۵۷۵C = null;
        }
        return this;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۱۲a(AbstractCg pathMotion) {
        if (pathMotion == null) {
            this.f۸۵۸۰H = f۸۵۷۱J;
        } else {
            this.f۸۵۸۰H = pathMotion;
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    public AbstractCg m۸۲۷۲f() {
        return this.f۸۵۸۰H;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۱۳a(e epicenterCallback) {
        this.f۸۵۷۸F = epicenterCallback;
    }

    /* renamed from: c, reason: contains not printable characters */
    public e m۸۲۶۵c() {
        return this.f۸۵۷۸F;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۱۴a(AbstractCp transitionPropagation) {
        this.f۸۵۷۷E = transitionPropagation;
    }

    /* renamed from: g, reason: contains not printable characters */
    public AbstractCp m۸۲۷۳g() {
        return this.f۸۵۷۷E;
    }

    /* renamed from: b, reason: contains not printable characters */
    void mo۸۳۲۲b(Cs transitionValues) {
        String[] propertyNames;
        if (this.f۸۵۷۷E == null || transitionValues.f۸۶۳۰a.isEmpty() || (propertyNames = this.f۸۵۷۷E.m۸۲۹۹a()) == null) {
            return;
        }
        boolean containsAll = true;
        int i = 0;
        while (true) {
            if (i >= propertyNames.length) {
                break;
            }
            if (transitionValues.f۸۶۳۰a.containsKey(propertyNames[i])) {
                i++;
            } else {
                containsAll = false;
                break;
            }
        }
        if (!containsAll) {
            this.f۸۵۷۷E.m۸۲۹۸a(transitionValues);
        }
    }

    public String toString() {
        return mo۸۳۱۱a("");
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AbstractCm mo۸۳۲۵clone() {
        try {
            AbstractCm clone = (AbstractCm) super.clone();
            clone.f۸۵۷۶D = new ArrayList<>();
            clone.f۸۵۹۶r = new Ct();
            clone.f۸۵۹۷s = new Ct();
            clone.f۸۶۰۰v = null;
            clone.f۸۶۰۱w = null;
            return clone;
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: e, reason: contains not printable characters */
    public String m۸۲۷۰e() {
        return this.f۸۵۸۱c;
    }

    /* renamed from: a, reason: contains not printable characters */
    String mo۸۳۱۱a(String indent) {
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
        if (this.f۸۵۸۵g.size() > 0 || this.f۸۵۸۶h.size() > 0) {
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
        return result;
    }

    /* renamed from: a.b.f.m$d */
    private static class d {

        /* renamed from: a, reason: contains not printable characters */
        View f۸۶۰۸a;

        /* renamed from: b, reason: contains not printable characters */
        String f۸۶۰۹b;

        /* renamed from: c, reason: contains not printable characters */
        Cs f۸۶۱۰c;

        /* renamed from: d, reason: contains not printable characters */
        InterfaceCl0 f۸۶۱۱d;

        /* renamed from: e, reason: contains not printable characters */
        AbstractCm f۸۶۱۲e;

        d(View view, String name, AbstractCm transition, InterfaceCl0 windowId, Cs values) {
            this.f۸۶۰۸a = view;
            this.f۸۶۰۹b = name;
            this.f۸۶۱۰c = values;
            this.f۸۶۱۱d = windowId;
            this.f۸۶۱۲e = transition;
        }
    }
}
