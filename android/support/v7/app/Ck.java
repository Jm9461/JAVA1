package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.Cu;
import android.support.v7.app.AbstractCa;
import android.support.v7.view.menu.Ch;
import android.support.v7.view.menu.InterfaceCp;
import android.support.v7.widget.Ck1;
import android.support.v7.widget.InterfaceCf0;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi;

/* renamed from: android.support.v7.app.k, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ck extends AbstractCa {

    /* renamed from: a, reason: contains not printable characters */
    InterfaceCf0 f۱۱۰۷۸a;

    /* renamed from: b, reason: contains not printable characters */
    boolean f۱۱۰۷۹b;

    /* renamed from: c, reason: contains not printable characters */
    Window.Callback f۱۱۰۸۰c;

    /* renamed from: d, reason: contains not printable characters */
    private boolean f۱۱۰۸۱d;

    /* renamed from: e, reason: contains not printable characters */
    private boolean f۱۱۰۸۲e;

    /* renamed from: f, reason: contains not printable characters */
    private ArrayList<AbstractCa.b> f۱۱۰۸۳f = new ArrayList<>();

    /* renamed from: g, reason: contains not printable characters */
    private final Runnable f۱۱۰۸۴g = new a();

    /* renamed from: h, reason: contains not printable characters */
    private final Toolbar.InterfaceCf f۱۱۰۸۵h = new b();

    /* renamed from: android.support.v7.app.k$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Ck.this.m۱۱۵۹۳m();
        }
    }

    /* renamed from: android.support.v7.app.k$b */
    class b implements Toolbar.InterfaceCf {
        b() {
        }

        @Override // android.support.v7.widget.Toolbar.InterfaceCf
        public boolean onMenuItemClick(MenuItem item) {
            return Ck.this.f۱۱۰۸۰c.onMenuItemSelected(0, item);
        }
    }

    Ck(Toolbar toolbar, CharSequence title, Window.Callback windowCallback) {
        this.f۱۱۰۷۸a = new Ck1(toolbar, false);
        this.f۱۱۰۸۰c = new e(windowCallback);
        this.f۱۱۰۷۸a.setWindowCallback(this.f۱۱۰۸۰c);
        toolbar.setOnMenuItemClickListener(this.f۱۱۰۸۵h);
        this.f۱۱۰۷۸a.setWindowTitle(title);
    }

    /* renamed from: l, reason: contains not printable characters */
    public Window.Callback m۱۱۵۹۲l() {
        return this.f۱۱۰۸۰c;
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: f, reason: contains not printable characters */
    public void mo۱۱۶۳۴f(boolean enabled) {
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۱۶a(float elevation) {
        Cu.m۱۰۹۰۷a(this.f۱۱۰۷۸a.mo۱۳۳۲۷j(), elevation);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: h, reason: contains not printable characters */
    public Context mo۱۱۶۳۸h() {
        return this.f۱۱۰۷۸a.mo۱۳۳۲۸k();
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۶۲۶b(Drawable indicator) {
        this.f۱۱۰۷۸a.mo۱۳۳۱۲b(indicator);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۱۶۳۰c(boolean enabled) {
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۶۲۵b(int resId) {
        this.f۱۱۰۷۸a.mo۱۳۳۱۶c(resId);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: g, reason: contains not printable characters */
    public void mo۱۱۶۳۷g(boolean enabled) {
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۱۹a(Configuration config) {
        super.mo۱۱۶۱۹a(config);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۲۱a(CharSequence title) {
        this.f۱۱۰۷۸a.setTitle(title);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۶۲۷b(CharSequence title) {
        this.f۱۱۰۷۸a.setWindowTitle(title);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۵۷۰a(int options, int mask) {
        int currentOptions = this.f۱۱۰۷۸a.mo۱۳۳۲۵h();
        this.f۱۱۰۷۸a.mo۱۳۳۱۹d((options & mask) | ((mask ^ (-1)) & currentOptions));
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: d, reason: contains not printable characters */
    public void mo۱۱۶۳۲d(boolean showHomeAsUp) {
        m۱۱۵۷۰a(showHomeAsUp ? 4 : 0, 4);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: e, reason: contains not printable characters */
    public void mo۱۱۶۳۳e(boolean showTitle) {
        m۱۱۵۷۰a(showTitle ? 8 : 0, 8);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۶۲۰a(Drawable d2) {
        this.f۱۱۰۷۸a.mo۱۳۳۰۳a(d2);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: g, reason: contains not printable characters */
    public int mo۱۱۶۳۶g() {
        return this.f۱۱۰۷۸a.mo۱۳۳۲۵h();
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: k, reason: contains not printable characters */
    public boolean mo۱۱۵۹۱k() {
        return this.f۱۱۰۷۸a.mo۱۳۳۲۰d();
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: e, reason: contains not printable characters */
    public boolean mo۱۱۵۸۳e() {
        return this.f۱۱۰۷۸a.mo۱۳۳۱۸c();
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: i, reason: contains not printable characters */
    public boolean mo۱۱۵۸۹i() {
        this.f۱۱۰۷۸a.mo۱۳۳۲۷j().removeCallbacks(this.f۱۱۰۸۴g);
        Cu.m۱۰۹۱۹a(this.f۱۱۰۷۸a.mo۱۳۳۲۷j(), this.f۱۱۰۸۴g);
        return true;
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: f, reason: contains not printable characters */
    public boolean mo۱۱۶۳۵f() {
        if (this.f۱۱۰۷۸a.mo۱۳۳۳۱n()) {
            this.f۱۱۰۷۸a.collapseActionView();
            return true;
        }
        return false;
    }

    /* renamed from: m, reason: contains not printable characters */
    void m۱۱۵۹۳m() {
        Menu menu = m۱۱۵۶۸n();
        Ch mb = menu instanceof Ch ? (Ch) menu : null;
        if (mb != null) {
            mb.m۱۱۸۱۷s();
        }
        try {
            menu.clear();
            if (!this.f۱۱۰۸۰c.onCreatePanelMenu(0, menu) || !this.f۱۱۰۸۰c.onPreparePanel(0, null, menu)) {
                menu.clear();
            }
        } finally {
            if (mb != null) {
                mb.m۱۱۸۱۶r();
            }
        }
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۵۷۵a(KeyEvent event) {
        if (event.getAction() == 1) {
            mo۱۱۵۹۱k();
        }
        return true;
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۶۲۳a(int keyCode, KeyEvent ev) {
        Menu menu = m۱۱۵۶۸n();
        if (menu == null) {
            return false;
        }
        KeyCharacterMap kmap = KeyCharacterMap.load(ev != null ? ev.getDeviceId() : -1);
        menu.setQwertyMode(kmap.getKeyboardType() != 1);
        return menu.performShortcut(keyCode, ev, 0);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: j, reason: contains not printable characters */
    void mo۱۱۵۹۰j() {
        this.f۱۱۰۷۸a.mo۱۳۳۲۷j().removeCallbacks(this.f۱۱۰۸۴g);
    }

    @Override // android.support.v7.app.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۶۲۸b(boolean isVisible) {
        if (isVisible == this.f۱۱۰۸۲e) {
            return;
        }
        this.f۱۱۰۸۲e = isVisible;
        int count = this.f۱۱۰۸۳f.size();
        for (int i = 0; i < count; i++) {
            this.f۱۱۰۸۳f.get(i).m۱۱۳۶۳a(isVisible);
        }
    }

    /* renamed from: android.support.v7.app.k$e */
    private class e extends WindowCallbackCi {
        public e(Window.Callback wrapped) {
            super(wrapped);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi, android.view.Window.Callback
        public boolean onPreparePanel(int featureId, View view, Menu menu) {
            boolean result = super.onPreparePanel(featureId, view, menu);
            if (result) {
                Ck ck = Ck.this;
                if (!ck.f۱۱۰۷۹b) {
                    ck.f۱۱۰۷۸a.mo۱۳۳۲۱e();
                    Ck.this.f۱۱۰۷۹b = true;
                }
            }
            return result;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.WindowCallbackCi, android.view.Window.Callback
        public View onCreatePanelView(int featureId) {
            if (featureId == 0) {
                return new View(Ck.this.f۱۱۰۷۸a.mo۱۳۳۲۸k());
            }
            return super.onCreatePanelView(featureId);
        }
    }

    /* renamed from: n, reason: contains not printable characters */
    private Menu m۱۱۵۶۸n() {
        if (!this.f۱۱۰۸۱d) {
            this.f۱۱۰۷۸a.mo۱۳۳۰۴a(new c(), new d());
            this.f۱۱۰۸۱d = true;
        }
        return this.f۱۱۰۷۸a.mo۱۳۳۲۶i();
    }

    /* renamed from: android.support.v7.app.k$c */
    private final class c implements InterfaceCp.a {

        /* renamed from: c, reason: contains not printable characters */
        private boolean f۱۱۰۸۸c;

        c() {
        }

        @Override // android.support.v7.view.menu.InterfaceCp.a
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۲۹۷۷a(Ch subMenu) {
            Window.Callback callback = Ck.this.f۱۱۰۸۰c;
            if (callback != null) {
                callback.onMenuOpened(108, subMenu);
                return true;
            }
            return false;
        }

        @Override // android.support.v7.view.menu.InterfaceCp.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۲۹۷۶a(Ch menu, boolean allMenusAreClosing) {
            if (this.f۱۱۰۸۸c) {
                return;
            }
            this.f۱۱۰۸۸c = true;
            Ck.this.f۱۱۰۷۸a.mo۱۳۳۲۴g();
            Window.Callback callback = Ck.this.f۱۱۰۸۰c;
            if (callback != null) {
                callback.onPanelClosed(108, menu);
            }
            this.f۱۱۰۸۸c = false;
        }
    }

    /* renamed from: android.support.v7.app.k$d */
    private final class d implements Ch.a {
        d() {
        }

        @Override // android.support.v7.view.menu.Ch.a
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۳۵۶۶a(Ch menu, MenuItem item) {
            return false;
        }

        @Override // android.support.v7.view.menu.Ch.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۵۶۵a(Ch menu) {
            Ck ck = Ck.this;
            if (ck.f۱۱۰۸۰c != null) {
                if (ck.f۱۱۰۷۸a.mo۱۳۳۱۵b()) {
                    Ck.this.f۱۱۰۸۰c.onPanelClosed(108, menu);
                } else if (Ck.this.f۱۱۰۸۰c.onPreparePanel(0, null, menu)) {
                    Ck.this.f۱۱۰۸۰c.onMenuOpened(108, menu);
                }
            }
        }
    }
}
