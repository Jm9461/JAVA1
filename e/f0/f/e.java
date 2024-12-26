package e.f0.f;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class e extends RuntimeException {

    /* renamed from: d  reason: collision with root package name */
    private static final Method f۳۸۰۵d;

    /* renamed from: c  reason: collision with root package name */
    private IOException f۳۸۰۶c;

    static {
        Method m;
        try {
            m = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception e2) {
            m = null;
        }
        f۳۸۰۵d = m;
    }

    public e(IOException cause) {
        super(cause);
        this.f۳۸۰۶c = cause;
    }

    public IOException a() {
        return this.f۳۸۰۶c;
    }

    public void a(IOException e2) {
        a(e2, this.f۳۸۰۶c);
        this.f۳۸۰۶c = e2;
    }

    private void a(IOException e2, IOException suppressed) {
        Method method = f۳۸۰۵d;
        if (method != null) {
            try {
                method.invoke(e2, suppressed);
            } catch (IllegalAccessException | InvocationTargetException e3) {
            }
        }
    }
}
