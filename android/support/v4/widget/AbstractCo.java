package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.o, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCo extends AbstractCd {

    /* renamed from: k, reason: contains not printable characters */
    private int f۱۰۷۹۸k;

    /* renamed from: l, reason: contains not printable characters */
    private int f۱۰۷۹۹l;

    /* renamed from: m, reason: contains not printable characters */
    private LayoutInflater f۱۰۸۰۰m;

    @Deprecated
    public AbstractCo(Context context, int layout, Cursor c2, boolean autoRequery) {
        super(context, c2, autoRequery);
        this.f۱۰۷۹۹l = layout;
        this.f۱۰۷۹۸k = layout;
        this.f۱۰۸۰۰m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.support.v4.widget.AbstractCd
    /* renamed from: b, reason: contains not printable characters */
    public View mo۱۳۱۰۹b(Context context, Cursor cursor, ViewGroup parent) {
        return this.f۱۰۸۰۰m.inflate(this.f۱۰۷۹۸k, parent, false);
    }

    @Override // android.support.v4.widget.AbstractCd
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۱۲۲۶a(Context context, Cursor cursor, ViewGroup parent) {
        return this.f۱۰۸۰۰m.inflate(this.f۱۰۷۹۹l, parent, false);
    }
}
