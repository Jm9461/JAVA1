package b.e.b;

import b.e.b.d.a;
import b.e.b.d.b;

public enum c {
    BackEaseIn(a.class),
    BackEaseOut(b.e.b.d.c.class),
    BackEaseInOut(b.class),
    BounceEaseIn(b.e.b.e.a.class),
    BounceEaseOut(b.e.b.e.c.class),
    BounceEaseInOut(b.e.b.e.b.class),
    CircEaseIn(b.e.b.f.a.class),
    CircEaseOut(b.e.b.f.c.class),
    CircEaseInOut(b.e.b.f.b.class),
    CubicEaseIn(b.e.b.g.a.class),
    CubicEaseOut(b.e.b.g.c.class),
    CubicEaseInOut(b.e.b.g.b.class),
    ElasticEaseIn(b.e.b.h.a.class),
    ElasticEaseOut(b.e.b.h.b.class),
    ExpoEaseIn(b.e.b.i.a.class),
    ExpoEaseOut(b.e.b.i.c.class),
    ExpoEaseInOut(b.e.b.i.b.class),
    QuadEaseIn(b.e.b.k.a.class),
    QuadEaseOut(b.e.b.k.c.class),
    QuadEaseInOut(b.e.b.k.b.class),
    QuintEaseIn(b.e.b.l.a.class),
    QuintEaseOut(b.e.b.l.c.class),
    QuintEaseInOut(b.e.b.l.b.class),
    SineEaseIn(b.e.b.m.a.class),
    SineEaseOut(b.e.b.m.c.class),
    SineEaseInOut(b.e.b.m.b.class),
    Linear(b.e.b.j.a.class);
    

    /* renamed from: c  reason: collision with root package name */
    private Class f۲۴۸۳c;

    private c(Class clazz) {
        this.f۲۴۸۳c = clazz;
    }

    public a a(float duration) {
        try {
            return (a) this.f۲۴۸۳c.getConstructor(Float.TYPE).newInstance(Float.valueOf(duration));
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
