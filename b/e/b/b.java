package b.e.b;

import b.e.b.a;
import b.h.a.m;

public class b {
    public static m a(c skill, float duration, m animator) {
        a(skill, duration, animator, new a.AbstractC۰۰۵۰a[0]);
        return animator;
    }

    public static m a(c skill, float duration, m animator, a.AbstractC۰۰۵۰a... listeners) {
        a t = skill.a(duration);
        if (listeners != null) {
            t.a(listeners);
        }
        animator.a(t);
        return animator;
    }
}
