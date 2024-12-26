package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.x  reason: invalid class name */
public class Cx {

    /* renamed from: k  reason: contains not printable characters */
    private static final RectF f۱۲۳۸۸k = new RectF();

    /* renamed from: l  reason: contains not printable characters */
    private static ConcurrentHashMap<String, Method> f۱۲۳۸۹l = new ConcurrentHashMap<>();

    /* renamed from: a  reason: contains not printable characters */
    private int f۱۲۳۹۰a = 0;

    /* renamed from: b  reason: contains not printable characters */
    private boolean f۱۲۳۹۱b = false;

    /* renamed from: c  reason: contains not printable characters */
    private float f۱۲۳۹۲c = -1.0f;

    /* renamed from: d  reason: contains not printable characters */
    private float f۱۲۳۹۳d = -1.0f;

    /* renamed from: e  reason: contains not printable characters */
    private float f۱۲۳۹۴e = -1.0f;

    /* renamed from: f  reason: contains not printable characters */
    private int[] f۱۲۳۹۵f = new int[0];

    /* renamed from: g  reason: contains not printable characters */
    private boolean f۱۲۳۹۶g = false;

    /* renamed from: h  reason: contains not printable characters */
    private TextPaint f۱۲۳۹۷h;

    /* renamed from: i  reason: contains not printable characters */
    private final TextView f۱۲۳۹۸i;

    /* renamed from: j  reason: contains not printable characters */
    private final Context f۱۲۳۹۹j;

