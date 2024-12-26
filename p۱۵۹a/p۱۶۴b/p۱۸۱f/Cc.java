package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.Cu;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm;

/* renamed from: a.b.f.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc extends AbstractCm {

    /* renamed from: O, reason: contains not printable characters */
    private static final String[] f۸۴۸۴O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: P, reason: contains not printable characters */
    private static final Property<Drawable, PointF> f۸۴۸۵P = new b(PointF.class, "boundsOrigin");

    /* renamed from: Q, reason: contains not printable characters */
    private static final Property<k, PointF> f۸۴۸۶Q = new c(PointF.class, "topLeft");

    /* renamed from: R, reason: contains not printable characters */
    private static final Property<k, PointF> f۸۴۸۷R = new d(PointF.class, "bottomRight");

    /* renamed from: S, reason: contains not printable characters */
    private static final Property<View, PointF> f۸۴۸۸S = new e(PointF.class, "bottomRight");

    /* renamed from: T, reason: contains not printable characters */
    private static final Property<View, PointF> f۸۴۸۹T = new f(PointF.class, "topLeft");

    /* renamed from: U, reason: contains not printable characters */
    private static final Property<View, PointF> f۸۴۹۰U = new g(PointF.class, "position");

    /* renamed from: V, reason: contains not printable characters */
    private static Ck f۸۴۹۱V = new Ck();

    /* renamed from: L, reason: contains not printable characters */
    private int[] f۸۴۹۲L = new int[2];

    /* renamed from: M, reason: contains not printable characters */
    private boolean f۸۴۹۳M = false;

    /* renamed from: N, reason: contains not printable characters */
    private boolean f۸۴۹۴N = false;

    /* renamed from: a.b.f.c$b */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a, reason: contains not printable characters */
        private Rect f۸۴۹۹a;

        b(Class cls, String x1) {
            super(cls, x1);
            this.f۸۴۹۹a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(Drawable object, PointF value) {
            object.copyBounds(this.f۸۴۹۹a);
            this.f۸۴۹۹a.offsetTo(Math.round(value.x), Math.round(value.y));
            object.setBounds(this.f۸۴۹۹a);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PointF get(Drawable object) {
            object.copyBounds(this.f۸۴۹۹a);
            Rect rect = this.f۸۴۹۹a;
            return new PointF(rect.left, rect.top);
        }
    }

    /* renamed from: a.b.f.c$c */
    static class c extends Property<k, PointF> {
        c(Class cls, String x1) {
            super(cls, x1);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(k viewBounds, PointF topLeft) {
            viewBounds.m۸۱۳۶b(topLeft);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PointF get(k viewBounds) {
            return null;
        }
    }

    /* renamed from: a.b.f.c$d */
    static class d extends Property<k, PointF> {
        d(Class cls, String x1) {
            super(cls, x1);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(k viewBounds, PointF bottomRight) {
            viewBounds.m۸۱۳۵a(bottomRight);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PointF get(k viewBounds) {
            return null;
        }
    }

    /* renamed from: a.b.f.c$e */
    static class e extends Property<View, PointF> {
        e(Class cls, String x1) {
            super(cls, x1);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, PointF bottomRight) {
            int left = view.getLeft();
            int top = view.getTop();
            int right = Math.round(bottomRight.x);
            int bottom = Math.round(bottomRight.y);
            Cd0.m۸۱۴۹a(view, left, top, right, bottom);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }
    }

    /* renamed from: a.b.f.c$f */
    static class f extends Property<View, PointF> {
        f(Class cls, String x1) {
            super(cls, x1);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, PointF topLeft) {
            int left = Math.round(topLeft.x);
            int top = Math.round(topLeft.y);
            int right = view.getRight();
            int bottom = view.getBottom();
            Cd0.m۸۱۴۹a(view, left, top, right, bottom);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }
    }

    /* renamed from: a.b.f.c$g */
    static class g extends Property<View, PointF> {
        g(Class cls, String x1) {
            super(cls, x1);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, PointF topLeft) {
            int left = Math.round(topLeft.x);
            int top = Math.round(topLeft.y);
            int right = view.getWidth() + left;
            int bottom = view.getHeight() + top;
            Cd0.m۸۱۴۹a(view, left, top, right, bottom);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: n, reason: contains not printable characters */
    public String[] mo۸۲۷۹n() {
        return f۸۴۸۴O;
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۸۱۱۴d(Cs values) {
        View view = values.f۸۶۳۱b;
        if (Cu.m۱۰۹۵۸y(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            values.f۸۶۳۰a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            values.f۸۶۳۰a.put("android:changeBounds:parent", values.f۸۶۳۱b.getParent());
            if (this.f۸۴۹۴N) {
                values.f۸۶۳۱b.getLocationInWindow(this.f۸۴۹۲L);
                values.f۸۶۳۰a.put("android:changeBounds:windowX", Integer.valueOf(this.f۸۴۹۲L[0]));
                values.f۸۶۳۰a.put("android:changeBounds:windowY", Integer.valueOf(this.f۸۴۹۲L[1]));
            }
            if (this.f۸۴۹۳M) {
                values.f۸۶۳۰a.put("android:changeBounds:clip", Cu.m۱۰۹۳۴e(view));
            }
        }
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: c, reason: contains not printable characters */
    public void mo۸۳۲۳c(Cs transitionValues) {
        m۸۱۱۴d(transitionValues);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۱۵a(Cs transitionValues) {
        m۸۱۱۴d(transitionValues);
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۸۱۱۳a(View startParent, View endParent) {
        if (!this.f۸۴۹۴N) {
            return true;
        }
        Cs endValues = m۸۲۴۵a(startParent, true);
        if (endValues == null) {
            boolean parentMatches = startParent == endParent;
            return parentMatches;
        }
        boolean parentMatches2 = endParent == endValues.f۸۶۳۱b;
        return parentMatches2;
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm
    /* renamed from: a, reason: contains not printable characters */
    public Animator mo۸۲۴۶a(ViewGroup sceneRoot, Cs startValues, Cs endValues) {
        View view;
        int startLeft;
        int startTop;
        int endLeft;
        ObjectAnimator positionAnimator;
        int i2;
        Rect startClip;
        Rect endClip;
        boolean z;
        Rect startClip2;
        ObjectAnimator clipAnimator;
        Animator anim;
        if (startValues != null && endValues != null) {
            Map<String, Object> startParentVals = startValues.f۸۶۳۰a;
            Map<String, Object> endParentVals = endValues.f۸۶۳۰a;
            ViewGroup startParent = (ViewGroup) startParentVals.get("android:changeBounds:parent");
            ViewGroup endParent = (ViewGroup) endParentVals.get("android:changeBounds:parent");
            if (startParent != null && endParent != null) {
                View view2 = endValues.f۸۶۳۱b;
                if (m۸۱۱۳a(startParent, endParent)) {
                    Rect startBounds = (Rect) startValues.f۸۶۳۰a.get("android:changeBounds:bounds");
                    Rect endBounds = (Rect) endValues.f۸۶۳۰a.get("android:changeBounds:bounds");
                    int startLeft2 = startBounds.left;
                    int endLeft2 = endBounds.left;
                    int startTop2 = startBounds.top;
                    int endTop = endBounds.top;
                    int startRight = startBounds.right;
                    int endRight = endBounds.right;
                    int startBottom = startBounds.bottom;
                    int endBottom = endBounds.bottom;
                    int startWidth = startRight - startLeft2;
                    int startHeight = startBottom - startTop2;
                    int endWidth = endRight - endLeft2;
                    int endHeight = endBottom - endTop;
                    Rect startClip3 = (Rect) startValues.f۸۶۳۰a.get("android:changeBounds:clip");
                    Rect endClip2 = (Rect) endValues.f۸۶۳۰a.get("android:changeBounds:clip");
                    if ((startWidth != 0 && startHeight != 0) || (endWidth != 0 && endHeight != 0)) {
                        numChanges = (startLeft2 == endLeft2 && startTop2 == endTop) ? 0 : 0 + 1;
                        if (startRight != endRight || startBottom != endBottom) {
                            numChanges++;
                        }
                    }
                    if ((startClip3 != null && !startClip3.equals(endClip2)) || (startClip3 == null && endClip2 != null)) {
                        numChanges++;
                    }
                    if (numChanges > 0) {
                        if (this.f۸۴۹۳M) {
                            view = view2;
                            int maxWidth = Math.max(startWidth, endWidth);
                            int maxHeight = Math.max(startHeight, endHeight);
                            Cd0.m۸۱۴۹a(view, startLeft2, startTop2, startLeft2 + maxWidth, startTop2 + maxHeight);
                            if (startLeft2 == endLeft2 && startTop2 == endTop) {
                                endLeft = endLeft2;
                                positionAnimator = null;
                                startTop = startTop2;
                                startLeft = startLeft2;
                            } else {
                                startLeft = startLeft2;
                                startTop = startTop2;
                                endLeft = endLeft2;
                                Path topLeftPath = m۸۲۷۲f().mo۸۲۸۳a(startLeft2, startTop2, endLeft2, endTop);
                                positionAnimator = Cf.m۸۱۹۱a(view, f۸۴۹۰U, topLeftPath);
                            }
                            if (startClip3 != null) {
                                i2 = 0;
                                startClip = startClip3;
                            } else {
                                i2 = 0;
                                startClip = new Rect(0, 0, startWidth, startHeight);
                            }
                            if (endClip2 != null) {
                                endClip = endClip2;
                            } else {
                                endClip = new Rect(i2, i2, endWidth, endHeight);
                            }
                            if (startClip.equals(endClip)) {
                                z = true;
                                startClip2 = startClip;
                                clipAnimator = null;
                            } else {
                                Cu.m۱۰۹۱۳a(view, startClip);
                                ObjectAnimator clipAnimator2 = ObjectAnimator.ofObject(view, "clipBounds", f۸۴۹۱V, startClip, endClip);
                                clipAnimator = clipAnimator2;
                                startClip2 = startClip;
                                z = true;
                                clipAnimator.addListener(new i(this, view, endClip2, endLeft, endTop, endRight, endBottom));
                            }
                            anim = Cr.m۸۳۳۴a(positionAnimator, clipAnimator);
                        } else {
                            Cd0.m۸۱۴۹a(view2, startLeft2, startTop2, startRight, startBottom);
                            if (numChanges == 2) {
                                if (startWidth != endWidth || startHeight != endHeight) {
                                    k viewBounds = new k(view2);
                                    Path topLeftPath2 = m۸۲۷۲f().mo۸۲۸۳a(startLeft2, startTop2, endLeft2, endTop);
                                    ObjectAnimator topLeftAnimator = Cf.m۸۱۹۱a(viewBounds, f۸۴۸۶Q, topLeftPath2);
                                    Path bottomRightPath = m۸۲۷۲f().mo۸۲۸۳a(startRight, startBottom, endRight, endBottom);
                                    ObjectAnimator bottomRightAnimator = Cf.m۸۱۹۱a(viewBounds, f۸۴۸۷R, bottomRightPath);
                                    AnimatorSet set = new AnimatorSet();
                                    set.playTogether(topLeftAnimator, bottomRightAnimator);
                                    set.addListener(new h(this, viewBounds));
                                    anim = set;
                                    view = view2;
                                    z = true;
                                } else {
                                    Path topLeftPath3 = m۸۲۷۲f().mo۸۲۸۳a(startLeft2, startTop2, endLeft2, endTop);
                                    anim = Cf.m۸۱۹۱a(view2, f۸۴۹۰U, topLeftPath3);
                                    view = view2;
                                    z = true;
                                }
                            } else {
                                if (startLeft2 != endLeft2) {
                                    view = view2;
                                } else if (startTop2 != endTop) {
                                    view = view2;
                                } else {
                                    Path bottomRight = m۸۲۷۲f().mo۸۲۸۳a(startRight, startBottom, endRight, endBottom);
                                    view = view2;
                                    anim = Cf.m۸۱۹۱a(view, f۸۴۸۸S, bottomRight);
                                    z = true;
                                }
                                Path topLeftPath4 = m۸۲۷۲f().mo۸۲۸۳a(startLeft2, startTop2, endLeft2, endTop);
                                anim = Cf.m۸۱۹۱a(view, f۸۴۸۹T, topLeftPath4);
                                z = true;
                            }
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup parent = (ViewGroup) view.getParent();
                            Cx.m۸۳۴۷a(parent, z);
                            AbstractCm.f transitionListener = new j(this, parent);
                            mo۸۳۰۷a(transitionListener);
                        }
                        return anim;
                    }
                    return null;
                }
                int startX = ((Integer) startValues.f۸۶۳۰a.get("android:changeBounds:windowX")).intValue();
                int startY = ((Integer) startValues.f۸۶۳۰a.get("android:changeBounds:windowY")).intValue();
                int endX = ((Integer) endValues.f۸۶۳۰a.get("android:changeBounds:windowX")).intValue();
                int endY = ((Integer) endValues.f۸۶۳۰a.get("android:changeBounds:windowY")).intValue();
                if (startX != endX || startY != endY) {
                    sceneRoot.getLocationInWindow(this.f۸۴۹۲L);
                    Bitmap bitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    view2.draw(canvas);
                    BitmapDrawable drawable = new BitmapDrawable(bitmap);
                    float transitionAlpha = Cd0.m۸۱۵۳c(view2);
                    Cd0.m۸۱۴۷a(view2, 0.0f);
                    Cd0.m۸۱۵۱b(sceneRoot).mo۸۳۴۰a(drawable);
                    AbstractCg abstractCg = m۸۲۷۲f();
                    int[] iArr = this.f۸۴۹۲L;
                    Path topLeftPath5 = abstractCg.mo۸۲۸۳a(startX - iArr[0], startY - iArr[1], endX - iArr[0], endY - iArr[1]);
                    PropertyValuesHolder origin = Ci.m۸۲۰۷a(f۸۴۸۵P, topLeftPath5);
                    ObjectAnimator anim2 = ObjectAnimator.ofPropertyValuesHolder(drawable, origin);
                    anim2.addListener(new a(this, sceneRoot, drawable, view2, transitionAlpha));
                    return anim2;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* renamed from: a.b.f.c$h */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ k f۸۵۰۰a;
        private k mViewBounds;

        h(Cc this$0, k kVar) {
            this.f۸۵۰۰a = kVar;
            this.mViewBounds = this.f۸۵۰۰a;
        }
    }

    /* renamed from: a.b.f.c$i */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        private boolean f۸۵۰۱a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ View f۸۵۰۲b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ Rect f۸۵۰۳c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ int f۸۵۰۴d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ int f۸۵۰۵e;

        /* renamed from: f, reason: contains not printable characters */
        final /* synthetic */ int f۸۵۰۶f;

        /* renamed from: g, reason: contains not printable characters */
        final /* synthetic */ int f۸۵۰۷g;

        i(Cc this$0, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f۸۵۰۲b = view;
            this.f۸۵۰۳c = rect;
            this.f۸۵۰۴d = i;
            this.f۸۵۰۵e = i2;
            this.f۸۵۰۶f = i3;
            this.f۸۵۰۷g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.f۸۵۰۱a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            if (!this.f۸۵۰۱a) {
                Cu.m۱۰۹۱۳a(this.f۸۵۰۲b, this.f۸۵۰۳c);
                Cd0.m۸۱۴۹a(this.f۸۵۰۲b, this.f۸۵۰۴d, this.f۸۵۰۵e, this.f۸۵۰۶f, this.f۸۵۰۷g);
            }
        }
    }

    /* renamed from: a.b.f.c$j */
    class j extends Cn {

        /* renamed from: a, reason: contains not printable characters */
        boolean f۸۵۰۸a = false;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f۸۵۰۹b;

        j(Cc this$0, ViewGroup viewGroup) {
            this.f۸۵۰۹b = viewGroup;
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: b, reason: contains not printable characters */
        public void mo۸۳۳۲b(AbstractCm transition) {
            if (!this.f۸۵۰۸a) {
                Cx.m۸۳۴۷a(this.f۸۵۰۹b, false);
            }
            transition.mo۸۳۲۱b(this);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.Cn, p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: a, reason: contains not printable characters */
        public void mo۸۲۸۸a(AbstractCm transition) {
            Cx.m۸۳۴۷a(this.f۸۵۰۹b, false);
        }

        @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.Cn, p۱۵۹a.p۱۶۴b.p۱۸۱f.AbstractCm.f
        /* renamed from: d, reason: contains not printable characters */
        public void mo۸۲۹۰d(AbstractCm transition) {
            Cx.m۸۳۴۷a(this.f۸۵۰۹b, true);
        }
    }

    /* renamed from: a.b.f.c$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f۸۴۹۵a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ BitmapDrawable f۸۴۹۶b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ View f۸۴۹۷c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ float f۸۴۹۸d;

        a(Cc this$0, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.f۸۴۹۵a = viewGroup;
            this.f۸۴۹۶b = bitmapDrawable;
            this.f۸۴۹۷c = view;
            this.f۸۴۹۸d = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Cd0.m۸۱۵۱b(this.f۸۴۹۵a).mo۸۳۴۲b(this.f۸۴۹۶b);
            Cd0.m۸۱۴۷a(this.f۸۴۹۷c, this.f۸۴۹۸d);
        }
    }

    /* renamed from: a.b.f.c$k */
    private static class k {

        /* renamed from: a, reason: contains not printable characters */
        private int f۸۵۱۰a;

        /* renamed from: b, reason: contains not printable characters */
        private int f۸۵۱۱b;

        /* renamed from: c, reason: contains not printable characters */
        private int f۸۵۱۲c;

        /* renamed from: d, reason: contains not printable characters */
        private int f۸۵۱۳d;

        /* renamed from: e, reason: contains not printable characters */
        private View f۸۵۱۴e;

        /* renamed from: f, reason: contains not printable characters */
        private int f۸۵۱۵f;

        /* renamed from: g, reason: contains not printable characters */
        private int f۸۵۱۶g;

        k(View view) {
            this.f۸۵۱۴e = view;
        }

        /* renamed from: b, reason: contains not printable characters */
        void m۸۱۳۶b(PointF topLeft) {
            this.f۸۵۱۰a = Math.round(topLeft.x);
            this.f۸۵۱۱b = Math.round(topLeft.y);
            this.f۸۵۱۵f++;
            if (this.f۸۵۱۵f == this.f۸۵۱۶g) {
                m۸۱۳۴a();
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۸۱۳۵a(PointF bottomRight) {
            this.f۸۵۱۲c = Math.round(bottomRight.x);
            this.f۸۵۱۳d = Math.round(bottomRight.y);
            this.f۸۵۱۶g++;
            if (this.f۸۵۱۵f == this.f۸۵۱۶g) {
                m۸۱۳۴a();
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۸۱۳۴a() {
            Cd0.m۸۱۴۹a(this.f۸۵۱۴e, this.f۸۵۱۰a, this.f۸۵۱۱b, this.f۸۵۱۲c, this.f۸۵۱۳d);
            this.f۸۵۱۵f = 0;
            this.f۸۵۱۶g = 0;
        }
    }
}
