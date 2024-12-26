package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.widget.AbstractCq;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca;

/* renamed from: android.support.v7.widget.AppCompatRadioButton */
public class AppCompatRadioButton extends RadioButton implements AbstractCq {

    /* renamed from: c  reason: contains not printable characters */
    private final Ci f۱۱۴۴۵c;

    /* renamed from: d  reason: contains not printable characters */
    private final Cw f۱۱۴۴۶d;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    public AppCompatRadioButton(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(Cg1.m۱۵۲۵۳b(context), attrs, defStyleAttr);
        this.f۱۱۴۴۵c = new Ci(this);
        this.f۱۱۴۴۵c.m۱۵۲۶۳a(attrs, defStyleAttr);
        this.f۱۱۴۴۶d = new Cw(this);
        this.f۱۱۴۴۶d.m۱۵۶۶۴a(attrs, defStyleAttr);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        Ci iVar = this.f۱۱۴۴۵c;
        if (iVar != null) {
            iVar.m۱۵۲۶۶d();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int resId) {
        setButtonDrawable(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(getContext(), resId));
    }

    public int getCompoundPaddingLeft() {
        int value = super.getCompoundPaddingLeft();
        Ci iVar = this.f۱۱۴۴۵c;
        return iVar != null ? iVar.m۱۵۲۵۹a(value) : value;
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCq
    public void setSupportButtonTintList(ColorStateList tint) {
        Ci iVar = this.f۱۱۴۴۵c;
        if (iVar != null) {
            iVar.m۱۵۲۶۱a(tint);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        Ci iVar = this.f۱۱۴۴۵c;
        if (iVar != null) {
            return iVar.m۱۵۲۶۴b();
        }
        return null;
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCq
    public void setSupportButtonTintMode(PorterDuff.Mode tintMode) {
        Ci iVar = this.f۱۱۴۴۵c;
        if (iVar != null) {
            iVar.m۱۵۲۶۲a(tintMode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        Ci iVar = this.f۱۱۴۴۵c;
        if (iVar != null) {
            return iVar.m۱۵۲۶۵c();
        }
        return null;
    }
}
