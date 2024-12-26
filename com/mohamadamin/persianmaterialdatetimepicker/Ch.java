package com.mohamadamin.persianmaterialdatetimepicker;

import android.content.Context;
import android.graphics.Typeface;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cn;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.h  reason: invalid class name */
public class Ch {

    /* renamed from: a  reason: contains not printable characters */
    private static final Cn<String, Typeface> f۱۴۹۷۱a = new Cn<>();

    /* renamed from: a  reason: contains not printable characters */
    public static Typeface m۱۷۹۹۳a(Context c, String name) {
        synchronized (f۱۴۹۷۱a) {
            if (!f۱۴۹۷۱a.containsKey(name)) {
                Typeface t = Typeface.createFromAsset(c.getAssets(), String.format("fonts/%s.ttf", name));
                f۱۴۹۷۱a.put(name, t);
                return t;
            }
            return f۱۴۹۷۱a.get(name);
        }
    }
}
