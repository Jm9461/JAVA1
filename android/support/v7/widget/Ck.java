package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.InterfaceCt;
import android.support.v4.widget.Cp;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;

/* renamed from: android.support.v7.widget.k, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ck extends EditText implements InterfaceCt {

    /* renamed from: c, reason: contains not printable characters */
    private final Cf f۱۲۱۵۶c;

    /* renamed from: d, reason: contains not printable characters */
    private final Cw f۱۲۱۵۷d;

    public Ck(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.editTextStyle);
    }

    public Ck(Context context, AttributeSet attrs, int defStyleAttr) {
        super(Cg1.m۱۳۱۸۳b(context), attrs, defStyleAttr);
        this.f۱۲۱۵۶c = new Cf(this);
        this.f۱۲۱۵۶c.m۱۳۱۳۲a(attrs, defStyleAttr);
        this.f۱۲۱۵۷d = new Cw(this);
        this.f۱۲۱۵۷d.m۱۳۵۹۴a(attrs, defStyleAttr);
        this.f۱۲۱۵۷d.m۱۳۵۸۹a();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        Cf cf = this.f۱۲۱۵۶c;
        if (cf != null) {
            cf.m۱۳۱۲۸a(resId);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        Cf cf = this.f۱۲۱۵۶c;
        if (cf != null) {
            cf.m۱۳۱۳۱a(background);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        Cf cf = this.f۱۲۱۵۶c;
        if (cf != null) {
            cf.m۱۳۱۳۴b(tint);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public ColorStateList getSupportBackgroundTintList() {
        Cf cf = this.f۱۲۱۵۶c;
        if (cf != null) {
            return cf.m۱۳۱۳۳b();
        }
        return null;
    }

    @Override // android.support.v4.view.InterfaceCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        Cf cf = this.f۱۲۱۵۶c;
        if (cf != null) {
            cf.m۱۳۱۳۰a(tintMode);
        }
    }

    @Override // android.support.v4.view.InterfaceCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Cf cf = this.f۱۲۱۵۶c;
        if (cf != null) {
            return cf.m۱۳۱۳۵c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Cf cf = this.f۱۲۱۵۶c;
        if (cf != null) {
            cf.m۱۳۱۲۷a();
        }
        Cw cw = this.f۱۲۱۵۷d;
        if (cw != null) {
            cw.m۱۳۵۸۹a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        Cw cw = this.f۱۲۱۵۷d;
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
