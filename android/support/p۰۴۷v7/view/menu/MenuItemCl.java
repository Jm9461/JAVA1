package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.AbstractCc;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb;

/* renamed from: android.support.v7.view.menu.l  reason: invalid class name */
public class MenuItemCl extends AbstractCc<AbstractMenuItemCb> implements MenuItem {

    /* renamed from: e  reason: contains not printable characters */
    private Method f۱۱۳۲۵e;

    MenuItemCl(Context context, AbstractMenuItemCb object) {
        super(context, object);
    }

    public int getItemId() {
        return this.f۱۱۲۰۶a.getItemId();
    }

    public int getGroupId() {
        return this.f۱۱۲۰۶a.getGroupId();
    }

    public int getOrder() {
        return this.f۱۱۲۰۶a.getOrder();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f۱۱۲۰۶a.setTitle(title);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        this.f۱۱۲۰۶a.setTitle(title);
        return this;
    }

    public CharSequence getTitle() {
        return this.f۱۱۲۰۶a.getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f۱۱۲۰۶a.setTitleCondensed(title);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return this.f۱۱۲۰۶a.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.f۱۱۲۰۶a.setIcon(icon);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconRes) {
        this.f۱۱۲۰۶a.setIcon(iconRes);
        return this;
    }

    public Drawable getIcon() {
        return this.f۱۱۲۰۶a.getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        this.f۱۱۲۰۶a.setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return this.f۱۱۲۰۶a.getIntent();
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f۱۱۲۰۶a.setShortcut(numericChar, alphaChar);
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f۱۱۲۰۶a.setShortcut(numericChar, alphaChar, numericModifiers, alphaModifiers);
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        this.f۱۱۲۰۶a.setNumericShortcut(numericChar);
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        this.f۱۱۲۰۶a.setNumericShortcut(numericChar, numericModifiers);
        return this;
    }

    public char getNumericShortcut() {
        return this.f۱۱۲۰۶a.getNumericShortcut();
    }

    public int getNumericModifiers() {
        return this.f۱۱۲۰۶a.getNumericModifiers();
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        this.f۱۱۲۰۶a.setAlphabeticShortcut(alphaChar);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        this.f۱۱۲۰۶a.setAlphabeticShortcut(alphaChar, alphaModifiers);
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.f۱۱۲۰۶a.getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return this.f۱۱۲۰۶a.getAlphabeticModifiers();
    }

    public MenuItem setCheckable(boolean checkable) {
        this.f۱۱۲۰۶a.setCheckable(checkable);
        return this;
    }

    public boolean isCheckable() {
        return this.f۱۱۲۰۶a.isCheckable();
    }

    public MenuItem setChecked(boolean checked) {
        this.f۱۱۲۰۶a.setChecked(checked);
        return this;
    }

    public boolean isChecked() {
        return this.f۱۱۲۰۶a.isChecked();
    }

    public MenuItem setVisible(boolean visible) {
        return this.f۱۱۲۰۶a.setVisible(visible);
    }

    public boolean isVisible() {
        return this.f۱۱۲۰۶a.isVisible();
    }

    public MenuItem setEnabled(boolean enabled) {
        this.f۱۱۲۰۶a.setEnabled(enabled);
        return this;
    }

    public boolean isEnabled() {
        return this.f۱۱۲۰۶a.isEnabled();
    }

