package android.support.p۰۴۷v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۳v4.view.AbstractCc;
import android.support.p۰۴۷v7.view.menu.AbstractCq;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ch;

/* renamed from: android.support.v7.view.menu.k  reason: invalid class name */
public final class Ck implements AbstractMenuItemCb {

    /* renamed from: A  reason: contains not printable characters */
    private View f۱۱۲۹۳A;

    /* renamed from: B  reason: contains not printable characters */
    private AbstractCc f۱۱۲۹۴B;

    /* renamed from: C  reason: contains not printable characters */
    private MenuItem.OnActionExpandListener f۱۱۲۹۵C;

    /* renamed from: D  reason: contains not printable characters */
    private boolean f۱۱۲۹۶D = false;

    /* renamed from: E  reason: contains not printable characters */
    private ContextMenu.ContextMenuInfo f۱۱۲۹۷E;

    /* renamed from: a  reason: contains not printable characters */
    private final int f۱۱۲۹۸a;

    /* renamed from: b  reason: contains not printable characters */
    private final int f۱۱۲۹۹b;

    /* renamed from: c  reason: contains not printable characters */
    private final int f۱۱۳۰۰c;

    /* renamed from: d  reason: contains not printable characters */
    private final int f۱۱۳۰۱d;

    /* renamed from: e  reason: contains not printable characters */
    private CharSequence f۱۱۳۰۲e;

    /* renamed from: f  reason: contains not printable characters */
    private CharSequence f۱۱۳۰۳f;

    /* renamed from: g  reason: contains not printable characters */
    private Intent f۱۱۳۰۴g;

    /* renamed from: h  reason: contains not printable characters */
    private char f۱۱۳۰۵h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۱۳۰۶i = 4096;

    /* renamed from: j  reason: contains not printable characters */
    private char f۱۱۳۰۷j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۱۳۰۸k = 4096;

    /* renamed from: l  reason: contains not printable characters */
    private Drawable f۱۱۳۰۹l;

    /* renamed from: m  reason: contains not printable characters */
    private int f۱۱۳۱۰m = 0;

    /* renamed from: n  reason: contains not printable characters */
    Ch f۱۱۳۱۱n;

    /* renamed from: o  reason: contains not printable characters */
    private SubMenuCv f۱۱۳۱۲o;

    /* renamed from: p  reason: contains not printable characters */
    private Runnable f۱۱۳۱۳p;

    /* renamed from: q  reason: contains not printable characters */
    private MenuItem.OnMenuItemClickListener f۱۱۳۱۴q;

    /* renamed from: r  reason: contains not printable characters */
    private CharSequence f۱۱۳۱۵r;

    /* renamed from: s  reason: contains not printable characters */
    private CharSequence f۱۱۳۱۶s;

    /* renamed from: t  reason: contains not printable characters */
    private ColorStateList f۱۱۳۱۷t = null;

    /* renamed from: u  reason: contains not printable characters */
    private PorterDuff.Mode f۱۱۳۱۸u = null;

    /* renamed from: v  reason: contains not printable characters */
    private boolean f۱۱۳۱۹v = false;

    /* renamed from: w  reason: contains not printable characters */
    private boolean f۱۱۳۲۰w = false;

    /* renamed from: x  reason: contains not printable characters */
    private boolean f۱۱۳۲۱x = false;

    /* renamed from: y  reason: contains not printable characters */
    private int f۱۱۳۲۲y = 16;

    /* renamed from: z  reason: contains not printable characters */
    private int f۱۱۳۲۳z = 0;

