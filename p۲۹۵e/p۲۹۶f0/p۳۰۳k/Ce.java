package p۲۹۵e.p۲۹۶f0.p۳۰۳k;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.f0.k.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ce<T> {

    /* renamed from: a, reason: contains not printable characters */
    private final Class<?> f۱۶۰۶۷a;

    /* renamed from: b, reason: contains not printable characters */
    private final String f۱۶۰۶۸b;

    /* renamed from: c, reason: contains not printable characters */
    private final Class[] f۱۶۰۶۹c;

    /* JADX WARN: Generic types in debug info not equals: e.f0.k.e != okhttp3.internal.platform.OptionalMethod<T> */
    Ce(Class<?> returnType, String methodName, Class... methodParams) {
        this.f۱۶۰۶۷a = returnType;
        this.f۱۶۰۶۸b = methodName;
        this.f۱۶۰۶۹c = methodParams;
    }

    /* JADX WARN: Generic types in debug info not equals: e.f0.k.e != okhttp3.internal.platform.OptionalMethod<T> */
    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۷۰۰۰a(T target) {
        return m۱۶۹۹۷a(target.getClass()) != null;
    }

    /* JADX WARN: Generic types in debug info not equals: e.f0.k.e != okhttp3.internal.platform.OptionalMethod<T> */
    /* renamed from: b, reason: contains not printable characters */
    public Object m۱۷۰۰۱b(T target, Object... args) {
        Method m = m۱۶۹۹۷a(target.getClass());
        if (m == null) {
            return null;
        }
        try {
            return m.invoke(target, args);
        } catch (IllegalAccessException e2) {
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: e.f0.k.e != okhttp3.internal.platform.OptionalMethod<T> */
    /* renamed from: c, reason: contains not printable characters */
    public Object m۱۷۰۰۲c(T target, Object... args) {
        try {
            return m۱۷۰۰۱b(target, args);
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

    /* JADX WARN: Generic types in debug info not equals: e.f0.k.e != okhttp3.internal.platform.OptionalMethod<T> */
    /* renamed from: a, reason: contains not printable characters */
    public Object m۱۶۹۹۹a(T target, Object... args) {
        Method m = m۱۶۹۹۷a(target.getClass());
        if (m == null) {
            throw new AssertionError("Method " + this.f۱۶۰۶۸b + " not supported for object " + target);
        }
        try {
            return m.invoke(target, args);
        } catch (IllegalAccessException e2) {
            AssertionError error = new AssertionError("Unexpectedly could not call: " + m);
            error.initCause(e2);
            throw error;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: e.f0.k.e != okhttp3.internal.platform.OptionalMethod<T> */
    /* renamed from: d, reason: contains not printable characters */
    public Object m۱۷۰۰۳d(T target, Object... args) {
        try {
            return m۱۶۹۹۹a(target, args);
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

    /* JADX WARN: Generic types in debug info not equals: e.f0.k.e != okhttp3.internal.platform.OptionalMethod<T> */
    /* renamed from: a, reason: contains not printable characters */
    private Method m۱۶۹۹۷a(Class<?> clazz) {
        Class<?> cls;
        String str = this.f۱۶۰۶۸b;
        if (str == null) {
            return null;
        }
        Method method = m۱۶۹۹۸a(clazz, str, this.f۱۶۰۶۹c);
        if (method != null && (cls = this.f۱۶۰۶۷a) != null && !cls.isAssignableFrom(method.getReturnType())) {
            return null;
        }
        return method;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Method m۱۶۹۹۸a(Class<?> clazz, String methodName, Class[] parameterTypes) {
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
