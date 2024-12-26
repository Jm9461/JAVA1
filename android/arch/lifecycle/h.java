package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class, Integer> f۵۵۱a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<Class, List<Constructor<? extends b>>> f۵۵۲b = new HashMap();

    static GenericLifecycleObserver a(Object object) {
        if (object instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) object);
        }
        if (object instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) object;
        }
        Class<?> klass = object.getClass();
        if (b(klass) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends GeneratedAdapter>> constructors = f۵۵۲b.get(klass);
        if (constructors.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(constructors.get(0), object));
        }
        b[] adapters = new b[constructors.size()];
        for (int i = 0; i < constructors.size(); i++) {
            adapters[i] = a(constructors.get(i), object);
        }
        return new CompositeGeneratedAdaptersObserver(adapters);
    }

    private static b a(Constructor<? extends b> constructor, Object object) {
        try {
            return (b) constructor.newInstance(object);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static Constructor<? extends b> a(Class<?> klass) {
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
            String adapterName = a(str);
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
        } catch (ClassNotFoundException e2) {
            return null;
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static int b(Class<?> klass) {
        if (f۵۵۱a.containsKey(klass)) {
            return f۵۵۱a.get(klass).intValue();
        }
        int type = d(klass);
        f۵۵۱a.put(klass, Integer.valueOf(type));
        return type;
    }

    private static int d(Class<?> klass) {
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> constructor = a(klass);
        if (constructor != null) {
            f۵۵۲b.put(klass, Collections.singletonList(constructor));
            return 2;
        } else if (a.f۵۲۷c.b(klass)) {
            return 1;
        } else {
            Class<?> superclass = klass.getSuperclass();
            List<Constructor<? extends GeneratedAdapter>> adapterConstructors = null;
            if (c(superclass)) {
                if (b(superclass) == 1) {
                    return 1;
                }
                adapterConstructors = new ArrayList<>(f۵۵۲b.get(superclass));
            }
            Class<?>[] interfaces = klass.getInterfaces();
            for (Class<?> intrface : interfaces) {
                if (c(intrface)) {
                    if (b(intrface) == 1) {
                        return 1;
                    }
                    if (adapterConstructors == null) {
                        adapterConstructors = new ArrayList<>();
                    }
                    adapterConstructors.addAll(f۵۵۲b.get(intrface));
                }
            }
            if (adapterConstructors == null) {
                return 1;
            }
            f۵۵۲b.put(klass, adapterConstructors);
            return 2;
        }
    }

    private static boolean c(Class<?> klass) {
        return klass != null && d.class.isAssignableFrom(klass);
    }

    public static String a(String className) {
        return className.replace(".", "_") + "_LifecycleAdapter";
    }
}
