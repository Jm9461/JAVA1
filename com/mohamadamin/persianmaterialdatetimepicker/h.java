package com.mohamadamin.persianmaterialdatetimepicker;

import a.b.g.g.n;
import android.content.Context;
import android.graphics.Typeface;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final n<String, Typeface> f۳۳۶۰a = new n<>();

    public static Typeface a(Context c2, String name) {
        synchronized (f۳۳۶۰a) {
            if (!f۳۳۶۰a.containsKey(name)) {
                Typeface t = Typeface.createFromAsset(c2.getAssets(), String.format("fonts/%s.ttf", name));
                f۳۳۶۰a.put(name, t);
                return t;
            }
            return f۳۳۶۰a.get(name);
        }
    }
}
