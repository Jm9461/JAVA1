package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.AbstractCt;
import android.support.p۰۴۳v4.widget.Cp;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca;

/* renamed from: android.support.v7.widget.e  reason: invalid class name */
public class Ce extends AutoCompleteTextView implements AbstractCt {

    /* renamed from: e  reason: contains not printable characters */
    private static final int[] f۱۲۰۰۰e = {16843126};

    /* renamed from: c  reason: contains not printable characters */
    private final Cf f۱۲۰۰۱c;

    /* renamed from: d  reason: contains not printable characters */
    private final Cw f۱۲۰۰۲d;

    public Ce(Context context) {
        this(context, null);
    }

    public Ce(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.autoCompleteTextViewStyle);
    }

    public Ce(Context context, AttributeSet attrs, int defStyleAttr) {
        super(Cg1.m۱۵۲۵۳b(context), attrs, defStyleAttr);
        Cj1 a = Cj1.m۱۵۳۴۵a(getContext(), attrs, f۱۲۰۰۰e, defStyleAttr, 0);
        if (a.m۱۵۳۶۴g(0)) {
            setDropDownBackgroundDrawable(a.m۱۵۳۵۴b(0));
        }
        a.m۱۵۳۵۰a();
        this.f۱۲۰۰۱c = new Cf(this);
        this.f۱۲۰۰۱c.m۱۵۲۰۲a(attrs, defStyleAttr);
        this.f۱۲۰۰۲d = new Cw(this);
        this.f۱۲۰۰۲d.m۱۵۶۶۴a(attrs, defStyleAttr);
        this.f۱۲۰۰۲d.m۱۵۶۵۹a();
    }

    public void setDropDownBackgroundResource(int resId) {
        setDropDownBackgroundDrawable(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(getContext(), resId));
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        Cf fVar = this.f۱۲۰۰۱c;
        if (fVar != null) {
            fVar.m۱۵۱۹۸a(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        Cf fVar = this.f۱۲۰۰۱c;
        if (fVar != null) {
            fVar.m۱۵۲۰۱a(background);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        Cf fVar = this.f۱۲۰۰۱c;
        if (fVar != null) {
            fVar.m۱۵۲۰۴b(tint);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public ColorStateList getSupportBackgroundTintList() {
        Cf fVar = this.f۱۲۰۰۱c;
        if (fVar != null) {
            return fVar.m۱۵۲۰۳b();
        }
        return null;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        Cf fVar = this.f۱۲۰۰۱c;
        if (fVar != null) {
            fVar.m۱۵۲۰۰a(tintMode);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Cf fVar = this.f۱۲۰۰۱c;
        if (fVar != null) {
            return fVar.m۱۵۲۰۵c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Cf fVar = this.f۱۲۰۰۱c;
        if (fVar != null) {
            fVar.m۱۵۱۹۷a();
        }
        Cw wVar = this.f۱۲۰۰۲d;
        if (wVar != null) {
            wVar.m۱۵۶۵۹a();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        Cw wVar = this.f۱۲۰۰۲d;
        if (wVar != null) {
            wVar.m۱۵۶۶۳a(context, resId);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        Cl.m۱۵۴۰۶a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(Cp.m۱۳۳۰۰a(this, actionModeCallback));
    }
}
