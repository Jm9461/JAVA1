package p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۳d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc;

/* renamed from: b.j.a.d.a  reason: invalid class name */
public class Ca {

    /* renamed from: e  reason: contains not printable characters */
    private static volatile Ca f۱۲۹۸۹e;

    /* renamed from: a  reason: contains not printable characters */
    private Context f۱۲۹۹۰a;

    /* renamed from: b  reason: contains not printable characters */
    private SparseArray<int[]> f۱۲۹۹۱b = new SparseArray<>();

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۲۹۹۲c;

    /* renamed from: d  reason: contains not printable characters */
    private AbstractCa f۱۲۹۹۳d;

    /* renamed from: b.j.a.d.a$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۶۴۳۳a(AbstractCc cVar);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۶۴۳۴b(AbstractCc cVar);
    }

    /* renamed from: b.j.a.d.a$b  reason: invalid class name */
    public static class Cb {
    }

    /* renamed from: b.j.a.d.a$c  reason: invalid class name */
    public interface AbstractCc {
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۶۴۲۵a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a = context.obtainStyledAttributes(attrs, Cc.ThemableView, defStyleAttr, defStyleRes);
        int styleId = a.getResourceId(Cc.ThemableView_v_styleId, 0);
        a.recycle();
        return styleId;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ca m۱۶۴۲۶a() {
        if (f۱۲۹۸۹e == null) {
            synchronized (Ca.class) {
                if (f۱۲۹۸۹e == null) {
                    f۱۲۹۸۹e = new Ca();
                }
            }
        }
        return f۱۲۹۸۹e;
    }

    /* renamed from: a  reason: contains not printable characters */
    private int[] m۱۶۴۲۷a(Context context, int resId) {
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

    /* renamed from: b  reason: contains not printable characters */
    private int[] m۱۶۴۲۸b(int styleId) {
        SparseArray<int[]> sparseArray = this.f۱۲۹۹۱b;
        if (sparseArray == null) {
            return null;
        }
        int[] list = sparseArray.get(styleId);
        if (list != null) {
            return list;
        }
        int[] list2 = m۱۶۴۲۷a(this.f۱۲۹۹۰a, styleId);
        this.f۱۲۹۹۱b.put(styleId, list2);
        return list2;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۶۴۲۹a(int styleId) {
        return m۱۶۴۳۰a(styleId, this.f۱۲۹۹۲c);
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۶۴۳۰a(int styleId, int theme) {
        int[] styles = m۱۶۴۲۸b(styleId);
        if (styles == null) {
            return 0;
        }
        return styles[theme];
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۴۳۱a(AbstractCc listener) {
        AbstractCa aVar = this.f۱۲۹۹۳d;
        if (aVar != null) {
            aVar.m۱۶۴۳۴b(listener);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۴۳۲b(AbstractCc listener) {
        AbstractCa aVar = this.f۱۲۹۹۳d;
        if (aVar != null) {
            aVar.m۱۶۴۳۳a(listener);
        }
    }
}
