package android.support.design.widget;

import a.b.c.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.d0.b;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;

public class d extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    private final AccessibilityManager f۹۲۰c;

    /* renamed from: d  reason: collision with root package name */
    private final b.a f۹۲۱d;

    /* renamed from: e  reason: collision with root package name */
    private c f۹۲۲e;

    /* renamed from: f  reason: collision with root package name */
    private b f۹۲۳f;

    protected d(Context context) {
        this(context, null);
    }

    protected d(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a2 = context.obtainStyledAttributes(attrs, k.SnackbarLayout);
        if (a2.hasValue(k.SnackbarLayout_elevation)) {
            u.a(this, (float) a2.getDimensionPixelSize(k.SnackbarLayout_elevation, 0));
        }
        a2.recycle();
        this.f۹۲۰c = (AccessibilityManager) context.getSystemService("accessibility");
        this.f۹۲۱d = new a();
        b.a(this.f۹۲۰c, this.f۹۲۱d);
        setClickableOrFocusableBasedOnAccessibility(this.f۹۲۰c.isTouchExplorationEnabled());
    }

    class a implements b.a {
        a() {
        }

        @Override // android.support.v4.view.d0.b.a
        public void onTouchExplorationStateChanged(boolean enabled) {
            d.this.setClickableOrFocusableBasedOnAccessibility(enabled);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setClickableOrFocusableBasedOnAccessibility(boolean touchExplorationEnabled) {
        setClickable(!touchExplorationEnabled);
        setFocusable(touchExplorationEnabled);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b2) {
        super.onLayout(changed, l, t, r, b2);
        c cVar = this.f۹۲۲e;
        if (cVar != null) {
            cVar.a(this, l, t, r, b2);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f۹۲۳f;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        u.C(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f۹۲۳f;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
        b.b(this.f۹۲۰c, this.f۹۲۱d);
    }

    /* access modifiers changed from: package-private */
    public void setOnLayoutChangeListener(c onLayoutChangeListener) {
        this.f۹۲۲e = onLayoutChangeListener;
    }

    /* access modifiers changed from: package-private */
    public void setOnAttachStateChangeListener(b listener) {
        this.f۹۲۳f = listener;
    }
}
