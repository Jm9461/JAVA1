package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: a.b.f.i  reason: invalid class name */
class Ci {
    /* renamed from: a  reason: contains not printable characters */
    static PropertyValuesHolder m۱۰۲۷۴a(Property<?, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
        return PropertyValuesHolder.ofFloat(new Ch(property, path), 0.0f, 1.0f);
    }
}
