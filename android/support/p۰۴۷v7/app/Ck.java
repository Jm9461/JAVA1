package android.support.p۰۴۷v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.app.AbstractCa;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.widget.AbstractCf0;
import android.support.p۰۴۷v7.widget.Ck1;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.k  reason: invalid class name */
public class Ck extends AbstractCa {

    /* renamed from: a  reason: contains not printable characters */
    AbstractCf0 f۱۱۰۷۸a;

    /* renamed from: b  reason: contains not printable characters */
    boolean f۱۱۰۷۹b;

    /* renamed from: c  reason: contains not printable characters */
    Window.Callback f۱۱۰۸۰c;

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۱۰۸۱d;

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۱۱۰۸۲e;

    /* renamed from: f  reason: contains not printable characters */
    private ArrayList<AbstractCa.AbstractCb> f۱۱۰۸۳f = new ArrayList<>();

    /* renamed from: g  reason: contains not printable characters */
    private final Runnable f۱۱۰۸۴g = new RunnableCa();

    /* renamed from: h  reason: contains not printable characters */
    private final Toolbar.AbstractCf f۱۱۰۸۵h = new Cb();

    /* renamed from: android.support.v7.app.k$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            Ck.this.m۱۳۶۶۳m();
        }
    }

    /* renamed from: android.support.v7.app.k$b  reason: invalid class name */
    class Cb implements Toolbar.AbstractCf {
        Cb() {
        }

        @Override // android.support.p۰۴۷v7.widget.Toolbar.AbstractCf
        public boolean onMenuItemClick(MenuItem item) {
            return Ck.this.f۱۱۰۸۰c.onMenuItemSelected(0, item);
        }
    }

    Ck(Toolbar toolbar, CharSequence title, Window.Callback windowCallback) {
        this.f۱۱۰۷۸a = new Ck1(toolbar, false);
        this.f۱۱۰۸۰c = new Ce(windowCallback);
        this.f۱۱۰۷۸a.setWindowCallback(this.f۱۱۰۸۰c);
        toolbar.setOnMenuItemClickListener(this.f۱۱۰۸۵h);
        this.f۱۱۰۷۸a.setWindowTitle(title);
    }

