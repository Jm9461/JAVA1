package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Cq;
import android.support.design.widget.FloatingActionButton;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cf;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ci;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Cj;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.AbstractCd;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: contains not printable characters */
    private final Rect f۹۵۲۵c;

    /* renamed from: d  reason: contains not printable characters */
    private final RectF f۹۵۲۶d;

    /* renamed from: e  reason: contains not printable characters */
    private final RectF f۹۵۲۷e;

    /* renamed from: f  reason: contains not printable characters */
    private final int[] f۹۵۲۸f;

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract Ce m۱۱۳۹۱a(Context context, boolean z);

    public FabTransformationBehavior() {
        this.f۹۵۲۵c = new Rect();
        this.f۹۵۲۶d = new RectF();
        this.f۹۵۲۷e = new RectF();
        this.f۹۵۲۸f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f۹۵۲۵c = new Rect();
        this.f۹۵۲۶d = new RectF();
        this.f۹۵۲۷e = new RectF();
        this.f۹۵۲۸f = new int[2];
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۳۹۳a(CoordinatorLayout parent, View child, View dependency) {
        if (child.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(dependency instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) dependency).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == child.getId()) {
                return true;
            }
            return false;
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۳۹۲a(CoordinatorLayout.Cf lp) {
        if (lp.f۹۶۴۳h == 0) {
            lp.f۹۶۴۳h = 80;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.design.transformation.ExpandableTransformationBehavior
    /* renamed from: b  reason: contains not printable characters */
    public AnimatorSet m۱۱۳۹۴b(View dependency, View child, boolean expanded, boolean isAnimating) {
        Ce spec = m۱۱۳۹۱a(child.getContext(), expanded);
        List<Animator> animations = new ArrayList<>();
        List<Animator.AnimatorListener> listeners = new ArrayList<>();
        if (Build.VERSION.SDK_INT >= 21) {
            m۱۱۳۸۸c(dependency, child, expanded, isAnimating, spec, animations, listeners);
        }
        RectF childBounds = this.f۹۵۲۶d;
        m۱۱۳۸۲a(dependency, child, expanded, isAnimating, spec, animations, listeners, childBounds);
        float childWidth = childBounds.width();
        float childHeight = childBounds.height();
        m۱۱۳۹۰d(dependency, child, expanded, isAnimating, spec, animations, listeners);
        m۱۱۳۸۰a(dependency, child, expanded, isAnimating, spec, childWidth, childHeight, animations, listeners);
        m۱۱۳۸۵b(dependency, child, expanded, isAnimating, spec, animations, listeners);
        m۱۱۳۸۱a(dependency, child, expanded, isAnimating, spec, animations, listeners);
        AnimatorSet set = new AnimatorSet();
        p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Cb.m۹۹۴۵a(set, animations);
        set.addListener(new Ca(this, expanded, child, dependency));
        int count = listeners.size();
        for (int i = 0; i < count; i++) {
            set.addListener(listeners.get(i));
        }
        return set;
    }

    /* renamed from: android.support.design.transformation.FabTransformationBehavior$a  reason: invalid class name */
    class Ca extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ boolean f۹۵۲۹a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ View f۹۵۳۰b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۹۵۳۱c;

        Ca(FabTransformationBehavior this$0, boolean z, View view, View view2) {
            this.f۹۵۲۹a = z;
            this.f۹۵۳۰b = view;
            this.f۹۵۳۱c = view2;
        }

        public void onAnimationStart(Animator animation) {
            if (this.f۹۵۲۹a) {
                this.f۹۵۳۰b.setVisibility(0);
                this.f۹۵۳۱c.setAlpha(0.0f);
                this.f۹۵۳۱c.setVisibility(4);
            }
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f۹۵۲۹a) {
                this.f۹۵۳۰b.setVisibility(4);
                this.f۹۵۳۱c.setAlpha(1.0f);
                this.f۹۵۳۱c.setVisibility(0);
            }
        }
    }

    @TargetApi(21)
    /* renamed from: c  reason: contains not printable characters */
    private void m۱۱۳۸۸c(View dependency, View child, boolean expanded, boolean currentlyAnimating, Ce spec, List<Animator> animations, List<Animator.AnimatorListener> list) {
        Animator animator;
        float translationZ = Cu.m۱۳۰۰۸g(child) - Cu.m۱۳۰۰۸g(dependency);
        if (expanded) {
            if (!currentlyAnimating) {
                child.setTranslationZ(-translationZ);
            }
            animator = ObjectAnimator.ofFloat(child, View.TRANSLATION_Z, 0.0f);
        } else {
            animator = ObjectAnimator.ofFloat(child, View.TRANSLATION_Z, -translationZ);
        }
        spec.f۹۵۳۶a.m۹۹۶۰a("elevation").m۹۹۶۶a(animator);
        animations.add(animator);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۳۸۲a(View dependency, View child, boolean expanded, boolean currentlyAnimating, Ce spec, List<Animator> animations, List<Animator.AnimatorListener> list, RectF childBounds) {
        Ci translationXTiming;
        Ci translationYTiming;
        Ci translationXTiming2;
        Ci translationYTiming2;
        ValueAnimator translationYAnimator;
        ValueAnimator translationXAnimator;
        float translationX = m۱۱۳۸۶c(dependency, child, spec.f۹۵۳۷b);
        float translationY = m۱۱۳۸۹d(dependency, child, spec.f۹۵۳۷b);
        if (translationX == 0.0f || translationY == 0.0f) {
            translationXTiming = spec.f۹۵۳۶a.m۹۹۶۰a("translationXLinear");
            translationYTiming = spec.f۹۵۳۶a.m۹۹۶۰a("translationYLinear");
        } else if ((!expanded || translationY >= 0.0f) && (expanded || translationY <= 0.0f)) {
            translationXTiming = spec.f۹۵۳۶a.m۹۹۶۰a("translationXCurveDownwards");
            translationYTiming = spec.f۹۵۳۶a.m۹۹۶۰a("translationYCurveDownwards");
        } else {
            translationXTiming = spec.f۹۵۳۶a.m۹۹۶۰a("translationXCurveUpwards");
            translationYTiming = spec.f۹۵۳۶a.m۹۹۶۰a("translationYCurveUpwards");
        }
        if (expanded) {
            if (!currentlyAnimating) {
                child.setTranslationX(-translationX);
                child.setTranslationY(-translationY);
            }
            ValueAnimator translationXAnimator2 = ObjectAnimator.ofFloat(child, View.TRANSLATION_X, 0.0f);
            ValueAnimator translationYAnimator2 = ObjectAnimator.ofFloat(child, View.TRANSLATION_Y, 0.0f);
            translationYTiming2 = translationYTiming;
            translationXTiming2 = translationXTiming;
            m۱۱۳۷۹a(child, spec, translationXTiming, translationYTiming, -translationX, -translationY, 0.0f, 0.0f, childBounds);
            translationXAnimator = translationXAnimator2;
            translationYAnimator = translationYAnimator2;
        } else {
            translationYTiming2 = translationYTiming;
            translationXTiming2 = translationXTiming;
            ValueAnimator translationXAnimator3 = ObjectAnimator.ofFloat(child, View.TRANSLATION_X, -translationX);
            ValueAnimator ofFloat = ObjectAnimator.ofFloat(child, View.TRANSLATION_Y, -translationY);
            translationXAnimator = translationXAnimator3;
            translationYAnimator = ofFloat;
        }
        translationXTiming2.m۹۹۶۶a((Animator) translationXAnimator);
        translationYTiming2.m۹۹۶۶a((Animator) translationYAnimator);
        animations.add(translationXAnimator);
        animations.add(translationYAnimator);
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۱۳۹۰d(View dependency, View child, boolean expanded, boolean currentlyAnimating, Ce spec, List<Animator> animations, List<Animator.AnimatorListener> listeners) {
        ObjectAnimator animator;
        if ((child instanceof AbstractCd) && (dependency instanceof ImageView)) {
            AbstractCd circularRevealChild = (AbstractCd) child;
            Drawable icon = ((ImageView) dependency).getDrawable();
            if (icon != null) {
                icon.mutate();
                if (expanded) {
                    if (!currentlyAnimating) {
                        icon.setAlpha(255);
                    }
                    animator = ObjectAnimator.ofInt(icon, p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ce.f۸۲۵۸b, 0);
                } else {
                    animator = ObjectAnimator.ofInt(icon, p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ce.f۸۲۵۸b, 255);
                }
                animator.addUpdateListener(new Cb(this, child));
                spec.f۹۵۳۶a.m۹۹۶۰a("iconFade").m۹۹۶۶a((Animator) animator);
                animations.add(animator);
                listeners.add(new Cc(this, circularRevealChild, icon));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.transformation.FabTransformationBehavior$b  reason: invalid class name */
    public class Cb implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ View f۹۵۳۲a;

        Cb(FabTransformationBehavior this$0, View view) {
            this.f۹۵۳۲a = view;
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            this.f۹۵۳۲a.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.transformation.FabTransformationBehavior$c  reason: invalid class name */
    public class Cc extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCd f۹۵۳۳a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ Drawable f۹۵۳۴b;

        Cc(FabTransformationBehavior this$0, AbstractCd dVar, Drawable drawable) {
            this.f۹۵۳۳a = dVar;
            this.f۹۵۳۴b = drawable;
        }

        public void onAnimationStart(Animator animation) {
            this.f۹۵۳۳a.setCircularRevealOverlayDrawable(this.f۹۵۳۴b);
        }

        public void onAnimationEnd(Animator animation) {
            this.f۹۵۳۳a.setCircularRevealOverlayDrawable(null);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۳۸۰a(View dependency, View child, boolean expanded, boolean currentlyAnimating, Ce spec, float childWidth, float childHeight, List<Animator> animations, List<Animator.AnimatorListener> listeners) {
        AbstractCd circularRevealChild;
        Ci timing;
        Animator animator;
        if (child instanceof AbstractCd) {
            AbstractCd circularRevealChild2 = (AbstractCd) child;
            float revealCenterX = m۱۱۳۷۴a(dependency, child, spec.f۹۵۳۷b);
            float revealCenterY = m۱۱۳۸۳b(dependency, child, spec.f۹۵۳۷b);
            ((FloatingActionButton) dependency).m۱۱۶۲۰a(this.f۹۵۲۵c);
            float dependencyRadius = ((float) this.f۹۵۲۵c.width()) / 2.0f;
            Ci timing2 = spec.f۹۵۳۶a.m۹۹۶۰a("expansion");
            if (expanded) {
                if (!currentlyAnimating) {
                    circularRevealChild2.setRevealInfo(new AbstractCd.Ce(revealCenterX, revealCenterY, dependencyRadius));
                }
                float fromRadius = currentlyAnimating ? circularRevealChild2.getRevealInfo().f۸۳۱۳c : dependencyRadius;
                Animator animator2 = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.Ca.m۱۰۰۰۰a(circularRevealChild2, revealCenterX, revealCenterY, Cq.m۱۲۰۰۰a(revealCenterX, revealCenterY, 0.0f, 0.0f, childWidth, childHeight));
                animator2.addListener(new Cd(this, circularRevealChild2));
                timing = timing2;
                m۱۱۳۷۶a(child, timing2.m۹۹۶۵a(), (int) revealCenterX, (int) revealCenterY, fromRadius, animations);
                circularRevealChild = circularRevealChild2;
                animator = animator2;
            } else {
                timing = timing2;
                float fromRadius2 = circularRevealChild2.getRevealInfo().f۸۳۱۳c;
                Animator animator3 = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.Ca.m۱۰۰۰۰a(circularRevealChild2, revealCenterX, revealCenterY, dependencyRadius);
                m۱۱۳۷۶a(child, timing.m۹۹۶۵a(), (int) revealCenterX, (int) revealCenterY, fromRadius2, animations);
                circularRevealChild = circularRevealChild2;
                m۱۱۳۷۷a(child, timing.m۹۹۶۵a(), timing.m۹۹۶۷b(), spec.f۹۵۳۶a.m۹۹۵۹a(), (int) revealCenterX, (int) revealCenterY, dependencyRadius, animations);
                animator = animator3;
            }
            timing.m۹۹۶۶a(animator);
            animations.add(animator);
            listeners.add(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.Ca.m۹۹۹۹a(circularRevealChild));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.transformation.FabTransformationBehavior$d  reason: invalid class name */
    public class Cd extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCd f۹۵۳۵a;

        Cd(FabTransformationBehavior this$0, AbstractCd dVar) {
            this.f۹۵۳۵a = dVar;
        }

        public void onAnimationEnd(Animator animation) {
            AbstractCd.Ce revealInfo = this.f۹۵۳۵a.getRevealInfo();
            revealInfo.f۸۳۱۳c = Float.MAX_VALUE;
            this.f۹۵۳۵a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۱۳۸۵b(View dependency, View child, boolean expanded, boolean currentlyAnimating, Ce spec, List<Animator> animations, List<Animator.AnimatorListener> list) {
        ObjectAnimator animator;
        if (child instanceof AbstractCd) {
            AbstractCd circularRevealChild = (AbstractCd) child;
            int tint = m۱۱۳۸۴b(dependency);
            int transparent = 16777215 & tint;
            if (expanded) {
                if (!currentlyAnimating) {
                    circularRevealChild.setCircularRevealScrimColor(tint);
                }
                animator = ObjectAnimator.ofInt(circularRevealChild, AbstractCd.Cd.f۸۳۱۰a, transparent);
            } else {
                animator = ObjectAnimator.ofInt(circularRevealChild, AbstractCd.Cd.f۸۳۱۰a, tint);
            }
            animator.setEvaluator(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Cc.m۹۹۴۶a());
            spec.f۹۵۳۶a.m۹۹۶۰a("color").m۹۹۶۶a((Animator) animator);
            animations.add(animator);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۳۸۱a(View unusedDependency, View child, boolean expanded, boolean currentlyAnimating, Ce spec, List<Animator> animations, List<Animator.AnimatorListener> list) {
        ViewGroup childContentContainer;
        Animator animator;
        if (child instanceof ViewGroup) {
            if ((!(child instanceof AbstractCd) || p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۱n.Cc.f۸۳۰۶a != 0) && (childContentContainer = m۱۱۳۷۵a(child)) != null) {
                if (expanded) {
                    if (!currentlyAnimating) {
                        p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Cd.f۸۲۵۷a.set(childContentContainer, Float.valueOf(0.0f));
                    }
                    animator = ObjectAnimator.ofFloat(childContentContainer, p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Cd.f۸۲۵۷a, 1.0f);
                } else {
                    animator = ObjectAnimator.ofFloat(childContentContainer, p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Cd.f۸۲۵۷a, 0.0f);
                }
                spec.f۹۵۳۶a.m۹۹۶۰a("contentFade").m۹۹۶۶a(animator);
                animations.add(animator);
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private float m۱۱۳۸۶c(View dependency, View child, Cj positioning) {
        RectF dependencyBounds = this.f۹۵۲۶d;
        RectF childBounds = this.f۹۵۲۷e;
        m۱۱۳۷۸a(dependency, dependencyBounds);
        m۱۱۳۷۸a(child, childBounds);
        float translationX = 0.0f;
        int i = positioning.f۸۲۷۰a & 7;
        if (i == 1) {
            translationX = childBounds.centerX() - dependencyBounds.centerX();
        } else if (i == 3) {
            translationX = childBounds.left - dependencyBounds.left;
        } else if (i == 5) {
            translationX = childBounds.right - dependencyBounds.right;
        }
        return translationX + positioning.f۸۲۷۱b;
    }

    /* renamed from: d  reason: contains not printable characters */
    private float m۱۱۳۸۹d(View dependency, View child, Cj positioning) {
        RectF dependencyBounds = this.f۹۵۲۶d;
        RectF childBounds = this.f۹۵۲۷e;
        m۱۱۳۷۸a(dependency, dependencyBounds);
        m۱۱۳۷۸a(child, childBounds);
        float translationY = 0.0f;
        int i = positioning.f۸۲۷۰a & 112;
        if (i == 16) {
            translationY = childBounds.centerY() - dependencyBounds.centerY();
        } else if (i == 48) {
            translationY = childBounds.top - dependencyBounds.top;
        } else if (i == 80) {
            translationY = childBounds.bottom - dependencyBounds.bottom;
        }
        return translationY + positioning.f۸۲۷۲c;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۳۷۸a(View view, RectF rect) {
        rect.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] windowLocation = this.f۹۵۲۸f;
        view.getLocationInWindow(windowLocation);
        rect.offsetTo((float) windowLocation[0], (float) windowLocation[1]);
        rect.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: a  reason: contains not printable characters */
    private float m۱۱۳۷۴a(View dependency, View child, Cj positioning) {
        RectF dependencyBounds = this.f۹۵۲۶d;
        RectF childBounds = this.f۹۵۲۷e;
        m۱۱۳۷۸a(dependency, dependencyBounds);
        m۱۱۳۷۸a(child, childBounds);
        childBounds.offset(-m۱۱۳۸۶c(dependency, child, positioning), 0.0f);
        return dependencyBounds.centerX() - childBounds.left;
    }

    /* renamed from: b  reason: contains not printable characters */
    private float m۱۱۳۸۳b(View dependency, View child, Cj positioning) {
        RectF dependencyBounds = this.f۹۵۲۶d;
        RectF childBounds = this.f۹۵۲۷e;
        m۱۱۳۷۸a(dependency, dependencyBounds);
        m۱۱۳۷۸a(child, childBounds);
        childBounds.offset(0.0f, -m۱۱۳۸۹d(dependency, child, positioning));
        return dependencyBounds.centerY() - childBounds.top;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۳۷۹a(View child, Ce spec, Ci translationXTiming, Ci translationYTiming, float fromX, float fromY, float toX, float toY, RectF childBounds) {
        float translationX = m۱۱۳۷۳a(spec, translationXTiming, fromX, toX);
        float translationY = m۱۱۳۷۳a(spec, translationYTiming, fromY, toY);
        Rect window = this.f۹۵۲۵c;
        child.getWindowVisibleDisplayFrame(window);
        RectF windowF = this.f۹۵۲۶d;
        windowF.set(window);
        RectF childVisibleBounds = this.f۹۵۲۷e;
        m۱۱۳۷۸a(child, childVisibleBounds);
        childVisibleBounds.offset(translationX, translationY);
        childVisibleBounds.intersect(windowF);
        childBounds.set(childVisibleBounds);
    }

    /* renamed from: a  reason: contains not printable characters */
    private float m۱۱۳۷۳a(Ce spec, Ci timing, float from, float to) {
        long delay = timing.m۹۹۶۵a();
        long duration = timing.m۹۹۶۷b();
        Ci expansionTiming = spec.f۹۵۳۶a.m۹۹۶۰a("expansion");
        return p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.m۹۹۴۳a(from, to, timing.m۹۹۶۸c().getInterpolation(((float) (((expansionTiming.m۹۹۶۵a() + expansionTiming.m۹۹۶۷b()) + 17) - delay)) / ((float) duration)));
    }

    /* renamed from: a  reason: contains not printable characters */
    private ViewGroup m۱۱۳۷۵a(View view) {
        View childContentContainer = view.findViewById(Cf.mtrl_child_content_container);
        if (childContentContainer != null) {
            return m۱۱۳۸۷c(childContentContainer);
        }
        if ((view instanceof Cb) || (view instanceof Ca)) {
            return m۱۱۳۸۷c(((ViewGroup) view).getChildAt(0));
        }
        return m۱۱۳۸۷c(view);
    }

    /* renamed from: c  reason: contains not printable characters */
    private ViewGroup m۱۱۳۸۷c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۱۳۸۴b(View view) {
        ColorStateList tintList = Cu.m۱۳۰۰۰c(view);
        if (tintList != null) {
            return tintList.getColorForState(view.getDrawableState(), tintList.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۳۷۶a(View child, long delay, int revealCenterX, int revealCenterY, float fromRadius, List<Animator> animations) {
        if (Build.VERSION.SDK_INT >= 21 && delay > 0) {
            Animator animator = ViewAnimationUtils.createCircularReveal(child, revealCenterX, revealCenterY, fromRadius, fromRadius);
            animator.setStartDelay(0);
            animator.setDuration(delay);
            animations.add(animator);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۳۷۷a(View child, long delay, long duration, long totalDuration, int revealCenterX, int revealCenterY, float toRadius, List<Animator> animations) {
        if (Build.VERSION.SDK_INT >= 21 && delay + duration < totalDuration) {
            Animator animator = ViewAnimationUtils.createCircularReveal(child, revealCenterX, revealCenterY, toRadius, toRadius);
            animator.setStartDelay(delay + duration);
            animator.setDuration(totalDuration - (delay + duration));
            animations.add(animator);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: android.support.design.transformation.FabTransformationBehavior$e  reason: invalid class name */
    public static class Ce {

        /* renamed from: a  reason: contains not printable characters */
        public Ch f۹۵۳۶a;

        /* renamed from: b  reason: contains not printable characters */
        public Cj f۹۵۳۷b;

        protected Ce() {
        }
    }
}
