package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.AbstractCc;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb;

/* renamed from: android.support.v7.view.menu.a  reason: invalid class name */
public class Ca implements AbstractMenuItemCb {

    /* renamed from: a  reason: contains not printable characters */
    private final int f۱۱۱۷۵a;

    /* renamed from: b  reason: contains not printable characters */
    private final int f۱۱۱۷۶b;

    /* renamed from: c  reason: contains not printable characters */
    private final int f۱۱۱۷۷c;

    /* renamed from: d  reason: contains not printable characters */
    private CharSequence f۱۱۱۷۸d;

    /* renamed from: e  reason: contains not printable characters */
    private CharSequence f۱۱۱۷۹e;

    /* renamed from: f  reason: contains not printable characters */
    private Intent f۱۱۱۸۰f;

    /* renamed from: g  reason: contains not printable characters */
    private char f۱۱۱۸۱g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۱۱۸۲h = 4096;

    /* renamed from: i  reason: contains not printable characters */
    private char f۱۱۱۸۳i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۱۱۸۴j = 4096;

    /* renamed from: k  reason: contains not printable characters */
    private Drawable f۱۱۱۸۵k;

    /* renamed from: l  reason: contains not printable characters */
    private Context f۱۱۱۸۶l;

    /* renamed from: m  reason: contains not printable characters */
    private CharSequence f۱۱۱۸۷m;

    /* renamed from: n  reason: contains not printable characters */
    private CharSequence f۱۱۱۸۸n;

    /* renamed from: o  reason: contains not printable characters */
    private ColorStateList f۱۱۱۸۹o = null;

    /* renamed from: p  reason: contains not printable characters */
    private PorterDuff.Mode f۱۱۱۹۰p = null;

    /* renamed from: q  reason: contains not printable characters */
    private boolean f۱۱۱۹۱q = false;

    /* renamed from: r  reason: contains not printable characters */
    private boolean f۱۱۱۹۲r = false;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۱۱۹۳s = 16;

    public Ca(Context context, int group, int id, int categoryOrder, int ordering, CharSequence title) {
        this.f۱۱۱۸۶l = context;
        this.f۱۱۱۷۵a = id;
        this.f۱۱۱۷۶b = group;
        this.f۱۱۱۷۷c = ordering;
        this.f۱۱۱۷۸d = title;
    }

