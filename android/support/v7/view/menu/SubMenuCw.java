package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceSubMenuCc;

/* renamed from: android.support.v7.view.menu.w, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class SubMenuCw extends MenuCs implements SubMenu {
    SubMenuCw(Context context, InterfaceSubMenuCc subMenu) {
        super(context, subMenu);
    }

    /* renamed from: c, reason: contains not printable characters */
    public InterfaceSubMenuCc m۱۱۹۴۷c() {
        return (InterfaceSubMenuCc) this.f۱۱۲۰۶a;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int titleRes) {
        m۱۱۹۴۷c().setHeaderTitle(titleRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence title) {
        m۱۱۹۴۷c().setHeaderTitle(title);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int iconRes) {
        m۱۱۹۴۷c().setHeaderIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable icon) {
        m۱۱۹۴۷c().setHeaderIcon(icon);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m۱۱۹۴۷c().setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        m۱۱۹۴۷c().clearHeader();
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int iconRes) {
        m۱۱۹۴۷c().setIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable icon) {
        m۱۱۹۴۷c().setIcon(icon);
        return this;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m۱۱۷۰۵a(m۱۱۹۴۷c().getItem());
    }
}
