package android.support.v7.widget;

import a.b.h.a.f;
import a.b.h.a.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    private boolean f۱۷۴۵c;

    /* renamed from: d  reason: collision with root package name */
    private View f۱۷۴۶d;

    /* renamed from: e  reason: collision with root package name */
    private View f۱۷۴۷e;

    /* renamed from: f  reason: collision with root package name */
    private View f۱۷۴۸f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f۱۷۴۹g;

    /* renamed from: h  reason: collision with root package name */
    Drawable f۱۷۵۰h;
    Drawable i;
    boolean j;
    boolean k;
    private int l;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        u.a(this, new b(this));
        TypedArray a2 = context.obtainStyledAttributes(attrs, j.ActionBar);
        this.f۱۷۴۹g = a2.getDrawable(j.ActionBar_background);
        this.f۱۷۵۰h = a2.getDrawable(j.ActionBar_backgroundStacked);
        this.l = a2.getDimensionPixelSize(j.ActionBar_height, -1);
        if (getId() == f.split_action_bar) {
            this.j = true;
            this.i = a2.getDrawable(j.ActionBar_backgroundSplit);
        }
        a2.recycle();
        boolean z = false;
        if (!this.j ? this.f۱۷۴۹g == null && this.f۱۷۵۰h == null : this.i == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f۱۷۴۷e = findViewById(f.action_bar);
        this.f۱۷۴۸f = findViewById(f.action_context_bar);
    }

    public void setPrimaryBackground(Drawable bg) {
        Drawable drawable = this.f۱۷۴۹g;
        if (drawable != null) {
            drawable.setCallback(null);
            unscheduleDrawable(this.f۱۷۴۹g);
        }
        this.f۱۷۴۹g = bg;
        if (bg != null) {
            bg.setCallback(this);
            View view = this.f۱۷۴۷e;
            if (view != null) {
                this.f۱۷۴۹g.setBounds(view.getLeft(), this.f۱۷۴۷e.getTop(), this.f۱۷۴۷e.getRight(), this.f۱۷۴۷e.getBottom());
            }
        }
        boolean z = true;
        if (!this.j ? !(this.f۱۷۴۹g == null && this.f۱۷۵۰h == null) : this.i != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable bg) {
        Drawable drawable;
        Drawable drawable2 = this.f۱۷۵۰h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f۱۷۵۰h);
        }
        this.f۱۷۵۰h = bg;
        if (bg != null) {
            bg.setCallback(this);
            if (this.k && (drawable = this.f۱۷۵۰h) != null) {
                drawable.setBounds(this.f۱۷۴۶d.getLeft(), this.f۱۷۴۶d.getTop(), this.f۱۷۴۶d.getRight(), this.f۱۷۴۶d.getBottom());
            }
        }
        boolean z = true;
        if (!this.j ? !(this.f۱۷۴۹g == null && this.f۱۷۵۰h == null) : this.i != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable bg) {
        Drawable drawable;
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.i);
        }
        this.i = bg;
        boolean z = false;
        if (bg != null) {
            bg.setCallback(this);
            if (this.j && (drawable = this.i) != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.j ? this.f۱۷۴۹g == null && this.f۱۷۵۰h == null : this.i == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        boolean isVisible = visibility == 0;
        Drawable drawable = this.f۱۷۴۹g;
        if (drawable != null) {
            drawable.setVisible(isVisible, false);
        }
        Drawable drawable2 = this.f۱۷۵۰h;
        if (drawable2 != null) {
            drawable2.setVisible(isVisible, false);
        }
        Drawable drawable3 = this.i;
        if (drawable3 != null) {
            drawable3.setVisible(isVisible, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable who) {
        return (who == this.f۱۷۴۹g && !this.j) || (who == this.f۱۷۵۰h && this.k) || ((who == this.i && this.j) || super.verifyDrawable(who));
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f۱۷۴۹g;
        if (drawable != null && drawable.isStateful()) {
            this.f۱۷۴۹g.setState(getDrawableState());
        }
        Drawable drawable2 = this.f۱۷۵۰h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f۱۷۵۰h.setState(getDrawableState());
        }
        Drawable drawable3 = this.i;
        if (drawable3 != null && drawable3.isStateful()) {
            this.i.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f۱۷۴۹g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f۱۷۵۰h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean isTransitioning) {
        this.f۱۷۴۵c = isTransitioning;
        setDescendantFocusability(isTransitioning ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return this.f۱۷۴۵c || super.onInterceptTouchEvent(ev);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        super.onTouchEvent(ev);
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        super.onHoverEvent(ev);
        return true;
    }

    public void setTabContainer(b1 tabView) {
        View view = this.f۱۷۴۶d;
        if (view != null) {
            removeView(view);
        }
        this.f۱۷۴۶d = tabView;
        if (tabView != null) {
            addView(tabView);
            ViewGroup.LayoutParams lp = tabView.getLayoutParams();
            lp.width = -1;
            lp.height = -2;
            tabView.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.f۱۷۴۶d;
    }

    public ActionMode startActionModeForChild(View child, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View child, ActionMode.Callback callback, int type) {
        if (type != 0) {
            return super.startActionModeForChild(child, callback, type);
        }
        return null;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private int a(View view) {
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int topMarginForTabs;
        int i2;
        if (this.f۱۷۴۷e == null && View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE && (i2 = this.l) >= 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i2, View.MeasureSpec.getSize(heightMeasureSpec)), Integer.MIN_VALUE);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f۱۷۴۷e != null) {
            int mode = View.MeasureSpec.getMode(heightMeasureSpec);
            View view = this.f۱۷۴۶d;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f۱۷۴۷e)) {
                    topMarginForTabs = a(this.f۱۷۴۷e);
                } else if (!b(this.f۱۷۴۸f)) {
                    topMarginForTabs = a(this.f۱۷۴۸f);
                } else {
                    topMarginForTabs = 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f۱۷۴۶d) + topMarginForTabs, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(heightMeasureSpec) : Integer.MAX_VALUE));
            }
        }
    }

    public void onLayout(boolean changed, int l2, int t, int r, int b2) {
        Drawable drawable;
        super.onLayout(changed, l2, t, r, b2);
        View tabContainer = this.f۱۷۴۶d;
        boolean hasTabs = (tabContainer == null || tabContainer.getVisibility() == 8) ? false : true;
        if (!(tabContainer == null || tabContainer.getVisibility() == 8)) {
            int containerHeight = getMeasuredHeight();
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) tabContainer.getLayoutParams();
            tabContainer.layout(l2, (containerHeight - tabContainer.getMeasuredHeight()) - lp.bottomMargin, r, containerHeight - lp.bottomMargin);
        }
        boolean needsInvalidate = false;
        if (this.j) {
            Drawable drawable2 = this.i;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                needsInvalidate = true;
            }
        } else {
            if (this.f۱۷۴۹g != null) {
                if (this.f۱۷۴۷e.getVisibility() == 0) {
                    this.f۱۷۴۹g.setBounds(this.f۱۷۴۷e.getLeft(), this.f۱۷۴۷e.getTop(), this.f۱۷۴۷e.getRight(), this.f۱۷۴۷e.getBottom());
                } else {
                    View view = this.f۱۷۴۸f;
                    if (view == null || view.getVisibility() != 0) {
                        this.f۱۷۴۹g.setBounds(0, 0, 0, 0);
                    } else {
                        this.f۱۷۴۹g.setBounds(this.f۱۷۴۸f.getLeft(), this.f۱۷۴۸f.getTop(), this.f۱۷۴۸f.getRight(), this.f۱۷۴۸f.getBottom());
                    }
                }
                needsInvalidate = true;
            }
            this.k = hasTabs;
            if (hasTabs && (drawable = this.f۱۷۵۰h) != null) {
                drawable.setBounds(tabContainer.getLeft(), tabContainer.getTop(), tabContainer.getRight(), tabContainer.getBottom());
                needsInvalidate = true;
            }
        }
        if (needsInvalidate) {
            invalidate();
        }
    }
}
