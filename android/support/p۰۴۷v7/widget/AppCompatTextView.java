package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۳v4.view.AbstractCt;
import android.support.p۰۴۳v4.widget.AbstractCb;
import android.support.p۰۴۳v4.widget.Cp;
import android.support.v4.text.PrecomputedTextCompat;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۰f.Cb;

/* renamed from: android.support.v7.widget.AppCompatTextView */
public class AppCompatTextView extends TextView implements AbstractCt, AbstractCb {

    /* renamed from: c  reason: contains not printable characters */
    private final Cf f۱۱۴۴۷c;

    /* renamed from: d  reason: contains not printable characters */
    private final Cw f۱۱۴۴۸d;

    /* renamed from: e  reason: contains not printable characters */
    private Future<Cb> f۱۱۴۴۹e;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(Cg1.m۱۵۲۵۳b(context), attrs, defStyleAttr);
        this.f۱۱۴۴۷c = new Cf(this);
        this.f۱۱۴۴۷c.m۱۵۲۰۲a(attrs, defStyleAttr);
        this.f۱۱۴۴۸d = new Cw(this);
        this.f۱۱۴۴۸d.m۱۵۶۶۴a(attrs, defStyleAttr);
        this.f۱۱۴۴۸d.m۱۵۶۵۹a();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        Cf fVar = this.f۱۱۴۴۷c;
        if (fVar != null) {
            fVar.m۱۵۱۹۸a(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        Cf fVar = this.f۱۱۴۴۷c;
        if (fVar != null) {
            fVar.m۱۵۲۰۱a(background);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        Cf fVar = this.f۱۱۴۴۷c;
        if (fVar != null) {
            fVar.m۱۵۲۰۴b(tint);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public ColorStateList getSupportBackgroundTintList() {
        Cf fVar = this.f۱۱۴۴۷c;
        if (fVar != null) {
            return fVar.m۱۵۲۰۳b();
        }
        return null;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        Cf fVar = this.f۱۱۴۴۷c;
        if (fVar != null) {
            fVar.m۱۵۲۰۰a(tintMode);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Cf fVar = this.f۱۱۴۴۷c;
        if (fVar != null) {
            return fVar.m۱۵۲۰۵c();
        }
        return null;
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        Cw wVar = this.f۱۱۴۴۸d;
        if (wVar != null) {
            wVar.m۱۵۶۶۳a(context, resId);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Cf fVar = this.f۱۱۴۴۷c;
        if (fVar != null) {
            fVar.m۱۵۱۹۷a();
        }
        Cw wVar = this.f۱۱۴۴۸d;
        if (wVar != null) {
            wVar.m۱۵۶۵۹a();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Cw wVar = this.f۱۱۴۴۸d;
        if (wVar != null) {
            wVar.m۱۵۶۶۷a(changed, left, top, right, bottom);
        }
    }

    public void setTextSize(int unit, float size) {
        if (AbstractCb.f۱۰۷۶۳a) {
            super.setTextSize(unit, size);
            return;
        }
        Cw wVar = this.f۱۱۴۴۸d;
        if (wVar != null) {
            wVar.m۱۵۶۶۱a(unit, size);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        Cw wVar = this.f۱۱۴۴۸d;
        if (wVar != null && !AbstractCb.f۱۰۷۶۳a && wVar.m۱۵۶۷۵h()) {
            this.f۱۱۴۴۸d.m۱۵۶۶۹b();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (AbstractCb.f۱۰۷۶۳a) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        Cw wVar = this.f۱۱۴۴۸d;
        if (wVar != null) {
            wVar.m۱۵۶۶۰a(autoSizeTextType);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (AbstractCb.f۱۰۷۶۳a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
            return;
        }
        Cw wVar = this.f۱۱۴۴۸d;
        if (wVar != null) {
            wVar.m۱۵۶۶۲a(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) {
        if (AbstractCb.f۱۰۷۶۳a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
            return;
        }
        Cw wVar = this.f۱۱۴۴۸d;
        if (wVar != null) {
            wVar.m۱۵۶۶۸a(presetSizes, unit);
        }
    }

    public int getAutoSizeTextType() {
        if (!AbstractCb.f۱۰۷۶۳a) {
            Cw wVar = this.f۱۱۴۴۸d;
            if (wVar != null) {
                return wVar.m۱۵۶۷۴g();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (AbstractCb.f۱۰۷۶۳a) {
            return super.getAutoSizeStepGranularity();
        }
        Cw wVar = this.f۱۱۴۴۸d;
        if (wVar != null) {
            return wVar.m۱۵۶۷۲e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AbstractCb.f۱۰۷۶۳a) {
            return super.getAutoSizeMinTextSize();
        }
        Cw wVar = this.f۱۱۴۴۸d;
        if (wVar != null) {
            return wVar.m۱۵۶۷۱d();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (AbstractCb.f۱۰۷۶۳a) {
            return super.getAutoSizeMaxTextSize();
        }
        Cw wVar = this.f۱۱۴۴۸d;
        if (wVar != null) {
            return wVar.m۱۵۶۷۰c();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractCb.f۱۰۷۶۳a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Cw wVar = this.f۱۱۴۴۸d;
        if (wVar != null) {
            return wVar.m۱۵۶۷۳f();
        }
        return new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        Cl.m۱۵۴۰۶a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }

    public void setFirstBaselineToTopHeight(int firstBaselineToTopHeight) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
        } else {
            Cp.m۱۳۳۰۲a(this, firstBaselineToTopHeight);
        }
    }

    public void setLastBaselineToBottomHeight(int lastBaselineToBottomHeight) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(lastBaselineToBottomHeight);
        } else {
            Cp.m۱۳۳۰۸b(this, lastBaselineToBottomHeight);
        }
    }

    public int getFirstBaselineToTopHeight() {
        return Cp.m۱۳۳۰۷b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return Cp.m۱۳۳۰۹c(this);
    }

    public void setLineHeight(int lineHeight) {
        Cp.m۱۳۳۱۰c(this, lineHeight);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(Cp.m۱۳۳۰۰a(this, actionModeCallback));
    }

    public Cb.Ca getTextMetricsParamsCompat() {
        return Cp.m۱۳۳۱۴f(this);
    }

    public void setTextMetricsParamsCompat(Cb.Ca params) {
        Cp.m۱۳۳۰۳a(this, params);
    }

    public void setPrecomputedText(Cb precomputed) {
        Cp.m۱۳۳۰۴a(this, precomputed);
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۴۰۷۶d() {
        Future<PrecomputedTextCompat> future = this.f۱۱۴۴۹e;
        if (future != null) {
            try {
                this.f۱۱۴۴۹e = null;
                Cp.m۱۳۳۰۴a(this, (Cb) future.get());
            } catch (InterruptedException | ExecutionException e) {
            }
        }
    }

    public CharSequence getText() {
        m۱۴۰۷۶d();
        return super.getText();
    }

    public void setTextFuture(Future<Cb> future) {
        this.f۱۱۴۴۹e = future;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        m۱۴۰۷۶d();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
