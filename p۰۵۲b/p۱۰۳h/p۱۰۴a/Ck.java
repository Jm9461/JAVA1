package p۰۵۲b.p۱۰۳h.p۱۰۴a;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p۰۵۲b.p۱۰۳h.p۱۰۵b.AbstractCa;
import p۰۵۲b.p۱۰۳h.p۱۰۵b.AbstractCc;

/* renamed from: b.h.a.k  reason: invalid class name */
public class Ck implements Cloneable {

    /* renamed from: m  reason: contains not printable characters */
    private static final AbstractCl f۱۲۹۲۰m = new Cf();

    /* renamed from: n  reason: contains not printable characters */
    private static final AbstractCl f۱۲۹۲۱n = new Cd();

    /* renamed from: o  reason: contains not printable characters */
    private static Class[] f۱۲۹۲۲o;

    /* renamed from: p  reason: contains not printable characters */
    private static Class[] f۱۲۹۲۳p;

    /* renamed from: q  reason: contains not printable characters */
    private static Class[] f۱۲۹۲۴q;

    /* renamed from: r  reason: contains not printable characters */
    private static final HashMap<Class, HashMap<String, Method>> f۱۲۹۲۵r = new HashMap<>();

    /* renamed from: s  reason: contains not printable characters */
    private static final HashMap<Class, HashMap<String, Method>> f۱۲۹۲۶s = new HashMap<>();

    /* renamed from: c  reason: contains not printable characters */
    String f۱۲۹۲۷c;

    /* renamed from: d  reason: contains not printable characters */
    protected AbstractCc f۱۲۹۲۸d;

    /* renamed from: e  reason: contains not printable characters */
    Method f۱۲۹۲۹e;

    /* renamed from: f  reason: contains not printable characters */
    private Method f۱۲۹۳۰f;

    /* renamed from: g  reason: contains not printable characters */
    Class f۱۲۹۳۱g;

    /* renamed from: h  reason: contains not printable characters */
    Ch f۱۲۹۳۲h;

    /* renamed from: i  reason: contains not printable characters */
    final ReentrantReadWriteLock f۱۲۹۳۳i;

    /* renamed from: j  reason: contains not printable characters */
    final Object[] f۱۲۹۳۴j;

    /* renamed from: k  reason: contains not printable characters */
    private AbstractCl f۱۲۹۳۵k;

    /* renamed from: l  reason: contains not printable characters */
    private Object f۱۲۹۳۶l;

