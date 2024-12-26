package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.AbstractCc;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.InterfaceCc;

/* renamed from: android.support.v7.view.menu.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class MenuItemCl extends AbstractCc<InterfaceMenuItemCb> implements MenuItem {

    /* renamed from: e, reason: contains not printable characters */
    private Method f۱۱۳۲۵e;

    MenuItemCl(Context context, InterfaceMenuItemCb object) {
        super(context, object);
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getItemId();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getGroupId();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getOrder();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setTitle(title);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setTitle(title);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getTitle();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence title) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setTitleCondensed(title);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setIcon(icon);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconRes) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setIcon(iconRes);
        return this;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getIcon();
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getIntent();
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char numericChar, char alphaChar) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setShortcut(numericChar, alphaChar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setShortcut(numericChar, alphaChar, numericModifiers, alphaModifiers);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char numericChar) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setNumericShortcut(numericChar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setNumericShortcut(numericChar, numericModifiers);
        return this;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char alphaChar) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setAlphabeticShortcut(alphaChar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setAlphabeticShortcut(alphaChar, alphaModifiers);
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean checkable) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setCheckable(checkable);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).isCheckable();
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean checked) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setChecked(checked);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).isChecked();
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean visible) {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setVisible(visible);
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean enabled) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setEnabled(enabled);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).hasSubMenu();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m۱۱۷۰۶a(((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getSubMenu());
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setOnMenuItemClickListener(menuItemClickListener != null ? new d(menuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int actionEnum) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setShowAsAction(actionEnum);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int actionEnum) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setShowAsActionFlags(actionEnum);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int resId) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setActionView(resId);
        View actionView = ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setActionView(new b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getActionView();
        if (actionView instanceof b) {
            return ((b) actionView).m۱۱۸۵۶a();
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider provider) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).mo۱۱۸۲۷a(provider != null ? mo۱۱۸۵۹a(provider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractCc provider = ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).mo۱۱۸۲۸a();
        if (provider instanceof a) {
            return ((a) provider).f۱۱۳۲۶b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).expandActionView();
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setOnActionExpandListener(listener != null ? new c(listener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence contentDescription) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setContentDescription(contentDescription);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getContentDescription();
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence tooltipText) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setTooltipText(tooltipText);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getTooltipText();
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList tint) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setIconTintList(tint);
        return this;
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getIconTintList();
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode tintMode) {
        ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).setIconTintMode(tintMode);
        return this;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getIconTintMode();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۸۵۱a(boolean checkable) {
        try {
            if (this.f۱۱۳۲۵e == null) {
                this.f۱۱۳۲۵e = ((InterfaceMenuItemCb) this.f۱۱۲۰۶a).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f۱۱۳۲۵e.invoke(this.f۱۱۲۰۶a, Boolean.valueOf(checkable));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    a mo۱۱۸۵۹a(ActionProvider provider) {
        return new a(this.f۱۱۲۰۳b, provider);
    }

    /* renamed from: android.support.v7.view.menu.l$d */
    private class d extends Cd<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        d(MenuItem.OnMenuItemClickListener object) {
            super(object);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem item) {
            return ((MenuItem.OnMenuItemClickListener) this.f۱۱۲۰۶a).onMenuItemClick(MenuItemCl.this.m۱۱۷۰۵a(item));
        }
    }

    /* renamed from: android.support.v7.view.menu.l$c */
    private class c extends Cd<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        c(MenuItem.OnActionExpandListener object) {
            super(object);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem item) {
            return ((MenuItem.OnActionExpandListener) this.f۱۱۲۰۶a).onMenuItemActionExpand(MenuItemCl.this.m۱۱۷۰۵a(item));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem item) {
            return ((MenuItem.OnActionExpandListener) this.f۱۱۲۰۶a).onMenuItemActionCollapse(MenuItemCl.this.m۱۱۷۰۵a(item));
        }
    }

    /* renamed from: android.support.v7.view.menu.l$a */
    class a extends AbstractCc {

        /* renamed from: b, reason: contains not printable characters */
        final ActionProvider f۱۱۳۲۶b;

        public a(Context context, ActionProvider inner) {
            super(context);
            this.f۱۱۳۲۶b = inner;
        }

        @Override // android.support.v4.view.AbstractCc
        /* renamed from: c, reason: contains not printable characters */
        public View mo۱۱۸۵۴c() {
            return this.f۱۱۳۲۶b.onCreateActionView();
        }

        @Override // android.support.v4.view.AbstractCc
        /* renamed from: d, reason: contains not printable characters */
        public boolean mo۱۱۸۵۵d() {
            return this.f۱۱۳۲۶b.onPerformDefaultAction();
        }

        @Override // android.support.v4.view.AbstractCc
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۱۸۵۳a() {
            return this.f۱۱۳۲۶b.hasSubMenu();
        }

        @Override // android.support.v4.view.AbstractCc
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۱۸۵۲a(SubMenu subMenu) {
            this.f۱۱۳۲۶b.onPrepareSubMenu(MenuItemCl.this.m۱۱۷۰۶a(subMenu));
        }
    }

    /* renamed from: android.support.v7.view.menu.l$b */
    static class b extends FrameLayout implements InterfaceCc {

        /* renamed from: c, reason: contains not printable characters */
        final CollapsibleActionView f۱۱۳۲۸c;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f۱۱۳۲۸c = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.InterfaceCc
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۲۶۷۳b() {
            this.f۱۱۳۲۸c.onActionViewExpanded();
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.InterfaceCc
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۲۶۷۵c() {
            this.f۱۱۳۲۸c.onActionViewCollapsed();
        }

        /* renamed from: a, reason: contains not printable characters */
        View m۱۱۸۵۶a() {
            return (View) this.f۱۱۳۲۸c;
        }
    }
}
