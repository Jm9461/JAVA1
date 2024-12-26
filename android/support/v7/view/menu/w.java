package android.support.v7.view.menu;

import a.b.g.b.a.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* access modifiers changed from: package-private */
public class w extends s implements SubMenu {
    w(Context context, c subMenu) {
        super(context, subMenu);
    }

    public c c() {
        return this.f۱۶۷۰a;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int titleRes) {
        c().setHeaderTitle(titleRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence title) {
        c().setHeaderTitle(title);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int iconRes) {
        c().setHeaderIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable icon) {
        c().setHeaderIcon(icon);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        c().setHeaderView(view);
        return this;
    }

    public void clearHeader() {
        c().clearHeader();
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int iconRes) {
        c().setIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable icon) {
        c().setIcon(icon);
        return this;
    }

    public MenuItem getItem() {
        return a(c().getItem());
    }
}
