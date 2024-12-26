package android.support.v4.view.e0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

class e implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f۱۳۵۶a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f۱۳۵۷b;

    e(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float pathLength = pathMeasure.getLength();
        int numPoints = ((int) (pathLength / 0.002f)) + 1;
        this.f۱۳۵۶a = new float[numPoints];
        this.f۱۳۵۷b = new float[numPoints];
        float[] position = new float[2];
        for (int i = 0; i < numPoints; i++) {
            pathMeasure.getPosTan((((float) i) * pathLength) / ((float) (numPoints - 1)), position, null);
            this.f۱۳۵۶a[i] = position[0];
            this.f۱۳۵۷b[i] = position[1];
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
        int endIndex = this.f۱۳۵۶a.length - 1;
        while (endIndex - startIndex > 1) {
            int midIndex = (startIndex + endIndex) / 2;
            if (t < this.f۱۳۵۶a[midIndex]) {
                endIndex = midIndex;
            } else {
                startIndex = midIndex;
            }
        }
        float[] fArr = this.f۱۳۵۶a;
        float xRange = fArr[endIndex] - fArr[startIndex];
        if (xRange == 0.0f) {
            return this.f۱۳۵۷b[startIndex];
        }
        float[] fArr2 = this.f۱۳۵۷b;
        float startY = fArr2[startIndex];
        return ((fArr2[endIndex] - startY) * ((t - fArr[startIndex]) / xRange)) + startY;
    }
}
