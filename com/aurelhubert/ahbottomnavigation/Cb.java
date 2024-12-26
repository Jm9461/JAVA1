package com.aurelhubert.ahbottomnavigation;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.aurelhubert.ahbottomnavigation.b  reason: invalid class name */
public class Cb {
    /* renamed from: a  reason: contains not printable characters */
    public static Drawable m۱۶۸۴۶a(Drawable drawable, int color, boolean forceTint) {
        if (forceTint) {
            drawable.clearColorFilter();
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            drawable.invalidateSelf();
            return drawable;
        }
        Drawable wrapDrawable = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(drawable).mutate();
        android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۶b(wrapDrawable, color);
        return wrapDrawable;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۶۸۵۳b(View view, int fromMargin, int toMargin) {
        ValueAnimator animator = ValueAnimator.ofFloat((float) fromMargin, (float) toMargin);
        animator.setDuration(150L);
        animator.addUpdateListener(new Ca(view));
        animator.start();
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.b$a  reason: invalid class name */
    static class Ca implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ View f۱۳۴۶۸a;

        Ca(View view) {
            this.f۱۳۴۶۸a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f۱۳۴۶۸a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) this.f۱۳۴۶۸a.getLayoutParams();
                p.setMargins(p.leftMargin, (int) animatedValue, p.rightMargin, p.bottomMargin);
                this.f۱۳۴۶۸a.requestLayout();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۸۴۹a(View view, int fromMargin, int toMargin) {
        ValueAnimator animator = ValueAnimator.ofFloat((float) fromMargin, (float) toMargin);
        animator.setDuration(150L);
        animator.addUpdateListener(new Cb(view));
        animator.start();
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.b$b  reason: invalid class name */
    static class Cb implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ View f۱۳۴۶۹a;

        Cb(View view) {
            this.f۱۳۴۶۹a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f۱۳۴۶۹a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) this.f۱۳۴۶۹a.getLayoutParams();
                p.setMargins((int) animatedValue, p.topMargin, p.rightMargin, p.bottomMargin);
                this.f۱۳۴۶۹a.requestLayout();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۸۵۰a(TextView textView, float fromSize, float toSize) {
        ValueAnimator animator = ValueAnimator.ofFloat(fromSize, toSize);
        animator.setDuration(150L);
        animator.addUpdateListener(new Cc(textView));
        animator.start();
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.b$c  reason: invalid class name */
    static class Cc implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ TextView f۱۳۴۷۰a;

        Cc(TextView textView) {
            this.f۱۳۴۷۰a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f۱۳۴۷۰a.setTextSize(0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۸۴۸a(View view, float fromValue, float toValue) {
        ValueAnimator animator = ValueAnimator.ofFloat(fromValue, toValue);
        animator.setDuration(150L);
        animator.addUpdateListener(new Cd(view));
        animator.start();
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.b$d  reason: invalid class name */
    static class Cd implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ View f۱۳۴۷۱a;

        Cd(View view) {
            this.f۱۳۴۷۱a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f۱۳۴۷۱a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۸۵۱a(TextView textView, int fromColor, int toColor) {
        ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(fromColor), Integer.valueOf(toColor));
        colorAnimation.setDuration(150L);
        colorAnimation.addUpdateListener(new Ce(textView));
        colorAnimation.start();
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.b$e  reason: invalid class name */
    static class Ce implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ TextView f۱۳۴۷۲a;

        Ce(TextView textView) {
            this.f۱۳۴۷۲a = textView;
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            this.f۱۳۴۷۲a.setTextColor(((Integer) animator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public static void m۱۶۸۵۴c(View view, int fromColor, int toColor) {
        ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(fromColor), Integer.valueOf(toColor));
        colorAnimation.setDuration(150L);
        colorAnimation.addUpdateListener(new Cf(view));
        colorAnimation.start();
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.b$f  reason: invalid class name */
    static class Cf implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ View f۱۳۴۷۳a;

        Cf(View view) {
            this.f۱۳۴۷۳a = view;
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            this.f۱۳۴۷۳a.setBackgroundColor(((Integer) animator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۶۸۴۷a(Context context, Drawable drawable, ImageView imageView, int fromColor, int toColor, boolean forceTint) {
        ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(fromColor), Integer.valueOf(toColor));
        colorAnimation.setDuration(150L);
        colorAnimation.addUpdateListener(new Cg(imageView, drawable, forceTint));
        colorAnimation.start();
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.b$g  reason: invalid class name */
    static class Cg implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ ImageView f۱۳۴۷۴a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ Drawable f۱۳۴۷۵b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۳۴۷۶c;

        Cg(ImageView imageView, Drawable drawable, boolean z) {
            this.f۱۳۴۷۴a = imageView;
            this.f۱۳۴۷۵b = drawable;
            this.f۱۳۴۷۶c = z;
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            this.f۱۳۴۷۴a.setImageDrawable(Cb.m۱۶۸۴۶a(this.f۱۳۴۷۵b, ((Integer) animator.getAnimatedValue()).intValue(), this.f۱۳۴۷۶c));
            this.f۱۳۴۷۴a.requestLayout();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static void m۱۶۸۵۲b(View view, float fromWidth, float toWidth) {
        ValueAnimator animator = ValueAnimator.ofFloat(fromWidth, toWidth);
        animator.setDuration(150L);
        animator.addUpdateListener(new Ch(view));
        animator.start();
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.b$h  reason: invalid class name */
    static class Ch implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ View f۱۳۴۷۷a;

        Ch(View view) {
            this.f۱۳۴۷۷a = view;
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            ViewGroup.LayoutParams params = this.f۱۳۴۷۷a.getLayoutParams();
            params.width = Math.round(((Float) animator.getAnimatedValue()).floatValue());
            this.f۱۳۴۷۷a.setLayoutParams(params);
        }
    }
}
