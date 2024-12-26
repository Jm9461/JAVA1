package butterknife;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ButterKnife {

    /* renamed from: a  reason: contains not printable characters */
    private static boolean f۱۳۱۴۴a = false;

    /* renamed from: b  reason: contains not printable characters */
    static final Map<Class<?>, Constructor<? extends Unbinder>> f۱۳۱۴۵b = new LinkedHashMap();

    public interface Action<T extends View> {
    }

    public interface Setter<T extends View, V> {
    }

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Unbinder m۱۶۵۸۶a(Activity target) {
        return m۱۶۵۸۷a(target, target.getWindow().getDecorView());
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Unbinder m۱۶۵۸۷a(Object target, View source) {
        Class<?> targetClass = target.getClass();
        if (f۱۳۱۴۴a) {
            Log.d("ButterKnife", "Looking up binding for " + targetClass.getName());
        }
        Constructor<? extends Unbinder> constructor = m۱۶۵۸۸a(targetClass);
        if (constructor == null) {
            return Unbinder.f۱۳۱۵۷a;
        }
        try {
            return (Unbinder) constructor.newInstance(target, source);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke " + constructor, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Unable to invoke " + constructor, e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unable to create binding instance.", cause);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Constructor<? extends Unbinder> m۱۶۵۸۸a(Class<?> cls) {
        Constructor<? extends Unbinder> bindingCtor;
        Constructor<? extends Unbinder> bindingCtor2 = f۱۳۱۴۵b.get(cls);
        if (bindingCtor2 != null) {
            if (f۱۳۱۴۴a) {
                Log.d("ButterKnife", "HIT: Cached in binding map.");
            }
            return bindingCtor2;
        }
        String clsName = cls.getName();
        if (!clsName.startsWith("android.") && !clsName.startsWith("java.")) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                bindingCtor = classLoader.loadClass(clsName + "_ViewBinding").getConstructor(cls, View.class);
                if (f۱۳۱۴۴a) {
                    Log.d("ButterKnife", "HIT: Loaded binding class and constructor.");
                }
            } catch (ClassNotFoundException e) {
                if (f۱۳۱۴۴a) {
                    Log.d("ButterKnife", "Not found. Trying superclass " + cls.getSuperclass().getName());
                }
                bindingCtor = m۱۶۵۸۸a(cls.getSuperclass());
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException("Unable to find binding constructor for " + clsName, e2);
            }
            f۱۳۱۴۵b.put(cls, bindingCtor);
            return bindingCtor;
        } else if (!f۱۳۱۴۴a) {
            return null;
        } else {
            Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
            return null;
        }
    }
}