    Ck(Ch menu, int group, int id, int categoryOrder, int ordering, CharSequence title, int showAsAction) {
        this.f۱۱۳۱۱n = menu;
        this.f۱۱۲۹۸a = id;
        this.f۱۱۲۹۹b = group;
        this.f۱۱۳۰۰c = categoryOrder;
        this.f۱۱۳۰۱d = ordering;
        this.f۱۱۳۰۲e = title;
        this.f۱۱۳۲۳z = showAsAction;
    }

    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۳۹۱۲g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f۱۱۳۱۴q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Ch hVar = this.f۱۱۳۱۱n;
        if (hVar.m۱۳۸۵۳a(hVar, this)) {
            return true;
        }
        Runnable runnable = this.f۱۱۳۱۳p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f۱۱۳۰۴g != null) {
            try {
                this.f۱۱۳۱۱n.m۱۳۸۷۲e().startActivity(this.f۱۱۳۰۴g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        AbstractCc cVar = this.f۱۱۲۹۴B;
        if (cVar == null || !cVar.m۱۲۸۱۲d()) {
            return false;
        }
        return true;
    }

    public boolean isEnabled() {
        return (this.f۱۱۳۲۲y & 16) != 0;
    }

    public MenuItem setEnabled(boolean enabled) {
        if (enabled) {
            this.f۱۱۳۲۲y |= 16;
        } else {
            this.f۱۱۳۲۲y &= -17;
        }
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    public int getGroupId() {
        return this.f۱۱۲۹۹b;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f۱۱۲۹۸a;
    }

    public int getOrder() {
        return this.f۱۱۳۰۰c;
    }

    /* renamed from: c  reason: contains not printable characters */
    public int m۱۳۹۰۵c() {
        return this.f۱۱۳۰۱d;
    }

    public Intent getIntent() {
        return this.f۱۱۳۰۴g;
    }

    public MenuItem setIntent(Intent intent) {
        this.f۱۱۳۰۴g = intent;
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.f۱۱۳۰۷j;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        if (this.f۱۱۳۰۷j == alphaChar) {
            return this;
        }
        this.f۱۱۳۰۷j = Character.toLowerCase(alphaChar);
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        if (this.f۱۱۳۰۷j == alphaChar && this.f۱۱۳۰۸k == alphaModifiers) {
            return this;
        }
        this.f۱۱۳۰۷j = Character.toLowerCase(alphaChar);
        this.f۱۱۳۰۸k = KeyEvent.normalizeMetaState(alphaModifiers);
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public int getAlphabeticModifiers() {
        return this.f۱۱۳۰۸k;
    }

    public char getNumericShortcut() {
        return this.f۱۱۳۰۵h;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public int getNumericModifiers() {
        return this.f۱۱۳۰۶i;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        if (this.f۱۱۳۰۵h == numericChar) {
            return this;
        }
        this.f۱۱۳۰۵h = numericChar;
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        if (this.f۱۱۳۰۵h == numericChar && this.f۱۱۳۰۶i == numericModifiers) {
            return this;
        }
        this.f۱۱۳۰۵h = numericChar;
        this.f۱۱۳۰۶i = KeyEvent.normalizeMetaState(numericModifiers);
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f۱۱۳۰۵h = numericChar;
        this.f۱۱۳۰۷j = Character.toLowerCase(alphaChar);
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f۱۱۳۰۵h = numericChar;
        this.f۱۱۳۰۶i = KeyEvent.normalizeMetaState(numericModifiers);
        this.f۱۱۳۰۷j = Character.toLowerCase(alphaChar);
        this.f۱۱۳۰۸k = KeyEvent.normalizeMetaState(alphaModifiers);
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public char m۱۳۹۰۷d() {
        return this.f۱۱۳۱۱n.m۱۳۸۸۴p() ? this.f۱۱۳۰۷j : this.f۱۱۳۰۵h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public String m۱۳۹۰۹e() {
        char shortcut = m۱۳۹۰۷d();
        if (shortcut == 0) {
            return "";
        }
        Resources res = this.f۱۱۳۱۱n.m۱۳۸۷۲e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f۱۱۳۱۱n.m۱۳۸۷۲e()).hasPermanentMenuKey()) {
            sb.append(res.getString(Ch.abc_prepend_shortcut_label));
        }
        int modifiers = this.f۱۱۳۱۱n.m۱۳۸۸۴p() ? this.f۱۱۳۰۸k : this.f۱۱۳۰۶i;
        m۱۳۸۹۶a(sb, modifiers, 65536, res.getString(Ch.abc_menu_meta_shortcut_label));
        m۱۳۸۹۶a(sb, modifiers, 4096, res.getString(Ch.abc_menu_ctrl_shortcut_label));
        m۱۳۸۹۶a(sb, modifiers, 2, res.getString(Ch.abc_menu_alt_shortcut_label));
        m۱۳۸۹۶a(sb, modifiers, 1, res.getString(Ch.abc_menu_shift_shortcut_label));
        m۱۳۸۹۶a(sb, modifiers, 4, res.getString(Ch.abc_menu_sym_shortcut_label));
        m۱۳۸۹۶a(sb, modifiers, 8, res.getString(Ch.abc_menu_function_shortcut_label));
        if (shortcut == '\b') {
            sb.append(res.getString(Ch.abc_menu_delete_shortcut_label));
        } else if (shortcut == '\n') {
            sb.append(res.getString(Ch.abc_menu_enter_shortcut_label));
        } else if (shortcut != ' ') {
            sb.append(shortcut);
        } else {
            sb.append(res.getString(Ch.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۳۸۹۶a(StringBuilder sb, int modifiers, int flag, String label) {
        if ((modifiers & flag) == flag) {
            sb.append(label);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m  reason: contains not printable characters */
    public boolean m۱۳۹۱۸m() {
        return this.f۱۱۳۱۱n.m۱۳۸۸۵q() && m۱۳۹۰۷d() != 0;
    }

    public SubMenu getSubMenu() {
        return this.f۱۱۳۱۲o;
    }

    public boolean hasSubMenu() {
        return this.f۱۱۳۱۲o != null;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۰۰a(SubMenuCv subMenu) {
        this.f۱۱۳۱۲o = subMenu;
        subMenu.setHeaderTitle(getTitle());
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f۱۱۳۰۲e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public CharSequence m۱۳۸۹۹a(AbstractCq.AbstractCa itemView) {
        if (itemView == null || !itemView.m۱۳۹۸۱a()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f۱۱۳۰۲e = title;
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        SubMenuCv vVar = this.f۱۱۳۱۲o;
        if (vVar != null) {
            vVar.setHeaderTitle(title);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        setTitle(this.f۱۱۳۱۱n.m۱۳۸۷۲e().getString(title));
        return this;
    }

    public CharSequence getTitleCondensed() {
        CharSequence ctitle = this.f۱۱۳۰۳f;
        if (ctitle == null) {
            ctitle = this.f۱۱۳۰۲e;
        }
        if (Build.VERSION.SDK_INT >= 18 || ctitle == null || (ctitle instanceof String)) {
            return ctitle;
        }
        return ctitle.toString();
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f۱۱۳۰۳f = title;
        if (title == null) {
            CharSequence title2 = this.f۱۱۳۰۲e;
        }
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f۱۱۳۰۹l;
        if (drawable != null) {
            return m۱۳۸۹۵a(drawable);
        }
        if (this.f۱۱۳۱۰m == 0) {
            return null;
        }
        Drawable icon = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(this.f۱۱۳۱۱n.m۱۳۸۷۲e(), this.f۱۱۳۱۰m);
        this.f۱۱۳۱۰m = 0;
        this.f۱۱۳۰۹l = icon;
        return m۱۳۸۹۵a(icon);
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.f۱۱۳۱۰m = 0;
        this.f۱۱۳۰۹l = icon;
        this.f۱۱۳۲۱x = true;
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconResId) {
        this.f۱۱۳۰۹l = null;
        this.f۱۱۳۱۰m = iconResId;
        this.f۱۱۳۲۱x = true;
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.f۱۱۳۱۷t = iconTintList;
        this.f۱۱۳۱۹v = true;
        this.f۱۱۳۲۱x = true;
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public ColorStateList getIconTintList() {
        return this.f۱۱۳۱۷t;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.f۱۱۳۱۸u = iconTintMode;
        this.f۱۱۳۲۰w = true;
        this.f۱۱۳۲۱x = true;
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public PorterDuff.Mode getIconTintMode() {
        return this.f۱۱۳۱۸u;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Drawable m۱۳۸۹۵a(Drawable icon) {
        if (icon != null && this.f۱۱۳۲۱x && (this.f۱۱۳۱۹v || this.f۱۱۳۲۰w)) {
            icon = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(icon).mutate();
            if (this.f۱۱۳۱۹v) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(icon, this.f۱۱۳۱۷t);
            }
            if (this.f۱۱۳۲۰w) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(icon, this.f۱۱۳۱۸u);
            }
            this.f۱۱۳۲۱x = false;
        }
        return icon;
    }

    public boolean isCheckable() {
        return (this.f۱۱۳۲۲y & 1) == 1;
    }

    public MenuItem setCheckable(boolean checkable) {
        int oldFlags = this.f۱۱۳۲۲y;
        this.f۱۱۳۲۲y = (this.f۱۱۳۲۲y & -2) | (checkable ? 1 : 0);
        if (oldFlags != this.f۱۱۳۲۲y) {
            this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        }
        return this;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۹۰۶c(boolean exclusive) {
        this.f۱۱۳۲۲y = (this.f۱۱۳۲۲y & -5) | (exclusive ? 4 : 0);
    }

    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۳۹۱۴i() {
        return (this.f۱۱۳۲۲y & 4) != 0;
    }

    public boolean isChecked() {
        return (this.f۱۱۳۲۲y & 2) == 2;
    }

    public MenuItem setChecked(boolean checked) {
        if ((this.f۱۱۳۲۲y & 4) != 0) {
            this.f۱۱۳۱۱n.m۱۳۸۵۰a((MenuItem) this);
        } else {
            m۱۳۹۰۴b(checked);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۹۰۴b(boolean checked) {
        int oldFlags = this.f۱۱۳۲۲y;
        this.f۱۱۳۲۲y = (this.f۱۱۳۲۲y & -3) | (checked ? 2 : 0);
        if (oldFlags != this.f۱۱۳۲۲y) {
            this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        }
    }

    public boolean isVisible() {
        AbstractCc cVar = this.f۱۱۲۹۴B;
        if (cVar == null || !cVar.m۱۲۸۱۳e()) {
            if ((this.f۱۱۳۲۲y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f۱۱۳۲۲y & 8) != 0 || !this.f۱۱۲۹۴B.m۱۲۸۱۰b()) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۳۹۱۰e(boolean shown) {
        int oldFlags = this.f۱۱۳۲۲y;
        this.f۱۱۳۲۲y = (this.f۱۱۳۲۲y & -9) | (shown ? 0 : 8);
        if (oldFlags != this.f۱۱۳۲۲y) {
            return true;
        }
        return false;
    }

    public MenuItem setVisible(boolean shown) {
        if (m۱۳۹۱۰e(shown)) {
            this.f۱۱۳۱۱n.m۱۳۸۷۱d(this);
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener clickListener) {
        this.f۱۱۳۱۴q = clickListener;
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f۱۱۳۰۲e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۰۱a(ContextMenu.ContextMenuInfo menuInfo) {
        this.f۱۱۲۹۷E = menuInfo;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f۱۱۲۹۷E;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۹۰۳b() {
        this.f۱۱۳۱۱n.m۱۳۸۶۶c(this);
    }

    /* renamed from: l  reason: contains not printable characters */
    public boolean m۱۳۹۱۷l() {
        return this.f۱۱۳۱۱n.m۱۳۸۷۹k();
    }

    /* renamed from: h  reason: contains not printable characters */
    public boolean m۱۳۹۱۳h() {
        return (this.f۱۱۳۲۲y & 32) == 32;
    }

    /* renamed from: j  reason: contains not printable characters */
    public boolean m۱۳۹۱۵j() {
        return (this.f۱۱۳۲۳z & 1) == 1;
    }

    /* renamed from: k  reason: contains not printable characters */
    public boolean m۱۳۹۱۶k() {
        return (this.f۱۱۳۲۳z & 2) == 2;
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۳۹۰۸d(boolean isActionButton) {
        if (isActionButton) {
            this.f۱۱۳۲۲y |= 32;
        } else {
            this.f۱۱۳۲۲y &= -33;
        }
    }

    /* renamed from: n  reason: contains not printable characters */
    public boolean m۱۳۹۱۹n() {
        return (this.f۱۱۳۲۳z & 4) == 4;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public void setShowAsAction(int actionEnum) {
        int i = actionEnum & 3;
        if (i == 0 || i == 1 || i == 2) {
            this.f۱۱۳۲۳z = actionEnum;
            this.f۱۱۳۱۱n.m۱۳۸۶۶c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb, android.view.MenuItem
    public AbstractMenuItemCb setActionView(View view) {
        int i;
        this.f۱۱۲۹۳A = view;
        this.f۱۱۲۹۴B = null;
        if (view != null && view.getId() == -1 && (i = this.f۱۱۲۹۸a) > 0) {
            view.setId(i);
        }
        this.f۱۱۳۱۱n.m۱۳۸۶۶c(this);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb, android.view.MenuItem
    public AbstractMenuItemCb setActionView(int resId) {
        Context context = this.f۱۱۳۱۱n.m۱۳۸۷۲e();
        setActionView(LayoutInflater.from(context).inflate(resId, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public View getActionView() {
        View view = this.f۱۱۲۹۳A;
        if (view != null) {
            return view;
        }
        AbstractCc cVar = this.f۱۱۲۹۴B;
        if (cVar == null) {
            return null;
        }
        this.f۱۱۲۹۳A = cVar.m۱۲۸۰۵a(this);
        return this.f۱۱۲۹۳A;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCc m۱۳۸۹۸a() {
        return this.f۱۱۲۹۴B;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    /* renamed from: a  reason: contains not printable characters */
    public AbstractMenuItemCb m۱۳۸۹۷a(AbstractCc actionProvider) {
        AbstractCc cVar = this.f۱۱۲۹۴B;
        if (cVar != null) {
            cVar.m۱۲۸۱۴f();
        }
        this.f۱۱۲۹۳A = null;
        this.f۱۱۲۹۴B = actionProvider;
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(true);
        AbstractCc cVar2 = this.f۱۱۲۹۴B;
        if (cVar2 != null) {
            cVar2.m۱۲۸۰۷a(new Ca());
        }
        return this;
    }

    /* renamed from: android.support.v7.view.menu.k$a  reason: invalid class name */
    class Ca implements AbstractCc.AbstractCb {
        Ca() {
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCc.AbstractCb
        public void onActionProviderVisibilityChanged(boolean isVisible) {
            Ck kVar = Ck.this;
            kVar.f۱۱۳۱۱n.m۱۳۸۷۱d(kVar);
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public AbstractMenuItemCb setShowAsActionFlags(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public boolean expandActionView() {
        if (!m۱۳۹۱۱f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f۱۱۲۹۵C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f۱۱۳۱۱n.m۱۳۸۶۲b(this);
        }
        return false;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public boolean collapseActionView() {
        if ((this.f۱۱۳۲۳z & 8) == 0) {
            return false;
        }
        if (this.f۱۱۲۹۳A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f۱۱۲۹۵C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f۱۱۳۱۱n.m۱۳۸۵۴a(this);
        }
        return false;
    }

    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۳۹۱۱f() {
        AbstractCc cVar;
        if ((this.f۱۱۳۲۳z & 8) == 0) {
            return false;
        }
        if (this.f۱۱۲۹۳A == null && (cVar = this.f۱۱۲۹۴B) != null) {
            this.f۱۱۲۹۳A = cVar.m۱۲۸۰۵a(this);
        }
        if (this.f۱۱۲۹۳A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۰۲a(boolean isExpanded) {
        this.f۱۱۲۹۶D = isExpanded;
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public boolean isActionViewExpanded() {
        return this.f۱۱۲۹۶D;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        this.f۱۱۲۹۵C = listener;
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public AbstractMenuItemCb setContentDescription(CharSequence contentDescription) {
        this.f۱۱۳۱۵r = contentDescription;
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public CharSequence getContentDescription() {
        return this.f۱۱۳۱۵r;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public AbstractMenuItemCb setTooltipText(CharSequence tooltipText) {
        this.f۱۱۳۱۶s = tooltipText;
        this.f۱۱۳۱۱n.m۱۳۸۶۱b(false);
        return this;
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb
    public CharSequence getTooltipText() {
        return this.f۱۱۳۱۶s;
    }
}
