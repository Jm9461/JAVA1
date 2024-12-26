package android.support.v4.view;

import a.b.g.b.a.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;

public final class h {
    public static MenuItem a(MenuItem item, c provider) {
        if (item instanceof b) {
            return ((b) item).a(provider);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return item;
    }

    public static void a(MenuItem item, CharSequence contentDescription) {
        if (item instanceof b) {
            ((b) item).setContentDescription(contentDescription);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setContentDescription(contentDescription);
        }
    }

    public static void b(MenuItem item, CharSequence tooltipText) {
        if (item instanceof b) {
            ((b) item).setTooltipText(tooltipText);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setTooltipText(tooltipText);
        }
    }

    public static void b(MenuItem item, char numericChar, int numericModifiers) {
        if (item instanceof b) {
            ((b) item).setNumericShortcut(numericChar, numericModifiers);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setNumericShortcut(numericChar, numericModifiers);
        }
    }

    public static void a(MenuItem item, char alphaChar, int alphaModifiers) {
        if (item instanceof b) {
            ((b) item).setAlphabeticShortcut(alphaChar, alphaModifiers);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setAlphabeticShortcut(alphaChar, alphaModifiers);
        }
    }

    public static void a(MenuItem item, ColorStateList tint) {
        if (item instanceof b) {
            ((b) item).setIconTintList(tint);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setIconTintList(tint);
        }
    }

    public static void a(MenuItem item, PorterDuff.Mode tintMode) {
        if (item instanceof b) {
            ((b) item).setIconTintMode(tintMode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setIconTintMode(tintMode);
        }
    }
}
