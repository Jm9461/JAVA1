package android.support.v7.view.menu;

import a.b.g.b.a.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.c;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final int f۱۶۵۳a;

    /* renamed from: b  reason: collision with root package name */
    private final int f۱۶۵۴b;

    /* renamed from: c  reason: collision with root package name */
    private final int f۱۶۵۵c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f۱۶۵۶d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f۱۶۵۷e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f۱۶۵۸f;

    /* renamed from: g  reason: collision with root package name */
    private char f۱۶۵۹g;

    /* renamed from: h  reason: collision with root package name */
    private int f۱۶۶۰h = 4096;
    private char i;
    private int j = 4096;
    private Drawable k;
    private Context l;
    private CharSequence m;
    private CharSequence n;
    private ColorStateList o = null;
    private PorterDuff.Mode p = null;
    private boolean q = false;
    private boolean r = false;
    private int s = 16;

    public a(Context context, int group, int id, int categoryOrder, int ordering, CharSequence title) {
        this.l = context;
        this.f۱۶۵۳a = id;
        this.f۱۶۵۴b = group;
        this.f۱۶۵۵c = ordering;
        this.f۱۶۵۶d = title;
    }

    public char getAlphabeticShortcut() {
        return this.i;
    }

    @Override // a.b.g.b.a.b
    public int getAlphabeticModifiers() {
        return this.j;
    }

    public int getGroupId() {
        return this.f۱۶۵۴b;
    }

    public Drawable getIcon() {
        return this.k;
    }

    public Intent getIntent() {
        return this.f۱۶۵۸f;
    }

    public int getItemId() {
        return this.f۱۶۵۳a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.f۱۶۵۹g;
    }

    @Override // a.b.g.b.a.b
    public int getNumericModifiers() {
        return this.f۱۶۶۰h;
    }

    public int getOrder() {
        return this.f۱۶۵۵c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f۱۶۵۶d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f۱۶۵۷e;
        return charSequence != null ? charSequence : this.f۱۶۵۶d;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        this.i = Character.toLowerCase(alphaChar);
        return this;
    }

    @Override // a.b.g.b.a.b
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        this.i = Character.toLowerCase(alphaChar);
        this.j = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    public MenuItem setCheckable(boolean checkable) {
        this.s = (this.s & -2) | (checkable ? 1 : 0);
        return this;
    }

    public MenuItem setChecked(boolean checked) {
        this.s = (this.s & -3) | (checked ? 2 : 0);
        return this;
    }

    public MenuItem setEnabled(boolean enabled) {
        this.s = (this.s & -17) | (enabled ? 16 : 0);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.k = icon;
        b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconRes) {
        this.k = android.support.v4.content.a.c(this.l, iconRes);
        b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f۱۶۵۸f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        this.f۱۶۵۹g = numericChar;
        return this;
    }

    @Override // a.b.g.b.a.b
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        this.f۱۶۵۹g = numericChar;
        this.f۱۶۶۰h = KeyEvent.normalizeMetaState(numericModifiers);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f۱۶۵۹g = numericChar;
        this.i = Character.toLowerCase(alphaChar);
        return this;
    }

    @Override // a.b.g.b.a.b
    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f۱۶۵۹g = numericChar;
        this.f۱۶۶۰h = KeyEvent.normalizeMetaState(numericModifiers);
        this.i = Character.toLowerCase(alphaChar);
        this.j = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f۱۶۵۶d = title;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        this.f۱۶۵۶d = this.l.getResources().getString(title);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f۱۶۵۷e = title;
        return this;
    }

    public MenuItem setVisible(boolean visible) {
        int i2 = 8;
        int i3 = this.s & 8;
        if (visible) {
            i2 = 0;
        }
        this.s = i3 | i2;
        return this;
    }

    @Override // a.b.g.b.a.b
    public void setShowAsAction(int show) {
    }

    @Override // a.b.g.b.a.b, android.view.MenuItem
    public b setActionView(View actionView) {
        throw new UnsupportedOperationException();
    }

    @Override // a.b.g.b.a.b
    public View getActionView() {
        return null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // a.b.g.b.a.b, android.view.MenuItem
    public b setActionView(int resId) {
        throw new UnsupportedOperationException();
    }

    @Override // a.b.g.b.a.b
    public c a() {
        return null;
    }

    @Override // a.b.g.b.a.b
    public b a(c actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // a.b.g.b.a.b
    public b setShowAsActionFlags(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    @Override // a.b.g.b.a.b
    public boolean expandActionView() {
        return false;
    }

    @Override // a.b.g.b.a.b
    public boolean collapseActionView() {
        return false;
    }

    @Override // a.b.g.b.a.b
    public boolean isActionViewExpanded() {
        return false;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        throw new UnsupportedOperationException();
    }

    @Override // a.b.g.b.a.b
    public b setContentDescription(CharSequence contentDescription) {
        this.m = contentDescription;
        return this;
    }

    @Override // a.b.g.b.a.b
    public CharSequence getContentDescription() {
        return this.m;
    }

    @Override // a.b.g.b.a.b
    public b setTooltipText(CharSequence tooltipText) {
        this.n = tooltipText;
        return this;
    }

    @Override // a.b.g.b.a.b
    public CharSequence getTooltipText() {
        return this.n;
    }

    @Override // a.b.g.b.a.b
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.o = iconTintList;
        this.q = true;
        b();
        return this;
    }

    @Override // a.b.g.b.a.b
    public ColorStateList getIconTintList() {
        return this.o;
    }

    @Override // a.b.g.b.a.b
    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.p = iconTintMode;
        this.r = true;
        b();
        return this;
    }

    @Override // a.b.g.b.a.b
    public PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    private void b() {
        if (this.k == null) {
            return;
        }
        if (this.q || this.r) {
            this.k = android.support.v4.graphics.drawable.a.h(this.k);
            this.k = this.k.mutate();
            if (this.q) {
                android.support.v4.graphics.drawable.a.a(this.k, this.o);
            }
            if (this.r) {
                android.support.v4.graphics.drawable.a.a(this.k, this.p);
            }
        }
    }
}
