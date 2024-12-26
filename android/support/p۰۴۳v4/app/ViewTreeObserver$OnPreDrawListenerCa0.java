package android.support.p۰۴۳v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.a0  reason: invalid class name */
public class ViewTreeObserver$OnPreDrawListenerCa0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: contains not printable characters */
    private final View f۱۰۰۷۹c;

    /* renamed from: d  reason: contains not printable characters */
    private ViewTreeObserver f۱۰۰۸۰d;

    /* renamed from: e  reason: contains not printable characters */
    private final Runnable f۱۰۰۸۱e;

    private ViewTreeObserver$OnPreDrawListenerCa0(View view, Runnable runnable) {
        this.f۱۰۰۷۹c = view;
        this.f۱۰۰۸۰d = view.getViewTreeObserver();
        this.f۱۰۰۸۱e = runnable;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static ViewTreeObserver$OnPreDrawListenerCa0 m۱۲۰۶۶a(View view, Runnable runnable) {
        ViewTreeObserver$OnPreDrawListenerCa0 listener = new ViewTreeObserver$OnPreDrawListenerCa0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(listener);
        view.addOnAttachStateChangeListener(listener);
        return listener;
    }

    public boolean onPreDraw() {
        m۱۲۰۶۷a();
        this.f۱۰۰۸۱e.run();
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۶۷a() {
        if (this.f۱۰۰۸۰d.isAlive()) {
            this.f۱۰۰۸۰d.removeOnPreDrawListener(this);
        } else {
            this.f۱۰۰۷۹c.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f۱۰۰۷۹c.removeOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View v) {
        this.f۱۰۰۸۰d = v.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View v) {
        m۱۲۰۶۷a();
    }
}
