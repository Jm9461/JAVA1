package android.support.v7.widget;

import a.b.h.a.f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.n;
import android.support.v4.view.o;
import android.support.v4.view.u;
import android.support.v7.view.menu.p;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;

public class ActionBarOverlayLayout extends ViewGroup implements e0, n {
    static final int[] D = {a.b.h.a.a.actionBarSize, 16842841};
    private final Runnable A;
    private final Runnable B;
    private final o C;

    /* renamed from: c  reason: collision with root package name */
    private int f۱۷۵۲c;

    /* renamed from: d  reason: collision with root package name */
    private int f۱۷۵۳d;

    /* renamed from: e  reason: collision with root package name */
    private ContentFrameLayout f۱۷۵۴e;

    /* renamed from: f  reason: collision with root package name */
    ActionBarContainer f۱۷۵۵f;

    /* renamed from: g  reason: collision with root package name */
    private f0 f۱۷۵۶g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f۱۷۵۷h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    boolean m;
    private int n;
    private int o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private d w;
    private OverScroller x;
    ViewPropertyAnimator y;
    final AnimatorListenerAdapter z;

    public interface d {
        void a();

        void a(int i);

        void a(boolean z);

        void b();

        void c();

        void d();
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.y = null;
            actionBarOverlayLayout.m = false;
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.y = null;
            actionBarOverlayLayout.m = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.y = actionBarOverlayLayout.f۱۷۵۵f.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.z);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.y = actionBarOverlayLayout.f۱۷۵۵f.animate().translationY((float) (-ActionBarOverlayLayout.this.f۱۷۵۵f.getHeight())).setListener(ActionBarOverlayLayout.this.z);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f۱۷۵۳d = 0;
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.z = new a();
        this.A = new b();
        this.B = new c();
        a(context);
        this.C = new o(this);
    }

    private void a(Context context) {
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(D);
        boolean z2 = false;
        this.f۱۷۵۲c = ta.getDimensionPixelSize(0, 0);
        this.f۱۷۵۷h = ta.getDrawable(1);
        setWillNotDraw(this.f۱۷۵۷h == null);
        ta.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.i = z2;
        this.x = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    public void setActionBarVisibilityCallback(d cb) {
        this.w = cb;
        if (getWindowToken() != null) {
            this.w.a(this.f۱۷۵۳d);
            if (this.o != 0) {
                onWindowSystemUiVisibilityChanged(this.o);
                u.C(this);
            }
        }
    }

    public void setOverlayMode(boolean overlayMode) {
        this.j = overlayMode;
        this.i = overlayMode && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public boolean i() {
        return this.j;
    }

    public void setHasNonEmbeddedTabs(boolean hasNonEmbeddedTabs) {
        this.k = hasNonEmbeddedTabs;
    }

    public void setShowingForActionMode(boolean showing) {
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        a(getContext());
        u.C(this);
    }

    public void onWindowSystemUiVisibilityChanged(int visible) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(visible);
        }
        j();
        int diff = this.o ^ visible;
        this.o = visible;
        boolean z2 = true;
        boolean barVisible = (visible & 4) == 0;
        boolean stable = (visible & 256) != 0;
        d dVar = this.w;
        if (dVar != null) {
            if (stable) {
                z2 = false;
            }
            dVar.a(z2);
            if (barVisible || !stable) {
                this.w.a();
            } else {
                this.w.c();
            }
        }
        if ((diff & 256) != 0 && this.w != null) {
            u.C(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        this.f۱۷۵۳d = visibility;
        d dVar = this.w;
        if (dVar != null) {
            dVar.a(visibility);
        }
    }

    private boolean a(View view, Rect insets, boolean left, boolean top, boolean bottom, boolean right) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean changed = false;
        e lp = (e) view.getLayoutParams();
        if (left && ((ViewGroup.MarginLayoutParams) lp).leftMargin != (i5 = insets.left)) {
            changed = true;
            ((ViewGroup.MarginLayoutParams) lp).leftMargin = i5;
        }
        if (top && ((ViewGroup.MarginLayoutParams) lp).topMargin != (i4 = insets.top)) {
            changed = true;
            ((ViewGroup.MarginLayoutParams) lp).topMargin = i4;
        }
        if (right && ((ViewGroup.MarginLayoutParams) lp).rightMargin != (i3 = insets.right)) {
            changed = true;
            ((ViewGroup.MarginLayoutParams) lp).rightMargin = i3;
        }
        if (!bottom || ((ViewGroup.MarginLayoutParams) lp).bottomMargin == (i2 = insets.bottom)) {
            return changed;
        }
        ((ViewGroup.MarginLayoutParams) lp).bottomMargin = i2;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect insets) {
        j();
        if ((u.r(this) & 256) != 0) {
        }
        boolean changed = a(this.f۱۷۵۵f, insets, true, true, false, true);
        this.s.set(insets);
        r1.a(this, this.s, this.p);
        if (!this.t.equals(this.s)) {
            changed = true;
            this.t.set(this.s);
        }
        if (!this.q.equals(this.p)) {
            changed = true;
            this.q.set(this.p);
        }
        if (changed) {
            requestLayout();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public e generateLayoutParams(AttributeSet attrs) {
        return new e(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        return new e(p2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return p2 instanceof e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        j();
        int topInset = 0;
        measureChildWithMargins(this.f۱۷۵۵f, widthMeasureSpec, 0, heightMeasureSpec, 0);
        e lp = (e) this.f۱۷۵۵f.getLayoutParams();
        int maxWidth = Math.max(0, this.f۱۷۵۵f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin);
        int maxHeight = Math.max(0, this.f۱۷۵۵f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
        int childState = View.combineMeasuredStates(0, this.f۱۷۵۵f.getMeasuredState());
        boolean stable = (u.r(this) & 256) != 0;
        if (stable) {
            topInset = this.f۱۷۵۲c;
            if (this.k && this.f۱۷۵۵f.getTabContainer() != null) {
                topInset += this.f۱۷۵۲c;
            }
        } else if (this.f۱۷۵۵f.getVisibility() != 8) {
            topInset = this.f۱۷۵۵f.getMeasuredHeight();
        }
        this.r.set(this.p);
        this.u.set(this.s);
        if (this.j || stable) {
            Rect rect = this.u;
            rect.top += topInset;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.r;
            rect2.top += topInset;
            rect2.bottom += 0;
        }
        a(this.f۱۷۵۴e, this.r, true, true, true, true);
        if (!this.v.equals(this.u)) {
            this.v.set(this.u);
            this.f۱۷۵۴e.a(this.u);
        }
        measureChildWithMargins(this.f۱۷۵۴e, widthMeasureSpec, 0, heightMeasureSpec, 0);
        e lp2 = (e) this.f۱۷۵۴e.getLayoutParams();
        int maxWidth2 = Math.max(maxWidth, this.f۱۷۵۴e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) lp2).leftMargin + ((ViewGroup.MarginLayoutParams) lp2).rightMargin);
        int maxHeight2 = Math.max(maxHeight, this.f۱۷۵۴e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp2).topMargin + ((ViewGroup.MarginLayoutParams) lp2).bottomMargin);
        int childState2 = View.combineMeasuredStates(childState, this.f۱۷۵۴e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(maxWidth2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), widthMeasureSpec, childState2), View.resolveSizeAndState(Math.max(maxHeight2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), heightMeasureSpec, childState2 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int count = getChildCount();
        int parentLeft = getPaddingLeft();
        int paddingRight = (right - left) - getPaddingRight();
        int parentTop = getPaddingTop();
        int paddingBottom = (bottom - top) - getPaddingBottom();
        for (int i2 = 0; i2 < count; i2++) {
            View child = getChildAt(i2);
            if (child.getVisibility() != 8) {
                e lp = (e) child.getLayoutParams();
                int width = child.getMeasuredWidth();
                int height = child.getMeasuredHeight();
                int childLeft = ((ViewGroup.MarginLayoutParams) lp).leftMargin + parentLeft;
                int childTop = ((ViewGroup.MarginLayoutParams) lp).topMargin + parentTop;
                child.layout(childLeft, childTop, childLeft + width, childTop + height);
            }
        }
    }

    public void draw(Canvas c2) {
        super.draw(c2);
        if (this.f۱۷۵۷h != null && !this.i) {
            int top = this.f۱۷۵۵f.getVisibility() == 0 ? (int) (((float) this.f۱۷۵۵f.getBottom()) + this.f۱۷۵۵f.getTranslationY() + 0.5f) : 0;
            this.f۱۷۵۷h.setBounds(0, top, getWidth(), this.f۱۷۵۷h.getIntrinsicHeight() + top);
            this.f۱۷۵۷h.draw(c2);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.support.v4.view.n
    public boolean onStartNestedScroll(View child, View target, int axes) {
        if ((axes & 2) == 0 || this.f۱۷۵۵f.getVisibility() != 0) {
            return false;
        }
        return this.l;
    }

    @Override // android.support.v4.view.n
    public void onNestedScrollAccepted(View child, View target, int axes) {
        this.C.a(child, target, axes);
        this.n = getActionBarHideOffset();
        h();
        d dVar = this.w;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.support.v4.view.n
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        this.n += dyConsumed;
        setActionBarHideOffset(this.n);
    }

    @Override // android.support.v4.view.n
    public void onStopNestedScroll(View target) {
        if (this.l && !this.m) {
            if (this.n <= this.f۱۷۵۵f.getHeight()) {
                m();
            } else {
                l();
            }
        }
        d dVar = this.w;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.support.v4.view.n
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!this.l || !consumed) {
            return false;
        }
        if (a(velocityX, velocityY)) {
            k();
        } else {
            n();
        }
        this.m = true;
        return true;
    }

    @Override // android.support.v4.view.n
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
    }

    @Override // android.support.v4.view.n
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return false;
    }

    public int getNestedScrollAxes() {
        return this.C.a();
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (this.f۱۷۵۴e == null) {
            this.f۱۷۵۴e = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.f۱۷۵۵f = (ActionBarContainer) findViewById(f.action_bar_container);
            this.f۱۷۵۶g = a(findViewById(f.action_bar));
        }
    }

    private f0 a(View view) {
        if (view instanceof f0) {
            return (f0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean hideOnContentScroll) {
        if (hideOnContentScroll != this.l) {
            this.l = hideOnContentScroll;
            if (!hideOnContentScroll) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f۱۷۵۵f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int offset) {
        h();
        this.f۱۷۵۵f.setTranslationY((float) (-Math.max(0, Math.min(offset, this.f۱۷۵۵f.getHeight()))));
    }

    /* access modifiers changed from: package-private */
    public void h() {
        removeCallbacks(this.A);
        removeCallbacks(this.B);
        ViewPropertyAnimator viewPropertyAnimator = this.y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    private void m() {
        h();
        postDelayed(this.A, 600);
    }

    private void l() {
        h();
        postDelayed(this.B, 600);
    }

    private void n() {
        h();
        this.A.run();
    }

    private void k() {
        h();
        this.B.run();
    }

    private boolean a(float velocityX, float velocityY) {
        this.x.fling(0, 0, 0, (int) velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.x.getFinalY() > this.f۱۷۵۵f.getHeight();
    }

    @Override // android.support.v7.widget.e0
    public void setWindowCallback(Window.Callback cb) {
        j();
        this.f۱۷۵۶g.setWindowCallback(cb);
    }

    @Override // android.support.v7.widget.e0
    public void setWindowTitle(CharSequence title) {
        j();
        this.f۱۷۵۶g.setWindowTitle(title);
    }

    public CharSequence getTitle() {
        j();
        return this.f۱۷۵۶g.getTitle();
    }

    @Override // android.support.v7.widget.e0
    public void a(int windowFeature) {
        j();
        if (windowFeature == 2) {
            this.f۱۷۵۶g.m();
        } else if (windowFeature == 5) {
            this.f۱۷۵۶g.o();
        } else if (windowFeature == 109) {
            setOverlayMode(true);
        }
    }

    public void setUiOptions(int uiOptions) {
    }

    public void setIcon(int resId) {
        j();
        this.f۱۷۵۶g.setIcon(resId);
    }

    public void setIcon(Drawable d2) {
        j();
        this.f۱۷۵۶g.setIcon(d2);
    }

    public void setLogo(int resId) {
        j();
        this.f۱۷۵۶g.b(resId);
    }

    @Override // android.support.v7.widget.e0
    public boolean f() {
        j();
        return this.f۱۷۵۶g.f();
    }

    @Override // android.support.v7.widget.e0
    public boolean b() {
        j();
        return this.f۱۷۵۶g.b();
    }

    @Override // android.support.v7.widget.e0
    public boolean a() {
        j();
        return this.f۱۷۵۶g.a();
    }

    @Override // android.support.v7.widget.e0
    public boolean d() {
        j();
        return this.f۱۷۵۶g.d();
    }

    @Override // android.support.v7.widget.e0
    public boolean c() {
        j();
        return this.f۱۷۵۶g.c();
    }

    @Override // android.support.v7.widget.e0
    public void e() {
        j();
        this.f۱۷۵۶g.e();
    }

    @Override // android.support.v7.widget.e0
    public void a(Menu menu, p.a cb) {
        j();
        this.f۱۷۵۶g.a(menu, cb);
    }

    @Override // android.support.v7.widget.e0
    public void g() {
        j();
        this.f۱۷۵۶g.g();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context c2, AttributeSet attrs) {
            super(c2, attrs);
        }

        public e(int width, int height) {
            super(width, height);
        }

        public e(ViewGroup.LayoutParams source) {
            super(source);
        }
    }
}
