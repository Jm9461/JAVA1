package android.support.p۰۴۳v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p۰۴۳v4.view.AbstractCj;
import android.support.p۰۴۳v4.view.AbstractCm;
import android.support.p۰۴۳v4.view.AbstractCs;
import android.support.p۰۴۳v4.view.Cb;
import android.support.p۰۴۳v4.view.Cl;
import android.support.p۰۴۳v4.view.Co;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Ce;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.List;

/* renamed from: android.support.v4.widget.NestedScrollView */
public class NestedScrollView extends FrameLayout implements AbstractCm, AbstractCj, AbstractCs {

    /* renamed from: C  reason: contains not printable characters */
    private static final Ca f۱۰۷۰۴C = new Ca();

    /* renamed from: D  reason: contains not printable characters */
    private static final int[] f۱۰۷۰۵D = {16843130};

    /* renamed from: A  reason: contains not printable characters */
    private float f۱۰۷۰۶A;

    /* renamed from: B  reason: contains not printable characters */
    private AbstractCb f۱۰۷۰۷B;

    /* renamed from: c  reason: contains not printable characters */
    private long f۱۰۷۰۸c;

    /* renamed from: d  reason: contains not printable characters */
    private final Rect f۱۰۷۰۹d;

    /* renamed from: e  reason: contains not printable characters */
    private OverScroller f۱۰۷۱۰e;

    /* renamed from: f  reason: contains not printable characters */
    private EdgeEffect f۱۰۷۱۱f;

    /* renamed from: g  reason: contains not printable characters */
    private EdgeEffect f۱۰۷۱۲g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۰۷۱۳h;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۱۰۷۱۴i;

    /* renamed from: j  reason: contains not printable characters */
    private boolean f۱۰۷۱۵j;

    /* renamed from: k  reason: contains not printable characters */
    private View f۱۰۷۱۶k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۰۷۱۷l;

    /* renamed from: m  reason: contains not printable characters */
    private VelocityTracker f۱۰۷۱۸m;

    /* renamed from: n  reason: contains not printable characters */
    private boolean f۱۰۷۱۹n;

    /* renamed from: o  reason: contains not printable characters */
    private boolean f۱۰۷۲۰o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۰۷۲۱p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۰۷۲۲q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۰۷۲۳r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۰۷۲۴s;

    /* renamed from: t  reason: contains not printable characters */
    private final int[] f۱۰۷۲۵t;

    /* renamed from: u  reason: contains not printable characters */
    private final int[] f۱۰۷۲۶u;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۰۷۲۷v;

    /* renamed from: w  reason: contains not printable characters */
    private int f۱۰۷۲۸w;

    /* renamed from: x  reason: contains not printable characters */
    private Cc f۱۰۷۲۹x;

    /* renamed from: y  reason: contains not printable characters */
    private final Co f۱۰۷۳۰y;

    /* renamed from: z  reason: contains not printable characters */
    private final Cl f۱۰۷۳۱z;

