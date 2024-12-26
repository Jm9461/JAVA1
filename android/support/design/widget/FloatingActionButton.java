package android.support.design.widget;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.design.internal.Cg;
import android.support.design.internal.Ch;
import android.support.design.widget.Cl;
import android.support.design.widget.CoordinatorLayout;
import android.support.p۰۴۳v4.view.AbstractCt;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.widget.AbstractCr;
import android.support.p۰۴۷v7.widget.Cn;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cb;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cd;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cj;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۳o.AbstractCa;

@CoordinatorLayout.AbstractCd(Behavior.class)
public class FloatingActionButton extends Ca0 implements AbstractCt, AbstractCr, AbstractCa {

    /* renamed from: d  reason: contains not printable characters */
    private ColorStateList f۹۶۵۵d;

    /* renamed from: e  reason: contains not printable characters */
    private PorterDuff.Mode f۹۶۵۶e;

    /* renamed from: f  reason: contains not printable characters */
    private ColorStateList f۹۶۵۷f;

    /* renamed from: g  reason: contains not printable characters */
    private PorterDuff.Mode f۹۶۵۸g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۹۶۵۹h;

    /* renamed from: i  reason: contains not printable characters */
    private ColorStateList f۹۶۶۰i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۹۶۶۱j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۹۶۶۲k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۹۶۶۳l;

    /* renamed from: m  reason: contains not printable characters */
    private int f۹۶۶۴m;

    /* renamed from: n  reason: contains not printable characters */
    boolean f۹۶۶۵n;

    /* renamed from: o  reason: contains not printable characters */
    final Rect f۹۶۶۶o;

    /* renamed from: p  reason: contains not printable characters */
    private final Rect f۹۶۶۷p;

    /* renamed from: q  reason: contains not printable characters */
    private final Cn f۹۶۶۸q;

    /* renamed from: r  reason: contains not printable characters */
    private final p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۳o.Cc f۹۶۶۹r;

    /* renamed from: s  reason: contains not printable characters */
    private Cl f۹۶۷۰s;

    /* renamed from: android.support.design.widget.FloatingActionButton$b  reason: invalid class name */
    public static abstract class AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۱۶۴۱a(FloatingActionButton floatingActionButton);

