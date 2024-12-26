package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.view.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCc {

    /* renamed from: a, reason: contains not printable characters */
    private b f۱۰۵۸۹a;

    /* renamed from: android.support.v4.view.c$a */
    public interface a {
    }

    /* renamed from: android.support.v4.view.c$b */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    /* renamed from: c, reason: contains not printable characters */
    public abstract View mo۱۱۸۵۴c();

    public AbstractCc(Context context) {
    }

    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۱۸۶۰a(MenuItem forItem) {
        return mo۱۱۸۵۴c();
    }

    /* renamed from: e, reason: contains not printable characters */
    public boolean mo۱۱۸۶۳e() {
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۱۸۶۲b() {
        return true;
    }

    /* renamed from: d, reason: contains not printable characters */
    public boolean mo۱۱۸۵۵d() {
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۸۵۳a() {
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۸۵۲a(SubMenu subMenu) {
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۰۷۳۶a(a listener) {
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۸۶۱a(b listener) {
        if (this.f۱۰۵۸۹a != null && listener != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f۱۰۵۸۹a = listener;
    }

    /* renamed from: f, reason: contains not printable characters */
    public void m۱۰۷۴۴f() {
        this.f۱۰۵۸۹a = null;
    }
}
