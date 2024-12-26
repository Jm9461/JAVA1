package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class h implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    private final x f۳۵۴۱c;

    /* renamed from: d  reason: collision with root package name */
    final WeakReference<ImageView> f۳۵۴۲d;

    /* renamed from: e  reason: collision with root package name */
    e f۳۵۴۳e;

    h(x creator, ImageView target, e callback) {
        this.f۳۵۴۱c = creator;
        this.f۳۵۴۲d = new WeakReference<>(target);
        this.f۳۵۴۳e = callback;
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
        ImageView target = this.f۳۵۴۲d.get();
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
        this.f۳۵۴۲d.clear();
        x xVar = this.f۳۵۴۱c;
        xVar.d();
        xVar.a(width, height);
        xVar.a(target, this.f۳۵۴۳e);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f۳۵۴۱c.b();
        this.f۳۵۴۳e = null;
        ImageView target = this.f۳۵۴۲d.get();
        if (target != null) {
            this.f۳۵۴۲d.clear();
            target.removeOnAttachStateChangeListener(this);
            ViewTreeObserver vto = target.getViewTreeObserver();
            if (vto.isAlive()) {
                vto.removeOnPreDrawListener(this);
            }
        }
    }
}
