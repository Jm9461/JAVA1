package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l;

import android.util.Property;
import android.view.ViewGroup;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cf;

/* renamed from: a.b.c.l.d  reason: invalid class name */
public class Cd extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: contains not printable characters */
    public static final Property<ViewGroup, Float> f۸۲۵۷a = new Cd("childrenAlpha");

    private Cd(String name) {
        super(Float.class, name);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Float get(ViewGroup object) {
        Float alpha = (Float) object.getTag(Cf.mtrl_internal_children_alpha_tag);
        if (alpha != null) {
            return alpha;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void set(ViewGroup object, Float value) {
        float alpha = value.floatValue();
        object.setTag(Cf.mtrl_internal_children_alpha_tag, Float.valueOf(alpha));
        int count = object.getChildCount();
        for (int i = 0; i < count; i++) {
            object.getChildAt(i).setAlpha(alpha);
        }
    }
}
