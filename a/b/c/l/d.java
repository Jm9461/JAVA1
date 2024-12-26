package a.b.c.l;

import a.b.c.f;
import android.util.Property;
import android.view.ViewGroup;

public class d extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final Property<ViewGroup, Float> f۲۸a = new d("childrenAlpha");

    private d(String name) {
        super(Float.class, name);
    }

    /* renamed from: a */
    public Float get(ViewGroup object) {
        Float alpha = (Float) object.getTag(f.mtrl_internal_children_alpha_tag);
        if (alpha != null) {
            return alpha;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: a */
    public void set(ViewGroup object, Float value) {
        float alpha = value.floatValue();
        object.setTag(f.mtrl_internal_children_alpha_tag, Float.valueOf(alpha));
        int count = object.getChildCount();
        for (int i = 0; i < count; i++) {
            object.getChildAt(i).setAlpha(alpha);
        }
    }
}
