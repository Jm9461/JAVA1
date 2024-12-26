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

public class b {
    public static Drawable a(Drawable drawable, int color, boolean forceTint) {
        if (forceTint) {
            drawable.clearColorFilter();
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            drawable.invalidateSelf();
            return drawable;
        }
        Drawable wrapDrawable = android.support.v4.graphics.drawable.a.h(drawable).mutate();
        android.support.v4.graphics.drawable.a.b(wrapDrawable, color);
        return wrapDrawable;
    }

    public static void b(View view, int fromMargin, int toMargin) {
        ValueAnimator animator = ValueAnimator.ofFloat((float) fromMargin, (float) toMargin);
        animator.setDuration(150L);
        animator.addUpdateListener(new a(view));
        animator.start();
    }

    static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f۲۸۱۰a;

        a(View view) {
            this.f۲۸۱۰a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f۲۸۱۰a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) this.f۲۸۱۰a.getLayoutParams();
                p.setMargins(p.leftMargin, (int) animatedValue, p.rightMargin, p.bottomMargin);
                this.f۲۸۱۰a.requestLayout();
            }
        }
    }

    public static void a(View view, int fromMargin, int toMargin) {
        ValueAnimator animator = ValueAnimator.ofFloat((float) fromMargin, (float) toMargin);
        animator.setDuration(150L);
        animator.addUpdateListener(new C۰۰۶۳b(view));
        animator.start();
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.b$b  reason: collision with other inner class name */
    static class C۰۰۶۳b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f۲۸۱۱a;

        C۰۰۶۳b(View view) {
            this.f۲۸۱۱a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f۲۸۱۱a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) this.f۲۸۱۱a.getLayoutParams();
                p.setMargins((int) animatedValue, p.topMargin, p.rightMargin, p.bottomMargin);
                this.f۲۸۱۱a.requestLayout();
            }
        }
    }

    public static void a(TextView textView, float fromSize, float toSize) {
        ValueAnimator animator = ValueAnimator.ofFloat(fromSize, toSize);
        animator.setDuration(150L);
        animator.addUpdateListener(new c(textView));
        animator.start();
    }

    static class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f۲۸۱۲a;

        c(TextView textView) {
            this.f۲۸۱۲a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f۲۸۱۲a.setTextSize(0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static void a(View view, float fromValue, float toValue) {
        ValueAnimator animator = ValueAnimator.ofFloat(fromValue, toValue);
        animator.setDuration(150L);
        animator.addUpdateListener(new d(view));
        animator.start();
    }

    static class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f۲۸۱۳a;

        d(View view) {
            this.f۲۸۱۳a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f۲۸۱۳a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static void a(TextView textView, int fromColor, int toColor) {
        ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(fromColor), Integer.valueOf(toColor));
        colorAnimation.setDuration(150L);
        colorAnimation.addUpdateListener(new e(textView));
        colorAnimation.start();
    }

    static class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f۲۸۱۴a;

        e(TextView textView) {
            this.f۲۸۱۴a = textView;
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            this.f۲۸۱۴a.setTextColor(((Integer) animator.getAnimatedValue()).intValue());
        }
    }

    public static void c(View view, int fromColor, int toColor) {
        ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(fromColor), Integer.valueOf(toColor));
        colorAnimation.setDuration(150L);
        colorAnimation.addUpdateListener(new f(view));
        colorAnimation.start();
    }

    static class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f۲۸۱۵a;

        f(View view) {
            this.f۲۸۱۵a = view;
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            this.f۲۸۱۵a.setBackgroundColor(((Integer) animator.getAnimatedValue()).intValue());
        }
    }

    public static void a(Context context, Drawable drawable, ImageView imageView, int fromColor, int toColor, boolean forceTint) {
        ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(fromColor), Integer.valueOf(toColor));
        colorAnimation.setDuration(150L);
        colorAnimation.addUpdateListener(new g(imageView, drawable, forceTint));
        colorAnimation.start();
    }

    static class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageView f۲۸۱۶a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f۲۸۱۷b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f۲۸۱۸c;

        g(ImageView imageView, Drawable drawable, boolean z) {
            this.f۲۸۱۶a = imageView;
            this.f۲۸۱۷b = drawable;
            this.f۲۸۱۸c = z;
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            this.f۲۸۱۶a.setImageDrawable(b.a(this.f۲۸۱۷b, ((Integer) animator.getAnimatedValue()).intValue(), this.f۲۸۱۸c));
            this.f۲۸۱۶a.requestLayout();
        }
    }

    public static void b(View view, float fromWidth, float toWidth) {
        ValueAnimator animator = ValueAnimator.ofFloat(fromWidth, toWidth);
        animator.setDuration(150L);
        animator.addUpdateListener(new h(view));
        animator.start();
    }

    static class h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f۲۸۱۹a;

        h(View view) {
            this.f۲۸۱۹a = view;
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            ViewGroup.LayoutParams params = this.f۲۸۱۹a.getLayoutParams();
            params.width = Math.round(((Float) animator.getAnimatedValue()).floatValue());
            this.f۲۸۱۹a.setLayoutParams(params);
        }
    }
}
