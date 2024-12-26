package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cf;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.AbstractCb;

/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends AbstractCa {

    /* renamed from: k  reason: contains not printable characters */
    private CharSequence f۱۱۳۸۱k;

    /* renamed from: l  reason: contains not printable characters */
    private CharSequence f۱۱۳۸۲l;

    /* renamed from: m  reason: contains not printable characters */
    private View f۱۱۳۸۳m;

    /* renamed from: n  reason: contains not printable characters */
    private View f۱۱۳۸۴n;

    /* renamed from: o  reason: contains not printable characters */
    private LinearLayout f۱۱۳۸۵o;

    /* renamed from: p  reason: contains not printable characters */
    private TextView f۱۱۳۸۶p;

    /* renamed from: q  reason: contains not printable characters */
    private TextView f۱۱۳۸۷q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۱۳۸۸r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۱۳۸۹s;

    /* renamed from: t  reason: contains not printable characters */
    private boolean f۱۱۳۹۰t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۱۳۹۱u;

    @Override // android.support.p۰۴۷v7.widget.AbstractCa
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCa
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCa
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attrs) {
        this(context, attrs, Ca.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Cj1 a = Cj1.m۱۵۳۴۵a(context, attrs, Cj.ActionMode, defStyle, 0);
        Cu.m۱۲۹۸۴a(this, a.m۱۵۳۵۴b(Cj.ActionMode_background));
        this.f۱۱۳۸۸r = a.m۱۵۳۶۳g(Cj.ActionMode_titleTextStyle, 0);
        this.f۱۱۳۸۹s = a.m۱۵۳۶۳g(Cj.ActionMode_subtitleTextStyle, 0);
        this.f۱۱۹۰۴g = a.m۱۵۳۶۱f(Cj.ActionMode_height, 0);
        this.f۱۱۳۹۱u = a.m۱۵۳۶۳g(Cj.ActionMode_closeItemLayout, Cg.abc_action_mode_close_item_material);
        a.m۱۵۳۵۰a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Cc cVar = this.f۱۱۹۰۳f;
        if (cVar != null) {
            cVar.m۱۵۰۳۳g();
            this.f۱۱۹۰۳f.m۱۵۰۳۴h();
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCa
    public void setContentHeight(int height) {
        this.f۱۱۹۰۴g = height;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f۱۱۳۸۴n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f۱۱۳۸۴n = view;
        if (!(view == null || (linearLayout = this.f۱۱۳۸۵o) == null)) {
            removeView(linearLayout);
            this.f۱۱۳۸۵o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence title) {
        this.f۱۱۳۸۱k = title;
        m۱۴۰۲۰e();
    }

    public void setSubtitle(CharSequence subtitle) {
        this.f۱۱۳۸۲l = subtitle;
        m۱۴۰۲۰e();
    }

    public CharSequence getTitle() {
        return this.f۱۱۳۸۱k;
    }

    public CharSequence getSubtitle() {
        return this.f۱۱۳۸۲l;
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۴۰۲۰e() {
        if (this.f۱۱۳۸۵o == null) {
            LayoutInflater.from(getContext()).inflate(Cg.abc_action_bar_title_item, this);
            this.f۱۱۳۸۵o = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f۱۱۳۸۶p = (TextView) this.f۱۱۳۸۵o.findViewById(Cf.action_bar_title);
            this.f۱۱۳۸۷q = (TextView) this.f۱۱۳۸۵o.findViewById(Cf.action_bar_subtitle);
            if (this.f۱۱۳۸۸r != 0) {
                this.f۱۱۳۸۶p.setTextAppearance(getContext(), this.f۱۱۳۸۸r);
            }
            if (this.f۱۱۳۸۹s != 0) {
                this.f۱۱۳۸۷q.setTextAppearance(getContext(), this.f۱۱۳۸۹s);
            }
        }
        this.f۱۱۳۸۶p.setText(this.f۱۱۳۸۱k);
        this.f۱۱۳۸۷q.setText(this.f۱۱۳۸۲l);
        boolean hasTitle = !TextUtils.isEmpty(this.f۱۱۳۸۱k);
        boolean hasSubtitle = !TextUtils.isEmpty(this.f۱۱۳۸۲l);
        int i = 0;
        this.f۱۱۳۸۷q.setVisibility(hasSubtitle ? 0 : 8);
        LinearLayout linearLayout = this.f۱۱۳۸۵o;
        if (!hasTitle && !hasSubtitle) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f۱۱۳۸۵o.getParent() == null) {
            addView(this.f۱۱۳۸۵o);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۰۲۲a(AbstractCb mode) {
        View view = this.f۱۱۳۸۳m;
        if (view == null) {
            this.f۱۱۳۸۳m = LayoutInflater.from(getContext()).inflate(this.f۱۱۳۹۱u, (ViewGroup) this, false);
            addView(this.f۱۱۳۸۳m);
        } else if (view.getParent() == null) {
            addView(this.f۱۱۳۸۳m);
        }
        this.f۱۱۳۸۳m.findViewById(Cf.action_mode_close_button).setOnClickListener(new View$OnClickListenerCa(this, mode));
        Ch menu = (Ch) mode.m۱۰۷۸۱c();
        Cc cVar = this.f۱۱۹۰۳f;
        if (cVar != null) {
            cVar.m۱۵۰۳۱e();
        }
        this.f۱۱۹۰۳f = new Cc(getContext());
        this.f۱۱۹۰۳f.m۱۵۰۳۰c(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menu.m۱۳۸۴۹a(this.f۱۱۹۰۳f, this.f۱۱۹۰۱d);
        this.f۱۱۹۰۲e = (ActionMenuView) this.f۱۱۹۰۳f.m۱۵۰۲۶b(this);
        Cu.m۱۲۹۸۴a(this.f۱۱۹۰۲e, (Drawable) null);
        addView(this.f۱۱۹۰۲e, layoutParams);
    }

    /* renamed from: android.support.v7.widget.ActionBarContextView$a  reason: invalid class name */
    class View$OnClickListenerCa implements View.OnClickListener {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ AbstractCb f۱۱۳۹۲c;

        View$OnClickListenerCa(ActionBarContextView this$0, AbstractCb bVar) {
            this.f۱۱۳۹۲c = bVar;
        }

        public void onClick(View v) {
            this.f۱۱۳۹۲c.m۱۰۷۷۲a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۰۲۱a() {
        if (this.f۱۱۳۸۳m == null) {
            m۱۴۰۲۴c();
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۴۰۲۴c() {
        removeAllViews();
        this.f۱۱۳۸۴n = null;
        this.f۱۱۹۰۲e = null;
    }

    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۴۰۲۵d() {
        Cc cVar = this.f۱۱۹۰۳f;
        if (cVar != null) {
            return cVar.m۱۵۰۳۷k();
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
            int maxHeight = this.f۱۱۹۰۴g;
            if (maxHeight <= 0) {
                maxHeight = View.MeasureSpec.getSize(heightMeasureSpec);
            }
            int verticalPadding = getPaddingTop() + getPaddingBottom();
            int availableWidth = (contentWidth - getPaddingLeft()) - getPaddingRight();
            int height = maxHeight - verticalPadding;
            int childSpecHeight = View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
            View view = this.f۱۱۳۸۳m;
            int i = 0;
            if (view != null) {
                int availableWidth2 = m۱۴۹۶۳a(view, availableWidth, childSpecHeight, 0);
                ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) this.f۱۱۳۸۳m.getLayoutParams();
                availableWidth = availableWidth2 - (lp.leftMargin + lp.rightMargin);
            }
            ActionMenuView actionMenuView = this.f۱۱۹۰۲e;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                availableWidth = m۱۴۹۶۳a(this.f۱۱۹۰۲e, availableWidth, childSpecHeight, 0);
            }
            LinearLayout linearLayout = this.f۱۱۳۸۵o;
            if (linearLayout != null && this.f۱۱۳۸۴n == null) {
                if (this.f۱۱۳۹۰t) {
                    this.f۱۱۳۸۵o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), childSpecHeight);
                    int titleWidth = this.f۱۱۳۸۵o.getMeasuredWidth();
                    boolean titleFits = titleWidth <= availableWidth;
                    if (titleFits) {
                        availableWidth -= titleWidth;
                    }
                    LinearLayout linearLayout2 = this.f۱۱۳۸۵o;
                    if (!titleFits) {
                        i = 8;
                    }
                    linearLayout2.setVisibility(i);
                } else {
                    availableWidth = m۱۴۹۶۳a(linearLayout, availableWidth, childSpecHeight, 0);
                }
            }
            View view2 = this.f۱۱۳۸۴n;
            if (view2 != null) {
                ViewGroup.LayoutParams lp2 = view2.getLayoutParams();
                int customWidthMode = lp2.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i2 = lp2.width;
                int customWidth = i2 >= 0 ? Math.min(i2, availableWidth) : availableWidth;
                if (lp2.height == -2) {
                    customHeightMode = Integer.MIN_VALUE;
                }
                int i3 = lp2.height;
                this.f۱۱۳۸۴n.measure(View.MeasureSpec.makeMeasureSpec(customWidth, customWidthMode), View.MeasureSpec.makeMeasureSpec(i3 >= 0 ? Math.min(i3, height) : height, customHeightMode));
            }
            if (this.f۱۱۹۰۴g <= 0) {
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
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int x;
        boolean isLayoutRtl = Cr1.m۱۵۵۶۷a(this);
        int x2 = isLayoutRtl ? (r - l) - getPaddingRight() : getPaddingLeft();
        int y = getPaddingTop();
        int contentHeight = ((b - t) - getPaddingTop()) - getPaddingBottom();
        View view = this.f۱۱۳۸۳m;
        if (view == null || view.getVisibility() == 8) {
            x = x2;
        } else {
            ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) this.f۱۱۳۸۳m.getLayoutParams();
            int startMargin = isLayoutRtl ? lp.rightMargin : lp.leftMargin;
            int endMargin = isLayoutRtl ? lp.leftMargin : lp.rightMargin;
            int x3 = AbstractCa.m۱۴۹۶۰a(x2, startMargin, isLayoutRtl);
            x = AbstractCa.m۱۴۹۶۰a(x3 + m۱۴۹۶۴a(this.f۱۱۳۸۳m, x3, y, contentHeight, isLayoutRtl), endMargin, isLayoutRtl);
        }
        LinearLayout linearLayout = this.f۱۱۳۸۵o;
        if (!(linearLayout == null || this.f۱۱۳۸۴n != null || linearLayout.getVisibility() == 8)) {
            x += m۱۴۹۶۴a(this.f۱۱۳۸۵o, x, y, contentHeight, isLayoutRtl);
        }
        View view2 = this.f۱۱۳۸۴n;
        if (view2 != null) {
            int x4 = x + m۱۴۹۶۴a(view2, x, y, contentHeight, isLayoutRtl);
        }
        int x5 = isLayoutRtl ? getPaddingLeft() : (r - l) - getPaddingRight();
        ActionMenuView actionMenuView = this.f۱۱۹۰۲e;
        if (actionMenuView != null) {
            int x6 = x5 + m۱۴۹۶۴a(actionMenuView, x5, y, contentHeight, !isLayoutRtl);
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
            event.setContentDescription(this.f۱۱۳۸۱k);
            return;
        }
        super.onInitializeAccessibilityEvent(event);
    }

    public void setTitleOptional(boolean titleOptional) {
        if (titleOptional != this.f۱۱۳۹۰t) {
            requestLayout();
        }
        this.f۱۱۳۹۰t = titleOptional;
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۴۰۲۳b() {
        return this.f۱۱۳۹۰t;
    }
}
