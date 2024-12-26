package b.h.a;

import android.util.Log;
import b.h.b.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class k implements Cloneable {
    private static final l m = new f();
    private static final l n = new d();
    private static Class[] o;
    private static Class[] p;
    private static Class[] q;
    private static final HashMap<Class, HashMap<String, Method>> r = new HashMap<>();
    private static final HashMap<Class, HashMap<String, Method>> s = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    String f۲۵۶۳c;

    /* renamed from: d  reason: collision with root package name */
    protected c f۲۵۶۴d;

    /* renamed from: e  reason: collision with root package name */
    Method f۲۵۶۵e;

    /* renamed from: f  reason: collision with root package name */
    private Method f۲۵۶۶f;

    /* renamed from: g  reason: collision with root package name */
    Class f۲۵۶۷g;

    /* renamed from: h  reason: collision with root package name */
    h f۲۵۶۸h;
    final ReentrantReadWriteLock i;
    final Object[] j;
    private l k;
    private Object l;

    static {
        Class cls = Integer.TYPE;
        o = new Class[]{Float.TYPE, Float.class, Double.TYPE, cls, Double.class, Integer.class};
        Class cls2 = Double.TYPE;
        p = new Class[]{cls, Integer.class, Float.TYPE, cls2, Float.class, Double.class};
        q = new Class[]{cls2, Double.class, Float.TYPE, Integer.TYPE, Float.class, Integer.class};
    }

    private k(String propertyName) {
        this.f۲۵۶۵e = null;
        this.f۲۵۶۶f = null;
        this.f۲۵۶۸h = null;
        this.i = new ReentrantReadWriteLock();
        this.j = new Object[1];
        this.f۲۵۶۳c = propertyName;
    }

    private k(c property) {
        this.f۲۵۶۵e = null;
        this.f۲۵۶۶f = null;
        this.f۲۵۶۸h = null;
        this.i = new ReentrantReadWriteLock();
        this.j = new Object[1];
        this.f۲۵۶۴d = property;
        if (property != null) {
            this.f۲۵۶۳c = property.a();
        }
    }

    public static k a(String propertyName, float... values) {
        return new b(propertyName, values);
    }

    public static k a(c<?, Float> cVar, float... values) {
        return new b(cVar, values);
    }

    public void a(float... values) {
        this.f۲۵۶۷g = Float.TYPE;
        this.f۲۵۶۸h = h.a(values);
    }

    private Method a(Class targetClass, String prefix, Class valueType) {
        Class[] typeVariants;
        Method returnVal = null;
        String methodName = a(prefix, this.f۲۵۶۳c);
        if (valueType == null) {
            try {
                return targetClass.getMethod(methodName, null);
            } catch (NoSuchMethodException e2) {
                try {
                    returnVal = targetClass.getDeclaredMethod(methodName, null);
                    returnVal.setAccessible(true);
                    return returnVal;
                } catch (NoSuchMethodException e3) {
                    Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.f۲۵۶۳c + ": " + e2);
                    return returnVal;
                }
            }
        } else {
            Class[] args = new Class[1];
            if (this.f۲۵۶۷g.equals(Float.class)) {
                typeVariants = o;
            } else if (this.f۲۵۶۷g.equals(Integer.class)) {
                typeVariants = p;
            } else if (this.f۲۵۶۷g.equals(Double.class)) {
                typeVariants = q;
            } else {
                typeVariants = new Class[]{this.f۲۵۶۷g};
            }
            Method returnVal2 = null;
            for (Class typeVariant : typeVariants) {
                args[0] = typeVariant;
                try {
                    returnVal2 = targetClass.getMethod(methodName, args);
                    this.f۲۵۶۷g = typeVariant;
                    return returnVal2;
                } catch (NoSuchMethodException e4) {
                    try {
                        returnVal2 = targetClass.getDeclaredMethod(methodName, args);
                        returnVal2.setAccessible(true);
                        this.f۲۵۶۷g = typeVariant;
                        return returnVal2;
                    } catch (NoSuchMethodException e5) {
                    }
                }
            }
            Log.e("PropertyValuesHolder", "Couldn't find setter/getter for property " + this.f۲۵۶۳c + " with value type " + this.f۲۵۶۷g);
            return returnVal2;
        }
    }

    private Method a(Class targetClass, HashMap<Class, HashMap<String, Method>> propertyMapMap, String prefix, Class valueType) {
        Method setterOrGetter = null;
        try {
            this.i.writeLock().lock();
            HashMap<String, Method> propertyMap = propertyMapMap.get(targetClass);
            if (propertyMap != null) {
                setterOrGetter = propertyMap.get(this.f۲۵۶۳c);
            }
            if (setterOrGetter == null) {
                setterOrGetter = a(targetClass, prefix, valueType);
                if (propertyMap == null) {
                    propertyMap = new HashMap<>();
                    propertyMapMap.put(targetClass, propertyMap);
                }
                propertyMap.put(this.f۲۵۶۳c, setterOrGetter);
            }
            return setterOrGetter;
        } finally {
            this.i.writeLock().unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Class targetClass) {
        this.f۲۵۶۵e = a(targetClass, r, "set", this.f۲۵۶۷g);
    }

    private void b(Class targetClass) {
        this.f۲۵۶۶f = a(targetClass, s, "get", null);
    }

    /* access modifiers changed from: package-private */
    public void b(Object target) {
        c cVar = this.f۲۵۶۴d;
        if (cVar != null) {
            try {
                cVar.a(target);
                Iterator i$ = this.f۲۵۶۸h.f۲۵۵۳d.iterator();
                while (i$.hasNext()) {
                    g kf = i$.next();
                    if (!kf.d()) {
                        kf.a(this.f۲۵۶۴d.a(target));
                    }
                }
                return;
            } catch (ClassCastException e2) {
                Log.e("PropertyValuesHolder", "No such property (" + this.f۲۵۶۴d.a() + ") on target object " + target + ". Trying reflection instead");
                this.f۲۵۶۴d = null;
            }
        }
        Class targetClass = target.getClass();
        if (this.f۲۵۶۵e == null) {
            a(targetClass);
        }
        Iterator i$2 = this.f۲۵۶۸h.f۲۵۵۳d.iterator();
        while (i$2.hasNext()) {
            g kf2 = i$2.next();
            if (!kf2.d()) {
                if (this.f۲۵۶۶f == null) {
                    b(targetClass);
                }
                try {
                    kf2.a(this.f۲۵۶۶f.invoke(target, new Object[0]));
                } catch (InvocationTargetException e3) {
                    Log.e("PropertyValuesHolder", e3.toString());
                } catch (IllegalAccessException e4) {
                    Log.e("PropertyValuesHolder", e4.toString());
                }
            }
        }
    }

    @Override // java.lang.Object
    public k clone() {
        try {
            k newPVH = (k) super.clone();
            newPVH.f۲۵۶۳c = this.f۲۵۶۳c;
            newPVH.f۲۵۶۴d = this.f۲۵۶۴d;
            newPVH.f۲۵۶۸h = this.f۲۵۶۸h.clone();
            newPVH.k = this.k;
            return newPVH;
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Object target) {
        c cVar = this.f۲۵۶۴d;
        if (cVar != null) {
            cVar.a(target, a());
        }
        if (this.f۲۵۶۵e != null) {
            try {
                this.j[0] = a();
                this.f۲۵۶۵e.invoke(target, this.j);
            } catch (InvocationTargetException e2) {
                Log.e("PropertyValuesHolder", e2.toString());
            } catch (IllegalAccessException e3) {
                Log.e("PropertyValuesHolder", e3.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.k == null) {
            Class cls = this.f۲۵۶۷g;
            this.k = cls == Integer.class ? m : cls == Float.class ? n : null;
        }
        l lVar = this.k;
        if (lVar != null) {
            this.f۲۵۶۸h.a(lVar);
        }
    }

    public void a(l evaluator) {
        this.k = evaluator;
        this.f۲۵۶۸h.a(evaluator);
    }

    /* access modifiers changed from: package-private */
    public void a(float fraction) {
        this.l = this.f۲۵۶۸h.a(fraction);
    }

    public void a(String propertyName) {
        this.f۲۵۶۳c = propertyName;
    }

    public void a(c property) {
        this.f۲۵۶۴d = property;
    }

    public String b() {
        return this.f۲۵۶۳c;
    }

    /* access modifiers changed from: package-private */
    public Object a() {
        return this.l;
    }

    public String toString() {
        return this.f۲۵۶۳c + ": " + this.f۲۵۶۸h.toString();
    }

    static String a(String prefix, String propertyName) {
        if (propertyName == null || propertyName.length() == 0) {
            return prefix;
        }
        char firstLetter = Character.toUpperCase(propertyName.charAt(0));
        String theRest = propertyName.substring(1);
        return prefix + firstLetter + theRest;
    }

    /* access modifiers changed from: package-private */
    public static class b extends k {
        private b.h.b.a t;
        e u;
        float v;

        public b(String propertyName, float... values) {
            super(propertyName);
            a(values);
        }

        public b(c property, float... values) {
            super(property);
            a(values);
            if (property instanceof b.h.b.a) {
                this.t = (b.h.b.a) this.f۲۵۶۴d;
            }
        }

        @Override // b.h.a.k
        public void a(float... values) {
            k.super.a(values);
            this.u = (e) this.f۲۵۶۸h;
        }

        /* access modifiers changed from: package-private */
        @Override // b.h.a.k
        public void a(float fraction) {
            this.v = this.u.b(fraction);
        }

        /* access modifiers changed from: package-private */
        @Override // b.h.a.k
        public Object a() {
            return Float.valueOf(this.v);
        }

        @Override // java.lang.Object, b.h.a.k, b.h.a.k
        public b clone() {
            b newPVH = (b) k.super.clone();
            newPVH.u = (e) newPVH.f۲۵۶۸h;
            return newPVH;
        }

        /* access modifiers changed from: package-private */
        @Override // b.h.a.k
        public void a(Object target) {
            b.h.b.a aVar = this.t;
            if (aVar != null) {
                aVar.a(target, this.v);
                return;
            }
            c cVar = this.f۲۵۶۴d;
            if (cVar != null) {
                cVar.a(target, Float.valueOf(this.v));
            } else if (this.f۲۵۶۵e != null) {
                try {
                    this.j[0] = Float.valueOf(this.v);
                    this.f۲۵۶۵e.invoke(target, this.j);
                } catch (InvocationTargetException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                } catch (IllegalAccessException e3) {
                    Log.e("PropertyValuesHolder", e3.toString());
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // b.h.a.k
        public void a(Class targetClass) {
            if (this.f۲۵۶۴d == null) {
                k.super.a(targetClass);
            }
        }
    }
}
