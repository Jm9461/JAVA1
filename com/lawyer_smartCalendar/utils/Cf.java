package com.lawyer_smartCalendar.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

/* renamed from: com.lawyer_smartCalendar.utils.f  reason: invalid class name */
public class Cf {

    /* renamed from: a  reason: contains not printable characters */
    Context f۱۴۷۸۹a;

    public Cf(Context context) {
        this.f۱۴۷۸۹a = context;
    }

    /* renamed from: c  reason: contains not printable characters */
    public Typeface m۱۷۷۴۹c() {
        return Typeface.createFromAsset(this.f۱۴۷۸۹a.getResources().getAssets(), "fonts/IRANSansMobile_UltraLight.ttf");
    }

    /* renamed from: a  reason: contains not printable characters */
    public Typeface m۱۷۷۴۶a() {
        return Typeface.createFromAsset(this.f۱۴۷۸۹a.getResources().getAssets(), "fonts/IRANSansMobile_Light.ttf");
    }

    /* renamed from: b  reason: contains not printable characters */
    public Typeface m۱۷۷۴۸b() {
        return Typeface.createFromAsset(this.f۱۴۷۸۹a.getResources().getAssets(), "fonts/IRANSansMobile_Medium.ttf");
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۷۴۷a(Context context, View root) {
        try {
            if (root instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) root;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (!(viewGroup instanceof Spinner)) {
                        m۱۷۷۴۷a(context, viewGroup.getChildAt(i));
                    }
                }
            } else if (root instanceof TextView) {
                ((TextView) root).setTypeface(m۱۷۷۴۶a());
                ((TextView) root).setTextSize(15.0f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
