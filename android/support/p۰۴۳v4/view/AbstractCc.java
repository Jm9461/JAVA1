package android.support.p۰۴۳v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.view.c  reason: invalid class name */
public abstract class AbstractCc {

    /* renamed from: a  reason: contains not printable characters */
    private AbstractCb f۱۰۵۸۹a;

    /* renamed from: android.support.v4.view.c$a  reason: invalid class name */
    public interface AbstractCa {
    }

    /* renamed from: android.support.v4.view.c$b  reason: invalid class name */
    public interface AbstractCb {
        void onActionProviderVisibilityChanged(boolean z);
    }

    /* renamed from: c  reason: contains not printable characters */
    public abstract View m۱۲۸۱۱c();

    public AbstractCc(Context context) {
    }

    /* renamed from: a  reason: contains not printable characters */
    public View m۱۲۸۰۵a(MenuItem forItem) {
        return m۱۲۸۱۱c();
    }

    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۲۸۱۳e() {
        return false;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۸۱۰b() {
        return true;
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۲۸۱۲d() {
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۸۰۹a() {
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۸۰۸a(SubMenu subMenu) {
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۸۰۶a(AbstractCa listener) {
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۸۰۷a(AbstractCb listener) {
        if (!(this.f۱۰۵۸۹a == null || listener == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f۱۰۵۸۹a = listener;
    }

    /* renamed from: f  reason: contains not printable characters */
    public void m۱۲۸۱۴f() {
        this.f۱۰۵۸۹a = null;
    }
}
