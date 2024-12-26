package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: com.aurelhubert.ahbottomnavigation.a  reason: invalid class name */
public class Ca {

    /* renamed from: a  reason: contains not printable characters */
    private String f۱۳۴۶۲a = "";

    /* renamed from: b  reason: contains not printable characters */
    private Drawable f۱۳۴۶۳b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۳۴۶۴c = -7829368;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۳۴۶۵d = 0;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۳۴۶۶e = 0;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۳۴۶۷f = 0;

    public Ca(int titleRes, int drawableRes, int colorRes) {
        this.f۱۳۴۶۵d = titleRes;
        this.f۱۳۴۶۶e = drawableRes;
        this.f۱۳۴۶۷f = colorRes;
    }

    /* renamed from: c  reason: contains not printable characters */
    public String m۱۶۸۴۵c(Context context) {
        int i = this.f۱۳۴۶۵d;
        if (i != 0) {
            return context.getString(i);
        }
        return this.f۱۳۴۶۲a;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۶۸۴۳a(Context context) {
        int i = this.f۱۳۴۶۷f;
        if (i != 0) {
            return android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, i);
        }
        return this.f۱۳۴۶۴c;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Drawable m۱۶۸۴۴b(Context context) {
        int i = this.f۱۳۴۶۶e;
        if (i == 0) {
            return this.f۱۳۴۶۳b;
        }
        try {
            return p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(context, i);
        } catch (Resources.NotFoundException e) {
            return android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(context, this.f۱۳۴۶۶e);
        }
    }
}
