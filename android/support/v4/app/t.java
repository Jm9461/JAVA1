package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.view.u;
import android.support.v4.view.w;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class t {
    public abstract Object a(Object obj, Object obj2, Object obj3);

    public abstract void a(ViewGroup viewGroup, Object obj);

    public abstract void a(Object obj, Rect rect);

    public abstract void a(Object obj, View view);

    public abstract void a(Object obj, View view, ArrayList<View> arrayList);

    public abstract void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void a(Object obj, ArrayList<View> arrayList);

    public abstract void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract boolean a(Object obj);

    public abstract Object b(Object obj);

    public abstract Object b(Object obj, Object obj2, Object obj3);

    public abstract void b(Object obj, View view);

    public abstract void b(Object obj, View view, ArrayList<View> arrayList);

    public abstract void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object c(Object obj);

    public abstract void c(Object obj, View view);

    /* access modifiers changed from: protected */
    public void a(View view, Rect epicenter) {
        int[] loc = new int[2];
        view.getLocationOnScreen(loc);
        epicenter.set(loc[0], loc[1], loc[0] + view.getWidth(), loc[1] + view.getHeight());
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> a(ArrayList<View> sharedElementsIn) {
        ArrayList<String> names = new ArrayList<>();
        int numSharedElements = sharedElementsIn.size();
        for (int i = 0; i < numSharedElements; i++) {
            View view = sharedElementsIn.get(i);
            names.add(u.q(view));
            u.a(view, (String) null);
        }
        return names;
    }

    /* access modifiers changed from: package-private */
    public void a(View sceneRoot, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, ArrayList<String> inNames, Map<String, String> nameOverrides) {
        int numSharedElements = sharedElementsIn.size();
        ArrayList<String> outNames = new ArrayList<>();
        for (int i = 0; i < numSharedElements; i++) {
            View view = sharedElementsOut.get(i);
            String name = u.q(view);
            outNames.add(name);
            if (name != null) {
                u.a(view, (String) null);
                String inName = nameOverrides.get(name);
                int j = 0;
                while (true) {
                    if (j >= numSharedElements) {
                        break;
                    } else if (inName.equals(inNames.get(j))) {
                        u.a(sharedElementsIn.get(j), name);
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }
        a0.a(sceneRoot, new a(this, numSharedElements, sharedElementsIn, inNames, sharedElementsOut, outNames));
    }

    class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f۱۲۰۱c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۲۰۲d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۲۰۳e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۲۰۴f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۲۰۵g;

        a(t this$0, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f۱۲۰۱c = i;
            this.f۱۲۰۲d = arrayList;
            this.f۱۲۰۳e = arrayList2;
            this.f۱۲۰۴f = arrayList3;
            this.f۱۲۰۵g = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f۱۲۰۱c; i++) {
                u.a((View) this.f۱۲۰۲d.get(i), (String) this.f۱۲۰۳e.get(i));
                u.a((View) this.f۱۲۰۴f.get(i), (String) this.f۱۲۰۵g.get(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ArrayList<View> transitioningViews, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (w.a(viewGroup)) {
                transitioningViews.add(viewGroup);
                return;
            }
            int count = viewGroup.getChildCount();
            for (int i = 0; i < count; i++) {
                a(transitioningViews, viewGroup.getChildAt(i));
            }
            return;
        }
        transitioningViews.add(view);
    }

    /* access modifiers changed from: package-private */
    public void a(Map<String, View> namedViews, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = u.q(view);
            if (transitionName != null) {
                namedViews.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int count = viewGroup.getChildCount();
                for (int i = 0; i < count; i++) {
                    a(namedViews, viewGroup.getChildAt(i));
                }
            }
        }
    }

    class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۲۰۶c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f۱۲۰۷d;

        b(t this$0, ArrayList arrayList, Map map) {
            this.f۱۲۰۶c = arrayList;
            this.f۱۲۰۷d = map;
        }

        public void run() {
            int numSharedElements = this.f۱۲۰۶c.size();
            for (int i = 0; i < numSharedElements; i++) {
                View view = (View) this.f۱۲۰۶c.get(i);
                String name = u.q(view);
                if (name != null) {
                    u.a(view, t.a(this.f۱۲۰۷d, name));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View sceneRoot, ArrayList<View> sharedElementsIn, Map<String, String> nameOverrides) {
        a0.a(sceneRoot, new b(this, sharedElementsIn, nameOverrides));
    }

    class c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f۱۲۰۸c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f۱۲۰۹d;

        c(t this$0, ArrayList arrayList, Map map) {
            this.f۱۲۰۸c = arrayList;
            this.f۱۲۰۹d = map;
        }

        public void run() {
            int numSharedElements = this.f۱۲۰۸c.size();
            for (int i = 0; i < numSharedElements; i++) {
                View view = (View) this.f۱۲۰۸c.get(i);
                u.a(view, (String) this.f۱۲۰۹d.get(u.q(view)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup sceneRoot, ArrayList<View> sharedElementsIn, Map<String, String> nameOverrides) {
        a0.a(sceneRoot, new c(this, sharedElementsIn, nameOverrides));
    }

    protected static void a(List<View> views, View startView) {
        int startIndex = views.size();
        if (!a(views, startView, startIndex)) {
            views.add(startView);
            for (int index = startIndex; index < views.size(); index++) {
                View view = views.get(index);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int childIndex = 0; childIndex < childCount; childIndex++) {
                        View child = viewGroup.getChildAt(childIndex);
                        if (!a(views, child, startIndex)) {
                            views.add(child);
                        }
                    }
                }
            }
        }
    }

    private static boolean a(List<View> views, View view, int maxIndex) {
        for (int i = 0; i < maxIndex; i++) {
            if (views.get(i) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    static String a(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
