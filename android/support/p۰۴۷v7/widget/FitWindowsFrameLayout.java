package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p۰۴۷v7.widget.AbstractCk0;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.FitWindowsFrameLayout */
public class FitWindowsFrameLayout extends FrameLayout implements AbstractCk0 {

    /* renamed from: c  reason: contains not printable characters */
    private AbstractCk0.AbstractCa f۱۱۴۷۲c;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCk0
    public void setOnFitSystemWindowsListener(AbstractCk0.AbstractCa listener) {
        this.f۱۱۴۷۲c = listener;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect insets) {
        AbstractCk0.AbstractCa aVar = this.f۱۱۴۷۲c;
        if (aVar != null) {
            aVar.m۱۵۳۶۵a(insets);
        }
        return super.fitSystemWindows(insets);
    }
}
