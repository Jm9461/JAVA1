package p۲۰۸b.p۲۵۹h.p۲۶۰a;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p۲۰۸b.p۲۵۹h.p۲۶۱b.AbstractCc;
import p۲۰۸b.p۲۵۹h.p۲۶۲c.p۲۶۳b.Ca;

/* renamed from: b.h.a.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ci extends Cm {

    /* renamed from: F, reason: contains not printable characters */
    private static final Map<String, AbstractCc> f۱۲۹۰۲F = new HashMap();

    /* renamed from: C, reason: contains not printable characters */
    private Object f۱۲۹۰۳C;

    /* renamed from: D, reason: contains not printable characters */
    private String f۱۲۹۰۴D;

    /* renamed from: E, reason: contains not printable characters */
    private AbstractCc f۱۲۹۰۵E;

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Cm, p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ AbstractCa mo۱۴۲۶۶a(long x0) {
        mo۱۴۲۶۶a(x0);
        return this;
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Cm, p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Cm mo۱۴۲۶۶a(long x0) {
        mo۱۴۲۶۶a(x0);
        return this;
    }

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

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۱۸۰a(String propertyName) {
        Ck[] ckArr = this.f۱۲۹۶۳s;
        if (ckArr != null) {
            Ck valuesHolder = ckArr[0];
            String oldName = valuesHolder.m۱۴۲۳۹b();
            valuesHolder.m۱۴۲۳۷a(propertyName);
            this.f۱۲۹۶۴t.remove(oldName);
            this.f۱۲۹۶۴t.put(propertyName, valuesHolder);
        }
        this.f۱۲۹۰۴D = propertyName;
        this.f۱۲۹۵۶l = false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۱۷۹a(AbstractCc property) {
        Ck[] ckArr = this.f۱۲۹۶۳s;
        if (ckArr != null) {
            Ck valuesHolder = ckArr[0];
            String oldName = valuesHolder.m۱۴۲۳۹b();
            valuesHolder.m۱۴۲۳۴a(property);
            this.f۱۲۹۶۴t.remove(oldName);
            this.f۱۲۹۶۴t.put(this.f۱۲۹۰۴D, valuesHolder);
        }
        if (this.f۱۲۹۰۵E != null) {
            this.f۱۲۹۰۴D = property.m۱۴۲۸۳a();
        }
        this.f۱۲۹۰۵E = property;
        this.f۱۲۹۵۶l = false;
    }

    public Ci() {
    }

    private Ci(Object target, String propertyName) {
        this.f۱۲۹۰۳C = target;
        m۱۴۱۸۰a(propertyName);
    }

    /* JADX WARN: Generic types in debug info not equals: b.h.b.c != com.nineoldandroids.util.Property<T, ?> */
    private <T> Ci(T target, AbstractCc<T, ?> abstractCc) {
        this.f۱۲۹۰۳C = target;
        m۱۴۱۷۹a(abstractCc);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Ci m۱۴۱۷۴a(Object target, String propertyName, float... values) {
        Ci anim = new Ci(target, propertyName);
        anim.mo۱۴۲۷۰a(values);
        return anim;
    }

    /* JADX WARN: Generic types in debug info not equals: b.h.b.c != com.nineoldandroids.util.Property<T, java.lang.Float> */
    /* renamed from: a, reason: contains not printable characters */
    public static <T> Ci m۱۴۱۷۳a(T target, AbstractCc<T, Float> abstractCc, float... values) {
        Ci anim = new Ci(target, abstractCc);
        anim.mo۱۴۲۷۰a(values);
        return anim;
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Cm
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۲۷۰a(float... values) {
        Ck[] ckArr = this.f۱۲۹۶۳s;
        if (ckArr == null || ckArr.length == 0) {
            AbstractCc abstractCc = this.f۱۲۹۰۵E;
            if (abstractCc != null) {
                m۱۴۲۷۱a(Ck.m۱۴۲۲۵a((AbstractCc<?, Float>) abstractCc, values));
                return;
            } else {
                m۱۴۲۷۱a(Ck.m۱۴۲۲۶a(this.f۱۲۹۰۴D, values));
                return;
            }
        }
        super.mo۱۴۲۷۰a(values);
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Cm, p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۴۲۷۲b() {
        super.mo۱۴۲۷۲b();
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Cm
    /* renamed from: d, reason: contains not printable characters */
    void mo۱۴۲۷۷d() {
        if (!this.f۱۲۹۵۶l) {
            if (this.f۱۲۹۰۵E == null && Ca.f۱۲۹۶۶s && (this.f۱۲۹۰۳C instanceof View) && f۱۲۹۰۲F.containsKey(this.f۱۲۹۰۴D)) {
                m۱۴۱۷۹a(f۱۲۹۰۲F.get(this.f۱۲۹۰۴D));
            }
            int numValues = this.f۱۲۹۶۳s.length;
            for (int i = 0; i < numValues; i++) {
                this.f۱۲۹۶۳s[i].m۱۴۲۴۰b(this.f۱۲۹۰۳C);
            }
            super.mo۱۴۲۷۷d();
        }
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Cm, p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public Ci mo۱۴۲۶۶a(long duration) {
        super.mo۱۴۲۶۶a(duration);
        return this;
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Cm
    /* renamed from: a, reason: contains not printable characters */
    void mo۱۴۲۶۷a(float fraction) {
        super.mo۱۴۲۶۷a(fraction);
        int numValues = this.f۱۲۹۶۳s.length;
        for (int i = 0; i < numValues; i++) {
            this.f۱۲۹۶۳s[i].mo۱۴۲۴۶a(this.f۱۲۹۰۳C);
        }
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Cm, p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCa
    /* renamed from: clone */
    public Ci mo۱۴۲۷۶clone() {
        Ci anim = (Ci) super.mo۱۴۲۷۶clone();
        return anim;
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Cm
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
