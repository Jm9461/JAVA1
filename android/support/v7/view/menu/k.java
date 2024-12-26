package android.support.v7.view.menu;

import a.b.g.b.a.b;
import a.b.h.a.h;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.c;
import android.support.v7.view.menu.q;
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

public final class k implements b {
    private View A;
    private c B;
    private MenuItem.OnActionExpandListener C;
    private boolean D = false;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f۱۷۱۲a;

    /* renamed from: b  reason: collision with root package name */
    private final int f۱۷۱۳b;

    /* renamed from: c  reason: collision with root package name */
    private final int f۱۷۱۴c;

    /* renamed from: d  reason: collision with root package name */
    private final int f۱۷۱۵d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f۱۷۱۶e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f۱۷۱۷f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f۱۷۱۸g;

    /* renamed from: h  reason: collision with root package name */
    private char f۱۷۱۹h;
    private int i = 4096;
    private char j;
    private int k = 4096;
    private Drawable l;
    private int m = 0;
    h n;
    private v o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private int z = 0;

    k(h menu, int group, int id, int categoryOrder, int ordering, CharSequence title, int showAsAction) {
        this.n = menu;
        this.f۱۷۱۲a = id;
        this.f۱۷۱۳b = group;
        this.f۱۷۱۴c = categoryOrder;
        this.f۱۷۱۵d = ordering;
        this.f۱۷۱۶e = title;
        this.z = showAsAction;
    }

    public boolean g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        h hVar = this.n;
        if (hVar.a(hVar, this)) {
            return true;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f۱۷۱۸g != null) {
            try {
                this.n.e().startActivity(this.f۱۷۱۸g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        c cVar = this.B;
        if (cVar == null || !cVar.d()) {
            return false;
        }
        return true;
    }

    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    public MenuItem setEnabled(boolean enabled) {
        if (enabled) {
            this.y |= 16;
        } else {
            this.y &= -17;
        }
        this.n.b(false);
        return this;
    }

    public int getGroupId() {
        return this.f۱۷۱۳b;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f۱۷۱۲a;
    }

    public int getOrder() {
        return this.f۱۷۱۴c;
    }

    public int c() {
        return this.f۱۷۱۵d;
    }

    public Intent getIntent() {
        return this.f۱۷۱۸g;
    }

    public MenuItem setIntent(Intent intent) {
        this.f۱۷۱۸g = intent;
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.j;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        if (this.j == alphaChar) {
            return this;
        }
        this.j = Character.toLowerCase(alphaChar);
        this.n.b(false);
        return this;
    }

    @Override // a.b.g.b.a.b
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        if (this.j == alphaChar && this.k == alphaModifiers) {
            return this;
        }
        this.j = Character.toLowerCase(alphaChar);
        this.k = KeyEvent.normalizeMetaState(alphaModifiers);
        this.n.b(false);
        return this;
    }

    @Override // a.b.g.b.a.b
    public int getAlphabeticModifiers() {
        return this.k;
    }

    public char getNumericShortcut() {
        return this.f۱۷۱۹h;
    }

    @Override // a.b.g.b.a.b
    public int getNumericModifiers() {
        return this.i;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        if (this.f۱۷۱۹h == numericChar) {
            return this;
        }
        this.f۱۷۱۹h = numericChar;
        this.n.b(false);
        return this;
    }

    @Override // a.b.g.b.a.b
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        if (this.f۱۷۱۹h == numericChar && this.i == numericModifiers) {
            return this;
        }
        this.f۱۷۱۹h = numericChar;
        this.i = KeyEvent.normalizeMetaState(numericModifiers);
        this.n.b(false);
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f۱۷۱۹h = numericChar;
        this.j = Character.toLowerCase(alphaChar);
        this.n.b(false);
        return this;
    }

