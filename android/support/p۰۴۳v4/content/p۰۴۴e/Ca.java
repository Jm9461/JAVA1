package android.support.p۰۴۳v4.content.p۰۴۴e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd;

/* renamed from: android.support.v4.content.e.a  reason: invalid class name */
public final class Ca {
    /* renamed from: a  reason: contains not printable characters */
    public static ColorStateList m۱۲۶۴۰a(Resources r, XmlPullParser parser, Resources.Theme theme) {
        int type;
        AttributeSet attrs = Xml.asAttributeSet(parser);
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type == 2) {
            return m۱۲۶۴۱a(r, parser, attrs, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a  reason: contains not printable characters */
    public static ColorStateList m۱۲۶۴۱a(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (name.equals("selector")) {
            return m۱۲۶۴۳b(r, parser, attrs, theme);
        }
        throw new XmlPullParserException(parser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* JADX INFO: Multiple debug info for r1v3 int[]: [D('colors' int[]), D('innerDepth' int)] */
    /* renamed from: b  reason: contains not printable characters */
    private static ColorStateList m۱۲۶۴۳b(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int i = 1;
        int innerDepth = parser.getDepth() + 1;
        int defaultColor = -65536;
        int[][] stateSpecList = new int[20][];
        int[] colorList = new int[stateSpecList.length];
        int listSize = 0;
        while (true) {
            int type = parser.next();
            if (type == i) {
                break;
            }
            int depth = parser.getDepth();
            if (depth < innerDepth && type == 3) {
                break;
            } else if (type != 2 || depth > innerDepth || !parser.getName().equals("item")) {
                innerDepth = innerDepth;
                defaultColor = defaultColor;
                i = 1;
            } else {
                TypedArray a = m۱۲۶۴۲a(r, theme, attrs, Cd.ColorStateListItem);
                int baseColor = a.getColor(Cd.ColorStateListItem_android_color, -65281);
                float alphaMod = 1.0f;
                if (a.hasValue(Cd.ColorStateListItem_android_alpha)) {
                    alphaMod = a.getFloat(Cd.ColorStateListItem_android_alpha, 1.0f);
                } else if (a.hasValue(Cd.ColorStateListItem_alpha)) {
                    alphaMod = a.getFloat(Cd.ColorStateListItem_alpha, 1.0f);
                }
                a.recycle();
                int numAttrs = attrs.getAttributeCount();
                int[] stateSpec = new int[numAttrs];
                int j = 0;
                int i2 = 0;
                while (i2 < numAttrs) {
                    int stateResId = attrs.getAttributeNameResource(i2);
                    if (!(stateResId == 16843173 || stateResId == 16843551 || stateResId == p۰۰۰a.p۰۰۵b.p۰۰۶a.Ca.alpha)) {
                        int j2 = j + 1;
                        stateSpec[j] = attrs.getAttributeBooleanValue(i2, false) ? stateResId : -stateResId;
                        j = j2;
                    }
                    i2++;
                    numAttrs = numAttrs;
                    defaultColor = defaultColor;
                }
                int defaultColor2 = defaultColor;
                int[] stateSpec2 = StateSet.trimStateSet(stateSpec, j);
                int color = m۱۲۶۳۹a(baseColor, alphaMod);
                if (listSize == 0 || stateSpec2.length == 0) {
                    defaultColor2 = color;
                }
                colorList = Ce.m۱۲۶۷۹a(colorList, listSize, color);
                stateSpecList = (int[][]) Ce.m۱۲۶۸۰a(stateSpecList, listSize, stateSpec2);
                listSize++;
                innerDepth = innerDepth;
                defaultColor = defaultColor2;
                i = 1;
            }
        }
        int[] colors = new int[listSize];
        int[][] stateSpecs = new int[listSize][];
        System.arraycopy(colorList, 0, colors, 0, listSize);
        System.arraycopy(stateSpecList, 0, stateSpecs, 0, listSize);
        return new ColorStateList(stateSpecs, colors);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static TypedArray m۱۲۶۴۲a(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        if (theme == null) {
            return res.obtainAttributes(set, attrs);
        }
        return theme.obtainStyledAttributes(set, attrs, 0, 0);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۲۶۳۹a(int color, float alphaMod) {
        return (16777215 & color) | (Math.round(((float) Color.alpha(color)) * alphaMod) << 24);
    }
}
