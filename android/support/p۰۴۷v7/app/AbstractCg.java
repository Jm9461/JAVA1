package android.support.p۰۴۷v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p۰۴۷v7.app.Cb;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.g  reason: invalid class name */
public abstract class AbstractCg {

    /* renamed from: c  reason: contains not printable characters */
    private static int f۱۰۹۷۹c = -1;

    /* renamed from: a  reason: contains not printable characters */
    public abstract <T extends View> T m۱۳۴۹۸a(int i);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۴۹۹a(Configuration configuration);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۵۰۰a(Bundle bundle);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۵۰۱a(Toolbar toolbar);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۵۰۲a(View view);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۵۰۳a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۵۰۴a(CharSequence charSequence);

    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۳۵۰۵a();

    /* renamed from: b  reason: contains not printable characters */
    public abstract Cb.AbstractCb m۱۳۵۰۶b();

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۳۵۰۷b(Bundle bundle);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۳۵۰۸b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: b  reason: contains not printable characters */
    public abstract boolean m۱۳۵۰۹b(int i);

    /* renamed from: c  reason: contains not printable characters */
    public abstract MenuInflater m۱۳۵۱۰c();

    /* renamed from: c  reason: contains not printable characters */
    public abstract void m۱۳۵۱۱c(int i);

    /* renamed from: c  reason: contains not printable characters */
    public abstract void m۱۳۵۱۲c(Bundle bundle);

    /* renamed from: d  reason: contains not printable characters */
    public abstract AbstractCa m۱۳۵۱۳d();

    /* renamed from: e  reason: contains not printable characters */
    public abstract void m۱۳۵۱۴e();

    /* renamed from: f  reason: contains not printable characters */
    public abstract void m۱۳۵۱۵f();

    /* renamed from: g  reason: contains not printable characters */
    public abstract void m۱۳۵۱۶g();

    /* renamed from: h  reason: contains not printable characters */
    public abstract void m۱۳۵۱۷h();

    /* renamed from: i  reason: contains not printable characters */
    public abstract void m۱۳۵۱۸i();

    /* renamed from: j  reason: contains not printable characters */
    public abstract void m۱۳۵۱۹j();

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCg m۱۳۴۹۵a(Activity activity, AbstractCf callback) {
        return new LayoutInflater$Factory2Ch(activity, activity.getWindow(), callback);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCg m۱۳۴۹۶a(Dialog dialog, AbstractCf callback) {
        return new LayoutInflater$Factory2Ch(dialog.getContext(), dialog.getWindow(), callback);
    }

    AbstractCg() {
    }

    /* renamed from: k  reason: contains not printable characters */
    public static int m۱۳۴۹۷k() {
        return f۱۰۹۷۹c;
    }
}
