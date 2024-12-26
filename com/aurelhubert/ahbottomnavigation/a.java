package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f۲۸۰۴a = "";

    /* renamed from: b  reason: collision with root package name */
    private Drawable f۲۸۰۵b;

    /* renamed from: c  reason: collision with root package name */
    private int f۲۸۰۶c = -7829368;

    /* renamed from: d  reason: collision with root package name */
    private int f۲۸۰۷d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f۲۸۰۸e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f۲۸۰۹f = 0;

    public a(int titleRes, int drawableRes, int colorRes) {
        this.f۲۸۰۷d = titleRes;
        this.f۲۸۰۸e = drawableRes;
        this.f۲۸۰۹f = colorRes;
    }

    public String c(Context context) {
        int i = this.f۲۸۰۷d;
        if (i != 0) {
            return context.getString(i);
        }
        return this.f۲۸۰۴a;
    }

    public int a(Context context) {
        int i = this.f۲۸۰۹f;
        if (i != 0) {
            return android.support.v4.content.a.a(context, i);
        }
        return this.f۲۸۰۶c;
    }

    public Drawable b(Context context) {
        int i = this.f۲۸۰۸e;
        if (i == 0) {
            return this.f۲۸۰۵b;
        }
        try {
            return a.b.h.c.a.a.c(context, i);
        } catch (Resources.NotFoundException e2) {
            return android.support.v4.content.a.c(context, this.f۲۸۰۸e);
        }
    }
}
