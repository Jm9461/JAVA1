package android.support.v7.widget;

import a.b.h.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.q;
import android.util.AttributeSet;
import android.widget.RadioButton;

public class AppCompatRadioButton extends RadioButton implements q {

    /* renamed from: c  reason: collision with root package name */
    private final i f۱۷۷۰c;

    /* renamed from: d  reason: collision with root package name */
    private final w f۱۷۷۱d;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    public AppCompatRadioButton(Context context, AttributeSet attrs) {
        this(context, attrs, a.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(g1.b(context), attrs, defStyleAttr);
        this.f۱۷۷۰c = new i(this);
        this.f۱۷۷۰c.a(attrs, defStyleAttr);
        this.f۱۷۷۱d = new w(this);
        this.f۱۷۷۱d.a(attrs, defStyleAttr);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        i iVar = this.f۱۷۷۰c;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int resId) {
        setButtonDrawable(a.b.h.c.a.a.c(getContext(), resId));
    }

    public int getCompoundPaddingLeft() {
        int value = super.getCompoundPaddingLeft();
        i iVar = this.f۱۷۷۰c;
        return iVar != null ? iVar.a(value) : value;
    }

    @Override // android.support.v4.widget.q
    public void setSupportButtonTintList(ColorStateList tint) {
        i iVar = this.f۱۷۷۰c;
        if (iVar != null) {
            iVar.a(tint);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f۱۷۷۰c;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    @Override // android.support.v4.widget.q
    public void setSupportButtonTintMode(PorterDuff.Mode tintMode) {
        i iVar = this.f۱۷۷۰c;
        if (iVar != null) {
            iVar.a(tintMode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f۱۷۷۰c;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }
}
