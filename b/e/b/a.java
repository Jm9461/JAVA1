package b.e.b;

import b.h.a.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public abstract class a implements l<Number> {

    /* renamed from: a  reason: collision with root package name */
    protected float f۲۴۷۶a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<AbstractC۰۰۵۰a> f۲۴۷۷b;

    /* renamed from: b.e.b.a$a  reason: collision with other inner class name */
    public interface AbstractC۰۰۵۰a {
        void a(float f2, float f3, float f4, float f5, float f6);
    }

    public abstract Float a(float f2, float f3, float f4, float f5);

    public void a(AbstractC۰۰۵۰a... ls) {
        Collections.addAll(this.f۲۴۷۷b, ls);
    }

    /* renamed from: a */
    public final Float evaluate(float fraction, Number startValue, Number endValue) {
        float t = this.f۲۴۷۶a * fraction;
        float b2 = startValue.floatValue();
        float c2 = endValue.floatValue() - startValue.floatValue();
        float d2 = this.f۲۴۷۶a;
        float result = a(t, b2, c2, d2).floatValue();
        Iterator i$ = this.f۲۴۷۷b.iterator();
        while (i$.hasNext()) {
            i$.next().a(t, result, b2, c2, d2);
        }
        return Float.valueOf(result);
    }
}
