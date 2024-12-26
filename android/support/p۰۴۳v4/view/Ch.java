package android.support.p۰۴۳v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۵b.p۰۲۶a.AbstractMenuItemCb;

/* renamed from: android.support.v4.view.h  reason: invalid class name */
public final class Ch {
    /* renamed from: a  reason: contains not printable characters */
    public static MenuItem m۱۲۹۱۶a(MenuItem item, AbstractCc provider) {
        if (item instanceof AbstractMenuItemCb) {
            return ((AbstractMenuItemCb) item).m۱۰۴۹۲a(provider);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return item;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۲۰a(MenuItem item, CharSequence contentDescription) {
        if (item instanceof AbstractMenuItemCb) {
            ((AbstractMenuItemCb) item).setContentDescription(contentDescription);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setContentDescription(contentDescription);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۲۹۲۲b(MenuItem item, CharSequence tooltipText) {
        if (item instanceof AbstractMenuItemCb) {
            ((AbstractMenuItemCb) item).setTooltipText(tooltipText);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setTooltipText(tooltipText);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۲۹۲۱b(MenuItem item, char numericChar, int numericModifiers) {
        if (item instanceof AbstractMenuItemCb) {
            ((AbstractMenuItemCb) item).setNumericShortcut(numericChar, numericModifiers);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setNumericShortcut(numericChar, numericModifiers);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۱۷a(MenuItem item, char alphaChar, int alphaModifiers) {
        if (item instanceof AbstractMenuItemCb) {
            ((AbstractMenuItemCb) item).setAlphabeticShortcut(alphaChar, alphaModifiers);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setAlphabeticShortcut(alphaChar, alphaModifiers);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۱۸a(MenuItem item, ColorStateList tint) {
        if (item instanceof AbstractMenuItemCb) {
            ((AbstractMenuItemCb) item).setIconTintList(tint);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setIconTintList(tint);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۲۹۱۹a(MenuItem item, PorterDuff.Mode tintMode) {
        if (item instanceof AbstractMenuItemCb) {
            ((AbstractMenuItemCb) item).setIconTintMode(tintMode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setIconTintMode(tintMode);
        }
    }
}