    public boolean hasSubMenu() {
        return this.f۱۱۲۰۶a.hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return m۱۳۷۷۶a(this.f۱۱۲۰۶a.getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        this.f۱۱۲۰۶a.setOnMenuItemClickListener(menuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerCd(menuItemClickListener) : null);
        return this;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f۱۱۲۰۶a.getMenuInfo();
    }

    public void setShowAsAction(int actionEnum) {
        this.f۱۱۲۰۶a.setShowAsAction(actionEnum);
    }

    public MenuItem setShowAsActionFlags(int actionEnum) {
        this.f۱۱۲۰۶a.setShowAsActionFlags(actionEnum);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new Cb(view);
        }
        this.f۱۱۲۰۶a.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int resId) {
        this.f۱۱۲۰۶a.setActionView(resId);
        View actionView = this.f۱۱۲۰۶a.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f۱۱۲۰۶a.setActionView(new Cb(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = this.f۱۱۲۰۶a.getActionView();
        if (actionView instanceof Cb) {
            return ((Cb) actionView).m۱۳۹۲۶a();
        }
        return actionView;
    }

    public MenuItem setActionProvider(ActionProvider provider) {
        this.f۱۱۲۰۶a.m۱۰۴۹۲a(provider != null ? m۱۳۹۲۰a(provider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        AbstractCc provider = this.f۱۱۲۰۶a.m۱۰۴۹۳a();
        if (provider instanceof Ca) {
            return ((Ca) provider).f۱۱۳۲۶b;
        }
        return null;
    }

    public boolean expandActionView() {
        return this.f۱۱۲۰۶a.expandActionView();
    }

    public boolean collapseActionView() {
        return this.f۱۱۲۰۶a.collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return this.f۱۱۲۰۶a.isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        this.f۱۱۲۰۶a.setOnActionExpandListener(listener != null ? new MenuItem$OnActionExpandListenerCc(listener) : null);
        return this;
    }

    public MenuItem setContentDescription(CharSequence contentDescription) {
        this.f۱۱۲۰۶a.setContentDescription(contentDescription);
        return this;
    }

    public CharSequence getContentDescription() {
        return this.f۱۱۲۰۶a.getContentDescription();
    }

    public MenuItem setTooltipText(CharSequence tooltipText) {
        this.f۱۱۲۰۶a.setTooltipText(tooltipText);
        return this;
    }

    public CharSequence getTooltipText() {
        return this.f۱۱۲۰۶a.getTooltipText();
    }

    public MenuItem setIconTintList(ColorStateList tint) {
        this.f۱۱۲۰۶a.setIconTintList(tint);
        return this;
    }

    public ColorStateList getIconTintList() {
        return this.f۱۱۲۰۶a.getIconTintList();
    }

    public MenuItem setIconTintMode(PorterDuff.Mode tintMode) {
        this.f۱۱۲۰۶a.setIconTintMode(tintMode);
        return this;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f۱۱۲۰۶a.getIconTintMode();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۲۱a(boolean checkable) {
        try {
            if (this.f۱۱۳۲۵e == null) {
                this.f۱۱۳۲۵e = this.f۱۱۲۰۶a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f۱۱۳۲۵e.invoke(this.f۱۱۲۰۶a, Boolean.valueOf(checkable));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۳۹۲۰a(ActionProvider provider) {
        return new Ca(this.f۱۱۲۰۳b, provider);
    }

    /* renamed from: android.support.v7.view.menu.l$d  reason: invalid class name */
    private class MenuItem$OnMenuItemClickListenerCd extends Cd<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        MenuItem$OnMenuItemClickListenerCd(MenuItem.OnMenuItemClickListener object) {
            super(object);
        }

        public boolean onMenuItemClick(MenuItem item) {
            return this.f۱۱۲۰۶a.onMenuItemClick(MenuItemCl.this.m۱۳۷۷۵a(item));
        }
    }

    /* renamed from: android.support.v7.view.menu.l$c  reason: invalid class name */
    private class MenuItem$OnActionExpandListenerCc extends Cd<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        MenuItem$OnActionExpandListenerCc(MenuItem.OnActionExpandListener object) {
            super(object);
        }

        public boolean onMenuItemActionExpand(MenuItem item) {
            return this.f۱۱۲۰۶a.onMenuItemActionExpand(MenuItemCl.this.m۱۳۷۷۵a(item));
        }

        public boolean onMenuItemActionCollapse(MenuItem item) {
            return this.f۱۱۲۰۶a.onMenuItemActionCollapse(MenuItemCl.this.m۱۳۷۷۵a(item));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.view.menu.l$a  reason: invalid class name */
    public class Ca extends AbstractCc {

        /* renamed from: b  reason: contains not printable characters */
        final ActionProvider f۱۱۳۲۶b;

        public Ca(Context context, ActionProvider inner) {
            super(context);
            this.f۱۱۳۲۶b = inner;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public View m۱۳۹۲۴c() {
            return this.f۱۱۳۲۶b.onCreateActionView();
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCc
        /* renamed from: d  reason: contains not printable characters */
        public boolean m۱۳۹۲۵d() {
            return this.f۱۱۳۲۶b.onPerformDefaultAction();
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۹۲۳a() {
            return this.f۱۱۳۲۶b.hasSubMenu();
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۹۲۲a(SubMenu subMenu) {
            this.f۱۱۳۲۶b.onPrepareSubMenu(MenuItemCl.this.m۱۳۷۷۶a(subMenu));
        }
    }

    /* renamed from: android.support.v7.view.menu.l$b  reason: invalid class name */
    static class Cb extends FrameLayout implements p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCc {

        /* renamed from: c  reason: contains not printable characters */
        final CollapsibleActionView f۱۱۳۲۸c;

        Cb(View actionView) {
            super(actionView.getContext());
            this.f۱۱۳۲۸c = (CollapsibleActionView) actionView;
            addView(actionView);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۹۲۷b() {
            this.f۱۱۳۲۸c.onActionViewExpanded();
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۳۹۲۸c() {
            this.f۱۱۳۲۸c.onActionViewCollapsed();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public View m۱۳۹۲۶a() {
            return (View) this.f۱۱۳۲۸c;
        }
    }
}
