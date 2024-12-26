package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuCa;

/* renamed from: android.support.v7.view.menu.s, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class MenuCs extends AbstractCc<InterfaceMenuCa> implements Menu {
    MenuCs(Context context, InterfaceMenuCa object) {
        super(context, object);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence title) {
        return m۱۱۷۰۵a(((InterfaceMenuCa) this.f۱۱۲۰۶a).add(title));
    }

    @Override // android.view.Menu
    public MenuItem add(int titleRes) {
        return m۱۱۷۰۵a(((InterfaceMenuCa) this.f۱۱۲۰۶a).add(titleRes));
    }

    @Override // android.view.Menu
    public MenuItem add(int groupId, int itemId, int order, CharSequence title) {
        return m۱۱۷۰۵a(((InterfaceMenuCa) this.f۱۱۲۰۶a).add(groupId, itemId, order, title));
    }

    @Override // android.view.Menu
    public MenuItem add(int groupId, int itemId, int order, int titleRes) {
        return m۱۱۷۰۵a(((InterfaceMenuCa) this.f۱۱۲۰۶a).add(groupId, itemId, order, titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence title) {
        return m۱۱۷۰۶a(((InterfaceMenuCa) this.f۱۱۲۰۶a).addSubMenu(title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int titleRes) {
        return m۱۱۷۰۶a(((InterfaceMenuCa) this.f۱۱۲۰۶a).addSubMenu(titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int groupId, int itemId, int order, CharSequence title) {
        return m۱۱۷۰۶a(((InterfaceMenuCa) this.f۱۱۲۰۶a).addSubMenu(groupId, itemId, order, title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int groupId, int itemId, int order, int titleRes) {
        return m۱۱۷۰۶a(((InterfaceMenuCa) this.f۱۱۲۰۶a).addSubMenu(groupId, itemId, order, titleRes));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int groupId, int itemId, int order, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        MenuItem[] items = outSpecificItems != null ? new MenuItem[outSpecificItems.length] : null;
        int result = ((InterfaceMenuCa) this.f۱۱۲۰۶a).addIntentOptions(groupId, itemId, order, caller, specifics, intent, flags, items);
        if (items != null) {
            int z = items.length;
            for (int i = 0; i < z; i++) {
                outSpecificItems[i] = m۱۱۷۰۵a(items[i]);
            }
        }
        return result;
    }

    @Override // android.view.Menu
    public void removeItem(int id) {
        m۱۱۷۰۹b(id);
        ((InterfaceMenuCa) this.f۱۱۲۰۶a).removeItem(id);
    }

    @Override // android.view.Menu
    public void removeGroup(int groupId) {
        m۱۱۷۰۷a(groupId);
        ((InterfaceMenuCa) this.f۱۱۲۰۶a).removeGroup(groupId);
    }

    @Override // android.view.Menu
    public void clear() {
        m۱۱۷۰۸b();
        ((InterfaceMenuCa) this.f۱۱۲۰۶a).clear();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        ((InterfaceMenuCa) this.f۱۱۲۰۶a).setGroupCheckable(group, checkable, exclusive);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int group, boolean visible) {
        ((InterfaceMenuCa) this.f۱۱۲۰۶a).setGroupVisible(group, visible);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int group, boolean enabled) {
        ((InterfaceMenuCa) this.f۱۱۲۰۶a).setGroupEnabled(group, enabled);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((InterfaceMenuCa) this.f۱۱۲۰۶a).hasVisibleItems();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int id) {
        return m۱۱۷۰۵a(((InterfaceMenuCa) this.f۱۱۲۰۶a).findItem(id));
    }

    @Override // android.view.Menu
    public int size() {
        return ((InterfaceMenuCa) this.f۱۱۲۰۶a).size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int index) {
        return m۱۱۷۰۵a(((InterfaceMenuCa) this.f۱۱۲۰۶a).getItem(index));
    }

    @Override // android.view.Menu
    public void close() {
        ((InterfaceMenuCa) this.f۱۱۲۰۶a).close();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        return ((InterfaceMenuCa) this.f۱۱۲۰۶a).performShortcut(keyCode, event, flags);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return ((InterfaceMenuCa) this.f۱۱۲۰۶a).isShortcutKey(keyCode, event);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int id, int flags) {
        return ((InterfaceMenuCa) this.f۱۱۲۰۶a).performIdentifierAction(id, flags);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean isQwerty) {
        ((InterfaceMenuCa) this.f۱۱۲۰۶a).setQwertyMode(isQwerty);
    }
}
