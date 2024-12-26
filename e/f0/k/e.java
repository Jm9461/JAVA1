package e.f0.k;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f۴۰۳۳a;

    /* renamed from: b  reason: collision with root package name */
    private final String f۴۰۳۴b;

    /* renamed from: c  reason: collision with root package name */
    private final Class[] f۴۰۳۵c;

    e(Class<?> returnType, String methodName, Class... methodParams) {
        this.f۴۰۳۳a = returnType;
        this.f۴۰۳۴b = methodName;
        this.f۴۰۳۵c = methodParams;
    }

    public boolean a(T target) {
        return a(target.getClass()) != null;
    }

    public Object b(T target, Object... args) {
        Method m = a(target.getClass());
        if (m == null) {
            return null;
        }
        try {
            return m.invoke(target, args);
        } catch (IllegalAccessException e2) {
            return null;
        }
    }

    public Object c(T target, Object... args) {
        try {
            return b(target, args);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError error = new AssertionError("Unexpected exception");
            error.initCause(targetException);
            throw error;
        }
    }

    public Object a(T target, Object... args) {
        Method m = a(target.getClass());
        if (m != null) {
            try {
                return m.invoke(target, args);
            } catch (IllegalAccessException e2) {
                AssertionError error = new AssertionError("Unexpectedly could not call: " + m);
                error.initCause(e2);
                throw error;
            }
        } else {
            throw new AssertionError("Method " + this.f۴۰۳۴b + " not supported for object " + ((Object) target));
        }
    }

    public Object d(T target, Object... args) {
        try {
            return a(target, args);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError error = new AssertionError("Unexpected exception");
            error.initCause(targetException);
            throw error;
        }
    }

    private Method a(Class<?> clazz) {
        Class<?> cls;
        String str = this.f۴۰۳۴b;
        if (str == null) {
            return null;
        }
        Method method = a(clazz, str, this.f۴۰۳۵c);
        if (method == null || (cls = this.f۴۰۳۳a) == null || cls.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }

    private static Method a(Class<?> clazz, String methodName, Class[] parameterTypes) {
        Method method = null;
        try {
            method = clazz.getMethod(methodName, parameterTypes);
            if ((method.getModifiers() & 1) == 0) {
                return null;
            }
            return method;
        } catch (NoSuchMethodException e2) {
            return method;
        }
    }
}
