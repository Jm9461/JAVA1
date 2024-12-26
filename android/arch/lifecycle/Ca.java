package android.arch.lifecycle;

import android.arch.lifecycle.AbstractCc;
import android.arch.lifecycle.ClassesInfoCache;
import android.arch.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.a  reason: invalid class name */
class Ca {

    /* renamed from: c  reason: contains not printable characters */
    static Ca f۸۹۷۱c = new Ca();

    /* renamed from: a  reason: contains not printable characters */
    private final Map<Class, Ca> f۸۹۷۲a = new HashMap();

    /* renamed from: b  reason: contains not printable characters */
    private final Map<Class, Boolean> f۸۹۷۳b = new HashMap();

    Ca() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۰۸۸۲b(Class klass) {
        if (this.f۸۹۷۳b.containsKey(klass)) {
            return this.f۸۹۷۳b.get(klass).booleanValue();
        }
        Method[] methods = m۱۰۸۸۰c(klass);
        for (Method method : methods) {
            if (((AbstractCl) method.getAnnotation(AbstractCl.class)) != null) {
                m۱۰۸۷۸a(klass, methods);
                return true;
            }
        }
        this.f۸۹۷۳b.put(klass, false);
        return false;
    }

    /* renamed from: c  reason: contains not printable characters */
    private Method[] m۱۰۸۸۰c(Class klass) {
        try {
            return klass.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۰۸۸۱a(Class klass) {
        Ca existing = this.f۸۹۷۲a.get(klass);
        if (existing != null) {
            return existing;
        }
        return m۱۰۸۷۸a(klass, null);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۸۷۹a(Map<Cb, AbstractCc.EnumCa> map, Cb newHandler, AbstractCc.EnumCa newEvent, Class klass) {
        AbstractCc.EnumCa event = map.get(newHandler);
        if (event != null && newEvent != event) {
            Method method = newHandler.f۸۹۷۷b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + klass.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event + ", new value " + newEvent);
        } else if (event == null) {
            map.put(newHandler, newEvent);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private Ca m۱۰۸۷۸a(Class klass, Method[] declaredMethods) {
        Ca superInfo;
        Class superclass = klass.getSuperclass();
        Map<ClassesInfoCache.MethodReference, Lifecycle.Event> handlerToEvent = new HashMap<>();
        if (!(superclass == null || (superInfo = m۱۰۸۸۱a(superclass)) == null)) {
            handlerToEvent.putAll(superInfo.f۸۹۷۵b);
        }
        char c = 0;
        for (Class intrfc : klass.getInterfaces()) {
            for (Map.Entry<ClassesInfoCache.MethodReference, Lifecycle.Event> entry : m۱۰۸۸۱a(intrfc).f۸۹۷۵b.entrySet()) {
                m۱۰۸۷۹a(handlerToEvent, (Cb) entry.getKey(), (AbstractCc.EnumCa) entry.getValue(), klass);
            }
        }
        Method[] methods = declaredMethods != null ? declaredMethods : m۱۰۸۸۰c(klass);
        int length = methods.length;
        boolean hasLifecycleMethods = false;
        int i = 0;
        while (i < length) {
            Method method = methods[i];
            AbstractCl annotation = (AbstractCl) method.getAnnotation(AbstractCl.class);
            if (annotation != null) {
                hasLifecycleMethods = true;
                Class<?>[] params = method.getParameterTypes();
                int callType = 0;
                if (params.length > 0) {
                    callType = 1;
                    if (!params[c].isAssignableFrom(AbstractCe.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                }
                AbstractCc.EnumCa event = annotation.value();
                if (params.length > 1) {
                    callType = 2;
                    if (!params[1].isAssignableFrom(AbstractCc.EnumCa.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (event != AbstractCc.EnumCa.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (params.length <= 2) {
                    m۱۰۸۷۹a(handlerToEvent, new Cb(callType, method), event, klass);
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
            i++;
            c = 0;
        }
        Ca info2 = new Ca(handlerToEvent);
        this.f۸۹۷۲a.put(klass, info2);
        this.f۸۹۷۳b.put(klass, Boolean.valueOf(hasLifecycleMethods));
        return info2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.a$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        final Map<AbstractCc.EnumCa, List<Cb>> f۸۹۷۴a = new HashMap();

        /* renamed from: b  reason: contains not printable characters */
        final Map<Cb, AbstractCc.EnumCa> f۸۹۷۵b;

        Ca(Map<Cb, AbstractCc.EnumCa> map) {
            this.f۸۹۷۵b = map;
            for (Map.Entry<ClassesInfoCache.MethodReference, Lifecycle.Event> entry : map.entrySet()) {
                AbstractCc.EnumCa event = (AbstractCc.EnumCa) entry.getValue();
                List<ClassesInfoCache.MethodReference> methodReferences = this.f۸۹۷۴a.get(event);
                if (methodReferences == null) {
                    methodReferences = new ArrayList<>();
                    this.f۸۹۷۴a.put(event, methodReferences);
                }
                methodReferences.add(entry.getKey());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۸۸۴a(AbstractCe source, AbstractCc.EnumCa event, Object target) {
            m۱۰۸۸۳a(this.f۸۹۷۴a.get(event), source, event, target);
            m۱۰۸۸۳a(this.f۸۹۷۴a.get(AbstractCc.EnumCa.ON_ANY), source, event, target);
        }

        /* renamed from: a  reason: contains not printable characters */
        private static void m۱۰۸۸۳a(List<Cb> list, AbstractCe source, AbstractCc.EnumCa event, Object mWrapped) {
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    list.get(i).m۱۰۸۸۵a(source, event, mWrapped);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.a$b  reason: invalid class name */
    public static class Cb {

        /* renamed from: a  reason: contains not printable characters */
        final int f۸۹۷۶a;

        /* renamed from: b  reason: contains not printable characters */
        final Method f۸۹۷۷b;

        Cb(int callType, Method method) {
            this.f۸۹۷۶a = callType;
            this.f۸۹۷۷b = method;
            this.f۸۹۷۷b.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۸۸۵a(AbstractCe source, AbstractCc.EnumCa event, Object target) {
            try {
                int i = this.f۸۹۷۶a;
                if (i == 0) {
                    this.f۸۹۷۷b.invoke(target, new Object[0]);
                } else if (i == 1) {
                    this.f۸۹۷۷b.invoke(target, source);
                } else if (i == 2) {
                    this.f۸۹۷۷b.invoke(target, source, event);
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Cb that = (Cb) o;
            if (this.f۸۹۷۶a != that.f۸۹۷۶a || !this.f۸۹۷۷b.getName().equals(that.f۸۹۷۷b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f۸۹۷۶a * 31) + this.f۸۹۷۷b.getName().hashCode();
        }
    }
}
