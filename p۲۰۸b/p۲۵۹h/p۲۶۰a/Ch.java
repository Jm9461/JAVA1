package p۲۰۸b.p۲۵۹h.p۲۶۰a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.AbstractCg;

/* renamed from: b.h.a.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ch {

    /* renamed from: a, reason: contains not printable characters */
    int f۱۲۸۹۷a;

    /* renamed from: b, reason: contains not printable characters */
    AbstractCg f۱۲۸۹۸b;

    /* renamed from: c, reason: contains not printable characters */
    Interpolator f۱۲۸۹۹c;

    /* renamed from: d, reason: contains not printable characters */
    ArrayList<AbstractCg> f۱۲۹۰۰d = new ArrayList<>();

    /* renamed from: e, reason: contains not printable characters */
    InterfaceCl f۱۲۹۰۱e;

    /* renamed from: a, reason: contains not printable characters */
    public Object mo۱۴۱۷۱a(float f2) {
        throw null;
    }

    /* renamed from: clone */
    public Ch m۱۴۱۵۵clone() {
        throw null;
    }

    public Ch(AbstractCg... keyframes) {
        this.f۱۲۸۹۷a = keyframes.length;
        this.f۱۲۹۰۰d.addAll(Arrays.asList(keyframes));
        this.f۱۲۹۰۰d.get(0);
        this.f۱۲۸۹۸b = this.f۱۲۹۰۰d.get(this.f۱۲۸۹۷a - 1);
        this.f۱۲۸۹۹c = this.f۱۲۸۹۸b.m۱۴۱۶۲b();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Ch m۱۴۱۷۰a(float... values) {
        int numKeyframes = values.length;
        AbstractCg.a[] keyframes = new AbstractCg.a[Math.max(numKeyframes, 2)];
        if (numKeyframes != 1) {
            keyframes[0] = (AbstractCg.a) AbstractCg.m۱۴۱۵۸a(0.0f, values[0]);
            for (int i = 1; i < numKeyframes; i++) {
                keyframes[i] = (AbstractCg.a) AbstractCg.m۱۴۱۵۸a(i / (numKeyframes - 1), values[i]);
            }
        } else {
            keyframes[0] = (AbstractCg.a) AbstractCg.m۱۴۱۵۷a(0.0f);
            keyframes[1] = (AbstractCg.a) AbstractCg.m۱۴۱۵۸a(1.0f, values[0]);
        }
        return new Ce(keyframes);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۴۱۷۲a(InterfaceCl evaluator) {
        this.f۱۲۹۰۱e = evaluator;
    }

    public String toString() {
        String returnVal = " ";
        for (int i = 0; i < this.f۱۲۸۹۷a; i++) {
            returnVal = returnVal + this.f۱۲۹۰۰d.get(i).mo۱۴۱۶۷c() + "  ";
        }
        return returnVal;
    }
}
