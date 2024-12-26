package android.support.p۰۴۷v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.p۰۴۷v7.app.DialogInterfaceCd;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg;

/* renamed from: android.support.v7.view.menu.i  reason: invalid class name */
class DialogInterface$OnKeyListenerCi implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, AbstractCp.AbstractCa {

    /* renamed from: c  reason: contains not printable characters */
    private Ch f۱۱۲۸۹c;

    /* renamed from: d  reason: contains not printable characters */
    private DialogInterfaceCd f۱۱۲۹۰d;

    /* renamed from: e  reason: contains not printable characters */
    Cf f۱۱۲۹۱e;

    /* renamed from: f  reason: contains not printable characters */
    private AbstractCp.AbstractCa f۱۱۲۹۲f;

    public DialogInterface$OnKeyListenerCi(Ch menu) {
        this.f۱۱۲۸۹c = menu;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۹۲a(IBinder windowToken) {
        Ch menu = this.f۱۱۲۸۹c;
        DialogInterfaceCd.Ca builder = new DialogInterfaceCd.Ca(menu.m۱۳۸۷۲e());
        this.f۱۱۲۹۱e = new Cf(builder.m۱۳۴۷۵b(), Cg.abc_list_menu_item_layout);
        this.f۱۱۲۹۱e.m۱۳۸۱۵a(this);
        this.f۱۱۲۸۹c.m۱۳۸۴۸a(this.f۱۱۲۹۱e);
        builder.m۱۳۴۷۲a(this.f۱۱۲۹۱e.m۱۳۸۲۳d(), this);
        View headerView = menu.m۱۳۸۷۷i();
        if (headerView != null) {
            builder.m۱۳۴۷۱a(headerView);
        } else {
            builder.m۱۳۴۷۰a(menu.m۱۳۸۷۵g());
            builder.m۱۳۴۷۳a(menu.m۱۳۸۷۶h());
        }
        builder.m۱۳۴۶۹a(this);
        this.f۱۱۲۹۰d = builder.m۱۳۴۷۴a();
        this.f۱۱۲۹۰d.setOnDismissListener(this);
        WindowManager.LayoutParams lp = this.f۱۱۲۹۰d.getWindow().getAttributes();
        lp.type = 1003;
        if (windowToken != null) {
            lp.token = windowToken;
        }
        lp.flags |= 131072;
        this.f۱۱۲۹۰d.show();
    }

    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
        Window win;
        View decor;
        KeyEvent.DispatcherState ds;
        View decor2;
        KeyEvent.DispatcherState ds2;
        if (keyCode == 82 || keyCode == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                Window win2 = this.f۱۱۲۹۰d.getWindow();
                if (!(win2 == null || (decor2 = win2.getDecorView()) == null || (ds2 = decor2.getKeyDispatcherState()) == null)) {
                    ds2.startTracking(event, this);
                    return true;
                }
            } else if (event.getAction() == 1 && !event.isCanceled() && (win = this.f۱۱۲۹۰d.getWindow()) != null && (decor = win.getDecorView()) != null && (ds = decor.getKeyDispatcherState()) != null && ds.isTracking(event)) {
                this.f۱۱۲۸۹c.m۱۳۸۵۲a(true);
                dialog.dismiss();
                return true;
            }
        }
        return this.f۱۱۲۸۹c.performShortcut(keyCode, event, 0);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۹۱a() {
        DialogInterfaceCd dVar = this.f۱۱۲۹۰d;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialog) {
        this.f۱۱۲۹۱e.m۱۳۸۱۴a(this.f۱۱۲۸۹c, true);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۸۹۳a(Ch menu, boolean allMenusAreClosing) {
        if (allMenusAreClosing || menu == this.f۱۱۲۸۹c) {
            m۱۳۸۹۱a();
        }
        AbstractCp.AbstractCa aVar = this.f۱۱۲۹۲f;
        if (aVar != null) {
            aVar.m۱۳۹۷۷a(menu, allMenusAreClosing);
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp.AbstractCa
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۸۹۴a(Ch subMenu) {
        AbstractCp.AbstractCa aVar = this.f۱۱۲۹۲f;
        if (aVar != null) {
            return aVar.m۱۳۹۷۸a(subMenu);
        }
        return false;
    }

    public void onClick(DialogInterface dialog, int which) {
        this.f۱۱۲۸۹c.m۱۳۸۵۵a((Ck) this.f۱۱۲۹۱e.m۱۳۸۲۳d().getItem(which), 0);
    }
}
