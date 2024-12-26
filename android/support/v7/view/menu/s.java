package android.support.v7.view.menu;

import a.b.g.b.a.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* access modifiers changed from: package-private */
public class s extends c<a> implements Menu {
    s(Context context, a object) {
        super(context, object);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence title) {
        return a(this.f۱۶۷۰a.add(title));
    }

    @Override // android.view.Menu
    public MenuItem add(int titleRes) {
        return a(this.f۱۶۷۰a.add(titleRes));
    }

    @Override // android.view.Menu
    public MenuItem add(int groupId, int itemId, int order, CharSequence title) {
        return a(this.f۱۶۷۰a.add(groupId, itemId, order, title));
    }

    @Override // android.view.Menu
    public MenuItem add(int groupId, int itemId, int order, int titleRes) {
        return a(this.f۱۶۷۰a.add(groupId, itemId, order, titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence title) {
        return a(this.f۱۶۷۰a.addSubMenu(title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int titleRes) {
        return a(this.f۱۶۷۰a.addSubMenu(titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int groupId, int itemId, int order, CharSequence title) {
        return a(this.f۱۶۷۰a.addSubMenu(groupId, itemId, order, title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int groupId, int itemId, int order, int titleRes) {
        return a(this.f۱۶۷۰a.addSubMenu(groupId, itemId, order, titleRes));
    }

    public int addIntentOptions(int groupId, int itemId, int order, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        MenuItem[] items = null;
        if (outSpecificItems != null) {
            items = new MenuItem[outSpecificItems.length];
        }
        int result = this.f۱۶۷۰a.addIntentOptions(groupId, itemId, order, caller, specifics, intent, flags, items);
        if (items != null) {
            int z = items.length;
            for (int i = 0; i < z; i++) {
                outSpecificItems[i] = a(items[i]);
            }
        }
        return result;
    }

    public void removeItem(int id) {
        b(id);
        this.f۱۶۷۰a.removeItem(id);
    }

    public void removeGroup(int groupId) {
        a(groupId);
        this.f۱۶۷۰a.removeGroup(groupId);
    }

    public void clear() {
        b();
        this.f۱۶۷۰a.clear();
    }

    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        this.f۱۶۷۰a.setGroupCheckable(group, checkable, exclusive);
    }

    public void setGroupVisible(int group, boolean visible) {
        this.f۱۶۷۰a.setGroupVisible(group, visible);
    }

    public void setGroupEnabled(int group, boolean enabled) {
        this.f۱۶۷۰a.setGroupEnabled(group, enabled);
    }

    public boolean hasVisibleItems() {
        return this.f۱۶۷۰a.hasVisibleItems();
    }

    public MenuItem findItem(int id) {
        return a(this.f۱۶۷۰a.findItem(id));
    }

    public int size() {
        return this.f۱۶۷۰a.size();
    }

    public MenuItem getItem(int index) {
        return a(this.f۱۶۷۰a.getItem(index));
    }

    public void close() {
        this.f۱۶۷۰a.close();
    }

    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        return this.f۱۶۷۰a.performShortcut(keyCode, event, flags);
    }

    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return this.f۱۶۷۰a.isShortcutKey(keyCode, event);
    }

    public boolean performIdentifierAction(int id, int flags) {
        return this.f۱۶۷۰a.performIdentifierAction(id, flags);
    }

    public void setQwertyMode(boolean isQwerty) {
        this.f۱۶۷۰a.setQwertyMode(isQwerty);
    }
}
