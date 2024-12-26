package p۰۵۲b.p۱۰۳h.p۱۰۴a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.AbstractCg;

/* access modifiers changed from: package-private */
/* renamed from: b.h.a.h  reason: invalid class name */
public class Ch {

    /* renamed from: a  reason: contains not printable characters */
    int f۱۲۸۹۷a;

    /* renamed from: b  reason: contains not printable characters */
    AbstractCg f۱۲۸۹۸b;

    /* renamed from: c  reason: contains not printable characters */
    Interpolator f۱۲۸۹۹c;

    /* renamed from: d  reason: contains not printable characters */
    ArrayList<AbstractCg> f۱۲۹۰۰d = new ArrayList<>();

    /* renamed from: e  reason: contains not printable characters */
    AbstractCl f۱۲۹۰۱e;

    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۶۲۳۶a(float f) {
        throw null;
    }

    public Ch clone() {
        throw null;
    }

    public Ch(AbstractCg... keyframes) {
        this.f۱۲۸۹۷a = keyframes.length;
        this.f۱۲۹۰۰d.addAll(Arrays.asList(keyframes));
        this.f۱۲۹۰۰d.get(0);
        this.f۱۲۸۹۸b = this.f۱۲۹۰۰d.get(this.f۱۲۸۹۷a - 1);
        this.f۱۲۸۹۹c = this.f۱۲۸۹۸b.m۱۶۲۲۹b();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ch m۱۶۲۳۵a(float... values) {
        int numKeyframes = values.length;
        AbstractCg.Ca[] keyframes = new AbstractCg.Ca[Math.max(numKeyframes, 2)];
        if (numKeyframes == 1) {
            keyframes[0] = (AbstractCg.Ca) AbstractCg.m۱۶۲۲۴a(0.0f);
            keyframes[1] = (AbstractCg.Ca) AbstractCg.m۱۶۲۲۵a(1.0f, values[0]);
        } else {
            keyframes[0] = (AbstractCg.Ca) AbstractCg.m۱۶۲۲۵a(0.0f, values[0]);
            for (int i = 1; i < numKeyframes; i++) {
                keyframes[i] = (AbstractCg.Ca) AbstractCg.m۱۶۲۲۵a(((float) i) / ((float) (numKeyframes - 1)), values[i]);
            }
        }
        return new Ce(keyframes);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۲۳۷a(AbstractCl evaluator) {
        this.f۱۲۹۰۱e = evaluator;
    }

    public String toString() {
        String returnVal = " ";
        for (int i = 0; i < this.f۱۲۸۹۷a; i++) {
            returnVal = returnVal + this.f۱۲۹۰۰d.get(i).m۱۶۲۳۰c() + "  ";
        }
        return returnVal;
    }
}
