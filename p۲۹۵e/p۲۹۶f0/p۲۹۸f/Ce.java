package p۲۹۵e.p۲۹۶f0.p۲۹۸f;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.f0.f.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ce extends RuntimeException {

    /* renamed from: d, reason: contains not printable characters */
    private static final Method f۱۵۷۹۲d;

    /* renamed from: c, reason: contains not printable characters */
    private IOException f۱۵۷۹۳c;

    static {
        Method m;
        try {
            m = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception e2) {
            m = null;
        }
        f۱۵۷۹۲d = m;
    }

    public Ce(IOException cause) {
        super(cause);
        this.f۱۵۷۹۳c = cause;
    }

    /* renamed from: a, reason: contains not printable characters */
    public IOException m۱۶۶۴۲a() {
        return this.f۱۵۷۹۳c;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۶۴۳a(IOException e2) {
        m۱۶۶۴۱a(e2, this.f۱۵۷۹۳c);
        this.f۱۵۷۹۳c = e2;
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۶۶۴۱a(IOException e2, IOException suppressed) {
        Method method = f۱۵۷۹۲d;
        if (method != null) {
            try {
                method.invoke(e2, suppressed);
            } catch (IllegalAccessException e3) {
            } catch (InvocationTargetException e4) {
            }
        }
    }
}
