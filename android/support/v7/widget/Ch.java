package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.support.v4.widget.Cp;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca;

/* renamed from: android.support.v7.widget.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ch extends CheckedTextView {

    /* renamed from: d, reason: contains not printable characters */
    private static final int[] f۱۲۰۷۳d = {R.attr.checkMark};

    /* renamed from: c, reason: contains not printable characters */
    private final Cw f۱۲۰۷۴c;

    public Ch(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.checkedTextViewStyle);
    }

    public Ch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(Cg1.m۱۳۱۸۳b(context), attrs, defStyleAttr);
        this.f۱۲۰۷۴c = new Cw(this);
        this.f۱۲۰۷۴c.m۱۳۵۹۴a(attrs, defStyleAttr);
        this.f۱۲۰۷۴c.m۱۳۵۸۹a();
        Cj1 a2 = Cj1.m۱۳۲۷۵a(getContext(), attrs, f۱۲۰۷۳d, defStyleAttr, 0);
        setCheckMarkDrawable(a2.m۱۳۲۸۴b(0));
        a2.m۱۳۲۸۰a();
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int resId) {
        setCheckMarkDrawable(Ca.m۸۶۰۴c(getContext(), resId));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        Cw cw = this.f۱۲۰۷۴c;
        if (cw != null) {
            cw.m۱۳۵۹۳a(context, resId);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Cw cw = this.f۱۲۰۷۴c;
        if (cw != null) {
            cw.m۱۳۵۸۹a();
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
