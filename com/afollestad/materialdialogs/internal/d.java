package com.afollestad.materialdialogs.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import b.a.a.e;

public class d {
    private static d w;

    /* renamed from: a  reason: collision with root package name */
    public boolean f۲۷۵۳a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f۲۷۵۴b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f۲۷۵۵c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f۲۷۵۶d = null;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f۲۷۵۷e = null;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f۲۷۵۸f = null;

    /* renamed from: g  reason: collision with root package name */
    public int f۲۷۵۹g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f۲۷۶۰h = 0;
    public Drawable i = null;
    public int j = 0;
    public int k = 0;
    public ColorStateList l = null;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public e r;
    public e s;
    public e t;
    public e u;
    public e v;

    public d() {
        e eVar = e.START;
        this.r = eVar;
        this.s = eVar;
        this.t = e.END;
        e eVar2 = e.START;
        this.u = eVar2;
        this.v = eVar2;
    }

    public static d a(boolean createIfNull) {
        if (w == null && createIfNull) {
            w = new d();
        }
        return w;
    }

    public static d a() {
        return a(true);
    }
}
