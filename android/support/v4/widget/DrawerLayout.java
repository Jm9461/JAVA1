package android.support.v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.d0.c;
import android.support.v4.view.u;
import android.support.v4.widget.s;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    private static final int[] M = {16843828};
    static final int[] N = {16842931};
    static final boolean O = (Build.VERSION.SDK_INT >= 19);
    private static final boolean P;
    private Drawable A;
    private CharSequence B;
    private CharSequence C;
    private Object D;
    private boolean E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private Drawable I;
    private final ArrayList<View> J;
    private Rect K;
    private Matrix L;

    /* renamed from: c  reason: collision with root package name */
    private final c f۱۳۹۳c;

    /* renamed from: d  reason: collision with root package name */
    private float f۱۳۹۴d;

    /* renamed from: e  reason: collision with root package name */
    private int f۱۳۹۵e;

    /* renamed from: f  reason: collision with root package name */
    private int f۱۳۹۶f;

    /* renamed from: g  reason: collision with root package name */
    private float f۱۳۹۷g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f۱۳۹۸h;
    private final s i;
    private final s j;
    private final g k;
    private final g l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private d u;
    private List<d> v;
    private float w;
    private float x;
    private Drawable y;
    private Drawable z;

    public interface d {
        void a(int i);

        void a(View view);

        void a(View view, float f2);

        void b(View view);
    }

    static {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 21) {
            z2 = false;
        }
        P = z2;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawerLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f۱۳۹۳c = new c();
        this.f۱۳۹۶f = -1728053248;
        this.f۱۳۹۸h = new Paint();
        this.o = true;
        this.p = 3;
        this.q = 3;
        this.r = 3;
        this.s = 3;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        setDescendantFocusability(262144);
        float density = getResources().getDisplayMetrics().density;
        this.f۱۳۹۵e = (int) ((64.0f * density) + 0.5f);
        float minVel = 400.0f * density;
        this.k = new g(3);
        this.l = new g(5);
        this.i = s.a(this, 1.0f, this.k);
        this.i.d(1);
        this.i.a(minVel);
        this.k.a(this.i);
        this.j = s.a(this, 1.0f, this.l);
        this.j.d(2);
        this.j.a(minVel);
        this.l.a(this.j);
        setFocusableInTouchMode(true);
        u.f(this, 1);
        u.a(this, new b());
        setMotionEventSplittingEnabled(false);
        if (u.h(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new a(this));
                setSystemUiVisibility(1280);
                TypedArray a2 = context.obtainStyledAttributes(M);
                try {
                    this.y = a2.getDrawable(0);
                } finally {
                    a2.recycle();
                }
            } else {
                this.y = null;
            }
        }
        this.f۱۳۹۴d = 10.0f * density;
        this.J = new ArrayList<>();
    }

    class a implements View.OnApplyWindowInsetsListener {
        a(DrawerLayout this$0) {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
            ((DrawerLayout) view).a(insets, insets.getSystemWindowInsetTop() > 0);
            return insets.consumeSystemWindowInsets();
        }
    }

    public void setDrawerElevation(float elevation) {
        this.f۱۳۹۴d = elevation;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View child = getChildAt(i2);
            if (i(child)) {
                u.a(child, this.f۱۳۹۴d);
            }
        }
    }

    public float getDrawerElevation() {
        if (P) {
            return this.f۱۳۹۴d;
        }
        return 0.0f;
    }

    public void a(Object insets, boolean draw) {
        this.D = insets;
        this.E = draw;
        setWillNotDraw(!draw && getBackground() == null);
        requestLayout();
    }

    public void setScrimColor(int color) {
        this.f۱۳۹۶f = color;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(d listener) {
        d dVar = this.u;
        if (dVar != null) {
            b(dVar);
        }
        if (listener != null) {
            a(listener);
        }
        this.u = listener;
    }

    public void a(d listener) {
        if (listener != null) {
            if (this.v == null) {
                this.v = new ArrayList();
            }
            this.v.add(listener);
        }
    }

    public void b(d listener) {
        List<d> list;
        if (listener != null && (list = this.v) != null) {
            list.remove(listener);
        }
    }

    public void setDrawerLockMode(int lockMode) {
        a(lockMode, 3);
        a(lockMode, 5);
    }

    public void a(int lockMode, int edgeGravity) {
        View toOpen;
        int absGravity = android.support.v4.view.d.a(edgeGravity, u.k(this));
        if (edgeGravity == 3) {
            this.p = lockMode;
        } else if (edgeGravity == 5) {
            this.q = lockMode;
        } else if (edgeGravity == 8388611) {
            this.r = lockMode;
        } else if (edgeGravity == 8388613) {
            this.s = lockMode;
        }
        if (lockMode != 0) {
            (absGravity == 3 ? this.i : this.j).a();
        }
        if (lockMode == 1) {
            View toClose = b(absGravity);
            if (toClose != null) {
                a(toClose);
            }
        } else if (lockMode == 2 && (toOpen = b(absGravity)) != null) {
            k(toOpen);
        }
    }

    public int c(int edgeGravity) {
        int layoutDirection = u.k(this);
        if (edgeGravity == 3) {
            int rightLockMode = this.p;
            if (rightLockMode != 3) {
                return rightLockMode;
            }
            int leftLockMode = layoutDirection == 0 ? this.r : this.s;
            if (leftLockMode != 3) {
                return leftLockMode;
            }
            return 0;
        } else if (edgeGravity == 5) {
            int startLockMode = this.q;
            if (startLockMode != 3) {
                return startLockMode;
            }
            int rightLockMode2 = layoutDirection == 0 ? this.s : this.r;
            if (rightLockMode2 != 3) {
                return rightLockMode2;
            }
            return 0;
        } else if (edgeGravity == 8388611) {
            int endLockMode = this.r;
            if (endLockMode != 3) {
                return endLockMode;
            }
            int startLockMode2 = layoutDirection == 0 ? this.p : this.q;
            if (startLockMode2 != 3) {
                return startLockMode2;
            }
            return 0;
        } else if (edgeGravity != 8388613) {
            return 0;
        } else {
            int i2 = this.s;
            if (i2 != 3) {
                return i2;
            }
            int endLockMode2 = layoutDirection == 0 ? this.q : this.p;
            if (endLockMode2 != 3) {
                return endLockMode2;
            }
            return 0;
        }
    }

    public int d(View drawerView) {
        if (i(drawerView)) {
            return c(((e) drawerView.getLayoutParams()).f۱۴۰۱a);
        }
        throw new IllegalArgumentException("View " + drawerView + " is not a drawer");
    }

    public CharSequence d(int edgeGravity) {
        int absGravity = android.support.v4.view.d.a(edgeGravity, u.k(this));
        if (absGravity == 3) {
            return this.B;
        }
        if (absGravity == 5) {
            return this.C;
        }
        return null;
    }

    private boolean a(float x2, float y2, View child) {
        if (this.K == null) {
            this.K = new Rect();
        }
        child.getHitRect(this.K);
        return this.K.contains((int) x2, (int) y2);
    }

    private boolean a(MotionEvent event, View child) {
        if (!child.getMatrix().isIdentity()) {
            MotionEvent transformedEvent = b(event, child);
            boolean handled = child.dispatchGenericMotionEvent(transformedEvent);
            transformedEvent.recycle();
            return handled;
        }
        float offsetX = (float) (getScrollX() - child.getLeft());
        float offsetY = (float) (getScrollY() - child.getTop());
        event.offsetLocation(offsetX, offsetY);
        boolean handled2 = child.dispatchGenericMotionEvent(event);
        event.offsetLocation(-offsetX, -offsetY);
        return handled2;
    }

    private MotionEvent b(MotionEvent event, View child) {
        MotionEvent transformedEvent = MotionEvent.obtain(event);
        transformedEvent.offsetLocation((float) (getScrollX() - child.getLeft()), (float) (getScrollY() - child.getTop()));
        Matrix childMatrix = child.getMatrix();
        if (!childMatrix.isIdentity()) {
            if (this.L == null) {
                this.L = new Matrix();
            }
            childMatrix.invert(this.L);
            transformedEvent.transform(this.L);
        }
        return transformedEvent;
    }

    /* access modifiers changed from: package-private */
    public void a(int forGravity, int activeState, View activeDrawer) {
        int state;
        int leftState = this.i.e();
        int rightState = this.j.e();
        if (leftState == 1 || rightState == 1) {
            state = 1;
        } else if (leftState == 2 || rightState == 2) {
            state = 2;
        } else {
            state = 0;
        }
        if (activeDrawer != null && activeState == 0) {
            float f2 = ((e) activeDrawer.getLayoutParams()).f۱۴۰۲b;
            if (f2 == 0.0f) {
                b(activeDrawer);
            } else if (f2 == 1.0f) {
                c(activeDrawer);
            }
        }
        if (state != this.m) {
            this.m = state;
            List<d> list = this.v;
            if (list != null) {
                for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                    this.v.get(i2).a(state);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(View drawerView) {
        View rootView;
        e lp = (e) drawerView.getLayoutParams();
        if ((lp.f۱۴۰۴d & 1) == 1) {
            lp.f۱۴۰۴d = 0;
            List<d> list = this.v;
            if (list != null) {
                for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                    this.v.get(i2).b(drawerView);
                }
            }
            c(drawerView, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(View drawerView) {
        e lp = (e) drawerView.getLayoutParams();
        if ((lp.f۱۴۰۴d & 1) == 0) {
            lp.f۱۴۰۴d = 1;
            List<d> list = this.v;
            if (list != null) {
                for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                    this.v.get(i2).a(drawerView);
                }
            }
            c(drawerView, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    private void c(View drawerView, boolean isDrawerOpen) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            if ((isDrawerOpen || i(child)) && (!isDrawerOpen || child != drawerView)) {
                u.f(child, 4);
            } else {
                u.f(child, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(View drawerView, float slideOffset) {
        List<d> list = this.v;
        if (list != null) {
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                this.v.get(i2).a(drawerView, slideOffset);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(View drawerView, float slideOffset) {
        e lp = (e) drawerView.getLayoutParams();
        if (slideOffset != lp.f۱۴۰۲b) {
            lp.f۱۴۰۲b = slideOffset;
            a(drawerView, slideOffset);
        }
    }

    /* access modifiers changed from: package-private */
    public float f(View drawerView) {
        return ((e) drawerView.getLayoutParams()).f۱۴۰۲b;
    }

    /* access modifiers changed from: package-private */
    public int e(View drawerView) {
        return android.support.v4.view.d.a(((e) drawerView.getLayoutParams()).f۱۴۰۱a, u.k(this));
    }

    /* access modifiers changed from: package-private */
    public boolean a(View drawerView, int checkFor) {
        return (e(drawerView) & checkFor) == checkFor;
    }

    /* access modifiers changed from: package-private */
    public View c() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            if ((((e) child.getLayoutParams()).f۱۴۰۴d & 1) == 1) {
                return child;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b(View drawerView, float slideOffset) {
        float oldOffset = f(drawerView);
        int width = drawerView.getWidth();
        int dx = ((int) (((float) width) * slideOffset)) - ((int) (((float) width) * oldOffset));
        drawerView.offsetLeftAndRight(a(drawerView, 3) ? dx : -dx);
        c(drawerView, slideOffset);
    }

    /* access modifiers changed from: package-private */
    public View b(int gravity) {
        int absHorizGravity = android.support.v4.view.d.a(gravity, u.k(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            if ((e(child) & 7) == absHorizGravity) {
                return child;
            }
        }
        return null;
    }

    static String h(int gravity) {
        if ((gravity & 3) == 3) {
            return "LEFT";
        }
        if ((gravity & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(gravity);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o = true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = true;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        boolean applyInsets;
        int heightMode;
        int widthMode;
        DrawerLayout drawerLayout = this;
        int widthMode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        int heightMode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        if (!(widthMode2 == 1073741824 && heightMode2 == 1073741824)) {
            if (isInEditMode()) {
                if (widthMode2 == Integer.MIN_VALUE) {
                    widthMode2 = 1073741824;
                } else if (widthMode2 == 0) {
                    widthMode2 = 1073741824;
                    widthSize = 300;
                }
                if (heightMode2 == Integer.MIN_VALUE) {
                    heightMode2 = 1073741824;
                } else if (heightMode2 == 0) {
                    heightMode2 = 1073741824;
                    heightSize = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        drawerLayout.setMeasuredDimension(widthSize, heightSize);
        boolean applyInsets2 = drawerLayout.D != null && u.h(this);
        int layoutDirection = u.k(this);
        boolean hasDrawerOnLeftEdge = false;
        boolean hasDrawerOnRightEdge = false;
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View child = drawerLayout.getChildAt(i2);
            if (child.getVisibility() == 8) {
                widthMode = widthMode2;
                heightMode = heightMode2;
                applyInsets = applyInsets2;
            } else {
                e lp = (e) child.getLayoutParams();
                if (applyInsets2) {
                    int cgrav = android.support.v4.view.d.a(lp.f۱۴۰۱a, layoutDirection);
                    if (!u.h(child)) {
                        widthMode = widthMode2;
                        heightMode = heightMode2;
                        applyInsets = applyInsets2;
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets wi = (WindowInsets) drawerLayout.D;
                            if (cgrav == 3) {
                                wi = wi.replaceSystemWindowInsets(wi.getSystemWindowInsetLeft(), wi.getSystemWindowInsetTop(), 0, wi.getSystemWindowInsetBottom());
                            } else if (cgrav == 5) {
                                wi = wi.replaceSystemWindowInsets(0, wi.getSystemWindowInsetTop(), wi.getSystemWindowInsetRight(), wi.getSystemWindowInsetBottom());
                            }
                            ((ViewGroup.MarginLayoutParams) lp).leftMargin = wi.getSystemWindowInsetLeft();
                            ((ViewGroup.MarginLayoutParams) lp).topMargin = wi.getSystemWindowInsetTop();
                            ((ViewGroup.MarginLayoutParams) lp).rightMargin = wi.getSystemWindowInsetRight();
                            ((ViewGroup.MarginLayoutParams) lp).bottomMargin = wi.getSystemWindowInsetBottom();
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets wi2 = (WindowInsets) drawerLayout.D;
                        if (cgrav == 3) {
                            widthMode = widthMode2;
                            heightMode = heightMode2;
                            applyInsets = applyInsets2;
                            wi2 = wi2.replaceSystemWindowInsets(wi2.getSystemWindowInsetLeft(), wi2.getSystemWindowInsetTop(), 0, wi2.getSystemWindowInsetBottom());
                        } else {
                            widthMode = widthMode2;
                            heightMode = heightMode2;
                            applyInsets = applyInsets2;
                            if (cgrav == 5) {
                                wi2 = wi2.replaceSystemWindowInsets(0, wi2.getSystemWindowInsetTop(), wi2.getSystemWindowInsetRight(), wi2.getSystemWindowInsetBottom());
                            }
                        }
                        child.dispatchApplyWindowInsets(wi2);
                    } else {
                        widthMode = widthMode2;
                        heightMode = heightMode2;
                        applyInsets = applyInsets2;
                    }
                } else {
                    widthMode = widthMode2;
                    heightMode = heightMode2;
                    applyInsets = applyInsets2;
                }
                if (drawerLayout.g(child)) {
                    child.measure(View.MeasureSpec.makeMeasureSpec((widthSize - ((ViewGroup.MarginLayoutParams) lp).leftMargin) - ((ViewGroup.MarginLayoutParams) lp).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((heightSize - ((ViewGroup.MarginLayoutParams) lp).topMargin) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin, 1073741824));
                } else if (drawerLayout.i(child)) {
                    if (P) {
                        float g2 = u.g(child);
                        float f2 = drawerLayout.f۱۳۹۴d;
                        if (g2 != f2) {
                            u.a(child, f2);
                        }
                    }
                    int childGravity = drawerLayout.e(child) & 7;
                    boolean isLeftEdgeDrawer = childGravity == 3;
                    if ((!isLeftEdgeDrawer || !hasDrawerOnLeftEdge) && (isLeftEdgeDrawer || !hasDrawerOnRightEdge)) {
                        if (isLeftEdgeDrawer) {
                            hasDrawerOnLeftEdge = true;
                        } else {
                            hasDrawerOnRightEdge = true;
                        }
                        child.measure(ViewGroup.getChildMeasureSpec(widthMeasureSpec, drawerLayout.f۱۳۹۵e + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin, ((ViewGroup.MarginLayoutParams) lp).width), ViewGroup.getChildMeasureSpec(heightMeasureSpec, ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin, ((ViewGroup.MarginLayoutParams) lp).height));
                        i2++;
                        drawerLayout = this;
                        widthMode2 = widthMode;
                        heightMode2 = heightMode;
                        applyInsets2 = applyInsets;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + h(childGravity) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + child + " at index " + i2 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i2++;
            drawerLayout = this;
            widthMode2 = widthMode;
            heightMode2 = heightMode;
            applyInsets2 = applyInsets;
        }
    }

    private void i() {
        if (!P) {
            this.z = g();
            this.A = h();
        }
    }

    private Drawable g() {
        int layoutDirection = u.k(this);
        if (layoutDirection == 0) {
            Drawable drawable = this.F;
            if (drawable != null) {
                a(drawable, layoutDirection);
                return this.F;
            }
        } else {
            Drawable drawable2 = this.G;
            if (drawable2 != null) {
                a(drawable2, layoutDirection);
                return this.G;
            }
        }
        return this.H;
    }

    private Drawable h() {
        int layoutDirection = u.k(this);
        if (layoutDirection == 0) {
            Drawable drawable = this.G;
            if (drawable != null) {
                a(drawable, layoutDirection);
                return this.G;
            }
        } else {
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                a(drawable2, layoutDirection);
                return this.F;
            }
        }
        return this.I;
    }

    private boolean a(Drawable drawable, int layoutDirection) {
        if (drawable == null || !android.support.v4.graphics.drawable.a.f(drawable)) {
            return false;
        }
        android.support.v4.graphics.drawable.a.a(drawable, layoutDirection);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        int width;
        float newOffset;
        int childLeft;
        this.n = true;
        int width2 = r2 - l2;
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View child = getChildAt(i2);
            if (child.getVisibility() == 8) {
                width = width2;
            } else {
                e lp = (e) child.getLayoutParams();
                if (g(child)) {
                    int i3 = ((ViewGroup.MarginLayoutParams) lp).leftMargin;
                    child.layout(i3, ((ViewGroup.MarginLayoutParams) lp).topMargin, child.getMeasuredWidth() + i3, ((ViewGroup.MarginLayoutParams) lp).topMargin + child.getMeasuredHeight());
                    width = width2;
                } else {
                    int childWidth = child.getMeasuredWidth();
                    int childHeight = child.getMeasuredHeight();
                    if (a(child, 3)) {
                        childLeft = (-childWidth) + ((int) (((float) childWidth) * lp.f۱۴۰۲b));
                        newOffset = ((float) (childWidth + childLeft)) / ((float) childWidth);
                    } else {
                        childLeft = width2 - ((int) (((float) childWidth) * lp.f۱۴۰۲b));
                        newOffset = ((float) (width2 - childLeft)) / ((float) childWidth);
                    }
                    boolean changeOffset = newOffset != lp.f۱۴۰۲b;
                    int vgrav = lp.f۱۴۰۱a & 112;
                    if (vgrav == 16) {
                        int height = b2 - t2;
                        int childTop = (height - childHeight) / 2;
                        if (childTop < ((ViewGroup.MarginLayoutParams) lp).topMargin) {
                            childTop = ((ViewGroup.MarginLayoutParams) lp).topMargin;
                            width = width2;
                        } else {
                            int i4 = childTop + childHeight;
                            int i5 = ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
                            width = width2;
                            if (i4 > height - i5) {
                                childTop = (height - i5) - childHeight;
                            }
                        }
                        child.layout(childLeft, childTop, childLeft + childWidth, childTop + childHeight);
                    } else if (vgrav != 80) {
                        int i6 = ((ViewGroup.MarginLayoutParams) lp).topMargin;
                        child.layout(childLeft, i6, childLeft + childWidth, i6 + childHeight);
                        width = width2;
                    } else {
                        int height2 = b2 - t2;
                        child.layout(childLeft, (height2 - ((ViewGroup.MarginLayoutParams) lp).bottomMargin) - child.getMeasuredHeight(), childLeft + childWidth, height2 - ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
                        width = width2;
                    }
                    if (changeOffset) {
                        c(child, newOffset);
                    }
                    int newVisibility = lp.f۱۴۰۲b > 0.0f ? 0 : 4;
                    if (child.getVisibility() != newVisibility) {
                        child.setVisibility(newVisibility);
                    }
                }
            }
            i2++;
            width2 = width;
        }
        this.n = false;
        this.o = false;
    }

    public void requestLayout() {
        if (!this.n) {
            super.requestLayout();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float scrimOpacity = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            scrimOpacity = Math.max(scrimOpacity, ((e) getChildAt(i2).getLayoutParams()).f۱۴۰۲b);
        }
        this.f۱۳۹۷g = scrimOpacity;
        boolean leftDraggerSettling = this.i.a(true);
        boolean rightDraggerSettling = this.j.a(true);
        if (leftDraggerSettling || rightDraggerSettling) {
            u.B(this);
        }
    }

    private static boolean l(View v2) {
        Drawable bg = v2.getBackground();
        if (bg == null || bg.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    public void setStatusBarBackground(Drawable bg) {
        this.y = bg;
        invalidate();
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.y;
    }

    public void setStatusBarBackground(int resId) {
        this.y = resId != 0 ? android.support.v4.content.a.c(getContext(), resId) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int color) {
        this.y = new ColorDrawable(color);
        invalidate();
    }

    public void onRtlPropertiesChanged(int layoutDirection) {
        i();
    }

    public void onDraw(Canvas c2) {
        int inset;
        super.onDraw(c2);
        if (this.E && this.y != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                Object obj = this.D;
                inset = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            } else {
                inset = 0;
            }
            if (inset > 0) {
                this.y.setBounds(0, 0, getWidth(), inset);
                this.y.draw(c2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        int clipRight;
        int clipLeft;
        int height = getHeight();
        boolean drawingContent = g(child);
        int clipLeft2 = 0;
        int clipRight2 = getWidth();
        int restoreCount = canvas.save();
        if (drawingContent) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View v2 = getChildAt(i2);
                if (v2 != child && v2.getVisibility() == 0 && l(v2) && i(v2) && v2.getHeight() >= height) {
                    if (a(v2, 3)) {
                        int vright = v2.getRight();
                        if (vright > clipLeft2) {
                            clipLeft2 = vright;
                        }
                    } else {
                        int vleft = v2.getLeft();
                        if (vleft < clipRight2) {
                            clipRight2 = vleft;
                        }
                    }
                }
            }
            canvas.clipRect(clipLeft2, 0, clipRight2, getHeight());
            clipLeft = clipLeft2;
            clipRight = clipRight2;
        } else {
            clipLeft = 0;
            clipRight = clipRight2;
        }
        boolean result = super.drawChild(canvas, child, drawingTime);
        canvas.restoreToCount(restoreCount);
        float f2 = this.f۱۳۹۷g;
        if (f2 > 0.0f && drawingContent) {
            int i3 = this.f۱۳۹۶f;
            this.f۱۳۹۸h.setColor((((int) (((float) ((-16777216 & i3) >>> 24)) * f2)) << 24) | (i3 & 16777215));
            canvas.drawRect((float) clipLeft, 0.0f, (float) clipRight, (float) getHeight(), this.f۱۳۹۸h);
        } else if (this.z != null && a(child, 3)) {
            int shadowWidth = this.z.getIntrinsicWidth();
            int childRight = child.getRight();
            float alpha = Math.max(0.0f, Math.min(((float) childRight) / ((float) this.i.c()), 1.0f));
            this.z.setBounds(childRight, child.getTop(), childRight + shadowWidth, child.getBottom());
            this.z.setAlpha((int) (255.0f * alpha));
            this.z.draw(canvas);
        } else if (this.A != null && a(child, 5)) {
            int shadowWidth2 = this.A.getIntrinsicWidth();
            int childLeft = child.getLeft();
            float alpha2 = Math.max(0.0f, Math.min(((float) (getWidth() - childLeft)) / ((float) this.j.c()), 1.0f));
            this.A.setBounds(childLeft - shadowWidth2, child.getTop(), childLeft, child.getBottom());
            this.A.setAlpha((int) (255.0f * alpha2));
            this.A.draw(canvas);
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    public boolean g(View child) {
        return ((e) child.getLayoutParams()).f۱۴۰۱a == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean i(View child) {
        int absGravity = android.support.v4.view.d.a(((e) child.getLayoutParams()).f۱۴۰۱a, u.k(child));
        if ((absGravity & 3) == 0 && (absGravity & 5) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r0 != 3) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        if ((event.getSource() & 2) == 0 || event.getAction() == 10 || this.f۱۳۹۷g <= 0.0f) {
            return super.dispatchGenericMotionEvent(event);
        }
        int childrenCount = getChildCount();
        if (childrenCount == 0) {
            return false;
        }
        float x2 = event.getX();
        float y2 = event.getY();
        for (int i2 = childrenCount - 1; i2 >= 0; i2--) {
            View child = getChildAt(i2);
            if (a(x2, y2, child) && !g(child) && a(event, child)) {
                return true;
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent ev) {
        View openDrawer;
        this.i.a(ev);
        this.j.a(ev);
        int action = ev.getAction() & 255;
        boolean z2 = false;
        if (action == 0) {
            float x2 = ev.getX();
            float y2 = ev.getY();
            this.w = x2;
            this.x = y2;
            this.t = false;
        } else if (action == 1) {
            float x3 = ev.getX();
            float y3 = ev.getY();
            boolean peekingOnly = true;
            View touchedView = this.i.b((int) x3, (int) y3);
            if (touchedView != null && g(touchedView)) {
                float dx = x3 - this.w;
                float dy = y3 - this.x;
                int slop = this.i.d();
                if ((dx * dx) + (dy * dy) < ((float) (slop * slop)) && (openDrawer = c()) != null) {
                    if (d(openDrawer) == 2) {
                        z2 = true;
                    }
                    peekingOnly = z2;
                }
            }
            a(peekingOnly);
        } else if (action == 3) {
            a(true);
            this.t = false;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
        if (disallowIntercept) {
            a(true);
        }
    }

    public void b() {
        a(false);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean peekingOnly) {
        boolean needsInvalidate = false;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            e lp = (e) child.getLayoutParams();
            if (i(child) && (!peekingOnly || lp.f۱۴۰۳c)) {
                int childWidth = child.getWidth();
                if (a(child, 3)) {
                    needsInvalidate |= this.i.b(child, -childWidth, child.getTop());
                } else {
                    needsInvalidate |= this.j.b(child, getWidth(), child.getTop());
                }
                lp.f۱۴۰۳c = false;
            }
        }
        this.k.b();
        this.l.b();
        if (needsInvalidate) {
            invalidate();
        }
    }

    public void k(View drawerView) {
        b(drawerView, true);
    }

    public void b(View drawerView, boolean animate) {
        if (i(drawerView)) {
            e lp = (e) drawerView.getLayoutParams();
            if (this.o) {
                lp.f۱۴۰۲b = 1.0f;
                lp.f۱۴۰۴d = 1;
                c(drawerView, true);
            } else if (animate) {
                lp.f۱۴۰۴d |= 2;
                if (a(drawerView, 3)) {
                    this.i.b(drawerView, 0, drawerView.getTop());
                } else {
                    this.j.b(drawerView, getWidth() - drawerView.getWidth(), drawerView.getTop());
                }
            } else {
                b(drawerView, 1.0f);
                a(lp.f۱۴۰۱a, 0, drawerView);
                drawerView.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + drawerView + " is not a sliding drawer");
    }

    public void g(int gravity) {
        b(gravity, true);
    }

    public void b(int gravity, boolean animate) {
        View drawerView = b(gravity);
        if (drawerView != null) {
            b(drawerView, animate);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + h(gravity));
    }

    public void a(View drawerView) {
        a(drawerView, true);
    }

    public void a(View drawerView, boolean animate) {
        if (i(drawerView)) {
            e lp = (e) drawerView.getLayoutParams();
            if (this.o) {
                lp.f۱۴۰۲b = 0.0f;
                lp.f۱۴۰۴d = 0;
            } else if (animate) {
                lp.f۱۴۰۴d = 4 | lp.f۱۴۰۴d;
                if (a(drawerView, 3)) {
                    this.i.b(drawerView, -drawerView.getWidth(), drawerView.getTop());
                } else {
                    this.j.b(drawerView, getWidth(), drawerView.getTop());
                }
            } else {
                b(drawerView, 0.0f);
                a(lp.f۱۴۰۱a, 0, drawerView);
                drawerView.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + drawerView + " is not a sliding drawer");
    }

    public void a(int gravity) {
        a(gravity, true);
    }

    public void a(int gravity, boolean animate) {
        View drawerView = b(gravity);
        if (drawerView != null) {
            a(drawerView, animate);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + h(gravity));
    }

    public boolean h(View drawer) {
        if (i(drawer)) {
            return (((e) drawer.getLayoutParams()).f۱۴۰۴d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + drawer + " is not a drawer");
    }

    public boolean e(int drawerGravity) {
        View drawerView = b(drawerGravity);
        if (drawerView != null) {
            return h(drawerView);
        }
        return false;
    }

    public boolean j(View drawer) {
        if (i(drawer)) {
            return ((e) drawer.getLayoutParams()).f۱۴۰۲b > 0.0f;
        }
        throw new IllegalArgumentException("View " + drawer + " is not a drawer");
    }

    public boolean f(int drawerGravity) {
        View drawerView = b(drawerGravity);
        if (drawerView != null) {
            return j(drawerView);
        }
        return false;
    }

    private boolean e() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((e) getChildAt(i2).getLayoutParams()).f۱۴۰۳c) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        if (p2 instanceof e) {
            return new e((e) p2);
        }
        return p2 instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) p2) : new e(p2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return (p2 instanceof e) && super.checkLayoutParams(p2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new e(getContext(), attrs);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean isDrawerOpen = false;
            for (int i2 = 0; i2 < childCount; i2++) {
                View child = getChildAt(i2);
                if (!i(child)) {
                    this.J.add(child);
                } else if (h(child)) {
                    isDrawerOpen = true;
                    child.addFocusables(views, direction, focusableMode);
                }
            }
            if (!isDrawerOpen) {
                int nonDrawerViewsCount = this.J.size();
                for (int i3 = 0; i3 < nonDrawerViewsCount; i3++) {
                    View child2 = this.J.get(i3);
                    if (child2.getVisibility() == 0) {
                        child2.addFocusables(views, direction, focusableMode);
                    }
                }
            }
            this.J.clear();
        }
    }

    private boolean f() {
        return d() != null;
    }

    /* access modifiers changed from: package-private */
    public View d() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            if (i(child) && j(child)) {
                return child;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.t) {
            long now = SystemClock.uptimeMillis();
            MotionEvent cancelEvent = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchTouchEvent(cancelEvent);
            }
            cancelEvent.recycle();
            this.t = true;
        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != 4 || !f()) {
            return super.onKeyDown(keyCode, event);
        }
        event.startTracking();
        return true;
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode != 4) {
            return super.onKeyUp(keyCode, event);
        }
        View visibleDrawer = d();
        if (visibleDrawer != null && d(visibleDrawer) == 0) {
            b();
        }
        return visibleDrawer != null;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable state) {
        View toOpen;
        if (!(state instanceof f)) {
            super.onRestoreInstanceState(state);
            return;
        }
        f ss = (f) state;
        super.onRestoreInstanceState(ss.a());
        int i2 = ss.f۱۴۰۵e;
        if (!(i2 == 0 || (toOpen = b(i2)) == null)) {
            k(toOpen);
        }
        int i3 = ss.f۱۴۰۶f;
        if (i3 != 3) {
            a(i3, 3);
        }
        int i4 = ss.f۱۴۰۷g;
        if (i4 != 3) {
            a(i4, 5);
        }
        int i5 = ss.f۱۴۰۸h;
        if (i5 != 3) {
            a(i5, 8388611);
        }
        int i6 = ss.i;
        if (i6 != 3) {
            a(i6, 8388613);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        f ss = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            e lp = (e) getChildAt(i2).getLayoutParams();
            boolean isClosedAndOpening = false;
            boolean isOpenedAndNotClosing = lp.f۱۴۰۴d == 1;
            if (lp.f۱۴۰۴d == 2) {
                isClosedAndOpening = true;
            }
            if (isOpenedAndNotClosing || isClosedAndOpening) {
                ss.f۱۴۰۵e = lp.f۱۴۰۱a;
            } else {
                i2++;
            }
        }
        ss.f۱۴۰۶f = this.p;
        ss.f۱۴۰۷g = this.q;
        ss.f۱۴۰۸h = this.r;
        ss.i = this.s;
        return ss;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (c() != null || i(child)) {
            u.f(child, 4);
        } else {
            u.f(child, 1);
        }
        if (!O) {
            u.a(child, this.f۱۳۹۳c);
        }
    }

    static boolean m(View child) {
        return (u.i(child) == 4 || u.i(child) == 2) ? false : true;
    }

    /* access modifiers changed from: protected */
    public static class f extends android.support.v4.view.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        int f۱۴۰۵e = 0;

        /* renamed from: f  reason: collision with root package name */
        int f۱۴۰۶f;

        /* renamed from: g  reason: collision with root package name */
        int f۱۴۰۷g;

        /* renamed from: h  reason: collision with root package name */
        int f۱۴۰۸h;
        int i;

        public f(Parcel in, ClassLoader loader) {
            super(in, loader);
            this.f۱۴۰۵e = in.readInt();
            this.f۱۴۰۶f = in.readInt();
            this.f۱۴۰۷g = in.readInt();
            this.f۱۴۰۸h = in.readInt();
            this.i = in.readInt();
        }

        public f(Parcelable superState) {
            super(superState);
        }

        @Override // android.support.v4.view.a
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.f۱۴۰۵e);
            dest.writeInt(this.f۱۴۰۶f);
            dest.writeInt(this.f۱۴۰۷g);
            dest.writeInt(this.f۱۴۰۸h);
            dest.writeInt(this.i);
        }

        static class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public f createFromParcel(Parcel in, ClassLoader loader) {
                return new f(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel in) {
                return new f(in, null);
            }

            @Override // android.os.Parcelable.Creator
            public f[] newArray(int size) {
                return new f[size];
            }
        }
    }

    /* access modifiers changed from: private */
    public class g extends s.c {

        /* renamed from: a  reason: collision with root package name */
        private final int f۱۴۰۹a;

        /* renamed from: b  reason: collision with root package name */
        private s f۱۴۱۰b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f۱۴۱۱c = new a();

        class a implements Runnable {
            a() {
            }

            public void run() {
                g.this.a();
            }
        }

        g(int gravity) {
            this.f۱۴۰۹a = gravity;
        }

        public void a(s dragger) {
            this.f۱۴۱۰b = dragger;
        }

        public void b() {
            DrawerLayout.this.removeCallbacks(this.f۱۴۱۱c);
        }

        @Override // android.support.v4.widget.s.c
        public boolean b(View child, int pointerId) {
            return DrawerLayout.this.i(child) && DrawerLayout.this.a(child, this.f۱۴۰۹a) && DrawerLayout.this.d(child) == 0;
        }

        @Override // android.support.v4.widget.s.c
        public void c(int state) {
            DrawerLayout.this.a(this.f۱۴۰۹a, state, this.f۱۴۱۰b.b());
        }

        @Override // android.support.v4.widget.s.c
        public void a(View changedView, int left, int top, int dx, int dy) {
            float offset;
            int childWidth = changedView.getWidth();
            if (DrawerLayout.this.a(changedView, 3)) {
                offset = ((float) (childWidth + left)) / ((float) childWidth);
            } else {
                offset = ((float) (DrawerLayout.this.getWidth() - left)) / ((float) childWidth);
            }
            DrawerLayout.this.c(changedView, offset);
            changedView.setVisibility(offset == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // android.support.v4.widget.s.c
        public void a(View capturedChild, int activePointerId) {
            ((e) capturedChild.getLayoutParams()).f۱۴۰۳c = false;
            c();
        }

        private void c() {
            int otherGrav = 3;
            if (this.f۱۴۰۹a == 3) {
                otherGrav = 5;
            }
            View toClose = DrawerLayout.this.b(otherGrav);
            if (toClose != null) {
                DrawerLayout.this.a(toClose);
            }
        }

        @Override // android.support.v4.widget.s.c
        public void a(View releasedChild, float xvel, float yvel) {
            int width;
            float offset = DrawerLayout.this.f(releasedChild);
            int childWidth = releasedChild.getWidth();
            if (DrawerLayout.this.a(releasedChild, 3)) {
                width = (xvel > 0.0f || (xvel == 0.0f && offset > 0.5f)) ? 0 : -childWidth;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                width = (xvel < 0.0f || (xvel == 0.0f && offset > 0.5f)) ? width2 - childWidth : width2;
            }
            this.f۱۴۱۰b.d(width, releasedChild.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // android.support.v4.widget.s.c
        public void b(int edgeFlags, int pointerId) {
            DrawerLayout.this.postDelayed(this.f۱۴۱۱c, 160);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            View toCapture;
            int childLeft;
            int peekDistance = this.f۱۴۱۰b.c();
            int i = 0;
            boolean leftEdge = this.f۱۴۰۹a == 3;
            if (leftEdge) {
                toCapture = DrawerLayout.this.b(3);
                if (toCapture != null) {
                    i = -toCapture.getWidth();
                }
                childLeft = i + peekDistance;
            } else {
                toCapture = DrawerLayout.this.b(5);
                childLeft = DrawerLayout.this.getWidth() - peekDistance;
            }
            if (toCapture == null) {
                return;
            }
            if (((leftEdge && toCapture.getLeft() < childLeft) || (!leftEdge && toCapture.getLeft() > childLeft)) && DrawerLayout.this.d(toCapture) == 0) {
                this.f۱۴۱۰b.b(toCapture, childLeft, toCapture.getTop());
                ((e) toCapture.getLayoutParams()).f۱۴۰۳c = true;
                DrawerLayout.this.invalidate();
                c();
                DrawerLayout.this.a();
            }
        }

        @Override // android.support.v4.widget.s.c
        public boolean b(int edgeFlags) {
            return false;
        }

        @Override // android.support.v4.widget.s.c
        public void a(int edgeFlags, int pointerId) {
            View toCapture;
            if ((edgeFlags & 1) == 1) {
                toCapture = DrawerLayout.this.b(3);
            } else {
                toCapture = DrawerLayout.this.b(5);
            }
            if (toCapture != null && DrawerLayout.this.d(toCapture) == 0) {
                this.f۱۴۱۰b.a(toCapture, pointerId);
            }
        }

        @Override // android.support.v4.widget.s.c
        public int a(View child) {
            if (DrawerLayout.this.i(child)) {
                return child.getWidth();
            }
            return 0;
        }

        @Override // android.support.v4.widget.s.c
        public int a(View child, int left, int dx) {
            if (DrawerLayout.this.a(child, 3)) {
                return Math.max(-child.getWidth(), Math.min(left, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - child.getWidth(), Math.min(left, width));
        }

        @Override // android.support.v4.widget.s.c
        public int b(View child, int top, int dy) {
            return child.getTop();
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f۱۴۰۱a = 0;

        /* renamed from: b  reason: collision with root package name */
        float f۱۴۰۲b;

        /* renamed from: c  reason: collision with root package name */
        boolean f۱۴۰۳c;

        /* renamed from: d  reason: collision with root package name */
        int f۱۴۰۴d;

        public e(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            TypedArray a2 = c2.obtainStyledAttributes(attrs, DrawerLayout.N);
            this.f۱۴۰۱a = a2.getInt(0, 0);
            a2.recycle();
        }

        public e(int width, int height) {
            super(width, height);
        }

        public e(e source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.f۱۴۰۱a = source.f۱۴۰۱a;
        }

        public e(ViewGroup.LayoutParams source) {
            super(source);
        }

        public e(ViewGroup.MarginLayoutParams source) {
            super(source);
        }
    }

    class b extends android.support.v4.view.b {

        /* renamed from: c  reason: collision with root package name */
        private final Rect f۱۳۹۹c = new Rect();

        b() {
        }

        @Override // android.support.v4.view.b
        public void a(View host, android.support.v4.view.d0.c info2) {
            if (DrawerLayout.O) {
                super.a(host, info2);
            } else {
                android.support.v4.view.d0.c superNode = android.support.v4.view.d0.c.a(info2);
                super.a(host, superNode);
                info2.c(host);
                ViewParent parent = u.p(host);
                if (parent instanceof View) {
                    info2.b((View) parent);
                }
                a(info2, superNode);
                superNode.u();
                a(info2, (ViewGroup) host);
            }
            info2.a((CharSequence) DrawerLayout.class.getName());
            info2.h(false);
            info2.i(false);
            info2.a(c.a.f۱۳۴۰b);
            info2.a(c.a.f۱۳۴۱c);
        }

        @Override // android.support.v4.view.b
        public void b(View host, AccessibilityEvent event) {
            super.b(host, event);
            event.setClassName(DrawerLayout.class.getName());
        }

        @Override // android.support.v4.view.b
        public boolean a(View host, AccessibilityEvent event) {
            CharSequence title;
            if (event.getEventType() != 32) {
                return super.a(host, event);
            }
            List<CharSequence> eventText = event.getText();
            View visibleDrawer = DrawerLayout.this.d();
            if (visibleDrawer == null || (title = DrawerLayout.this.d(DrawerLayout.this.e(visibleDrawer))) == null) {
                return true;
            }
            eventText.add(title);
            return true;
        }

        @Override // android.support.v4.view.b
        public boolean a(ViewGroup host, View child, AccessibilityEvent event) {
            if (DrawerLayout.O || DrawerLayout.m(child)) {
                return super.a(host, child, event);
            }
            return false;
        }

        private void a(android.support.v4.view.d0.c info2, ViewGroup v) {
            int childCount = v.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = v.getChildAt(i);
                if (DrawerLayout.m(child)) {
                    info2.a(child);
                }
            }
        }

        private void a(android.support.v4.view.d0.c dest, android.support.v4.view.d0.c src) {
            Rect rect = this.f۱۳۹۹c;
            src.a(rect);
            dest.c(rect);
            src.b(rect);
            dest.d(rect);
            dest.n(src.t());
            dest.e(src.f());
            dest.a(src.c());
            dest.b(src.d());
            dest.g(src.m());
            dest.d(src.l());
            dest.h(src.n());
            dest.i(src.o());
            dest.a(src.i());
            dest.l(src.s());
            dest.j(src.p());
            dest.a(src.a());
        }
    }

    static final class c extends android.support.v4.view.b {
        c() {
        }

        @Override // android.support.v4.view.b
        public void a(View child, android.support.v4.view.d0.c info2) {
            super.a(child, info2);
            if (!DrawerLayout.m(child)) {
                info2.b((View) null);
            }
        }
    }
}
