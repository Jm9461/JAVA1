package b.h.a;

import android.view.animation.Interpolator;
import b.h.a.g;
import com.nineoldandroids.animation.Keyframe;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class e extends h {

    /* renamed from: f  reason: collision with root package name */
    private float f۲۵۴۳f;

    /* renamed from: g  reason: collision with root package name */
    private float f۲۵۴۴g;

    /* renamed from: h  reason: collision with root package name */
    private float f۲۵۴۵h;
    private boolean i = true;

    public e(g.a... keyframes) {
        super(keyframes);
    }

    @Override // b.h.a.h
    public Object a(float fraction) {
        return Float.valueOf(b(fraction));
    }

    @Override // b.h.a.h
    public e clone() {
        ArrayList<Keyframe> keyframes = this.f۲۵۵۳d;
        int numKeyframes = this.f۲۵۵۳d.size();
        g.a[] newKeyframes = new g.a[numKeyframes];
        for (int i2 = 0; i2 < numKeyframes; i2++) {
            newKeyframes[i2] = (g.a) ((g) keyframes.get(i2)).clone();
        }
        return new e(newKeyframes);
    }

    public float b(float fraction) {
        int i2 = this.f۲۵۵۰a;
        if (i2 == 2) {
            if (this.i) {
                this.i = false;
                this.f۲۵۴۳f = ((g.a) this.f۲۵۵۳d.get(0)).e();
                this.f۲۵۴۴g = ((g.a) this.f۲۵۵۳d.get(1)).e();
                this.f۲۵۴۵h = this.f۲۵۴۴g - this.f۲۵۴۳f;
            }
            Interpolator interpolator = this.f۲۵۵۲c;
            if (interpolator != null) {
                fraction = interpolator.getInterpolation(fraction);
            }
            l lVar = this.f۲۵۵۴e;
            if (lVar == null) {
                return this.f۲۵۴۳f + (this.f۲۵۴۵h * fraction);
            }
            return ((Number) lVar.evaluate(fraction, Float.valueOf(this.f۲۵۴۳f), Float.valueOf(this.f۲۵۴۴g))).floatValue();
        } else if (fraction <= 0.0f) {
            g.a prevKeyframe = (g.a) this.f۲۵۵۳d.get(0);
            g.a nextKeyframe = (g.a) this.f۲۵۵۳d.get(1);
            float prevValue = prevKeyframe.e();
            float nextValue = nextKeyframe.e();
            float prevFraction = prevKeyframe.a();
            float nextFraction = nextKeyframe.a();
            Interpolator interpolator2 = nextKeyframe.b();
            if (interpolator2 != null) {
                fraction = interpolator2.getInterpolation(fraction);
            }
            float intervalFraction = (fraction - prevFraction) / (nextFraction - prevFraction);
            l lVar2 = this.f۲۵۵۴e;
            return lVar2 == null ? ((nextValue - prevValue) * intervalFraction) + prevValue : ((Number) lVar2.evaluate(intervalFraction, Float.valueOf(prevValue), Float.valueOf(nextValue))).floatValue();
        } else if (fraction >= 1.0f) {
            g.a prevKeyframe2 = (g.a) this.f۲۵۵۳d.get(i2 - 2);
            g.a nextKeyframe2 = (g.a) this.f۲۵۵۳d.get(this.f۲۵۵۰a - 1);
            float prevValue2 = prevKeyframe2.e();
            float nextValue2 = nextKeyframe2.e();
            float prevFraction2 = prevKeyframe2.a();
            float nextFraction2 = nextKeyframe2.a();
            Interpolator interpolator3 = nextKeyframe2.b();
            if (interpolator3 != null) {
                fraction = interpolator3.getInterpolation(fraction);
            }
            float intervalFraction2 = (fraction - prevFraction2) / (nextFraction2 - prevFraction2);
            l lVar3 = this.f۲۵۵۴e;
            return lVar3 == null ? ((nextValue2 - prevValue2) * intervalFraction2) + prevValue2 : ((Number) lVar3.evaluate(intervalFraction2, Float.valueOf(prevValue2), Float.valueOf(nextValue2))).floatValue();
        } else {
            g.a prevKeyframe3 = (g.a) this.f۲۵۵۳d.get(0);
            int i3 = 1;
            while (true) {
                int i4 = this.f۲۵۵۰a;
                if (i3 >= i4) {
                    return ((Number) this.f۲۵۵۳d.get(i4 - 1).c()).floatValue();
                }
                g.a nextKeyframe3 = (g.a) this.f۲۵۵۳d.get(i3);
                if (fraction < nextKeyframe3.a()) {
                    Interpolator interpolator4 = nextKeyframe3.b();
                    if (interpolator4 != null) {
                        fraction = interpolator4.getInterpolation(fraction);
                    }
                    float intervalFraction3 = (fraction - prevKeyframe3.a()) / (nextKeyframe3.a() - prevKeyframe3.a());
                    float prevValue3 = prevKeyframe3.e();
                    float nextValue3 = nextKeyframe3.e();
                    l lVar4 = this.f۲۵۵۴e;
                    return lVar4 == null ? ((nextValue3 - prevValue3) * intervalFraction3) + prevValue3 : ((Number) lVar4.evaluate(intervalFraction3, Float.valueOf(prevValue3), Float.valueOf(nextValue3))).floatValue();
                }
                prevKeyframe3 = nextKeyframe3;
                i3++;
            }
        }
    }
}
