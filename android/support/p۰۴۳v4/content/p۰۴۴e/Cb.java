package android.support.p۰۴۳v4.content.p۰۴۴e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.e.b  reason: invalid class name */
public final class Cb {

    /* renamed from: a  reason: contains not printable characters */
    private final Shader f۱۰۴۶۲a;

    /* renamed from: b  reason: contains not printable characters */
    private final ColorStateList f۱۰۴۶۳b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۰۴۶۴c;

    private Cb(Shader shader, ColorStateList colorStateList, int color) {
        this.f۱۰۴۶۲a = shader;
        this.f۱۰۴۶۳b = colorStateList;
        this.f۱۰۴۶۴c = color;
    }

    /* renamed from: a  reason: contains not printable characters */
    static Cb m۱۲۶۴۶a(Shader shader) {
        return new Cb(shader, null, 0);
    }

    /* renamed from: a  reason: contains not printable characters */
    static Cb m۱۲۶۴۴a(ColorStateList colorStateList) {
        return new Cb(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: b  reason: contains not printable characters */
    static Cb m۱۲۶۴۷b(int color) {
        return new Cb(null, null, color);
    }

    /* renamed from: b  reason: contains not printable characters */
    public Shader m۱۲۶۵۲b() {
        return this.f۱۰۴۶۲a;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۲۶۴۹a() {
        return this.f۱۰۴۶۴c;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۶۵۰a(int color) {
        this.f۱۰۴۶۴c = color;
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۲۶۵۳c() {
        return this.f۱۰۴۶۲a != null;
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۲۶۵۴d() {
        ColorStateList colorStateList;
        return this.f۱۰۴۶۲a == null && (colorStateList = this.f۱۰۴۶۳b) != null && colorStateList.isStateful();
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۶۵۱a(int[] stateSet) {
        if (!m۱۲۶۵۴d()) {
            return false;
        }
        ColorStateList colorStateList = this.f۱۰۴۶۳b;
        int colorForState = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        if (colorForState == this.f۱۰۴۶۴c) {
            return false;
        }
        this.f۱۰۴۶۴c = colorForState;
        return true;
    }

    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۲۶۵۵e() {
        return m۱۲۶۵۳c() || this.f۱۰۴۶۴c != 0;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static Cb m۱۲۶۴۸b(Resources resources, int resId, Resources.Theme theme) {
        try {
            return m۱۲۶۴۵a(resources, resId, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Cb m۱۲۶۴۵a(Resources resources, int resId, Resources.Theme theme) {
        int type;
        XmlPullParser parser = resources.getXml(resId);
        AttributeSet attrs = Xml.asAttributeSet(parser);
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type == 2) {
            String name = parser.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m۱۲۶۴۴a(Ca.m۱۲۶۴۱a(resources, parser, attrs, theme));
            }
            if (c == 1) {
                return m۱۲۶۴۶a(Cd.m۱۲۶۷۵a(resources, parser, attrs, theme));
            }
            throw new XmlPullParserException(parser.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