    Cx(TextView textView) {
        this.f۱۲۳۹۸i = textView;
        this.f۱۲۳۹۹j = this.f۱۲۳۹۸i.getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۹۶a(AttributeSet attrs, int defStyleAttr) {
        int autoSizeStepSizeArrayResId;
        float autoSizeMinTextSizeInPx = -1.0f;
        float autoSizeMaxTextSizeInPx = -1.0f;
        float autoSizeStepGranularityInPx = -1.0f;
        TypedArray a = this.f۱۲۳۹۹j.obtainStyledAttributes(attrs, Cj.AppCompatTextView, defStyleAttr, 0);
        if (a.hasValue(Cj.AppCompatTextView_autoSizeTextType)) {
            this.f۱۲۳۹۰a = a.getInt(Cj.AppCompatTextView_autoSizeTextType, 0);
        }
        if (a.hasValue(Cj.AppCompatTextView_autoSizeStepGranularity)) {
            autoSizeStepGranularityInPx = a.getDimension(Cj.AppCompatTextView_autoSizeStepGranularity, -1.0f);
        }
        if (a.hasValue(Cj.AppCompatTextView_autoSizeMinTextSize)) {
            autoSizeMinTextSizeInPx = a.getDimension(Cj.AppCompatTextView_autoSizeMinTextSize, -1.0f);
        }
        if (a.hasValue(Cj.AppCompatTextView_autoSizeMaxTextSize)) {
            autoSizeMaxTextSizeInPx = a.getDimension(Cj.AppCompatTextView_autoSizeMaxTextSize, -1.0f);
        }
        if (a.hasValue(Cj.AppCompatTextView_autoSizePresetSizes) && (autoSizeStepSizeArrayResId = a.getResourceId(Cj.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray autoSizePreDefTextSizes = a.getResources().obtainTypedArray(autoSizeStepSizeArrayResId);
            m۱۵۶۸۵a(autoSizePreDefTextSizes);
            autoSizePreDefTextSizes.recycle();
        }
        a.recycle();
        if (!m۱۵۶۹۱k()) {
            this.f۱۲۳۹۰a = 0;
        } else if (this.f۱۲۳۹۰a == 1) {
            if (!this.f۱۲۳۹۶g) {
                DisplayMetrics displayMetrics = this.f۱۲۳۹۹j.getResources().getDisplayMetrics();
                if (autoSizeMinTextSizeInPx == -1.0f) {
                    autoSizeMinTextSizeInPx = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (autoSizeMaxTextSizeInPx == -1.0f) {
                    autoSizeMaxTextSizeInPx = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (autoSizeStepGranularityInPx == -1.0f) {
                    autoSizeStepGranularityInPx = 1.0f;
                }
                m۱۵۶۸۴a(autoSizeMinTextSizeInPx, autoSizeMaxTextSizeInPx, autoSizeStepGranularityInPx);
            }
            m۱۵۶۸۹i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۹۳a(int autoSizeTextType) {
        if (!m۱۵۶۹۱k()) {
            return;
        }
        if (autoSizeTextType == 0) {
            m۱۵۶۸۸h();
        } else if (autoSizeTextType == 1) {
            DisplayMetrics displayMetrics = this.f۱۲۳۹۹j.getResources().getDisplayMetrics();
            m۱۵۶۸۴a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m۱۵۶۸۹i()) {
                m۱۵۶۹۲a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + autoSizeTextType);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۹۵a(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (m۱۵۶۹۱k()) {
            DisplayMetrics displayMetrics = this.f۱۲۳۹۹j.getResources().getDisplayMetrics();
            m۱۵۶۸۴a(TypedValue.applyDimension(unit, (float) autoSizeMinTextSize, displayMetrics), TypedValue.applyDimension(unit, (float) autoSizeMaxTextSize, displayMetrics), TypedValue.applyDimension(unit, (float) autoSizeStepGranularity, displayMetrics));
            if (m۱۵۶۸۹i()) {
                m۱۵۶۹۲a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۹۷a(int[] presetSizes, int unit) {
        if (m۱۵۶۹۱k()) {
            int presetSizesLength = presetSizes.length;
            if (presetSizesLength > 0) {
                int[] presetSizesInPx = new int[presetSizesLength];
                if (unit == 0) {
                    presetSizesInPx = Arrays.copyOf(presetSizes, presetSizesLength);
                } else {
                    DisplayMetrics displayMetrics = this.f۱۲۳۹۹j.getResources().getDisplayMetrics();
                    for (int i = 0; i < presetSizesLength; i++) {
                        presetSizesInPx[i] = Math.round(TypedValue.applyDimension(unit, (float) presetSizes[i], displayMetrics));
                    }
                }
                this.f۱۲۳۹۵f = m۱۵۶۸۷a(presetSizesInPx);
                if (!m۱۵۶۹۰j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(presetSizes));
                }
            } else {
                this.f۱۲۳۹۶g = false;
            }
            if (m۱۵۶۸۹i()) {
                m۱۵۶۹۲a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public int m۱۵۷۰۲f() {
        return this.f۱۲۳۹۰a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public int m۱۵۷۰۰d() {
        return Math.round(this.f۱۲۳۹۲c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۵۶۹۹c() {
        return Math.round(this.f۱۲۳۹۳d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۵۶۹۸b() {
        return Math.round(this.f۱۲۳۹۴e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public int[] m۱۵۷۰۱e() {
        return this.f۱۲۳۹۵f;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۶۸۵a(TypedArray textSizes) {
        int textSizesLength = textSizes.length();
        int[] parsedSizes = new int[textSizesLength];
        if (textSizesLength > 0) {
            for (int i = 0; i < textSizesLength; i++) {
                parsedSizes[i] = textSizes.getDimensionPixelSize(i, -1);
            }
            this.f۱۲۳۹۵f = m۱۵۶۸۷a(parsedSizes);
            m۱۵۶۹۰j();
        }
    }

    /* renamed from: j  reason: contains not printable characters */
    private boolean m۱۵۶۹۰j() {
        int sizesLength = this.f۱۲۳۹۵f.length;
        this.f۱۲۳۹۶g = sizesLength > 0;
        if (this.f۱۲۳۹۶g) {
            this.f۱۲۳۹۰a = 1;
            int[] iArr = this.f۱۲۳۹۵f;
            this.f۱۲۳۹۳d = (float) iArr[0];
            this.f۱۲۳۹۴e = (float) iArr[sizesLength - 1];
            this.f۱۲۳۹۲c = -1.0f;
        }
        return this.f۱۲۳۹۶g;
    }

    /* renamed from: a  reason: contains not printable characters */
    private int[] m۱۵۶۸۷a(int[] presetValues) {
        int presetValuesLength = presetValues.length;
        if (presetValuesLength == 0) {
            return presetValues;
        }
        Arrays.sort(presetValues);
        List<Integer> uniqueValidSizes = new ArrayList<>();
        for (int currentPresetValue : presetValues) {
            if (currentPresetValue > 0 && Collections.binarySearch(uniqueValidSizes, Integer.valueOf(currentPresetValue)) < 0) {
                uniqueValidSizes.add(Integer.valueOf(currentPresetValue));
            }
        }
        if (presetValuesLength == uniqueValidSizes.size()) {
            return presetValues;
        }
        int uniqueValidSizesLength = uniqueValidSizes.size();
        int[] cleanedUpSizes = new int[uniqueValidSizesLength];
        for (int i = 0; i < uniqueValidSizesLength; i++) {
            cleanedUpSizes[i] = uniqueValidSizes.get(i).intValue();
        }
        return cleanedUpSizes;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۶۸۴a(float autoSizeMinTextSizeInPx, float autoSizeMaxTextSizeInPx, float autoSizeStepGranularityInPx) {
        if (autoSizeMinTextSizeInPx <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + autoSizeMinTextSizeInPx + "px) is less or equal to (0px)");
        } else if (autoSizeMaxTextSizeInPx <= autoSizeMinTextSizeInPx) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + autoSizeMaxTextSizeInPx + "px) is less or equal to minimum auto-size " + "text size (" + autoSizeMinTextSizeInPx + "px)");
        } else if (autoSizeStepGranularityInPx > 0.0f) {
            this.f۱۲۳۹۰a = 1;
            this.f۱۲۳۹۳d = autoSizeMinTextSizeInPx;
            this.f۱۲۳۹۴e = autoSizeMaxTextSizeInPx;
            this.f۱۲۳۹۲c = autoSizeStepGranularityInPx;
            this.f۱۲۳۹۶g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + autoSizeStepGranularityInPx + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: i  reason: contains not printable characters */
    private boolean m۱۵۶۸۹i() {
        if (!m۱۵۶۹۱k() || this.f۱۲۳۹۰a != 1) {
            this.f۱۲۳۹۱b = false;
        } else {
            if (!this.f۱۲۳۹۶g || this.f۱۲۳۹۵f.length == 0) {
                int autoSizeValuesLength = 1;
                float currentSize = (float) Math.round(this.f۱۲۳۹۳d);
                while (Math.round(this.f۱۲۳۹۲c + currentSize) <= Math.round(this.f۱۲۳۹۴e)) {
                    autoSizeValuesLength++;
                    currentSize += this.f۱۲۳۹۲c;
                }
                int[] autoSizeTextSizesInPx = new int[autoSizeValuesLength];
                float sizeToAdd = this.f۱۲۳۹۳d;
                for (int i = 0; i < autoSizeValuesLength; i++) {
                    autoSizeTextSizesInPx[i] = Math.round(sizeToAdd);
                    sizeToAdd += this.f۱۲۳۹۲c;
                }
                this.f۱۲۳۹۵f = m۱۵۶۸۷a(autoSizeTextSizesInPx);
            }
            this.f۱۲۳۹۱b = true;
        }
        return this.f۱۲۳۹۱b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۹۲a() {
        int availableWidth;
        if (m۱۵۷۰۳g()) {
            if (this.f۱۲۳۹۱b) {
                if (this.f۱۲۳۹۸i.getMeasuredHeight() > 0 && this.f۱۲۳۹۸i.getMeasuredWidth() > 0) {
                    if (((Boolean) m۱۵۶۸۱a((Object) this.f۱۲۳۹۸i, "getHorizontallyScrolling", (Object) false)).booleanValue()) {
                        availableWidth = 1048576;
                    } else {
                        availableWidth = (this.f۱۲۳۹۸i.getMeasuredWidth() - this.f۱۲۳۹۸i.getTotalPaddingLeft()) - this.f۱۲۳۹۸i.getTotalPaddingRight();
                    }
                    int availableHeight = (this.f۱۲۳۹۸i.getHeight() - this.f۱۲۳۹۸i.getCompoundPaddingBottom()) - this.f۱۲۳۹۸i.getCompoundPaddingTop();
                    if (availableWidth > 0 && availableHeight > 0) {
                        synchronized (f۱۲۳۸۸k) {
                            f۱۲۳۸۸k.setEmpty();
                            f۱۲۳۸۸k.right = (float) availableWidth;
                            f۱۲۳۸۸k.bottom = (float) availableHeight;
                            float optimalTextSize = (float) m۱۵۶۷۸a(f۱۲۳۸۸k);
                            if (optimalTextSize != this.f۱۲۳۹۸i.getTextSize()) {
                                m۱۵۶۹۴a(0, optimalTextSize);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f۱۲۳۹۱b = true;
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    private void m۱۵۶۸۸h() {
        this.f۱۲۳۹۰a = 0;
        this.f۱۲۳۹۳d = -1.0f;
        this.f۱۲۳۹۴e = -1.0f;
        this.f۱۲۳۹۲c = -1.0f;
        this.f۱۲۳۹۵f = new int[0];
        this.f۱۲۳۹۱b = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۶۹۴a(int unit, float size) {
        Resources res;
        Context context = this.f۱۲۳۹۹j;
        if (context == null) {
            res = Resources.getSystem();
        } else {
            res = context.getResources();
        }
        m۱۵۶۸۳a(TypedValue.applyDimension(unit, size, res.getDisplayMetrics()));
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۵۶۸۳a(float size) {
        if (size != this.f۱۲۳۹۸i.getPaint().getTextSize()) {
            this.f۱۲۳۹۸i.getPaint().setTextSize(size);
            boolean isInLayout = false;
            if (Build.VERSION.SDK_INT >= 18) {
                isInLayout = this.f۱۲۳۹۸i.isInLayout();
            }
            if (this.f۱۲۳۹۸i.getLayout() != null) {
                this.f۱۲۳۹۱b = false;
                try {
                    Method method = m۱۵۶۸۲a("nullLayouts");
                    if (method != null) {
                        method.invoke(this.f۱۲۳۹۸i, new Object[0]);
                    }
                } catch (Exception ex) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", ex);
                }
                if (!isInLayout) {
                    this.f۱۲۳۹۸i.requestLayout();
                } else {
                    this.f۱۲۳۹۸i.forceLayout();
                }
                this.f۱۲۳۹۸i.invalidate();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۵۶۷۸a(RectF availableSpace) {
        int sizesCount = this.f۱۲۳۹۵f.length;
        if (sizesCount != 0) {
            int bestSizeIndex = 0;
            int lowIndex = 0 + 1;
            int highIndex = sizesCount - 1;
            while (lowIndex <= highIndex) {
                int sizeToTryIndex = (lowIndex + highIndex) / 2;
                if (m۱۵۶۸۶a(this.f۱۲۳۹۵f[sizeToTryIndex], availableSpace)) {
                    bestSizeIndex = lowIndex;
                    lowIndex = sizeToTryIndex + 1;
                } else {
                    highIndex = sizeToTryIndex - 1;
                    bestSizeIndex = highIndex;
                }
            }
            return this.f۱۲۳۹۵f[bestSizeIndex];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۵۶۸۶a(int suggestedSizeInPx, RectF availableSpace) {
        StaticLayout layout;
        CharSequence transformedText;
        CharSequence text = this.f۱۲۳۹۸i.getText();
        TransformationMethod transformationMethod = this.f۱۲۳۹۸i.getTransformationMethod();
        if (!(transformationMethod == null || (transformedText = transformationMethod.getTransformation(text, this.f۱۲۳۹۸i)) == null)) {
            text = transformedText;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f۱۲۳۹۸i.getMaxLines() : -1;
        TextPaint textPaint = this.f۱۲۳۹۷h;
        if (textPaint == null) {
            this.f۱۲۳۹۷h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f۱۲۳۹۷h.set(this.f۱۲۳۹۸i.getPaint());
        this.f۱۲۳۹۷h.setTextSize((float) suggestedSizeInPx);
        Layout.Alignment alignment = (Layout.Alignment) m۱۵۶۸۱a(this.f۱۲۳۹۸i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            layout = m۱۵۶۸۰a(text, alignment, Math.round(availableSpace.right), maxLines);
        } else {
            layout = m۱۵۶۷۹a(text, alignment, Math.round(availableSpace.right));
        }
        return (maxLines == -1 || (layout.getLineCount() <= maxLines && layout.getLineEnd(layout.getLineCount() - 1) == text.length())) && ((float) layout.getHeight()) <= availableSpace.bottom;
    }

    /* renamed from: a  reason: contains not printable characters */
    private StaticLayout m۱۵۶۸۰a(CharSequence text, Layout.Alignment alignment, int availableWidth, int maxLines) {
        return StaticLayout.Builder.obtain(text, 0, text.length(), this.f۱۲۳۹۷h, availableWidth).setAlignment(alignment).setLineSpacing(this.f۱۲۳۹۸i.getLineSpacingExtra(), this.f۱۲۳۹۸i.getLineSpacingMultiplier()).setIncludePad(this.f۱۲۳۹۸i.getIncludeFontPadding()).setBreakStrategy(this.f۱۲۳۹۸i.getBreakStrategy()).setHyphenationFrequency(this.f۱۲۳۹۸i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines).setTextDirection((TextDirectionHeuristic) m۱۵۶۸۱a(this.f۱۲۳۹۸i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR)).build();
    }

    /* renamed from: a  reason: contains not printable characters */
    private StaticLayout m۱۵۶۷۹a(CharSequence text, Layout.Alignment alignment, int availableWidth) {
        boolean includePad;
        float lineSpacingAdd;
        float lineSpacingMultiplier;
        if (Build.VERSION.SDK_INT >= 16) {
            lineSpacingMultiplier = this.f۱۲۳۹۸i.getLineSpacingMultiplier();
            lineSpacingAdd = this.f۱۲۳۹۸i.getLineSpacingExtra();
            includePad = this.f۱۲۳۹۸i.getIncludeFontPadding();
        } else {
            lineSpacingMultiplier = ((Float) m۱۵۶۸۱a(this.f۱۲۳۹۸i, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            lineSpacingAdd = ((Float) m۱۵۶۸۱a(this.f۱۲۳۹۸i, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            includePad = ((Boolean) m۱۵۶۸۱a((Object) this.f۱۲۳۹۸i, "getIncludeFontPadding", (Object) true)).booleanValue();
        }
        return new StaticLayout(text, this.f۱۲۳۹۷h, availableWidth, alignment, lineSpacingMultiplier, lineSpacingAdd, includePad);
    }

    /* renamed from: a  reason: contains not printable characters */
    private <T> T m۱۵۶۸۱a(Object object, String methodName, T defaultValue) {
        try {
            T result = (T) m۱۵۶۸۲a(methodName).invoke(object, new Object[0]);
            if (result != null || 0 == 0) {
                return result;
            }
        } catch (Exception ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + methodName + "() method", ex);
            if (0 != 0 || 1 == 0) {
                return null;
            }
        } catch (Throwable th) {
            if (0 == 0 && 1 != 0) {
            }
            throw th;
        }
        return defaultValue;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Method m۱۵۶۸۲a(String methodName) {
        try {
            Method method = f۱۲۳۸۹l.get(methodName);
            if (method == null && (method = TextView.class.getDeclaredMethod(methodName, new Class[0])) != null) {
                method.setAccessible(true);
                f۱۲۳۸۹l.put(methodName, method);
            }
            return method;
        } catch (Exception ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + methodName + "() method", ex);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۵۷۰۳g() {
        return m۱۵۶۹۱k() && this.f۱۲۳۹۰a != 0;
    }

    /* renamed from: k  reason: contains not printable characters */
    private boolean m۱۵۶۹۱k() {
        return !(this.f۱۲۳۹۸i instanceof Ck);
    }
}
