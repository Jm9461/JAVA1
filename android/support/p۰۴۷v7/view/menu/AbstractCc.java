package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractSubMenuCc;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ca;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.c  reason: invalid class name */
public abstract class AbstractCc<T> extends Cd<T> {

    /* renamed from: b  reason: contains not printable characters */
    final Context f۱۱۲۰۳b;

    /* renamed from: c  reason: contains not printable characters */
    private Map<AbstractMenuItemCb, MenuItem> f۱۱۲۰۴c;

    /* renamed from: d  reason: contains not printable characters */
    private Map<AbstractSubMenuCc, SubMenu> f۱۱۲۰۵d;

    AbstractCc(Context context, T object) {
        super(object);
        this.f۱۱۲۰۳b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final MenuItem m۱۳۷۷۵a(MenuItem menuItem) {
        if (!(menuItem instanceof AbstractMenuItemCb)) {
            return menuItem;
        }
        AbstractMenuItemCb supportMenuItem = (AbstractMenuItemCb) menuItem;
        if (this.f۱۱۲۰۴c == null) {
            this.f۱۱۲۰۴c = new Ca();
        }
        MenuItem wrappedItem = this.f۱۱۲۰۴c.get(menuItem);
        if (wrappedItem != null) {
            return wrappedItem;
        }
        MenuItem wrappedItem2 = Cr.m۱۳۹۸۳a(this.f۱۱۲۰۳b, supportMenuItem);
        this.f۱۱۲۰۴c.put(supportMenuItem, wrappedItem2);
        return wrappedItem2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final SubMenu m۱۳۷۷۶a(SubMenu subMenu) {
        if (!(subMenu instanceof AbstractSubMenuCc)) {
            return subMenu;
        }
        AbstractSubMenuCc supportSubMenu = (AbstractSubMenuCc) subMenu;
        if (this.f۱۱۲۰۵d == null) {
            this.f۱۱۲۰۵d = new Ca();
        }
        SubMenu wrappedMenu = this.f۱۱۲۰۵d.get(supportSubMenu);
        if (wrappedMenu != null) {
            return wrappedMenu;
        }
        SubMenu wrappedMenu2 = Cr.m۱۳۹۸۴a(this.f۱۱۲۰۳b, supportSubMenu);
        this.f۱۱۲۰۵d.put(supportSubMenu, wrappedMenu2);
        return wrappedMenu2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public final void m۱۳۷۷۸b() {
        Map<AbstractMenuItemCb, MenuItem> map = this.f۱۱۲۰۴c;
        if (map != null) {
            map.clear();
        }
        Map<AbstractSubMenuCc, SubMenu> map2 = this.f۱۱۲۰۵d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۳۷۷۷a(int groupId) {
        Map<AbstractMenuItemCb, MenuItem> map = this.f۱۱۲۰۴c;
        if (map != null) {
            Iterator<SupportMenuItem> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                if (groupId == iterator.next().getGroupId()) {
                    iterator.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public final void m۱۳۷۷۹b(int id) {
        Map<AbstractMenuItemCb, MenuItem> map = this.f۱۱۲۰۴c;
        if (map != null) {
            Iterator<SupportMenuItem> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                if (id == iterator.next().getItemId()) {
                    iterator.remove();
                    return;
                }
            }
        }
    }
}
