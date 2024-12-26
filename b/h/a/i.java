package b.h.a;

import android.view.View;
import b.h.b.c;
import b.h.c.b.a;
import java.util.HashMap;
import java.util.Map;

public final class i extends m {
    private static final Map<String, c> F = new HashMap();
    private Object C;
    private String D;
    private c E;

    static {
        F.put("alpha", j.f۲۵۵۵a);
        F.put("pivotX", j.f۲۵۵۶b);
        F.put("pivotY", j.f۲۵۵۷c);
        F.put("translationX", j.f۲۵۵۸d);
        F.put("translationY", j.f۲۵۵۹e);
        F.put("rotation", j.f۲۵۶۰f);
        F.put("rotationX", j.f۲۵۶۱g);
        F.put("rotationY", j.f۲۵۶۲h);
        F.put("scaleX", j.i);
        F.put("scaleY", j.j);
        F.put("scrollX", j.k);
        F.put("scrollY", j.l);
        F.put("x", j.m);
        F.put("y", j.n);
    }

    public void a(String propertyName) {
        k[] kVarArr = this.s;
        if (kVarArr != null) {
            k valuesHolder = kVarArr[0];
            String oldName = valuesHolder.b();
            valuesHolder.a(propertyName);
            this.t.remove(oldName);
            this.t.put(propertyName, valuesHolder);
        }
        this.D = propertyName;
        this.l = false;
    }

    public void a(c property) {
        k[] kVarArr = this.s;
        if (kVarArr != null) {
            k valuesHolder = kVarArr[0];
            String oldName = valuesHolder.b();
            valuesHolder.a(property);
            this.t.remove(oldName);
            this.t.put(this.D, valuesHolder);
        }
        if (this.E != null) {
            this.D = property.a();
        }
        this.E = property;
        this.l = false;
    }

    public i() {
    }

    private i(Object target, String propertyName) {
        this.C = target;
        a(propertyName);
    }

    private <T> i(T target, c<T, ?> cVar) {
        this.C = target;
        a(cVar);
    }

    public static i a(Object target, String propertyName, float... values) {
        i anim = new i(target, propertyName);
        anim.a(values);
        return anim;
    }

    public static <T> i a(T target, c<T, Float> cVar, float... values) {
        i anim = new i(target, cVar);
        anim.a(values);
        return anim;
    }

    @Override // b.h.a.m
    public void a(float... values) {
        k[] kVarArr = this.s;
        if (kVarArr == null || kVarArr.length == 0) {
            c cVar = this.E;
            if (cVar != null) {
                a(k.a(cVar, values));
                return;
            }
            a(k.a(this.D, values));
            return;
        }
        super.a(values);
    }

    @Override // b.h.a.a, b.h.a.m
    public void b() {
        super.b();
    }

    /* access modifiers changed from: package-private */
    @Override // b.h.a.m
    public void d() {
        if (!this.l) {
            if (this.E == null && a.s && (this.C instanceof View) && F.containsKey(this.D)) {
                a(F.get(this.D));
            }
            int numValues = this.s.length;
            for (int i = 0; i < numValues; i++) {
                this.s[i].b(this.C);
            }
            super.d();
        }
    }

    @Override // b.h.a.a, b.h.a.m, b.h.a.m
    public i a(long duration) {
        super.a(duration);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // b.h.a.m
    public void a(float fraction) {
        super.a(fraction);
        int numValues = this.s.length;
        for (int i = 0; i < numValues; i++) {
            this.s[i].a(this.C);
        }
    }

    @Override // b.h.a.a, b.h.a.a, java.lang.Object, b.h.a.m, b.h.a.m, b.h.a.m
    public i clone() {
        return (i) super.clone();
    }

    @Override // b.h.a.m
    public String toString() {
        String returnVal = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.C;
        if (this.s != null) {
            for (int i = 0; i < this.s.length; i++) {
                returnVal = returnVal + "\n    " + this.s[i].toString();
            }
        }
        return returnVal;
    }
}
