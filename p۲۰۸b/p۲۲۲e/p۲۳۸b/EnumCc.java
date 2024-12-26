package p۲۰۸b.p۲۲۲e.p۲۳۸b;

import p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۳۹d.Ca;
import p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۳۹d.Cb;
import p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۳۹d.Cc;

/* renamed from: b.e.b.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public enum EnumCc {
    BackEaseIn(Ca.class),
    BackEaseOut(Cc.class),
    BackEaseInOut(Cb.class),
    BounceEaseIn(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۰e.Ca.class),
    BounceEaseOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۰e.Cc.class),
    BounceEaseInOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۰e.Cb.class),
    CircEaseIn(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۱f.Ca.class),
    CircEaseOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۱f.Cc.class),
    CircEaseInOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۱f.Cb.class),
    CubicEaseIn(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۲g.Ca.class),
    CubicEaseOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۲g.Cc.class),
    CubicEaseInOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۲g.Cb.class),
    ElasticEaseIn(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۳h.Ca.class),
    ElasticEaseOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۳h.Cb.class),
    ExpoEaseIn(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۴i.Ca.class),
    ExpoEaseOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۴i.Cc.class),
    ExpoEaseInOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۴i.Cb.class),
    QuadEaseIn(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۶k.Ca.class),
    QuadEaseOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۶k.Cc.class),
    QuadEaseInOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۶k.Cb.class),
    QuintEaseIn(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۷l.Ca.class),
    QuintEaseOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۷l.Cc.class),
    QuintEaseInOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۷l.Cb.class),
    SineEaseIn(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۸m.Ca.class),
    SineEaseOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۸m.Cc.class),
    SineEaseInOut(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۸m.Cb.class),
    Linear(p۲۰۸b.p۲۲۲e.p۲۳۸b.p۲۴۵j.Ca.class);


    /* renamed from: c, reason: contains not printable characters */
    private Class f۱۲۸۰۸c;

    EnumCc(Class clazz) {
        this.f۱۲۸۰۸c = clazz;
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCa m۱۴۰۴۳a(float duration) {
        try {
            return (AbstractCa) this.f۱۲۸۰۸c.getConstructor(Float.TYPE).newInstance(Float.valueOf(duration));
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
