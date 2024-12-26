package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.AbstractCt;
import android.support.p۰۴۳v4.widget.AbstractCb;
import android.support.p۰۴۳v4.widget.Cp;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca;

/* renamed from: android.support.v7.widget.g  reason: invalid class name */
public class Cg extends Button implements AbstractCt, AbstractCb {

    /* renamed from: c  reason: contains not printable characters */
    private final Cf f۱۲۰۱۶c;

    /* renamed from: d  reason: contains not printable characters */
    private final Cw f۱۲۰۱۷d;

    public Cg(Context context) {
        this(context, null);
    }

    public Cg(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.buttonStyle);
    }

    public Cg(Context context, AttributeSet attrs, int defStyleAttr) {
        super(Cg1.m۱۵۲۵۳b(context), attrs, defStyleAttr);
        this.f۱۲۰۱۶c = new Cf(this);
        this.f۱۲۰۱۶c.m۱۵۲۰۲a(attrs, defStyleAttr);
        this.f۱۲۰۱۷d = new Cw(this);
        this.f۱۲۰۱۷d.m۱۵۶۶۴a(attrs, defStyleAttr);
        this.f۱۲۰۱۷d.m۱۵۶۵۹a();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        Cf fVar = this.f۱۲۰۱۶c;
        if (fVar != null) {
            fVar.m۱۵۱۹۸a(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        Cf fVar = this.f۱۲۰۱۶c;
        if (fVar != null) {
            fVar.m۱۵۲۰۱a(background);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        Cf fVar = this.f۱۲۰۱۶c;
        if (fVar != null) {
            fVar.m۱۵۲۰۴b(tint);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public ColorStateList getSupportBackgroundTintList() {
        Cf fVar = this.f۱۲۰۱۶c;
        if (fVar != null) {
            return fVar.m۱۵۲۰۳b();
        }
        return null;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        Cf fVar = this.f۱۲۰۱۶c;
        if (fVar != null) {
            fVar.m۱۵۲۰۰a(tintMode);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Cf fVar = this.f۱۲۰۱۶c;
        if (fVar != null) {
            return fVar.m۱۵۲۰۵c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Cf fVar = this.f۱۲۰۱۶c;
        if (fVar != null) {
            fVar.m۱۵۱۹۷a();
        }
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null) {
            wVar.m۱۵۶۵۹a();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null) {
            wVar.m۱۵۶۶۳a(context, resId);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info2) {
        super.onInitializeAccessibilityNodeInfo(info2);
        info2.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null) {
            wVar.m۱۵۶۶۷a(changed, left, top, right, bottom);
        }
    }

    public void setTextSize(int unit, float size) {
        if (AbstractCb.f۱۰۷۶۳a) {
            super.setTextSize(unit, size);
            return;
        }
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null) {
            wVar.m۱۵۶۶۱a(unit, size);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null && !AbstractCb.f۱۰۷۶۳a && wVar.m۱۵۶۷۵h()) {
            this.f۱۲۰۱۷d.m۱۵۶۶۹b();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (AbstractCb.f۱۰۷۶۳a) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null) {
            wVar.m۱۵۶۶۰a(autoSizeTextType);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (AbstractCb.f۱۰۷۶۳a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
            return;
        }
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null) {
            wVar.m۱۵۶۶۲a(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) {
        if (AbstractCb.f۱۰۷۶۳a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
            return;
        }
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null) {
            wVar.m۱۵۶۶۸a(presetSizes, unit);
        }
    }

    public int getAutoSizeTextType() {
        if (!AbstractCb.f۱۰۷۶۳a) {
            Cw wVar = this.f۱۲۰۱۷d;
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
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null) {
            return wVar.m۱۵۶۷۲e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AbstractCb.f۱۰۷۶۳a) {
            return super.getAutoSizeMinTextSize();
        }
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null) {
            return wVar.m۱۵۶۷۱d();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (AbstractCb.f۱۰۷۶۳a) {
            return super.getAutoSizeMaxTextSize();
        }
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null) {
            return wVar.m۱۵۶۷۰c();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractCb.f۱۰۷۶۳a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null) {
            return wVar.m۱۵۶۷۳f();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean allCaps) {
        Cw wVar = this.f۱۲۰۱۷d;
        if (wVar != null) {
            wVar.m۱۵۶۶۶a(allCaps);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(Cp.m۱۳۳۰۰a(this, actionModeCallback));
    }
}
