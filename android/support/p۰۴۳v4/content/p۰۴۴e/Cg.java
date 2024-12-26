package android.support.p۰۴۳v4.content.p۰۴۴e;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.content.e.g  reason: invalid class name */
public class Cg {
    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۲۶۹۵a(XmlPullParser parser, String attrName) {
        return parser.getAttributeValue("http://schemas.android.com/apk/res/android", attrName) != null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static float m۱۲۶۸۹a(TypedArray a, XmlPullParser parser, String attrName, int resId, float defaultValue) {
        if (!m۱۲۶۹۵a(parser, attrName)) {
            return defaultValue;
        }
        return a.getFloat(resId, defaultValue);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۲۶۹۴a(TypedArray a, XmlPullParser parser, String attrName, int resId, boolean defaultValue) {
        if (!m۱۲۶۹۵a(parser, attrName)) {
            return defaultValue;
        }
        return a.getBoolean(resId, defaultValue);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۲۶۹۶b(TypedArray a, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        if (!m۱۲۶۹۵a(parser, attrName)) {
            return defaultValue;
        }
        return a.getInt(resId, defaultValue);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۲۶۹۰a(TypedArray a, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        if (!m۱۲۶۹۵a(parser, attrName)) {
            return defaultValue;
        }
        return a.getColor(resId, defaultValue);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cb m۱۲۶۹۲a(TypedArray a, XmlPullParser parser, Resources.Theme theme, String attrName, int resId, int defaultValue) {
        if (m۱۲۶۹۵a(parser, attrName)) {
            TypedValue value = new TypedValue();
            a.getValue(resId, value);
            int i = value.type;
            if (i >= 28 && i <= 31) {
                return Cb.m۱۲۶۴۷b(value.data);
            }
            Cb complexColor = Cb.m۱۲۶۴۸b(a.getResources(), a.getResourceId(resId, 0), theme);
            if (complexColor != null) {
                return complexColor;
            }
        }
        return Cb.m۱۲۶۴۷b(defaultValue);
    }

    /* renamed from: c  reason: contains not printable characters */
    public static int m۱۲۶۹۸c(TypedArray a, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        if (!m۱۲۶۹۵a(parser, attrName)) {
            return defaultValue;
        }
        return a.getResourceId(resId, defaultValue);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۲۶۹۳a(TypedArray a, XmlPullParser parser, String attrName, int resId) {
        if (!m۱۲۶۹۵a(parser, attrName)) {
            return null;
        }
        return a.getString(resId);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static TypedValue m۱۲۶۹۷b(TypedArray a, XmlPullParser parser, String attrName, int resId) {
        if (!m۱۲۶۹۵a(parser, attrName)) {
            return null;
        }
        return a.peekValue(resId);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static TypedArray m۱۲۶۹۱a(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        if (theme == null) {
            return res.obtainAttributes(set, attrs);
        }
        return theme.obtainStyledAttributes(set, attrs, 0, 0);
    }
}
