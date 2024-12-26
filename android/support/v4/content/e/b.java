package android.support.v4.content.e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Shader f۱۲۶۴a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f۱۲۶۵b;

    /* renamed from: c  reason: collision with root package name */
    private int f۱۲۶۶c;

    private b(Shader shader, ColorStateList colorStateList, int color) {
        this.f۱۲۶۴a = shader;
        this.f۱۲۶۵b = colorStateList;
        this.f۱۲۶۶c = color;
    }

    static b a(Shader shader) {
        return new b(shader, null, 0);
    }

    static b a(ColorStateList colorStateList) {
        return new b(null, colorStateList, colorStateList.getDefaultColor());
    }

    static b b(int color) {
        return new b(null, null, color);
    }

    public Shader b() {
        return this.f۱۲۶۴a;
    }

    public int a() {
        return this.f۱۲۶۶c;
    }

    public void a(int color) {
        this.f۱۲۶۶c = color;
    }

    public boolean c() {
        return this.f۱۲۶۴a != null;
    }

    public boolean d() {
        ColorStateList colorStateList;
        return this.f۱۲۶۴a == null && (colorStateList = this.f۱۲۶۵b) != null && colorStateList.isStateful();
    }

    public boolean a(int[] stateSet) {
        if (!d()) {
            return false;
        }
        ColorStateList colorStateList = this.f۱۲۶۵b;
        int colorForState = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        if (colorForState == this.f۱۲۶۶c) {
            return false;
        }
        this.f۱۲۶۶c = colorForState;
        return true;
    }

    public boolean e() {
        return c() || this.f۱۲۶۶c != 0;
    }

    public static b b(Resources resources, int resId, Resources.Theme theme) {
        try {
            return a(resources, resId, theme);
        } catch (Exception e2) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
            return null;
        }
    }

    private static b a(Resources resources, int resId, Resources.Theme theme) {
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
            char c2 = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c2 = 0;
                }
            } else if (name.equals("gradient")) {
                c2 = 1;
            }
            if (c2 == 0) {
                return a(a.a(resources, parser, attrs, theme));
            }
            if (c2 == 1) {
                return a(d.a(resources, parser, attrs, theme));
            }
            throw new XmlPullParserException(parser.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
