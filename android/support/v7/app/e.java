package android.support.v7.app;

import a.b.h.f.b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.a;
import android.support.v4.app.f0;
import android.support.v4.app.g;
import android.support.v4.app.v;
import android.support.v7.app.b;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.o1;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class e extends g implements f, f0.a, b.c {
    private g o;
    private int p = 0;
    private Resources q;

    /* access modifiers changed from: protected */
    @Override // android.support.v4.app.g, android.support.v4.app.e0
    public void onCreate(Bundle savedInstanceState) {
        int i;
        g delegate = i();
        delegate.e();
        delegate.a(savedInstanceState);
        if (delegate.a() && (i = this.p) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.p, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(savedInstanceState);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int resid) {
        super.setTheme(resid);
        this.p = resid;
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        i().b(savedInstanceState);
    }

    public a j() {
        return i().d();
    }

    public void a(Toolbar toolbar) {
        i().a(toolbar);
    }

    public MenuInflater getMenuInflater() {
        return i().c();
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        i().c(layoutResID);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        i().b(view, params);
    }

    public void addContentView(View view, ViewGroup.LayoutParams params) {
        i().a(view, params);
    }

    @Override // android.support.v4.app.g
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        i().a(newConfig);
        if (this.q != null) {
            this.q.updateConfiguration(newConfig, super.getResources().getDisplayMetrics());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v4.app.g
    public void onPostResume() {
        super.onPostResume();
        i().h();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v4.app.g
    public void onStart() {
        super.onStart();
        i().i();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v4.app.g
    public void onStop() {
        super.onStop();
        i().j();
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int id) {
        return (T) i().a(id);
    }

    @Override // android.support.v4.app.g
    public final boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        a ab = j();
        if (item.getItemId() != 16908332 || ab == null || (ab.g() & 4) == 0) {
            return false;
        }
        return l();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v4.app.g
    public void onDestroy() {
        super.onDestroy();
        i().g();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        i().a(title);
    }

    @Override // android.support.v4.app.g
    public void h() {
        i().f();
    }

    public void invalidateOptionsMenu() {
        i().f();
    }

    @Override // android.support.v7.app.f
    public void b(a.b.h.f.b mode) {
    }

    @Override // android.support.v7.app.f
    public void a(a.b.h.f.b mode) {
    }

    @Override // android.support.v7.app.f
    public a.b.h.f.b a(b.a callback) {
        return null;
    }

    public void a(f0 builder) {
        builder.a((Activity) this);
    }

    public void b(f0 builder) {
    }

    public boolean l() {
        Intent upIntent = c();
        if (upIntent == null) {
            return false;
        }
        if (b(upIntent)) {
            f0 b2 = f0.a((Context) this);
            a(b2);
            b(b2);
            b2.a();
            try {
                a.a((Activity) this);
                return true;
            } catch (IllegalStateException e2) {
                finish();
                return true;
            }
        } else {
            a(upIntent);
            return true;
        }
    }

    @Override // android.support.v4.app.f0.a
    public Intent c() {
        return v.a(this);
    }

    public boolean b(Intent targetIntent) {
        return v.b(this, targetIntent);
    }

    public void a(Intent upIntent) {
        v.a(this, upIntent);
    }

    public void onContentChanged() {
        k();
    }

    @Deprecated
    public void k() {
    }

    @Override // android.support.v7.app.b.c
    public b.AbstractC۰۰۳۵b d() {
        return i().b();
    }

    public boolean onMenuOpened(int featureId, Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }

    @Override // android.support.v4.app.g
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v4.app.g, android.support.v4.app.e0
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        i().c(outState);
    }

    public g i() {
        if (this.o == null) {
            this.o = g.a(this, this);
        }
        return this.o;
    }

    @Override // android.support.v4.app.e0
    public boolean dispatchKeyEvent(KeyEvent event) {
        int keyCode = event.getKeyCode();
        a actionBar = j();
        if (keyCode != 82 || actionBar == null || !actionBar.a(event)) {
            return super.dispatchKeyEvent(event);
        }
        return true;
    }

    public Resources getResources() {
        if (this.q == null && o1.b()) {
            this.q = new o1(this, super.getResources());
        }
        Resources resources = this.q;
        return resources == null ? super.getResources() : resources;
    }

    private boolean a(int keycode, KeyEvent event) {
        Window currentWindow;
        if (Build.VERSION.SDK_INT >= 26 || event.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(event.getMetaState()) || event.getRepeatCount() != 0 || KeyEvent.isModifierKey(event.getKeyCode()) || (currentWindow = getWindow()) == null || currentWindow.getDecorView() == null || !currentWindow.getDecorView().dispatchKeyShortcutEvent(event)) {
            return false;
        }
        return true;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (a(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void openOptionsMenu() {
        a actionBar = j();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (actionBar == null || !actionBar.k()) {
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        a actionBar = j();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (actionBar == null || !actionBar.e()) {
            super.closeOptionsMenu();
        }
    }
}
