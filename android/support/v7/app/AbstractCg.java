package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.Cb;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCg {

    /* renamed from: c, reason: contains not printable characters */
    private static int f۱۰۹۷۹c = -1;

    /* renamed from: a, reason: contains not printable characters */
    public abstract <T extends View> T mo۱۱۴۷۴a(int i);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۴۷۷a(Configuration configuration);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۴۷۸a(Bundle bundle);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۴۸۱a(Toolbar toolbar);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۴۸۲a(View view);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۴۸۳a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۴۸۵a(CharSequence charSequence);

    /* renamed from: a, reason: contains not printable characters */
    public abstract boolean mo۱۱۴۸۶a();

    /* renamed from: b, reason: contains not printable characters */
    public abstract Cb.b mo۱۱۴۹۱b();

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۱۴۹۲b(Bundle bundle);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۱۴۹۴b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: b, reason: contains not printable characters */
    public abstract boolean mo۱۱۴۹۵b(int i);

    /* renamed from: c, reason: contains not printable characters */
    public abstract MenuInflater mo۱۱۴۹۷c();

    /* renamed from: c, reason: contains not printable characters */
    public abstract void mo۱۱۴۹۸c(int i);

    /* renamed from: c, reason: contains not printable characters */
    public abstract void mo۱۱۴۹۹c(Bundle bundle);

    /* renamed from: d, reason: contains not printable characters */
    public abstract AbstractCa mo۱۱۵۰۱d();

    /* renamed from: e, reason: contains not printable characters */
    public abstract void mo۱۱۵۰۳e();

    /* renamed from: f, reason: contains not printable characters */
    public abstract void mo۱۱۵۰۶f();

    /* renamed from: g, reason: contains not printable characters */
    public abstract void mo۱۱۵۰۷g();

    /* renamed from: h, reason: contains not printable characters */
    public abstract void mo۱۱۵۰۹h();

    /* renamed from: i, reason: contains not printable characters */
    public abstract void mo۱۱۵۱۲i();

    /* renamed from: j, reason: contains not printable characters */
    public abstract void mo۱۱۵۱۳j();

    /* renamed from: a, reason: contains not printable characters */
    public static AbstractCg m۱۱۴۲۵a(Activity activity, InterfaceCf callback) {
        return new LayoutInflaterFactory2Ch(activity, activity.getWindow(), callback);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static AbstractCg m۱۱۴۲۶a(Dialog dialog, InterfaceCf callback) {
        return new LayoutInflaterFactory2Ch(dialog.getContext(), dialog.getWindow(), callback);
    }

    AbstractCg() {
    }

    /* renamed from: k, reason: contains not printable characters */
    public static int m۱۱۴۲۷k() {
        return f۱۰۹۷۹c;
    }
}
