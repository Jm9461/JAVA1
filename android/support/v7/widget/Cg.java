package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.InterfaceCt;
import android.support.v4.widget.Cp;
import android.support.v4.widget.InterfaceCb;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;

/* renamed from: android.support.v7.widget.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cg extends Button implements InterfaceCt, InterfaceCb {

    /* renamed from: c, reason: contains not printable characters */
    private final Cf f۱۲۰۱۶c;

    /* renamed from: d, reason: contains not printable characters */
    private final Cw f۱۲۰۱۷d;

    public Cg(Context context) {
        this(context, null);
    }

    public Cg(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.buttonStyle);
    }

    public Cg(Context context, AttributeSet attrs, int defStyleAttr) {
        super(Cg1.m۱۳۱۸۳b(context), attrs, defStyleAttr);
        this.f۱۲۰۱۶c = new Cf(this);
        this.f۱۲۰۱۶c.m۱۳۱۳۲a(attrs, defStyleAttr);
        this.f۱۲۰۱۷d = new Cw(this);
        this.f۱۲۰۱۷d.m۱۳۵۹۴a(attrs, defStyleAttr);
        this.f۱۲۰۱۷d.m۱۳۵۸۹a();
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        Cf cf = this.f۱۲۰۱۶c;
        if (cf != null) {
            cf.m۱۳۱۲۸a(resId);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        Cf cf = this.f۱۲۰۱۶c;
        if (cf != null) {
            cf.m۱۳۱۳۱a(background);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        Cf cf = this.f۱۲۰۱۶c;
        if (cf != null) {
            cf.m۱۳۱۳۴b(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        Cf cf = this.f۱۲۰۱۶c;
        if (cf != null) {
            return cf.m۱۳۱۳۳b();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        Cf cf = this.f۱۲۰۱۶c;
        if (cf != null) {
            cf.m۱۳۱۳۰a(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Cf cf = this.f۱۲۰۱۶c;
        if (cf != null) {
            return cf.m۱۳۱۳۵c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Cf cf = this.f۱۲۰۱۶c;
        if (cf != null) {
            cf.m۱۳۱۲۷a();
        }
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            cw.m۱۳۵۸۹a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            cw.m۱۳۵۹۳a(context, resId);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info2) {
        super.onInitializeAccessibilityNodeInfo(info2);
        info2.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            cw.m۱۳۵۹۷a(changed, left, top, right, bottom);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int unit, float size) {
        if (InterfaceCb.f۱۰۷۶۳a) {
            super.setTextSize(unit, size);
            return;
        }
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            cw.m۱۳۵۹۱a(unit, size);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null && !InterfaceCb.f۱۰۷۶۳a && cw.m۱۳۶۰۵h()) {
            this.f۱۲۰۱۷d.m۱۳۵۹۹b();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (InterfaceCb.f۱۰۷۶۳a) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            cw.m۱۳۵۹۰a(autoSizeTextType);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (InterfaceCb.f۱۰۷۶۳a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
            return;
        }
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            cw.m۱۳۵۹۲a(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) {
        if (InterfaceCb.f۱۰۷۶۳a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
            return;
        }
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            cw.m۱۳۵۹۸a(presetSizes, unit);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceCb.f۱۰۷۶۳a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            return cw.m۱۳۶۰۴g();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceCb.f۱۰۷۶۳a) {
            return super.getAutoSizeStepGranularity();
        }
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            return cw.m۱۳۶۰۲e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceCb.f۱۰۷۶۳a) {
            return super.getAutoSizeMinTextSize();
        }
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            return cw.m۱۳۶۰۱d();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceCb.f۱۰۷۶۳a) {
            return super.getAutoSizeMaxTextSize();
        }
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            return cw.m۱۳۶۰۰c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceCb.f۱۰۷۶۳a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            return cw.m۱۳۶۰۳f();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean allCaps) {
        Cw cw = this.f۱۲۰۱۷d;
        if (cw != null) {
            cw.m۱۳۵۹۶a(allCaps);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(Cp.m۱۱۲۳۰a(this, actionModeCallback));
    }
}
