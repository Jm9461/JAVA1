package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۶۸l;

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
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cn;

/* renamed from: a.b.c.l.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ch {

    /* renamed from: a, reason: contains not printable characters */
    private final Cn<String, Ci> f۸۲۶۴a = new Cn<>();

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۷۸۹۵b(String name) {
        return this.f۸۲۶۴a.get(name) != null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ci m۷۸۹۳a(String name) {
        if (!m۷۸۹۵b(name)) {
            throw new IllegalArgumentException();
        }
        return this.f۸۲۶۴a.get(name);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۷۸۹۴a(String name, Ci timing) {
        this.f۸۲۶۴a.put(name, timing);
    }

    /* renamed from: a, reason: contains not printable characters */
    public long m۷۸۹۲a() {
        long duration = 0;
        int count = this.f۸۲۶۴a.size();
        for (int i = 0; i < count; i++) {
            Ci timing = this.f۸۲۶۴a.m۸۵۸۶d(i);
            duration = Math.max(duration, timing.m۷۸۹۸a() + timing.m۷۹۰۰b());
        }
        return duration;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Ch m۷۸۸۹a(Context context, TypedArray attributes, int index) {
        int resourceId;
        if (attributes.hasValue(index) && (resourceId = attributes.getResourceId(index, 0)) != 0) {
            return m۷۸۸۸a(context, resourceId);
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Ch m۷۸۸۸a(Context context, int id) {
        try {
            Animator animator = AnimatorInflater.loadAnimator(context, id);
            if (animator instanceof AnimatorSet) {
                AnimatorSet set = (AnimatorSet) animator;
                return m۷۸۹۰a(set.getChildAnimations());
            }
            if (animator == null) {
                return null;
            }
            List<Animator> animators = new ArrayList<>();
            animators.add(animator);
            return m۷۸۹۰a(animators);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(id), e2);
            return null;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Ch m۷۸۹۰a(List<Animator> animators) {
        Ch spec = new Ch();
        int count = animators.size();
        for (int i = 0; i < count; i++) {
            m۷۸۹۱a(spec, animators.get(i));
        }
        return spec;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۷۸۹۱a(Ch spec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator anim = (ObjectAnimator) animator;
            spec.m۷۸۹۴a(anim.getPropertyName(), Ci.m۷۸۹۶a((ValueAnimator) anim));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ch that = (Ch) o;
        return this.f۸۲۶۴a.equals(that.f۸۲۶۴a);
    }

    public int hashCode() {
        return this.f۸۲۶۴a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f۸۲۶۴a + "}\n";
    }
}