        /* renamed from: b  reason: contains not printable characters */
        public abstract void m۱۱۶۴۲b(FloatingActionButton floatingActionButton);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attrs) {
        this(context, attrs, Cb.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۹۶۶۶o = new Rect();
        this.f۹۶۶۷p = new Rect();
        TypedArray a = Cg.m۱۱۳۶۰c(context, attrs, Ck.FloatingActionButton, defStyleAttr, Cj.Widget_Design_FloatingActionButton, new int[0]);
        this.f۹۶۵۵d = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۴p.Ca.m۱۰۰۳۰a(context, a, Ck.FloatingActionButton_backgroundTint);
        this.f۹۶۵۶e = Ch.m۱۱۳۶۲a(a.getInt(Ck.FloatingActionButton_backgroundTintMode, -1), null);
        this.f۹۶۶۰i = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۴p.Ca.m۱۰۰۳۰a(context, a, Ck.FloatingActionButton_rippleColor);
        this.f۹۶۶۱j = a.getInt(Ck.FloatingActionButton_fabSize, -1);
        this.f۹۶۶۲k = a.getDimensionPixelSize(Ck.FloatingActionButton_fabCustomSize, 0);
        this.f۹۶۵۹h = a.getDimensionPixelSize(Ck.FloatingActionButton_borderWidth, 0);
        float elevation = a.getDimension(Ck.FloatingActionButton_elevation, 0.0f);
        float hoveredFocusedTranslationZ = a.getDimension(Ck.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float pressedTranslationZ = a.getDimension(Ck.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f۹۶۶۵n = a.getBoolean(Ck.FloatingActionButton_useCompatPadding, false);
        this.f۹۶۶۴m = a.getDimensionPixelSize(Ck.FloatingActionButton_maxImageSize, 0);
        p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch showMotionSpec = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch.m۹۹۵۶a(context, a, Ck.FloatingActionButton_showMotionSpec);
        p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch hideMotionSpec = p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch.m۹۹۵۶a(context, a, Ck.FloatingActionButton_hideMotionSpec);
        a.recycle();
        this.f۹۶۶۸q = new Cn(this);
        this.f۹۶۶۸q.m۱۵۴۴۹a(attrs, defStyleAttr);
        this.f۹۶۶۹r = new p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۳o.Cc(this);
        getImpl().m۱۱۸۸۵a(this.f۹۶۵۵d, this.f۹۶۵۶e, this.f۹۶۶۰i, this.f۹۶۵۹h);
        getImpl().m۱۱۸۷۹a(elevation);
        getImpl().m۱۱۸۹۱b(hoveredFocusedTranslationZ);
        getImpl().m۱۱۹۰۱d(pressedTranslationZ);
        getImpl().m۱۱۸۸۱a(this.f۹۶۶۴m);
        getImpl().m۱۱۸۹۲b(showMotionSpec);
        getImpl().m۱۱۸۸۲a(hideMotionSpec);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int preferredSize = getSizeDimension();
        this.f۹۶۶۳l = (preferredSize - this.f۹۶۶۴m) / 2;
        getImpl().m۱۱۹۱۷s();
        int d = Math.min(m۱۱۶۱۰a(preferredSize, widthMeasureSpec), m۱۱۶۱۰a(preferredSize, heightMeasureSpec));
        Rect rect = this.f۹۶۶۶o;
        setMeasuredDimension(rect.left + d + rect.right, rect.top + d + rect.bottom);
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f۹۶۶۰i;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f۹۶۶۰i;
    }

    public void setRippleColor(int color) {
        setRippleColor(ColorStateList.valueOf(color));
    }

    public void setRippleColor(ColorStateList color) {
        if (this.f۹۶۶۰i != color) {
            this.f۹۶۶۰i = color;
            getImpl().m۱۱۸۹۴b(this.f۹۶۶۰i);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f۹۶۵۵d;
    }

    public void setBackgroundTintList(ColorStateList tint) {
        if (this.f۹۶۵۵d != tint) {
            this.f۹۶۵۵d = tint;
            getImpl().m۱۱۸۸۴a(tint);
        }
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f۹۶۵۶e;
    }

    public void setBackgroundTintMode(PorterDuff.Mode tintMode) {
        if (this.f۹۶۵۶e != tintMode) {
            this.f۹۶۵۶e = tintMode;
            getImpl().m۱۱۸۸۶a(tintMode);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintList(ColorStateList tint) {
        setBackgroundTintList(tint);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        setBackgroundTintMode(tintMode);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCt
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCr
    public void setSupportImageTintList(ColorStateList tint) {
        if (this.f۹۶۵۷f != tint) {
            this.f۹۶۵۷f = tint;
            m۱۱۶۱۶d();
        }
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCr
    public ColorStateList getSupportImageTintList() {
        return this.f۹۶۵۷f;
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCr
    public void setSupportImageTintMode(PorterDuff.Mode tintMode) {
        if (this.f۹۶۵۸g != tintMode) {
            this.f۹۶۵۸g = tintMode;
            m۱۱۶۱۶d();
        }
    }

    @Override // android.support.p۰۴۳v4.widget.AbstractCr
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f۹۶۵۸g;
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۱۶۱۶d() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f۹۶۵۷f;
            if (colorStateList == null) {
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۱۵b(drawable);
                return;
            }
            int color = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f۹۶۵۸g;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(android.support.p۰۴۷v7.widget.Cj.m۱۵۲۸۳a(color, mode));
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int resid) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundColor(int color) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setImageResource(int resId) {
        this.f۹۶۶۸q.m۱۵۴۴۶a(resId);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().m۱۱۹۱۶r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۶۲۳b(AbstractCb listener, boolean fromUser) {
        getImpl().m۱۱۸۹۶b(m۱۱۶۱۲a(listener), fromUser);
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۶۲۱b(Animator.AnimatorListener listener) {
        getImpl().m۱۱۸۹۳b(listener);
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۱۶۲۶d(Animator.AnimatorListener listener) {
        getImpl().m۱۱۹۰۲d(listener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۶۱۸a(AbstractCb listener, boolean fromUser) {
        getImpl().m۱۱۸۸۸a(m۱۱۶۱۲a(listener), fromUser);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۶۱۷a(Animator.AnimatorListener listener) {
        getImpl().m۱۱۸۸۳a(listener);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۶۲۵c(Animator.AnimatorListener listener) {
        getImpl().m۱۱۸۹۹c(listener);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۳o.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۶۱۹a() {
        return this.f۹۶۶۹r.m۱۰۰۲۸b();
    }

    public void setExpandedComponentIdHint(int expandedComponentIdHint) {
        this.f۹۶۶۹r.m۱۰۰۲۶a(expandedComponentIdHint);
    }

    public int getExpandedComponentIdHint() {
        return this.f۹۶۶۹r.m۱۰۰۲۵a();
    }

    public void setUseCompatPadding(boolean useCompatPadding) {
        if (this.f۹۶۶۵n != useCompatPadding) {
            this.f۹۶۶۵n = useCompatPadding;
            getImpl().m۱۱۹۱۲n();
        }
    }

    public boolean getUseCompatPadding() {
        return this.f۹۶۶۵n;
    }

    public void setSize(int size) {
        this.f۹۶۶۲k = 0;
        if (size != this.f۹۶۶۱j) {
            this.f۹۶۶۱j = size;
            requestLayout();
        }
    }

    public int getSize() {
        return this.f۹۶۶۱j;
    }

    /* renamed from: a  reason: contains not printable characters */
    private Cl.AbstractCg m۱۱۶۱۲a(AbstractCb listener) {
        if (listener == null) {
            return null;
        }
        return new Ca(listener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.FloatingActionButton$a  reason: invalid class name */
    public class Ca implements Cl.AbstractCg {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ AbstractCb f۹۶۷۴a;

        Ca(AbstractCb bVar) {
            this.f۹۶۷۴a = bVar;
        }

        @Override // android.support.design.widget.Cl.AbstractCg
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۶۳۹a() {
            this.f۹۶۷۴a.m۱۱۶۴۲b(FloatingActionButton.this);
        }

        @Override // android.support.design.widget.Cl.AbstractCg
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۱۶۴۰b() {
            this.f۹۶۷۴a.m۱۱۶۴۱a(FloatingActionButton.this);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۶۲۴b() {
        return getImpl().m۱۱۹۰۷i();
    }

    public void setCustomSize(int size) {
        if (size >= 0) {
            this.f۹۶۶۲k = size;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public int getCustomSize() {
        return this.f۹۶۶۲k;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m۱۱۶۰۹a(this.f۹۶۶۱j);
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۱۶۰۹a(int size) {
        int i = this.f۹۶۶۲k;
        if (i != 0) {
            return i;
        }
        Resources res = getResources();
        if (size != -1) {
            if (size != 1) {
                return res.getDimensionPixelSize(Cd.design_fab_size_normal);
            }
            return res.getDimensionPixelSize(Cd.design_fab_size_mini);
        } else if (Math.max(res.getConfiguration().screenWidthDp, res.getConfiguration().screenHeightDp) < 470) {
            return m۱۱۶۰۹a(1);
        } else {
            return m۱۱۶۰۹a(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m۱۱۹۱۱m();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m۱۱۹۱۳o();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().m۱۱۸۸۹a(getDrawableState());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().m۱۱۹۰۸j();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۸t.Ca state = new p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۸t.Ca(super.onSaveInstanceState());
        state.f۸۳۲۸e.put("expandableWidgetHelper", this.f۹۶۶۹r.m۱۰۰۲۹c());
        return state;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۸t.Ca)) {
            super.onRestoreInstanceState(state);
            return;
        }
        p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۸t.Ca ess = (p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۸t.Ca) state;
        super.onRestoreInstanceState(ess.m۱۲۷۹۱a());
        this.f۹۶۶۹r.m۱۰۰۲۷a(ess.f۸۳۲۸e.get("expandableWidgetHelper"));
    }

    @Deprecated
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۶۲۰a(Rect rect) {
        if (!Cu.m۱۳۰۲۸y(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m۱۱۶۱۵c(rect);
        return true;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۶۲۲b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m۱۱۶۱۵c(rect);
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۱۶۱۵c(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f۹۶۶۶o;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public Drawable getContentBackground() {
        return getImpl().m۱۱۸۹۰b();
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۱۶۱۰a(int desiredSize, int measureSpec) {
        int specMode = View.MeasureSpec.getMode(measureSpec);
        int specSize = View.MeasureSpec.getSize(measureSpec);
        if (specMode == Integer.MIN_VALUE) {
            return Math.min(desiredSize, specSize);
        }
        if (specMode == 0) {
            return desiredSize;
        }
        if (specMode == 1073741824) {
            return specSize;
        }
        throw new IllegalArgumentException();
    }

    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() != 0 || !m۱۱۶۲۰a(this.f۹۶۶۷p) || this.f۹۶۶۷p.contains((int) ev.getX(), (int) ev.getY())) {
            return super.onTouchEvent(ev);
        }
        return false;
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractCc<T> {

        /* renamed from: a  reason: contains not printable characters */
        private Rect f۹۶۷۱a;

        /* renamed from: b  reason: contains not printable characters */
        private AbstractCb f۹۶۷۲b;

        /* renamed from: c  reason: contains not printable characters */
        private boolean f۹۶۷۳c;

        public BaseBehavior() {
            this.f۹۶۷۳c = true;
        }

        public BaseBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a = context.obtainStyledAttributes(attrs, Ck.FloatingActionButton_Behavior_Layout);
            this.f۹۶۷۳c = a.getBoolean(Ck.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            a.recycle();
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۶۳۲a(CoordinatorLayout.Cf lp) {
            if (lp.f۹۶۴۳h == 0) {
                lp.f۹۶۴۳h = 80;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۶۳۸b(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
            if (dependency instanceof AppBarLayout) {
                m۱۱۶۲۸a(parent, (AppBarLayout) dependency, child);
                return false;
            } else if (!m۱۱۶۲۹a(dependency)) {
                return false;
            } else {
                m۱۱۶۳۱b(dependency, child);
                return false;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private static boolean m۱۱۶۲۹a(View view) {
            ViewGroup.LayoutParams lp = view.getLayoutParams();
            if (lp instanceof CoordinatorLayout.Cf) {
                return ((CoordinatorLayout.Cf) lp).m۱۱۶۰۳d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        private boolean m۱۱۶۳۰a(View dependency, FloatingActionButton child) {
            CoordinatorLayout.Cf lp = (CoordinatorLayout.Cf) child.getLayoutParams();
            if (this.f۹۶۷۳c && lp.m۱۱۶۰۲c() == dependency.getId() && child.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        private boolean m۱۱۶۲۸a(CoordinatorLayout parent, AppBarLayout appBarLayout, FloatingActionButton child) {
            if (!m۱۱۶۳۰a(appBarLayout, child)) {
                return false;
            }
            if (this.f۹۶۷۱a == null) {
                this.f۹۶۷۱a = new Rect();
            }
            Rect rect = this.f۹۶۷۱a;
            Cj.m۱۱۸۶۴a(parent, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                child.m۱۱۶۱۸a(this.f۹۶۷۲b, false);
                return true;
            }
            child.m۱۱۶۲۳b(this.f۹۶۷۲b, false);
            return true;
        }

        /* renamed from: b  reason: contains not printable characters */
        private boolean m۱۱۶۳۱b(View bottomSheet, FloatingActionButton child) {
            if (!m۱۱۶۳۰a(bottomSheet, child)) {
                return false;
            }
            if (bottomSheet.getTop() < (child.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.Cf) child.getLayoutParams())).topMargin) {
                child.m۱۱۶۱۸a(this.f۹۶۷۲b, false);
                return true;
            }
            child.m۱۱۶۲۳b(this.f۹۶۷۲b, false);
            return true;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۶۳۶a(CoordinatorLayout parent, FloatingActionButton child, int layoutDirection) {
            List<View> dependencies = parent.m۱۱۵۴۸b(child);
            int count = dependencies.size();
            for (int i = 0; i < count; i++) {
                View dependency = dependencies.get(i);
                if (!(dependency instanceof AppBarLayout)) {
                    if (m۱۱۶۲۹a(dependency) && m۱۱۶۳۱b(dependency, child)) {
                        break;
                    }
                } else if (m۱۱۶۲۸a(parent, (AppBarLayout) dependency, child)) {
                    break;
                }
            }
            parent.m۱۱۵۵۵c(child, layoutDirection);
            m۱۱۶۲۷a(parent, child);
            return true;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۶۳۷a(CoordinatorLayout parent, FloatingActionButton child, Rect rect) {
            Rect shadowPadding = child.f۹۶۶۶o;
            rect.set(child.getLeft() + shadowPadding.left, child.getTop() + shadowPadding.top, child.getRight() - shadowPadding.right, child.getBottom() - shadowPadding.bottom);
            return true;
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۱۶۲۷a(CoordinatorLayout parent, FloatingActionButton fab) {
            Rect padding = fab.f۹۶۶۶o;
            if (padding != null && padding.centerX() > 0 && padding.centerY() > 0) {
                CoordinatorLayout.Cf lp = (CoordinatorLayout.Cf) fab.getLayoutParams();
                int offsetTB = 0;
                int offsetLR = 0;
                if (fab.getRight() >= parent.getWidth() - ((ViewGroup.MarginLayoutParams) lp).rightMargin) {
                    offsetLR = padding.right;
                } else if (fab.getLeft() <= ((ViewGroup.MarginLayoutParams) lp).leftMargin) {
                    offsetLR = -padding.left;
                }
                if (fab.getBottom() >= parent.getHeight() - ((ViewGroup.MarginLayoutParams) lp).bottomMargin) {
                    offsetTB = padding.bottom;
                } else if (fab.getTop() <= ((ViewGroup.MarginLayoutParams) lp).topMargin) {
                    offsetTB = -padding.top;
                }
                if (offsetTB != 0) {
                    Cu.m۱۳۰۰۳d(fab, offsetTB);
                }
                if (offsetLR != 0) {
                    Cu.m۱۳۰۰۱c(fab, offsetLR);
                }
            }
        }
    }

    public float getCompatElevation() {
        return getImpl().m۱۱۸۹۷c();
    }

    public void setCompatElevation(float elevation) {
        getImpl().m۱۱۸۷۹a(elevation);
    }

    public void setCompatElevationResource(int id) {
        setCompatElevation(getResources().getDimension(id));
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m۱۱۹۰۳e();
    }

    public void setCompatHoveredFocusedTranslationZ(float translationZ) {
        getImpl().m۱۱۸۹۱b(translationZ);
    }

    public void setCompatHoveredFocusedTranslationZResource(int id) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(id));
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m۱۱۹۰۴f();
    }

    public void setCompatPressedTranslationZ(float translationZ) {
        getImpl().m۱۱۹۰۱d(translationZ);
    }

    public void setCompatPressedTranslationZResource(int id) {
        setCompatPressedTranslationZ(getResources().getDimension(id));
    }

    public p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch getShowMotionSpec() {
        return getImpl().m۱۱۹۰۵g();
    }

    public void setShowMotionSpec(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch spec) {
        getImpl().m۱۱۸۹۲b(spec);
    }

    public void setShowMotionSpecResource(int id) {
        setShowMotionSpec(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch.m۹۹۵۵a(getContext(), id));
    }

    public p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch getHideMotionSpec() {
        return getImpl().m۱۱۹۰۰d();
    }

    public void setHideMotionSpec(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch spec) {
        getImpl().m۱۱۸۸۲a(spec);
    }

    public void setHideMotionSpecResource(int id) {
        setHideMotionSpec(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ch.m۹۹۵۵a(getContext(), id));
    }

    private Cl getImpl() {
        if (this.f۹۶۷۰s == null) {
            this.f۹۶۷۰s = m۱۱۶۱۴c();
        }
        return this.f۹۶۷۰s;
    }

    /* renamed from: c  reason: contains not printable characters */
    private Cl m۱۱۶۱۴c() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new Cm(this, new Cc());
        }
        return new Cl(this, new Cc());
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.widget.FloatingActionButton$c  reason: invalid class name */
    public class Cc implements AbstractCs {
        Cc() {
        }

        @Override // android.support.design.widget.AbstractCs
        /* renamed from: a  reason: contains not printable characters */
        public float m۱۱۶۴۳a() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        @Override // android.support.design.widget.AbstractCs
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۶۴۴a(int left, int top, int right, int bottom) {
            FloatingActionButton.this.f۹۶۶۶o.set(left, top, right, bottom);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(floatingActionButton.f۹۶۶۳l + left, FloatingActionButton.this.f۹۶۶۳l + top, FloatingActionButton.this.f۹۶۶۳l + right, FloatingActionButton.this.f۹۶۶۳l + bottom);
        }

        @Override // android.support.design.widget.AbstractCs
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۶۴۵a(Drawable background) {
            FloatingActionButton.super.setBackgroundDrawable(background);
        }

        @Override // android.support.design.widget.AbstractCs
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۱۶۴۶b() {
            return FloatingActionButton.this.f۹۶۶۵n;
        }
    }
}
