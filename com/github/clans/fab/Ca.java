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

/* renamed from: com.github.clans.fab.a  reason: invalid class name */
public class Ca extends TextView {

    /* renamed from: u  reason: contains not printable characters */
    private static final Xfermode f۱۳۶۵۰u = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۳۶۵۱c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۳۶۵۲d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۳۶۵۳e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۳۶۵۴f;

    /* renamed from: g  reason: contains not printable characters */
    private Drawable f۱۳۶۵۵g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۳۶۵۶h = true;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۳۶۵۷i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۳۶۵۸j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۳۶۵۹k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۳۶۶۰l;

    /* renamed from: m  reason: contains not printable characters */
    private int f۱۳۶۶۱m;

    /* renamed from: n  reason: contains not printable characters */
    private int f۱۳۶۶۲n;

    /* renamed from: o  reason: contains not printable characters */
    private FloatingActionButton f۱۳۶۶۳o;

    /* renamed from: p  reason: contains not printable characters */
    private Animation f۱۳۶۶۴p;

    /* renamed from: q  reason: contains not printable characters */
    private Animation f۱۳۶۶۵q;

    /* renamed from: r  reason: contains not printable characters */
    private boolean f۱۳۶۶۶r;

    /* renamed from: s  reason: contains not printable characters */
    private boolean f۱۳۶۶۷s = true;

    /* renamed from: t  reason: contains not printable characters */
    GestureDetector f۱۳۶۶۸t = new GestureDetector(getContext(), new Cb());

    public Ca(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(m۱۶۹۴۴i(), m۱۶۹۴۲h());
    }

    /* renamed from: i  reason: contains not printable characters */
    private int m۱۶۹۴۴i() {
        if (this.f۱۳۶۵۷i == 0) {
            this.f۱۳۶۵۷i = getMeasuredWidth();
        }
        return getMeasuredWidth() + m۱۶۹۵۲b();
    }

    /* renamed from: h  reason: contains not printable characters */
    private int m۱۶۹۴۲h() {
        if (this.f۱۳۶۵۸j == 0) {
            this.f۱۳۶۵۸j = getMeasuredHeight();
        }
        return getMeasuredHeight() + m۱۶۹۴۹a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۶۹۵۲b() {
        if (this.f۱۳۶۵۶h) {
            return this.f۱۳۶۵۱c + Math.abs(this.f۱۳۶۵۲d);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۶۹۴۹a() {
        if (this.f۱۳۶۵۶h) {
            return this.f۱۳۶۵۱c + Math.abs(this.f۱۳۶۵۳e);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۶۹۵۷f() {
        LayerDrawable layerDrawable;
        if (this.f۱۳۶۵۶h) {
            LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{new Cc(this, null), m۱۶۹۴۶j()});
            layerDrawable2.setLayerInset(1, this.f۱۳۶۵۱c + Math.abs(this.f۱۳۶۵۲d), this.f۱۳۶۵۱c + Math.abs(this.f۱۳۶۵۳e), this.f۱۳۶۵۱c + Math.abs(this.f۱۳۶۵۲d), this.f۱۳۶۵۱c + Math.abs(this.f۱۳۶۵۳e));
            layerDrawable = layerDrawable2;
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{m۱۶۹۴۶j()});
        }
        setBackgroundCompat(layerDrawable);
    }

    @TargetApi(21)
    /* renamed from: j  reason: contains not printable characters */
    private Drawable m۱۶۹۴۶j() {
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(new int[]{16842919}, m۱۶۹۳۳a(this.f۱۳۶۶۰l));
        drawable.addState(new int[0], m۱۶۹۳۳a(this.f۱۳۶۵۹k));
        if (Cg.m۱۶۹۶۱b()) {
            RippleDrawable ripple = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f۱۳۶۶۱m}), drawable, null);
            setOutlineProvider(new Ca(this));
            setClipToOutline(true);
            this.f۱۳۶۵۵g = ripple;
            return ripple;
        }
        this.f۱۳۶۵۵g = drawable;
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.clans.fab.a$a  reason: invalid class name */
    public class Ca extends ViewOutlineProvider {
        Ca(Ca this$0) {
        }

        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private Drawable m۱۶۹۳۳a(int color) {
        int i = this.f۱۳۶۶۲n;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{(float) i, (float) i, (float) i, (float) i, (float) i, (float) i, (float) i, (float) i}, null, null));
        shapeDrawable.getPaint().setColor(color);
        return shapeDrawable;
    }

    private void setShadow(FloatingActionButton fab) {
        this.f۱۳۶۵۴f = fab.getShadowColor();
        this.f۱۳۶۵۱c = fab.getShadowRadius();
        this.f۱۳۶۵۲d = fab.getShadowXOffset();
        this.f۱۳۶۵۳e = fab.getShadowYOffset();
        this.f۱۳۶۵۶h = fab.m۱۶۹۰۶c();
    }

