package p۱۵۹a.p۱۶۴b.p۱۷۸d.p۱۷۹a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.content.p۲۰۲e.Cg;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۳a.Cb;

/* renamed from: a.b.d.a.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class InterpolatorCg implements Interpolator {

    /* renamed from: a, reason: contains not printable characters */
    private float[] f۸۳۵۴a;

    /* renamed from: b, reason: contains not printable characters */
    private float[] f۸۳۵۵b;

    public InterpolatorCg(Context context, AttributeSet attrs, XmlPullParser parser) {
        this(context.getResources(), context.getTheme(), attrs, parser);
    }

    public InterpolatorCg(Resources res, Resources.Theme theme, AttributeSet attrs, XmlPullParser parser) {
        TypedArray a2 = Cg.m۱۰۶۲۱a(res, theme, attrs, Ca.f۸۳۴۰l);
        m۷۹۹۸a(a2, parser);
        a2.recycle();
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۷۹۹۸a(TypedArray a2, XmlPullParser parser) {
        if (Cg.m۱۰۶۲۵a(parser, "pathData")) {
            String pathData = Cg.m۱۰۶۲۳a(a2, parser, "pathData", 4);
            Path path = Cb.m۸۳۶۳b(pathData);
            if (path == null) {
                throw new InflateException("The path is null, which is created from " + pathData);
            }
            m۷۹۹۹a(path);
            return;
        }
        if (!Cg.m۱۰۶۲۵a(parser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (Cg.m۱۰۶۲۵a(parser, "controlY1")) {
            float x1 = Cg.m۱۰۶۱۹a(a2, parser, "controlX1", 0, 0.0f);
            float y1 = Cg.m۱۰۶۱۹a(a2, parser, "controlY1", 1, 0.0f);
            boolean hasX2 = Cg.m۱۰۶۲۵a(parser, "controlX2");
            boolean hasY2 = Cg.m۱۰۶۲۵a(parser, "controlY2");
            if (hasX2 != hasY2) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (hasX2) {
                float x2 = Cg.m۱۰۶۱۹a(a2, parser, "controlX2", 2, 0.0f);
                float y2 = Cg.m۱۰۶۱۹a(a2, parser, "controlY2", 3, 0.0f);
                m۷۹۹۷a(x1, y1, x2, y2);
                return;
            }
            m۷۹۹۶a(x1, y1);
            return;
        }
        throw new InflateException("pathInterpolator requires the controlY1 attribute");
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۷۹۹۶a(float controlX, float controlY) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(controlX, controlY, 1.0f, 1.0f);
        m۷۹۹۹a(path);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۷۹۹۷a(float x1, float y1, float x2, float y2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(x1, y1, x2, y2, 1.0f, 1.0f);
        m۷۹۹۹a(path);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۷۹۹۹a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float pathLength = pathMeasure.getLength();
        int numPoints = Math.min(3000, ((int) (pathLength / 0.002f)) + 1);
        if (numPoints <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + pathLength);
        }
        this.f۸۳۵۴a = new float[numPoints];
        this.f۸۳۵۵b = new float[numPoints];
        float[] position = new float[2];
        for (int i = 0; i < numPoints; i++) {
            float distance = (i * pathLength) / (numPoints - 1);
            pathMeasure.getPosTan(distance, position, null);
            this.f۸۳۵۴a[i] = position[0];
            this.f۸۳۵۵b[i] = position[1];
        }
        if (Math.abs(this.f۸۳۵۴a[0]) > 1.0E-5d || Math.abs(this.f۸۳۵۵b[0]) > 1.0E-5d || Math.abs(this.f۸۳۵۴a[numPoints - 1] - 1.0f) > 1.0E-5d || Math.abs(this.f۸۳۵۵b[numPoints - 1] - 1.0f) > 1.0E-5d) {
            throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.f۸۳۵۴a[0] + "," + this.f۸۳۵۵b[0] + " end:" + this.f۸۳۵۴a[numPoints - 1] + "," + this.f۸۳۵۵b[numPoints - 1]);
        }
        float prevX = 0.0f;
        int componentIndex = 0;
        int i2 = 0;
        while (i2 < numPoints) {
            float[] fArr = this.f۸۳۵۴a;
            int componentIndex2 = componentIndex + 1;
            float x = fArr[componentIndex];
            if (x < prevX) {
                throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + x);
            }
            fArr[i2] = x;
            prevX = x;
            i2++;
            componentIndex = componentIndex2;
        }
        if (pathMeasure.nextContour()) {
            throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float t) {
        if (t <= 0.0f) {
            return 0.0f;
        }
        if (t >= 1.0f) {
            return 1.0f;
        }
        int startIndex = 0;
        int endIndex = this.f۸۳۵۴a.length - 1;
        while (endIndex - startIndex > 1) {
            int midIndex = (startIndex + endIndex) / 2;
            if (t < this.f۸۳۵۴a[midIndex]) {
                endIndex = midIndex;
            } else {
                startIndex = midIndex;
            }
        }
        float[] fArr = this.f۸۳۵۴a;
        float xRange = fArr[endIndex] - fArr[startIndex];
        if (xRange == 0.0f) {
            return this.f۸۳۵۵b[startIndex];
        }
        float tInRange = t - fArr[startIndex];
        float fraction = tInRange / xRange;
        float[] fArr2 = this.f۸۳۵۵b;
        float startY = fArr2[startIndex];
        float endY = fArr2[endIndex];
        return ((endY - startY) * fraction) + startY;
    }
}
