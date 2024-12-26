package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.Cu;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: a.b.f.c  reason: invalid class name */
public class Cc extends AbstractCm {

    /* renamed from: O  reason: contains not printable characters */
    private static final String[] f۸۴۸۴O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: P  reason: contains not printable characters */
    private static final Property<Drawable, PointF> f۸۴۸۵P = new Cb(PointF.class, "boundsOrigin");

    /* renamed from: Q  reason: contains not printable characters */
    private static final Property<Ck, PointF> f۸۴۸۶Q = new Cc(PointF.class, "topLeft");

    /* renamed from: R  reason: contains not printable characters */
    private static final Property<Ck, PointF> f۸۴۸۷R = new Cd(PointF.class, "bottomRight");

    /* renamed from: S  reason: contains not printable characters */
    private static final Property<View, PointF> f۸۴۸۸S = new Ce(PointF.class, "bottomRight");

    /* renamed from: T  reason: contains not printable characters */
    private static final Property<View, PointF> f۸۴۸۹T = new Cf(PointF.class, "topLeft");

    /* renamed from: U  reason: contains not printable characters */
    private static final Property<View, PointF> f۸۴۹۰U = new Cg(PointF.class, "position");

    /* renamed from: V  reason: contains not printable characters */
    private static Ck f۸۴۹۱V = new Ck();

    /* renamed from: L  reason: contains not printable characters */
    private int[] f۸۴۹۲L = new int[2];

    /* renamed from: M  reason: contains not printable characters */
    private boolean f۸۴۹۳M = false;

    /* renamed from: N  reason: contains not printable characters */
    private boolean f۸۴۹۴N = false;

    /* renamed from: a.b.f.c$b  reason: invalid class name */
    static class Cb extends Property<Drawable, PointF> {

        /* renamed from: a  reason: contains not printable characters */
        private Rect f۸۴۹۹a = new Rect();

        Cb(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void set(Drawable object, PointF value) {
            object.copyBounds(this.f۸۴۹۹a);
            this.f۸۴۹۹a.offsetTo(Math.round(value.x), Math.round(value.y));
            object.setBounds(this.f۸۴۹۹a);
        }

        /* renamed from: a  reason: contains not printable characters */
        public PointF get(Drawable object) {
            object.copyBounds(this.f۸۴۹۹a);
            Rect rect = this.f۸۴۹۹a;
            return new PointF((float) rect.left, (float) rect.top);
        }
    }

    /* renamed from: a.b.f.c$c  reason: invalid class name */
    static class Cc extends Property<Ck, PointF> {
        Cc(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void set(Ck viewBounds, PointF topLeft) {
            viewBounds.m۱۰۲۰۳b(topLeft);
        }

        /* renamed from: a  reason: contains not printable characters */
        public PointF get(Ck viewBounds) {
            return null;
        }
    }

    /* renamed from: a.b.f.c$d  reason: invalid class name */
    static class Cd extends Property<Ck, PointF> {
        Cd(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void set(Ck viewBounds, PointF bottomRight) {
            viewBounds.m۱۰۲۰۲a(bottomRight);
        }

        /* renamed from: a  reason: contains not printable characters */
        public PointF get(Ck viewBounds) {
            return null;
        }
    }

    /* renamed from: a.b.f.c$e  reason: invalid class name */
    static class Ce extends Property<View, PointF> {
        Ce(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void set(View view, PointF bottomRight) {
            Cd0.m۱۰۲۱۶a(view, view.getLeft(), view.getTop(), Math.round(bottomRight.x), Math.round(bottomRight.y));
        }

        /* renamed from: a  reason: contains not printable characters */
        public PointF get(View view) {
            return null;
        }
    }

    /* renamed from: a.b.f.c$f  reason: invalid class name */
    static class Cf extends Property<View, PointF> {
        Cf(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void set(View view, PointF topLeft) {
            Cd0.m۱۰۲۱۶a(view, Math.round(topLeft.x), Math.round(topLeft.y), view.getRight(), view.getBottom());
        }

        /* renamed from: a  reason: contains not printable characters */
        public PointF get(View view) {
            return null;
        }
    }

