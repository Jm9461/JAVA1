package p۰۵۲b.p۱۰۳h.p۱۰۴a;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p۰۵۲b.p۱۰۳h.p۱۰۵b.AbstractCc;
import p۰۵۲b.p۱۰۳h.p۱۰۶c.p۱۰۷b.Ca;

/* renamed from: b.h.a.i  reason: invalid class name */
public final class Ci extends Cm {

    /* renamed from: F  reason: contains not printable characters */
    private static final Map<String, AbstractCc> f۱۲۹۰۲F = new HashMap();

    /* renamed from: C  reason: contains not printable characters */
    private Object f۱۲۹۰۳C;

    /* renamed from: D  reason: contains not printable characters */
    private String f۱۲۹۰۴D;

    /* renamed from: E  reason: contains not printable characters */
    private AbstractCc f۱۲۹۰۵E;

    static {
        f۱۲۹۰۲F.put("alpha", Cj.f۱۲۹۰۶a);
        f۱۲۹۰۲F.put("pivotX", Cj.f۱۲۹۰۷b);
        f۱۲۹۰۲F.put("pivotY", Cj.f۱۲۹۰۸c);
        f۱۲۹۰۲F.put("translationX", Cj.f۱۲۹۰۹d);
        f۱۲۹۰۲F.put("translationY", Cj.f۱۲۹۱۰e);
        f۱۲۹۰۲F.put("rotation", Cj.f۱۲۹۱۱f);
        f۱۲۹۰۲F.put("rotationX", Cj.f۱۲۹۱۲g);
        f۱۲۹۰۲F.put("rotationY", Cj.f۱۲۹۱۳h);
        f۱۲۹۰۲F.put("scaleX", Cj.f۱۲۹۱۴i);
        f۱۲۹۰۲F.put("scaleY", Cj.f۱۲۹۱۵j);
        f۱۲۹۰۲F.put("scrollX", Cj.f۱۲۹۱۶k);
        f۱۲۹۰۲F.put("scrollY", Cj.f۱۲۹۱۷l);
        f۱۲۹۰۲F.put("x", Cj.f۱۲۹۱۸m);
        f۱۲۹۰۲F.put("y", Cj.f۱۲۹۱۹n);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۲۴۵a(String propertyName) {
        Ck[] kVarArr = this.f۱۲۹۶۳s;
        if (kVarArr != null) {
            Ck valuesHolder = kVarArr[0];
            String oldName = valuesHolder.m۱۶۳۱۵b();
            valuesHolder.m۱۶۳۱۳a(propertyName);
            this.f۱۲۹۶۴t.remove(oldName);
            this.f۱۲۹۶۴t.put(propertyName, valuesHolder);
        }
        this.f۱۲۹۰۴D = propertyName;
        this.f۱۲۹۵۶l = false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۲۴۴a(AbstractCc property) {
        Ck[] kVarArr = this.f۱۲۹۶۳s;
        if (kVarArr != null) {
            Ck valuesHolder = kVarArr[0];
            String oldName = valuesHolder.m۱۶۳۱۵b();
            valuesHolder.m۱۶۳۱۰a(property);
            this.f۱۲۹۶۴t.remove(oldName);
            this.f۱۲۹۶۴t.put(this.f۱۲۹۰۴D, valuesHolder);
        }
        if (this.f۱۲۹۰۵E != null) {
            this.f۱۲۹۰۴D = property.m۱۶۳۵۸a();
        }
        this.f۱۲۹۰۵E = property;
        this.f۱۲۹۵۶l = false;
    }

    public Ci() {
    }

    private Ci(Object target, String propertyName) {
        this.f۱۲۹۰۳C = target;
        m۱۶۲۴۵a(propertyName);
    }

    private <T> Ci(T target, AbstractCc<T, ?> cVar) {
        this.f۱۲۹۰۳C = target;
        m۱۶۲۴۴a(cVar);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ci m۱۶۲۳۹a(Object target, String propertyName, float... values) {
        Ci anim = new Ci(target, propertyName);
        anim.m۱۶۲۴۶a(values);
        return anim;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static <T> Ci m۱۶۲۳۸a(T target, AbstractCc<T, Float> cVar, float... values) {
        Ci anim = new Ci(target, cVar);
        anim.m۱۶۲۴۶a(values);
        return anim;
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.Cm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۲۴۶a(float... values) {
        Ck[] kVarArr = this.f۱۲۹۶۳s;
        if (kVarArr == null || kVarArr.length == 0) {
            AbstractCc cVar = this.f۱۲۹۰۵E;
            if (cVar != null) {
                m۱۶۳۴۵a(Ck.m۱۶۳۰۱a(cVar, values));
                return;
            }
            m۱۶۳۴۵a(Ck.m۱۶۳۰۲a(this.f۱۲۹۰۴D, values));
            return;
        }
        super.m۱۶۳۴۴a(values);
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa, p۰۵۲b.p۱۰۳h.p۱۰۴a.Cm
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۲۴۷b() {
        super.m۱۶۳۴۶b();
    }

    /* access modifiers changed from: package-private */
    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.Cm
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۶۲۴۸d() {
        if (!this.f۱۲۹۵۶l) {
            if (this.f۱۲۹۰۵E == null && Ca.f۱۲۹۶۶s && (this.f۱۲۹۰۳C instanceof View) && f۱۲۹۰۲F.containsKey(this.f۱۲۹۰۴D)) {
                m۱۶۲۴۴a(f۱۲۹۰۲F.get(this.f۱۲۹۰۴D));
            }
            int numValues = this.f۱۲۹۶۳s.length;
            for (int i = 0; i < numValues; i++) {
                this.f۱۲۹۶۳s[i].m۱۶۳۱۶b(this.f۱۲۹۰۳C);
            }
            super.m۱۶۳۵۰d();
        }
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa, p۰۵۲b.p۱۰۳h.p۱۰۴a.Cm, p۰۵۲b.p۱۰۳h.p۱۰۴a.Cm
    /* renamed from: a  reason: contains not printable characters */
    public Ci m۱۶۲۴۱a(long duration) {
        super.m۱۶۳۳۹a(duration);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.Cm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۲۴۳a(float fraction) {
        super.m۱۶۳۴۱a(fraction);
        int numValues = this.f۱۲۹۶۳s.length;
        for (int i = 0; i < numValues; i++) {
            this.f۱۲۹۶۳s[i].m۱۶۳۱۲a(this.f۱۲۹۰۳C);
        }
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa, p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCa, java.lang.Object, p۰۵۲b.p۱۰۳h.p۱۰۴a.Cm, p۰۵۲b.p۱۰۳h.p۱۰۴a.Cm, p۰۵۲b.p۱۰۳h.p۱۰۴a.Cm
    public Ci clone() {
        return (Ci) super.clone();
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.Cm
    public String toString() {
        String returnVal = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.f۱۲۹۰۳C;
        if (this.f۱۲۹۶۳s != null) {
            for (int i = 0; i < this.f۱۲۹۶۳s.length; i++) {
                returnVal = returnVal + "\n    " + this.f۱۲۹۶۳s[i].toString();
            }
        }
        return returnVal;
    }
}
