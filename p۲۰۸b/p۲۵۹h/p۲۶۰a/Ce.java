package p۲۰۸b.p۲۵۹h.p۲۶۰a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCg;

/* renamed from: b.h.a.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ce extends Ch {

    /* renamed from: f, reason: contains not printable characters */
    private float f۱۲۸۸۹f;

    /* renamed from: g, reason: contains not printable characters */
    private float f۱۲۸۹۰g;

    /* renamed from: h, reason: contains not printable characters */
    private float f۱۲۸۹۱h;

    /* renamed from: i, reason: contains not printable characters */
    private boolean f۱۲۸۹۲i;

    public Ce(AbstractCg.a... keyframes) {
        super(keyframes);
        this.f۱۲۸۹۲i = true;
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Ch
    /* renamed from: a, reason: contains not printable characters */
    public Object mo۱۴۱۷۱a(float fraction) {
        return Float.valueOf(m۱۴۱۵۴b(fraction));
    }

    @Override // p۲۰۸b.p۲۵۹h.p۲۶۰a.Ch
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Ce m۱۴۱۵۵clone() {
        ArrayList<AbstractCg> arrayList = this.f۱۲۹۰۰d;
        int numKeyframes = this.f۱۲۹۰۰d.size();
        AbstractCg.a[] newKeyframes = new AbstractCg.a[numKeyframes];
        for (int i = 0; i < numKeyframes; i++) {
            newKeyframes[i] = (AbstractCg.a) arrayList.get(i).mo۱۴۱۶۸clone();
        }
        Ce newSet = new Ce(newKeyframes);
        return newSet;
    }

    /* renamed from: b, reason: contains not printable characters */
    public float m۱۴۱۵۴b(float fraction) {
        int i = this.f۱۲۸۹۷a;
        if (i == 2) {
            if (this.f۱۲۸۹۲i) {
                this.f۱۲۸۹۲i = false;
                this.f۱۲۸۸۹f = ((AbstractCg.a) this.f۱۲۹۰۰d.get(0)).m۱۴۱۶۹e();
                this.f۱۲۸۹۰g = ((AbstractCg.a) this.f۱۲۹۰۰d.get(1)).m۱۴۱۶۹e();
                this.f۱۲۸۹۱h = this.f۱۲۸۹۰g - this.f۱۲۸۸۹f;
            }
            Interpolator interpolator = this.f۱۲۸۹۹c;
            if (interpolator != null) {
                fraction = interpolator.getInterpolation(fraction);
            }
            InterfaceCl interfaceCl = this.f۱۲۹۰۱e;
            if (interfaceCl == null) {
                return this.f۱۲۸۸۹f + (this.f۱۲۸۹۱h * fraction);
            }
            return ((Number) interfaceCl.evaluate(fraction, Float.valueOf(this.f۱۲۸۸۹f), Float.valueOf(this.f۱۲۸۹۰g))).floatValue();
        }
        if (fraction <= 0.0f) {
            AbstractCg.a prevKeyframe = (AbstractCg.a) this.f۱۲۹۰۰d.get(0);
            AbstractCg.a nextKeyframe = (AbstractCg.a) this.f۱۲۹۰۰d.get(1);
            float prevValue = prevKeyframe.m۱۴۱۶۹e();
            float nextValue = nextKeyframe.m۱۴۱۶۹e();
            float prevFraction = prevKeyframe.m۱۴۱۵۹a();
            float nextFraction = nextKeyframe.m۱۴۱۵۹a();
            Interpolator interpolator2 = nextKeyframe.m۱۴۱۶۲b();
            if (interpolator2 != null) {
                fraction = interpolator2.getInterpolation(fraction);
            }
            float intervalFraction = (fraction - prevFraction) / (nextFraction - prevFraction);
            InterfaceCl interfaceCl2 = this.f۱۲۹۰۱e;
            return interfaceCl2 == null ? ((nextValue - prevValue) * intervalFraction) + prevValue : ((Number) interfaceCl2.evaluate(intervalFraction, Float.valueOf(prevValue), Float.valueOf(nextValue))).floatValue();
        }
        if (fraction >= 1.0f) {
            AbstractCg.a prevKeyframe2 = (AbstractCg.a) this.f۱۲۹۰۰d.get(i - 2);
            AbstractCg.a nextKeyframe2 = (AbstractCg.a) this.f۱۲۹۰۰d.get(this.f۱۲۸۹۷a - 1);
            float prevValue2 = prevKeyframe2.m۱۴۱۶۹e();
            float nextValue2 = nextKeyframe2.m۱۴۱۶۹e();
            float prevFraction2 = prevKeyframe2.m۱۴۱۵۹a();
            float nextFraction2 = nextKeyframe2.m۱۴۱۵۹a();
            Interpolator interpolator3 = nextKeyframe2.m۱۴۱۶۲b();
            if (interpolator3 != null) {
                fraction = interpolator3.getInterpolation(fraction);
            }
            float intervalFraction2 = (fraction - prevFraction2) / (nextFraction2 - prevFraction2);
            InterfaceCl interfaceCl3 = this.f۱۲۹۰۱e;
            return interfaceCl3 == null ? ((nextValue2 - prevValue2) * intervalFraction2) + prevValue2 : ((Number) interfaceCl3.evaluate(intervalFraction2, Float.valueOf(prevValue2), Float.valueOf(nextValue2))).floatValue();
        }
        AbstractCg.a prevKeyframe3 = (AbstractCg.a) this.f۱۲۹۰۰d.get(0);
        int i2 = 1;
        while (true) {
            int i3 = this.f۱۲۸۹۷a;
            if (i2 < i3) {
                AbstractCg.a nextKeyframe3 = (AbstractCg.a) this.f۱۲۹۰۰d.get(i2);
                if (fraction < nextKeyframe3.m۱۴۱۵۹a()) {
                    Interpolator interpolator4 = nextKeyframe3.m۱۴۱۶۲b();
                    if (interpolator4 != null) {
                        fraction = interpolator4.getInterpolation(fraction);
                    }
                    float intervalFraction3 = (fraction - prevKeyframe3.m۱۴۱۵۹a()) / (nextKeyframe3.m۱۴۱۵۹a() - prevKeyframe3.m۱۴۱۵۹a());
                    float prevValue3 = prevKeyframe3.m۱۴۱۶۹e();
                    float nextValue3 = nextKeyframe3.m۱۴۱۶۹e();
                    InterfaceCl interfaceCl4 = this.f۱۲۹۰۱e;
                    return interfaceCl4 == null ? ((nextValue3 - prevValue3) * intervalFraction3) + prevValue3 : ((Number) interfaceCl4.evaluate(intervalFraction3, Float.valueOf(prevValue3), Float.valueOf(nextValue3))).floatValue();
                }
                prevKeyframe3 = nextKeyframe3;
                i2++;
            } else {
                return ((Number) this.f۱۲۹۰۰d.get(i3 - 1).mo۱۴۱۶۷c()).floatValue();
            }
        }
    }
}
