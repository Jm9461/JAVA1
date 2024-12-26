package android.support.v4.widget;

import a.b.g.f.b;
import a.b.g.g.m;
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

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static Field f۱۴۶۳a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f۱۴۶۴b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f۱۴۶۵c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f۱۴۶۶d;

    private static Field a(String fieldName) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e2) {
            Log.e("TextViewCompat", "Could not retrieve " + fieldName + " field.");
            return field;
        }
    }

    private static int a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException e2) {
            Log.d("TextViewCompat", "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    public static void a(TextView textView, Drawable start, Drawable top, Drawable end, Drawable bottom) {
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

    public static int d(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f۱۴۶۶d) {
            f۱۴۶۵c = a("mMaxMode");
            f۱۴۶۶d = true;
        }
        Field field = f۱۴۶۵c;
        if (field == null || a(field, textView) != 1) {
            return -1;
        }
        if (!f۱۴۶۴b) {
            f۱۴۶۳a = a("mMaximum");
            f۱۴۶۴b = true;
        }
        Field field2 = f۱۴۶۳a;
        if (field2 != null) {
            return a(field2, textView);
        }
        return -1;
    }

    public static void d(TextView textView, int resId) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(resId);
        } else {
            textView.setTextAppearance(textView.getContext(), resId);
        }
    }

    public static Drawable[] a(TextView textView) {
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

    public static ActionMode.Callback a(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof a)) ? callback : new a(callback, textView);
    }

    private static class a implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final ActionMode.Callback f۱۴۶۷a;

        /* renamed from: b  reason: collision with root package name */
        private final TextView f۱۴۶۸b;

        /* renamed from: c  reason: collision with root package name */
        private Class f۱۴۶۹c;

        /* renamed from: d  reason: collision with root package name */
        private Method f۱۴۷۰d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f۱۴۷۱e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f۱۴۷۲f = false;

        a(ActionMode.Callback callback, TextView textView) {
            this.f۱۴۶۷a = callback;
            this.f۱۴۶۸b = textView;
        }

        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            return this.f۱۴۶۷a.onCreateActionMode(mode, menu);
        }

        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            a(menu);
            return this.f۱۴۶۷a.onPrepareActionMode(mode, menu);
        }

        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return this.f۱۴۶۷a.onActionItemClicked(mode, item);
        }

        public void onDestroyActionMode(ActionMode mode) {
            this.f۱۴۶۷a.onDestroyActionMode(mode);
        }

        private void a(Menu menu) {
            Method removeItemAtMethod;
            Context context = this.f۱۴۶۸b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f۱۴۷۲f) {
                this.f۱۴۷۲f = true;
                try {
                    this.f۱۴۶۹c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f۱۴۷۰d = this.f۱۴۶۹c.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f۱۴۷۱e = true;
                } catch (ClassNotFoundException | NoSuchMethodException e2) {
                    this.f۱۴۶۹c = null;
                    this.f۱۴۷۰d = null;
                    this.f۱۴۷۱e = false;
                }
            }
            try {
                if (!this.f۱۴۷۱e || !this.f۱۴۶۹c.isInstance(menu)) {
                    removeItemAtMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                } else {
                    removeItemAtMethod = this.f۱۴۷۰d;
                }
                for (int i = menu.size() - 1; i >= 0; i--) {
                    MenuItem item = menu.getItem(i);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        removeItemAtMethod.invoke(menu, Integer.valueOf(i));
                    }
                }
                List<ResolveInfo> supportedActivities = a(context, packageManager);
                for (int i2 = 0; i2 < supportedActivities.size(); i2++) {
                    ResolveInfo info2 = supportedActivities.get(i2);
                    menu.add(0, 0, i2 + 100, info2.loadLabel(packageManager)).setIntent(a(info2, this.f۱۴۶۸b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            }
        }

        private List<ResolveInfo> a(Context context, PackageManager packageManager) {
            List<ResolveInfo> supportedActivities = new ArrayList<>();
            if (!(context instanceof Activity)) {
                return supportedActivities;
            }
            for (ResolveInfo info2 : packageManager.queryIntentActivities(a(), 0)) {
                if (a(info2, context)) {
                    supportedActivities.add(info2);
                }
            }
            return supportedActivities;
        }

        private boolean a(ResolveInfo info2, Context context) {
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

        private Intent a(ResolveInfo info2, TextView textView11) {
            return a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !a(textView11)).setClassName(info2.activityInfo.packageName, info2.activityInfo.name);
        }

        private boolean a(TextView textView11) {
            return (textView11 instanceof Editable) && textView11.onCheckIsTextEditor() && textView11.isEnabled();
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    public static void a(TextView textView, int firstBaselineToTopHeight) {
        int fontMetricsTop;
        m.a(firstBaselineToTopHeight);
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

    public static void b(TextView textView, int lastBaselineToBottomHeight) {
        int fontMetricsBottom;
        m.a(lastBaselineToBottomHeight);
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

    public static int b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void c(TextView textView, int lineHeight) {
        m.a(lineHeight);
        int fontHeight = textView.getPaint().getFontMetricsInt(null);
        if (lineHeight != fontHeight) {
            textView.setLineSpacing((float) (lineHeight - fontHeight), 1.0f);
        }
    }

    public static b.a f(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new b.a(textView.getTextMetricsParams());
        }
        b.a.C۰۰۱۴a builder = new b.a.C۰۰۱۴a(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            builder.a(textView.getBreakStrategy());
            builder.b(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            builder.a(e(textView));
        }
        return builder.a();
    }

    public static void a(TextView textView, b.a params) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(a(params.c()));
        }
        if (Build.VERSION.SDK_INT < 23) {
            float paintTextScaleX = params.d().getTextScaleX();
            textView.getPaint().set(params.d());
            if (paintTextScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((paintTextScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(paintTextScaleX);
            return;
        }
        textView.getPaint().set(params.d());
        textView.setBreakStrategy(params.a());
        textView.setHyphenationFrequency(params.b());
    }

    public static void a(TextView textView, b precomputed) {
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setText(precomputed.b());
        } else if (f(textView).equals(precomputed.a())) {
            textView.setText(precomputed);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    private static TextDirectionHeuristic e(TextView textView) {
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

    private static int a(TextDirectionHeuristic heuristic) {
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
