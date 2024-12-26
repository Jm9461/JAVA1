package android.support.v4.content.p۲۰۲e;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.content.res.FontResourcesParserCompat;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p۱۵۹a.p۱۶۴b.p۱۶۵a.Cd;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۸e.Ca;

/* renamed from: android.support.v4.content.e.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc {

    /* renamed from: android.support.v4.content.e.c$a */
    public interface a {
    }

    /* renamed from: android.support.v4.content.e.c$d */
    public static final class d implements a {

        /* renamed from: a, reason: contains not printable characters */
        private final Ca f۱۰۴۷۲a;

        /* renamed from: b, reason: contains not printable characters */
        private final int f۱۰۴۷۳b;

        /* renamed from: c, reason: contains not printable characters */
        private final int f۱۰۴۷۴c;

        public d(Ca request, int strategy, int timeoutMs) {
            this.f۱۰۴۷۲a = request;
            this.f۱۰۴۷۴c = strategy;
            this.f۱۰۴۷۳b = timeoutMs;
        }

        /* renamed from: b, reason: contains not printable characters */
        public Ca m۱۰۶۰۲b() {
            return this.f۱۰۴۷۲a;
        }

        /* renamed from: a, reason: contains not printable characters */
        public int m۱۰۶۰۱a() {
            return this.f۱۰۴۷۴c;
        }

        /* renamed from: c, reason: contains not printable characters */
        public int m۱۰۶۰۳c() {
            return this.f۱۰۴۷۳b;
        }
    }

    /* renamed from: android.support.v4.content.e.c$c */
    public static final class c {

        /* renamed from: a, reason: contains not printable characters */
        private final String f۱۰۴۶۶a;

        /* renamed from: b, reason: contains not printable characters */
        private int f۱۰۴۶۷b;

        /* renamed from: c, reason: contains not printable characters */
        private boolean f۱۰۴۶۸c;

        /* renamed from: d, reason: contains not printable characters */
        private String f۱۰۴۶۹d;

        /* renamed from: e, reason: contains not printable characters */
        private int f۱۰۴۷۰e;

        /* renamed from: f, reason: contains not printable characters */
        private int f۱۰۴۷۱f;

        public c(String fileName, int weight, boolean italic, String variationSettings, int ttcIndex, int resourceId) {
            this.f۱۰۴۶۶a = fileName;
            this.f۱۰۴۶۷b = weight;
            this.f۱۰۴۶۸c = italic;
            this.f۱۰۴۶۹d = variationSettings;
            this.f۱۰۴۷۰e = ttcIndex;
            this.f۱۰۴۷۱f = resourceId;
        }

        /* renamed from: a, reason: contains not printable characters */
        public String m۱۰۵۹۵a() {
            return this.f۱۰۴۶۶a;
        }

        /* renamed from: e, reason: contains not printable characters */
        public int m۱۰۵۹۹e() {
            return this.f۱۰۴۶۷b;
        }

        /* renamed from: f, reason: contains not printable characters */
        public boolean m۱۰۶۰۰f() {
            return this.f۱۰۴۶۸c;
        }

        /* renamed from: d, reason: contains not printable characters */
        public String m۱۰۵۹۸d() {
            return this.f۱۰۴۶۹d;
        }

        /* renamed from: c, reason: contains not printable characters */
        public int m۱۰۵۹۷c() {
            return this.f۱۰۴۷۰e;
        }

        /* renamed from: b, reason: contains not printable characters */
        public int m۱۰۵۹۶b() {
            return this.f۱۰۴۷۱f;
        }
    }

    /* renamed from: android.support.v4.content.e.c$b */
    public static final class b implements a {

        /* renamed from: a, reason: contains not printable characters */
        private final c[] f۱۰۴۶۵a;

        public b(c[] entries) {
            this.f۱۰۴۶۵a = entries;
        }

        /* renamed from: a, reason: contains not printable characters */
        public c[] m۱۰۵۹۴a() {
            return this.f۱۰۴۶۵a;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static a m۱۰۵۸۷a(XmlPullParser parser, Resources resources) {
        int type;
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return m۱۰۵۹۱b(parser, resources);
    }

    /* renamed from: b, reason: contains not printable characters */
    private static a m۱۰۵۹۱b(XmlPullParser parser, Resources resources) {
        parser.require(2, null, "font-family");
        String tag = parser.getName();
        if (tag.equals("font-family")) {
            return m۱۰۵۹۲c(parser, resources);
        }
        m۱۰۵۹۰a(parser);
        return null;
    }

    /* renamed from: c, reason: contains not printable characters */
    private static a m۱۰۵۹۲c(XmlPullParser parser, Resources resources) {
        AttributeSet attrs = Xml.asAttributeSet(parser);
        TypedArray array = resources.obtainAttributes(attrs, Cd.FontFamily);
        String authority = array.getString(Cd.FontFamily_fontProviderAuthority);
        String providerPackage = array.getString(Cd.FontFamily_fontProviderPackage);
        String query = array.getString(Cd.FontFamily_fontProviderQuery);
        int certsId = array.getResourceId(Cd.FontFamily_fontProviderCerts, 0);
        int strategy = array.getInteger(Cd.FontFamily_fontProviderFetchStrategy, 1);
        int timeoutMs = array.getInteger(Cd.FontFamily_fontProviderFetchTimeout, 500);
        array.recycle();
        if (authority != null && providerPackage != null && query != null) {
            while (parser.next() != 3) {
                m۱۰۵۹۰a(parser);
            }
            List<List<byte[]>> certs = m۱۰۵۸۸a(resources, certsId);
            return new d(new Ca(authority, providerPackage, query, certs), strategy, timeoutMs);
        }
        List<FontResourcesParserCompat.FontFileResourceEntry> fonts = new ArrayList<>();
        while (parser.next() != 3) {
            if (parser.getEventType() == 2) {
                String tag = parser.getName();
                if (tag.equals("font")) {
                    fonts.add(m۱۰۵۹۳d(parser, resources));
                } else {
                    m۱۰۵۹۰a(parser);
                }
            }
        }
        if (fonts.isEmpty()) {
            return null;
        }
        return new b((c[]) fonts.toArray(new c[fonts.size()]));
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۱۰۵۸۶a(TypedArray typedArray, int index) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(index);
        }
        TypedValue tv = new TypedValue();
        typedArray.getValue(index, tv);
        return tv.type;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static List<List<byte[]>> m۱۰۵۸۸a(Resources resources, int certsId) {
        if (certsId == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArray = resources.obtainTypedArray(certsId);
        try {
            if (typedArray.length() == 0) {
                return Collections.emptyList();
            }
            List<List<byte[]>> result = new ArrayList<>();
            if (m۱۰۵۸۶a(typedArray, 0) == 1) {
                for (int i = 0; i < typedArray.length(); i++) {
                    int certId = typedArray.getResourceId(i, 0);
                    if (certId != 0) {
                        result.add(m۱۰۵۸۹a(resources.getStringArray(certId)));
                    }
                }
            } else {
                result.add(m۱۰۵۸۹a(resources.getStringArray(certsId)));
            }
            return result;
        } finally {
            typedArray.recycle();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static List<byte[]> m۱۰۵۸۹a(String[] stringArray) {
        List<byte[]> result = new ArrayList<>();
        for (String item : stringArray) {
            result.add(Base64.decode(item, 0));
        }
        return result;
    }

    /* renamed from: d, reason: contains not printable characters */
    private static c m۱۰۵۹۳d(XmlPullParser parser, Resources resources) {
        AttributeSet attrs = Xml.asAttributeSet(parser);
        TypedArray array = resources.obtainAttributes(attrs, Cd.FontFamilyFont);
        int weightAttr = array.hasValue(Cd.FontFamilyFont_fontWeight) ? Cd.FontFamilyFont_fontWeight : Cd.FontFamilyFont_android_fontWeight;
        int weight = array.getInt(weightAttr, 400);
        int styleAttr = array.hasValue(Cd.FontFamilyFont_fontStyle) ? Cd.FontFamilyFont_fontStyle : Cd.FontFamilyFont_android_fontStyle;
        boolean isItalic = 1 == array.getInt(styleAttr, 0);
        int ttcIndexAttr = array.hasValue(Cd.FontFamilyFont_ttcIndex) ? Cd.FontFamilyFont_ttcIndex : Cd.FontFamilyFont_android_ttcIndex;
        int variationSettingsAttr = array.hasValue(Cd.FontFamilyFont_fontVariationSettings) ? Cd.FontFamilyFont_fontVariationSettings : Cd.FontFamilyFont_android_fontVariationSettings;
        String variationSettings = array.getString(variationSettingsAttr);
        int ttcIndex = array.getInt(ttcIndexAttr, 0);
        int resourceAttr = array.hasValue(Cd.FontFamilyFont_font) ? Cd.FontFamilyFont_font : Cd.FontFamilyFont_android_font;
        int resourceId = array.getResourceId(resourceAttr, 0);
        String filename = array.getString(resourceAttr);
        array.recycle();
        while (parser.next() != 3) {
            m۱۰۵۹۰a(parser);
        }
        return new c(filename, weight, isItalic, variationSettings, ttcIndex, resourceId);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۰۵۹۰a(XmlPullParser parser) {
        int depth = 1;
        while (depth > 0) {
            int next = parser.next();
            if (next == 2) {
                depth++;
            } else if (next == 3) {
                depth--;
            }
        }
    }
}
