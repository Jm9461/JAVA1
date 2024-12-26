package p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۶۹d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import p۲۰۸b.p۲۶۷j.p۲۶۸a.Cc;

/* renamed from: b.j.a.d.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {

    /* renamed from: e, reason: contains not printable characters */
    private static volatile Ca f۱۲۹۸۹e;

    /* renamed from: a, reason: contains not printable characters */
    private Context f۱۲۹۹۰a;

    /* renamed from: b, reason: contains not printable characters */
    private SparseArray<int[]> f۱۲۹۹۱b = new SparseArray<>();

    /* renamed from: c, reason: contains not printable characters */
    private int f۱۲۹۹۲c;

    /* renamed from: d, reason: contains not printable characters */
    private a f۱۲۹۹۳d;

    /* renamed from: b.j.a.d.a$a */
    public interface a {
        /* renamed from: a, reason: contains not printable characters */
        void m۱۴۳۵۸a(c cVar);

        /* renamed from: b, reason: contains not printable characters */
        void m۱۴۳۵۹b(c cVar);
    }

    /* renamed from: b.j.a.d.a$b */
    public static class b {
    }

    /* renamed from: b.j.a.d.a$c */
    public interface c {
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۴۳۵۰a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a2 = context.obtainStyledAttributes(attrs, Cc.ThemableView, defStyleAttr, defStyleRes);
        int styleId = a2.getResourceId(Cc.ThemableView_v_styleId, 0);
        a2.recycle();
        return styleId;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Ca m۱۴۳۵۱a() {
        if (f۱۲۹۸۹e == null) {
            synchronized (Ca.class) {
                if (f۱۲۹۸۹e == null) {
                    f۱۲۹۸۹e = new Ca();
                }
            }
        }
        return f۱۲۹۸۹e;
    }

    /* renamed from: a, reason: contains not printable characters */
    private int[] m۱۴۳۵۲a(Context context, int resId) {
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

    /* renamed from: b, reason: contains not printable characters */
    private int[] m۱۴۳۵۳b(int styleId) {
        SparseArray<int[]> sparseArray = this.f۱۲۹۹۱b;
        if (sparseArray == null) {
            return null;
        }
        int[] list = sparseArray.get(styleId);
        if (list == null) {
            int[] list2 = m۱۴۳۵۲a(this.f۱۲۹۹۰a, styleId);
            this.f۱۲۹۹۱b.put(styleId, list2);
            return list2;
        }
        return list;
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۴۳۵۴a(int styleId) {
        return m۱۴۳۵۵a(styleId, this.f۱۲۹۹۲c);
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۴۳۵۵a(int styleId, int theme) {
        int[] styles = m۱۴۳۵۳b(styleId);
        if (styles == null) {
            return 0;
        }
        return styles[theme];
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۳۵۶a(c listener) {
        a aVar = this.f۱۲۹۹۳d;
        if (aVar != null) {
            aVar.m۱۴۳۵۹b(listener);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۴۳۵۷b(c listener) {
        a aVar = this.f۱۲۹۹۳d;
        if (aVar != null) {
            aVar.m۱۴۳۵۸a(listener);
        }
    }
}
