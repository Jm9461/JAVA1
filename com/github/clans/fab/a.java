package com.github.clans.fab;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.widget.TextView;

public class a extends TextView {
    private static final Xfermode u = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);

    /* renamed from: c  reason: collision with root package name */
    private int f۲۸۷۶c;

    /* renamed from: d  reason: collision with root package name */
    private int f۲۸۷۷d;

    /* renamed from: e  reason: collision with root package name */
    private int f۲۸۷۸e;

    /* renamed from: f  reason: collision with root package name */
    private int f۲۸۷۹f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f۲۸۸۰g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۲۸۸۱h = true;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private FloatingActionButton o;
    private Animation p;
    private Animation q;
    private boolean r;
    private boolean s = true;
    GestureDetector t = new GestureDetector(getContext(), new b());

    public a(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(i(), h());
    }

    private int i() {
        if (this.i == 0) {
            this.i = getMeasuredWidth();
        }
        return getMeasuredWidth() + b();
    }

    private int h() {
        if (this.j == 0) {
            this.j = getMeasuredHeight();
        }
        return getMeasuredHeight() + a();
    }

    /* access modifiers changed from: package-private */
    public int b() {
        if (this.f۲۸۸۱h) {
            return this.f۲۸۷۶c + Math.abs(this.f۲۸۷۷d);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        if (this.f۲۸۸۱h) {
            return this.f۲۸۷۶c + Math.abs(this.f۲۸۷۸e);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        LayerDrawable layerDrawable;
        if (this.f۲۸۸۱h) {
            LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{new c(this, null), j()});
            layerDrawable2.setLayerInset(1, this.f۲۸۷۶c + Math.abs(this.f۲۸۷۷d), this.f۲۸۷۶c + Math.abs(this.f۲۸۷۸e), this.f۲۸۷۶c + Math.abs(this.f۲۸۷۷d), this.f۲۸۷۶c + Math.abs(this.f۲۸۷۸e));
            layerDrawable = layerDrawable2;
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{j()});
        }
        setBackgroundCompat(layerDrawable);
    }

    @TargetApi(21)
    private Drawable j() {
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(new int[]{16842919}, a(this.l));
        drawable.addState(new int[0], a(this.k));
        if (g.b()) {
            RippleDrawable ripple = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.m}), drawable, null);
            setOutlineProvider(new C۰۰۶۶a(this));
            setClipToOutline(true);
            this.f۲۸۸۰g = ripple;
            return ripple;
        }
        this.f۲۸۸۰g = drawable;
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.clans.fab.a$a  reason: collision with other inner class name */
    public class C۰۰۶۶a extends ViewOutlineProvider {
        C۰۰۶۶a(a this$0) {
        }

        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    private Drawable a(int color) {
        int i2 = this.n;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{(float) i2, (float) i2, (float) i2, (float) i2, (float) i2, (float) i2, (float) i2, (float) i2}, null, null));
        shapeDrawable.getPaint().setColor(color);
        return shapeDrawable;
    }

    private void setShadow(FloatingActionButton fab) {
        this.f۲۸۷۹f = fab.getShadowColor();
        this.f۲۸۷۶c = fab.getShadowRadius();
        this.f۲۸۷۷d = fab.getShadowXOffset();
        this.f۲۸۷۸e = fab.getShadowYOffset();
        this.f۲۸۸۱h = fab.c();
    }

    @TargetApi(21)
    private void setBackgroundCompat(Drawable drawable) {
        if (g.a()) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    private void l() {
        if (this.p != null) {
            this.q.cancel();
            startAnimation(this.p);
        }
    }

    private void k() {
        if (this.q != null) {
            this.p.cancel();
            startAnimation(this.q);
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(21)
    public void d() {
        if (this.r) {
            this.f۲۸۸۰g = getBackground();
        }
        Drawable drawable = this.f۲۸۸۰g;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{16842919});
        } else if (g.b()) {
            Drawable drawable2 = this.f۲۸۸۰g;
            if (drawable2 instanceof RippleDrawable) {
                RippleDrawable ripple = (RippleDrawable) drawable2;
                ripple.setState(new int[]{16842910, 16842919});
                ripple.setHotspot((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
                ripple.setVisible(true, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(21)
    public void e() {
        if (this.r) {
            this.f۲۸۸۰g = getBackground();
        }
        Drawable drawable = this.f۲۸۸۰g;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[0]);
        } else if (g.b()) {
            Drawable drawable2 = this.f۲۸۸۰g;
            if (drawable2 instanceof RippleDrawable) {
                RippleDrawable ripple = (RippleDrawable) drawable2;
                ripple.setState(new int[0]);
                ripple.setHotspot((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
                ripple.setVisible(true, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setFab(FloatingActionButton fab) {
        this.o = fab;
        setShadow(fab);
    }

    /* access modifiers changed from: package-private */
    public void setShowShadow(boolean show) {
        this.f۲۸۸۱h = show;
    }

    /* access modifiers changed from: package-private */
    public void setCornerRadius(int cornerRadius) {
        this.n = cornerRadius;
    }

    /* access modifiers changed from: package-private */
    public void a(int colorNormal, int colorPressed, int colorRipple) {
        this.k = colorNormal;
        this.l = colorPressed;
        this.m = colorRipple;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean animate) {
        if (animate) {
            l();
        }
        setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean animate) {
        if (animate) {
            k();
        }
        setVisibility(4);
    }

    /* access modifiers changed from: package-private */
    public void setShowAnimation(Animation showAnimation) {
        this.p = showAnimation;
    }

    /* access modifiers changed from: package-private */
    public void setHideAnimation(Animation hideAnimation) {
        this.q = hideAnimation;
    }

    /* access modifiers changed from: package-private */
    public void setUsingStyle(boolean usingStyle) {
        this.r = usingStyle;
    }

    /* access modifiers changed from: package-private */
    public void setHandleVisibilityChanges(boolean handle) {
        this.s = handle;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.s;
    }

    public boolean onTouchEvent(MotionEvent event) {
        FloatingActionButton floatingActionButton = this.o;
        if (floatingActionButton == null || floatingActionButton.getOnClickListener() == null || !this.o.isEnabled()) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 1) {
            e();
            this.o.f();
        } else if (action == 3) {
            e();
            this.o.f();
        }
        this.t.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        public boolean onDown(MotionEvent e2) {
            a.this.d();
            if (a.this.o != null) {
                a.this.o.e();
            }
            return super.onDown(e2);
        }

        public boolean onSingleTapUp(MotionEvent e2) {
            a.this.e();
            if (a.this.o != null) {
                a.this.o.f();
            }
            return super.onSingleTapUp(e2);
        }
    }

    private class c extends Drawable {

        /* renamed from: a  reason: collision with root package name */
        private Paint f۲۸۸۳a;

        /* renamed from: b  reason: collision with root package name */
        private Paint f۲۸۸۴b;

        /* synthetic */ c(a x0, C۰۰۶۶a x1) {
            this();
        }

        private c() {
            this.f۲۸۸۳a = new Paint(1);
            this.f۲۸۸۴b = new Paint(1);
            a();
        }

        private void a() {
            a.this.setLayerType(1, null);
            this.f۲۸۸۳a.setStyle(Paint.Style.FILL);
            this.f۲۸۸۳a.setColor(a.this.k);
            this.f۲۸۸۴b.setXfermode(a.u);
            if (!a.this.isInEditMode()) {
                this.f۲۸۸۳a.setShadowLayer((float) a.this.f۲۸۷۶c, (float) a.this.f۲۸۷۷d, (float) a.this.f۲۸۷۸e, a.this.f۲۸۷۹f);
            }
        }

        public void draw(Canvas canvas) {
            RectF shadowRect = new RectF((float) (a.this.f۲۸۷۶c + Math.abs(a.this.f۲۸۷۷d)), (float) (a.this.f۲۸۷۶c + Math.abs(a.this.f۲۸۷۸e)), (float) a.this.i, (float) a.this.j);
            canvas.drawRoundRect(shadowRect, (float) a.this.n, (float) a.this.n, this.f۲۸۸۳a);
            canvas.drawRoundRect(shadowRect, (float) a.this.n, (float) a.this.n, this.f۲۸۸۴b);
        }

        public void setAlpha(int alpha) {
        }

        public void setColorFilter(ColorFilter cf) {
        }

        public int getOpacity() {
            return 0;
        }
    }
}
