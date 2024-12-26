package p۱۳۹e.p۱۴۰f0.p۱۴۲f;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.f0.f.e  reason: invalid class name */
public final class Ce extends RuntimeException {

    /* renamed from: d  reason: contains not printable characters */
    private static final Method f۱۵۷۹۲d;

    /* renamed from: c  reason: contains not printable characters */
    private IOException f۱۵۷۹۳c;

    static {
        Method m;
        try {
            m = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception e) {
            m = null;
        }
        f۱۵۷۹۲d = m;
    }

    public Ce(IOException cause) {
        super(cause);
        this.f۱۵۷۹۳c = cause;
    }

    /* renamed from: a  reason: contains not printable characters */
    public IOException m۱۸۷۲۱a() {
        return this.f۱۵۷۹۳c;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۷۲۲a(IOException e) {
        m۱۸۷۲۰a(e, this.f۱۵۷۹۳c);
        this.f۱۵۷۹۳c = e;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۷۲۰a(IOException e, IOException suppressed) {
        Method method = f۱۵۷۹۲d;
        if (method != null) {
            try {
                method.invoke(e, suppressed);
            } catch (IllegalAccessException | InvocationTargetException e2) {
            }
        }
    }
}