    /* renamed from: l  reason: contains not printable characters */
    public Window.Callback m۱۳۶۶۲l() {
        return this.f۱۱۰۸۰c;
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۳۶۵۴f(boolean enabled) {
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۳۹a(float elevation) {
        Cu.m۱۲۹۷۷a(this.f۱۱۰۷۸a.m۱۵۲۲۷j(), elevation);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: h  reason: contains not printable characters */
    public Context m۱۳۶۵۸h() {
        return this.f۱۱۰۷۸a.m۱۵۲۲۸k();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۶۴۷b(Drawable indicator) {
        this.f۱۱۰۷۸a.m۱۵۲۱۵b(indicator);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۶۵۰c(boolean enabled) {
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۶۴۶b(int resId) {
        this.f۱۱۰۷۸a.m۱۵۲۱۸c(resId);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۳۶۵۷g(boolean enabled) {
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۴۱a(Configuration config) {
        super.m۱۳۴۱۲a(config);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۴۳a(CharSequence title) {
        this.f۱۱۰۷۸a.setTitle(title);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۶۴۸b(CharSequence title) {
        this.f۱۱۰۷۸a.setWindowTitle(title);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۴۰a(int options, int mask) {
        this.f۱۱۰۷۸a.m۱۵۲۲۰d((options & mask) | ((mask ^ -1) & this.f۱۱۰۷۸a.m۱۵۲۲۵h()));
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۳۶۵۱d(boolean showHomeAsUp) {
        m۱۳۶۴۰a(showHomeAsUp ? 4 : 0, 4);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۳۶۵۲e(boolean showTitle) {
        m۱۳۶۴۰a(showTitle ? 8 : 0, 8);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۶۴۲a(Drawable d) {
        this.f۱۱۰۷۸a.m۱۵۲۰۸a(d);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: g  reason: contains not printable characters */
    public int m۱۳۶۵۶g() {
        return this.f۱۱۰۷۸a.m۱۵۲۲۵h();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: k  reason: contains not printable characters */
    public boolean m۱۳۶۶۱k() {
        return this.f۱۱۰۷۸a.m۱۵۲۲۱d();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۳۶۵۳e() {
        return this.f۱۱۰۷۸a.m۱۵۲۱۹c();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۳۶۵۹i() {
        this.f۱۱۰۷۸a.m۱۵۲۲۷j().removeCallbacks(this.f۱۱۰۸۴g);
        Cu.m۱۲۹۸۹a(this.f۱۱۰۷۸a.m۱۵۲۲۷j(), this.f۱۱۰۸۴g);
        return true;
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۳۶۵۵f() {
        if (!this.f۱۱۰۷۸a.m۱۵۲۳۱n()) {
            return false;
        }
        this.f۱۱۰۷۸a.collapseActionView();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m  reason: contains not printable characters */
    public void m۱۳۶۶۳m() {
        Menu menu = m۱۳۶۳۸n();
        Ch mb = menu instanceof Ch ? (Ch) menu : null;
        if (mb != null) {
            mb.m۱۳۸۸۷s();
        }
        try {
            menu.clear();
            if (!this.f۱۱۰۸۰c.onCreatePanelMenu(0, menu) || !this.f۱۱۰۸۰c.onPreparePanel(0, null, menu)) {
                menu.clear();
            }
        } finally {
            if (mb != null) {
                mb.m۱۳۸۸۶r();
            }
        }
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۶۴۵a(KeyEvent event) {
        if (event.getAction() == 1) {
            m۱۳۶۶۱k();
        }
        return true;
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۶۴۴a(int keyCode, KeyEvent ev) {
        Menu menu = m۱۳۶۳۸n();
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
    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: j  reason: contains not printable characters */
    public void m۱۳۶۶۰j() {
        this.f۱۱۰۷۸a.m۱۵۲۲۷j().removeCallbacks(this.f۱۱۰۸۴g);
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۶۴۹b(boolean isVisible) {
        if (isVisible != this.f۱۱۰۸۲e) {
            this.f۱۱۰۸۲e = isVisible;
            int count = this.f۱۱۰۸۳f.size();
            for (int i = 0; i < count; i++) {
                this.f۱۱۰۸۳f.get(i).m۱۳۴۳۳a(isVisible);
            }
        }
    }

    /* renamed from: android.support.v7.app.k$e  reason: invalid class name */
    private class Ce extends Window$CallbackCi {
        public Ce(Window.Callback wrapped) {
            super(wrapped);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi
        public boolean onPreparePanel(int featureId, View view, Menu menu) {
            boolean result = super.onPreparePanel(featureId, view, menu);
            if (result) {
                Ck kVar = Ck.this;
                if (!kVar.f۱۱۰۷۹b) {
                    kVar.f۱۱۰۷۸a.m۱۵۲۲۲e();
                    Ck.this.f۱۱۰۷۹b = true;
                }
            }
            return result;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Window$CallbackCi
        public View onCreatePanelView(int featureId) {
            if (featureId == 0) {
                return new View(Ck.this.f۱۱۰۷۸a.m۱۵۲۲۸k());
            }
            return super.onCreatePanelView(featureId);
        }
    }

    /* renamed from: n  reason: contains not printable characters */
    private Menu m۱۳۶۳۸n() {
        if (!this.f۱۱۰۸۱d) {
            this.f۱۱۰۷۸a.m۱۵۲۰۹a(new Cc(), new Cd());
            this.f۱۱۰۸۱d = true;
        }
        return this.f۱۱۰۷۸a.m۱۵۲۲۶i();
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.app.k$c  reason: invalid class name */
    public final class Cc implements AbstractCp.AbstractCa {

        /* renamed from: c  reason: contains not printable characters */
        private boolean f۱۱۰۸۸c;

        Cc() {
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۶۶۵a(Ch subMenu) {
            Window.Callback callback = Ck.this.f۱۱۰۸۰c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, subMenu);
            return true;
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۶۶۴a(Ch menu, boolean allMenusAreClosing) {
            if (!this.f۱۱۰۸۸c) {
                this.f۱۱۰۸۸c = true;
                Ck.this.f۱۱۰۷۸a.m۱۵۲۲۴g();
                Window.Callback callback = Ck.this.f۱۱۰۸۰c;
                if (callback != null) {
                    callback.onPanelClosed(108, menu);
                }
                this.f۱۱۰۸۸c = false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.app.k$d  reason: invalid class name */
    public final class Cd implements Ch.AbstractCa {
        Cd() {
        }

        @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۶۶۷a(Ch menu, MenuItem item) {
            return false;
        }

        @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۶۶۶a(Ch menu) {
            Ck kVar = Ck.this;
            if (kVar.f۱۱۰۸۰c == null) {
                return;
            }
            if (kVar.f۱۱۰۷۸a.m۱۵۲۱۷b()) {
                Ck.this.f۱۱۰۸۰c.onPanelClosed(108, menu);
            } else if (Ck.this.f۱۱۰۸۰c.onPreparePanel(0, null, menu)) {
                Ck.this.f۱۱۰۸۰c.onMenuOpened(108, menu);
            }
        }
    }
}
