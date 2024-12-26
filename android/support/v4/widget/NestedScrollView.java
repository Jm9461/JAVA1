package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.d0.e;
import android.support.v4.view.j;
import android.support.v4.view.l;
import android.support.v4.view.m;
import android.support.v4.view.o;
import android.support.v4.view.s;
import android.support.v4.view.u;
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

public class NestedScrollView extends FrameLayout implements m, j, s {
    private static final a C = new a();
    private static final int[] D = {16843130};
    private float A;
    private b B;

    /* renamed from: c  reason: collision with root package name */
    private long f۱۴۱۴c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f۱۴۱۵d;

    /* renamed from: e  reason: collision with root package name */
    private OverScroller f۱۴۱۶e;

    /* renamed from: f  reason: collision with root package name */
    private EdgeEffect f۱۴۱۷f;

    /* renamed from: g  reason: collision with root package name */
    private EdgeEffect f۱۴۱۸g;

    /* renamed from: h  reason: collision with root package name */
    private int f۱۴۱۹h;
    private boolean i;
    private boolean j;
    private View k;
    private boolean l;
    private VelocityTracker m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final int[] t;
    private final int[] u;
    private int v;
    private int w;
    private c x;
    private final o y;
    private final l z;

    public interface b {
        void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NestedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f۱۴۱۵d = new Rect();
        this.i = true;
        this.j = false;
        this.k = null;
        this.l = false;
        this.o = true;
        this.s = -1;
        this.t = new int[2];
        this.u = new int[2];
        e();
        TypedArray a2 = context.obtainStyledAttributes(attrs, D, defStyleAttr, 0);
        setFillViewport(a2.getBoolean(0, false));
        a2.recycle();
        this.y = new o(this);
        this.z = new l(this);
        setNestedScrollingEnabled(true);
        u.a(this, C);
    }

    public boolean c(int axes, int type) {
        return this.z.a(axes, type);
    }

    @Override // android.support.v4.view.j
    public void a(int type) {
        this.z.c(type);
    }

    public boolean e(int type) {
        return this.z.a(type);
    }

