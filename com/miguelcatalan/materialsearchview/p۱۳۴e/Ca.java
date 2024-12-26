package com.miguelcatalan.materialsearchview.p۱۳۴e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.support.p۰۴۳v4.view.AbstractCz;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.Cy;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;

/* renamed from: com.miguelcatalan.materialsearchview.e.a  reason: invalid class name */
public class Ca {

    /* renamed from: a  reason: contains not printable characters */
    public static int f۱۴۸۴۳a = 400;

    /* renamed from: com.miguelcatalan.materialsearchview.e.a$c  reason: invalid class name */
    public interface AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        boolean m۱۷۸۷۶a(View view);

        /* renamed from: b  reason: contains not printable characters */
        boolean m۱۷۸۷۷b(View view);

        /* renamed from: c  reason: contains not printable characters */
        boolean m۱۷۸۷۸c(View view);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۷۸۷۱a(View view, int duration, AbstractCc listener) {
        view.setVisibility(0);
        view.setAlpha(0.0f);
        AbstractCz vpListener = null;
        if (listener != null) {
            vpListener = new Ca(listener);
        }
        Cy a = Cu.m۱۲۹۷۶a(view);
        a.m۱۳۰۵۳a(1.0f);
        a.m۱۳۰۵۴a((long) duration);
        a.m۱۳۰۵۶a(vpListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.miguelcatalan.materialsearchview.e.a$a  reason: invalid class name */
    public static class Ca implements AbstractCz {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCc f۱۴۸۴۴a;

        Ca(AbstractCc cVar) {
            this.f۱۴۸۴۴a = cVar;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۷۸۷۴b(View view) {
            if (!this.f۱۴۸۴۴a.m۱۷۸۷۷b(view)) {
                view.setDrawingCacheEnabled(true);
            }
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۷۸۷۳a(View view) {
            if (!this.f۱۴۸۴۴a.m۱۷۸۷۶a(view)) {
                view.setDrawingCacheEnabled(false);
            }
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۷۸۷۵c(View view) {
        }
    }

    @TargetApi(21)
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۷۸۷۲a(View view, AbstractCc listener) {
        Animator anim = ViewAnimationUtils.createCircularReveal(view, view.getWidth() - ((int) TypedValue.applyDimension(1, 24.0f, view.getResources().getDisplayMetrics())), view.getHeight() / 2, 0.0f, (float) Math.max(view.getWidth(), view.getHeight()));
        view.setVisibility(0);
        anim.addListener(new Cb(listener, view));
        anim.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.miguelcatalan.materialsearchview.e.a$b  reason: invalid class name */
    public static class Cb extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCc f۱۴۸۴۵a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ View f۱۴۸۴۶b;

        Cb(AbstractCc cVar, View view) {
            this.f۱۴۸۴۵a = cVar;
            this.f۱۴۸۴۶b = view;
        }

        public void onAnimationStart(Animator animation) {
            this.f۱۴۸۴۵a.m۱۷۸۷۷b(this.f۱۴۸۴۶b);
        }

        public void onAnimationEnd(Animator animation) {
            this.f۱۴۸۴۵a.m۱۷۸۷۶a(this.f۱۴۸۴۶b);
        }

        public void onAnimationCancel(Animator animation) {
            this.f۱۴۸۴۵a.m۱۷۸۷۸c(this.f۱۴۸۴۶b);
        }

        public void onAnimationRepeat(Animator animation) {
        }
    }
}
