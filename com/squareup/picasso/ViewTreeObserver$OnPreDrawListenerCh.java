package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.h  reason: invalid class name */
public class ViewTreeObserver$OnPreDrawListenerCh implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: contains not printable characters */
    private final Cx f۱۵۴۲۷c;

    /* renamed from: d  reason: contains not printable characters */
    final WeakReference<ImageView> f۱۵۴۲۸d;

    /* renamed from: e  reason: contains not printable characters */
    AbstractCe f۱۵۴۲۹e;

    ViewTreeObserver$OnPreDrawListenerCh(Cx creator, ImageView target, AbstractCe callback) {
        this.f۱۵۴۲۷c = creator;
        this.f۱۵۴۲۸d = new WeakReference<>(target);
        this.f۱۵۴۲۹e = callback;
        target.addOnAttachStateChangeListener(this);
        if (target.getWindowToken() != null) {
            onViewAttachedToWindow(target);
        }
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }

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
        Cx xVar = this.f۱۵۴۲۷c;
        xVar.m۱۸۴۳۹d();
        xVar.m۱۸۴۳۴a(width, height);
        xVar.m۱۸۴۳۶a(target, this.f۱۵۴۲۹e);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۳۳۷a() {
        this.f۱۵۴۲۷c.m۱۸۴۳۷b();
        this.f۱۵۴۲۹e = null;
        ImageView target = this.f۱۵۴۲۸d.get();
        if (target != null) {
            this.f۱۵۴۲۸d.clear();
            target.removeOnAttachStateChangeListener(this);
            ViewTreeObserver vto = target.getViewTreeObserver();
            if (vto.isAlive()) {
                vto.removeOnPreDrawListener(this);
            }
        }
    }
}
