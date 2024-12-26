package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuCa;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractSubMenuCc;

/* renamed from: android.support.v7.view.menu.r  reason: invalid class name */
public final class Cr {
    /* renamed from: a  reason: contains not printable characters */
    public static Menu m۱۳۹۸۲a(Context context, AbstractMenuCa supportMenu) {
        return new MenuCs(context, supportMenu);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static MenuItem m۱۳۹۸۳a(Context context, AbstractMenuItemCb supportMenuItem) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new Cm(context, supportMenuItem);
        }
        return new MenuItemCl(context, supportMenuItem);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static SubMenu m۱۳۹۸۴a(Context context, AbstractSubMenuCc supportSubMenu) {
        return new SubMenuCw(context, supportSubMenu);
    }
}
