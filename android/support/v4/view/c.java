package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private b f۱۳۳۵a;

    public interface a {
    }

    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public abstract View c();

    public c(Context context) {
    }

    public View a(MenuItem forItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public boolean d() {
        return false;
    }

    public boolean a() {
        return false;
    }

    public void a(SubMenu subMenu) {
    }

    public void a(a listener) {
    }

    public void a(b listener) {
        if (!(this.f۱۳۳۵a == null || listener == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f۱۳۳۵a = listener;
    }

    public void f() {
        this.f۱۳۳۵a = null;
    }
}
