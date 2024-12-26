package android.support.v7.widget;

import a.b.g.f.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.text.PrecomputedTextCompat;
import android.support.v4.view.t;
import android.support.v4.widget.b;
import android.support.v4.widget.p;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements t, b {

    /* renamed from: c  reason: collision with root package name */
    private final f f۱۷۷۲c;

    /* renamed from: d  reason: collision with root package name */
    private final w f۱۷۷۳d;

    /* renamed from: e  reason: collision with root package name */
    private Future<a.b.g.f.b> f۱۷۷۴e;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(g1.b(context), attrs, defStyleAttr);
        this.f۱۷۷۲c = new f(this);
        this.f۱۷۷۲c.a(attrs, defStyleAttr);
        this.f۱۷۷۳d = new w(this);
        this.f۱۷۷۳d.a(attrs, defStyleAttr);
        this.f۱۷۷۳d.a();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        f fVar = this.f۱۷۷۲c;
        if (fVar != null) {
            fVar.a(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        f fVar = this.f۱۷۷۲c;
        if (fVar != null) {
            fVar.a(background);
        }
    }

    @Override // android.support.v4.view.t
    public void setSupportBackgroundTintList(ColorStateList tint) {
        f fVar = this.f۱۷۷۲c;
        if (fVar != null) {
            fVar.b(tint);
        }
    }

    @Override // android.support.v4.view.t
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f۱۷۷۲c;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    @Override // android.support.v4.view.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        f fVar = this.f۱۷۷۲c;
        if (fVar != null) {
            fVar.a(tintMode);
        }
    }

    @Override // android.support.v4.view.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f۱۷۷۲c;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        w wVar = this.f۱۷۷۳d;
        if (wVar != null) {
            wVar.a(context, resId);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f۱۷۷۲c;
        if (fVar != null) {
            fVar.a();
        }
        w wVar = this.f۱۷۷۳d;
        if (wVar != null) {
            wVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        w wVar = this.f۱۷۷۳d;
        if (wVar != null) {
            wVar.a(changed, left, top, right, bottom);
        }
    }

    public void setTextSize(int unit, float size) {
        if (b.f۱۴۳۶a) {
            super.setTextSize(unit, size);
            return;
        }
        w wVar = this.f۱۷۷۳d;
        if (wVar != null) {
            wVar.a(unit, size);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        w wVar = this.f۱۷۷۳d;
        if (wVar != null && !b.f۱۴۳۶a && wVar.h()) {
            this.f۱۷۷۳d.b();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (b.f۱۴۳۶a) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        w wVar = this.f۱۷۷۳d;
        if (wVar != null) {
            wVar.a(autoSizeTextType);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (b.f۱۴۳۶a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
            return;
        }
        w wVar = this.f۱۷۷۳d;
        if (wVar != null) {
            wVar.a(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) {
        if (b.f۱۴۳۶a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
            return;
        }
        w wVar = this.f۱۷۷۳d;
        if (wVar != null) {
            wVar.a(presetSizes, unit);
        }
    }

    public int getAutoSizeTextType() {
        if (!b.f۱۴۳۶a) {
            w wVar = this.f۱۷۷۳d;
            if (wVar != null) {
                return wVar.g();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (b.f۱۴۳۶a) {
            return super.getAutoSizeStepGranularity();
        }
        w wVar = this.f۱۷۷۳d;
        if (wVar != null) {
            return wVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f۱۴۳۶a) {
            return super.getAutoSizeMinTextSize();
        }
        w wVar = this.f۱۷۷۳d;
        if (wVar != null) {
            return wVar.d();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f۱۴۳۶a) {
            return super.getAutoSizeMaxTextSize();
        }
        w wVar = this.f۱۷۷۳d;
        if (wVar != null) {
            return wVar.c();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f۱۴۳۶a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w wVar = this.f۱۷۷۳d;
        if (wVar != null) {
            return wVar.f();
        }
        return new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        l.a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }

    public void setFirstBaselineToTopHeight(int firstBaselineToTopHeight) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
        } else {
            p.a(this, firstBaselineToTopHeight);
        }
    }

    public void setLastBaselineToBottomHeight(int lastBaselineToBottomHeight) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(lastBaselineToBottomHeight);
        } else {
            p.b(this, lastBaselineToBottomHeight);
        }
    }

    public int getFirstBaselineToTopHeight() {
        return p.b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return p.c(this);
    }

    public void setLineHeight(int lineHeight) {
        p.c(this, lineHeight);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(p.a(this, actionModeCallback));
    }

    public b.a getTextMetricsParamsCompat() {
        return p.f(this);
    }

    public void setTextMetricsParamsCompat(b.a params) {
        p.a(this, params);
    }

    public void setPrecomputedText(a.b.g.f.b precomputed) {
        p.a(this, precomputed);
    }

    private void d() {
        Future<PrecomputedTextCompat> future = this.f۱۷۷۴e;
        if (future != null) {
            try {
                this.f۱۷۷۴e = null;
                p.a(this, (a.b.g.f.b) future.get());
            } catch (InterruptedException | ExecutionException e2) {
            }
        }
    }

    public CharSequence getText() {
        d();
        return super.getText();
    }

    public void setTextFuture(Future<a.b.g.f.b> future) {
        this.f۱۷۷۴e = future;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        d();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
