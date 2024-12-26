package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.AbstractCc;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb;

/* renamed from: android.support.v7.view.menu.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca implements InterfaceMenuItemCb {

    /* renamed from: a, reason: contains not printable characters */
    private final int f۱۱۱۷۵a;

    /* renamed from: b, reason: contains not printable characters */
    private final int f۱۱۱۷۶b;

    /* renamed from: c, reason: contains not printable characters */
    private final int f۱۱۱۷۷c;

    /* renamed from: d, reason: contains not printable characters */
    private CharSequence f۱۱۱۷۸d;

    /* renamed from: e, reason: contains not printable characters */
    private CharSequence f۱۱۱۷۹e;

    /* renamed from: f, reason: contains not printable characters */
    private Intent f۱۱۱۸۰f;

    /* renamed from: g, reason: contains not printable characters */
    private char f۱۱۱۸۱g;

    /* renamed from: i, reason: contains not printable characters */
    private char f۱۱۱۸۳i;

    /* renamed from: k, reason: contains not printable characters */
    private Drawable f۱۱۱۸۵k;

    /* renamed from: l, reason: contains not printable characters */
    private Context f۱۱۱۸۶l;

    /* renamed from: m, reason: contains not printable characters */
    private CharSequence f۱۱۱۸۷m;

    /* renamed from: n, reason: contains not printable characters */
    private CharSequence f۱۱۱۸۸n;

    /* renamed from: h, reason: contains not printable characters */
    private int f۱۱۱۸۲h = 4096;

    /* renamed from: j, reason: contains not printable characters */
    private int f۱۱۱۸۴j = 4096;

    /* renamed from: o, reason: contains not printable characters */
    private ColorStateList f۱۱۱۸۹o = null;

    /* renamed from: p, reason: contains not printable characters */
    private PorterDuff.Mode f۱۱۱۹۰p = null;

    /* renamed from: q, reason: contains not printable characters */
    private boolean f۱۱۱۹۱q = false;

    /* renamed from: r, reason: contains not printable characters */
    private boolean f۱۱۱۹۲r = false;

    /* renamed from: s, reason: contains not printable characters */
    private int f۱۱۱۹۳s = 16;

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        setActionView(i);
        throw null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        setActionView(view);
        throw null;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    public Ca(Context context, int group, int id, int categoryOrder, int ordering, CharSequence title) {
        this.f۱۱۱۸۶l = context;
        this.f۱۱۱۷۵a = id;
        this.f۱۱۱۷۶b = group;
        this.f۱۱۱۷۷c = ordering;
        this.f۱۱۱۷۸d = title;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f۱۱۱۸۳i;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f۱۱۱۸۴j;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f۱۱۱۷۶b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f۱۱۱۸۵k;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f۱۱۱۸۰f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f۱۱۱۷۵a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f۱۱۱۸۱g;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f۱۱۱۸۲h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f۱۱۱۷۷c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f۱۱۱۷۸d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f۱۱۱۷۹e;
        return charSequence != null ? charSequence : this.f۱۱۱۷۸d;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f۱۱۱۹۳s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f۱۱۱۹۳s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f۱۱۱۹۳s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f۱۱۱۹۳s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char alphaChar) {
        this.f۱۱۱۸۳i = Character.toLowerCase(alphaChar);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        this.f۱۱۱۸۳i = Character.toLowerCase(alphaChar);
        this.f۱۱۱۸۴j = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f۱۱۱۹۳s = (this.f۱۱۱۹۳s & (-2)) | (z ? 1 : 0);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean checked) {
        this.f۱۱۱۹۳s = (this.f۱۱۱۹۳s & (-3)) | (checked ? 2 : 0);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean enabled) {
        this.f۱۱۱۹۳s = (this.f۱۱۱۹۳s & (-17)) | (enabled ? 16 : 0);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.f۱۱۱۸۵k = icon;
        m۱۱۶۸۵b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconRes) {
        this.f۱۱۱۸۵k = android.support.v4.content.Ca.m۱۰۵۵۶c(this.f۱۱۱۸۶l, iconRes);
        m۱۱۶۸۵b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f۱۱۱۸۰f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char numericChar) {
        this.f۱۱۱۸۱g = numericChar;
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        this.f۱۱۱۸۱g = numericChar;
        this.f۱۱۱۸۲h = KeyEvent.normalizeMetaState(numericModifiers);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f۱۱۱۸۱g = numericChar;
        this.f۱۱۱۸۳i = Character.toLowerCase(alphaChar);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
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

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence title) {
        this.f۱۱۱۷۹e = title;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean visible) {
        this.f۱۱۱۹۳s = (this.f۱۱۱۹۳s & 8) | (visible ? 0 : 8);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public void setShowAsAction(int show) {
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public InterfaceMenuItemCb setActionView(View actionView) {
        throw new UnsupportedOperationException();
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public InterfaceMenuItemCb setActionView(int resId) {
        throw new UnsupportedOperationException();
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCc mo۱۱۸۲۸a() {
        return null;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb
    /* renamed from: a, reason: contains not printable characters */
    public InterfaceMenuItemCb mo۱۱۸۲۷a(AbstractCc actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public InterfaceMenuItemCb setShowAsActionFlags(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        throw new UnsupportedOperationException();
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public InterfaceMenuItemCb setContentDescription(CharSequence contentDescription) {
        this.f۱۱۱۸۷m = contentDescription;
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f۱۱۱۸۷m;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public InterfaceMenuItemCb setTooltipText(CharSequence tooltipText) {
        this.f۱۱۱۸۸n = tooltipText;
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f۱۱۱۸۸n;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.f۱۱۱۸۹o = iconTintList;
        this.f۱۱۱۹۱q = true;
        m۱۱۶۸۵b();
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f۱۱۱۸۹o;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.f۱۱۱۹۰p = iconTintMode;
        this.f۱۱۱۹۲r = true;
        m۱۱۶۸۵b();
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f۱۱۱۹۰p;
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۱۶۸۵b() {
        if (this.f۱۱۱۸۵k != null) {
            if (this.f۱۱۱۹۱q || this.f۱۱۱۹۲r) {
                this.f۱۱۱۸۵k = android.support.v4.graphics.drawable.Ca.m۱۰۶۵۲h(this.f۱۱۱۸۵k);
                this.f۱۱۱۸۵k = this.f۱۱۱۸۵k.mutate();
                if (this.f۱۱۱۹۱q) {
                    android.support.v4.graphics.drawable.Ca.m۱۰۶۳۸a(this.f۱۱۱۸۵k, this.f۱۱۱۸۹o);
                }
                if (this.f۱۱۱۹۲r) {
                    android.support.v4.graphics.drawable.Ca.m۱۰۶۴۱a(this.f۱۱۱۸۵k, this.f۱۱۱۹۰p);
                }
            }
        }
    }
}