    /* renamed from: a.b.f.c$g  reason: invalid class name */
    static class Cg extends Property<View, PointF> {
        Cg(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a  reason: contains not printable characters */
        public void set(View view, PointF topLeft) {
            int left = Math.round(topLeft.x);
            int top = Math.round(topLeft.y);
            Cd0.m۱۰۲۱۶a(view, left, top, view.getWidth() + left, view.getHeight() + top);
        }

        /* renamed from: a  reason: contains not printable characters */
        public PointF get(View view) {
            return null;
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: n  reason: contains not printable characters */
    public String[] m۱۰۱۸۵n() {
        return f۸۴۸۴O;
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۰۱۸۱d(Cs values) {
        View view = values.f۸۶۳۱b;
        if (Cu.m۱۳۰۲۸y(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            values.f۸۶۳۰a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            values.f۸۶۳۰a.put("android:changeBounds:parent", values.f۸۶۳۱b.getParent());
            if (this.f۸۴۹۴N) {
                values.f۸۶۳۱b.getLocationInWindow(this.f۸۴۹۲L);
                values.f۸۶۳۰a.put("android:changeBounds:windowX", Integer.valueOf(this.f۸۴۹۲L[0]));
                values.f۸۶۳۰a.put("android:changeBounds:windowY", Integer.valueOf(this.f۸۴۹۲L[1]));
            }
            if (this.f۸۴۹۳M) {
                values.f۸۶۳۰a.put("android:changeBounds:clip", Cu.m۱۳۰۰۴e(view));
            }
        }
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۰۱۸۴c(Cs transitionValues) {
        m۱۰۱۸۱d(transitionValues);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۱۸۳a(Cs transitionValues) {
        m۱۰۱۸۱d(transitionValues);
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۰۱۸۰a(View startParent, View endParent) {
        if (!this.f۸۴۹۴N) {
            return true;
        }
        boolean parentMatches = true;
        Cs endValues = m۱۰۳۱۲a(startParent, true);
        if (endValues == null) {
            if (startParent != endParent) {
                parentMatches = false;
            }
            return parentMatches;
        }
        if (endParent != endValues.f۸۶۳۱b) {
            parentMatches = false;
        }
        return parentMatches;
    }

    /* JADX INFO: Multiple debug info for r11v5 int: [D('startParentVals' java.util.Map<java.lang.String, java.lang.Object>), D('endRight' int)] */
    /* JADX INFO: Multiple debug info for r12v4 int: [D('endParentVals' java.util.Map<java.lang.String, java.lang.Object>), D('startBottom' int)] */
    /* JADX INFO: Multiple debug info for r13v3 int: [D('endBottom' int), D('startParent' android.view.ViewGroup)] */
    /* JADX INFO: Multiple debug info for r14v3 int: [D('endParent' android.view.ViewGroup), D('startWidth' int)] */
    /* JADX INFO: Multiple debug info for r6v4 int: [D('startBounds' android.graphics.Rect), D('startHeight' int)] */
    /* JADX INFO: Multiple debug info for r5v6 int: [D('endBounds' android.graphics.Rect), D('endWidth' int)] */
    /* JADX INFO: Multiple debug info for r14v7 'clipAnimator'  android.animation.ObjectAnimator: [D('clipAnimator' android.animation.ObjectAnimator), D('maxWidth' int)] */
    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public Animator m۱۰۱۸۲a(ViewGroup sceneRoot, Cs startValues, Cs endValues) {
        boolean z;
        View view;
        Animator anim;
        int endLeft;
        int startTop;
        int startLeft;
        ObjectAnimator positionAnimator;
        Rect startClip;
        int i;
        Rect endClip;
        Rect rect;
        ObjectAnimator clipAnimator;
        if (startValues == null) {
            return null;
        }
        if (endValues == null) {
            return null;
        }
        Map<String, Object> startParentVals = startValues.f۸۶۳۰a;
        Map<String, Object> endParentVals = endValues.f۸۶۳۰a;
        ViewGroup startParent = (ViewGroup) startParentVals.get("android:changeBounds:parent");
        ViewGroup endParent = (ViewGroup) endParentVals.get("android:changeBounds:parent");
        if (startParent == null) {
            return null;
        }
        if (endParent == null) {
            return null;
        }
        View view2 = endValues.f۸۶۳۱b;
        if (m۱۰۱۸۰a(startParent, endParent)) {
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
            Rect startClip2 = (Rect) startValues.f۸۶۳۰a.get("android:changeBounds:clip");
            Rect endClip2 = (Rect) endValues.f۸۶۳۰a.get("android:changeBounds:clip");
            int numChanges = 0;
            if (!((startWidth == 0 || startHeight == 0) && (endWidth == 0 || endHeight == 0))) {
                if (!(startLeft2 == endLeft2 && startTop2 == endTop)) {
                    numChanges = 0 + 1;
                }
                if (!(startRight == endRight && startBottom == endBottom)) {
                    numChanges++;
                }
            }
            if ((startClip2 != null && !startClip2.equals(endClip2)) || (startClip2 == null && endClip2 != null)) {
                numChanges++;
            }
            if (numChanges <= 0) {
                return null;
            }
            if (!this.f۸۴۹۳M) {
                Cd0.m۱۰۲۱۶a(view2, startLeft2, startTop2, startRight, startBottom);
                if (numChanges != 2) {
                    if (startLeft2 != endLeft2) {
                        view = view2;
                    } else if (startTop2 != endTop) {
                        view = view2;
                    } else {
                        view = view2;
                        anim = Cf.m۱۰۲۵۸a(view, f۸۴۸۸S, m۱۰۳۳۹f().m۱۰۲۶۳a((float) startRight, (float) startBottom, (float) endRight, (float) endBottom));
                        z = true;
                    }
                    anim = Cf.m۱۰۲۵۸a(view, f۸۴۸۹T, m۱۰۳۳۹f().m۱۰۲۶۳a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                    z = true;
                } else if (startWidth == endWidth && startHeight == endHeight) {
                    anim = Cf.m۱۰۲۵۸a(view2, f۸۴۹۰U, m۱۰۳۳۹f().m۱۰۲۶۳a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                    view = view2;
                    z = true;
                } else {
                    Ck viewBounds = new Ck(view2);
                    ObjectAnimator topLeftAnimator = Cf.m۱۰۲۵۸a(viewBounds, f۸۴۸۶Q, m۱۰۳۳۹f().m۱۰۲۶۳a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                    ObjectAnimator bottomRightAnimator = Cf.m۱۰۲۵۸a(viewBounds, f۸۴۸۷R, m۱۰۳۳۹f().m۱۰۲۶۳a((float) startRight, (float) startBottom, (float) endRight, (float) endBottom));
                    AnimatorSet set = new AnimatorSet();
                    set.playTogether(topLeftAnimator, bottomRightAnimator);
                    set.addListener(new Ch(this, viewBounds));
                    anim = set;
                    view = view2;
                    z = true;
                }
            } else {
                view = view2;
                Cd0.m۱۰۲۱۶a(view, startLeft2, startTop2, startLeft2 + Math.max(startWidth, endWidth), startTop2 + Math.max(startHeight, endHeight));
                if (startLeft2 == endLeft2 && startTop2 == endTop) {
                    endLeft = endLeft2;
                    positionAnimator = null;
                    startTop = startTop2;
                    startLeft = startLeft2;
                } else {
                    startLeft = startLeft2;
                    startTop = startTop2;
                    endLeft = endLeft2;
                    positionAnimator = Cf.m۱۰۲۵۸a(view, f۸۴۹۰U, m۱۰۳۳۹f().m۱۰۲۶۳a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                }
                if (startClip2 == null) {
                    i = 0;
                    startClip = new Rect(0, 0, startWidth, startHeight);
                } else {
                    i = 0;
                    startClip = startClip2;
                }
                if (endClip2 == null) {
                    endClip = new Rect(i, i, endWidth, endHeight);
                } else {
                    endClip = endClip2;
                }
                if (!startClip.equals(endClip)) {
                    Cu.m۱۲۹۸۳a(view, startClip);
                    clipAnimator = ObjectAnimator.ofObject(view, "clipBounds", f۸۴۹۱V, startClip, endClip);
                    rect = startClip;
                    z = true;
                    clipAnimator.addListener(new Ci(this, view, endClip2, endLeft, endTop, endRight, endBottom));
                } else {
                    z = true;
                    rect = startClip;
                    clipAnimator = null;
                }
                anim = Cr.m۱۰۳۹۹a(positionAnimator, clipAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup parent = (ViewGroup) view.getParent();
                Cx.m۱۰۴۱۲a(parent, z);
                m۱۰۳۰۹a(new Cj(this, parent));
            }
            return anim;
        }
        int startX = ((Integer) startValues.f۸۶۳۰a.get("android:changeBounds:windowX")).intValue();
        int startY = ((Integer) startValues.f۸۶۳۰a.get("android:changeBounds:windowY")).intValue();
        int endX = ((Integer) endValues.f۸۶۳۰a.get("android:changeBounds:windowX")).intValue();
        int endY = ((Integer) endValues.f۸۶۳۰a.get("android:changeBounds:windowY")).intValue();
        if (startX == endX && startY == endY) {
            return null;
        }
        sceneRoot.getLocationInWindow(this.f۸۴۹۲L);
        Bitmap bitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(bitmap));
        BitmapDrawable drawable = new BitmapDrawable(bitmap);
        float transitionAlpha = Cd0.m۱۰۲۲۰c(view2);
        Cd0.m۱۰۲۱۴a(view2, 0.0f);
        Cd0.m۱۰۲۱۸b(sceneRoot).m۱۰۲۰۴a(drawable);
        AbstractCg f = m۱۰۳۳۹f();
        int[] iArr = this.f۸۴۹۲L;
        ObjectAnimator anim2 = ObjectAnimator.ofPropertyValuesHolder(drawable, Ci.m۱۰۲۷۴a(f۸۴۸۵P, f.m۱۰۲۶۳a((float) (startX - iArr[0]), (float) (startY - iArr[1]), (float) (endX - iArr[0]), (float) (endY - iArr[1]))));
        anim2.addListener(new Ca(this, sceneRoot, drawable, view2, transitionAlpha));
        return anim2;
    }

    /* renamed from: a.b.f.c$h  reason: invalid class name */
    class Ch extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ Ck f۸۵۰۰a;
        private Ck mViewBounds = this.f۸۵۰۰a;

        Ch(Cc this$0, Ck kVar) {
            this.f۸۵۰۰a = kVar;
        }
    }

    /* renamed from: a.b.f.c$i  reason: invalid class name */
    class Ci extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        private boolean f۸۵۰۱a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ View f۸۵۰۲b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ Rect f۸۵۰۳c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ int f۸۵۰۴d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ int f۸۵۰۵e;

        /* renamed from: f  reason: contains not printable characters */
        final /* synthetic */ int f۸۵۰۶f;

        /* renamed from: g  reason: contains not printable characters */
        final /* synthetic */ int f۸۵۰۷g;

        Ci(Cc this$0, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f۸۵۰۲b = view;
            this.f۸۵۰۳c = rect;
            this.f۸۵۰۴d = i;
            this.f۸۵۰۵e = i2;
            this.f۸۵۰۶f = i3;
            this.f۸۵۰۷g = i4;
        }

        public void onAnimationCancel(Animator animation) {
            this.f۸۵۰۱a = true;
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f۸۵۰۱a) {
                Cu.m۱۲۹۸۳a(this.f۸۵۰۲b, this.f۸۵۰۳c);
                Cd0.m۱۰۲۱۶a(this.f۸۵۰۲b, this.f۸۵۰۴d, this.f۸۵۰۵e, this.f۸۵۰۶f, this.f۸۵۰۷g);
            }
        }
    }

    /* renamed from: a.b.f.c$j  reason: invalid class name */
    class Cj extends Cn {

        /* renamed from: a  reason: contains not printable characters */
        boolean f۸۵۰۸a = false;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ ViewGroup f۸۵۰۹b;

        Cj(Cc this$0, ViewGroup viewGroup) {
            this.f۸۵۰۹b = viewGroup;
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۱۹۹b(AbstractCm transition) {
            if (!this.f۸۵۰۸a) {
                Cx.m۱۰۴۱۲a(this.f۸۵۰۹b, false);
            }
            transition.m۱۰۳۲۸b(this);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf, p۰۰۰a.p۰۰۵b.p۰۲۲f.Cn
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۱۹۸a(AbstractCm transition) {
            Cx.m۱۰۴۱۲a(this.f۸۵۰۹b, false);
        }

        @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCm.AbstractCf, p۰۰۰a.p۰۰۵b.p۰۲۲f.Cn
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۰۲۰۰d(AbstractCm transition) {
            Cx.m۱۰۴۱۲a(this.f۸۵۰۹b, true);
        }
    }

    /* renamed from: a.b.f.c$a  reason: invalid class name */
    class Ca extends AnimatorListenerAdapter {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ ViewGroup f۸۴۹۵a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ BitmapDrawable f۸۴۹۶b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۸۴۹۷c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ float f۸۴۹۸d;

        Ca(Cc this$0, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f۸۴۹۵a = viewGroup;
            this.f۸۴۹۶b = bitmapDrawable;
            this.f۸۴۹۷c = view;
            this.f۸۴۹۸d = f;
        }

        public void onAnimationEnd(Animator animation) {
            Cd0.m۱۰۲۱۸b(this.f۸۴۹۵a).m۱۰۲۰۵b(this.f۸۴۹۶b);
            Cd0.m۱۰۲۱۴a(this.f۸۴۹۷c, this.f۸۴۹۸d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a.b.f.c$k  reason: invalid class name */
    public static class Ck {

        /* renamed from: a  reason: contains not printable characters */
        private int f۸۵۱۰a;

        /* renamed from: b  reason: contains not printable characters */
        private int f۸۵۱۱b;

        /* renamed from: c  reason: contains not printable characters */
        private int f۸۵۱۲c;

        /* renamed from: d  reason: contains not printable characters */
        private int f۸۵۱۳d;

        /* renamed from: e  reason: contains not printable characters */
        private View f۸۵۱۴e;

        /* renamed from: f  reason: contains not printable characters */
        private int f۸۵۱۵f;

        /* renamed from: g  reason: contains not printable characters */
        private int f۸۵۱۶g;

        Ck(View view) {
            this.f۸۵۱۴e = view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۲۰۳b(PointF topLeft) {
            this.f۸۵۱۰a = Math.round(topLeft.x);
            this.f۸۵۱۱b = Math.round(topLeft.y);
            this.f۸۵۱۵f++;
            if (this.f۸۵۱۵f == this.f۸۵۱۶g) {
                m۱۰۲۰۱a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۲۰۲a(PointF bottomRight) {
            this.f۸۵۱۲c = Math.round(bottomRight.x);
            this.f۸۵۱۳d = Math.round(bottomRight.y);
            this.f۸۵۱۶g++;
            if (this.f۸۵۱۵f == this.f۸۵۱۶g) {
                m۱۰۲۰۱a();
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۰۲۰۱a() {
            Cd0.m۱۰۲۱۶a(this.f۸۵۱۴e, this.f۸۵۱۰a, this.f۸۵۱۱b, this.f۸۵۱۲c, this.f۸۵۱۳d);
            this.f۸۵۱۵f = 0;
            this.f۸۵۱۶g = 0;
        }
    }
}
