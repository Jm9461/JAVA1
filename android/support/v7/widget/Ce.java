package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.InterfaceCt;
import android.support.v4.widget.Cp;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;

/* renamed from: android.support.v7.widget.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ce extends AutoCompleteTextView implements InterfaceCt {

    /* renamed from: e, reason: contains not printable characters */
    private static final int[] f۱۲۰۰۰e = {R.attr.popupBackground};

    /* renamed from: c, reason: contains not printable characters */
    private final Cf f۱۲۰۰۱c;

    /* renamed from: d, reason: contains not printable characters */
    private final Cw f۱۲۰۰۲d;

    public Ce(Context context) {
        this(context, null);
    }

    public Ce(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.autoCompleteTextViewStyle);
    }

    public Ce(Context context, AttributeSet attrs, int defStyleAttr) {
        super(Cg1.m۱۳۱۸۳b(context), attrs, defStyleAttr);
        Cj1 a2 = Cj1.m۱۳۲۷۵a(getContext(), attrs, f۱۲۰۰۰e, defStyleAttr, 0);
        if (a2.m۱۳۲۹۴g(0)) {
            setDropDownBackgroundDrawable(a2.m۱۳۲۸۴b(0));
        }
        a2.m۱۳۲۸۰a();
        this.f۱۲۰۰۱c = new Cf(this);
        this.f۱۲۰۰۱c.m۱۳۱۳۲a(attrs, defStyleAttr);
        this.f۱۲۰۰۲d = new Cw(this);
        this.f۱۲۰۰۲d.m۱۳۵۹۴a(attrs, defStyleAttr);
        this.f۱۲۰۰۲d.m۱۳۵۸۹a();
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int resId) {
        setDropDownBackgroundDrawable(p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۴c(getContext(), resId));
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        Cf cf = this.f۱۲۰۰۱c;
        if (cf != null) {
            cf.m۱۳۱۲۸a(resId);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        Cf cf = this.f۱۲۰۰۱c;
        if (cf != null) {
            cf.m۱۳۱۳۱a(background);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        Cf cf = this.f۱۲۰۰۱c;
        if (cf != null) {
            cf.m۱۳۱۳۴b(tint);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public ColorStateList getSupportBackgroundTintList() {
        Cf cf = this.f۱۲۰۰۱c;
        if (cf != null) {
            return cf.m۱۳۱۳۳b();
        }
        return null;
    }

    @Override // android.support.v4.view.InterfaceCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        Cf cf = this.f۱۲۰۰۱c;
        if (cf != null) {
            cf.m۱۳۱۳۰a(tintMode);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Cf cf = this.f۱۲۰۰۱c;
        if (cf != null) {
            return cf.m۱۳۱۳۵c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Cf cf = this.f۱۲۰۰۱c;
        if (cf != null) {
            cf.m۱۳۱۲۷a();
        }
        Cw cw = this.f۱۲۰۰۲d;
        if (cw != null) {
            cw.m۱۳۵۸۹a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        Cw cw = this.f۱۲۰۰۲d;
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(Cp.m۱۱۲۳۰a(this, actionModeCallback));
    }
}
