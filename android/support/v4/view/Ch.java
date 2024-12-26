package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۴b.p۱۸۵a.InterfaceMenuItemCb;

/* renamed from: android.support.v4.view.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ch {
    /* renamed from: a, reason: contains not printable characters */
    public static MenuItem m۱۰۸۴۶a(MenuItem item, AbstractCc provider) {
        if (item instanceof InterfaceMenuItemCb) {
            return ((InterfaceMenuItemCb) item).mo۱۱۸۲۷a(provider);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return item;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۸۵۰a(MenuItem item, CharSequence contentDescription) {
        if (item instanceof InterfaceMenuItemCb) {
            ((InterfaceMenuItemCb) item).setContentDescription(contentDescription);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setContentDescription(contentDescription);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static void m۱۰۸۵۲b(MenuItem item, CharSequence tooltipText) {
        if (item instanceof InterfaceMenuItemCb) {
            ((InterfaceMenuItemCb) item).setTooltipText(tooltipText);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setTooltipText(tooltipText);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static void m۱۰۸۵۱b(MenuItem item, char numericChar, int numericModifiers) {
        if (item instanceof InterfaceMenuItemCb) {
            ((InterfaceMenuItemCb) item).setNumericShortcut(numericChar, numericModifiers);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setNumericShortcut(numericChar, numericModifiers);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۸۴۷a(MenuItem item, char alphaChar, int alphaModifiers) {
        if (item instanceof InterfaceMenuItemCb) {
            ((InterfaceMenuItemCb) item).setAlphabeticShortcut(alphaChar, alphaModifiers);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setAlphabeticShortcut(alphaChar, alphaModifiers);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۸۴۸a(MenuItem item, ColorStateList tint) {
        if (item instanceof InterfaceMenuItemCb) {
            ((InterfaceMenuItemCb) item).setIconTintList(tint);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setIconTintList(tint);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۰۸۴۹a(MenuItem item, PorterDuff.Mode tintMode) {
        if (item instanceof InterfaceMenuItemCb) {
            ((InterfaceMenuItemCb) item).setIconTintMode(tintMode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setIconTintMode(tintMode);
        }
    }
}
