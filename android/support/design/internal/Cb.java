package android.support.design.internal;

import android.content.Context;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.view.menu.Ck;
import android.support.p۰۴۷v7.view.menu.SubMenuCv;
import android.view.SubMenu;

/* renamed from: android.support.design.internal.b  reason: invalid class name */
public class Cb extends Ch {
    public Cb(Context context) {
        super(context);
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch, android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, CharSequence title) {
        Ck item = (Ck) m۱۳۸۴۴a(group, id, categoryOrder, title);
        SubMenuCv subMenu = new Cd(m۱۳۸۷۲e(), this, item);
        item.m۱۳۹۰۰a(subMenu);
        return subMenu;
    }
}
