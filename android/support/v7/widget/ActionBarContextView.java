package android.support.v7.widget;

import a.b.h.a.f;
import a.b.h.a.g;
import a.b.h.a.j;
import a.b.h.f.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.u;
import android.support.v7.view.menu.h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends a {
    private CharSequence k;
    private CharSequence l;
    private View m;
    private View n;
    private LinearLayout o;
    private TextView p;
    private TextView q;
    private int r;
    private int s;
    private boolean t;
    private int u;

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attrs) {
        this(context, attrs, a.b.h.a.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        j1 a2 = j1.a(context, attrs, j.ActionMode, defStyle, 0);
        u.a(this, a2.b(j.ActionMode_background));
        this.r = a2.g(j.ActionMode_titleTextStyle, 0);
        this.s = a2.g(j.ActionMode_subtitleTextStyle, 0);
        this.f۱۹۷۰g = a2.f(j.ActionMode_height, 0);
        this.u = a2.g(j.ActionMode_closeItemLayout, g.abc_action_mode_close_item_material);
        a2.a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f۱۹۶۹f;
        if (cVar != null) {
            cVar.g();
            this.f۱۹۶۹f.h();
        }
    }

    @Override // android.support.v7.widget.a
    public void setContentHeight(int height) {
        this.f۱۹۷۰g = height;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.n;
        if (view2 != null) {
            removeView(view2);
        }
        this.n = view;
        if (!(view == null || (linearLayout = this.o) == null)) {
            removeView(linearLayout);
            this.o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence title) {
        this.k = title;
        e();
    }

    public void setSubtitle(CharSequence subtitle) {
        this.l = subtitle;
        e();
    }

    public CharSequence getTitle() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.l;
    }

    private void e() {
        if (this.o == null) {
            LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
            this.o = (LinearLayout) getChildAt(getChildCount() - 1);
            this.p = (TextView) this.o.findViewById(f.action_bar_title);
            this.q = (TextView) this.o.findViewById(f.action_bar_subtitle);
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
            if (this.s != 0) {
                this.q.setTextAppearance(getContext(), this.s);
            }
        }
        this.p.setText(this.k);
        this.q.setText(this.l);
        boolean hasTitle = !TextUtils.isEmpty(this.k);
        boolean hasSubtitle = !TextUtils.isEmpty(this.l);
        int i = 0;
        this.q.setVisibility(hasSubtitle ? 0 : 8);
        LinearLayout linearLayout = this.o;
        if (!hasTitle && !hasSubtitle) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.o.getParent() == null) {
            addView(this.o);
        }
    }

    public void a(b mode) {
        View view = this.m;
        if (view == null) {
            this.m = LayoutInflater.from(getContext()).inflate(this.u, (ViewGroup) this, false);
            addView(this.m);
        } else if (view.getParent() == null) {
            addView(this.m);
        }
        this.m.findViewById(f.action_mode_close_button).setOnClickListener(new a(this, mode));
        h menu = (h) mode.c();
        c cVar = this.f۱۹۶۹f;
        if (cVar != null) {
            cVar.e();
        }
        this.f۱۹۶۹f = new c(getContext());
        this.f۱۹۶۹f.c(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menu.a(this.f۱۹۶۹f, this.f۱۹۶۷d);
        this.f۱۹۶۸e = (ActionMenuView) this.f۱۹۶۹f.b(this);
        u.a(this.f۱۹۶۸e, (Drawable) null);
        addView(this.f۱۹۶۸e, layoutParams);
    }

    class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f۱۷۵۱c;

        a(ActionBarContextView this$0, b bVar) {
            this.f۱۷۵۱c = bVar;
        }

        public void onClick(View v) {
            this.f۱۷۵۱c.a();
        }
    }

    public void a() {
        if (this.m == null) {
            c();
        }
    }

    public void c() {
        removeAllViews();
        this.n = null;
        this.f۱۹۶۸e = null;
    }

    public boolean d() {
        c cVar = this.f۱۹۶۹f;
        if (cVar != null) {
            return cVar.k();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int customHeightMode = 1073741824;
        if (View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(heightMeasureSpec) != 0) {
            int contentWidth = View.MeasureSpec.getSize(widthMeasureSpec);
            int maxHeight = this.f۱۹۷۰g;
            if (maxHeight <= 0) {
                maxHeight = View.MeasureSpec.getSize(heightMeasureSpec);
            }
            int verticalPadding = getPaddingTop() + getPaddingBottom();
            int availableWidth = (contentWidth - getPaddingLeft()) - getPaddingRight();
            int height = maxHeight - verticalPadding;
            int childSpecHeight = View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
            View view = this.m;
            int i = 0;
            if (view != null) {
                int availableWidth2 = a(view, availableWidth, childSpecHeight, 0);
                ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
                availableWidth = availableWidth2 - (lp.leftMargin + lp.rightMargin);
            }
            ActionMenuView actionMenuView = this.f۱۹۶۸e;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                availableWidth = a(this.f۱۹۶۸e, availableWidth, childSpecHeight, 0);
            }
            LinearLayout linearLayout = this.o;
            if (linearLayout != null && this.n == null) {
                if (this.t) {
                    this.o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), childSpecHeight);
                    int titleWidth = this.o.getMeasuredWidth();
                    boolean titleFits = titleWidth <= availableWidth;
                    if (titleFits) {
                        availableWidth -= titleWidth;
                    }
                    LinearLayout linearLayout2 = this.o;
                    if (!titleFits) {
                        i = 8;
                    }
                    linearLayout2.setVisibility(i);
                } else {
                    availableWidth = a(linearLayout, availableWidth, childSpecHeight, 0);
                }
            }
            View view2 = this.n;
            if (view2 != null) {
                ViewGroup.LayoutParams lp2 = view2.getLayoutParams();
                int customWidthMode = lp2.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i2 = lp2.width;
                int customWidth = i2 >= 0 ? Math.min(i2, availableWidth) : availableWidth;
                if (lp2.height == -2) {
                    customHeightMode = Integer.MIN_VALUE;
                }
                int i3 = lp2.height;
                this.n.measure(View.MeasureSpec.makeMeasureSpec(customWidth, customWidthMode), View.MeasureSpec.makeMeasureSpec(i3 >= 0 ? Math.min(i3, height) : height, customHeightMode));
            }
            if (this.f۱۹۷۰g <= 0) {
                int measuredHeight = 0;
                int count = getChildCount();
                for (int i4 = 0; i4 < count; i4++) {
                    int paddedViewHeight = getChildAt(i4).getMeasuredHeight() + verticalPadding;
                    if (paddedViewHeight > measuredHeight) {
                        measuredHeight = paddedViewHeight;
                    }
                }
                setMeasuredDimension(contentWidth, measuredHeight);
                return;
            }
            setMeasuredDimension(contentWidth, maxHeight);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        int x;
        boolean isLayoutRtl = r1.a(this);
        int x2 = isLayoutRtl ? (r2 - l2) - getPaddingRight() : getPaddingLeft();
        int y = getPaddingTop();
        int contentHeight = ((b2 - t2) - getPaddingTop()) - getPaddingBottom();
        View view = this.m;
        if (view == null || view.getVisibility() == 8) {
            x = x2;
        } else {
            ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
            int startMargin = isLayoutRtl ? lp.rightMargin : lp.leftMargin;
            int endMargin = isLayoutRtl ? lp.leftMargin : lp.rightMargin;
            int x3 = a.a(x2, startMargin, isLayoutRtl);
            x = a.a(x3 + a(this.m, x3, y, contentHeight, isLayoutRtl), endMargin, isLayoutRtl);
        }
        LinearLayout linearLayout = this.o;
        if (!(linearLayout == null || this.n != null || linearLayout.getVisibility() == 8)) {
            x += a(this.o, x, y, contentHeight, isLayoutRtl);
        }
        View view2 = this.n;
        if (view2 != null) {
            int x4 = x + a(view2, x, y, contentHeight, isLayoutRtl);
        }
        int x5 = isLayoutRtl ? getPaddingLeft() : (r2 - l2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f۱۹۶۸e;
        if (actionMenuView != null) {
            int x6 = x5 + a(actionMenuView, x5, y, contentHeight, !isLayoutRtl);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        if (event.getEventType() == 32) {
            event.setSource(this);
            event.setClassName(getClass().getName());
            event.setPackageName(getContext().getPackageName());
            event.setContentDescription(this.k);
            return;
        }
        super.onInitializeAccessibilityEvent(event);
    }

    public void setTitleOptional(boolean titleOptional) {
        if (titleOptional != this.t) {
            requestLayout();
        }
        this.t = titleOptional;
    }

    public boolean b() {
        return this.t;
    }
}
