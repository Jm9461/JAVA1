package p۱۶۳me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Path;
import android.util.Property;

/* access modifiers changed from: package-private */
@TargetApi(21)
/* renamed from: me.zhanghai.android.materialprogressbar.internal.ObjectAnimatorCompatLollipop */
public class ObjectAnimatorCompatLollipop {
    private ObjectAnimatorCompatLollipop() {
    }

    public static ObjectAnimator ofArgb(Object target, String propertyName, int... values) {
        return ObjectAnimator.ofArgb(target, propertyName, values);
    }

    public static <T> ObjectAnimator ofArgb(T target, Property<T, Integer> property, int... values) {
        return ObjectAnimator.ofArgb(target, property, values);
    }

    public static ObjectAnimator ofFloat(Object target, String xPropertyName, String yPropertyName, Path path) {
        return ObjectAnimator.ofFloat(target, xPropertyName, yPropertyName, path);
    }

    public static <T> ObjectAnimator ofFloat(T target, Property<T, Float> xProperty, Property<T, Float> yProperty, Path path) {
        return ObjectAnimator.ofFloat(target, xProperty, yProperty, path);
    }

    public static ObjectAnimator ofInt(Object target, String xPropertyName, String yPropertyName, Path path) {
        return ObjectAnimator.ofInt(target, xPropertyName, yPropertyName, path);
    }

    public static <T> ObjectAnimator ofInt(T target, Property<T, Integer> xProperty, Property<T, Integer> yProperty, Path path) {
        return ObjectAnimator.ofInt(target, xProperty, yProperty, path);
    }
}
