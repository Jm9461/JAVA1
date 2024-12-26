package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.app.FragmentTransition;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.u;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f۱۱۶۲a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b  reason: collision with root package name */
    private static final t f۱۱۶۳b = (Build.VERSION.SDK_INT >= 21 ? new s() : null);

    /* renamed from: c  reason: collision with root package name */
    private static final t f۱۱۶۴c = a();

    private static t a() {
        try {
            return (t) Class.forName("a.b.f.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            return null;
        }
    }

    static void a(l fragmentManager, ArrayList<c> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex, boolean isReordered) {
        if (fragmentManager.n >= 1) {
            SparseArray<FragmentTransition.FragmentContainerTransition> transitioningFragments = new SparseArray<>();
            for (int i = startIndex; i < endIndex; i++) {
                c record = arrayList.get(i);
                if (isRecordPop.get(i).booleanValue()) {
                    b(record, (SparseArray<e>) transitioningFragments, isReordered);
                } else {
                    a(record, (SparseArray<e>) transitioningFragments, isReordered);
                }
            }
            if (transitioningFragments.size() != 0) {
                View nonExistentView = new View(fragmentManager.o.c());
                int numContainers = transitioningFragments.size();
                for (int i2 = 0; i2 < numContainers; i2++) {
                    int containerId = transitioningFragments.keyAt(i2);
                    ArrayMap<String, String> nameOverrides = a(containerId, arrayList, isRecordPop, startIndex, endIndex);
                    e containerTransition = (e) transitioningFragments.valueAt(i2);
                    if (isReordered) {
                        b(fragmentManager, containerId, containerTransition, nonExistentView, nameOverrides);
                    } else {
                        a(fragmentManager, containerId, containerTransition, nonExistentView, (a.b.g.g.a<String, String>) nameOverrides);
                    }
                }
            }
        }
    }

    private static a.b.g.g.a<String, String> a(int containerId, ArrayList<c> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        ArrayList<String> sources;
        ArrayList<String> targets;
        ArrayMap<String, String> nameOverrides = new a.b.g.g.a<>();
        for (int recordNum = endIndex - 1; recordNum >= startIndex; recordNum--) {
            c record = arrayList.get(recordNum);
            if (record.b(containerId)) {
                boolean isPop = isRecordPop.get(recordNum).booleanValue();
                ArrayList<String> arrayList2 = record.q;
                if (arrayList2 != null) {
                    int numSharedElements = arrayList2.size();
                    if (isPop) {
                        targets = record.q;
                        sources = record.r;
                    } else {
                        sources = record.q;
                        targets = record.r;
                    }
                    for (int i = 0; i < numSharedElements; i++) {
                        String sourceName = sources.get(i);
                        String targetName = targets.get(i);
                        String previousTarget = nameOverrides.remove(targetName);
                        if (previousTarget != null) {
                            nameOverrides.put(sourceName, previousTarget);
                        } else {
                            nameOverrides.put(sourceName, targetName);
                        }
                    }
                }
            }
        }
        return nameOverrides;
    }

    private static void b(l fragmentManager, int containerId, e fragments, View nonExistentView, a.b.g.g.a<String, String> aVar) {
        ViewGroup sceneRoot;
        f inFragment;
        f outFragment;
        t impl;
        Object exitTransition;
        if (fragmentManager.p.a()) {
            sceneRoot = (ViewGroup) fragmentManager.p.a(containerId);
        } else {
            sceneRoot = null;
        }
        if (sceneRoot != null && (impl = a((outFragment = fragments.f۱۱۸۷d), (inFragment = fragments.f۱۱۸۴a))) != null) {
            boolean inIsPop = fragments.f۱۱۸۵b;
            boolean outIsPop = fragments.f۱۱۸۸e;
            ArrayList<View> sharedElementsIn = new ArrayList<>();
            ArrayList<View> sharedElementsOut = new ArrayList<>();
            Object enterTransition = a(impl, inFragment, inIsPop);
            Object exitTransition2 = b(impl, outFragment, outIsPop);
            Object sharedElementTransition = b(impl, sceneRoot, nonExistentView, aVar, fragments, sharedElementsOut, sharedElementsIn, enterTransition, exitTransition2);
            if (enterTransition == null && sharedElementTransition == null) {
                exitTransition = exitTransition2;
                if (exitTransition == null) {
                    return;
                }
            } else {
                exitTransition = exitTransition2;
            }
            ArrayList<View> exitingViews = a(impl, exitTransition, outFragment, sharedElementsOut, nonExistentView);
            ArrayList<View> enteringViews = a(impl, enterTransition, inFragment, sharedElementsIn, nonExistentView);
            a(enteringViews, 4);
            Object transition = a(impl, enterTransition, exitTransition, sharedElementTransition, inFragment, inIsPop);
            if (transition != null) {
                a(impl, exitTransition, outFragment, exitingViews);
                ArrayList<String> inNames = impl.a(sharedElementsIn);
                impl.a(transition, enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn);
                impl.a(sceneRoot, transition);
                impl.a(sceneRoot, sharedElementsOut, sharedElementsIn, inNames, aVar);
                a(enteringViews, 0);
                impl.b(sharedElementTransition, sharedElementsOut, sharedElementsIn);
            }
        }
    }

    private static void a(t impl, Object exitTransition, f exitingFragment, ArrayList<View> exitingViews) {
        if (exitingFragment != null && exitTransition != null && exitingFragment.m && exitingFragment.C && exitingFragment.Q) {
            exitingFragment.f(true);
            impl.a(exitTransition, exitingFragment.A(), exitingViews);
            a0.a(exitingFragment.J, new a(exitingViews));
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۱۶۵c;

        a(ArrayList arrayList) {
            this.f۱۱۶۵c = arrayList;
        }

        public void run() {
            r.a(this.f۱۱۶۵c, 4);
        }
    }

    private static void a(l fragmentManager, int containerId, e fragments, View nonExistentView, a.b.g.g.a<String, String> aVar) {
        ViewGroup sceneRoot;
        f inFragment;
        f outFragment;
        t impl;
        Object exitTransition;
        Object exitTransition2;
        if (fragmentManager.p.a()) {
            sceneRoot = (ViewGroup) fragmentManager.p.a(containerId);
        } else {
            sceneRoot = null;
        }
        if (sceneRoot != null && (impl = a((outFragment = fragments.f۱۱۸۷d), (inFragment = fragments.f۱۱۸۴a))) != null) {
            boolean inIsPop = fragments.f۱۱۸۵b;
            boolean outIsPop = fragments.f۱۱۸۸e;
            Object enterTransition = a(impl, inFragment, inIsPop);
            Object exitTransition3 = b(impl, outFragment, outIsPop);
            ArrayList<View> sharedElementsOut = new ArrayList<>();
            ArrayList<View> sharedElementsIn = new ArrayList<>();
            Object sharedElementTransition = a(impl, sceneRoot, nonExistentView, aVar, fragments, sharedElementsOut, sharedElementsIn, enterTransition, exitTransition3);
            if (enterTransition == null && sharedElementTransition == null) {
                exitTransition = exitTransition3;
                if (exitTransition == null) {
                    return;
                }
            } else {
                exitTransition = exitTransition3;
            }
            ArrayList<View> exitingViews = a(impl, exitTransition, outFragment, sharedElementsOut, nonExistentView);
            if (exitingViews == null || exitingViews.isEmpty()) {
                exitTransition2 = null;
            } else {
                exitTransition2 = exitTransition;
            }
            impl.a(enterTransition, nonExistentView);
            Object transition = a(impl, enterTransition, exitTransition2, sharedElementTransition, inFragment, fragments.f۱۱۸۵b);
            if (transition != null) {
                ArrayList<View> enteringViews = new ArrayList<>();
                impl.a(transition, enterTransition, enteringViews, exitTransition2, exitingViews, sharedElementTransition, sharedElementsIn);
                a(impl, sceneRoot, inFragment, nonExistentView, sharedElementsIn, enterTransition, enteringViews, exitTransition2, exitingViews);
                impl.a((View) sceneRoot, sharedElementsIn, (Map<String, String>) aVar);
                impl.a(sceneRoot, transition);
                impl.a(sceneRoot, sharedElementsIn, (Map<String, String>) aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f۱۱۶۶c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t f۱۱۶۷d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f۱۱۶۸e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f۱۱۶۹f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۱۷۰g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۱۷۱h;
        final /* synthetic */ ArrayList i;
        final /* synthetic */ Object j;

        b(Object obj, t tVar, View view, f fVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f۱۱۶۶c = obj;
            this.f۱۱۶۷d = tVar;
            this.f۱۱۶۸e = view;
            this.f۱۱۶۹f = fVar;
            this.f۱۱۷۰g = arrayList;
            this.f۱۱۷۱h = arrayList2;
            this.i = arrayList3;
            this.j = obj2;
        }

        public void run() {
            Object obj = this.f۱۱۶۶c;
            if (obj != null) {
                this.f۱۱۶۷d.b(obj, this.f۱۱۶۸e);
                this.f۱۱۷۱h.addAll(r.a(this.f۱۱۶۷d, this.f۱۱۶۶c, this.f۱۱۶۹f, this.f۱۱۷۰g, this.f۱۱۶۸e));
            }
            if (this.i != null) {
                if (this.j != null) {
                    ArrayList<View> tempExiting = new ArrayList<>();
                    tempExiting.add(this.f۱۱۶۸e);
                    this.f۱۱۶۷d.a(this.j, this.i, tempExiting);
                }
                this.i.clear();
                this.i.add(this.f۱۱۶۸e);
            }
        }
    }

    private static void a(t impl, ViewGroup sceneRoot, f inFragment, View nonExistentView, ArrayList<View> sharedElementsIn, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews) {
        a0.a(sceneRoot, new b(enterTransition, impl, nonExistentView, inFragment, sharedElementsIn, enteringViews, exitingViews, exitTransition));
    }

    private static t a(f outFragment, f inFragment) {
        ArrayList<Object> transitions = new ArrayList<>();
        if (outFragment != null) {
            Object exitTransition = outFragment.n();
            if (exitTransition != null) {
                transitions.add(exitTransition);
            }
            Object returnTransition = outFragment.w();
            if (returnTransition != null) {
                transitions.add(returnTransition);
            }
            Object sharedReturnTransition = outFragment.y();
            if (sharedReturnTransition != null) {
                transitions.add(sharedReturnTransition);
            }
        }
        if (inFragment != null) {
            Object enterTransition = inFragment.l();
            if (enterTransition != null) {
                transitions.add(enterTransition);
            }
            Object reenterTransition = inFragment.u();
            if (reenterTransition != null) {
                transitions.add(reenterTransition);
            }
            Object sharedEnterTransition = inFragment.x();
            if (sharedEnterTransition != null) {
                transitions.add(sharedEnterTransition);
            }
        }
        if (transitions.isEmpty()) {
            return null;
        }
        t tVar = f۱۱۶۳b;
        if (tVar != null && a(tVar, transitions)) {
            return f۱۱۶۳b;
        }
        t tVar2 = f۱۱۶۴c;
        if (tVar2 != null && a(tVar2, transitions)) {
            return f۱۱۶۴c;
        }
        if (f۱۱۶۳b == null && f۱۱۶۴c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static boolean a(t impl, List<Object> transitions) {
        int size = transitions.size();
        for (int i = 0; i < size; i++) {
            if (!impl.a(transitions.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static Object a(t impl, f inFragment, f outFragment, boolean isPop) {
        Object obj;
        if (inFragment == null || outFragment == null) {
            return null;
        }
        if (isPop) {
            obj = outFragment.y();
        } else {
            obj = inFragment.x();
        }
        return impl.c(impl.b(obj));
    }

    private static Object a(t impl, f inFragment, boolean isPop) {
        Object obj;
        if (inFragment == null) {
            return null;
        }
        if (isPop) {
            obj = inFragment.u();
        } else {
            obj = inFragment.l();
        }
        return impl.b(obj);
    }

    private static Object b(t impl, f outFragment, boolean isPop) {
        Object obj;
        if (outFragment == null) {
            return null;
        }
        if (isPop) {
            obj = outFragment.w();
        } else {
            obj = outFragment.n();
        }
        return impl.b(obj);
    }

    private static Object b(t impl, ViewGroup sceneRoot, View nonExistentView, a.b.g.g.a<String, String> aVar, e fragments, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, Object enterTransition, Object exitTransition) {
        Object sharedElementTransition;
        Object sharedElementTransition2;
        Object sharedElementTransition3;
        Rect epicenter;
        View epicenterView;
        ArrayMap<String, View> inSharedElements;
        f inFragment = fragments.f۱۱۸۴a;
        f outFragment = fragments.f۱۱۸۷d;
        if (inFragment != null) {
            inFragment.A().setVisibility(0);
        }
        if (inFragment != null) {
            if (outFragment != null) {
                boolean inIsPop = fragments.f۱۱۸۵b;
                if (aVar.isEmpty()) {
                    sharedElementTransition = null;
                } else {
                    sharedElementTransition = a(impl, inFragment, outFragment, inIsPop);
                }
                ArrayMap<String, View> outSharedElements = b(impl, aVar, sharedElementTransition, fragments);
                ArrayMap<String, View> inSharedElements2 = a(impl, aVar, sharedElementTransition, fragments);
                if (aVar.isEmpty()) {
                    if (outSharedElements != null) {
                        outSharedElements.clear();
                    }
                    if (inSharedElements2 != null) {
                        inSharedElements2.clear();
                    }
                    sharedElementTransition2 = null;
                } else {
                    a(sharedElementsOut, (a.b.g.g.a<String, View>) outSharedElements, (Collection<String>) aVar.keySet());
                    a(sharedElementsIn, (a.b.g.g.a<String, View>) inSharedElements2, aVar.values());
                    sharedElementTransition2 = sharedElementTransition;
                }
                if (enterTransition == null && exitTransition == null && sharedElementTransition2 == null) {
                    return null;
                }
                a(inFragment, outFragment, inIsPop, (a.b.g.g.a<String, View>) outSharedElements, true);
                if (sharedElementTransition2 != null) {
                    sharedElementsIn.add(nonExistentView);
                    impl.b(sharedElementTransition2, nonExistentView, sharedElementsOut);
                    sharedElementTransition3 = sharedElementTransition2;
                    inSharedElements = inSharedElements2;
                    a(impl, sharedElementTransition2, exitTransition, (a.b.g.g.a<String, View>) outSharedElements, fragments.f۱۱۸۸e, fragments.f۱۱۸۹f);
                    Rect epicenter2 = new Rect();
                    View epicenterView2 = a((a.b.g.g.a<String, View>) inSharedElements, fragments, enterTransition, inIsPop);
                    if (epicenterView2 != null) {
                        impl.a(enterTransition, epicenter2);
                    }
                    epicenter = epicenter2;
                    epicenterView = epicenterView2;
                } else {
                    sharedElementTransition3 = sharedElementTransition2;
                    inSharedElements = inSharedElements2;
                    epicenter = null;
                    epicenterView = null;
                }
                a0.a(sceneRoot, new c(inFragment, outFragment, inIsPop, inSharedElements, epicenterView, impl, epicenter));
                return sharedElementTransition3;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public static class c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f۱۱۷۲c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f۱۱۷۳d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f۱۱۷۴e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a.b.g.g.a f۱۱۷۵f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f۱۱۷۶g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ t f۱۱۷۷h;
        final /* synthetic */ Rect i;

        c(f fVar, f fVar2, boolean z, a.b.g.g.a aVar, View view, t tVar, Rect rect) {
            this.f۱۱۷۲c = fVar;
            this.f۱۱۷۳d = fVar2;
            this.f۱۱۷۴e = z;
            this.f۱۱۷۵f = aVar;
            this.f۱۱۷۶g = view;
            this.f۱۱۷۷h = tVar;
            this.i = rect;
        }

        public void run() {
            r.a(this.f۱۱۷۲c, this.f۱۱۷۳d, this.f۱۱۷۴e, (a.b.g.g.a<String, View>) this.f۱۱۷۵f, false);
            View view = this.f۱۱۷۶g;
            if (view != null) {
                this.f۱۱۷۷h.a(view, this.i);
            }
        }
    }

    private static void a(ArrayList<View> views, a.b.g.g.a<String, View> aVar, Collection<String> nameOverridesSet) {
        for (int i = aVar.size() - 1; i >= 0; i--) {
            View view = aVar.d(i);
            if (nameOverridesSet.contains(u.q(view))) {
                views.add(view);
            }
        }
    }

    private static Object a(t impl, ViewGroup sceneRoot, View nonExistentView, a.b.g.g.a<String, String> aVar, e fragments, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, Object enterTransition, Object exitTransition) {
        Object sharedElementTransition;
        Object sharedElementTransition2;
        Rect inEpicenter;
        f inFragment = fragments.f۱۱۸۴a;
        f outFragment = fragments.f۱۱۸۷d;
        if (inFragment != null) {
            if (outFragment != null) {
                boolean inIsPop = fragments.f۱۱۸۵b;
                if (aVar.isEmpty()) {
                    sharedElementTransition = null;
                } else {
                    sharedElementTransition = a(impl, inFragment, outFragment, inIsPop);
                }
                ArrayMap<String, View> outSharedElements = b(impl, aVar, sharedElementTransition, fragments);
                if (aVar.isEmpty()) {
                    sharedElementTransition2 = null;
                } else {
                    sharedElementsOut.addAll(outSharedElements.values());
                    sharedElementTransition2 = sharedElementTransition;
                }
                if (enterTransition == null && exitTransition == null && sharedElementTransition2 == null) {
                    return null;
                }
                a(inFragment, outFragment, inIsPop, (a.b.g.g.a<String, View>) outSharedElements, true);
                if (sharedElementTransition2 != null) {
                    Rect inEpicenter2 = new Rect();
                    impl.b(sharedElementTransition2, nonExistentView, sharedElementsOut);
                    a(impl, sharedElementTransition2, exitTransition, (a.b.g.g.a<String, View>) outSharedElements, fragments.f۱۱۸۸e, fragments.f۱۱۸۹f);
                    if (enterTransition != null) {
                        impl.a(enterTransition, inEpicenter2);
                    }
                    inEpicenter = inEpicenter2;
                } else {
                    inEpicenter = null;
                }
                a0.a(sceneRoot, new d(impl, aVar, sharedElementTransition2, fragments, sharedElementsIn, nonExistentView, inFragment, outFragment, inIsPop, sharedElementsOut, enterTransition, inEpicenter));
                return sharedElementTransition2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public static class d implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t f۱۱۷۸c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a.b.g.g.a f۱۱۷۹d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f۱۱۸۰e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f۱۱۸۱f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۱۸۲g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ View f۱۱۸۳h;
        final /* synthetic */ f i;
        final /* synthetic */ f j;
        final /* synthetic */ boolean k;
        final /* synthetic */ ArrayList l;
        final /* synthetic */ Object m;
        final /* synthetic */ Rect n;

        d(t tVar, a.b.g.g.a aVar, Object obj, e eVar, ArrayList arrayList, View view, f fVar, f fVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f۱۱۷۸c = tVar;
            this.f۱۱۷۹d = aVar;
            this.f۱۱۸۰e = obj;
            this.f۱۱۸۱f = eVar;
            this.f۱۱۸۲g = arrayList;
            this.f۱۱۸۳h = view;
            this.i = fVar;
            this.j = fVar2;
            this.k = z;
            this.l = arrayList2;
            this.m = obj2;
            this.n = rect;
        }

        public void run() {
            ArrayMap<String, View> inSharedElements = r.a(this.f۱۱۷۸c, this.f۱۱۷۹d, this.f۱۱۸۰e, this.f۱۱۸۱f);
            if (inSharedElements != null) {
                this.f۱۱۸۲g.addAll(inSharedElements.values());
                this.f۱۱۸۲g.add(this.f۱۱۸۳h);
            }
            r.a(this.i, this.j, this.k, (a.b.g.g.a<String, View>) inSharedElements, false);
            Object obj = this.f۱۱۸۰e;
            if (obj != null) {
                this.f۱۱۷۸c.b(obj, this.l, this.f۱۱۸۲g);
                View inEpicenterView = r.a((a.b.g.g.a<String, View>) inSharedElements, this.f۱۱۸۱f, this.m, this.k);
                if (inEpicenterView != null) {
                    this.f۱۱۷۸c.a(inEpicenterView, this.n);
                }
            }
        }
    }

    private static a.b.g.g.a<String, View> b(t impl, a.b.g.g.a<String, String> aVar, Object sharedElementTransition, e fragments) {
        ArrayList<String> names;
        c0 sharedElementCallback;
        if (aVar.isEmpty() || sharedElementTransition == null) {
            aVar.clear();
            return null;
        }
        f outFragment = fragments.f۱۱۸۷d;
        ArrayMap<String, View> outSharedElements = new a.b.g.g.a<>();
        impl.a((Map<String, View>) outSharedElements, outFragment.A());
        c outTransaction = fragments.f۱۱۸۹f;
        if (fragments.f۱۱۸۸e) {
            sharedElementCallback = outFragment.m();
            names = outTransaction.r;
        } else {
            sharedElementCallback = outFragment.o();
            names = outTransaction.q;
        }
        outSharedElements.a(names);
        if (sharedElementCallback != null) {
            sharedElementCallback.a(names, outSharedElements);
            for (int i = names.size() - 1; i >= 0; i--) {
                String name = names.get(i);
                View view = outSharedElements.get(name);
                if (view == null) {
                    aVar.remove(name);
                } else if (!name.equals(u.q(view))) {
                    aVar.put(u.q(view), aVar.remove(name));
                }
            }
        } else {
            aVar.a((Collection<?>) outSharedElements.keySet());
        }
        return outSharedElements;
    }

    static a.b.g.g.a<String, View> a(t impl, a.b.g.g.a<String, String> aVar, Object sharedElementTransition, e fragments) {
        ArrayList<String> names;
        c0 sharedElementCallback;
        String key;
        f inFragment = fragments.f۱۱۸۴a;
        View fragmentView = inFragment.A();
        if (aVar.isEmpty() || sharedElementTransition == null || fragmentView == null) {
            aVar.clear();
            return null;
        }
        ArrayMap<String, View> inSharedElements = new a.b.g.g.a<>();
        impl.a((Map<String, View>) inSharedElements, fragmentView);
        c inTransaction = fragments.f۱۱۸۶c;
        if (fragments.f۱۱۸۵b) {
            sharedElementCallback = inFragment.o();
            names = inTransaction.q;
        } else {
            sharedElementCallback = inFragment.m();
            names = inTransaction.r;
        }
        if (names != null) {
            inSharedElements.a(names);
            inSharedElements.a(aVar.values());
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.a(names, inSharedElements);
            for (int i = names.size() - 1; i >= 0; i--) {
                String name = names.get(i);
                View view = inSharedElements.get(name);
                if (view == null) {
                    String key2 = a(aVar, name);
                    if (key2 != null) {
                        aVar.remove(key2);
                    }
                } else if (!name.equals(u.q(view)) && (key = a(aVar, name)) != null) {
                    aVar.put(key, u.q(view));
                }
            }
        } else {
            a(aVar, (a.b.g.g.a<String, View>) inSharedElements);
        }
        return inSharedElements;
    }

    private static String a(a.b.g.g.a<String, String> aVar, String value) {
        int numElements = aVar.size();
        for (int i = 0; i < numElements; i++) {
            if (value.equals(aVar.d(i))) {
                return aVar.b(i);
            }
        }
        return null;
    }

    static View a(a.b.g.g.a<String, View> aVar, e fragments, Object enterTransition, boolean inIsPop) {
        ArrayList<String> arrayList;
        String targetName;
        c inTransaction = fragments.f۱۱۸۶c;
        if (enterTransition == null || aVar == null || (arrayList = inTransaction.q) == null || arrayList.isEmpty()) {
            return null;
        }
        if (inIsPop) {
            targetName = inTransaction.q.get(0);
        } else {
            targetName = inTransaction.r.get(0);
        }
        return aVar.get(targetName);
    }

    private static void a(t impl, Object sharedElementTransition, Object exitTransition, a.b.g.g.a<String, View> aVar, boolean outIsPop, c outTransaction) {
        String sourceName;
        ArrayList<String> arrayList = outTransaction.q;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (outIsPop) {
                sourceName = outTransaction.r.get(0);
            } else {
                sourceName = outTransaction.q.get(0);
            }
            View outEpicenterView = aVar.get(sourceName);
            impl.c(sharedElementTransition, outEpicenterView);
            if (exitTransition != null) {
                impl.c(exitTransition, outEpicenterView);
            }
        }
    }

    private static void a(a.b.g.g.a<String, String> aVar, a.b.g.g.a<String, View> aVar2) {
        for (int i = aVar.size() - 1; i >= 0; i--) {
            if (!aVar2.containsKey(aVar.d(i))) {
                aVar.c(i);
            }
        }
    }

    static void a(f inFragment, f outFragment, boolean isPop, a.b.g.g.a<String, View> aVar, boolean isStart) {
        c0 sharedElementCallback;
        if (isPop) {
            sharedElementCallback = outFragment.m();
        } else {
            sharedElementCallback = inFragment.m();
        }
        if (sharedElementCallback != null) {
            ArrayList<View> views = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>();
            int count = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < count; i++) {
                names.add(aVar.b(i));
                views.add(aVar.d(i));
            }
            if (isStart) {
                sharedElementCallback.b(names, views, null);
            } else {
                sharedElementCallback.a(names, views, null);
            }
        }
    }

    static ArrayList<View> a(t impl, Object transition, f fragment, ArrayList<View> sharedElements, View nonExistentView) {
        ArrayList<View> viewList = null;
        if (transition != null) {
            viewList = new ArrayList<>();
            View root = fragment.A();
            if (root != null) {
                impl.a(viewList, root);
            }
            if (sharedElements != null) {
                viewList.removeAll(sharedElements);
            }
            if (!viewList.isEmpty()) {
                viewList.add(nonExistentView);
                impl.a(transition, viewList);
            }
        }
        return viewList;
    }

    static void a(ArrayList<View> views, int visibility) {
        if (views != null) {
            for (int i = views.size() - 1; i >= 0; i--) {
                views.get(i).setVisibility(visibility);
            }
        }
    }

    private static Object a(t impl, Object enterTransition, Object exitTransition, Object sharedElementTransition, f inFragment, boolean isPop) {
        boolean z;
        boolean overlap = true;
        if (!(enterTransition == null || exitTransition == null || inFragment == null)) {
            if (isPop) {
                z = inFragment.f();
            } else {
                z = inFragment.e();
            }
            overlap = z;
        }
        if (overlap) {
            return impl.b(exitTransition, enterTransition, sharedElementTransition);
        }
        return impl.a(exitTransition, enterTransition, sharedElementTransition);
    }

    public static void a(c transaction, SparseArray<e> sparseArray, boolean isReordered) {
        int numOps = transaction.f۱۰۵۰b.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            a(transaction, transaction.f۱۰۵۰b.get(opNum), sparseArray, false, isReordered);
        }
    }

    public static void b(c transaction, SparseArray<e> sparseArray, boolean isReordered) {
        if (transaction.f۱۰۴۹a.p.a()) {
            for (int opNum = transaction.f۱۰۵۰b.size() - 1; opNum >= 0; opNum--) {
                a(transaction, transaction.f۱۰۵۰b.get(opNum), sparseArray, true, isReordered);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x012d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.support.v4.app.c r22, android.support.v4.app.c.a r23, android.util.SparseArray<android.support.v4.app.r.e> r24, boolean r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.r.a(android.support.v4.app.c, android.support.v4.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    private static e a(e containerTransition, SparseArray<e> sparseArray, int containerId) {
        if (containerTransition != null) {
            return containerTransition;
        }
        e containerTransition2 = new e();
        sparseArray.put(containerId, containerTransition2);
        return containerTransition2;
    }

    /* access modifiers changed from: package-private */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public f f۱۱۸۴a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f۱۱۸۵b;

        /* renamed from: c  reason: collision with root package name */
        public c f۱۱۸۶c;

        /* renamed from: d  reason: collision with root package name */
        public f f۱۱۸۷d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f۱۱۸۸e;

        /* renamed from: f  reason: collision with root package name */
        public c f۱۱۸۹f;

        e() {
        }
    }
}
