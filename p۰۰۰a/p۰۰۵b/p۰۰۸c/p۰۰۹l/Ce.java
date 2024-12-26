package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: a.b.c.l.e  reason: invalid class name */
public class Ce extends Property<Drawable, Integer> {

    /* renamed from: b  reason: contains not printable characters */
    public static final Property<Drawable, Integer> f۸۲۵۸b = new Ce();

    /* renamed from: a  reason: contains not printable characters */
    private final WeakHashMap<Drawable, Integer> f۸۲۵۹a = new WeakHashMap<>();

    private Ce() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a  reason: contains not printable characters */
    public Integer get(Drawable object) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(object.getAlpha());
        }
        if (this.f۸۲۵۹a.containsKey(object)) {
            return this.f۸۲۵۹a.get(object);
        }
        return 255;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void set(Drawable object, Integer value) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f۸۲۵۹a.put(object, value);
        }
        object.setAlpha(value.intValue());
    }
}
