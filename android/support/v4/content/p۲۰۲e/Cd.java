package android.support.v4.content.p۲۰۲e;

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

/* renamed from: android.support.v4.content.e.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cd {
    /* renamed from: a, reason: contains not printable characters */
    static Shader m۱۰۶۰۵a(Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray a2 = Cg.m۱۰۶۲۱a(resources, theme, attrs, p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor);
        float startX = Cg.m۱۰۶۱۹a(a2, parser, "startX", p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor_android_startX, 0.0f);
        float startY = Cg.m۱۰۶۱۹a(a2, parser, "startY", p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor_android_startY, 0.0f);
        float endX = Cg.m۱۰۶۱۹a(a2, parser, "endX", p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor_android_endX, 0.0f);
        float endY = Cg.m۱۰۶۱۹a(a2, parser, "endY", p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor_android_endY, 0.0f);
        float centerX = Cg.m۱۰۶۱۹a(a2, parser, "centerX", p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor_android_centerX, 0.0f);
        float centerY = Cg.m۱۰۶۱۹a(a2, parser, "centerY", p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor_android_centerY, 0.0f);
        int type = Cg.m۱۰۶۲۶b(a2, parser, "type", p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor_android_type, 0);
        int startColor = Cg.m۱۰۶۲۰a(a2, parser, "startColor", p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor_android_startColor, 0);
        boolean hasCenterColor = Cg.m۱۰۶۲۵a(parser, "centerColor");
        int centerColor = Cg.m۱۰۶۲۰a(a2, parser, "centerColor", p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor_android_centerColor, 0);
        int endColor = Cg.m۱۰۶۲۰a(a2, parser, "endColor", p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor_android_endColor, 0);
        int tileMode = Cg.m۱۰۶۲۶b(a2, parser, "tileMode", p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor_android_tileMode, 0);
        float gradientRadius = Cg.m۱۰۶۱۹a(a2, parser, "gradientRadius", p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColor_android_gradientRadius, 0.0f);
        a2.recycle();
        a colorStops = m۱۰۶۰۶a(m۱۰۶۰۷b(resources, parser, attrs, theme), startColor, endColor, hasCenterColor, centerColor);
        if (type != 1) {
            return type != 2 ? new LinearGradient(startX, startY, endX, endY, colorStops.f۱۰۴۷۵a, colorStops.f۱۰۴۷۶b, m۱۰۶۰۴a(tileMode)) : new SweepGradient(centerX, centerY, colorStops.f۱۰۴۷۵a, colorStops.f۱۰۴۷۶b);
        }
        if (gradientRadius <= 0.0f) {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        return new RadialGradient(centerX, centerY, gradientRadius, colorStops.f۱۰۴۷۵a, colorStops.f۱۰۴۷۶b, m۱۰۶۰۴a(tileMode));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r13.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: b, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.support.v4.content.p۲۰۲e.Cd.a m۱۰۶۰۷b(android.content.res.Resources r12, org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) {
        /*
            int r0 = r13.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r3 = r4
        L13:
            int r4 = r13.next()
            r5 = r4
            if (r4 == r1) goto L8d
            int r4 = r13.getDepth()
            r6 = r4
            if (r4 >= r0) goto L24
            r4 = 3
            if (r5 == r4) goto L8d
        L24:
            r4 = 2
            if (r5 == r4) goto L28
            goto L13
        L28:
            if (r6 > r0) goto L13
            java.lang.String r4 = r13.getName()
            java.lang.String r7 = "item"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L37
            goto L13
        L37:
            int[] r4 = p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColorItem
            android.content.res.TypedArray r4 = android.support.v4.content.p۲۰۲e.Cg.m۱۰۶۲۱a(r12, r15, r14, r4)
            int r7 = p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColorItem_android_color
            boolean r7 = r4.hasValue(r7)
            int r8 = p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColorItem_android_offset
            boolean r8 = r4.hasValue(r8)
            if (r7 == 0) goto L6d
            if (r8 == 0) goto L6d
            int r9 = p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColorItem_android_color
            r10 = 0
            int r9 = r4.getColor(r9, r10)
            int r10 = p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd.GradientColorItem_android_offset
            r11 = 0
            float r10 = r4.getFloat(r10, r11)
            r4.recycle()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r3.add(r11)
            java.lang.Float r11 = java.lang.Float.valueOf(r10)
            r2.add(r11)
            goto L13
        L6d:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r13.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' "
            r9.append(r10)
            java.lang.String r10 = "attribute!"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r1.<init>(r9)
            throw r1
        L8d:
            int r1 = r3.size()
            if (r1 <= 0) goto L99
            android.support.v4.content.e.d$a r1 = new android.support.v4.content.e.d$a
            r1.<init>(r3, r2)
            return r1
        L99:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.p۲۰۲e.Cd.m۱۰۶۰۷b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.support.v4.content.e.d$a");
    }

    /* renamed from: a, reason: contains not printable characters */
    private static a m۱۰۶۰۶a(a colorItems, int startColor, int endColor, boolean hasCenterColor, int centerColor) {
        if (colorItems != null) {
            return colorItems;
        }
        if (hasCenterColor) {
            return new a(startColor, centerColor, endColor);
        }
        return new a(startColor, endColor);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Shader.TileMode m۱۰۶۰۴a(int tileMode) {
        if (tileMode == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (tileMode == 2) {
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.CLAMP;
    }

    /* renamed from: android.support.v4.content.e.d$a */
    static final class a {

        /* renamed from: a, reason: contains not printable characters */
        final int[] f۱۰۴۷۵a;

        /* renamed from: b, reason: contains not printable characters */
        final float[] f۱۰۴۷۶b;

        a(List<Integer> colorsList, List<Float> offsetsList) {
            int size = colorsList.size();
            this.f۱۰۴۷۵a = new int[size];
            this.f۱۰۴۷۶b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f۱۰۴۷۵a[i] = colorsList.get(i).intValue();
                this.f۱۰۴۷۶b[i] = offsetsList.get(i).floatValue();
            }
        }

        a(int startColor, int endColor) {
            this.f۱۰۴۷۵a = new int[]{startColor, endColor};
            this.f۱۰۴۷۶b = new float[]{0.0f, 1.0f};
        }

        a(int startColor, int centerColor, int endColor) {
            this.f۱۰۴۷۵a = new int[]{startColor, centerColor, endColor};
            this.f۱۰۴۷۶b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
