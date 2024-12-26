package android.support.v7.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceSubMenuCc;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ca;

/* renamed from: android.support.v7.view.menu.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
abstract class AbstractCc<T> extends Cd<T> {

    /* renamed from: b, reason: contains not printable characters */
    final Context f۱۱۲۰۳b;

    /* renamed from: c, reason: contains not printable characters */
    private Map<InterfaceMenuItemCb, MenuItem> f۱۱۲۰۴c;

    /* renamed from: d, reason: contains not printable characters */
    private Map<InterfaceSubMenuCc, SubMenu> f۱۱۲۰۵d;

    /* JADX WARN: Generic types in debug info not equals: android.support.v7.view.menu.c != android.support.v7.view.menu.BaseMenuWrapper<T> */
    AbstractCc(Context context, T object) {
        super(object);
        this.f۱۱۲۰۳b = context;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v7.view.menu.c != android.support.v7.view.menu.BaseMenuWrapper<T> */
    /* renamed from: a, reason: contains not printable characters */
    final MenuItem m۱۱۷۰۵a(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemCb) {
            InterfaceMenuItemCb supportMenuItem = (InterfaceMenuItemCb) menuItem;
            if (this.f۱۱۲۰۴c == null) {
                this.f۱۱۲۰۴c = new Ca();
            }
            MenuItem wrappedItem = this.f۱۱۲۰۴c.get(menuItem);
            if (wrappedItem == null) {
                MenuItem wrappedItem2 = Cr.m۱۱۹۱۳a(this.f۱۱۲۰۳b, supportMenuItem);
                this.f۱۱۲۰۴c.put(supportMenuItem, wrappedItem2);
                return wrappedItem2;
            }
            return wrappedItem;
        }
        return menuItem;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v7.view.menu.c != android.support.v7.view.menu.BaseMenuWrapper<T> */
    /* renamed from: a, reason: contains not printable characters */
    final SubMenu m۱۱۷۰۶a(SubMenu subMenu) {
        if (subMenu instanceof InterfaceSubMenuCc) {
            InterfaceSubMenuCc supportSubMenu = (InterfaceSubMenuCc) subMenu;
            if (this.f۱۱۲۰۵d == null) {
                this.f۱۱۲۰۵d = new Ca();
            }
            SubMenu wrappedMenu = this.f۱۱۲۰۵d.get(supportSubMenu);
            if (wrappedMenu == null) {
                SubMenu wrappedMenu2 = Cr.m۱۱۹۱۴a(this.f۱۱۲۰۳b, supportSubMenu);
                this.f۱۱۲۰۵d.put(supportSubMenu, wrappedMenu2);
                return wrappedMenu2;
            }
            return wrappedMenu;
        }
        return subMenu;
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v7.view.menu.c != android.support.v7.view.menu.BaseMenuWrapper<T> */
    /* renamed from: b, reason: contains not printable characters */
    final void m۱۱۷۰۸b() {
        Map<InterfaceMenuItemCb, MenuItem> map = this.f۱۱۲۰۴c;
        if (map != null) {
            map.clear();
        }
        Map<InterfaceSubMenuCc, SubMenu> map2 = this.f۱۱۲۰۵d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v7.view.menu.c != android.support.v7.view.menu.BaseMenuWrapper<T> */
    /* renamed from: a, reason: contains not printable characters */
    final void m۱۱۷۰۷a(int groupId) {
        Map<InterfaceMenuItemCb, MenuItem> map = this.f۱۱۲۰۴c;
        if (map == null) {
            return;
        }
        Iterator<InterfaceMenuItemCb> it = map.keySet().iterator();
        while (it.hasNext()) {
            MenuItem menuItem = it.next();
            if (groupId == menuItem.getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: android.support.v7.view.menu.c != android.support.v7.view.menu.BaseMenuWrapper<T> */
    /* renamed from: b, reason: contains not printable characters */
    final void m۱۱۷۰۹b(int id) {
        Map<InterfaceMenuItemCb, MenuItem> map = this.f۱۱۲۰۴c;
        if (map == null) {
            return;
        }
        Iterator<InterfaceMenuItemCb> it = map.keySet().iterator();
        while (it.hasNext()) {
            MenuItem menuItem = it.next();
            if (id == menuItem.getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
