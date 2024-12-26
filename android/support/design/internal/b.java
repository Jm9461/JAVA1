package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.k;
import android.support.v7.view.menu.v;
import android.view.SubMenu;

public class b extends h {
    public b(Context context) {
        super(context);
    }

    @Override // android.support.v7.view.menu.h, android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, CharSequence title) {
        k item = (k) a(group, id, categoryOrder, title);
        v subMenu = new d(e(), this, item);
        item.a(subMenu);
        return subMenu;
    }
}
