package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cn;

/* renamed from: a.b.c.l.h  reason: invalid class name */
public class Ch {

    /* renamed from: a  reason: contains not printable characters */
    private final Cn<String, Ci> f۸۲۶۴a = new Cn<>();

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۹۹۶۲b(String name) {
        return this.f۸۲۶۴a.get(name) != null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ci m۹۹۶۰a(String name) {
        if (m۹۹۶۲b(name)) {
            return this.f۸۲۶۴a.get(name);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۹۹۶۱a(String name, Ci timing) {
        this.f۸۲۶۴a.put(name, timing);
    }

    /* renamed from: a  reason: contains not printable characters */
    public long m۹۹۵۹a() {
        long duration = 0;
        int count = this.f۸۲۶۴a.size();
        for (int i = 0; i < count; i++) {
            Ci timing = this.f۸۲۶۴a.m۱۰۶۵۶d(i);
            duration = Math.max(duration, timing.m۹۹۶۵a() + timing.m۹۹۶۷b());
        }
        return duration;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ch m۹۹۵۶a(Context context, TypedArray attributes, int index) {
        int resourceId;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0) {
            return null;
        }
        return m۹۹۵۵a(context, resourceId);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ch m۹۹۵۵a(Context context, int id) {
        try {
            Animator animator = AnimatorInflater.loadAnimator(context, id);
            if (animator instanceof AnimatorSet) {
                return m۹۹۵۷a(((AnimatorSet) animator).getChildAnimations());
            }
            if (animator == null) {
                return null;
            }
            List<Animator> animators = new ArrayList<>();
            animators.add(animator);
            return m۹۹۵۷a(animators);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(id), e);
            return null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Ch m۹۹۵۷a(List<Animator> animators) {
        Ch spec = new Ch();
        int count = animators.size();
        for (int i = 0; i < count; i++) {
            m۹۹۵۸a(spec, animators.get(i));
        }
        return spec;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۹۹۵۸a(Ch spec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator anim = (ObjectAnimator) animator;
            spec.m۹۹۶۱a(anim.getPropertyName(), Ci.m۹۹۶۳a((ValueAnimator) anim));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return this.f۸۲۶۴a.equals(((Ch) o).f۸۲۶۴a);
    }

    public int hashCode() {
        return this.f۸۲۶۴a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f۸۲۶۴a + "}\n";
    }
}
