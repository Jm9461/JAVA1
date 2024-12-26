package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۶۸l;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import p۱۵۹a.p۱۶۴b.p۱۶۷c.Cf;

/* renamed from: a.b.c.l.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cd extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: contains not printable characters */
    public static final Property<ViewGroup, Float> f۸۲۵۷a = new Cd("childrenAlpha");

    private Cd(String name) {
        super(Float.class, name);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Float get(ViewGroup object) {
        Float alpha = (Float) object.getTag(Cf.mtrl_internal_children_alpha_tag);
        if (alpha != null) {
            return alpha;
        }
        return Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void set(ViewGroup object, Float value) {
        float alpha = value.floatValue();
        object.setTag(Cf.mtrl_internal_children_alpha_tag, Float.valueOf(alpha));
        int count = object.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = object.getChildAt(i);
            child.setAlpha(alpha);
        }
    }
}
