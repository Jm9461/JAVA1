package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.support.p۰۴۷v7.view.menu.AbstractCq;
import android.support.p۰۴۷v7.view.menu.ActionMenuItemView;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.view.menu.Ck;
import android.support.p۰۴۷v7.widget.Co0;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends Co0 implements Ch.AbstractCb, AbstractCq {

    /* renamed from: A  reason: contains not printable characters */
    private int f۱۱۴۲۴A;

    /* renamed from: B  reason: contains not printable characters */
    private int f۱۱۴۲۵B;

    /* renamed from: C  reason: contains not printable characters */
    AbstractCe f۱۱۴۲۶C;

    /* renamed from: r  reason: contains not printable characters */
    private Ch f۱۱۴۲۷r;

    /* renamed from: s  reason: contains not printable characters */
    private Context f۱۱۴۲۸s;

    /* renamed from: t  reason: contains not printable characters */
    private int f۱۱۴۲۹t;

    /* renamed from: u  reason: contains not printable characters */
    private boolean f۱۱۴۳۰u;

    /* renamed from: v  reason: contains not printable characters */
    private Cc f۱۱۴۳۱v;

    /* renamed from: w  reason: contains not printable characters */
    private AbstractCp.AbstractCa f۱۱۴۳۲w;

    /* renamed from: x  reason: contains not printable characters */
    Ch.AbstractCa f۱۱۴۳۳x;

    /* renamed from: y  reason: contains not printable characters */
    private boolean f۱۱۴۳۴y;

    /* renamed from: z  reason: contains not printable characters */
    private int f۱۱۴۳۵z;

    /* renamed from: android.support.v7.widget.ActionMenuView$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: b  reason: contains not printable characters */
        boolean m۱۴۰۶۶b();

        /* renamed from: c  reason: contains not printable characters */
        boolean m۱۴۰۶۷c();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$e  reason: invalid class name */
    public interface AbstractCe {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBaselineAligned(false);
        float density = context.getResources().getDisplayMetrics().density;
        this.f۱۱۴۲۴A = (int) (56.0f * density);
        this.f۱۱۴۲۵B = (int) (4.0f * density);
        this.f۱۱۴۲۸s = context;
        this.f۱۱۴۲۹t = 0;
    }

    public void setPopupTheme(int resId) {
        if (this.f۱۱۴۲۹t != resId) {
            this.f۱۱۴۲۹t = resId;
            if (resId == 0) {
                this.f۱۱۴۲۸s = getContext();
            } else {
                this.f۱۱۴۲۸s = new ContextThemeWrapper(getContext(), resId);
            }
        }
    }

    public int getPopupTheme() {
        return this.f۱۱۴۲۹t;
    }

    public void setPresenter(Cc presenter) {
        this.f۱۱۴۳۱v = presenter;
        this.f۱۱۴۳۱v.m۱۵۰۲۱a(this);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Cc cVar = this.f۱۱۴۳۱v;
        if (cVar != null) {
            cVar.m۱۵۰۲۲a(false);
            if (this.f۱۱۴۳۱v.m۱۵۰۳۶j()) {
                this.f۱۱۴۳۱v.m۱۵۰۳۳g();
                this.f۱۱۴۳۱v.m۱۵۰۳۷k();
            }
        }
    }

    public void setOnMenuItemClickListener(AbstractCe listener) {
        this.f۱۱۴۲۶C = listener;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.Co0
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Ch hVar;
        boolean wasFormatted = this.f۱۱۴۳۴y;
        this.f۱۱۴۳۴y = View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824;
        if (wasFormatted != this.f۱۱۴۳۴y) {
            this.f۱۱۴۳۵z = 0;
        }
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        if (!(!this.f۱۱۴۳۴y || (hVar = this.f۱۱۴۲۷r) == null || widthSize == this.f۱۱۴۳۵z)) {
            this.f۱۱۴۳۵z = widthSize;
            hVar.m۱۳۸۶۱b(true);
        }
        int childCount = getChildCount();
        if (!this.f۱۱۴۳۴y || childCount <= 0) {
            for (int i = 0; i < childCount; i++) {
                Cc lp = (Cc) getChildAt(i).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) lp).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) lp).leftMargin = 0;
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        m۱۴۰۵۳c(widthMeasureSpec, heightMeasureSpec);
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m۱۴۰۵۳c(int r41, int r42) {
        /*
        // Method dump skipped, instructions count: 695
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.ActionMenuView.m۱۴۰۵۳c(int, int):void");
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۴۰۵۲a(View child, int cellSize, int cellsRemaining, int parentHeightMeasureSpec, int parentHeightPadding) {
        Cc lp = (Cc) child.getLayoutParams();
        int childHeightSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(parentHeightMeasureSpec) - parentHeightPadding, View.MeasureSpec.getMode(parentHeightMeasureSpec));
        ActionMenuItemView itemView = child instanceof ActionMenuItemView ? (ActionMenuItemView) child : null;
        boolean expandable = false;
        boolean hasText = itemView != null && itemView.m۱۳۷۴۱d();
        int cellsUsed = 0;
        if (cellsRemaining > 0 && (!hasText || cellsRemaining >= 2)) {
            child.measure(View.MeasureSpec.makeMeasureSpec(cellSize * cellsRemaining, Integer.MIN_VALUE), childHeightSpec);
            int measuredWidth = child.getMeasuredWidth();
            cellsUsed = measuredWidth / cellSize;
            if (measuredWidth % cellSize != 0) {
                cellsUsed++;
            }
            if (hasText && cellsUsed < 2) {
                cellsUsed = 2;
            }
        }
        if (!lp.f۱۱۴۳۶c && hasText) {
            expandable = true;
        }
        lp.f۱۱۴۳۹f = expandable;
        lp.f۱۱۴۳۷d = cellsUsed;
        child.measure(View.MeasureSpec.makeMeasureSpec(cellsUsed * cellSize, 1073741824), childHeightSpec);
        return cellsUsed;
    }

    /* JADX INFO: Multiple debug info for r9v10 int: [D('isLayoutRtl' boolean), D('t' int)] */
    /* JADX INFO: Multiple debug info for r2v10 int: [D('b' int), D('midVertical' int)] */
    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.Co0
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i;
        int overflowWidth;
        int dividerWidth;
        boolean isLayoutRtl;
        int midVertical;
        int r;
        int l;
        ActionMenuView actionMenuView = this;
        if (!actionMenuView.f۱۱۴۳۴y) {
            super.onLayout(changed, left, top, right, bottom);
            return;
        }
        int childCount = getChildCount();
        int midVertical2 = (bottom - top) / 2;
        int dividerWidth2 = getDividerWidth();
        int overflowWidth2 = 0;
        int nonOverflowWidth = 0;
        int nonOverflowCount = 0;
        int widthRemaining = ((right - left) - getPaddingRight()) - getPaddingLeft();
        int i2 = 0;
        boolean isLayoutRtl2 = Cr1.m۱۵۵۶۷a(this);
        int i3 = 0;
        while (true) {
            i = 8;
            if (i3 >= childCount) {
                break;
            }
            View v = actionMenuView.getChildAt(i3);
            if (v.getVisibility() == 8) {
                midVertical = midVertical2;
                isLayoutRtl = isLayoutRtl2;
            } else {
                Cc p = (Cc) v.getLayoutParams();
                if (p.f۱۱۴۳۶c) {
                    overflowWidth2 = v.getMeasuredWidth();
                    if (actionMenuView.m۱۴۰۵۸d(i3)) {
                        overflowWidth2 += dividerWidth2;
                    }
                    int height = v.getMeasuredHeight();
                    if (isLayoutRtl2) {
                        l = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) p).leftMargin;
                        r = l + overflowWidth2;
                    } else {
                        r = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) p).rightMargin;
                        l = r - overflowWidth2;
                    }
                    isLayoutRtl = isLayoutRtl2;
                    int t = midVertical2 - (height / 2);
                    midVertical = midVertical2;
                    v.layout(l, t, r, t + height);
                    widthRemaining -= overflowWidth2;
                    i2 = 1;
                } else {
                    midVertical = midVertical2;
                    isLayoutRtl = isLayoutRtl2;
                    int size = v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) p).leftMargin + ((ViewGroup.MarginLayoutParams) p).rightMargin;
                    nonOverflowWidth += size;
                    widthRemaining -= size;
                    if (actionMenuView.m۱۴۰۵۸d(i3)) {
                        nonOverflowWidth += dividerWidth2;
                    }
                    nonOverflowCount++;
                }
            }
            i3++;
            midVertical2 = midVertical;
            isLayoutRtl2 = isLayoutRtl;
        }
        if (childCount == 1 && i2 == 0) {
            View v2 = actionMenuView.getChildAt(0);
            int width = v2.getMeasuredWidth();
            int height2 = v2.getMeasuredHeight();
            int l2 = ((right - left) / 2) - (width / 2);
            int t2 = midVertical2 - (height2 / 2);
            v2.layout(l2, t2, l2 + width, t2 + height2);
            return;
        }
        int spacerCount = nonOverflowCount - (i2 ^ 1);
        int spacerSize = Math.max(0, spacerCount > 0 ? widthRemaining / spacerCount : 0);
        if (isLayoutRtl2) {
            int startRight = getWidth() - getPaddingRight();
            int i4 = 0;
            while (i4 < childCount) {
                View v3 = actionMenuView.getChildAt(i4);
                Cc lp = (Cc) v3.getLayoutParams();
                if (v3.getVisibility() == i) {
                    dividerWidth = dividerWidth2;
                    overflowWidth = overflowWidth2;
                } else if (lp.f۱۱۴۳۶c) {
                    dividerWidth = dividerWidth2;
                    overflowWidth = overflowWidth2;
                } else {
                    int startRight2 = startRight - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                    int width2 = v3.getMeasuredWidth();
                    int height3 = v3.getMeasuredHeight();
                    int t3 = midVertical2 - (height3 / 2);
                    dividerWidth = dividerWidth2;
                    overflowWidth = overflowWidth2;
                    v3.layout(startRight2 - width2, t3, startRight2, t3 + height3);
                    startRight = startRight2 - ((((ViewGroup.MarginLayoutParams) lp).leftMargin + width2) + spacerSize);
                }
                i4++;
                dividerWidth2 = dividerWidth;
                overflowWidth2 = overflowWidth;
                i = 8;
            }
            return;
        }
        int startLeft = getPaddingLeft();
        int i5 = 0;
        while (i5 < childCount) {
            View v4 = actionMenuView.getChildAt(i5);
            Cc lp2 = (Cc) v4.getLayoutParams();
            if (v4.getVisibility() != 8 && !lp2.f۱۱۴۳۶c) {
                int startLeft2 = startLeft + ((ViewGroup.MarginLayoutParams) lp2).leftMargin;
                int width3 = v4.getMeasuredWidth();
                int height4 = v4.getMeasuredHeight();
                int t4 = midVertical2 - (height4 / 2);
                v4.layout(startLeft2, t4, startLeft2 + width3, t4 + height4);
                startLeft = startLeft2 + ((ViewGroup.MarginLayoutParams) lp2).rightMargin + width3 + spacerSize;
            }
            i5++;
            actionMenuView = this;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m۱۴۰۵۷d();
    }

    public void setOverflowIcon(Drawable icon) {
        getMenu();
        this.f۱۱۴۳۱v.m۱۵۰۱۷a(icon);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f۱۱۴۳۱v.m۱۵۰۳۲f();
    }

    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۴۰۶۳i() {
        return this.f۱۱۴۳۰u;
    }

    public void setOverflowReserved(boolean reserveOverflow) {
        this.f۱۱۴۳۰u = reserveOverflow;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.Co0, android.support.p۰۴۷v7.widget.Co0
    public Cc generateDefaultLayoutParams() {
        Cc params = new Cc(-2, -2);
        params.f۱۲۲۵۹b = 16;
        return params;
    }

    @Override // android.support.p۰۴۷v7.widget.Co0, android.support.p۰۴۷v7.widget.Co0, android.view.ViewGroup
    public Cc generateLayoutParams(AttributeSet attrs) {
        return new Cc(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.Co0, android.support.p۰۴۷v7.widget.Co0, android.view.ViewGroup
    public Cc generateLayoutParams(ViewGroup.LayoutParams p) {
        if (p == null) {
            return generateDefaultLayoutParams();
        }
        Cc result = p instanceof Cc ? new Cc((Cc) p) : new Cc(p);
        if (result.f۱۲۲۵۹b <= 0) {
            result.f۱۲۲۵۹b = 16;
        }
        return result;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.Co0
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p != null && (p instanceof Cc);
    }

    /* renamed from: e  reason: contains not printable characters */
    public Cc m۱۴۰۵۹e() {
        Cc result = generateDefaultLayoutParams();
        result.f۱۱۴۳۶c = true;
        return result;
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۴۰۵۶a(Ck item) {
        return this.f۱۱۴۲۷r.m۱۳۸۵۵a(item, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۰۵۴a(Ch menu) {
        this.f۱۱۴۲۷r = menu;
    }

    public Menu getMenu() {
        if (this.f۱۱۴۲۷r == null) {
            Context context = getContext();
            this.f۱۱۴۲۷r = new Ch(context);
            this.f۱۱۴۲۷r.m۱۳۸۴۷a(new Cd());
            this.f۱۱۴۳۱v = new Cc(context);
            this.f۱۱۴۳۱v.m۱۵۰۳۰c(true);
            Cc cVar = this.f۱۱۴۳۱v;
            AbstractCp.AbstractCa aVar = this.f۱۱۴۳۲w;
            if (aVar == null) {
                aVar = new Cb();
            }
            cVar.m۱۳۷۶۵a(aVar);
            this.f۱۱۴۲۷r.m۱۳۸۴۹a(this.f۱۱۴۳۱v, this.f۱۱۴۲۸s);
            this.f۱۱۴۳۱v.m۱۵۰۲۱a(this);
        }
        return this.f۱۱۴۲۷r;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۰۵۵a(AbstractCp.AbstractCa pcb, Ch.AbstractCa mcb) {
        this.f۱۱۴۳۲w = pcb;
        this.f۱۱۴۳۳x = mcb;
    }

    /* renamed from: j  reason: contains not printable characters */
    public Ch m۱۴۰۶۴j() {
        return this.f۱۱۴۲۷r;
    }

    /* renamed from: k  reason: contains not printable characters */
    public boolean m۱۴۰۶۵k() {
        Cc cVar = this.f۱۱۴۳۱v;
        return cVar != null && cVar.m۱۵۰۳۷k();
    }

    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۴۰۶۰f() {
        Cc cVar = this.f۱۱۴۳۱v;
        return cVar != null && cVar.m۱۵۰۳۳g();
    }

    /* renamed from: h  reason: contains not printable characters */
    public boolean m۱۴۰۶۲h() {
        Cc cVar = this.f۱۱۴۳۱v;
        return cVar != null && cVar.m۱۵۰۳۶j();
    }

    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۴۰۶۱g() {
        Cc cVar = this.f۱۱۴۳۱v;
        return cVar != null && cVar.m۱۵۰۳۵i();
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۴۰۵۷d() {
        Cc cVar = this.f۱۱۴۳۱v;
        if (cVar != null) {
            cVar.m۱۵۰۳۱e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۴۰۵۸d(int childIndex) {
        if (childIndex == 0) {
            return false;
        }
        View childBefore = getChildAt(childIndex - 1);
        View child = getChildAt(childIndex);
        boolean result = false;
        if (childIndex < getChildCount() && (childBefore instanceof AbstractCa)) {
            result = false | ((AbstractCa) childBefore).m۱۴۰۶۶b();
        }
        if (childIndex <= 0 || !(child instanceof AbstractCa)) {
            return result;
        }
        return result | ((AbstractCa) child).m۱۴۰۶۷c();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return false;
    }

    public void setExpandedActionViewsExclusive(boolean exclusive) {
        this.f۱۱۴۳۱v.m۱۵۰۲۷b(exclusive);
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActionMenuView$d  reason: invalid class name */
    public class Cd implements Ch.AbstractCa {
        Cd() {
        }

        @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۰۷۱a(Ch menu, MenuItem item) {
            AbstractCe eVar = ActionMenuView.this.f۱۱۴۲۶C;
            return eVar != null && eVar.onMenuItemClick(item);
        }

        @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۰۷۰a(Ch menu) {
            Ch.AbstractCa aVar = ActionMenuView.this.f۱۱۴۳۳x;
            if (aVar != null) {
                aVar.m۱۳۸۸۸a(menu);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActionMenuView$b  reason: invalid class name */
    public static class Cb implements AbstractCp.AbstractCa {
        Cb() {
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۰۶۸a(Ch menu, boolean allMenusAreClosing) {
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۴۰۶۹a(Ch subMenu) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c  reason: invalid class name */
    public static class Cc extends Co0.Ca {
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: contains not printable characters */
        public boolean f۱۱۴۳۶c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: contains not printable characters */
        public int f۱۱۴۳۷d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: contains not printable characters */
        public int f۱۱۴۳۸e;
        @ViewDebug.ExportedProperty

        /* renamed from: f  reason: contains not printable characters */
        public boolean f۱۱۴۳۹f;
        @ViewDebug.ExportedProperty

        /* renamed from: g  reason: contains not printable characters */
        public boolean f۱۱۴۴۰g;

        /* renamed from: h  reason: contains not printable characters */
        boolean f۱۱۴۴۱h;

        public Cc(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public Cc(ViewGroup.LayoutParams other) {
            super(other);
        }

        public Cc(Cc other) {
            super(other);
            this.f۱۱۴۳۶c = other.f۱۱۴۳۶c;
        }

        public Cc(int width, int height) {
            super(width, height);
            this.f۱۱۴۳۶c = false;
        }
    }
}
