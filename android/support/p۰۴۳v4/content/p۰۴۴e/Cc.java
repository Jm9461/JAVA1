package android.support.p۰۴۳v4.content.p۰۴۴e;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.content.res.FontResourcesParserCompat;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e.Ca;

/* renamed from: android.support.v4.content.e.c  reason: invalid class name */
public class Cc {

    /* renamed from: android.support.v4.content.e.c$a  reason: invalid class name */
    public interface AbstractCa {
    }

    /* renamed from: android.support.v4.content.e.c$d  reason: invalid class name */
    public static final class Cd implements AbstractCa {

        /* renamed from: a  reason: contains not printable characters */
        private final Ca f۱۰۴۷۲a;

        /* renamed from: b  reason: contains not printable characters */
        private final int f۱۰۴۷۳b;

        /* renamed from: c  reason: contains not printable characters */
        private final int f۱۰۴۷۴c;

        public Cd(Ca request, int strategy, int timeoutMs) {
            this.f۱۰۴۷۲a = request;
            this.f۱۰۴۷۴c = strategy;
            this.f۱۰۴۷۳b = timeoutMs;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Ca m۱۲۶۷۲b() {
            return this.f۱۰۴۷۲a;
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۲۶۷۱a() {
            return this.f۱۰۴۷۴c;
        }

        /* renamed from: c  reason: contains not printable characters */
        public int m۱۲۶۷۳c() {
            return this.f۱۰۴۷۳b;
        }
    }

    /* renamed from: android.support.v4.content.e.c$c  reason: invalid class name */
    public static final class Cc {

        /* renamed from: a  reason: contains not printable characters */
        private final String f۱۰۴۶۶a;

        /* renamed from: b  reason: contains not printable characters */
        private int f۱۰۴۶۷b;

        /* renamed from: c  reason: contains not printable characters */
        private boolean f۱۰۴۶۸c;

        /* renamed from: d  reason: contains not printable characters */
        private String f۱۰۴۶۹d;

        /* renamed from: e  reason: contains not printable characters */
        private int f۱۰۴۷۰e;

        /* renamed from: f  reason: contains not printable characters */
        private int f۱۰۴۷۱f;

        public Cc(String fileName, int weight, boolean italic, String variationSettings, int ttcIndex, int resourceId) {
            this.f۱۰۴۶۶a = fileName;
            this.f۱۰۴۶۷b = weight;
            this.f۱۰۴۶۸c = italic;
            this.f۱۰۴۶۹d = variationSettings;
            this.f۱۰۴۷۰e = ttcIndex;
            this.f۱۰۴۷۱f = resourceId;
        }

        /* renamed from: a  reason: contains not printable characters */
        public String m۱۲۶۶۵a() {
            return this.f۱۰۴۶۶a;
        }

        /* renamed from: e  reason: contains not printable characters */
        public int m۱۲۶۶۹e() {
            return this.f۱۰۴۶۷b;
        }

        /* renamed from: f  reason: contains not printable characters */
        public boolean m۱۲۶۷۰f() {
            return this.f۱۰۴۶۸c;
        }

        /* renamed from: d  reason: contains not printable characters */
        public String m۱۲۶۶۸d() {
            return this.f۱۰۴۶۹d;
        }

        /* renamed from: c  reason: contains not printable characters */
        public int m۱۲۶۶۷c() {
            return this.f۱۰۴۷۰e;
        }

        /* renamed from: b  reason: contains not printable characters */
        public int m۱۲۶۶۶b() {
            return this.f۱۰۴۷۱f;
        }
    }

    /* renamed from: android.support.v4.content.e.c$b  reason: invalid class name */
    public static final class Cb implements AbstractCa {

        /* renamed from: a  reason: contains not printable characters */
        private final Cc[] f۱۰۴۶۵a;

        public Cb(Cc[] entries) {
            this.f۱۰۴۶۵a = entries;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cc[] m۱۲۶۶۴a() {
            return this.f۱۰۴۶۵a;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCa m۱۲۶۵۷a(XmlPullParser parser, Resources resources) {
        int type;
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type == 2) {
            return m۱۲۶۶۱b(parser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b  reason: contains not printable characters */
    private static AbstractCa m۱۲۶۶۱b(XmlPullParser parser, Resources resources) {
        parser.require(2, null, "font-family");
        if (parser.getName().equals("font-family")) {
            return m۱۲۶۶۲c(parser, resources);
        }
        m۱۲۶۶۰a(parser);
        return null;
    }

    /* renamed from: c  reason: contains not printable characters */
    private static AbstractCa m۱۲۶۶۲c(XmlPullParser parser, Resources resources) {
        TypedArray array = resources.obtainAttributes(Xml.asAttributeSet(parser), p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamily);
        String authority = array.getString(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamily_fontProviderAuthority);
        String providerPackage = array.getString(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamily_fontProviderPackage);
        String query = array.getString(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamily_fontProviderQuery);
        int certsId = array.getResourceId(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamily_fontProviderCerts, 0);
        int strategy = array.getInteger(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamily_fontProviderFetchStrategy, 1);
        int timeoutMs = array.getInteger(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamily_fontProviderFetchTimeout, 500);
        array.recycle();
        if (authority == null || providerPackage == null || query == null) {
            List<FontResourcesParserCompat.FontFileResourceEntry> fonts = new ArrayList<>();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    if (parser.getName().equals("font")) {
                        fonts.add(m۱۲۶۶۳d(parser, resources));
                    } else {
                        m۱۲۶۶۰a(parser);
                    }
                }
            }
            if (fonts.isEmpty()) {
                return null;
            }
            return new Cb((Cc[]) fonts.toArray(new Cc[fonts.size()]));
        }
        while (parser.next() != 3) {
            m۱۲۶۶۰a(parser);
        }
        return new Cd(new Ca(authority, providerPackage, query, m۱۲۶۵۸a(resources, certsId)), strategy, timeoutMs);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۲۶۵۶a(TypedArray typedArray, int index) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(index);
        }
        TypedValue tv = new TypedValue();
        typedArray.getValue(index, tv);
        return tv.type;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static List<List<byte[]>> m۱۲۶۵۸a(Resources resources, int certsId) {
        if (certsId == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArray = resources.obtainTypedArray(certsId);
        try {
            if (typedArray.length() == 0) {
                return Collections.emptyList();
            }
            List<List<byte[]>> result = new ArrayList<>();
            if (m۱۲۶۵۶a(typedArray, 0) == 1) {
                for (int i = 0; i < typedArray.length(); i++) {
                    int certId = typedArray.getResourceId(i, 0);
                    if (certId != 0) {
                        result.add(m۱۲۶۵۹a(resources.getStringArray(certId)));
                    }
                }
            } else {
                result.add(m۱۲۶۵۹a(resources.getStringArray(certsId)));
            }
            typedArray.recycle();
            return result;
        } finally {
            typedArray.recycle();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static List<byte[]> m۱۲۶۵۹a(String[] stringArray) {
        List<byte[]> result = new ArrayList<>();
        for (String item : stringArray) {
            result.add(Base64.decode(item, 0));
        }
        return result;
    }

    /* renamed from: d  reason: contains not printable characters */
    private static Cc m۱۲۶۶۳d(XmlPullParser parser, Resources resources) {
        TypedArray array = resources.obtainAttributes(Xml.asAttributeSet(parser), p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont);
        int weight = array.getInt(array.hasValue(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_fontWeight) ? p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_fontWeight : p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_android_fontWeight, 400);
        boolean isItalic = 1 == array.getInt(array.hasValue(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_fontStyle) ? p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_fontStyle : p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_android_fontStyle, 0);
        int ttcIndexAttr = array.hasValue(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_ttcIndex) ? p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_ttcIndex : p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_android_ttcIndex;
        String variationSettings = array.getString(array.hasValue(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_fontVariationSettings) ? p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_fontVariationSettings : p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_android_fontVariationSettings);
        int ttcIndex = array.getInt(ttcIndexAttr, 0);
        int resourceAttr = array.hasValue(p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_font) ? p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_font : p۰۰۰a.p۰۰۵b.p۰۰۶a.Cd.FontFamilyFont_android_font;
        int resourceId = array.getResourceId(resourceAttr, 0);
        String filename = array.getString(resourceAttr);
        array.recycle();
        while (parser.next() != 3) {
            m۱۲۶۶۰a(parser);
        }
        return new Cc(filename, weight, isItalic, variationSettings, ttcIndex, resourceId);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۲۶۶۰a(XmlPullParser parser) {
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
