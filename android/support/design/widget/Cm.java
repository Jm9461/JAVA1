package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: android.support.design.widget.m  reason: invalid class name */
public class Cm extends Cl {

    /* renamed from: I  reason: contains not printable characters */
    private InsetDrawable f۹۹۸۱I;

    Cm(Ca0 view, AbstractCs shadowViewDelegate) {
        super(view, shadowViewDelegate);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.Cl
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۹۲۷a(ColorStateList backgroundTint, PorterDuff.Mode backgroundTintMode, ColorStateList rippleColor, int borderWidth) {
        Drawable rippleContent;
        this.f۹۹۴۹j = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(m۱۱۸۷۷a());
        android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(this.f۹۹۴۹j, backgroundTint);
        if (backgroundTintMode != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(this.f۹۹۴۹j, backgroundTintMode);
        }
        if (borderWidth > 0) {
            this.f۹۹۵۱l = m۱۱۸۷۸a(borderWidth, backgroundTint);
            rippleContent = new LayerDrawable(new Drawable[]{this.f۹۹۵۱l, this.f۹۹۴۹j});
        } else {
            this.f۹۹۵۱l = null;
            rippleContent = this.f۹۹۴۹j;
        }
        this.f۹۹۵۰k = new RippleDrawable(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۵q.Ca.m۱۰۰۳۴a(rippleColor), rippleContent, null);
        Drawable drawable = this.f۹۹۵۰k;
        this.f۹۹۵۲m = drawable;
        this.f۹۹۶۱v.m۱۲۰۱۵a(drawable);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.Cl
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۹۳۰b(ColorStateList rippleColor) {
        Drawable drawable = this.f۹۹۵۰k;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۵q.Ca.m۱۰۰۳۴a(rippleColor));
        } else {
            super.m۱۱۸۹۴b(rippleColor);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.Cl
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۹۲۶a(float elevation, float hoveredFocusedTranslationZ, float pressedTranslationZ) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f۹۹۶۰u.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(Cl.f۹۹۳۳C, m۱۱۹۲۵a(elevation, pressedTranslationZ));
            stateListAnimator.addState(Cl.f۹۹۳۴D, m۱۱۹۲۵a(elevation, hoveredFocusedTranslationZ));
            stateListAnimator.addState(Cl.f۹۹۳۵E, m۱۱۹۲۵a(elevation, hoveredFocusedTranslationZ));
            stateListAnimator.addState(Cl.f۹۹۳۶F, m۱۱۹۲۵a(elevation, hoveredFocusedTranslationZ));
            AnimatorSet set = new AnimatorSet();
            List<Animator> animators = new ArrayList<>();
            animators.add(ObjectAnimator.ofFloat(this.f۹۹۶۰u, "elevation", elevation).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                Ca0 a0Var = this.f۹۹۶۰u;
                animators.add(ObjectAnimator.ofFloat(a0Var, View.TRANSLATION_Z, a0Var.getTranslationZ()).setDuration(100L));
            }
            animators.add(ObjectAnimator.ofFloat(this.f۹۹۶۰u, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            set.playSequentially((Animator[]) animators.toArray(new Animator[0]));
            set.setInterpolator(Cl.f۹۹۳۲B);
            stateListAnimator.addState(Cl.f۹۹۳۷G, set);
            stateListAnimator.addState(Cl.f۹۹۳۸H, m۱۱۹۲۵a(0.0f, 0.0f));
            this.f۹۹۶۰u.setStateListAnimator(stateListAnimator);
        }
        if (this.f۹۹۶۱v.m۱۲۰۱۶b()) {
            m۱۱۹۱۷s();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private Animator m۱۱۹۲۵a(float elevation, float translationZ) {
        AnimatorSet set = new AnimatorSet();
        set.play(ObjectAnimator.ofFloat(this.f۹۹۶۰u, "elevation", elevation).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f۹۹۶۰u, View.TRANSLATION_Z, translationZ).setDuration(100L));
        set.setInterpolator(Cl.f۹۹۳۲B);
        return set;
    }

    @Override // android.support.design.widget.Cl
    /* renamed from: c  reason: contains not printable characters */
    public float m۱۱۹۳۲c() {
        return this.f۹۹۶۰u.getElevation();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.Cl
    /* renamed from: n  reason: contains not printable characters */
    public void m۱۱۹۳۶n() {
        m۱۱۹۱۷s();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.Cl
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۹۳۱b(Rect padding) {
        if (this.f۹۹۶۱v.m۱۲۰۱۶b()) {
            this.f۹۹۸۱I = new InsetDrawable(this.f۹۹۵۰k, padding.left, padding.top, padding.right, padding.bottom);
            this.f۹۹۶۱v.m۱۲۰۱۵a(this.f۹۹۸۱I);
            return;
        }
        this.f۹۹۶۱v.m۱۲۰۱۵a(this.f۹۹۵۰k);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.Cl
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۹۲۹a(int[] state) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f۹۹۶۰u.isEnabled()) {
            this.f۹۹۶۰u.setElevation(this.f۹۹۵۳n);
            if (this.f۹۹۶۰u.isPressed()) {
                this.f۹۹۶۰u.setTranslationZ(this.f۹۹۵۵p);
            } else if (this.f۹۹۶۰u.isFocused() || this.f۹۹۶۰u.isHovered()) {
                this.f۹۹۶۰u.setTranslationZ(this.f۹۹۵۴o);
            } else {
                this.f۹۹۶۰u.setTranslationZ(0.0f);
            }
        } else {
            this.f۹۹۶۰u.setElevation(0.0f);
            this.f۹۹۶۰u.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.Cl
    /* renamed from: j  reason: contains not printable characters */
    public void m۱۱۹۳۳j() {
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.Cl
    /* renamed from: q  reason: contains not printable characters */
    public boolean m۱۱۹۳۷q() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.Cl
    /* renamed from: k  reason: contains not printable characters */
    public Cf m۱۱۹۳۴k() {
        return new Cg();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.Cl
    /* renamed from: l  reason: contains not printable characters */
    public GradientDrawable m۱۱۹۳۵l() {
        return new Ca();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.Cl
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۹۲۸a(Rect rect) {
        if (this.f۹۹۶۱v.m۱۲۰۱۶b()) {
            float radius = this.f۹۹۶۱v.m۱۲۰۱۳a();
            float maxShadowSize = m۱۱۹۳۲c() + this.f۹۹۵۵p;
            int hPadding = (int) Math.ceil((double) Cr.m۱۲۰۰۲a(maxShadowSize, radius, false));
            int vPadding = (int) Math.ceil((double) Cr.m۱۲۰۰۵b(maxShadowSize, radius, false));
            rect.set(hPadding, vPadding, hPadding, vPadding);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* renamed from: android.support.design.widget.m$a  reason: invalid class name */
    static class Ca extends GradientDrawable {
        Ca() {
        }

        public boolean isStateful() {
            return true;
        }
    }
}
