package p۲۰۸b.p۲۵۹h.p۲۶۰a;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p۲۰۸b.p۲۵۹h.p۲۶۱b.AbstractCa;
import p۲۰۸b.p۲۵۹h.p۲۶۱b.AbstractCc;

/* renamed from: b.h.a.k, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ck implements Cloneable {

    /* renamed from: m, reason: contains not printable characters */
    private static final InterfaceCl f۱۲۹۲۰m = new Cf();

    /* renamed from: n, reason: contains not printable characters */
    private static final InterfaceCl f۱۲۹۲۱n = new Cd();

    /* renamed from: o, reason: contains not printable characters */
    private static Class[] f۱۲۹۲۲o;

    /* renamed from: p, reason: contains not printable characters */
    private static Class[] f۱۲۹۲۳p;

    /* renamed from: q, reason: contains not printable characters */
    private static Class[] f۱۲۹۲۴q;

    /* renamed from: r, reason: contains not printable characters */
    private static final HashMap<Class, HashMap<String, Method>> f۱۲۹۲۵r;

    /* renamed from: s, reason: contains not printable characters */
    private static final HashMap<Class, HashMap<String, Method>> f۱۲۹۲۶s;

    /* renamed from: c, reason: contains not printable characters */
    String f۱۲۹۲۷c;

    /* renamed from: d, reason: contains not printable characters */
    protected AbstractCc f۱۲۹۲۸d;

    /* renamed from: e, reason: contains not printable characters */
    Method f۱۲۹۲۹e;

    /* renamed from: f, reason: contains not printable characters */
    private Method f۱۲۹۳۰f;

    /* renamed from: g, reason: contains not printable characters */
    Class f۱۲۹۳۱g;

    /* renamed from: h, reason: contains not printable characters */
    Ch f۱۲۹۳۲h;

    /* renamed from: i, reason: contains not printable characters */
    final ReentrantReadWriteLock f۱۲۹۳۳i;

    /* renamed from: j, reason: contains not printable characters */
    final Object[] f۱۲۹۳۴j;

    /* renamed from: k, reason: contains not printable characters */
    private InterfaceCl f۱۲۹۳۵k;

    /* renamed from: l, reason: contains not printable characters */
    private Object f۱۲۹۳۶l;

    static {
        Class cls = Integer.TYPE;
        f۱۲۹۲۲o = new Class[]{Float.TYPE, Float.class, Double.TYPE, cls, Double.class, Integer.class};
        Class cls2 = Double.TYPE;
        f۱۲۹۲۳p = new Class[]{cls, Integer.class, Float.TYPE, cls2, Float.class, Double.class};
        f۱۲۹۲۴q = new Class[]{cls2, Double.class, Float.TYPE, Integer.TYPE, Float.class, Integer.class};
        f۱۲۹۲۵r = new HashMap<>();
        f۱۲۹۲۶s = new HashMap<>();
    }

    private Ck(String propertyName) {
        this.f۱۲۹۲۹e = null;
        this.f۱۲۹۳۰f = null;
        this.f۱۲۹۳۲h = null;
        this.f۱۲۹۳۳i = new ReentrantReadWriteLock();
        this.f۱۲۹۳۴j = new Object[1];
        this.f۱۲۹۲۷c = propertyName;
    }

    private Ck(AbstractCc property) {
        this.f۱۲۹۲۹e = null;
        this.f۱۲۹۳۰f = null;
        this.f۱۲۹۳۲h = null;
        this.f۱۲۹۳۳i = new ReentrantReadWriteLock();
        this.f۱۲۹۳۴j = new Object[1];
        this.f۱۲۹۲۸d = property;
        if (property != null) {
            this.f۱۲۹۲۷c = property.m۱۴۲۸۳a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Ck m۱۴۲۲۶a(String propertyName, float... values) {
        return new b(propertyName, values);
    }

    /* JADX WARN: Generic types in debug info not equals: b.h.b.c != com.nineoldandroids.util.Property<?, java.lang.Float> */
    /* renamed from: a, reason: contains not printable characters */
    public static Ck m۱۴۲۲۵a(AbstractCc<?, Float> abstractCc, float... values) {
        return new b(abstractCc, values);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۲۴۷a(float... values) {
        this.f۱۲۹۳۱g = Float.TYPE;
        this.f۱۲۹۳۲h = Ch.m۱۴۱۷۰a(values);
    }

    /* renamed from: a, reason: contains not printable characters */
    private Method m۱۴۲۲۸a(Class targetClass, String prefix, Class valueType) {
        Class[] typeVariants;
        Method returnVal = null;
        String methodName = m۱۴۲۲۷a(prefix, this.f۱۲۹۲۷c);
        if (valueType == null) {
            try {
                Method returnVal2 = targetClass.getMethod(methodName, null);
                return returnVal2;
            } catch (NoSuchMethodException e2) {
                try {
                    returnVal = targetClass.getDeclaredMethod(methodName, null);
                    returnVal.setAccessible(true);
                    return returnVal;
                } catch (NoSuchMethodException e3) {
                    Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.f۱۲۹۲۷c + ": " + e2);
                    return returnVal;
                }
            }
        }
        Class[] args = new Class[1];
        if (this.f۱۲۹۳۱g.equals(Float.class)) {
            typeVariants = f۱۲۹۲۲o;
        } else if (this.f۱۲۹۳۱g.equals(Integer.class)) {
            typeVariants = f۱۲۹۲۳p;
        } else if (this.f۱۲۹۳۱g.equals(Double.class)) {
            typeVariants = f۱۲۹۲۴q;
        } else {
            Class[] typeVariants2 = {this.f۱۲۹۳۱g};
            typeVariants = typeVariants2;
        }
        Class[] arr$ = typeVariants;
        Method returnVal3 = null;
        for (Class typeVariant : arr$) {
            args[0] = typeVariant;
            try {
                returnVal3 = targetClass.getMethod(methodName, args);
                this.f۱۲۹۳۱g = typeVariant;
                return returnVal3;
            } catch (NoSuchMethodException e4) {
                try {
                    returnVal3 = targetClass.getDeclaredMethod(methodName, args);
                    returnVal3.setAccessible(true);
                    this.f۱۲۹۳۱g = typeVariant;
                    return returnVal3;
                } catch (NoSuchMethodException e5) {
                }
            }
        }
        Log.e("PropertyValuesHolder", "Couldn't find setter/getter for property " + this.f۱۲۹۲۷c + " with value type " + this.f۱۲۹۳۱g);
        return returnVal3;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Method m۱۴۲۲۹a(Class targetClass, HashMap<Class, HashMap<String, Method>> propertyMapMap, String prefix, Class valueType) {
        Method setterOrGetter = null;
        try {
            this.f۱۲۹۳۳i.writeLock().lock();
            HashMap<String, Method> propertyMap = propertyMapMap.get(targetClass);
            if (propertyMap != null) {
                setterOrGetter = propertyMap.get(this.f۱۲۹۲۷c);
            }
            if (setterOrGetter == null) {
                setterOrGetter = m۱۴۲۲۸a(targetClass, prefix, valueType);
                if (propertyMap == null) {
                    propertyMap = new HashMap<>();
                    propertyMapMap.put(targetClass, propertyMap);
                }
                propertyMap.put(this.f۱۲۹۲۷c, setterOrGetter);
            }
            return setterOrGetter;
        } finally {
            this.f۱۲۹۳۳i.writeLock().unlock();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۴۲۴۵a(Class targetClass) {
        this.f۱۲۹۲۹e = m۱۴۲۲۹a(targetClass, f۱۲۹۲۵r, "set", this.f۱۲۹۳۱g);
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۴۲۳۰b(Class targetClass) {
        this.f۱۲۹۳۰f = m۱۴۲۲۹a(targetClass, f۱۲۹۲۶s, "get", null);
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۴۲۴۰b(Object target) {
        AbstractCc abstractCc = this.f۱۲۹۲۸d;
        if (abstractCc != null) {
            try {
                abstractCc.mo۱۶۳۸۷a(target);
                Iterator i$ = this.f۱۲۹۳۲h.f۱۲۹۰۰d.iterator();
                while (i$.hasNext()) {
                    AbstractCg kf = i$.next();
                    if (!kf.m۱۴۱۶۴d()) {
                        kf.mo۱۴۱۶۶a(this.f۱۲۹۲۸d.mo۱۶۳۸۷a(target));
                    }
                }
                return;
            } catch (ClassCastException e2) {
                Log.e("PropertyValuesHolder", "No such property (" + this.f۱۲۹۲۸d.m۱۴۲۸۳a() + ") on target object " + target + ". Trying reflection instead");
                this.f۱۲۹۲۸d = null;
            }
        }
        Class targetClass = target.getClass();
        if (this.f۱۲۹۲۹e == null) {
            mo۱۴۲۴۵a(targetClass);
        }
        Iterator i$2 = this.f۱۲۹۳۲h.f۱۲۹۰۰d.iterator();
        while (i$2.hasNext()) {
            AbstractCg kf2 = i$2.next();
            if (!kf2.m۱۴۱۶۴d()) {
                if (this.f۱۲۹۳۰f == null) {
                    m۱۴۲۳۰b(targetClass);
                }
                try {
                    kf2.mo۱۴۱۶۶a(this.f۱۲۹۳۰f.invoke(target, new Object[0]));
                } catch (IllegalAccessException e3) {
                    Log.e("PropertyValuesHolder", e3.toString());
                } catch (InvocationTargetException e4) {
                    Log.e("PropertyValuesHolder", e4.toString());
                }
            }
        }
    }

    @Override // 
    /* renamed from: clone */
    public Ck mo۱۴۲۴۸clone() {
        try {
            Ck newPVH = (Ck) super.clone();
            newPVH.f۱۲۹۲۷c = this.f۱۲۹۲۷c;
            newPVH.f۱۲۹۲۸d = this.f۱۲۹۲۸d;
            newPVH.f۱۲۹۳۲h = this.f۱۲۹۳۲h.m۱۴۱۵۵clone();
            newPVH.f۱۲۹۳۵k = this.f۱۲۹۳۵k;
            return newPVH;
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۴۲۴۶a(Object target) {
        AbstractCc abstractCc = this.f۱۲۹۲۸d;
        if (abstractCc != null) {
            abstractCc.mo۱۴۲۸۴a(target, mo۱۴۲۴۳a());
        }
        if (this.f۱۲۹۲۹e != null) {
            try {
                this.f۱۲۹۳۴j[0] = mo۱۴۲۴۳a();
                this.f۱۲۹۲۹e.invoke(target, this.f۱۲۹۳۴j);
            } catch (IllegalAccessException e2) {
                Log.e("PropertyValuesHolder", e2.toString());
            } catch (InvocationTargetException e3) {
                Log.e("PropertyValuesHolder", e3.toString());
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۴۲۴۱c() {
        if (this.f۱۲۹۳۵k == null) {
            Class cls = this.f۱۲۹۳۱g;
            this.f۱۲۹۳۵k = cls == Integer.class ? f۱۲۹۲۰m : cls == Float.class ? f۱۲۹۲۱n : null;
        }
        InterfaceCl interfaceCl = this.f۱۲۹۳۵k;
        if (interfaceCl != null) {
            this.f۱۲۹۳۲h.m۱۴۱۷۲a(interfaceCl);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۲۳۳a(InterfaceCl evaluator) {
        this.f۱۲۹۳۵k = evaluator;
        this.f۱۲۹۳۲h.m۱۴۱۷۲a(evaluator);
    }

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۴۲۴۴a(float fraction) {
        this.f۱۲۹۳۶l = this.f۱۲۹۳۲h.mo۱۴۱۷۱a(fraction);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۲۳۷a(String propertyName) {
        this.f۱۲۹۲۷c = propertyName;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۲۳۴a(AbstractCc property) {
        this.f۱۲۹۲۸d = property;
    }

    /* renamed from: b, reason: contains not printable characters */
    public String m۱۴۲۳۹b() {
        return this.f۱۲۹۲۷c;
    }

    /* renamed from: a, reason: contains not printable characters */
    Object mo۱۴۲۴۳a() {
        return this.f۱۲۹۳۶l;
    }

    public String toString() {
        return this.f۱۲۹۲۷c + ": " + this.f۱۲۹۳۲h.toString();
    }

    /* renamed from: a, reason: contains not printable characters */
    static String m۱۴۲۲۷a(String prefix, String propertyName) {
        if (propertyName == null || propertyName.length() == 0) {
            return prefix;
        }
        char firstLetter = Character.toUpperCase(propertyName.charAt(0));
        String theRest = propertyName.substring(1);
        return prefix + firstLetter + theRest;
    }

    /* renamed from: b.h.a.k$b */
    static class b extends Ck {

        /* renamed from: t, reason: contains not printable characters */
        private AbstractCa f۱۲۹۳۷t;

        /* renamed from: u, reason: contains not printable characters */
        Ce f۱۲۹۳۸u;

        /* renamed from: v, reason: contains not printable characters */
        float f۱۲۹۳۹v;

        public b(String propertyName, float... values) {
            super(propertyName);
            mo۱۴۲۴۷a(values);
        }

        public b(AbstractCc property, float... values) {
            super(property);
            mo۱۴۲۴۷a(values);
            if (property instanceof AbstractCa) {
                this.f۱۲۹۳۷t = (AbstractCa) this.f۱۲۹۲۸d;
            }
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Ck
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۴۲۴۷a(float... values) {
            super.mo۱۴۲۴۷a(values);
            this.f۱۲۹۳۸u = (Ce) this.f۱۲۹۳۲h;
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Ck
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۴۲۴۴a(float fraction) {
            this.f۱۲۹۳۹v = this.f۱۲۹۳۸u.m۱۴۱۵۴b(fraction);
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Ck
        /* renamed from: a, reason: contains not printable characters */
        Object mo۱۴۲۴۳a() {
            return Float.valueOf(this.f۱۲۹۳۹v);
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Ck
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public b mo۱۴۲۴۸clone() {
            b newPVH = (b) super.mo۱۴۲۴۸clone();
            newPVH.f۱۲۹۳۸u = (Ce) newPVH.f۱۲۹۳۲h;
            return newPVH;
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Ck
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۴۲۴۶a(Object target) {
            AbstractCa abstractCa = this.f۱۲۹۳۷t;
            if (abstractCa != null) {
                abstractCa.mo۱۶۳۸۸a((AbstractCa) target, this.f۱۲۹۳۹v);
                return;
            }
            AbstractCc abstractCc = this.f۱۲۹۲۸d;
            if (abstractCc != null) {
                abstractCc.mo۱۴۲۸۴a(target, Float.valueOf(this.f۱۲۹۳۹v));
                return;
            }
            if (this.f۱۲۹۲۹e != null) {
                try {
                    this.f۱۲۹۳۴j[0] = Float.valueOf(this.f۱۲۹۳۹v);
                    this.f۱۲۹۲۹e.invoke(target, this.f۱۲۹۳۴j);
                } catch (IllegalAccessException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                } catch (InvocationTargetException e3) {
                    Log.e("PropertyValuesHolder", e3.toString());
                }
            }
        }

        @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Ck
        /* renamed from: a, reason: contains not printable characters */
        void mo۱۴۲۴۵a(Class targetClass) {
            if (this.f۱۲۹۲۸d != null) {
                return;
            }
            super.mo۱۴۲۴۵a(targetClass);
        }
    }
}
