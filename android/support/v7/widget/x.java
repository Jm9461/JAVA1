package android.support.v7.widget;

import a.b.h.a.j;
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

/* access modifiers changed from: package-private */
public class x {
    private static final RectF k = new RectF();
    private static ConcurrentHashMap<String, Method> l = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f۲۲۸۸a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f۲۲۸۹b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f۲۲۹۰c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f۲۲۹۱d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f۲۲۹۲e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f۲۲۹۳f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f۲۲۹۴g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f۲۲۹۵h;
    private final TextView i;
    private final Context j;

    x(TextView textView) {
        this.i = textView;
        this.j = this.i.getContext();
    }

    /* access modifiers changed from: package-private */
    public void a(AttributeSet attrs, int defStyleAttr) {
        int autoSizeStepSizeArrayResId;
        float autoSizeMinTextSizeInPx = -1.0f;
        float autoSizeMaxTextSizeInPx = -1.0f;
        float autoSizeStepGranularityInPx = -1.0f;
        TypedArray a2 = this.j.obtainStyledAttributes(attrs, j.AppCompatTextView, defStyleAttr, 0);
        if (a2.hasValue(j.AppCompatTextView_autoSizeTextType)) {
            this.f۲۲۸۸a = a2.getInt(j.AppCompatTextView_autoSizeTextType, 0);
        }
        if (a2.hasValue(j.AppCompatTextView_autoSizeStepGranularity)) {
            autoSizeStepGranularityInPx = a2.getDimension(j.AppCompatTextView_autoSizeStepGranularity, -1.0f);
        }
        if (a2.hasValue(j.AppCompatTextView_autoSizeMinTextSize)) {
            autoSizeMinTextSizeInPx = a2.getDimension(j.AppCompatTextView_autoSizeMinTextSize, -1.0f);
        }
        if (a2.hasValue(j.AppCompatTextView_autoSizeMaxTextSize)) {
            autoSizeMaxTextSizeInPx = a2.getDimension(j.AppCompatTextView_autoSizeMaxTextSize, -1.0f);
        }
        if (a2.hasValue(j.AppCompatTextView_autoSizePresetSizes) && (autoSizeStepSizeArrayResId = a2.getResourceId(j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray autoSizePreDefTextSizes = a2.getResources().obtainTypedArray(autoSizeStepSizeArrayResId);
            a(autoSizePreDefTextSizes);
            autoSizePreDefTextSizes.recycle();
        }
        a2.recycle();
        if (!k()) {
            this.f۲۲۸۸a = 0;
        } else if (this.f۲۲۸۸a == 1) {
            if (!this.f۲۲۹۴g) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                if (autoSizeMinTextSizeInPx == -1.0f) {
                    autoSizeMinTextSizeInPx = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (autoSizeMaxTextSizeInPx == -1.0f) {
                    autoSizeMaxTextSizeInPx = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (autoSizeStepGranularityInPx == -1.0f) {
                    autoSizeStepGranularityInPx = 1.0f;
                }
                a(autoSizeMinTextSizeInPx, autoSizeMaxTextSizeInPx, autoSizeStepGranularityInPx);
            }
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int autoSizeTextType) {
        if (!k()) {
            return;
        }
        if (autoSizeTextType == 0) {
            h();
        } else if (autoSizeTextType == 1) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (i()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + autoSizeTextType);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (k()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(unit, (float) autoSizeMinTextSize, displayMetrics), TypedValue.applyDimension(unit, (float) autoSizeMaxTextSize, displayMetrics), TypedValue.applyDimension(unit, (float) autoSizeStepGranularity, displayMetrics));
            if (i()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int[] presetSizes, int unit) {
        if (k()) {
            int presetSizesLength = presetSizes.length;
            if (presetSizesLength > 0) {
                int[] presetSizesInPx = new int[presetSizesLength];
                if (unit == 0) {
                    presetSizesInPx = Arrays.copyOf(presetSizes, presetSizesLength);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < presetSizesLength; i2++) {
                        presetSizesInPx[i2] = Math.round(TypedValue.applyDimension(unit, (float) presetSizes[i2], displayMetrics));
                    }
                }
                this.f۲۲۹۳f = a(presetSizesInPx);
                if (!j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(presetSizes));
                }
            } else {
                this.f۲۲۹۴g = false;
            }
            if (i()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f۲۲۸۸a;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return Math.round(this.f۲۲۹۰c);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return Math.round(this.f۲۲۹۱d);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return Math.round(this.f۲۲۹۲e);
    }

    /* access modifiers changed from: package-private */
    public int[] e() {
        return this.f۲۲۹۳f;
    }

    private void a(TypedArray textSizes) {
        int textSizesLength = textSizes.length();
        int[] parsedSizes = new int[textSizesLength];
        if (textSizesLength > 0) {
            for (int i2 = 0; i2 < textSizesLength; i2++) {
                parsedSizes[i2] = textSizes.getDimensionPixelSize(i2, -1);
            }
            this.f۲۲۹۳f = a(parsedSizes);
            j();
        }
    }

    private boolean j() {
        int sizesLength = this.f۲۲۹۳f.length;
        this.f۲۲۹۴g = sizesLength > 0;
        if (this.f۲۲۹۴g) {
            this.f۲۲۸۸a = 1;
            int[] iArr = this.f۲۲۹۳f;
            this.f۲۲۹۱d = (float) iArr[0];
            this.f۲۲۹۲e = (float) iArr[sizesLength - 1];
            this.f۲۲۹۰c = -1.0f;
        }
        return this.f۲۲۹۴g;
    }

    private int[] a(int[] presetValues) {
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
        for (int i2 = 0; i2 < uniqueValidSizesLength; i2++) {
            cleanedUpSizes[i2] = uniqueValidSizes.get(i2).intValue();
        }
        return cleanedUpSizes;
    }

    private void a(float autoSizeMinTextSizeInPx, float autoSizeMaxTextSizeInPx, float autoSizeStepGranularityInPx) {
        if (autoSizeMinTextSizeInPx <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + autoSizeMinTextSizeInPx + "px) is less or equal to (0px)");
        } else if (autoSizeMaxTextSizeInPx <= autoSizeMinTextSizeInPx) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + autoSizeMaxTextSizeInPx + "px) is less or equal to minimum auto-size " + "text size (" + autoSizeMinTextSizeInPx + "px)");
        } else if (autoSizeStepGranularityInPx > 0.0f) {
            this.f۲۲۸۸a = 1;
            this.f۲۲۹۱d = autoSizeMinTextSizeInPx;
            this.f۲۲۹۲e = autoSizeMaxTextSizeInPx;
            this.f۲۲۹۰c = autoSizeStepGranularityInPx;
            this.f۲۲۹۴g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + autoSizeStepGranularityInPx + "px) is less or equal to (0px)");
        }
    }

    private boolean i() {
        if (!k() || this.f۲۲۸۸a != 1) {
            this.f۲۲۸۹b = false;
        } else {
            if (!this.f۲۲۹۴g || this.f۲۲۹۳f.length == 0) {
                int autoSizeValuesLength = 1;
                float currentSize = (float) Math.round(this.f۲۲۹۱d);
                while (Math.round(this.f۲۲۹۰c + currentSize) <= Math.round(this.f۲۲۹۲e)) {
                    autoSizeValuesLength++;
                    currentSize += this.f۲۲۹۰c;
                }
                int[] autoSizeTextSizesInPx = new int[autoSizeValuesLength];
                float sizeToAdd = this.f۲۲۹۱d;
                for (int i2 = 0; i2 < autoSizeValuesLength; i2++) {
                    autoSizeTextSizesInPx[i2] = Math.round(sizeToAdd);
                    sizeToAdd += this.f۲۲۹۰c;
                }
                this.f۲۲۹۳f = a(autoSizeTextSizesInPx);
            }
            this.f۲۲۸۹b = true;
        }
        return this.f۲۲۸۹b;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int availableWidth;
        if (g()) {
            if (this.f۲۲۸۹b) {
                if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                    if (((Boolean) a((Object) this.i, "getHorizontallyScrolling", (Object) false)).booleanValue()) {
                        availableWidth = 1048576;
                    } else {
                        availableWidth = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                    }
                    int availableHeight = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                    if (availableWidth > 0 && availableHeight > 0) {
                        synchronized (k) {
                            k.setEmpty();
                            k.right = (float) availableWidth;
                            k.bottom = (float) availableHeight;
                            float optimalTextSize = (float) a(k);
                            if (optimalTextSize != this.i.getTextSize()) {
                                a(0, optimalTextSize);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f۲۲۸۹b = true;
        }
    }

    private void h() {
        this.f۲۲۸۸a = 0;
        this.f۲۲۹۱d = -1.0f;
        this.f۲۲۹۲e = -1.0f;
        this.f۲۲۹۰c = -1.0f;
        this.f۲۲۹۳f = new int[0];
        this.f۲۲۸۹b = false;
    }

    /* access modifiers changed from: package-private */
    public void a(int unit, float size) {
        Resources res;
        Context context = this.j;
        if (context == null) {
            res = Resources.getSystem();
        } else {
            res = context.getResources();
        }
        a(TypedValue.applyDimension(unit, size, res.getDisplayMetrics()));
    }

    private void a(float size) {
        if (size != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(size);
            boolean isInLayout = false;
            if (Build.VERSION.SDK_INT >= 18) {
                isInLayout = this.i.isInLayout();
            }
            if (this.i.getLayout() != null) {
                this.f۲۲۸۹b = false;
                try {
                    Method method = a("nullLayouts");
                    if (method != null) {
                        method.invoke(this.i, new Object[0]);
                    }
                } catch (Exception ex) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", ex);
                }
                if (!isInLayout) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }

    private int a(RectF availableSpace) {
        int sizesCount = this.f۲۲۹۳f.length;
        if (sizesCount != 0) {
            int bestSizeIndex = 0;
            int lowIndex = 0 + 1;
            int highIndex = sizesCount - 1;
            while (lowIndex <= highIndex) {
                int sizeToTryIndex = (lowIndex + highIndex) / 2;
                if (a(this.f۲۲۹۳f[sizeToTryIndex], availableSpace)) {
                    bestSizeIndex = lowIndex;
                    lowIndex = sizeToTryIndex + 1;
                } else {
                    highIndex = sizeToTryIndex - 1;
                    bestSizeIndex = highIndex;
                }
            }
            return this.f۲۲۹۳f[bestSizeIndex];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private boolean a(int suggestedSizeInPx, RectF availableSpace) {
        StaticLayout layout;
        CharSequence transformedText;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (!(transformationMethod == null || (transformedText = transformationMethod.getTransformation(text, this.i)) == null)) {
            text = transformedText;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.i.getMaxLines() : -1;
        TextPaint textPaint = this.f۲۲۹۵h;
        if (textPaint == null) {
            this.f۲۲۹۵h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f۲۲۹۵h.set(this.i.getPaint());
        this.f۲۲۹۵h.setTextSize((float) suggestedSizeInPx);
        Layout.Alignment alignment = (Layout.Alignment) a(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            layout = a(text, alignment, Math.round(availableSpace.right), maxLines);
        } else {
            layout = a(text, alignment, Math.round(availableSpace.right));
        }
        return (maxLines == -1 || (layout.getLineCount() <= maxLines && layout.getLineEnd(layout.getLineCount() - 1) == text.length())) && ((float) layout.getHeight()) <= availableSpace.bottom;
    }

    private StaticLayout a(CharSequence text, Layout.Alignment alignment, int availableWidth, int maxLines) {
        return StaticLayout.Builder.obtain(text, 0, text.length(), this.f۲۲۹۵h, availableWidth).setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines).setTextDirection((TextDirectionHeuristic) a(this.i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR)).build();
    }

    private StaticLayout a(CharSequence text, Layout.Alignment alignment, int availableWidth) {
        boolean includePad;
        float lineSpacingAdd;
        float lineSpacingMultiplier;
        if (Build.VERSION.SDK_INT >= 16) {
            lineSpacingMultiplier = this.i.getLineSpacingMultiplier();
            lineSpacingAdd = this.i.getLineSpacingExtra();
            includePad = this.i.getIncludeFontPadding();
        } else {
            lineSpacingMultiplier = ((Float) a(this.i, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            lineSpacingAdd = ((Float) a(this.i, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            includePad = ((Boolean) a((Object) this.i, "getIncludeFontPadding", (Object) true)).booleanValue();
        }
        return new StaticLayout(text, this.f۲۲۹۵h, availableWidth, alignment, lineSpacingMultiplier, lineSpacingAdd, includePad);
    }

    private <T> T a(Object object, String methodName, T defaultValue) {
        try {
            T result = (T) a(methodName).invoke(object, new Object[0]);
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

    private Method a(String methodName) {
        try {
            Method method = l.get(methodName);
            if (method == null && (method = TextView.class.getDeclaredMethod(methodName, new Class[0])) != null) {
                method.setAccessible(true);
                l.put(methodName, method);
            }
            return method;
        } catch (Exception ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + methodName + "() method", ex);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return k() && this.f۲۲۸۸a != 0;
    }

    private boolean k() {
        return !(this.i instanceof k);
    }
}