    @TargetApi(21)
    private void setBackgroundCompat(Drawable drawable) {
        if (Cg.m۱۶۹۶۰a()) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: l  reason: contains not printable characters */
    private void m۱۶۹۴۸l() {
        if (this.f۱۳۶۶۴p != null) {
            this.f۱۳۶۶۵q.cancel();
            startAnimation(this.f۱۳۶۶۴p);
        }
    }

    /* renamed from: k  reason: contains not printable characters */
    private void m۱۶۹۴۷k() {
        if (this.f۱۳۶۶۵q != null) {
            this.f۱۳۶۶۴p.cancel();
            startAnimation(this.f۱۳۶۶۵q);
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(21)
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۶۹۵۵d() {
        if (this.f۱۳۶۶۶r) {
            this.f۱۳۶۵۵g = getBackground();
        }
        Drawable drawable = this.f۱۳۶۵۵g;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{16842919});
        } else if (Cg.m۱۶۹۶۱b()) {
            Drawable drawable2 = this.f۱۳۶۵۵g;
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
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۶۹۵۶e() {
        if (this.f۱۳۶۶۶r) {
            this.f۱۳۶۵۵g = getBackground();
        }
        Drawable drawable = this.f۱۳۶۵۵g;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[0]);
        } else if (Cg.m۱۶۹۶۱b()) {
            Drawable drawable2 = this.f۱۳۶۵۵g;
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
        this.f۱۳۶۶۳o = fab;
        setShadow(fab);
    }

    /* access modifiers changed from: package-private */
    public void setShowShadow(boolean show) {
        this.f۱۳۶۵۶h = show;
    }

    /* access modifiers changed from: package-private */
    public void setCornerRadius(int cornerRadius) {
        this.f۱۳۶۶۲n = cornerRadius;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۹۵۰a(int colorNormal, int colorPressed, int colorRipple) {
        this.f۱۳۶۵۹k = colorNormal;
        this.f۱۳۶۶۰l = colorPressed;
        this.f۱۳۶۶۱m = colorRipple;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۹۵۳b(boolean animate) {
        if (animate) {
            m۱۶۹۴۸l();
        }
        setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۹۵۱a(boolean animate) {
        if (animate) {
            m۱۶۹۴۷k();
        }
        setVisibility(4);
    }

    /* access modifiers changed from: package-private */
    public void setShowAnimation(Animation showAnimation) {
        this.f۱۳۶۶۴p = showAnimation;
    }

    /* access modifiers changed from: package-private */
    public void setHideAnimation(Animation hideAnimation) {
        this.f۱۳۶۶۵q = hideAnimation;
    }

    /* access modifiers changed from: package-private */
    public void setUsingStyle(boolean usingStyle) {
        this.f۱۳۶۶۶r = usingStyle;
    }

    /* access modifiers changed from: package-private */
    public void setHandleVisibilityChanges(boolean handle) {
        this.f۱۳۶۶۷s = handle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۶۹۵۴c() {
        return this.f۱۳۶۶۷s;
    }

    public boolean onTouchEvent(MotionEvent event) {
        FloatingActionButton floatingActionButton = this.f۱۳۶۶۳o;
        if (floatingActionButton == null || floatingActionButton.getOnClickListener() == null || !this.f۱۳۶۶۳o.isEnabled()) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 1) {
            m۱۶۹۵۶e();
            this.f۱۳۶۶۳o.m۱۶۹۰۹f();
        } else if (action == 3) {
            m۱۶۹۵۶e();
            this.f۱۳۶۶۳o.m۱۶۹۰۹f();
        }
        this.f۱۳۶۶۸t.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    /* renamed from: com.github.clans.fab.a$b  reason: invalid class name */
    class Cb extends GestureDetector.SimpleOnGestureListener {
        Cb() {
        }

        public boolean onDown(MotionEvent e) {
            Ca.this.m۱۶۹۵۵d();
            if (Ca.this.f۱۳۶۶۳o != null) {
                Ca.this.f۱۳۶۶۳o.m۱۶۹۰۸e();
            }
            return super.onDown(e);
        }

        public boolean onSingleTapUp(MotionEvent e) {
            Ca.this.m۱۶۹۵۶e();
            if (Ca.this.f۱۳۶۶۳o != null) {
                Ca.this.f۱۳۶۶۳o.m۱۶۹۰۹f();
            }
            return super.onSingleTapUp(e);
        }
    }

    /* renamed from: com.github.clans.fab.a$c  reason: invalid class name */
    private class Cc extends Drawable {

        /* renamed from: a  reason: contains not printable characters */
        private Paint f۱۳۶۷۰a;

        /* renamed from: b  reason: contains not printable characters */
        private Paint f۱۳۶۷۱b;

        /* synthetic */ Cc(Ca x0, Ca x1) {
            this();
        }

        private Cc() {
            this.f۱۳۶۷۰a = new Paint(1);
            this.f۱۳۶۷۱b = new Paint(1);
            m۱۶۹۵۸a();
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۶۹۵۸a() {
            Ca.this.setLayerType(1, null);
            this.f۱۳۶۷۰a.setStyle(Paint.Style.FILL);
            this.f۱۳۶۷۰a.setColor(Ca.this.f۱۳۶۵۹k);
            this.f۱۳۶۷۱b.setXfermode(Ca.f۱۳۶۵۰u);
            if (!Ca.this.isInEditMode()) {
                this.f۱۳۶۷۰a.setShadowLayer((float) Ca.this.f۱۳۶۵۱c, (float) Ca.this.f۱۳۶۵۲d, (float) Ca.this.f۱۳۶۵۳e, Ca.this.f۱۳۶۵۴f);
            }
        }

        public void draw(Canvas canvas) {
            RectF shadowRect = new RectF((float) (Ca.this.f۱۳۶۵۱c + Math.abs(Ca.this.f۱۳۶۵۲d)), (float) (Ca.this.f۱۳۶۵۱c + Math.abs(Ca.this.f۱۳۶۵۳e)), (float) Ca.this.f۱۳۶۵۷i, (float) Ca.this.f۱۳۶۵۸j);
            canvas.drawRoundRect(shadowRect, (float) Ca.this.f۱۳۶۶۲n, (float) Ca.this.f۱۳۶۶۲n, this.f۱۳۶۷۰a);
            canvas.drawRoundRect(shadowRect, (float) Ca.this.f۱۳۶۶۲n, (float) Ca.this.f۱۳۶۶۲n, this.f۱۳۶۷۱b);
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
