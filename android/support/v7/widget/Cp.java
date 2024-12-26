package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.InterfaceCt;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;

/* renamed from: android.support.v7.widget.p, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cp extends MultiAutoCompleteTextView implements InterfaceCt {

    /* renamed from: e, reason: contains not printable characters */
    private static final int[] f۱۲۲۶۲e = {R.attr.popupBackground};

    /* renamed from: c, reason: contains not printable characters */
    private final Cf f۱۲۲۶۳c;

    /* renamed from: d, reason: contains not printable characters */
    private final Cw f۱۲۲۶۴d;

    public Cp(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.autoCompleteTextViewStyle);
    }

    public Cp(Context context, AttributeSet attrs, int defStyleAttr) {
        super(Cg1.m۱۳۱۸۳b(context), attrs, defStyleAttr);
        Cj1 a2 = Cj1.m۱۳۲۷۵a(getContext(), attrs, f۱۲۲۶۲e, defStyleAttr, 0);
        if (a2.m۱۳۲۹۴g(0)) {
            setDropDownBackgroundDrawable(a2.m۱۳۲۸۴b(0));
        }
        a2.m۱۳۲۸۰a();
        this.f۱۲۲۶۳c = new Cf(this);
        this.f۱۲۲۶۳c.m۱۳۱۳۲a(attrs, defStyleAttr);
        this.f۱۲۲۶۴d = new Cw(this);
        this.f۱۲۲۶۴d.m۱۳۵۹۴a(attrs, defStyleAttr);
        this.f۱۲۲۶۴d.m۱۳۵۸۹a();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int resId) {
        setDropDownBackgroundDrawable(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۴c(getContext(), resId));
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        Cf cf = this.f۱۲۲۶۳c;
        if (cf != null) {
            cf.m۱۳۱۲۸a(resId);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        Cf cf = this.f۱۲۲۶۳c;
        if (cf != null) {
            cf.m۱۳۱۳۱a(background);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        Cf cf = this.f۱۲۲۶۳c;
        if (cf != null) {
            cf.m۱۳۱۳۴b(tint);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public ColorStateList getSupportBackgroundTintList() {
        Cf cf = this.f۱۲۲۶۳c;
        if (cf != null) {
            return cf.m۱۳۱۳۳b();
        }
        return null;
    }

    @Override // android.support.v4.view.InterfaceCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        Cf cf = this.f۱۲۲۶۳c;
        if (cf != null) {
            cf.m۱۳۱۳۰a(tintMode);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Cf cf = this.f۱۲۲۶۳c;
        if (cf != null) {
            return cf.m۱۳۱۳۵c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Cf cf = this.f۱۲۲۶۳c;
        if (cf != null) {
            cf.m۱۳۱۲۷a();
        }
        Cw cw = this.f۱۲۲۶۴d;
        if (cw != null) {
            cw.m۱۳۵۸۹a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        Cw cw = this.f۱۲۲۶۴d;
        if (cw != null) {
            cw.m۱۳۵۹۳a(context, resId);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        Cl.m۱۳۳۳۶a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }
}
