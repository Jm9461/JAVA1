package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuCa;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceSubMenuCc;

/* renamed from: android.support.v7.view.menu.r, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cr {
    /* renamed from: a, reason: contains not printable characters */
    public static Menu m۱۱۹۱۲a(Context context, InterfaceMenuCa supportMenu) {
        return new MenuCs(context, supportMenu);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static MenuItem m۱۱۹۱۳a(Context context, InterfaceMenuItemCb supportMenuItem) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new Cm(context, supportMenuItem);
        }
        return new MenuItemCl(context, supportMenuItem);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static SubMenu m۱۱۹۱۴a(Context context, InterfaceSubMenuCc supportSubMenu) {
        return new SubMenuCw(context, supportSubMenu);
    }
}
