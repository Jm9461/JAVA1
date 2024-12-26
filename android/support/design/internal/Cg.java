package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p۰۴۷v7.widget.Cj1;
import android.util.AttributeSet;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cb;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck;

/* renamed from: android.support.design.internal.g  reason: invalid class name */
public final class Cg {

    /* renamed from: a  reason: contains not printable characters */
    private static final int[] f۹۵۱۶a = {Cb.colorPrimary};

    /* renamed from: b  reason: contains not printable characters */
    private static final int[] f۹۵۱۷b = {Cb.colorSecondary};

    /* renamed from: c  reason: contains not printable characters */
    public static TypedArray m۱۱۳۶۰c(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        m۱۱۳۵۴a(context, set, defStyleAttr, defStyleRes);
        m۱۱۳۵۵a(context, set, attrs, defStyleAttr, defStyleRes, textAppearanceResIndices);
        return context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes);
    }

    /* renamed from: d  reason: contains not printable characters */
    public static Cj1 m۱۱۳۶۱d(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        m۱۱۳۵۴a(context, set, defStyleAttr, defStyleRes);
        m۱۱۳۵۵a(context, set, attrs, defStyleAttr, defStyleRes, textAppearanceResIndices);
        return Cj1.m۱۵۳۴۵a(context, set, attrs, defStyleAttr, defStyleRes);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۱۳۵۴a(Context context, AttributeSet set, int defStyleAttr, int defStyleRes) {
        TypedArray a = context.obtainStyledAttributes(set, Ck.ThemeEnforcement, defStyleAttr, defStyleRes);
        boolean enforceMaterialTheme = a.getBoolean(Ck.ThemeEnforcement_enforceMaterialTheme, false);
        a.recycle();
        if (enforceMaterialTheme) {
            m۱۱۳۵۸b(context);
        }
        m۱۱۳۵۳a(context);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۱۳۵۵a(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        TypedArray themeEnforcementAttrs = context.obtainStyledAttributes(set, Ck.ThemeEnforcement, defStyleAttr, defStyleRes);
        boolean validTextAppearance = false;
        if (!themeEnforcementAttrs.getBoolean(Ck.ThemeEnforcement_enforceTextAppearance, false)) {
            themeEnforcementAttrs.recycle();
            return;
        }
        if (textAppearanceResIndices != null && textAppearanceResIndices.length != 0) {
            validTextAppearance = m۱۱۳۵۹b(context, set, attrs, defStyleAttr, defStyleRes, textAppearanceResIndices);
        } else if (themeEnforcementAttrs.getResourceId(Ck.ThemeEnforcement_android_textAppearance, -1) != -1) {
            validTextAppearance = true;
        }
        themeEnforcementAttrs.recycle();
        if (!validTextAppearance) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static boolean m۱۱۳۵۹b(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
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

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۱۳۵۳a(Context context) {
        m۱۱۳۵۶a(context, f۹۵۱۶a, "Theme.AppCompat");
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۱۳۵۸b(Context context) {
        m۱۱۳۵۶a(context, f۹۵۱۷b, "Theme.MaterialComponents");
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۱۳۵۷a(Context context, int[] themeAttributes) {
        TypedArray a = context.obtainStyledAttributes(themeAttributes);
        boolean success = a.hasValue(0);
        a.recycle();
        return success;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۱۳۵۶a(Context context, int[] themeAttributes, String themeName) {
        if (!m۱۱۳۵۷a(context, themeAttributes)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + themeName + " (or a descendant).");
        }
    }
}
