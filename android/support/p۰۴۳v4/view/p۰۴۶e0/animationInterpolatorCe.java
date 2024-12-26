package android.support.p۰۴۳v4.view.p۰۴۶e0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.e0.e  reason: invalid class name */
class animationInterpolatorCe implements Interpolator {

    /* renamed from: a  reason: contains not printable characters */
    private final float[] f۱۰۶۱۰a;

    /* renamed from: b  reason: contains not printable characters */
    private final float[] f۱۰۶۱۱b;

    animationInterpolatorCe(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float pathLength = pathMeasure.getLength();
        int numPoints = ((int) (pathLength / 0.002f)) + 1;
        this.f۱۰۶۱۰a = new float[numPoints];
        this.f۱۰۶۱۱b = new float[numPoints];
        float[] position = new float[2];
        for (int i = 0; i < numPoints; i++) {
            pathMeasure.getPosTan((((float) i) * pathLength) / ((float) (numPoints - 1)), position, null);
            this.f۱۰۶۱۰a[i] = position[0];
            this.f۱۰۶۱۱b[i] = position[1];
        }
    }

    public float getInterpolation(float t) {
        if (t <= 0.0f) {
            return 0.0f;
        }
        if (t >= 1.0f) {
            return 1.0f;
        }
        int startIndex = 0;
        int endIndex = this.f۱۰۶۱۰a.length - 1;
        while (endIndex - startIndex > 1) {
            int midIndex = (startIndex + endIndex) / 2;
            if (t < this.f۱۰۶۱۰a[midIndex]) {
                endIndex = midIndex;
            } else {
                startIndex = midIndex;
            }
        }
        float[] fArr = this.f۱۰۶۱۰a;
        float xRange = fArr[endIndex] - fArr[startIndex];
        if (xRange == 0.0f) {
            return this.f۱۰۶۱۱b[startIndex];
        }
        float[] fArr2 = this.f۱۰۶۱۱b;
        float startY = fArr2[startIndex];
        return ((fArr2[endIndex] - startY) * ((t - fArr[startIndex]) / xRange)) + startY;
    }
}
