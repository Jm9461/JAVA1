package android.support.p۰۴۷v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۳v4.view.AbstractCn;
import android.support.p۰۴۳v4.view.Co;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements AbstractCe0, AbstractCn {

    /* renamed from: D  reason: contains not printable characters */
    static final int[] f۱۱۳۹۳D = {p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionBarSize, 16842841};

    /* renamed from: A  reason: contains not printable characters */
    private final Runnable f۱۱۳۹۴A;

    /* renamed from: B  reason: contains not printable characters */
    private final Runnable f۱۱۳۹۵B;

    /* renamed from: C  reason: contains not printable characters */
    private final Co f۱۱۳۹۶C;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۱۳۹۷c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۱۳۹۸d;

    /* renamed from: e  reason: contains not printable characters */
    private ContentFrameLayout f۱۱۳۹۹e;

    /* renamed from: f  reason: contains not printable characters */
    ActionBarContainer f۱۱۴۰۰f;

    /* renamed from: g  reason: contains not printable characters */
    private AbstractCf0 f۱۱۴۰۱g;

    /* renamed from: h  reason: contains not printable characters */
    private Drawable f۱۱۴۰۲h;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۱۱۴۰۳i;

    /* renamed from: j  reason: contains not printable characters */
    private boolean f۱۱۴۰۴j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۱۱۴۰۵k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۱۴۰۶l;

    /* renamed from: m  reason: contains not printable characters */
    boolean f۱۱۴۰۷m;

    /* renamed from: n  reason: contains not printable characters */
    private int f۱۱۴۰۸n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۱۴۰۹o;

    /* renamed from: p  reason: contains not printable characters */
    private final Rect f۱۱۴۱۰p;

    /* renamed from: q  reason: contains not printable characters */
    private final Rect f۱۱۴۱۱q;

    /* renamed from: r  reason: contains not printable characters */
    private final Rect f۱۱۴۱۲r;

    /* renamed from: s  reason: contains not printable characters */
    private final Rect f۱۱۴۱۳s;

    /* renamed from: t  reason: contains not printable characters */
    private final Rect f۱۱۴۱۴t;

    /* renamed from: u  reason: contains not printable characters */
    private final Rect f۱۱۴۱۵u;

    /* renamed from: v  reason: contains not printable characters */
    private final Rect f۱۱۴۱۶v;

    /* renamed from: w  reason: contains not printable characters */
    private AbstractCd f۱۱۴۱۷w;

    /* renamed from: x  reason: contains not printable characters */
    private OverScroller f۱۱۴۱۸x;

    /* renamed from: y  reason: contains not printable characters */
    ViewPropertyAnimator f۱۱۴۱۹y;

    /* renamed from: z  reason: contains not printable characters */
    final AnimatorListenerAdapter f۱۱۴۲۰z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$d  reason: invalid class name */
    public interface AbstractCd {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۴۰۴۶a();

        /* renamed from: a  reason: contains not printable characters */
        void m۱۴۰۴۷a(int i);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۴۰۴۸a(boolean z);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۴۰۴۹b();

        /* renamed from: c  reason: contains not printable characters */
        void m۱۴۰۵۰c();

        /* renamed from: d  reason: contains not printable characters */
        void m۱۴۰۵۱d();
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a  reason: invalid class name */
    class Ca extends AnimatorListenerAdapter {
        Ca() {
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f۱۱۴۱۹y = null;
            actionBarOverlayLayout.f۱۱۴۰۷m = false;
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f۱۱۴۱۹y = null;
            actionBarOverlayLayout.f۱۱۴۰۷m = false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$b  reason: invalid class name */
    class RunnableCb implements Runnable {
        RunnableCb() {
        }

        public void run() {
            ActionBarOverlayLayout.this.m۱۴۰۴۳h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f۱۱۴۱۹y = actionBarOverlayLayout.f۱۱۴۰۰f.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f۱۱۴۲۰z);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$c  reason: invalid class name */
    class RunnableCc implements Runnable {
        RunnableCc() {
        }

        public void run() {
            ActionBarOverlayLayout.this.m۱۴۰۴۳h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f۱۱۴۱۹y = actionBarOverlayLayout.f۱۱۴۰۰f.animate().translationY((float) (-ActionBarOverlayLayout.this.f۱۱۴۰۰f.getHeight())).setListener(ActionBarOverlayLayout.this.f۱۱۴۲۰z);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f۱۱۳۹۸d = 0;
        this.f۱۱۴۱۰p = new Rect();
        this.f۱۱۴۱۱q = new Rect();
        this.f۱۱۴۱۲r = new Rect();
        this.f۱۱۴۱۳s = new Rect();
        this.f۱۱۴۱۴t = new Rect();
        this.f۱۱۴۱۵u = new Rect();
        this.f۱۱۴۱۶v = new Rect();
        this.f۱۱۴۲۰z = new Ca();
        this.f۱۱۳۹۴A = new RunnableCb();
        this.f۱۱۳۹۵B = new RunnableCc();
        m۱۴۰۲۷a(context);
        this.f۱۱۳۹۶C = new Co(this);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۴۰۲۷a(Context context) {
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(f۱۱۳۹۳D);
        boolean z = false;
        this.f۱۱۳۹۷c = ta.getDimensionPixelSize(0, 0);
        this.f۱۱۴۰۲h = ta.getDrawable(1);
        setWillNotDraw(this.f۱۱۴۰۲h == null);
        ta.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f۱۱۴۰۳i = z;
        this.f۱۱۴۱۸x = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m۱۴۰۴۳h();
    }

    public void setActionBarVisibilityCallback(AbstractCd cb) {
        this.f۱۱۴۱۷w = cb;
        if (getWindowToken() != null) {
            this.f۱۱۴۱۷w.m۱۴۰۴۷a(this.f۱۱۳۹۸d);
            if (this.f۱۱۴۰۹o != 0) {
                onWindowSystemUiVisibilityChanged(this.f۱۱۴۰۹o);
                Cu.m۱۲۹۷۱C(this);
            }
        }
    }

    public void setOverlayMode(boolean overlayMode) {
        this.f۱۱۴۰۴j = overlayMode;
        this.f۱۱۴۰۳i = overlayMode && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۴۰۴۴i() {
        return this.f۱۱۴۰۴j;
    }

    public void setHasNonEmbeddedTabs(boolean hasNonEmbeddedTabs) {
        this.f۱۱۴۰۵k = hasNonEmbeddedTabs;
    }

    public void setShowingForActionMode(boolean showing) {
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        m۱۴۰۲۷a(getContext());
        Cu.m۱۲۹۷۱C(this);
    }

    public void onWindowSystemUiVisibilityChanged(int visible) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(visible);
        }
        m۱۴۰۴۵j();
        int diff = this.f۱۱۴۰۹o ^ visible;
        this.f۱۱۴۰۹o = visible;
        boolean z = true;
        boolean barVisible = (visible & 4) == 0;
        boolean stable = (visible & 256) != 0;
        AbstractCd dVar = this.f۱۱۴۱۷w;
        if (dVar != null) {
            if (stable) {
                z = false;
            }
            dVar.m۱۴۰۴۸a(z);
            if (barVisible || !stable) {
                this.f۱۱۴۱۷w.m۱۴۰۴۶a();
            } else {
                this.f۱۱۴۱۷w.m۱۴۰۵۰c();
            }
        }
        if ((diff & 256) != 0 && this.f۱۱۴۱۷w != null) {
            Cu.m۱۲۹۷۱C(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        this.f۱۱۳۹۸d = visibility;
        AbstractCd dVar = this.f۱۱۴۱۷w;
        if (dVar != null) {
            dVar.m۱۴۰۴۷a(visibility);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۴۰۲۹a(View view, Rect insets, boolean left, boolean top, boolean bottom, boolean right) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean changed = false;
        Ce lp = (Ce) view.getLayoutParams();
        if (left && ((ViewGroup.MarginLayoutParams) lp).leftMargin != (i4 = insets.left)) {
            changed = true;
            ((ViewGroup.MarginLayoutParams) lp).leftMargin = i4;
        }
        if (top && ((ViewGroup.MarginLayoutParams) lp).topMargin != (i3 = insets.top)) {
            changed = true;
            ((ViewGroup.MarginLayoutParams) lp).topMargin = i3;
        }
        if (right && ((ViewGroup.MarginLayoutParams) lp).rightMargin != (i2 = insets.right)) {
            changed = true;
            ((ViewGroup.MarginLayoutParams) lp).rightMargin = i2;
        }
        if (!bottom || ((ViewGroup.MarginLayoutParams) lp).bottomMargin == (i = insets.bottom)) {
            return changed;
        }
        ((ViewGroup.MarginLayoutParams) lp).bottomMargin = i;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect insets) {
        m۱۴۰۴۵j();
        if ((Cu.m۱۳۰۲۱r(this) & 256) != 0) {
        }
        boolean changed = m۱۴۰۲۹a(this.f۱۱۴۰۰f, insets, true, true, false, true);
        this.f۱۱۴۱۳s.set(insets);
        Cr1.m۱۵۵۶۶a(this, this.f۱۱۴۱۳s, this.f۱۱۴۱۰p);
        if (!this.f۱۱۴۱۴t.equals(this.f۱۱۴۱۳s)) {
            changed = true;
            this.f۱۱۴۱۴t.set(this.f۱۱۴۱۳s);
        }
        if (!this.f۱۱۴۱۱q.equals(this.f۱۱۴۱۰p)) {
            changed = true;
            this.f۱۱۴۱۱q.set(this.f۱۱۴۱۰p);
        }
        if (changed) {
            requestLayout();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public Ce generateDefaultLayoutParams() {
        return new Ce(-1, -1);
    }

    @Override // android.view.ViewGroup
    public Ce generateLayoutParams(AttributeSet attrs) {
        return new Ce(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new Ce(p);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof Ce;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        m۱۴۰۴۵j();
        int topInset = 0;
        measureChildWithMargins(this.f۱۱۴۰۰f, widthMeasureSpec, 0, heightMeasureSpec, 0);
        Ce lp = (Ce) this.f۱۱۴۰۰f.getLayoutParams();
        int maxWidth = Math.max(0, this.f۱۱۴۰۰f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin);
        int maxHeight = Math.max(0, this.f۱۱۴۰۰f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
        int childState = View.combineMeasuredStates(0, this.f۱۱۴۰۰f.getMeasuredState());
        boolean stable = (Cu.m۱۳۰۲۱r(this) & 256) != 0;
        if (stable) {
            topInset = this.f۱۱۳۹۷c;
            if (this.f۱۱۴۰۵k && this.f۱۱۴۰۰f.getTabContainer() != null) {
                topInset += this.f۱۱۳۹۷c;
            }
        } else if (this.f۱۱۴۰۰f.getVisibility() != 8) {
            topInset = this.f۱۱۴۰۰f.getMeasuredHeight();
        }
        this.f۱۱۴۱۲r.set(this.f۱۱۴۱۰p);
        this.f۱۱۴۱۵u.set(this.f۱۱۴۱۳s);
        if (this.f۱۱۴۰۴j || stable) {
            Rect rect = this.f۱۱۴۱۵u;
            rect.top += topInset;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.f۱۱۴۱۲r;
            rect2.top += topInset;
            rect2.bottom += 0;
        }
        m۱۴۰۲۹a(this.f۱۱۳۹۹e, this.f۱۱۴۱۲r, true, true, true, true);
        if (!this.f۱۱۴۱۶v.equals(this.f۱۱۴۱۵u)) {
            this.f۱۱۴۱۶v.set(this.f۱۱۴۱۵u);
            this.f۱۱۳۹۹e.m۱۴۰۹۰a(this.f۱۱۴۱۵u);
        }
        measureChildWithMargins(this.f۱۱۳۹۹e, widthMeasureSpec, 0, heightMeasureSpec, 0);
        Ce lp2 = (Ce) this.f۱۱۳۹۹e.getLayoutParams();
        int maxWidth2 = Math.max(maxWidth, this.f۱۱۳۹۹e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) lp2).leftMargin + ((ViewGroup.MarginLayoutParams) lp2).rightMargin);
        int maxHeight2 = Math.max(maxHeight, this.f۱۱۳۹۹e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp2).topMargin + ((ViewGroup.MarginLayoutParams) lp2).bottomMargin);
        int childState2 = View.combineMeasuredStates(childState, this.f۱۱۳۹۹e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(maxWidth2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), widthMeasureSpec, childState2), View.resolveSizeAndState(Math.max(maxHeight2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), heightMeasureSpec, childState2 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int count = getChildCount();
        int parentLeft = getPaddingLeft();
        int paddingRight = (right - left) - getPaddingRight();
        int parentTop = getPaddingTop();
        int paddingBottom = (bottom - top) - getPaddingBottom();
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            if (child.getVisibility() != 8) {
                Ce lp = (Ce) child.getLayoutParams();
                int width = child.getMeasuredWidth();
                int height = child.getMeasuredHeight();
                int childLeft = ((ViewGroup.MarginLayoutParams) lp).leftMargin + parentLeft;
                int childTop = ((ViewGroup.MarginLayoutParams) lp).topMargin + parentTop;
                child.layout(childLeft, childTop, childLeft + width, childTop + height);
            }
        }
    }

    public void draw(Canvas c) {
        super.draw(c);
        if (this.f۱۱۴۰۲h != null && !this.f۱۱۴۰۳i) {
            int top = this.f۱۱۴۰۰f.getVisibility() == 0 ? (int) (((float) this.f۱۱۴۰۰f.getBottom()) + this.f۱۱۴۰۰f.getTranslationY() + 0.5f) : 0;
            this.f۱۱۴۰۲h.setBounds(0, top, getWidth(), this.f۱۱۴۰۲h.getIntrinsicHeight() + top);
            this.f۱۱۴۰۲h.draw(c);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public boolean onStartNestedScroll(View child, View target, int axes) {
        if ((axes & 2) == 0 || this.f۱۱۴۰۰f.getVisibility() != 0) {
            return false;
        }
        return this.f۱۱۴۰۶l;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public void onNestedScrollAccepted(View child, View target, int axes) {
        this.f۱۱۳۹۶C.m۱۲۹۴۸a(child, target, axes);
        this.f۱۱۴۰۸n = getActionBarHideOffset();
        m۱۴۰۴۳h();
        AbstractCd dVar = this.f۱۱۴۱۷w;
        if (dVar != null) {
            dVar.m۱۴۰۴۹b();
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        this.f۱۱۴۰۸n += dyConsumed;
        setActionBarHideOffset(this.f۱۱۴۰۸n);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public void onStopNestedScroll(View target) {
        if (this.f۱۱۴۰۶l && !this.f۱۱۴۰۷m) {
            if (this.f۱۱۴۰۸n <= this.f۱۱۴۰۰f.getHeight()) {
                m۱۴۰۳۲m();
            } else {
                m۱۴۰۳۱l();
            }
        }
        AbstractCd dVar = this.f۱۱۴۱۷w;
        if (dVar != null) {
            dVar.m۱۴۰۵۱d();
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!this.f۱۱۴۰۶l || !consumed) {
            return false;
        }
        if (m۱۴۰۲۸a(velocityX, velocityY)) {
            m۱۴۰۳۰k();
        } else {
            m۱۴۰۳۳n();
        }
        this.f۱۱۴۰۷m = true;
        return true;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCn
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return false;
    }

    public int getNestedScrollAxes() {
        return this.f۱۱۳۹۶C.m۱۲۹۴۶a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j  reason: contains not printable characters */
    public void m۱۴۰۴۵j() {
        if (this.f۱۱۳۹۹e == null) {
            this.f۱۱۳۹۹e = (ContentFrameLayout) findViewById(Cf.action_bar_activity_content);
            this.f۱۱۴۰۰f = (ActionBarContainer) findViewById(Cf.action_bar_container);
            this.f۱۱۴۰۱g = m۱۴۰۲۶a(findViewById(Cf.action_bar));
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private AbstractCf0 m۱۴۰۲۶a(View view) {
        if (view instanceof AbstractCf0) {
            return (AbstractCf0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean hideOnContentScroll) {
        if (hideOnContentScroll != this.f۱۱۴۰۶l) {
            this.f۱۱۴۰۶l = hideOnContentScroll;
            if (!hideOnContentScroll) {
                m۱۴۰۴۳h();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f۱۱۴۰۰f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int offset) {
        m۱۴۰۴۳h();
        this.f۱۱۴۰۰f.setTranslationY((float) (-Math.max(0, Math.min(offset, this.f۱۱۴۰۰f.getHeight()))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public void m۱۴۰۴۳h() {
        removeCallbacks(this.f۱۱۳۹۴A);
        removeCallbacks(this.f۱۱۳۹۵B);
        ViewPropertyAnimator viewPropertyAnimator = this.f۱۱۴۱۹y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: m  reason: contains not printable characters */
    private void m۱۴۰۳۲m() {
        m۱۴۰۴۳h();
        postDelayed(this.f۱۱۳۹۴A, 600);
    }

    /* renamed from: l  reason: contains not printable characters */
    private void m۱۴۰۳۱l() {
        m۱۴۰۴۳h();
        postDelayed(this.f۱۱۳۹۵B, 600);
    }

    /* renamed from: n  reason: contains not printable characters */
    private void m۱۴۰۳۳n() {
        m۱۴۰۴۳h();
        this.f۱۱۳۹۴A.run();
    }

    /* renamed from: k  reason: contains not printable characters */
    private void m۱۴۰۳۰k() {
        m۱۴۰۴۳h();
        this.f۱۱۳۹۵B.run();
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۴۰۲۸a(float velocityX, float velocityY) {
        this.f۱۱۴۱۸x.fling(0, 0, 0, (int) velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f۱۱۴۱۸x.getFinalY() > this.f۱۱۴۰۰f.getHeight();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCe0
    public void setWindowCallback(Window.Callback cb) {
        m۱۴۰۴۵j();
        this.f۱۱۴۰۱g.setWindowCallback(cb);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCe0
    public void setWindowTitle(CharSequence title) {
        m۱۴۰۴۵j();
        this.f۱۱۴۰۱g.setWindowTitle(title);
    }

    public CharSequence getTitle() {
        m۱۴۰۴۵j();
        return this.f۱۱۴۰۱g.getTitle();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCe0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۰۳۴a(int windowFeature) {
        m۱۴۰۴۵j();
        if (windowFeature == 2) {
            this.f۱۱۴۰۱g.m۱۵۲۳۰m();
        } else if (windowFeature == 5) {
            this.f۱۱۴۰۱g.m۱۵۲۳۲o();
        } else if (windowFeature == 109) {
            setOverlayMode(true);
        }
    }

    public void setUiOptions(int uiOptions) {
    }

    public void setIcon(int resId) {
        m۱۴۰۴۵j();
        this.f۱۱۴۰۱g.setIcon(resId);
    }

    public void setIcon(Drawable d) {
        m۱۴۰۴۵j();
        this.f۱۱۴۰۱g.setIcon(d);
    }

    public void setLogo(int resId) {
        m۱۴۰۴۵j();
        this.f۱۱۴۰۱g.m۱۵۲۱۴b(resId);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCe0
    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۴۰۴۱f() {
        m۱۴۰۴۵j();
        return this.f۱۱۴۰۱g.m۱۵۲۲۳f();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCe0
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۴۰۳۷b() {
        m۱۴۰۴۵j();
        return this.f۱۱۴۰۱g.m۱۵۲۱۷b();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCe0
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۰۳۶a() {
        m۱۴۰۴۵j();
        return this.f۱۱۴۰۱g.m۱۵۲۱۳a();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCe0
    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۴۰۳۹d() {
        m۱۴۰۴۵j();
        return this.f۱۱۴۰۱g.m۱۵۲۲۱d();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCe0
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۴۰۳۸c() {
        m۱۴۰۴۵j();
        return this.f۱۱۴۰۱g.m۱۵۲۱۹c();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCe0
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۴۰۴۰e() {
        m۱۴۰۴۵j();
        this.f۱۱۴۰۱g.m۱۵۲۲۲e();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCe0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۰۳۵a(Menu menu, AbstractCp.AbstractCa cb) {
        m۱۴۰۴۵j();
        this.f۱۱۴۰۱g.m۱۵۲۱۱a(menu, cb);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCe0
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۴۰۴۲g() {
        m۱۴۰۴۵j();
        this.f۱۱۴۰۱g.m۱۵۲۲۴g();
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$e  reason: invalid class name */
    public static class Ce extends ViewGroup.MarginLayoutParams {
        public Ce(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public Ce(int width, int height) {
            super(width, height);
        }

        public Ce(ViewGroup.LayoutParams source) {
            super(source);
        }
    }
}
