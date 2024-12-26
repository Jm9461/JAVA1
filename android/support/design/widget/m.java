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
public class m extends l {
    private InsetDrawable I;

    m(a0 view, s shadowViewDelegate) {
        super(view, shadowViewDelegate);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.l
    public void a(ColorStateList backgroundTint, PorterDuff.Mode backgroundTintMode, ColorStateList rippleColor, int borderWidth) {
        Drawable rippleContent;
        this.j = android.support.v4.graphics.drawable.a.h(a());
        android.support.v4.graphics.drawable.a.a(this.j, backgroundTint);
        if (backgroundTintMode != null) {
            android.support.v4.graphics.drawable.a.a(this.j, backgroundTintMode);
        }
        if (borderWidth > 0) {
            this.l = a(borderWidth, backgroundTint);
            rippleContent = new LayerDrawable(new Drawable[]{this.l, this.j});
        } else {
            this.l = null;
            rippleContent = this.j;
        }
        this.k = new RippleDrawable(a.b.c.q.a.a(rippleColor), rippleContent, null);
        Drawable drawable = this.k;
        this.m = drawable;
        this.v.a(drawable);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.l
    public void b(ColorStateList rippleColor) {
        Drawable drawable = this.k;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(a.b.c.q.a.a(rippleColor));
        } else {
            super.b(rippleColor);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.l
    public void a(float elevation, float hoveredFocusedTranslationZ, float pressedTranslationZ) {
        if (Build.VERSION.SDK_INT == 21) {
            this.u.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(l.C, a(elevation, pressedTranslationZ));
            stateListAnimator.addState(l.D, a(elevation, hoveredFocusedTranslationZ));
            stateListAnimator.addState(l.E, a(elevation, hoveredFocusedTranslationZ));
            stateListAnimator.addState(l.F, a(elevation, hoveredFocusedTranslationZ));
            AnimatorSet set = new AnimatorSet();
            List<Animator> animators = new ArrayList<>();
            animators.add(ObjectAnimator.ofFloat(this.u, "elevation", elevation).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                a0 a0Var = this.u;
                animators.add(ObjectAnimator.ofFloat(a0Var, View.TRANSLATION_Z, a0Var.getTranslationZ()).setDuration(100L));
            }
            animators.add(ObjectAnimator.ofFloat(this.u, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            set.playSequentially((Animator[]) animators.toArray(new Animator[0]));
            set.setInterpolator(l.B);
            stateListAnimator.addState(l.G, set);
            stateListAnimator.addState(l.H, a(0.0f, 0.0f));
            this.u.setStateListAnimator(stateListAnimator);
        }
        if (this.v.b()) {
            s();
        }
    }

    private Animator a(float elevation, float translationZ) {
        AnimatorSet set = new AnimatorSet();
        set.play(ObjectAnimator.ofFloat(this.u, "elevation", elevation).setDuration(0L)).with(ObjectAnimator.ofFloat(this.u, View.TRANSLATION_Z, translationZ).setDuration(100L));
        set.setInterpolator(l.B);
        return set;
    }

    @Override // android.support.design.widget.l
    public float c() {
        return this.u.getElevation();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.l
    public void n() {
        s();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.l
    public void b(Rect padding) {
        if (this.v.b()) {
            this.I = new InsetDrawable(this.k, padding.left, padding.top, padding.right, padding.bottom);
            this.v.a(this.I);
            return;
        }
        this.v.a(this.k);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.l
    public void a(int[] state) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.u.isEnabled()) {
            this.u.setElevation(this.n);
            if (this.u.isPressed()) {
                this.u.setTranslationZ(this.p);
            } else if (this.u.isFocused() || this.u.isHovered()) {
                this.u.setTranslationZ(this.o);
            } else {
                this.u.setTranslationZ(0.0f);
            }
        } else {
            this.u.setElevation(0.0f);
            this.u.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.l
    public void j() {
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.l
    public boolean q() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.l
    public f k() {
        return new g();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.l
    public GradientDrawable l() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.design.widget.l
    public void a(Rect rect) {
        if (this.v.b()) {
            float radius = this.v.a();
            float maxShadowSize = c() + this.p;
            int hPadding = (int) Math.ceil((double) r.a(maxShadowSize, radius, false));
            int vPadding = (int) Math.ceil((double) r.b(maxShadowSize, radius, false));
            rect.set(hPadding, vPadding, hPadding, vPadding);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    static class a extends GradientDrawable {
        a() {
        }

        public boolean isStateful() {
            return true;
        }
    }
}
