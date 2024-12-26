package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* access modifiers changed from: package-private */
public class a0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    private final View f۱۰۴۶c;

    /* renamed from: d  reason: collision with root package name */
    private ViewTreeObserver f۱۰۴۷d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f۱۰۴۸e;

    private a0(View view, Runnable runnable) {
        this.f۱۰۴۶c = view;
        this.f۱۰۴۷d = view.getViewTreeObserver();
        this.f۱۰۴۸e = runnable;
    }

    public static a0 a(View view, Runnable runnable) {
        a0 listener = new a0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(listener);
        view.addOnAttachStateChangeListener(listener);
        return listener;
    }

    public boolean onPreDraw() {
        a();
        this.f۱۰۴۸e.run();
        return true;
    }

    public void a() {
        if (this.f۱۰۴۷d.isAlive()) {
            this.f۱۰۴۷d.removeOnPreDrawListener(this);
        } else {
            this.f۱۰۴۶c.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f۱۰۴۶c.removeOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View v) {
        this.f۱۰۴۷d = v.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View v) {
        a();
    }
}
