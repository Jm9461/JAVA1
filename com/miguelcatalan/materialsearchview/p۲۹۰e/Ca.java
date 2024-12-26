package com.miguelcatalan.materialsearchview.p۲۹۰e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.support.v4.view.Cu;
import android.support.v4.view.Cy;
import android.support.v4.view.InterfaceCz;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;

/* renamed from: com.miguelcatalan.materialsearchview.e.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {

    /* renamed from: a, reason: contains not printable characters */
    public static int f۱۴۸۴۳a = 400;

    /* renamed from: com.miguelcatalan.materialsearchview.e.a$c */
    public interface c {
        /* renamed from: a, reason: contains not printable characters */
        boolean mo۱۵۷۹۸a(View view);

        /* renamed from: b, reason: contains not printable characters */
        boolean mo۱۵۷۹۹b(View view);

        /* renamed from: c, reason: contains not printable characters */
        boolean mo۱۵۸۰۰c(View view);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۵۷۹۳a(View view, int duration, c listener) {
        view.setVisibility(0);
        view.setAlpha(0.0f);
        InterfaceCz vpListener = null;
        if (listener != null) {
            vpListener = new a(listener);
        }
        Cy cy = Cu.m۱۰۹۰۶a(view);
        cy.m۱۰۹۸۳a(1.0f);
        cy.m۱۰۹۸۴a(duration);
        cy.m۱۰۹۸۶a(vpListener);
    }

    /* renamed from: com.miguelcatalan.materialsearchview.e.a$a */
    static class a implements InterfaceCz {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ c f۱۴۸۴۴a;

        a(c cVar) {
            this.f۱۴۸۴۴a = cVar;
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۵۷۹۶b(View view) {
            if (!this.f۱۴۸۴۴a.mo۱۵۷۹۹b(view)) {
                view.setDrawingCacheEnabled(true);
            }
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۵۷۹۵a(View view) {
            if (!this.f۱۴۸۴۴a.mo۱۵۷۹۸a(view)) {
                view.setDrawingCacheEnabled(false);
            }
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۵۷۹۷c(View view) {
        }
    }

    @TargetApi(21)
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۵۷۹۴a(View view, c listener) {
        int cx = view.getWidth() - ((int) TypedValue.applyDimension(1, 24.0f, view.getResources().getDisplayMetrics()));
        int cy = view.getHeight() / 2;
        int finalRadius = Math.max(view.getWidth(), view.getHeight());
        Animator anim = ViewAnimationUtils.createCircularReveal(view, cx, cy, 0.0f, finalRadius);
        view.setVisibility(0);
        anim.addListener(new b(listener, view));
        anim.start();
    }

    /* renamed from: com.miguelcatalan.materialsearchview.e.a$b */
    static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ c f۱۴۸۴۵a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ View f۱۴۸۴۶b;

        b(c cVar, View view) {
            this.f۱۴۸۴۵a = cVar;
            this.f۱۴۸۴۶b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            this.f۱۴۸۴۵a.mo۱۵۷۹۹b(this.f۱۴۸۴۶b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.f۱۴۸۴۵a.mo۱۵۷۹۸a(this.f۱۴۸۴۶b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.f۱۴۸۴۵a.mo۱۵۸۰۰c(this.f۱۴۸۴۶b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }
    }
}