    static {
        Class cls = Integer.TYPE;
        f۱۲۹۲۲o = new Class[]{Float.TYPE, Float.class, Double.TYPE, cls, Double.class, Integer.class};
        Class cls2 = Double.TYPE;
        f۱۲۹۲۳p = new Class[]{cls, Integer.class, Float.TYPE, cls2, Float.class, Double.class};
        f۱۲۹۲۴q = new Class[]{cls2, Double.class, Float.TYPE, Integer.TYPE, Float.class, Integer.class};
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
            this.f۱۲۹۲۷c = property.m۱۶۳۵۸a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ck m۱۶۳۰۲a(String propertyName, float... values) {
        return new Cb(propertyName, values);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ck m۱۶۳۰۱a(AbstractCc<?, Float> cVar, float... values) {
        return new Cb(cVar, values);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۱۴a(float... values) {
        this.f۱۲۹۳۱g = Float.TYPE;
        this.f۱۲۹۳۲h = Ch.m۱۶۲۳۵a(values);
    }

    /* renamed from: a  reason: contains not printable characters */
    private Method m۱۶۳۰۴a(Class targetClass, String prefix, Class valueType) {
        Class[] typeVariants;
        Method returnVal = null;
        String methodName = m۱۶۳۰۳a(prefix, this.f۱۲۹۲۷c);
        if (valueType == null) {
            try {
                return targetClass.getMethod(methodName, null);
            } catch (NoSuchMethodException e) {
                try {
                    returnVal = targetClass.getDeclaredMethod(methodName, null);
                    returnVal.setAccessible(true);
                    return returnVal;
                } catch (NoSuchMethodException e2) {
                    Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.f۱۲۹۲۷c + ": " + e);
                    return returnVal;
                }
            }
        } else {
            Class[] args = new Class[1];
            if (this.f۱۲۹۳۱g.equals(Float.class)) {
                typeVariants = f۱۲۹۲۲o;
            } else if (this.f۱۲۹۳۱g.equals(Integer.class)) {
                typeVariants = f۱۲۹۲۳p;
            } else if (this.f۱۲۹۳۱g.equals(Double.class)) {
                typeVariants = f۱۲۹۲۴q;
            } else {
                typeVariants = new Class[]{this.f۱۲۹۳۱g};
            }
            Method returnVal2 = null;
            for (Class typeVariant : typeVariants) {
                args[0] = typeVariant;
                try {
                    returnVal2 = targetClass.getMethod(methodName, args);
                    this.f۱۲۹۳۱g = typeVariant;
                    return returnVal2;
                } catch (NoSuchMethodException e3) {
                    try {
                        returnVal2 = targetClass.getDeclaredMethod(methodName, args);
                        returnVal2.setAccessible(true);
                        this.f۱۲۹۳۱g = typeVariant;
                        return returnVal2;
                    } catch (NoSuchMethodException e4) {
                    }
                }
            }
            Log.e("PropertyValuesHolder", "Couldn't find setter/getter for property " + this.f۱۲۹۲۷c + " with value type " + this.f۱۲۹۳۱g);
            return returnVal2;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private Method m۱۶۳۰۵a(Class targetClass, HashMap<Class, HashMap<String, Method>> propertyMapMap, String prefix, Class valueType) {
        Method setterOrGetter = null;
        try {
            this.f۱۲۹۳۳i.writeLock().lock();
            HashMap<String, Method> propertyMap = propertyMapMap.get(targetClass);
            if (propertyMap != null) {
                setterOrGetter = propertyMap.get(this.f۱۲۹۲۷c);
            }
            if (setterOrGetter == null) {
                setterOrGetter = m۱۶۳۰۴a(targetClass, prefix, valueType);
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

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۱۱a(Class targetClass) {
        this.f۱۲۹۲۹e = m۱۶۳۰۵a(targetClass, f۱۲۹۲۵r, "set", this.f۱۲۹۳۱g);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۶۳۰۶b(Class targetClass) {
        this.f۱۲۹۳۰f = m۱۶۳۰۵a(targetClass, f۱۲۹۲۶s, "get", null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۳۱۶b(Object target) {
        AbstractCc cVar = this.f۱۲۹۲۸d;
        if (cVar != null) {
            try {
                cVar.m۱۶۳۵۷a(target);
                Iterator i$ = this.f۱۲۹۳۲h.f۱۲۹۰۰d.iterator();
                while (i$.hasNext()) {
                    AbstractCg kf = i$.next();
                    if (!kf.m۱۶۲۳۱d()) {
                        kf.m۱۶۲۲۸a(this.f۱۲۹۲۸d.m۱۶۳۵۷a(target));
                    }
                }
                return;
            } catch (ClassCastException e) {
                Log.e("PropertyValuesHolder", "No such property (" + this.f۱۲۹۲۸d.m۱۶۳۵۸a() + ") on target object " + target + ". Trying reflection instead");
                this.f۱۲۹۲۸d = null;
            }
        }
        Class targetClass = target.getClass();
        if (this.f۱۲۹۲۹e == null) {
            m۱۶۳۱۱a(targetClass);
        }
        Iterator i$2 = this.f۱۲۹۳۲h.f۱۲۹۰۰d.iterator();
        while (i$2.hasNext()) {
            AbstractCg kf2 = i$2.next();
            if (!kf2.m۱۶۲۳۱d()) {
                if (this.f۱۲۹۳۰f == null) {
                    m۱۶۳۰۶b(targetClass);
                }
                try {
                    kf2.m۱۶۲۲۸a(this.f۱۲۹۳۰f.invoke(target, new Object[0]));
                } catch (InvocationTargetException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                } catch (IllegalAccessException e3) {
                    Log.e("PropertyValuesHolder", e3.toString());
                }
            }
        }
    }

    @Override // java.lang.Object
    public Ck clone() {
        try {
            Ck newPVH = (Ck) super.clone();
            newPVH.f۱۲۹۲۷c = this.f۱۲۹۲۷c;
            newPVH.f۱۲۹۲۸d = this.f۱۲۹۲۸d;
            newPVH.f۱۲۹۳۲h = this.f۱۲۹۳۲h.clone();
            newPVH.f۱۲۹۳۵k = this.f۱۲۹۳۵k;
            return newPVH;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۱۲a(Object target) {
        AbstractCc cVar = this.f۱۲۹۲۸d;
        if (cVar != null) {
            cVar.m۱۶۳۵۹a(target, m۱۶۳۰۷a());
        }
        if (this.f۱۲۹۲۹e != null) {
            try {
                this.f۱۲۹۳۴j[0] = m۱۶۳۰۷a();
                this.f۱۲۹۲۹e.invoke(target, this.f۱۲۹۳۴j);
            } catch (InvocationTargetException e) {
                Log.e("PropertyValuesHolder", e.toString());
            } catch (IllegalAccessException e2) {
                Log.e("PropertyValuesHolder", e2.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۶۳۱۷c() {
        if (this.f۱۲۹۳۵k == null) {
            Class cls = this.f۱۲۹۳۱g;
            this.f۱۲۹۳۵k = cls == Integer.class ? f۱۲۹۲۰m : cls == Float.class ? f۱۲۹۲۱n : null;
        }
        AbstractCl lVar = this.f۱۲۹۳۵k;
        if (lVar != null) {
            this.f۱۲۹۳۲h.m۱۶۲۳۷a(lVar);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۰۹a(AbstractCl evaluator) {
        this.f۱۲۹۳۵k = evaluator;
        this.f۱۲۹۳۲h.m۱۶۲۳۷a(evaluator);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۰۸a(float fraction) {
        this.f۱۲۹۳۶l = this.f۱۲۹۳۲h.m۱۶۲۳۶a(fraction);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۱۳a(String propertyName) {
        this.f۱۲۹۲۷c = propertyName;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۳۱۰a(AbstractCc property) {
        this.f۱۲۹۲۸d = property;
    }

    /* renamed from: b  reason: contains not printable characters */
    public String m۱۶۳۱۵b() {
        return this.f۱۲۹۲۷c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۶۳۰۷a() {
        return this.f۱۲۹۳۶l;
    }

    public String toString() {
        return this.f۱۲۹۲۷c + ": " + this.f۱۲۹۳۲h.toString();
    }

    /* renamed from: a  reason: contains not printable characters */
    static String m۱۶۳۰۳a(String prefix, String propertyName) {
        if (propertyName == null || propertyName.length() == 0) {
            return prefix;
        }
        char firstLetter = Character.toUpperCase(propertyName.charAt(0));
        String theRest = propertyName.substring(1);
        return prefix + firstLetter + theRest;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.h.a.k$b  reason: invalid class name */
    public static class Cb extends Ck {

        /* renamed from: t  reason: contains not printable characters */
        private AbstractCa f۱۲۹۳۷t;

        /* renamed from: u  reason: contains not printable characters */
        Ce f۱۲۹۳۸u;

        /* renamed from: v  reason: contains not printable characters */
        float f۱۲۹۳۹v;

        public Cb(String propertyName, float... values) {
            super(propertyName);
            m۱۶۳۲۲a(values);
        }

        public Cb(AbstractCc property, float... values) {
            super(property);
            m۱۶۳۲۲a(values);
            if (property instanceof AbstractCa) {
                this.f۱۲۹۳۷t = (AbstractCa) this.f۱۲۹۲۸d;
            }
        }

        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.Ck
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۳۲۲a(float... values) {
            Ck.super.m۱۶۳۱۴a(values);
            this.f۱۲۹۳۸u = (Ce) this.f۱۲۹۳۲h;
        }

        /* access modifiers changed from: package-private */
        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.Ck
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۳۱۹a(float fraction) {
            this.f۱۲۹۳۹v = this.f۱۲۹۳۸u.m۱۶۲۲۲b(fraction);
        }

        /* access modifiers changed from: package-private */
        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.Ck
        /* renamed from: a  reason: contains not printable characters */
        public Object m۱۶۳۱۸a() {
            return Float.valueOf(this.f۱۲۹۳۹v);
        }

        @Override // java.lang.Object, p۰۵۲b.p۱۰۳h.p۱۰۴a.Ck, p۰۵۲b.p۱۰۳h.p۱۰۴a.Ck
        public Cb clone() {
            Cb newPVH = (Cb) Ck.super.clone();
            newPVH.f۱۲۹۳۸u = (Ce) newPVH.f۱۲۹۳۲h;
            return newPVH;
        }

        /* access modifiers changed from: package-private */
        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.Ck
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۳۲۱a(Object target) {
            AbstractCa aVar = this.f۱۲۹۳۷t;
            if (aVar != null) {
                aVar.m۱۶۳۵۲a(target, this.f۱۲۹۳۹v);
                return;
            }
            AbstractCc cVar = this.f۱۲۹۲۸d;
            if (cVar != null) {
                cVar.m۱۶۳۵۹a(target, Float.valueOf(this.f۱۲۹۳۹v));
            } else if (this.f۱۲۹۲۹e != null) {
                try {
                    this.f۱۲۹۳۴j[0] = Float.valueOf(this.f۱۲۹۳۹v);
                    this.f۱۲۹۲۹e.invoke(target, this.f۱۲۹۳۴j);
                } catch (InvocationTargetException e) {
                    Log.e("PropertyValuesHolder", e.toString());
                } catch (IllegalAccessException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.Ck
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۶۳۲۰a(Class targetClass) {
            if (this.f۱۲۹۲۸d == null) {
                Ck.super.m۱۶۳۱۱a(targetClass);
            }
        }
    }
}
