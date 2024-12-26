package android.support.p۰۴۳v4.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f.Cb;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cm;

/* renamed from: android.support.v4.widget.p  reason: invalid class name */
public final class Cp {

    /* renamed from: a  reason: contains not printable characters */
    private static Field f۱۰۸۰۱a;

    /* renamed from: b  reason: contains not printable characters */
    private static boolean f۱۰۸۰۲b;

    /* renamed from: c  reason: contains not printable characters */
    private static Field f۱۰۸۰۳c;

    /* renamed from: d  reason: contains not printable characters */
    private static boolean f۱۰۸۰۴d;

    /* renamed from: a  reason: contains not printable characters */
    private static Field m۱۳۳۰۱a(String fieldName) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            Log.e("TextViewCompat", "Could not retrieve " + fieldName + " field.");
            return field;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۳۲۹۹a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException e) {
            Log.d("TextViewCompat", "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۳۰۵a(TextView textView, Drawable start, Drawable top, Drawable end, Drawable bottom) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(start, top, end, bottom);
        } else if (i >= 17) {
            boolean rtl = true;
            if (textView.getLayoutDirection() != 1) {
                rtl = false;
            }
            textView.setCompoundDrawables(rtl ? end : start, top, rtl ? start : end, bottom);
        } else {
            textView.setCompoundDrawables(start, top, end, bottom);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    public static int m۱۳۳۱۱d(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f۱۰۸۰۴d) {
            f۱۰۸۰۳c = m۱۳۳۰۱a("mMaxMode");
            f۱۰۸۰۴d = true;
        }
        Field field = f۱۰۸۰۳c;
        if (field == null || m۱۳۲۹۹a(field, textView) != 1) {
            return -1;
        }
        if (!f۱۰۸۰۲b) {
            f۱۰۸۰۱a = m۱۳۳۰۱a("mMaximum");
            f۱۰۸۰۲b = true;
        }
        Field field2 = f۱۰۸۰۱a;
        if (field2 != null) {
            return m۱۳۲۹۹a(field2, textView);
        }
        return -1;
    }

    /* renamed from: d  reason: contains not printable characters */
    public static void m۱۳۳۱۲d(TextView textView, int resId) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(resId);
        } else {
            textView.setTextAppearance(textView.getContext(), resId);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Drawable[] m۱۳۳۰۶a(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean rtl = true;
        if (textView.getLayoutDirection() != 1) {
            rtl = false;
        }
        Drawable[] compounds = textView.getCompoundDrawables();
        if (rtl) {
            Drawable start = compounds[2];
            Drawable end = compounds[0];
            compounds[0] = start;
            compounds[2] = end;
        }
        return compounds;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static ActionMode.Callback m۱۳۳۰۰a(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionMode$CallbackCa)) ? callback : new ActionMode$CallbackCa(callback, textView);
    }

    /* renamed from: android.support.v4.widget.p$a  reason: invalid class name */
    private static class ActionMode$CallbackCa implements ActionMode.Callback {

        /* renamed from: a  reason: contains not printable characters */
        private final ActionMode.Callback f۱۰۸۰۵a;

        /* renamed from: b  reason: contains not printable characters */
        private final TextView f۱۰۸۰۶b;

        /* renamed from: c  reason: contains not printable characters */
        private Class f۱۰۸۰۷c;

        /* renamed from: d  reason: contains not printable characters */
        private Method f۱۰۸۰۸d;

        /* renamed from: e  reason: contains not printable characters */
        private boolean f۱۰۸۰۹e;

        /* renamed from: f  reason: contains not printable characters */
        private boolean f۱۰۸۱۰f = false;

        ActionMode$CallbackCa(ActionMode.Callback callback, TextView textView) {
            this.f۱۰۸۰۵a = callback;
            this.f۱۰۸۰۶b = textView;
        }

        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            return this.f۱۰۸۰۵a.onCreateActionMode(mode, menu);
        }

        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            m۱۳۳۱۸a(menu);
            return this.f۱۰۸۰۵a.onPrepareActionMode(mode, menu);
        }

        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return this.f۱۰۸۰۵a.onActionItemClicked(mode, item);
        }

        public void onDestroyActionMode(ActionMode mode) {
            this.f۱۰۸۰۵a.onDestroyActionMode(mode);
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۳۳۱۸a(Menu menu) {
            Method removeItemAtMethod;
            Context context = this.f۱۰۸۰۶b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f۱۰۸۱۰f) {
                this.f۱۰۸۱۰f = true;
                try {
                    this.f۱۰۸۰۷c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f۱۰۸۰۸d = this.f۱۰۸۰۷c.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f۱۰۸۰۹e = true;
                } catch (ClassNotFoundException | NoSuchMethodException e) {
                    this.f۱۰۸۰۷c = null;
                    this.f۱۰۸۰۸d = null;
                    this.f۱۰۸۰۹e = false;
                }
            }
            try {
                if (!this.f۱۰۸۰۹e || !this.f۱۰۸۰۷c.isInstance(menu)) {
                    removeItemAtMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                } else {
                    removeItemAtMethod = this.f۱۰۸۰۸d;
                }
                for (int i = menu.size() - 1; i >= 0; i--) {
                    MenuItem item = menu.getItem(i);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        removeItemAtMethod.invoke(menu, Integer.valueOf(i));
                    }
                }
                List<ResolveInfo> supportedActivities = m۱۳۳۱۷a(context, packageManager);
                for (int i2 = 0; i2 < supportedActivities.size(); i2++) {
                    ResolveInfo info2 = supportedActivities.get(i2);
                    menu.add(0, 0, i2 + 100, info2.loadLabel(packageManager)).setIntent(m۱۳۳۱۶a(info2, this.f۱۰۸۰۶b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private List<ResolveInfo> m۱۳۳۱۷a(Context context, PackageManager packageManager) {
            List<ResolveInfo> supportedActivities = new ArrayList<>();
            if (!(context instanceof Activity)) {
                return supportedActivities;
            }
            for (ResolveInfo info2 : packageManager.queryIntentActivities(m۱۳۳۱۵a(), 0)) {
                if (m۱۳۳۱۹a(info2, context)) {
                    supportedActivities.add(info2);
                }
            }
            return supportedActivities;
        }

        /* renamed from: a  reason: contains not printable characters */
        private boolean m۱۳۳۱۹a(ResolveInfo info2, Context context) {
            if (context.getPackageName().equals(info2.activityInfo.packageName)) {
                return true;
            }
            if (!info2.activityInfo.exported) {
                return false;
            }
            String str = info2.activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        private Intent m۱۳۳۱۶a(ResolveInfo info2, TextView textView11) {
            return m۱۳۳۱۵a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m۱۳۳۲۰a(textView11)).setClassName(info2.activityInfo.packageName, info2.activityInfo.name);
        }

        /* renamed from: a  reason: contains not printable characters */
        private boolean m۱۳۳۲۰a(TextView textView11) {
            return (textView11 instanceof Editable) && textView11.onCheckIsTextEditor() && textView11.isEnabled();
        }

        /* renamed from: a  reason: contains not printable characters */
        private Intent m۱۳۳۱۵a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۳۰۲a(TextView textView, int firstBaselineToTopHeight) {
        int fontMetricsTop;
        Cm.m۱۰۶۴۱a(firstBaselineToTopHeight);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
            return;
        }
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            fontMetricsTop = fontMetrics.top;
        } else {
            fontMetricsTop = fontMetrics.ascent;
        }
        if (firstBaselineToTopHeight > Math.abs(fontMetricsTop)) {
            textView.setPadding(textView.getPaddingLeft(), firstBaselineToTopHeight - (-fontMetricsTop), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۳۳۰۸b(TextView textView, int lastBaselineToBottomHeight) {
        int fontMetricsBottom;
        Cm.m۱۰۶۴۱a(lastBaselineToBottomHeight);
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            fontMetricsBottom = fontMetrics.bottom;
        } else {
            fontMetricsBottom = fontMetrics.descent;
        }
        if (lastBaselineToBottomHeight > Math.abs(fontMetricsBottom)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), lastBaselineToBottomHeight - fontMetricsBottom);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۳۳۰۷b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c  reason: contains not printable characters */
    public static int m۱۳۳۰۹c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: c  reason: contains not printable characters */
    public static void m۱۳۳۱۰c(TextView textView, int lineHeight) {
        Cm.m۱۰۶۴۱a(lineHeight);
        int fontHeight = textView.getPaint().getFontMetricsInt(null);
        if (lineHeight != fontHeight) {
            textView.setLineSpacing((float) (lineHeight - fontHeight), 1.0f);
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    public static Cb.Ca m۱۳۳۱۴f(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new Cb.Ca(textView.getTextMetricsParams());
        }
        Cb.Ca.Ca builder = new Cb.Ca.Ca(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            builder.m۱۰۵۴۰a(textView.getBreakStrategy());
            builder.m۱۰۵۴۳b(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            builder.m۱۰۵۴۱a(m۱۳۳۱۳e(textView));
        }
        return builder.m۱۰۵۴۲a();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۳۰۳a(TextView textView, Cb.Ca params) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m۱۳۲۹۸a(params.m۱۰۵۳۸c()));
        }
        if (Build.VERSION.SDK_INT < 23) {
            float paintTextScaleX = params.m۱۰۵۳۹d().getTextScaleX();
            textView.getPaint().set(params.m۱۰۵۳۹d());
            if (paintTextScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((paintTextScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(paintTextScaleX);
            return;
        }
        textView.getPaint().set(params.m۱۰۵۳۹d());
        textView.setBreakStrategy(params.m۱۰۵۳۶a());
        textView.setHyphenationFrequency(params.m۱۰۵۳۷b());
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۳۰۴a(TextView textView, Cb precomputed) {
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setText(precomputed.m۱۰۵۳۵b());
        } else if (m۱۳۳۱۴f(textView).equals(precomputed.m۱۰۵۳۴a())) {
            textView.setText(precomputed);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private static TextDirectionHeuristic m۱۳۳۱۳e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean defaultIsRtl = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                defaultIsRtl = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (defaultIsRtl) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte digitDirection = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (digitDirection == 1 || digitDirection == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۳۲۹۸a(TextDirectionHeuristic heuristic) {
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || heuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (heuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (heuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (heuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (heuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }
}
