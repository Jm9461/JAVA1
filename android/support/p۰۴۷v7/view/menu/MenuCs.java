package android.support.p۰۴۷v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuCa;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.s  reason: invalid class name */
public class MenuCs extends AbstractCc<AbstractMenuCa> implements Menu {
    MenuCs(Context context, AbstractMenuCa object) {
        super(context, object);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence title) {
        return m۱۳۷۷۵a(this.f۱۱۲۰۶a.add(title));
    }

    @Override // android.view.Menu
    public MenuItem add(int titleRes) {
        return m۱۳۷۷۵a(this.f۱۱۲۰۶a.add(titleRes));
    }

    @Override // android.view.Menu
    public MenuItem add(int groupId, int itemId, int order, CharSequence title) {
        return m۱۳۷۷۵a(this.f۱۱۲۰۶a.add(groupId, itemId, order, title));
    }

    @Override // android.view.Menu
    public MenuItem add(int groupId, int itemId, int order, int titleRes) {
        return m۱۳۷۷۵a(this.f۱۱۲۰۶a.add(groupId, itemId, order, titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence title) {
        return m۱۳۷۷۶a(this.f۱۱۲۰۶a.addSubMenu(title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int titleRes) {
        return m۱۳۷۷۶a(this.f۱۱۲۰۶a.addSubMenu(titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int groupId, int itemId, int order, CharSequence title) {
        return m۱۳۷۷۶a(this.f۱۱۲۰۶a.addSubMenu(groupId, itemId, order, title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int groupId, int itemId, int order, int titleRes) {
        return m۱۳۷۷۶a(this.f۱۱۲۰۶a.addSubMenu(groupId, itemId, order, titleRes));
    }

    public int addIntentOptions(int groupId, int itemId, int order, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        MenuItem[] items = null;
        if (outSpecificItems != null) {
            items = new MenuItem[outSpecificItems.length];
        }
        int result = this.f۱۱۲۰۶a.addIntentOptions(groupId, itemId, order, caller, specifics, intent, flags, items);
        if (items != null) {
            int z = items.length;
            for (int i = 0; i < z; i++) {
                outSpecificItems[i] = m۱۳۷۷۵a(items[i]);
            }
        }
        return result;
    }

    public void removeItem(int id) {
        m۱۳۷۷۹b(id);
        this.f۱۱۲۰۶a.removeItem(id);
    }

    public void removeGroup(int groupId) {
        m۱۳۷۷۷a(groupId);
        this.f۱۱۲۰۶a.removeGroup(groupId);
    }

    public void clear() {
        m۱۳۷۷۸b();
        this.f۱۱۲۰۶a.clear();
    }

    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        this.f۱۱۲۰۶a.setGroupCheckable(group, checkable, exclusive);
    }

    public void setGroupVisible(int group, boolean visible) {
        this.f۱۱۲۰۶a.setGroupVisible(group, visible);
    }

    public void setGroupEnabled(int group, boolean enabled) {
        this.f۱۱۲۰۶a.setGroupEnabled(group, enabled);
    }

    public boolean hasVisibleItems() {
        return this.f۱۱۲۰۶a.hasVisibleItems();
    }

    public MenuItem findItem(int id) {
        return m۱۳۷۷۵a(this.f۱۱۲۰۶a.findItem(id));
    }

    public int size() {
        return this.f۱۱۲۰۶a.size();
    }

    public MenuItem getItem(int index) {
        return m۱۳۷۷۵a(this.f۱۱۲۰۶a.getItem(index));
    }

    public void close() {
        this.f۱۱۲۰۶a.close();
    }

    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        return this.f۱۱۲۰۶a.performShortcut(keyCode, event, flags);
    }

    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return this.f۱۱۲۰۶a.isShortcutKey(keyCode, event);
    }

    public boolean performIdentifierAction(int id, int flags) {
        return this.f۱۱۲۰۶a.performIdentifierAction(id, flags);
    }

    public void setQwertyMode(boolean isQwerty) {
        this.f۱۱۲۰۶a.setQwertyMode(isQwerty);
    }
}
