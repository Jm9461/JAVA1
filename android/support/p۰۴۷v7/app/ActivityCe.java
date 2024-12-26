package android.support.p۰۴۷v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.p۰۴۳v4.app.ActivityCg;
import android.support.p۰۴۳v4.app.Ca;
import android.support.p۰۴۳v4.app.Cf0;
import android.support.p۰۴۳v4.app.Cv;
import android.support.p۰۴۷v7.app.Cb;
import android.support.p۰۴۷v7.widget.Co1;
import android.support.p۰۴۷v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb;

/* renamed from: android.support.v7.app.e  reason: invalid class name */
public class ActivityCe extends ActivityCg implements AbstractCf, Cf0.AbstractCa, Cb.AbstractCc {

    /* renamed from: o  reason: contains not printable characters */
    private AbstractCg f۱۰۹۷۶o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۰۹۷۷p = 0;

    /* renamed from: q  reason: contains not printable characters */
    private Resources f۱۰۹۷۸q;

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0
    public void onCreate(Bundle savedInstanceState) {
        int i;
        AbstractCg delegate = m۱۳۴۸۸i();
        delegate.m۱۳۵۱۴e();
        delegate.m۱۳۵۰۰a(savedInstanceState);
        if (delegate.m۱۳۵۰۵a() && (i = this.f۱۰۹۷۷p) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f۱۰۹۷۷p, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(savedInstanceState);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int resid) {
        super.setTheme(resid);
        this.f۱۰۹۷۷p = resid;
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        m۱۳۴۸۸i().m۱۳۵۰۷b(savedInstanceState);
    }

    /* renamed from: j  reason: contains not printable characters */
    public AbstractCa m۱۳۴۸۹j() {
        return m۱۳۴۸۸i().m۱۳۵۱۳d();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۴۸۱a(Toolbar toolbar) {
        m۱۳۴۸۸i().m۱۳۵۰۱a(toolbar);
    }

    public MenuInflater getMenuInflater() {
        return m۱۳۴۸۸i().m۱۳۵۱۰c();
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        m۱۳۴۸۸i().m۱۳۵۱۱c(layoutResID);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m۱۳۴۸۸i().m۱۳۵۰۲a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        m۱۳۴۸۸i().m۱۳۵۰۸b(view, params);
    }

    public void addContentView(View view, ViewGroup.LayoutParams params) {
        m۱۳۴۸۸i().m۱۳۵۰۳a(view, params);
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        m۱۳۴۸۸i().m۱۳۴۹۹a(newConfig);
        if (this.f۱۰۹۷۸q != null) {
            this.f۱۰۹۷۸q.updateConfiguration(newConfig, super.getResources().getDisplayMetrics());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onPostResume() {
        super.onPostResume();
        m۱۳۴۸۸i().m۱۳۵۱۷h();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onStart() {
        super.onStart();
        m۱۳۴۸۸i().m۱۳۵۱۸i();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onStop() {
        super.onStop();
        m۱۳۴۸۸i().m۱۳۵۱۹j();
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int id) {
        return (T) m۱۳۴۸۸i().m۱۳۴۹۸a(id);
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public final boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        AbstractCa ab = m۱۳۴۸۹j();
        if (item.getItemId() != 16908332 || ab == null || (ab.m۱۳۴۲۷g() & 4) == 0) {
            return false;
        }
        return m۱۳۴۹۱l();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onDestroy() {
        super.onDestroy();
        m۱۳۴۸۸i().m۱۳۵۱۶g();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        m۱۳۴۸۸i().m۱۳۵۰۴a(title);
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۳۴۸۷h() {
        m۱۳۴۸۸i().m۱۳۵۱۵f();
    }

    public void invalidateOptionsMenu() {
        m۱۳۴۸۸i().m۱۳۵۱۵f();
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCf
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۴۸۲b(AbstractCb mode) {
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۴۷۸a(AbstractCb mode) {
    }

    @Override // android.support.p۰۴۷v7.app.AbstractCf
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCb m۱۳۴۷۷a(AbstractCb.AbstractCa callback) {
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۴۸۰a(Cf0 builder) {
        builder.m۱۲۲۴۵a((Activity) this);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۴۸۳b(Cf0 builder) {
    }

    /* renamed from: l  reason: contains not printable characters */
    public boolean m۱۳۴۹۱l() {
        Intent upIntent = m۱۳۴۸۵c();
        if (upIntent == null) {
            return false;
        }
        if (m۱۳۴۸۴b(upIntent)) {
            Cf0 b = Cf0.m۱۲۲۴۴a((Context) this);
            m۱۳۴۸۰a(b);
            m۱۳۴۸۳b(b);
            b.m۱۲۲۴۸a();
            try {
                Ca.m۱۲۰۶۰a((Activity) this);
                return true;
            } catch (IllegalStateException e) {
                finish();
                return true;
            }
        } else {
            m۱۳۴۷۹a(upIntent);
            return true;
        }
    }

    @Override // android.support.p۰۴۳v4.app.Cf0.AbstractCa
    /* renamed from: c  reason: contains not printable characters */
    public Intent m۱۳۴۸۵c() {
        return Cv.m۱۲۵۵۹a(this);
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۴۸۴b(Intent targetIntent) {
        return Cv.m۱۲۵۶۴b(this, targetIntent);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۴۷۹a(Intent upIntent) {
        Cv.m۱۲۵۶۱a(this, upIntent);
    }

    public void onContentChanged() {
        m۱۳۴۹۰k();
    }

    @Deprecated
    /* renamed from: k  reason: contains not printable characters */
    public void m۱۳۴۹۰k() {
    }

    @Override // android.support.p۰۴۷v7.app.Cb.AbstractCc
    /* renamed from: d  reason: contains not printable characters */
    public Cb.AbstractCb m۱۳۴۸۶d() {
        return m۱۳۴۸۸i().m۱۳۵۰۶b();
    }

    public boolean onMenuOpened(int featureId, Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCg
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.app.ActivityCg, android.support.p۰۴۳v4.app.ActivityCe0
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        m۱۳۴۸۸i().m۱۳۵۱۲c(outState);
    }

    /* renamed from: i  reason: contains not printable characters */
    public AbstractCg m۱۳۴۸۸i() {
        if (this.f۱۰۹۷۶o == null) {
            this.f۱۰۹۷۶o = AbstractCg.m۱۳۴۹۵a(this, this);
        }
        return this.f۱۰۹۷۶o;
    }

    @Override // android.support.p۰۴۳v4.app.ActivityCe0
    public boolean dispatchKeyEvent(KeyEvent event) {
        int keyCode = event.getKeyCode();
        AbstractCa actionBar = m۱۳۴۸۹j();
        if (keyCode != 82 || actionBar == null || !actionBar.m۱۳۴۱۶a(event)) {
            return super.dispatchKeyEvent(event);
        }
        return true;
    }

    public Resources getResources() {
        if (this.f۱۰۹۷۸q == null && Co1.m۱۵۴۷۹b()) {
            this.f۱۰۹۷۸q = new Co1(this, super.getResources());
        }
        Resources resources = this.f۱۰۹۷۸q;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۴۷۶a(int keycode, KeyEvent event) {
        Window currentWindow;
        if (Build.VERSION.SDK_INT >= 26 || event.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(event.getMetaState()) || event.getRepeatCount() != 0 || KeyEvent.isModifierKey(event.getKeyCode()) || (currentWindow = getWindow()) == null || currentWindow.getDecorView() == null || !currentWindow.getDecorView().dispatchKeyShortcutEvent(event)) {
            return false;
        }
        return true;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (m۱۳۴۷۶a(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void openOptionsMenu() {
        AbstractCa actionBar = m۱۳۴۸۹j();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (actionBar == null || !actionBar.m۱۳۴۳۲k()) {
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        AbstractCa actionBar = m۱۳۴۸۹j();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (actionBar == null || !actionBar.m۱۳۴۲۴e()) {
            super.closeOptionsMenu();
        }
    }
}
