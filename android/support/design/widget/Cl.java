package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.p۰۴۳v4.view.Cu;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cc;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Cg;

/* access modifiers changed from: package-private */
/* renamed from: android.support.design.widget.l  reason: invalid class name */
public class Cl {

    /* renamed from: B  reason: contains not printable characters */
    static final TimeInterpolator f۹۹۳۲B = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۳c;

    /* renamed from: C  reason: contains not printable characters */
    static final int[] f۹۹۳۳C = {16842919, 16842910};

    /* renamed from: D  reason: contains not printable characters */
    static final int[] f۹۹۳۴D = {16843623, 16842908, 16842910};

    /* renamed from: E  reason: contains not printable characters */
    static final int[] f۹۹۳۵E = {16842908, 16842910};

    /* renamed from: F  reason: contains not printable characters */
    static final int[] f۹۹۳۶F = {16843623, 16842910};

    /* renamed from: G  reason: contains not printable characters */
    static final int[] f۹۹۳۷G = {16842910};

    /* renamed from: H  reason: contains not printable characters */
    static final int[] f۹۹۳۸H = new int[0];

    /* renamed from: A  reason: contains not printable characters */
    private ViewTreeObserver.OnPreDrawListener f۹۹۳۹A;

    /* renamed from: a  reason: contains not printable characters */
    int f۹۹۴۰a = 0;

    /* renamed from: b  reason: contains not printable characters */
    Animator f۹۹۴۱b;

    /* renamed from: c  reason: contains not printable characters */
    p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch f۹۹۴۲c;

    /* renamed from: d  reason: contains not printable characters */
    p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch f۹۹۴۳d;

    /* renamed from: e  reason: contains not printable characters */
    private p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch f۹۹۴۴e;

    /* renamed from: f  reason: contains not printable characters */
    private p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch f۹۹۴۵f;

    /* renamed from: g  reason: contains not printable characters */
    private final Cu f۹۹۴۶g;

    /* renamed from: h  reason: contains not printable characters */
    Cr f۹۹۴۷h;

    /* renamed from: i  reason: contains not printable characters */
    private float f۹۹۴۸i;

    /* renamed from: j  reason: contains not printable characters */
    Drawable f۹۹۴۹j;

    /* renamed from: k  reason: contains not printable characters */
    Drawable f۹۹۵۰k;

    /* renamed from: l  reason: contains not printable characters */
    Cf f۹۹۵۱l;

    /* renamed from: m  reason: contains not printable characters */
    Drawable f۹۹۵۲m;

    /* renamed from: n  reason: contains not printable characters */
    float f۹۹۵۳n;

    /* renamed from: o  reason: contains not printable characters */
    float f۹۹۵۴o;

    /* renamed from: p  reason: contains not printable characters */
    float f۹۹۵۵p;

    /* renamed from: q  reason: contains not printable characters */
    int f۹۹۵۶q;

    /* renamed from: r  reason: contains not printable characters */
    float f۹۹۵۷r = 1.0f;

    /* renamed from: s  reason: contains not printable characters */
    private ArrayList<Animator.AnimatorListener> f۹۹۵۸s;

    /* renamed from: t  reason: contains not printable characters */
    private ArrayList<Animator.AnimatorListener> f۹۹۵۹t;

    /* renamed from: u  reason: contains not printable characters */
    final Ca0 f۹۹۶۰u;

    /* renamed from: v  reason: contains not printable characters */
    final AbstractCs f۹۹۶۱v;

    /* renamed from: w  reason: contains not printable characters */
    private final Rect f۹۹۶۲w = new Rect();

    /* renamed from: x  reason: contains not printable characters */
    private final RectF f۹۹۶۳x = new RectF();

    /* renamed from: y  reason: contains not printable characters */
    private final RectF f۹۹۶۴y = new RectF();

    /* renamed from: z  reason: contains not printable characters */
    private final Matrix f۹۹۶۵z = new Matrix();

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.l$g  reason: invalid class name */
    public interface AbstractCg {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۱۹۲۱a();

        /* renamed from: b  reason: contains not printable characters */
        void m۱۱۹۲۲b();
    }

