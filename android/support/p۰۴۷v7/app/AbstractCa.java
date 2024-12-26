package android.support.p۰۴۷v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb;

/* renamed from: android.support.v7.app.a  reason: invalid class name */
public abstract class AbstractCa {

    /* renamed from: android.support.v7.app.a$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۳۴۳۳a(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$c  reason: invalid class name */
    public static abstract class AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        public abstract CharSequence m۱۳۴۳۴a();

        /* renamed from: b  reason: contains not printable characters */
        public abstract View m۱۳۴۳۵b();

        /* renamed from: c  reason: contains not printable characters */
        public abstract Drawable m۱۳۴۳۶c();

        /* renamed from: d  reason: contains not printable characters */
        public abstract CharSequence m۱۳۴۳۷d();

        /* renamed from: e  reason: contains not printable characters */
        public abstract void m۱۳۴۳۸e();
    }

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۴۱۱a(float f);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۴۱۳a(Drawable drawable);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۴۱۴a(CharSequence charSequence);

    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۳۴۱۵a(int i, KeyEvent keyEvent);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۳۴۱۷b(int i);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۳۴۱۸b(Drawable drawable);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۳۴۱۹b(CharSequence charSequence);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۳۴۲۰b(boolean z);

    /* renamed from: c  reason: contains not printable characters */
    public abstract void m۱۳۴۲۱c(boolean z);

    /* renamed from: d  reason: contains not printable characters */
    public abstract void m۱۳۴۲۲d(boolean z);

    /* renamed from: e  reason: contains not printable characters */
    public abstract void m۱۳۴۲۳e(boolean z);

    /* renamed from: f  reason: contains not printable characters */
    public abstract void m۱۳۴۲۵f(boolean z);

    /* renamed from: f  reason: contains not printable characters */
    public abstract boolean m۱۳۴۲۶f();

    /* renamed from: g  reason: contains not printable characters */
    public abstract int m۱۳۴۲۷g();

    /* renamed from: g  reason: contains not printable characters */
    public abstract void m۱۳۴۲۸g(boolean z);

    /* renamed from: h  reason: contains not printable characters */
    public abstract Context m۱۳۴۲۹h();

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۴۱۲a(Configuration config) {
    }

    /* renamed from: a  reason: contains not printable characters */
    public p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb m۱۳۴۱۰a(AbstractCb.AbstractCa callback) {
        return null;
    }

    /* renamed from: k  reason: contains not printable characters */
    public boolean m۱۳۴۳۲k() {
        return false;
    }

    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۳۴۲۴e() {
        return false;
    }

    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۳۴۳۰i() {
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۴۱۶a(KeyEvent event) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j  reason: contains not printable characters */
    public void m۱۳۴۳۱j() {
    }

    /* renamed from: android.support.v7.app.a$a  reason: invalid class name */
    public static class Ca extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: contains not printable characters */
        public int f۱۰۹۵۳a;

        public Ca(Context c, AttributeSet attrs) {
            super(c, attrs);
            this.f۱۰۹۵۳a = 0;
            TypedArray a = c.obtainStyledAttributes(attrs, Cj.ActionBarLayout);
            this.f۱۰۹۵۳a = a.getInt(Cj.ActionBarLayout_android_layout_gravity, 0);
            a.recycle();
        }

        public Ca(int width, int height) {
            super(width, height);
            this.f۱۰۹۵۳a = 0;
            this.f۱۰۹۵۳a = 8388627;
        }

        public Ca(Ca source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.f۱۰۹۵۳a = 0;
            this.f۱۰۹۵۳a = source.f۱۰۹۵۳a;
        }

        public Ca(ViewGroup.LayoutParams source) {
            super(source);
            this.f۱۰۹۵۳a = 0;
        }
    }
}
