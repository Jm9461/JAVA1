package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.AbstractCc;
import android.support.v7.view.menu.InterfaceCq;
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
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ch;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca;

/* renamed from: android.support.v7.view.menu.k, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ck implements InterfaceMenuItemCb {

    /* renamed from: A, reason: contains not printable characters */
    private View f۱۱۲۹۳A;

    /* renamed from: B, reason: contains not printable characters */
    private AbstractCc f۱۱۲۹۴B;

    /* renamed from: C, reason: contains not printable characters */
    private MenuItem.OnActionExpandListener f۱۱۲۹۵C;

    /* renamed from: E, reason: contains not printable characters */
    private ContextMenu.ContextMenuInfo f۱۱۲۹۷E;

    /* renamed from: a, reason: contains not printable characters */
    private final int f۱۱۲۹۸a;

    /* renamed from: b, reason: contains not printable characters */
    private final int f۱۱۲۹۹b;

    /* renamed from: c, reason: contains not printable characters */
    private final int f۱۱۳۰۰c;

    /* renamed from: d, reason: contains not printable characters */
    private final int f۱۱۳۰۱d;

    /* renamed from: e, reason: contains not printable characters */
    private CharSequence f۱۱۳۰۲e;

    /* renamed from: f, reason: contains not printable characters */
    private CharSequence f۱۱۳۰۳f;

    /* renamed from: g, reason: contains not printable characters */
    private Intent f۱۱۳۰۴g;

    /* renamed from: h, reason: contains not printable characters */
    private char f۱۱۳۰۵h;

    /* renamed from: j, reason: contains not printable characters */
    private char f۱۱۳۰۷j;

    /* renamed from: l, reason: contains not printable characters */
    private Drawable f۱۱۳۰۹l;

    /* renamed from: n, reason: contains not printable characters */
    Ch f۱۱۳۱۱n;

    /* renamed from: o, reason: contains not printable characters */
    private SubMenuCv f۱۱۳۱۲o;

    /* renamed from: p, reason: contains not printable characters */
    private Runnable f۱۱۳۱۳p;

    /* renamed from: q, reason: contains not printable characters */
    private MenuItem.OnMenuItemClickListener f۱۱۳۱۴q;

    /* renamed from: r, reason: contains not printable characters */
    private CharSequence f۱۱۳۱۵r;

    /* renamed from: s, reason: contains not printable characters */
    private CharSequence f۱۱۳۱۶s;

    /* renamed from: z, reason: contains not printable characters */
    private int f۱۱۳۲۳z;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۱۳۰۶i = 4096;

    /* renamed from: k, reason: contains not printable characters */
    private int f۱۱۳۰۸k = 4096;

    /* renamed from: m, reason: contains not printable characters */
    private int f۱۱۳۱۰m = 0;

    /* renamed from: t, reason: contains not printable characters */
    private ColorStateList f۱۱۳۱۷t = null;

    /* renamed from: u, reason: contains not printable characters */
    private PorterDuff.Mode f۱۱۳۱۸u = null;

    /* renamed from: v, reason: contains not printable characters */
    private boolean f۱۱۳۱۹v = false;

    /* renamed from: w, reason: contains not printable characters */
    private boolean f۱۱۳۲۰w = false;

    /* renamed from: x, reason: contains not printable characters */
    private boolean f۱۱۳۲۱x = false;

    /* renamed from: y, reason: contains not printable characters */
    private int f۱۱۳۲۲y = 16;

    /* renamed from: D, reason: contains not printable characters */
    private boolean f۱۱۲۹۶D = false;

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        setActionView(i);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        setActionView(view);
        return this;
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

    Ck(Ch menu, int group, int id, int categoryOrder, int ordering, CharSequence title, int showAsAction) {
        this.f۱۱۳۲۳z = 0;
        this.f۱۱۳۱۱n = menu;
        this.f۱۱۲۹۸a = id;
        this.f۱۱۲۹۹b = group;
        this.f۱۱۳۰۰c = categoryOrder;
        this.f۱۱۳۰۱d = ordering;
        this.f۱۱۳۰۲e = title;
        this.f۱۱۳۲۳z = showAsAction;
    }

    /* renamed from: g, reason: contains not printable characters */
    public boolean m۱۱۸۴۲g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f۱۱۳۱۴q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Ch ch = this.f۱۱۳۱۱n;
        if (ch.mo۱۱۹۳۸a(ch, this)) {
            return true;
        }
        Runnable runnable = this.f۱۱۳۱۳p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f۱۱۳۰۴g != null) {
            try {
                this.f۱۱۳۱۱n.m۱۱۸۰۲e().startActivity(this.f۱۱۳۰۴g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        AbstractCc abstractCc = this.f۱۱۲۹۴B;
        return abstractCc != null && abstractCc.mo۱۱۸۵۵d();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f۱۱۳۲۲y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean enabled) {
        if (enabled) {
            this.f۱۱۳۲۲y |= 16;
        } else {
            this.f۱۱۳۲۲y &= -17;
        }
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f۱۱۲۹۹b;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f۱۱۲۹۸a;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f۱۱۳۰۰c;
    }

    /* renamed from: c, reason: contains not printable characters */
    public int m۱۱۸۳۵c() {
        return this.f۱۱۳۰۱d;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f۱۱۳۰۴g;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f۱۱۳۰۴g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f۱۱۳۰۷j;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char alphaChar) {
        if (this.f۱۱۳۰۷j == alphaChar) {
            return this;
        }
        this.f۱۱۳۰۷j = Character.toLowerCase(alphaChar);
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        if (this.f۱۱۳۰۷j == alphaChar && this.f۱۱۳۰۸k == alphaModifiers) {
            return this;
        }
        this.f۱۱۳۰۷j = Character.toLowerCase(alphaChar);
        this.f۱۱۳۰۸k = KeyEvent.normalizeMetaState(alphaModifiers);
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f۱۱۳۰۸k;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f۱۱۳۰۵h;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f۱۱۳۰۶i;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char numericChar) {
        if (this.f۱۱۳۰۵h == numericChar) {
            return this;
        }
        this.f۱۱۳۰۵h = numericChar;
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        if (this.f۱۱۳۰۵h == numericChar && this.f۱۱۳۰۶i == numericModifiers) {
            return this;
        }
        this.f۱۱۳۰۵h = numericChar;
        this.f۱۱۳۰۶i = KeyEvent.normalizeMetaState(numericModifiers);
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f۱۱۳۰۵h = numericChar;
        this.f۱۱۳۰۷j = Character.toLowerCase(alphaChar);
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f۱۱۳۰۵h = numericChar;
        this.f۱۱۳۰۶i = KeyEvent.normalizeMetaState(numericModifiers);
        this.f۱۱۳۰۷j = Character.toLowerCase(alphaChar);
        this.f۱۱۳۰۸k = KeyEvent.normalizeMetaState(alphaModifiers);
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    /* renamed from: d, reason: contains not printable characters */
    char m۱۱۸۳۷d() {
        return this.f۱۱۳۱۱n.mo۱۱۹۴۴p() ? this.f۱۱۳۰۷j : this.f۱۱۳۰۵h;
    }

    /* renamed from: e, reason: contains not printable characters */
    String m۱۱۸۳۹e() {
        char shortcut = m۱۱۸۳۷d();
        if (shortcut == 0) {
            return "";
        }
        Resources res = this.f۱۱۳۱۱n.m۱۱۸۰۲e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f۱۱۳۱۱n.m۱۱۸۰۲e()).hasPermanentMenuKey()) {
            sb.append(res.getString(Ch.abc_prepend_shortcut_label));
        }
        int modifiers = this.f۱۱۳۱۱n.mo۱۱۹۴۴p() ? this.f۱۱۳۰۸k : this.f۱۱۳۰۶i;
        m۱۱۸۲۶a(sb, modifiers, 65536, res.getString(Ch.abc_menu_meta_shortcut_label));
        m۱۱۸۲۶a(sb, modifiers, 4096, res.getString(Ch.abc_menu_ctrl_shortcut_label));
        m۱۱۸۲۶a(sb, modifiers, 2, res.getString(Ch.abc_menu_alt_shortcut_label));
        m۱۱۸۲۶a(sb, modifiers, 1, res.getString(Ch.abc_menu_shift_shortcut_label));
        m۱۱۸۲۶a(sb, modifiers, 4, res.getString(Ch.abc_menu_sym_shortcut_label));
        m۱۱۸۲۶a(sb, modifiers, 8, res.getString(Ch.abc_menu_function_shortcut_label));
        if (shortcut == '\b') {
            sb.append(res.getString(Ch.abc_menu_delete_shortcut_label));
        } else if (shortcut == '\n') {
            sb.append(res.getString(Ch.abc_menu_enter_shortcut_label));
        } else if (shortcut == ' ') {
            sb.append(res.getString(Ch.abc_menu_space_shortcut_label));
        } else {
            sb.append(shortcut);
        }
        return sb.toString();
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۱۸۲۶a(StringBuilder sb, int modifiers, int flag, String label) {
        if ((modifiers & flag) == flag) {
            sb.append(label);
        }
    }

    /* renamed from: m, reason: contains not printable characters */
    boolean m۱۱۸۴۸m() {
        return this.f۱۱۳۱۱n.mo۱۱۹۴۵q() && m۱۱۸۳۷d() != 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f۱۱۳۱۲o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f۱۱۳۱۲o != null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۸۳۰a(SubMenuCv subMenu) {
        this.f۱۱۳۱۲o = subMenu;
        subMenu.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f۱۱۳۰۲e;
    }

    /* renamed from: a, reason: contains not printable characters */
    CharSequence m۱۱۸۲۹a(InterfaceCq.a itemView) {
        if (itemView != null && itemView.mo۱۱۹۱۱a()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f۱۱۳۰۲e = title;
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        SubMenuCv subMenuCv = this.f۱۱۳۱۲o;
        if (subMenuCv != null) {
            subMenuCv.setHeaderTitle(title);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        setTitle(this.f۱۱۳۱۱n.m۱۱۸۰۲e().getString(title));
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence ctitle = this.f۱۱۳۰۳f;
        if (ctitle == null) {
            ctitle = this.f۱۱۳۰۲e;
        }
        if (Build.VERSION.SDK_INT < 18 && ctitle != null && !(ctitle instanceof String)) {
            return ctitle.toString();
        }
        return ctitle;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence title) {
        this.f۱۱۳۰۳f = title;
        if (title == null) {
            CharSequence title2 = this.f۱۱۳۰۲e;
        }
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f۱۱۳۰۹l;
        if (drawable != null) {
            return m۱۱۸۲۵a(drawable);
        }
        if (this.f۱۱۳۱۰m != 0) {
            Drawable icon = Ca.m۸۶۰۴c(this.f۱۱۳۱۱n.m۱۱۸۰۲e(), this.f۱۱۳۱۰m);
            this.f۱۱۳۱۰m = 0;
            this.f۱۱۳۰۹l = icon;
            return m۱۱۸۲۵a(icon);
        }
        return null;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.f۱۱۳۱۰m = 0;
        this.f۱۱۳۰۹l = icon;
        this.f۱۱۳۲۱x = true;
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconResId) {
        this.f۱۱۳۰۹l = null;
        this.f۱۱۳۱۰m = iconResId;
        this.f۱۱۳۲۱x = true;
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.f۱۱۳۱۷t = iconTintList;
        this.f۱۱۳۱۹v = true;
        this.f۱۱۳۲۱x = true;
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f۱۱۳۱۷t;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.f۱۱۳۱۸u = iconTintMode;
        this.f۱۱۳۲۰w = true;
        this.f۱۱۳۲۱x = true;
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f۱۱۳۱۸u;
    }

    /* renamed from: a, reason: contains not printable characters */
    private Drawable m۱۱۸۲۵a(Drawable icon) {
        if (icon != null && this.f۱۱۳۲۱x && (this.f۱۱۳۱۹v || this.f۱۱۳۲۰w)) {
            icon = android.support.v4.graphics.drawable.Ca.m۱۰۶۵۲h(icon).mutate();
            if (this.f۱۱۳۱۹v) {
                android.support.v4.graphics.drawable.Ca.m۱۰۶۳۸a(icon, this.f۱۱۳۱۷t);
            }
            if (this.f۱۱۳۲۰w) {
                android.support.v4.graphics.drawable.Ca.m۱۰۶۴۱a(icon, this.f۱۱۳۱۸u);
            }
            this.f۱۱۳۲۱x = false;
        }
        return icon;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f۱۱۳۲۲y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f۱۱۳۲۲y;
        this.f۱۱۳۲۲y = (this.f۱۱۳۲۲y & (-2)) | (z ? 1 : 0);
        if (i != this.f۱۱۳۲۲y) {
            this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        }
        return this;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۱۸۳۶c(boolean exclusive) {
        this.f۱۱۳۲۲y = (this.f۱۱۳۲۲y & (-5)) | (exclusive ? 4 : 0);
    }

    /* renamed from: i, reason: contains not printable characters */
    public boolean m۱۱۸۴۴i() {
        return (this.f۱۱۳۲۲y & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f۱۱۳۲۲y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean checked) {
        if ((this.f۱۱۳۲۲y & 4) != 0) {
            this.f۱۱۳۱۱n.m۱۱۷۸۰a((MenuItem) this);
        } else {
            m۱۱۸۳۴b(checked);
        }
        return this;
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۱۸۳۴b(boolean checked) {
        int oldFlags = this.f۱۱۳۲۲y;
        this.f۱۱۳۲۲y = (this.f۱۱۳۲۲y & (-3)) | (checked ? 2 : 0);
        if (oldFlags != this.f۱۱۳۲۲y) {
            this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        }
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractCc abstractCc = this.f۱۱۲۹۴B;
        return (abstractCc == null || !abstractCc.mo۱۱۸۶۳e()) ? (this.f۱۱۳۲۲y & 8) == 0 : (this.f۱۱۳۲۲y & 8) == 0 && this.f۱۱۲۹۴B.mo۱۱۸۶۲b();
    }

    /* renamed from: e, reason: contains not printable characters */
    boolean m۱۱۸۴۰e(boolean shown) {
        int oldFlags = this.f۱۱۳۲۲y;
        this.f۱۱۳۲۲y = (this.f۱۱۳۲۲y & (-9)) | (shown ? 0 : 8);
        return oldFlags != this.f۱۱۳۲۲y;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean shown) {
        if (m۱۱۸۴۰e(shown)) {
            this.f۱۱۳۱۱n.m۱۱۸۰۱d(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
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

    /* renamed from: a, reason: contains not printable characters */
    void m۱۱۸۳۱a(ContextMenu.ContextMenuInfo menuInfo) {
        this.f۱۱۲۹۷E = menuInfo;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f۱۱۲۹۷E;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۱۸۳۳b() {
        this.f۱۱۳۱۱n.m۱۱۷۹۶c(this);
    }

    /* renamed from: l, reason: contains not printable characters */
    public boolean m۱۱۸۴۷l() {
        return this.f۱۱۳۱۱n.m۱۱۸۰۹k();
    }

    /* renamed from: h, reason: contains not printable characters */
    public boolean m۱۱۸۴۳h() {
        return (this.f۱۱۳۲۲y & 32) == 32;
    }

    /* renamed from: j, reason: contains not printable characters */
    public boolean m۱۱۸۴۵j() {
        return (this.f۱۱۳۲۳z & 1) == 1;
    }

    /* renamed from: k, reason: contains not printable characters */
    public boolean m۱۱۸۴۶k() {
        return (this.f۱۱۳۲۳z & 2) == 2;
    }

    /* renamed from: d, reason: contains not printable characters */
    public void m۱۱۸۳۸d(boolean isActionButton) {
        if (isActionButton) {
            this.f۱۱۳۲۲y |= 32;
        } else {
            this.f۱۱۳۲۲y &= -33;
        }
    }

    /* renamed from: n, reason: contains not printable characters */
    public boolean m۱۱۸۴۹n() {
        return (this.f۱۱۳۲۳z & 4) == 4;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public void setShowAsAction(int actionEnum) {
        int i = actionEnum & 3;
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f۱۱۳۲۳z = actionEnum;
        this.f۱۱۳۱۱n.m۱۱۷۹۶c(this);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public InterfaceMenuItemCb setActionView(View view) {
        int i;
        this.f۱۱۲۹۳A = view;
        this.f۱۱۲۹۴B = null;
        if (view != null && view.getId() == -1 && (i = this.f۱۱۲۹۸a) > 0) {
            view.setId(i);
        }
        this.f۱۱۳۱۱n.m۱۱۷۹۶c(this);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public InterfaceMenuItemCb setActionView(int resId) {
        Context context = this.f۱۱۳۱۱n.m۱۱۸۰۲e();
        LayoutInflater inflater = LayoutInflater.from(context);
        setActionView(inflater.inflate(resId, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public View getActionView() {
        View view = this.f۱۱۲۹۳A;
        if (view != null) {
            return view;
        }
        AbstractCc abstractCc = this.f۱۱۲۹۴B;
        if (abstractCc != null) {
            this.f۱۱۲۹۳A = abstractCc.mo۱۱۸۶۰a(this);
            return this.f۱۱۲۹۳A;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb
    /* renamed from: a, reason: contains not printable characters */
    public AbstractCc mo۱۱۸۲۸a() {
        return this.f۱۱۲۹۴B;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb
    /* renamed from: a, reason: contains not printable characters */
    public InterfaceMenuItemCb mo۱۱۸۲۷a(AbstractCc actionProvider) {
        AbstractCc abstractCc = this.f۱۱۲۹۴B;
        if (abstractCc != null) {
            abstractCc.m۱۰۷۴۴f();
        }
        this.f۱۱۲۹۳A = null;
        this.f۱۱۲۹۴B = actionProvider;
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(true);
        AbstractCc abstractCc2 = this.f۱۱۲۹۴B;
        if (abstractCc2 != null) {
            abstractCc2.mo۱۱۸۶۱a(new a());
        }
        return this;
    }

    /* renamed from: android.support.v7.view.menu.k$a */
    class a implements AbstractCc.b {
        a() {
        }

        @Override // android.support.v4.view.AbstractCc.b
        public void onActionProviderVisibilityChanged(boolean isVisible) {
            Ck ck = Ck.this;
            ck.f۱۱۳۱۱n.m۱۱۸۰۱d(ck);
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public InterfaceMenuItemCb setShowAsActionFlags(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public boolean expandActionView() {
        if (!m۱۱۸۴۱f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f۱۱۲۹۵C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f۱۱۳۱۱n.mo۱۱۹۴۰b(this);
        }
        return false;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f۱۱۳۲۳z & 8) == 0) {
            return false;
        }
        if (this.f۱۱۲۹۳A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f۱۱۲۹۵C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f۱۱۳۱۱n.mo۱۱۹۳۹a(this);
        }
        return false;
    }

    /* renamed from: f, reason: contains not printable characters */
    public boolean m۱۱۸۴۱f() {
        AbstractCc abstractCc;
        if ((this.f۱۱۳۲۳z & 8) == 0) {
            return false;
        }
        if (this.f۱۱۲۹۳A == null && (abstractCc = this.f۱۱۲۹۴B) != null) {
            this.f۱۱۲۹۳A = abstractCc.mo۱۱۸۶۰a(this);
        }
        return this.f۱۱۲۹۳A != null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۸۳۲a(boolean isExpanded) {
        this.f۱۱۲۹۶D = isExpanded;
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f۱۱۲۹۶D;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        this.f۱۱۲۹۵C = listener;
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public InterfaceMenuItemCb setContentDescription(CharSequence contentDescription) {
        this.f۱۱۳۱۵r = contentDescription;
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f۱۱۳۱۵r;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public InterfaceMenuItemCb setTooltipText(CharSequence tooltipText) {
        this.f۱۱۳۱۶s = tooltipText;
        this.f۱۱۳۱۱n.mo۱۱۷۹۱b(false);
        return this;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f۱۱۳۱۶s;
    }
}
