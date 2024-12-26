package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class ViewTreeObserverOnPreDrawListenerCh implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: contains not printable characters */
    private final Cx f۱۵۴۲۷c;

    /* renamed from: d, reason: contains not printable characters */
    final WeakReference<ImageView> f۱۵۴۲۸d;

    /* renamed from: e, reason: contains not printable characters */
    InterfaceCe f۱۵۴۲۹e;

    ViewTreeObserverOnPreDrawListenerCh(Cx creator, ImageView target, InterfaceCe callback) {
        this.f۱۵۴۲۷c = creator;
        this.f۱۵۴۲۸d = new WeakReference<>(target);
        this.f۱۵۴۲۹e = callback;
        target.addOnAttachStateChangeListener(this);
        if (target.getWindowToken() != null) {
            onViewAttachedToWindow(target);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView target = this.f۱۵۴۲۸d.get();
        if (target == null) {
            return true;
        }
        ViewTreeObserver vto = target.getViewTreeObserver();
        if (!vto.isAlive()) {
            return true;
        }
        int width = target.getWidth();
        int height = target.getHeight();
        if (width <= 0 || height <= 0) {
            return true;
        }
        target.removeOnAttachStateChangeListener(this);
        vto.removeOnPreDrawListener(this);
        this.f۱۵۴۲۸d.clear();
        Cx cx = this.f۱۵۴۲۷c;
        cx.m۱۶۳۶۱d();
        cx.m۱۶۳۵۶a(width, height);
        cx.m۱۶۳۵۸a(target, this.f۱۵۴۲۹e);
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۲۵۹a() {
        this.f۱۵۴۲۷c.m۱۶۳۵۹b();
        this.f۱۵۴۲۹e = null;
        ImageView target = this.f۱۵۴۲۸d.get();
        if (target == null) {
            return;
        }
        this.f۱۵۴۲۸d.clear();
        target.removeOnAttachStateChangeListener(this);
        ViewTreeObserver vto = target.getViewTreeObserver();
        if (vto.isAlive()) {
            vto.removeOnPreDrawListener(this);
        }
    }
}
