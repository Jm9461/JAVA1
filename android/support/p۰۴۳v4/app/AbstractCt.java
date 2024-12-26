package android.support.p۰۴۳v4.app;

import android.graphics.Rect;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.Cw;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.t  reason: invalid class name */
public abstract class AbstractCt {
    /* renamed from: a  reason: contains not printable characters */
    public abstract Object m۱۲۵۳۳a(Object obj, Object obj2, Object obj3);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۵۳۸a(ViewGroup viewGroup, Object obj);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۵۴۰a(Object obj, Rect rect);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۵۴۱a(Object obj, View view);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۵۴۲a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۵۴۳a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۵۴۴a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۵۴۵a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۲۵۴۸a(Object obj);

    /* renamed from: b  reason: contains not printable characters */
    public abstract Object m۱۲۵۴۹b(Object obj);

    /* renamed from: b  reason: contains not printable characters */
    public abstract Object m۱۲۵۵۰b(Object obj, Object obj2, Object obj3);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۲۵۵۱b(Object obj, View view);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۲۵۵۲b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۲۵۵۳b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c  reason: contains not printable characters */
    public abstract Object m۱۲۵۵۴c(Object obj);

    /* renamed from: c  reason: contains not printable characters */
    public abstract void m۱۲۵۵۵c(Object obj, View view);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۳۵a(View view, Rect epicenter) {
        int[] loc = new int[2];
        view.getLocationOnScreen(loc);
        epicenter.set(loc[0], loc[1], loc[0] + view.getWidth(), loc[1] + view.getHeight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public ArrayList<String> m۱۲۵۳۴a(ArrayList<View> sharedElementsIn) {
        ArrayList<String> names = new ArrayList<>();
        int numSharedElements = sharedElementsIn.size();
        for (int i = 0; i < numSharedElements; i++) {
            View view = sharedElementsIn.get(i);
            names.add(Cu.m۱۳۰۲۰q(view));
            Cu.m۱۲۹۹۱a(view, (String) null);
        }
        return names;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۳۶a(View sceneRoot, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, ArrayList<String> inNames, Map<String, String> nameOverrides) {
        int numSharedElements = sharedElementsIn.size();
        ArrayList<String> outNames = new ArrayList<>();
        for (int i = 0; i < numSharedElements; i++) {
            View view = sharedElementsOut.get(i);
            String name = Cu.m۱۳۰۲۰q(view);
            outNames.add(name);
            if (name != null) {
                Cu.m۱۲۹۹۱a(view, (String) null);
                String inName = nameOverrides.get(name);
                int j = 0;
                while (true) {
                    if (j >= numSharedElements) {
                        break;
                    } else if (inName.equals(inNames.get(j))) {
                        Cu.m۱۲۹۹۱a(sharedElementsIn.get(j), name);
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerCa0.m۱۲۰۶۶a(sceneRoot, new RunnableCa(this, numSharedElements, sharedElementsIn, inNames, sharedElementsOut, outNames));
    }

    /* renamed from: android.support.v4.app.t$a  reason: invalid class name */
    class RunnableCa implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ int f۱۰۳۶۵c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۶۶d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۶۷e;

        /* renamed from: f  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۶۸f;

        /* renamed from: g  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۶۹g;

        RunnableCa(AbstractCt this$0, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f۱۰۳۶۵c = i;
            this.f۱۰۳۶۶d = arrayList;
            this.f۱۰۳۶۷e = arrayList2;
            this.f۱۰۳۶۸f = arrayList3;
            this.f۱۰۳۶۹g = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f۱۰۳۶۵c; i++) {
                Cu.m۱۲۹۹۱a((View) this.f۱۰۳۶۶d.get(i), (String) this.f۱۰۳۶۷e.get(i));
                Cu.m۱۲۹۹۱a((View) this.f۱۰۳۶۸f.get(i), (String) this.f۱۰۳۶۹g.get(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۴۶a(ArrayList<View> transitioningViews, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (Cw.m۱۳۰۴۳a(viewGroup)) {
                transitioningViews.add(viewGroup);
                return;
            }
            int count = viewGroup.getChildCount();
            for (int i = 0; i < count; i++) {
                m۱۲۵۴۶a(transitioningViews, viewGroup.getChildAt(i));
            }
            return;
        }
        transitioningViews.add(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۴۷a(Map<String, View> namedViews, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = Cu.m۱۳۰۲۰q(view);
            if (transitionName != null) {
                namedViews.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int count = viewGroup.getChildCount();
                for (int i = 0; i < count; i++) {
                    m۱۲۵۴۷a(namedViews, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.t$b  reason: invalid class name */
    class RunnableCb implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۷۰c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ Map f۱۰۳۷۱d;

        RunnableCb(AbstractCt this$0, ArrayList arrayList, Map map) {
            this.f۱۰۳۷۰c = arrayList;
            this.f۱۰۳۷۱d = map;
        }

        public void run() {
            int numSharedElements = this.f۱۰۳۷۰c.size();
            for (int i = 0; i < numSharedElements; i++) {
                View view = (View) this.f۱۰۳۷۰c.get(i);
                String name = Cu.m۱۳۰۲۰q(view);
                if (name != null) {
                    Cu.m۱۲۹۹۱a(view, AbstractCt.m۱۲۵۲۹a(this.f۱۰۳۷۱d, name));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۳۷a(View sceneRoot, ArrayList<View> sharedElementsIn, Map<String, String> nameOverrides) {
        ViewTreeObserver$OnPreDrawListenerCa0.m۱۲۰۶۶a(sceneRoot, new RunnableCb(this, sharedElementsIn, nameOverrides));
    }

    /* renamed from: android.support.v4.app.t$c  reason: invalid class name */
    class RunnableCc implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۷۲c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ Map f۱۰۳۷۳d;

        RunnableCc(AbstractCt this$0, ArrayList arrayList, Map map) {
            this.f۱۰۳۷۲c = arrayList;
            this.f۱۰۳۷۳d = map;
        }

        public void run() {
            int numSharedElements = this.f۱۰۳۷۲c.size();
            for (int i = 0; i < numSharedElements; i++) {
                View view = (View) this.f۱۰۳۷۲c.get(i);
                Cu.m۱۲۹۹۱a(view, (String) this.f۱۰۳۷۳d.get(Cu.m۱۳۰۲۰q(view)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۵۳۹a(ViewGroup sceneRoot, ArrayList<View> sharedElementsIn, Map<String, String> nameOverrides) {
        ViewTreeObserver$OnPreDrawListenerCa0.m۱۲۰۶۶a(sceneRoot, new RunnableCc(this, sharedElementsIn, nameOverrides));
    }

    /* renamed from: a  reason: contains not printable characters */
    protected static void m۱۲۵۳۰a(List<View> views, View startView) {
        int startIndex = views.size();
        if (!m۱۲۵۳۲a(views, startView, startIndex)) {
            views.add(startView);
            for (int index = startIndex; index < views.size(); index++) {
                View view = views.get(index);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int childIndex = 0; childIndex < childCount; childIndex++) {
                        View child = viewGroup.getChildAt(childIndex);
                        if (!m۱۲۵۳۲a(views, child, startIndex)) {
                            views.add(child);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۲۵۳۲a(List<View> views, View view, int maxIndex) {
        for (int i = 0; i < maxIndex; i++) {
            if (views.get(i) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    protected static boolean m۱۲۵۳۱a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a  reason: contains not printable characters */
    static String m۱۲۵۲۹a(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
