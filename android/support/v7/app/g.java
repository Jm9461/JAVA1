package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.b;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class g {

    /* renamed from: c  reason: collision with root package name */
    private static int f۱۵۵۲c = -1;

    public abstract <T extends View> T a(int i);

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract boolean a();

    public abstract b.AbstractC۰۰۳۵b b();

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean b(int i);

    public abstract MenuInflater c();

    public abstract void c(int i);

    public abstract void c(Bundle bundle);

    public abstract a d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public static g a(Activity activity, f callback) {
        return new h(activity, activity.getWindow(), callback);
    }

    public static g a(Dialog dialog, f callback) {
        return new h(dialog.getContext(), dialog.getWindow(), callback);
    }

    g() {
    }

    public static int k() {
        return f۱۵۵۲c;
    }
}
