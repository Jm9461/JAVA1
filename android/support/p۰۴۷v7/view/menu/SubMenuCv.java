package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.v  reason: invalid class name */
public class SubMenuCv extends Ch implements SubMenu {

    /* renamed from: B  reason: contains not printable characters */
    private Ch f۱۱۳۶۹B;

    /* renamed from: C  reason: contains not printable characters */
    private Ck f۱۱۳۷۰C;

    public SubMenuCv(Context context, Ch parentMenu, Ck item) {
        super(context);
        this.f۱۱۳۶۹B = parentMenu;
        this.f۱۱۳۷۰C = item;
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch
    public void setQwertyMode(boolean isQwerty) {
        this.f۱۱۳۶۹B.setQwertyMode(isQwerty);
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch
    /* renamed from: p  reason: contains not printable characters */
    public boolean m۱۴۰۱۴p() {
        return this.f۱۱۳۶۹B.m۱۳۸۸۴p();
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch
    /* renamed from: q  reason: contains not printable characters */
    public boolean m۱۴۰۱۵q() {
        return this.f۱۱۳۶۹B.m۱۳۸۸۵q();
    }

    /* renamed from: t  reason: contains not printable characters */
    public Menu m۱۴۰۱۶t() {
        return this.f۱۱۳۶۹B;
    }

    public MenuItem getItem() {
        return this.f۱۱۳۷۰C;
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۰۰۷a(Ch.AbstractCa callback) {
        this.f۱۱۳۶۹B.m۱۳۸۴۷a(callback);
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch
    /* renamed from: m  reason: contains not printable characters */
    public Ch m۱۴۰۱۲m() {
        return this.f۱۱۳۶۹B.m۱۳۸۸۱m();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p۰۴۷v7.view.menu.Ch
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۰۰۸a(Ch menu, MenuItem item) {
        return super.m۱۳۸۵۳a(menu, item) || this.f۱۱۳۶۹B.m۱۳۸۵۳a(menu, item);
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
        super.m۱۳۸۴۰a(icon);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int iconRes) {
        super.m۱۳۸۶۸d(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence title) {
        super.m۱۳۸۴۲a(title);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int titleRes) {
        super.m۱۳۸۷۳e(titleRes);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.m۱۳۸۴۱a(view);
        return this;
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۴۰۱۰b(Ck item) {
        return this.f۱۱۳۶۹B.m۱۳۸۶۲b(item);
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۰۰۹a(Ck item) {
        return this.f۱۱۳۶۹B.m۱۳۸۵۴a(item);
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch
    /* renamed from: d  reason: contains not printable characters */
    public String m۱۴۰۱۱d() {
        Ck kVar = this.f۱۱۳۷۰C;
        int itemId = kVar != null ? kVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.m۱۳۸۶۹d() + ":" + itemId;
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch
    public void setGroupDividerEnabled(boolean groupDividerEnabled) {
        this.f۱۱۳۶۹B.setGroupDividerEnabled(groupDividerEnabled);
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch
    /* renamed from: o  reason: contains not printable characters */
    public boolean m۱۴۰۱۳o() {
        return this.f۱۱۳۶۹B.m۱۳۸۸۳o();
    }
}
