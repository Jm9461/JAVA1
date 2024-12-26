package a.b.c.l;

import a.b.g.g.n;
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

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final n<String, i> f۳۵a = new n<>();

    public boolean b(String name) {
        return this.f۳۵a.get(name) != null;
    }

    public i a(String name) {
        if (b(name)) {
            return this.f۳۵a.get(name);
        }
        throw new IllegalArgumentException();
    }

    public void a(String name, i timing) {
        this.f۳۵a.put(name, timing);
    }

    public long a() {
        long duration = 0;
        int count = this.f۳۵a.size();
        for (int i = 0; i < count; i++) {
            i timing = this.f۳۵a.d(i);
            duration = Math.max(duration, timing.a() + timing.b());
        }
        return duration;
    }

    public static h a(Context context, TypedArray attributes, int index) {
        int resourceId;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0) {
            return null;
        }
        return a(context, resourceId);
    }

    public static h a(Context context, int id) {
        try {
            Animator animator = AnimatorInflater.loadAnimator(context, id);
            if (animator instanceof AnimatorSet) {
                return a(((AnimatorSet) animator).getChildAnimations());
            }
            if (animator == null) {
                return null;
            }
            List<Animator> animators = new ArrayList<>();
            animators.add(animator);
            return a(animators);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(id), e2);
            return null;
        }
    }

    private static h a(List<Animator> animators) {
        h spec = new h();
        int count = animators.size();
        for (int i = 0; i < count; i++) {
            a(spec, animators.get(i));
        }
        return spec;
    }

    private static void a(h spec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator anim = (ObjectAnimator) animator;
            spec.a(anim.getPropertyName(), i.a((ValueAnimator) anim));
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
        return this.f۳۵a.equals(((h) o).f۳۵a);
    }

    public int hashCode() {
        return this.f۳۵a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f۳۵a + "}\n";
    }
}
