package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v4.app.a0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class ViewTreeObserverOnPreDrawListenerCa0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: contains not printable characters */
    private final View f۱۰۰۷۹c;

    /* renamed from: d, reason: contains not printable characters */
    private ViewTreeObserver f۱۰۰۸۰d;

    /* renamed from: e, reason: contains not printable characters */
    private final Runnable f۱۰۰۸۱e;

    private ViewTreeObserverOnPreDrawListenerCa0(View view, Runnable runnable) {
        this.f۱۰۰۷۹c = view;
        this.f۱۰۰۸۰d = view.getViewTreeObserver();
        this.f۱۰۰۸۱e = runnable;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static ViewTreeObserverOnPreDrawListenerCa0 m۹۹۹۶a(View view, Runnable runnable) {
        ViewTreeObserverOnPreDrawListenerCa0 listener = new ViewTreeObserverOnPreDrawListenerCa0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(listener);
        view.addOnAttachStateChangeListener(listener);
        return listener;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m۹۹۹۷a();
        this.f۱۰۰۸۱e.run();
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۹۹۹۷a() {
        if (this.f۱۰۰۸۰d.isAlive()) {
            this.f۱۰۰۸۰d.removeOnPreDrawListener(this);
        } else {
            this.f۱۰۰۷۹c.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f۱۰۰۷۹c.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        this.f۱۰۰۸۰d = v.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        m۹۹۹۷a();
    }
}
