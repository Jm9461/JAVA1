package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.h;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class v extends h implements SubMenu {
    private h B;
    private k C;

    public v(Context context, h parentMenu, k item) {
        super(context);
        this.B = parentMenu;
        this.C = item;
    }

    @Override // android.support.v7.view.menu.h
    public void setQwertyMode(boolean isQwerty) {
        this.B.setQwertyMode(isQwerty);
    }

    @Override // android.support.v7.view.menu.h
    public boolean p() {
        return this.B.p();
    }

    @Override // android.support.v7.view.menu.h
    public boolean q() {
        return this.B.q();
    }

    public Menu t() {
        return this.B;
    }

    public MenuItem getItem() {
        return this.C;
    }

    @Override // android.support.v7.view.menu.h
    public void a(h.a callback) {
        this.B.a(callback);
    }

    @Override // android.support.v7.view.menu.h
    public h m() {
        return this.B.m();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.v7.view.menu.h
    public boolean a(h menu, MenuItem item) {
        return super.a(menu, item) || this.B.a(menu, item);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable icon) {
        this.C.setIcon(icon);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int iconRes) {
        this.C.setIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable icon) {
        super.a(icon);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int iconRes) {
        super.d(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence title) {
        super.a(title);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int titleRes) {
        super.e(titleRes);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.a(view);
        return this;
    }

    @Override // android.support.v7.view.menu.h
    public boolean b(k item) {
        return this.B.b(item);
    }

    @Override // android.support.v7.view.menu.h
    public boolean a(k item) {
        return this.B.a(item);
    }

    @Override // android.support.v7.view.menu.h
    public String d() {
        k kVar = this.C;
        int itemId = kVar != null ? kVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.d() + ":" + itemId;
    }

    @Override // android.support.v7.view.menu.h
    public void setGroupDividerEnabled(boolean groupDividerEnabled) {
        this.B.setGroupDividerEnabled(groupDividerEnabled);
    }

    @Override // android.support.v7.view.menu.h
    public boolean o() {
        return this.B.o();
    }
}
