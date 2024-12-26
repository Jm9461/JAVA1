package p۲۰۸b.p۲۲۲e.p۲۳۸b;

import p۲۰۸b.p۲۲۲e.p۲۳۸b.AbstractCa;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.Cm;

/* renamed from: b.e.b.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb {
    /* renamed from: a, reason: contains not printable characters */
    public static Cm m۱۴۰۴۱a(EnumCc skill, float duration, Cm animator) {
        m۱۴۰۴۲a(skill, duration, animator, new AbstractCa.a[0]);
        return animator;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cm m۱۴۰۴۲a(EnumCc skill, float duration, Cm animator, AbstractCa.a... listeners) {
        AbstractCa t = skill.m۱۴۰۴۳a(duration);
        if (listeners != null) {
            t.m۱۴۰۳۹a(listeners);
        }
        animator.m۱۴۲۶۹a(t);
        return animator;
    }
}
