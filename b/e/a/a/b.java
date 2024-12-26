package b.e.a.a;

import b.e.a.a.d.c;
import b.e.a.a.d.d;
import b.e.a.a.d.e;
import b.e.a.a.d.f;
import b.e.a.a.d.g;
import b.e.a.a.d.h;
import b.e.a.a.d.i;
import b.e.a.a.d.j;
import b.e.a.a.l.d.a;

public enum b {
    DropOut(a.class),
    Landing(b.e.a.a.l.d.b.class),
    TakingOff(b.e.a.a.l.e.a.class),
    Flash(b.e.a.a.d.b.class),
    Pulse(c.class),
    RubberBand(d.class),
    Shake(e.class),
    Swing(g.class),
    Wobble(j.class),
    Bounce(b.e.a.a.d.a.class),
    Tada(h.class),
    StandUp(f.class),
    Wave(i.class),
    Hinge(b.e.a.a.l.a.class),
    RollIn(b.e.a.a.l.b.class),
    RollOut(b.e.a.a.l.c.class),
    BounceIn(b.e.a.a.e.a.class),
    BounceInDown(b.e.a.a.e.b.class),
    BounceInLeft(b.e.a.a.e.c.class),
    BounceInRight(b.e.a.a.e.d.class),
    BounceInUp(b.e.a.a.e.e.class),
    FadeIn(b.e.a.a.f.a.class),
    FadeInUp(b.e.a.a.f.e.class),
    FadeInDown(b.e.a.a.f.b.class),
    FadeInLeft(b.e.a.a.f.c.class),
    FadeInRight(b.e.a.a.f.d.class),
    FadeOut(b.e.a.a.g.a.class),
    FadeOutDown(b.e.a.a.g.b.class),
    FadeOutLeft(b.e.a.a.g.c.class),
    FadeOutRight(b.e.a.a.g.d.class),
    FadeOutUp(b.e.a.a.g.e.class),
    FlipInX(b.e.a.a.h.a.class),
    FlipOutX(b.e.a.a.h.b.class),
    FlipOutY(b.e.a.a.h.c.class),
    RotateIn(b.e.a.a.i.a.class),
    RotateInDownLeft(b.e.a.a.i.b.class),
    RotateInDownRight(b.e.a.a.i.c.class),
    RotateInUpLeft(b.e.a.a.i.d.class),
    RotateInUpRight(b.e.a.a.i.e.class),
    RotateOut(b.e.a.a.j.a.class),
    RotateOutDownLeft(b.e.a.a.j.b.class),
    RotateOutDownRight(b.e.a.a.j.c.class),
    RotateOutUpLeft(b.e.a.a.j.d.class),
    RotateOutUpRight(b.e.a.a.j.e.class),
    SlideInLeft(b.e.a.a.k.b.class),
    SlideInRight(b.e.a.a.k.c.class),
    SlideInUp(b.e.a.a.k.d.class),
    SlideInDown(b.e.a.a.k.a.class),
    SlideOutLeft(b.e.a.a.k.f.class),
    SlideOutRight(b.e.a.a.k.g.class),
    SlideOutUp(b.e.a.a.k.h.class),
    SlideOutDown(b.e.a.a.k.e.class),
    ZoomIn(b.e.a.a.m.a.class),
    ZoomInDown(b.e.a.a.m.b.class),
    ZoomInLeft(b.e.a.a.m.c.class),
    ZoomInRight(b.e.a.a.m.d.class),
    ZoomInUp(b.e.a.a.m.e.class),
    ZoomOut(b.e.a.a.n.a.class),
    ZoomOutDown(b.e.a.a.n.b.class),
    ZoomOutLeft(b.e.a.a.n.c.class),
    ZoomOutRight(b.e.a.a.n.d.class),
    ZoomOutUp(b.e.a.a.n.e.class);
    

    /* renamed from: c  reason: collision with root package name */
    private Class f۲۴۶۳c;

    private b(Class clazz) {
        this.f۲۴۶۳c = clazz;
    }

    public a a() {
        try {
            return (a) this.f۲۴۶۳c.newInstance();
        } catch (Exception e2) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
