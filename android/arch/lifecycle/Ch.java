package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.h  reason: invalid class name */
public class Ch {

    /* renamed from: a  reason: contains not printable characters */
    private static Map<Class, Integer> f۸۹۹۵a = new HashMap();

    /* renamed from: b  reason: contains not printable characters */
    private static Map<Class, List<Constructor<? extends AbstractCb>>> f۸۹۹۶b = new HashMap();

    /* renamed from: a  reason: contains not printable characters */
    static GenericLifecycleObserver m۱۰۹۱۱a(Object object) {
        if (object instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) object);
        }
        if (object instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) object;
        }
        Class<?> klass = object.getClass();
        if (m۱۰۹۱۵b(klass) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends GeneratedAdapter>> constructors = f۸۹۹۶b.get(klass);
        if (constructors.size() == 1) {
            return new SingleGeneratedAdapterObserver(m۱۰۹۱۲a(constructors.get(0), object));
        }
        AbstractCb[] adapters = new AbstractCb[constructors.size()];
        for (int i = 0; i < constructors.size(); i++) {
            adapters[i] = m۱۰۹۱۲a(constructors.get(i), object);
        }
        return new CompositeGeneratedAdaptersObserver(adapters);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static AbstractCb m۱۰۹۱۲a(Constructor<? extends AbstractCb> constructor, Object object) {
        try {
            return (AbstractCb) constructor.newInstance(object);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Constructor<? extends AbstractCb> m۱۰۹۱۴a(Class<?> klass) {
        String str;
        String str2;
        try {
            Package aPackage = klass.getPackage();
            String name = klass.getCanonicalName();
            String fullPackage = aPackage != null ? aPackage.getName() : "";
            if (fullPackage.isEmpty()) {
                str = name;
            } else {
                str = name.substring(fullPackage.length() + 1);
            }
            String adapterName = m۱۰۹۱۳a(str);
            if (fullPackage.isEmpty()) {
                str2 = adapterName;
            } else {
                str2 = fullPackage + "." + adapterName;
            }
            Constructor declaredConstructor = Class.forName(str2).getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException e) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static int m۱۰۹۱۵b(Class<?> klass) {
        if (f۸۹۹۵a.containsKey(klass)) {
            return f۸۹۹۵a.get(klass).intValue();
        }
        int type = m۱۰۹۱۷d(klass);
        f۸۹۹۵a.put(klass, Integer.valueOf(type));
        return type;
    }

    /* renamed from: d  reason: contains not printable characters */
    private static int m۱۰۹۱۷d(Class<?> klass) {
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> constructor = m۱۰۹۱۴a(klass);
        if (constructor != null) {
            f۸۹۹۶b.put(klass, Collections.singletonList(constructor));
            return 2;
        } else if (Ca.f۸۹۷۱c.m۱۰۸۸۲b(klass)) {
            return 1;
        } else {
            Class<?> superclass = klass.getSuperclass();
            List<Constructor<? extends GeneratedAdapter>> adapterConstructors = null;
            if (m۱۰۹۱۶c(superclass)) {
                if (m۱۰۹۱۵b(superclass) == 1) {
                    return 1;
                }
                adapterConstructors = new ArrayList<>(f۸۹۹۶b.get(superclass));
            }
            Class<?>[] interfaces = klass.getInterfaces();
            for (Class<?> intrface : interfaces) {
                if (m۱۰۹۱۶c(intrface)) {
                    if (m۱۰۹۱۵b(intrface) == 1) {
                        return 1;
                    }
                    if (adapterConstructors == null) {
                        adapterConstructors = new ArrayList<>();
                    }
                    adapterConstructors.addAll(f۸۹۹۶b.get(intrface));
                }
            }
            if (adapterConstructors == null) {
                return 1;
            }
            f۸۹۹۶b.put(klass, adapterConstructors);
            return 2;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private static boolean m۱۰۹۱۶c(Class<?> klass) {
        return klass != null && AbstractCd.class.isAssignableFrom(klass);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۰۹۱۳a(String className) {
        return className.replace(".", "_") + "_LifecycleAdapter";
    }
}
