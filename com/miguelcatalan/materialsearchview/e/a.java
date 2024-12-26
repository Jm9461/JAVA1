package com.miguelcatalan.materialsearchview.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.support.v4.view.u;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f۳۲۹۹a = 400;

    public interface c {
        boolean a(View view);

        boolean b(View view);

        boolean c(View view);
    }

    public static void a(View view, int duration, c listener) {
        view.setVisibility(0);
        view.setAlpha(0.0f);
        z vpListener = null;
        if (listener != null) {
            vpListener = new C۰۱۰۶a(listener);
        }
        y a2 = u.a(view);
        a2.a(1.0f);
        a2.a((long) duration);
        a2.a(vpListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.miguelcatalan.materialsearchview.e.a$a  reason: collision with other inner class name */
    public static class C۰۱۰۶a implements z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f۳۳۰۰a;

        C۰۱۰۶a(c cVar) {
            this.f۳۳۰۰a = cVar;
        }

        @Override // android.support.v4.view.z
        public void b(View view) {
            if (!this.f۳۳۰۰a.b(view)) {
                view.setDrawingCacheEnabled(true);
            }
        }

        @Override // android.support.v4.view.z
        public void a(View view) {
            if (!this.f۳۳۰۰a.a(view)) {
                view.setDrawingCacheEnabled(false);
            }
        }

        @Override // android.support.v4.view.z
        public void c(View view) {
        }
    }

    @TargetApi(21)
    public static void a(View view, c listener) {
        Animator anim = ViewAnimationUtils.createCircularReveal(view, view.getWidth() - ((int) TypedValue.applyDimension(1, 24.0f, view.getResources().getDisplayMetrics())), view.getHeight() / 2, 0.0f, (float) Math.max(view.getWidth(), view.getHeight()));
        view.setVisibility(0);
        anim.addListener(new b(listener, view));
        anim.start();
    }

    /* access modifiers changed from: package-private */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f۳۳۰۱a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f۳۳۰۲b;

        b(c cVar, View view) {
            this.f۳۳۰۱a = cVar;
            this.f۳۳۰۲b = view;
        }

        public void onAnimationStart(Animator animation) {
            this.f۳۳۰۱a.b(this.f۳۳۰۲b);
        }

        public void onAnimationEnd(Animator animation) {
            this.f۳۳۰۱a.a(this.f۳۳۰۲b);
        }

        public void onAnimationCancel(Animator animation) {
            this.f۳۳۰۱a.c(this.f۳۳۰۲b);
        }

        public void onAnimationRepeat(Animator animation) {
        }
    }
}
