package android.support.v7.widget;

import a.b.h.c.a.a;
import android.content.Context;
import android.support.v4.widget.p;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

public class h extends CheckedTextView {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f۲۰۸۵d = {16843016};

    /* renamed from: c  reason: collision with root package name */
    private final w f۲۰۸۶c;

    public h(Context context, AttributeSet attrs) {
        this(context, attrs, 16843720);
    }

    public h(Context context, AttributeSet attrs, int defStyleAttr) {
        super(g1.b(context), attrs, defStyleAttr);
        this.f۲۰۸۶c = new w(this);
        this.f۲۰۸۶c.a(attrs, defStyleAttr);
        this.f۲۰۸۶c.a();
        j1 a2 = j1.a(getContext(), attrs, f۲۰۸۵d, defStyleAttr, 0);
        setCheckMarkDrawable(a2.b(0));
        a2.a();
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int resId) {
        setCheckMarkDrawable(a.c(getContext(), resId));
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        w wVar = this.f۲۰۸۶c;
        if (wVar != null) {
            wVar.a(context, resId);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        w wVar = this.f۲۰۸۶c;
        if (wVar != null) {
            wVar.a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        l.a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(p.a(this, actionModeCallback));
    }
}
