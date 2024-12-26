package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.g.a.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cg extends Cf {
    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cf
    /* renamed from: a, reason: contains not printable characters */
    protected Typeface mo۸۴۰۱a(Object family) {
        try {
            Object familyArray = Array.newInstance((Class<?>) this.f۸۶۵۵a, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.f۸۶۶۱g.invoke(null, familyArray, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cf
    /* renamed from: d, reason: contains not printable characters */
    protected Method mo۸۴۰۲d(Class fontFamily) {
        Object familyArray = Array.newInstance((Class<?>) fontFamily, 1);
        Class cls = Integer.TYPE;
        Method m = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", familyArray.getClass(), String.class, cls, cls);
        m.setAccessible(true);
        return m;
    }
}
