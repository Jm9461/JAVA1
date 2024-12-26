package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.support.p۰۴۳v4.view.AbstractCc;
import android.view.MenuItem;
import android.view.View;

/* renamed from: a.b.g.b.a.b  reason: invalid class name */
public interface AbstractMenuItemCb extends MenuItem {
    /* renamed from: a  reason: contains not printable characters */
    AbstractMenuItemCb m۱۰۴۹۲a(AbstractCc cVar);

    /* renamed from: a  reason: contains not printable characters */
    AbstractCc m۱۰۴۹۳a();

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    AbstractMenuItemCb setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);

    AbstractMenuItemCb setTooltipText(CharSequence charSequence);
}
