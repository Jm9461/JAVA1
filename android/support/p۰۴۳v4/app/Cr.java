package android.support.p۰۴۳v4.app;

import android.graphics.Rect;
import android.os.Build;
import android.support.p۰۴۳v4.view.Cu;
import android.support.v4.app.FragmentTransition;
import android.support.v4.util.ArrayMap;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.r  reason: invalid class name */
public class Cr {

    /* renamed from: a  reason: contains not printable characters */
    private static final int[] f۱۰۳۱۷a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b  reason: contains not printable characters */
    private static final AbstractCt f۱۰۳۱۸b = (Build.VERSION.SDK_INT >= 21 ? new Cs() : null);

    /* renamed from: c  reason: contains not printable characters */
    private static final AbstractCt f۱۰۳۱۹c = m۱۲۴۸۶a();

    /* renamed from: a  reason: contains not printable characters */
    private static AbstractCt m۱۲۴۸۶a() {
        try {
            return (AbstractCt) Class.forName("a.b.f.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۲۵۰۰a(LayoutInflater$Factory2Cl fragmentManager, ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex, boolean isReordered) {
        if (fragmentManager.f۱۰۲۴۶n >= 1) {
            SparseArray<FragmentTransition.FragmentContainerTransition> transitioningFragments = new SparseArray<>();
            for (int i = startIndex; i < endIndex; i++) {
                Cc record = arrayList.get(i);
                if (isRecordPop.get(i).booleanValue()) {
                    m۱۲۵۱۰b(record, (SparseArray<Ce>) transitioningFragments, isReordered);
                } else {
                    m۱۲۴۹۷a(record, (SparseArray<Ce>) transitioningFragments, isReordered);
                }
            }
            if (transitioningFragments.size() != 0) {
                View nonExistentView = new View(fragmentManager.f۱۰۲۴۷o.m۱۲۳۱۰c());
                int numContainers = transitioningFragments.size();
                for (int i2 = 0; i2 < numContainers; i2++) {
                    int containerId = transitioningFragments.keyAt(i2);
                    ArrayMap<String, String> nameOverrides = m۱۲۴۸۳a(containerId, arrayList, isRecordPop, startIndex, endIndex);
                    Ce containerTransition = (Ce) transitioningFragments.valueAt(i2);
                    if (isReordered) {
                        m۱۲۵۱۱b(fragmentManager, containerId, containerTransition, nonExistentView, nameOverrides);
                    } else {
                        m۱۲۴۹۹a(fragmentManager, containerId, containerTransition, nonExistentView, (Ca<String, String>) nameOverrides);
                    }
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Ca<String, String> m۱۲۴۸۳a(int containerId, ArrayList<Cc> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        ArrayList<String> sources;
        ArrayList<String> targets;
        ArrayMap<String, String> nameOverrides = new Ca<>();
        for (int recordNum = endIndex - 1; recordNum >= startIndex; recordNum--) {
            Cc record = arrayList.get(recordNum);
            if (record.m۱۲۰۹۳b(containerId)) {
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

    /* renamed from: b  reason: contains not printable characters */
    private static void m۱۲۵۱۱b(LayoutInflater$Factory2Cl fragmentManager, int containerId, Ce fragments, View nonExistentView, Ca<String, String> aVar) {
        ViewGroup sceneRoot;
        ComponentCallbacksCf inFragment;
        ComponentCallbacksCf outFragment;
        AbstractCt impl;
        Object exitTransition;
        if (fragmentManager.f۱۰۲۴۸p.m۱۲۲۷۸a()) {
            sceneRoot = (ViewGroup) fragmentManager.f۱۰۲۴۸p.m۱۲۲۷۷a(containerId);
        } else {
            sceneRoot = null;
        }
        if (sceneRoot != null && (impl = m۱۲۴۸۷a((outFragment = fragments.f۱۰۳۵۱d), (inFragment = fragments.f۱۰۳۴۸a))) != null) {
            boolean inIsPop = fragments.f۱۰۳۴۹b;
            boolean outIsPop = fragments.f۱۰۳۵۲e;
            ArrayList<View> sharedElementsIn = new ArrayList<>();
            ArrayList<View> sharedElementsOut = new ArrayList<>();
            Object enterTransition = m۱۲۴۹۰a(impl, inFragment, inIsPop);
            Object exitTransition2 = m۱۲۵۰۸b(impl, outFragment, outIsPop);
            Object sharedElementTransition = m۱۲۵۰۹b(impl, sceneRoot, nonExistentView, aVar, fragments, sharedElementsOut, sharedElementsIn, enterTransition, exitTransition2);
            if (enterTransition == null && sharedElementTransition == null) {
                exitTransition = exitTransition2;
                if (exitTransition == null) {
                    return;
                }
            } else {
                exitTransition = exitTransition2;
            }
            ArrayList<View> exitingViews = m۱۲۴۹۴a(impl, exitTransition, outFragment, sharedElementsOut, nonExistentView);
            ArrayList<View> enteringViews = m۱۲۴۹۴a(impl, enterTransition, inFragment, sharedElementsIn, nonExistentView);
            m۱۲۵۰۴a(enteringViews, 4);
            Object transition = m۱۲۴۹۲a(impl, enterTransition, exitTransition, sharedElementTransition, inFragment, inIsPop);
            if (transition != null) {
                m۱۲۵۰۲a(impl, exitTransition, outFragment, exitingViews);
                ArrayList<String> inNames = impl.m۱۲۵۳۴a(sharedElementsIn);
                impl.m۱۲۵۴۳a(transition, enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn);
                impl.m۱۲۵۳۸a(sceneRoot, transition);
                impl.m۱۲۵۳۶a(sceneRoot, sharedElementsOut, sharedElementsIn, inNames, aVar);
                m۱۲۵۰۴a(enteringViews, 0);
                impl.m۱۲۵۵۳b(sharedElementTransition, sharedElementsOut, sharedElementsIn);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۲۵۰۲a(AbstractCt impl, Object exitTransition, ComponentCallbacksCf exitingFragment, ArrayList<View> exitingViews) {
        if (exitingFragment != null && exitTransition != null && exitingFragment.f۱۰۱۶۶m && exitingFragment.f۱۰۱۳۴C && exitingFragment.f۱۰۱۴۸Q) {
            exitingFragment.m۱۲۲۰۷f(true);
            impl.m۱۲۵۴۲a(exitTransition, exitingFragment.m۱۲۱۲۵A(), exitingViews);
            ViewTreeObserver$OnPreDrawListenerCa0.m۱۲۰۶۶a(exitingFragment.f۱۰۱۴۱J, new RunnableCa(exitingViews));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.r$a  reason: invalid class name */
    public static class RunnableCa implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۲۰c;

        RunnableCa(ArrayList arrayList) {
            this.f۱۰۳۲۰c = arrayList;
        }

        public void run() {
            Cr.m۱۲۵۰۴a(this.f۱۰۳۲۰c, 4);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۲۴۹۹a(LayoutInflater$Factory2Cl fragmentManager, int containerId, Ce fragments, View nonExistentView, Ca<String, String> aVar) {
        ViewGroup sceneRoot;
        ComponentCallbacksCf inFragment;
        ComponentCallbacksCf outFragment;
        AbstractCt impl;
        Object exitTransition;
        Object exitTransition2;
        if (fragmentManager.f۱۰۲۴۸p.m۱۲۲۷۸a()) {
            sceneRoot = (ViewGroup) fragmentManager.f۱۰۲۴۸p.m۱۲۲۷۷a(containerId);
        } else {
            sceneRoot = null;
        }
        if (sceneRoot != null && (impl = m۱۲۴۸۷a((outFragment = fragments.f۱۰۳۵۱d), (inFragment = fragments.f۱۰۳۴۸a))) != null) {
            boolean inIsPop = fragments.f۱۰۳۴۹b;
            boolean outIsPop = fragments.f۱۰۳۵۲e;
            Object enterTransition = m۱۲۴۹۰a(impl, inFragment, inIsPop);
            Object exitTransition3 = m۱۲۵۰۸b(impl, outFragment, outIsPop);
            ArrayList<View> sharedElementsOut = new ArrayList<>();
            ArrayList<View> sharedElementsIn = new ArrayList<>();
            Object sharedElementTransition = m۱۲۴۹۱a(impl, sceneRoot, nonExistentView, aVar, fragments, sharedElementsOut, sharedElementsIn, enterTransition, exitTransition3);
            if (enterTransition == null && sharedElementTransition == null) {
                exitTransition = exitTransition3;
                if (exitTransition == null) {
                    return;
                }
            } else {
                exitTransition = exitTransition3;
            }
            ArrayList<View> exitingViews = m۱۲۴۹۴a(impl, exitTransition, outFragment, sharedElementsOut, nonExistentView);
            if (exitingViews == null || exitingViews.isEmpty()) {
                exitTransition2 = null;
            } else {
                exitTransition2 = exitTransition;
            }
            impl.m۱۲۵۴۱a(enterTransition, nonExistentView);
            Object transition = m۱۲۴۹۲a(impl, enterTransition, exitTransition2, sharedElementTransition, inFragment, fragments.f۱۰۳۴۹b);
            if (transition != null) {
                ArrayList<View> enteringViews = new ArrayList<>();
                impl.m۱۲۵۴۳a(transition, enterTransition, enteringViews, exitTransition2, exitingViews, sharedElementTransition, sharedElementsIn);
                m۱۲۵۰۱a(impl, sceneRoot, inFragment, nonExistentView, sharedElementsIn, enterTransition, enteringViews, exitTransition2, exitingViews);
                impl.m۱۲۵۳۷a((View) sceneRoot, sharedElementsIn, (Map<String, String>) aVar);
                impl.m۱۲۵۳۸a(sceneRoot, transition);
                impl.m۱۲۵۳۹a(sceneRoot, sharedElementsIn, (Map<String, String>) aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.r$b  reason: invalid class name */
    public static class RunnableCb implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۲۱c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ AbstractCt f۱۰۳۲۲d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۳۲۳e;

        /* renamed from: f  reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۳۲۴f;

        /* renamed from: g  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۲۵g;

        /* renamed from: h  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۲۶h;

        /* renamed from: i  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۲۷i;

        /* renamed from: j  reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۲۸j;

        RunnableCb(Object obj, AbstractCt tVar, View view, ComponentCallbacksCf fVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f۱۰۳۲۱c = obj;
            this.f۱۰۳۲۲d = tVar;
            this.f۱۰۳۲۳e = view;
            this.f۱۰۳۲۴f = fVar;
            this.f۱۰۳۲۵g = arrayList;
            this.f۱۰۳۲۶h = arrayList2;
            this.f۱۰۳۲۷i = arrayList3;
            this.f۱۰۳۲۸j = obj2;
        }

        public void run() {
            Object obj = this.f۱۰۳۲۱c;
            if (obj != null) {
                this.f۱۰۳۲۲d.m۱۲۵۵۱b(obj, this.f۱۰۳۲۳e);
                this.f۱۰۳۲۶h.addAll(Cr.m۱۲۴۹۴a(this.f۱۰۳۲۲d, this.f۱۰۳۲۱c, this.f۱۰۳۲۴f, this.f۱۰۳۲۵g, this.f۱۰۳۲۳e));
            }
            if (this.f۱۰۳۲۷i != null) {
                if (this.f۱۰۳۲۸j != null) {
                    ArrayList<View> tempExiting = new ArrayList<>();
                    tempExiting.add(this.f۱۰۳۲۳e);
                    this.f۱۰۳۲۲d.m۱۲۵۴۵a(this.f۱۰۳۲۸j, this.f۱۰۳۲۷i, tempExiting);
                }
                this.f۱۰۳۲۷i.clear();
                this.f۱۰۳۲۷i.add(this.f۱۰۳۲۳e);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۲۵۰۱a(AbstractCt impl, ViewGroup sceneRoot, ComponentCallbacksCf inFragment, View nonExistentView, ArrayList<View> sharedElementsIn, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews) {
        ViewTreeObserver$OnPreDrawListenerCa0.m۱۲۰۶۶a(sceneRoot, new RunnableCb(enterTransition, impl, nonExistentView, inFragment, sharedElementsIn, enteringViews, exitingViews, exitTransition));
    }

    /* renamed from: a  reason: contains not printable characters */
    private static AbstractCt m۱۲۴۸۷a(ComponentCallbacksCf outFragment, ComponentCallbacksCf inFragment) {
        ArrayList<Object> transitions = new ArrayList<>();
        if (outFragment != null) {
            Object exitTransition = outFragment.m۱۲۲۲۵n();
            if (exitTransition != null) {
                transitions.add(exitTransition);
            }
            Object returnTransition = outFragment.m۱۲۲۳۴w();
            if (returnTransition != null) {
                transitions.add(returnTransition);
            }
            Object sharedReturnTransition = outFragment.m۱۲۲۳۶y();
            if (sharedReturnTransition != null) {
                transitions.add(sharedReturnTransition);
            }
        }
        if (inFragment != null) {
            Object enterTransition = inFragment.m۱۲۲۲۱l();
            if (enterTransition != null) {
                transitions.add(enterTransition);
            }
            Object reenterTransition = inFragment.m۱۲۲۳۲u();
            if (reenterTransition != null) {
                transitions.add(reenterTransition);
            }
            Object sharedEnterTransition = inFragment.m۱۲۲۳۵x();
            if (sharedEnterTransition != null) {
                transitions.add(sharedEnterTransition);
            }
        }
        if (transitions.isEmpty()) {
            return null;
        }
        AbstractCt tVar = f۱۰۳۱۸b;
        if (tVar != null && m۱۲۵۰۶a(tVar, transitions)) {
            return f۱۰۳۱۸b;
        }
        AbstractCt tVar2 = f۱۰۳۱۹c;
        if (tVar2 != null && m۱۲۵۰۶a(tVar2, transitions)) {
            return f۱۰۳۱۹c;
        }
        if (f۱۰۳۱۸b == null && f۱۰۳۱۹c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۲۵۰۶a(AbstractCt impl, List<Object> transitions) {
        int size = transitions.size();
        for (int i = 0; i < size; i++) {
            if (!impl.m۱۲۵۴۸a(transitions.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Object m۱۲۴۸۹a(AbstractCt impl, ComponentCallbacksCf inFragment, ComponentCallbacksCf outFragment, boolean isPop) {
        Object obj;
        if (inFragment == null || outFragment == null) {
            return null;
        }
        if (isPop) {
            obj = outFragment.m۱۲۲۳۶y();
        } else {
            obj = inFragment.m۱۲۲۳۵x();
        }
        return impl.m۱۲۵۵۴c(impl.m۱۲۵۴۹b(obj));
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Object m۱۲۴۹۰a(AbstractCt impl, ComponentCallbacksCf inFragment, boolean isPop) {
        Object obj;
        if (inFragment == null) {
            return null;
        }
        if (isPop) {
            obj = inFragment.m۱۲۲۳۲u();
        } else {
            obj = inFragment.m۱۲۲۲۱l();
        }
        return impl.m۱۲۵۴۹b(obj);
    }

    /* renamed from: b  reason: contains not printable characters */
    private static Object m۱۲۵۰۸b(AbstractCt impl, ComponentCallbacksCf outFragment, boolean isPop) {
        Object obj;
        if (outFragment == null) {
            return null;
        }
        if (isPop) {
            obj = outFragment.m۱۲۲۳۴w();
        } else {
            obj = outFragment.m۱۲۲۲۵n();
        }
        return impl.m۱۲۵۴۹b(obj);
    }

    /* renamed from: b  reason: contains not printable characters */
    private static Object m۱۲۵۰۹b(AbstractCt impl, ViewGroup sceneRoot, View nonExistentView, Ca<String, String> aVar, Ce fragments, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, Object enterTransition, Object exitTransition) {
        Object sharedElementTransition;
        Object sharedElementTransition2;
        Object sharedElementTransition3;
        Rect epicenter;
        View epicenterView;
        ArrayMap<String, View> inSharedElements;
        ComponentCallbacksCf inFragment = fragments.f۱۰۳۴۸a;
        ComponentCallbacksCf outFragment = fragments.f۱۰۳۵۱d;
        if (inFragment != null) {
            inFragment.m۱۲۱۲۵A().setVisibility(0);
        }
        if (inFragment != null) {
            if (outFragment != null) {
                boolean inIsPop = fragments.f۱۰۳۴۹b;
                if (aVar.isEmpty()) {
                    sharedElementTransition = null;
                } else {
                    sharedElementTransition = m۱۲۴۸۹a(impl, inFragment, outFragment, inIsPop);
                }
                ArrayMap<String, View> outSharedElements = m۱۲۵۰۷b(impl, aVar, sharedElementTransition, fragments);
                ArrayMap<String, View> inSharedElements2 = m۱۲۴۸۴a(impl, aVar, sharedElementTransition, fragments);
                if (aVar.isEmpty()) {
                    if (outSharedElements != null) {
                        outSharedElements.clear();
                    }
                    if (inSharedElements2 != null) {
                        inSharedElements2.clear();
                    }
                    sharedElementTransition2 = null;
                } else {
                    m۱۲۵۰۵a(sharedElementsOut, (Ca<String, View>) outSharedElements, (Collection<String>) aVar.keySet());
                    m۱۲۵۰۵a(sharedElementsIn, (Ca<String, View>) inSharedElements2, aVar.values());
                    sharedElementTransition2 = sharedElementTransition;
                }
                if (enterTransition == null && exitTransition == null && sharedElementTransition2 == null) {
                    return null;
                }
                m۱۲۴۹۸a(inFragment, outFragment, inIsPop, (Ca<String, View>) outSharedElements, true);
                if (sharedElementTransition2 != null) {
                    sharedElementsIn.add(nonExistentView);
                    impl.m۱۲۵۵۲b(sharedElementTransition2, nonExistentView, sharedElementsOut);
                    sharedElementTransition3 = sharedElementTransition2;
                    inSharedElements = inSharedElements2;
                    m۱۲۵۰۳a(impl, sharedElementTransition2, exitTransition, (Ca<String, View>) outSharedElements, fragments.f۱۰۳۵۲e, fragments.f۱۰۳۵۳f);
                    Rect epicenter2 = new Rect();
                    View epicenterView2 = m۱۲۴۸۸a((Ca<String, View>) inSharedElements, fragments, enterTransition, inIsPop);
                    if (epicenterView2 != null) {
                        impl.m۱۲۵۴۰a(enterTransition, epicenter2);
                    }
                    epicenter = epicenter2;
                    epicenterView = epicenterView2;
                } else {
                    sharedElementTransition3 = sharedElementTransition2;
                    inSharedElements = inSharedElements2;
                    epicenter = null;
                    epicenterView = null;
                }
                ViewTreeObserver$OnPreDrawListenerCa0.m۱۲۰۶۶a(sceneRoot, new RunnableCc(inFragment, outFragment, inIsPop, inSharedElements, epicenterView, impl, epicenter));
                return sharedElementTransition3;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.r$c  reason: invalid class name */
    public static class RunnableCc implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۳۲۹c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۳۳۰d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۰۳۳۱e;

        /* renamed from: f  reason: contains not printable characters */
        final /* synthetic */ Ca f۱۰۳۳۲f;

        /* renamed from: g  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۳۳۳g;

        /* renamed from: h  reason: contains not printable characters */
        final /* synthetic */ AbstractCt f۱۰۳۳۴h;

        /* renamed from: i  reason: contains not printable characters */
        final /* synthetic */ Rect f۱۰۳۳۵i;

        RunnableCc(ComponentCallbacksCf fVar, ComponentCallbacksCf fVar2, boolean z, Ca aVar, View view, AbstractCt tVar, Rect rect) {
            this.f۱۰۳۲۹c = fVar;
            this.f۱۰۳۳۰d = fVar2;
            this.f۱۰۳۳۱e = z;
            this.f۱۰۳۳۲f = aVar;
            this.f۱۰۳۳۳g = view;
            this.f۱۰۳۳۴h = tVar;
            this.f۱۰۳۳۵i = rect;
        }

        public void run() {
            Cr.m۱۲۴۹۸a(this.f۱۰۳۲۹c, this.f۱۰۳۳۰d, this.f۱۰۳۳۱e, (Ca<String, View>) this.f۱۰۳۳۲f, false);
            View view = this.f۱۰۳۳۳g;
            if (view != null) {
                this.f۱۰۳۳۴h.m۱۲۵۳۵a(view, this.f۱۰۳۳۵i);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۲۵۰۵a(ArrayList<View> views, Ca<String, View> aVar, Collection<String> nameOverridesSet) {
        for (int i = aVar.size() - 1; i >= 0; i--) {
            View view = aVar.m۱۰۶۵۶d(i);
            if (nameOverridesSet.contains(Cu.m۱۳۰۲۰q(view))) {
                views.add(view);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Object m۱۲۴۹۱a(AbstractCt impl, ViewGroup sceneRoot, View nonExistentView, Ca<String, String> aVar, Ce fragments, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, Object enterTransition, Object exitTransition) {
        Object sharedElementTransition;
        Object sharedElementTransition2;
        Rect inEpicenter;
        ComponentCallbacksCf inFragment = fragments.f۱۰۳۴۸a;
        ComponentCallbacksCf outFragment = fragments.f۱۰۳۵۱d;
        if (inFragment != null) {
            if (outFragment != null) {
                boolean inIsPop = fragments.f۱۰۳۴۹b;
                if (aVar.isEmpty()) {
                    sharedElementTransition = null;
                } else {
                    sharedElementTransition = m۱۲۴۸۹a(impl, inFragment, outFragment, inIsPop);
                }
                ArrayMap<String, View> outSharedElements = m۱۲۵۰۷b(impl, aVar, sharedElementTransition, fragments);
                if (aVar.isEmpty()) {
                    sharedElementTransition2 = null;
                } else {
                    sharedElementsOut.addAll(outSharedElements.values());
                    sharedElementTransition2 = sharedElementTransition;
                }
                if (enterTransition == null && exitTransition == null && sharedElementTransition2 == null) {
                    return null;
                }
                m۱۲۴۹۸a(inFragment, outFragment, inIsPop, (Ca<String, View>) outSharedElements, true);
                if (sharedElementTransition2 != null) {
                    Rect inEpicenter2 = new Rect();
                    impl.m۱۲۵۵۲b(sharedElementTransition2, nonExistentView, sharedElementsOut);
                    m۱۲۵۰۳a(impl, sharedElementTransition2, exitTransition, (Ca<String, View>) outSharedElements, fragments.f۱۰۳۵۲e, fragments.f۱۰۳۵۳f);
                    if (enterTransition != null) {
                        impl.m۱۲۵۴۰a(enterTransition, inEpicenter2);
                    }
                    inEpicenter = inEpicenter2;
                } else {
                    inEpicenter = null;
                }
                ViewTreeObserver$OnPreDrawListenerCa0.m۱۲۰۶۶a(sceneRoot, new RunnableCd(impl, aVar, sharedElementTransition2, fragments, sharedElementsIn, nonExistentView, inFragment, outFragment, inIsPop, sharedElementsOut, enterTransition, inEpicenter));
                return sharedElementTransition2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.r$d  reason: invalid class name */
    public static class RunnableCd implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ AbstractCt f۱۰۳۳۶c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ Ca f۱۰۳۳۷d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۳۸e;

        /* renamed from: f  reason: contains not printable characters */
        final /* synthetic */ Ce f۱۰۳۳۹f;

        /* renamed from: g  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۴۰g;

        /* renamed from: h  reason: contains not printable characters */
        final /* synthetic */ View f۱۰۳۴۱h;

        /* renamed from: i  reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۳۴۲i;

        /* renamed from: j  reason: contains not printable characters */
        final /* synthetic */ ComponentCallbacksCf f۱۰۳۴۳j;

        /* renamed from: k  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۰۳۴۴k;

        /* renamed from: l  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۴۵l;

        /* renamed from: m  reason: contains not printable characters */
        final /* synthetic */ Object f۱۰۳۴۶m;

        /* renamed from: n  reason: contains not printable characters */
        final /* synthetic */ Rect f۱۰۳۴۷n;

        RunnableCd(AbstractCt tVar, Ca aVar, Object obj, Ce eVar, ArrayList arrayList, View view, ComponentCallbacksCf fVar, ComponentCallbacksCf fVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f۱۰۳۳۶c = tVar;
            this.f۱۰۳۳۷d = aVar;
            this.f۱۰۳۳۸e = obj;
            this.f۱۰۳۳۹f = eVar;
            this.f۱۰۳۴۰g = arrayList;
            this.f۱۰۳۴۱h = view;
            this.f۱۰۳۴۲i = fVar;
            this.f۱۰۳۴۳j = fVar2;
            this.f۱۰۳۴۴k = z;
            this.f۱۰۳۴۵l = arrayList2;
            this.f۱۰۳۴۶m = obj2;
            this.f۱۰۳۴۷n = rect;
        }

        public void run() {
            ArrayMap<String, View> inSharedElements = Cr.m۱۲۴۸۴a(this.f۱۰۳۳۶c, this.f۱۰۳۳۷d, this.f۱۰۳۳۸e, this.f۱۰۳۳۹f);
            if (inSharedElements != null) {
                this.f۱۰۳۴۰g.addAll(inSharedElements.values());
                this.f۱۰۳۴۰g.add(this.f۱۰۳۴۱h);
            }
            Cr.m۱۲۴۹۸a(this.f۱۰۳۴۲i, this.f۱۰۳۴۳j, this.f۱۰۳۴۴k, (Ca<String, View>) inSharedElements, false);
            Object obj = this.f۱۰۳۳۸e;
            if (obj != null) {
                this.f۱۰۳۳۶c.m۱۲۵۵۳b(obj, this.f۱۰۳۴۵l, this.f۱۰۳۴۰g);
                View inEpicenterView = Cr.m۱۲۴۸۸a((Ca<String, View>) inSharedElements, this.f۱۰۳۳۹f, this.f۱۰۳۴۶m, this.f۱۰۳۴۴k);
                if (inEpicenterView != null) {
                    this.f۱۰۳۳۶c.m۱۲۵۳۵a(inEpicenterView, this.f۱۰۳۴۷n);
                }
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static Ca<String, View> m۱۲۵۰۷b(AbstractCt impl, Ca<String, String> aVar, Object sharedElementTransition, Ce fragments) {
        ArrayList<String> names;
        AbstractCc0 sharedElementCallback;
        if (aVar.isEmpty() || sharedElementTransition == null) {
            aVar.clear();
            return null;
        }
        ComponentCallbacksCf outFragment = fragments.f۱۰۳۵۱d;
        ArrayMap<String, View> outSharedElements = new Ca<>();
        impl.m۱۲۵۴۷a((Map<String, View>) outSharedElements, outFragment.m۱۲۱۲۵A());
        Cc outTransaction = fragments.f۱۰۳۵۳f;
        if (fragments.f۱۰۳۵۲e) {
            sharedElementCallback = outFragment.m۱۲۲۲۳m();
            names = outTransaction.f۱۰۰۹۹r;
        } else {
            sharedElementCallback = outFragment.m۱۲۲۲۶o();
            names = outTransaction.f۱۰۰۹۸q;
        }
        outSharedElements.m۱۰۵۵۸a(names);
        if (sharedElementCallback != null) {
            sharedElementCallback.m۱۲۱۰۱a(names, outSharedElements);
            for (int i = names.size() - 1; i >= 0; i--) {
                String name = names.get(i);
                View view = outSharedElements.get(name);
                if (view == null) {
                    aVar.remove(name);
                } else if (!name.equals(Cu.m۱۳۰۲۰q(view))) {
                    aVar.put(Cu.m۱۳۰۲۰q(view), aVar.remove(name));
                }
            }
        } else {
            aVar.m۱۰۵۵۸a((Collection<?>) outSharedElements.keySet());
        }
        return outSharedElements;
    }

    /* renamed from: a  reason: contains not printable characters */
    static Ca<String, View> m۱۲۴۸۴a(AbstractCt impl, Ca<String, String> aVar, Object sharedElementTransition, Ce fragments) {
        ArrayList<String> names;
        AbstractCc0 sharedElementCallback;
        String key;
        ComponentCallbacksCf inFragment = fragments.f۱۰۳۴۸a;
        View fragmentView = inFragment.m۱۲۱۲۵A();
        if (aVar.isEmpty() || sharedElementTransition == null || fragmentView == null) {
            aVar.clear();
            return null;
        }
        ArrayMap<String, View> inSharedElements = new Ca<>();
        impl.m۱۲۵۴۷a((Map<String, View>) inSharedElements, fragmentView);
        Cc inTransaction = fragments.f۱۰۳۵۰c;
        if (fragments.f۱۰۳۴۹b) {
            sharedElementCallback = inFragment.m۱۲۲۲۶o();
            names = inTransaction.f۱۰۰۹۸q;
        } else {
            sharedElementCallback = inFragment.m۱۲۲۲۳m();
            names = inTransaction.f۱۰۰۹۹r;
        }
        if (names != null) {
            inSharedElements.m۱۰۵۵۸a(names);
            inSharedElements.m۱۰۵۵۸a(aVar.values());
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.m۱۲۱۰۱a(names, inSharedElements);
            for (int i = names.size() - 1; i >= 0; i--) {
                String name = names.get(i);
                View view = inSharedElements.get(name);
                if (view == null) {
                    String key2 = m۱۲۴۹۳a(aVar, name);
                    if (key2 != null) {
                        aVar.remove(key2);
                    }
                } else if (!name.equals(Cu.m۱۳۰۲۰q(view)) && (key = m۱۲۴۹۳a(aVar, name)) != null) {
                    aVar.put(key, Cu.m۱۳۰۲۰q(view));
                }
            }
        } else {
            m۱۲۴۹۵a(aVar, (Ca<String, View>) inSharedElements);
        }
        return inSharedElements;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static String m۱۲۴۹۳a(Ca<String, String> aVar, String value) {
        int numElements = aVar.size();
        for (int i = 0; i < numElements; i++) {
            if (value.equals(aVar.m۱۰۶۵۶d(i))) {
                return aVar.m۱۰۶۵۴b(i);
            }
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    static View m۱۲۴۸۸a(Ca<String, View> aVar, Ce fragments, Object enterTransition, boolean inIsPop) {
        ArrayList<String> arrayList;
        String targetName;
        Cc inTransaction = fragments.f۱۰۳۵۰c;
        if (enterTransition == null || aVar == null || (arrayList = inTransaction.f۱۰۰۹۸q) == null || arrayList.isEmpty()) {
            return null;
        }
        if (inIsPop) {
            targetName = inTransaction.f۱۰۰۹۸q.get(0);
        } else {
            targetName = inTransaction.f۱۰۰۹۹r.get(0);
        }
        return aVar.get(targetName);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۲۵۰۳a(AbstractCt impl, Object sharedElementTransition, Object exitTransition, Ca<String, View> aVar, boolean outIsPop, Cc outTransaction) {
        String sourceName;
        ArrayList<String> arrayList = outTransaction.f۱۰۰۹۸q;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (outIsPop) {
                sourceName = outTransaction.f۱۰۰۹۹r.get(0);
            } else {
                sourceName = outTransaction.f۱۰۰۹۸q.get(0);
            }
            View outEpicenterView = aVar.get(sourceName);
            impl.m۱۲۵۵۵c(sharedElementTransition, outEpicenterView);
            if (exitTransition != null) {
                impl.m۱۲۵۵۵c(exitTransition, outEpicenterView);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۲۴۹۵a(Ca<String, String> aVar, Ca<String, View> aVar2) {
        for (int i = aVar.size() - 1; i >= 0; i--) {
            if (!aVar2.containsKey(aVar.m۱۰۶۵۶d(i))) {
                aVar.m۱۰۶۵۵c(i);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۲۴۹۸a(ComponentCallbacksCf inFragment, ComponentCallbacksCf outFragment, boolean isPop, Ca<String, View> aVar, boolean isStart) {
        AbstractCc0 sharedElementCallback;
        if (isPop) {
            sharedElementCallback = outFragment.m۱۲۲۲۳m();
        } else {
            sharedElementCallback = inFragment.m۱۲۲۲۳m();
        }
        if (sharedElementCallback != null) {
            ArrayList<View> views = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>();
            int count = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < count; i++) {
                names.add(aVar.m۱۰۶۵۴b(i));
                views.add(aVar.m۱۰۶۵۶d(i));
            }
            if (isStart) {
                sharedElementCallback.m۱۲۱۰۲b(names, views, null);
            } else {
                sharedElementCallback.m۱۲۱۰۰a(names, views, null);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static ArrayList<View> m۱۲۴۹۴a(AbstractCt impl, Object transition, ComponentCallbacksCf fragment, ArrayList<View> sharedElements, View nonExistentView) {
        ArrayList<View> viewList = null;
        if (transition != null) {
            viewList = new ArrayList<>();
            View root = fragment.m۱۲۱۲۵A();
            if (root != null) {
                impl.m۱۲۵۴۶a(viewList, root);
            }
            if (sharedElements != null) {
                viewList.removeAll(sharedElements);
            }
            if (!viewList.isEmpty()) {
                viewList.add(nonExistentView);
                impl.m۱۲۵۴۴a(transition, viewList);
            }
        }
        return viewList;
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۲۵۰۴a(ArrayList<View> views, int visibility) {
        if (views != null) {
            for (int i = views.size() - 1; i >= 0; i--) {
                views.get(i).setVisibility(visibility);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Object m۱۲۴۹۲a(AbstractCt impl, Object enterTransition, Object exitTransition, Object sharedElementTransition, ComponentCallbacksCf inFragment, boolean isPop) {
        boolean z;
        boolean overlap = true;
        if (!(enterTransition == null || exitTransition == null || inFragment == null)) {
            if (isPop) {
                z = inFragment.m۱۲۲۰۸f();
            } else {
                z = inFragment.m۱۲۲۰۵e();
            }
            overlap = z;
        }
        if (overlap) {
            return impl.m۱۲۵۵۰b(exitTransition, enterTransition, sharedElementTransition);
        }
        return impl.m۱۲۵۳۳a(exitTransition, enterTransition, sharedElementTransition);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۴۹۷a(Cc transaction, SparseArray<Ce> sparseArray, boolean isReordered) {
        int numOps = transaction.f۱۰۰۸۳b.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            m۱۲۴۹۶a(transaction, transaction.f۱۰۰۸۳b.get(opNum), sparseArray, false, isReordered);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۲۵۱۰b(Cc transaction, SparseArray<Ce> sparseArray, boolean isReordered) {
        if (transaction.f۱۰۰۸۲a.f۱۰۲۴۸p.m۱۲۲۷۸a()) {
            for (int opNum = transaction.f۱۰۰۸۳b.size() - 1; opNum >= 0; opNum--) {
                m۱۲۴۹۶a(transaction, transaction.f۱۰۰۸۳b.get(opNum), sparseArray, true, isReordered);
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
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m۱۲۴۹۶a(android.support.p۰۴۳v4.app.Cc r22, android.support.p۰۴۳v4.app.Cc.Ca r23, android.util.SparseArray<android.support.p۰۴۳v4.app.Cr.Ce> r24, boolean r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۳v4.app.Cr.m۱۲۴۹۶a(android.support.v4.app.c, android.support.v4.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Ce m۱۲۴۸۵a(Ce containerTransition, SparseArray<Ce> sparseArray, int containerId) {
        if (containerTransition != null) {
            return containerTransition;
        }
        Ce containerTransition2 = new Ce();
        sparseArray.put(containerId, containerTransition2);
        return containerTransition2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.r$e  reason: invalid class name */
    public static class Ce {

        /* renamed from: a  reason: contains not printable characters */
        public ComponentCallbacksCf f۱۰۳۴۸a;

        /* renamed from: b  reason: contains not printable characters */
        public boolean f۱۰۳۴۹b;

        /* renamed from: c  reason: contains not printable characters */
        public Cc f۱۰۳۵۰c;

        /* renamed from: d  reason: contains not printable characters */
        public ComponentCallbacksCf f۱۰۳۵۱d;

        /* renamed from: e  reason: contains not printable characters */
        public boolean f۱۰۳۵۲e;

        /* renamed from: f  reason: contains not printable characters */
        public Cc f۱۰۳۵۳f;

        Ce() {
        }
    }
}
