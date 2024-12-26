package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.Ch;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.v, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class SubMenuCv extends Ch implements SubMenu {

    /* renamed from: B, reason: contains not printable characters */
    private Ch f۱۱۳۶۹B;

    /* renamed from: C, reason: contains not printable characters */
    private Ck f۱۱۳۷۰C;

    public SubMenuCv(Context context, Ch parentMenu, Ck item) {
        super(context);
        this.f۱۱۳۶۹B = parentMenu;
        this.f۱۱۳۷۰C = item;
    }

    @Override // android.support.v7.view.menu.Ch, android.view.Menu
    public void setQwertyMode(boolean isQwerty) {
        this.f۱۱۳۶۹B.setQwertyMode(isQwerty);
    }

    @Override // android.support.v7.view.menu.Ch
    /* renamed from: p, reason: contains not printable characters */
    public boolean mo۱۱۹۴۴p() {
        return this.f۱۱۳۶۹B.mo۱۱۹۴۴p();
    }

    @Override // android.support.v7.view.menu.Ch
    /* renamed from: q, reason: contains not printable characters */
    public boolean mo۱۱۹۴۵q() {
        return this.f۱۱۳۶۹B.mo۱۱۹۴۵q();
    }

    /* renamed from: t, reason: contains not printable characters */
    public Menu m۱۱۹۴۶t() {
        return this.f۱۱۳۶۹B;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f۱۱۳۷۰C;
    }

    @Override // android.support.v7.view.menu.Ch
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۳۷a(Ch.a callback) {
        this.f۱۱۳۶۹B.mo۱۱۹۳۷a(callback);
    }

    @Override // android.support.v7.view.menu.Ch
    /* renamed from: m, reason: contains not printable characters */
    public Ch mo۱۱۹۴۲m() {
        return this.f۱۱۳۶۹B.mo۱۱۹۴۲m();
    }

    @Override // android.support.v7.view.menu.Ch
    /* renamed from: a, reason: contains not printable characters */
    boolean mo۱۱۹۳۸a(Ch menu, MenuItem item) {
        return super.mo۱۱۹۳۸a(menu, item) || this.f۱۱۳۶۹B.mo۱۱۹۳۸a(menu, item);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable icon) {
        this.f۱۱۳۷۰C.setIcon(icon);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int iconRes) {
        this.f۱۱۳۷۰C.setIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable icon) {
        super.m۱۱۷۷۰a(icon);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int iconRes) {
        super.m۱۱۷۹۸d(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence title) {
        super.m۱۱۷۷۲a(title);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int titleRes) {
        super.m۱۱۸۰۳e(titleRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.m۱۱۷۷۱a(view);
        return this;
    }

    @Override // android.support.v7.view.menu.Ch
    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۱۹۴۰b(Ck item) {
        return this.f۱۱۳۶۹B.mo۱۱۹۴۰b(item);
    }

    @Override // android.support.v7.view.menu.Ch
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۱۹۳۹a(Ck item) {
        return this.f۱۱۳۶۹B.mo۱۱۹۳۹a(item);
    }

    @Override // android.support.v7.view.menu.Ch
    /* renamed from: d, reason: contains not printable characters */
    public String mo۱۱۹۴۱d() {
        Ck ck = this.f۱۱۳۷۰C;
        int itemId = ck != null ? ck.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo۱۱۹۴۱d() + ":" + itemId;
    }

    @Override // android.support.v7.view.menu.Ch, android.view.Menu
    public void setGroupDividerEnabled(boolean groupDividerEnabled) {
        this.f۱۱۳۶۹B.setGroupDividerEnabled(groupDividerEnabled);
    }

    @Override // android.support.v7.view.menu.Ch
    /* renamed from: o, reason: contains not printable characters */
    public boolean mo۱۱۹۴۳o() {
        return this.f۱۱۳۶۹B.mo۱۱۹۴۳o();
    }
}
