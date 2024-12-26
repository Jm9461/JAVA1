package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۱۱۳۷۱c;

    /* renamed from: d  reason: contains not printable characters */
    private View f۱۱۳۷۲d;

    /* renamed from: e  reason: contains not printable characters */
    private View f۱۱۳۷۳e;

    /* renamed from: f  reason: contains not printable characters */
    private View f۱۱۳۷۴f;

    /* renamed from: g  reason: contains not printable characters */
    Drawable f۱۱۳۷۵g;

    /* renamed from: h  reason: contains not printable characters */
    Drawable f۱۱۳۷۶h;

    /* renamed from: i  reason: contains not printable characters */
    Drawable f۱۱۳۷۷i;

    /* renamed from: j  reason: contains not printable characters */
    boolean f۱۱۳۷۸j;

    /* renamed from: k  reason: contains not printable characters */
    boolean f۱۱۳۷۹k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۱۳۸۰l;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        Cu.m۱۲۹۸۴a(this, new Cb(this));
        TypedArray a = context.obtainStyledAttributes(attrs, Cj.ActionBar);
        this.f۱۱۳۷۵g = a.getDrawable(Cj.ActionBar_background);
        this.f۱۱۳۷۶h = a.getDrawable(Cj.ActionBar_backgroundStacked);
        this.f۱۱۳۸۰l = a.getDimensionPixelSize(Cj.ActionBar_height, -1);
        if (getId() == Cf.split_action_bar) {
            this.f۱۱۳۷۸j = true;
            this.f۱۱۳۷۷i = a.getDrawable(Cj.ActionBar_backgroundSplit);
        }
        a.recycle();
        boolean z = false;
        if (!this.f۱۱۳۷۸j ? this.f۱۱۳۷۵g == null && this.f۱۱۳۷۶h == null : this.f۱۱۳۷۷i == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f۱۱۳۷۳e = findViewById(Cf.action_bar);
        this.f۱۱۳۷۴f = findViewById(Cf.action_context_bar);
    }

    public void setPrimaryBackground(Drawable bg) {
        Drawable drawable = this.f۱۱۳۷۵g;
        if (drawable != null) {
            drawable.setCallback(null);
            unscheduleDrawable(this.f۱۱۳۷۵g);
        }
        this.f۱۱۳۷۵g = bg;
        if (bg != null) {
            bg.setCallback(this);
            View view = this.f۱۱۳۷۳e;
            if (view != null) {
                this.f۱۱۳۷۵g.setBounds(view.getLeft(), this.f۱۱۳۷۳e.getTop(), this.f۱۱۳۷۳e.getRight(), this.f۱۱۳۷۳e.getBottom());
            }
        }
        boolean z = true;
        if (!this.f۱۱۳۷۸j ? !(this.f۱۱۳۷۵g == null && this.f۱۱۳۷۶h == null) : this.f۱۱۳۷۷i != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable bg) {
        Drawable drawable;
        Drawable drawable2 = this.f۱۱۳۷۶h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f۱۱۳۷۶h);
        }
        this.f۱۱۳۷۶h = bg;
        if (bg != null) {
            bg.setCallback(this);
            if (this.f۱۱۳۷۹k && (drawable = this.f۱۱۳۷۶h) != null) {
                drawable.setBounds(this.f۱۱۳۷۲d.getLeft(), this.f۱۱۳۷۲d.getTop(), this.f۱۱۳۷۲d.getRight(), this.f۱۱۳۷۲d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f۱۱۳۷۸j ? !(this.f۱۱۳۷۵g == null && this.f۱۱۳۷۶h == null) : this.f۱۱۳۷۷i != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable bg) {
        Drawable drawable;
        Drawable drawable2 = this.f۱۱۳۷۷i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f۱۱۳۷۷i);
        }
        this.f۱۱۳۷۷i = bg;
        boolean z = false;
        if (bg != null) {
            bg.setCallback(this);
            if (this.f۱۱۳۷۸j && (drawable = this.f۱۱۳۷۷i) != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f۱۱۳۷۸j ? this.f۱۱۳۷۵g == null && this.f۱۱۳۷۶h == null : this.f۱۱۳۷۷i == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        boolean isVisible = visibility == 0;
        Drawable drawable = this.f۱۱۳۷۵g;
        if (drawable != null) {
            drawable.setVisible(isVisible, false);
        }
        Drawable drawable2 = this.f۱۱۳۷۶h;
        if (drawable2 != null) {
            drawable2.setVisible(isVisible, false);
        }
        Drawable drawable3 = this.f۱۱۳۷۷i;
        if (drawable3 != null) {
            drawable3.setVisible(isVisible, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable who) {
        return (who == this.f۱۱۳۷۵g && !this.f۱۱۳۷۸j) || (who == this.f۱۱۳۷۶h && this.f۱۱۳۷۹k) || ((who == this.f۱۱۳۷۷i && this.f۱۱۳۷۸j) || super.verifyDrawable(who));
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f۱۱۳۷۵g;
        if (drawable != null && drawable.isStateful()) {
            this.f۱۱۳۷۵g.setState(getDrawableState());
        }
        Drawable drawable2 = this.f۱۱۳۷۶h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f۱۱۳۷۶h.setState(getDrawableState());
        }
        Drawable drawable3 = this.f۱۱۳۷۷i;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f۱۱۳۷۷i.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f۱۱۳۷۵g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f۱۱۳۷۶h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f۱۱۳۷۷i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean isTransitioning) {
        this.f۱۱۳۷۱c = isTransitioning;
        setDescendantFocusability(isTransitioning ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return this.f۱۱۳۷۱c || super.onInterceptTouchEvent(ev);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        super.onTouchEvent(ev);
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        super.onHoverEvent(ev);
        return true;
    }

    public void setTabContainer(Cb1 tabView) {
        View view = this.f۱۱۳۷۲d;
        if (view != null) {
            removeView(view);
        }
        this.f۱۱۳۷۲d = tabView;
        if (tabView != null) {
            addView(tabView);
            ViewGroup.LayoutParams lp = tabView.getLayoutParams();
            lp.width = -1;
            lp.height = -2;
            tabView.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.f۱۱۳۷۲d;
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

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۴۰۱۹b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    private int m۱۴۰۱۸a(View view) {
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int topMarginForTabs;
        int i;
        if (this.f۱۱۳۷۳e == null && View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE && (i = this.f۱۱۳۸۰l) >= 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i, View.MeasureSpec.getSize(heightMeasureSpec)), Integer.MIN_VALUE);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f۱۱۳۷۳e != null) {
            int mode = View.MeasureSpec.getMode(heightMeasureSpec);
            View view = this.f۱۱۳۷۲d;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m۱۴۰۱۹b(this.f۱۱۳۷۳e)) {
                    topMarginForTabs = m۱۴۰۱۸a(this.f۱۱۳۷۳e);
                } else if (!m۱۴۰۱۹b(this.f۱۱۳۷۴f)) {
                    topMarginForTabs = m۱۴۰۱۸a(this.f۱۱۳۷۴f);
                } else {
                    topMarginForTabs = 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(m۱۴۰۱۸a(this.f۱۱۳۷۲d) + topMarginForTabs, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(heightMeasureSpec) : Integer.MAX_VALUE));
            }
        }
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        Drawable drawable;
        super.onLayout(changed, l, t, r, b);
        View tabContainer = this.f۱۱۳۷۲d;
        boolean hasTabs = (tabContainer == null || tabContainer.getVisibility() == 8) ? false : true;
        if (!(tabContainer == null || tabContainer.getVisibility() == 8)) {
            int containerHeight = getMeasuredHeight();
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) tabContainer.getLayoutParams();
            tabContainer.layout(l, (containerHeight - tabContainer.getMeasuredHeight()) - lp.bottomMargin, r, containerHeight - lp.bottomMargin);
        }
        boolean needsInvalidate = false;
        if (this.f۱۱۳۷۸j) {
            Drawable drawable2 = this.f۱۱۳۷۷i;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                needsInvalidate = true;
            }
        } else {
            if (this.f۱۱۳۷۵g != null) {
                if (this.f۱۱۳۷۳e.getVisibility() == 0) {
                    this.f۱۱۳۷۵g.setBounds(this.f۱۱۳۷۳e.getLeft(), this.f۱۱۳۷۳e.getTop(), this.f۱۱۳۷۳e.getRight(), this.f۱۱۳۷۳e.getBottom());
                } else {
                    View view = this.f۱۱۳۷۴f;
                    if (view == null || view.getVisibility() != 0) {
                        this.f۱۱۳۷۵g.setBounds(0, 0, 0, 0);
                    } else {
                        this.f۱۱۳۷۵g.setBounds(this.f۱۱۳۷۴f.getLeft(), this.f۱۱۳۷۴f.getTop(), this.f۱۱۳۷۴f.getRight(), this.f۱۱۳۷۴f.getBottom());
                    }
                }
                needsInvalidate = true;
            }
            this.f۱۱۳۷۹k = hasTabs;
            if (hasTabs && (drawable = this.f۱۱۳۷۶h) != null) {
                drawable.setBounds(tabContainer.getLeft(), tabContainer.getTop(), tabContainer.getRight(), tabContainer.getBottom());
                needsInvalidate = true;
            }
        }
        if (needsInvalidate) {
            invalidate();
        }
    }
}
