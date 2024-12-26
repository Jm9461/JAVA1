package android.support.p۰۴۳v4.content.p۰۴۴e;

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
/* renamed from: android.support.v4.content.e.d  reason: invalid class name */
public final class Cd {
    /* renamed from: a  reason: contains not printable characters */
    static Shader m۱۲۶۷۵a(Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (name.equals("gradient")) {
            TypedArray a = Cg.m۱۲۶۹۱a(resources, theme, attrs, p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor);
            float startX = Cg.m۱۲۶۸۹a(a, parser, "startX", p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor_android_startX, 0.0f);
            float startY = Cg.m۱۲۶۸۹a(a, parser, "startY", p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor_android_startY, 0.0f);
            float endX = Cg.m۱۲۶۸۹a(a, parser, "endX", p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor_android_endX, 0.0f);
            float endY = Cg.m۱۲۶۸۹a(a, parser, "endY", p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor_android_endY, 0.0f);
            float centerX = Cg.m۱۲۶۸۹a(a, parser, "centerX", p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor_android_centerX, 0.0f);
            float centerY = Cg.m۱۲۶۸۹a(a, parser, "centerY", p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor_android_centerY, 0.0f);
            int type = Cg.m۱۲۶۹۶b(a, parser, "type", p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor_android_type, 0);
            int startColor = Cg.m۱۲۶۹۰a(a, parser, "startColor", p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor_android_startColor, 0);
            boolean hasCenterColor = Cg.m۱۲۶۹۵a(parser, "centerColor");
            int centerColor = Cg.m۱۲۶۹۰a(a, parser, "centerColor", p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor_android_centerColor, 0);
            int endColor = Cg.m۱۲۶۹۰a(a, parser, "endColor", p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor_android_endColor, 0);
            int tileMode = Cg.m۱۲۶۹۶b(a, parser, "tileMode", p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor_android_tileMode, 0);
            float gradientRadius = Cg.m۱۲۶۸۹a(a, parser, "gradientRadius", p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.GradientColor_android_gradientRadius, 0.0f);
            a.recycle();
            Ca colorStops = m۱۲۶۷۶a(m۱۲۶۷۷b(resources, parser, attrs, theme), startColor, endColor, hasCenterColor, centerColor);
            if (type != 1) {
                if (type != 2) {
                    return new LinearGradient(startX, startY, endX, endY, colorStops.f۱۰۴۷۵a, colorStops.f۱۰۴۷۶b, m۱۲۶۷۴a(tileMode));
                }
                return new SweepGradient(centerX, centerY, colorStops.f۱۰۴۷۵a, colorStops.f۱۰۴۷۶b);
            } else if (gradientRadius > 0.0f) {
                return new RadialGradient(centerX, centerY, gradientRadius, colorStops.f۱۰۴۷۵a, colorStops.f۱۰۴۷۶b, m۱۲۶۷۴a(tileMode));
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
    /* renamed from: b  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.p۰۴۳v4.content.p۰۴۴e.Cd.Ca m۱۲۶۷۷b(android.content.res.Resources r12, org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۳v4.content.p۰۴۴e.Cd.m۱۲۶۷۷b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.support.v4.content.e.d$a");
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Ca m۱۲۶۷۶a(Ca colorItems, int startColor, int endColor, boolean hasCenterColor, int centerColor) {
        if (colorItems != null) {
            return colorItems;
        }
        if (hasCenterColor) {
            return new Ca(startColor, centerColor, endColor);
        }
        return new Ca(startColor, endColor);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Shader.TileMode m۱۲۶۷۴a(int tileMode) {
        if (tileMode == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (tileMode != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.content.e.d$a  reason: invalid class name */
    public static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        final int[] f۱۰۴۷۵a;

        /* renamed from: b  reason: contains not printable characters */
        final float[] f۱۰۴۷۶b;

        Ca(List<Integer> colorsList, List<Float> offsetsList) {
            int size = colorsList.size();
            this.f۱۰۴۷۵a = new int[size];
            this.f۱۰۴۷۶b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f۱۰۴۷۵a[i] = colorsList.get(i).intValue();
                this.f۱۰۴۷۶b[i] = offsetsList.get(i).floatValue();
            }
        }

        Ca(int startColor, int endColor) {
            this.f۱۰۴۷۵a = new int[]{startColor, endColor};
            this.f۱۰۴۷۶b = new float[]{0.0f, 1.0f};
        }

        Ca(int startColor, int centerColor, int endColor) {
            this.f۱۰۴۷۵a = new int[]{startColor, centerColor, endColor};
            this.f۱۰۴۷۶b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
