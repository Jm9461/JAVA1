package a.b.d.a;

import a.b.g.a.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

public class g implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private float[] f۹۹a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f۱۰۰b;

    public g(Context context, AttributeSet attrs, XmlPullParser parser) {
        this(context.getResources(), context.getTheme(), attrs, parser);
    }

    public g(Resources res, Resources.Theme theme, AttributeSet attrs, XmlPullParser parser) {
        TypedArray a2 = android.support.v4.content.e.g.a(res, theme, attrs, a.l);
        a(a2, parser);
        a2.recycle();
    }

    private void a(TypedArray a2, XmlPullParser parser) {
        if (android.support.v4.content.e.g.a(parser, "pathData")) {
            String pathData = android.support.v4.content.e.g.a(a2, parser, "pathData", 4);
            Path path = b.b(pathData);
            if (path != null) {
                a(path);
                return;
            }
            throw new InflateException("The path is null, which is created from " + pathData);
        } else if (!android.support.v4.content.e.g.a(parser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (android.support.v4.content.e.g.a(parser, "controlY1")) {
            float x1 = android.support.v4.content.e.g.a(a2, parser, "controlX1", 0, 0.0f);
            float y1 = android.support.v4.content.e.g.a(a2, parser, "controlY1", 1, 0.0f);
            boolean hasX2 = android.support.v4.content.e.g.a(parser, "controlX2");
            if (hasX2 != android.support.v4.content.e.g.a(parser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!hasX2) {
                a(x1, y1);
            } else {
                a(x1, y1, android.support.v4.content.e.g.a(a2, parser, "controlX2", 2, 0.0f), android.support.v4.content.e.g.a(a2, parser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    private void a(float controlX, float controlY) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(controlX, controlY, 1.0f, 1.0f);
        a(path);
    }

    private void a(float x1, float y1, float x2, float y2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(x1, y1, x2, y2, 1.0f, 1.0f);
        a(path);
    }

    /* JADX INFO: Multiple debug info for r4v24 float: [D('componentIndex' int), D('x' float)] */
    private void a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float pathLength = pathMeasure.getLength();
        int numPoints = Math.min(3000, ((int) (pathLength / 0.002f)) + 1);
        if (numPoints > 0) {
            this.f۹۹a = new float[numPoints];
            this.f۱۰۰b = new float[numPoints];
            float[] position = new float[2];
            for (int i = 0; i < numPoints; i++) {
                pathMeasure.getPosTan((((float) i) * pathLength) / ((float) (numPoints - 1)), position, null);
                this.f۹۹a[i] = position[0];
                this.f۱۰۰b[i] = position[1];
            }
            if (((double) Math.abs(this.f۹۹a[0])) > 1.0E-5d || ((double) Math.abs(this.f۱۰۰b[0])) > 1.0E-5d || ((double) Math.abs(this.f۹۹a[numPoints - 1] - 1.0f)) > 1.0E-5d || ((double) Math.abs(this.f۱۰۰b[numPoints - 1] - 1.0f)) > 1.0E-5d) {
                throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.f۹۹a[0] + "," + this.f۱۰۰b[0] + " end:" + this.f۹۹a[numPoints - 1] + "," + this.f۱۰۰b[numPoints - 1]);
            }
            float prevX = 0.0f;
            int componentIndex = 0;
            int i2 = 0;
            while (i2 < numPoints) {
                float[] fArr = this.f۹۹a;
                int componentIndex2 = componentIndex + 1;
                float x = fArr[componentIndex];
                if (x >= prevX) {
                    fArr[i2] = x;
                    prevX = x;
                    i2++;
                    componentIndex = componentIndex2;
                } else {
                    throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + x);
                }
            }
            if (pathMeasure.nextContour()) {
                throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
            }
            return;
        }
        throw new IllegalArgumentException("The Path has a invalid length " + pathLength);
    }

    public float getInterpolation(float t) {
        if (t <= 0.0f) {
            return 0.0f;
        }
        if (t >= 1.0f) {
            return 1.0f;
        }
        int startIndex = 0;
        int endIndex = this.f۹۹a.length - 1;
        while (endIndex - startIndex > 1) {
            int midIndex = (startIndex + endIndex) / 2;
            if (t < this.f۹۹a[midIndex]) {
                endIndex = midIndex;
            } else {
                startIndex = midIndex;
            }
        }
        float[] fArr = this.f۹۹a;
        float xRange = fArr[endIndex] - fArr[startIndex];
        if (xRange == 0.0f) {
            return this.f۱۰۰b[startIndex];
        }
        float[] fArr2 = this.f۱۰۰b;
        float startY = fArr2[startIndex];
        return ((fArr2[endIndex] - startY) * ((t - fArr[startIndex]) / xRange)) + startY;
    }
}