    @Override // a.b.g.b.a.b
    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f۱۷۱۹h = numericChar;
        this.i = KeyEvent.normalizeMetaState(numericModifiers);
        this.j = Character.toLowerCase(alphaChar);
        this.k = KeyEvent.normalizeMetaState(alphaModifiers);
        this.n.b(false);
        return this;
    }

    /* access modifiers changed from: package-private */
    public char d() {
        return this.n.p() ? this.j : this.f۱۷۱۹h;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        char shortcut = d();
        if (shortcut == 0) {
            return "";
        }
        Resources res = this.n.e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.e()).hasPermanentMenuKey()) {
            sb.append(res.getString(h.abc_prepend_shortcut_label));
        }
        int modifiers = this.n.p() ? this.k : this.i;
        a(sb, modifiers, 65536, res.getString(h.abc_menu_meta_shortcut_label));
        a(sb, modifiers, 4096, res.getString(h.abc_menu_ctrl_shortcut_label));
        a(sb, modifiers, 2, res.getString(h.abc_menu_alt_shortcut_label));
        a(sb, modifiers, 1, res.getString(h.abc_menu_shift_shortcut_label));
        a(sb, modifiers, 4, res.getString(h.abc_menu_sym_shortcut_label));
        a(sb, modifiers, 8, res.getString(h.abc_menu_function_shortcut_label));
        if (shortcut == '\b') {
            sb.append(res.getString(h.abc_menu_delete_shortcut_label));
        } else if (shortcut == '\n') {
            sb.append(res.getString(h.abc_menu_enter_shortcut_label));
        } else if (shortcut != ' ') {
            sb.append(shortcut);
        } else {
            sb.append(res.getString(h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    private static void a(StringBuilder sb, int modifiers, int flag, String label) {
        if ((modifiers & flag) == flag) {
            sb.append(label);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.n.q() && d() != 0;
    }

    public SubMenu getSubMenu() {
        return this.o;
    }

    public boolean hasSubMenu() {
        return this.o != null;
    }

    public void a(v subMenu) {
        this.o = subMenu;
        subMenu.setHeaderTitle(getTitle());
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f۱۷۱۶e;
    }

    /* access modifiers changed from: package-private */
    public CharSequence a(q.a itemView) {
        if (itemView == null || !itemView.a()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f۱۷۱۶e = title;
        this.n.b(false);
        v vVar = this.o;
        if (vVar != null) {
            vVar.setHeaderTitle(title);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        setTitle(this.n.e().getString(title));
        return this;
    }

    public CharSequence getTitleCondensed() {
        CharSequence ctitle = this.f۱۷۱۷f;
        if (ctitle == null) {
            ctitle = this.f۱۷۱۶e;
        }
        if (Build.VERSION.SDK_INT >= 18 || ctitle == null || (ctitle instanceof String)) {
            return ctitle;
        }
        return ctitle.toString();
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f۱۷۱۷f = title;
        if (title == null) {
            CharSequence title2 = this.f۱۷۱۶e;
        }
        this.n.b(false);
        return this;
    }

    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return a(drawable);
        }
        if (this.m == 0) {
            return null;
        }
        Drawable icon = a.b.h.c.a.a.c(this.n.e(), this.m);
        this.m = 0;
        this.l = icon;
        return a(icon);
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.m = 0;
        this.l = icon;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconResId) {
        this.l = null;
        this.m = iconResId;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // a.b.g.b.a.b
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.t = iconTintList;
        this.v = true;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // a.b.g.b.a.b
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // a.b.g.b.a.b
    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.u = iconTintMode;
        this.w = true;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // a.b.g.b.a.b
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    private Drawable a(Drawable icon) {
        if (icon != null && this.x && (this.v || this.w)) {
            icon = android.support.v4.graphics.drawable.a.h(icon).mutate();
            if (this.v) {
                android.support.v4.graphics.drawable.a.a(icon, this.t);
            }
            if (this.w) {
                android.support.v4.graphics.drawable.a.a(icon, this.u);
            }
            this.x = false;
        }
        return icon;
    }

    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    public MenuItem setCheckable(boolean checkable) {
        int oldFlags = this.y;
        this.y = (this.y & -2) | (checkable ? 1 : 0);
        if (oldFlags != this.y) {
            this.n.b(false);
        }
        return this;
    }

    public void c(boolean exclusive) {
        this.y = (this.y & -5) | (exclusive ? 4 : 0);
    }

    public boolean i() {
        return (this.y & 4) != 0;
    }

    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    public MenuItem setChecked(boolean checked) {
        if ((this.y & 4) != 0) {
            this.n.a((MenuItem) this);
        } else {
            b(checked);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean checked) {
        int oldFlags = this.y;
        this.y = (this.y & -3) | (checked ? 2 : 0);
        if (oldFlags != this.y) {
            this.n.b(false);
        }
    }

    public boolean isVisible() {
        c cVar = this.B;
        if (cVar == null || !cVar.e()) {
            if ((this.y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.y & 8) != 0 || !this.B.b()) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e(boolean shown) {
        int oldFlags = this.y;
        this.y = (this.y & -9) | (shown ? 0 : 8);
        if (oldFlags != this.y) {
            return true;
        }
        return false;
    }

    public MenuItem setVisible(boolean shown) {
        if (e(shown)) {
            this.n.d(this);
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener clickListener) {
        this.q = clickListener;
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f۱۷۱۶e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(ContextMenu.ContextMenuInfo menuInfo) {
        this.E = menuInfo;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    public void b() {
        this.n.c(this);
    }

    public boolean l() {
        return this.n.k();
    }

    public boolean h() {
        return (this.y & 32) == 32;
    }

    public boolean j() {
        return (this.z & 1) == 1;
    }

    public boolean k() {
        return (this.z & 2) == 2;
    }

    public void d(boolean isActionButton) {
        if (isActionButton) {
            this.y |= 32;
        } else {
            this.y &= -33;
        }
    }

    public boolean n() {
        return (this.z & 4) == 4;
    }

    @Override // a.b.g.b.a.b
    public void setShowAsAction(int actionEnum) {
        int i2 = actionEnum & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.z = actionEnum;
            this.n.c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // a.b.g.b.a.b, android.view.MenuItem
    public b setActionView(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.f۱۷۱۲a) > 0) {
            view.setId(i2);
        }
        this.n.c(this);
        return this;
    }

    @Override // a.b.g.b.a.b, android.view.MenuItem
    public b setActionView(int resId) {
        Context context = this.n.e();
        setActionView(LayoutInflater.from(context).inflate(resId, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // a.b.g.b.a.b
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        c cVar = this.B;
        if (cVar == null) {
            return null;
        }
        this.A = cVar.a(this);
        return this.A;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // a.b.g.b.a.b
    public c a() {
        return this.B;
    }

    @Override // a.b.g.b.a.b
    public b a(c actionProvider) {
        c cVar = this.B;
        if (cVar != null) {
            cVar.f();
        }
        this.A = null;
        this.B = actionProvider;
        this.n.b(true);
        c cVar2 = this.B;
        if (cVar2 != null) {
            cVar2.a(new a());
        }
        return this;
    }

    class a implements c.b {
        a() {
        }

        @Override // android.support.v4.view.c.b
        public void onActionProviderVisibilityChanged(boolean isVisible) {
            k kVar = k.this;
            kVar.n.d(kVar);
        }
    }

    @Override // a.b.g.b.a.b
    public b setShowAsActionFlags(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    @Override // a.b.g.b.a.b
    public boolean expandActionView() {
        if (!f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.b(this);
        }
        return false;
    }

    @Override // a.b.g.b.a.b
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.a(this);
        }
        return false;
    }

    public boolean f() {
        c cVar;
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null && (cVar = this.B) != null) {
            this.A = cVar.a(this);
        }
        if (this.A != null) {
            return true;
        }
        return false;
    }

    public void a(boolean isExpanded) {
        this.D = isExpanded;
        this.n.b(false);
    }

    @Override // a.b.g.b.a.b
    public boolean isActionViewExpanded() {
        return this.D;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        this.C = listener;
        return this;
    }

    @Override // a.b.g.b.a.b
    public b setContentDescription(CharSequence contentDescription) {
        this.r = contentDescription;
        this.n.b(false);
        return this;
    }

    @Override // a.b.g.b.a.b
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override // a.b.g.b.a.b
    public b setTooltipText(CharSequence tooltipText) {
        this.s = tooltipText;
        this.n.b(false);
        return this;
    }

    @Override // a.b.g.b.a.b
    public CharSequence getTooltipText() {
        return this.s;
    }
}
