package android.support.v7.widget;

import a.b.h.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.t;
import android.support.v4.widget.b;
import android.support.v4.widget.p;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public class g extends Button implements t, b {

    /* renamed from: c  reason: collision with root package name */
    private final f f۲۰۳۹c;

    /* renamed from: d  reason: collision with root package name */
    private final w f۲۰۴۰d;

    public g(Context context) {
        this(context, null);
    }

    public g(Context context, AttributeSet attrs) {
        this(context, attrs, a.buttonStyle);
    }

    public g(Context context, AttributeSet attrs, int defStyleAttr) {
        super(g1.b(context), attrs, defStyleAttr);
        this.f۲۰۳۹c = new f(this);
        this.f۲۰۳۹c.a(attrs, defStyleAttr);
        this.f۲۰۴۰d = new w(this);
        this.f۲۰۴۰d.a(attrs, defStyleAttr);
        this.f۲۰۴۰d.a();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        f fVar = this.f۲۰۳۹c;
        if (fVar != null) {
            fVar.a(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        f fVar = this.f۲۰۳۹c;
        if (fVar != null) {
            fVar.a(background);
        }
    }

    @Override // android.support.v4.view.t
    public void setSupportBackgroundTintList(ColorStateList tint) {
        f fVar = this.f۲۰۳۹c;
        if (fVar != null) {
            fVar.b(tint);
        }
    }

    @Override // android.support.v4.view.t
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f۲۰۳۹c;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    @Override // android.support.v4.view.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        f fVar = this.f۲۰۳۹c;
        if (fVar != null) {
            fVar.a(tintMode);
        }
    }

    @Override // android.support.v4.view.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f۲۰۳۹c;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f۲۰۳۹c;
        if (fVar != null) {
            fVar.a();
        }
        w wVar = this.f۲۰۴۰d;
        if (wVar != null) {
            wVar.a();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        w wVar = this.f۲۰۴۰d;
        if (wVar != null) {
            wVar.a(context, resId);
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
        w wVar = this.f۲۰۴۰d;
        if (wVar != null) {
            wVar.a(changed, left, top, right, bottom);
        }
    }

    public void setTextSize(int unit, float size) {
        if (b.f۱۴۳۶a) {
            super.setTextSize(unit, size);
            return;
        }
        w wVar = this.f۲۰۴۰d;
        if (wVar != null) {
            wVar.a(unit, size);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        w wVar = this.f۲۰۴۰d;
        if (wVar != null && !b.f۱۴۳۶a && wVar.h()) {
            this.f۲۰۴۰d.b();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (b.f۱۴۳۶a) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        w wVar = this.f۲۰۴۰d;
        if (wVar != null) {
            wVar.a(autoSizeTextType);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (b.f۱۴۳۶a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
            return;
        }
        w wVar = this.f۲۰۴۰d;
        if (wVar != null) {
            wVar.a(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) {
        if (b.f۱۴۳۶a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
            return;
        }
        w wVar = this.f۲۰۴۰d;
        if (wVar != null) {
            wVar.a(presetSizes, unit);
        }
    }

    public int getAutoSizeTextType() {
        if (!b.f۱۴۳۶a) {
            w wVar = this.f۲۰۴۰d;
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
        w wVar = this.f۲۰۴۰d;
        if (wVar != null) {
            return wVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f۱۴۳۶a) {
            return super.getAutoSizeMinTextSize();
        }
        w wVar = this.f۲۰۴۰d;
        if (wVar != null) {
            return wVar.d();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f۱۴۳۶a) {
            return super.getAutoSizeMaxTextSize();
        }
        w wVar = this.f۲۰۴۰d;
        if (wVar != null) {
            return wVar.c();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f۱۴۳۶a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w wVar = this.f۲۰۴۰d;
        if (wVar != null) {
            return wVar.f();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean allCaps) {
        w wVar = this.f۲۰۴۰d;
        if (wVar != null) {
            wVar.a(allCaps);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(p.a(this, actionModeCallback));
    }
}