    /* renamed from: android.support.v4.widget.NestedScrollView$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۳۱۸۵a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NestedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۰۷۰۹d = new Rect();
        this.f۱۰۷۱۴i = true;
        this.f۱۰۷۱۵j = false;
        this.f۱۰۷۱۶k = null;
        this.f۱۰۷۱۷l = false;
        this.f۱۰۷۲۰o = true;
        this.f۱۰۷۲۴s = -1;
        this.f۱۰۷۲۵t = new int[2];
        this.f۱۰۷۲۶u = new int[2];
        m۱۳۱۵۸e();
        TypedArray a = context.obtainStyledAttributes(attrs, f۱۰۷۰۵D, defStyleAttr, 0);
        setFillViewport(a.getBoolean(0, false));
        a.recycle();
        this.f۱۰۷۳۰y = new Co(this);
        this.f۱۰۷۳۱z = new Cl(this);
        setNestedScrollingEnabled(true);
        Cu.m۱۲۹۸۵a(this, f۱۰۷۰۴C);
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۳۱۷۸c(int axes, int type) {
        return this.f۱۰۷۳۱z.m۱۲۹۳۲a(axes, type);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCj
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۱۶۴a(int type) {
        this.f۱۰۷۳۱z.m۱۲۹۴۰c(type);
    }

    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۳۱۸۰e(int type) {
        return this.f۱۰۷۳۱z.m۱۲۹۳۱a(type);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۱۷۱a(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return this.f۱۰۷۳۱z.m۱۲۹۳۴a(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۱۷۲a(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return this.f۱۰۷۳۱z.m۱۲۹۳۶a(dx, dy, consumed, offsetInWindow, type);
    }

    public void setNestedScrollingEnabled(boolean enabled) {
        this.f۱۰۷۳۱z.m۱۲۹۲۷a(enabled);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCk
    public boolean isNestedScrollingEnabled() {
        return this.f۱۰۷۳۱z.m۱۲۹۳۷b();
    }

    public boolean startNestedScroll(int axes) {
        return m۱۳۱۷۸c(axes, 0);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCk
    public void stopNestedScroll() {
        m۱۳۱۶۴a(0);
    }

    public boolean hasNestedScrollingParent() {
        return m۱۳۱۸۰e(0);
    }

    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return m۱۳۱۷۱a(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, 0);
    }

    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return m۱۳۱۷۲a(dx, dy, consumed, offsetInWindow, 0);
    }

    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return this.f۱۰۷۳۱z.m۱۲۹۳۰a(velocityX, velocityY, consumed);
    }

    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return this.f۱۰۷۳۱z.m۱۲۹۲۹a(velocityX, velocityY);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCm
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۱۷۶b(View child, View target, int axes, int type) {
        return (axes & 2) != 0;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۱۶۹a(View child, View target, int axes, int type) {
        this.f۱۰۷۳۰y.m۱۲۹۴۹a(child, target, axes, type);
        m۱۳۱۷۸c(2, type);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۱۶۶a(View target, int type) {
        this.f۱۰۷۳۰y.m۱۲۹۴۷a(target, type);
        m۱۳۱۶۴a(type);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۱۶۷a(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        int oldScrollY = getScrollY();
        scrollBy(0, dyUnconsumed);
        int myConsumed = getScrollY() - oldScrollY;
        m۱۳۱۷۱a(0, myConsumed, 0, dyUnconsumed - myConsumed, (int[]) null, type);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCm
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۱۶۸a(View target, int dx, int dy, int[] consumed, int type) {
        m۱۳۱۷۲a(dx, dy, consumed, (int[]) null, type);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return m۱۳۱۷۶b(child, target, nestedScrollAxes, 0);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes) {
        m۱۳۱۶۹a(child, target, nestedScrollAxes, 0);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public void onStopNestedScroll(View target) {
        m۱۳۱۶۶a(target, 0);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        m۱۳۱۶۷a(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, 0);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        m۱۳۱۶۸a(target, dx, dy, consumed, 0);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (consumed) {
            return false;
        }
        m۱۳۱۶۲h((int) velocityY);
        return true;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return dispatchNestedPreFling(velocityX, velocityY);
    }

    public int getNestedScrollAxes() {
        return this.f۱۰۷۳۰y.m۱۲۹۴۶a();
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int length = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < length) {
            return ((float) scrollY) / ((float) length);
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View child = getChildAt(0);
        int length = getVerticalFadingEdgeLength();
        int span = ((child.getBottom() + ((FrameLayout.LayoutParams) child.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (span < length) {
            return ((float) span) / ((float) length);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۳۱۵۸e() {
        this.f۱۰۷۱۰e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration configuration = ViewConfiguration.get(getContext());
        this.f۱۰۷۲۱p = configuration.getScaledTouchSlop();
        this.f۱۰۷۲۲q = configuration.getScaledMinimumFlingVelocity();
        this.f۱۰۷۲۳r = configuration.getScaledMaximumFlingVelocity();
    }

    public void addView(View child) {
        if (getChildCount() <= 0) {
            super.addView(child);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        if (getChildCount() <= 0) {
            super.addView(child, index);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, params);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, index, params);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(AbstractCb l) {
        this.f۱۰۷۰۷B = l;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۱۴۷a() {
        if (getChildCount() <= 0) {
            return false;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        if (child.getHeight() + lp.topMargin + lp.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    public void setFillViewport(boolean fillViewport) {
        if (fillViewport != this.f۱۰۷۱۹n) {
            this.f۱۰۷۱۹n = fillViewport;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) {
        this.f۱۰۷۲۰o = smoothScrollingEnabled;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        AbstractCb bVar = this.f۱۰۷۰۷B;
        if (bVar != null) {
            bVar.m۱۳۱۸۵a(this, l, t, oldl, oldt);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f۱۰۷۱۹n && View.MeasureSpec.getMode(heightMeasureSpec) != 0 && getChildCount() > 0) {
            View child = getChildAt(0);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
            int childSize = child.getMeasuredHeight();
            int parentSpace = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - lp.topMargin) - lp.bottomMargin;
            if (childSize < parentSpace) {
                child.measure(FrameLayout.getChildMeasureSpec(widthMeasureSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin, lp.width), View.MeasureSpec.makeMeasureSpec(parentSpace, 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event) || m۱۳۱۷۳a(event);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۱۷۳a(KeyEvent event) {
        this.f۱۰۷۰۹d.setEmpty();
        int i = 130;
        if (!m۱۳۱۴۷a()) {
            if (!isFocused() || event.getKeyCode() == 4) {
                return false;
            }
            View currentFocused = findFocus();
            if (currentFocused == this) {
                currentFocused = null;
            }
            View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, 130);
            if (nextFocused == null || nextFocused == this || !nextFocused.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (event.getAction() != 0) {
            return false;
        } else {
            int keyCode = event.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (event.isShiftPressed()) {
                        i = 33;
                    }
                    m۱۳۱۸۱f(i);
                    return false;
                } else if (!event.isAltPressed()) {
                    return m۱۳۱۷۵b(130);
                } else {
                    return m۱۳۱۷۹d(130);
                }
            } else if (!event.isAltPressed()) {
                return m۱۳۱۷۵b(33);
            } else {
                return m۱۳۱۷۹d(33);
            }
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۳۱۵۷d(int x, int y) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View child = getChildAt(0);
        if (y < child.getTop() - scrollY || y >= child.getBottom() - scrollY || x < child.getLeft() || x >= child.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۳۱۵۶d() {
        VelocityTracker velocityTracker = this.f۱۰۷۱۸m;
        if (velocityTracker == null) {
            this.f۱۰۷۱۸m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۳۱۵۹f() {
        if (this.f۱۰۷۱۸m == null) {
            this.f۱۰۷۱۸m = VelocityTracker.obtain();
        }
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۳۱۶۰g() {
        VelocityTracker velocityTracker = this.f۱۰۷۱۸m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f۱۰۷۱۸m = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (disallowIntercept) {
            m۱۳۱۶۰g();
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if (action == 2 && this.f۱۰۷۱۷l) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int activePointerId = this.f۱۰۷۲۴s;
                    if (activePointerId != -1) {
                        int pointerIndex = ev.findPointerIndex(activePointerId);
                        if (pointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + activePointerId + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) ev.getY(pointerIndex);
                            if (Math.abs(y - this.f۱۰۷۱۳h) > this.f۱۰۷۲۱p && (2 & getNestedScrollAxes()) == 0) {
                                this.f۱۰۷۱۷l = true;
                                this.f۱۰۷۱۳h = y;
                                m۱۳۱۵۹f();
                                this.f۱۰۷۱۸m.addMovement(ev);
                                this.f۱۰۷۲۷v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m۱۳۱۴۶a(ev);
                    }
                }
            }
            this.f۱۰۷۱۷l = false;
            this.f۱۰۷۲۴s = -1;
            m۱۳۱۶۰g();
            if (this.f۱۰۷۱۰e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                Cu.m۱۲۹۷۰B(this);
            }
            m۱۳۱۶۴a(0);
        } else {
            int y2 = (int) ev.getY();
            if (!m۱۳۱۵۷d((int) ev.getX(), y2)) {
                this.f۱۰۷۱۷l = false;
                m۱۳۱۶۰g();
            } else {
                this.f۱۰۷۱۳h = y2;
                this.f۱۰۷۲۴s = ev.getPointerId(0);
                m۱۳۱۵۶d();
                this.f۱۰۷۱۸m.addMovement(ev);
                this.f۱۰۷۱۰e.computeScrollOffset();
                this.f۱۰۷۱۷l = true ^ this.f۱۰۷۱۰e.isFinished();
                m۱۳۱۷۸c(2, 0);
            }
        }
        return this.f۱۰۷۱۷l;
    }

    public boolean onTouchEvent(MotionEvent ev) {
        boolean z;
        ViewParent parent;
        m۱۳۱۵۹f();
        MotionEvent vtev = MotionEvent.obtain(ev);
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.f۱۰۷۲۷v = 0;
        }
        vtev.offsetLocation(0.0f, (float) this.f۱۰۷۲۷v);
        if (actionMasked == 0) {
            z = true;
            if (getChildCount() == 0) {
                return false;
            }
            boolean z2 = !this.f۱۰۷۱۰e.isFinished();
            this.f۱۰۷۱۷l = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f۱۰۷۱۰e.isFinished()) {
                this.f۱۰۷۱۰e.abortAnimation();
            }
            this.f۱۰۷۱۳h = (int) ev.getY();
            this.f۱۰۷۲۴s = ev.getPointerId(0);
            m۱۳۱۷۸c(2, 0);
        } else if (actionMasked == 1) {
            z = true;
            VelocityTracker velocityTracker = this.f۱۰۷۱۸m;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f۱۰۷۲۳r);
            int initialVelocity = (int) velocityTracker.getYVelocity(this.f۱۰۷۲۴s);
            if (Math.abs(initialVelocity) > this.f۱۰۷۲۲q) {
                m۱۳۱۶۲h(-initialVelocity);
            } else if (this.f۱۰۷۱۰e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                Cu.m۱۲۹۷۰B(this);
            }
            this.f۱۰۷۲۴s = -1;
            m۱۳۱۵۲b();
        } else if (actionMasked == 2) {
            int activePointerIndex = ev.findPointerIndex(this.f۱۰۷۲۴s);
            if (activePointerIndex == -1) {
                Log.e("NestedScrollView", "Invalid pointerId=" + this.f۱۰۷۲۴s + " in onTouchEvent");
                z = true;
            } else {
                int y = (int) ev.getY(activePointerIndex);
                int deltaY = this.f۱۰۷۱۳h - y;
                if (m۱۳۱۷۲a(0, deltaY, this.f۱۰۷۲۶u, this.f۱۰۷۲۵t, 0)) {
                    deltaY -= this.f۱۰۷۲۶u[1];
                    vtev.offsetLocation(0.0f, (float) this.f۱۰۷۲۵t[1]);
                    this.f۱۰۷۲۷v += this.f۱۰۷۲۵t[1];
                }
                if (!this.f۱۰۷۱۷l && Math.abs(deltaY) > this.f۱۰۷۲۱p) {
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    this.f۱۰۷۱۷l = true;
                    if (deltaY > 0) {
                        deltaY -= this.f۱۰۷۲۱p;
                    } else {
                        deltaY += this.f۱۰۷۲۱p;
                    }
                }
                if (this.f۱۰۷۱۷l) {
                    this.f۱۰۷۱۳h = y - this.f۱۰۷۲۵t[1];
                    int oldY = getScrollY();
                    int range = getScrollRange();
                    int overscrollMode = getOverScrollMode();
                    boolean canOverscroll = overscrollMode == 0 || (overscrollMode == 1 && range > 0);
                    if (m۱۳۱۷۰a(0, deltaY, 0, getScrollY(), 0, range, 0, 0, true) && !m۱۳۱۸۰e(0)) {
                        this.f۱۰۷۱۸m.clear();
                    }
                    int scrolledDeltaY = getScrollY() - oldY;
                    if (m۱۳۱۷۱a(0, scrolledDeltaY, 0, deltaY - scrolledDeltaY, this.f۱۰۷۲۵t, 0)) {
                        int i = this.f۱۰۷۱۳h;
                        int[] iArr = this.f۱۰۷۲۵t;
                        z = true;
                        this.f۱۰۷۱۳h = i - iArr[1];
                        vtev.offsetLocation(0.0f, (float) iArr[1]);
                        this.f۱۰۷۲۷v += this.f۱۰۷۲۵t[1];
                    } else {
                        z = true;
                        if (canOverscroll) {
                            m۱۳۱۵۵c();
                            int pulledToY = oldY + deltaY;
                            if (pulledToY < 0) {
                                Cg.m۱۳۲۴۹a(this.f۱۰۷۱۱f, ((float) deltaY) / ((float) getHeight()), ev.getX(activePointerIndex) / ((float) getWidth()));
                                if (!this.f۱۰۷۱۲g.isFinished()) {
                                    this.f۱۰۷۱۲g.onRelease();
                                }
                            } else if (pulledToY > range) {
                                Cg.m۱۳۲۴۹a(this.f۱۰۷۱۲g, ((float) deltaY) / ((float) getHeight()), 1.0f - (ev.getX(activePointerIndex) / ((float) getWidth())));
                                if (!this.f۱۰۷۱۱f.isFinished()) {
                                    this.f۱۰۷۱۱f.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f۱۰۷۱۱f;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f۱۰۷۱۲g.isFinished())) {
                                Cu.m۱۲۹۷۰B(this);
                            }
                        }
                    }
                } else {
                    z = true;
                }
            }
        } else if (actionMasked == 3) {
            if (this.f۱۰۷۱۷l && getChildCount() > 0 && this.f۱۰۷۱۰e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                Cu.m۱۲۹۷۰B(this);
            }
            this.f۱۰۷۲۴s = -1;
            m۱۳۱۵۲b();
            z = true;
        } else if (actionMasked == 5) {
            int index = ev.getActionIndex();
            this.f۱۰۷۱۳h = (int) ev.getY(index);
            this.f۱۰۷۲۴s = ev.getPointerId(index);
            z = true;
        } else if (actionMasked != 6) {
            z = true;
        } else {
            m۱۳۱۴۶a(ev);
            this.f۱۰۷۱۳h = (int) ev.getY(ev.findPointerIndex(this.f۱۰۷۲۴s));
            z = true;
        }
        VelocityTracker velocityTracker2 = this.f۱۰۷۱۸m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(vtev);
        }
        vtev.recycle();
        return z;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۳۱۴۶a(MotionEvent ev) {
        int pointerIndex = ev.getActionIndex();
        if (ev.getPointerId(pointerIndex) == this.f۱۰۷۲۴s) {
            int newPointerIndex = pointerIndex == 0 ? 1 : 0;
            this.f۱۰۷۱۳h = (int) ev.getY(newPointerIndex);
            this.f۱۰۷۲۴s = ev.getPointerId(newPointerIndex);
            VelocityTracker velocityTracker = this.f۱۰۷۱۸m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent event) {
        if ((event.getSource() & 2) == 0 || event.getAction() != 8 || this.f۱۰۷۱۷l) {
            return false;
        }
        float vscroll = event.getAxisValue(9);
        if (vscroll == 0.0f) {
            return false;
        }
        int range = getScrollRange();
        int oldScrollY = getScrollY();
        int newScrollY = oldScrollY - ((int) (getVerticalScrollFactorCompat() * vscroll));
        if (newScrollY < 0) {
            newScrollY = 0;
        } else if (newScrollY > range) {
            newScrollY = range;
        }
        if (newScrollY == oldScrollY) {
            return false;
        }
        super.scrollTo(getScrollX(), newScrollY);
        return true;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f۱۰۷۰۶A == 0.0f) {
            TypedValue outValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, outValue, true)) {
                this.f۱۰۷۰۶A = outValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f۱۰۷۰۶A;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.scrollTo(scrollX, scrollY);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۱۷۰a(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
        int maxOverScrollX2;
        int maxOverScrollY2;
        boolean clampedX;
        int newScrollY;
        boolean clampedY;
        int overScrollMode = getOverScrollMode();
        boolean canScrollHorizontal = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean canScrollVertical = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean overScrollHorizontal = overScrollMode == 0 || (overScrollMode == 1 && canScrollHorizontal);
        boolean overScrollVertical = overScrollMode == 0 || (overScrollMode == 1 && canScrollVertical);
        int newScrollX = scrollX + deltaX;
        if (!overScrollHorizontal) {
            maxOverScrollX2 = 0;
        } else {
            maxOverScrollX2 = maxOverScrollX;
        }
        int newScrollY2 = scrollY + deltaY;
        if (!overScrollVertical) {
            maxOverScrollY2 = 0;
        } else {
            maxOverScrollY2 = maxOverScrollY;
        }
        int left = -maxOverScrollX2;
        int right = maxOverScrollX2 + scrollRangeX;
        int top = -maxOverScrollY2;
        int bottom = maxOverScrollY2 + scrollRangeY;
        if (newScrollX > right) {
            newScrollX = right;
            clampedX = true;
        } else if (newScrollX < left) {
            newScrollX = left;
            clampedX = true;
        } else {
            clampedX = false;
        }
        if (newScrollY2 > bottom) {
            newScrollY = bottom;
            clampedY = true;
        } else if (newScrollY2 < top) {
            newScrollY = top;
            clampedY = true;
        } else {
            newScrollY = newScrollY2;
            clampedY = false;
        }
        if (clampedY && !m۱۳۱۸۰e(1)) {
            this.f۱۰۷۱۰e.springBack(newScrollX, newScrollY, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(newScrollX, newScrollY, clampedX, clampedY);
        return clampedX || clampedY;
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        return Math.max(0, ((child.getHeight() + lp.topMargin) + lp.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: a  reason: contains not printable characters */
    private View m۱۳۱۴۵a(boolean topFocus, int top, int bottom) {
        List<View> focusables = getFocusables(2);
        View focusCandidate = null;
        boolean foundFullyContainedFocusable = false;
        int count = focusables.size();
        for (int i = 0; i < count; i++) {
            View view = focusables.get(i);
            int viewTop = view.getTop();
            int viewBottom = view.getBottom();
            if (top < viewBottom && viewTop < bottom) {
                boolean viewIsCloserToBoundary = false;
                boolean viewIsFullyContained = top < viewTop && viewBottom < bottom;
                if (focusCandidate == null) {
                    focusCandidate = view;
                    foundFullyContainedFocusable = viewIsFullyContained;
                } else {
                    if ((topFocus && viewTop < focusCandidate.getTop()) || (!topFocus && viewBottom > focusCandidate.getBottom())) {
                        viewIsCloserToBoundary = true;
                    }
                    if (foundFullyContainedFocusable) {
                        if (viewIsFullyContained && viewIsCloserToBoundary) {
                            focusCandidate = view;
                        }
                    } else if (viewIsFullyContained) {
                        focusCandidate = view;
                        foundFullyContainedFocusable = true;
                    } else if (viewIsCloserToBoundary) {
                        focusCandidate = view;
                    }
                }
            }
        }
        return focusCandidate;
    }

    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۳۱۸۱f(int direction) {
        boolean down = direction == 130;
        int height = getHeight();
        if (down) {
            this.f۱۰۷۰۹d.top = getScrollY() + height;
            int count = getChildCount();
            if (count > 0) {
                View view = getChildAt(count - 1);
                int bottom = view.getBottom() + ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f۱۰۷۰۹d;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f۱۰۷۰۹d.top = getScrollY() - height;
            Rect rect2 = this.f۱۰۷۰۹d;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f۱۰۷۰۹d;
        int i = rect3.top;
        rect3.bottom = i + height;
        return m۱۳۱۵۴b(direction, i, rect3.bottom);
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۳۱۷۹d(int direction) {
        int count;
        boolean down = direction == 130;
        int height = getHeight();
        Rect rect = this.f۱۰۷۰۹d;
        rect.top = 0;
        rect.bottom = height;
        if (down && (count = getChildCount()) > 0) {
            View view = getChildAt(count - 1);
            this.f۱۰۷۰۹d.bottom = view.getBottom() + ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f۱۰۷۰۹d;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f۱۰۷۰۹d;
        return m۱۳۱۵۴b(direction, rect3.top, rect3.bottom);
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۳۱۵۴b(int direction, int top, int bottom) {
        boolean handled = true;
        int height = getHeight();
        int containerTop = getScrollY();
        int containerBottom = containerTop + height;
        boolean up = direction == 33;
        View newFocused = m۱۳۱۴۵a(up, top, bottom);
        if (newFocused == null) {
            newFocused = this;
        }
        if (top < containerTop || bottom > containerBottom) {
            m۱۳۱۶۱g(up ? top - containerTop : bottom - containerBottom);
        } else {
            handled = false;
        }
        if (newFocused != findFocus()) {
            newFocused.requestFocus(direction);
        }
        return handled;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۱۷۵b(int direction) {
        View currentFocused = findFocus();
        if (currentFocused == this) {
            currentFocused = null;
        }
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, direction);
        int maxJump = getMaxScrollAmount();
        if (nextFocused == null || !m۱۳۱۵۰a(nextFocused, maxJump, getHeight())) {
            int scrollDelta = maxJump;
            if (direction == 33 && getScrollY() < scrollDelta) {
                scrollDelta = getScrollY();
            } else if (direction == 130 && getChildCount() > 0) {
                View child = getChildAt(0);
                scrollDelta = Math.min((child.getBottom() + ((FrameLayout.LayoutParams) child.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxJump);
            }
            if (scrollDelta == 0) {
                return false;
            }
            m۱۳۱۶۱g(direction == 130 ? scrollDelta : -scrollDelta);
        } else {
            nextFocused.getDrawingRect(this.f۱۰۷۰۹d);
            offsetDescendantRectToMyCoords(nextFocused, this.f۱۰۷۰۹d);
            m۱۳۱۶۱g(m۱۳۱۶۳a(this.f۱۰۷۰۹d));
            nextFocused.requestFocus(direction);
        }
        if (currentFocused == null || !currentFocused.isFocused() || !m۱۳۱۴۹a(currentFocused)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۱۴۹a(View descendant) {
        return !m۱۳۱۵۰a(descendant, 0, getHeight());
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۱۵۰a(View descendant, int delta, int height) {
        descendant.getDrawingRect(this.f۱۰۷۰۹d);
        offsetDescendantRectToMyCoords(descendant, this.f۱۰۷۰۹d);
        return this.f۱۰۷۰۹d.bottom + delta >= getScrollY() && this.f۱۰۷۰۹d.top - delta <= getScrollY() + height;
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۳۱۶۱g(int delta) {
        if (delta == 0) {
            return;
        }
        if (this.f۱۰۷۲۰o) {
            m۱۳۱۶۵a(0, delta);
        } else {
            scrollBy(0, delta);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۳۱۶۵a(int dx, int dy) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f۱۰۷۰۸c > 250) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                int childSize = child.getHeight() + lp.topMargin + lp.bottomMargin;
                int parentSpace = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                int dy2 = Math.max(0, Math.min(scrollY + dy, Math.max(0, childSize - parentSpace))) - scrollY;
                this.f۱۰۷۲۸w = getScrollY();
                this.f۱۰۷۱۰e.startScroll(getScrollX(), scrollY, 0, dy2);
                Cu.m۱۲۹۷۰B(this);
            } else {
                if (!this.f۱۰۷۱۰e.isFinished()) {
                    this.f۱۰۷۱۰e.abortAnimation();
                }
                scrollBy(dx, dy);
            }
            this.f۱۰۷۰۸c = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public final void m۱۳۱۷۴b(int x, int y) {
        m۱۳۱۶۵a(x - getScrollX(), y - getScrollY());
    }

    public int computeVerticalScrollRange() {
        int count = getChildCount();
        int parentSpace = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (count == 0) {
            return parentSpace;
        }
        View child = getChildAt(0);
        int scrollRange = child.getBottom() + ((FrameLayout.LayoutParams) child.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int overscrollBottom = Math.max(0, scrollRange - parentSpace);
        if (scrollY < 0) {
            return scrollRange - scrollY;
        }
        if (scrollY > overscrollBottom) {
            return scrollRange + (scrollY - overscrollBottom);
        }
        return scrollRange;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        child.measure(FrameLayout.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight(), child.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        child.measure(FrameLayout.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, lp.width), View.MeasureSpec.makeMeasureSpec(lp.topMargin + lp.bottomMargin, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        if (r1 > 0) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeScroll() {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۳v4.widget.NestedScrollView.computeScroll():void");
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۳۱۵۳b(View child) {
        child.getDrawingRect(this.f۱۰۷۰۹d);
        offsetDescendantRectToMyCoords(child, this.f۱۰۷۰۹d);
        int scrollDelta = m۱۳۱۶۳a(this.f۱۰۷۰۹d);
        if (scrollDelta != 0) {
            scrollBy(0, scrollDelta);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۱۴۸a(Rect rect, boolean immediate) {
        int delta = m۱۳۱۶۳a(rect);
        boolean scroll = delta != 0;
        if (scroll) {
            if (immediate) {
                scrollBy(0, delta);
            } else {
                m۱۳۱۶۵a(0, delta);
            }
        }
        return scroll;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۳۱۶۳a(Rect rect) {
        int scrollYDelta;
        int scrollYDelta2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int screenTop = getScrollY();
        int screenBottom = screenTop + height;
        int fadingEdge = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            screenTop += fadingEdge;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        if (rect.bottom < child.getHeight() + lp.topMargin + lp.bottomMargin) {
            screenBottom -= fadingEdge;
        }
        if (rect.bottom > screenBottom && rect.top > screenTop) {
            if (rect.height() > height) {
                scrollYDelta2 = 0 + (rect.top - screenTop);
            } else {
                scrollYDelta2 = 0 + (rect.bottom - screenBottom);
            }
            return Math.min(scrollYDelta2, (child.getBottom() + lp.bottomMargin) - screenBottom);
        } else if (rect.top >= screenTop || rect.bottom >= screenBottom) {
            return 0;
        } else {
            if (rect.height() > height) {
                scrollYDelta = 0 - (screenBottom - rect.bottom);
            } else {
                scrollYDelta = 0 - (screenTop - rect.top);
            }
            return Math.max(scrollYDelta, -getScrollY());
        }
    }

    public void requestChildFocus(View child, View focused) {
        if (!this.f۱۰۷۱۴i) {
            m۱۳۱۵۳b(focused);
        } else {
            this.f۱۰۷۱۶k = focused;
        }
        super.requestChildFocus(child, focused);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        View nextFocus;
        if (direction == 2) {
            direction = 130;
        } else if (direction == 1) {
            direction = 33;
        }
        if (previouslyFocusedRect == null) {
            nextFocus = FocusFinder.getInstance().findNextFocus(this, null, direction);
        } else {
            nextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, previouslyFocusedRect, direction);
        }
        if (nextFocus != null && !m۱۳۱۴۹a(nextFocus)) {
            return nextFocus.requestFocus(direction, previouslyFocusedRect);
        }
        return false;
    }

    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        rectangle.offset(child.getLeft() - child.getScrollX(), child.getTop() - child.getScrollY());
        return m۱۳۱۴۸a(rectangle, immediate);
    }

    public void requestLayout() {
        this.f۱۰۷۱۴i = true;
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        this.f۱۰۷۱۴i = false;
        View view = this.f۱۰۷۱۶k;
        if (view != null && m۱۳۱۵۱a(view, this)) {
            m۱۳۱۵۳b(this.f۱۰۷۱۶k);
        }
        this.f۱۰۷۱۶k = null;
        if (!this.f۱۰۷۱۵j) {
            if (this.f۱۰۷۲۹x != null) {
                scrollTo(getScrollX(), this.f۱۰۷۲۹x.f۱۰۷۳۲c);
                this.f۱۰۷۲۹x = null;
            }
            int childSize = 0;
            if (getChildCount() > 0) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                childSize = child.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
            }
            int parentSpace = ((b - t) - getPaddingTop()) - getPaddingBottom();
            int currentScrollY = getScrollY();
            int newScrollY = m۱۳۱۴۴a(currentScrollY, parentSpace, childSize);
            if (newScrollY != currentScrollY) {
                scrollTo(getScrollX(), newScrollY);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f۱۰۷۱۵j = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f۱۰۷۱۵j = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        View currentFocused = findFocus();
        if (currentFocused != null && this != currentFocused && m۱۳۱۵۰a(currentFocused, 0, oldh)) {
            currentFocused.getDrawingRect(this.f۱۰۷۰۹d);
            offsetDescendantRectToMyCoords(currentFocused, this.f۱۰۷۰۹d);
            m۱۳۱۶۱g(m۱۳۱۶۳a(this.f۱۰۷۰۹d));
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۳۱۵۱a(View child, View parent) {
        if (child == parent) {
            return true;
        }
        ViewParent theParent = child.getParent();
        if (!(theParent instanceof ViewGroup) || !m۱۳۱۵۱a((View) theParent, parent)) {
            return false;
        }
        return true;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۱۷۷c(int velocityY) {
        if (getChildCount() > 0) {
            m۱۳۱۷۸c(2, 1);
            this.f۱۰۷۱۰e.fling(getScrollX(), getScrollY(), 0, velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f۱۰۷۲۸w = getScrollY();
            Cu.m۱۲۹۷۰B(this);
        }
    }

    /* renamed from: h  reason: contains not printable characters */
    private void m۱۳۱۶۲h(int velocityY) {
        int scrollY = getScrollY();
        boolean canFling = (scrollY > 0 || velocityY > 0) && (scrollY < getScrollRange() || velocityY < 0);
        if (!dispatchNestedPreFling(0.0f, (float) velocityY)) {
            dispatchNestedFling(0.0f, (float) velocityY, canFling);
            m۱۳۱۷۷c(velocityY);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۳۱۵۲b() {
        this.f۱۰۷۱۷l = false;
        m۱۳۱۶۰g();
        m۱۳۱۶۴a(0);
        EdgeEffect edgeEffect = this.f۱۰۷۱۱f;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f۱۰۷۱۲g.onRelease();
        }
    }

    public void scrollTo(int x, int y) {
        if (getChildCount() > 0) {
            View child = getChildAt(0);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
            int x2 = m۱۳۱۴۴a(x, (getWidth() - getPaddingLeft()) - getPaddingRight(), child.getWidth() + lp.leftMargin + lp.rightMargin);
            int y2 = m۱۳۱۴۴a(y, (getHeight() - getPaddingTop()) - getPaddingBottom(), child.getHeight() + lp.topMargin + lp.bottomMargin);
            if (x2 != getScrollX() || y2 != getScrollY()) {
                super.scrollTo(x2, y2);
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۳۱۵۵c() {
        if (getOverScrollMode() == 2) {
            this.f۱۰۷۱۱f = null;
            this.f۱۰۷۱۲g = null;
        } else if (this.f۱۰۷۱۱f == null) {
            Context context = getContext();
            this.f۱۰۷۱۱f = new EdgeEffect(context);
            this.f۱۰۷۱۲g = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f۱۰۷۱۱f != null) {
            int scrollY = getScrollY();
            if (!this.f۱۰۷۱۱f.isFinished()) {
                int restoreCount = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int xTranslation = 0;
                int yTranslation = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    xTranslation = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    yTranslation += getPaddingTop();
                }
                canvas.translate((float) xTranslation, (float) yTranslation);
                this.f۱۰۷۱۱f.setSize(width, height);
                if (this.f۱۰۷۱۱f.draw(canvas)) {
                    Cu.m۱۲۹۷۰B(this);
                }
                canvas.restoreToCount(restoreCount);
            }
            if (!this.f۱۰۷۱۲g.isFinished()) {
                int restoreCount2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int xTranslation2 = 0;
                int yTranslation2 = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    xTranslation2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    yTranslation2 -= getPaddingBottom();
                }
                canvas.translate((float) (xTranslation2 - width2), (float) yTranslation2);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f۱۰۷۱۲g.setSize(width2, height2);
                if (this.f۱۰۷۱۲g.draw(canvas)) {
                    Cu.m۱۲۹۷۰B(this);
                }
                canvas.restoreToCount(restoreCount2);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۳۱۴۴a(int n, int my, int child) {
        if (my >= child || n < 0) {
            return 0;
        }
        if (my + n > child) {
            return child - my;
        }
        return n;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof Cc)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Cc ss = (Cc) state;
        super.onRestoreInstanceState(ss.getSuperState());
        this.f۱۰۷۲۹x = ss;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Cc ss = new Cc(super.onSaveInstanceState());
        ss.f۱۰۷۳۲c = getScrollY();
        return ss;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.widget.NestedScrollView$c  reason: invalid class name */
    public static class Cc extends View.BaseSavedState {
        public static final Parcelable.Creator<Cc> CREATOR = new Ca();

        /* renamed from: c  reason: contains not printable characters */
        public int f۱۰۷۳۲c;

        Cc(Parcelable superState) {
            super(superState);
        }

        Cc(Parcel source) {
            super(source);
            this.f۱۰۷۳۲c = source.readInt();
        }

        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.f۱۰۷۳۲c);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f۱۰۷۳۲c + "}";
        }

        /* renamed from: android.support.v4.widget.NestedScrollView$c$a  reason: invalid class name */
        static class Ca implements Parcelable.Creator<Cc> {
            Ca() {
            }

            @Override // android.os.Parcelable.Creator
            public Cc createFromParcel(Parcel in) {
                return new Cc(in);
            }

            @Override // android.os.Parcelable.Creator
            public Cc[] newArray(int size) {
                return new Cc[size];
            }
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$a  reason: invalid class name */
    static class Ca extends Cb {
        Ca() {
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۱۸۳a(View host, int action, Bundle arguments) {
            if (super.m۱۲۷۹۸a(host, action, arguments)) {
                return true;
            }
            NestedScrollView nsvHost = (NestedScrollView) host;
            if (!nsvHost.isEnabled()) {
                return false;
            }
            if (action == 4096) {
                int targetScrollY = Math.min(nsvHost.getScrollY() + ((nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop()), nsvHost.getScrollRange());
                if (targetScrollY == nsvHost.getScrollY()) {
                    return false;
                }
                nsvHost.m۱۳۱۷۴b(0, targetScrollY);
                return true;
            } else if (action != 8192) {
                return false;
            } else {
                int targetScrollY2 = Math.max(nsvHost.getScrollY() - ((nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop()), 0);
                if (targetScrollY2 == nsvHost.getScrollY()) {
                    return false;
                }
                nsvHost.m۱۳۱۷۴b(0, targetScrollY2);
                return true;
            }
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۱۸۲a(View host, android.support.p۰۴۳v4.view.p۰۴۵d0.Cc info2) {
            int scrollRange;
            super.m۱۲۷۹۷a(host, info2);
            NestedScrollView nsvHost = (NestedScrollView) host;
            info2.m۱۲۸۴۲a((CharSequence) ScrollView.class.getName());
            if (nsvHost.isEnabled() && (scrollRange = nsvHost.getScrollRange()) > 0) {
                info2.m۱۲۸۷۷k(true);
                if (nsvHost.getScrollY() > 0) {
                    info2.m۱۲۸۳۸a(8192);
                }
                if (nsvHost.getScrollY() < scrollRange) {
                    info2.m۱۲۸۳۸a(4096);
                }
            }
        }

        @Override // android.support.p۰۴۳v4.view.Cb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۱۸۴b(View host, AccessibilityEvent event) {
            super.m۱۲۸۰۱b(host, event);
            NestedScrollView nsvHost = (NestedScrollView) host;
            event.setClassName(ScrollView.class.getName());
            event.setScrollable(nsvHost.getScrollRange() > 0);
            event.setScrollX(nsvHost.getScrollX());
            event.setScrollY(nsvHost.getScrollY());
            Ce.m۱۲۹۰۰a(event, nsvHost.getScrollX());
            Ce.m۱۲۹۰۲b(event, nsvHost.getScrollRange());
        }
    }
}
