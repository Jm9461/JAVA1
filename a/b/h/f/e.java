package a.b.h.f;

import a.b.h.f.b;
import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public class e extends b implements h.a {

    /* renamed from: e  reason: collision with root package name */
    private Context f۴۶۹e;

    /* renamed from: f  reason: collision with root package name */
    private ActionBarContextView f۴۷۰f;

    /* renamed from: g  reason: collision with root package name */
    private b.a f۴۷۱g;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference<View> f۴۷۲h;
    private boolean i;
    private h j;

    public e(Context context, ActionBarContextView view, b.a callback, boolean isFocusable) {
        this.f۴۶۹e = context;
        this.f۴۷۰f = view;
        this.f۴۷۱g = callback;
        h hVar = new h(view.getContext());
        hVar.c(1);
        this.j = hVar;
        this.j.a(this);
    }

    @Override // a.b.h.f.b
    public void b(CharSequence title) {
        this.f۴۷۰f.setTitle(title);
    }

    @Override // a.b.h.f.b
    public void a(CharSequence subtitle) {
        this.f۴۷۰f.setSubtitle(subtitle);
    }

    @Override // a.b.h.f.b
    public void b(int resId) {
        b(this.f۴۶۹e.getString(resId));
    }

    @Override // a.b.h.f.b
    public void a(int resId) {
        a((CharSequence) this.f۴۶۹e.getString(resId));
    }

    @Override // a.b.h.f.b
    public void a(boolean titleOptional) {
        super.a(titleOptional);
        this.f۴۷۰f.setTitleOptional(titleOptional);
    }

    @Override // a.b.h.f.b
    public boolean j() {
        return this.f۴۷۰f.b();
    }

    @Override // a.b.h.f.b
    public void a(View view) {
        this.f۴۷۰f.setCustomView(view);
        this.f۴۷۲h = view != null ? new WeakReference<>(view) : null;
    }

    @Override // a.b.h.f.b
    public void i() {
        this.f۴۷۱g.b(this, this.j);
    }

    @Override // a.b.h.f.b
    public void a() {
        if (!this.i) {
            this.i = true;
            this.f۴۷۰f.sendAccessibilityEvent(32);
            this.f۴۷۱g.a(this);
        }
    }

    @Override // a.b.h.f.b
    public Menu c() {
        return this.j;
    }

    @Override // a.b.h.f.b
    public CharSequence g() {
        return this.f۴۷۰f.getTitle();
    }

    @Override // a.b.h.f.b
    public CharSequence e() {
        return this.f۴۷۰f.getSubtitle();
    }

    @Override // a.b.h.f.b
    public View b() {
        WeakReference<View> weakReference = this.f۴۷۲h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // a.b.h.f.b
    public MenuInflater d() {
        return new g(this.f۴۷۰f.getContext());
    }

    @Override // android.support.v7.view.menu.h.a
    public boolean a(h menu, MenuItem item) {
        return this.f۴۷۱g.a(this, item);
    }

    @Override // android.support.v7.view.menu.h.a
    public void a(h menu) {
        i();
        this.f۴۷۰f.d();
    }
}
