package android.support.v7.widget;

import a.b.h.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.view.t;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

public class p extends MultiAutoCompleteTextView implements t {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f۲۲۰۹e = {16843126};

    /* renamed from: c  reason: collision with root package name */
    private final f f۲۲۱۰c;

    /* renamed from: d  reason: collision with root package name */
    private final w f۲۲۱۱d;

    public p(Context context, AttributeSet attrs) {
        this(context, attrs, a.autoCompleteTextViewStyle);
    }

    public p(Context context, AttributeSet attrs, int defStyleAttr) {
        super(g1.b(context), attrs, defStyleAttr);
        j1 a2 = j1.a(getContext(), attrs, f۲۲۰۹e, defStyleAttr, 0);
        if (a2.g(0)) {
            setDropDownBackgroundDrawable(a2.b(0));
        }
        a2.a();
        this.f۲۲۱۰c = new f(this);
        this.f۲۲۱۰c.a(attrs, defStyleAttr);
        this.f۲۲۱۱d = new w(this);
        this.f۲۲۱۱d.a(attrs, defStyleAttr);
        this.f۲۲۱۱d.a();
    }

    public void setDropDownBackgroundResource(int resId) {
        setDropDownBackgroundDrawable(a.b.h.c.a.a.c(getContext(), resId));
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        f fVar = this.f۲۲۱۰c;
        if (fVar != null) {
            fVar.a(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        f fVar = this.f۲۲۱۰c;
        if (fVar != null) {
            fVar.a(background);
        }
    }

    @Override // android.support.v4.view.t
    public void setSupportBackgroundTintList(ColorStateList tint) {
        f fVar = this.f۲۲۱۰c;
        if (fVar != null) {
            fVar.b(tint);
        }
    }

    @Override // android.support.v4.view.t
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f۲۲۱۰c;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    @Override // android.support.v4.view.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        f fVar = this.f۲۲۱۰c;
        if (fVar != null) {
            fVar.a(tintMode);
        }
    }

    @Override // android.support.v4.view.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f۲۲۱۰c;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f۲۲۱۰c;
        if (fVar != null) {
            fVar.a();
        }
        w wVar = this.f۲۲۱۱d;
        if (wVar != null) {
            wVar.a();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        w wVar = this.f۲۲۱۱d;
        if (wVar != null) {
            wVar.a(context, resId);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        l.a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }
}
