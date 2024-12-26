package android.support.v4.content.e;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* access modifiers changed from: package-private */
public final class d {
    static Shader a(Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (name.equals("gradient")) {
            TypedArray a2 = g.a(resources, theme, attrs, a.b.a.d.GradientColor);
            float startX = g.a(a2, parser, "startX", a.b.a.d.GradientColor_android_startX, 0.0f);
            float startY = g.a(a2, parser, "startY", a.b.a.d.GradientColor_android_startY, 0.0f);
            float endX = g.a(a2, parser, "endX", a.b.a.d.GradientColor_android_endX, 0.0f);
            float endY = g.a(a2, parser, "endY", a.b.a.d.GradientColor_android_endY, 0.0f);
            float centerX = g.a(a2, parser, "centerX", a.b.a.d.GradientColor_android_centerX, 0.0f);
            float centerY = g.a(a2, parser, "centerY", a.b.a.d.GradientColor_android_centerY, 0.0f);
            int type = g.b(a2, parser, "type", a.b.a.d.GradientColor_android_type, 0);
            int startColor = g.a(a2, parser, "startColor", a.b.a.d.GradientColor_android_startColor, 0);
            boolean hasCenterColor = g.a(parser, "centerColor");
            int centerColor = g.a(a2, parser, "centerColor", a.b.a.d.GradientColor_android_centerColor, 0);
            int endColor = g.a(a2, parser, "endColor", a.b.a.d.GradientColor_android_endColor, 0);
            int tileMode = g.b(a2, parser, "tileMode", a.b.a.d.GradientColor_android_tileMode, 0);
            float gradientRadius = g.a(a2, parser, "gradientRadius", a.b.a.d.GradientColor_android_gradientRadius, 0.0f);
            a2.recycle();
            a colorStops = a(b(resources, parser, attrs, theme), startColor, endColor, hasCenterColor, centerColor);
            if (type != 1) {
                if (type != 2) {
                    return new LinearGradient(startX, startY, endX, endY, colorStops.f۱۲۷۷a, colorStops.f۱۲۷۸b, a(tileMode));
                }
                return new SweepGradient(centerX, centerY, colorStops.f۱۲۷۷a, colorStops.f۱۲۷۸b);
            } else if (gradientRadius > 0.0f) {
                return new RadialGradient(centerX, centerY, gradientRadius, colorStops.f۱۲۷۷a, colorStops.f۱۲۷۸b, a(tileMode));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        } else {
            throw new XmlPullParserException(parser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008c, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r13.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' " + "attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.v4.content.e.d.a b(android.content.res.Resources r12, org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.e.d.b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.support.v4.content.e.d$a");
    }

    private static a a(a colorItems, int startColor, int endColor, boolean hasCenterColor, int centerColor) {
        if (colorItems != null) {
            return colorItems;
        }
        if (hasCenterColor) {
            return new a(startColor, centerColor, endColor);
        }
        return new a(startColor, endColor);
    }

    private static Shader.TileMode a(int tileMode) {
        if (tileMode == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (tileMode != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f۱۲۷۷a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f۱۲۷۸b;

        a(List<Integer> colorsList, List<Float> offsetsList) {
            int size = colorsList.size();
            this.f۱۲۷۷a = new int[size];
            this.f۱۲۷۸b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f۱۲۷۷a[i] = colorsList.get(i).intValue();
                this.f۱۲۷۸b[i] = offsetsList.get(i).floatValue();
            }
        }

        a(int startColor, int endColor) {
            this.f۱۲۷۷a = new int[]{startColor, endColor};
            this.f۱۲۷۸b = new float[]{0.0f, 1.0f};
        }

        a(int startColor, int centerColor, int endColor) {
            this.f۱۲۷۷a = new int[]{startColor, centerColor, endColor};
            this.f۱۲۷۸b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
