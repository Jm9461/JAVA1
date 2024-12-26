package b.h.a;

import android.view.animation.Interpolator;
import b.h.a.g;
import java.util.ArrayList;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public class h {

    /* renamed from: a  reason: collision with root package name */
    int f۲۵۵۰a;

    /* renamed from: b  reason: collision with root package name */
    g f۲۵۵۱b;

    /* renamed from: c  reason: collision with root package name */
    Interpolator f۲۵۵۲c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<g> f۲۵۵۳d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    l f۲۵۵۴e;

    public Object a(float f2) {
        throw null;
    }

    public h clone() {
        throw null;
    }

    public h(g... keyframes) {
        this.f۲۵۵۰a = keyframes.length;
        this.f۲۵۵۳d.addAll(Arrays.asList(keyframes));
        this.f۲۵۵۳d.get(0);
        this.f۲۵۵۱b = this.f۲۵۵۳d.get(this.f۲۵۵۰a - 1);
        this.f۲۵۵۲c = this.f۲۵۵۱b.b();
    }

    public static h a(float... values) {
        int numKeyframes = values.length;
        g.a[] keyframes = new g.a[Math.max(numKeyframes, 2)];
        if (numKeyframes == 1) {
            keyframes[0] = (g.a) g.a(0.0f);
            keyframes[1] = (g.a) g.a(1.0f, values[0]);
        } else {
            keyframes[0] = (g.a) g.a(0.0f, values[0]);
            for (int i = 1; i < numKeyframes; i++) {
                keyframes[i] = (g.a) g.a(((float) i) / ((float) (numKeyframes - 1)), values[i]);
            }
        }
        return new e(keyframes);
    }

    public void a(l evaluator) {
        this.f۲۵۵۴e = evaluator;
    }

    public String toString() {
        String returnVal = " ";
        for (int i = 0; i < this.f۲۵۵۰a; i++) {
            returnVal = returnVal + this.f۲۵۵۳d.get(i).c() + "  ";
        }
        return returnVal;
    }
}
