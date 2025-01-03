package p۱۶۳me.zhanghai.android.materialprogressbar.internal;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.Property;

/* access modifiers changed from: package-private */
/* renamed from: me.zhanghai.android.materialprogressbar.internal.ObjectAnimatorCompatBase */
public class ObjectAnimatorCompatBase {
    private static final int NUM_POINTS = 201;

    private ObjectAnimatorCompatBase() {
    }

    public static ObjectAnimator ofArgb(Object target, String propertyName, int... values) {
        ObjectAnimator animator = ObjectAnimator.ofInt(target, propertyName, values);
        animator.setEvaluator(new ArgbEvaluator());
        return animator;
    }

    public static <T> ObjectAnimator ofArgb(T target, Property<T, Integer> property, int... values) {
        ObjectAnimator animator = ObjectAnimator.ofInt(target, property, values);
        animator.setEvaluator(new ArgbEvaluator());
        return animator;
    }

    public static ObjectAnimator ofFloat(Object target, String xPropertyName, String yPropertyName, Path path) {
        float[] xValues = new float[NUM_POINTS];
        float[] yValues = new float[NUM_POINTS];
        calculateXYValues(path, xValues, yValues);
        return ObjectAnimator.ofPropertyValuesHolder(target, PropertyValuesHolder.ofFloat(xPropertyName, xValues), PropertyValuesHolder.ofFloat(yPropertyName, yValues));
    }

    public static <T> ObjectAnimator ofFloat(T target, Property<T, Float> xProperty, Property<T, Float> yProperty, Path path) {
        float[] xValues = new float[NUM_POINTS];
        float[] yValues = new float[NUM_POINTS];
        calculateXYValues(path, xValues, yValues);
        return ObjectAnimator.ofPropertyValuesHolder(target, PropertyValuesHolder.ofFloat((Property<?, Float>) xProperty, xValues), PropertyValuesHolder.ofFloat((Property<?, Float>) yProperty, yValues));
    }

    public static ObjectAnimator ofInt(Object target, String xPropertyName, String yPropertyName, Path path) {
        int[] xValues = new int[NUM_POINTS];
        int[] yValues = new int[NUM_POINTS];
        calculateXYValues(path, xValues, yValues);
        return ObjectAnimator.ofPropertyValuesHolder(target, PropertyValuesHolder.ofInt(xPropertyName, xValues), PropertyValuesHolder.ofInt(yPropertyName, yValues));
    }

    public static <T> ObjectAnimator ofInt(T target, Property<T, Integer> xProperty, Property<T, Integer> yProperty, Path path) {
        int[] xValues = new int[NUM_POINTS];
        int[] yValues = new int[NUM_POINTS];
        calculateXYValues(path, xValues, yValues);
        return ObjectAnimator.ofPropertyValuesHolder(target, PropertyValuesHolder.ofInt((Property<?, Integer>) xProperty, xValues), PropertyValuesHolder.ofInt((Property<?, Integer>) yProperty, yValues));
    }

    private static void calculateXYValues(Path path, float[] xValues, float[] yValues) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float pathLength = pathMeasure.getLength();
        float[] position = new float[2];
        for (int i = 0; i < NUM_POINTS; i++) {
            pathMeasure.getPosTan((((float) i) * pathLength) / 200.0f, position, null);
            xValues[i] = position[0];
            yValues[i] = position[1];
        }
    }

    private static void calculateXYValues(Path path, int[] xValues, int[] yValues) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float pathLength = pathMeasure.getLength();
        float[] position = new float[2];
        for (int i = 0; i < NUM_POINTS; i++) {
            pathMeasure.getPosTan((((float) i) * pathLength) / 200.0f, position, null);
            xValues[i] = Math.round(position[0]);
            yValues[i] = Math.round(position[1]);
        }
    }
}
