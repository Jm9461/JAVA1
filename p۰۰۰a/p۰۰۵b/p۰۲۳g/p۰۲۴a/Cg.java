package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.g.a.g  reason: invalid class name */
public class Cg extends Cf {
    /* access modifiers changed from: protected */
    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cf
    /* renamed from: a  reason: contains not printable characters */
    public Typeface m۱۰۴۶۶a(Object family) {
        try {
            Object familyArray = Array.newInstance(this.f۸۶۵۵a, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.f۸۶۶۱g.invoke(null, familyArray, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۴a.Cf
    /* renamed from: d  reason: contains not printable characters */
    public Method m۱۰۴۶۷d(Class fontFamily) {
        Class cls = Integer.TYPE;
        Method m = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamily, 1).getClass(), String.class, cls, cls);
        m.setAccessible(true);
        return m;
    }
}
