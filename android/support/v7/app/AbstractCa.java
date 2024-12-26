package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb;

/* renamed from: android.support.v7.app.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCa {

    /* renamed from: android.support.v7.app.a$b */
    public interface b {
        /* renamed from: a, reason: contains not printable characters */
        void m۱۱۳۶۳a(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$c */
    public static abstract class c {
        /* renamed from: a, reason: contains not printable characters */
        public abstract CharSequence m۱۱۳۶۴a();

        /* renamed from: b, reason: contains not printable characters */
        public abstract View m۱۱۳۶۵b();

        /* renamed from: c, reason: contains not printable characters */
        public abstract Drawable m۱۱۳۶۶c();

        /* renamed from: d, reason: contains not printable characters */
        public abstract CharSequence m۱۱۳۶۷d();

        /* renamed from: e, reason: contains not printable characters */
        public abstract void m۱۱۳۶۸e();
    }

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۶۱۶a(float f2);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۶۲۰a(Drawable drawable);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۶۲۱a(CharSequence charSequence);

    /* renamed from: a, reason: contains not printable characters */
    public abstract boolean mo۱۱۶۲۳a(int i, KeyEvent keyEvent);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۱۶۲۵b(int i);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۱۶۲۶b(Drawable drawable);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۱۶۲۷b(CharSequence charSequence);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۱۶۲۸b(boolean z);

    /* renamed from: c, reason: contains not printable characters */
    public abstract void mo۱۱۶۳۰c(boolean z);

    /* renamed from: d, reason: contains not printable characters */
    public abstract void mo۱۱۶۳۲d(boolean z);

    /* renamed from: e, reason: contains not printable characters */
    public abstract void mo۱۱۶۳۳e(boolean z);

    /* renamed from: f, reason: contains not printable characters */
    public abstract void mo۱۱۶۳۴f(boolean z);

    /* renamed from: f, reason: contains not printable characters */
    public abstract boolean mo۱۱۶۳۵f();

    /* renamed from: g, reason: contains not printable characters */
    public abstract int mo۱۱۶۳۶g();

    /* renamed from: g, reason: contains not printable characters */
    public abstract void mo۱۱۶۳۷g(boolean z);

    /* renamed from: h, reason: contains not printable characters */
    public abstract Context mo۱۱۶۳۸h();

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۱۹a(Configuration config) {
    }

    /* renamed from: a, reason: contains not printable characters */
    public AbstractCb mo۱۱۶۱۴a(AbstractCb.a callback) {
        return null;
    }

    /* renamed from: k, reason: contains not printable characters */
    public boolean mo۱۱۵۹۱k() {
        return false;
    }

    /* renamed from: e, reason: contains not printable characters */
    public boolean mo۱۱۵۸۳e() {
        return false;
    }

    /* renamed from: i, reason: contains not printable characters */
    public boolean mo۱۱۵۸۹i() {
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۵۷۵a(KeyEvent event) {
        return false;
    }

    /* renamed from: j, reason: contains not printable characters */
    void mo۱۱۵۹۰j() {
    }

    /* renamed from: android.support.v7.app.a$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: contains not printable characters */
        public int f۱۰۹۵۳a;

        public a(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            this.f۱۰۹۵۳a = 0;
            TypedArray a2 = c2.obtainStyledAttributes(attrs, Cj.ActionBarLayout);
            this.f۱۰۹۵۳a = a2.getInt(Cj.ActionBarLayout_android_layout_gravity, 0);
            a2.recycle();
        }

        public a(int width, int height) {
            super(width, height);
            this.f۱۰۹۵۳a = 0;
            this.f۱۰۹۵۳a = 8388627;
        }

        public a(a source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.f۱۰۹۵۳a = 0;
            this.f۱۰۹۵۳a = source.f۱۰۹۵۳a;
        }

        public a(ViewGroup.LayoutParams source) {
            super(source);
            this.f۱۰۹۵۳a = 0;
        }
    }
}
