package p۰۵۲b.p۰۶۶e.p۰۸۲b;

import p۰۵۲b.p۰۶۶e.p۰۸۲b.AbstractCa;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.Cm;

/* renamed from: b.e.b.b  reason: invalid class name */
public class Cb {
    /* renamed from: a  reason: contains not printable characters */
    public static Cm m۱۶۱۱۲a(EnumCc skill, float duration, Cm animator) {
        m۱۶۱۱۳a(skill, duration, animator, new AbstractCa.AbstractCa[0]);
        return animator;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cm m۱۶۱۱۳a(EnumCc skill, float duration, Cm animator, AbstractCa.AbstractCa... listeners) {
        AbstractCa t = skill.m۱۶۱۱۴a(duration);
        if (listeners != null) {
            t.m۱۶۱۱۰a(listeners);
        }
        animator.m۱۶۳۴۳a(t);
        return animator;
    }
}
