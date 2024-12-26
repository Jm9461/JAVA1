package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p۰۴۷v7.widget.AbstractCk0;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
public class FitWindowsLinearLayout extends LinearLayout implements AbstractCk0 {

    /* renamed from: c  reason: contains not printable characters */
    private AbstractCk0.AbstractCa f۱۱۴۷۳c;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCk0
    public void setOnFitSystemWindowsListener(AbstractCk0.AbstractCa listener) {
        this.f۱۱۴۷۳c = listener;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect insets) {
        AbstractCk0.AbstractCa aVar = this.f۱۱۴۷۳c;
        if (aVar != null) {
            aVar.m۱۵۳۶۵a(insets);
        }
        return super.fitSystemWindows(insets);
    }
}
