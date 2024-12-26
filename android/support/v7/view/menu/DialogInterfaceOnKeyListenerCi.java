package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.app.DialogInterfaceCd;
import android.support.v7.view.menu.InterfaceCp;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cg;

/* renamed from: android.support.v7.view.menu.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class DialogInterfaceOnKeyListenerCi implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceCp.a {

    /* renamed from: c, reason: contains not printable characters */
    private Ch f۱۱۲۸۹c;

    /* renamed from: d, reason: contains not printable characters */
    private DialogInterfaceCd f۱۱۲۹۰d;

    /* renamed from: e, reason: contains not printable characters */
    Cf f۱۱۲۹۱e;

    /* renamed from: f, reason: contains not printable characters */
    private InterfaceCp.a f۱۱۲۹۲f;

    public DialogInterfaceOnKeyListenerCi(Ch menu) {
        this.f۱۱۲۸۹c = menu;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۸۲۲a(IBinder windowToken) {
        Ch menu = this.f۱۱۲۸۹c;
        DialogInterfaceCd.a builder = new DialogInterfaceCd.a(menu.m۱۱۸۰۲e());
        this.f۱۱۲۹۱e = new Cf(builder.m۱۱۴۰۵b(), Cg.abc_list_menu_item_layout);
        this.f۱۱۲۹۱e.mo۱۱۹۲۳a(this);
        this.f۱۱۲۸۹c.m۱۱۷۷۸a(this.f۱۱۲۹۱e);
        builder.m۱۱۴۰۲a(this.f۱۱۲۹۱e.m۱۱۷۵۳d(), this);
        View headerView = menu.m۱۱۸۰۷i();
        if (headerView != null) {
            builder.m۱۱۴۰۱a(headerView);
        } else {
            builder.m۱۱۴۰۰a(menu.m۱۱۸۰۵g());
            builder.m۱۱۴۰۳a(menu.m۱۱۸۰۶h());
        }
        builder.m۱۱۳۹۹a(this);
        this.f۱۱۲۹۰d = builder.m۱۱۴۰۴a();
        this.f۱۱۲۹۰d.setOnDismissListener(this);
        WindowManager.LayoutParams lp = this.f۱۱۲۹۰d.getWindow().getAttributes();
        lp.type = 1003;
        if (windowToken != null) {
            lp.token = windowToken;
        }
        lp.flags |= 131072;
        this.f۱۱۲۹۰d.show();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
        Window win;
        View decor;
        KeyEvent.DispatcherState ds;
        View decor2;
        KeyEvent.DispatcherState ds2;
        if (keyCode == 82 || keyCode == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                Window win2 = this.f۱۱۲۹۰d.getWindow();
                if (win2 != null && (decor2 = win2.getDecorView()) != null && (ds2 = decor2.getKeyDispatcherState()) != null) {
                    ds2.startTracking(event, this);
                    return true;
                }
            } else if (event.getAction() == 1 && !event.isCanceled() && (win = this.f۱۱۲۹۰d.getWindow()) != null && (decor = win.getDecorView()) != null && (ds = decor.getKeyDispatcherState()) != null && ds.isTracking(event)) {
                this.f۱۱۲۸۹c.m۱۱۷۸۲a(true);
                dialog.dismiss();
                return true;
            }
        }
        return this.f۱۱۲۸۹c.performShortcut(keyCode, event, 0);
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۸۲۱a() {
        DialogInterfaceCd dialogInterfaceCd = this.f۱۱۲۹۰d;
        if (dialogInterfaceCd != null) {
            dialogInterfaceCd.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        this.f۱۱۲۹۱e.mo۱۲۹۴۹a(this.f۱۱۲۸۹c, true);
    }

    @Override // android.support.v7.view.menu.InterfaceCp.a
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۷۶a(Ch menu, boolean allMenusAreClosing) {
        if (allMenusAreClosing || menu == this.f۱۱۲۸۹c) {
            m۱۱۸۲۱a();
        }
        InterfaceCp.a aVar = this.f۱۱۲۹۲f;
        if (aVar != null) {
            aVar.mo۱۲۹۷۶a(menu, allMenusAreClosing);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCp.a
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۹۷۷a(Ch subMenu) {
        InterfaceCp.a aVar = this.f۱۱۲۹۲f;
        if (aVar != null) {
            return aVar.mo۱۲۹۷۷a(subMenu);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialog, int which) {
        this.f۱۱۲۸۹c.m۱۱۷۸۵a((Ck) this.f۱۱۲۹۱e.m۱۱۷۵۳d().getItem(which), 0);
    }
}
