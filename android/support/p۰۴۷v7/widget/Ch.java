package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.support.p۰۴۳v4.widget.Cp;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca;

/* renamed from: android.support.v7.widget.h  reason: invalid class name */
public class Ch extends CheckedTextView {

    /* renamed from: d  reason: contains not printable characters */
    private static final int[] f۱۲۰۷۳d = {16843016};

    /* renamed from: c  reason: contains not printable characters */
    private final Cw f۱۲۰۷۴c;

    public Ch(Context context, AttributeSet attrs) {
        this(context, attrs, 16843720);
    }

    public Ch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(Cg1.m۱۵۲۵۳b(context), attrs, defStyleAttr);
        this.f۱۲۰۷۴c = new Cw(this);
        this.f۱۲۰۷۴c.m۱۵۶۶۴a(attrs, defStyleAttr);
        this.f۱۲۰۷۴c.m۱۵۶۵۹a();
        Cj1 a = Cj1.m۱۵۳۴۵a(getContext(), attrs, f۱۲۰۷۳d, defStyleAttr, 0);
        setCheckMarkDrawable(a.m۱۵۳۵۴b(0));
        a.m۱۵۳۵۰a();
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int resId) {
        setCheckMarkDrawable(Ca.m۱۰۶۷۳c(getContext(), resId));
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        Cw wVar = this.f۱۲۰۷۴c;
        if (wVar != null) {
            wVar.m۱۵۶۶۳a(context, resId);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Cw wVar = this.f۱۲۰۷۴c;
        if (wVar != null) {
            wVar.m۱۵۶۵۹a();
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
