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
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public class l {
    static final TimeInterpolator B = a.b.c.l.a.f۲۴c;
    static final int[] C = {16842919, 16842910};
    static final int[] D = {16843623, 16842908, 16842910};
    static final int[] E = {16842908, 16842910};
    static final int[] F = {16843623, 16842910};
    static final int[] G = {16842910};
    static final int[] H = new int[0];
    private ViewTreeObserver.OnPreDrawListener A;

    /* renamed from: a  reason: collision with root package name */
    int f۹۵۶a = 0;

    /* renamed from: b  reason: collision with root package name */
    Animator f۹۵۷b;

    /* renamed from: c  reason: collision with root package name */
    a.b.c.l.h f۹۵۸c;

    /* renamed from: d  reason: collision with root package name */
    a.b.c.l.h f۹۵۹d;

    /* renamed from: e  reason: collision with root package name */
    private a.b.c.l.h f۹۶۰e;

    /* renamed from: f  reason: collision with root package name */
    private a.b.c.l.h f۹۶۱f;

    /* renamed from: g  reason: collision with root package name */
    private final u f۹۶۲g;

    /* renamed from: h  reason: collision with root package name */
    r f۹۶۳h;
    private float i;
    Drawable j;
    Drawable k;
    f l;
    Drawable m;
    float n;
    float o;
    float p;
    int q;
    float r = 1.0f;
    private ArrayList<Animator.AnimatorListener> s;
    private ArrayList<Animator.AnimatorListener> t;
    final a0 u;
    final s v;
    private final Rect w = new Rect();
    private final RectF x = new RectF();
    private final RectF y = new RectF();
    private final Matrix z = new Matrix();

    /* access modifiers changed from: package-private */
    public interface g {
        void a();

        void b();
    }

    l(a0 view, s shadowViewDelegate) {
        this.u = view;
        this.v = shadowViewDelegate;
        this.f۹۶۲g = new u();
        this.f۹۶۲g.a(C, a((i) new f()));
        this.f۹۶۲g.a(D, a((i) new e()));
        this.f۹۶۲g.a(E, a((i) new e()));
        this.f۹۶۲g.a(F, a((i) new e()));
        this.f۹۶۲g.a(G, a((i) new h()));
        this.f۹۶۲g.a(H, a((i) new d(this)));
        this.i = this.u.getRotation();
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList backgroundTint, PorterDuff.Mode backgroundTintMode, ColorStateList rippleColor, int borderWidth) {
        Drawable[] layers;
        this.j = android.support.v4.graphics.drawable.a.h(a());
        android.support.v4.graphics.drawable.a.a(this.j, backgroundTint);
        if (backgroundTintMode != null) {
            android.support.v4.graphics.drawable.a.a(this.j, backgroundTintMode);
        }
        this.k = android.support.v4.graphics.drawable.a.h(a());
        android.support.v4.graphics.drawable.a.a(this.k, a.b.c.q.a.a(rippleColor));
        if (borderWidth > 0) {
            this.l = a(borderWidth, backgroundTint);
            layers = new Drawable[]{this.l, this.j, this.k};
        } else {
            this.l = null;
            layers = new Drawable[]{this.j, this.k};
        }
        this.m = new LayerDrawable(layers);
        Context context = this.u.getContext();
        Drawable drawable = this.m;
        float a2 = this.v.a();
        float f2 = this.n;
        this.f۹۶۳h = new r(context, drawable, a2, f2, f2 + this.p);
        this.f۹۶۳h.a(false);
        this.v.a(this.f۹۶۳h);
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList tint) {
        Drawable drawable = this.j;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, tint);
        }
        f fVar = this.l;
        if (fVar != null) {
            fVar.a(tint);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode tintMode) {
        Drawable drawable = this.j;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, tintMode);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(ColorStateList rippleColor) {
        Drawable drawable = this.k;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, a.b.c.q.a.a(rippleColor));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(float elevation) {
        if (this.n != elevation) {
            this.n = elevation;
            a(this.n, this.o, this.p);
        }
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public final void b(float translationZ) {
        if (this.o != translationZ) {
            this.o = translationZ;
            a(this.n, this.o, this.p);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(float translationZ) {
        if (this.p != translationZ) {
            this.p = translationZ;
            a(this.n, this.o, this.p);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int maxImageSize) {
        if (this.q != maxImageSize) {
            this.q = maxImageSize;
            r();
        }
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        c(this.r);
    }

    /* access modifiers changed from: package-private */
    public final void c(float scale) {
        this.r = scale;
        Matrix matrix = this.z;
        a(scale, matrix);
        this.u.setImageMatrix(matrix);
    }

    private void a(float scale, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.u.getDrawable();
        if (drawable != null && this.q != 0) {
            RectF drawableBounds = this.x;
            RectF imageBounds = this.y;
            drawableBounds.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.q;
            imageBounds.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(drawableBounds, imageBounds, Matrix.ScaleToFit.CENTER);
            int i3 = this.q;
            matrix.postScale(scale, scale, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    /* access modifiers changed from: package-private */
    public final a.b.c.l.h g() {
        return this.f۹۵۸c;
    }

    /* access modifiers changed from: package-private */
    public final void b(a.b.c.l.h spec) {
        this.f۹۵۸c = spec;
    }

    /* access modifiers changed from: package-private */
    public final a.b.c.l.h d() {
        return this.f۹۵۹d;
    }

    /* access modifiers changed from: package-private */
    public final void a(a.b.c.l.h spec) {
        this.f۹۵۹d = spec;
    }

    /* access modifiers changed from: package-private */
    public void a(float elevation, float hoveredFocusedTranslationZ, float pressedTranslationZ) {
        r rVar = this.f۹۶۳h;
        if (rVar != null) {
            rVar.a(elevation, this.p + elevation);
            s();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int[] state) {
        this.f۹۶۲g.a(state);
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f۹۶۲g.a();
    }

    /* access modifiers changed from: package-private */
    public void b(Animator.AnimatorListener listener) {
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(listener);
    }

    /* access modifiers changed from: package-private */
    public void d(Animator.AnimatorListener listener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.s;
        if (arrayList != null) {
            arrayList.remove(listener);
        }
    }

    public void a(Animator.AnimatorListener listener) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(listener);
    }

    public void c(Animator.AnimatorListener listener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.t;
        if (arrayList != null) {
            arrayList.remove(listener);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(g listener, boolean fromUser) {
        if (!h()) {
            Animator animator = this.f۹۵۷b;
            if (animator != null) {
                animator.cancel();
            }
            if (w()) {
                a.b.c.l.h hVar = this.f۹۵۹d;
                if (hVar == null) {
                    hVar = u();
                }
                AnimatorSet set = a(hVar, 0.0f, 0.0f, 0.0f);
                set.addListener(new a(fromUser, listener));
                ArrayList<Animator.AnimatorListener> arrayList = this.t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        set.addListener(it.next());
                    }
                }
                set.start();
                return;
            }
            this.u.a(fromUser ? 8 : 4, fromUser);
            if (listener != null) {
                listener.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f۹۶۴a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f۹۶۵b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f۹۶۶c;

        a(boolean z, g gVar) {
            this.f۹۶۵b = z;
            this.f۹۶۶c = gVar;
        }

        public void onAnimationStart(Animator animation) {
            l.this.u.a(0, this.f۹۶۵b);
            l lVar = l.this;
            lVar.f۹۵۶a = 1;
            lVar.f۹۵۷b = animation;
            this.f۹۶۴a = false;
        }

        public void onAnimationCancel(Animator animation) {
            this.f۹۶۴a = true;
        }

        public void onAnimationEnd(Animator animation) {
            l lVar = l.this;
            lVar.f۹۵۶a = 0;
            lVar.f۹۵۷b = null;
            if (!this.f۹۶۴a) {
                lVar.u.a(this.f۹۶۵b ? 8 : 4, this.f۹۶۵b);
                g gVar = this.f۹۶۶c;
                if (gVar != null) {
                    gVar.b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(g listener, boolean fromUser) {
        if (!i()) {
            Animator animator = this.f۹۵۷b;
            if (animator != null) {
                animator.cancel();
            }
            if (w()) {
                if (this.u.getVisibility() != 0) {
                    this.u.setAlpha(0.0f);
                    this.u.setScaleY(0.0f);
                    this.u.setScaleX(0.0f);
                    c(0.0f);
                }
                a.b.c.l.h hVar = this.f۹۵۸c;
                if (hVar == null) {
                    hVar = v();
                }
                AnimatorSet set = a(hVar, 1.0f, 1.0f, 1.0f);
                set.addListener(new b(fromUser, listener));
                ArrayList<Animator.AnimatorListener> arrayList = this.s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        set.addListener(it.next());
                    }
                }
                set.start();
                return;
            }
            this.u.a(0, fromUser);
            this.u.setAlpha(1.0f);
            this.u.setScaleY(1.0f);
            this.u.setScaleX(1.0f);
            c(1.0f);
            if (listener != null) {
                listener.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f۹۶۸a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f۹۶۹b;

        b(boolean z, g gVar) {
            this.f۹۶۸a = z;
            this.f۹۶۹b = gVar;
        }

        public void onAnimationStart(Animator animation) {
            l.this.u.a(0, this.f۹۶۸a);
            l lVar = l.this;
            lVar.f۹۵۶a = 2;
            lVar.f۹۵۷b = animation;
        }

        public void onAnimationEnd(Animator animation) {
            l lVar = l.this;
            lVar.f۹۵۶a = 0;
            lVar.f۹۵۷b = null;
            g gVar = this.f۹۶۹b;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    private a.b.c.l.h v() {
        if (this.f۹۶۰e == null) {
            this.f۹۶۰e = a.b.c.l.h.a(this.u.getContext(), a.b.c.a.design_fab_show_motion_spec);
        }
        return this.f۹۶۰e;
    }

    private a.b.c.l.h u() {
        if (this.f۹۶۱f == null) {
            this.f۹۶۱f = a.b.c.l.h.a(this.u.getContext(), a.b.c.a.design_fab_hide_motion_spec);
        }
        return this.f۹۶۱f;
    }

    private AnimatorSet a(a.b.c.l.h spec, float opacity, float scale, float iconScale) {
        List<Animator> animators = new ArrayList<>();
        Animator animator = ObjectAnimator.ofFloat(this.u, View.ALPHA, opacity);
        spec.a("opacity").a(animator);
        animators.add(animator);
        Animator animator2 = ObjectAnimator.ofFloat(this.u, View.SCALE_X, scale);
        spec.a("scale").a(animator2);
        animators.add(animator2);
        Animator animator3 = ObjectAnimator.ofFloat(this.u, View.SCALE_Y, scale);
        spec.a("scale").a(animator3);
        animators.add(animator3);
        a(iconScale, this.z);
        Animator animator4 = ObjectAnimator.ofObject(this.u, new a.b.c.l.f(), new a.b.c.l.g(), new Matrix(this.z));
        spec.a("iconScale").a(animator4);
        animators.add(animator4);
        AnimatorSet set = new AnimatorSet();
        a.b.c.l.b.a(set, animators);
        return set;
    }

    /* access modifiers changed from: package-private */
    public final Drawable b() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public void n() {
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        Rect rect = this.w;
        a(rect);
        b(rect);
        this.v.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    public void a(Rect rect) {
        this.f۹۶۳h.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public void b(Rect padding) {
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (q()) {
            t();
            this.u.getViewTreeObserver().addOnPreDrawListener(this.A);
        }
    }

    /* access modifiers changed from: package-private */
    public void o() {
        if (this.A != null) {
            this.u.getViewTreeObserver().removeOnPreDrawListener(this.A);
            this.A = null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public f a(int borderWidth, ColorStateList backgroundTint) {
        Context context = this.u.getContext();
        f borderDrawable = k();
        borderDrawable.a(android.support.v4.content.a.a(context, a.b.c.c.design_fab_stroke_top_outer_color), android.support.v4.content.a.a(context, a.b.c.c.design_fab_stroke_top_inner_color), android.support.v4.content.a.a(context, a.b.c.c.design_fab_stroke_end_inner_color), android.support.v4.content.a.a(context, a.b.c.c.design_fab_stroke_end_outer_color));
        borderDrawable.a((float) borderWidth);
        borderDrawable.a(backgroundTint);
        return borderDrawable;
    }

    /* access modifiers changed from: package-private */
    public f k() {
        return new f();
    }

    /* access modifiers changed from: package-private */
    public void p() {
        float rotation = this.u.getRotation();
        if (this.i != rotation) {
            this.i = rotation;
            x();
        }
    }

    private void t() {
        if (this.A == null) {
            this.A = new c();
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements ViewTreeObserver.OnPreDrawListener {
        c() {
        }

        public boolean onPreDraw() {
            l.this.p();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public GradientDrawable a() {
        GradientDrawable d2 = l();
        d2.setShape(1);
        d2.setColor(-1);
        return d2;
    }

    /* access modifiers changed from: package-private */
    public GradientDrawable l() {
        return new GradientDrawable();
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        if (this.u.getVisibility() != 0) {
            if (this.f۹۵۶a == 2) {
                return true;
            }
            return false;
        } else if (this.f۹۵۶a != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        if (this.u.getVisibility() == 0) {
            if (this.f۹۵۶a == 1) {
                return true;
            }
            return false;
        } else if (this.f۹۵۶a != 2) {
            return true;
        } else {
            return false;
        }
    }

    private ValueAnimator a(i impl) {
        ValueAnimator animator = new ValueAnimator();
        animator.setInterpolator(B);
        animator.setDuration(100L);
        animator.addListener(impl);
        animator.addUpdateListener(impl);
        animator.setFloatValues(0.0f, 1.0f);
        return animator;
    }

    private abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f۹۷۵a;

        /* renamed from: b  reason: collision with root package name */
        private float f۹۷۶b;

        /* renamed from: c  reason: collision with root package name */
        private float f۹۷۷c;

        /* access modifiers changed from: protected */
        public abstract float a();

        private i() {
        }

        /* synthetic */ i(l x0, a x1) {
            this();
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            if (!this.f۹۷۵a) {
                this.f۹۷۶b = l.this.f۹۶۳h.b();
                this.f۹۷۷c = a();
                this.f۹۷۵a = true;
            }
            r rVar = l.this.f۹۶۳h;
            float f2 = this.f۹۷۶b;
            rVar.b(f2 + ((this.f۹۷۷c - f2) * animator.getAnimatedFraction()));
        }

        public void onAnimationEnd(Animator animator) {
            l.this.f۹۶۳h.b(this.f۹۷۷c);
            this.f۹۷۵a = false;
        }
    }

    private class h extends i {
        h() {
            super(l.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.widget.l.i
        public float a() {
            return l.this.n;
        }
    }

    private class e extends i {
        e() {
            super(l.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.widget.l.i
        public float a() {
            l lVar = l.this;
            return lVar.n + lVar.o;
        }
    }

    private class f extends i {
        f() {
            super(l.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.widget.l.i
        public float a() {
            l lVar = l.this;
            return lVar.n + lVar.p;
        }
    }

    private class d extends i {
        d(l lVar) {
            super(lVar, null);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.design.widget.l.i
        public float a() {
            return 0.0f;
        }
    }

    private boolean w() {
        return u.y(this.u) && !this.u.isInEditMode();
    }

    private void x() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.i % 90.0f != 0.0f) {
                if (this.u.getLayerType() != 1) {
                    this.u.setLayerType(1, null);
                }
            } else if (this.u.getLayerType() != 0) {
                this.u.setLayerType(0, null);
            }
        }
        r rVar = this.f۹۶۳h;
        if (rVar != null) {
            rVar.a(-this.i);
        }
        f fVar = this.l;
        if (fVar != null) {
            fVar.b(-this.i);
        }
    }
}
