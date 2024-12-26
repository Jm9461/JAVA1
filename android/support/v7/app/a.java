package android.support.v7.app;

import a.b.h.a.j;
import a.b.h.f.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {

    public interface b {
        void a(boolean z);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public abstract void a(float f2);

    public abstract void a(Drawable drawable);

    public abstract void a(CharSequence charSequence);

    public abstract boolean a(int i, KeyEvent keyEvent);

    public abstract void b(int i);

    public abstract void b(Drawable drawable);

    public abstract void b(CharSequence charSequence);

    public abstract void b(boolean z);

    public abstract void c(boolean z);

    public abstract void d(boolean z);

    public abstract void e(boolean z);

    public abstract void f(boolean z);

    public abstract boolean f();

    public abstract int g();

    public abstract void g(boolean z);

    public abstract Context h();

    public void a(Configuration config) {
    }

    public a.b.h.f.b a(b.a callback) {
        return null;
    }

    public boolean k() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public boolean a(KeyEvent event) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void j() {
    }

    /* renamed from: android.support.v7.app.a$a  reason: collision with other inner class name */
    public static class C۰۰۳۴a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f۱۵۳۰a;

        public C۰۰۳۴a(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            this.f۱۵۳۰a = 0;
            TypedArray a2 = c2.obtainStyledAttributes(attrs, j.ActionBarLayout);
            this.f۱۵۳۰a = a2.getInt(j.ActionBarLayout_android_layout_gravity, 0);
            a2.recycle();
        }

        public C۰۰۳۴a(int width, int height) {
            super(width, height);
            this.f۱۵۳۰a = 0;
            this.f۱۵۳۰a = 8388627;
        }

        public C۰۰۳۴a(C۰۰۳۴a source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.f۱۵۳۰a = 0;
            this.f۱۵۳۰a = source.f۱۵۳۰a;
        }

        public C۰۰۳۴a(ViewGroup.LayoutParams source) {
            super(source);
            this.f۱۵۳۰a = 0;
        }
    }
}
