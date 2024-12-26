package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCg;
import android.support.v4.app.Ca;
import android.support.v4.app.Cf0;
import android.support.v4.app.Cv;
import android.support.v7.app.Cb;
import android.support.v7.widget.Co1;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.AbstractCb;

/* renamed from: android.support.v7.app.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class ActivityCe extends ActivityCg implements InterfaceCf, Cf0.a, Cb.c {

    /* renamed from: o, reason: contains not printable characters */
    private AbstractCg f۱۰۹۷۶o;

    /* renamed from: p, reason: contains not printable characters */
    private int f۱۰۹۷۷p = 0;

    /* renamed from: q, reason: contains not printable characters */
    private Resources f۱۰۹۷۸q;

    @Override // android.support.v4.app.ActivityCg, android.support.v4.app.ActivityCe0, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        int i;
        AbstractCg delegate = m۱۱۴۱۸i();
        delegate.mo۱۱۵۰۳e();
        delegate.mo۱۱۴۷۸a(savedInstanceState);
        if (delegate.mo۱۱۴۸۶a() && (i = this.f۱۰۹۷۷p) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f۱۰۹۷۷p, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(savedInstanceState);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int resid) {
        super.setTheme(resid);
        this.f۱۰۹۷۷p = resid;
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        m۱۱۴۱۸i().mo۱۱۴۹۲b(savedInstanceState);
    }

    /* renamed from: j, reason: contains not printable characters */
    public AbstractCa m۱۱۴۱۹j() {
        return m۱۱۴۱۸i().mo۱۱۵۰۱d();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۴۱۱a(Toolbar toolbar) {
        m۱۱۴۱۸i().mo۱۱۴۸۱a(toolbar);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m۱۱۴۱۸i().mo۱۱۴۹۷c();
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        m۱۱۴۱۸i().mo۱۱۴۹۸c(layoutResID);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m۱۱۴۱۸i().mo۱۱۴۸۲a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        m۱۱۴۱۸i().mo۱۱۴۹۴b(view, params);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        m۱۱۴۱۸i().mo۱۱۴۸۳a(view, params);
    }

    @Override // android.support.v4.app.ActivityCg, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        m۱۱۴۱۸i().mo۱۱۴۷۷a(newConfig);
        if (this.f۱۰۹۷۸q != null) {
            DisplayMetrics newMetrics = super.getResources().getDisplayMetrics();
            this.f۱۰۹۷۸q.updateConfiguration(newConfig, newMetrics);
        }
    }

    @Override // android.support.v4.app.ActivityCg, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        m۱۱۴۱۸i().mo۱۱۵۰۹h();
    }

    @Override // android.support.v4.app.ActivityCg, android.app.Activity
    protected void onStart() {
        super.onStart();
        m۱۱۴۱۸i().mo۱۱۵۱۲i();
    }

    @Override // android.support.v4.app.ActivityCg, android.app.Activity
    protected void onStop() {
        super.onStop();
        m۱۱۴۱۸i().mo۱۱۵۱۳j();
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) m۱۱۴۱۸i().mo۱۱۴۷۴a(i);
    }

    @Override // android.support.v4.app.ActivityCg, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        AbstractCa ab = m۱۱۴۱۹j();
        if (item.getItemId() == 16908332 && ab != null && (ab.mo۱۱۶۳۶g() & 4) != 0) {
            return m۱۱۴۲۱l();
        }
        return false;
    }

    @Override // android.support.v4.app.ActivityCg, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m۱۱۴۱۸i().mo۱۱۵۰۷g();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        m۱۱۴۱۸i().mo۱۱۴۸۵a(title);
    }

    @Override // android.support.v4.app.ActivityCg
    /* renamed from: h, reason: contains not printable characters */
    public void mo۱۱۴۱۷h() {
        m۱۱۴۱۸i().mo۱۱۵۰۶f();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m۱۱۴۱۸i().mo۱۱۵۰۶f();
    }

    @Override // android.support.v7.app.InterfaceCf
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۵۶۱b(AbstractCb mode) {
    }

    @Override // android.support.v7.app.InterfaceCf
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۵۵۸a(AbstractCb mode) {
    }

    @Override // android.support.v7.app.InterfaceCf
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCb mo۱۱۵۵۶a(AbstractCb.a callback) {
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۴۱۰a(Cf0 builder) {
        builder.m۱۰۱۷۵a((Activity) this);
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۱۴۱۳b(Cf0 builder) {
    }

    /* renamed from: l, reason: contains not printable characters */
    public boolean m۱۱۴۲۱l() {
        Intent upIntent = mo۱۱۴۱۵c();
        if (upIntent != null) {
            if (m۱۱۴۱۴b(upIntent)) {
                Cf0 b2 = Cf0.m۱۰۱۷۴a((Context) this);
                m۱۱۴۱۰a(b2);
                m۱۱۴۱۳b(b2);
                b2.m۱۰۱۷۸a();
                try {
                    Ca.m۹۹۹۰a((Activity) this);
                    return true;
                } catch (IllegalStateException e2) {
                    finish();
                    return true;
                }
            }
            m۱۱۴۰۹a(upIntent);
            return true;
        }
        return false;
    }

    @Override // android.support.v4.app.Cf0.a
    /* renamed from: c, reason: contains not printable characters */
    public Intent mo۱۱۴۱۵c() {
        return Cv.m۱۰۴۸۹a(this);
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۱۱۴۱۴b(Intent targetIntent) {
        return Cv.m۱۰۴۹۴b(this, targetIntent);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۴۰۹a(Intent upIntent) {
        Cv.m۱۰۴۹۱a(this, upIntent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m۱۱۴۲۰k();
    }

    @Deprecated
    /* renamed from: k, reason: contains not printable characters */
    public void m۱۱۴۲۰k() {
    }

    @Override // android.support.v7.app.Cb.c
    /* renamed from: d, reason: contains not printable characters */
    public Cb.b mo۱۱۴۱۶d() {
        return m۱۱۴۱۸i().mo۱۱۴۹۱b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int featureId, Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }

    @Override // android.support.v4.app.ActivityCg, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.support.v4.app.ActivityCg, android.support.v4.app.ActivityCe0, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        m۱۱۴۱۸i().mo۱۱۴۹۹c(outState);
    }

    /* renamed from: i, reason: contains not printable characters */
    public AbstractCg m۱۱۴۱۸i() {
        if (this.f۱۰۹۷۶o == null) {
            this.f۱۰۹۷۶o = AbstractCg.m۱۱۴۲۵a(this, this);
        }
        return this.f۱۰۹۷۶o;
    }

    @Override // android.support.v4.app.ActivityCe0, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        int keyCode = event.getKeyCode();
        AbstractCa actionBar = m۱۱۴۱۹j();
        if (keyCode == 82 && actionBar != null && actionBar.mo۱۱۵۷۵a(event)) {
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f۱۰۹۷۸q == null && Co1.m۱۳۴۰۹b()) {
            this.f۱۰۹۷۸q = new Co1(this, super.getResources());
        }
        Resources resources = this.f۱۰۹۷۸q;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۱۴۰۶a(int keycode, KeyEvent event) {
        Window currentWindow;
        if (Build.VERSION.SDK_INT < 26 && !event.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(event.getMetaState()) && event.getRepeatCount() == 0 && !KeyEvent.isModifierKey(event.getKeyCode()) && (currentWindow = getWindow()) != null && currentWindow.getDecorView() != null) {
            View decorView = currentWindow.getDecorView();
            if (decorView.dispatchKeyShortcutEvent(event)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (m۱۱۴۰۶a(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractCa actionBar = m۱۱۴۱۹j();
        if (getWindow().hasFeature(0)) {
            if (actionBar == null || !actionBar.mo۱۱۵۹۱k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractCa actionBar = m۱۱۴۱۹j();
        if (getWindow().hasFeature(0)) {
            if (actionBar == null || !actionBar.mo۱۱۵۸۳e()) {
                super.closeOptionsMenu();
            }
        }
    }
}
