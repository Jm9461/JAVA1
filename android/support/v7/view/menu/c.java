package android.support.v7.view.menu;

import a.b.g.b.a.b;
import a.b.g.g.a;
import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class c<T> extends d<T> {

    /* renamed from: b  reason: collision with root package name */
    final Context f۱۶۶۷b;

    /* renamed from: c  reason: collision with root package name */
    private Map<b, MenuItem> f۱۶۶۸c;

    /* renamed from: d  reason: collision with root package name */
    private Map<a.b.g.b.a.c, SubMenu> f۱۶۶۹d;

    c(Context context, T object) {
        super(object);
        this.f۱۶۶۷b = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b supportMenuItem = (b) menuItem;
        if (this.f۱۶۶۸c == null) {
            this.f۱۶۶۸c = new a();
        }
        MenuItem wrappedItem = this.f۱۶۶۸c.get(menuItem);
        if (wrappedItem != null) {
            return wrappedItem;
        }
        MenuItem wrappedItem2 = r.a(this.f۱۶۶۷b, supportMenuItem);
        this.f۱۶۶۸c.put(supportMenuItem, wrappedItem2);
        return wrappedItem2;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof a.b.g.b.a.c)) {
            return subMenu;
        }
        a.b.g.b.a.c supportSubMenu = (a.b.g.b.a.c) subMenu;
        if (this.f۱۶۶۹d == null) {
            this.f۱۶۶۹d = new a();
        }
        SubMenu wrappedMenu = this.f۱۶۶۹d.get(supportSubMenu);
        if (wrappedMenu != null) {
            return wrappedMenu;
        }
        SubMenu wrappedMenu2 = r.a(this.f۱۶۶۷b, supportSubMenu);
        this.f۱۶۶۹d.put(supportSubMenu, wrappedMenu2);
        return wrappedMenu2;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        Map<b, MenuItem> map = this.f۱۶۶۸c;
        if (map != null) {
            map.clear();
        }
        Map<a.b.g.b.a.c, SubMenu> map2 = this.f۱۶۶۹d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int groupId) {
        Map<b, MenuItem> map = this.f۱۶۶۸c;
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
    public final void b(int id) {
        Map<b, MenuItem> map = this.f۱۶۶۸c;
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
