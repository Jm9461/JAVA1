package android.support.v7.view.menu;

import a.b.h.a.g;
import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.app.d;
import android.support.v7.view.menu.p;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

class i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, p.a {

    /* renamed from: c  reason: collision with root package name */
    private h f۱۷۰۸c;

    /* renamed from: d  reason: collision with root package name */
    private d f۱۷۰۹d;

    /* renamed from: e  reason: collision with root package name */
    f f۱۷۱۰e;

    /* renamed from: f  reason: collision with root package name */
    private p.a f۱۷۱۱f;

    public i(h menu) {
        this.f۱۷۰۸c = menu;
    }

    public void a(IBinder windowToken) {
        h menu = this.f۱۷۰۸c;
        d.a builder = new d.a(menu.e());
        this.f۱۷۱۰e = new f(builder.b(), g.abc_list_menu_item_layout);
        this.f۱۷۱۰e.a(this);
        this.f۱۷۰۸c.a(this.f۱۷۱۰e);
        builder.a(this.f۱۷۱۰e.d(), this);
        View headerView = menu.i();
        if (headerView != null) {
            builder.a(headerView);
        } else {
            builder.a(menu.g());
            builder.a(menu.h());
        }
        builder.a(this);
        this.f۱۷۰۹d = builder.a();
        this.f۱۷۰۹d.setOnDismissListener(this);
        WindowManager.LayoutParams lp = this.f۱۷۰۹d.getWindow().getAttributes();
        lp.type = 1003;
        if (windowToken != null) {
            lp.token = windowToken;
        }
        lp.flags |= 131072;
        this.f۱۷۰۹d.show();
    }

    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
        Window win;
        View decor;
        KeyEvent.DispatcherState ds;
        View decor2;
        KeyEvent.DispatcherState ds2;
        if (keyCode == 82 || keyCode == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                Window win2 = this.f۱۷۰۹d.getWindow();
                if (!(win2 == null || (decor2 = win2.getDecorView()) == null || (ds2 = decor2.getKeyDispatcherState()) == null)) {
                    ds2.startTracking(event, this);
                    return true;
                }
            } else if (event.getAction() == 1 && !event.isCanceled() && (win = this.f۱۷۰۹d.getWindow()) != null && (decor = win.getDecorView()) != null && (ds = decor.getKeyDispatcherState()) != null && ds.isTracking(event)) {
                this.f۱۷۰۸c.a(true);
                dialog.dismiss();
                return true;
            }
        }
        return this.f۱۷۰۸c.performShortcut(keyCode, event, 0);
    }

    public void a() {
        d dVar = this.f۱۷۰۹d;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialog) {
        this.f۱۷۱۰e.a(this.f۱۷۰۸c, true);
    }

    @Override // android.support.v7.view.menu.p.a
    public void a(h menu, boolean allMenusAreClosing) {
        if (allMenusAreClosing || menu == this.f۱۷۰۸c) {
            a();
        }
        p.a aVar = this.f۱۷۱۱f;
        if (aVar != null) {
            aVar.a(menu, allMenusAreClosing);
        }
    }

    @Override // android.support.v7.view.menu.p.a
    public boolean a(h subMenu) {
        p.a aVar = this.f۱۷۱۱f;
        if (aVar != null) {
            return aVar.a(subMenu);
        }
        return false;
    }

    public void onClick(DialogInterface dialog, int which) {
        this.f۱۷۰۸c.a((k) this.f۱۷۱۰e.d().getItem(which), 0);
    }
}
