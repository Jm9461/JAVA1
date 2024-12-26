package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cb;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck;

/* renamed from: android.support.design.widget.d  reason: invalid class name */
public class Cd extends FrameLayout {

    /* renamed from: c  reason: contains not printable characters */
    private final AccessibilityManager f۹۸۵۱c;

    /* renamed from: d  reason: contains not printable characters */
    private final Cb.AbstractCa f۹۸۵۲d;

    /* renamed from: e  reason: contains not printable characters */
    private AbstractCc f۹۸۵۳e;

    /* renamed from: f  reason: contains not printable characters */
    private AbstractCb f۹۸۵۴f;

    protected Cd(Context context) {
        this(context, null);
    }

    protected Cd(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, Ck.SnackbarLayout);
        if (a.hasValue(Ck.SnackbarLayout_elevation)) {
            Cu.m۱۲۹۷۷a(this, (float) a.getDimensionPixelSize(Ck.SnackbarLayout_elevation, 0));
        }
        a.recycle();
        this.f۹۸۵۱c = (AccessibilityManager) context.getSystemService("accessibility");
        this.f۹۸۵۲d = new Ca();
        Cb.m۱۲۸۲۹a(this.f۹۸۵۱c, this.f۹۸۵۲d);
        setClickableOrFocusableBasedOnAccessibility(this.f۹۸۵۱c.isTouchExplorationEnabled());
    }

    /* renamed from: android.support.design.widget.d$a  reason: invalid class name */
    class Ca implements Cb.AbstractCa {
        Ca() {
        }

        @Override // android.support.p۰۴۳v4.view.p۰۴۵d0.Cb.AbstractCa
        public void onTouchExplorationStateChanged(boolean enabled) {
            Cd.this.setClickableOrFocusableBasedOnAccessibility(enabled);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setClickableOrFocusableBasedOnAccessibility(boolean touchExplorationEnabled) {
        setClickable(!touchExplorationEnabled);
        setFocusable(touchExplorationEnabled);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        AbstractCc cVar = this.f۹۸۵۳e;
        if (cVar != null) {
            cVar.m۱۱۸۰۱a(this, l, t, r, b);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractCb bVar = this.f۹۸۵۴f;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        Cu.m۱۲۹۷۱C(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractCb bVar = this.f۹۸۵۴f;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
        Cb.m۱۲۸۳۰b(this.f۹۸۵۱c, this.f۹۸۵۲d);
    }

    /* access modifiers changed from: package-private */
    public void setOnLayoutChangeListener(AbstractCc onLayoutChangeListener) {
        this.f۹۸۵۳e = onLayoutChangeListener;
    }

    /* access modifiers changed from: package-private */
    public void setOnAttachStateChangeListener(AbstractCb listener) {
        this.f۹۸۵۴f = listener;
    }
}
