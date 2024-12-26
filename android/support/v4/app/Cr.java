package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.app.Cc;
import android.support.v4.app.FragmentTransition;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.Cu;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca;

/* renamed from: android.support.v4.app.r, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cr {

    /* renamed from: a, reason: contains not printable characters */
    private static final int[] f۱۰۳۱۷a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b, reason: contains not printable characters */
    private static final AbstractCt f۱۰۳۱۸b;

    /* renamed from: c, reason: contains not printable characters */
    private static final AbstractCt f۱۰۳۱۹c;

    static {
        f۱۰۳۱۸b = Build.VERSION.SDK_INT >= 21 ? new Cs() : null;
        f۱۰۳۱۹c = m۱۰۴۱۶a();
    }

    /* renamed from: a, reason: contains not printable characters */
    private static AbstractCt m۱۰۴۱۶a() {
        try {
            return (AbstractCt) Class.forName("a.b.f.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, java.lang.String> */
    /* renamed from: a, reason: contains not printable characters */
    static void m۱۰۴۳۰a(LayoutInflaterFactory2Cl fragmentManager, ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex, boolean isReordered) {
        if (fragmentManager.f۱۰۲۴۶n < 1) {
            return;
        }
        SparseArray<FragmentTransition.FragmentContainerTransition> transitioningFragments = new SparseArray<>();
        for (int i = startIndex; i < endIndex; i++) {
            Cc record = arrayList.get(i);
            boolean isPop = isRecordPop.get(i).booleanValue();
            if (isPop) {
                m۱۰۴۴۰b(record, (SparseArray<e>) transitioningFragments, isReordered);
            } else {
                m۱۰۴۲۷a(record, (SparseArray<e>) transitioningFragments, isReordered);
            }
        }
        int i2 = transitioningFragments.size();
        if (i2 != 0) {
            View nonExistentView = new View(fragmentManager.f۱۰۲۴۷o.m۱۰۲۴۰c());
            int numContainers = transitioningFragments.size();
            for (int i3 = 0; i3 < numContainers; i3++) {
                int containerId = transitioningFragments.keyAt(i3);
                Ca<String, String> ca = m۱۰۴۱۳a(containerId, arrayList, isRecordPop, startIndex, endIndex);
                e containerTransition = (e) transitioningFragments.valueAt(i3);
                if (isReordered) {
                    m۱۰۴۴۱b(fragmentManager, containerId, containerTransition, nonExistentView, ca);
                } else {
                    m۱۰۴۲۹a(fragmentManager, containerId, containerTransition, nonExistentView, ca);
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, java.lang.String> */
    /* renamed from: a, reason: contains not printable characters */
    private static Ca<String, String> m۱۰۴۱۳a(int containerId, ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        ArrayList<String> sources;
        ArrayList<String> targets;
        Ca<String, String> ca = new Ca<>();
        for (int recordNum = endIndex - 1; recordNum >= startIndex; recordNum--) {
            Cc record = arrayList.get(recordNum);
            if (record.m۱۰۰۲۳b(containerId)) {
                boolean isPop = isRecordPop.get(recordNum).booleanValue();
                ArrayList<String> arrayList2 = record.f۱۰۰۹۸q;
                if (arrayList2 != null) {
                    int numSharedElements = arrayList2.size();
                    if (isPop) {
                        targets = record.f۱۰۰۹۸q;
                        sources = record.f۱۰۰۹۹r;
                    } else {
                        sources = record.f۱۰۰۹۸q;
                        targets = record.f۱۰۰۹۹r;
                    }
                    for (int i = 0; i < numSharedElements; i++) {
                        String sourceName = sources.get(i);
                        String targetName = targets.get(i);
                        String previousTarget = ca.remove(targetName);
                        if (previousTarget != null) {
                            ca.put(sourceName, previousTarget);
                        } else {
                            ca.put(sourceName, targetName);
                        }
                    }
                }
            }
        }
        return ca;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, java.lang.String> */
    /* renamed from: b, reason: contains not printable characters */
    private static void m۱۰۴۴۱b(LayoutInflaterFactory2Cl fragmentManager, int containerId, e fragments, View nonExistentView, Ca<String, String> ca) {
        ViewGroup sceneRoot;
        ComponentCallbacksCf inFragment;
        ComponentCallbacksCf outFragment;
        AbstractCt impl;
        Object exitTransition;
        if (fragmentManager.f۱۰۲۴۸p.mo۱۰۲۰۸a()) {
            ViewGroup sceneRoot2 = (ViewGroup) fragmentManager.f۱۰۲۴۸p.mo۱۰۲۰۷a(containerId);
            sceneRoot = sceneRoot2;
        } else {
            sceneRoot = null;
        }
        if (sceneRoot == null || (impl = m۱۰۴۱۷a((outFragment = fragments.f۱۰۳۵۱d), (inFragment = fragments.f۱۰۳۴۸a))) == null) {
            return;
        }
        boolean inIsPop = fragments.f۱۰۳۴۹b;
        boolean outIsPop = fragments.f۱۰۳۵۲e;
        ArrayList<View> sharedElementsIn = new ArrayList<>();
        ArrayList<View> sharedElementsOut = new ArrayList<>();
        Object enterTransition = m۱۰۴۲۰a(impl, inFragment, inIsPop);
        Object exitTransition2 = m۱۰۴۳۸b(impl, outFragment, outIsPop);
        Object sharedElementTransition = m۱۰۴۳۹b(impl, sceneRoot, nonExistentView, ca, fragments, sharedElementsOut, sharedElementsIn, enterTransition, exitTransition2);
        if (enterTransition == null && sharedElementTransition == null) {
            exitTransition = exitTransition2;
            if (exitTransition == null) {
                return;
            }
        } else {
            exitTransition = exitTransition2;
        }
        ArrayList<View> exitingViews = m۱۰۴۲۴a(impl, exitTransition, outFragment, sharedElementsOut, nonExistentView);
        ArrayList<View> enteringViews = m۱۰۴۲۴a(impl, enterTransition, inFragment, sharedElementsIn, nonExistentView);
        m۱۰۴۳۴a(enteringViews, 4);
        Object transition = m۱۰۴۲۲a(impl, enterTransition, exitTransition, sharedElementTransition, inFragment, inIsPop);
        if (transition != null) {
            m۱۰۴۳۲a(impl, exitTransition, outFragment, exitingViews);
            ArrayList<String> inNames = impl.m۱۰۴۶۴a(sharedElementsIn);
            impl.mo۱۰۴۷۳a(transition, enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn);
            impl.mo۱۰۴۶۸a(sceneRoot, transition);
            impl.m۱۰۴۶۶a(sceneRoot, sharedElementsOut, sharedElementsIn, inNames, ca);
            m۱۰۴۳۴a(enteringViews, 0);
            impl.mo۱۰۴۸۳b(sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۰۴۳۲a(AbstractCt impl, Object exitTransition, ComponentCallbacksCf exitingFragment, ArrayList<View> exitingViews) {
        if (exitingFragment != null && exitTransition != null && exitingFragment.f۱۰۱۶۶m && exitingFragment.f۱۰۱۳۴C && exitingFragment.f۱۰۱۴۸Q) {
            exitingFragment.m۱۰۱۳۷f(true);
            impl.mo۱۰۴۷۲a(exitTransition, exitingFragment.m۱۰۰۵۵A(), exitingViews);
            ViewGroup container = exitingFragment.f۱۰۱۴۱J;
            ViewTreeObserverOnPreDrawListenerCa0.m۹۹۹۶a(container, new a(exitingViews));
        }
    }

    /* renamed from: android.support.v4.app.r$a */
    static class a implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۲۰c;

        a(ArrayList arrayList) {
            this.f۱۰۳۲۰c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Cr.m۱۰۴۳۴a((ArrayList<View>) this.f۱۰۳۲۰c, 4);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, java.lang.String> */
    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۰۴۲۹a(LayoutInflaterFactory2Cl fragmentManager, int containerId, e fragments, View nonExistentView, Ca<String, String> ca) {
        ViewGroup sceneRoot;
        ComponentCallbacksCf inFragment;
        ComponentCallbacksCf outFragment;
        AbstractCt impl;
        Object exitTransition;
        if (fragmentManager.f۱۰۲۴۸p.mo۱۰۲۰۸a()) {
            ViewGroup sceneRoot2 = (ViewGroup) fragmentManager.f۱۰۲۴۸p.mo۱۰۲۰۷a(containerId);
            sceneRoot = sceneRoot2;
        } else {
            sceneRoot = null;
        }
        if (sceneRoot == null || (impl = m۱۰۴۱۷a((outFragment = fragments.f۱۰۳۵۱d), (inFragment = fragments.f۱۰۳۴۸a))) == null) {
            return;
        }
        boolean inIsPop = fragments.f۱۰۳۴۹b;
        boolean outIsPop = fragments.f۱۰۳۵۲e;
        Object enterTransition = m۱۰۴۲۰a(impl, inFragment, inIsPop);
        Object exitTransition2 = m۱۰۴۳۸b(impl, outFragment, outIsPop);
        ArrayList<View> sharedElementsOut = new ArrayList<>();
        ArrayList<View> sharedElementsIn = new ArrayList<>();
        Object sharedElementTransition = m۱۰۴۲۱a(impl, sceneRoot, nonExistentView, ca, fragments, sharedElementsOut, sharedElementsIn, enterTransition, exitTransition2);
        if (enterTransition == null && sharedElementTransition == null) {
            exitTransition = exitTransition2;
            if (exitTransition == null) {
                return;
            }
        } else {
            exitTransition = exitTransition2;
        }
        ArrayList<View> exitingViews = m۱۰۴۲۴a(impl, exitTransition, outFragment, sharedElementsOut, nonExistentView);
        Object exitTransition3 = (exitingViews == null || exitingViews.isEmpty()) ? null : exitTransition;
        impl.mo۱۰۴۷۱a(enterTransition, nonExistentView);
        Object transition = m۱۰۴۲۲a(impl, enterTransition, exitTransition3, sharedElementTransition, inFragment, fragments.f۱۰۳۴۹b);
        if (transition != null) {
            ArrayList<View> enteringViews = new ArrayList<>();
            impl.mo۱۰۴۷۳a(transition, enterTransition, enteringViews, exitTransition3, exitingViews, sharedElementTransition, sharedElementsIn);
            m۱۰۴۳۱a(impl, sceneRoot, inFragment, nonExistentView, sharedElementsIn, enterTransition, enteringViews, exitTransition3, exitingViews);
            impl.m۱۰۴۶۷a((View) sceneRoot, sharedElementsIn, (Map<String, String>) ca);
            impl.mo۱۰۴۶۸a(sceneRoot, transition);
            impl.m۱۰۴۶۹a(sceneRoot, sharedElementsIn, (Map<String, String>) ca);
        }
    }

    /* renamed from: android.support.v4.app.r$b */
    static class b implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۲۱c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ AbstractCt f۱۰۳۲۲d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ View f۱۰۳۲۳e;

        /* renamed from: f, reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۳۲۴f;

        /* renamed from: g, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۲۵g;

        /* renamed from: h, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۲۶h;

        /* renamed from: i, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۲۷i;

        /* renamed from: j, reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۲۸j;

        b(Object obj, AbstractCt abstractCt, View view, ComponentCallbacksCf componentCallbacksCf, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f۱۰۳۲۱c = obj;
            this.f۱۰۳۲۲d = abstractCt;
            this.f۱۰۳۲۳e = view;
            this.f۱۰۳۲۴f = componentCallbacksCf;
            this.f۱۰۳۲۵g = arrayList;
            this.f۱۰۳۲۶h = arrayList2;
            this.f۱۰۳۲۷i = arrayList3;
            this.f۱۰۳۲۸j = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f۱۰۳۲۱c;
            if (obj != null) {
                this.f۱۰۳۲۲d.mo۱۰۴۸۱b(obj, this.f۱۰۳۲۳e);
                ArrayList<View> views = Cr.m۱۰۴۲۴a(this.f۱۰۳۲۲d, this.f۱۰۳۲۱c, this.f۱۰۳۲۴f, (ArrayList<View>) this.f۱۰۳۲۵g, this.f۱۰۳۲۳e);
                this.f۱۰۳۲۶h.addAll(views);
            }
            ArrayList<View> views2 = this.f۱۰۳۲۷i;
            if (views2 != null) {
                if (this.f۱۰۳۲۸j != null) {
                    ArrayList<View> tempExiting = new ArrayList<>();
                    tempExiting.add(this.f۱۰۳۲۳e);
                    this.f۱۰۳۲۲d.mo۱۰۴۷۵a(this.f۱۰۳۲۸j, this.f۱۰۳۲۷i, tempExiting);
                }
                this.f۱۰۳۲۷i.clear();
                this.f۱۰۳۲۷i.add(this.f۱۰۳۲۳e);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۰۴۳۱a(AbstractCt impl, ViewGroup sceneRoot, ComponentCallbacksCf inFragment, View nonExistentView, ArrayList<View> sharedElementsIn, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews) {
        ViewTreeObserverOnPreDrawListenerCa0.m۹۹۹۶a(sceneRoot, new b(enterTransition, impl, nonExistentView, inFragment, sharedElementsIn, enteringViews, exitingViews, exitTransition));
    }

    /* renamed from: a, reason: contains not printable characters */
    private static AbstractCt m۱۰۴۱۷a(ComponentCallbacksCf outFragment, ComponentCallbacksCf inFragment) {
        ArrayList<Object> transitions = new ArrayList<>();
        if (outFragment != null) {
            Object exitTransition = outFragment.m۱۰۱۵۵n();
            if (exitTransition != null) {
                transitions.add(exitTransition);
            }
            Object returnTransition = outFragment.m۱۰۱۶۴w();
            if (returnTransition != null) {
                transitions.add(returnTransition);
            }
            Object sharedReturnTransition = outFragment.m۱۰۱۶۶y();
            if (sharedReturnTransition != null) {
                transitions.add(sharedReturnTransition);
            }
        }
        if (inFragment != null) {
            Object enterTransition = inFragment.m۱۰۱۵۱l();
            if (enterTransition != null) {
                transitions.add(enterTransition);
            }
            Object reenterTransition = inFragment.m۱۰۱۶۲u();
            if (reenterTransition != null) {
                transitions.add(reenterTransition);
            }
            Object sharedEnterTransition = inFragment.m۱۰۱۶۵x();
            if (sharedEnterTransition != null) {
                transitions.add(sharedEnterTransition);
            }
        }
        if (transitions.isEmpty()) {
            return null;
        }
        AbstractCt abstractCt = f۱۰۳۱۸b;
        if (abstractCt != null && m۱۰۴۳۶a(abstractCt, transitions)) {
            return f۱۰۳۱۸b;
        }
        AbstractCt abstractCt2 = f۱۰۳۱۹c;
        if (abstractCt2 != null && m۱۰۴۳۶a(abstractCt2, transitions)) {
            return f۱۰۳۱۹c;
        }
        if (f۱۰۳۱۸b == null && f۱۰۳۱۹c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۰۴۳۶a(AbstractCt impl, List<Object> transitions) {
        int size = transitions.size();
        for (int i = 0; i < size; i++) {
            if (!impl.mo۱۰۴۷۸a(transitions.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Object m۱۰۴۱۹a(AbstractCt impl, ComponentCallbacksCf inFragment, ComponentCallbacksCf outFragment, boolean isPop) {
        Object obj;
        if (inFragment == null || outFragment == null) {
            return null;
        }
        if (isPop) {
            obj = outFragment.m۱۰۱۶۶y();
        } else {
            obj = inFragment.m۱۰۱۶۵x();
        }
        Object transition = impl.mo۱۰۴۷۹b(obj);
        return impl.mo۱۰۴۸۴c(transition);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Object m۱۰۴۲۰a(AbstractCt impl, ComponentCallbacksCf inFragment, boolean isPop) {
        Object obj;
        if (inFragment == null) {
            return null;
        }
        if (isPop) {
            obj = inFragment.m۱۰۱۶۲u();
        } else {
            obj = inFragment.m۱۰۱۵۱l();
        }
        return impl.mo۱۰۴۷۹b(obj);
    }

    /* renamed from: b, reason: contains not printable characters */
    private static Object m۱۰۴۳۸b(AbstractCt impl, ComponentCallbacksCf outFragment, boolean isPop) {
        Object obj;
        if (outFragment == null) {
            return null;
        }
        if (isPop) {
            obj = outFragment.m۱۰۱۶۴w();
        } else {
            obj = outFragment.m۱۰۱۵۵n();
        }
        return impl.mo۱۰۴۷۹b(obj);
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, android.view.View> */
    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, java.lang.String> */
    /* renamed from: b, reason: contains not printable characters */
    private static Object m۱۰۴۳۹b(AbstractCt impl, ViewGroup sceneRoot, View nonExistentView, Ca<String, String> ca, e fragments, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, Object enterTransition, Object exitTransition) {
        Object sharedElementTransition;
        Object sharedElementTransition2;
        Object sharedElementTransition3;
        Ca<String, View> ca2;
        Rect epicenter;
        View epicenterView;
        ComponentCallbacksCf inFragment = fragments.f۱۰۳۴۸a;
        ComponentCallbacksCf outFragment = fragments.f۱۰۳۵۱d;
        if (inFragment != null) {
            inFragment.m۱۰۰۵۵A().setVisibility(0);
        }
        if (inFragment != null && outFragment != null) {
            boolean inIsPop = fragments.f۱۰۳۴۹b;
            if (ca.isEmpty()) {
                sharedElementTransition = null;
            } else {
                sharedElementTransition = m۱۰۴۱۹a(impl, inFragment, outFragment, inIsPop);
            }
            Ca<String, View> ca3 = m۱۰۴۳۷b(impl, ca, sharedElementTransition, fragments);
            Ca<String, View> ca4 = m۱۰۴۱۴a(impl, ca, sharedElementTransition, fragments);
            if (ca.isEmpty()) {
                if (ca3 != null) {
                    ca3.clear();
                }
                if (ca4 != null) {
                    ca4.clear();
                }
                sharedElementTransition2 = null;
            } else {
                m۱۰۴۳۵a(sharedElementsOut, ca3, ca.keySet());
                m۱۰۴۳۵a(sharedElementsIn, ca4, ca.values());
                sharedElementTransition2 = sharedElementTransition;
            }
            if (enterTransition == null && exitTransition == null && sharedElementTransition2 == null) {
                return null;
            }
            m۱۰۴۲۸a(inFragment, outFragment, inIsPop, ca3, true);
            if (sharedElementTransition2 != null) {
                sharedElementsIn.add(nonExistentView);
                impl.mo۱۰۴۸۲b(sharedElementTransition2, nonExistentView, sharedElementsOut);
                boolean outIsPop = fragments.f۱۰۳۵۲e;
                Cc outTransaction = fragments.f۱۰۳۵۳f;
                sharedElementTransition3 = sharedElementTransition2;
                ca2 = ca4;
                m۱۰۴۳۳a(impl, sharedElementTransition2, exitTransition, ca3, outIsPop, outTransaction);
                Rect epicenter2 = new Rect();
                View epicenterView2 = m۱۰۴۱۸a(ca2, fragments, enterTransition, inIsPop);
                if (epicenterView2 != null) {
                    impl.mo۱۰۴۷۰a(enterTransition, epicenter2);
                }
                epicenter = epicenter2;
                epicenterView = epicenterView2;
            } else {
                sharedElementTransition3 = sharedElementTransition2;
                ca2 = ca4;
                epicenter = null;
                epicenterView = null;
            }
            ViewTreeObserverOnPreDrawListenerCa0.m۹۹۹۶a(sceneRoot, new c(inFragment, outFragment, inIsPop, ca2, epicenterView, impl, epicenter));
            return sharedElementTransition3;
        }
        return null;
    }

    /* renamed from: android.support.v4.app.r$c */
    static class c implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۳۲۹c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۳۳۰d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ boolean f۱۰۳۳۱e;

        /* renamed from: f, reason: contains not printable characters */
        final /* synthetic */ Ca f۱۰۳۳۲f;

        /* renamed from: g, reason: contains not printable characters */
        final /* synthetic */ View f۱۰۳۳۳g;

        /* renamed from: h, reason: contains not printable characters */
        final /* synthetic */ AbstractCt f۱۰۳۳۴h;

        /* renamed from: i, reason: contains not printable characters */
        final /* synthetic */ Rect f۱۰۳۳۵i;

        c(ComponentCallbacksCf componentCallbacksCf, ComponentCallbacksCf componentCallbacksCf2, boolean z, Ca ca, View view, AbstractCt abstractCt, Rect rect) {
            this.f۱۰۳۲۹c = componentCallbacksCf;
            this.f۱۰۳۳۰d = componentCallbacksCf2;
            this.f۱۰۳۳۱e = z;
            this.f۱۰۳۳۲f = ca;
            this.f۱۰۳۳۳g = view;
            this.f۱۰۳۳۴h = abstractCt;
            this.f۱۰۳۳۵i = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            Cr.m۱۰۴۲۸a(this.f۱۰۳۲۹c, this.f۱۰۳۳۰d, this.f۱۰۳۳۱e, (Ca<String, View>) this.f۱۰۳۳۲f, false);
            View view = this.f۱۰۳۳۳g;
            if (view != null) {
                this.f۱۰۳۳۴h.m۱۰۴۶۵a(view, this.f۱۰۳۳۵i);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, android.view.View> */
    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۰۴۳۵a(ArrayList<View> views, Ca<String, View> ca, Collection<String> nameOverridesSet) {
        for (int i = ca.size() - 1; i >= 0; i--) {
            View view = ca.m۸۵۸۶d(i);
            if (nameOverridesSet.contains(Cu.m۱۰۹۵۰q(view))) {
                views.add(view);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, android.view.View> */
    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, java.lang.String> */
    /* renamed from: a, reason: contains not printable characters */
    private static Object m۱۰۴۲۱a(AbstractCt impl, ViewGroup sceneRoot, View nonExistentView, Ca<String, String> ca, e fragments, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, Object enterTransition, Object exitTransition) {
        Object sharedElementTransition;
        Object sharedElementTransition2;
        Rect inEpicenter;
        ComponentCallbacksCf inFragment = fragments.f۱۰۳۴۸a;
        ComponentCallbacksCf outFragment = fragments.f۱۰۳۵۱d;
        if (inFragment != null && outFragment != null) {
            boolean inIsPop = fragments.f۱۰۳۴۹b;
            if (ca.isEmpty()) {
                sharedElementTransition = null;
            } else {
                sharedElementTransition = m۱۰۴۱۹a(impl, inFragment, outFragment, inIsPop);
            }
            Ca<String, View> ca2 = m۱۰۴۳۷b(impl, ca, sharedElementTransition, fragments);
            if (ca.isEmpty()) {
                sharedElementTransition2 = null;
            } else {
                sharedElementsOut.addAll(ca2.values());
                sharedElementTransition2 = sharedElementTransition;
            }
            if (enterTransition == null && exitTransition == null && sharedElementTransition2 == null) {
                return null;
            }
            m۱۰۴۲۸a(inFragment, outFragment, inIsPop, ca2, true);
            if (sharedElementTransition2 != null) {
                Rect inEpicenter2 = new Rect();
                impl.mo۱۰۴۸۲b(sharedElementTransition2, nonExistentView, sharedElementsOut);
                boolean outIsPop = fragments.f۱۰۳۵۲e;
                Cc outTransaction = fragments.f۱۰۳۵۳f;
                m۱۰۴۳۳a(impl, sharedElementTransition2, exitTransition, ca2, outIsPop, outTransaction);
                if (enterTransition != null) {
                    impl.mo۱۰۴۷۰a(enterTransition, inEpicenter2);
                }
                inEpicenter = inEpicenter2;
            } else {
                inEpicenter = null;
            }
            Object finalSharedElementTransition = sharedElementTransition2;
            Object sharedElementTransition3 = sharedElementTransition2;
            ViewTreeObserverOnPreDrawListenerCa0.m۹۹۹۶a(sceneRoot, new d(impl, ca, finalSharedElementTransition, fragments, sharedElementsIn, nonExistentView, inFragment, outFragment, inIsPop, sharedElementsOut, enterTransition, inEpicenter));
            return sharedElementTransition3;
        }
        return null;
    }

    /* renamed from: android.support.v4.app.r$d */
    static class d implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ AbstractCt f۱۰۳۳۶c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ Ca f۱۰۳۳۷d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۳۸e;

        /* renamed from: f, reason: contains not printable characters */
        final /* synthetic */ e f۱۰۳۳۹f;

        /* renamed from: g, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۴۰g;

        /* renamed from: h, reason: contains not printable characters */
        final /* synthetic */ View f۱۰۳۴۱h;

        /* renamed from: i, reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۳۴۲i;

        /* renamed from: j, reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۳۴۳j;

        /* renamed from: k, reason: contains not printable characters */
        final /* synthetic */ boolean f۱۰۳۴۴k;

        /* renamed from: l, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۴۵l;

        /* renamed from: m, reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۴۶m;

        /* renamed from: n, reason: contains not printable characters */
        final /* synthetic */ Rect f۱۰۳۴۷n;

        d(AbstractCt abstractCt, Ca ca, Object obj, e eVar, ArrayList arrayList, View view, ComponentCallbacksCf componentCallbacksCf, ComponentCallbacksCf componentCallbacksCf2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f۱۰۳۳۶c = abstractCt;
            this.f۱۰۳۳۷d = ca;
            this.f۱۰۳۳۸e = obj;
            this.f۱۰۳۳۹f = eVar;
            this.f۱۰۳۴۰g = arrayList;
            this.f۱۰۳۴۱h = view;
            this.f۱۰۳۴۲i = componentCallbacksCf;
            this.f۱۰۳۴۳j = componentCallbacksCf2;
            this.f۱۰۳۴۴k = z;
            this.f۱۰۳۴۵l = arrayList2;
            this.f۱۰۳۴۶m = obj2;
            this.f۱۰۳۴۷n = rect;
        }

        /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, android.view.View> */
        @Override // java.lang.Runnable
        public void run() {
            Ca<String, View> ca = Cr.m۱۰۴۱۴a(this.f۱۰۳۳۶c, (Ca<String, String>) this.f۱۰۳۳۷d, this.f۱۰۳۳۸e, this.f۱۰۳۳۹f);
            if (ca != null) {
                this.f۱۰۳۴۰g.addAll(ca.values());
                this.f۱۰۳۴۰g.add(this.f۱۰۳۴۱h);
            }
            Cr.m۱۰۴۲۸a(this.f۱۰۳۴۲i, this.f۱۰۳۴۳j, this.f۱۰۳۴۴k, ca, false);
            Object obj = this.f۱۰۳۳۸e;
            if (obj != null) {
                this.f۱۰۳۳۶c.mo۱۰۴۸۳b(obj, this.f۱۰۳۴۵l, this.f۱۰۳۴۰g);
                View inEpicenterView = Cr.m۱۰۴۱۸a(ca, this.f۱۰۳۳۹f, this.f۱۰۳۴۶m, this.f۱۰۳۴۴k);
                if (inEpicenterView != null) {
                    this.f۱۰۳۳۶c.m۱۰۴۶۵a(inEpicenterView, this.f۱۰۳۴۷n);
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, android.view.View> */
    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, java.lang.String> */
    /* renamed from: b, reason: contains not printable characters */
    private static Ca<String, View> m۱۰۴۳۷b(AbstractCt abstractCt, Ca<String, String> ca, Object sharedElementTransition, e fragments) {
        AbstractCc0 sharedElementCallback;
        ArrayList<String> names;
        if (ca.isEmpty() || sharedElementTransition == null) {
            ca.clear();
            return null;
        }
        ComponentCallbacksCf outFragment = fragments.f۱۰۳۵۱d;
        ArrayMap<String, View> outSharedElements = new Ca<>();
        abstractCt.m۱۰۴۷۷a((Map<String, View>) outSharedElements, outFragment.m۱۰۰۵۵A());
        Cc outTransaction = fragments.f۱۰۳۵۳f;
        if (fragments.f۱۰۳۵۲e) {
            sharedElementCallback = outFragment.m۱۰۱۵۳m();
            names = outTransaction.f۱۰۰۹۹r;
        } else {
            sharedElementCallback = outFragment.m۱۰۱۵۶o();
            names = outTransaction.f۱۰۰۹۸q;
        }
        outSharedElements.m۸۴۸۷a(names);
        if (sharedElementCallback != null) {
            sharedElementCallback.m۱۰۰۳۱a(names, outSharedElements);
            for (int i = names.size() - 1; i >= 0; i--) {
                String name = names.get(i);
                View view = (View) outSharedElements.get(name);
                if (view == null) {
                    ca.remove(name);
                } else if (!name.equals(Cu.m۱۰۹۵۰q(view))) {
                    String targetValue = ca.remove(name);
                    ca.put(Cu.m۱۰۹۵۰q(view), targetValue);
                }
            }
        } else {
            ca.m۸۴۸۷a((Collection<?>) outSharedElements.keySet());
        }
        return outSharedElements;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, android.view.View> */
    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, java.lang.String> */
    /* renamed from: a, reason: contains not printable characters */
    static Ca<String, View> m۱۰۴۱۴a(AbstractCt abstractCt, Ca<String, String> ca, Object sharedElementTransition, e fragments) {
        AbstractCc0 sharedElementCallback;
        ArrayList<String> names;
        String key;
        ComponentCallbacksCf inFragment = fragments.f۱۰۳۴۸a;
        View fragmentView = inFragment.m۱۰۰۵۵A();
        if (ca.isEmpty() || sharedElementTransition == null || fragmentView == null) {
            ca.clear();
            return null;
        }
        ArrayMap<String, View> inSharedElements = new Ca<>();
        abstractCt.m۱۰۴۷۷a((Map<String, View>) inSharedElements, fragmentView);
        Cc inTransaction = fragments.f۱۰۳۵۰c;
        if (fragments.f۱۰۳۴۹b) {
            sharedElementCallback = inFragment.m۱۰۱۵۶o();
            names = inTransaction.f۱۰۰۹۸q;
        } else {
            sharedElementCallback = inFragment.m۱۰۱۵۳m();
            names = inTransaction.f۱۰۰۹۹r;
        }
        if (names != null) {
            inSharedElements.m۸۴۸۷a(names);
            inSharedElements.m۸۴۸۷a(ca.values());
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.m۱۰۰۳۱a(names, inSharedElements);
            for (int i = names.size() - 1; i >= 0; i--) {
                String name = names.get(i);
                View view = (View) inSharedElements.get(name);
                if (view == null) {
                    String key2 = m۱۰۴۲۳a(ca, name);
                    if (key2 != null) {
                        ca.remove(key2);
                    }
                } else if (!name.equals(Cu.m۱۰۹۵۰q(view)) && (key = m۱۰۴۲۳a(ca, name)) != null) {
                    ca.put(key, Cu.m۱۰۹۵۰q(view));
                }
            }
        } else {
            m۱۰۴۲۵a(ca, (Ca<String, View>) inSharedElements);
        }
        return inSharedElements;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, java.lang.String> */
    /* renamed from: a, reason: contains not printable characters */
    private static String m۱۰۴۲۳a(Ca<String, String> ca, String value) {
        int numElements = ca.size();
        for (int i = 0; i < numElements; i++) {
            if (value.equals(ca.m۸۵۸۶d(i))) {
                return ca.m۸۵۸۴b(i);
            }
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, android.view.View> */
    /* renamed from: a, reason: contains not printable characters */
    static View m۱۰۴۱۸a(Ca<String, View> ca, e fragments, Object enterTransition, boolean inIsPop) {
        ArrayList<String> arrayList;
        String targetName;
        Cc inTransaction = fragments.f۱۰۳۵۰c;
        if (enterTransition != null && ca != null && (arrayList = inTransaction.f۱۰۰۹۸q) != null && !arrayList.isEmpty()) {
            if (inIsPop) {
                targetName = inTransaction.f۱۰۰۹۸q.get(0);
            } else {
                targetName = inTransaction.f۱۰۰۹۹r.get(0);
            }
            return ca.get(targetName);
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, android.view.View> */
    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۰۴۳۳a(AbstractCt impl, Object sharedElementTransition, Object exitTransition, Ca<String, View> ca, boolean outIsPop, Cc outTransaction) {
        String sourceName;
        ArrayList<String> arrayList = outTransaction.f۱۰۰۹۸q;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (outIsPop) {
                sourceName = outTransaction.f۱۰۰۹۹r.get(0);
            } else {
                sourceName = outTransaction.f۱۰۰۹۸q.get(0);
            }
            View outEpicenterView = ca.get(sourceName);
            impl.mo۱۰۴۸۵c(sharedElementTransition, outEpicenterView);
            if (exitTransition != null) {
                impl.mo۱۰۴۸۵c(exitTransition, outEpicenterView);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, android.view.View> */
    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, java.lang.String> */
    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۰۴۲۵a(Ca<String, String> ca, Ca<String, View> ca2) {
        for (int i = ca.size() - 1; i >= 0; i--) {
            String targetName = ca.m۸۵۸۶d(i);
            if (!ca2.containsKey(targetName)) {
                ca.m۸۵۸۵c(i);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.a != android.support.v4.util.ArrayMap<java.lang.String, android.view.View> */
    /* renamed from: a, reason: contains not printable characters */
    static void m۱۰۴۲۸a(ComponentCallbacksCf inFragment, ComponentCallbacksCf outFragment, boolean isPop, Ca<String, View> ca, boolean isStart) {
        AbstractCc0 sharedElementCallback;
        if (isPop) {
            sharedElementCallback = outFragment.m۱۰۱۵۳m();
        } else {
            sharedElementCallback = inFragment.m۱۰۱۵۳m();
        }
        if (sharedElementCallback != null) {
            ArrayList<View> views = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>();
            int count = ca == null ? 0 : ca.size();
            for (int i = 0; i < count; i++) {
                names.add(ca.m۸۵۸۴b(i));
                views.add(ca.m۸۵۸۶d(i));
            }
            if (isStart) {
                sharedElementCallback.m۱۰۰۳۲b(names, views, null);
            } else {
                sharedElementCallback.m۱۰۰۳۰a(names, views, null);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static ArrayList<View> m۱۰۴۲۴a(AbstractCt impl, Object transition, ComponentCallbacksCf fragment, ArrayList<View> sharedElements, View nonExistentView) {
        ArrayList<View> viewList = null;
        if (transition != null) {
            viewList = new ArrayList<>();
            View root = fragment.m۱۰۰۵۵A();
            if (root != null) {
                impl.m۱۰۴۷۶a(viewList, root);
            }
            if (sharedElements != null) {
                viewList.removeAll(sharedElements);
            }
            if (!viewList.isEmpty()) {
                viewList.add(nonExistentView);
                impl.mo۱۰۴۷۴a(transition, viewList);
            }
        }
        return viewList;
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۱۰۴۳۴a(ArrayList<View> views, int visibility) {
        if (views == null) {
            return;
        }
        for (int i = views.size() - 1; i >= 0; i--) {
            View view = views.get(i);
            view.setVisibility(visibility);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Object m۱۰۴۲۲a(AbstractCt impl, Object enterTransition, Object exitTransition, Object sharedElementTransition, ComponentCallbacksCf inFragment, boolean isPop) {
        boolean overlap = true;
        if (enterTransition != null && exitTransition != null && inFragment != null) {
            overlap = isPop ? inFragment.m۱۰۱۳۸f() : inFragment.m۱۰۱۳۵e();
        }
        if (overlap) {
            Object transition = impl.mo۱۰۴۸۰b(exitTransition, enterTransition, sharedElementTransition);
            return transition;
        }
        Object transition2 = impl.mo۱۰۴۶۳a(exitTransition, enterTransition, sharedElementTransition);
        return transition2;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۴۲۷a(Cc transaction, SparseArray<e> sparseArray, boolean isReordered) {
        int numOps = transaction.f۱۰۰۸۳b.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            Cc.a op = transaction.f۱۰۰۸۳b.get(opNum);
            m۱۰۴۲۶a(transaction, op, sparseArray, false, isReordered);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static void m۱۰۴۴۰b(Cc transaction, SparseArray<e> sparseArray, boolean isReordered) {
        if (!transaction.f۱۰۰۸۲a.f۱۰۲۴۸p.mo۱۰۲۰۸a()) {
            return;
        }
        int numOps = transaction.f۱۰۰۸۳b.size();
        for (int opNum = numOps - 1; opNum >= 0; opNum--) {
            Cc.a op = transaction.f۱۰۰۸۳b.get(opNum);
            m۱۰۴۲۶a(transaction, op, sparseArray, true, isReordered);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m۱۰۴۲۶a(android.support.v4.app.Cc r22, android.support.v4.app.Cc.a r23, android.util.SparseArray<android.support.v4.app.Cr.e> r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.Cr.m۱۰۴۲۶a(android.support.v4.app.c, android.support.v4.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a, reason: contains not printable characters */
    private static e m۱۰۴۱۵a(e containerTransition, SparseArray<e> sparseArray, int containerId) {
        if (containerTransition == null) {
            e containerTransition2 = new e();
            sparseArray.put(containerId, containerTransition2);
            return containerTransition2;
        }
        return containerTransition;
    }

    /* renamed from: android.support.v4.app.r$e */
    static class e {

        /* renamed from: a, reason: contains not printable characters */
        public ComponentCallbacksCf f۱۰۳۴۸a;

        /* renamed from: b, reason: contains not printable characters */
        public boolean f۱۰۳۴۹b;

        /* renamed from: c, reason: contains not printable characters */
        public Cc f۱۰۳۵۰c;

        /* renamed from: d, reason: contains not printable characters */
        public ComponentCallbacksCf f۱۰۳۵۱d;

        /* renamed from: e, reason: contains not printable characters */
        public boolean f۱۰۳۵۲e;

        /* renamed from: f, reason: contains not printable characters */
        public Cc f۱۰۳۵۳f;

        e() {
        }
    }
}
