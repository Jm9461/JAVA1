package b.j.a.d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;

public class a {

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f۲۵۸۶e;

    /* renamed from: a  reason: collision with root package name */
    private Context f۲۵۸۷a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray<int[]> f۲۵۸۸b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private int f۲۵۸۹c;

    /* renamed from: d  reason: collision with root package name */
    private AbstractC۰۰۵۷a f۲۵۹۰d;

    /* renamed from: b.j.a.d.a$a  reason: collision with other inner class name */
    public interface AbstractC۰۰۵۷a {
        void a(c cVar);

        void b(c cVar);
    }

    public static class b {
    }

    public interface c {
    }

    public static int a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a2 = context.obtainStyledAttributes(attrs, b.j.a.c.ThemableView, defStyleAttr, defStyleRes);
        int styleId = a2.getResourceId(b.j.a.c.ThemableView_v_styleId, 0);
        a2.recycle();
        return styleId;
    }

    public static a a() {
        if (f۲۵۸۶e == null) {
            synchronized (a.class) {
                if (f۲۵۸۶e == null) {
                    f۲۵۸۶e = new a();
                }
            }
        }
        return f۲۵۸۶e;
    }

    private int[] a(Context context, int resId) {
        if (context == null) {
            return null;
        }
        TypedArray array = context.getResources().obtainTypedArray(resId);
        int[] result = new int[array.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = array.getResourceId(i, 0);
        }
        array.recycle();
        return result;
    }

    private int[] b(int styleId) {
        SparseArray<int[]> sparseArray = this.f۲۵۸۸b;
        if (sparseArray == null) {
            return null;
        }
        int[] list = sparseArray.get(styleId);
        if (list != null) {
            return list;
        }
        int[] list2 = a(this.f۲۵۸۷a, styleId);
        this.f۲۵۸۸b.put(styleId, list2);
        return list2;
    }

    public int a(int styleId) {
        return a(styleId, this.f۲۵۸۹c);
    }

    public int a(int styleId, int theme) {
        int[] styles = b(styleId);
        if (styles == null) {
            return 0;
        }
        return styles[theme];
    }

    public void a(c listener) {
        AbstractC۰۰۵۷a aVar = this.f۲۵۹۰d;
        if (aVar != null) {
            aVar.b(listener);
        }
    }

    public void b(c listener) {
        AbstractC۰۰۵۷a aVar = this.f۲۵۹۰d;
        if (aVar != null) {
            aVar.a(listener);
        }
    }
}
