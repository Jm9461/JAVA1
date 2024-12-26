package android.support.design.internal;

import a.b.c.b;
import a.b.c.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.j1;
import android.util.AttributeSet;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f۷۵۳a = {b.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f۷۵۴b = {b.colorSecondary};

    public static TypedArray c(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        a(context, set, defStyleAttr, defStyleRes);
        a(context, set, attrs, defStyleAttr, defStyleRes, textAppearanceResIndices);
        return context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes);
    }

    public static j1 d(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        a(context, set, defStyleAttr, defStyleRes);
        a(context, set, attrs, defStyleAttr, defStyleRes, textAppearanceResIndices);
        return j1.a(context, set, attrs, defStyleAttr, defStyleRes);
    }

    private static void a(Context context, AttributeSet set, int defStyleAttr, int defStyleRes) {
        TypedArray a2 = context.obtainStyledAttributes(set, k.ThemeEnforcement, defStyleAttr, defStyleRes);
        boolean enforceMaterialTheme = a2.getBoolean(k.ThemeEnforcement_enforceMaterialTheme, false);
        a2.recycle();
        if (enforceMaterialTheme) {
            b(context);
        }
        a(context);
    }

    private static void a(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        TypedArray themeEnforcementAttrs = context.obtainStyledAttributes(set, k.ThemeEnforcement, defStyleAttr, defStyleRes);
        boolean validTextAppearance = false;
        if (!themeEnforcementAttrs.getBoolean(k.ThemeEnforcement_enforceTextAppearance, false)) {
            themeEnforcementAttrs.recycle();
            return;
        }
        if (textAppearanceResIndices != null && textAppearanceResIndices.length != 0) {
            validTextAppearance = b(context, set, attrs, defStyleAttr, defStyleRes, textAppearanceResIndices);
        } else if (themeEnforcementAttrs.getResourceId(k.ThemeEnforcement_android_textAppearance, -1) != -1) {
            validTextAppearance = true;
        }
        themeEnforcementAttrs.recycle();
        if (!validTextAppearance) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static boolean b(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        TypedArray componentAttrs = context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes);
        for (int customTextAppearanceIndex : textAppearanceResIndices) {
            if (componentAttrs.getResourceId(customTextAppearanceIndex, -1) == -1) {
                componentAttrs.recycle();
                return false;
            }
        }
        componentAttrs.recycle();
        return true;
    }

    public static void a(Context context) {
        a(context, f۷۵۳a, "Theme.AppCompat");
    }

    public static void b(Context context) {
        a(context, f۷۵۴b, "Theme.MaterialComponents");
    }

    private static boolean a(Context context, int[] themeAttributes) {
        TypedArray a2 = context.obtainStyledAttributes(themeAttributes);
        boolean success = a2.hasValue(0);
        a2.recycle();
        return success;
    }

    private static void a(Context context, int[] themeAttributes, String themeName) {
        if (!a(context, themeAttributes)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + themeName + " (or a descendant).");
        }
    }
}
