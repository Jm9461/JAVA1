package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: a.b.f.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cf {
    /* renamed from: a, reason: contains not printable characters */
    static <T> ObjectAnimator m۸۱۹۱a(T target, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(target, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(target, new Ch(property, path), 0.0f, 1.0f);
    }
}
