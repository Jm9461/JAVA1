package android.support.v4.content.p۲۰۲e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd;

/* renamed from: android.support.v4.content.e.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca {
    /* renamed from: a, reason: contains not printable characters */
    public static ColorStateList m۱۰۵۷۰a(Resources r, XmlPullParser parser, Resources.Theme theme) {
        int type;
        AttributeSet attrs = Xml.asAttributeSet(parser);
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return m۱۰۵۷۱a(r, parser, attrs, theme);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static ColorStateList m۱۰۵۷۱a(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        return m۱۰۵۷۳b(r, parser, attrs, theme);
    }

    /* renamed from: b, reason: contains not printable characters */
    private static ColorStateList m۱۰۵۷۳b(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int depth;
        int i = 1;
        int innerDepth = parser.getDepth() + 1;
        int defaultColor = -65536;
        int[][] stateSpecList = new int[20][];
        int[] colorList = new int[stateSpecList.length];
        int listSize = 0;
        while (true) {
            int type = parser.next();
            if (type != i && ((depth = parser.getDepth()) >= innerDepth || type != 3)) {
                if (type == 2 && depth <= innerDepth && parser.getName().equals("item")) {
                    TypedArray a2 = m۱۰۵۷۲a(r, theme, attrs, Cd.ColorStateListItem);
                    int baseColor = a2.getColor(Cd.ColorStateListItem_android_color, -65281);
                    float alphaMod = 1.0f;
                    if (a2.hasValue(Cd.ColorStateListItem_android_alpha)) {
                        alphaMod = a2.getFloat(Cd.ColorStateListItem_android_alpha, 1.0f);
                    } else if (a2.hasValue(Cd.ColorStateListItem_alpha)) {
                        alphaMod = a2.getFloat(Cd.ColorStateListItem_alpha, 1.0f);
                    }
                    a2.recycle();
                    int numAttrs = attrs.getAttributeCount();
                    int[] stateSpec = new int[numAttrs];
                    int innerDepth2 = innerDepth;
                    int j = 0;
                    int j2 = 0;
                    while (j2 < numAttrs) {
                        int numAttrs2 = numAttrs;
                        int stateResId = attrs.getAttributeNameResource(j2);
                        int defaultColor2 = defaultColor;
                        if (stateResId != 16843173 && stateResId != 16843551 && stateResId != p۱۵۹a.p۱۶۴b.p۱۶۵a.Ca.alpha) {
                            int j3 = j + 1;
                            stateSpec[j] = attrs.getAttributeBooleanValue(j2, false) ? stateResId : -stateResId;
                            j = j3;
                        }
                        j2++;
                        numAttrs = numAttrs2;
                        defaultColor = defaultColor2;
                    }
                    int defaultColor3 = defaultColor;
                    int[] stateSpec2 = StateSet.trimStateSet(stateSpec, j);
                    int color = m۱۰۵۶۹a(baseColor, alphaMod);
                    if (listSize == 0 || stateSpec2.length == 0) {
                        defaultColor3 = color;
                    }
                    colorList = Ce.m۱۰۶۰۹a(colorList, listSize, color);
                    stateSpecList = (int[][]) Ce.m۱۰۶۱۰a(stateSpecList, listSize, stateSpec2);
                    listSize++;
                    innerDepth = innerDepth2;
                    defaultColor = defaultColor3;
                    i = 1;
                } else {
                    innerDepth = innerDepth;
                    defaultColor = defaultColor;
                    i = 1;
                }
            }
        }
        int[] colors = new int[listSize];
        int[][] stateSpecs = new int[listSize][];
        System.arraycopy(colorList, 0, colors, 0, listSize);
        System.arraycopy(stateSpecList, 0, stateSpecs, 0, listSize);
        return new ColorStateList(stateSpecs, colors);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static TypedArray m۱۰۵۷۲a(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        return theme == null ? res.obtainAttributes(set, attrs) : theme.obtainStyledAttributes(set, attrs, 0, 0);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۱۰۵۶۹a(int color, float alphaMod) {
        int alpha = Math.round(Color.alpha(color) * alphaMod);
        return (16777215 & color) | (alpha << 24);
    }
}
