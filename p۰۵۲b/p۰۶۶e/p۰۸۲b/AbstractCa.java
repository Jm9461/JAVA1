package p۰۵۲b.p۰۶۶e.p۰۸۲b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCl;

/* renamed from: b.e.b.a  reason: invalid class name */
public abstract class AbstractCa implements AbstractCl<Number> {

    /* renamed from: a  reason: contains not printable characters */
    protected float f۱۲۷۷۸a;

    /* renamed from: b  reason: contains not printable characters */
    private ArrayList<AbstractCa> f۱۲۷۷۹b;

    /* renamed from: b.e.b.a$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۶۱۱۱a(float f, float f2, float f3, float f4, float f5);
    }

    /* renamed from: a  reason: contains not printable characters */
    public abstract Float m۱۶۱۰۸a(float f, float f2, float f3, float f4);

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۱۱۰a(AbstractCa... ls) {
        Collections.addAll(this.f۱۲۷۷۹b, ls);
    }

    /* renamed from: a  reason: contains not printable characters */
    public final Float evaluate(float fraction, Number startValue, Number endValue) {
        float t = this.f۱۲۷۷۸a * fraction;
        float b = startValue.floatValue();
        float c = endValue.floatValue() - startValue.floatValue();
        float d = this.f۱۲۷۷۸a;
        float result = m۱۶۱۰۸a(t, b, c, d).floatValue();
        Iterator i$ = this.f۱۲۷۷۹b.iterator();
        while (i$.hasNext()) {
            i$.next().m۱۶۱۱۱a(t, result, b, c, d);
        }
        return Float.valueOf(result);
    }
}
