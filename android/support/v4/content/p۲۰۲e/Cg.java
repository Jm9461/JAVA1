package android.support.v4.content.p۲۰۲e;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.content.e.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cg {
    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۰۶۲۵a(XmlPullParser parser, String attrName) {
        return parser.getAttributeValue("http://schemas.android.com/apk/res/android", attrName) != null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static float m۱۰۶۱۹a(TypedArray a2, XmlPullParser parser, String attrName, int resId, float defaultValue) {
        boolean hasAttr = m۱۰۶۲۵a(parser, attrName);
        if (!hasAttr) {
            return defaultValue;
        }
        return a2.getFloat(resId, defaultValue);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۰۶۲۴a(TypedArray a2, XmlPullParser parser, String attrName, int resId, boolean defaultValue) {
        boolean hasAttr = m۱۰۶۲۵a(parser, attrName);
        if (!hasAttr) {
            return defaultValue;
        }
        return a2.getBoolean(resId, defaultValue);
    }

    /* renamed from: b, reason: contains not printable characters */
    public static int m۱۰۶۲۶b(TypedArray a2, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        boolean hasAttr = m۱۰۶۲۵a(parser, attrName);
        if (!hasAttr) {
            return defaultValue;
        }
        return a2.getInt(resId, defaultValue);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۰۶۲۰a(TypedArray a2, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        boolean hasAttr = m۱۰۶۲۵a(parser, attrName);
        if (!hasAttr) {
            return defaultValue;
        }
        return a2.getColor(resId, defaultValue);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cb m۱۰۶۲۲a(TypedArray a2, XmlPullParser parser, Resources.Theme theme, String attrName, int resId, int defaultValue) {
        if (m۱۰۶۲۵a(parser, attrName)) {
            TypedValue value = new TypedValue();
            a2.getValue(resId, value);
            int i = value.type;
            if (i >= 28 && i <= 31) {
                return Cb.m۱۰۵۷۷b(value.data);
            }
            Cb complexColor = Cb.m۱۰۵۷۸b(a2.getResources(), a2.getResourceId(resId, 0), theme);
            if (complexColor != null) {
                return complexColor;
            }
        }
        return Cb.m۱۰۵۷۷b(defaultValue);
    }

    /* renamed from: c, reason: contains not printable characters */
    public static int m۱۰۶۲۸c(TypedArray a2, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        boolean hasAttr = m۱۰۶۲۵a(parser, attrName);
        if (!hasAttr) {
            return defaultValue;
        }
        return a2.getResourceId(resId, defaultValue);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۰۶۲۳a(TypedArray a2, XmlPullParser parser, String attrName, int resId) {
        boolean hasAttr = m۱۰۶۲۵a(parser, attrName);
        if (!hasAttr) {
            return null;
        }
        return a2.getString(resId);
    }

    /* renamed from: b, reason: contains not printable characters */
    public static TypedValue m۱۰۶۲۷b(TypedArray a2, XmlPullParser parser, String attrName, int resId) {
        boolean hasAttr = m۱۰۶۲۵a(parser, attrName);
        if (!hasAttr) {
            return null;
        }
        return a2.peekValue(resId);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static TypedArray m۱۰۶۲۱a(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        if (theme == null) {
            return res.obtainAttributes(set, attrs);
        }
        return theme.obtainStyledAttributes(set, attrs, 0, 0);
    }
}
