package uk.p۳۱۷co.chrisjenx.calligraphy;

import android.R;
import android.os.Build;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.Ce;
import android.support.v7.widget.Cg;
import android.support.v7.widget.Ch;
import android.support.v7.widget.Ck;
import android.support.v7.widget.Cp;
import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class CalligraphyConfig {
    private static final Map<Class<? extends TextView>, Integer> DEFAULT_STYLES = new HashMap();
    private static CalligraphyConfig sInstance;
    private final Set<Class<?>> hasTypefaceViews;
    private final int mAttrId;
    private final Map<Class<? extends TextView>, Integer> mClassStyleAttributeMap;
    private final boolean mCustomViewCreation;
    private final boolean mCustomViewTypefaceSupport;
    private final String mFontPath;
    private final boolean mIsFontSet;
    private final boolean mReflection;

    static {
        DEFAULT_STYLES.put(TextView.class, Integer.valueOf(R.attr.textViewStyle));
        DEFAULT_STYLES.put(Button.class, Integer.valueOf(R.attr.buttonStyle));
        DEFAULT_STYLES.put(EditText.class, Integer.valueOf(R.attr.editTextStyle));
        Map<Class<? extends TextView>, Integer> map = DEFAULT_STYLES;
        Integer valueOf = Integer.valueOf(R.attr.autoCompleteTextViewStyle);
        map.put(AutoCompleteTextView.class, valueOf);
        DEFAULT_STYLES.put(MultiAutoCompleteTextView.class, valueOf);
        DEFAULT_STYLES.put(CheckBox.class, Integer.valueOf(R.attr.checkboxStyle));
        DEFAULT_STYLES.put(RadioButton.class, Integer.valueOf(R.attr.radioButtonStyle));
        DEFAULT_STYLES.put(ToggleButton.class, Integer.valueOf(R.attr.buttonStyleToggle));
        if (CalligraphyUtils.canAddV7AppCompatViews()) {
            addAppCompatViews();
        }
    }

    private static void addAppCompatViews() {
        DEFAULT_STYLES.put(AppCompatTextView.class, Integer.valueOf(R.attr.textViewStyle));
        DEFAULT_STYLES.put(Cg.class, Integer.valueOf(R.attr.buttonStyle));
        DEFAULT_STYLES.put(Ck.class, Integer.valueOf(R.attr.editTextStyle));
        Map<Class<? extends TextView>, Integer> map = DEFAULT_STYLES;
        Integer valueOf = Integer.valueOf(R.attr.autoCompleteTextViewStyle);
        map.put(Ce.class, valueOf);
        DEFAULT_STYLES.put(Cp.class, valueOf);
        DEFAULT_STYLES.put(AppCompatCheckBox.class, Integer.valueOf(R.attr.checkboxStyle));
        DEFAULT_STYLES.put(AppCompatRadioButton.class, Integer.valueOf(R.attr.radioButtonStyle));
        DEFAULT_STYLES.put(Ch.class, Integer.valueOf(R.attr.checkedTextViewStyle));
    }

    public static void initDefault(CalligraphyConfig calligraphyConfig) {
        sInstance = calligraphyConfig;
    }

    public static CalligraphyConfig get() {
        if (sInstance == null) {
            sInstance = new CalligraphyConfig(new Builder());
        }
        return sInstance;
    }

    protected CalligraphyConfig(Builder builder) {
        this.mIsFontSet = builder.isFontSet;
        this.mFontPath = builder.fontAssetPath;
        this.mAttrId = builder.attrId;
        this.mReflection = builder.reflection;
        this.mCustomViewCreation = builder.customViewCreation;
        this.mCustomViewTypefaceSupport = builder.customViewTypefaceSupport;
        Map<Class<? extends TextView>, Integer> tempMap = new HashMap<>(DEFAULT_STYLES);
        tempMap.putAll(builder.mStyleClassMap);
        this.mClassStyleAttributeMap = Collections.unmodifiableMap(tempMap);
        this.hasTypefaceViews = Collections.unmodifiableSet(builder.mHasTypefaceClasses);
    }

    public String getFontPath() {
        return this.mFontPath;
    }

    boolean isFontSet() {
        return this.mIsFontSet;
    }

    public boolean isReflection() {
        return this.mReflection;
    }

    public boolean isCustomViewCreation() {
        return this.mCustomViewCreation;
    }

    public boolean isCustomViewTypefaceSupport() {
        return this.mCustomViewTypefaceSupport;
    }

    public boolean isCustomViewHasTypeface(View view) {
        return this.hasTypefaceViews.contains(view.getClass());
    }

    Map<Class<? extends TextView>, Integer> getClassStyles() {
        return this.mClassStyleAttributeMap;
    }

    public int getAttrId() {
        return this.mAttrId;
    }

    public static class Builder {
        public static final int INVALID_ATTR_ID = -1;
        private int attrId;
        private boolean customViewCreation;
        private boolean customViewTypefaceSupport;
        private String fontAssetPath;
        private boolean isFontSet;
        private Set<Class<?>> mHasTypefaceClasses;
        private Map<Class<? extends TextView>, Integer> mStyleClassMap;
        private boolean reflection;

        public Builder() {
            this.reflection = Build.VERSION.SDK_INT >= 11;
            this.customViewCreation = true;
            this.customViewTypefaceSupport = false;
            this.attrId = CR.attr.fontPath;
            this.isFontSet = false;
            this.fontAssetPath = null;
            this.mStyleClassMap = new HashMap();
            this.mHasTypefaceClasses = new HashSet();
        }

        public Builder setFontAttrId(int fontAssetAttrId) {
            this.attrId = fontAssetAttrId;
            return this;
        }

        public Builder setDefaultFontPath(String defaultFontAssetPath) {
            this.isFontSet = !TextUtils.isEmpty(defaultFontAssetPath);
            this.fontAssetPath = defaultFontAssetPath;
            return this;
        }

        public Builder disablePrivateFactoryInjection() {
            this.reflection = false;
            return this;
        }

        public Builder disableCustomViewInflation() {
            this.customViewCreation = false;
            return this;
        }

        public Builder addCustomStyle(Class<? extends TextView> styleClass, int styleResourceAttribute) {
            if (styleClass == null || styleResourceAttribute == 0) {
                return this;
            }
            this.mStyleClassMap.put(styleClass, Integer.valueOf(styleResourceAttribute));
            return this;
        }

        public Builder addCustomViewWithSetTypeface(Class<?> clazz) {
            this.customViewTypefaceSupport = true;
            this.mHasTypefaceClasses.add(clazz);
            return this;
        }

        public CalligraphyConfig build() {
            this.isFontSet = !TextUtils.isEmpty(this.fontAssetPath);
            return new CalligraphyConfig(this);
        }
    }
}
