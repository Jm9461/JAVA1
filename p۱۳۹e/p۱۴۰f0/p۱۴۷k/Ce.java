package p۱۳۹e.p۱۴۰f0.p۱۴۷k;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: e.f0.k.e  reason: invalid class name */
public class Ce<T> {

    /* renamed from: a  reason: contains not printable characters */
    private final Class<?> f۱۶۰۶۷a;

    /* renamed from: b  reason: contains not printable characters */
    private final String f۱۶۰۶۸b;

    /* renamed from: c  reason: contains not printable characters */
    private final Class[] f۱۶۰۶۹c;

    Ce(Class<?> returnType, String methodName, Class... methodParams) {
        this.f۱۶۰۶۷a = returnType;
        this.f۱۶۰۶۸b = methodName;
        this.f۱۶۰۶۹c = methodParams;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۰۷۹a(T target) {
        return m۱۹۰۷۶a(target.getClass()) != null;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Object m۱۹۰۸۰b(T target, Object... args) {
        Method m = m۱۹۰۷۶a(target.getClass());
        if (m == null) {
            return null;
        }
        try {
            return m.invoke(target, args);
        } catch (IllegalAccessException e) {
            return null;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public Object m۱۹۰۸۱c(T target, Object... args) {
        try {
            return m۱۹۰۸۰b(target, args);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError error = new AssertionError("Unexpected exception");
            error.initCause(targetException);
            throw error;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۹۰۷۸a(T target, Object... args) {
        Method m = m۱۹۰۷۶a(target.getClass());
        if (m != null) {
            try {
                return m.invoke(target, args);
            } catch (IllegalAccessException e) {
                AssertionError error = new AssertionError("Unexpectedly could not call: " + m);
                error.initCause(e);
                throw error;
            }
        } else {
            throw new AssertionError("Method " + this.f۱۶۰۶۸b + " not supported for object " + ((Object) target));
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public Object m۱۹۰۸۲d(T target, Object... args) {
        try {
            return m۱۹۰۷۸a(target, args);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError error = new AssertionError("Unexpected exception");
            error.initCause(targetException);
            throw error;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private Method m۱۹۰۷۶a(Class<?> clazz) {
        Class<?> cls;
        String str = this.f۱۶۰۶۸b;
        if (str == null) {
            return null;
        }
        Method method = m۱۹۰۷۷a(clazz, str, this.f۱۶۰۶۹c);
        if (method == null || (cls = this.f۱۶۰۶۷a) == null || cls.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Method m۱۹۰۷۷a(Class<?> clazz, String methodName, Class[] parameterTypes) {
        Method method = null;
        try {
            method = clazz.getMethod(methodName, parameterTypes);
            if ((method.getModifiers() & 1) == 0) {
                return null;
            }
            return method;
        } catch (NoSuchMethodException e) {
            return method;
        }
    }
}
