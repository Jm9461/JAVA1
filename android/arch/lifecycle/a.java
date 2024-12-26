package android.arch.lifecycle;

import android.arch.lifecycle.ClassesInfoCache;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class a {

    /* renamed from: c  reason: collision with root package name */
    static a f۵۲۷c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class, C۰۰۲۰a> f۵۲۸a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class, Boolean> f۵۲۹b = new HashMap();

    a() {
    }

    /* access modifiers changed from: package-private */
    public boolean b(Class klass) {
        if (this.f۵۲۹b.containsKey(klass)) {
            return this.f۵۲۹b.get(klass).booleanValue();
        }
        Method[] methods = c(klass);
        for (Method method : methods) {
            if (((l) method.getAnnotation(l.class)) != null) {
                a(klass, methods);
                return true;
            }
        }
        this.f۵۲۹b.put(klass, false);
        return false;
    }

    private Method[] c(Class klass) {
        try {
            return klass.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public C۰۰۲۰a a(Class klass) {
        C۰۰۲۰a existing = this.f۵۲۸a.get(klass);
        if (existing != null) {
            return existing;
        }
        return a(klass, null);
    }

    private void a(Map<b, c.a> map, b newHandler, c.a newEvent, Class klass) {
        c.a event = map.get(newHandler);
        if (event != null && newEvent != event) {
            Method method = newHandler.f۵۳۳b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + klass.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event + ", new value " + newEvent);
        } else if (event == null) {
            map.put(newHandler, newEvent);
        }
    }

    private C۰۰۲۰a a(Class klass, Method[] declaredMethods) {
        C۰۰۲۰a superInfo;
        Class superclass = klass.getSuperclass();
        Map<ClassesInfoCache.MethodReference, Lifecycle.Event> handlerToEvent = new HashMap<>();
        if (!(superclass == null || (superInfo = a(superclass)) == null)) {
            handlerToEvent.putAll(superInfo.f۵۳۱b);
        }
        char c2 = 0;
        for (Class intrfc : klass.getInterfaces()) {
            for (Map.Entry<ClassesInfoCache.MethodReference, Lifecycle.Event> entry : a(intrfc).f۵۳۱b.entrySet()) {
                a(handlerToEvent, (b) entry.getKey(), (c.a) entry.getValue(), klass);
            }
        }
        Method[] methods = declaredMethods != null ? declaredMethods : c(klass);
        int length = methods.length;
        boolean hasLifecycleMethods = false;
        int i = 0;
        while (i < length) {
            Method method = methods[i];
            l annotation = (l) method.getAnnotation(l.class);
            if (annotation != null) {
                hasLifecycleMethods = true;
                Class<?>[] params = method.getParameterTypes();
                int callType = 0;
                if (params.length > 0) {
                    callType = 1;
                    if (!params[c2].isAssignableFrom(e.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                }
                c.a event = annotation.value();
                if (params.length > 1) {
                    callType = 2;
                    if (!params[1].isAssignableFrom(c.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (event != c.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (params.length <= 2) {
                    a(handlerToEvent, new b(callType, method), event, klass);
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
            i++;
            c2 = 0;
        }
        C۰۰۲۰a info2 = new C۰۰۲۰a(handlerToEvent);
        this.f۵۲۸a.put(klass, info2);
        this.f۵۲۹b.put(klass, Boolean.valueOf(hasLifecycleMethods));
        return info2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.a$a  reason: collision with other inner class name */
    public static class C۰۰۲۰a {

        /* renamed from: a  reason: collision with root package name */
        final Map<c.a, List<b>> f۵۳۰a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, c.a> f۵۳۱b;

        C۰۰۲۰a(Map<b, c.a> map) {
            this.f۵۳۱b = map;
            for (Map.Entry<ClassesInfoCache.MethodReference, Lifecycle.Event> entry : map.entrySet()) {
                c.a event = (c.a) entry.getValue();
                List<ClassesInfoCache.MethodReference> methodReferences = this.f۵۳۰a.get(event);
                if (methodReferences == null) {
                    methodReferences = new ArrayList<>();
                    this.f۵۳۰a.put(event, methodReferences);
                }
                methodReferences.add(entry.getKey());
            }
        }

        /* access modifiers changed from: package-private */
        public void a(e source, c.a event, Object target) {
            a(this.f۵۳۰a.get(event), source, event, target);
            a(this.f۵۳۰a.get(c.a.ON_ANY), source, event, target);
        }

        private static void a(List<b> list, e source, c.a event, Object mWrapped) {
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    list.get(i).a(source, event, mWrapped);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f۵۳۲a;

        /* renamed from: b  reason: collision with root package name */
        final Method f۵۳۳b;

        b(int callType, Method method) {
            this.f۵۳۲a = callType;
            this.f۵۳۳b = method;
            this.f۵۳۳b.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(e source, c.a event, Object target) {
            try {
                int i = this.f۵۳۲a;
                if (i == 0) {
                    this.f۵۳۳b.invoke(target, new Object[0]);
                } else if (i == 1) {
                    this.f۵۳۳b.invoke(target, source);
                } else if (i == 2) {
                    this.f۵۳۳b.invoke(target, source, event);
                }
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            }
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            b that = (b) o;
            if (this.f۵۳۲a != that.f۵۳۲a || !this.f۵۳۳b.getName().equals(that.f۵۳۳b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f۵۳۲a * 31) + this.f۵۳۳b.getName().hashCode();
        }
    }
}
