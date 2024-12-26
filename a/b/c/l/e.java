package a.b.c.l;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

public class e extends Property<Drawable, Integer> {

    /* renamed from: b  reason: collision with root package name */
    public static final Property<Drawable, Integer> f۲۹b = new e();

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<Drawable, Integer> f۳۰a = new WeakHashMap<>();

    private e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable object) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(object.getAlpha());
        }
        if (this.f۳۰a.containsKey(object)) {
            return this.f۳۰a.get(object);
        }
        return 255;
    }

    /* renamed from: a */
    public void set(Drawable object, Integer value) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f۳۰a.put(object, value);
        }
        object.setAlpha(value.intValue());
    }
}
