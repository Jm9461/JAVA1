package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class l extends c<a.b.g.b.a.b> implements MenuItem {

    /* renamed from: e  reason: collision with root package name */
    private Method f۱۷۲۱e;

    l(Context context, a.b.g.b.a.b object) {
        super(context, object);
    }

    public int getItemId() {
        return this.f۱۶۷۰a.getItemId();
    }

    public int getGroupId() {
        return this.f۱۶۷۰a.getGroupId();
    }

    public int getOrder() {
        return this.f۱۶۷۰a.getOrder();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f۱۶۷۰a.setTitle(title);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        this.f۱۶۷۰a.setTitle(title);
        return this;
    }

    public CharSequence getTitle() {
        return this.f۱۶۷۰a.getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f۱۶۷۰a.setTitleCondensed(title);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return this.f۱۶۷۰a.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.f۱۶۷۰a.setIcon(icon);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconRes) {
        this.f۱۶۷۰a.setIcon(iconRes);
        return this;
    }

    public Drawable getIcon() {
        return this.f۱۶۷۰a.getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        this.f۱۶۷۰a.setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return this.f۱۶۷۰a.getIntent();
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f۱۶۷۰a.setShortcut(numericChar, alphaChar);
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f۱۶۷۰a.setShortcut(numericChar, alphaChar, numericModifiers, alphaModifiers);
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        this.f۱۶۷۰a.setNumericShortcut(numericChar);
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        this.f۱۶۷۰a.setNumericShortcut(numericChar, numericModifiers);
        return this;
    }

    public char getNumericShortcut() {
        return this.f۱۶۷۰a.getNumericShortcut();
    }

    public int getNumericModifiers() {
        return this.f۱۶۷۰a.getNumericModifiers();
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        this.f۱۶۷۰a.setAlphabeticShortcut(alphaChar);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        this.f۱۶۷۰a.setAlphabeticShortcut(alphaChar, alphaModifiers);
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.f۱۶۷۰a.getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return this.f۱۶۷۰a.getAlphabeticModifiers();
    }

    public MenuItem setCheckable(boolean checkable) {
        this.f۱۶۷۰a.setCheckable(checkable);
        return this;
    }

    public boolean isCheckable() {
        return this.f۱۶۷۰a.isCheckable();
    }

    public MenuItem setChecked(boolean checked) {
        this.f۱۶۷۰a.setChecked(checked);
        return this;
    }

    public boolean isChecked() {
        return this.f۱۶۷۰a.isChecked();
    }

    public MenuItem setVisible(boolean visible) {
        return this.f۱۶۷۰a.setVisible(visible);
    }

    public boolean isVisible() {
        return this.f۱۶۷۰a.isVisible();
    }

    public MenuItem setEnabled(boolean enabled) {
        this.f۱۶۷۰a.setEnabled(enabled);
        return this;
    }

    public boolean isEnabled() {
        return this.f۱۶۷۰a.isEnabled();
    }

    public boolean hasSubMenu() {
        return this.f۱۶۷۰a.hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return a(this.f۱۶۷۰a.getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        this.f۱۶۷۰a.setOnMenuItemClickListener(menuItemClickListener != null ? new d(menuItemClickListener) : null);
        return this;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f۱۶۷۰a.getMenuInfo();
    }

    public void setShowAsAction(int actionEnum) {
        this.f۱۶۷۰a.setShowAsAction(actionEnum);
    }

    public MenuItem setShowAsActionFlags(int actionEnum) {
        this.f۱۶۷۰a.setShowAsActionFlags(actionEnum);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f۱۶۷۰a.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int resId) {
        this.f۱۶۷۰a.setActionView(resId);
        View actionView = this.f۱۶۷۰a.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f۱۶۷۰a.setActionView(new b(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = this.f۱۶۷۰a.getActionView();
        if (actionView instanceof b) {
            return ((b) actionView).a();
        }
        return actionView;
    }

    public MenuItem setActionProvider(ActionProvider provider) {
        this.f۱۶۷۰a.a(provider != null ? a(provider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        android.support.v4.view.c provider = this.f۱۶۷۰a.a();
        if (provider instanceof a) {
            return ((a) provider).f۱۷۲۲b;
        }
        return null;
    }

    public boolean expandActionView() {
        return this.f۱۶۷۰a.expandActionView();
    }

    public boolean collapseActionView() {
        return this.f۱۶۷۰a.collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return this.f۱۶۷۰a.isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        this.f۱۶۷۰a.setOnActionExpandListener(listener != null ? new c(listener) : null);
        return this;
    }

    public MenuItem setContentDescription(CharSequence contentDescription) {
        this.f۱۶۷۰a.setContentDescription(contentDescription);
        return this;
    }

    public CharSequence getContentDescription() {
        return this.f۱۶۷۰a.getContentDescription();
    }

    public MenuItem setTooltipText(CharSequence tooltipText) {
        this.f۱۶۷۰a.setTooltipText(tooltipText);
        return this;
    }

    public CharSequence getTooltipText() {
        return this.f۱۶۷۰a.getTooltipText();
    }

    public MenuItem setIconTintList(ColorStateList tint) {
        this.f۱۶۷۰a.setIconTintList(tint);
        return this;
    }

    public ColorStateList getIconTintList() {
        return this.f۱۶۷۰a.getIconTintList();
    }

    public MenuItem setIconTintMode(PorterDuff.Mode tintMode) {
        this.f۱۶۷۰a.setIconTintMode(tintMode);
        return this;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f۱۶۷۰a.getIconTintMode();
    }

    public void a(boolean checkable) {
        try {
            if (this.f۱۷۲۱e == null) {
                this.f۱۷۲۱e = this.f۱۶۷۰a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f۱۷۲۱e.invoke(this.f۱۶۷۰a, Boolean.valueOf(checkable));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public a a(ActionProvider provider) {
        return new a(this.f۱۶۶۷b, provider);
    }

    private class d extends d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        d(MenuItem.OnMenuItemClickListener object) {
            super(object);
        }

        public boolean onMenuItemClick(MenuItem item) {
            return this.f۱۶۷۰a.onMenuItemClick(l.this.a(item));
        }
    }

    private class c extends d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        c(MenuItem.OnActionExpandListener object) {
            super(object);
        }

        public boolean onMenuItemActionExpand(MenuItem item) {
            return this.f۱۶۷۰a.onMenuItemActionExpand(l.this.a(item));
        }

        public boolean onMenuItemActionCollapse(MenuItem item) {
            return this.f۱۶۷۰a.onMenuItemActionCollapse(l.this.a(item));
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends android.support.v4.view.c {

        /* renamed from: b  reason: collision with root package name */
        final ActionProvider f۱۷۲۲b;

        public a(Context context, ActionProvider inner) {
            super(context);
            this.f۱۷۲۲b = inner;
        }

        @Override // android.support.v4.view.c
        public View c() {
            return this.f۱۷۲۲b.onCreateActionView();
        }

        @Override // android.support.v4.view.c
        public boolean d() {
            return this.f۱۷۲۲b.onPerformDefaultAction();
        }

        @Override // android.support.v4.view.c
        public boolean a() {
            return this.f۱۷۲۲b.hasSubMenu();
        }

        @Override // android.support.v4.view.c
        public void a(SubMenu subMenu) {
            this.f۱۷۲۲b.onPrepareSubMenu(l.this.a(subMenu));
        }
    }

    static class b extends FrameLayout implements a.b.h.f.c {

        /* renamed from: c  reason: collision with root package name */
        final CollapsibleActionView f۱۷۲۴c;

        b(View actionView) {
            super(actionView.getContext());
            this.f۱۷۲۴c = (CollapsibleActionView) actionView;
            addView(actionView);
        }

        @Override // a.b.h.f.c
        public void b() {
            this.f۱۷۲۴c.onActionViewExpanded();
        }

        @Override // a.b.h.f.c
        public void c() {
            this.f۱۷۲۴c.onActionViewCollapsed();
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f۱۷۲۴c;
        }
    }
}
