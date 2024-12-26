package android.support.v4.content.e;

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

public class c {

    public interface a {
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        private final a.b.g.e.a f۱۲۷۴a;

        /* renamed from: b  reason: collision with root package name */
        private final int f۱۲۷۵b;

        /* renamed from: c  reason: collision with root package name */
        private final int f۱۲۷۶c;

        public d(a.b.g.e.a request, int strategy, int timeoutMs) {
            this.f۱۲۷۴a = request;
            this.f۱۲۷۶c = strategy;
            this.f۱۲۷۵b = timeoutMs;
        }

        public a.b.g.e.a b() {
            return this.f۱۲۷۴a;
        }

        public int a() {
            return this.f۱۲۷۶c;
        }

        public int c() {
            return this.f۱۲۷۵b;
        }
    }

    /* renamed from: android.support.v4.content.e.c$c  reason: collision with other inner class name */
    public static final class C۰۰۲۸c {

        /* renamed from: a  reason: collision with root package name */
        private final String f۱۲۶۸a;

        /* renamed from: b  reason: collision with root package name */
        private int f۱۲۶۹b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f۱۲۷۰c;

        /* renamed from: d  reason: collision with root package name */
        private String f۱۲۷۱d;

        /* renamed from: e  reason: collision with root package name */
        private int f۱۲۷۲e;

        /* renamed from: f  reason: collision with root package name */
        private int f۱۲۷۳f;

        public C۰۰۲۸c(String fileName, int weight, boolean italic, String variationSettings, int ttcIndex, int resourceId) {
            this.f۱۲۶۸a = fileName;
            this.f۱۲۶۹b = weight;
            this.f۱۲۷۰c = italic;
            this.f۱۲۷۱d = variationSettings;
            this.f۱۲۷۲e = ttcIndex;
            this.f۱۲۷۳f = resourceId;
        }

        public String a() {
            return this.f۱۲۶۸a;
        }

        public int e() {
            return this.f۱۲۶۹b;
        }

        public boolean f() {
            return this.f۱۲۷۰c;
        }

        public String d() {
            return this.f۱۲۷۱d;
        }

        public int c() {
            return this.f۱۲۷۲e;
        }

        public int b() {
            return this.f۱۲۷۳f;
        }
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final C۰۰۲۸c[] f۱۲۶۷a;

        public b(C۰۰۲۸c[] entries) {
            this.f۱۲۶۷a = entries;
        }

        public C۰۰۲۸c[] a() {
            return this.f۱۲۶۷a;
        }
    }

    public static a a(XmlPullParser parser, Resources resources) {
        int type;
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type == 2) {
            return b(parser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    private static a b(XmlPullParser parser, Resources resources) {
        parser.require(2, null, "font-family");
        if (parser.getName().equals("font-family")) {
            return c(parser, resources);
        }
        a(parser);
        return null;
    }

    private static a c(XmlPullParser parser, Resources resources) {
        TypedArray array = resources.obtainAttributes(Xml.asAttributeSet(parser), a.b.a.d.FontFamily);
        String authority = array.getString(a.b.a.d.FontFamily_fontProviderAuthority);
        String providerPackage = array.getString(a.b.a.d.FontFamily_fontProviderPackage);
        String query = array.getString(a.b.a.d.FontFamily_fontProviderQuery);
        int certsId = array.getResourceId(a.b.a.d.FontFamily_fontProviderCerts, 0);
        int strategy = array.getInteger(a.b.a.d.FontFamily_fontProviderFetchStrategy, 1);
        int timeoutMs = array.getInteger(a.b.a.d.FontFamily_fontProviderFetchTimeout, 500);
        array.recycle();
        if (authority == null || providerPackage == null || query == null) {
            List<FontResourcesParserCompat.FontFileResourceEntry> fonts = new ArrayList<>();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    if (parser.getName().equals("font")) {
                        fonts.add(d(parser, resources));
                    } else {
                        a(parser);
                    }
                }
            }
            if (fonts.isEmpty()) {
                return null;
            }
            return new b((C۰۰۲۸c[]) fonts.toArray(new C۰۰۲۸c[fonts.size()]));
        }
        while (parser.next() != 3) {
            a(parser);
        }
        return new d(new a.b.g.e.a(authority, providerPackage, query, a(resources, certsId)), strategy, timeoutMs);
    }

    private static int a(TypedArray typedArray, int index) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(index);
        }
        TypedValue tv = new TypedValue();
        typedArray.getValue(index, tv);
        return tv.type;
    }

    public static List<List<byte[]>> a(Resources resources, int certsId) {
        if (certsId == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArray = resources.obtainTypedArray(certsId);
        try {
            if (typedArray.length() == 0) {
                return Collections.emptyList();
            }
            List<List<byte[]>> result = new ArrayList<>();
            if (a(typedArray, 0) == 1) {
                for (int i = 0; i < typedArray.length(); i++) {
                    int certId = typedArray.getResourceId(i, 0);
                    if (certId != 0) {
                        result.add(a(resources.getStringArray(certId)));
                    }
                }
            } else {
                result.add(a(resources.getStringArray(certsId)));
            }
            typedArray.recycle();
            return result;
        } finally {
            typedArray.recycle();
        }
    }

    private static List<byte[]> a(String[] stringArray) {
        List<byte[]> result = new ArrayList<>();
        for (String item : stringArray) {
            result.add(Base64.decode(item, 0));
        }
        return result;
    }

    private static C۰۰۲۸c d(XmlPullParser parser, Resources resources) {
        TypedArray array = resources.obtainAttributes(Xml.asAttributeSet(parser), a.b.a.d.FontFamilyFont);
        int weight = array.getInt(array.hasValue(a.b.a.d.FontFamilyFont_fontWeight) ? a.b.a.d.FontFamilyFont_fontWeight : a.b.a.d.FontFamilyFont_android_fontWeight, 400);
        boolean isItalic = 1 == array.getInt(array.hasValue(a.b.a.d.FontFamilyFont_fontStyle) ? a.b.a.d.FontFamilyFont_fontStyle : a.b.a.d.FontFamilyFont_android_fontStyle, 0);
        int ttcIndexAttr = array.hasValue(a.b.a.d.FontFamilyFont_ttcIndex) ? a.b.a.d.FontFamilyFont_ttcIndex : a.b.a.d.FontFamilyFont_android_ttcIndex;
        String variationSettings = array.getString(array.hasValue(a.b.a.d.FontFamilyFont_fontVariationSettings) ? a.b.a.d.FontFamilyFont_fontVariationSettings : a.b.a.d.FontFamilyFont_android_fontVariationSettings);
        int ttcIndex = array.getInt(ttcIndexAttr, 0);
        int resourceAttr = array.hasValue(a.b.a.d.FontFamilyFont_font) ? a.b.a.d.FontFamilyFont_font : a.b.a.d.FontFamilyFont_android_font;
        int resourceId = array.getResourceId(resourceAttr, 0);
        String filename = array.getString(resourceAttr);
        array.recycle();
        while (parser.next() != 3) {
            a(parser);
        }
        return new C۰۰۲۸c(filename, weight, isItalic, variationSettings, ttcIndex, resourceId);
    }

    private static void a(XmlPullParser parser) {
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