    Cl(Ca0 view, AbstractCs shadowViewDelegate) {
        this.f۹۹۶۰u = view;
        this.f۹۹۶۱v = shadowViewDelegate;
        this.f۹۹۴۶g = new Cu();
        this.f۹۹۴۶g.m۱۲۰۳۰a(f۹۹۳۳C, m۱۱۸۷۰a((AbstractCi) new Cf()));
        this.f۹۹۴۶g.m۱۲۰۳۰a(f۹۹۳۴D, m۱۱۸۷۰a((AbstractCi) new Ce()));
        this.f۹۹۴۶g.m۱۲۰۳۰a(f۹۹۳۵E, m۱۱۸۷۰a((AbstractCi) new Ce()));
        this.f۹۹۴۶g.m۱۲۰۳۰a(f۹۹۳۶F, m۱۱۸۷۰a((AbstractCi) new Ce()));
        this.f۹۹۴۶g.m۱۲۰۳۰a(f۹۹۳۷G, m۱۱۸۷۰a((AbstractCi) new Ch()));
        this.f۹۹۴۶g.m۱۲۰۳۰a(f۹۹۳۸H, m۱۱۸۷۰a((AbstractCi) new Cd(this)));
        this.f۹۹۴۸i = this.f۹۹۶۰u.getRotation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۸۵a(ColorStateList backgroundTint, PorterDuff.Mode backgroundTintMode, ColorStateList rippleColor, int borderWidth) {
        Drawable[] layers;
        this.f۹۹۴۹j = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(m۱۱۸۷۷a());
        android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(this.f۹۹۴۹j, backgroundTint);
        if (backgroundTintMode != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(this.f۹۹۴۹j, backgroundTintMode);
        }
        this.f۹۹۵۰k = android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۲۲h(m۱۱۸۷۷a());
        android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(this.f۹۹۵۰k, p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۵q.Ca.m۱۰۰۳۴a(rippleColor));
        if (borderWidth > 0) {
            this.f۹۹۵۱l = m۱۱۸۷۸a(borderWidth, backgroundTint);
            layers = new Drawable[]{this.f۹۹۵۱l, this.f۹۹۴۹j, this.f۹۹۵۰k};
        } else {
            this.f۹۹۵۱l = null;
            layers = new Drawable[]{this.f۹۹۴۹j, this.f۹۹۵۰k};
        }
        this.f۹۹۵۲m = new LayerDrawable(layers);
        Context context = this.f۹۹۶۰u.getContext();
        Drawable drawable = this.f۹۹۵۲m;
        float a = this.f۹۹۶۱v.m۱۲۰۱۳a();
        float f = this.f۹۹۵۳n;
        this.f۹۹۴۷h = new Cr(context, drawable, a, f, f + this.f۹۹۵۵p);
        this.f۹۹۴۷h.m۱۲۰۱۰a(false);
        this.f۹۹۶۱v.m۱۲۰۱۵a(this.f۹۹۴۷h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۸۴a(ColorStateList tint) {
        Drawable drawable = this.f۹۹۴۹j;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(drawable, tint);
        }
        Cf fVar = this.f۹۹۵۱l;
        if (fVar != null) {
            fVar.m۱۱۸۱۳a(tint);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۸۶a(PorterDuff.Mode tintMode) {
        Drawable drawable = this.f۹۹۴۹j;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۱a(drawable, tintMode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۸۹۴b(ColorStateList rippleColor) {
        Drawable drawable = this.f۹۹۵۰k;
        if (drawable != null) {
            android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۸a(drawable, p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۵q.Ca.m۱۰۰۳۴a(rippleColor));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۱۸۷۹a(float elevation) {
        if (this.f۹۹۵۳n != elevation) {
            this.f۹۹۵۳n = elevation;
            m۱۱۸۸۰a(this.f۹۹۵۳n, this.f۹۹۵۴o, this.f۹۹۵۵p);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public float m۱۱۸۹۷c() {
        return this.f۹۹۵۳n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public float m۱۱۹۰۳e() {
        return this.f۹۹۵۴o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public float m۱۱۹۰۴f() {
        return this.f۹۹۵۵p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public final void m۱۱۸۹۱b(float translationZ) {
        if (this.f۹۹۵۴o != translationZ) {
            this.f۹۹۵۴o = translationZ;
            m۱۱۸۸۰a(this.f۹۹۵۳n, this.f۹۹۵۴o, this.f۹۹۵۵p);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public final void m۱۱۹۰۱d(float translationZ) {
        if (this.f۹۹۵۵p != translationZ) {
            this.f۹۹۵۵p = translationZ;
            m۱۱۸۸۰a(this.f۹۹۵۳n, this.f۹۹۵۴o, this.f۹۹۵۵p);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۱۸۸۱a(int maxImageSize) {
        if (this.f۹۹۵۶q != maxImageSize) {
            this.f۹۹۵۶q = maxImageSize;
            m۱۱۹۱۶r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r  reason: contains not printable characters */
    public final void m۱۱۹۱۶r() {
        m۱۱۸۹۸c(this.f۹۹۵۷r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public final void m۱۱۸۹۸c(float scale) {
        this.f۹۹۵۷r = scale;
        Matrix matrix = this.f۹۹۶۵z;
        m۱۱۸۷۱a(scale, matrix);
        this.f۹۹۶۰u.setImageMatrix(matrix);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۸۷۱a(float scale, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f۹۹۶۰u.getDrawable();
        if (drawable != null && this.f۹۹۵۶q != 0) {
            RectF drawableBounds = this.f۹۹۶۳x;
            RectF imageBounds = this.f۹۹۶۴y;
            drawableBounds.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f۹۹۵۶q;
            imageBounds.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(drawableBounds, imageBounds, Matrix.ScaleToFit.CENTER);
            int i2 = this.f۹۹۵۶q;
            matrix.postScale(scale, scale, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public final p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch m۱۱۹۰۵g() {
        return this.f۹۹۴۲c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public final void m۱۱۸۹۲b(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch spec) {
        this.f۹۹۴۲c = spec;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public final p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch m۱۱۹۰۰d() {
        return this.f۹۹۴۳d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۱۸۸۲a(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch spec) {
        this.f۹۹۴۳d = spec;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۸۰a(float elevation, float hoveredFocusedTranslationZ, float pressedTranslationZ) {
        Cr rVar = this.f۹۹۴۷h;
        if (rVar != null) {
            rVar.m۱۲۰۰۹a(elevation, this.f۹۹۵۵p + elevation);
            m۱۱۹۱۷s();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۸۹a(int[] state) {
        this.f۹۹۴۶g.m۱۲۰۲۹a(state);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j  reason: contains not printable characters */
    public void m۱۱۹۰۸j() {
        this.f۹۹۴۶g.m۱۲۰۲۸a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۸۹۳b(Animator.AnimatorListener listener) {
        if (this.f۹۹۵۸s == null) {
            this.f۹۹۵۸s = new ArrayList<>();
        }
        this.f۹۹۵۸s.add(listener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۱۹۰۲d(Animator.AnimatorListener listener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f۹۹۵۸s;
        if (arrayList != null) {
            arrayList.remove(listener);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۸۳a(Animator.AnimatorListener listener) {
        if (this.f۹۹۵۹t == null) {
            this.f۹۹۵۹t = new ArrayList<>();
        }
        this.f۹۹۵۹t.add(listener);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۸۹۹c(Animator.AnimatorListener listener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f۹۹۵۹t;
        if (arrayList != null) {
            arrayList.remove(listener);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۸۸a(AbstractCg listener, boolean fromUser) {
        if (!m۱۱۹۰۶h()) {
            Animator animator = this.f۹۹۴۱b;
            if (animator != null) {
                animator.cancel();
            }
            if (m۱۱۸۷۵w()) {
                p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch hVar = this.f۹۹۴۳d;
                if (hVar == null) {
                    hVar = m۱۱۸۷۳u();
                }
                AnimatorSet set = m۱۱۸۶۹a(hVar, 0.0f, 0.0f, 0.0f);
                set.addListener(new Ca(fromUser, listener));
                ArrayList<Animator.AnimatorListener> arrayList = this.f۹۹۵۹t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        set.addListener(it.next());
                    }
                }
                set.start();
                return;
            }
            this.f۹۹۶۰u.m۱۱۸۰۰a(fromUser ? 8 : 4, fromUser);
            if (listener != null) {
                listener.m۱۱۹۲۲b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.l$a  reason: invalid class name */
    public class Ca extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        private boolean f۹۹۶۶a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ boolean f۹۹۶۷b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ AbstractCg f۹۹۶۸c;

        Ca(boolean z, AbstractCg gVar) {
            this.f۹۹۶۷b = z;
            this.f۹۹۶۸c = gVar;
        }

        public void onAnimationStart(Animator animation) {
            Cl.this.f۹۹۶۰u.m۱۱۸۰۰a(0, this.f۹۹۶۷b);
            Cl lVar = Cl.this;
            lVar.f۹۹۴۰a = 1;
            lVar.f۹۹۴۱b = animation;
            this.f۹۹۶۶a = false;
        }

        public void onAnimationCancel(Animator animation) {
            this.f۹۹۶۶a = true;
        }

        public void onAnimationEnd(Animator animation) {
            Cl lVar = Cl.this;
            lVar.f۹۹۴۰a = 0;
            lVar.f۹۹۴۱b = null;
            if (!this.f۹۹۶۶a) {
                lVar.f۹۹۶۰u.m۱۱۸۰۰a(this.f۹۹۶۷b ? 8 : 4, this.f۹۹۶۷b);
                AbstractCg gVar = this.f۹۹۶۸c;
                if (gVar != null) {
                    gVar.m۱۱۹۲۲b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۸۹۶b(AbstractCg listener, boolean fromUser) {
        if (!m۱۱۹۰۷i()) {
            Animator animator = this.f۹۹۴۱b;
            if (animator != null) {
                animator.cancel();
            }
            if (m۱۱۸۷۵w()) {
                if (this.f۹۹۶۰u.getVisibility() != 0) {
                    this.f۹۹۶۰u.setAlpha(0.0f);
                    this.f۹۹۶۰u.setScaleY(0.0f);
                    this.f۹۹۶۰u.setScaleX(0.0f);
                    m۱۱۸۹۸c(0.0f);
                }
                p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch hVar = this.f۹۹۴۲c;
                if (hVar == null) {
                    hVar = m۱۱۸۷۴v();
                }
                AnimatorSet set = m۱۱۸۶۹a(hVar, 1.0f, 1.0f, 1.0f);
                set.addListener(new Cb(fromUser, listener));
                ArrayList<Animator.AnimatorListener> arrayList = this.f۹۹۵۸s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        set.addListener(it.next());
                    }
                }
                set.start();
                return;
            }
            this.f۹۹۶۰u.m۱۱۸۰۰a(0, fromUser);
            this.f۹۹۶۰u.setAlpha(1.0f);
            this.f۹۹۶۰u.setScaleY(1.0f);
            this.f۹۹۶۰u.setScaleX(1.0f);
            m۱۱۸۹۸c(1.0f);
            if (listener != null) {
                listener.m۱۱۹۲۱a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.l$b  reason: invalid class name */
    public class Cb extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ boolean f۹۹۷۰a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ AbstractCg f۹۹۷۱b;

        Cb(boolean z, AbstractCg gVar) {
            this.f۹۹۷۰a = z;
            this.f۹۹۷۱b = gVar;
        }

        public void onAnimationStart(Animator animation) {
            Cl.this.f۹۹۶۰u.m۱۱۸۰۰a(0, this.f۹۹۷۰a);
            Cl lVar = Cl.this;
            lVar.f۹۹۴۰a = 2;
            lVar.f۹۹۴۱b = animation;
        }

        public void onAnimationEnd(Animator animation) {
            Cl lVar = Cl.this;
            lVar.f۹۹۴۰a = 0;
            lVar.f۹۹۴۱b = null;
            AbstractCg gVar = this.f۹۹۷۱b;
            if (gVar != null) {
                gVar.m۱۱۹۲۱a();
            }
        }
    }

    /* renamed from: v  reason: contains not printable characters */
    private p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch m۱۱۸۷۴v() {
        if (this.f۹۹۴۴e == null) {
            this.f۹۹۴۴e = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch.m۹۹۵۵a(this.f۹۹۶۰u.getContext(), p۰۰۰a.p۰۰۵b.p۰۰۸c.Ca.design_fab_show_motion_spec);
        }
        return this.f۹۹۴۴e;
    }

    /* renamed from: u  reason: contains not printable characters */
    private p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch m۱۱۸۷۳u() {
        if (this.f۹۹۴۵f == null) {
            this.f۹۹۴۵f = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch.m۹۹۵۵a(this.f۹۹۶۰u.getContext(), p۰۰۰a.p۰۰۵b.p۰۰۸c.Ca.design_fab_hide_motion_spec);
        }
        return this.f۹۹۴۵f;
    }

    /* renamed from: a  reason: contains not printable characters */
    private AnimatorSet m۱۱۸۶۹a(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch spec, float opacity, float scale, float iconScale) {
        List<Animator> animators = new ArrayList<>();
        Animator animator = ObjectAnimator.ofFloat(this.f۹۹۶۰u, View.ALPHA, opacity);
        spec.m۹۹۶۰a("opacity").m۹۹۶۶a(animator);
        animators.add(animator);
        Animator animator2 = ObjectAnimator.ofFloat(this.f۹۹۶۰u, View.SCALE_X, scale);
        spec.m۹۹۶۰a("scale").m۹۹۶۶a(animator2);
        animators.add(animator2);
        Animator animator3 = ObjectAnimator.ofFloat(this.f۹۹۶۰u, View.SCALE_Y, scale);
        spec.m۹۹۶۰a("scale").m۹۹۶۶a(animator3);
        animators.add(animator3);
        m۱۱۸۷۱a(iconScale, this.f۹۹۶۵z);
        Animator animator4 = ObjectAnimator.ofObject(this.f۹۹۶۰u, new p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Cf(), new Cg(), new Matrix(this.f۹۹۶۵z));
        spec.m۹۹۶۰a("iconScale").m۹۹۶۶a(animator4);
        animators.add(animator4);
        AnimatorSet set = new AnimatorSet();
        p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Cb.m۹۹۴۵a(set, animators);
        return set;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public final Drawable m۱۱۸۹۰b() {
        return this.f۹۹۵۲m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n  reason: contains not printable characters */
    public void m۱۱۹۱۲n() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s  reason: contains not printable characters */
    public final void m۱۱۹۱۷s() {
        Rect rect = this.f۹۹۶۲w;
        m۱۱۸۸۷a(rect);
        m۱۱۸۹۵b(rect);
        this.f۹۹۶۱v.m۱۲۰۱۴a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۸۸۷a(Rect rect) {
        this.f۹۹۴۷h.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۸۹۵b(Rect padding) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m  reason: contains not printable characters */
    public void m۱۱۹۱۱m() {
        if (m۱۱۹۱۵q()) {
            m۱۱۸۷۲t();
            this.f۹۹۶۰u.getViewTreeObserver().addOnPreDrawListener(this.f۹۹۳۹A);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o  reason: contains not printable characters */
    public void m۱۱۹۱۳o() {
        if (this.f۹۹۳۹A != null) {
            this.f۹۹۶۰u.getViewTreeObserver().removeOnPreDrawListener(this.f۹۹۳۹A);
            this.f۹۹۳۹A = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q  reason: contains not printable characters */
    public boolean m۱۱۹۱۵q() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cf m۱۱۸۷۸a(int borderWidth, ColorStateList backgroundTint) {
        Context context = this.f۹۹۶۰u.getContext();
        Cf borderDrawable = m۱۱۹۰۹k();
        borderDrawable.m۱۱۸۱۲a(android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.design_fab_stroke_top_outer_color), android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.design_fab_stroke_top_inner_color), android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.design_fab_stroke_end_inner_color), android.support.p۰۴۳v4.content.Ca.m۱۲۶۲۰a(context, Cc.design_fab_stroke_end_outer_color));
        borderDrawable.m۱۱۸۱۱a((float) borderWidth);
        borderDrawable.m۱۱۸۱۳a(backgroundTint);
        return borderDrawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k  reason: contains not printable characters */
    public Cf m۱۱۹۰۹k() {
        return new Cf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p  reason: contains not printable characters */
    public void m۱۱۹۱۴p() {
        float rotation = this.f۹۹۶۰u.getRotation();
        if (this.f۹۹۴۸i != rotation) {
            this.f۹۹۴۸i = rotation;
            m۱۱۸۷۶x();
        }
    }

    /* renamed from: t  reason: contains not printable characters */
    private void m۱۱۸۷۲t() {
        if (this.f۹۹۳۹A == null) {
            this.f۹۹۳۹A = new ViewTreeObserver$OnPreDrawListenerCc();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.l$c  reason: invalid class name */
    public class ViewTreeObserver$OnPreDrawListenerCc implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerCc() {
        }

        public boolean onPreDraw() {
            Cl.this.m۱۱۹۱۴p();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public GradientDrawable m۱۱۸۷۷a() {
        GradientDrawable d = m۱۱۹۱۰l();
        d.setShape(1);
        d.setColor(-1);
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l  reason: contains not printable characters */
    public GradientDrawable m۱۱۹۱۰l() {
        return new GradientDrawable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۱۹۰۷i() {
        if (this.f۹۹۶۰u.getVisibility() != 0) {
            if (this.f۹۹۴۰a == 2) {
                return true;
            }
            return false;
        } else if (this.f۹۹۴۰a != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public boolean m۱۱۹۰۶h() {
        if (this.f۹۹۶۰u.getVisibility() == 0) {
            if (this.f۹۹۴۰a == 1) {
                return true;
            }
            return false;
        } else if (this.f۹۹۴۰a != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private ValueAnimator m۱۱۸۷۰a(AbstractCi impl) {
        ValueAnimator animator = new ValueAnimator();
        animator.setInterpolator(f۹۹۳۲B);
        animator.setDuration(100L);
        animator.addListener(impl);
        animator.addUpdateListener(impl);
        animator.setFloatValues(0.0f, 1.0f);
        return animator;
    }

    /* renamed from: android.support.design.widget.l$i  reason: invalid class name */
    private abstract class AbstractCi extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        private boolean f۹۹۷۷a;

        /* renamed from: b  reason: contains not printable characters */
        private float f۹۹۷۸b;

        /* renamed from: c  reason: contains not printable characters */
        private float f۹۹۷۹c;

        /* access modifiers changed from: protected */
        /* renamed from: a  reason: contains not printable characters */
        public abstract float m۱۱۹۲۴a();

        private AbstractCi() {
        }

        /* synthetic */ AbstractCi(Cl x0, Ca x1) {
            this();
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            if (!this.f۹۹۷۷a) {
                this.f۹۹۷۸b = Cl.this.f۹۹۴۷h.m۱۲۰۱۱b();
                this.f۹۹۷۹c = m۱۱۹۲۴a();
                this.f۹۹۷۷a = true;
            }
            Cr rVar = Cl.this.f۹۹۴۷h;
            float f = this.f۹۹۷۸b;
            rVar.m۱۲۰۱۲b(f + ((this.f۹۹۷۹c - f) * animator.getAnimatedFraction()));
        }

        public void onAnimationEnd(Animator animator) {
            Cl.this.f۹۹۴۷h.m۱۲۰۱۲b(this.f۹۹۷۹c);
            this.f۹۹۷۷a = false;
        }
    }

    /* renamed from: android.support.design.widget.l$h  reason: invalid class name */
    private class Ch extends AbstractCi {
        Ch() {
            super(Cl.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.widget.Cl.AbstractCi
        /* renamed from: a  reason: contains not printable characters */
        public float m۱۱۹۲۳a() {
            return Cl.this.f۹۹۵۳n;
        }
    }

    /* renamed from: android.support.design.widget.l$e  reason: invalid class name */
    private class Ce extends AbstractCi {
        Ce() {
            super(Cl.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.widget.Cl.AbstractCi
        /* renamed from: a  reason: contains not printable characters */
        public float m۱۱۹۱۹a() {
            Cl lVar = Cl.this;
            return lVar.f۹۹۵۳n + lVar.f۹۹۵۴o;
        }
    }

    /* renamed from: android.support.design.widget.l$f  reason: invalid class name */
    private class Cf extends AbstractCi {
        Cf() {
            super(Cl.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.widget.Cl.AbstractCi
        /* renamed from: a  reason: contains not printable characters */
        public float m۱۱۹۲۰a() {
            Cl lVar = Cl.this;
            return lVar.f۹۹۵۳n + lVar.f۹۹۵۵p;
        }
    }

    /* renamed from: android.support.design.widget.l$d  reason: invalid class name */
    private class Cd extends AbstractCi {
        Cd(Cl lVar) {
            super(lVar, null);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.widget.Cl.AbstractCi
        /* renamed from: a  reason: contains not printable characters */
        public float m۱۱۹۱۸a() {
            return 0.0f;
        }
    }

    /* renamed from: w  reason: contains not printable characters */
    private boolean m۱۱۸۷۵w() {
        return Cu.m۱۳۰۲۸y(this.f۹۹۶۰u) && !this.f۹۹۶۰u.isInEditMode();
    }

    /* renamed from: x  reason: contains not printable characters */
    private void m۱۱۸۷۶x() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f۹۹۴۸i % 90.0f != 0.0f) {
                if (this.f۹۹۶۰u.getLayerType() != 1) {
                    this.f۹۹۶۰u.setLayerType(1, null);
                }
            } else if (this.f۹۹۶۰u.getLayerType() != 0) {
                this.f۹۹۶۰u.setLayerType(0, null);
            }
        }
        Cr rVar = this.f۹۹۴۷h;
        if (rVar != null) {
            rVar.m۱۲۰۰۸a(-this.f۹۹۴۸i);
        }
        Cf fVar = this.f۹۹۵۱l;
        if (fVar != null) {
            fVar.m۱۱۸۱۴b(-this.f۹۹۴۸i);
        }
    }
}
