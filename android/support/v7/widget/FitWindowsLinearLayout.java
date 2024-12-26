package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.k0;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout implements k0 {

    /* renamed from: c  reason: collision with root package name */
    private k0.a f۱۷۹۳c;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // android.support.v7.widget.k0
    public void setOnFitSystemWindowsListener(k0.a listener) {
        this.f۱۷۹۳c = listener;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect insets) {
        k0.a aVar = this.f۱۷۹۳c;
        if (aVar != null) {
            aVar.a(insets);
        }
        return super.fitSystemWindows(insets);
    }
}
