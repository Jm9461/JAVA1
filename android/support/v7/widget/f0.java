package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.y;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.p;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;

public interface f0 {
    y a(int i, long j);

    void a(int i);

    void a(Drawable drawable);

    void a(p.a aVar, h.a aVar2);

    void a(b1 b1Var);

    void a(Menu menu, p.a aVar);

    void a(boolean z);

    boolean a();

    void b(int i);

    void b(Drawable drawable);

    void b(boolean z);

    boolean b();

    void c(int i);

    boolean c();

    void collapseActionView();

    void d(int i);

    boolean d();

    void e();

    boolean f();

    void g();

    CharSequence getTitle();

    int h();

    Menu i();

    ViewGroup j();

    Context k();

    int l();

    void m();

    boolean n();

    void o();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
