package p۰۵۲b.p۰۶۶e.p۰۸۲b;

import p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۳d.Ca;
import p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۳d.Cb;
import p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۳d.Cc;

/* renamed from: b.e.b.c  reason: invalid class name */
public enum EnumCc {
    BackEaseIn(Ca.class),
    BackEaseOut(Cc.class),
    BackEaseInOut(Cb.class),
    BounceEaseIn(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۴e.Ca.class),
    BounceEaseOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۴e.Cc.class),
    BounceEaseInOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۴e.Cb.class),
    CircEaseIn(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۵f.Ca.class),
    CircEaseOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۵f.Cc.class),
    CircEaseInOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۵f.Cb.class),
    CubicEaseIn(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۶g.Ca.class),
    CubicEaseOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۶g.Cc.class),
    CubicEaseInOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۶g.Cb.class),
    ElasticEaseIn(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۷h.Ca.class),
    ElasticEaseOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۷h.Cb.class),
    ExpoEaseIn(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۸i.Ca.class),
    ExpoEaseOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۸i.Cc.class),
    ExpoEaseInOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۸i.Cb.class),
    QuadEaseIn(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۹۰k.Ca.class),
    QuadEaseOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۹۰k.Cc.class),
    QuadEaseInOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۹۰k.Cb.class),
    QuintEaseIn(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۹۱l.Ca.class),
    QuintEaseOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۹۱l.Cc.class),
    QuintEaseInOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۹۱l.Cb.class),
    SineEaseIn(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۹۲m.Ca.class),
    SineEaseOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۹۲m.Cc.class),
    SineEaseInOut(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۹۲m.Cb.class),
    Linear(p۰۵۲b.p۰۶۶e.p۰۸۲b.p۰۸۹j.Ca.class);
    

    /* renamed from: c  reason: contains not printable characters */
    private Class f۱۲۸۰۸c;

    private EnumCc(Class clazz) {
        this.f۱۲۸۰۸c = clazz;
    }

    /* renamed from: a  reason: contains not printable characters */
    public AbstractCa m۱۶۱۱۴a(float duration) {
        try {
            return (AbstractCa) this.f۱۲۸۰۸c.getConstructor(Float.TYPE).newInstance(Float.valueOf(duration));
        } catch (Exception e) {
            e.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
