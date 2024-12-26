package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۶۸l;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: a.b.c.l.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ce extends Property<Drawable, Integer> {

    /* renamed from: b, reason: contains not printable characters */
    public static final Property<Drawable, Integer> f۸۲۵۸b = new Ce();

    /* renamed from: a, reason: contains not printable characters */
    private final WeakHashMap<Drawable, Integer> f۸۲۵۹a;

    private Ce() {
        super(Integer.class, "drawableAlphaCompat");
        this.f۸۲۵۹a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Integer get(Drawable object) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(object.getAlpha());
        }
        if (this.f۸۲۵۹a.containsKey(object)) {
            return this.f۸۲۵۹a.get(object);
        }
        return 255;
    }

    @Override // android.util.Property
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void set(Drawable object, Integer value) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f۸۲۵۹a.put(object, value);
        }
        object.setAlpha(value.intValue());
    }
}
