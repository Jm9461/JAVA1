package a.b.f;

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
import android.support.v4.view.u;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class c extends m {
    private static final String[] O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> P = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> Q = new C۰۰۰۹c(PointF.class, "topLeft");
    private static final Property<k, PointF> R = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> S = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> T = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> U = new g(PointF.class, "position");
    private static k V = new k();
    private int[] L = new int[2];
    private boolean M = false;
    private boolean N = false;

    static class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f۱۷۳a = new Rect();

        b(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a */
        public void set(Drawable object, PointF value) {
            object.copyBounds(this.f۱۷۳a);
            this.f۱۷۳a.offsetTo(Math.round(value.x), Math.round(value.y));
            object.setBounds(this.f۱۷۳a);
        }

        /* renamed from: a */
        public PointF get(Drawable object) {
            object.copyBounds(this.f۱۷۳a);
            Rect rect = this.f۱۷۳a;
            return new PointF((float) rect.left, (float) rect.top);
        }
    }

    /* renamed from: a.b.f.c$c  reason: collision with other inner class name */
    static class C۰۰۰۹c extends Property<k, PointF> {
        C۰۰۰۹c(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a */
        public void set(k viewBounds, PointF topLeft) {
            viewBounds.b(topLeft);
        }

        /* renamed from: a */
        public PointF get(k viewBounds) {
            return null;
        }
    }

    static class d extends Property<k, PointF> {
        d(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a */
        public void set(k viewBounds, PointF bottomRight) {
            viewBounds.a(bottomRight);
        }

        /* renamed from: a */
        public PointF get(k viewBounds) {
            return null;
        }
    }

    static class e extends Property<View, PointF> {
        e(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a */
        public void set(View view, PointF bottomRight) {
            d0.a(view, view.getLeft(), view.getTop(), Math.round(bottomRight.x), Math.round(bottomRight.y));
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }
    }

    static class f extends Property<View, PointF> {
        f(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a */
        public void set(View view, PointF topLeft) {
            d0.a(view, Math.round(topLeft.x), Math.round(topLeft.y), view.getRight(), view.getBottom());
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }
    }

    static class g extends Property<View, PointF> {
        g(Class cls, String x1) {
            super(cls, x1);
        }

        /* renamed from: a */
        public void set(View view, PointF topLeft) {
            int left = Math.round(topLeft.x);
            int top = Math.round(topLeft.y);
            d0.a(view, left, top, view.getWidth() + left, view.getHeight() + top);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }
    }

    @Override // a.b.f.m
    public String[] n() {
        return O;
    }

    private void d(s values) {
        View view = values.f۲۶۸b;
        if (u.y(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            values.f۲۶۷a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            values.f۲۶۷a.put("android:changeBounds:parent", values.f۲۶۸b.getParent());
            if (this.N) {
                values.f۲۶۸b.getLocationInWindow(this.L);
                values.f۲۶۷a.put("android:changeBounds:windowX", Integer.valueOf(this.L[0]));
                values.f۲۶۷a.put("android:changeBounds:windowY", Integer.valueOf(this.L[1]));
            }
            if (this.M) {
                values.f۲۶۷a.put("android:changeBounds:clip", u.e(view));
            }
        }
    }

    @Override // a.b.f.m
    public void c(s transitionValues) {
        d(transitionValues);
    }

    @Override // a.b.f.m
    public void a(s transitionValues) {
        d(transitionValues);
    }

    private boolean a(View startParent, View endParent) {
        if (!this.N) {
            return true;
        }
        boolean parentMatches = true;
        s endValues = a(startParent, true);
        if (endValues == null) {
            if (startParent != endParent) {
                parentMatches = false;
            }
            return parentMatches;
        }
        if (endParent != endValues.f۲۶۸b) {
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
    @Override // a.b.f.m
    public Animator a(ViewGroup sceneRoot, s startValues, s endValues) {
        boolean z;
        View view;
        Animator anim;
        int endLeft;
        int startTop;
        int startLeft;
        ObjectAnimator positionAnimator;
        Rect startClip;
        int i2;
        Rect endClip;
        Rect rect;
        ObjectAnimator clipAnimator;
        if (startValues == null) {
            return null;
        }
        if (endValues == null) {
            return null;
        }
        Map<String, Object> startParentVals = startValues.f۲۶۷a;
        Map<String, Object> endParentVals = endValues.f۲۶۷a;
        ViewGroup startParent = (ViewGroup) startParentVals.get("android:changeBounds:parent");
        ViewGroup endParent = (ViewGroup) endParentVals.get("android:changeBounds:parent");
        if (startParent == null) {
            return null;
        }
        if (endParent == null) {
            return null;
        }
        View view2 = endValues.f۲۶۸b;
        if (a(startParent, endParent)) {
            Rect startBounds = (Rect) startValues.f۲۶۷a.get("android:changeBounds:bounds");
            Rect endBounds = (Rect) endValues.f۲۶۷a.get("android:changeBounds:bounds");
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
            Rect startClip2 = (Rect) startValues.f۲۶۷a.get("android:changeBounds:clip");
            Rect endClip2 = (Rect) endValues.f۲۶۷a.get("android:changeBounds:clip");
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
            if (!this.M) {
                d0.a(view2, startLeft2, startTop2, startRight, startBottom);
                if (numChanges != 2) {
                    if (startLeft2 != endLeft2) {
                        view = view2;
                    } else if (startTop2 != endTop) {
                        view = view2;
                    } else {
                        view = view2;
                        anim = f.a(view, S, f().a((float) startRight, (float) startBottom, (float) endRight, (float) endBottom));
                        z = true;
                    }
                    anim = f.a(view, T, f().a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                    z = true;
                } else if (startWidth == endWidth && startHeight == endHeight) {
                    anim = f.a(view2, U, f().a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                    view = view2;
                    z = true;
                } else {
                    k viewBounds = new k(view2);
                    ObjectAnimator topLeftAnimator = f.a(viewBounds, Q, f().a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                    ObjectAnimator bottomRightAnimator = f.a(viewBounds, R, f().a((float) startRight, (float) startBottom, (float) endRight, (float) endBottom));
                    AnimatorSet set = new AnimatorSet();
                    set.playTogether(topLeftAnimator, bottomRightAnimator);
                    set.addListener(new h(this, viewBounds));
                    anim = set;
                    view = view2;
                    z = true;
                }
            } else {
                view = view2;
                d0.a(view, startLeft2, startTop2, startLeft2 + Math.max(startWidth, endWidth), startTop2 + Math.max(startHeight, endHeight));
                if (startLeft2 == endLeft2 && startTop2 == endTop) {
                    endLeft = endLeft2;
                    positionAnimator = null;
                    startTop = startTop2;
                    startLeft = startLeft2;
                } else {
                    startLeft = startLeft2;
                    startTop = startTop2;
                    endLeft = endLeft2;
                    positionAnimator = f.a(view, U, f().a((float) startLeft2, (float) startTop2, (float) endLeft2, (float) endTop));
                }
                if (startClip2 == null) {
                    i2 = 0;
                    startClip = new Rect(0, 0, startWidth, startHeight);
                } else {
                    i2 = 0;
                    startClip = startClip2;
                }
                if (endClip2 == null) {
                    endClip = new Rect(i2, i2, endWidth, endHeight);
                } else {
                    endClip = endClip2;
                }
                if (!startClip.equals(endClip)) {
                    u.a(view, startClip);
                    clipAnimator = ObjectAnimator.ofObject(view, "clipBounds", V, startClip, endClip);
                    rect = startClip;
                    z = true;
                    clipAnimator.addListener(new i(this, view, endClip2, endLeft, endTop, endRight, endBottom));
                } else {
                    z = true;
                    rect = startClip;
                    clipAnimator = null;
                }
                anim = r.a(positionAnimator, clipAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup parent = (ViewGroup) view.getParent();
                x.a(parent, z);
                a(new j(this, parent));
            }
            return anim;
        }
        int startX = ((Integer) startValues.f۲۶۷a.get("android:changeBounds:windowX")).intValue();
        int startY = ((Integer) startValues.f۲۶۷a.get("android:changeBounds:windowY")).intValue();
        int endX = ((Integer) endValues.f۲۶۷a.get("android:changeBounds:windowX")).intValue();
        int endY = ((Integer) endValues.f۲۶۷a.get("android:changeBounds:windowY")).intValue();
        if (startX == endX && startY == endY) {
            return null;
        }
        sceneRoot.getLocationInWindow(this.L);
        Bitmap bitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(bitmap));
        BitmapDrawable drawable = new BitmapDrawable(bitmap);
        float transitionAlpha = d0.c(view2);
        d0.a(view2, 0.0f);
        d0.b(sceneRoot).a(drawable);
        g f2 = f();
        int[] iArr = this.L;
        ObjectAnimator anim2 = ObjectAnimator.ofPropertyValuesHolder(drawable, i.a(P, f2.a((float) (startX - iArr[0]), (float) (startY - iArr[1]), (float) (endX - iArr[0]), (float) (endY - iArr[1]))));
        anim2.addListener(new a(this, sceneRoot, drawable, view2, transitionAlpha));
        return anim2;
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f۱۷۴a;
        private k mViewBounds = this.f۱۷۴a;

        h(c this$0, k kVar) {
            this.f۱۷۴a = kVar;
        }
    }

    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f۱۷۵a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f۱۷۶b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f۱۷۷c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f۱۷۸d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f۱۷۹e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f۱۸۰f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f۱۸۱g;

        i(c this$0, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f۱۷۶b = view;
            this.f۱۷۷c = rect;
            this.f۱۷۸d = i;
            this.f۱۷۹e = i2;
            this.f۱۸۰f = i3;
            this.f۱۸۱g = i4;
        }

        public void onAnimationCancel(Animator animation) {
            this.f۱۷۵a = true;
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f۱۷۵a) {
                u.a(this.f۱۷۶b, this.f۱۷۷c);
                d0.a(this.f۱۷۶b, this.f۱۷۸d, this.f۱۷۹e, this.f۱۸۰f, this.f۱۸۱g);
            }
        }
    }

    class j extends n {

        /* renamed from: a  reason: collision with root package name */
        boolean f۱۸۲a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f۱۸۳b;

        j(c this$0, ViewGroup viewGroup) {
            this.f۱۸۳b = viewGroup;
        }

        @Override // a.b.f.m.f
        public void b(m transition) {
            if (!this.f۱۸۲a) {
                x.a(this.f۱۸۳b, false);
            }
            transition.b(this);
        }

        @Override // a.b.f.m.f, a.b.f.n
        public void a(m transition) {
            x.a(this.f۱۸۳b, false);
        }

        @Override // a.b.f.m.f, a.b.f.n
        public void d(m transition) {
            x.a(this.f۱۸۳b, true);
        }
    }

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f۱۶۹a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f۱۷۰b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f۱۷۱c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f۱۷۲d;

        a(c this$0, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.f۱۶۹a = viewGroup;
            this.f۱۷۰b = bitmapDrawable;
            this.f۱۷۱c = view;
            this.f۱۷۲d = f2;
        }

        public void onAnimationEnd(Animator animation) {
            d0.b(this.f۱۶۹a).b(this.f۱۷۰b);
            d0.a(this.f۱۷۱c, this.f۱۷۲d);
        }
    }

    /* access modifiers changed from: private */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f۱۸۴a;

        /* renamed from: b  reason: collision with root package name */
        private int f۱۸۵b;

        /* renamed from: c  reason: collision with root package name */
        private int f۱۸۶c;

        /* renamed from: d  reason: collision with root package name */
        private int f۱۸۷d;

        /* renamed from: e  reason: collision with root package name */
        private View f۱۸۸e;

        /* renamed from: f  reason: collision with root package name */
        private int f۱۸۹f;

        /* renamed from: g  reason: collision with root package name */
        private int f۱۹۰g;

        k(View view) {
            this.f۱۸۸e = view;
        }

        /* access modifiers changed from: package-private */
        public void b(PointF topLeft) {
            this.f۱۸۴a = Math.round(topLeft.x);
            this.f۱۸۵b = Math.round(topLeft.y);
            this.f۱۸۹f++;
            if (this.f۱۸۹f == this.f۱۹۰g) {
                a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(PointF bottomRight) {
            this.f۱۸۶c = Math.round(bottomRight.x);
            this.f۱۸۷d = Math.round(bottomRight.y);
            this.f۱۹۰g++;
            if (this.f۱۸۹f == this.f۱۹۰g) {
                a();
            }
        }

        private void a() {
            d0.a(this.f۱۸۸e, this.f۱۸۴a, this.f۱۸۵b, this.f۱۸۶c, this.f۱۸۷d);
            this.f۱۸۹f = 0;
            this.f۱۹۰g = 0;
        }
    }
}
