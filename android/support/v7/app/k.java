package android.support.v7.app;

import a.b.h.f.i;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.u;
import android.support.v7.app.a;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.p;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.f0;
import android.support.v7.widget.k1;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class k extends a {

    /* renamed from: a  reason: collision with root package name */
    f0 f۱۵۹۸a;

    /* renamed from: b  reason: collision with root package name */
    boolean f۱۵۹۹b;

    /* renamed from: c  reason: collision with root package name */
    Window.Callback f۱۶۰۰c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f۱۶۰۱d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f۱۶۰۲e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<a.b> f۱۶۰۳f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f۱۶۰۴g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final Toolbar.f f۱۶۰۵h = new b();

    class a implements Runnable {
        a() {
        }

        public void run() {
            k.this.m();
        }
    }

    class b implements Toolbar.f {
        b() {
        }

        @Override // android.support.v7.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem item) {
            return k.this.f۱۶۰۰c.onMenuItemSelected(0, item);
        }
    }

    k(Toolbar toolbar, CharSequence title, Window.Callback windowCallback) {
        this.f۱۵۹۸a = new k1(toolbar, false);
        this.f۱۶۰۰c = new e(windowCallback);
        this.f۱۵۹۸a.setWindowCallback(this.f۱۶۰۰c);
        toolbar.setOnMenuItemClickListener(this.f۱۶۰۵h);
        this.f۱۵۹۸a.setWindowTitle(title);
    }

    public Window.Callback l() {
        return this.f۱۶۰۰c;
    }

    @Override // android.support.v7.app.a
    public void f(boolean enabled) {
    }

    @Override // android.support.v7.app.a
    public void a(float elevation) {
        u.a(this.f۱۵۹۸a.j(), elevation);
    }

    @Override // android.support.v7.app.a
    public Context h() {
        return this.f۱۵۹۸a.k();
    }

    @Override // android.support.v7.app.a
    public void b(Drawable indicator) {
        this.f۱۵۹۸a.b(indicator);
    }

    @Override // android.support.v7.app.a
    public void c(boolean enabled) {
    }

    @Override // android.support.v7.app.a
    public void b(int resId) {
        this.f۱۵۹۸a.c(resId);
    }

    @Override // android.support.v7.app.a
    public void g(boolean enabled) {
    }

    @Override // android.support.v7.app.a
    public void a(Configuration config) {
        super.a(config);
    }

    @Override // android.support.v7.app.a
    public void a(CharSequence title) {
        this.f۱۵۹۸a.setTitle(title);
    }

    @Override // android.support.v7.app.a
    public void b(CharSequence title) {
        this.f۱۵۹۸a.setWindowTitle(title);
    }

    public void a(int options, int mask) {
        this.f۱۵۹۸a.d((options & mask) | ((mask ^ -1) & this.f۱۵۹۸a.h()));
    }

    @Override // android.support.v7.app.a
    public void d(boolean showHomeAsUp) {
        a(showHomeAsUp ? 4 : 0, 4);
    }

    @Override // android.support.v7.app.a
    public void e(boolean showTitle) {
        a(showTitle ? 8 : 0, 8);
    }

    @Override // android.support.v7.app.a
    public void a(Drawable d2) {
        this.f۱۵۹۸a.a(d2);
    }

    @Override // android.support.v7.app.a
    public int g() {
        return this.f۱۵۹۸a.h();
    }

    @Override // android.support.v7.app.a
    public boolean k() {
        return this.f۱۵۹۸a.d();
    }

    @Override // android.support.v7.app.a
    public boolean e() {
        return this.f۱۵۹۸a.c();
    }

    @Override // android.support.v7.app.a
    public boolean i() {
        this.f۱۵۹۸a.j().removeCallbacks(this.f۱۶۰۴g);
        u.a(this.f۱۵۹۸a.j(), this.f۱۶۰۴g);
        return true;
    }

    @Override // android.support.v7.app.a
    public boolean f() {
        if (!this.f۱۵۹۸a.n()) {
            return false;
        }
        this.f۱۵۹۸a.collapseActionView();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        Menu menu = n();
        h mb = menu instanceof h ? (h) menu : null;
        if (mb != null) {
            mb.s();
        }
        try {
            menu.clear();
            if (!this.f۱۶۰۰c.onCreatePanelMenu(0, menu) || !this.f۱۶۰۰c.onPreparePanel(0, null, menu)) {
                menu.clear();
            }
        } finally {
            if (mb != null) {
                mb.r();
            }
        }
    }

    @Override // android.support.v7.app.a
    public boolean a(KeyEvent event) {
        if (event.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // android.support.v7.app.a
    public boolean a(int keyCode, KeyEvent ev) {
        Menu menu = n();
        if (menu == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(ev != null ? ev.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        menu.setQwertyMode(z);
        return menu.performShortcut(keyCode, ev, 0);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.v7.app.a
    public void j() {
        this.f۱۵۹۸a.j().removeCallbacks(this.f۱۶۰۴g);
    }

    @Override // android.support.v7.app.a
    public void b(boolean isVisible) {
        if (isVisible != this.f۱۶۰۲e) {
            this.f۱۶۰۲e = isVisible;
            int count = this.f۱۶۰۳f.size();
            for (int i = 0; i < count; i++) {
                this.f۱۶۰۳f.get(i).a(isVisible);
            }
        }
    }

    private class e extends i {
        public e(Window.Callback wrapped) {
            super(wrapped);
        }

        @Override // a.b.h.f.i
        public boolean onPreparePanel(int featureId, View view, Menu menu) {
            boolean result = super.onPreparePanel(featureId, view, menu);
            if (result) {
                k kVar = k.this;
                if (!kVar.f۱۵۹۹b) {
                    kVar.f۱۵۹۸a.e();
                    k.this.f۱۵۹۹b = true;
                }
            }
            return result;
        }

        @Override // a.b.h.f.i
        public View onCreatePanelView(int featureId) {
            if (featureId == 0) {
                return new View(k.this.f۱۵۹۸a.k());
            }
            return super.onCreatePanelView(featureId);
        }
    }

    private Menu n() {
        if (!this.f۱۶۰۱d) {
            this.f۱۵۹۸a.a(new c(), new d());
            this.f۱۶۰۱d = true;
        }
        return this.f۱۵۹۸a.i();
    }

    /* access modifiers changed from: private */
    public final class c implements p.a {

        /* renamed from: c  reason: collision with root package name */
        private boolean f۱۶۰۸c;

        c() {
        }

        @Override // android.support.v7.view.menu.p.a
        public boolean a(h subMenu) {
            Window.Callback callback = k.this.f۱۶۰۰c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, subMenu);
            return true;
        }

        @Override // android.support.v7.view.menu.p.a
        public void a(h menu, boolean allMenusAreClosing) {
            if (!this.f۱۶۰۸c) {
                this.f۱۶۰۸c = true;
                k.this.f۱۵۹۸a.g();
                Window.Callback callback = k.this.f۱۶۰۰c;
                if (callback != null) {
                    callback.onPanelClosed(108, menu);
                }
                this.f۱۶۰۸c = false;
            }
        }
    }

    /* access modifiers changed from: private */
    public final class d implements h.a {
        d() {
        }

        @Override // android.support.v7.view.menu.h.a
        public boolean a(h menu, MenuItem item) {
            return false;
        }

        @Override // android.support.v7.view.menu.h.a
        public void a(h menu) {
            k kVar = k.this;
            if (kVar.f۱۶۰۰c == null) {
                return;
            }
            if (kVar.f۱۵۹۸a.b()) {
                k.this.f۱۶۰۰c.onPanelClosed(108, menu);
            } else if (k.this.f۱۶۰۰c.onPreparePanel(0, null, menu)) {
                k.this.f۱۶۰۰c.onMenuOpened(108, menu);
            }
        }
    }
}
