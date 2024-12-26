package p۰۵۲b.p۱۰۳h.p۱۰۴a;

import android.view.animation.Interpolator;
import com.nineoldandroids.animation.Keyframe;
import java.util.ArrayList;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCg;

/* access modifiers changed from: package-private */
/* renamed from: b.h.a.e  reason: invalid class name */
public class Ce extends Ch {

    /* renamed from: f  reason: contains not printable characters */
    private float f۱۲۸۸۹f;

    /* renamed from: g  reason: contains not printable characters */
    private float f۱۲۸۹۰g;

    /* renamed from: h  reason: contains not printable characters */
    private float f۱۲۸۹۱h;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۱۲۸۹۲i = true;

    public Ce(AbstractCg.Ca... keyframes) {
        super(keyframes);
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.Ch
    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۶۲۲۱a(float fraction) {
        return Float.valueOf(m۱۶۲۲۲b(fraction));
    }

    @Override // p۰۵۲b.p۱۰۳h.p۱۰۴a.Ch
    public Ce clone() {
        ArrayList<Keyframe> keyframes = this.f۱۲۹۰۰d;
        int numKeyframes = this.f۱۲۹۰۰d.size();
        AbstractCg.Ca[] newKeyframes = new AbstractCg.Ca[numKeyframes];
        for (int i = 0; i < numKeyframes; i++) {
            newKeyframes[i] = (AbstractCg.Ca) ((AbstractCg) keyframes.get(i)).clone();
        }
        return new Ce(newKeyframes);
    }

    /* renamed from: b  reason: contains not printable characters */
    public float m۱۶۲۲۲b(float fraction) {
        int i = this.f۱۲۸۹۷a;
        if (i == 2) {
            if (this.f۱۲۸۹۲i) {
                this.f۱۲۸۹۲i = false;
                this.f۱۲۸۸۹f = ((AbstractCg.Ca) this.f۱۲۹۰۰d.get(0)).m۱۶۲۳۴e();
                this.f۱۲۸۹۰g = ((AbstractCg.Ca) this.f۱۲۹۰۰d.get(1)).m۱۶۲۳۴e();
                this.f۱۲۸۹۱h = this.f۱۲۸۹۰g - this.f۱۲۸۸۹f;
            }
            Interpolator interpolator = this.f۱۲۸۹۹c;
            if (interpolator != null) {
                fraction = interpolator.getInterpolation(fraction);
            }
            AbstractCl lVar = this.f۱۲۹۰۱e;
            if (lVar == null) {
                return this.f۱۲۸۸۹f + (this.f۱۲۸۹۱h * fraction);
            }
            return ((Number) lVar.evaluate(fraction, Float.valueOf(this.f۱۲۸۸۹f), Float.valueOf(this.f۱۲۸۹۰g))).floatValue();
        } else if (fraction <= 0.0f) {
            AbstractCg.Ca prevKeyframe = (AbstractCg.Ca) this.f۱۲۹۰۰d.get(0);
            AbstractCg.Ca nextKeyframe = (AbstractCg.Ca) this.f۱۲۹۰۰d.get(1);
            float prevValue = prevKeyframe.m۱۶۲۳۴e();
            float nextValue = nextKeyframe.m۱۶۲۳۴e();
            float prevFraction = prevKeyframe.m۱۶۲۲۶a();
            float nextFraction = nextKeyframe.m۱۶۲۲۶a();
            Interpolator interpolator2 = nextKeyframe.m۱۶۲۲۹b();
            if (interpolator2 != null) {
                fraction = interpolator2.getInterpolation(fraction);
            }
            float intervalFraction = (fraction - prevFraction) / (nextFraction - prevFraction);
            AbstractCl lVar2 = this.f۱۲۹۰۱e;
            return lVar2 == null ? ((nextValue - prevValue) * intervalFraction) + prevValue : ((Number) lVar2.evaluate(intervalFraction, Float.valueOf(prevValue), Float.valueOf(nextValue))).floatValue();
        } else if (fraction >= 1.0f) {
            AbstractCg.Ca prevKeyframe2 = (AbstractCg.Ca) this.f۱۲۹۰۰d.get(i - 2);
            AbstractCg.Ca nextKeyframe2 = (AbstractCg.Ca) this.f۱۲۹۰۰d.get(this.f۱۲۸۹۷a - 1);
            float prevValue2 = prevKeyframe2.m۱۶۲۳۴e();
            float nextValue2 = nextKeyframe2.m۱۶۲۳۴e();
            float prevFraction2 = prevKeyframe2.m۱۶۲۲۶a();
            float nextFraction2 = nextKeyframe2.m۱۶۲۲۶a();
            Interpolator interpolator3 = nextKeyframe2.m۱۶۲۲۹b();
            if (interpolator3 != null) {
                fraction = interpolator3.getInterpolation(fraction);
            }
            float intervalFraction2 = (fraction - prevFraction2) / (nextFraction2 - prevFraction2);
            AbstractCl lVar3 = this.f۱۲۹۰۱e;
            return lVar3 == null ? ((nextValue2 - prevValue2) * intervalFraction2) + prevValue2 : ((Number) lVar3.evaluate(intervalFraction2, Float.valueOf(prevValue2), Float.valueOf(nextValue2))).floatValue();
        } else {
            AbstractCg.Ca prevKeyframe3 = (AbstractCg.Ca) this.f۱۲۹۰۰d.get(0);
            int i2 = 1;
            while (true) {
                int i3 = this.f۱۲۸۹۷a;
                if (i2 >= i3) {
                    return ((Number) this.f۱۲۹۰۰d.get(i3 - 1).m۱۶۲۳۰c()).floatValue();
                }
                AbstractCg.Ca nextKeyframe3 = (AbstractCg.Ca) this.f۱۲۹۰۰d.get(i2);
                if (fraction < nextKeyframe3.m۱۶۲۲۶a()) {
                    Interpolator interpolator4 = nextKeyframe3.m۱۶۲۲۹b();
                    if (interpolator4 != null) {
                        fraction = interpolator4.getInterpolation(fraction);
                    }
                    float intervalFraction3 = (fraction - prevKeyframe3.m۱۶۲۲۶a()) / (nextKeyframe3.m۱۶۲۲۶a() - prevKeyframe3.m۱۶۲۲۶a());
                    float prevValue3 = prevKeyframe3.m۱۶۲۳۴e();
                    float nextValue3 = nextKeyframe3.m۱۶۲۳۴e();
                    AbstractCl lVar4 = this.f۱۲۹۰۱e;
                    return lVar4 == null ? ((nextValue3 - prevValue3) * intervalFraction3) + prevValue3 : ((Number) lVar4.evaluate(intervalFraction3, Float.valueOf(prevValue3), Float.valueOf(nextValue3))).floatValue();
                }
                prevKeyframe3 = nextKeyframe3;
                i2++;
            }
        }
    }
}
