package android.support.v4.widget;

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
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۹f.Cb;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cm;

/* renamed from: android.support.v4.widget.p, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cp {

    /* renamed from: a, reason: contains not printable characters */
    private static Field f۱۰۸۰۱a;

    /* renamed from: b, reason: contains not printable characters */
    private static boolean f۱۰۸۰۲b;

    /* renamed from: c, reason: contains not printable characters */
    private static Field f۱۰۸۰۳c;

    /* renamed from: d, reason: contains not printable characters */
    private static boolean f۱۰۸۰۴d;

    /* renamed from: a, reason: contains not printable characters */
    private static Field m۱۱۲۳۱a(String fieldName) {
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

    /* renamed from: a, reason: contains not printable characters */
    private static int m۱۱۲۲۹a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException e2) {
            Log.d("TextViewCompat", "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۲۳۵a(TextView textView, Drawable start, Drawable top, Drawable end, Drawable bottom) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(start, top, end, bottom);
        } else if (i >= 17) {
            boolean rtl = textView.getLayoutDirection() == 1;
            textView.setCompoundDrawables(rtl ? end : start, top, rtl ? start : end, bottom);
        } else {
            textView.setCompoundDrawables(start, top, end, bottom);
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    public static int m۱۱۲۴۱d(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f۱۰۸۰۴d) {
            f۱۰۸۰۳c = m۱۱۲۳۱a("mMaxMode");
            f۱۰۸۰۴d = true;
        }
        Field field = f۱۰۸۰۳c;
        if (field != null && m۱۱۲۲۹a(field, textView) == 1) {
            if (!f۱۰۸۰۲b) {
                f۱۰۸۰۱a = m۱۱۲۳۱a("mMaximum");
                f۱۰۸۰۲b = true;
            }
            Field field2 = f۱۰۸۰۱a;
            if (field2 != null) {
                return m۱۱۲۲۹a(field2, textView);
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: d, reason: contains not printable characters */
    public static void m۱۱۲۴۲d(TextView textView, int resId) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(resId);
        } else {
            textView.setTextAppearance(textView.getContext(), resId);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Drawable[] m۱۱۲۳۶a(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i >= 17) {
            boolean rtl = textView.getLayoutDirection() == 1;
            Drawable[] compounds = textView.getCompoundDrawables();
            if (rtl) {
                Drawable start = compounds[2];
                Drawable end = compounds[0];
                compounds[0] = start;
                compounds[2] = end;
            }
            return compounds;
        }
        return textView.getCompoundDrawables();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static ActionMode.Callback m۱۱۲۳۰a(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof a)) {
            return callback;
        }
        return new a(callback, textView);
    }

    /* renamed from: android.support.v4.widget.p$a */
    private static class a implements ActionMode.Callback {

        /* renamed from: a, reason: contains not printable characters */
        private final ActionMode.Callback f۱۰۸۰۵a;

        /* renamed from: b, reason: contains not printable characters */
        private final TextView f۱۰۸۰۶b;

        /* renamed from: c, reason: contains not printable characters */
        private Class f۱۰۸۰۷c;

        /* renamed from: d, reason: contains not printable characters */
        private Method f۱۰۸۰۸d;

        /* renamed from: e, reason: contains not printable characters */
        private boolean f۱۰۸۰۹e;

        /* renamed from: f, reason: contains not printable characters */
        private boolean f۱۰۸۱۰f = false;

        a(ActionMode.Callback callback, TextView textView) {
            this.f۱۰۸۰۵a = callback;
            this.f۱۰۸۰۶b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            return this.f۱۰۸۰۵a.onCreateActionMode(mode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            m۱۱۲۴۸a(menu);
            return this.f۱۰۸۰۵a.onPrepareActionMode(mode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return this.f۱۰۸۰۵a.onActionItemClicked(mode, item);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            this.f۱۰۸۰۵a.onDestroyActionMode(mode);
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۱۱۲۴۸a(Menu menu) {
            Context context = this.f۱۰۸۰۶b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f۱۰۸۱۰f) {
                this.f۱۰۸۱۰f = true;
                try {
                    this.f۱۰۸۰۷c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f۱۰۸۰۸d = this.f۱۰۸۰۷c.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f۱۰۸۰۹e = true;
                } catch (ClassNotFoundException | NoSuchMethodException e2) {
                    this.f۱۰۸۰۷c = null;
                    this.f۱۰۸۰۸d = null;
                    this.f۱۰۸۰۹e = false;
                }
            }
            try {
                Method removeItemAtMethod = (this.f۱۰۸۰۹e && this.f۱۰۸۰۷c.isInstance(menu)) ? this.f۱۰۸۰۸d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int i = menu.size() - 1; i >= 0; i--) {
                    MenuItem item = menu.getItem(i);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        removeItemAtMethod.invoke(menu, Integer.valueOf(i));
                    }
                }
                List<ResolveInfo> supportedActivities = m۱۱۲۴۷a(context, packageManager);
                for (int i2 = 0; i2 < supportedActivities.size(); i2++) {
                    ResolveInfo info2 = supportedActivities.get(i2);
                    menu.add(0, 0, i2 + 100, info2.loadLabel(packageManager)).setIntent(m۱۱۲۴۶a(info2, this.f۱۰۸۰۶b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        private List<ResolveInfo> m۱۱۲۴۷a(Context context, PackageManager packageManager) {
            List<ResolveInfo> supportedActivities = new ArrayList<>();
            boolean canStartActivityForResult = context instanceof Activity;
            if (!canStartActivityForResult) {
                return supportedActivities;
            }
            List<ResolveInfo> unfiltered = packageManager.queryIntentActivities(m۱۱۲۴۵a(), 0);
            for (ResolveInfo info2 : unfiltered) {
                if (m۱۱۲۴۹a(info2, context)) {
                    supportedActivities.add(info2);
                }
            }
            return supportedActivities;
        }

        /* renamed from: a, reason: contains not printable characters */
        private boolean m۱۱۲۴۹a(ResolveInfo info2, Context context) {
            if (context.getPackageName().equals(info2.activityInfo.packageName)) {
                return true;
            }
            if (!info2.activityInfo.exported) {
                return false;
            }
            String str = info2.activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: a, reason: contains not printable characters */
        private Intent m۱۱۲۴۶a(ResolveInfo info2, TextView textView11) {
            return m۱۱۲۴۵a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m۱۱۲۵۰a(textView11)).setClassName(info2.activityInfo.packageName, info2.activityInfo.name);
        }

        /* renamed from: a, reason: contains not printable characters */
        private boolean m۱۱۲۵۰a(TextView textView11) {
            return (textView11 instanceof Editable) && textView11.onCheckIsTextEditor() && textView11.isEnabled();
        }

        /* renamed from: a, reason: contains not printable characters */
        private Intent m۱۱۲۴۵a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۲۳۲a(TextView textView, int firstBaselineToTopHeight) {
        int fontMetricsTop;
        Cm.m۸۵۷۱a(firstBaselineToTopHeight);
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
            int paddingTop = firstBaselineToTopHeight - (-fontMetricsTop);
            textView.setPadding(textView.getPaddingLeft(), paddingTop, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static void m۱۱۲۳۸b(TextView textView, int lastBaselineToBottomHeight) {
        int fontMetricsBottom;
        Cm.m۸۵۷۱a(lastBaselineToBottomHeight);
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            fontMetricsBottom = fontMetrics.bottom;
        } else {
            fontMetricsBottom = fontMetrics.descent;
        }
        if (lastBaselineToBottomHeight > Math.abs(fontMetricsBottom)) {
            int paddingBottom = lastBaselineToBottomHeight - fontMetricsBottom;
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), paddingBottom);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static int m۱۱۲۳۷b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c, reason: contains not printable characters */
    public static int m۱۱۲۳۹c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: c, reason: contains not printable characters */
    public static void m۱۱۲۴۰c(TextView textView, int lineHeight) {
        Cm.m۸۵۷۱a(lineHeight);
        int fontHeight = textView.getPaint().getFontMetricsInt(null);
        if (lineHeight != fontHeight) {
            textView.setLineSpacing(lineHeight - fontHeight, 1.0f);
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    public static Cb.a m۱۱۲۴۴f(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new Cb.a(textView.getTextMetricsParams());
        }
        Cb.a.C۱۴۲۶a builder = new Cb.a.C۱۴۲۶a(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            builder.m۸۴۶۹a(textView.getBreakStrategy());
            builder.m۸۴۷۲b(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            builder.m۸۴۷۰a(m۱۱۲۴۳e(textView));
        }
        return builder.m۸۴۷۱a();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۲۳۳a(TextView textView, Cb.a params) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m۱۱۲۲۸a(params.m۸۴۶۷c()));
        }
        if (Build.VERSION.SDK_INT < 23) {
            float paintTextScaleX = params.m۸۴۶۸d().getTextScaleX();
            textView.getPaint().set(params.m۸۴۶۸d());
            if (paintTextScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((paintTextScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(paintTextScaleX);
            return;
        }
        textView.getPaint().set(params.m۸۴۶۸d());
        textView.setBreakStrategy(params.m۸۴۶۵a());
        textView.setHyphenationFrequency(params.m۸۴۶۶b());
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۲۳۴a(TextView textView, Cb precomputed) {
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setText(precomputed.m۸۴۶۴b());
            return;
        }
        Cb.a param = m۱۱۲۴۴f(textView);
        if (!param.equals(precomputed.m۸۴۶۳a())) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView.setText(precomputed);
    }

    /* renamed from: e, reason: contains not printable characters */
    private static TextDirectionHeuristic m۱۱۲۴۳e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(textView.getTextLocale());
            String zero = symbols.getDigitStrings()[0];
            int firstCodepoint = zero.codePointAt(0);
            byte digitDirection = Character.getDirectionality(firstCodepoint);
            if (digitDirection == 1 || digitDirection == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
        boolean defaultIsRtl = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!defaultIsRtl) {
                    break;
                } else {
                    break;
                }
        }
        return TextDirectionHeuristics.LTR;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۱۱۲۲۸a(TextDirectionHeuristic heuristic) {
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
        return heuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }
}
