package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.view.Cu;
import android.support.v4.view.Cw;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.t, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCt {
    /* renamed from: a, reason: contains not printable characters */
    public abstract Object mo۱۰۴۶۳a(Object obj, Object obj2, Object obj3);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۰۴۶۸a(ViewGroup viewGroup, Object obj);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۰۴۷۰a(Object obj, Rect rect);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۰۴۷۱a(Object obj, View view);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۰۴۷۲a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۰۴۷۳a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۰۴۷۴a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۰۴۷۵a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a, reason: contains not printable characters */
    public abstract boolean mo۱۰۴۷۸a(Object obj);

    /* renamed from: b, reason: contains not printable characters */
    public abstract Object mo۱۰۴۷۹b(Object obj);

    /* renamed from: b, reason: contains not printable characters */
    public abstract Object mo۱۰۴۸۰b(Object obj, Object obj2, Object obj3);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۰۴۸۱b(Object obj, View view);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۰۴۸۲b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۰۴۸۳b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c, reason: contains not printable characters */
    public abstract Object mo۱۰۴۸۴c(Object obj);

    /* renamed from: c, reason: contains not printable characters */
    public abstract void mo۱۰۴۸۵c(Object obj, View view);

    /* renamed from: a, reason: contains not printable characters */
    protected void m۱۰۴۶۵a(View view, Rect epicenter) {
        int[] loc = new int[2];
        view.getLocationOnScreen(loc);
        epicenter.set(loc[0], loc[1], loc[0] + view.getWidth(), loc[1] + view.getHeight());
    }

    /* renamed from: a, reason: contains not printable characters */
    ArrayList<String> m۱۰۴۶۴a(ArrayList<View> sharedElementsIn) {
        ArrayList<String> names = new ArrayList<>();
        int numSharedElements = sharedElementsIn.size();
        for (int i = 0; i < numSharedElements; i++) {
            View view = sharedElementsIn.get(i);
            names.add(Cu.m۱۰۹۵۰q(view));
            Cu.m۱۰۹۲۱a(view, (String) null);
        }
        return names;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۴۶۶a(View sceneRoot, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, ArrayList<String> inNames, Map<String, String> nameOverrides) {
        int numSharedElements = sharedElementsIn.size();
        ArrayList<String> outNames = new ArrayList<>();
        for (int i = 0; i < numSharedElements; i++) {
            View view = sharedElementsOut.get(i);
            String name = Cu.m۱۰۹۵۰q(view);
            outNames.add(name);
            if (name != null) {
                Cu.m۱۰۹۲۱a(view, (String) null);
                String inName = nameOverrides.get(name);
                int j = 0;
                while (true) {
                    if (j >= numSharedElements) {
                        break;
                    }
                    if (!inName.equals(inNames.get(j))) {
                        j++;
                    } else {
                        Cu.m۱۰۹۲۱a(sharedElementsIn.get(j), name);
                        break;
                    }
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerCa0.m۹۹۹۶a(sceneRoot, new a(this, numSharedElements, sharedElementsIn, inNames, sharedElementsOut, outNames));
    }

    /* renamed from: android.support.v4.app.t$a */
    class a implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ int f۱۰۳۶۵c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۶۶d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۶۷e;

        /* renamed from: f, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۶۸f;

        /* renamed from: g, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۶۹g;

        a(AbstractCt this$0, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f۱۰۳۶۵c = i;
            this.f۱۰۳۶۶d = arrayList;
            this.f۱۰۳۶۷e = arrayList2;
            this.f۱۰۳۶۸f = arrayList3;
            this.f۱۰۳۶۹g = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f۱۰۳۶۵c; i++) {
                Cu.m۱۰۹۲۱a((View) this.f۱۰۳۶۶d.get(i), (String) this.f۱۰۳۶۷e.get(i));
                Cu.m۱۰۹۲۱a((View) this.f۱۰۳۶۸f.get(i), (String) this.f۱۰۳۶۹g.get(i));
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۴۷۶a(ArrayList<View> transitioningViews, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (Cw.m۱۰۹۷۳a(viewGroup)) {
                    transitioningViews.add(viewGroup);
                    return;
                }
                int count = viewGroup.getChildCount();
                for (int i = 0; i < count; i++) {
                    View child = viewGroup.getChildAt(i);
                    m۱۰۴۷۶a(transitioningViews, child);
                }
                return;
            }
            transitioningViews.add(view);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۴۷۷a(Map<String, View> namedViews, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = Cu.m۱۰۹۵۰q(view);
            if (transitionName != null) {
                namedViews.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int count = viewGroup.getChildCount();
                for (int i = 0; i < count; i++) {
                    View child = viewGroup.getChildAt(i);
                    m۱۰۴۷۷a(namedViews, child);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.t$b */
    class b implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۷۰c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ Map f۱۰۳۷۱d;

        b(AbstractCt this$0, ArrayList arrayList, Map map) {
            this.f۱۰۳۷۰c = arrayList;
            this.f۱۰۳۷۱d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int numSharedElements = this.f۱۰۳۷۰c.size();
            for (int i = 0; i < numSharedElements; i++) {
                View view = (View) this.f۱۰۳۷۰c.get(i);
                String name = Cu.m۱۰۹۵۰q(view);
                if (name != null) {
                    String inName = AbstractCt.m۱۰۴۵۹a((Map<String, String>) this.f۱۰۳۷۱d, name);
                    Cu.m۱۰۹۲۱a(view, inName);
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۴۶۷a(View sceneRoot, ArrayList<View> sharedElementsIn, Map<String, String> nameOverrides) {
        ViewTreeObserverOnPreDrawListenerCa0.m۹۹۹۶a(sceneRoot, new b(this, sharedElementsIn, nameOverrides));
    }

    /* renamed from: android.support.v4.app.t$c */
    class c implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ ArrayList f۱۰۳۷۲c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ Map f۱۰۳۷۳d;

        c(AbstractCt this$0, ArrayList arrayList, Map map) {
            this.f۱۰۳۷۲c = arrayList;
            this.f۱۰۳۷۳d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int numSharedElements = this.f۱۰۳۷۲c.size();
            for (int i = 0; i < numSharedElements; i++) {
                View view = (View) this.f۱۰۳۷۲c.get(i);
                String name = Cu.m۱۰۹۵۰q(view);
                String inName = (String) this.f۱۰۳۷۳d.get(name);
                Cu.m۱۰۹۲۱a(view, inName);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۰۴۶۹a(ViewGroup sceneRoot, ArrayList<View> sharedElementsIn, Map<String, String> nameOverrides) {
        ViewTreeObserverOnPreDrawListenerCa0.m۹۹۹۶a(sceneRoot, new c(this, sharedElementsIn, nameOverrides));
    }

    /* renamed from: a, reason: contains not printable characters */
    protected static void m۱۰۴۶۰a(List<View> views, View startView) {
        int startIndex = views.size();
        if (m۱۰۴۶۲a(views, startView, startIndex)) {
            return;
        }
        views.add(startView);
        for (int index = startIndex; index < views.size(); index++) {
            View view = views.get(index);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int childIndex = 0; childIndex < childCount; childIndex++) {
                    View child = viewGroup.getChildAt(childIndex);
                    if (!m۱۰۴۶۲a(views, child, startIndex)) {
                        views.add(child);
                    }
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۰۴۶۲a(List<View> views, View view, int maxIndex) {
        for (int i = 0; i < maxIndex; i++) {
            if (views.get(i) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    protected static boolean m۱۰۴۶۱a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a, reason: contains not printable characters */
    static String m۱۰۴۵۹a(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
