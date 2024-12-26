package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractSubMenuCc;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.w  reason: invalid class name */
public class SubMenuCw extends MenuCs implements SubMenu {
    SubMenuCw(Context context, AbstractSubMenuCc subMenu) {
        super(context, subMenu);
    }

    /* renamed from: c  reason: contains not printable characters */
    public AbstractSubMenuCc m۱۴۰۱۷c() {
        return this.f۱۱۲۰۶a;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int titleRes) {
        m۱۴۰۱۷c().setHeaderTitle(titleRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence title) {
        m۱۴۰۱۷c().setHeaderTitle(title);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int iconRes) {
        m۱۴۰۱۷c().setHeaderIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable icon) {
        m۱۴۰۱۷c().setHeaderIcon(icon);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        m۱۴۰۱۷c().setHeaderView(view);
        return this;
    }

    public void clearHeader() {
        m۱۴۰۱۷c().clearHeader();
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int iconRes) {
        m۱۴۰۱۷c().setIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable icon) {
        m۱۴۰۱۷c().setIcon(icon);
        return this;
    }

    public MenuItem getItem() {
        return m۱۳۷۷۵a(m۱۴۰۱۷c().getItem());
    }
}