    public boolean a(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return this.z.a(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    public boolean a(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return this.z.a(dx, dy, consumed, offsetInWindow, type);
    }

    public void setNestedScrollingEnabled(boolean enabled) {
        this.z.a(enabled);
    }

    @Override // android.support.v4.view.k
    public boolean isNestedScrollingEnabled() {
        return this.z.b();
    }

    public boolean startNestedScroll(int axes) {
        return c(axes, 0);
    }

    @Override // android.support.v4.view.k
    public void stopNestedScroll() {
        a(0);
    }

    public boolean hasNestedScrollingParent() {
        return e(0);
    }

    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return a(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, 0);
    }

    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return a(dx, dy, consumed, offsetInWindow, 0);
    }

    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return this.z.a(velocityX, velocityY, consumed);
    }

    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return this.z.a(velocityX, velocityY);
    }

    @Override // android.support.v4.view.m
    public boolean b(View child, View target, int axes, int type) {
        return (axes & 2) != 0;
    }

    @Override // android.support.v4.view.m
    public void a(View child, View target, int axes, int type) {
        this.y.a(child, target, axes, type);
        c(2, type);
    }

    @Override // android.support.v4.view.m
    public void a(View target, int type) {
        this.y.a(target, type);
        a(type);
    }

    @Override // android.support.v4.view.m
    public void a(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        int oldScrollY = getScrollY();
        scrollBy(0, dyUnconsumed);
        int myConsumed = getScrollY() - oldScrollY;
        a(0, myConsumed, 0, dyUnconsumed - myConsumed, (int[]) null, type);
    }

    @Override // android.support.v4.view.m
    public void a(View target, int dx, int dy, int[] consumed, int type) {
        a(dx, dy, consumed, (int[]) null, type);
    }

    @Override // android.support.v4.view.n
    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return b(child, target, nestedScrollAxes, 0);
    }

    @Override // android.support.v4.view.n
    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes) {
        a(child, target, nestedScrollAxes, 0);
    }

    @Override // android.support.v4.view.n
    public void onStopNestedScroll(View target) {
        a(target, 0);
    }

    @Override // android.support.v4.view.n
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        a(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, 0);
    }

    @Override // android.support.v4.view.n
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        a(target, dx, dy, consumed, 0);
    }

    @Override // android.support.v4.view.n
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (consumed) {
            return false;
        }
        h((int) velocityY);
        return true;
    }

    @Override // android.support.v4.view.n
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return dispatchNestedPreFling(velocityX, velocityY);
    }

    public int getNestedScrollAxes() {
        return this.y.a();
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

    private void e() {
        this.f۱۴۱۶e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration configuration = ViewConfiguration.get(getContext());
        this.p = configuration.getScaledTouchSlop();
        this.q = configuration.getScaledMinimumFlingVelocity();
        this.r = configuration.getScaledMaximumFlingVelocity();
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

    public void setOnScrollChangeListener(b l2) {
        this.B = l2;
    }

    private boolean a() {
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
        if (fillViewport != this.n) {
            this.n = fillViewport;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) {
        this.o = smoothScrollingEnabled;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int l2, int t2, int oldl, int oldt) {
        super.onScrollChanged(l2, t2, oldl, oldt);
        b bVar = this.B;
        if (bVar != null) {
            bVar.a(this, l2, t2, oldl, oldt);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.n && View.MeasureSpec.getMode(heightMeasureSpec) != 0 && getChildCount() > 0) {
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
        return super.dispatchKeyEvent(event) || a(event);
    }

    public boolean a(KeyEvent event) {
        this.f۱۴۱۵d.setEmpty();
        int i2 = 130;
        if (!a()) {
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
                        i2 = 33;
                    }
                    f(i2);
                    return false;
                } else if (!event.isAltPressed()) {
                    return b(130);
                } else {
                    return d(130);
                }
            } else if (!event.isAltPressed()) {
                return b(33);
            } else {
                return d(33);
            }
        }
    }

    private boolean d(int x2, int y2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View child = getChildAt(0);
        if (y2 < child.getTop() - scrollY || y2 >= child.getBottom() - scrollY || x2 < child.getLeft() || x2 >= child.getRight()) {
            return false;
        }
        return true;
    }

    private void d() {
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker == null) {
            this.m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void f() {
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
    }

    private void g() {
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.m = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (disallowIntercept) {
            g();
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if (action == 2 && this.l) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int activePointerId = this.s;
                    if (activePointerId != -1) {
                        int pointerIndex = ev.findPointerIndex(activePointerId);
                        if (pointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + activePointerId + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) ev.getY(pointerIndex);
                            if (Math.abs(y2 - this.f۱۴۱۹h) > this.p && (2 & getNestedScrollAxes()) == 0) {
                                this.l = true;
                                this.f۱۴۱۹h = y2;
                                f();
                                this.m.addMovement(ev);
                                this.v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        a(ev);
                    }
                }
            }
            this.l = false;
            this.s = -1;
            g();
            if (this.f۱۴۱۶e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                u.B(this);
            }
            a(0);
        } else {
            int y3 = (int) ev.getY();
            if (!d((int) ev.getX(), y3)) {
                this.l = false;
                g();
            } else {
                this.f۱۴۱۹h = y3;
                this.s = ev.getPointerId(0);
                d();
                this.m.addMovement(ev);
                this.f۱۴۱۶e.computeScrollOffset();
                this.l = true ^ this.f۱۴۱۶e.isFinished();
                c(2, 0);
            }
        }
        return this.l;
    }

    public boolean onTouchEvent(MotionEvent ev) {
        boolean z2;
        ViewParent parent;
        f();
        MotionEvent vtev = MotionEvent.obtain(ev);
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.v = 0;
        }
        vtev.offsetLocation(0.0f, (float) this.v);
        if (actionMasked == 0) {
            z2 = true;
            if (getChildCount() == 0) {
                return false;
            }
            boolean z3 = !this.f۱۴۱۶e.isFinished();
            this.l = z3;
            if (z3 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f۱۴۱۶e.isFinished()) {
                this.f۱۴۱۶e.abortAnimation();
            }
            this.f۱۴۱۹h = (int) ev.getY();
            this.s = ev.getPointerId(0);
            c(2, 0);
        } else if (actionMasked == 1) {
            z2 = true;
            VelocityTracker velocityTracker = this.m;
            velocityTracker.computeCurrentVelocity(1000, (float) this.r);
            int initialVelocity = (int) velocityTracker.getYVelocity(this.s);
            if (Math.abs(initialVelocity) > this.q) {
                h(-initialVelocity);
            } else if (this.f۱۴۱۶e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                u.B(this);
            }
            this.s = -1;
            b();
        } else if (actionMasked == 2) {
            int activePointerIndex = ev.findPointerIndex(this.s);
            if (activePointerIndex == -1) {
                Log.e("NestedScrollView", "Invalid pointerId=" + this.s + " in onTouchEvent");
                z2 = true;
            } else {
                int y2 = (int) ev.getY(activePointerIndex);
                int deltaY = this.f۱۴۱۹h - y2;
                if (a(0, deltaY, this.u, this.t, 0)) {
                    deltaY -= this.u[1];
                    vtev.offsetLocation(0.0f, (float) this.t[1]);
                    this.v += this.t[1];
                }
                if (!this.l && Math.abs(deltaY) > this.p) {
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    this.l = true;
                    if (deltaY > 0) {
                        deltaY -= this.p;
                    } else {
                        deltaY += this.p;
                    }
                }
                if (this.l) {
                    this.f۱۴۱۹h = y2 - this.t[1];
                    int oldY = getScrollY();
                    int range = getScrollRange();
                    int overscrollMode = getOverScrollMode();
                    boolean canOverscroll = overscrollMode == 0 || (overscrollMode == 1 && range > 0);
                    if (a(0, deltaY, 0, getScrollY(), 0, range, 0, 0, true) && !e(0)) {
                        this.m.clear();
                    }
                    int scrolledDeltaY = getScrollY() - oldY;
                    if (a(0, scrolledDeltaY, 0, deltaY - scrolledDeltaY, this.t, 0)) {
                        int i2 = this.f۱۴۱۹h;
                        int[] iArr = this.t;
                        z2 = true;
                        this.f۱۴۱۹h = i2 - iArr[1];
                        vtev.offsetLocation(0.0f, (float) iArr[1]);
                        this.v += this.t[1];
                    } else {
                        z2 = true;
                        if (canOverscroll) {
                            c();
                            int pulledToY = oldY + deltaY;
                            if (pulledToY < 0) {
                                g.a(this.f۱۴۱۷f, ((float) deltaY) / ((float) getHeight()), ev.getX(activePointerIndex) / ((float) getWidth()));
                                if (!this.f۱۴۱۸g.isFinished()) {
                                    this.f۱۴۱۸g.onRelease();
                                }
                            } else if (pulledToY > range) {
                                g.a(this.f۱۴۱۸g, ((float) deltaY) / ((float) getHeight()), 1.0f - (ev.getX(activePointerIndex) / ((float) getWidth())));
                                if (!this.f۱۴۱۷f.isFinished()) {
                                    this.f۱۴۱۷f.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f۱۴۱۷f;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f۱۴۱۸g.isFinished())) {
                                u.B(this);
                            }
                        }
                    }
                } else {
                    z2 = true;
                }
            }
        } else if (actionMasked == 3) {
            if (this.l && getChildCount() > 0 && this.f۱۴۱۶e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                u.B(this);
            }
            this.s = -1;
            b();
            z2 = true;
        } else if (actionMasked == 5) {
            int index = ev.getActionIndex();
            this.f۱۴۱۹h = (int) ev.getY(index);
            this.s = ev.getPointerId(index);
            z2 = true;
        } else if (actionMasked != 6) {
            z2 = true;
        } else {
            a(ev);
            this.f۱۴۱۹h = (int) ev.getY(ev.findPointerIndex(this.s));
            z2 = true;
        }
        VelocityTracker velocityTracker2 = this.m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(vtev);
        }
        vtev.recycle();
        return z2;
    }

    private void a(MotionEvent ev) {
        int pointerIndex = ev.getActionIndex();
        if (ev.getPointerId(pointerIndex) == this.s) {
            int newPointerIndex = pointerIndex == 0 ? 1 : 0;
            this.f۱۴۱۹h = (int) ev.getY(newPointerIndex);
            this.s = ev.getPointerId(newPointerIndex);
            VelocityTracker velocityTracker = this.m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent event) {
        if ((event.getSource() & 2) == 0 || event.getAction() != 8 || this.l) {
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
        if (this.A == 0.0f) {
            TypedValue outValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, outValue, true)) {
                this.A = outValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.A;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.scrollTo(scrollX, scrollY);
    }

    /* access modifiers changed from: package-private */
    public boolean a(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
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
        if (clampedY && !e(1)) {
            this.f۱۴۱۶e.springBack(newScrollX, newScrollY, 0, 0, 0, getScrollRange());
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

    private View a(boolean topFocus, int top, int bottom) {
        List<View> focusables = getFocusables(2);
        View focusCandidate = null;
        boolean foundFullyContainedFocusable = false;
        int count = focusables.size();
        for (int i2 = 0; i2 < count; i2++) {
            View view = focusables.get(i2);
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

    public boolean f(int direction) {
        boolean down = direction == 130;
        int height = getHeight();
        if (down) {
            this.f۱۴۱۵d.top = getScrollY() + height;
            int count = getChildCount();
            if (count > 0) {
                View view = getChildAt(count - 1);
                int bottom = view.getBottom() + ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f۱۴۱۵d;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f۱۴۱۵d.top = getScrollY() - height;
            Rect rect2 = this.f۱۴۱۵d;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f۱۴۱۵d;
        int i2 = rect3.top;
        rect3.bottom = i2 + height;
        return b(direction, i2, rect3.bottom);
    }

    public boolean d(int direction) {
        int count;
        boolean down = direction == 130;
        int height = getHeight();
        Rect rect = this.f۱۴۱۵d;
        rect.top = 0;
        rect.bottom = height;
        if (down && (count = getChildCount()) > 0) {
            View view = getChildAt(count - 1);
            this.f۱۴۱۵d.bottom = view.getBottom() + ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f۱۴۱۵d;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f۱۴۱۵d;
        return b(direction, rect3.top, rect3.bottom);
    }

    private boolean b(int direction, int top, int bottom) {
        boolean handled = true;
        int height = getHeight();
        int containerTop = getScrollY();
        int containerBottom = containerTop + height;
        boolean up = direction == 33;
        View newFocused = a(up, top, bottom);
        if (newFocused == null) {
            newFocused = this;
        }
        if (top < containerTop || bottom > containerBottom) {
            g(up ? top - containerTop : bottom - containerBottom);
        } else {
            handled = false;
        }
        if (newFocused != findFocus()) {
            newFocused.requestFocus(direction);
        }
        return handled;
    }

    public boolean b(int direction) {
        View currentFocused = findFocus();
        if (currentFocused == this) {
            currentFocused = null;
        }
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, direction);
        int maxJump = getMaxScrollAmount();
        if (nextFocused == null || !a(nextFocused, maxJump, getHeight())) {
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
            g(direction == 130 ? scrollDelta : -scrollDelta);
        } else {
            nextFocused.getDrawingRect(this.f۱۴۱۵d);
            offsetDescendantRectToMyCoords(nextFocused, this.f۱۴۱۵d);
            g(a(this.f۱۴۱۵d));
            nextFocused.requestFocus(direction);
        }
        if (currentFocused == null || !currentFocused.isFocused() || !a(currentFocused)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    private boolean a(View descendant) {
        return !a(descendant, 0, getHeight());
    }

    private boolean a(View descendant, int delta, int height) {
        descendant.getDrawingRect(this.f۱۴۱۵d);
        offsetDescendantRectToMyCoords(descendant, this.f۱۴۱۵d);
        return this.f۱۴۱۵d.bottom + delta >= getScrollY() && this.f۱۴۱۵d.top - delta <= getScrollY() + height;
    }

    private void g(int delta) {
        if (delta == 0) {
            return;
        }
        if (this.o) {
            a(0, delta);
        } else {
            scrollBy(0, delta);
        }
    }

    public final void a(int dx, int dy) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f۱۴۱۴c > 250) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                int childSize = child.getHeight() + lp.topMargin + lp.bottomMargin;
                int parentSpace = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                int dy2 = Math.max(0, Math.min(scrollY + dy, Math.max(0, childSize - parentSpace))) - scrollY;
                this.w = getScrollY();
                this.f۱۴۱۶e.startScroll(getScrollX(), scrollY, 0, dy2);
                u.B(this);
            } else {
                if (!this.f۱۴۱۶e.isFinished()) {
                    this.f۱۴۱۶e.abortAnimation();
                }
                scrollBy(dx, dy);
            }
            this.f۱۴۱۴c = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void b(int x2, int y2) {
        a(x2 - getScrollX(), y2 - getScrollY());
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.computeScroll():void");
    }

    private void b(View child) {
        child.getDrawingRect(this.f۱۴۱۵d);
        offsetDescendantRectToMyCoords(child, this.f۱۴۱۵d);
        int scrollDelta = a(this.f۱۴۱۵d);
        if (scrollDelta != 0) {
            scrollBy(0, scrollDelta);
        }
    }

    private boolean a(Rect rect, boolean immediate) {
        int delta = a(rect);
        boolean scroll = delta != 0;
        if (scroll) {
            if (immediate) {
                scrollBy(0, delta);
            } else {
                a(0, delta);
            }
        }
        return scroll;
    }

    /* access modifiers changed from: protected */
    public int a(Rect rect) {
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
        if (!this.i) {
            b(focused);
        } else {
            this.k = focused;
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
        if (nextFocus != null && !a(nextFocus)) {
            return nextFocus.requestFocus(direction, previouslyFocusedRect);
        }
        return false;
    }

    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        rectangle.offset(child.getLeft() - child.getScrollX(), child.getTop() - child.getScrollY());
        return a(rectangle, immediate);
    }

    public void requestLayout() {
        this.i = true;
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        super.onLayout(changed, l2, t2, r2, b2);
        this.i = false;
        View view = this.k;
        if (view != null && a(view, this)) {
            b(this.k);
        }
        this.k = null;
        if (!this.j) {
            if (this.x != null) {
                scrollTo(getScrollX(), this.x.f۱۴۲۰c);
                this.x = null;
            }
            int childSize = 0;
            if (getChildCount() > 0) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                childSize = child.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
            }
            int parentSpace = ((b2 - t2) - getPaddingTop()) - getPaddingBottom();
            int currentScrollY = getScrollY();
            int newScrollY = a(currentScrollY, parentSpace, childSize);
            if (newScrollY != currentScrollY) {
                scrollTo(getScrollX(), newScrollY);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.j = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        View currentFocused = findFocus();
        if (currentFocused != null && this != currentFocused && a(currentFocused, 0, oldh)) {
            currentFocused.getDrawingRect(this.f۱۴۱۵d);
            offsetDescendantRectToMyCoords(currentFocused, this.f۱۴۱۵d);
            g(a(this.f۱۴۱۵d));
        }
    }

    private static boolean a(View child, View parent) {
        if (child == parent) {
            return true;
        }
        ViewParent theParent = child.getParent();
        if (!(theParent instanceof ViewGroup) || !a((View) theParent, parent)) {
            return false;
        }
        return true;
    }

    public void c(int velocityY) {
        if (getChildCount() > 0) {
            c(2, 1);
            this.f۱۴۱۶e.fling(getScrollX(), getScrollY(), 0, velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.w = getScrollY();
            u.B(this);
        }
    }

    private void h(int velocityY) {
        int scrollY = getScrollY();
        boolean canFling = (scrollY > 0 || velocityY > 0) && (scrollY < getScrollRange() || velocityY < 0);
        if (!dispatchNestedPreFling(0.0f, (float) velocityY)) {
            dispatchNestedFling(0.0f, (float) velocityY, canFling);
            c(velocityY);
        }
    }

    private void b() {
        this.l = false;
        g();
        a(0);
        EdgeEffect edgeEffect = this.f۱۴۱۷f;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f۱۴۱۸g.onRelease();
        }
    }

    public void scrollTo(int x2, int y2) {
        if (getChildCount() > 0) {
            View child = getChildAt(0);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
            int x3 = a(x2, (getWidth() - getPaddingLeft()) - getPaddingRight(), child.getWidth() + lp.leftMargin + lp.rightMargin);
            int y3 = a(y2, (getHeight() - getPaddingTop()) - getPaddingBottom(), child.getHeight() + lp.topMargin + lp.bottomMargin);
            if (x3 != getScrollX() || y3 != getScrollY()) {
                super.scrollTo(x3, y3);
            }
        }
    }

    private void c() {
        if (getOverScrollMode() == 2) {
            this.f۱۴۱۷f = null;
            this.f۱۴۱۸g = null;
        } else if (this.f۱۴۱۷f == null) {
            Context context = getContext();
            this.f۱۴۱۷f = new EdgeEffect(context);
            this.f۱۴۱۸g = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f۱۴۱۷f != null) {
            int scrollY = getScrollY();
            if (!this.f۱۴۱۷f.isFinished()) {
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
                this.f۱۴۱۷f.setSize(width, height);
                if (this.f۱۴۱۷f.draw(canvas)) {
                    u.B(this);
                }
                canvas.restoreToCount(restoreCount);
            }
            if (!this.f۱۴۱۸g.isFinished()) {
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
                this.f۱۴۱۸g.setSize(width2, height2);
                if (this.f۱۴۱۸g.draw(canvas)) {
                    u.B(this);
                }
                canvas.restoreToCount(restoreCount2);
            }
        }
    }

    private static int a(int n2, int my, int child) {
        if (my >= child || n2 < 0) {
            return 0;
        }
        if (my + n2 > child) {
            return child - my;
        }
        return n2;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof c)) {
            super.onRestoreInstanceState(state);
            return;
        }
        c ss = (c) state;
        super.onRestoreInstanceState(ss.getSuperState());
        this.x = ss;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        c ss = new c(super.onSaveInstanceState());
        ss.f۱۴۲۰c = getScrollY();
        return ss;
    }

    /* access modifiers changed from: package-private */
    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f۱۴۲۰c;

        c(Parcelable superState) {
            super(superState);
        }

        c(Parcel source) {
            super(source);
            this.f۱۴۲۰c = source.readInt();
        }

        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.f۱۴۲۰c);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f۱۴۲۰c + "}";
        }

        static class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public c createFromParcel(Parcel in) {
                return new c(in);
            }

            @Override // android.os.Parcelable.Creator
            public c[] newArray(int size) {
                return new c[size];
            }
        }
    }

    static class a extends android.support.v4.view.b {
        a() {
        }

        @Override // android.support.v4.view.b
        public boolean a(View host, int action, Bundle arguments) {
            if (super.a(host, action, arguments)) {
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
                nsvHost.b(0, targetScrollY);
                return true;
            } else if (action != 8192) {
                return false;
            } else {
                int targetScrollY2 = Math.max(nsvHost.getScrollY() - ((nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop()), 0);
                if (targetScrollY2 == nsvHost.getScrollY()) {
                    return false;
                }
                nsvHost.b(0, targetScrollY2);
                return true;
            }
        }

        @Override // android.support.v4.view.b
        public void a(View host, android.support.v4.view.d0.c info2) {
            int scrollRange;
            super.a(host, info2);
            NestedScrollView nsvHost = (NestedScrollView) host;
            info2.a((CharSequence) ScrollView.class.getName());
            if (nsvHost.isEnabled() && (scrollRange = nsvHost.getScrollRange()) > 0) {
                info2.k(true);
                if (nsvHost.getScrollY() > 0) {
                    info2.a(8192);
                }
                if (nsvHost.getScrollY() < scrollRange) {
                    info2.a(4096);
                }
            }
        }

        @Override // android.support.v4.view.b
        public void b(View host, AccessibilityEvent event) {
            super.b(host, event);
            NestedScrollView nsvHost = (NestedScrollView) host;
            event.setClassName(ScrollView.class.getName());
            event.setScrollable(nsvHost.getScrollRange() > 0);
            event.setScrollX(nsvHost.getScrollX());
            event.setScrollY(nsvHost.getScrollY());
            e.a(event, nsvHost.getScrollX());
            e.b(event, nsvHost.getScrollRange());
        }
    }
}
