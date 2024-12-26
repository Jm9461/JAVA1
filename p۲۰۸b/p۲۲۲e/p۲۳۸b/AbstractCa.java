package p۲۰۸b.p۲۲۲e.p۲۳۸b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.InterfaceCl;

/* renamed from: b.e.b.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCa implements InterfaceCl<Number> {

    /* renamed from: a, reason: contains not printable characters */
    protected float f۱۲۷۷۸a;

    /* renamed from: b, reason: contains not printable characters */
    private ArrayList<a> f۱۲۷۷۹b;

    /* renamed from: b.e.b.a$a */
    public interface a {
        /* renamed from: a, reason: contains not printable characters */
        void m۱۴۰۴۰a(float f2, float f3, float f4, float f5, float f6);
    }

    /* renamed from: a, reason: contains not printable characters */
    public abstract Float mo۱۴۰۷۰a(float f2, float f3, float f4, float f5);

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۰۳۹a(a... ls) {
        Collections.addAll(this.f۱۲۷۷۹b, ls);
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.InterfaceCl
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final Float evaluate(float fraction, Number startValue, Number endValue) {
        float t = this.f۱۲۷۷۸a * fraction;
        float b2 = startValue.floatValue();
        float c2 = endValue.floatValue() - startValue.floatValue();
        float d2 = this.f۱۲۷۷۸a;
        float result = mo۱۴۰۷۰a(t, b2, c2, d2).floatValue();
        Iterator i$ = this.f۱۲۷۷۹b.iterator();
        while (i$.hasNext()) {
            a l = i$.next();
            l.m۱۴۰۴۰a(t, result, b2, c2, d2);
        }
        return Float.valueOf(result);
    }
}
