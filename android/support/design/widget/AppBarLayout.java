package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.internal.Cg;
import android.support.design.widget.CoordinatorLayout;
import android.support.p۰۴۳v4.view.AbstractCa;
import android.support.p۰۴۳v4.view.AbstractCk;
import android.support.p۰۴۳v4.view.AbstractCp;
import android.support.p۰۴۳v4.view.Cc0;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cb;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Cj;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Ci;

@CoordinatorLayout.AbstractCd(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: c  reason: contains not printable characters */
    private int f۹۵۴۳c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۹۵۴۴d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۹۵۴۵e;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۹۵۴۶f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۹۵۴۷g;

    /* renamed from: h  reason: contains not printable characters */
    private Cc0 f۹۵۴۸h;

    /* renamed from: i  reason: contains not printable characters */
    private List<AbstractCb> f۹۵۴۹i;

    /* renamed from: j  reason: contains not printable characters */
    private boolean f۹۵۵۰j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۹۵۵۱k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۹۵۵۲l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۹۵۵۳m;

    /* renamed from: n  reason: contains not printable characters */
    private int[] f۹۵۵۴n;

    /* renamed from: android.support.design.widget.AppBarLayout$b  reason: invalid class name */
    public interface AbstractCb<T extends AppBarLayout> {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۱۴۶۶a(T t, int i);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f۹۵۴۳c = -1;
        this.f۹۵۴۴d = -1;
        this.f۹۵۴۵e = -1;
        this.f۹۵۴۷g = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            Cz.m۱۲۰۴۰a(this);
            Cz.m۱۲۰۴۲a(this, attrs, 0, Cj.Widget_Design_AppBarLayout);
        }
        TypedArray a = Cg.m۱۱۳۶۰c(context, attrs, Ck.AppBarLayout, 0, Cj.Widget_Design_AppBarLayout, new int[0]);
        Cu.m۱۲۹۸۴a(this, a.getDrawable(Ck.AppBarLayout_android_background));
        if (a.hasValue(Ck.AppBarLayout_expanded)) {
            m۱۱۴۰۲a(a.getBoolean(Ck.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && a.hasValue(Ck.AppBarLayout_elevation)) {
            Cz.m۱۲۰۴۱a(this, (float) a.getDimensionPixelSize(Ck.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (a.hasValue(Ck.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(a.getBoolean(Ck.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (a.hasValue(Ck.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(a.getBoolean(Ck.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f۹۵۵۳m = a.getBoolean(Ck.AppBarLayout_liftOnScroll, false);
        a.recycle();
        Cu.m۱۲۹۸۷a(this, new Ca());
    }

    /* renamed from: android.support.design.widget.AppBarLayout$a  reason: invalid class name */
    class Ca implements AbstractCp {
        Ca() {
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCp
        /* renamed from: a  reason: contains not printable characters */
        public Cc0 m۱۱۴۶۵a(View v, Cc0 insets) {
            return AppBarLayout.this.m۱۱۴۰۶a(insets);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        m۱۱۴۰۵f();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        m۱۱۴۰۵f();
        boolean z = false;
        this.f۹۵۴۶f = false;
        int i = 0;
        int z2 = getChildCount();
        while (true) {
            if (i >= z2) {
                break;
            } else if (((Cc) getChildAt(i).getLayoutParams()).m۱۱۴۶۸b() != null) {
                this.f۹۵۴۶f = true;
                break;
            } else {
                i++;
            }
        }
        if (!this.f۹۵۵۰j) {
            if (this.f۹۵۵۳m || m۱۱۴۰۴e()) {
                z = true;
            }
            m۱۱۴۰۳b(z);
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private boolean m۱۱۴۰۴e() {
        int z = getChildCount();
        for (int i = 0; i < z; i++) {
            if (((Cc) getChildAt(i).getLayoutParams()).m۱۱۴۶۹c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۱۴۰۵f() {
        this.f۹۵۴۳c = -1;
        this.f۹۵۴۴d = -1;
        this.f۹۵۴۵e = -1;
    }

    public void setOrientation(int orientation) {
        if (orientation == 1) {
            super.setOrientation(orientation);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setExpanded(boolean expanded) {
        m۱۱۴۰۸a(expanded, Cu.m۱۳۰۲۸y(this));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۴۰۸a(boolean expanded, boolean animate) {
        m۱۱۴۰۲a(expanded, animate, true);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۱۴۰۲a(boolean expanded, boolean animate, boolean force) {
        int i = 0;
        int i2 = (expanded ? 1 : 2) | (animate ? 4 : 0);
        if (force) {
            i = 8;
        }
        this.f۹۵۴۷g = i2 | i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof Cc;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.widget.LinearLayout
    public Cc generateDefaultLayoutParams() {
        return new Cc(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.widget.LinearLayout, android.view.ViewGroup
    public Cc generateLayoutParams(AttributeSet attrs) {
        return new Cc(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.widget.LinearLayout, android.view.ViewGroup
    public Cc generateLayoutParams(ViewGroup.LayoutParams p) {
        if (Build.VERSION.SDK_INT >= 19 && (p instanceof LinearLayout.LayoutParams)) {
            return new Cc((LinearLayout.LayoutParams) p);
        }
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new Cc((ViewGroup.MarginLayoutParams) p);
        }
        return new Cc(p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۴۰۹a() {
        return this.f۹۵۴۶f;
    }

    public final int getTotalScrollRange() {
        int i = this.f۹۵۴۳c;
        if (i != -1) {
            return i;
        }
        int range = 0;
        int i2 = 0;
        int z = getChildCount();
        while (true) {
            if (i2 >= z) {
                break;
            }
            View child = getChildAt(i2);
            Cc lp = (Cc) child.getLayoutParams();
            int childHeight = child.getMeasuredHeight();
            int flags = lp.f۹۵۷۰a;
            if ((flags & 1) == 0) {
                break;
            }
            range += ((LinearLayout.LayoutParams) lp).topMargin + childHeight + ((LinearLayout.LayoutParams) lp).bottomMargin;
            if ((flags & 2) != 0) {
                range -= Cu.m۱۳۰۱۵l(child);
                break;
            }
            i2++;
        }
        int max = Math.max(0, range - getTopInset());
        this.f۹۵۴۳c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۴۱۱b() {
        return getTotalScrollRange() != 0;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i = this.f۹۵۴۴d;
        if (i != -1) {
            return i;
        }
        int range = 0;
        for (int i2 = getChildCount() - 1; i2 >= 0; i2--) {
            View child = getChildAt(i2);
            Cc lp = (Cc) child.getLayoutParams();
            int childHeight = child.getMeasuredHeight();
            int flags = lp.f۹۵۷۰a;
            if ((flags & 5) == 5) {
                int range2 = range + ((LinearLayout.LayoutParams) lp).topMargin + ((LinearLayout.LayoutParams) lp).bottomMargin;
                if ((flags & 8) != 0) {
                    range = range2 + Cu.m۱۳۰۱۵l(child);
                } else if ((flags & 2) != 0) {
                    range = range2 + (childHeight - Cu.m۱۳۰۱۵l(child));
                } else {
                    range = range2 + (childHeight - getTopInset());
                }
            } else if (range > 0) {
                break;
            }
        }
        int max = Math.max(0, range);
        this.f۹۵۴۴d = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f۹۵۴۵e;
        if (i != -1) {
            return i;
        }
        int range = 0;
        int i2 = 0;
        int z = getChildCount();
        while (true) {
            if (i2 >= z) {
                break;
            }
            View child = getChildAt(i2);
            Cc lp = (Cc) child.getLayoutParams();
            int childHeight = child.getMeasuredHeight() + ((LinearLayout.LayoutParams) lp).topMargin + ((LinearLayout.LayoutParams) lp).bottomMargin;
            int flags = lp.f۹۵۷۰a;
            if ((flags & 1) == 0) {
                break;
            }
            range += childHeight;
            if ((flags & 2) != 0) {
                range -= Cu.m۱۳۰۱۵l(child) + getTopInset();
                break;
            }
            i2++;
        }
        int max = Math.max(0, range);
        this.f۹۵۴۵e = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۴۰۷a(int offset) {
        List<AbstractCb> list = this.f۹۵۴۹i;
        if (list != null) {
            int z = list.size();
            for (int i = 0; i < z; i++) {
                AbstractCb listener = this.f۹۵۴۹i.get(i);
                if (listener != null) {
                    listener.m۱۱۴۶۶a(this, offset);
                }
            }
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minHeight = Cu.m۱۳۰۱۵l(this);
        if (minHeight != 0) {
            return (minHeight * 2) + topInset;
        }
        int childCount = getChildCount();
        int lastChildMinHeight = childCount >= 1 ? Cu.m۱۳۰۱۵l(getChildAt(childCount - 1)) : 0;
        if (lastChildMinHeight != 0) {
            return (lastChildMinHeight * 2) + topInset;
        }
        return getHeight() / 3;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int extraSpace) {
        if (this.f۹۵۵۴n == null) {
            this.f۹۵۵۴n = new int[4];
        }
        int[] extraStates = this.f۹۵۵۴n;
        int[] states = super.onCreateDrawableState(extraStates.length + extraSpace);
        extraStates[0] = this.f۹۵۵۱k ? Cb.state_liftable : -Cb.state_liftable;
        extraStates[1] = (!this.f۹۵۵۱k || !this.f۹۵۵۲l) ? -Cb.state_lifted : Cb.state_lifted;
        extraStates[2] = this.f۹۵۵۱k ? Cb.state_collapsible : -Cb.state_collapsible;
        extraStates[3] = (!this.f۹۵۵۱k || !this.f۹۵۵۲l) ? -Cb.state_collapsed : Cb.state_collapsed;
        return LinearLayout.mergeDrawableStates(states, extraStates);
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۱۴۰۳b(boolean liftable) {
        if (this.f۹۵۵۱k == liftable) {
            return false;
        }
        this.f۹۵۵۱k = liftable;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۴۱۰a(boolean lifted) {
        if (this.f۹۵۵۲l == lifted) {
            return false;
        }
        this.f۹۵۵۲l = lifted;
        refreshDrawableState();
        return true;
    }

    public void setLiftOnScroll(boolean liftOnScroll) {
        this.f۹۵۵۳m = liftOnScroll;
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۱۴۱۲c() {
        return this.f۹۵۵۳m;
    }

    @Deprecated
    public void setTargetElevation(float elevation) {
        if (Build.VERSION.SDK_INT >= 21) {
            Cz.m۱۲۰۴۱a(this, elevation);
        }
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f۹۵۴۷g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۱۴۱۳d() {
        this.f۹۵۴۷g = 0;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        Cc0 c0Var = this.f۹۵۴۸h;
        if (c0Var != null) {
            return c0Var.m۱۲۸۲۲e();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cc0 m۱۱۴۰۶a(Cc0 insets) {
        Cc0 newInsets = null;
        if (Cu.m۱۳۰۱۱h(this)) {
            newInsets = insets;
        }
        if (!Ci.m۱۰۶۳۳a(this.f۹۵۴۸h, newInsets)) {
            this.f۹۵۴۸h = newInsets;
            m۱۱۴۰۵f();
        }
        return insets;
    }

    /* renamed from: android.support.design.widget.AppBarLayout$c  reason: invalid class name */
    public static class Cc extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: contains not printable characters */
        int f۹۵۷۰a = 1;

        /* renamed from: b  reason: contains not printable characters */
        Interpolator f۹۵۷۱b;

        public Cc(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray a = c.obtainStyledAttributes(attrs, Ck.AppBarLayout_Layout);
            this.f۹۵۷۰a = a.getInt(Ck.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (a.hasValue(Ck.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f۹۵۷۱b = AnimationUtils.loadInterpolator(c, a.getResourceId(Ck.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            a.recycle();
        }

        public Cc(int width, int height) {
            super(width, height);
        }

        public Cc(ViewGroup.LayoutParams p) {
            super(p);
        }

        public Cc(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public Cc(LinearLayout.LayoutParams source) {
            super(source);
        }

        /* renamed from: a  reason: contains not printable characters */
        public int m۱۱۴۶۷a() {
            return this.f۹۵۷۰a;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Interpolator m۱۱۴۶۸b() {
            return this.f۹۵۷۱b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public boolean m۱۱۴۶۹c() {
            int i = this.f۹۵۷۰a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }
    }

    /* access modifiers changed from: protected */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractCn<T> {

        /* renamed from: k  reason: contains not printable characters */
        private int f۹۵۵۵k;

        /* renamed from: l  reason: contains not printable characters */
        private int f۹۵۵۶l;

        /* renamed from: m  reason: contains not printable characters */
        private ValueAnimator f۹۵۵۷m;

        /* renamed from: n  reason: contains not printable characters */
        private int f۹۵۵۸n = -1;

        /* renamed from: o  reason: contains not printable characters */
        private boolean f۹۵۵۹o;

        /* renamed from: p  reason: contains not printable characters */
        private float f۹۵۶۰p;

        /* renamed from: q  reason: contains not printable characters */
        private WeakReference<View> f۹۵۶۱q;

        /* renamed from: r  reason: contains not printable characters */
        private AbstractCb f۹۵۶۲r;

        /* renamed from: android.support.design.widget.AppBarLayout$BaseBehavior$b  reason: invalid class name */
        public static abstract class AbstractCb<T extends AppBarLayout> {
            /* renamed from: a  reason: contains not printable characters */
            public abstract boolean m۱۱۴۵۴a(T t);
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۴۴۸b(CoordinatorLayout parent, T child, View directTargetChild, View target, int nestedScrollAxes, int type) {
            ValueAnimator valueAnimator;
            boolean started = (nestedScrollAxes & 2) != 0 && (child.m۱۱۴۱۲c() || m۱۱۴۲۲a(parent, child, directTargetChild));
            if (started && (valueAnimator = this.f۹۵۵۷m) != null) {
                valueAnimator.cancel();
            }
            this.f۹۵۶۱q = null;
            this.f۹۵۵۶l = type;
            return started;
        }

        /* renamed from: a  reason: contains not printable characters */
        private boolean m۱۱۴۲۲a(CoordinatorLayout parent, T child, View directTargetChild) {
            return child.m۱۱۴۱۱b() && parent.getHeight() - directTargetChild.getHeight() <= child.getHeight();
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۴۳۶a(CoordinatorLayout coordinatorLayout, T child, View target, int dx, int dy, int[] consumed, int type) {
            int max;
            int min;
            if (dy != 0) {
                if (dy < 0) {
                    int min2 = -child.getTotalScrollRange();
                    min = min2;
                    max = child.getDownNestedPreScrollRange() + min2;
                } else {
                    min = -child.getUpNestedPreScrollRange();
                    max = 0;
                }
                if (min != max) {
                    consumed[1] = m۱۱۹۳۹a(coordinatorLayout, (View) child, dy, min, max);
                    m۱۱۴۱۷a(dy, child, target, type);
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۴۳۵a(CoordinatorLayout coordinatorLayout, T child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
            if (dyUnconsumed < 0) {
                m۱۱۹۳۹a(coordinatorLayout, (View) child, dyUnconsumed, -child.getDownNestedScrollRange(), 0);
                m۱۱۴۱۷a(dyUnconsumed, child, target, type);
            }
            if (child.m۱۱۴۱۲c()) {
                child.m۱۱۴۱۰a(target.getScrollY() > 0);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۱۴۱۷a(int dy, T child, View target, int type) {
            if (type == 1) {
                int curOffset = m۱۱۴۴۹c();
                if ((dy < 0 && curOffset == 0) || (dy > 0 && curOffset == (-child.getDownNestedScrollRange()))) {
                    Cu.m۱۳۰۱۰h(target, 1);
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۴۳۴a(CoordinatorLayout coordinatorLayout, T abl, View target, int type) {
            if (this.f۹۵۵۶l == 0 || type == 1) {
                m۱۱۴۲۶d(coordinatorLayout, (AppBarLayout) abl);
            }
            this.f۹۵۶۱q = new WeakReference<>(target);
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۱۴۱۸a(CoordinatorLayout coordinatorLayout, T child, int offset, float velocity) {
            int duration;
            int distance = Math.abs(m۱۱۴۴۹c() - offset);
            float velocity2 = Math.abs(velocity);
            if (velocity2 > 0.0f) {
                duration = Math.round((((float) distance) / velocity2) * 1000.0f) * 3;
            } else {
                duration = (int) ((1.0f + (((float) distance) / ((float) child.getHeight()))) * 150.0f);
            }
            m۱۱۴۱۹a(coordinatorLayout, (AppBarLayout) child, offset, duration);
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۱۴۱۹a(CoordinatorLayout coordinatorLayout, T child, int offset, int duration) {
            int currentOffset = m۱۱۴۴۹c();
            if (currentOffset == offset) {
                ValueAnimator valueAnimator = this.f۹۵۵۷m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f۹۵۵۷m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f۹۵۵۷m;
            if (valueAnimator2 == null) {
                this.f۹۵۵۷m = new ValueAnimator();
                this.f۹۵۵۷m.setInterpolator(p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۰۹l.Ca.f۸۲۵۵e);
                this.f۹۵۵۷m.addUpdateListener(new Ca(coordinatorLayout, child));
            } else {
                valueAnimator2.cancel();
            }
            this.f۹۵۵۷m.setDuration((long) Math.min(duration, 600));
            this.f۹۵۵۷m.setIntValues(currentOffset, offset);
            this.f۹۵۵۷m.start();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: android.support.design.widget.AppBarLayout$BaseBehavior$a  reason: invalid class name */
        public class Ca implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: contains not printable characters */
            final /* synthetic */ CoordinatorLayout f۹۵۶۳a;

            /* renamed from: b  reason: contains not printable characters */
            final /* synthetic */ AppBarLayout f۹۵۶۴b;

            Ca(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f۹۵۶۳a = coordinatorLayout;
                this.f۹۵۶۴b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator animator) {
                BaseBehavior.this.m۱۱۹۴۷c(this.f۹۵۶۳a, this.f۹۵۶۴b, ((Integer) animator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        private int m۱۱۴۲۳b(T abl, int offset) {
            int count = abl.getChildCount();
            for (int i = 0; i < count; i++) {
                View child = abl.getChildAt(i);
                int top = child.getTop();
                int bottom = child.getBottom();
                Cc lp = (Cc) child.getLayoutParams();
                if (m۱۱۴۲۱a(lp.m۱۱۴۶۷a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) lp).topMargin;
                    bottom += ((LinearLayout.LayoutParams) lp).bottomMargin;
                }
                if (top <= (-offset) && bottom >= (-offset)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۱۴۲۶d(CoordinatorLayout coordinatorLayout, T abl) {
            int offset = m۱۱۴۴۹c();
            int offsetChildIndex = m۱۱۴۲۳b(abl, offset);
            if (offsetChildIndex >= 0) {
                View offsetChild = abl.getChildAt(offsetChildIndex);
                Cc lp = (Cc) offsetChild.getLayoutParams();
                int flags = lp.m۱۱۴۶۷a();
                if ((flags & 17) == 17) {
                    int snapTop = -offsetChild.getTop();
                    int snapBottom = -offsetChild.getBottom();
                    if (offsetChildIndex == abl.getChildCount() - 1) {
                        snapBottom += abl.getTopInset();
                    }
                    if (m۱۱۴۲۱a(flags, 2)) {
                        snapBottom += Cu.m۱۳۰۱۵l(offsetChild);
                    } else if (m۱۱۴۲۱a(flags, 5)) {
                        int seam = Cu.m۱۳۰۱۵l(offsetChild) + snapBottom;
                        if (offset < seam) {
                            snapTop = seam;
                        } else {
                            snapBottom = seam;
                        }
                    }
                    if (m۱۱۴۲۱a(flags, 32)) {
                        snapTop += ((LinearLayout.LayoutParams) lp).topMargin;
                        snapBottom -= ((LinearLayout.LayoutParams) lp).bottomMargin;
                    }
                    m۱۱۴۱۸a(coordinatorLayout, (AppBarLayout) abl, p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۷c.Ca.m۱۰۴۹۵a(offset < (snapBottom + snapTop) / 2 ? snapBottom : snapTop, -abl.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private static boolean m۱۱۴۲۱a(int flags, int check) {
            return (flags & check) == check;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۴۴۲a(CoordinatorLayout parent, T child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.Cf) child.getLayoutParams())).height != -2) {
                return super.m۱۱۵۷۲a(parent, (View) child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
            }
            parent.m۱۱۵۴۰a(child, parentWidthMeasureSpec, widthUsed, View.MeasureSpec.makeMeasureSpec(0, 0), heightUsed);
            return true;
        }

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۴۴۱a(CoordinatorLayout parent, T abl, int layoutDirection) {
            int offset;
            boolean handled = super.m۱۲۰۳۲a(parent, (View) abl, layoutDirection);
            int pendingAction = abl.getPendingAction();
            int i = this.f۹۵۵۸n;
            if (i >= 0 && (pendingAction & 8) == 0) {
                View child = abl.getChildAt(i);
                int offset2 = -child.getBottom();
                if (this.f۹۵۵۹o) {
                    offset = offset2 + Cu.m۱۳۰۱۵l(child) + abl.getTopInset();
                } else {
                    offset = offset2 + Math.round(((float) child.getHeight()) * this.f۹۵۶۰p);
                }
                m۱۱۹۴۷c(parent, abl, offset);
            } else if (pendingAction != 0) {
                boolean animate = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int offset3 = -abl.getUpNestedPreScrollRange();
                    if (animate) {
                        m۱۱۴۱۸a(parent, (AppBarLayout) abl, offset3, 0.0f);
                    } else {
                        m۱۱۹۴۷c(parent, abl, offset3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (animate) {
                        m۱۱۴۱۸a(parent, (AppBarLayout) abl, 0, 0.0f);
                    } else {
                        m۱۱۹۴۷c(parent, abl, 0);
                    }
                }
            }
            abl.m۱۱۴۱۳d();
            this.f۹۵۵۸n = -1;
            m۱۲۰۳۱a(p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۷c.Ca.m۱۰۴۹۵a(m۱۲۰۳۳b(), -abl.getTotalScrollRange(), 0));
            m۱۱۴۲۰a(parent, (AppBarLayout) abl, m۱۲۰۳۳b(), 0, true);
            abl.m۱۱۴۰۷a(m۱۲۰۳۳b());
            return handled;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۴۴۳a(T view) {
            AbstractCb bVar = this.f۹۵۶۲r;
            if (bVar != null) {
                return bVar.m۱۱۴۵۴a(view);
            }
            WeakReference<View> weakReference = this.f۹۵۶۱q;
            if (weakReference == null) {
                return true;
            }
            View scrollingView = weakReference.get();
            if (scrollingView == null || !scrollingView.isShown() || scrollingView.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۴۵۳e(CoordinatorLayout parent, T layout) {
            m۱۱۴۲۶d(parent, (AppBarLayout) layout);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۱۴۴۶b(T view) {
            return -view.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۱۴۵۱c(T view) {
            return view.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۱۴۴۵b(CoordinatorLayout coordinatorLayout, T appBarLayout, int newOffset, int minOffset, int maxOffset) {
            int curOffset = m۱۱۴۴۹c();
            int consumed = 0;
            if (minOffset == 0 || curOffset < minOffset || curOffset > maxOffset) {
                this.f۹۵۵۵k = 0;
            } else {
                int newOffset2 = p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۷c.Ca.m۱۰۴۹۵a(newOffset, minOffset, maxOffset);
                if (curOffset != newOffset2) {
                    int interpolatedOffset = appBarLayout.m۱۱۴۰۹a() ? m۱۱۴۲۴c(appBarLayout, newOffset2) : newOffset2;
                    boolean offsetChanged = m۱۲۰۳۱a(interpolatedOffset);
                    consumed = curOffset - newOffset2;
                    this.f۹۵۵۵k = newOffset2 - interpolatedOffset;
                    if (!offsetChanged && appBarLayout.m۱۱۴۰۹a()) {
                        coordinatorLayout.m۱۱۵۳۸a(appBarLayout);
                    }
                    appBarLayout.m۱۱۴۰۷a(m۱۲۰۳۳b());
                    m۱۱۴۲۰a(coordinatorLayout, (AppBarLayout) appBarLayout, newOffset2, newOffset2 < curOffset ? -1 : 1, false);
                }
            }
            return consumed;
        }

        /* renamed from: c  reason: contains not printable characters */
        private int m۱۱۴۲۴c(T layout, int offset) {
            int absOffset = Math.abs(offset);
            int i = 0;
            int z = layout.getChildCount();
            while (true) {
                if (i >= z) {
                    break;
                }
                View child = layout.getChildAt(i);
                Cc childLp = (Cc) child.getLayoutParams();
                Interpolator interpolator = childLp.m۱۱۴۶۸b();
                if (absOffset < child.getTop() || absOffset > child.getBottom()) {
                    i++;
                } else if (interpolator != null) {
                    int childScrollableHeight = 0;
                    int flags = childLp.m۱۱۴۶۷a();
                    if ((flags & 1) != 0) {
                        childScrollableHeight = 0 + child.getHeight() + ((LinearLayout.LayoutParams) childLp).topMargin + ((LinearLayout.LayoutParams) childLp).bottomMargin;
                        if ((flags & 2) != 0) {
                            childScrollableHeight -= Cu.m۱۳۰۱۵l(child);
                        }
                    }
                    if (Cu.m۱۳۰۱۱h(child)) {
                        childScrollableHeight -= layout.getTopInset();
                    }
                    if (childScrollableHeight > 0) {
                        return Integer.signum(offset) * (child.getTop() + Math.round(((float) childScrollableHeight) * interpolator.getInterpolation(((float) (absOffset - child.getTop())) / ((float) childScrollableHeight))));
                    }
                }
            }
            return offset;
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۱۴۲۰a(CoordinatorLayout parent, T layout, int offset, int direction, boolean forceJump) {
            View scrollingChild;
            View child = m۱۱۴۱۵a(layout, offset);
            if (child != null) {
                int flags = ((Cc) child.getLayoutParams()).m۱۱۴۶۷a();
                boolean lifted = false;
                boolean z = false;
                if ((flags & 1) != 0) {
                    int minHeight = Cu.m۱۳۰۱۵l(child);
                    if (direction > 0 && (flags & 12) != 0) {
                        lifted = (-offset) >= (child.getBottom() - minHeight) - layout.getTopInset();
                    } else if ((flags & 2) != 0) {
                        lifted = (-offset) >= (child.getBottom() - minHeight) - layout.getTopInset();
                    }
                }
                if (layout.m۱۱۴۱۲c() && (scrollingChild = m۱۱۴۱۶a(parent)) != null) {
                    if (scrollingChild.getScrollY() > 0) {
                        z = true;
                    }
                    lifted = z;
                }
                boolean changed = layout.m۱۱۴۱۰a(lifted);
                if (Build.VERSION.SDK_INT < 11) {
                    return;
                }
                if (forceJump || (changed && m۱۱۴۲۵c(parent, (AppBarLayout) layout))) {
                    layout.jumpDrawablesToCurrentState();
                }
            }
        }

        /* renamed from: c  reason: contains not printable characters */
        private boolean m۱۱۴۲۵c(CoordinatorLayout parent, T layout) {
            List<View> dependencies = parent.m۱۱۵۵۳c(layout);
            int size = dependencies.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractCc behavior = ((CoordinatorLayout.Cf) dependencies.get(i).getLayoutParams()).m۱۱۶۰۳d();
                if (behavior instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) behavior).m۱۱۹۵۷c() != 0;
                }
            }
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        private static View m۱۱۴۱۵a(AppBarLayout layout, int offset) {
            int absOffset = Math.abs(offset);
            int z = layout.getChildCount();
            for (int i = 0; i < z; i++) {
                View child = layout.getChildAt(i);
                if (absOffset >= child.getTop() && absOffset <= child.getBottom()) {
                    return child;
                }
            }
            return null;
        }

        /* renamed from: a  reason: contains not printable characters */
        private View m۱۱۴۱۶a(CoordinatorLayout parent) {
            int z = parent.getChildCount();
            for (int i = 0; i < z; i++) {
                View child = parent.getChildAt(i);
                if (child instanceof AbstractCk) {
                    return child;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.design.widget.AbstractCn
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۱۴۴۹c() {
            return m۱۲۰۳۳b() + this.f۹۵۵۵k;
        }

        /* renamed from: b  reason: contains not printable characters */
        public Parcelable m۱۱۴۵۲d(CoordinatorLayout parent, T abl) {
            Parcelable superState = super.m۱۱۵۸۶d(parent, (View) abl);
            int offset = m۱۲۰۳۳b();
            int count = abl.getChildCount();
            for (int i = 0; i < count; i++) {
                View child = abl.getChildAt(i);
                int visBottom = child.getBottom() + offset;
                if (child.getTop() + offset <= 0 && visBottom >= 0) {
                    Cc ss = new Cc(superState);
                    ss.f۹۵۶۶e = i;
                    ss.f۹۵۶۸g = visBottom == Cu.m۱۳۰۱۵l(child) + abl.getTopInset();
                    ss.f۹۵۶۷f = ((float) visBottom) / ((float) child.getHeight());
                    return ss;
                }
            }
            return superState;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۴۳۳a(CoordinatorLayout parent, T appBarLayout, Parcelable state) {
            if (state instanceof Cc) {
                Cc ss = (Cc) state;
                super.m۱۱۵۶۲a(parent, (View) appBarLayout, ss.m۱۲۷۹۱a());
                this.f۹۵۵۸n = ss.f۹۵۶۶e;
                this.f۹۵۶۰p = ss.f۹۵۶۷f;
                this.f۹۵۵۹o = ss.f۹۵۶۸g;
                return;
            }
            super.m۱۱۵۶۲a(parent, (View) appBarLayout, state);
            this.f۹۵۵۸n = -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: android.support.design.widget.AppBarLayout$BaseBehavior$c  reason: invalid class name */
        public static class Cc extends AbstractCa {
            public static final Parcelable.Creator<Cc> CREATOR = new Ca();

            /* renamed from: e  reason: contains not printable characters */
            int f۹۵۶۶e;

            /* renamed from: f  reason: contains not printable characters */
            float f۹۵۶۷f;

            /* renamed from: g  reason: contains not printable characters */
            boolean f۹۵۶۸g;

            public Cc(Parcel source, ClassLoader loader) {
                super(source, loader);
                this.f۹۵۶۶e = source.readInt();
                this.f۹۵۶۷f = source.readFloat();
                this.f۹۵۶۸g = source.readByte() != 0;
            }

            public Cc(Parcelable superState) {
                super(superState);
            }

            @Override // android.support.p۰۴۳v4.view.AbstractCa
            public void writeToParcel(Parcel dest, int flags) {
                super.writeToParcel(dest, flags);
                dest.writeInt(this.f۹۵۶۶e);
                dest.writeFloat(this.f۹۵۶۷f);
                dest.writeByte(this.f۹۵۶۸g ? (byte) 1 : 0);
            }

            /* renamed from: android.support.design.widget.AppBarLayout$BaseBehavior$c$a  reason: invalid class name */
            static class Ca implements Parcelable.ClassLoaderCreator<Cc> {
                Ca() {
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public Cc createFromParcel(Parcel source, ClassLoader loader) {
                    return new Cc(source, loader);
                }

                @Override // android.os.Parcelable.Creator
                public Cc createFromParcel(Parcel source) {
                    return new Cc(source, null);
                }

                @Override // android.os.Parcelable.Creator
                public Cc[] newArray(int size) {
                    return new Cc[size];
                }
            }
        }
    }

    public static class ScrollingViewBehavior extends AbstractCo {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a = context.obtainStyledAttributes(attrs, Ck.ScrollingViewBehavior_Layout);
            m۱۱۹۵۵b(a.getDimensionPixelSize(Ck.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            a.recycle();
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۴۶۱a(CoordinatorLayout parent, View child, View dependency) {
            return dependency instanceof AppBarLayout;
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۱۴۶۳b(CoordinatorLayout parent, View child, View dependency) {
            m۱۱۴۵۶a(child, dependency);
            m۱۱۴۵۷b(child, dependency);
            return false;
        }

        @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۱۴۶۰a(CoordinatorLayout parent, View child, Rect rectangle, boolean immediate) {
            AppBarLayout header = m۱۱۴۵۸a(parent.m۱۱۵۴۸b(child));
            if (header != null) {
                rectangle.offset(child.getLeft(), child.getTop());
                Rect parentRect = this.f۹۹۹۲d;
                parentRect.set(0, 0, parent.getWidth(), parent.getHeight());
                if (!parentRect.contains(rectangle)) {
                    header.m۱۱۴۰۸a(false, !immediate);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۱۴۵۶a(View child, View dependency) {
            CoordinatorLayout.AbstractCc behavior = ((CoordinatorLayout.Cf) dependency.getLayoutParams()).m۱۱۶۰۳d();
            if (behavior instanceof BaseBehavior) {
                Cu.m۱۳۰۰۳d(child, (((dependency.getBottom() - child.getTop()) + ((BaseBehavior) behavior).f۹۵۵۵k) + m۱۱۹۵۹d()) - m۱۱۹۵۱a(dependency));
            }
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.design.widget.AbstractCo
        /* renamed from: b  reason: contains not printable characters */
        public float m۱۱۴۶۲b(View header) {
            int availScrollRange;
            if (header instanceof AppBarLayout) {
                AppBarLayout abl = (AppBarLayout) header;
                int totalScrollRange = abl.getTotalScrollRange();
                int preScrollDown = abl.getDownNestedPreScrollRange();
                int offset = m۱۱۴۵۵a(abl);
                if ((preScrollDown == 0 || totalScrollRange + offset > preScrollDown) && (availScrollRange = totalScrollRange - preScrollDown) != 0) {
                    return (((float) offset) / ((float) availScrollRange)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: a  reason: contains not printable characters */
        private static int m۱۱۴۵۵a(AppBarLayout abl) {
            CoordinatorLayout.AbstractCc behavior = ((CoordinatorLayout.Cf) abl.getLayoutParams()).m۱۱۶۰۳d();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).m۱۱۴۴۹c();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.design.widget.AbstractCo
        /* renamed from: a  reason: contains not printable characters */
        public AppBarLayout m۱۱۴۵۸a(List<View> views) {
            int z = views.size();
            for (int i = 0; i < z; i++) {
                View view = views.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        @Override // android.support.design.widget.AbstractCo
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۱۴۶۴c(View v) {
            if (v instanceof AppBarLayout) {
                return ((AppBarLayout) v).getTotalScrollRange();
            }
            return super.m۱۱۹۵۸c(v);
        }

        /* renamed from: b  reason: contains not printable characters */
        private void m۱۱۴۵۷b(View child, View dependency) {
            if (dependency instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) dependency;
                if (appBarLayout.m۱۱۴۱۲c()) {
                    appBarLayout.m۱۱۴۱۰a(child.getScrollY() > 0);
                }
            }
        }
    }
}