    public char getAlphabeticShortcut() {
        return this.f۱۱۱۸۳i;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public int getAlphabeticModifiers() {
        return this.f۱۱۱۸۴j;
    }

    public int getGroupId() {
        return this.f۱۱۱۷۶b;
    }

    public Drawable getIcon() {
        return this.f۱۱۱۸۵k;
    }

    public Intent getIntent() {
        return this.f۱۱۱۸۰f;
    }

    public int getItemId() {
        return this.f۱۱۱۷۵a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.f۱۱۱۸۱g;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public int getNumericModifiers() {
        return this.f۱۱۱۸۲h;
    }

    public int getOrder() {
        return this.f۱۱۱۷۷c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f۱۱۱۷۸d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f۱۱۱۷۹e;
        return charSequence != null ? charSequence : this.f۱۱۱۷۸d;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f۱۱۱۹۳s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f۱۱۱۹۳s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f۱۱۱۹۳s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f۱۱۱۹۳s & 8) == 0;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        this.f۱۱۱۸۳i = Character.toLowerCase(alphaChar);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        this.f۱۱۱۸۳i = Character.toLowerCase(alphaChar);
        this.f۱۱۱۸۴j = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    public MenuItem setCheckable(boolean checkable) {
        this.f۱۱۱۹۳s = (this.f۱۱۱۹۳s & -2) | (checkable ? 1 : 0);
        return this;
    }

    public MenuItem setChecked(boolean checked) {
        this.f۱۱۱۹۳s = (this.f۱۱۱۹۳s & -3) | (checked ? 2 : 0);
        return this;
    }

    public MenuItem setEnabled(boolean enabled) {
        this.f۱۱۱۹۳s = (this.f۱۱۱۹۳s & -17) | (enabled ? 16 : 0);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.f۱۱۱۸۵k = icon;
        m۱۳۷۵۵b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconRes) {
        this.f۱۱۱۸۵k = android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۶c(this.f۱۱۱۸۶l, iconRes);
        m۱۳۷۵۵b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f۱۱۱۸۰f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        this.f۱۱۱۸۱g = numericChar;
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        this.f۱۱۱۸۱g = numericChar;
        this.f۱۱۱۸۲h = KeyEvent.normalizeMetaState(numericModifiers);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f۱۱۱۸۱g = numericChar;
        this.f۱۱۱۸۳i = Character.toLowerCase(alphaChar);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f۱۱۱۸۱g = numericChar;
        this.f۱۱۱۸۲h = KeyEvent.normalizeMetaState(numericModifiers);
        this.f۱۱۱۸۳i = Character.toLowerCase(alphaChar);
        this.f۱۱۱۸۴j = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f۱۱۱۷۸d = title;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        this.f۱۱۱۷۸d = this.f۱۱۱۸۶l.getResources().getString(title);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f۱۱۱۷۹e = title;
        return this;
    }

    public MenuItem setVisible(boolean visible) {
        int i = 8;
        int i2 = this.f۱۱۱۹۳s & 8;
        if (visible) {
            i = 0;
        }
        this.f۱۱۱۹۳s = i2 | i;
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public void setShowAsAction(int show) {
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb, android.view.MenuItem
    public AbstractMenuItemCb setActionView(View actionView) {
        throw new UnsupportedOperationException();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public View getActionView() {
        return null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb, android.view.MenuItem
    public AbstractMenuItemCb setActionView(int resId) {
        throw new UnsupportedOperationException();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCc m۱۳۷۵۷a() {
        return null;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    /* renamed from: a  reason: contains not printable characters */
    public AbstractMenuItemCb m۱۳۷۵۶a(AbstractCc actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public AbstractMenuItemCb setShowAsActionFlags(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public boolean expandActionView() {
        return false;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public boolean collapseActionView() {
        return false;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public boolean isActionViewExpanded() {
        return false;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        throw new UnsupportedOperationException();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public AbstractMenuItemCb setContentDescription(CharSequence contentDescription) {
        this.f۱۱۱۸۷m = contentDescription;
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public CharSequence getContentDescription() {
        return this.f۱۱۱۸۷m;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public AbstractMenuItemCb setTooltipText(CharSequence tooltipText) {
        this.f۱۱۱۸۸n = tooltipText;
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public CharSequence getTooltipText() {
        return this.f۱۱۱۸۸n;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.f۱۱۱۸۹o = iconTintList;
        this.f۱۱۱۹۱q = true;
        m۱۳۷۵۵b();
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public ColorStateList getIconTintList() {
        return this.f۱۱۱۸۹o;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.f۱۱۱۹۰p = iconTintMode;
        this.f۱۱۱۹۲r = true;
        m۱۳۷۵۵b();
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public PorterDuff.Mode getIconTintMode() {
        return this.f۱۱۱۹۰p;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۳۷۵۵b() {
        if (this.f۱۱۱۸۵k == null) {
            return;
        }
        if (this.f۱۱۱۹۱q || this.f۱۱۱۹۲r) {
            this.f۱۱۱۸۵k = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(this.f۱۱۱۸۵k);
            this.f۱۱۱۸۵k = this.f۱۱۱۸۵k.mutate();
            if (this.f۱۱۱۹۱q) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(this.f۱۱۱۸۵k, this.f۱۱۱۸۹o);
            }
            if (this.f۱۱۱۹۲r) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(this.f۱۱۱۸۵k, this.f۱۱۱۹۰p);
            }
        }
    }
}
