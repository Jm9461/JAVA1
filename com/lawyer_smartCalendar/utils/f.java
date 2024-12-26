package com.lawyer_smartCalendar.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class f {

    /* renamed from: a  reason: collision with root package name */
    Context f۳۲۶۳a;

    public f(Context context) {
        this.f۳۲۶۳a = context;
    }

    public Typeface c() {
        return Typeface.createFromAsset(this.f۳۲۶۳a.getResources().getAssets(), "fonts/IRANSansMobile_UltraLight.ttf");
    }

    public Typeface a() {
        return Typeface.createFromAsset(this.f۳۲۶۳a.getResources().getAssets(), "fonts/IRANSansMobile_Light.ttf");
    }

    public Typeface b() {
        return Typeface.createFromAsset(this.f۳۲۶۳a.getResources().getAssets(), "fonts/IRANSansMobile_Medium.ttf");
    }

    public void a(Context context, View root) {
        try {
            if (root instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) root;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (!(viewGroup instanceof Spinner)) {
                        a(context, viewGroup.getChildAt(i));
                    }
                }
            } else if (root instanceof TextView) {
                ((TextView) root).setTypeface(a());
                ((TextView) root).setTextSize(15.0f);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
