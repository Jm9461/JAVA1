package uk.p۳۱۷co.chrisjenx.calligraphy;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;

/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class CalligraphyFactory {
    private static final String ACTION_BAR_SUBTITLE = "action_bar_subtitle";
    private static final String ACTION_BAR_TITLE = "action_bar_title";
    private final int[] mAttributeId;

    protected static int[] getStyleForTextView(TextView view) {
        int[] styleIds = {-1, -1};
        if (isActionBarTitle(view)) {
            styleIds[0] = 16843470;
            styleIds[1] = 16843512;
        } else if (isActionBarSubTitle(view)) {
            styleIds[0] = 16843470;
            styleIds[1] = 16843513;
        }
        if (styleIds[0] == -1) {
            styleIds[0] = CalligraphyConfig.get().getClassStyles().containsKey(view.getClass()) ? CalligraphyConfig.get().getClassStyles().get(view.getClass()).intValue() : R.attr.textAppearance;
        }
        return styleIds;
    }

    @SuppressLint({"NewApi"})
    protected static boolean isActionBarTitle(TextView view) {
        if (matchesResourceIdName(view, ACTION_BAR_TITLE)) {
            return true;
        }
        if (parentIsToolbarV7(view)) {
            Toolbar parent = (Toolbar) view.getParent();
            return TextUtils.equals(parent.getTitle(), view.getText());
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    protected static boolean isActionBarSubTitle(TextView view) {
        if (matchesResourceIdName(view, ACTION_BAR_SUBTITLE)) {
            return true;
        }
        if (parentIsToolbarV7(view)) {
            Toolbar parent = (Toolbar) view.getParent();
            return TextUtils.equals(parent.getSubtitle(), view.getText());
        }
        return false;
    }

    protected static boolean parentIsToolbarV7(View view) {
        return CalligraphyUtils.canCheckForV7Toolbar() && view.getParent() != null && (view.getParent() instanceof Toolbar);
    }

    protected static boolean matchesResourceIdName(View view, String matches) {
        if (view.getId() == -1) {
            return false;
        }
        String resourceEntryName = view.getResources().getResourceEntryName(view.getId());
        return resourceEntryName.equalsIgnoreCase(matches);
    }

    public CalligraphyFactory(int attributeId) {
        this.mAttributeId = new int[]{attributeId};
    }

    public View onViewCreated(View view, Context context, AttributeSet attrs) {
        if (view != null && view.getTag(CR.id.calligraphy_tag_id) != Boolean.TRUE) {
            onViewCreatedInternal(view, context, attrs);
            view.setTag(CR.id.calligraphy_tag_id, Boolean.TRUE);
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void onViewCreatedInternal(View view, Context context, AttributeSet attrs) {
        if (view instanceof TextView) {
            if (TypefaceUtils.isLoaded(((TextView) view).getTypeface())) {
                return;
            }
            String textViewFont = resolveFontPath(context, attrs);
            if (TextUtils.isEmpty(textViewFont)) {
                int[] styleForTextView = getStyleForTextView((TextView) view);
                if (styleForTextView[1] != -1) {
                    textViewFont = CalligraphyUtils.pullFontPathFromTheme(context, styleForTextView[0], styleForTextView[1], this.mAttributeId);
                } else {
                    textViewFont = CalligraphyUtils.pullFontPathFromTheme(context, styleForTextView[0], this.mAttributeId);
                }
            }
            boolean deferred = matchesResourceIdName(view, ACTION_BAR_TITLE) || matchesResourceIdName(view, ACTION_BAR_SUBTITLE);
            CalligraphyUtils.applyFontToTextView(context, (TextView) view, CalligraphyConfig.get(), textViewFont, deferred);
        }
        if (CalligraphyUtils.canCheckForV7Toolbar() && (view instanceof Toolbar)) {
            applyFontToToolbar((Toolbar) view);
        }
        if (view instanceof HasTypeface) {
            Typeface typeface = getDefaultTypeface(context, resolveFontPath(context, attrs));
            if (typeface != null) {
                ((HasTypeface) view).setTypeface(typeface);
                return;
            }
            return;
        }
        if (CalligraphyConfig.get().isCustomViewTypefaceSupport() && CalligraphyConfig.get().isCustomViewHasTypeface(view)) {
            Method setTypeface = ReflectionUtils.getMethod(view.getClass(), "setTypeface");
            String fontPath = resolveFontPath(context, attrs);
            Typeface typeface2 = getDefaultTypeface(context, fontPath);
            if (setTypeface != null && typeface2 != null) {
                ReflectionUtils.invokeMethod(view, setTypeface, typeface2);
            }
        }
    }

    private Typeface getDefaultTypeface(Context context, String fontPath) {
        if (TextUtils.isEmpty(fontPath)) {
            fontPath = CalligraphyConfig.get().getFontPath();
        }
        if (!TextUtils.isEmpty(fontPath)) {
            return TypefaceUtils.load(context.getAssets(), fontPath);
        }
        return null;
    }

    private String resolveFontPath(Context context, AttributeSet attrs) {
        String textViewFont = CalligraphyUtils.pullFontPathFromView(context, attrs, this.mAttributeId);
        if (TextUtils.isEmpty(textViewFont)) {
            textViewFont = CalligraphyUtils.pullFontPathFromStyle(context, attrs, this.mAttributeId);
        }
        if (TextUtils.isEmpty(textViewFont)) {
            return CalligraphyUtils.pullFontPathFromTextAppearance(context, attrs, this.mAttributeId);
        }
        return textViewFont;
    }

    private void applyFontToToolbar(Toolbar view) {
        CharSequence previousTitle = view.getTitle();
        CharSequence previousSubtitle = view.getSubtitle();
        view.setTitle(" ");
        view.setSubtitle(" ");
        int childCount = view.getChildCount();
        for (int i = 0; i < childCount; i++) {
            onViewCreated(view.getChildAt(i), view.getContext(), null);
        }
        view.setTitle(previousTitle);
        view.setSubtitle(previousSubtitle);
    }
}
