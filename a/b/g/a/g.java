package a.b.g.a;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class g extends f {
    /* access modifiers changed from: protected */
    @Override // a.b.g.a.f
    public Typeface a(Object family) {
        try {
            Object familyArray = Array.newInstance(this.f۲۹۲a, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.f۲۹۸g.invoke(null, familyArray, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // a.b.g.a.f
    public Method d(Class fontFamily) {
        Class cls = Integer.TYPE;
        Method m = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamily, 1).getClass(), String.class, cls, cls);
        m.setAccessible(true);
        return m;
    }
}
